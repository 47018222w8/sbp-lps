package com.wq.sbp.dao;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.MemberDO;

/**
 * MemberDao
 * 
 * @author zwq
 * @date 2017年10月16日
 */
@Mapper
public interface MemberDao {

    /**
     * 查询member
     *
     * @param member uname,password必填
     * @return
     *
     * @author zwq
     * @since 2017年8月18日
     */
    MemberDO getMember(MemberDO member);
}
