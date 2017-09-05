package com.wq.sbp.dao;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.StoreDO;
@Mapper
public interface StoreDao {

    StoreDO getStoreByStore(StoreDO store);
}
