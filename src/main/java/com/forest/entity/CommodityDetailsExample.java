package com.forest.entity;

import java.util.ArrayList;
import java.util.List;

public class CommodityDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityDetailsExample() {
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

        public Criteria andCdIdIsNull() {
            addCriterion("cd_id is null");
            return (Criteria) this;
        }

        public Criteria andCdIdIsNotNull() {
            addCriterion("cd_id is not null");
            return (Criteria) this;
        }

        public Criteria andCdIdEqualTo(Integer value) {
            addCriterion("cd_id =", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdNotEqualTo(Integer value) {
            addCriterion("cd_id <>", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdGreaterThan(Integer value) {
            addCriterion("cd_id >", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cd_id >=", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdLessThan(Integer value) {
            addCriterion("cd_id <", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdLessThanOrEqualTo(Integer value) {
            addCriterion("cd_id <=", value, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdIn(List<Integer> values) {
            addCriterion("cd_id in", values, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdNotIn(List<Integer> values) {
            addCriterion("cd_id not in", values, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdBetween(Integer value1, Integer value2) {
            addCriterion("cd_id between", value1, value2, "cdId");
            return (Criteria) this;
        }

        public Criteria andCdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cd_id not between", value1, value2, "cdId");
            return (Criteria) this;
        }

        public Criteria andCmIdIsNull() {
            addCriterion("cm_id is null");
            return (Criteria) this;
        }

        public Criteria andCmIdIsNotNull() {
            addCriterion("cm_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmIdEqualTo(Integer value) {
            addCriterion("cm_id =", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotEqualTo(Integer value) {
            addCriterion("cm_id <>", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThan(Integer value) {
            addCriterion("cm_id >", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cm_id >=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThan(Integer value) {
            addCriterion("cm_id <", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdLessThanOrEqualTo(Integer value) {
            addCriterion("cm_id <=", value, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdIn(List<Integer> values) {
            addCriterion("cm_id in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotIn(List<Integer> values) {
            addCriterion("cm_id not in", values, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdBetween(Integer value1, Integer value2) {
            addCriterion("cm_id between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andCmIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cm_id not between", value1, value2, "cmId");
            return (Criteria) this;
        }

        public Criteria andSizeIdIsNull() {
            addCriterion("size_id is null");
            return (Criteria) this;
        }

        public Criteria andSizeIdIsNotNull() {
            addCriterion("size_id is not null");
            return (Criteria) this;
        }

        public Criteria andSizeIdEqualTo(Integer value) {
            addCriterion("size_id =", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdNotEqualTo(Integer value) {
            addCriterion("size_id <>", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdGreaterThan(Integer value) {
            addCriterion("size_id >", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("size_id >=", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdLessThan(Integer value) {
            addCriterion("size_id <", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdLessThanOrEqualTo(Integer value) {
            addCriterion("size_id <=", value, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdIn(List<Integer> values) {
            addCriterion("size_id in", values, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdNotIn(List<Integer> values) {
            addCriterion("size_id not in", values, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdBetween(Integer value1, Integer value2) {
            addCriterion("size_id between", value1, value2, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("size_id not between", value1, value2, "sizeId");
            return (Criteria) this;
        }

        public Criteria andSizeNameIsNull() {
            addCriterion("size_name is null");
            return (Criteria) this;
        }

        public Criteria andSizeNameIsNotNull() {
            addCriterion("size_name is not null");
            return (Criteria) this;
        }

        public Criteria andSizeNameEqualTo(String value) {
            addCriterion("size_name =", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotEqualTo(String value) {
            addCriterion("size_name <>", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameGreaterThan(String value) {
            addCriterion("size_name >", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("size_name >=", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameLessThan(String value) {
            addCriterion("size_name <", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameLessThanOrEqualTo(String value) {
            addCriterion("size_name <=", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameLike(String value) {
            addCriterion("size_name like", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotLike(String value) {
            addCriterion("size_name not like", value, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameIn(List<String> values) {
            addCriterion("size_name in", values, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotIn(List<String> values) {
            addCriterion("size_name not in", values, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameBetween(String value1, String value2) {
            addCriterion("size_name between", value1, value2, "sizeName");
            return (Criteria) this;
        }

        public Criteria andSizeNameNotBetween(String value1, String value2) {
            addCriterion("size_name not between", value1, value2, "sizeName");
            return (Criteria) this;
        }

        public Criteria andColorIdIsNull() {
            addCriterion("color_id is null");
            return (Criteria) this;
        }

        public Criteria andColorIdIsNotNull() {
            addCriterion("color_id is not null");
            return (Criteria) this;
        }

        public Criteria andColorIdEqualTo(Integer value) {
            addCriterion("color_id =", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotEqualTo(Integer value) {
            addCriterion("color_id <>", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdGreaterThan(Integer value) {
            addCriterion("color_id >", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("color_id >=", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLessThan(Integer value) {
            addCriterion("color_id <", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdLessThanOrEqualTo(Integer value) {
            addCriterion("color_id <=", value, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdIn(List<Integer> values) {
            addCriterion("color_id in", values, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotIn(List<Integer> values) {
            addCriterion("color_id not in", values, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdBetween(Integer value1, Integer value2) {
            addCriterion("color_id between", value1, value2, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorIdNotBetween(Integer value1, Integer value2) {
            addCriterion("color_id not between", value1, value2, "colorId");
            return (Criteria) this;
        }

        public Criteria andColorNameIsNull() {
            addCriterion("color_name is null");
            return (Criteria) this;
        }

        public Criteria andColorNameIsNotNull() {
            addCriterion("color_name is not null");
            return (Criteria) this;
        }

        public Criteria andColorNameEqualTo(String value) {
            addCriterion("color_name =", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotEqualTo(String value) {
            addCriterion("color_name <>", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameGreaterThan(String value) {
            addCriterion("color_name >", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameGreaterThanOrEqualTo(String value) {
            addCriterion("color_name >=", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameLessThan(String value) {
            addCriterion("color_name <", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameLessThanOrEqualTo(String value) {
            addCriterion("color_name <=", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameLike(String value) {
            addCriterion("color_name like", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotLike(String value) {
            addCriterion("color_name not like", value, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameIn(List<String> values) {
            addCriterion("color_name in", values, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotIn(List<String> values) {
            addCriterion("color_name not in", values, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameBetween(String value1, String value2) {
            addCriterion("color_name between", value1, value2, "colorName");
            return (Criteria) this;
        }

        public Criteria andColorNameNotBetween(String value1, String value2) {
            addCriterion("color_name not between", value1, value2, "colorName");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Integer value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Integer value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Integer value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Integer value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Integer> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Integer> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Integer value1, Integer value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNull() {
            addCriterion("bar_code is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("bar_code =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("bar_code <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("bar_code >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bar_code >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("bar_code <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("bar_code <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("bar_code like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("bar_code not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("bar_code in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("bar_code not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("bar_code between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("bar_code not between", value1, value2, "barCode");
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