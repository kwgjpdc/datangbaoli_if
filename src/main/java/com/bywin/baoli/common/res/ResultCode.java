package com.bywin.baoli.common.res;

public enum ResultCode {

    SUCCESS(200, "成功"),
    ERROR(500, "系统异常"),
    TIMEOUT(408, "请求超时");


    private Integer code;

    private String msg;


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    ResultCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
 