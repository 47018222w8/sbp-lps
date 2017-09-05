package com.wq.sbp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.QuoteDTO;
import com.wq.sbp.model.ReportPriceExtendDO;

@Mapper
public interface ReportPriceExtendDao {

    List<QuoteDTO> listQuoteListBySupId(ReportPriceExtendDO rpe);
    
    int updateReportPriceExtendSelective(ReportPriceExtendDO rpe);
}
