package com.wq.sbp.dao;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.InsuranceDO;

/**
 * InsuranceInfoDao
 * 
 * @author zwq
 * @date 2017年10月16日
 */
@Mapper
public interface InsuranceInfoDao {

    /**
     * 更新询价单零件
     * 
     * @param ins
     * @return int 更新数量
     *
     * @author zwq
     * @date 2017年10月16日
     */
    int updateInsuranceInfoList(InsuranceDO ins);
}
