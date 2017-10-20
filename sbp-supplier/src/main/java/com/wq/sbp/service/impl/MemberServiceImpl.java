package com.wq.sbp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wq.sbp.dao.MemberDao;
import com.wq.sbp.model.MemberDO;
import com.wq.sbp.service.MemberService;
/**
 * MemberServiceImpl
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    @Override
    public MemberDO getMember(MemberDO member) {
        return memberDao.getMember(member);
    }

}
