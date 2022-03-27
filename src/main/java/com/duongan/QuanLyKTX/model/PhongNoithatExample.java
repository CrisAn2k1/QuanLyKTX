package com.duongan.QuanLyKTX.model;

import java.util.ArrayList;
import java.util.List;

public class PhongNoithatExample {
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
    public PhongNoithatExample() {
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

        public Criteria andIdPhongIsNull() {
            addCriterion("id_phong is null");
            return (Criteria) this;
        }

        public Criteria andIdPhongIsNotNull() {
            addCriterion("id_phong is not null");
            return (Criteria) this;
        }

        public Criteria andIdPhongEqualTo(String value) {
            addCriterion("id_phong =", value, "idPhong");
            return (Criteria) this;
        }

        public Criteria andIdPhongNotEqualTo(String value) {
            addCriterion("id_phong <>", value, "idPhong");
            return (Criteria) this;
        }

        public Criteria andIdPhongGreaterThan(String value) {
            addCriterion("id_phong >", value, "idPhong");
            return (Criteria) this;
        }

        public Criteria andIdPhongGreaterThanOrEqualTo(String value) {
            addCriterion("id_phong >=", value, "idPhong");
            return (Criteria) this;
        }

        public Criteria andIdPhongLessThan(String value) {
            addCriterion("id_phong <", value, "idPhong");
            return (Criteria) this;
        }

        public Criteria andIdPhongLessThanOrEqualTo(String value) {
            addCriterion("id_phong <=", value, "idPhong");
            return (Criteria) this;
        }

        public Criteria andIdPhongLike(String value) {
            addCriterion("id_phong like", value, "idPhong");
            return (Criteria) this;
        }

        public Criteria andIdPhongNotLike(String value) {
            addCriterion("id_phong not like", value, "idPhong");
            return (Criteria) this;
        }

        public Criteria andIdPhongIn(List<String> values) {
            addCriterion("id_phong in", values, "idPhong");
            return (Criteria) this;
        }

        public Criteria andIdPhongNotIn(List<String> values) {
            addCriterion("id_phong not in", values, "idPhong");
            return (Criteria) this;
        }

        public Criteria andIdPhongBetween(String value1, String value2) {
            addCriterion("id_phong between", value1, value2, "idPhong");
            return (Criteria) this;
        }

        public Criteria andIdPhongNotBetween(String value1, String value2) {
            addCriterion("id_phong not between", value1, value2, "idPhong");
            return (Criteria) this;
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

        public Criteria andSoluongIsNull() {
            addCriterion("soluong is null");
            return (Criteria) this;
        }

        public Criteria andSoluongIsNotNull() {
            addCriterion("soluong is not null");
            return (Criteria) this;
        }

        public Criteria andSoluongEqualTo(Integer value) {
            addCriterion("soluong =", value, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongNotEqualTo(Integer value) {
            addCriterion("soluong <>", value, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongGreaterThan(Integer value) {
            addCriterion("soluong >", value, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongGreaterThanOrEqualTo(Integer value) {
            addCriterion("soluong >=", value, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongLessThan(Integer value) {
            addCriterion("soluong <", value, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongLessThanOrEqualTo(Integer value) {
            addCriterion("soluong <=", value, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongIn(List<Integer> values) {
            addCriterion("soluong in", values, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongNotIn(List<Integer> values) {
            addCriterion("soluong not in", values, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongBetween(Integer value1, Integer value2) {
            addCriterion("soluong between", value1, value2, "soluong");
            return (Criteria) this;
        }

        public Criteria andSoluongNotBetween(Integer value1, Integer value2) {
            addCriterion("soluong not between", value1, value2, "soluong");
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