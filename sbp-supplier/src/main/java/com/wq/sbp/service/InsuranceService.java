package com.wq.sbp.service;

import com.github.pagehelper.PageInfo;
import com.wq.sbp.model.InsuranceDO;
import com.wq.sbp.model.InsurancePageParamDTO;

/**
 * InsuranceService
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
public interface InsuranceService {

    /**
     * 获取询价单(只能获取有效的)
     * 
     * @param 
     * @param insuranceDO id必填,repairId选填
     * @return InsuranceDO
     *
     * @author zwq
     * @date 2017年10月16日
     */
    InsuranceDO getInsurance(InsuranceDO insuranceDO);

    /**
     * 列表
     * 
     * @param insurancePageParamDTO
     * @return list
     *
     * @author zwq
     * @date 2017年10月16日
     */
    PageInfo<InsuranceDO> listInsurance(InsurancePageParamDTO insurancePageParamDTO);

    /**
     * 数量
     * 
     * @param insurancePageParamDTO
     * @return int
     *
     * @author zwq
     * @date 2017年10月16日
     */
    int countInsurance(InsurancePageParamDTO insurancePageParamDTO);
}
