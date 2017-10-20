package com.wq.sbp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.ReportPriceInfoDO;

/**
 * ReportPriceInfoDao
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
@Mapper
public interface ReportPriceInfoDao {

    /**
     * 批量插入
     * 
     * @param list
     * @return int
     *
     * @author zwq
     * @date 2017年10月16日
     */
    int saveReportPriceInfo(List<ReportPriceInfoDO> list);
}
