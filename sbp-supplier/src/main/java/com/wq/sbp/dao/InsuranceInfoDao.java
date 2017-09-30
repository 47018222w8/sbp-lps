package com.wq.sbp.dao;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.Insurance;

@Mapper
public interface InsuranceInfoDao {

    int updateInsuranceInfoList(Insurance ins);
}
