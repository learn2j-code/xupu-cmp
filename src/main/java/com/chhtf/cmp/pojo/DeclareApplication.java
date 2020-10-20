package com.chhtf.cmp.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class DeclareApplication {
    private Integer id;

    private Integer aptitudeId;

    private Integer companyId;

    private String applicationTime;

    private Integer agencyId;

    private Integer merchandiserId;

    private Integer currentProgress;

    private String attachmentIds;

    private String progressIntro;

    private String getWay;

    private Integer declareNum;

    private BigDecimal serviceFee;

    private String expectTime;

    private String predictTime;

    private String actualTime;

    private String companyEvaluate;

    private String agencyEvaluate;

    private String platformEvaluate;

    private String companyComment;

    private String agencyComment;

    private String platformComment;

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

    public Integer getAptitudeId() {
        return aptitudeId;
    }

    public void setAptitudeId(Integer aptitudeId) {
        this.aptitudeId = aptitudeId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getApplicationTime() {
        return applicationTime;
    }

    public void setApplicationTime(String applicationTime) {
        this.applicationTime = applicationTime == null ? null : applicationTime.trim();
    }

    public Integer getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(Integer agencyId) {
        this.agencyId = agencyId;
    }

    public Integer getMerchandiserId() {
        return merchandiserId;
    }

    public void setMerchandiserId(Integer merchandiserId) {
        this.merchandiserId = merchandiserId;
    }

    public Integer getCurrentProgress() {
        return currentProgress;
    }

    public void setCurrentProgress(Integer currentProgress) {
        this.currentProgress = currentProgress;
    }

    public String getAttachmentIds() {
        return attachmentIds;
    }

    public void setAttachmentIds(String attachmentIds) {
        this.attachmentIds = attachmentIds == null ? null : attachmentIds.trim();
    }

    public String getProgressIntro() {
        return progressIntro;
    }

    public void setProgressIntro(String progressIntro) {
        this.progressIntro = progressIntro == null ? null : progressIntro.trim();
    }

    public String getGetWay() {
        return getWay;
    }

    public void setGetWay(String getWay) {
        this.getWay = getWay == null ? null : getWay.trim();
    }

    public Integer getDeclareNum() {
        return declareNum;
    }

    public void setDeclareNum(Integer declareNum) {
        this.declareNum = declareNum;
    }

    public BigDecimal getServiceFee() {
        return serviceFee;
    }

    public void setServiceFee(BigDecimal serviceFee) {
        this.serviceFee = serviceFee;
    }

    public String getExpectTime() {
        return expectTime;
    }

    public void setExpectTime(String expectTime) {
        this.expectTime = expectTime == null ? null : expectTime.trim();
    }

    public String getPredictTime() {
        return predictTime;
    }

    public void setPredictTime(String predictTime) {
        this.predictTime = predictTime == null ? null : predictTime.trim();
    }

    public String getActualTime() {
        return actualTime;
    }

    public void setActualTime(String actualTime) {
        this.actualTime = actualTime == null ? null : actualTime.trim();
    }

    public String getCompanyEvaluate() {
        return companyEvaluate;
    }

    public void setCompanyEvaluate(String companyEvaluate) {
        this.companyEvaluate = companyEvaluate == null ? null : companyEvaluate.trim();
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

    public String getCompanyComment() {
        return companyComment;
    }

    public void setCompanyComment(String companyComment) {
        this.companyComment = companyComment == null ? null : companyComment.trim();
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