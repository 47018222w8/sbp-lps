package com.wq.sbp.dao;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.InsuranceDO;

@Mapper
public interface InsuranceDao {

    InsuranceDO getInsuranceById(InsuranceDO insurance);

    int updateInsuranceSelective(InsuranceDO ins);
}
