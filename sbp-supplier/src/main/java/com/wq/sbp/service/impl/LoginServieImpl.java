package com.wq.sbp.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.sbp.common.util.JWTUtil;
import org.sbp.common.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wq.sbp.dao.MemberDao;
import com.wq.sbp.dao.StoreDao;
import com.wq.sbp.model.Member;
import com.wq.sbp.model.ResultTypeEnum;
import com.wq.sbp.model.ResultVO;
import com.wq.sbp.model.Store;
import com.wq.sbp.service.LoginServie;

@Service
public class LoginServieImpl implements LoginServie {

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private StoreDao storeDao;

    @Override
    public ResultVO login(Member member) {
        if (member.getUname() == null || member.getPassword() == null) {
            return new ResultVO(ResultTypeEnum.PARAM_NULL);
        }
        String pwd = member.getPassword();
        member.setPassword(null);
        Member m1 = memberDao.getMember(member);
        if (m1 == null) {
            return new ResultVO(ResultTypeEnum.ACCOUNT_NULL);
        }
        member.setPassword(MD5Util.md5(pwd));
        Member m = memberDao.getMember(member);
        if (m == null) {
            return new ResultVO(ResultTypeEnum.PARAM_NULL);
        }
        Store store = new Store();
        store.setMemberId(m.getMemberId());
        Store s = storeDao.getStore(store);
        if (s == null) {
            return new ResultVO(ResultTypeEnum.SUP_NULL);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("memberId", m.getMemberId());
        return new ResultVO(ResultTypeEnum.SUCCESS, JWTUtil.generateToken(map));
    }

}
