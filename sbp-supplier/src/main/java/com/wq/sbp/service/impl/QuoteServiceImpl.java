package com.wq.sbp.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
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

    @Resource
    private RedisTemplate<String, String> redisTemplate;

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
        insurance.setParm1(Constants.DOMAIN);
        jo.put("ins", insuranceDao.selectInsuranceById(insurance));
        jo.put("insInfoList", reportPriceDao.selectInsuranceInfoByInsIdAndSupId(rp));
        jo.put("qualityList", JSON.parseArray(redisTemplate.opsForValue().get(Constants.CACHE_QUALITY_PROPERTY)));
        return jo;
    }

}
