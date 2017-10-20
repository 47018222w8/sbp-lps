package com.wq.sbp.service;

import org.springframework.http.ResponseEntity;

import com.wq.sbp.model.ReportPriceExtendDO;

/**
 * 报价相关业务
 *
 *
 * @author zwq
 * @since 2017年9月19日
 */
public interface QuoteService {
    /**
     * 报价
     * 
     * @param reportPriceExtend
     * @return ResponseEntity
     *
     * @author zwq
     * @date 2017年10月16日
     */
    ResponseEntity<?> saveQuote(ReportPriceExtendDO reportPriceExtend);
}
