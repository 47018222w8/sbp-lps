package com.wq.sbp.model;

public enum ErrorEnum {
                       AUTHORIZATION_EXPIRED(401, "令牌过期");

    private ErrorEnum(int httpStatusCode, String message) {
        this.message = message;
        this.httpStatusCode = httpStatusCode;
    }

    private String message;

    private Integer httpStatusCode;

    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
