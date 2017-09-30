package com.wq.sbp.service;

import com.wq.sbp.model.Member;
import com.wq.sbp.model.ResultVO;

/**
 * 登录业务处理,只返回result
 *
 *
 * @author zwq
 * @since 2017年9月19日
 */
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
    ResultVO login(Member member);
}
