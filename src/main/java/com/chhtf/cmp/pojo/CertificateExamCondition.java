package com.chhtf.cmp.pojo;

import java.util.Date;

public class CertificateExamCondition {
    private Integer id;

    private Integer certificateId;

    private String conditionNum;

    private String conditionIntro;

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

    public String getConditionNum() {
        return conditionNum;
    }

    public void setConditionNum(String conditionNum) {
        this.conditionNum = conditionNum == null ? null : conditionNum.trim();
    }

    public String getConditionIntro() {
        return conditionIntro;
    }

    public void setConditionIntro(String conditionIntro) {
        this.conditionIntro = conditionIntro == null ? null : conditionIntro.trim();
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