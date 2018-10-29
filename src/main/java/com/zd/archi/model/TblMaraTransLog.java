package com.zd.archi.model;

import java.io.Serializable;
import java.util.Date;

public class TblMaraTransLog implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String orderId;

    private String mchntCd;

    private String userId;

    private Integer transAmt;

    private Integer disAmt;

    private String rspCd;

    private String rspMsg;

    private Date recUpdTs;

    private Date recCrtTs;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getMchntCd() {
        return mchntCd;
    }

    public void setMchntCd(String mchntCd) {
        this.mchntCd = mchntCd == null ? null : mchntCd.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(Integer transAmt) {
        this.transAmt = transAmt;
    }

    public Integer getDisAmt() {
        return disAmt;
    }

    public void setDisAmt(Integer disAmt) {
        this.disAmt = disAmt;
    }

    public String getRspCd() {
        return rspCd;
    }

    public void setRspCd(String rspCd) {
        this.rspCd = rspCd == null ? null : rspCd.trim();
    }

    public String getRspMsg() {
        return rspMsg;
    }

    public void setRspMsg(String rspMsg) {
        this.rspMsg = rspMsg == null ? null : rspMsg.trim();
    }

    public Date getRecUpdTs() {
        return recUpdTs;
    }

    public void setRecUpdTs(Date recUpdTs) {
        this.recUpdTs = recUpdTs;
    }

    public Date getRecCrtTs() {
        return recCrtTs;
    }

    public void setRecCrtTs(Date recCrtTs) {
        this.recCrtTs = recCrtTs;
    }

    @Override
    public String toString(){
		
    	return "TblMaraTransLog[id="+id+", userId="+userId+", orderId="+orderId+", mchntCd="
    			+mchntCd+", transAmt="+transAmt+", disAmt="+disAmt+", rspCd="+rspCd+", rspMsg="
    			+rspMsg+", recUpdTs="+recUpdTs+", recCrtTs="+recCrtTs+"]";
    }
}