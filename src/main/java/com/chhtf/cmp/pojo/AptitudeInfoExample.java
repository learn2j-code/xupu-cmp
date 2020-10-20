package com.chhtf.cmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AptitudeInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AptitudeInfoExample() {
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

        public Criteria andAptitudeNameIsNull() {
            addCriterion("aptitude_name is null");
            return (Criteria) this;
        }

        public Criteria andAptitudeNameIsNotNull() {
            addCriterion("aptitude_name is not null");
            return (Criteria) this;
        }

        public Criteria andAptitudeNameEqualTo(String value) {
            addCriterion("aptitude_name =", value, "aptitudeName");
            return (Criteria) this;
        }

        public Criteria andAptitudeNameNotEqualTo(String value) {
            addCriterion("aptitude_name <>", value, "aptitudeName");
            return (Criteria) this;
        }

        public Criteria andAptitudeNameGreaterThan(String value) {
            addCriterion("aptitude_name >", value, "aptitudeName");
            return (Criteria) this;
        }

        public Criteria andAptitudeNameGreaterThanOrEqualTo(String value) {
            addCriterion("aptitude_name >=", value, "aptitudeName");
            return (Criteria) this;
        }

        public Criteria andAptitudeNameLessThan(String value) {
            addCriterion("aptitude_name <", value, "aptitudeName");
            return (Criteria) this;
        }

        public Criteria andAptitudeNameLessThanOrEqualTo(String value) {
            addCriterion("aptitude_name <=", value, "aptitudeName");
            return (Criteria) this;
        }

        public Criteria andAptitudeNameLike(String value) {
            addCriterion("aptitude_name like", value, "aptitudeName");
            return (Criteria) this;
        }

        public Criteria andAptitudeNameNotLike(String value) {
            addCriterion("aptitude_name not like", value, "aptitudeName");
            return (Criteria) this;
        }

        public Criteria andAptitudeNameIn(List<String> values) {
            addCriterion("aptitude_name in", values, "aptitudeName");
            return (Criteria) this;
        }

        public Criteria andAptitudeNameNotIn(List<String> values) {
            addCriterion("aptitude_name not in", values, "aptitudeName");
            return (Criteria) this;
        }

        public Criteria andAptitudeNameBetween(String value1, String value2) {
            addCriterion("aptitude_name between", value1, value2, "aptitudeName");
            return (Criteria) this;
        }

        public Criteria andAptitudeNameNotBetween(String value1, String value2) {
            addCriterion("aptitude_name not between", value1, value2, "aptitudeName");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNull() {
            addCriterion("industry is null");
            return (Criteria) this;
        }

        public Criteria andIndustryIsNotNull() {
            addCriterion("industry is not null");
            return (Criteria) this;
        }

        public Criteria andIndustryEqualTo(String value) {
            addCriterion("industry =", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotEqualTo(String value) {
            addCriterion("industry <>", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThan(String value) {
            addCriterion("industry >", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("industry >=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThan(String value) {
            addCriterion("industry <", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLessThanOrEqualTo(String value) {
            addCriterion("industry <=", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryLike(String value) {
            addCriterion("industry like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotLike(String value) {
            addCriterion("industry not like", value, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryIn(List<String> values) {
            addCriterion("industry in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotIn(List<String> values) {
            addCriterion("industry not in", values, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryBetween(String value1, String value2) {
            addCriterion("industry between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andIndustryNotBetween(String value1, String value2) {
            addCriterion("industry not between", value1, value2, "industry");
            return (Criteria) this;
        }

        public Criteria andPolicyIntroIsNull() {
            addCriterion("policy_intro is null");
            return (Criteria) this;
        }

        public Criteria andPolicyIntroIsNotNull() {
            addCriterion("policy_intro is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyIntroEqualTo(String value) {
            addCriterion("policy_intro =", value, "policyIntro");
            return (Criteria) this;
        }

        public Criteria andPolicyIntroNotEqualTo(String value) {
            addCriterion("policy_intro <>", value, "policyIntro");
            return (Criteria) this;
        }

        public Criteria andPolicyIntroGreaterThan(String value) {
            addCriterion("policy_intro >", value, "policyIntro");
            return (Criteria) this;
        }

        public Criteria andPolicyIntroGreaterThanOrEqualTo(String value) {
            addCriterion("policy_intro >=", value, "policyIntro");
            return (Criteria) this;
        }

        public Criteria andPolicyIntroLessThan(String value) {
            addCriterion("policy_intro <", value, "policyIntro");
            return (Criteria) this;
        }

        public Criteria andPolicyIntroLessThanOrEqualTo(String value) {
            addCriterion("policy_intro <=", value, "policyIntro");
            return (Criteria) this;
        }

        public Criteria andPolicyIntroLike(String value) {
            addCriterion("policy_intro like", value, "policyIntro");
            return (Criteria) this;
        }

        public Criteria andPolicyIntroNotLike(String value) {
            addCriterion("policy_intro not like", value, "policyIntro");
            return (Criteria) this;
        }

        public Criteria andPolicyIntroIn(List<String> values) {
            addCriterion("policy_intro in", values, "policyIntro");
            return (Criteria) this;
        }

        public Criteria andPolicyIntroNotIn(List<String> values) {
            addCriterion("policy_intro not in", values, "policyIntro");
            return (Criteria) this;
        }

        public Criteria andPolicyIntroBetween(String value1, String value2) {
            addCriterion("policy_intro between", value1, value2, "policyIntro");
            return (Criteria) this;
        }

        public Criteria andPolicyIntroNotBetween(String value1, String value2) {
            addCriterion("policy_intro not between", value1, value2, "policyIntro");
            return (Criteria) this;
        }

        public Criteria andAreaCoverageIsNull() {
            addCriterion("area_coverage is null");
            return (Criteria) this;
        }

        public Criteria andAreaCoverageIsNotNull() {
            addCriterion("area_coverage is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCoverageEqualTo(String value) {
            addCriterion("area_coverage =", value, "areaCoverage");
            return (Criteria) this;
        }

        public Criteria andAreaCoverageNotEqualTo(String value) {
            addCriterion("area_coverage <>", value, "areaCoverage");
            return (Criteria) this;
        }

        public Criteria andAreaCoverageGreaterThan(String value) {
            addCriterion("area_coverage >", value, "areaCoverage");
            return (Criteria) this;
        }

        public Criteria andAreaCoverageGreaterThanOrEqualTo(String value) {
            addCriterion("area_coverage >=", value, "areaCoverage");
            return (Criteria) this;
        }

        public Criteria andAreaCoverageLessThan(String value) {
            addCriterion("area_coverage <", value, "areaCoverage");
            return (Criteria) this;
        }

        public Criteria andAreaCoverageLessThanOrEqualTo(String value) {
            addCriterion("area_coverage <=", value, "areaCoverage");
            return (Criteria) this;
        }

        public Criteria andAreaCoverageLike(String value) {
            addCriterion("area_coverage like", value, "areaCoverage");
            return (Criteria) this;
        }

        public Criteria andAreaCoverageNotLike(String value) {
            addCriterion("area_coverage not like", value, "areaCoverage");
            return (Criteria) this;
        }

        public Criteria andAreaCoverageIn(List<String> values) {
            addCriterion("area_coverage in", values, "areaCoverage");
            return (Criteria) this;
        }

        public Criteria andAreaCoverageNotIn(List<String> values) {
            addCriterion("area_coverage not in", values, "areaCoverage");
            return (Criteria) this;
        }

        public Criteria andAreaCoverageBetween(String value1, String value2) {
            addCriterion("area_coverage between", value1, value2, "areaCoverage");
            return (Criteria) this;
        }

        public Criteria andAreaCoverageNotBetween(String value1, String value2) {
            addCriterion("area_coverage not between", value1, value2, "areaCoverage");
            return (Criteria) this;
        }

        public Criteria andCompetentUnitIsNull() {
            addCriterion("competent_unit is null");
            return (Criteria) this;
        }

        public Criteria andCompetentUnitIsNotNull() {
            addCriterion("competent_unit is not null");
            return (Criteria) this;
        }

        public Criteria andCompetentUnitEqualTo(String value) {
            addCriterion("competent_unit =", value, "competentUnit");
            return (Criteria) this;
        }

        public Criteria andCompetentUnitNotEqualTo(String value) {
            addCriterion("competent_unit <>", value, "competentUnit");
            return (Criteria) this;
        }

        public Criteria andCompetentUnitGreaterThan(String value) {
            addCriterion("competent_unit >", value, "competentUnit");
            return (Criteria) this;
        }

        public Criteria andCompetentUnitGreaterThanOrEqualTo(String value) {
            addCriterion("competent_unit >=", value, "competentUnit");
            return (Criteria) this;
        }

        public Criteria andCompetentUnitLessThan(String value) {
            addCriterion("competent_unit <", value, "competentUnit");
            return (Criteria) this;
        }

        public Criteria andCompetentUnitLessThanOrEqualTo(String value) {
            addCriterion("competent_unit <=", value, "competentUnit");
            return (Criteria) this;
        }

        public Criteria andCompetentUnitLike(String value) {
            addCriterion("competent_unit like", value, "competentUnit");
            return (Criteria) this;
        }

        public Criteria andCompetentUnitNotLike(String value) {
            addCriterion("competent_unit not like", value, "competentUnit");
            return (Criteria) this;
        }

        public Criteria andCompetentUnitIn(List<String> values) {
            addCriterion("competent_unit in", values, "competentUnit");
            return (Criteria) this;
        }

        public Criteria andCompetentUnitNotIn(List<String> values) {
            addCriterion("competent_unit not in", values, "competentUnit");
            return (Criteria) this;
        }

        public Criteria andCompetentUnitBetween(String value1, String value2) {
            addCriterion("competent_unit between", value1, value2, "competentUnit");
            return (Criteria) this;
        }

        public Criteria andCompetentUnitNotBetween(String value1, String value2) {
            addCriterion("competent_unit not between", value1, value2, "competentUnit");
            return (Criteria) this;
        }

        public Criteria andOtherInfoIsNull() {
            addCriterion("other_info is null");
            return (Criteria) this;
        }

        public Criteria andOtherInfoIsNotNull() {
            addCriterion("other_info is not null");
            return (Criteria) this;
        }

        public Criteria andOtherInfoEqualTo(String value) {
            addCriterion("other_info =", value, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoNotEqualTo(String value) {
            addCriterion("other_info <>", value, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoGreaterThan(String value) {
            addCriterion("other_info >", value, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoGreaterThanOrEqualTo(String value) {
            addCriterion("other_info >=", value, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoLessThan(String value) {
            addCriterion("other_info <", value, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoLessThanOrEqualTo(String value) {
            addCriterion("other_info <=", value, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoLike(String value) {
            addCriterion("other_info like", value, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoNotLike(String value) {
            addCriterion("other_info not like", value, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoIn(List<String> values) {
            addCriterion("other_info in", values, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoNotIn(List<String> values) {
            addCriterion("other_info not in", values, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoBetween(String value1, String value2) {
            addCriterion("other_info between", value1, value2, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andOtherInfoNotBetween(String value1, String value2) {
            addCriterion("other_info not between", value1, value2, "otherInfo");
            return (Criteria) this;
        }

        public Criteria andNoQuestionIsNull() {
            addCriterion("no_question is null");
            return (Criteria) this;
        }

        public Criteria andNoQuestionIsNotNull() {
            addCriterion("no_question is not null");
            return (Criteria) this;
        }

        public Criteria andNoQuestionEqualTo(Integer value) {
            addCriterion("no_question =", value, "noQuestion");
            return (Criteria) this;
        }

        public Criteria andNoQuestionNotEqualTo(Integer value) {
            addCriterion("no_question <>", value, "noQuestion");
            return (Criteria) this;
        }

        public Criteria andNoQuestionGreaterThan(Integer value) {
            addCriterion("no_question >", value, "noQuestion");
            return (Criteria) this;
        }

        public Criteria andNoQuestionGreaterThanOrEqualTo(Integer value) {
            addCriterion("no_question >=", value, "noQuestion");
            return (Criteria) this;
        }

        public Criteria andNoQuestionLessThan(Integer value) {
            addCriterion("no_question <", value, "noQuestion");
            return (Criteria) this;
        }

        public Criteria andNoQuestionLessThanOrEqualTo(Integer value) {
            addCriterion("no_question <=", value, "noQuestion");
            return (Criteria) this;
        }

        public Criteria andNoQuestionIn(List<Integer> values) {
            addCriterion("no_question in", values, "noQuestion");
            return (Criteria) this;
        }

        public Criteria andNoQuestionNotIn(List<Integer> values) {
            addCriterion("no_question not in", values, "noQuestion");
            return (Criteria) this;
        }

        public Criteria andNoQuestionBetween(Integer value1, Integer value2) {
            addCriterion("no_question between", value1, value2, "noQuestion");
            return (Criteria) this;
        }

        public Criteria andNoQuestionNotBetween(Integer value1, Integer value2) {
            addCriterion("no_question not between", value1, value2, "noQuestion");
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

        public Criteria andTotalQuestionIsNull() {
            addCriterion("total_question is null");
            return (Criteria) this;
        }

        public Criteria andTotalQuestionIsNotNull() {
            addCriterion("total_question is not null");
            return (Criteria) this;
        }

        public Criteria andTotalQuestionEqualTo(Integer value) {
            addCriterion("total_question =", value, "totalQuestion");
            return (Criteria) this;
        }

        public Criteria andTotalQuestionNotEqualTo(Integer value) {
            addCriterion("total_question <>", value, "totalQuestion");
            return (Criteria) this;
        }

        public Criteria andTotalQuestionGreaterThan(Integer value) {
            addCriterion("total_question >", value, "totalQuestion");
            return (Criteria) this;
        }

        public Criteria andTotalQuestionGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_question >=", value, "totalQuestion");
            return (Criteria) this;
        }

        public Criteria andTotalQuestionLessThan(Integer value) {
            addCriterion("total_question <", value, "totalQuestion");
            return (Criteria) this;
        }

        public Criteria andTotalQuestionLessThanOrEqualTo(Integer value) {
            addCriterion("total_question <=", value, "totalQuestion");
            return (Criteria) this;
        }

        public Criteria andTotalQuestionIn(List<Integer> values) {
            addCriterion("total_question in", values, "totalQuestion");
            return (Criteria) this;
        }

        public Criteria andTotalQuestionNotIn(List<Integer> values) {
            addCriterion("total_question not in", values, "totalQuestion");
            return (Criteria) this;
        }

        public Criteria andTotalQuestionBetween(Integer value1, Integer value2) {
            addCriterion("total_question between", value1, value2, "totalQuestion");
            return (Criteria) this;
        }

        public Criteria andTotalQuestionNotBetween(Integer value1, Integer value2) {
            addCriterion("total_question not between", value1, value2, "totalQuestion");
            return (Criteria) this;
        }

        public Criteria andLowerLimitIsNull() {
            addCriterion("lower_limit is null");
            return (Criteria) this;
        }

        public Criteria andLowerLimitIsNotNull() {
            addCriterion("lower_limit is not null");
            return (Criteria) this;
        }

        public Criteria andLowerLimitEqualTo(Integer value) {
            addCriterion("lower_limit =", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitNotEqualTo(Integer value) {
            addCriterion("lower_limit <>", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitGreaterThan(Integer value) {
            addCriterion("lower_limit >", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("lower_limit >=", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitLessThan(Integer value) {
            addCriterion("lower_limit <", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitLessThanOrEqualTo(Integer value) {
            addCriterion("lower_limit <=", value, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitIn(List<Integer> values) {
            addCriterion("lower_limit in", values, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitNotIn(List<Integer> values) {
            addCriterion("lower_limit not in", values, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitBetween(Integer value1, Integer value2) {
            addCriterion("lower_limit between", value1, value2, "lowerLimit");
            return (Criteria) this;
        }

        public Criteria andLowerLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("lower_limit not between", value1, value2, "lowerLimit");
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