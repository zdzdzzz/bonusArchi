package com.zd.archi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblMaraTransLogExample implements Serializable{
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblMaraTransLogExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andMchntCdIsNull() {
            addCriterion("MCHNT_CD is null");
            return (Criteria) this;
        }

        public Criteria andMchntCdIsNotNull() {
            addCriterion("MCHNT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andMchntCdEqualTo(String value) {
            addCriterion("MCHNT_CD =", value, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdNotEqualTo(String value) {
            addCriterion("MCHNT_CD <>", value, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdGreaterThan(String value) {
            addCriterion("MCHNT_CD >", value, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdGreaterThanOrEqualTo(String value) {
            addCriterion("MCHNT_CD >=", value, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdLessThan(String value) {
            addCriterion("MCHNT_CD <", value, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdLessThanOrEqualTo(String value) {
            addCriterion("MCHNT_CD <=", value, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdLike(String value) {
            addCriterion("MCHNT_CD like", value, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdNotLike(String value) {
            addCriterion("MCHNT_CD not like", value, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdIn(List<String> values) {
            addCriterion("MCHNT_CD in", values, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdNotIn(List<String> values) {
            addCriterion("MCHNT_CD not in", values, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdBetween(String value1, String value2) {
            addCriterion("MCHNT_CD between", value1, value2, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andMchntCdNotBetween(String value1, String value2) {
            addCriterion("MCHNT_CD not between", value1, value2, "mchntCd");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTransAmtIsNull() {
            addCriterion("TRANS_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTransAmtIsNotNull() {
            addCriterion("TRANS_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTransAmtEqualTo(Integer value) {
            addCriterion("TRANS_AMT =", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotEqualTo(Integer value) {
            addCriterion("TRANS_AMT <>", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtGreaterThan(Integer value) {
            addCriterion("TRANS_AMT >", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRANS_AMT >=", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtLessThan(Integer value) {
            addCriterion("TRANS_AMT <", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtLessThanOrEqualTo(Integer value) {
            addCriterion("TRANS_AMT <=", value, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtIn(List<Integer> values) {
            addCriterion("TRANS_AMT in", values, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotIn(List<Integer> values) {
            addCriterion("TRANS_AMT not in", values, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtBetween(Integer value1, Integer value2) {
            addCriterion("TRANS_AMT between", value1, value2, "transAmt");
            return (Criteria) this;
        }

        public Criteria andTransAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("TRANS_AMT not between", value1, value2, "transAmt");
            return (Criteria) this;
        }

        public Criteria andDisAmtIsNull() {
            addCriterion("DIS_AMT is null");
            return (Criteria) this;
        }

        public Criteria andDisAmtIsNotNull() {
            addCriterion("DIS_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andDisAmtEqualTo(Integer value) {
            addCriterion("DIS_AMT =", value, "disAmt");
            return (Criteria) this;
        }

        public Criteria andDisAmtNotEqualTo(Integer value) {
            addCriterion("DIS_AMT <>", value, "disAmt");
            return (Criteria) this;
        }

        public Criteria andDisAmtGreaterThan(Integer value) {
            addCriterion("DIS_AMT >", value, "disAmt");
            return (Criteria) this;
        }

        public Criteria andDisAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("DIS_AMT >=", value, "disAmt");
            return (Criteria) this;
        }

        public Criteria andDisAmtLessThan(Integer value) {
            addCriterion("DIS_AMT <", value, "disAmt");
            return (Criteria) this;
        }

        public Criteria andDisAmtLessThanOrEqualTo(Integer value) {
            addCriterion("DIS_AMT <=", value, "disAmt");
            return (Criteria) this;
        }

        public Criteria andDisAmtIn(List<Integer> values) {
            addCriterion("DIS_AMT in", values, "disAmt");
            return (Criteria) this;
        }

        public Criteria andDisAmtNotIn(List<Integer> values) {
            addCriterion("DIS_AMT not in", values, "disAmt");
            return (Criteria) this;
        }

        public Criteria andDisAmtBetween(Integer value1, Integer value2) {
            addCriterion("DIS_AMT between", value1, value2, "disAmt");
            return (Criteria) this;
        }

        public Criteria andDisAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("DIS_AMT not between", value1, value2, "disAmt");
            return (Criteria) this;
        }

        public Criteria andRspCdIsNull() {
            addCriterion("RSP_CD is null");
            return (Criteria) this;
        }

        public Criteria andRspCdIsNotNull() {
            addCriterion("RSP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andRspCdEqualTo(String value) {
            addCriterion("RSP_CD =", value, "rspCd");
            return (Criteria) this;
        }

        public Criteria andRspCdNotEqualTo(String value) {
            addCriterion("RSP_CD <>", value, "rspCd");
            return (Criteria) this;
        }

        public Criteria andRspCdGreaterThan(String value) {
            addCriterion("RSP_CD >", value, "rspCd");
            return (Criteria) this;
        }

        public Criteria andRspCdGreaterThanOrEqualTo(String value) {
            addCriterion("RSP_CD >=", value, "rspCd");
            return (Criteria) this;
        }

        public Criteria andRspCdLessThan(String value) {
            addCriterion("RSP_CD <", value, "rspCd");
            return (Criteria) this;
        }

        public Criteria andRspCdLessThanOrEqualTo(String value) {
            addCriterion("RSP_CD <=", value, "rspCd");
            return (Criteria) this;
        }

        public Criteria andRspCdLike(String value) {
            addCriterion("RSP_CD like", value, "rspCd");
            return (Criteria) this;
        }

        public Criteria andRspCdNotLike(String value) {
            addCriterion("RSP_CD not like", value, "rspCd");
            return (Criteria) this;
        }

        public Criteria andRspCdIn(List<String> values) {
            addCriterion("RSP_CD in", values, "rspCd");
            return (Criteria) this;
        }

        public Criteria andRspCdNotIn(List<String> values) {
            addCriterion("RSP_CD not in", values, "rspCd");
            return (Criteria) this;
        }

        public Criteria andRspCdBetween(String value1, String value2) {
            addCriterion("RSP_CD between", value1, value2, "rspCd");
            return (Criteria) this;
        }

        public Criteria andRspCdNotBetween(String value1, String value2) {
            addCriterion("RSP_CD not between", value1, value2, "rspCd");
            return (Criteria) this;
        }

        public Criteria andRspMsgIsNull() {
            addCriterion("RSP_MSG is null");
            return (Criteria) this;
        }

        public Criteria andRspMsgIsNotNull() {
            addCriterion("RSP_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andRspMsgEqualTo(String value) {
            addCriterion("RSP_MSG =", value, "rspMsg");
            return (Criteria) this;
        }

        public Criteria andRspMsgNotEqualTo(String value) {
            addCriterion("RSP_MSG <>", value, "rspMsg");
            return (Criteria) this;
        }

        public Criteria andRspMsgGreaterThan(String value) {
            addCriterion("RSP_MSG >", value, "rspMsg");
            return (Criteria) this;
        }

        public Criteria andRspMsgGreaterThanOrEqualTo(String value) {
            addCriterion("RSP_MSG >=", value, "rspMsg");
            return (Criteria) this;
        }

        public Criteria andRspMsgLessThan(String value) {
            addCriterion("RSP_MSG <", value, "rspMsg");
            return (Criteria) this;
        }

        public Criteria andRspMsgLessThanOrEqualTo(String value) {
            addCriterion("RSP_MSG <=", value, "rspMsg");
            return (Criteria) this;
        }

        public Criteria andRspMsgLike(String value) {
            addCriterion("RSP_MSG like", value, "rspMsg");
            return (Criteria) this;
        }

        public Criteria andRspMsgNotLike(String value) {
            addCriterion("RSP_MSG not like", value, "rspMsg");
            return (Criteria) this;
        }

        public Criteria andRspMsgIn(List<String> values) {
            addCriterion("RSP_MSG in", values, "rspMsg");
            return (Criteria) this;
        }

        public Criteria andRspMsgNotIn(List<String> values) {
            addCriterion("RSP_MSG not in", values, "rspMsg");
            return (Criteria) this;
        }

        public Criteria andRspMsgBetween(String value1, String value2) {
            addCriterion("RSP_MSG between", value1, value2, "rspMsg");
            return (Criteria) this;
        }

        public Criteria andRspMsgNotBetween(String value1, String value2) {
            addCriterion("RSP_MSG not between", value1, value2, "rspMsg");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsIsNull() {
            addCriterion("REC_UPD_TS is null");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsIsNotNull() {
            addCriterion("REC_UPD_TS is not null");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsEqualTo(Date value) {
            addCriterion("REC_UPD_TS =", value, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsNotEqualTo(Date value) {
            addCriterion("REC_UPD_TS <>", value, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsGreaterThan(Date value) {
            addCriterion("REC_UPD_TS >", value, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsGreaterThanOrEqualTo(Date value) {
            addCriterion("REC_UPD_TS >=", value, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsLessThan(Date value) {
            addCriterion("REC_UPD_TS <", value, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsLessThanOrEqualTo(Date value) {
            addCriterion("REC_UPD_TS <=", value, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsIn(List<Date> values) {
            addCriterion("REC_UPD_TS in", values, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsNotIn(List<Date> values) {
            addCriterion("REC_UPD_TS not in", values, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsBetween(Date value1, Date value2) {
            addCriterion("REC_UPD_TS between", value1, value2, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecUpdTsNotBetween(Date value1, Date value2) {
            addCriterion("REC_UPD_TS not between", value1, value2, "recUpdTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsIsNull() {
            addCriterion("REC_CRT_TS is null");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsIsNotNull() {
            addCriterion("REC_CRT_TS is not null");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsEqualTo(Date value) {
            addCriterion("REC_CRT_TS =", value, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsNotEqualTo(Date value) {
            addCriterion("REC_CRT_TS <>", value, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsGreaterThan(Date value) {
            addCriterion("REC_CRT_TS >", value, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsGreaterThanOrEqualTo(Date value) {
            addCriterion("REC_CRT_TS >=", value, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsLessThan(Date value) {
            addCriterion("REC_CRT_TS <", value, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsLessThanOrEqualTo(Date value) {
            addCriterion("REC_CRT_TS <=", value, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsIn(List<Date> values) {
            addCriterion("REC_CRT_TS in", values, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsNotIn(List<Date> values) {
            addCriterion("REC_CRT_TS not in", values, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsBetween(Date value1, Date value2) {
            addCriterion("REC_CRT_TS between", value1, value2, "recCrtTs");
            return (Criteria) this;
        }

        public Criteria andRecCrtTsNotBetween(Date value1, Date value2) {
            addCriterion("REC_CRT_TS not between", value1, value2, "recCrtTs");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}