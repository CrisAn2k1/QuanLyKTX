package com.duongan.QuanLyKTX.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HosodangkyExample {
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
    public HosodangkyExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdHosodkIsNull() {
            addCriterion("id_hosoDK is null");
            return (Criteria) this;
        }

        public Criteria andIdHosodkIsNotNull() {
            addCriterion("id_hosoDK is not null");
            return (Criteria) this;
        }

        public Criteria andIdHosodkEqualTo(String value) {
            addCriterion("id_hosoDK =", value, "idHosodk");
            return (Criteria) this;
        }

        public Criteria andIdHosodkNotEqualTo(String value) {
            addCriterion("id_hosoDK <>", value, "idHosodk");
            return (Criteria) this;
        }

        public Criteria andIdHosodkGreaterThan(String value) {
            addCriterion("id_hosoDK >", value, "idHosodk");
            return (Criteria) this;
        }

        public Criteria andIdHosodkGreaterThanOrEqualTo(String value) {
            addCriterion("id_hosoDK >=", value, "idHosodk");
            return (Criteria) this;
        }

        public Criteria andIdHosodkLessThan(String value) {
            addCriterion("id_hosoDK <", value, "idHosodk");
            return (Criteria) this;
        }

        public Criteria andIdHosodkLessThanOrEqualTo(String value) {
            addCriterion("id_hosoDK <=", value, "idHosodk");
            return (Criteria) this;
        }

        public Criteria andIdHosodkLike(String value) {
            addCriterion("id_hosoDK like", value, "idHosodk");
            return (Criteria) this;
        }

        public Criteria andIdHosodkNotLike(String value) {
            addCriterion("id_hosoDK not like", value, "idHosodk");
            return (Criteria) this;
        }

        public Criteria andIdHosodkIn(List<String> values) {
            addCriterion("id_hosoDK in", values, "idHosodk");
            return (Criteria) this;
        }

        public Criteria andIdHosodkNotIn(List<String> values) {
            addCriterion("id_hosoDK not in", values, "idHosodk");
            return (Criteria) this;
        }

        public Criteria andIdHosodkBetween(String value1, String value2) {
            addCriterion("id_hosoDK between", value1, value2, "idHosodk");
            return (Criteria) this;
        }

        public Criteria andIdHosodkNotBetween(String value1, String value2) {
            addCriterion("id_hosoDK not between", value1, value2, "idHosodk");
            return (Criteria) this;
        }

        public Criteria andMotaIsNull() {
            addCriterion("mota is null");
            return (Criteria) this;
        }

        public Criteria andMotaIsNotNull() {
            addCriterion("mota is not null");
            return (Criteria) this;
        }

        public Criteria andMotaEqualTo(String value) {
            addCriterion("mota =", value, "mota");
            return (Criteria) this;
        }

        public Criteria andMotaNotEqualTo(String value) {
            addCriterion("mota <>", value, "mota");
            return (Criteria) this;
        }

        public Criteria andMotaGreaterThan(String value) {
            addCriterion("mota >", value, "mota");
            return (Criteria) this;
        }

        public Criteria andMotaGreaterThanOrEqualTo(String value) {
            addCriterion("mota >=", value, "mota");
            return (Criteria) this;
        }

        public Criteria andMotaLessThan(String value) {
            addCriterion("mota <", value, "mota");
            return (Criteria) this;
        }

        public Criteria andMotaLessThanOrEqualTo(String value) {
            addCriterion("mota <=", value, "mota");
            return (Criteria) this;
        }

        public Criteria andMotaLike(String value) {
            addCriterion("mota like", value, "mota");
            return (Criteria) this;
        }

        public Criteria andMotaNotLike(String value) {
            addCriterion("mota not like", value, "mota");
            return (Criteria) this;
        }

        public Criteria andMotaIn(List<String> values) {
            addCriterion("mota in", values, "mota");
            return (Criteria) this;
        }

        public Criteria andMotaNotIn(List<String> values) {
            addCriterion("mota not in", values, "mota");
            return (Criteria) this;
        }

        public Criteria andMotaBetween(String value1, String value2) {
            addCriterion("mota between", value1, value2, "mota");
            return (Criteria) this;
        }

        public Criteria andMotaNotBetween(String value1, String value2) {
            addCriterion("mota not between", value1, value2, "mota");
            return (Criteria) this;
        }

        public Criteria andNgaynopIsNull() {
            addCriterion("ngaynop is null");
            return (Criteria) this;
        }

        public Criteria andNgaynopIsNotNull() {
            addCriterion("ngaynop is not null");
            return (Criteria) this;
        }

        public Criteria andNgaynopEqualTo(Date value) {
            addCriterion("ngaynop =", value, "ngaynop");
            return (Criteria) this;
        }

        public Criteria andNgaynopNotEqualTo(Date value) {
            addCriterion("ngaynop <>", value, "ngaynop");
            return (Criteria) this;
        }

        public Criteria andNgaynopGreaterThan(Date value) {
            addCriterion("ngaynop >", value, "ngaynop");
            return (Criteria) this;
        }

        public Criteria andNgaynopGreaterThanOrEqualTo(Date value) {
            addCriterion("ngaynop >=", value, "ngaynop");
            return (Criteria) this;
        }

        public Criteria andNgaynopLessThan(Date value) {
            addCriterion("ngaynop <", value, "ngaynop");
            return (Criteria) this;
        }

        public Criteria andNgaynopLessThanOrEqualTo(Date value) {
            addCriterion("ngaynop <=", value, "ngaynop");
            return (Criteria) this;
        }

        public Criteria andNgaynopIn(List<Date> values) {
            addCriterion("ngaynop in", values, "ngaynop");
            return (Criteria) this;
        }

        public Criteria andNgaynopNotIn(List<Date> values) {
            addCriterion("ngaynop not in", values, "ngaynop");
            return (Criteria) this;
        }

        public Criteria andNgaynopBetween(Date value1, Date value2) {
            addCriterion("ngaynop between", value1, value2, "ngaynop");
            return (Criteria) this;
        }

        public Criteria andNgaynopNotBetween(Date value1, Date value2) {
            addCriterion("ngaynop not between", value1, value2, "ngaynop");
            return (Criteria) this;
        }

        public Criteria andNgaybatdauIsNull() {
            addCriterion("ngaybatdau is null");
            return (Criteria) this;
        }

        public Criteria andNgaybatdauIsNotNull() {
            addCriterion("ngaybatdau is not null");
            return (Criteria) this;
        }

        public Criteria andNgaybatdauEqualTo(Date value) {
            addCriterionForJDBCDate("ngaybatdau =", value, "ngaybatdau");
            return (Criteria) this;
        }

        public Criteria andNgaybatdauNotEqualTo(Date value) {
            addCriterionForJDBCDate("ngaybatdau <>", value, "ngaybatdau");
            return (Criteria) this;
        }

        public Criteria andNgaybatdauGreaterThan(Date value) {
            addCriterionForJDBCDate("ngaybatdau >", value, "ngaybatdau");
            return (Criteria) this;
        }

        public Criteria andNgaybatdauGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ngaybatdau >=", value, "ngaybatdau");
            return (Criteria) this;
        }

        public Criteria andNgaybatdauLessThan(Date value) {
            addCriterionForJDBCDate("ngaybatdau <", value, "ngaybatdau");
            return (Criteria) this;
        }

        public Criteria andNgaybatdauLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ngaybatdau <=", value, "ngaybatdau");
            return (Criteria) this;
        }

        public Criteria andNgaybatdauIn(List<Date> values) {
            addCriterionForJDBCDate("ngaybatdau in", values, "ngaybatdau");
            return (Criteria) this;
        }

        public Criteria andNgaybatdauNotIn(List<Date> values) {
            addCriterionForJDBCDate("ngaybatdau not in", values, "ngaybatdau");
            return (Criteria) this;
        }

        public Criteria andNgaybatdauBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ngaybatdau between", value1, value2, "ngaybatdau");
            return (Criteria) this;
        }

        public Criteria andNgaybatdauNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ngaybatdau not between", value1, value2, "ngaybatdau");
            return (Criteria) this;
        }

        public Criteria andNgaykethucIsNull() {
            addCriterion("ngaykethuc is null");
            return (Criteria) this;
        }

        public Criteria andNgaykethucIsNotNull() {
            addCriterion("ngaykethuc is not null");
            return (Criteria) this;
        }

        public Criteria andNgaykethucEqualTo(Date value) {
            addCriterionForJDBCDate("ngaykethuc =", value, "ngaykethuc");
            return (Criteria) this;
        }

        public Criteria andNgaykethucNotEqualTo(Date value) {
            addCriterionForJDBCDate("ngaykethuc <>", value, "ngaykethuc");
            return (Criteria) this;
        }

        public Criteria andNgaykethucGreaterThan(Date value) {
            addCriterionForJDBCDate("ngaykethuc >", value, "ngaykethuc");
            return (Criteria) this;
        }

        public Criteria andNgaykethucGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ngaykethuc >=", value, "ngaykethuc");
            return (Criteria) this;
        }

        public Criteria andNgaykethucLessThan(Date value) {
            addCriterionForJDBCDate("ngaykethuc <", value, "ngaykethuc");
            return (Criteria) this;
        }

        public Criteria andNgaykethucLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ngaykethuc <=", value, "ngaykethuc");
            return (Criteria) this;
        }

        public Criteria andNgaykethucIn(List<Date> values) {
            addCriterionForJDBCDate("ngaykethuc in", values, "ngaykethuc");
            return (Criteria) this;
        }

        public Criteria andNgaykethucNotIn(List<Date> values) {
            addCriterionForJDBCDate("ngaykethuc not in", values, "ngaykethuc");
            return (Criteria) this;
        }

        public Criteria andNgaykethucBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ngaykethuc between", value1, value2, "ngaykethuc");
            return (Criteria) this;
        }

        public Criteria andNgaykethucNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ngaykethuc not between", value1, value2, "ngaykethuc");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
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