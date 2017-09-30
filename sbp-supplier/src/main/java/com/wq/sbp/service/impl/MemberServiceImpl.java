package com.wq.sbp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wq.sbp.dao.MemberDao;
import com.wq.sbp.model.Member;
import com.wq.sbp.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    @Override
    public Member getMember(Member member) {
        return memberDao.getMember(member);
    }

}
