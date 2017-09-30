package com.wq.sbp.model;

/**
 * 
 *
 * @author weiyuan
 * @since 2017年6月20日
 */
public enum ResultTypeEnum {

                        /**
                         * 操作失败
                         */
                        FAIL(0, "操作失败"),
                        /**
                         * 登录失效,请重新登录
                         */
                        LOGIN_EXPIRED(1, "登录失效,请重新登录"),
                        /**
                         * 参数不全或为空
                         */
                        PARAM_NULL(2, "参数不全或为空"),
                        /**
                         * 账号或密码错误
                         */
                        PWD_ERROR(3, "账号或密码错误"),
                        /**
                         * 账号不存在
                         */
                        ACCOUNT_NULL(4, "账号不存在"),
                        /**
                         * 企业信息未完善
                         */
                        SUP_NULL(5, "企业信息未完善"),
                        /**
                         * 此单已报价
                         */
                        REPORT_PRICE_NULL(6, "此单已报价"),
                        /**
                         * 不属于自己的信息
                         */
                        NOT_OWN(7, "不属于自己的信息"),
                        /**
                         * 操作成功
                         */
                        SUCCESS(200, "操作成功");

    private int code;

    private String msg;

    private ResultTypeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
