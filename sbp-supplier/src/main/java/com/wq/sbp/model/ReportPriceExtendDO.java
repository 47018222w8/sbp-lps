package com.wq.sbp.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * IbsReportPriceExtend 实体类
 * 
 * @date 2017-08-18
 * @author zwq
 */
public class ReportPriceExtendDO {

    private Integer id;

    /**
     * 询价单id
     * 
     * @author zwq
     */
    private Integer insId;

    private Integer supplierId;

    /**
     * 供应商memberId
     * 
     * @author zwq
     */
    private Integer supplierMemberId;

    /**
     * 维修厂memberId(历史遗留问题)
     * 
     * @author zwq
     */
    private Integer memberId;

    /**
     * 物流费用
     * 
     * @author zwq
     */
    private BigDecimal expressMoney;

    /**
     * 备注
     * 
     * @author zwq
     */
    private String remark;

    /**
     * 税率
     * 
     * @author zwq
     */
    private Integer taxRate;

    /**
     * 状态: 0.未报价，1.已报价
     * 
     * @author zwq
     */
    private Integer reportState;

    /**
     * 报价截止时间
     * 
     * @author zwq
     */
    private String quoteDeadline;

    /**
     * 询价时间
     * 
     * @author zwq
     */
    private String createDate;

    /**
     * 最后一次修改时间
     * 
     * @author zwq
     */
    private String gmtModify;

    /**
     * 报价时间
     * 
     * @author zwq
     */
    private String gmtQuote;

    /**
     * 下单时间
     * 
     * @author zwq
     */
    private String gmtOrder;

    /**
     * 是否发送语音提醒成功
     * 
     * @author zwq
     */
    private String isVoice;

    /**
     * 供应商类型0:品牌1:专项件
     * 
     * @author zwq
     */
    private String supType;

    /**
     * 自动语音提醒次数
     * 
     * @author zwq
     */
    private Integer autoVoiceCount;

    /**
     * 是否已经查看0:否,1:是
     * 
     * @author zwq
     */
    private Integer isRead;

    /**
     * 供应商零件列表
     * 
     * @author zwq
     */
    List<ReportPriceDO> listRP;

    /**
     * 符号0:小于1:大于
     * 
     * @author zwq
     */
    private Integer mark;

    @Override
    public String toString() {
        return "ReportPriceExtendDO [id=" + id
                + ", insId="
                + insId
                + ", supplierId="
                + supplierId
                + ", supplierMemberId="
                + supplierMemberId
                + ", memberId="
                + memberId
                + ", expressMoney="
                + expressMoney
                + ", remark="
                + remark
                + ", taxRate="
                + taxRate
                + ", reportState="
                + reportState
                + ", quoteDeadline="
                + quoteDeadline
                + ", createDate="
                + createDate
                + ", gmtModify="
                + gmtModify
                + ", gmtQuote="
                + gmtQuote
                + ", gmtOrder="
                + gmtOrder
                + ", isVoice="
                + isVoice
                + ", supType="
                + supType
                + ", autoVoiceCount="
                + autoVoiceCount
                + ", isRead="
                + isRead
                + ", listRP="
                + listRP
                + ", mark="
                + mark
                + "]";
    }

    public List<ReportPriceDO> getListRP() {
        return listRP;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public void setListRP(List<ReportPriceDO> listRP) {
        this.listRP = listRP;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    /**
     * 询价单id
     * 
     * @author zwq
     */
    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    /**
     * 询价单id
     * 
     * @author zwq
     */
    public Integer getInsId() {
        return insId;
    }

    /**
     * 供应商id
     * 
     * @author zwq
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * 供应商id
     * 
     * @author zwq
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * 供应商会员Id
     * 
     * @author zwq
     */
    public void setSupplierMemberId(Integer supplierMemberId) {
        this.supplierMemberId = supplierMemberId;
    }

    /**
     * 供应商会员Id
     * 
     * @author zwq
     */
    public Integer getSupplierMemberId() {
        return supplierMemberId;
    }

    /**
     * 询价方id（维修厂会员ID）
     * 
     * @author zwq
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 询价方id（维修厂会员ID）
     * 
     * @author zwq
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 物流费用
     * 
     * @author zwq
     */
    public void setExpressMoney(BigDecimal expressMoney) {
        this.expressMoney = expressMoney;
    }

    /**
     * 物流费用
     * 
     * @author zwq
     */
    public BigDecimal getExpressMoney() {
        return expressMoney;
    }

    /**
     * 备注
     * 
     * @author zwq
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 备注
     * 
     * @author zwq
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 税率
     * 
     * @author zwq
     */
    public void setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
    }

    /**
     * 税率
     * 
     * @author zwq
     */
    public Integer getTaxRate() {
        return taxRate;
    }

    /**
     * 状态: 0.未报价，1.已报价
     * 
     * @author zwq
     */
    public void setReportState(Integer reportState) {
        this.reportState = reportState;
    }

    /**
     * 状态: 0.未报价，1.已报价
     * 
     * @author zwq
     */
    public Integer getReportState() {
        return reportState;
    }

    /**
     * 报价截止时间
     * 
     * @author zwq
     */
    public void setQuoteDeadline(String quoteDeadline) {
        this.quoteDeadline = quoteDeadline;
    }

    /**
     * 报价截止时间
     * 
     * @author zwq
     */
    public String getQuoteDeadline() {
        return quoteDeadline;
    }

    /**
     * 发送询价时间
     * 
     * @author zwq
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * 发送询价时间
     * 
     * @author zwq
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * 最后一次修改时间
     * 
     * @author zwq
     */
    public void setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * 最后一次修改时间
     * 
     * @author zwq
     */
    public String getGmtModify() {
        return gmtModify;
    }

    /**
     * 报价时间
     * 
     * @author zwq
     */
    public void setGmtQuote(String gmtQuote) {
        this.gmtQuote = gmtQuote;
    }

    /**
     * 报价时间
     * 
     * @author zwq
     */
    public String getGmtQuote() {
        return gmtQuote;
    }

    /**
     * 下单时间
     * 
     * @author zwq
     */
    public void setGmtOrder(String gmtOrder) {
        this.gmtOrder = gmtOrder;
    }

    /**
     * 下单时间
     * 
     * @author zwq
     */
    public String getGmtOrder() {
        return gmtOrder;
    }

    /**
     * 是否发送语音提醒成功
     * 
     * @author zwq
     */
    public void setIsVoice(String isVoice) {
        this.isVoice = isVoice;
    }

    /**
     * 是否发送语音提醒成功
     * 
     * @author zwq
     */
    public String getIsVoice() {
        return isVoice;
    }

    /**
     * 供应商类型0:品牌1:专项件
     * 
     * @author zwq
     */
    public void setSupType(String supType) {
        this.supType = supType;
    }

    /**
     * 供应商类型0:品牌1:专项件
     * 
     * @author zwq
     */
    public String getSupType() {
        return supType;
    }

    /**
     * 自动语音提醒次数
     * 
     * @author zwq
     */
    public void setAutoVoiceCount(Integer autoVoiceCount) {
        this.autoVoiceCount = autoVoiceCount;
    }

    /**
     * 自动语音提醒次数
     * 
     * @author zwq
     */
    public Integer getAutoVoiceCount() {
        return autoVoiceCount;
    }

}
