package com.chhtf.cmp.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeclareApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeclareApplicationExample() {
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

        public Criteria andAptitudeIdIsNull() {
            addCriterion("aptitude_id is null");
            return (Criteria) this;
        }

        public Criteria andAptitudeIdIsNotNull() {
            addCriterion("aptitude_id is not null");
            return (Criteria) this;
        }

        public Criteria andAptitudeIdEqualTo(Integer value) {
            addCriterion("aptitude_id =", value, "aptitudeId");
            return (Criteria) this;
        }

        public Criteria andAptitudeIdNotEqualTo(Integer value) {
            addCriterion("aptitude_id <>", value, "aptitudeId");
            return (Criteria) this;
        }

        public Criteria andAptitudeIdGreaterThan(Integer value) {
            addCriterion("aptitude_id >", value, "aptitudeId");
            return (Criteria) this;
        }

        public Criteria andAptitudeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aptitude_id >=", value, "aptitudeId");
            return (Criteria) this;
        }

        public Criteria andAptitudeIdLessThan(Integer value) {
            addCriterion("aptitude_id <", value, "aptitudeId");
            return (Criteria) this;
        }

        public Criteria andAptitudeIdLessThanOrEqualTo(Integer value) {
            addCriterion("aptitude_id <=", value, "aptitudeId");
            return (Criteria) this;
        }

        public Criteria andAptitudeIdIn(List<Integer> values) {
            addCriterion("aptitude_id in", values, "aptitudeId");
            return (Criteria) this;
        }

        public Criteria andAptitudeIdNotIn(List<Integer> values) {
            addCriterion("aptitude_id not in", values, "aptitudeId");
            return (Criteria) this;
        }

        public Criteria andAptitudeIdBetween(Integer value1, Integer value2) {
            addCriterion("aptitude_id between", value1, value2, "aptitudeId");
            return (Criteria) this;
        }

        public Criteria andAptitudeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aptitude_id not between", value1, value2, "aptitudeId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Integer value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Integer value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Integer value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Integer value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Integer> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Integer> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeIsNull() {
            addCriterion("application_time is null");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeIsNotNull() {
            addCriterion("application_time is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeEqualTo(String value) {
            addCriterion("application_time =", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotEqualTo(String value) {
            addCriterion("application_time <>", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeGreaterThan(String value) {
            addCriterion("application_time >", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeGreaterThanOrEqualTo(String value) {
            addCriterion("application_time >=", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeLessThan(String value) {
            addCriterion("application_time <", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeLessThanOrEqualTo(String value) {
            addCriterion("application_time <=", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeLike(String value) {
            addCriterion("application_time like", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotLike(String value) {
            addCriterion("application_time not like", value, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeIn(List<String> values) {
            addCriterion("application_time in", values, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotIn(List<String> values) {
            addCriterion("application_time not in", values, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeBetween(String value1, String value2) {
            addCriterion("application_time between", value1, value2, "applicationTime");
            return (Criteria) this;
        }

        public Criteria andApplicationTimeNotBetween(String value1, String value2) {
            addCriterion("application_time not between", value1, value2, "applicationTime");
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

        public Criteria andMerchandiserIdIsNull() {
            addCriterion("merchandiser_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdIsNotNull() {
            addCriterion("merchandiser_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdEqualTo(Integer value) {
            addCriterion("merchandiser_id =", value, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdNotEqualTo(Integer value) {
            addCriterion("merchandiser_id <>", value, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdGreaterThan(Integer value) {
            addCriterion("merchandiser_id >", value, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("merchandiser_id >=", value, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdLessThan(Integer value) {
            addCriterion("merchandiser_id <", value, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdLessThanOrEqualTo(Integer value) {
            addCriterion("merchandiser_id <=", value, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdIn(List<Integer> values) {
            addCriterion("merchandiser_id in", values, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdNotIn(List<Integer> values) {
            addCriterion("merchandiser_id not in", values, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdBetween(Integer value1, Integer value2) {
            addCriterion("merchandiser_id between", value1, value2, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andMerchandiserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("merchandiser_id not between", value1, value2, "merchandiserId");
            return (Criteria) this;
        }

        public Criteria andCurrentProgressIsNull() {
            addCriterion("current_progress is null");
            return (Criteria) this;
        }

        public Criteria andCurrentProgressIsNotNull() {
            addCriterion("current_progress is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentProgressEqualTo(Integer value) {
            addCriterion("current_progress =", value, "currentProgress");
            return (Criteria) this;
        }

        public Criteria andCurrentProgressNotEqualTo(Integer value) {
            addCriterion("current_progress <>", value, "currentProgress");
            return (Criteria) this;
        }

        public Criteria andCurrentProgressGreaterThan(Integer value) {
            addCriterion("current_progress >", value, "currentProgress");
            return (Criteria) this;
        }

        public Criteria andCurrentProgressGreaterThanOrEqualTo(Integer value) {
            addCriterion("current_progress >=", value, "currentProgress");
            return (Criteria) this;
        }

        public Criteria andCurrentProgressLessThan(Integer value) {
            addCriterion("current_progress <", value, "currentProgress");
            return (Criteria) this;
        }

        public Criteria andCurrentProgressLessThanOrEqualTo(Integer value) {
            addCriterion("current_progress <=", value, "currentProgress");
            return (Criteria) this;
        }

        public Criteria andCurrentProgressIn(List<Integer> values) {
            addCriterion("current_progress in", values, "currentProgress");
            return (Criteria) this;
        }

        public Criteria andCurrentProgressNotIn(List<Integer> values) {
            addCriterion("current_progress not in", values, "currentProgress");
            return (Criteria) this;
        }

        public Criteria andCurrentProgressBetween(Integer value1, Integer value2) {
            addCriterion("current_progress between", value1, value2, "currentProgress");
            return (Criteria) this;
        }

        public Criteria andCurrentProgressNotBetween(Integer value1, Integer value2) {
            addCriterion("current_progress not between", value1, value2, "currentProgress");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdsIsNull() {
            addCriterion("attachment_ids is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdsIsNotNull() {
            addCriterion("attachment_ids is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdsEqualTo(String value) {
            addCriterion("attachment_ids =", value, "attachmentIds");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdsNotEqualTo(String value) {
            addCriterion("attachment_ids <>", value, "attachmentIds");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdsGreaterThan(String value) {
            addCriterion("attachment_ids >", value, "attachmentIds");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdsGreaterThanOrEqualTo(String value) {
            addCriterion("attachment_ids >=", value, "attachmentIds");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdsLessThan(String value) {
            addCriterion("attachment_ids <", value, "attachmentIds");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdsLessThanOrEqualTo(String value) {
            addCriterion("attachment_ids <=", value, "attachmentIds");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdsLike(String value) {
            addCriterion("attachment_ids like", value, "attachmentIds");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdsNotLike(String value) {
            addCriterion("attachment_ids not like", value, "attachmentIds");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdsIn(List<String> values) {
            addCriterion("attachment_ids in", values, "attachmentIds");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdsNotIn(List<String> values) {
            addCriterion("attachment_ids not in", values, "attachmentIds");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdsBetween(String value1, String value2) {
            addCriterion("attachment_ids between", value1, value2, "attachmentIds");
            return (Criteria) this;
        }

        public Criteria andAttachmentIdsNotBetween(String value1, String value2) {
            addCriterion("attachment_ids not between", value1, value2, "attachmentIds");
            return (Criteria) this;
        }

        public Criteria andProgressIntroIsNull() {
            addCriterion("progress_intro is null");
            return (Criteria) this;
        }

        public Criteria andProgressIntroIsNotNull() {
            addCriterion("progress_intro is not null");
            return (Criteria) this;
        }

        public Criteria andProgressIntroEqualTo(String value) {
            addCriterion("progress_intro =", value, "progressIntro");
            return (Criteria) this;
        }

        public Criteria andProgressIntroNotEqualTo(String value) {
            addCriterion("progress_intro <>", value, "progressIntro");
            return (Criteria) this;
        }

        public Criteria andProgressIntroGreaterThan(String value) {
            addCriterion("progress_intro >", value, "progressIntro");
            return (Criteria) this;
        }

        public Criteria andProgressIntroGreaterThanOrEqualTo(String value) {
            addCriterion("progress_intro >=", value, "progressIntro");
            return (Criteria) this;
        }

        public Criteria andProgressIntroLessThan(String value) {
            addCriterion("progress_intro <", value, "progressIntro");
            return (Criteria) this;
        }

        public Criteria andProgressIntroLessThanOrEqualTo(String value) {
            addCriterion("progress_intro <=", value, "progressIntro");
            return (Criteria) this;
        }

        public Criteria andProgressIntroLike(String value) {
            addCriterion("progress_intro like", value, "progressIntro");
            return (Criteria) this;
        }

        public Criteria andProgressIntroNotLike(String value) {
            addCriterion("progress_intro not like", value, "progressIntro");
            return (Criteria) this;
        }

        public Criteria andProgressIntroIn(List<String> values) {
            addCriterion("progress_intro in", values, "progressIntro");
            return (Criteria) this;
        }

        public Criteria andProgressIntroNotIn(List<String> values) {
            addCriterion("progress_intro not in", values, "progressIntro");
            return (Criteria) this;
        }

        public Criteria andProgressIntroBetween(String value1, String value2) {
            addCriterion("progress_intro between", value1, value2, "progressIntro");
            return (Criteria) this;
        }

        public Criteria andProgressIntroNotBetween(String value1, String value2) {
            addCriterion("progress_intro not between", value1, value2, "progressIntro");
            return (Criteria) this;
        }

        public Criteria andGetWayIsNull() {
            addCriterion("get_way is null");
            return (Criteria) this;
        }

        public Criteria andGetWayIsNotNull() {
            addCriterion("get_way is not null");
            return (Criteria) this;
        }

        public Criteria andGetWayEqualTo(String value) {
            addCriterion("get_way =", value, "getWay");
            return (Criteria) this;
        }

        public Criteria andGetWayNotEqualTo(String value) {
            addCriterion("get_way <>", value, "getWay");
            return (Criteria) this;
        }

        public Criteria andGetWayGreaterThan(String value) {
            addCriterion("get_way >", value, "getWay");
            return (Criteria) this;
        }

        public Criteria andGetWayGreaterThanOrEqualTo(String value) {
            addCriterion("get_way >=", value, "getWay");
            return (Criteria) this;
        }

        public Criteria andGetWayLessThan(String value) {
            addCriterion("get_way <", value, "getWay");
            return (Criteria) this;
        }

        public Criteria andGetWayLessThanOrEqualTo(String value) {
            addCriterion("get_way <=", value, "getWay");
            return (Criteria) this;
        }

        public Criteria andGetWayLike(String value) {
            addCriterion("get_way like", value, "getWay");
            return (Criteria) this;
        }

        public Criteria andGetWayNotLike(String value) {
            addCriterion("get_way not like", value, "getWay");
            return (Criteria) this;
        }

        public Criteria andGetWayIn(List<String> values) {
            addCriterion("get_way in", values, "getWay");
            return (Criteria) this;
        }

        public Criteria andGetWayNotIn(List<String> values) {
            addCriterion("get_way not in", values, "getWay");
            return (Criteria) this;
        }

        public Criteria andGetWayBetween(String value1, String value2) {
            addCriterion("get_way between", value1, value2, "getWay");
            return (Criteria) this;
        }

        public Criteria andGetWayNotBetween(String value1, String value2) {
            addCriterion("get_way not between", value1, value2, "getWay");
            return (Criteria) this;
        }

        public Criteria andDeclareNumIsNull() {
            addCriterion("declare_num is null");
            return (Criteria) this;
        }

        public Criteria andDeclareNumIsNotNull() {
            addCriterion("declare_num is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareNumEqualTo(Integer value) {
            addCriterion("declare_num =", value, "declareNum");
            return (Criteria) this;
        }

        public Criteria andDeclareNumNotEqualTo(Integer value) {
            addCriterion("declare_num <>", value, "declareNum");
            return (Criteria) this;
        }

        public Criteria andDeclareNumGreaterThan(Integer value) {
            addCriterion("declare_num >", value, "declareNum");
            return (Criteria) this;
        }

        public Criteria andDeclareNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("declare_num >=", value, "declareNum");
            return (Criteria) this;
        }

        public Criteria andDeclareNumLessThan(Integer value) {
            addCriterion("declare_num <", value, "declareNum");
            return (Criteria) this;
        }

        public Criteria andDeclareNumLessThanOrEqualTo(Integer value) {
            addCriterion("declare_num <=", value, "declareNum");
            return (Criteria) this;
        }

        public Criteria andDeclareNumIn(List<Integer> values) {
            addCriterion("declare_num in", values, "declareNum");
            return (Criteria) this;
        }

        public Criteria andDeclareNumNotIn(List<Integer> values) {
            addCriterion("declare_num not in", values, "declareNum");
            return (Criteria) this;
        }

        public Criteria andDeclareNumBetween(Integer value1, Integer value2) {
            addCriterion("declare_num between", value1, value2, "declareNum");
            return (Criteria) this;
        }

        public Criteria andDeclareNumNotBetween(Integer value1, Integer value2) {
            addCriterion("declare_num not between", value1, value2, "declareNum");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNull() {
            addCriterion("service_fee is null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIsNotNull() {
            addCriterion("service_fee is not null");
            return (Criteria) this;
        }

        public Criteria andServiceFeeEqualTo(BigDecimal value) {
            addCriterion("service_fee =", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotEqualTo(BigDecimal value) {
            addCriterion("service_fee <>", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThan(BigDecimal value) {
            addCriterion("service_fee >", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("service_fee >=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThan(BigDecimal value) {
            addCriterion("service_fee <", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("service_fee <=", value, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeIn(List<BigDecimal> values) {
            addCriterion("service_fee in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotIn(List<BigDecimal> values) {
            addCriterion("service_fee not in", values, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_fee between", value1, value2, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andServiceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("service_fee not between", value1, value2, "serviceFee");
            return (Criteria) this;
        }

        public Criteria andExpectTimeIsNull() {
            addCriterion("expect_time is null");
            return (Criteria) this;
        }

        public Criteria andExpectTimeIsNotNull() {
            addCriterion("expect_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpectTimeEqualTo(String value) {
            addCriterion("expect_time =", value, "expectTime");
            return (Criteria) this;
        }

        public Criteria andExpectTimeNotEqualTo(String value) {
            addCriterion("expect_time <>", value, "expectTime");
            return (Criteria) this;
        }

        public Criteria andExpectTimeGreaterThan(String value) {
            addCriterion("expect_time >", value, "expectTime");
            return (Criteria) this;
        }

        public Criteria andExpectTimeGreaterThanOrEqualTo(String value) {
            addCriterion("expect_time >=", value, "expectTime");
            return (Criteria) this;
        }

        public Criteria andExpectTimeLessThan(String value) {
            addCriterion("expect_time <", value, "expectTime");
            return (Criteria) this;
        }

        public Criteria andExpectTimeLessThanOrEqualTo(String value) {
            addCriterion("expect_time <=", value, "expectTime");
            return (Criteria) this;
        }

        public Criteria andExpectTimeLike(String value) {
            addCriterion("expect_time like", value, "expectTime");
            return (Criteria) this;
        }

        public Criteria andExpectTimeNotLike(String value) {
            addCriterion("expect_time not like", value, "expectTime");
            return (Criteria) this;
        }

        public Criteria andExpectTimeIn(List<String> values) {
            addCriterion("expect_time in", values, "expectTime");
            return (Criteria) this;
        }

        public Criteria andExpectTimeNotIn(List<String> values) {
            addCriterion("expect_time not in", values, "expectTime");
            return (Criteria) this;
        }

        public Criteria andExpectTimeBetween(String value1, String value2) {
            addCriterion("expect_time between", value1, value2, "expectTime");
            return (Criteria) this;
        }

        public Criteria andExpectTimeNotBetween(String value1, String value2) {
            addCriterion("expect_time not between", value1, value2, "expectTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIsNull() {
            addCriterion("predict_time is null");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIsNotNull() {
            addCriterion("predict_time is not null");
            return (Criteria) this;
        }

        public Criteria andPredictTimeEqualTo(String value) {
            addCriterion("predict_time =", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotEqualTo(String value) {
            addCriterion("predict_time <>", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeGreaterThan(String value) {
            addCriterion("predict_time >", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeGreaterThanOrEqualTo(String value) {
            addCriterion("predict_time >=", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeLessThan(String value) {
            addCriterion("predict_time <", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeLessThanOrEqualTo(String value) {
            addCriterion("predict_time <=", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeLike(String value) {
            addCriterion("predict_time like", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotLike(String value) {
            addCriterion("predict_time not like", value, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeIn(List<String> values) {
            addCriterion("predict_time in", values, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotIn(List<String> values) {
            addCriterion("predict_time not in", values, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeBetween(String value1, String value2) {
            addCriterion("predict_time between", value1, value2, "predictTime");
            return (Criteria) this;
        }

        public Criteria andPredictTimeNotBetween(String value1, String value2) {
            addCriterion("predict_time not between", value1, value2, "predictTime");
            return (Criteria) this;
        }

        public Criteria andActualTimeIsNull() {
            addCriterion("actual_time is null");
            return (Criteria) this;
        }

        public Criteria andActualTimeIsNotNull() {
            addCriterion("actual_time is not null");
            return (Criteria) this;
        }

        public Criteria andActualTimeEqualTo(String value) {
            addCriterion("actual_time =", value, "actualTime");
            return (Criteria) this;
        }

        public Criteria andActualTimeNotEqualTo(String value) {
            addCriterion("actual_time <>", value, "actualTime");
            return (Criteria) this;
        }

        public Criteria andActualTimeGreaterThan(String value) {
            addCriterion("actual_time >", value, "actualTime");
            return (Criteria) this;
        }

        public Criteria andActualTimeGreaterThanOrEqualTo(String value) {
            addCriterion("actual_time >=", value, "actualTime");
            return (Criteria) this;
        }

        public Criteria andActualTimeLessThan(String value) {
            addCriterion("actual_time <", value, "actualTime");
            return (Criteria) this;
        }

        public Criteria andActualTimeLessThanOrEqualTo(String value) {
            addCriterion("actual_time <=", value, "actualTime");
            return (Criteria) this;
        }

        public Criteria andActualTimeLike(String value) {
            addCriterion("actual_time like", value, "actualTime");
            return (Criteria) this;
        }

        public Criteria andActualTimeNotLike(String value) {
            addCriterion("actual_time not like", value, "actualTime");
            return (Criteria) this;
        }

        public Criteria andActualTimeIn(List<String> values) {
            addCriterion("actual_time in", values, "actualTime");
            return (Criteria) this;
        }

        public Criteria andActualTimeNotIn(List<String> values) {
            addCriterion("actual_time not in", values, "actualTime");
            return (Criteria) this;
        }

        public Criteria andActualTimeBetween(String value1, String value2) {
            addCriterion("actual_time between", value1, value2, "actualTime");
            return (Criteria) this;
        }

        public Criteria andActualTimeNotBetween(String value1, String value2) {
            addCriterion("actual_time not between", value1, value2, "actualTime");
            return (Criteria) this;
        }

        public Criteria andCompanyEvaluateIsNull() {
            addCriterion("company_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andCompanyEvaluateIsNotNull() {
            addCriterion("company_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEvaluateEqualTo(String value) {
            addCriterion("company_evaluate =", value, "companyEvaluate");
            return (Criteria) this;
        }

        public Criteria andCompanyEvaluateNotEqualTo(String value) {
            addCriterion("company_evaluate <>", value, "companyEvaluate");
            return (Criteria) this;
        }

        public Criteria andCompanyEvaluateGreaterThan(String value) {
            addCriterion("company_evaluate >", value, "companyEvaluate");
            return (Criteria) this;
        }

        public Criteria andCompanyEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("company_evaluate >=", value, "companyEvaluate");
            return (Criteria) this;
        }

        public Criteria andCompanyEvaluateLessThan(String value) {
            addCriterion("company_evaluate <", value, "companyEvaluate");
            return (Criteria) this;
        }

        public Criteria andCompanyEvaluateLessThanOrEqualTo(String value) {
            addCriterion("company_evaluate <=", value, "companyEvaluate");
            return (Criteria) this;
        }

        public Criteria andCompanyEvaluateLike(String value) {
            addCriterion("company_evaluate like", value, "companyEvaluate");
            return (Criteria) this;
        }

        public Criteria andCompanyEvaluateNotLike(String value) {
            addCriterion("company_evaluate not like", value, "companyEvaluate");
            return (Criteria) this;
        }

        public Criteria andCompanyEvaluateIn(List<String> values) {
            addCriterion("company_evaluate in", values, "companyEvaluate");
            return (Criteria) this;
        }

        public Criteria andCompanyEvaluateNotIn(List<String> values) {
            addCriterion("company_evaluate not in", values, "companyEvaluate");
            return (Criteria) this;
        }

        public Criteria andCompanyEvaluateBetween(String value1, String value2) {
            addCriterion("company_evaluate between", value1, value2, "companyEvaluate");
            return (Criteria) this;
        }

        public Criteria andCompanyEvaluateNotBetween(String value1, String value2) {
            addCriterion("company_evaluate not between", value1, value2, "companyEvaluate");
            return (Criteria) this;
        }

        public Criteria andAgencyEvaluateIsNull() {
            addCriterion("agency_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andAgencyEvaluateIsNotNull() {
            addCriterion("agency_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyEvaluateEqualTo(String value) {
            addCriterion("agency_evaluate =", value, "agencyEvaluate");
            return (Criteria) this;
        }

        public Criteria andAgencyEvaluateNotEqualTo(String value) {
            addCriterion("agency_evaluate <>", value, "agencyEvaluate");
            return (Criteria) this;
        }

        public Criteria andAgencyEvaluateGreaterThan(String value) {
            addCriterion("agency_evaluate >", value, "agencyEvaluate");
            return (Criteria) this;
        }

        public Criteria andAgencyEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("agency_evaluate >=", value, "agencyEvaluate");
            return (Criteria) this;
        }

        public Criteria andAgencyEvaluateLessThan(String value) {
            addCriterion("agency_evaluate <", value, "agencyEvaluate");
            return (Criteria) this;
        }

        public Criteria andAgencyEvaluateLessThanOrEqualTo(String value) {
            addCriterion("agency_evaluate <=", value, "agencyEvaluate");
            return (Criteria) this;
        }

        public Criteria andAgencyEvaluateLike(String value) {
            addCriterion("agency_evaluate like", value, "agencyEvaluate");
            return (Criteria) this;
        }

        public Criteria andAgencyEvaluateNotLike(String value) {
            addCriterion("agency_evaluate not like", value, "agencyEvaluate");
            return (Criteria) this;
        }

        public Criteria andAgencyEvaluateIn(List<String> values) {
            addCriterion("agency_evaluate in", values, "agencyEvaluate");
            return (Criteria) this;
        }

        public Criteria andAgencyEvaluateNotIn(List<String> values) {
            addCriterion("agency_evaluate not in", values, "agencyEvaluate");
            return (Criteria) this;
        }

        public Criteria andAgencyEvaluateBetween(String value1, String value2) {
            addCriterion("agency_evaluate between", value1, value2, "agencyEvaluate");
            return (Criteria) this;
        }

        public Criteria andAgencyEvaluateNotBetween(String value1, String value2) {
            addCriterion("agency_evaluate not between", value1, value2, "agencyEvaluate");
            return (Criteria) this;
        }

        public Criteria andPlatformEvaluateIsNull() {
            addCriterion("platform_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andPlatformEvaluateIsNotNull() {
            addCriterion("platform_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEvaluateEqualTo(String value) {
            addCriterion("platform_evaluate =", value, "platformEvaluate");
            return (Criteria) this;
        }

        public Criteria andPlatformEvaluateNotEqualTo(String value) {
            addCriterion("platform_evaluate <>", value, "platformEvaluate");
            return (Criteria) this;
        }

        public Criteria andPlatformEvaluateGreaterThan(String value) {
            addCriterion("platform_evaluate >", value, "platformEvaluate");
            return (Criteria) this;
        }

        public Criteria andPlatformEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("platform_evaluate >=", value, "platformEvaluate");
            return (Criteria) this;
        }

        public Criteria andPlatformEvaluateLessThan(String value) {
            addCriterion("platform_evaluate <", value, "platformEvaluate");
            return (Criteria) this;
        }

        public Criteria andPlatformEvaluateLessThanOrEqualTo(String value) {
            addCriterion("platform_evaluate <=", value, "platformEvaluate");
            return (Criteria) this;
        }

        public Criteria andPlatformEvaluateLike(String value) {
            addCriterion("platform_evaluate like", value, "platformEvaluate");
            return (Criteria) this;
        }

        public Criteria andPlatformEvaluateNotLike(String value) {
            addCriterion("platform_evaluate not like", value, "platformEvaluate");
            return (Criteria) this;
        }

        public Criteria andPlatformEvaluateIn(List<String> values) {
            addCriterion("platform_evaluate in", values, "platformEvaluate");
            return (Criteria) this;
        }

        public Criteria andPlatformEvaluateNotIn(List<String> values) {
            addCriterion("platform_evaluate not in", values, "platformEvaluate");
            return (Criteria) this;
        }

        public Criteria andPlatformEvaluateBetween(String value1, String value2) {
            addCriterion("platform_evaluate between", value1, value2, "platformEvaluate");
            return (Criteria) this;
        }

        public Criteria andPlatformEvaluateNotBetween(String value1, String value2) {
            addCriterion("platform_evaluate not between", value1, value2, "platformEvaluate");
            return (Criteria) this;
        }

        public Criteria andCompanyCommentIsNull() {
            addCriterion("company_comment is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCommentIsNotNull() {
            addCriterion("company_comment is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCommentEqualTo(String value) {
            addCriterion("company_comment =", value, "companyComment");
            return (Criteria) this;
        }

        public Criteria andCompanyCommentNotEqualTo(String value) {
            addCriterion("company_comment <>", value, "companyComment");
            return (Criteria) this;
        }

        public Criteria andCompanyCommentGreaterThan(String value) {
            addCriterion("company_comment >", value, "companyComment");
            return (Criteria) this;
        }

        public Criteria andCompanyCommentGreaterThanOrEqualTo(String value) {
            addCriterion("company_comment >=", value, "companyComment");
            return (Criteria) this;
        }

        public Criteria andCompanyCommentLessThan(String value) {
            addCriterion("company_comment <", value, "companyComment");
            return (Criteria) this;
        }

        public Criteria andCompanyCommentLessThanOrEqualTo(String value) {
            addCriterion("company_comment <=", value, "companyComment");
            return (Criteria) this;
        }

        public Criteria andCompanyCommentLike(String value) {
            addCriterion("company_comment like", value, "companyComment");
            return (Criteria) this;
        }

        public Criteria andCompanyCommentNotLike(String value) {
            addCriterion("company_comment not like", value, "companyComment");
            return (Criteria) this;
        }

        public Criteria andCompanyCommentIn(List<String> values) {
            addCriterion("company_comment in", values, "companyComment");
            return (Criteria) this;
        }

        public Criteria andCompanyCommentNotIn(List<String> values) {
            addCriterion("company_comment not in", values, "companyComment");
            return (Criteria) this;
        }

        public Criteria andCompanyCommentBetween(String value1, String value2) {
            addCriterion("company_comment between", value1, value2, "companyComment");
            return (Criteria) this;
        }

        public Criteria andCompanyCommentNotBetween(String value1, String value2) {
            addCriterion("company_comment not between", value1, value2, "companyComment");
            return (Criteria) this;
        }

        public Criteria andAgencyCommentIsNull() {
            addCriterion("agency_comment is null");
            return (Criteria) this;
        }

        public Criteria andAgencyCommentIsNotNull() {
            addCriterion("agency_comment is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyCommentEqualTo(String value) {
            addCriterion("agency_comment =", value, "agencyComment");
            return (Criteria) this;
        }

        public Criteria andAgencyCommentNotEqualTo(String value) {
            addCriterion("agency_comment <>", value, "agencyComment");
            return (Criteria) this;
        }

        public Criteria andAgencyCommentGreaterThan(String value) {
            addCriterion("agency_comment >", value, "agencyComment");
            return (Criteria) this;
        }

        public Criteria andAgencyCommentGreaterThanOrEqualTo(String value) {
            addCriterion("agency_comment >=", value, "agencyComment");
            return (Criteria) this;
        }

        public Criteria andAgencyCommentLessThan(String value) {
            addCriterion("agency_comment <", value, "agencyComment");
            return (Criteria) this;
        }

        public Criteria andAgencyCommentLessThanOrEqualTo(String value) {
            addCriterion("agency_comment <=", value, "agencyComment");
            return (Criteria) this;
        }

        public Criteria andAgencyCommentLike(String value) {
            addCriterion("agency_comment like", value, "agencyComment");
            return (Criteria) this;
        }

        public Criteria andAgencyCommentNotLike(String value) {
            addCriterion("agency_comment not like", value, "agencyComment");
            return (Criteria) this;
        }

        public Criteria andAgencyCommentIn(List<String> values) {
            addCriterion("agency_comment in", values, "agencyComment");
            return (Criteria) this;
        }

        public Criteria andAgencyCommentNotIn(List<String> values) {
            addCriterion("agency_comment not in", values, "agencyComment");
            return (Criteria) this;
        }

        public Criteria andAgencyCommentBetween(String value1, String value2) {
            addCriterion("agency_comment between", value1, value2, "agencyComment");
            return (Criteria) this;
        }

        public Criteria andAgencyCommentNotBetween(String value1, String value2) {
            addCriterion("agency_comment not between", value1, value2, "agencyComment");
            return (Criteria) this;
        }

        public Criteria andPlatformCommentIsNull() {
            addCriterion("platform_comment is null");
            return (Criteria) this;
        }

        public Criteria andPlatformCommentIsNotNull() {
            addCriterion("platform_comment is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformCommentEqualTo(String value) {
            addCriterion("platform_comment =", value, "platformComment");
            return (Criteria) this;
        }

        public Criteria andPlatformCommentNotEqualTo(String value) {
            addCriterion("platform_comment <>", value, "platformComment");
            return (Criteria) this;
        }

        public Criteria andPlatformCommentGreaterThan(String value) {
            addCriterion("platform_comment >", value, "platformComment");
            return (Criteria) this;
        }

        public Criteria andPlatformCommentGreaterThanOrEqualTo(String value) {
            addCriterion("platform_comment >=", value, "platformComment");
            return (Criteria) this;
        }

        public Criteria andPlatformCommentLessThan(String value) {
            addCriterion("platform_comment <", value, "platformComment");
            return (Criteria) this;
        }

        public Criteria andPlatformCommentLessThanOrEqualTo(String value) {
            addCriterion("platform_comment <=", value, "platformComment");
            return (Criteria) this;
        }

        public Criteria andPlatformCommentLike(String value) {
            addCriterion("platform_comment like", value, "platformComment");
            return (Criteria) this;
        }

        public Criteria andPlatformCommentNotLike(String value) {
            addCriterion("platform_comment not like", value, "platformComment");
            return (Criteria) this;
        }

        public Criteria andPlatformCommentIn(List<String> values) {
            addCriterion("platform_comment in", values, "platformComment");
            return (Criteria) this;
        }

        public Criteria andPlatformCommentNotIn(List<String> values) {
            addCriterion("platform_comment not in", values, "platformComment");
            return (Criteria) this;
        }

        public Criteria andPlatformCommentBetween(String value1, String value2) {
            addCriterion("platform_comment between", value1, value2, "platformComment");
            return (Criteria) this;
        }

        public Criteria andPlatformCommentNotBetween(String value1, String value2) {
            addCriterion("platform_comment not between", value1, value2, "platformComment");
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