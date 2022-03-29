package com.duongan.QuanLyKTX.model;

import java.util.ArrayList;
import java.util.List;

public class NoithatExample {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected String orderByClause;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected boolean distinct;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public NoithatExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andIdNoithatIsNull() {
            addCriterion("id_noithat is null");
            return (Criteria) this;
        }

        public Criteria andIdNoithatIsNotNull() {
            addCriterion("id_noithat is not null");
            return (Criteria) this;
        }

        public Criteria andIdNoithatEqualTo(Integer value) {
            addCriterion("id_noithat =", value, "idNoithat");
            return (Criteria) this;
        }

        public Criteria andIdNoithatNotEqualTo(Integer value) {
            addCriterion("id_noithat <>", value, "idNoithat");
            return (Criteria) this;
        }

        public Criteria andIdNoithatGreaterThan(Integer value) {
            addCriterion("id_noithat >", value, "idNoithat");
            return (Criteria) this;
        }

        public Criteria andIdNoithatGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_noithat >=", value, "idNoithat");
            return (Criteria) this;
        }

        public Criteria andIdNoithatLessThan(Integer value) {
            addCriterion("id_noithat <", value, "idNoithat");
            return (Criteria) this;
        }

        public Criteria andIdNoithatLessThanOrEqualTo(Integer value) {
            addCriterion("id_noithat <=", value, "idNoithat");
            return (Criteria) this;
        }

        public Criteria andIdNoithatIn(List<Integer> values) {
            addCriterion("id_noithat in", values, "idNoithat");
            return (Criteria) this;
        }

        public Criteria andIdNoithatNotIn(List<Integer> values) {
            addCriterion("id_noithat not in", values, "idNoithat");
            return (Criteria) this;
        }

        public Criteria andIdNoithatBetween(Integer value1, Integer value2) {
            addCriterion("id_noithat between", value1, value2, "idNoithat");
            return (Criteria) this;
        }

        public Criteria andIdNoithatNotBetween(Integer value1, Integer value2) {
            addCriterion("id_noithat not between", value1, value2, "idNoithat");
            return (Criteria) this;
        }

        public Criteria andTenIsNull() {
            addCriterion("ten is null");
            return (Criteria) this;
        }

        public Criteria andTenIsNotNull() {
            addCriterion("ten is not null");
            return (Criteria) this;
        }

        public Criteria andTenEqualTo(String value) {
            addCriterion("ten =", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotEqualTo(String value) {
            addCriterion("ten <>", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenGreaterThan(String value) {
            addCriterion("ten >", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenGreaterThanOrEqualTo(String value) {
            addCriterion("ten >=", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenLessThan(String value) {
            addCriterion("ten <", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenLessThanOrEqualTo(String value) {
            addCriterion("ten <=", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenLike(String value) {
            addCriterion("ten like", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotLike(String value) {
            addCriterion("ten not like", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenIn(List<String> values) {
            addCriterion("ten in", values, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotIn(List<String> values) {
            addCriterion("ten not in", values, "ten");
            return (Criteria) this;
        }

        public Criteria andTenBetween(String value1, String value2) {
            addCriterion("ten between", value1, value2, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotBetween(String value1, String value2) {
            addCriterion("ten not between", value1, value2, "ten");
            return (Criteria) this;
        }

        public Criteria andSoluongtonIsNull() {
            addCriterion("soluongton is null");
            return (Criteria) this;
        }

        public Criteria andSoluongtonIsNotNull() {
            addCriterion("soluongton is not null");
            return (Criteria) this;
        }

        public Criteria andSoluongtonEqualTo(Integer value) {
            addCriterion("soluongton =", value, "soluongton");
            return (Criteria) this;
        }

        public Criteria andSoluongtonNotEqualTo(Integer value) {
            addCriterion("soluongton <>", value, "soluongton");
            return (Criteria) this;
        }

        public Criteria andSoluongtonGreaterThan(Integer value) {
            addCriterion("soluongton >", value, "soluongton");
            return (Criteria) this;
        }

        public Criteria andSoluongtonGreaterThanOrEqualTo(Integer value) {
            addCriterion("soluongton >=", value, "soluongton");
            return (Criteria) this;
        }

        public Criteria andSoluongtonLessThan(Integer value) {
            addCriterion("soluongton <", value, "soluongton");
            return (Criteria) this;
        }

        public Criteria andSoluongtonLessThanOrEqualTo(Integer value) {
            addCriterion("soluongton <=", value, "soluongton");
            return (Criteria) this;
        }

        public Criteria andSoluongtonIn(List<Integer> values) {
            addCriterion("soluongton in", values, "soluongton");
            return (Criteria) this;
        }

        public Criteria andSoluongtonNotIn(List<Integer> values) {
            addCriterion("soluongton not in", values, "soluongton");
            return (Criteria) this;
        }

        public Criteria andSoluongtonBetween(Integer value1, Integer value2) {
            addCriterion("soluongton between", value1, value2, "soluongton");
            return (Criteria) this;
        }

        public Criteria andSoluongtonNotBetween(Integer value1, Integer value2) {
            addCriterion("soluongton not between", value1, value2, "soluongton");
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