package com.chhtf.cmp.pojo;

import java.util.Date;

public class UserRelation {
    private Integer id;

    private Integer userId;

    private String relationType;

    private Integer relaterId;

    private String stringField;

    private String intField;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getRelationType() {
        return relationType;
    }

    public void setRelationType(String relationType) {
        this.relationType = relationType == null ? null : relationType.trim();
    }

    public Integer getRelaterId() {
        return relaterId;
    }

    public void setRelaterId(Integer relaterId) {
        this.relaterId = relaterId;
    }

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField == null ? null : stringField.trim();
    }

    public String getIntField() {
        return intField;
    }

    public void setIntField(String intField) {
        this.intField = intField == null ? null : intField.trim();
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