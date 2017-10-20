package com.wq.sbp.service;

import com.wq.sbp.model.InsuranceDO;

/**
 * InsuranceInfoService
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
public interface InsuranceInfoService {

    /**
     * 更新
     * 
     * @param ins
     * @return int
     *
     * @author zwq
     * @date 2017年10月16日
     */
    int updateInsuranceInfoList(InsuranceDO ins);
}
