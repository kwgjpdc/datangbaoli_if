package com.bywin.baoli.common.res;


public class ResultUtil {

    public static Result success(ResultCode resultCode, Object data) {
        return new Result(resultCode, data);
    }

    public static Result failure(Integer code, String msg, Object data) {
        return new Result(code, msg, data);
    }

    public static Result failure(Integer code, String msg) {
        return new Result(code, msg);
    }

}