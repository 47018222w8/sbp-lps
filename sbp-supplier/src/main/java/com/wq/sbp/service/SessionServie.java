package com.wq.sbp.service;

import org.springframework.http.ResponseEntity;

import com.wq.sbp.model.MemberDO;

/**
 * 会话处理
 *
 *
 * @author zwq
 * @since 2017年9月19日
 */
public interface SessionServie {

    /**
     * 登录
     *
     * @param member uname password
     * @return ResponseEntity
     *
     * @author zwq
     * @date 2017年8月18日
     */
    ResponseEntity<?> login(MemberDO member);
}
