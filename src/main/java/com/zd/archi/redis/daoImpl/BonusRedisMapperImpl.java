package com.zd.archi.redis.daoImpl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.script.DefaultRedisScript;
import org.springframework.data.redis.core.script.RedisScript;
import org.springframework.scripting.support.ResourceScriptSource;
import org.springframework.stereotype.Service;

import com.zd.archi.bean.Bonus;
import com.zd.archi.model.TblMaraTransLog;
import com.zd.archi.redis.dao.BonusRedisMapper;
import com.zd.archi.util.BonusUtil;

@Service
public class BonusRedisMapperImpl implements BonusRedisMapper{
	@Autowired
    StringRedisTemplate redisStringTemplate;
	@Autowired
    RedisTemplate<String, String> redisTemplate;
	
	//序列化
//	@Autowired(required = false)
//	public void setRedisTemplate(RedisTemplate redisTemplate) {
//		// 使用Jackson2JsonRedisSerialize 替换默认序列化
//        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
//	    redisTemplate.setKeySerializer(jackson2JsonRedisSerializer);
//	    redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
//	    redisTemplate.setHashKeySerializer(jackson2JsonRedisSerializer);
//	    redisTemplate.setHashValueSerializer(jackson2JsonRedisSerializer);
//	    this.redisTemplate = redisTemplate;
//	}
	
	@Override
	public void add(Bonus bonus) {
		//BoundValueOperations<String, String> bound = redisTemplate.boundValueOps(bonus.getUserId());
		//bound.set(bonus.getDisAmt());
		//bound.append(user.getPassword());//追加，和StringBuilder的append一样功能
		
		BoundHashOperations<String, String, Object> boundHashOperations = redisStringTemplate.boundHashOps(bonus.getUserId());  
		boundHashOperations.put("DisAmt", bonus.getDisAmt());
		boundHashOperations.put("Number", bonus.getNumber());
	}
	
	@Override
	public void addTblMaraTransLog(TblMaraTransLog record) {
		// TODO Auto-generated method stub
		BoundListOperations<String, String> boundListOperations = redisTemplate.boundListOps("consumerLogList");
		boundListOperations.rightPush(record.toString()); 
	}

//	public void tearDown() {
//  redisTemplate.getConnectionFactory().getConnection().flushDb();
//}
	@Override
	public boolean flushDB() {
		// TODO Auto-generated method stub
		return redisTemplate.execute(new RedisCallback<Boolean>() {  
			@Override
			public Boolean doInRedis(RedisConnection connection)  
                    throws DataAccessException {  
                connection.flushDb();  
                return true;  
            }
        }); 
	}

	@Override
	public void pushToRedis(List<BigDecimal> moneys) {
		// TODO Auto-generated method stub
		ArrayList<String> strings = new ArrayList<>();
		for(BigDecimal big: moneys){
			strings.add(String.valueOf(big));
		}
		redisTemplate.opsForList().leftPushAll("BonusList", strings);
	}

	@Override
	public String checkAndGet(String userId) {
		List<String> keys = new ArrayList<>();
        keys.add("BonusList");
        keys.add("BonusConsumedList");
        keys.add("ConsumerMap");
        keys.add(userId);
        keys.add("repeatedConsumer");
		
		try {
            DefaultRedisScript<String> redisScript = new DefaultRedisScript<String>();
    		ClassPathResource resource = new ClassPathResource("redisLua/checkAndGet.lua");
    		redisScript.setScriptSource(new ResourceScriptSource(resource));
    		redisScript.setResultType(String.class);
    		String result = (String) redisTemplate.execute(redisScript, keys);
            return result;
        } catch (Exception e) {
            // do nothing
        }
		return null;
	}

	@Override
	public List<TblMaraTransLog> getConsumerLogList() {
		
		boolean hasKey = redisTemplate.hasKey("consumerLogList");
		if(!hasKey){
			return null;
		}
		
		// TODO Auto-generated method stub
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("local list = {};\n");
		sBuilder.append("local num = redis.call('LLEN', KEYS[1]);\n");
		sBuilder.append("if num == 0 then\n");
		sBuilder.append("return nil;\n");
		sBuilder.append("else\n");
		sBuilder.append("list = redis.call('LRANGE', KEYS[1], 0, -1);\n");
		sBuilder.append("redis.call('DEL', KEYS[1]);\n");
		sBuilder.append("return list;\n");
		sBuilder.append("end;\n");
		
		
		RedisScript<List> luaScript = new DefaultRedisScript<>(sBuilder.toString(), List.class);
		List<String> keys = new ArrayList<>();
		keys.add("consumerLogList");
		List<String> redisList = redisTemplate.execute(luaScript, keys);
		List<TblMaraTransLog> logList = new ArrayList<TblMaraTransLog>();
		for(String str: redisList){
			TblMaraTransLog log = new TblMaraTransLog();
			Map<String, Object> map = new HashMap<String, Object>();
			try {
				map = BonusUtil.parseStringToMap(str);
				BonusUtil.parseMapToObject(map, log);
				logList.add(log);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return logList;
	}

}
