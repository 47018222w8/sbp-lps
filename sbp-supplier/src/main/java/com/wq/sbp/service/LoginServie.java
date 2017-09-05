package com.wq.sbp.service;

import com.wq.sbp.model.MemberDO;
import com.wq.sbp.model.ReturnVO;

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
    ReturnVO login(MemberDO member);
}
