package com.wq.sbp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wq.sbp.dao.ReportPriceDao;
import com.wq.sbp.model.ReportPrice;
import com.wq.sbp.service.ReportPriceService;

@Service
public class ReportPriceServiceImpl implements ReportPriceService {

    @Autowired
    private ReportPriceDao reportPriceDao;

    @Override
    public List<ReportPrice> listReportPrice(ReportPrice rp) {
        return reportPriceDao.listReportPrice(rp);
    }
}
