package com.wq.sbp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wq.sbp.common.constants.Constants;
import com.wq.sbp.dao.InsuranceDao;
import com.wq.sbp.model.Insurance;
import com.wq.sbp.model.PageHelperParam;
import com.wq.sbp.model.ReportPriceExtend;
import com.wq.sbp.service.InsuranceService;

@Service
public class InsuranceServiceImpl implements InsuranceService {

    @Autowired
    private InsuranceDao insuranceDao;

    @Override
    public Insurance getInsurance(Insurance ins) {
        return insuranceDao.getInsurance(ins);
    }

    @Override
    public PageInfo<Insurance> listInsurance(ReportPriceExtend rpe, PageHelperParam param) {
        rpe.setParam1(Constants.EAUTO100_IMG_VISIT);
        rpe.setParam2(Constants.EAUTO100_IMG_SAVE);
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        return new PageInfo<>(insuranceDao.listInsurance(rpe));
    }

    @Override
    public int countInsurance(ReportPriceExtend rpe) {
        return insuranceDao.countInsurance(rpe);
    }

}
