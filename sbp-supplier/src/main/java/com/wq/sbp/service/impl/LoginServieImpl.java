package com.wq.sbp.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.sbp.common.util.JWTUtil;
import org.sbp.common.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wq.sbp.dao.MemberDao;
import com.wq.sbp.dao.StoreDao;
import com.wq.sbp.model.ErrorEnum;
import com.wq.sbp.model.ErrorVO;
import com.wq.sbp.model.Member;
import com.wq.sbp.model.Store;
import com.wq.sbp.service.LoginServie;

@Service
public class LoginServieImpl implements LoginServie {

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private StoreDao storeDao;

    @Override
    public ResponseEntity<?> login(Member member) {
        String pwd = member.getPassword();
        member.setPassword(null);
        Member m1 = memberDao.getMember(member);
        if (m1 == null) {
            return new ResponseEntity<>(new ErrorVO(ErrorEnum.ACCOUNT_NULL), HttpStatus.BAD_REQUEST);
        }
        member.setPassword(MD5Util.md5(pwd));
        Member m = memberDao.getMember(member);
        if (m == null) {
            return new ResponseEntity<>(new ErrorVO(ErrorEnum.PWD_ERROR), HttpStatus.BAD_REQUEST);
        }
        Store store = new Store();
        store.setMemberId(m.getMemberId());
        Store s = storeDao.getStore(store);
        if (s == null) {
            return new ResponseEntity<>(new ErrorVO(ErrorEnum.STORE_VALIDATE), HttpStatus.BAD_REQUEST);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("memberId", m.getMemberId());
        return ResponseEntity.ok(JWTUtil.generateToken(map));
    }

}
