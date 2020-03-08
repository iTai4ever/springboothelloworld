package com.sdulwq.pojo;

import java.util.Date;

public class StorageInfo {
    private String storagecode;

    private String storagename;

    private String userId;

    private Date createTime;

    private Date updateTime;

    public StorageInfo(String storagecode, String storagename, String userId, Date createTime, Date updateTime) {
        this.storagecode = storagecode;
        this.storagename = storagename;
        this.userId = userId;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public StorageInfo() {
        super();
    }

    public String getStoragecode() {
        return storagecode;
    }

    public void setStoragecode(String storagecode) {
        this.storagecode = storagecode == null ? null : storagecode.trim();
    }

    public String getStoragename() {
        return storagename;
    }

    public void setStoragename(String storagename) {
        this.storagename = storagename == null ? null : storagename.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
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