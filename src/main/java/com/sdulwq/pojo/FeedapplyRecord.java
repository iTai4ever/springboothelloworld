package com.sdulwq.pojo;

import java.util.Date;

public class FeedapplyRecord {
    private String applycode;

    private String recordid;

    private Date applydate;

    private String applyuser;

    private String applycause;

    public FeedapplyRecord(String applycode, String recordid, Date applydate, String applyuser, String applycause) {
        this.applycode = applycode;
        this.recordid = recordid;
        this.applydate = applydate;
        this.applyuser = applyuser;
        this.applycause = applycause;
    }

    public FeedapplyRecord() {
        super();
    }

    public String getApplycode() {
        return applycode;
    }

    public void setApplycode(String applycode) {
        this.applycode = applycode == null ? null : applycode.trim();
    }

    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid == null ? null : recordid.trim();
    }

    public Date getApplydate() {
        return applydate;
    }

    public void setApplydate(Date applydate) {
        this.applydate = applydate;
    }

    public String getApplyuser() {
        return applyuser;
    }

    public void setApplyuser(String applyuser) {
        this.applyuser = applyuser == null ? null : applyuser.trim();
    }

    public String getApplycause() {
        return applycause;
    }

    public void setApplycause(String applycause) {
        this.applycause = applycause == null ? null : applycause.trim();
    }
}