package com.wq.sbp.dao;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.MemberDO;

@Mapper
public interface MemberDao {

    /**
     * 通过账号密码查询member
     *
     * @param member
     * @return
     *
     * @author zwq
     * @since 2017年8月18日
     */
    MemberDO getMemberByPwd(MemberDO member);
}
