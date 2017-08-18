package com.wq.sbp.service;

import com.wq.sbp.model.Member;
import com.wq.sbp.model.ReturnPojo;

public interface LoginServie {

    /**
     * 登录
     *
     * @param member
     * @return
     *
     * @author zwq
     * @since 2017年8月18日
     */
    ReturnPojo login(Member member);
}
