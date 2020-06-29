//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.zillionai.sso.web.demo.demo.controller;

import java.io.Serializable;

public class CloudwalkResult<T> implements Serializable {
    private static final long serialVersionUID = 9191892693219217387L;
    private static final String RESP_CODE_SUCCESS = "00000000";
    private String code;
    private boolean success;
    private String message;
    private T data;

    public CloudwalkResult() {
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static <T> CloudwalkResult<T> success(T data) {
        CloudwalkResult<T> result = new CloudwalkResult();
        result.setCode("00000000");
        result.setMessage("成功");
        result.setSuccess(true);
        result.setData(data);
        return result;
    }

    public static <T> CloudwalkResult<T> fail(String code, String message, T data) {
        CloudwalkResult<T> result = new CloudwalkResult();
        result.setCode(code);
        result.setData(data);
        result.setMessage(message);
        result.setSuccess(false);
        return result;
    }

    public static <T> CloudwalkResult<T> fail(String code, String message) {
        CloudwalkResult<T> result = new CloudwalkResult();
        result.setCode(code);
        result.setMessage(message);
        result.setSuccess(false);
        result.setData((T) null);
        return result;
    }
}
