package com.chhtf.cmp.pojo;

import java.util.Date;

public class AptitudeInfo {
    private Integer id;

    private String aptitudeName;

    private String industry;

    private String policyIntro;

    private String areaCoverage;

    private String competentUnit;

    private String otherInfo;

    private Integer noQuestion;

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

    public String getAptitudeName() {
        return aptitudeName;
    }

    public void setAptitudeName(String aptitudeName) {
        this.aptitudeName = aptitudeName == null ? null : aptitudeName.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getPolicyIntro() {
        return policyIntro;
    }

    public void setPolicyIntro(String policyIntro) {
        this.policyIntro = policyIntro == null ? null : policyIntro.trim();
    }

    public String getAreaCoverage() {
        return areaCoverage;
    }

    public void setAreaCoverage(String areaCoverage) {
        this.areaCoverage = areaCoverage == null ? null : areaCoverage.trim();
    }

    public String getCompetentUnit() {
        return competentUnit;
    }

    public void setCompetentUnit(String competentUnit) {
        this.competentUnit = competentUnit == null ? null : competentUnit.trim();
    }

    public String getOtherInfo() {
        return otherInfo;
    }

    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo == null ? null : otherInfo.trim();
    }

    public Integer getNoQuestion() {
        return noQuestion;
    }

    public void setNoQuestion(Integer noQuestion) {
        this.noQuestion = noQuestion;
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