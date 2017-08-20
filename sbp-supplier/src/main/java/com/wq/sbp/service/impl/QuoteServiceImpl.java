package com.wq.sbp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wq.sbp.dao.ReportPriceExtendDao;
import com.wq.sbp.model.PageHelperParam;
import com.wq.sbp.model.Quote;
import com.wq.sbp.model.ReportPriceExtend;
import com.wq.sbp.service.QuoteService;

@Service
public class QuoteServiceImpl implements QuoteService {

    @Autowired
    private ReportPriceExtendDao reportPriceExtendDao;

    @Override
    public PageInfo<Quote> getQuoteList(ReportPriceExtend rpe, PageHelperParam param) {
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        return new PageInfo<Quote>(reportPriceExtendDao.selectQuoteListBySupId(rpe));
    }

}
