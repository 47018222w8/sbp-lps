package com.wq.sbp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.ReportPriceDO;
import com.wq.sbp.model.ReportPriceInfoDO;

@Mapper
public interface ReportPriceDao {

    /**
     * 报价列表
     *
     * @return
     *
     * @author zwq
     * @since 2017年8月22日
     */
    List<ReportPriceDO> listInsuranceInfoByInsIdAndSupId(ReportPriceDO rp);

    /**
     * 批量添加表ibs_report_price_info
     *
     * @param list
     *
     * @author zwq
     * @since 2017年9月5日
     */
    int saveReportPriceInfo(List<ReportPriceInfoDO> list);

    int updateReportPriceById(ReportPriceDO rp);

    int removeReportPriceInfoByRPIId(Integer reportPriceId);
}
