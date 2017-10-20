package com.wq.sbp.model;

import java.math.BigDecimal;

/**
 * IbsReportPriceInfo 实体类
 * 
 * @date 2017-08-31
 * @author zwq
 */
public class ReportPriceInfoDO {

    private Integer id;

    private Integer reportPriceId;

    private Integer propertyId;

    /**
     * 报价金额
     * 
     * @author zwq
     */
    private BigDecimal reportPrice;

    /**
     * 中标状态：0：未中标 1：已中标
     * 
     * @author zwq
     */
    private Integer reportState;

    private Long createTime;

    private String canShipDateBs;

    private String canShipDateBsStr;

    private String remark;

    private Integer taxRate;

    /**
     * 是否报价，0.未报价，1.已报价
     * 
     * @author zwq
     */
    private Integer isQuote;

    /**
     * 报价零件品质（对应t_property表中id）
     * 
     * @author zwq
     */
    private Integer qualityRequirement;

    private String targetPrice;

    @Override
    public String toString() {
        return "ReportPriceInfoDO [id=" + id
                + ", reportPriceId="
                + reportPriceId
                + ", propertyId="
                + propertyId
                + ", reportPrice="
                + reportPrice
                + ", reportState="
                + reportState
                + ", createTime="
                + createTime
                + ", canShipDateBs="
                + canShipDateBs
                + ", canShipDateBsStr="
                + canShipDateBsStr
                + ", remark="
                + remark
                + ", taxRate="
                + taxRate
                + ", isQuote="
                + isQuote
                + ", qualityRequirement="
                + qualityRequirement
                + ", targetPrice="
                + targetPrice
                + "]";
    }

    public String getCanShipDateBsStr() {
        return canShipDateBsStr;
    }

    public void setCanShipDateBsStr(String canShipDateBsStr) {
        this.canShipDateBsStr = canShipDateBsStr;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setReportPriceId(Integer reportPriceId) {
        this.reportPriceId = reportPriceId;
    }

    public Integer getReportPriceId() {
        return reportPriceId;
    }

    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    public Integer getPropertyId() {
        return propertyId;
    }

    public void setReportPrice(BigDecimal reportPrice) {
        this.reportPrice = reportPrice;
    }

    public BigDecimal getReportPrice() {
        return reportPrice;
    }

    public void setReportState(Integer reportState) {
        this.reportState = reportState;
    }

    public Integer getReportState() {
        return reportState;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCanShipDateBs(String canShipDateBs) {
        this.canShipDateBs = canShipDateBs;
    }

    public String getCanShipDateBs() {
        return canShipDateBs;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
    }

    public Integer getTaxRate() {
        return taxRate;
    }

    public void setIsQuote(Integer isQuote) {
        this.isQuote = isQuote;
    }

    public Integer getIsQuote() {
        return isQuote;
    }

    public void setQualityRequirement(Integer qualityRequirement) {
        this.qualityRequirement = qualityRequirement;
    }

    public Integer getQualityRequirement() {
        return qualityRequirement;
    }

    public void setTargetPrice(String targetPrice) {
        this.targetPrice = targetPrice;
    }

    public String getTargetPrice() {
        return targetPrice;
    }
}
