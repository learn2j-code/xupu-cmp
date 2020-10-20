package com.chhtf.cmp.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestApplicationExample() {
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

        public Criteria andCertificateIdIsNull() {
            addCriterion("certificate_id is null");
            return (Criteria) this;
        }

        public Criteria andCertificateIdIsNotNull() {
            addCriterion("certificate_id is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateIdEqualTo(Integer value) {
            addCriterion("certificate_id =", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdNotEqualTo(Integer value) {
            addCriterion("certificate_id <>", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdGreaterThan(Integer value) {
            addCriterion("certificate_id >", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("certificate_id >=", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdLessThan(Integer value) {
            addCriterion("certificate_id <", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdLessThanOrEqualTo(Integer value) {
            addCriterion("certificate_id <=", value, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdIn(List<Integer> values) {
            addCriterion("certificate_id in", values, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdNotIn(List<Integer> values) {
            addCriterion("certificate_id not in", values, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdBetween(Integer value1, Integer value2) {
            addCriterion("certificate_id between", value1, value2, "certificateId");
            return (Criteria) this;
        }

        public Criteria andCertificateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("certificate_id not between", value1, value2, "certificateId");
            return (Criteria) this;
        }

        public Criteria andTestApplicationTypeIsNull() {
            addCriterion("test_application_type is null");
            return (Criteria) this;
        }

        public Criteria andTestApplicationTypeIsNotNull() {
            addCriterion("test_application_type is not null");
            return (Criteria) this;
        }

        public Criteria andTestApplicationTypeEqualTo(Integer value) {
            addCriterion("test_application_type =", value, "testApplicationType");
            return (Criteria) this;
        }

        public Criteria andTestApplicationTypeNotEqualTo(Integer value) {
            addCriterion("test_application_type <>", value, "testApplicationType");
            return (Criteria) this;
        }

        public Criteria andTestApplicationTypeGreaterThan(Integer value) {
            addCriterion("test_application_type >", value, "testApplicationType");
            return (Criteria) this;
        }

        public Criteria andTestApplicationTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("test_application_type >=", value, "testApplicationType");
            return (Criteria) this;
        }

        public Criteria andTestApplicationTypeLessThan(Integer value) {
            addCriterion("test_application_type <", value, "testApplicationType");
            return (Criteria) this;
        }

        public Criteria andTestApplicationTypeLessThanOrEqualTo(Integer value) {
            addCriterion("test_application_type <=", value, "testApplicationType");
            return (Criteria) this;
        }

        public Criteria andTestApplicationTypeIn(List<Integer> values) {
            addCriterion("test_application_type in", values, "testApplicationType");
            return (Criteria) this;
        }

        public Criteria andTestApplicationTypeNotIn(List<Integer> values) {
            addCriterion("test_application_type not in", values, "testApplicationType");
            return (Criteria) this;
        }

        public Criteria andTestApplicationTypeBetween(Integer value1, Integer value2) {
            addCriterion("test_application_type between", value1, value2, "testApplicationType");
            return (Criteria) this;
        }

        public Criteria andTestApplicationTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("test_application_type not between", value1, value2, "testApplicationType");
            return (Criteria) this;
        }

        public Criteria andTraineeIdIsNull() {
            addCriterion("trainee_id is null");
            return (Criteria) this;
        }

        public Criteria andTraineeIdIsNotNull() {
            addCriterion("trainee_id is not null");
            return (Criteria) this;
        }

        public Criteria andTraineeIdEqualTo(Integer value) {
            addCriterion("trainee_id =", value, "traineeId");
            return (Criteria) this;
        }

        public Criteria andTraineeIdNotEqualTo(Integer value) {
            addCriterion("trainee_id <>", value, "traineeId");
            return (Criteria) this;
        }

        public Criteria andTraineeIdGreaterThan(Integer value) {
            addCriterion("trainee_id >", value, "traineeId");
            return (Criteria) this;
        }

        public Criteria andTraineeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trainee_id >=", value, "traineeId");
            return (Criteria) this;
        }

        public Criteria andTraineeIdLessThan(Integer value) {
            addCriterion("trainee_id <", value, "traineeId");
            return (Criteria) this;
        }

        public Criteria andTraineeIdLessThanOrEqualTo(Integer value) {
            addCriterion("trainee_id <=", value, "traineeId");
            return (Criteria) this;
        }

        public Criteria andTraineeIdIn(List<Integer> values) {
            addCriterion("trainee_id in", values, "traineeId");
            return (Criteria) this;
        }

        public Criteria andTraineeIdNotIn(List<Integer> values) {
            addCriterion("trainee_id not in", values, "traineeId");
            return (Criteria) this;
        }

        public Criteria andTraineeIdBetween(Integer value1, Integer value2) {
            addCriterion("trainee_id between", value1, value2, "traineeId");
            return (Criteria) this;
        }

        public Criteria andTraineeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trainee_id not between", value1, value2, "traineeId");
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

        public Criteria andGetCertificateWayIsNull() {
            addCriterion("get_certificate_way is null");
            return (Criteria) this;
        }

        public Criteria andGetCertificateWayIsNotNull() {
            addCriterion("get_certificate_way is not null");
            return (Criteria) this;
        }

        public Criteria andGetCertificateWayEqualTo(String value) {
            addCriterion("get_certificate_way =", value, "getCertificateWay");
            return (Criteria) this;
        }

        public Criteria andGetCertificateWayNotEqualTo(String value) {
            addCriterion("get_certificate_way <>", value, "getCertificateWay");
            return (Criteria) this;
        }

        public Criteria andGetCertificateWayGreaterThan(String value) {
            addCriterion("get_certificate_way >", value, "getCertificateWay");
            return (Criteria) this;
        }

        public Criteria andGetCertificateWayGreaterThanOrEqualTo(String value) {
            addCriterion("get_certificate_way >=", value, "getCertificateWay");
            return (Criteria) this;
        }

        public Criteria andGetCertificateWayLessThan(String value) {
            addCriterion("get_certificate_way <", value, "getCertificateWay");
            return (Criteria) this;
        }

        public Criteria andGetCertificateWayLessThanOrEqualTo(String value) {
            addCriterion("get_certificate_way <=", value, "getCertificateWay");
            return (Criteria) this;
        }

        public Criteria andGetCertificateWayLike(String value) {
            addCriterion("get_certificate_way like", value, "getCertificateWay");
            return (Criteria) this;
        }

        public Criteria andGetCertificateWayNotLike(String value) {
            addCriterion("get_certificate_way not like", value, "getCertificateWay");
            return (Criteria) this;
        }

        public Criteria andGetCertificateWayIn(List<String> values) {
            addCriterion("get_certificate_way in", values, "getCertificateWay");
            return (Criteria) this;
        }

        public Criteria andGetCertificateWayNotIn(List<String> values) {
            addCriterion("get_certificate_way not in", values, "getCertificateWay");
            return (Criteria) this;
        }

        public Criteria andGetCertificateWayBetween(String value1, String value2) {
            addCriterion("get_certificate_way between", value1, value2, "getCertificateWay");
            return (Criteria) this;
        }

        public Criteria andGetCertificateWayNotBetween(String value1, String value2) {
            addCriterion("get_certificate_way not between", value1, value2, "getCertificateWay");
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

        public Criteria andReferenceTimeIsNull() {
            addCriterion("reference_time is null");
            return (Criteria) this;
        }

        public Criteria andReferenceTimeIsNotNull() {
            addCriterion("reference_time is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceTimeEqualTo(String value) {
            addCriterion("reference_time =", value, "referenceTime");
            return (Criteria) this;
        }

        public Criteria andReferenceTimeNotEqualTo(String value) {
            addCriterion("reference_time <>", value, "referenceTime");
            return (Criteria) this;
        }

        public Criteria andReferenceTimeGreaterThan(String value) {
            addCriterion("reference_time >", value, "referenceTime");
            return (Criteria) this;
        }

        public Criteria andReferenceTimeGreaterThanOrEqualTo(String value) {
            addCriterion("reference_time >=", value, "referenceTime");
            return (Criteria) this;
        }

        public Criteria andReferenceTimeLessThan(String value) {
            addCriterion("reference_time <", value, "referenceTime");
            return (Criteria) this;
        }

        public Criteria andReferenceTimeLessThanOrEqualTo(String value) {
            addCriterion("reference_time <=", value, "referenceTime");
            return (Criteria) this;
        }

        public Criteria andReferenceTimeLike(String value) {
            addCriterion("reference_time like", value, "referenceTime");
            return (Criteria) this;
        }

        public Criteria andReferenceTimeNotLike(String value) {
            addCriterion("reference_time not like", value, "referenceTime");
            return (Criteria) this;
        }

        public Criteria andReferenceTimeIn(List<String> values) {
            addCriterion("reference_time in", values, "referenceTime");
            return (Criteria) this;
        }

        public Criteria andReferenceTimeNotIn(List<String> values) {
            addCriterion("reference_time not in", values, "referenceTime");
            return (Criteria) this;
        }

        public Criteria andReferenceTimeBetween(String value1, String value2) {
            addCriterion("reference_time between", value1, value2, "referenceTime");
            return (Criteria) this;
        }

        public Criteria andReferenceTimeNotBetween(String value1, String value2) {
            addCriterion("reference_time not between", value1, value2, "referenceTime");
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

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andAttachmentsIsNull() {
            addCriterion("attachments is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentsIsNotNull() {
            addCriterion("attachments is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentsEqualTo(String value) {
            addCriterion("attachments =", value, "attachments");
            return (Criteria) this;
        }

        public Criteria andAttachmentsNotEqualTo(String value) {
            addCriterion("attachments <>", value, "attachments");
            return (Criteria) this;
        }

        public Criteria andAttachmentsGreaterThan(String value) {
            addCriterion("attachments >", value, "attachments");
            return (Criteria) this;
        }

        public Criteria andAttachmentsGreaterThanOrEqualTo(String value) {
            addCriterion("attachments >=", value, "attachments");
            return (Criteria) this;
        }

        public Criteria andAttachmentsLessThan(String value) {
            addCriterion("attachments <", value, "attachments");
            return (Criteria) this;
        }

        public Criteria andAttachmentsLessThanOrEqualTo(String value) {
            addCriterion("attachments <=", value, "attachments");
            return (Criteria) this;
        }

        public Criteria andAttachmentsLike(String value) {
            addCriterion("attachments like", value, "attachments");
            return (Criteria) this;
        }

        public Criteria andAttachmentsNotLike(String value) {
            addCriterion("attachments not like", value, "attachments");
            return (Criteria) this;
        }

        public Criteria andAttachmentsIn(List<String> values) {
            addCriterion("attachments in", values, "attachments");
            return (Criteria) this;
        }

        public Criteria andAttachmentsNotIn(List<String> values) {
            addCriterion("attachments not in", values, "attachments");
            return (Criteria) this;
        }

        public Criteria andAttachmentsBetween(String value1, String value2) {
            addCriterion("attachments between", value1, value2, "attachments");
            return (Criteria) this;
        }

        public Criteria andAttachmentsNotBetween(String value1, String value2) {
            addCriterion("attachments not between", value1, value2, "attachments");
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

        public Criteria andTraineeEvaluateIsNull() {
            addCriterion("trainee_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andTraineeEvaluateIsNotNull() {
            addCriterion("trainee_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andTraineeEvaluateEqualTo(String value) {
            addCriterion("trainee_evaluate =", value, "traineeEvaluate");
            return (Criteria) this;
        }

        public Criteria andTraineeEvaluateNotEqualTo(String value) {
            addCriterion("trainee_evaluate <>", value, "traineeEvaluate");
            return (Criteria) this;
        }

        public Criteria andTraineeEvaluateGreaterThan(String value) {
            addCriterion("trainee_evaluate >", value, "traineeEvaluate");
            return (Criteria) this;
        }

        public Criteria andTraineeEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("trainee_evaluate >=", value, "traineeEvaluate");
            return (Criteria) this;
        }

        public Criteria andTraineeEvaluateLessThan(String value) {
            addCriterion("trainee_evaluate <", value, "traineeEvaluate");
            return (Criteria) this;
        }

        public Criteria andTraineeEvaluateLessThanOrEqualTo(String value) {
            addCriterion("trainee_evaluate <=", value, "traineeEvaluate");
            return (Criteria) this;
        }

        public Criteria andTraineeEvaluateLike(String value) {
            addCriterion("trainee_evaluate like", value, "traineeEvaluate");
            return (Criteria) this;
        }

        public Criteria andTraineeEvaluateNotLike(String value) {
            addCriterion("trainee_evaluate not like", value, "traineeEvaluate");
            return (Criteria) this;
        }

        public Criteria andTraineeEvaluateIn(List<String> values) {
            addCriterion("trainee_evaluate in", values, "traineeEvaluate");
            return (Criteria) this;
        }

        public Criteria andTraineeEvaluateNotIn(List<String> values) {
            addCriterion("trainee_evaluate not in", values, "traineeEvaluate");
            return (Criteria) this;
        }

        public Criteria andTraineeEvaluateBetween(String value1, String value2) {
            addCriterion("trainee_evaluate between", value1, value2, "traineeEvaluate");
            return (Criteria) this;
        }

        public Criteria andTraineeEvaluateNotBetween(String value1, String value2) {
            addCriterion("trainee_evaluate not between", value1, value2, "traineeEvaluate");
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

        public Criteria andTraineeCommentIsNull() {
            addCriterion("trainee_comment is null");
            return (Criteria) this;
        }

        public Criteria andTraineeCommentIsNotNull() {
            addCriterion("trainee_comment is not null");
            return (Criteria) this;
        }

        public Criteria andTraineeCommentEqualTo(String value) {
            addCriterion("trainee_comment =", value, "traineeComment");
            return (Criteria) this;
        }

        public Criteria andTraineeCommentNotEqualTo(String value) {
            addCriterion("trainee_comment <>", value, "traineeComment");
            return (Criteria) this;
        }

        public Criteria andTraineeCommentGreaterThan(String value) {
            addCriterion("trainee_comment >", value, "traineeComment");
            return (Criteria) this;
        }

        public Criteria andTraineeCommentGreaterThanOrEqualTo(String value) {
            addCriterion("trainee_comment >=", value, "traineeComment");
            return (Criteria) this;
        }

        public Criteria andTraineeCommentLessThan(String value) {
            addCriterion("trainee_comment <", value, "traineeComment");
            return (Criteria) this;
        }

        public Criteria andTraineeCommentLessThanOrEqualTo(String value) {
            addCriterion("trainee_comment <=", value, "traineeComment");
            return (Criteria) this;
        }

        public Criteria andTraineeCommentLike(String value) {
            addCriterion("trainee_comment like", value, "traineeComment");
            return (Criteria) this;
        }

        public Criteria andTraineeCommentNotLike(String value) {
            addCriterion("trainee_comment not like", value, "traineeComment");
            return (Criteria) this;
        }

        public Criteria andTraineeCommentIn(List<String> values) {
            addCriterion("trainee_comment in", values, "traineeComment");
            return (Criteria) this;
        }

        public Criteria andTraineeCommentNotIn(List<String> values) {
            addCriterion("trainee_comment not in", values, "traineeComment");
            return (Criteria) this;
        }

        public Criteria andTraineeCommentBetween(String value1, String value2) {
            addCriterion("trainee_comment between", value1, value2, "traineeComment");
            return (Criteria) this;
        }

        public Criteria andTraineeCommentNotBetween(String value1, String value2) {
            addCriterion("trainee_comment not between", value1, value2, "traineeComment");
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

        public Criteria andBeAllocateIsNull() {
            addCriterion("be_allocate is null");
            return (Criteria) this;
        }

        public Criteria andBeAllocateIsNotNull() {
            addCriterion("be_allocate is not null");
            return (Criteria) this;
        }

        public Criteria andBeAllocateEqualTo(Integer value) {
            addCriterion("be_allocate =", value, "beAllocate");
            return (Criteria) this;
        }

        public Criteria andBeAllocateNotEqualTo(Integer value) {
            addCriterion("be_allocate <>", value, "beAllocate");
            return (Criteria) this;
        }

        public Criteria andBeAllocateGreaterThan(Integer value) {
            addCriterion("be_allocate >", value, "beAllocate");
            return (Criteria) this;
        }

        public Criteria andBeAllocateGreaterThanOrEqualTo(Integer value) {
            addCriterion("be_allocate >=", value, "beAllocate");
            return (Criteria) this;
        }

        public Criteria andBeAllocateLessThan(Integer value) {
            addCriterion("be_allocate <", value, "beAllocate");
            return (Criteria) this;
        }

        public Criteria andBeAllocateLessThanOrEqualTo(Integer value) {
            addCriterion("be_allocate <=", value, "beAllocate");
            return (Criteria) this;
        }

        public Criteria andBeAllocateIn(List<Integer> values) {
            addCriterion("be_allocate in", values, "beAllocate");
            return (Criteria) this;
        }

        public Criteria andBeAllocateNotIn(List<Integer> values) {
            addCriterion("be_allocate not in", values, "beAllocate");
            return (Criteria) this;
        }

        public Criteria andBeAllocateBetween(Integer value1, Integer value2) {
            addCriterion("be_allocate between", value1, value2, "beAllocate");
            return (Criteria) this;
        }

        public Criteria andBeAllocateNotBetween(Integer value1, Integer value2) {
            addCriterion("be_allocate not between", value1, value2, "beAllocate");
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