package com.zd.archi.bean;

import java.io.Serializable;

public class RequestBean implements Serializable{
	private String userId; 
	private String userToken;
	private String orderId;
	private String mchntCd;
	private String transAmt;
	private String txnTime;
	private String curDt;
	
	public RequestBean(){
	}
	
	public RequestBean(String userId,String userToken,String orderId,String mchntCd,String transAmt,String txnTime,String curDt){
		this.userId=userId;
		this.userToken=userToken;
		this.orderId=orderId;
		this.mchntCd=mchntCd;
		this.transAmt=transAmt;
		this.txnTime=txnTime;
		this.curDt=curDt;
	}
	
	public String getUserId(){
		return this.userId;
	}
	
	public void setUserId(String userId){
		this.userId = userId;
	}
	
	public String getUserToken(){
		return this.userToken;
	}
	
	public void setUserToken(String userToken){
		this.userToken = userToken;
	}
	
	public String getOrderId(){
		return this.orderId;
	}
	
	public void setOrderId(String orderId){
		this.orderId = orderId;
	}
	
	public String getMchntCd(){
		return this.mchntCd;
	}
	
	public void setMchntCd(String mchntCd){
		this.mchntCd = mchntCd;
	}
	
	public String getTransAmt(){
		return this.transAmt;
	}
	
	public void setTransAmt(String transAmt){
		this.transAmt = transAmt;
	}
	
	public String getTxnTime(){
		return this.txnTime;
	}
	
	public void setTxnTime(String txnTime){
		this.txnTime = txnTime;
	}
	
	public String getCurDt(){
		return this.curDt;
	}
	
	public void setCurDt(String curDt){
		this.curDt = curDt;
	}
	
}
