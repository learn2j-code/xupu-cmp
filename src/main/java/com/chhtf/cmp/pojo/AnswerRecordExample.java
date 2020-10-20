package com.chhtf.cmp.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnswerRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnswerRecordExample() {
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNull() {
            addCriterion("paper_id is null");
            return (Criteria) this;
        }

        public Criteria andPaperIdIsNotNull() {
            addCriterion("paper_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaperIdEqualTo(Integer value) {
            addCriterion("paper_id =", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotEqualTo(Integer value) {
            addCriterion("paper_id <>", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThan(Integer value) {
            addCriterion("paper_id >", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("paper_id >=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThan(Integer value) {
            addCriterion("paper_id <", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdLessThanOrEqualTo(Integer value) {
            addCriterion("paper_id <=", value, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdIn(List<Integer> values) {
            addCriterion("paper_id in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotIn(List<Integer> values) {
            addCriterion("paper_id not in", values, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdBetween(Integer value1, Integer value2) {
            addCriterion("paper_id between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("paper_id not between", value1, value2, "paperId");
            return (Criteria) this;
        }

        public Criteria andPaperNameIsNull() {
            addCriterion("paper_name is null");
            return (Criteria) this;
        }

        public Criteria andPaperNameIsNotNull() {
            addCriterion("paper_name is not null");
            return (Criteria) this;
        }

        public Criteria andPaperNameEqualTo(String value) {
            addCriterion("paper_name =", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotEqualTo(String value) {
            addCriterion("paper_name <>", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThan(String value) {
            addCriterion("paper_name >", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameGreaterThanOrEqualTo(String value) {
            addCriterion("paper_name >=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThan(String value) {
            addCriterion("paper_name <", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLessThanOrEqualTo(String value) {
            addCriterion("paper_name <=", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameLike(String value) {
            addCriterion("paper_name like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotLike(String value) {
            addCriterion("paper_name not like", value, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameIn(List<String> values) {
            addCriterion("paper_name in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotIn(List<String> values) {
            addCriterion("paper_name not in", values, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameBetween(String value1, String value2) {
            addCriterion("paper_name between", value1, value2, "paperName");
            return (Criteria) this;
        }

        public Criteria andPaperNameNotBetween(String value1, String value2) {
            addCriterion("paper_name not between", value1, value2, "paperName");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeIsNull() {
            addCriterion("answer_time is null");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeIsNotNull() {
            addCriterion("answer_time is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeEqualTo(String value) {
            addCriterion("answer_time =", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotEqualTo(String value) {
            addCriterion("answer_time <>", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeGreaterThan(String value) {
            addCriterion("answer_time >", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeGreaterThanOrEqualTo(String value) {
            addCriterion("answer_time >=", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeLessThan(String value) {
            addCriterion("answer_time <", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeLessThanOrEqualTo(String value) {
            addCriterion("answer_time <=", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeLike(String value) {
            addCriterion("answer_time like", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotLike(String value) {
            addCriterion("answer_time not like", value, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeIn(List<String> values) {
            addCriterion("answer_time in", values, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotIn(List<String> values) {
            addCriterion("answer_time not in", values, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeBetween(String value1, String value2) {
            addCriterion("answer_time between", value1, value2, "answerTime");
            return (Criteria) this;
        }

        public Criteria andAnswerTimeNotBetween(String value1, String value2) {
            addCriterion("answer_time not between", value1, value2, "answerTime");
            return (Criteria) this;
        }

        public Criteria andGetPointsIsNull() {
            addCriterion("get_points is null");
            return (Criteria) this;
        }

        public Criteria andGetPointsIsNotNull() {
            addCriterion("get_points is not null");
            return (Criteria) this;
        }

        public Criteria andGetPointsEqualTo(BigDecimal value) {
            addCriterion("get_points =", value, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGetPointsNotEqualTo(BigDecimal value) {
            addCriterion("get_points <>", value, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGetPointsGreaterThan(BigDecimal value) {
            addCriterion("get_points >", value, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGetPointsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("get_points >=", value, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGetPointsLessThan(BigDecimal value) {
            addCriterion("get_points <", value, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGetPointsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("get_points <=", value, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGetPointsIn(List<BigDecimal> values) {
            addCriterion("get_points in", values, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGetPointsNotIn(List<BigDecimal> values) {
            addCriterion("get_points not in", values, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGetPointsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("get_points between", value1, value2, "getPoints");
            return (Criteria) this;
        }

        public Criteria andGetPointsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("get_points not between", value1, value2, "getPoints");
            return (Criteria) this;
        }

        public Criteria andRightNumIsNull() {
            addCriterion("right_num is null");
            return (Criteria) this;
        }

        public Criteria andRightNumIsNotNull() {
            addCriterion("right_num is not null");
            return (Criteria) this;
        }

        public Criteria andRightNumEqualTo(Integer value) {
            addCriterion("right_num =", value, "rightNum");
            return (Criteria) this;
        }

        public Criteria andRightNumNotEqualTo(Integer value) {
            addCriterion("right_num <>", value, "rightNum");
            return (Criteria) this;
        }

        public Criteria andRightNumGreaterThan(Integer value) {
            addCriterion("right_num >", value, "rightNum");
            return (Criteria) this;
        }

        public Criteria andRightNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("right_num >=", value, "rightNum");
            return (Criteria) this;
        }

        public Criteria andRightNumLessThan(Integer value) {
            addCriterion("right_num <", value, "rightNum");
            return (Criteria) this;
        }

        public Criteria andRightNumLessThanOrEqualTo(Integer value) {
            addCriterion("right_num <=", value, "rightNum");
            return (Criteria) this;
        }

        public Criteria andRightNumIn(List<Integer> values) {
            addCriterion("right_num in", values, "rightNum");
            return (Criteria) this;
        }

        public Criteria andRightNumNotIn(List<Integer> values) {
            addCriterion("right_num not in", values, "rightNum");
            return (Criteria) this;
        }

        public Criteria andRightNumBetween(Integer value1, Integer value2) {
            addCriterion("right_num between", value1, value2, "rightNum");
            return (Criteria) this;
        }

        public Criteria andRightNumNotBetween(Integer value1, Integer value2) {
            addCriterion("right_num not between", value1, value2, "rightNum");
            return (Criteria) this;
        }

        public Criteria andWrongNumIsNull() {
            addCriterion("wrong_num is null");
            return (Criteria) this;
        }

        public Criteria andWrongNumIsNotNull() {
            addCriterion("wrong_num is not null");
            return (Criteria) this;
        }

        public Criteria andWrongNumEqualTo(Integer value) {
            addCriterion("wrong_num =", value, "wrongNum");
            return (Criteria) this;
        }

        public Criteria andWrongNumNotEqualTo(Integer value) {
            addCriterion("wrong_num <>", value, "wrongNum");
            return (Criteria) this;
        }

        public Criteria andWrongNumGreaterThan(Integer value) {
            addCriterion("wrong_num >", value, "wrongNum");
            return (Criteria) this;
        }

        public Criteria andWrongNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("wrong_num >=", value, "wrongNum");
            return (Criteria) this;
        }

        public Criteria andWrongNumLessThan(Integer value) {
            addCriterion("wrong_num <", value, "wrongNum");
            return (Criteria) this;
        }

        public Criteria andWrongNumLessThanOrEqualTo(Integer value) {
            addCriterion("wrong_num <=", value, "wrongNum");
            return (Criteria) this;
        }

        public Criteria andWrongNumIn(List<Integer> values) {
            addCriterion("wrong_num in", values, "wrongNum");
            return (Criteria) this;
        }

        public Criteria andWrongNumNotIn(List<Integer> values) {
            addCriterion("wrong_num not in", values, "wrongNum");
            return (Criteria) this;
        }

        public Criteria andWrongNumBetween(Integer value1, Integer value2) {
            addCriterion("wrong_num between", value1, value2, "wrongNum");
            return (Criteria) this;
        }

        public Criteria andWrongNumNotBetween(Integer value1, Integer value2) {
            addCriterion("wrong_num not between", value1, value2, "wrongNum");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeIsNull() {
            addCriterion("cumulative_time is null");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeIsNotNull() {
            addCriterion("cumulative_time is not null");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeEqualTo(BigDecimal value) {
            addCriterion("cumulative_time =", value, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeNotEqualTo(BigDecimal value) {
            addCriterion("cumulative_time <>", value, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeGreaterThan(BigDecimal value) {
            addCriterion("cumulative_time >", value, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cumulative_time >=", value, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeLessThan(BigDecimal value) {
            addCriterion("cumulative_time <", value, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cumulative_time <=", value, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeIn(List<BigDecimal> values) {
            addCriterion("cumulative_time in", values, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeNotIn(List<BigDecimal> values) {
            addCriterion("cumulative_time not in", values, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cumulative_time between", value1, value2, "cumulativeTime");
            return (Criteria) this;
        }

        public Criteria andCumulativeTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cumulative_time not between", value1, value2, "cumulativeTime");
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