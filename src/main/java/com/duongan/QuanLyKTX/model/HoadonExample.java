package com.duongan.QuanLyKTX.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HoadonExample {
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
    public HoadonExample() {
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

        public Criteria andIdHoadonIsNull() {
            addCriterion("id_hoadon is null");
            return (Criteria) this;
        }

        public Criteria andIdHoadonIsNotNull() {
            addCriterion("id_hoadon is not null");
            return (Criteria) this;
        }

        public Criteria andIdHoadonEqualTo(Integer value) {
            addCriterion("id_hoadon =", value, "idHoadon");
            return (Criteria) this;
        }

        public Criteria andIdHoadonNotEqualTo(Integer value) {
            addCriterion("id_hoadon <>", value, "idHoadon");
            return (Criteria) this;
        }

        public Criteria andIdHoadonGreaterThan(Integer value) {
            addCriterion("id_hoadon >", value, "idHoadon");
            return (Criteria) this;
        }

        public Criteria andIdHoadonGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_hoadon >=", value, "idHoadon");
            return (Criteria) this;
        }

        public Criteria andIdHoadonLessThan(Integer value) {
            addCriterion("id_hoadon <", value, "idHoadon");
            return (Criteria) this;
        }

        public Criteria andIdHoadonLessThanOrEqualTo(Integer value) {
            addCriterion("id_hoadon <=", value, "idHoadon");
            return (Criteria) this;
        }

        public Criteria andIdHoadonIn(List<Integer> values) {
            addCriterion("id_hoadon in", values, "idHoadon");
            return (Criteria) this;
        }

        public Criteria andIdHoadonNotIn(List<Integer> values) {
            addCriterion("id_hoadon not in", values, "idHoadon");
            return (Criteria) this;
        }

        public Criteria andIdHoadonBetween(Integer value1, Integer value2) {
            addCriterion("id_hoadon between", value1, value2, "idHoadon");
            return (Criteria) this;
        }

        public Criteria andIdHoadonNotBetween(Integer value1, Integer value2) {
            addCriterion("id_hoadon not between", value1, value2, "idHoadon");
            return (Criteria) this;
        }

        public Criteria andThanhtienIsNull() {
            addCriterion("thanhtien is null");
            return (Criteria) this;
        }

        public Criteria andThanhtienIsNotNull() {
            addCriterion("thanhtien is not null");
            return (Criteria) this;
        }

        public Criteria andThanhtienEqualTo(Double value) {
            addCriterion("thanhtien =", value, "thanhtien");
            return (Criteria) this;
        }

        public Criteria andThanhtienNotEqualTo(Double value) {
            addCriterion("thanhtien <>", value, "thanhtien");
            return (Criteria) this;
        }

        public Criteria andThanhtienGreaterThan(Double value) {
            addCriterion("thanhtien >", value, "thanhtien");
            return (Criteria) this;
        }

        public Criteria andThanhtienGreaterThanOrEqualTo(Double value) {
            addCriterion("thanhtien >=", value, "thanhtien");
            return (Criteria) this;
        }

        public Criteria andThanhtienLessThan(Double value) {
            addCriterion("thanhtien <", value, "thanhtien");
            return (Criteria) this;
        }

        public Criteria andThanhtienLessThanOrEqualTo(Double value) {
            addCriterion("thanhtien <=", value, "thanhtien");
            return (Criteria) this;
        }

        public Criteria andThanhtienIn(List<Double> values) {
            addCriterion("thanhtien in", values, "thanhtien");
            return (Criteria) this;
        }

        public Criteria andThanhtienNotIn(List<Double> values) {
            addCriterion("thanhtien not in", values, "thanhtien");
            return (Criteria) this;
        }

        public Criteria andThanhtienBetween(Double value1, Double value2) {
            addCriterion("thanhtien between", value1, value2, "thanhtien");
            return (Criteria) this;
        }

        public Criteria andThanhtienNotBetween(Double value1, Double value2) {
            addCriterion("thanhtien not between", value1, value2, "thanhtien");
            return (Criteria) this;
        }

        public Criteria andNgayxuathdIsNull() {
            addCriterion("ngayxuatHD is null");
            return (Criteria) this;
        }

        public Criteria andNgayxuathdIsNotNull() {
            addCriterion("ngayxuatHD is not null");
            return (Criteria) this;
        }

        public Criteria andNgayxuathdEqualTo(Date value) {
            addCriterion("ngayxuatHD =", value, "ngayxuathd");
            return (Criteria) this;
        }

        public Criteria andNgayxuathdNotEqualTo(Date value) {
            addCriterion("ngayxuatHD <>", value, "ngayxuathd");
            return (Criteria) this;
        }

        public Criteria andNgayxuathdGreaterThan(Date value) {
            addCriterion("ngayxuatHD >", value, "ngayxuathd");
            return (Criteria) this;
        }

        public Criteria andNgayxuathdGreaterThanOrEqualTo(Date value) {
            addCriterion("ngayxuatHD >=", value, "ngayxuathd");
            return (Criteria) this;
        }

        public Criteria andNgayxuathdLessThan(Date value) {
            addCriterion("ngayxuatHD <", value, "ngayxuathd");
            return (Criteria) this;
        }

        public Criteria andNgayxuathdLessThanOrEqualTo(Date value) {
            addCriterion("ngayxuatHD <=", value, "ngayxuathd");
            return (Criteria) this;
        }

        public Criteria andNgayxuathdIn(List<Date> values) {
            addCriterion("ngayxuatHD in", values, "ngayxuathd");
            return (Criteria) this;
        }

        public Criteria andNgayxuathdNotIn(List<Date> values) {
            addCriterion("ngayxuatHD not in", values, "ngayxuathd");
            return (Criteria) this;
        }

        public Criteria andNgayxuathdBetween(Date value1, Date value2) {
            addCriterion("ngayxuatHD between", value1, value2, "ngayxuathd");
            return (Criteria) this;
        }

        public Criteria andNgayxuathdNotBetween(Date value1, Date value2) {
            addCriterion("ngayxuatHD not between", value1, value2, "ngayxuathd");
            return (Criteria) this;
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