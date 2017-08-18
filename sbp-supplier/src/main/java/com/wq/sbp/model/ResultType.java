package com.wq.sbp.model;

/**
 * 
 *
 * @author weiyuan
 * @since 2017年6月20日
 */
public enum ResultType {

                        /**
                         * 测试返回结果
                         */
                        TEST(-1, "测试返回结果"),

                        /**
                         * 操作失败
                         */
                        FAIL(0, "操作失败"),

                        /**
                         * 操作成功
                         */
                        SUCCESS(200, "操作成功"),

                        /**
                         * 参数为空
                         */
                        NULL_OBJ(201, "参数为空"),

                        /**
                         * 参数错误
                         */
                        OBJ_ERROR(202, "参数错误"),

                        /**
                         * 网络错误
                         */
                        NET_ERROR(203, "网络错误"),
                        /**
                         * 没有查询到结果
                         */
                        NO_DATA(204, "没有查询到结果"),

                        /**
                         * 发送短信失败
                         */
                        MOBILE_SEND_FAIL(205, "发送短信失败"),
                        /**
                         * 验证码已过期
                         */
                        MOBILE_EXPIRE(206, "验证码已过期"),
                        /**
                         * 验证码错误
                         */
                        MOBILE_VERIFY_ERROR(207, "验证码错误"),
                        /**
                         * 已注册供应商,请直接登录
                         */
                        HAVA_REGIST_SUP(208, "已注册供应商,请直接登录"),
                        /**
                         * 用户名或密码错误
                         */
                        UNAME_OR_PWD_ERROR(209, "用户名或密码错误"),

                        /**
                         * 登录超时,请重新登录
                         */
                        LOGIN_TIME_OUT(210, "登录超时,请重新登录"),
                        /**
                         * 询价单已经成交
                         */
                        INS_DEAL(211, "询价单已经成交,无法继续报价"),

                        /**
                         * 退出成功
                         */
                        LOGOUT(212, "退出成功"),
                        
                        /**
                         * 未完善企业信息
                         */
                        EMPTY_COMPANY(236, "未完善企业信息"),

                        /**
                         * 登录用户不是供应商
                         */
                        USER_NOT_SUPPLIER(238, "登录用户不是供应商"),

                        /**
                         * 没有访问权限
                         */
                        UNAUTHORIZED(401, "没有访问权限"),

                        /**
                         * 程序出现异常
                         */
                        SERVER_ERROR(500, "程序出现异常"),
                        
                        /**
                         * 电话号唯一
                         */
                        MOBILE_UNIQUE(216,"电话号码唯一，数据库不存在"),
                        
                        /**
                         * 已经注册，可以登录
                         */
                        ALREADY_REGIST(217,"已经注册，可以直接登录"),
                        
                        /**
                         * 加密验证失败;
                         */
                        ENCRY_AUTH_FAIL(218,"加密验证失败");

    private int code;

    private String msg;

    private ResultType(int code, String msg) {
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
