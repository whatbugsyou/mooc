package com.mooc.entity;

import java.util.ArrayList;
import java.util.List;

public class CoursetypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CoursetypeExample() {
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

        public Criteria andCtnameIsNull() {
            addCriterion("ctname is null");
            return (Criteria) this;
        }

        public Criteria andCtnameIsNotNull() {
            addCriterion("ctname is not null");
            return (Criteria) this;
        }

        public Criteria andCtnameEqualTo(String value) {
            addCriterion("ctname =", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameNotEqualTo(String value) {
            addCriterion("ctname <>", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameGreaterThan(String value) {
            addCriterion("ctname >", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameGreaterThanOrEqualTo(String value) {
            addCriterion("ctname >=", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameLessThan(String value) {
            addCriterion("ctname <", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameLessThanOrEqualTo(String value) {
            addCriterion("ctname <=", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameLike(String value) {
            addCriterion("ctname like", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameNotLike(String value) {
            addCriterion("ctname not like", value, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameIn(List<String> values) {
            addCriterion("ctname in", values, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameNotIn(List<String> values) {
            addCriterion("ctname not in", values, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameBetween(String value1, String value2) {
            addCriterion("ctname between", value1, value2, "ctname");
            return (Criteria) this;
        }

        public Criteria andCtnameNotBetween(String value1, String value2) {
            addCriterion("ctname not between", value1, value2, "ctname");
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