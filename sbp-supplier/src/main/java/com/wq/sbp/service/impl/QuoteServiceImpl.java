package com.wq.sbp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wq.sbp.dao.ReportPriceExtendDao;
import com.wq.sbp.model.Quote;
import com.wq.sbp.model.ReportPriceExtend;
import com.wq.sbp.service.QuoteService;

@Service
public class QuoteServiceImpl implements QuoteService {

    @Autowired
    private ReportPriceExtendDao reportPriceExtendDao;

    @Override
    public List<Quote> getQuoteList(ReportPriceExtend rpe) {
        return reportPriceExtendDao.selectQuoteListBySupId(rpe);
    }

}
