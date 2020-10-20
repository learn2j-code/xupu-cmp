package com.chhtf.cmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TraineeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraineeInfoExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTraineeNameIsNull() {
            addCriterion("trainee_name is null");
            return (Criteria) this;
        }

        public Criteria andTraineeNameIsNotNull() {
            addCriterion("trainee_name is not null");
            return (Criteria) this;
        }

        public Criteria andTraineeNameEqualTo(String value) {
            addCriterion("trainee_name =", value, "traineeName");
            return (Criteria) this;
        }

        public Criteria andTraineeNameNotEqualTo(String value) {
            addCriterion("trainee_name <>", value, "traineeName");
            return (Criteria) this;
        }

        public Criteria andTraineeNameGreaterThan(String value) {
            addCriterion("trainee_name >", value, "traineeName");
            return (Criteria) this;
        }

        public Criteria andTraineeNameGreaterThanOrEqualTo(String value) {
            addCriterion("trainee_name >=", value, "traineeName");
            return (Criteria) this;
        }

        public Criteria andTraineeNameLessThan(String value) {
            addCriterion("trainee_name <", value, "traineeName");
            return (Criteria) this;
        }

        public Criteria andTraineeNameLessThanOrEqualTo(String value) {
            addCriterion("trainee_name <=", value, "traineeName");
            return (Criteria) this;
        }

        public Criteria andTraineeNameLike(String value) {
            addCriterion("trainee_name like", value, "traineeName");
            return (Criteria) this;
        }

        public Criteria andTraineeNameNotLike(String value) {
            addCriterion("trainee_name not like", value, "traineeName");
            return (Criteria) this;
        }

        public Criteria andTraineeNameIn(List<String> values) {
            addCriterion("trainee_name in", values, "traineeName");
            return (Criteria) this;
        }

        public Criteria andTraineeNameNotIn(List<String> values) {
            addCriterion("trainee_name not in", values, "traineeName");
            return (Criteria) this;
        }

        public Criteria andTraineeNameBetween(String value1, String value2) {
            addCriterion("trainee_name between", value1, value2, "traineeName");
            return (Criteria) this;
        }

        public Criteria andTraineeNameNotBetween(String value1, String value2) {
            addCriterion("trainee_name not between", value1, value2, "traineeName");
            return (Criteria) this;
        }

        public Criteria andTraineeTypeIsNull() {
            addCriterion("trainee_type is null");
            return (Criteria) this;
        }

        public Criteria andTraineeTypeIsNotNull() {
            addCriterion("trainee_type is not null");
            return (Criteria) this;
        }

        public Criteria andTraineeTypeEqualTo(Integer value) {
            addCriterion("trainee_type =", value, "traineeType");
            return (Criteria) this;
        }

        public Criteria andTraineeTypeNotEqualTo(Integer value) {
            addCriterion("trainee_type <>", value, "traineeType");
            return (Criteria) this;
        }

        public Criteria andTraineeTypeGreaterThan(Integer value) {
            addCriterion("trainee_type >", value, "traineeType");
            return (Criteria) this;
        }

        public Criteria andTraineeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("trainee_type >=", value, "traineeType");
            return (Criteria) this;
        }

        public Criteria andTraineeTypeLessThan(Integer value) {
            addCriterion("trainee_type <", value, "traineeType");
            return (Criteria) this;
        }

        public Criteria andTraineeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("trainee_type <=", value, "traineeType");
            return (Criteria) this;
        }

        public Criteria andTraineeTypeIn(List<Integer> values) {
            addCriterion("trainee_type in", values, "traineeType");
            return (Criteria) this;
        }

        public Criteria andTraineeTypeNotIn(List<Integer> values) {
            addCriterion("trainee_type not in", values, "traineeType");
            return (Criteria) this;
        }

        public Criteria andTraineeTypeBetween(Integer value1, Integer value2) {
            addCriterion("trainee_type between", value1, value2, "traineeType");
            return (Criteria) this;
        }

        public Criteria andTraineeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("trainee_type not between", value1, value2, "traineeType");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIsNull() {
            addCriterion("agency_id is null");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIsNotNull() {
            addCriterion("agency_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyIdEqualTo(Integer value) {
            addCriterion("agency_id =", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotEqualTo(Integer value) {
            addCriterion("agency_id <>", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThan(Integer value) {
            addCriterion("agency_id >", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("agency_id >=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThan(Integer value) {
            addCriterion("agency_id <", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdLessThanOrEqualTo(Integer value) {
            addCriterion("agency_id <=", value, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdIn(List<Integer> values) {
            addCriterion("agency_id in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotIn(List<Integer> values) {
            addCriterion("agency_id not in", values, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdBetween(Integer value1, Integer value2) {
            addCriterion("agency_id between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andAgencyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("agency_id not between", value1, value2, "agencyId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNull() {
            addCriterion("employee_id is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIsNotNull() {
            addCriterion("employee_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdEqualTo(Integer value) {
            addCriterion("employee_id =", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotEqualTo(Integer value) {
            addCriterion("employee_id <>", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThan(Integer value) {
            addCriterion("employee_id >", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("employee_id >=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThan(Integer value) {
            addCriterion("employee_id <", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdLessThanOrEqualTo(Integer value) {
            addCriterion("employee_id <=", value, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdIn(List<Integer> values) {
            addCriterion("employee_id in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotIn(List<Integer> values) {
            addCriterion("employee_id not in", values, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdBetween(Integer value1, Integer value2) {
            addCriterion("employee_id between", value1, value2, "employeeId");
            return (Criteria) this;
        }

        public Criteria andEmployeeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("employee_id not between", value1, value2, "employeeId");
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