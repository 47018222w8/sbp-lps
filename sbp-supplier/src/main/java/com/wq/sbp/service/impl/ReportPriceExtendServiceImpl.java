package com.wq.sbp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wq.sbp.dao.ReportPriceExtendDao;
import com.wq.sbp.model.ReportPriceExtend;
import com.wq.sbp.service.ReportPriceExtendService;

@Service
public class ReportPriceExtendServiceImpl implements ReportPriceExtendService {

    @Autowired
    private ReportPriceExtendDao reportPriceExtendDao;

    @Override
    public int updateReportPriceExtend(ReportPriceExtend rpe) {
        return reportPriceExtendDao.updateReportPriceExtend(rpe);
    }

    @Override
    public int countQuote(ReportPriceExtend rpe) {
        return reportPriceExtendDao.countReportPriceExtend(rpe);
    }
}
