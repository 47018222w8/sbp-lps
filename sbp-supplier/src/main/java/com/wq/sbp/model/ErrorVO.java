package com.wq.sbp.model;

public class ErrorVO {

    private int httpStatusCode;

    // 错误信息
    private String message;

    // 错误代码
    private String code;

    public ErrorVO(ErrorEnum ee) {
        this.code = ee.toString();
        this.message = ee.getMessage();
        this.httpStatusCode = ee.getHttpStatusCode();
    }

    public ErrorVO() {

    }

    public int getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(int httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "ErrorVO [httpStatusCode=" + httpStatusCode + ", message=" + message + ", code=" + code + "]";
    }

}
