package com.wq.sbp.service;

import com.wq.sbp.model.Member;

/**
 * 
 *
 *
 * @author zwq
 * @since 2017年9月19日
 */
public interface MemberService {

    /**
     * 根据条件取member
     *
     * @param member
     * @return
     *
     * @author zwq
     * @since 2017年9月19日
     */
    Member getMember(Member member);
}
