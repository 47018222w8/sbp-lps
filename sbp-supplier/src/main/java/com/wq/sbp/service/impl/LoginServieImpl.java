package com.wq.sbp.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wq.sbp.common.util.JWTUtil;
import com.wq.sbp.common.util.MD5Util;
import com.wq.sbp.dao.MemberDao;
import com.wq.sbp.dao.StoreDao;
import com.wq.sbp.model.Member;
import com.wq.sbp.model.ResultType;
import com.wq.sbp.model.ReturnPojo;
import com.wq.sbp.model.Store;
import com.wq.sbp.service.LoginServie;

@Service
public class LoginServieImpl implements LoginServie {

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private StoreDao storeDao;

    @Override
    public ReturnPojo login(Member member) {
        if (member.getUname() == null || member.getPassword() == null) {
            return new ReturnPojo(ResultType.PARAM_NULL);
        }
        String pwd = member.getPassword();
        member.setPassword(null);
        Member m1 = memberDao.selectMemberByPwd(member);
        if (m1 == null) {
            return new ReturnPojo(ResultType.ACCOUNT_NULL);
        }
        member.setPassword(MD5Util.md5(pwd));
        Member m = memberDao.selectMemberByPwd(member);
        if (m == null) {
            return new ReturnPojo(ResultType.PARAM_NULL);
        }
        Store store = new Store();
        store.setMemberId(m.getMemberId());
        Store s = storeDao.selectStoreByStore(store);
        if (s == null) {
            return new ReturnPojo(ResultType.SUP_NULL);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("memberId", m.getMemberId());
        return new ReturnPojo(ResultType.SUCCESS, JWTUtil.generateToken(map));
    }

}
