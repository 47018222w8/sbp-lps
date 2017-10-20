package com.wq.sbp.model;

/**
 * ErrorEnum
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
public enum ErrorEnum {
                       /**
                        * 令牌过期
                        * 
                        * @author zwq
                        */
                       AUTHORIZATION_EXPIRED(401, "令牌过期"),
                       /**
                        * 参数不全或为空
                        * 
                        * @author zwq
                        */
                       PARAM_NULL(400, "参数不全或为空"),
                       /**
                        * 格式错误
                        * 
                        * @author zwq
                        */
                       FORMATTER_ERROR(400, "格式错误"),
                       /**
                        * 账号不存在
                        * 
                        * @author zwq
                        */
                       ACCOUNT_NULL(401, "账号不存在"),
                       /**
                        * 密码错误
                        * 
                        * @author zwq
                        */
                       PWD_ERROR(401, "密码错误"),
                       /**
                        * 不是供应商
                        * 
                        * @author zwq
                        */
                       NOT_STORE(401, "不是供应商"),
                       /**
                        * 审核中
                        * 
                        * @author zwq
                        */
                       STORE_VALIDATE(401, "审核中"),
                       /**
                        * 无权操作不属于自己的信息
                        * 
                        * @author zwq
                        */
                       NOT_OWN(403, "无权操作不属于自己的信息"),

                       /**
                        * 系统内部错误
                        * 
                        * @author zwq
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
