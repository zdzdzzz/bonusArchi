package com.zd.archi.service;

import java.util.List;

import com.zd.archi.bean.Bonus;
import com.zd.archi.model.TblMaraTransLog;

public interface BonusService {
	void add(Bonus bonus);
	boolean flushDB();
	void pushToRedis(int money, int number);
	String checkAndGet(String userId);
	void addTblMaraTransLog(TblMaraTransLog record);
	List<TblMaraTransLog> getConsumerLogList();
}
