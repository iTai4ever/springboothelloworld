package com.sdulwq.pojo;

public class FeedapplyInfo {
    private String feedcode;

    private Integer feedcnt;

    private String applycode;

    public FeedapplyInfo(String feedcode, Integer feedcnt, String applycode) {
        this.feedcode = feedcode;
        this.feedcnt = feedcnt;
        this.applycode = applycode;
    }

    public FeedapplyInfo() {
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

    public String getApplycode() {
        return applycode;
    }

    public void setApplycode(String applycode) {
        this.applycode = applycode == null ? null : applycode.trim();
    }
}