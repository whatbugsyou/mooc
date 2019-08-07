package com.mooc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCmidIsNull() {
            addCriterion("cmid is null");
            return (Criteria) this;
        }

        public Criteria andCmidIsNotNull() {
            addCriterion("cmid is not null");
            return (Criteria) this;
        }

        public Criteria andCmidEqualTo(Integer value) {
            addCriterion("cmid =", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotEqualTo(Integer value) {
            addCriterion("cmid <>", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidGreaterThan(Integer value) {
            addCriterion("cmid >", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cmid >=", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidLessThan(Integer value) {
            addCriterion("cmid <", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidLessThanOrEqualTo(Integer value) {
            addCriterion("cmid <=", value, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidIn(List<Integer> values) {
            addCriterion("cmid in", values, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotIn(List<Integer> values) {
            addCriterion("cmid not in", values, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidBetween(Integer value1, Integer value2) {
            addCriterion("cmid between", value1, value2, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmidNotBetween(Integer value1, Integer value2) {
            addCriterion("cmid not between", value1, value2, "cmid");
            return (Criteria) this;
        }

        public Criteria andCmdescIsNull() {
            addCriterion("cmdesc is null");
            return (Criteria) this;
        }

        public Criteria andCmdescIsNotNull() {
            addCriterion("cmdesc is not null");
            return (Criteria) this;
        }

        public Criteria andCmdescEqualTo(String value) {
            addCriterion("cmdesc =", value, "cmdesc");
            return (Criteria) this;
        }

        public Criteria andCmdescNotEqualTo(String value) {
            addCriterion("cmdesc <>", value, "cmdesc");
            return (Criteria) this;
        }

        public Criteria andCmdescGreaterThan(String value) {
            addCriterion("cmdesc >", value, "cmdesc");
            return (Criteria) this;
        }

        public Criteria andCmdescGreaterThanOrEqualTo(String value) {
            addCriterion("cmdesc >=", value, "cmdesc");
            return (Criteria) this;
        }

        public Criteria andCmdescLessThan(String value) {
            addCriterion("cmdesc <", value, "cmdesc");
            return (Criteria) this;
        }

        public Criteria andCmdescLessThanOrEqualTo(String value) {
            addCriterion("cmdesc <=", value, "cmdesc");
            return (Criteria) this;
        }

        public Criteria andCmdescLike(String value) {
            addCriterion("cmdesc like", value, "cmdesc");
            return (Criteria) this;
        }

        public Criteria andCmdescNotLike(String value) {
            addCriterion("cmdesc not like", value, "cmdesc");
            return (Criteria) this;
        }

        public Criteria andCmdescIn(List<String> values) {
            addCriterion("cmdesc in", values, "cmdesc");
            return (Criteria) this;
        }

        public Criteria andCmdescNotIn(List<String> values) {
            addCriterion("cmdesc not in", values, "cmdesc");
            return (Criteria) this;
        }

        public Criteria andCmdescBetween(String value1, String value2) {
            addCriterion("cmdesc between", value1, value2, "cmdesc");
            return (Criteria) this;
        }

        public Criteria andCmdescNotBetween(String value1, String value2) {
            addCriterion("cmdesc not between", value1, value2, "cmdesc");
            return (Criteria) this;
        }

        public Criteria andCmgradeIsNull() {
            addCriterion("cmgrade is null");
            return (Criteria) this;
        }

        public Criteria andCmgradeIsNotNull() {
            addCriterion("cmgrade is not null");
            return (Criteria) this;
        }

        public Criteria andCmgradeEqualTo(Integer value) {
            addCriterion("cmgrade =", value, "cmgrade");
            return (Criteria) this;
        }

        public Criteria andCmgradeNotEqualTo(Integer value) {
            addCriterion("cmgrade <>", value, "cmgrade");
            return (Criteria) this;
        }

        public Criteria andCmgradeGreaterThan(Integer value) {
            addCriterion("cmgrade >", value, "cmgrade");
            return (Criteria) this;
        }

        public Criteria andCmgradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cmgrade >=", value, "cmgrade");
            return (Criteria) this;
        }

        public Criteria andCmgradeLessThan(Integer value) {
            addCriterion("cmgrade <", value, "cmgrade");
            return (Criteria) this;
        }

        public Criteria andCmgradeLessThanOrEqualTo(Integer value) {
            addCriterion("cmgrade <=", value, "cmgrade");
            return (Criteria) this;
        }

        public Criteria andCmgradeIn(List<Integer> values) {
            addCriterion("cmgrade in", values, "cmgrade");
            return (Criteria) this;
        }

        public Criteria andCmgradeNotIn(List<Integer> values) {
            addCriterion("cmgrade not in", values, "cmgrade");
            return (Criteria) this;
        }

        public Criteria andCmgradeBetween(Integer value1, Integer value2) {
            addCriterion("cmgrade between", value1, value2, "cmgrade");
            return (Criteria) this;
        }

        public Criteria andCmgradeNotBetween(Integer value1, Integer value2) {
            addCriterion("cmgrade not between", value1, value2, "cmgrade");
            return (Criteria) this;
        }

        public Criteria andCmdateIsNull() {
            addCriterion("cmdate is null");
            return (Criteria) this;
        }

        public Criteria andCmdateIsNotNull() {
            addCriterion("cmdate is not null");
            return (Criteria) this;
        }

        public Criteria andCmdateEqualTo(Date value) {
            addCriterion("cmdate =", value, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdateNotEqualTo(Date value) {
            addCriterion("cmdate <>", value, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdateGreaterThan(Date value) {
            addCriterion("cmdate >", value, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdateGreaterThanOrEqualTo(Date value) {
            addCriterion("cmdate >=", value, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdateLessThan(Date value) {
            addCriterion("cmdate <", value, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdateLessThanOrEqualTo(Date value) {
            addCriterion("cmdate <=", value, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdateIn(List<Date> values) {
            addCriterion("cmdate in", values, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdateNotIn(List<Date> values) {
            addCriterion("cmdate not in", values, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdateBetween(Date value1, Date value2) {
            addCriterion("cmdate between", value1, value2, "cmdate");
            return (Criteria) this;
        }

        public Criteria andCmdateNotBetween(Date value1, Date value2) {
            addCriterion("cmdate not between", value1, value2, "cmdate");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
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