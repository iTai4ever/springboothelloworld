package com.sdulwq.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class FeedInfo {
    private String feedcode;

    private String feedname;

    private String midfeedcode;

    private String advfeedcode;

    private String comments;

    private String feedlevel;

    private String filltype;

    private String feedbrand;

    private String proname;

    private BigDecimal price;

    private Double warranty;

    private Date createTime;

    private Date updateTime;

    public FeedInfo(String feedcode, String feedname, String midfeedcode, String advfeedcode, String comments, String feedlevel, String filltype, String feedbrand, String proname, BigDecimal price, Double warranty, Date createTime, Date updateTime) {
        this.feedcode = feedcode;
        this.feedname = feedname;
        this.midfeedcode = midfeedcode;
        this.advfeedcode = advfeedcode;
        this.comments = comments;
        this.feedlevel = feedlevel;
        this.filltype = filltype;
        this.feedbrand = feedbrand;
        this.proname = proname;
        this.price = price;
        this.warranty = warranty;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public FeedInfo() {
        super();
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

    public String getMidfeedcode() {
        return midfeedcode;
    }

    public void setMidfeedcode(String midfeedcode) {
        this.midfeedcode = midfeedcode == null ? null : midfeedcode.trim();
    }

    public String getAdvfeedcode() {
        return advfeedcode;
    }

    public void setAdvfeedcode(String advfeedcode) {
        this.advfeedcode = advfeedcode == null ? null : advfeedcode.trim();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public String getFeedlevel() {
        return feedlevel;
    }

    public void setFeedlevel(String feedlevel) {
        this.feedlevel = feedlevel == null ? null : feedlevel.trim();
    }

    public String getFilltype() {
        return filltype;
    }

    public void setFilltype(String filltype) {
        this.filltype = filltype == null ? null : filltype.trim();
    }

    public String getFeedbrand() {
        return feedbrand;
    }

    public void setFeedbrand(String feedbrand) {
        this.feedbrand = feedbrand == null ? null : feedbrand.trim();
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Double getWarranty() {
        return warranty;
    }

    public void setWarranty(Double warranty) {
        this.warranty = warranty;
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