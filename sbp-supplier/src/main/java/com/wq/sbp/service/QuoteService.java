package com.wq.sbp.service;

import org.springframework.http.ResponseEntity;

import com.wq.sbp.model.ReportPriceExtend;

/**
 * 报价相关业务
 *
 *
 * @author zwq
 * @since 2017年9月19日
 */
public interface QuoteService {

    ResponseEntity<?> saveQuote(ReportPriceExtend rpe);
}
