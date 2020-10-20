package com.chhtf.cmp.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CertificateInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CertificateInfoExample() {
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

        public Criteria andCertificateNameIsNull() {
            addCriterion("certificate_name is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNameIsNotNull() {
            addCriterion("certificate_name is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNameEqualTo(String value) {
            addCriterion("certificate_name =", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotEqualTo(String value) {
            addCriterion("certificate_name <>", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameGreaterThan(String value) {
            addCriterion("certificate_name >", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_name >=", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameLessThan(String value) {
            addCriterion("certificate_name <", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameLessThanOrEqualTo(String value) {
            addCriterion("certificate_name <=", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameLike(String value) {
            addCriterion("certificate_name like", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotLike(String value) {
            addCriterion("certificate_name not like", value, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameIn(List<String> values) {
            addCriterion("certificate_name in", values, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotIn(List<String> values) {
            addCriterion("certificate_name not in", values, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameBetween(String value1, String value2) {
            addCriterion("certificate_name between", value1, value2, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateNameNotBetween(String value1, String value2) {
            addCriterion("certificate_name not between", value1, value2, "certificateName");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNull() {
            addCriterion("certificate_type is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("certificate_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(String value) {
            addCriterion("certificate_type =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(String value) {
            addCriterion("certificate_type <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(String value) {
            addCriterion("certificate_type >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_type >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(String value) {
            addCriterion("certificate_type <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(String value) {
            addCriterion("certificate_type <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLike(String value) {
            addCriterion("certificate_type like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotLike(String value) {
            addCriterion("certificate_type not like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<String> values) {
            addCriterion("certificate_type in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<String> values) {
            addCriterion("certificate_type not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(String value1, String value2) {
            addCriterion("certificate_type between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(String value1, String value2) {
            addCriterion("certificate_type not between", value1, value2, "certificateType");
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

        public Criteria andBelongTypeIsNull() {
            addCriterion("belong_type is null");
            return (Criteria) this;
        }

        public Criteria andBelongTypeIsNotNull() {
            addCriterion("belong_type is not null");
            return (Criteria) this;
        }

        public Criteria andBelongTypeEqualTo(String value) {
            addCriterion("belong_type =", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeNotEqualTo(String value) {
            addCriterion("belong_type <>", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeGreaterThan(String value) {
            addCriterion("belong_type >", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeGreaterThanOrEqualTo(String value) {
            addCriterion("belong_type >=", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeLessThan(String value) {
            addCriterion("belong_type <", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeLessThanOrEqualTo(String value) {
            addCriterion("belong_type <=", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeLike(String value) {
            addCriterion("belong_type like", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeNotLike(String value) {
            addCriterion("belong_type not like", value, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeIn(List<String> values) {
            addCriterion("belong_type in", values, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeNotIn(List<String> values) {
            addCriterion("belong_type not in", values, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeBetween(String value1, String value2) {
            addCriterion("belong_type between", value1, value2, "belongType");
            return (Criteria) this;
        }

        public Criteria andBelongTypeNotBetween(String value1, String value2) {
            addCriterion("belong_type not between", value1, value2, "belongType");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthorityIsNull() {
            addCriterion("certification_authority is null");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthorityIsNotNull() {
            addCriterion("certification_authority is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthorityEqualTo(String value) {
            addCriterion("certification_authority =", value, "certificationAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthorityNotEqualTo(String value) {
            addCriterion("certification_authority <>", value, "certificationAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthorityGreaterThan(String value) {
            addCriterion("certification_authority >", value, "certificationAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthorityGreaterThanOrEqualTo(String value) {
            addCriterion("certification_authority >=", value, "certificationAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthorityLessThan(String value) {
            addCriterion("certification_authority <", value, "certificationAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthorityLessThanOrEqualTo(String value) {
            addCriterion("certification_authority <=", value, "certificationAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthorityLike(String value) {
            addCriterion("certification_authority like", value, "certificationAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthorityNotLike(String value) {
            addCriterion("certification_authority not like", value, "certificationAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthorityIn(List<String> values) {
            addCriterion("certification_authority in", values, "certificationAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthorityNotIn(List<String> values) {
            addCriterion("certification_authority not in", values, "certificationAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthorityBetween(String value1, String value2) {
            addCriterion("certification_authority between", value1, value2, "certificationAuthority");
            return (Criteria) this;
        }

        public Criteria andCertificationAuthorityNotBetween(String value1, String value2) {
            addCriterion("certification_authority not between", value1, value2, "certificationAuthority");
            return (Criteria) this;
        }

        public Criteria andExaminationTimeIsNull() {
            addCriterion("examination_time is null");
            return (Criteria) this;
        }

        public Criteria andExaminationTimeIsNotNull() {
            addCriterion("examination_time is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationTimeEqualTo(String value) {
            addCriterion("examination_time =", value, "examinationTime");
            return (Criteria) this;
        }

        public Criteria andExaminationTimeNotEqualTo(String value) {
            addCriterion("examination_time <>", value, "examinationTime");
            return (Criteria) this;
        }

        public Criteria andExaminationTimeGreaterThan(String value) {
            addCriterion("examination_time >", value, "examinationTime");
            return (Criteria) this;
        }

        public Criteria andExaminationTimeGreaterThanOrEqualTo(String value) {
            addCriterion("examination_time >=", value, "examinationTime");
            return (Criteria) this;
        }

        public Criteria andExaminationTimeLessThan(String value) {
            addCriterion("examination_time <", value, "examinationTime");
            return (Criteria) this;
        }

        public Criteria andExaminationTimeLessThanOrEqualTo(String value) {
            addCriterion("examination_time <=", value, "examinationTime");
            return (Criteria) this;
        }

        public Criteria andExaminationTimeLike(String value) {
            addCriterion("examination_time like", value, "examinationTime");
            return (Criteria) this;
        }

        public Criteria andExaminationTimeNotLike(String value) {
            addCriterion("examination_time not like", value, "examinationTime");
            return (Criteria) this;
        }

        public Criteria andExaminationTimeIn(List<String> values) {
            addCriterion("examination_time in", values, "examinationTime");
            return (Criteria) this;
        }

        public Criteria andExaminationTimeNotIn(List<String> values) {
            addCriterion("examination_time not in", values, "examinationTime");
            return (Criteria) this;
        }

        public Criteria andExaminationTimeBetween(String value1, String value2) {
            addCriterion("examination_time between", value1, value2, "examinationTime");
            return (Criteria) this;
        }

        public Criteria andExaminationTimeNotBetween(String value1, String value2) {
            addCriterion("examination_time not between", value1, value2, "examinationTime");
            return (Criteria) this;
        }

        public Criteria andExaminationIntroIsNull() {
            addCriterion("examination_intro is null");
            return (Criteria) this;
        }

        public Criteria andExaminationIntroIsNotNull() {
            addCriterion("examination_intro is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationIntroEqualTo(String value) {
            addCriterion("examination_intro =", value, "examinationIntro");
            return (Criteria) this;
        }

        public Criteria andExaminationIntroNotEqualTo(String value) {
            addCriterion("examination_intro <>", value, "examinationIntro");
            return (Criteria) this;
        }

        public Criteria andExaminationIntroGreaterThan(String value) {
            addCriterion("examination_intro >", value, "examinationIntro");
            return (Criteria) this;
        }

        public Criteria andExaminationIntroGreaterThanOrEqualTo(String value) {
            addCriterion("examination_intro >=", value, "examinationIntro");
            return (Criteria) this;
        }

        public Criteria andExaminationIntroLessThan(String value) {
            addCriterion("examination_intro <", value, "examinationIntro");
            return (Criteria) this;
        }

        public Criteria andExaminationIntroLessThanOrEqualTo(String value) {
            addCriterion("examination_intro <=", value, "examinationIntro");
            return (Criteria) this;
        }

        public Criteria andExaminationIntroLike(String value) {
            addCriterion("examination_intro like", value, "examinationIntro");
            return (Criteria) this;
        }

        public Criteria andExaminationIntroNotLike(String value) {
            addCriterion("examination_intro not like", value, "examinationIntro");
            return (Criteria) this;
        }

        public Criteria andExaminationIntroIn(List<String> values) {
            addCriterion("examination_intro in", values, "examinationIntro");
            return (Criteria) this;
        }

        public Criteria andExaminationIntroNotIn(List<String> values) {
            addCriterion("examination_intro not in", values, "examinationIntro");
            return (Criteria) this;
        }

        public Criteria andExaminationIntroBetween(String value1, String value2) {
            addCriterion("examination_intro between", value1, value2, "examinationIntro");
            return (Criteria) this;
        }

        public Criteria andExaminationIntroNotBetween(String value1, String value2) {
            addCriterion("examination_intro not between", value1, value2, "examinationIntro");
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

        public Criteria andBannedMajorIsNull() {
            addCriterion("banned_major is null");
            return (Criteria) this;
        }

        public Criteria andBannedMajorIsNotNull() {
            addCriterion("banned_major is not null");
            return (Criteria) this;
        }

        public Criteria andBannedMajorEqualTo(String value) {
            addCriterion("banned_major =", value, "bannedMajor");
            return (Criteria) this;
        }

        public Criteria andBannedMajorNotEqualTo(String value) {
            addCriterion("banned_major <>", value, "bannedMajor");
            return (Criteria) this;
        }

        public Criteria andBannedMajorGreaterThan(String value) {
            addCriterion("banned_major >", value, "bannedMajor");
            return (Criteria) this;
        }

        public Criteria andBannedMajorGreaterThanOrEqualTo(String value) {
            addCriterion("banned_major >=", value, "bannedMajor");
            return (Criteria) this;
        }

        public Criteria andBannedMajorLessThan(String value) {
            addCriterion("banned_major <", value, "bannedMajor");
            return (Criteria) this;
        }

        public Criteria andBannedMajorLessThanOrEqualTo(String value) {
            addCriterion("banned_major <=", value, "bannedMajor");
            return (Criteria) this;
        }

        public Criteria andBannedMajorLike(String value) {
            addCriterion("banned_major like", value, "bannedMajor");
            return (Criteria) this;
        }

        public Criteria andBannedMajorNotLike(String value) {
            addCriterion("banned_major not like", value, "bannedMajor");
            return (Criteria) this;
        }

        public Criteria andBannedMajorIn(List<String> values) {
            addCriterion("banned_major in", values, "bannedMajor");
            return (Criteria) this;
        }

        public Criteria andBannedMajorNotIn(List<String> values) {
            addCriterion("banned_major not in", values, "bannedMajor");
            return (Criteria) this;
        }

        public Criteria andBannedMajorBetween(String value1, String value2) {
            addCriterion("banned_major between", value1, value2, "bannedMajor");
            return (Criteria) this;
        }

        public Criteria andBannedMajorNotBetween(String value1, String value2) {
            addCriterion("banned_major not between", value1, value2, "bannedMajor");
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

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andTestingCentreIsNull() {
            addCriterion("testing_centre is null");
            return (Criteria) this;
        }

        public Criteria andTestingCentreIsNotNull() {
            addCriterion("testing_centre is not null");
            return (Criteria) this;
        }

        public Criteria andTestingCentreEqualTo(String value) {
            addCriterion("testing_centre =", value, "testingCentre");
            return (Criteria) this;
        }

        public Criteria andTestingCentreNotEqualTo(String value) {
            addCriterion("testing_centre <>", value, "testingCentre");
            return (Criteria) this;
        }

        public Criteria andTestingCentreGreaterThan(String value) {
            addCriterion("testing_centre >", value, "testingCentre");
            return (Criteria) this;
        }

        public Criteria andTestingCentreGreaterThanOrEqualTo(String value) {
            addCriterion("testing_centre >=", value, "testingCentre");
            return (Criteria) this;
        }

        public Criteria andTestingCentreLessThan(String value) {
            addCriterion("testing_centre <", value, "testingCentre");
            return (Criteria) this;
        }

        public Criteria andTestingCentreLessThanOrEqualTo(String value) {
            addCriterion("testing_centre <=", value, "testingCentre");
            return (Criteria) this;
        }

        public Criteria andTestingCentreLike(String value) {
            addCriterion("testing_centre like", value, "testingCentre");
            return (Criteria) this;
        }

        public Criteria andTestingCentreNotLike(String value) {
            addCriterion("testing_centre not like", value, "testingCentre");
            return (Criteria) this;
        }

        public Criteria andTestingCentreIn(List<String> values) {
            addCriterion("testing_centre in", values, "testingCentre");
            return (Criteria) this;
        }

        public Criteria andTestingCentreNotIn(List<String> values) {
            addCriterion("testing_centre not in", values, "testingCentre");
            return (Criteria) this;
        }

        public Criteria andTestingCentreBetween(String value1, String value2) {
            addCriterion("testing_centre between", value1, value2, "testingCentre");
            return (Criteria) this;
        }

        public Criteria andTestingCentreNotBetween(String value1, String value2) {
            addCriterion("testing_centre not between", value1, value2, "testingCentre");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyIsNull() {
            addCriterion("test_frequency is null");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyIsNotNull() {
            addCriterion("test_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyEqualTo(String value) {
            addCriterion("test_frequency =", value, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyNotEqualTo(String value) {
            addCriterion("test_frequency <>", value, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyGreaterThan(String value) {
            addCriterion("test_frequency >", value, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("test_frequency >=", value, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyLessThan(String value) {
            addCriterion("test_frequency <", value, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyLessThanOrEqualTo(String value) {
            addCriterion("test_frequency <=", value, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyLike(String value) {
            addCriterion("test_frequency like", value, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyNotLike(String value) {
            addCriterion("test_frequency not like", value, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyIn(List<String> values) {
            addCriterion("test_frequency in", values, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyNotIn(List<String> values) {
            addCriterion("test_frequency not in", values, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyBetween(String value1, String value2) {
            addCriterion("test_frequency between", value1, value2, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andTestFrequencyNotBetween(String value1, String value2) {
            addCriterion("test_frequency not between", value1, value2, "testFrequency");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNull() {
            addCriterion("work_type is null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNotNull() {
            addCriterion("work_type is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeEqualTo(String value) {
            addCriterion("work_type =", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotEqualTo(String value) {
            addCriterion("work_type <>", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThan(String value) {
            addCriterion("work_type >", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThanOrEqualTo(String value) {
            addCriterion("work_type >=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThan(String value) {
            addCriterion("work_type <", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThanOrEqualTo(String value) {
            addCriterion("work_type <=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLike(String value) {
            addCriterion("work_type like", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotLike(String value) {
            addCriterion("work_type not like", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIn(List<String> values) {
            addCriterion("work_type in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotIn(List<String> values) {
            addCriterion("work_type not in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeBetween(String value1, String value2) {
            addCriterion("work_type between", value1, value2, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotBetween(String value1, String value2) {
            addCriterion("work_type not between", value1, value2, "workType");
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

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
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

        public Criteria andDealFlagIsNull() {
            addCriterion("deal_flag is null");
            return (Criteria) this;
        }

        public Criteria andDealFlagIsNotNull() {
            addCriterion("deal_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDealFlagEqualTo(Integer value) {
            addCriterion("deal_flag =", value, "dealFlag");
            return (Criteria) this;
        }

        public Criteria andDealFlagNotEqualTo(Integer value) {
            addCriterion("deal_flag <>", value, "dealFlag");
            return (Criteria) this;
        }

        public Criteria andDealFlagGreaterThan(Integer value) {
            addCriterion("deal_flag >", value, "dealFlag");
            return (Criteria) this;
        }

        public Criteria andDealFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("deal_flag >=", value, "dealFlag");
            return (Criteria) this;
        }

        public Criteria andDealFlagLessThan(Integer value) {
            addCriterion("deal_flag <", value, "dealFlag");
            return (Criteria) this;
        }

        public Criteria andDealFlagLessThanOrEqualTo(Integer value) {
            addCriterion("deal_flag <=", value, "dealFlag");
            return (Criteria) this;
        }

        public Criteria andDealFlagIn(List<Integer> values) {
            addCriterion("deal_flag in", values, "dealFlag");
            return (Criteria) this;
        }

        public Criteria andDealFlagNotIn(List<Integer> values) {
            addCriterion("deal_flag not in", values, "dealFlag");
            return (Criteria) this;
        }

        public Criteria andDealFlagBetween(Integer value1, Integer value2) {
            addCriterion("deal_flag between", value1, value2, "dealFlag");
            return (Criteria) this;
        }

        public Criteria andDealFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("deal_flag not between", value1, value2, "dealFlag");
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