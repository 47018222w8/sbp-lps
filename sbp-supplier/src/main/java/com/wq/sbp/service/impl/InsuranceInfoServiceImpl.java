package com.wq.sbp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wq.sbp.dao.InsuranceInfoDao;
import com.wq.sbp.model.InsuranceDO;
import com.wq.sbp.service.InsuranceInfoService;

/**
 * InsuranceInfoServiceImpl
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
@Service
public class InsuranceInfoServiceImpl implements InsuranceInfoService {

    @Autowired
    private InsuranceInfoDao insuranceInfoDao;

    @Override
    public int updateInsuranceInfoList(InsuranceDO ins) {
        return insuranceInfoDao.updateInsuranceInfoList(ins);
    }

}
