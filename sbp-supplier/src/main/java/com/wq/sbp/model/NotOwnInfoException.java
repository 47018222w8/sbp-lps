package com.wq.sbp.model;

/**
 * 操作他人信息异常
 *
 *
 * @author zwq
 * @since 2017年9月7日
 */
public class NotOwnInfoException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 5992103910829371313L;

    public NotOwnInfoException(String msg) {
        super(msg);
    }
}
