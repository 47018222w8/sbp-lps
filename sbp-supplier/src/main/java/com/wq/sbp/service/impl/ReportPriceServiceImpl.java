package com.wq.sbp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wq.sbp.dao.ReportPriceDao;
import com.wq.sbp.model.ReportPriceDO;
import com.wq.sbp.service.ReportPriceService;
/**
 * ReportPriceServiceImpl
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
@Service
public class ReportPriceServiceImpl implements ReportPriceService {

    @Autowired
    private ReportPriceDao reportPriceDao;

    @Override
    public List<ReportPriceDO> listReportPrice(ReportPriceDO rp) {
        return reportPriceDao.listReportPrice(rp);
    }
}
