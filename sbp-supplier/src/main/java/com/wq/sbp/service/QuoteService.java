package com.wq.sbp.service;

import com.github.pagehelper.PageInfo;
import com.wq.sbp.model.PageHelperParam;
import com.wq.sbp.model.Quote;
import com.wq.sbp.model.ReportPriceExtend;

public interface QuoteService {

    PageInfo<Quote> getQuoteList(ReportPriceExtend rpe, PageHelperParam param);
}
