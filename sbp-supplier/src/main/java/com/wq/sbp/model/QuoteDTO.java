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

    /**
     * 静态资源前缀
     * 
     * @author zwq
     */
    private String domain;

    /**
     * 询价单列表
     * 
     * @author zwq
     */
    private PageInfo<InsuranceDO> insurancePage;

    /**
     * 未读询价单数
     * 
     * @author zwq
     */
    private Integer notReadCount;

    private InsuranceDO ins;

    private List<ReportPriceDO> reportPriceList;

    private List<PropertyDO> qualityList;

    @Override
    public String toString() {
        return "QuoteDTO [domain=" + domain
                + ", insurancePage="
                + insurancePage
                + ", notReadCount="
                + notReadCount
                + ", ins="
                + ins
                + ", reportPriceList="
                + reportPriceList
                + ", qualityList="
                + qualityList
                + "]";
    }

    public List<ReportPriceDO> getReportPriceList() {
        return reportPriceList;
    }

    public void setReportPriceList(List<ReportPriceDO> reportPriceList) {
        this.reportPriceList = reportPriceList;
    }

    public List<PropertyDO> getQualityList() {
        return qualityList;
    }

    public void setQualityList(List<PropertyDO> qualityList) {
        this.qualityList = qualityList;
    }

    public InsuranceDO getIns() {
        return ins;
    }

    public void setIns(InsuranceDO ins) {
        this.ins = ins;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public PageInfo<InsuranceDO> getInsurancePage() {
        return insurancePage;
    }

    public void setInsurancePage(PageInfo<InsuranceDO> insurancePage) {
        this.insurancePage = insurancePage;
    }

    public Integer getNotReadCount() {
        return notReadCount;
    }

    public void setNotReadCount(Integer notReadCount) {
        this.notReadCount = notReadCount;
    }

}
