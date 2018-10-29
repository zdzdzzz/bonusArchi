package com.zd.archi.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zd.archi.service.BonusService;

@Component
public class InitData {
	
	private String money;
	private String number;
	
	public InitData() {
    }
	
	public InitData(String money,String number) {
		this.money = money;
		this.number = number;
    }
	
	public String getMoney() {
		return money;
	}
	public void setMoney(String money){
		this.money = money;
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
	@Autowired
	private BonusService bonusService;

	//ApplicationListener<ContextRefreshedEvent>
	//implements InitializingBean
	
	//@PostConstruct
	public void initData(){
		bonusService.flushDB();
		int moneyInt = Integer.parseInt(money);
		int numberInt = Integer.parseInt(number);
		bonusService.pushToRedis(moneyInt,numberInt);
	}
}
