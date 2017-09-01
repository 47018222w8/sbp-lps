package com.wq.sbp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.ReportPrice;

@Mapper
public interface ReportPriceDao {

    /**
     * 
     *
     * @return
     *
     * @author zwq
     * @since 2017年8月22日
     */
    List<ReportPrice> selectInsuranceInfoByInsIdAndSupId(ReportPrice rp);
}
