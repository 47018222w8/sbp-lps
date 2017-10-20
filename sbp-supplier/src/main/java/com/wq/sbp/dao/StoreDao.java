package com.wq.sbp.dao;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.StoreDO;

/**
 * StoreDao
 * 
 * @author zwq
 * @date 2017年10月16日
 */
@Mapper
public interface StoreDao {

    /**
     * 查询单个
     * 
     * @param store memberId
     * @return StoreDO
     *
     * @author zwq
     * @date 2017年10月16日
     */
    StoreDO getStore(StoreDO store);
}
