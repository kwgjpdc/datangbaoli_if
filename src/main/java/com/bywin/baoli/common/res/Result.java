package com.bywin.baoli.common.res;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: zhubao
 * @Description: 返回对象
 * @DateTime: 2022/9/13 9:44
 * @Params:
 * @Return
 */
@Data
public class Result implements Serializable {
    private static final long serialVersionUID = 1L;

    //状态码
    private Integer code;

    //响应消息
    private String msg;

    //响应数据
    private Object data;

    public Result(ResultCode resultCode, Object data) {
        this.code = resultCode.getCode();
        this.msg = resultCode.getMsg();
        this.data = data;
    }

    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}