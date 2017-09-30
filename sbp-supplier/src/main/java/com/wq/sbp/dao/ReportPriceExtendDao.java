package com.wq.sbp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.QuoteDTO;
import com.wq.sbp.model.ReportPriceExtend;

@Mapper
public interface ReportPriceExtendDao {

    int countReportPriceExtend(ReportPriceExtend rpe);

    List<QuoteDTO> listReportPriceExtend(ReportPriceExtend rpe);

    int updateReportPriceExtend(ReportPriceExtend rpe);
}
