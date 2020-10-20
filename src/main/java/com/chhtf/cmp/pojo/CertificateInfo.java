package com.chhtf.cmp.pojo;

import java.util.Date;

public class CertificateInfo {
    private Integer id;

    private String certificateName;

    private String certificateType;

    private String industry;

    private String belongType;

    private String major;

    private String certificationAuthority;

    private String examinationTime;

    private String examinationIntro;

    private String comment;

    private String bannedMajor;

    private String policyIntro;

    private String area;

    private String testingCentre;

    private String testFrequency;

    private String workType;

    private String otherInfo;

    private String imageUrl;

    private Integer noQuestion;

    private Integer dealFlag;

    private String stringField;

    private Integer intField;

    private Date createTime;

    private Date updateTime;

    private Integer totalQuestion;

    private Integer lowerLimit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCertificateName() {
        return certificateName;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName == null ? null : certificateName.trim();
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType == null ? null : certificateType.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getBelongType() {
        return belongType;
    }

    public void setBelongType(String belongType) {
        this.belongType = belongType == null ? null : belongType.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getCertificationAuthority() {
        return certificationAuthority;
    }

    public void setCertificationAuthority(String certificationAuthority) {
        this.certificationAuthority = certificationAuthority == null ? null : certificationAuthority.trim();
    }

    public String getExaminationTime() {
        return examinationTime;
    }

    public void setExaminationTime(String examinationTime) {
        this.examinationTime = examinationTime == null ? null : examinationTime.trim();
    }

    public String getExaminationIntro() {
        return examinationIntro;
    }

    public void setExaminationIntro(String examinationIntro) {
        this.examinationIntro = examinationIntro == null ? null : examinationIntro.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getBannedMajor() {
        return bannedMajor;
    }

    public void setBannedMajor(String bannedMajor) {
        this.bannedMajor = bannedMajor == null ? null : bannedMajor.trim();
    }

    public String getPolicyIntro() {
        return policyIntro;
    }

    public void setPolicyIntro(String policyIntro) {
        this.policyIntro = policyIntro == null ? null : policyIntro.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getTestingCentre() {
        return testingCentre;
    }

    public void setTestingCentre(String testingCentre) {
        this.testingCentre = testingCentre == null ? null : testingCentre.trim();
    }

    public String getTestFrequency() {
        return testFrequency;
    }

    public void setTestFrequency(String testFrequency) {
        this.testFrequency = testFrequency == null ? null : testFrequency.trim();
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType == null ? null : workType.trim();
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo == null ? null : otherInfo.trim();
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl == null ? null : imageUrl.trim();
    }

    public Integer getNoQuestion() {
        return noQuestion;
    }

    public void setNoQuestion(Integer noQuestion) {
        this.noQuestion = noQuestion;
    }

    public Integer getDealFlag() {
        return dealFlag;
    }

    public void setDealFlag(Integer dealFlag) {
        this.dealFlag = dealFlag;
    }

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField == null ? null : stringField.trim();
    }

    public Integer getIntField() {
        return intField;
    }

    public void setIntField(Integer intField) {
        this.intField = intField;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getTotalQuestion() {
        return totalQuestion;
    }

    public void setTotalQuestion(Integer totalQuestion) {
        this.totalQuestion = totalQuestion;
    }

    public Integer getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(Integer lowerLimit) {
        this.lowerLimit = lowerLimit;
    }
}