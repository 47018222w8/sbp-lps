package com.wq.sbp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.Insurance;
import com.wq.sbp.model.ReportPriceExtend;

@Mapper
public interface InsuranceDao {

    List<Insurance> listInsurance(ReportPriceExtend rpe);

    Insurance getInsurance(Insurance ins);

    int updateInsuranceSelective(Insurance ins);

    int countInsurance(ReportPriceExtend rpe);
}
