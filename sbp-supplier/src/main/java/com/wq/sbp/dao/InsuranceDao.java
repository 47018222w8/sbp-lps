package com.wq.sbp.dao;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.Insurance;
import com.wq.sbp.model.Quote;

@Mapper
public interface InsuranceDao {

    Quote selectInsuranceById(Insurance insurance);
}
