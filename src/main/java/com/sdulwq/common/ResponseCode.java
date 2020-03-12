package com.sdulwq.common;

public enum  ResponseCode {

    SUCCESS(0,"success"),
    ERROR(1,"ERROR"),
    NEED_LOGIN(10,"NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2,"ILLEAGL_ARGUMENT");

    private final int code;
    private final String desc;

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    ResponseCode(int code, String desc){
        this.code = code;
        this.desc = desc;
    }

}
