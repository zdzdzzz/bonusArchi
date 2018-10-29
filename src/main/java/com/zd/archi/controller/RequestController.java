package com.zd.archi.controller;

import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.jms.Destination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zd.archi.bean.Bonus;
import com.zd.archi.bean.RequestBean;
import com.zd.archi.model.TblMaraTransLog;
import com.zd.archi.schedual.BatchInsert;
import com.zd.archi.schedual.TimerSingleton;
import com.zd.archi.service.BonusService;
import com.zd.archi.service.ProduceService;
import com.zd.archi.service.TblMaraTransLogService;

@Controller
@ResponseBody
public class RequestController {
	
	private static ExecutorService fixedThreadPool = Executors.newFixedThreadPool(4);
	private static Vector<TblMaraTransLog> vector = new Vector<TblMaraTransLog>();
	private static Timer timer = new Timer();
	
	@Autowired
	private TblMaraTransLogService tblMaraTransLogService;
	@Autowired
	private ProduceService produceService;
	@Autowired
	private Destination destination;  
	
	@Autowired
	private BonusService bonusService;
	
	@RequestMapping(value="/api/order/discount",method={RequestMethod.POST,RequestMethod.GET})
	protected void receiveRequest(@RequestBody RequestBean requestBean) throws IOException, ParseException{
		
		String userId = requestBean.getUserId();
		
		//
		TblMaraTransLog record = new TblMaraTransLog();
		record.setOrderId(requestBean.getOrderId());
		record.setUserId(userId);
		record.setMchntCd(requestBean.getMchntCd());
		record.setTransAmt(Integer.parseInt(requestBean.getTransAmt()));
//		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		record.setRecUpdTs(formatter.parse(new Date().toString()));
		//SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		record.setRecCrtTs(formatter.parse(requestBean.getTxnTime()));
		
		String isGet = bonusService.checkAndGet(userId);
		if(null == isGet || "".equals(isGet)){
			record.setDisAmt(0);
			record.setRspCd("0");
			record.setRspMsg("已优惠");
		}else{
			record.setDisAmt(Integer.parseInt(isGet));
			record.setRspCd("2");
			record.setRspMsg("交易成功");
		}
		
		bonusService.addTblMaraTransLog(record);
		
//		fixedThreadPool.execute(new Runnable() {
//			@Override
//			public void run() {
//				vector.add(record);
//			}
//		});
		
		//tblMaraTransLogService.batchSaveLog(vector);
		
		//timer.schedule(new BatchInsert(vector), 2000, 2000);
		//Timer timer = TimerSingleton.getTimer();
		
//		fixedThreadPool.execute(new Runnable() {
//			@Override
//			public void run() {
//				tblMaraTransLogService.saveLog(record);
//			}
//		});
//		produceService.sendMessage(destination, record);
		
		
//		Bonus bonus = new Bonus();
//		bonus.setUserId(userId);
//		bonus.setDisAmt("55");
//		bonus.setNumber("1");
//		bonusService.add(bonus);
		
		
		//tblMaraTransLogService.saveLog(record);
//		Thread thread = new Thread(){
//		   public void run(){
//			   //tblMaraTransLogService.saveLog(record);
//			   produceService.sendMessage(destination, record);
//		   }
//		};
//		thread.start();
	}
}
