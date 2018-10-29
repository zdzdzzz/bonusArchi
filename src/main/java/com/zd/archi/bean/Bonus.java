package com.zd.archi.bean;

public class Bonus {
	private String userId;
	private String disAmt;
	private String number;
	
	public Bonus(){
		
	}
	public Bonus(String userId, String disAmt, String number){
		this.userId = userId;
		this.disAmt = disAmt;
		this.number = number;
	}
	
	public void setUserId(String userId){
		this.userId = userId;
	}
	public String getUserId(){
		return this.userId;
	}
	
	public void setDisAmt(String disAmt){
		this.disAmt = disAmt;
	}
	public String getDisAmt(){
		return this.disAmt;
	}
	
	public void setNumber(String number){
		this.number = number;
	}
	public String getNumber(){
		return this.number;
	}
}
