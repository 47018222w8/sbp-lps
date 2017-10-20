package com.wq.sbp.service.impl;

import org.sbp.common.model.CommonConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wq.sbp.dao.InsuranceDao;
import com.wq.sbp.model.InsuranceDO;
import com.wq.sbp.model.InsurancePageParamDTO;
import com.wq.sbp.service.InsuranceService;

/**
 * 询价单相关业务
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
@Service
public class InsuranceServiceImpl implements InsuranceService {

    @Autowired
    private InsuranceDao insuranceDao;

    @Override
    public InsuranceDO getInsurance(InsuranceDO ins) {
        return insuranceDao.getInsurance(ins);
    }

    @Override
    public PageInfo<InsuranceDO> listInsurance(InsurancePageParamDTO ipp) {
        ipp.setParam1(CommonConstants.EAUTO100_IMG_VISIT);
        ipp.setParam2(CommonConstants.EAUTO100_IMG_SAVE);
        PageHelper.startPage(ipp.getPageNum(), ipp.getPageSize());
        return new PageInfo<>(insuranceDao.listInsurance(ipp));
    }

    @Override
    public int countInsurance(InsurancePageParamDTO ipp) {
        return insuranceDao.countInsurance(ipp);
    }

}
