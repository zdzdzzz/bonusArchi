package com.zd.archi.redis.dao;

import java.math.BigDecimal;
import java.util.List;

import com.zd.archi.bean.Bonus;
import com.zd.archi.model.TblMaraTransLog;

public interface BonusRedisMapper {
	void add(Bonus bonus);
	boolean flushDB();
	void pushToRedis(List<BigDecimal> moneys);
	String checkAndGet(String userId);
	void addTblMaraTransLog(TblMaraTransLog record);
	List<TblMaraTransLog> getConsumerLogList();
}
