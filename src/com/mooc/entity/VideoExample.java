package com.mooc.entity;

import java.util.ArrayList;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(Integer value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(Integer value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(Integer value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(Integer value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(Integer value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<Integer> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<Integer> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(Integer value1, Integer value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(Integer value1, Integer value2) {
            addCriterion("vid not between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVnameIsNull() {
            addCriterion("vname is null");
            return (Criteria) this;
        }

        public Criteria andVnameIsNotNull() {
            addCriterion("vname is not null");
            return (Criteria) this;
        }

        public Criteria andVnameEqualTo(String value) {
            addCriterion("vname =", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotEqualTo(String value) {
            addCriterion("vname <>", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThan(String value) {
            addCriterion("vname >", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThanOrEqualTo(String value) {
            addCriterion("vname >=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThan(String value) {
            addCriterion("vname <", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThanOrEqualTo(String value) {
            addCriterion("vname <=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLike(String value) {
            addCriterion("vname like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotLike(String value) {
            addCriterion("vname not like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameIn(List<String> values) {
            addCriterion("vname in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotIn(List<String> values) {
            addCriterion("vname not in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameBetween(String value1, String value2) {
            addCriterion("vname between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotBetween(String value1, String value2) {
            addCriterion("vname not between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andVepisodeIsNull() {
            addCriterion("vepisode is null");
            return (Criteria) this;
        }

        public Criteria andVepisodeIsNotNull() {
            addCriterion("vepisode is not null");
            return (Criteria) this;
        }

        public Criteria andVepisodeEqualTo(String value) {
            addCriterion("vepisode =", value, "vepisode");
            return (Criteria) this;
        }

        public Criteria andVepisodeNotEqualTo(String value) {
            addCriterion("vepisode <>", value, "vepisode");
            return (Criteria) this;
        }

        public Criteria andVepisodeGreaterThan(String value) {
            addCriterion("vepisode >", value, "vepisode");
            return (Criteria) this;
        }

        public Criteria andVepisodeGreaterThanOrEqualTo(String value) {
            addCriterion("vepisode >=", value, "vepisode");
            return (Criteria) this;
        }

        public Criteria andVepisodeLessThan(String value) {
            addCriterion("vepisode <", value, "vepisode");
            return (Criteria) this;
        }

        public Criteria andVepisodeLessThanOrEqualTo(String value) {
            addCriterion("vepisode <=", value, "vepisode");
            return (Criteria) this;
        }

        public Criteria andVepisodeLike(String value) {
            addCriterion("vepisode like", value, "vepisode");
            return (Criteria) this;
        }

        public Criteria andVepisodeNotLike(String value) {
            addCriterion("vepisode not like", value, "vepisode");
            return (Criteria) this;
        }

        public Criteria andVepisodeIn(List<String> values) {
            addCriterion("vepisode in", values, "vepisode");
            return (Criteria) this;
        }

        public Criteria andVepisodeNotIn(List<String> values) {
            addCriterion("vepisode not in", values, "vepisode");
            return (Criteria) this;
        }

        public Criteria andVepisodeBetween(String value1, String value2) {
            addCriterion("vepisode between", value1, value2, "vepisode");
            return (Criteria) this;
        }

        public Criteria andVepisodeNotBetween(String value1, String value2) {
            addCriterion("vepisode not between", value1, value2, "vepisode");
            return (Criteria) this;
        }

        public Criteria andVaddressIsNull() {
            addCriterion("vaddress is null");
            return (Criteria) this;
        }

        public Criteria andVaddressIsNotNull() {
            addCriterion("vaddress is not null");
            return (Criteria) this;
        }

        public Criteria andVaddressEqualTo(String value) {
            addCriterion("vaddress =", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressNotEqualTo(String value) {
            addCriterion("vaddress <>", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressGreaterThan(String value) {
            addCriterion("vaddress >", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressGreaterThanOrEqualTo(String value) {
            addCriterion("vaddress >=", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressLessThan(String value) {
            addCriterion("vaddress <", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressLessThanOrEqualTo(String value) {
            addCriterion("vaddress <=", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressLike(String value) {
            addCriterion("vaddress like", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressNotLike(String value) {
            addCriterion("vaddress not like", value, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressIn(List<String> values) {
            addCriterion("vaddress in", values, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressNotIn(List<String> values) {
            addCriterion("vaddress not in", values, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressBetween(String value1, String value2) {
            addCriterion("vaddress between", value1, value2, "vaddress");
            return (Criteria) this;
        }

        public Criteria andVaddressNotBetween(String value1, String value2) {
            addCriterion("vaddress not between", value1, value2, "vaddress");
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