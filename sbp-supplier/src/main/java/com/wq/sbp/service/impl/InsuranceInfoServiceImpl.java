package com.wq.sbp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wq.sbp.dao.InsuranceInfoDao;
import com.wq.sbp.model.Insurance;
import com.wq.sbp.service.InsuranceInfoService;

@Service
public class InsuranceInfoServiceImpl implements InsuranceInfoService{
    @Autowired
    private InsuranceInfoDao insuranceInfoDao;

    @Override
    public int updateInsuranceInfoList(Insurance ins) {
        return insuranceInfoDao.updateInsuranceInfoList(ins);
    }

}
