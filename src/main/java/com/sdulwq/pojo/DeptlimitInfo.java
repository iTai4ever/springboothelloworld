package com.sdulwq.pojo;

public class DeptlimitInfo {
    private String recordid;

    private String organCode;

    private String organName;

    private Double limitcnt;

    public DeptlimitInfo(String recordid, String organCode, String organName, Double limitcnt) {
        this.recordid = recordid;
        this.organCode = organCode;
        this.organName = organName;
        this.limitcnt = limitcnt;
    }

    public DeptlimitInfo() {
        super();
    }

    public String getRecordid() {
        return recordid;
    }

    public void setRecordid(String recordid) {
        this.recordid = recordid == null ? null : recordid.trim();
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode == null ? null : organCode.trim();
    }

    public String getOrganName() {
        return organName;
    }

    public void setOrganName(String organName) {
        this.organName = organName == null ? null : organName.trim();
    }

    public Double getLimitcnt() {
        return limitcnt;
    }

    public void setLimitcnt(Double limitcnt) {
        this.limitcnt = limitcnt;
    }
}