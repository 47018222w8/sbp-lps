package com.wq.sbp.service;

import com.wq.sbp.model.ReportPriceExtend;
import com.wq.sbp.model.ResultVO;

/**
 * 报价相关业务
 *
 *
 * @author zwq
 * @since 2017年9月19日
 */
public interface QuoteService {

    ResultVO saveQuote(ReportPriceExtend rpe, Integer memberId);
}
