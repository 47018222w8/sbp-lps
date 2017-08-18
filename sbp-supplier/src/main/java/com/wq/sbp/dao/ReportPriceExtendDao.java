package com.wq.sbp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.Quote;
import com.wq.sbp.model.ReportPriceExtend;

@Mapper
public interface ReportPriceExtendDao {

    List<Quote> selectQuoteListBySupId(ReportPriceExtend rpe);
}
