package com.wq.sbp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.ReportPriceDO;

/**
 * ReportPriceDao
 * 
 * @author zwq
 * @date 2017年10月16日
 */
@Mapper
public interface ReportPriceDao {

    /**
     * 所属该供应商的报价单中的零件
     * 
     * @param reportPrice state
     * @return list
     *
     * @author zwq
     * @date 2017年10月16日
     */
    List<ReportPriceDO> listReportPrice(ReportPriceDO reportPrice);


    /**
     * 更新
     * 
     * @param reportPrice
     * @return int 
     *
     * @author zwq
     * @date 2017年10月16日
     */
    int updateReportPriceById(ReportPriceDO reportPrice);

    /**
     * 删除
     * 
     * @param reportPriceId
     * @return int
     *
     * @author zwq
     * @date 2017年10月16日
     */
    int removeReportPriceInfoByRPIId(Integer reportPriceId);
}
