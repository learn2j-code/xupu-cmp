package com.chhtf.cmp.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class AnswerRecord {
    private Integer id;

    private Integer userId;

    private String userName;

    private Integer paperId;

    private String paperName;

    private String answerTime;

    private BigDecimal getPoints;

    private Integer rightNum;

    private Integer wrongNum;

    private BigDecimal cumulativeTime;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public String getPaperName() {
        return paperName;
    }

    public void setPaperName(String paperName) {
        this.paperName = paperName == null ? null : paperName.trim();
    }

    public String getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(String answerTime) {
        this.answerTime = answerTime == null ? null : answerTime.trim();
    }

    public BigDecimal getGetPoints() {
        return getPoints;
    }

    public void setGetPoints(BigDecimal getPoints) {
        this.getPoints = getPoints;
    }

    public Integer getRightNum() {
        return rightNum;
    }

    public void setRightNum(Integer rightNum) {
        this.rightNum = rightNum;
    }

    public Integer getWrongNum() {
        return wrongNum;
    }

    public void setWrongNum(Integer wrongNum) {
        this.wrongNum = wrongNum;
    }

    public BigDecimal getCumulativeTime() {
        return cumulativeTime;
    }

    public void setCumulativeTime(BigDecimal cumulativeTime) {
        this.cumulativeTime = cumulativeTime;
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