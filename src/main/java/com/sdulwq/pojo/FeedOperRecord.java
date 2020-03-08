package com.sdulwq.pojo;

import java.util.Date;

public class FeedOperRecord {
    private String recordid;

    private String opertype;

    private Date operdate;

    private String operuser;

    public FeedOperRecord(String recordid, String opertype, Date operdate, String operuser) {
        this.recordid = recordid;
        this.opertype = opertype;
        this.operdate = operdate;
        this.operuser = operuser;
    }

    public FeedOperRecord() {
        super();
    }

    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid == null ? null : recordid.trim();
    }

    public String getOpertype() {
        return opertype;
    }

    public void setOpertype(String opertype) {
        this.opertype = opertype == null ? null : opertype.trim();
    }

    public Date getOperdate() {
        return operdate;
    }

    public void setOperdate(Date operdate) {
        this.operdate = operdate;
    }

    public String getOperuser() {
        return operuser;
    }

    public void setOperuser(String operuser) {
        this.operuser = operuser == null ? null : operuser.trim();
    }
}