package com.sdulwq.pojo;

import java.util.Date;

public class FeedOperInfo {
    private String feedcode;

    private Integer feedcnt;

    private String operrecordid;

    private Date createTime;

    private Date updateTime;

    public FeedOperInfo(String feedcode, Integer feedcnt, String operrecordid, Date createTime, Date updateTime) {
        this.feedcode = feedcode;
        this.feedcnt = feedcnt;
        this.operrecordid = operrecordid;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public FeedOperInfo() {
        super();
    }

    public String getFeedcode() {
        return feedcode;
    }

    public void setFeedcode(String feedcode) {
        this.feedcode = feedcode == null ? null : feedcode.trim();
    }

    public Integer getFeedcnt() {
        return feedcnt;
    }

    public void setFeedcnt(Integer feedcnt) {
        this.feedcnt = feedcnt;
    }

    public String getOperrecordid() {
        return operrecordid;
    }

    public void setOperrecordid(String operrecordid) {
        this.operrecordid = operrecordid == null ? null : operrecordid.trim();
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