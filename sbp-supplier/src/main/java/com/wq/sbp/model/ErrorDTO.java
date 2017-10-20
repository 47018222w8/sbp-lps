package com.wq.sbp.model;

/**
 * ErrorDTO
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
public class ErrorDTO {

    /**
     * HTTP 状态码
     * 
     * @author zwq
     */
    private Integer httpStatusCode;

    /**
     * 错误信息
     * 
     * @author zwq
     */
    private String message;

    /**
     * 错误代码
     * 
     * @author zwq
     */
    private String code;

    public ErrorDTO(ErrorEnum ee) {
        this.code = ee.toString();
        this.message = ee.getMessage();
        this.httpStatusCode = ee.getHttpStatusCode();
    }

    public ErrorDTO() {

    }

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
