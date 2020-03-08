package com.sdulwq.pojo;

import java.util.Date;

public class UserInfo {
    private String userId;

    private String userName;

    private String userCode;

    private String userPass;

    private String userSex;

    private String telphone;

    private String operation;

    private Date createTime;

    private Date updateTime;

    public UserInfo(String userId, String userName, String userCode, String userPass, String userSex, String telphone, String operation, Date createTime, Date updateTime) {
        this.userId = userId;
        this.userName = userName;
        this.userCode = userCode;
        this.userPass = userPass;
        this.userSex = userSex;
        this.telphone = telphone;
        this.operation = operation;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public UserInfo() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
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