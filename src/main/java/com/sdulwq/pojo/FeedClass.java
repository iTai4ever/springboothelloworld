package com.sdulwq.pojo;

import java.util.Date;

public class FeedClass {
    private String advfeedcode;

    private String advfeedname;

    private String midfeedcode;

    private String midfeedname;

    private Date createTime;

    private Date updateTime;

    public FeedClass(String advfeedcode, String advfeedname, String midfeedcode, String midfeedname, Date createTime, Date updateTime) {
        this.advfeedcode = advfeedcode;
        this.advfeedname = advfeedname;
        this.midfeedcode = midfeedcode;
        this.midfeedname = midfeedname;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public FeedClass() {
        super();
    }

    public String getAdvfeedcode() {
        return advfeedcode;
    }

    public void setAdvfeedcode(String advfeedcode) {
        this.advfeedcode = advfeedcode == null ? null : advfeedcode.trim();
    }

    public String getAdvfeedname() {
        return advfeedname;
    }

    public void setAdvfeedname(String advfeedname) {
        this.advfeedname = advfeedname == null ? null : advfeedname.trim();
    }

    public String getMidfeedcode() {
        return midfeedcode;
    }

    public void setMidfeedcode(String midfeedcode) {
        this.midfeedcode = midfeedcode == null ? null : midfeedcode.trim();
    }

    public String getMidfeedname() {
        return midfeedname;
    }

    public void setMidfeedname(String midfeedname) {
        this.midfeedname = midfeedname == null ? null : midfeedname.trim();
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