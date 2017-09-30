package com.wq.sbp.service;

import com.wq.sbp.model.ReportPriceExtend;

public interface ReportPriceExtendService {

    int countQuote(ReportPriceExtend rpe);

    int updateReportPriceExtend(ReportPriceExtend rpe);
}
