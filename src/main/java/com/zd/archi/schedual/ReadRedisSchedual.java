package com.zd.archi.schedual;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zd.archi.model.TblMaraTransLog;
import com.zd.archi.service.BonusService;
import com.zd.archi.service.TblMaraTransLogService;

@Component
public class ReadRedisSchedual{
	
	@Autowired
	private BonusService bonusService;
	
	@Autowired
	private TblMaraTransLogService tblMaraTransLogService;

	protected void readRedis(){
		// TODO Auto-generated method stub
		System.out.println(new Date());
		List<TblMaraTransLog> tblMaraTransLogsList = bonusService.getConsumerLogList();
		if(tblMaraTransLogsList!=null && tblMaraTransLogsList.size() != 0){
			tblMaraTransLogService.batchSaveLog(tblMaraTransLogsList);
			System.out.println(tblMaraTransLogsList.size());
		}
	}
}
