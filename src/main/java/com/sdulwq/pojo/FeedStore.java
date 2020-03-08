package com.sdulwq.pojo;

import java.util.Date;

public class FeedStore {
    private String storagecode;

    private String feedcode;

    private String feedname;

    private Integer storecnt;

    private Integer applycnt;

    private Integer scrapcnt;

    private Date createTime;

    private Date updateTime;

    public FeedStore(String storagecode, String feedcode, String feedname, Integer storecnt, Integer applycnt, Integer scrapcnt, Date createTime, Date updateTime) {
        this.storagecode = storagecode;
        this.feedcode = feedcode;
        this.feedname = feedname;
        this.storecnt = storecnt;
        this.applycnt = applycnt;
        this.scrapcnt = scrapcnt;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public FeedStore() {
        super();
    }

    public String getStoragecode() {
        return storagecode;
    }

    public void setStoragecode(String storagecode) {
        this.storagecode = storagecode == null ? null : storagecode.trim();
    }

    public String getFeedcode() {
        return feedcode;
    }

    public void setFeedcode(String feedcode) {
        this.feedcode = feedcode == null ? null : feedcode.trim();
    }

    public String getFeedname() {
        return feedname;
    }

    public void setFeedname(String feedname) {
        this.feedname = feedname == null ? null : feedname.trim();
    }

    public Integer getStorecnt() {
        return storecnt;
    }

    public void setStorecnt(Integer storecnt) {
        this.storecnt = storecnt;
    }

    public Integer getApplycnt() {
        return applycnt;
    }

    public void setApplycnt(Integer applycnt) {
        this.applycnt = applycnt;
    }

    public Integer getScrapcnt() {
        return scrapcnt;
    }

    public void setScrapcnt(Integer scrapcnt) {
        this.scrapcnt = scrapcnt;
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