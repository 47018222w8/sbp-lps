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
import com.wq.sbp.model.ErrorDTO;
import com.wq.sbp.model.MemberDO;
import com.wq.sbp.model.StoreDO;
import com.wq.sbp.service.SessionServie;

/**
 * 会话处理
 *
 *
 * @author zwq
 * @since 2017年9月19日
 */
@Service
public class SessionServieImpl implements SessionServie {

    @Autowired
    private MemberDao memberDao;

    @Autowired
    private StoreDao storeDao;

    @Override
    public ResponseEntity<?> login(MemberDO member) {
        String pwd = member.getPassword();
        member.setPassword(null);
        MemberDO m1 = memberDao.getMember(member);
        if (m1 == null) {
            return new ResponseEntity<ErrorDTO>(new ErrorDTO(ErrorEnum.ACCOUNT_NULL), HttpStatus.UNAUTHORIZED);
        }
        member.setPassword(MD5Util.md5(pwd));
        MemberDO m = memberDao.getMember(member);
        if (m == null) {
            return new ResponseEntity<ErrorDTO>(new ErrorDTO(ErrorEnum.PWD_ERROR), HttpStatus.UNAUTHORIZED);
        }
        StoreDO store = new StoreDO();
        store.setMemberId(m.getMemberId());
        StoreDO s = storeDao.getStore(store);
        if (s == null) {
            return new ResponseEntity<ErrorDTO>(new ErrorDTO(ErrorEnum.STORE_VALIDATE), HttpStatus.UNAUTHORIZED);
        }
        Map<String, Object> map = new HashMap<>(16);
        map.put("memberId", m.getMemberId());
        return ResponseEntity.ok(JWTUtil.generateToken(map));
    }

}
