package com.chhtf.cmp.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QuestionBankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionBankExample() {
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

        public Criteria andPointsIsNull() {
            addCriterion("points is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("points is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(String value) {
            addCriterion("points =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(String value) {
            addCriterion("points <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(String value) {
            addCriterion("points >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(String value) {
            addCriterion("points >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(String value) {
            addCriterion("points <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(String value) {
            addCriterion("points <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLike(String value) {
            addCriterion("points like", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotLike(String value) {
            addCriterion("points not like", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<String> values) {
            addCriterion("points in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<String> values) {
            addCriterion("points not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(String value1, String value2) {
            addCriterion("points between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(String value1, String value2) {
            addCriterion("points not between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNull() {
            addCriterion("entity_id is null");
            return (Criteria) this;
        }

        public Criteria andEntityIdIsNotNull() {
            addCriterion("entity_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntityIdEqualTo(Integer value) {
            addCriterion("entity_id =", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotEqualTo(Integer value) {
            addCriterion("entity_id <>", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThan(Integer value) {
            addCriterion("entity_id >", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("entity_id >=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThan(Integer value) {
            addCriterion("entity_id <", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdLessThanOrEqualTo(Integer value) {
            addCriterion("entity_id <=", value, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdIn(List<Integer> values) {
            addCriterion("entity_id in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotIn(List<Integer> values) {
            addCriterion("entity_id not in", values, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdBetween(Integer value1, Integer value2) {
            addCriterion("entity_id between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("entity_id not between", value1, value2, "entityId");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNull() {
            addCriterion("entity_type is null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNotNull() {
            addCriterion("entity_type is not null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeEqualTo(Integer value) {
            addCriterion("entity_type =", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotEqualTo(Integer value) {
            addCriterion("entity_type <>", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThan(Integer value) {
            addCriterion("entity_type >", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("entity_type >=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThan(Integer value) {
            addCriterion("entity_type <", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThanOrEqualTo(Integer value) {
            addCriterion("entity_type <=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIn(List<Integer> values) {
            addCriterion("entity_type in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotIn(List<Integer> values) {
            addCriterion("entity_type not in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeBetween(Integer value1, Integer value2) {
            addCriterion("entity_type between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("entity_type not between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andTempWorknameIsNull() {
            addCriterion("temp_workname is null");
            return (Criteria) this;
        }

        public Criteria andTempWorknameIsNotNull() {
            addCriterion("temp_workname is not null");
            return (Criteria) this;
        }

        public Criteria andTempWorknameEqualTo(String value) {
            addCriterion("temp_workname =", value, "tempWorkname");
            return (Criteria) this;
        }

        public Criteria andTempWorknameNotEqualTo(String value) {
            addCriterion("temp_workname <>", value, "tempWorkname");
            return (Criteria) this;
        }

        public Criteria andTempWorknameGreaterThan(String value) {
            addCriterion("temp_workname >", value, "tempWorkname");
            return (Criteria) this;
        }

        public Criteria andTempWorknameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_workname >=", value, "tempWorkname");
            return (Criteria) this;
        }

        public Criteria andTempWorknameLessThan(String value) {
            addCriterion("temp_workname <", value, "tempWorkname");
            return (Criteria) this;
        }

        public Criteria andTempWorknameLessThanOrEqualTo(String value) {
            addCriterion("temp_workname <=", value, "tempWorkname");
            return (Criteria) this;
        }

        public Criteria andTempWorknameLike(String value) {
            addCriterion("temp_workname like", value, "tempWorkname");
            return (Criteria) this;
        }

        public Criteria andTempWorknameNotLike(String value) {
            addCriterion("temp_workname not like", value, "tempWorkname");
            return (Criteria) this;
        }

        public Criteria andTempWorknameIn(List<String> values) {
            addCriterion("temp_workname in", values, "tempWorkname");
            return (Criteria) this;
        }

        public Criteria andTempWorknameNotIn(List<String> values) {
            addCriterion("temp_workname not in", values, "tempWorkname");
            return (Criteria) this;
        }

        public Criteria andTempWorknameBetween(String value1, String value2) {
            addCriterion("temp_workname between", value1, value2, "tempWorkname");
            return (Criteria) this;
        }

        public Criteria andTempWorknameNotBetween(String value1, String value2) {
            addCriterion("temp_workname not between", value1, value2, "tempWorkname");
            return (Criteria) this;
        }

        public Criteria andQuestionStemIsNull() {
            addCriterion("question_stem is null");
            return (Criteria) this;
        }

        public Criteria andQuestionStemIsNotNull() {
            addCriterion("question_stem is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionStemEqualTo(String value) {
            addCriterion("question_stem =", value, "questionStem");
            return (Criteria) this;
        }

        public Criteria andQuestionStemNotEqualTo(String value) {
            addCriterion("question_stem <>", value, "questionStem");
            return (Criteria) this;
        }

        public Criteria andQuestionStemGreaterThan(String value) {
            addCriterion("question_stem >", value, "questionStem");
            return (Criteria) this;
        }

        public Criteria andQuestionStemGreaterThanOrEqualTo(String value) {
            addCriterion("question_stem >=", value, "questionStem");
            return (Criteria) this;
        }

        public Criteria andQuestionStemLessThan(String value) {
            addCriterion("question_stem <", value, "questionStem");
            return (Criteria) this;
        }

        public Criteria andQuestionStemLessThanOrEqualTo(String value) {
            addCriterion("question_stem <=", value, "questionStem");
            return (Criteria) this;
        }

        public Criteria andQuestionStemLike(String value) {
            addCriterion("question_stem like", value, "questionStem");
            return (Criteria) this;
        }

        public Criteria andQuestionStemNotLike(String value) {
            addCriterion("question_stem not like", value, "questionStem");
            return (Criteria) this;
        }

        public Criteria andQuestionStemIn(List<String> values) {
            addCriterion("question_stem in", values, "questionStem");
            return (Criteria) this;
        }

        public Criteria andQuestionStemNotIn(List<String> values) {
            addCriterion("question_stem not in", values, "questionStem");
            return (Criteria) this;
        }

        public Criteria andQuestionStemBetween(String value1, String value2) {
            addCriterion("question_stem between", value1, value2, "questionStem");
            return (Criteria) this;
        }

        public Criteria andQuestionStemNotBetween(String value1, String value2) {
            addCriterion("question_stem not between", value1, value2, "questionStem");
            return (Criteria) this;
        }

        public Criteria andResolutionIsNull() {
            addCriterion("resolution is null");
            return (Criteria) this;
        }

        public Criteria andResolutionIsNotNull() {
            addCriterion("resolution is not null");
            return (Criteria) this;
        }

        public Criteria andResolutionEqualTo(String value) {
            addCriterion("resolution =", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionNotEqualTo(String value) {
            addCriterion("resolution <>", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionGreaterThan(String value) {
            addCriterion("resolution >", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionGreaterThanOrEqualTo(String value) {
            addCriterion("resolution >=", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionLessThan(String value) {
            addCriterion("resolution <", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionLessThanOrEqualTo(String value) {
            addCriterion("resolution <=", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionLike(String value) {
            addCriterion("resolution like", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionNotLike(String value) {
            addCriterion("resolution not like", value, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionIn(List<String> values) {
            addCriterion("resolution in", values, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionNotIn(List<String> values) {
            addCriterion("resolution not in", values, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionBetween(String value1, String value2) {
            addCriterion("resolution between", value1, value2, "resolution");
            return (Criteria) this;
        }

        public Criteria andResolutionNotBetween(String value1, String value2) {
            addCriterion("resolution not between", value1, value2, "resolution");
            return (Criteria) this;
        }

        public Criteria andPointValueIsNull() {
            addCriterion("point_value is null");
            return (Criteria) this;
        }

        public Criteria andPointValueIsNotNull() {
            addCriterion("point_value is not null");
            return (Criteria) this;
        }

        public Criteria andPointValueEqualTo(BigDecimal value) {
            addCriterion("point_value =", value, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueNotEqualTo(BigDecimal value) {
            addCriterion("point_value <>", value, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueGreaterThan(BigDecimal value) {
            addCriterion("point_value >", value, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("point_value >=", value, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueLessThan(BigDecimal value) {
            addCriterion("point_value <", value, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("point_value <=", value, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueIn(List<BigDecimal> values) {
            addCriterion("point_value in", values, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueNotIn(List<BigDecimal> values) {
            addCriterion("point_value not in", values, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("point_value between", value1, value2, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("point_value not between", value1, value2, "pointValue");
            return (Criteria) this;
        }

        public Criteria andRightAnswerIsNull() {
            addCriterion("right_answer is null");
            return (Criteria) this;
        }

        public Criteria andRightAnswerIsNotNull() {
            addCriterion("right_answer is not null");
            return (Criteria) this;
        }

        public Criteria andRightAnswerEqualTo(String value) {
            addCriterion("right_answer =", value, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerNotEqualTo(String value) {
            addCriterion("right_answer <>", value, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerGreaterThan(String value) {
            addCriterion("right_answer >", value, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("right_answer >=", value, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerLessThan(String value) {
            addCriterion("right_answer <", value, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerLessThanOrEqualTo(String value) {
            addCriterion("right_answer <=", value, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerLike(String value) {
            addCriterion("right_answer like", value, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerNotLike(String value) {
            addCriterion("right_answer not like", value, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerIn(List<String> values) {
            addCriterion("right_answer in", values, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerNotIn(List<String> values) {
            addCriterion("right_answer not in", values, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerBetween(String value1, String value2) {
            addCriterion("right_answer between", value1, value2, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andRightAnswerNotBetween(String value1, String value2) {
            addCriterion("right_answer not between", value1, value2, "rightAnswer");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNull() {
            addCriterion("question_type is null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIsNotNull() {
            addCriterion("question_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeEqualTo(Integer value) {
            addCriterion("question_type =", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotEqualTo(Integer value) {
            addCriterion("question_type <>", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThan(Integer value) {
            addCriterion("question_type >", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("question_type >=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThan(Integer value) {
            addCriterion("question_type <", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeLessThanOrEqualTo(Integer value) {
            addCriterion("question_type <=", value, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeIn(List<Integer> values) {
            addCriterion("question_type in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotIn(List<Integer> values) {
            addCriterion("question_type not in", values, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeBetween(Integer value1, Integer value2) {
            addCriterion("question_type between", value1, value2, "questionType");
            return (Criteria) this;
        }

        public Criteria andQuestionTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("question_type not between", value1, value2, "questionType");
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

        public Criteria andImageTypeIsNull() {
            addCriterion("image_type is null");
            return (Criteria) this;
        }

        public Criteria andImageTypeIsNotNull() {
            addCriterion("image_type is not null");
            return (Criteria) this;
        }

        public Criteria andImageTypeEqualTo(Integer value) {
            addCriterion("image_type =", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeNotEqualTo(Integer value) {
            addCriterion("image_type <>", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeGreaterThan(Integer value) {
            addCriterion("image_type >", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("image_type >=", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeLessThan(Integer value) {
            addCriterion("image_type <", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeLessThanOrEqualTo(Integer value) {
            addCriterion("image_type <=", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeIn(List<Integer> values) {
            addCriterion("image_type in", values, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeNotIn(List<Integer> values) {
            addCriterion("image_type not in", values, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeBetween(Integer value1, Integer value2) {
            addCriterion("image_type between", value1, value2, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("image_type not between", value1, value2, "imageType");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNull() {
            addCriterion("time_limit is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNotNull() {
            addCriterion("time_limit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEqualTo(String value) {
            addCriterion("time_limit =", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotEqualTo(String value) {
            addCriterion("time_limit <>", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThan(String value) {
            addCriterion("time_limit >", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThanOrEqualTo(String value) {
            addCriterion("time_limit >=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThan(String value) {
            addCriterion("time_limit <", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThanOrEqualTo(String value) {
            addCriterion("time_limit <=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLike(String value) {
            addCriterion("time_limit like", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotLike(String value) {
            addCriterion("time_limit not like", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIn(List<String> values) {
            addCriterion("time_limit in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotIn(List<String> values) {
            addCriterion("time_limit not in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitBetween(String value1, String value2) {
            addCriterion("time_limit between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotBetween(String value1, String value2) {
            addCriterion("time_limit not between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNull() {
            addCriterion("creater_id is null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIsNotNull() {
            addCriterion("creater_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreaterIdEqualTo(Integer value) {
            addCriterion("creater_id =", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotEqualTo(Integer value) {
            addCriterion("creater_id <>", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThan(Integer value) {
            addCriterion("creater_id >", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("creater_id >=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThan(Integer value) {
            addCriterion("creater_id <", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdLessThanOrEqualTo(Integer value) {
            addCriterion("creater_id <=", value, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdIn(List<Integer> values) {
            addCriterion("creater_id in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotIn(List<Integer> values) {
            addCriterion("creater_id not in", values, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdBetween(Integer value1, Integer value2) {
            addCriterion("creater_id between", value1, value2, "createrId");
            return (Criteria) this;
        }

        public Criteria andCreaterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("creater_id not between", value1, value2, "createrId");
            return (Criteria) this;
        }

        public Criteria andKnowledgeTypeIsNull() {
            addCriterion("knowledge_type is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeTypeIsNotNull() {
            addCriterion("knowledge_type is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeTypeEqualTo(Integer value) {
            addCriterion("knowledge_type =", value, "knowledgeType");
            return (Criteria) this;
        }

        public Criteria andKnowledgeTypeNotEqualTo(Integer value) {
            addCriterion("knowledge_type <>", value, "knowledgeType");
            return (Criteria) this;
        }

        public Criteria andKnowledgeTypeGreaterThan(Integer value) {
            addCriterion("knowledge_type >", value, "knowledgeType");
            return (Criteria) this;
        }

        public Criteria andKnowledgeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("knowledge_type >=", value, "knowledgeType");
            return (Criteria) this;
        }

        public Criteria andKnowledgeTypeLessThan(Integer value) {
            addCriterion("knowledge_type <", value, "knowledgeType");
            return (Criteria) this;
        }

        public Criteria andKnowledgeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("knowledge_type <=", value, "knowledgeType");
            return (Criteria) this;
        }

        public Criteria andKnowledgeTypeIn(List<Integer> values) {
            addCriterion("knowledge_type in", values, "knowledgeType");
            return (Criteria) this;
        }

        public Criteria andKnowledgeTypeNotIn(List<Integer> values) {
            addCriterion("knowledge_type not in", values, "knowledgeType");
            return (Criteria) this;
        }

        public Criteria andKnowledgeTypeBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_type between", value1, value2, "knowledgeType");
            return (Criteria) this;
        }

        public Criteria andKnowledgeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("knowledge_type not between", value1, value2, "knowledgeType");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIntroIsNull() {
            addCriterion("knowledge_intro is null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIntroIsNotNull() {
            addCriterion("knowledge_intro is not null");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIntroEqualTo(String value) {
            addCriterion("knowledge_intro =", value, "knowledgeIntro");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIntroNotEqualTo(String value) {
            addCriterion("knowledge_intro <>", value, "knowledgeIntro");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIntroGreaterThan(String value) {
            addCriterion("knowledge_intro >", value, "knowledgeIntro");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIntroGreaterThanOrEqualTo(String value) {
            addCriterion("knowledge_intro >=", value, "knowledgeIntro");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIntroLessThan(String value) {
            addCriterion("knowledge_intro <", value, "knowledgeIntro");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIntroLessThanOrEqualTo(String value) {
            addCriterion("knowledge_intro <=", value, "knowledgeIntro");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIntroLike(String value) {
            addCriterion("knowledge_intro like", value, "knowledgeIntro");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIntroNotLike(String value) {
            addCriterion("knowledge_intro not like", value, "knowledgeIntro");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIntroIn(List<String> values) {
            addCriterion("knowledge_intro in", values, "knowledgeIntro");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIntroNotIn(List<String> values) {
            addCriterion("knowledge_intro not in", values, "knowledgeIntro");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIntroBetween(String value1, String value2) {
            addCriterion("knowledge_intro between", value1, value2, "knowledgeIntro");
            return (Criteria) this;
        }

        public Criteria andKnowledgeIntroNotBetween(String value1, String value2) {
            addCriterion("knowledge_intro not between", value1, value2, "knowledgeIntro");
            return (Criteria) this;
        }

        public Criteria andChangeNumIsNull() {
            addCriterion("change_num is null");
            return (Criteria) this;
        }

        public Criteria andChangeNumIsNotNull() {
            addCriterion("change_num is not null");
            return (Criteria) this;
        }

        public Criteria andChangeNumEqualTo(Integer value) {
            addCriterion("change_num =", value, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumNotEqualTo(Integer value) {
            addCriterion("change_num <>", value, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumGreaterThan(Integer value) {
            addCriterion("change_num >", value, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_num >=", value, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumLessThan(Integer value) {
            addCriterion("change_num <", value, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumLessThanOrEqualTo(Integer value) {
            addCriterion("change_num <=", value, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumIn(List<Integer> values) {
            addCriterion("change_num in", values, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumNotIn(List<Integer> values) {
            addCriterion("change_num not in", values, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumBetween(Integer value1, Integer value2) {
            addCriterion("change_num between", value1, value2, "changeNum");
            return (Criteria) this;
        }

        public Criteria andChangeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("change_num not between", value1, value2, "changeNum");
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