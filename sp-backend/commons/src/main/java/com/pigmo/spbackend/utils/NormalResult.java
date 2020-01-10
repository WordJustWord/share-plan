package com.pigmo.spbackend.utils;

import lombok.Data;

import java.io.Serializable;

@Data
public class NormalResult implements Serializable {

    private Integer statusCode;
    private String msg;
    private Object result;

    private NormalResult(Integer statusCode, String msg, Object result) {
        this.statusCode = statusCode;
        this.msg = msg;
        this.result = result;
    }

    public static final NormalResult ok() {
        return new NormalResult(200, "ok", null);
    }

    public static final NormalResult ok(String msg, Object result) {
        return new NormalResult(200, msg, result);
    }

    public static final NormalResult error(Integer statusCode, String msg) {
        return new NormalResult(statusCode, msg, null);
    }


}
