package com.wq.sbp.service;

import java.util.List;

import com.wq.sbp.model.ReportPriceDO;
/**
 * ReportPriceService
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
public interface ReportPriceService {
    /**
     * 列表
     * 
     * @param reportPrice
     * @return list
     *
     * @author zwq
     * @date 2017年10月16日
     */
    List<ReportPriceDO> listReportPrice(ReportPriceDO reportPrice);
}
