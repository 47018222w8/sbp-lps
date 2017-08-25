package com.wq.sbp.service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.wq.sbp.model.Insurance;
import com.wq.sbp.model.PageHelperParam;
import com.wq.sbp.model.Quote;
import com.wq.sbp.model.ReportPrice;
import com.wq.sbp.model.ReportPriceExtend;

public interface QuoteService {

    PageInfo<Quote> getQuoteList(ReportPriceExtend rpe, PageHelperParam param);
    
    JSONObject getQuoteInfo(ReportPrice rp,Insurance insurance);
}
