package com.wq.sbp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wq.sbp.common.constants.Constants;
import com.wq.sbp.dao.InsuranceDao;
import com.wq.sbp.dao.ReportPriceDao;
import com.wq.sbp.dao.ReportPriceExtendDao;
import com.wq.sbp.model.Insurance;
import com.wq.sbp.model.PageHelperParam;
import com.wq.sbp.model.Quote;
import com.wq.sbp.model.ReportPrice;
import com.wq.sbp.model.ReportPriceExtend;
import com.wq.sbp.service.QuoteService;

@Service
public class QuoteServiceImpl implements QuoteService {

    @Autowired
    private ReportPriceExtendDao reportPriceExtendDao;

    @Autowired
    private InsuranceDao insuranceDao;

    @Autowired
    private ReportPriceDao reportPriceDao;

    @Override
    public PageInfo<Quote> getQuoteList(ReportPriceExtend rpe, PageHelperParam param) {
        rpe.setParam1(Constants.EAUTO100_IMG_VISIT);
        rpe.setParam2(Constants.EAUTO100_IMG_SAVE);
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        return new PageInfo<Quote>(reportPriceExtendDao.selectQuoteListBySupId(rpe));
    }

    @Override
    public JSONObject getQuoteInfo(ReportPrice rp, Insurance insurance) {
        JSONObject jo = new JSONObject();
        jo.put("ins", insuranceDao.selectInsuranceById(insurance));
        jo.put("list", reportPriceDao.selectInsuranceInfoByInsIdAndSupId(rp));
        return jo;
    }

}
