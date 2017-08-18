package com.wq.sbp.dao;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.Store;
@Mapper
public interface StoreDao {

    Store selectStoreByStore(Store store);
}
