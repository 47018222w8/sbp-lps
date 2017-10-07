package com.wq.sbp.model;

import java.util.List;

import com.github.pagehelper.PageInfo;

/**
 * 报价展示的各种数据
 *
 *
 * @author zwq
 * @since 2017年8月22日
 */
public class QuoteDTO {

    // 静态资源前缀
    private String domain;

    // 主表列表
    private PageInfo<Insurance> insurancePage;

    // 未读询价单数
    private int notReadCount;

    private Insurance ins;

    private List<ReportPrice> reportPriceList;

    private List<Property> qualityList;

    public List<ReportPrice> getReportPriceList() {
        return reportPriceList;
    }

    public void setReportPriceList(List<ReportPrice> reportPriceList) {
        this.reportPriceList = reportPriceList;
    }

    public List<Property> getQualityList() {
        return qualityList;
    }

    public void setQualityList(List<Property> qualityList) {
        this.qualityList = qualityList;
    }

    public Insurance getIns() {
        return ins;
    }

    public void setIns(Insurance ins) {
        this.ins = ins;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public PageInfo<Insurance> getInsurancePage() {
        return insurancePage;
    }

    public void setInsurancePage(PageInfo<Insurance> insurancePage) {
        this.insurancePage = insurancePage;
    }

    public int getNotReadCount() {
        return notReadCount;
    }

    public void setNotReadCount(int notReadCount) {
        this.notReadCount = notReadCount;
    }

}
