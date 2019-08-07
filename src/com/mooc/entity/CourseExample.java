package com.mooc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCdescIsNull() {
            addCriterion("cdesc is null");
            return (Criteria) this;
        }

        public Criteria andCdescIsNotNull() {
            addCriterion("cdesc is not null");
            return (Criteria) this;
        }

        public Criteria andCdescEqualTo(String value) {
            addCriterion("cdesc =", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescNotEqualTo(String value) {
            addCriterion("cdesc <>", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescGreaterThan(String value) {
            addCriterion("cdesc >", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescGreaterThanOrEqualTo(String value) {
            addCriterion("cdesc >=", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescLessThan(String value) {
            addCriterion("cdesc <", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescLessThanOrEqualTo(String value) {
            addCriterion("cdesc <=", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescLike(String value) {
            addCriterion("cdesc like", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescNotLike(String value) {
            addCriterion("cdesc not like", value, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescIn(List<String> values) {
            addCriterion("cdesc in", values, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescNotIn(List<String> values) {
            addCriterion("cdesc not in", values, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescBetween(String value1, String value2) {
            addCriterion("cdesc between", value1, value2, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCdescNotBetween(String value1, String value2) {
            addCriterion("cdesc not between", value1, value2, "cdesc");
            return (Criteria) this;
        }

        public Criteria andCplayvolumeIsNull() {
            addCriterion("cplayvolume is null");
            return (Criteria) this;
        }

        public Criteria andCplayvolumeIsNotNull() {
            addCriterion("cplayvolume is not null");
            return (Criteria) this;
        }

        public Criteria andCplayvolumeEqualTo(Integer value) {
            addCriterion("cplayvolume =", value, "cplayvolume");
            return (Criteria) this;
        }

        public Criteria andCplayvolumeNotEqualTo(Integer value) {
            addCriterion("cplayvolume <>", value, "cplayvolume");
            return (Criteria) this;
        }

        public Criteria andCplayvolumeGreaterThan(Integer value) {
            addCriterion("cplayvolume >", value, "cplayvolume");
            return (Criteria) this;
        }

        public Criteria andCplayvolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cplayvolume >=", value, "cplayvolume");
            return (Criteria) this;
        }

        public Criteria andCplayvolumeLessThan(Integer value) {
            addCriterion("cplayvolume <", value, "cplayvolume");
            return (Criteria) this;
        }

        public Criteria andCplayvolumeLessThanOrEqualTo(Integer value) {
            addCriterion("cplayvolume <=", value, "cplayvolume");
            return (Criteria) this;
        }

        public Criteria andCplayvolumeIn(List<Integer> values) {
            addCriterion("cplayvolume in", values, "cplayvolume");
            return (Criteria) this;
        }

        public Criteria andCplayvolumeNotIn(List<Integer> values) {
            addCriterion("cplayvolume not in", values, "cplayvolume");
            return (Criteria) this;
        }

        public Criteria andCplayvolumeBetween(Integer value1, Integer value2) {
            addCriterion("cplayvolume between", value1, value2, "cplayvolume");
            return (Criteria) this;
        }

        public Criteria andCplayvolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("cplayvolume not between", value1, value2, "cplayvolume");
            return (Criteria) this;
        }

        public Criteria andCauthorIsNull() {
            addCriterion("cauthor is null");
            return (Criteria) this;
        }

        public Criteria andCauthorIsNotNull() {
            addCriterion("cauthor is not null");
            return (Criteria) this;
        }

        public Criteria andCauthorEqualTo(String value) {
            addCriterion("cauthor =", value, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorNotEqualTo(String value) {
            addCriterion("cauthor <>", value, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorGreaterThan(String value) {
            addCriterion("cauthor >", value, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorGreaterThanOrEqualTo(String value) {
            addCriterion("cauthor >=", value, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorLessThan(String value) {
            addCriterion("cauthor <", value, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorLessThanOrEqualTo(String value) {
            addCriterion("cauthor <=", value, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorLike(String value) {
            addCriterion("cauthor like", value, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorNotLike(String value) {
            addCriterion("cauthor not like", value, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorIn(List<String> values) {
            addCriterion("cauthor in", values, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorNotIn(List<String> values) {
            addCriterion("cauthor not in", values, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorBetween(String value1, String value2) {
            addCriterion("cauthor between", value1, value2, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCauthorNotBetween(String value1, String value2) {
            addCriterion("cauthor not between", value1, value2, "cauthor");
            return (Criteria) this;
        }

        public Criteria andCuploadtimeIsNull() {
            addCriterion("cuploadTime is null");
            return (Criteria) this;
        }

        public Criteria andCuploadtimeIsNotNull() {
            addCriterion("cuploadTime is not null");
            return (Criteria) this;
        }

        public Criteria andCuploadtimeEqualTo(Date value) {
            addCriterion("cuploadTime =", value, "cuploadtime");
            return (Criteria) this;
        }

        public Criteria andCuploadtimeNotEqualTo(Date value) {
            addCriterion("cuploadTime <>", value, "cuploadtime");
            return (Criteria) this;
        }

        public Criteria andCuploadtimeGreaterThan(Date value) {
            addCriterion("cuploadTime >", value, "cuploadtime");
            return (Criteria) this;
        }

        public Criteria andCuploadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cuploadTime >=", value, "cuploadtime");
            return (Criteria) this;
        }

        public Criteria andCuploadtimeLessThan(Date value) {
            addCriterion("cuploadTime <", value, "cuploadtime");
            return (Criteria) this;
        }

        public Criteria andCuploadtimeLessThanOrEqualTo(Date value) {
            addCriterion("cuploadTime <=", value, "cuploadtime");
            return (Criteria) this;
        }

        public Criteria andCuploadtimeIn(List<Date> values) {
            addCriterion("cuploadTime in", values, "cuploadtime");
            return (Criteria) this;
        }

        public Criteria andCuploadtimeNotIn(List<Date> values) {
            addCriterion("cuploadTime not in", values, "cuploadtime");
            return (Criteria) this;
        }

        public Criteria andCuploadtimeBetween(Date value1, Date value2) {
            addCriterion("cuploadTime between", value1, value2, "cuploadtime");
            return (Criteria) this;
        }

        public Criteria andCuploadtimeNotBetween(Date value1, Date value2) {
            addCriterion("cuploadTime not between", value1, value2, "cuploadtime");
            return (Criteria) this;
        }

        public Criteria andCtidIsNull() {
            addCriterion("ctid is null");
            return (Criteria) this;
        }

        public Criteria andCtidIsNotNull() {
            addCriterion("ctid is not null");
            return (Criteria) this;
        }

        public Criteria andCtidEqualTo(Integer value) {
            addCriterion("ctid =", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidNotEqualTo(Integer value) {
            addCriterion("ctid <>", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidGreaterThan(Integer value) {
            addCriterion("ctid >", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ctid >=", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidLessThan(Integer value) {
            addCriterion("ctid <", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidLessThanOrEqualTo(Integer value) {
            addCriterion("ctid <=", value, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidIn(List<Integer> values) {
            addCriterion("ctid in", values, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidNotIn(List<Integer> values) {
            addCriterion("ctid not in", values, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidBetween(Integer value1, Integer value2) {
            addCriterion("ctid between", value1, value2, "ctid");
            return (Criteria) this;
        }

        public Criteria andCtidNotBetween(Integer value1, Integer value2) {
            addCriterion("ctid not between", value1, value2, "ctid");
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