package com.wq.sbp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.ReportPrice;
import com.wq.sbp.model.ReportPriceInfo;

@Mapper
public interface ReportPriceDao {

    List<ReportPrice> listReportPrice(ReportPrice rp);

    int saveReportPriceInfo(List<ReportPriceInfo> list);

    int updateReportPriceById(ReportPrice rp);

    int removeReportPriceInfoByRPIId(Integer reportPriceId);
}
