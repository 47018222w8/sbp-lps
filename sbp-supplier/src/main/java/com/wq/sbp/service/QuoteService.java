package com.wq.sbp.service;

import java.util.List;

import com.wq.sbp.model.Quote;
import com.wq.sbp.model.ReportPriceExtend;

public interface QuoteService {

    List<Quote> getQuoteList(ReportPriceExtend rpe);
}
