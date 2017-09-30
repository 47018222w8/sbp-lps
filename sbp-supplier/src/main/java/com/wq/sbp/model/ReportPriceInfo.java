package com.wq.sbp.model;

import java.math.BigDecimal;

/**
 * IbsReportPriceInfo 实体类
 * 2017-08-31
 */
public class ReportPriceInfo {

    // 这家伙很懒,没有留下注释
    private Integer id;

    // ibs_report_price的ID
    private Integer reportPriceId;

    // 报价金额类别ID
    private Integer propertyId;

    // 报价金额
    private BigDecimal reportPrice;

    // 中标状态：0：未中标 1：已中标
    private Integer reportState;

    // 创建时间（精确到时分秒）
    private Long createTime;

    // 可发货时间（对应 t_property 例如 1: 现货，马上可以发货 2 ：明天可以发货 3: 后天可以发货 4 ：需要更多时间备货）
    private String canShipDateBs;

    private String canShipDateBsStr;

    // 备注
    private String remark;

    // 税率
    private Integer taxRate;

    // 是否报价，0.未报价，1.已报价
    private Integer isQuote;

    // 报价零件品质（对应t_property表中id）
    private Integer qualityRequirement;

    // 目标价
    private String targetPrice;

    public String getCanShipDateBsStr() {
        return canShipDateBsStr;
    }

    public void setCanShipDateBsStr(String canShipDateBsStr) {
        this.canShipDateBsStr = canShipDateBsStr;
    }

    /**
     * 这家伙很懒,没有留下注释
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 这家伙很懒,没有留下注释
     */
    public Integer getId() {
        return id;
    }

    /**
     * ibs_report_price的ID
     */
    public void setReportPriceId(Integer reportPriceId) {
        this.reportPriceId = reportPriceId;
    }

    /**
     * ibs_report_price的ID
     */
    public Integer getReportPriceId() {
        return reportPriceId;
    }

    /**
     * 报价金额类别ID
     */
    public void setPropertyId(Integer propertyId) {
        this.propertyId = propertyId;
    }

    /**
     * 报价金额类别ID
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * 报价金额
     */
    public void setReportPrice(BigDecimal reportPrice) {
        this.reportPrice = reportPrice;
    }

    /**
     * 报价金额
     */
    public BigDecimal getReportPrice() {
        return reportPrice;
    }

    /**
     * 中标状态：0：未中标 1：已中标
     */
    public void setReportState(Integer reportState) {
        this.reportState = reportState;
    }

    /**
     * 中标状态：0：未中标 1：已中标
     */
    public Integer getReportState() {
        return reportState;
    }

    /**
     * 创建时间（精确到时分秒）
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建时间（精确到时分秒）
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 可发货时间（对应 t_property 例如 1: 现货，马上可以发货 2 ：明天可以发货 3: 后天可以发货 4 ：需要更多时间备货）
     */
    public void setCanShipDateBs(String canShipDateBs) {
        this.canShipDateBs = canShipDateBs;
    }

    /**
     * 可发货时间（对应 t_property 例如 1: 现货，马上可以发货 2 ：明天可以发货 3: 后天可以发货 4 ：需要更多时间备货）
     */
    public String getCanShipDateBs() {
        return canShipDateBs;
    }

    /**
     * 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 税率
     */
    public void setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * 税率
     */
    public Integer getTaxRate() {
        return taxRate;
    }

    /**
     * 是否报价，0.未报价，1.已报价
     */
    public void setIsQuote(Integer isQuote) {
        this.isQuote = isQuote;
    }

    /**
     * 是否报价，0.未报价，1.已报价
     */
    public Integer getIsQuote() {
        return isQuote;
    }

    /**
     * 报价零件品质（对应t_property表中id）
     */
    public void setQualityRequirement(Integer qualityRequirement) {
        this.qualityRequirement = qualityRequirement;
    }

    /**
     * 报价零件品质（对应t_property表中id）
     */
    public Integer getQualityRequirement() {
        return qualityRequirement;
    }

    /**
     * 目标价
     */
    public void setTargetPrice(String targetPrice) {
        this.targetPrice = targetPrice;
    }

    /**
     * 目标价
     */
    public String getTargetPrice() {
        return targetPrice;
    }
}
