package com.chhtf.cmp.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class TestApplication {
    private Integer id;

    private Integer certificateId;

    private Integer testApplicationType;

    private Integer traineeId;

    private Integer userId;

    private String applicationTime;

    private String getCertificateWay;

    private Integer agencyId;

    private Integer employeeId;

    private Integer currentProgress;

    private String referenceTime;

    private String progressIntro;

    private String comment;

    private String attachments;

    private BigDecimal serviceFee;

    private String traineeEvaluate;

    private String agencyEvaluate;

    private String platformEvaluate;

    private String traineeComment;

    private String agencyComment;

    private String platformComment;

    private Integer beAllocate;

    private String stringField;

    private Integer intField;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
    }

    public Integer getTestApplicationType() {
        return testApplicationType;
    }

    public void setTestApplicationType(Integer testApplicationType) {
        this.testApplicationType = testApplicationType;
    }

    public Integer getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(Integer traineeId) {
        this.traineeId = traineeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(String applicationTime) {
        this.applicationTime = applicationTime == null ? null : applicationTime.trim();
    }

    public String getGetCertificateWay() {
        return getCertificateWay;
    }

    public void setGetCertificateWay(String getCertificateWay) {
        this.getCertificateWay = getCertificateWay == null ? null : getCertificateWay.trim();
    }

    public Integer getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Integer getCurrentProgress() {
        return currentProgress;
    }

    public void setCurrentProgress(Integer currentProgress) {
        this.currentProgress = currentProgress;
    }

    public String getReferenceTime() {
        return referenceTime;
    }

    public void setReferenceTime(String referenceTime) {
        this.referenceTime = referenceTime == null ? null : referenceTime.trim();
    }

    public String getProgressIntro() {
        return progressIntro;
    }

    public void setProgressIntro(String progressIntro) {
        this.progressIntro = progressIntro == null ? null : progressIntro.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments == null ? null : attachments.trim();
    }

    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getTraineeEvaluate() {
        return traineeEvaluate;
    }

    public void setTraineeEvaluate(String traineeEvaluate) {
        this.traineeEvaluate = traineeEvaluate == null ? null : traineeEvaluate.trim();
    }

    public String getAgencyEvaluate() {
        return agencyEvaluate;
    }

    public void setAgencyEvaluate(String agencyEvaluate) {
        this.agencyEvaluate = agencyEvaluate == null ? null : agencyEvaluate.trim();
    }

    public String getPlatformEvaluate() {
        return platformEvaluate;
    }

    public void setPlatformEvaluate(String platformEvaluate) {
        this.platformEvaluate = platformEvaluate == null ? null : platformEvaluate.trim();
    }

    public String getTraineeComment() {
        return traineeComment;
    }

    public void setTraineeComment(String traineeComment) {
        this.traineeComment = traineeComment == null ? null : traineeComment.trim();
    }

    public String getAgencyComment() {
        return agencyComment;
    }

    public void setAgencyComment(String agencyComment) {
        this.agencyComment = agencyComment == null ? null : agencyComment.trim();
    }

    public String getPlatformComment() {
        return platformComment;
    }

    public void setPlatformComment(String platformComment) {
        this.platformComment = platformComment == null ? null : platformComment.trim();
    }

    public Integer getBeAllocate() {
        return beAllocate;
    }

    public void setBeAllocate(Integer beAllocate) {
        this.beAllocate = beAllocate;
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
}