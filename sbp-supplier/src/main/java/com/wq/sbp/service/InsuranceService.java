package com.wq.sbp.service;

import com.github.pagehelper.PageInfo;
import com.wq.sbp.model.Insurance;
import com.wq.sbp.model.InsurancePageParam;

/**
 * 
 * 
 * @author zwq
 * @since 2017年9月19日
 */
public interface InsuranceService {

    Insurance getInsurance(Insurance ins);

    PageInfo<Insurance> listInsurance(InsurancePageParam ipp);

    int countInsurance(InsurancePageParam ipp);
}
