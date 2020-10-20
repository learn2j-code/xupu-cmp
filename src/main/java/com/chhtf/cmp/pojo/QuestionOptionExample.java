package com.chhtf.cmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionOptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionOptionExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(Integer value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(Integer value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(Integer value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(Integer value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<Integer> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<Integer> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(Integer value1, Integer value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andOptionCodeIsNull() {
            addCriterion("option_code is null");
            return (Criteria) this;
        }

        public Criteria andOptionCodeIsNotNull() {
            addCriterion("option_code is not null");
            return (Criteria) this;
        }

        public Criteria andOptionCodeEqualTo(String value) {
            addCriterion("option_code =", value, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeNotEqualTo(String value) {
            addCriterion("option_code <>", value, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeGreaterThan(String value) {
            addCriterion("option_code >", value, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("option_code >=", value, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeLessThan(String value) {
            addCriterion("option_code <", value, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeLessThanOrEqualTo(String value) {
            addCriterion("option_code <=", value, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeLike(String value) {
            addCriterion("option_code like", value, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeNotLike(String value) {
            addCriterion("option_code not like", value, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeIn(List<String> values) {
            addCriterion("option_code in", values, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeNotIn(List<String> values) {
            addCriterion("option_code not in", values, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeBetween(String value1, String value2) {
            addCriterion("option_code between", value1, value2, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionCodeNotBetween(String value1, String value2) {
            addCriterion("option_code not between", value1, value2, "optionCode");
            return (Criteria) this;
        }

        public Criteria andOptionContentIsNull() {
            addCriterion("option_content is null");
            return (Criteria) this;
        }

        public Criteria andOptionContentIsNotNull() {
            addCriterion("option_content is not null");
            return (Criteria) this;
        }

        public Criteria andOptionContentEqualTo(String value) {
            addCriterion("option_content =", value, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentNotEqualTo(String value) {
            addCriterion("option_content <>", value, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentGreaterThan(String value) {
            addCriterion("option_content >", value, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentGreaterThanOrEqualTo(String value) {
            addCriterion("option_content >=", value, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentLessThan(String value) {
            addCriterion("option_content <", value, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentLessThanOrEqualTo(String value) {
            addCriterion("option_content <=", value, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentLike(String value) {
            addCriterion("option_content like", value, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentNotLike(String value) {
            addCriterion("option_content not like", value, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentIn(List<String> values) {
            addCriterion("option_content in", values, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentNotIn(List<String> values) {
            addCriterion("option_content not in", values, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentBetween(String value1, String value2) {
            addCriterion("option_content between", value1, value2, "optionContent");
            return (Criteria) this;
        }

        public Criteria andOptionContentNotBetween(String value1, String value2) {
            addCriterion("option_content not between", value1, value2, "optionContent");
            return (Criteria) this;
        }

        public Criteria andImageAddrIsNull() {
            addCriterion("image_addr is null");
            return (Criteria) this;
        }

        public Criteria andImageAddrIsNotNull() {
            addCriterion("image_addr is not null");
            return (Criteria) this;
        }

        public Criteria andImageAddrEqualTo(String value) {
            addCriterion("image_addr =", value, "imageAddr");
            return (Criteria) this;
        }

        public Criteria andImageAddrNotEqualTo(String value) {
            addCriterion("image_addr <>", value, "imageAddr");
            return (Criteria) this;
        }

        public Criteria andImageAddrGreaterThan(String value) {
            addCriterion("image_addr >", value, "imageAddr");
            return (Criteria) this;
        }

        public Criteria andImageAddrGreaterThanOrEqualTo(String value) {
            addCriterion("image_addr >=", value, "imageAddr");
            return (Criteria) this;
        }

        public Criteria andImageAddrLessThan(String value) {
            addCriterion("image_addr <", value, "imageAddr");
            return (Criteria) this;
        }

        public Criteria andImageAddrLessThanOrEqualTo(String value) {
            addCriterion("image_addr <=", value, "imageAddr");
            return (Criteria) this;
        }

        public Criteria andImageAddrLike(String value) {
            addCriterion("image_addr like", value, "imageAddr");
            return (Criteria) this;
        }

        public Criteria andImageAddrNotLike(String value) {
            addCriterion("image_addr not like", value, "imageAddr");
            return (Criteria) this;
        }

        public Criteria andImageAddrIn(List<String> values) {
            addCriterion("image_addr in", values, "imageAddr");
            return (Criteria) this;
        }

        public Criteria andImageAddrNotIn(List<String> values) {
            addCriterion("image_addr not in", values, "imageAddr");
            return (Criteria) this;
        }

        public Criteria andImageAddrBetween(String value1, String value2) {
            addCriterion("image_addr between", value1, value2, "imageAddr");
            return (Criteria) this;
        }

        public Criteria andImageAddrNotBetween(String value1, String value2) {
            addCriterion("image_addr not between", value1, value2, "imageAddr");
            return (Criteria) this;
        }

        public Criteria andStringFieldIsNull() {
            addCriterion("string_field is null");
            return (Criteria) this;
        }

        public Criteria andStringFieldIsNotNull() {
            addCriterion("string_field is not null");
            return (Criteria) this;
        }

        public Criteria andStringFieldEqualTo(String value) {
            addCriterion("string_field =", value, "stringField");
            return (Criteria) this;
        }

        public Criteria andStringFieldNotEqualTo(String value) {
            addCriterion("string_field <>", value, "stringField");
            return (Criteria) this;
        }

        public Criteria andStringFieldGreaterThan(String value) {
            addCriterion("string_field >", value, "stringField");
            return (Criteria) this;
        }

        public Criteria andStringFieldGreaterThanOrEqualTo(String value) {
            addCriterion("string_field >=", value, "stringField");
            return (Criteria) this;
        }

        public Criteria andStringFieldLessThan(String value) {
            addCriterion("string_field <", value, "stringField");
            return (Criteria) this;
        }

        public Criteria andStringFieldLessThanOrEqualTo(String value) {
            addCriterion("string_field <=", value, "stringField");
            return (Criteria) this;
        }

        public Criteria andStringFieldLike(String value) {
            addCriterion("string_field like", value, "stringField");
            return (Criteria) this;
        }

        public Criteria andStringFieldNotLike(String value) {
            addCriterion("string_field not like", value, "stringField");
            return (Criteria) this;
        }

        public Criteria andStringFieldIn(List<String> values) {
            addCriterion("string_field in", values, "stringField");
            return (Criteria) this;
        }

        public Criteria andStringFieldNotIn(List<String> values) {
            addCriterion("string_field not in", values, "stringField");
            return (Criteria) this;
        }

        public Criteria andStringFieldBetween(String value1, String value2) {
            addCriterion("string_field between", value1, value2, "stringField");
            return (Criteria) this;
        }

        public Criteria andStringFieldNotBetween(String value1, String value2) {
            addCriterion("string_field not between", value1, value2, "stringField");
            return (Criteria) this;
        }

        public Criteria andIntFieldIsNull() {
            addCriterion("int_field is null");
            return (Criteria) this;
        }

        public Criteria andIntFieldIsNotNull() {
            addCriterion("int_field is not null");
            return (Criteria) this;
        }

        public Criteria andIntFieldEqualTo(Integer value) {
            addCriterion("int_field =", value, "intField");
            return (Criteria) this;
        }

        public Criteria andIntFieldNotEqualTo(Integer value) {
            addCriterion("int_field <>", value, "intField");
            return (Criteria) this;
        }

        public Criteria andIntFieldGreaterThan(Integer value) {
            addCriterion("int_field >", value, "intField");
            return (Criteria) this;
        }

        public Criteria andIntFieldGreaterThanOrEqualTo(Integer value) {
            addCriterion("int_field >=", value, "intField");
            return (Criteria) this;
        }

        public Criteria andIntFieldLessThan(Integer value) {
            addCriterion("int_field <", value, "intField");
            return (Criteria) this;
        }

        public Criteria andIntFieldLessThanOrEqualTo(Integer value) {
            addCriterion("int_field <=", value, "intField");
            return (Criteria) this;
        }

        public Criteria andIntFieldIn(List<Integer> values) {
            addCriterion("int_field in", values, "intField");
            return (Criteria) this;
        }

        public Criteria andIntFieldNotIn(List<Integer> values) {
            addCriterion("int_field not in", values, "intField");
            return (Criteria) this;
        }

        public Criteria andIntFieldBetween(Integer value1, Integer value2) {
            addCriterion("int_field between", value1, value2, "intField");
            return (Criteria) this;
        }

        public Criteria andIntFieldNotBetween(Integer value1, Integer value2) {
            addCriterion("int_field not between", value1, value2, "intField");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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