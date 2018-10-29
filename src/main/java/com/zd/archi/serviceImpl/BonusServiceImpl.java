package com.zd.archi.serviceImpl;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zd.archi.bean.Bonus;
import com.zd.archi.model.TblMaraTransLog;
import com.zd.archi.redis.dao.BonusRedisMapper;
import com.zd.archi.service.BonusService;
import com.zd.archi.util.HongBaoCreateUtil;

@Service
public class BonusServiceImpl implements BonusService{
	@Resource
	BonusRedisMapper bonusRedisMapper; 
	
	@Override
	public void add(Bonus bonus) {
		bonusRedisMapper.add(bonus);
	}

	@Override
	public boolean flushDB() {
		return bonusRedisMapper.flushDB();
	}

	@Override
	public void pushToRedis(int money, int number) {
		// TODO Auto-generated method stub
		List<BigDecimal> moneys = HongBaoCreateUtil.math(BigDecimal.valueOf(money), number);
		bonusRedisMapper.pushToRedis(moneys);
	}

	@Override
	public String checkAndGet(String userId) {
		// TODO Auto-generated method stub
		return bonusRedisMapper.checkAndGet(userId);
	}

	@Override
	public void addTblMaraTransLog(TblMaraTransLog record) {
		// TODO Auto-generated method stub
		bonusRedisMapper.addTblMaraTransLog(record);
	}

	@Override
	public List<TblMaraTransLog> getConsumerLogList() {
		// TODO Auto-generated method stub
		return bonusRedisMapper.getConsumerLogList();
	}

}
