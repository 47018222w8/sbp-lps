package com.wq.sbp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.InsuranceDO;
import com.wq.sbp.model.InsurancePageParamDTO;

/**
 * InsuranceDao
 * 
 * @author zwq
 * @date 2017年10月16日
 */
@Mapper
public interface InsuranceDao {

    /**
     * 询价单列表
     * 
     * @param insurancePageParamDTO
     * @return list
     *
     * @author zwq
     * @date 2017年10月16日
     */
    List<InsuranceDO> listInsurance(InsurancePageParamDTO insurancePageParamDTO);

    /**
     * 获取询价单(只能获取有效的)
     * 
     * @param ins id必填,repairId选填
     * @return InsuranceDO
     *
     * @author zwq
     * @date 2017年10月16日
     */
    InsuranceDO getInsurance(InsuranceDO ins);

    /**
     * 更新询价单
     * 
     * @param insuranceDO
     * @return int
     *
     * @author zwq
     * @date 2017年10月16日
     */
    int updateInsurance(InsuranceDO insuranceDO);

    /**
     * 询价单数量
     * 
     * @param insurancePageParamDTO
     * @return int
     *
     * @author zwq
     * @date 2017年10月16日
     */
    int countInsurance(InsurancePageParamDTO insurancePageParamDTO);
}
