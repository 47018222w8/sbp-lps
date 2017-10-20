package com.wq.sbp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wq.sbp.dao.StoreDao;
import com.wq.sbp.model.StoreDO;
import com.wq.sbp.service.StoreServcie;
/**
 * StoreServiceImpl
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
@Service
public class StoreServiceImpl implements StoreServcie {

    @Autowired
    private StoreDao storeDao;

    @Override
    public StoreDO getStore(StoreDO store) {
        return storeDao.getStore(store);
    }

}
