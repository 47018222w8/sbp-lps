package com.wq.sbp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wq.sbp.dao.StoreDao;
import com.wq.sbp.model.Store;
import com.wq.sbp.service.StoreServcie;

@Service
public class StoreServiceImpl implements StoreServcie {

    @Autowired
    private StoreDao storeDao;

    @Override
    public Store getStore(Store store) {
        return storeDao.getStore(store);
    }

}
