package com.wq.sbp.dao;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.ReportPriceExtendDO;

/**
 * ReportPriceExtendDao
 * 
 * @author zwq
 * @date 2017年10月16日
 */
@Mapper
public interface ReportPriceExtendDao {

    /**
     * 更新
     * 
     * @param reportPriceExtend
     * @return int
     *
     * @author zwq
     * @date 2017年10月16日
     */
    int updateReportPriceExtend(ReportPriceExtendDO reportPriceExtend);
}
