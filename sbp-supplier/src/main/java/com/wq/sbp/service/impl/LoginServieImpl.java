package com.wq.sbp.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.sbp.common.util.JWTUtil;
import org.sbp.common.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wq.sbp.dao.MemberDao;
import com.wq.sbp.dao.StoreDao;
import com.wq.sbp.model.MemberDO;
import com.wq.sbp.model.ResultType;
import com.wq.sbp.model.ReturnVO;
import com.wq.sbp.model.StoreDO;
import com.wq.sbp.service.LoginServie;

@Service
public class LoginServieImpl implements LoginServie {

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private StoreDao storeDao;

    @Override
    public ReturnVO login(MemberDO member) {
        if (member.getUname() == null || member.getPassword() == null) {
            return new ReturnVO(ResultType.PARAM_NULL);
        }
        String pwd = member.getPassword();
        member.setPassword(null);
        MemberDO m1 = memberDao.getMemberByPwd(member);
        if (m1 == null) {
            return new ReturnVO(ResultType.ACCOUNT_NULL);
        }
        member.setPassword(MD5Util.md5(pwd));
        MemberDO m = memberDao.getMemberByPwd(member);
        if (m == null) {
            return new ReturnVO(ResultType.PARAM_NULL);
        }
        StoreDO store = new StoreDO();
        store.setMemberId(m.getMemberId());
        StoreDO s = storeDao.getStoreByStore(store);
        if (s == null) {
            return new ReturnVO(ResultType.SUP_NULL);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("memberId", m.getMemberId());
        return new ReturnVO(ResultType.SUCCESS, JWTUtil.generateToken(map));
    }

}
