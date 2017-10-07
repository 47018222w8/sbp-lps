package com.wq.sbp.model;

public enum ErrorEnum {
                       /**
                        * 令牌过期
                        */
                       AUTHORIZATION_EXPIRED(401, "令牌过期"),
                       /**
                        * 账号不存在
                        */
                       ACCOUNT_NULL(400, "账号不存在"),
                       /**
                        * 密码错误
                        */
                       PWD_ERROR(400, "密码错误"),
                       /**
                        * 不是供应商
                        */
                       NOT_STORE(400, "不是供应商"),
                       /**
                        * 审核中
                        */
                       STORE_VALIDATE(400, "审核中"),
                       /**
                        * 无权操作不属于自己的信息
                        */
                       NOT_OWN(403, "无权操作不属于自己的信息"),

                       /**
                        * 系统内部错误
                        */
                       SERVER_ERROR(500, "系统内部错误");

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
