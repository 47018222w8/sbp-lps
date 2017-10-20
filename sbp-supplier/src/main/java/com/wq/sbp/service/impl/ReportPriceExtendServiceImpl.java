package com.wq.sbp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wq.sbp.dao.ReportPriceExtendDao;
import com.wq.sbp.model.ReportPriceExtendDO;
import com.wq.sbp.service.ReportPriceExtendService;
/**
 * ReportPriceExtendServiceImpl
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
@Service
public class ReportPriceExtendServiceImpl implements ReportPriceExtendService {

    @Autowired
    private ReportPriceExtendDao reportPriceExtendDao;

    @Override
    public int updateReportPriceExtend(ReportPriceExtendDO rpe) {
        return reportPriceExtendDao.updateReportPriceExtend(rpe);
    }

}
