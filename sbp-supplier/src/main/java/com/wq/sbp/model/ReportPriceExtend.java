package com.wq.sbp.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * IbsReportPriceExtend 实体类
 * 2017-08-18
 */
public class ReportPriceExtend {

    // 主键 自增序列
    private Integer id;

    // 询价单id
    private Integer insId;

    // 供应商id
    private Integer supplierId;

    // 供应商会员Id
    private Integer supplierMemberId;

    // 询价方id（维修厂会员ID）
    private Integer memberId;

    // 物流费用
    private BigDecimal expressMoney;

    // 备注
    private String remark;

    // 税率
    private Integer taxRate;

    // 状态: 0.未报价，1.已报价
    private Integer reportState;

    // 报价截止时间
    private Date quoteDeadline;

    // 发送询价时间
    private Date createDate;

    // 最后一次修改时间
    private Date gmtModify;

    // 报价时间
    private Date gmtQuote;

    // 下单时间
    private Date gmtOrder;

    // 是否发送语音提醒成功
    private String isVoice;

    // 供应商类型0:品牌1:专项件
    private String supType;

    // 自动语音提醒次数
    private String autoVoiceCount;

    // 是否已经查看0:否,1:是
    private Integer isRead;

    List<ReportPrice> listRP;

    // 符号0:小于1:大于
    private Integer mark;

    private String[] insReportStates;

    private String insReportStatesStr;

    private String param1;

    private String param2;

    public String getInsReportStatesStr() {
        return insReportStatesStr;
    }

    public void setInsReportStatesStr(String insReportStatesStr) {
        this.insReportStatesStr = insReportStatesStr;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String parm1) {
        this.param1 = parm1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public String[] getInsReportStates() {
        return insReportStates;
    }

    public void setInsReportStates(String[] insReportStates) {
        this.insReportStates = insReportStates;
    }

    public List<ReportPrice> getListRP() {
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

    public void setListRP(List<ReportPrice> listRP) {
        this.listRP = listRP;
    }

    /**
     * 主键 自增序列
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 主键 自增序列
     */
    public Integer getId() {
        return id;
    }

    /**
     * 询价单id
     */
    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    /**
     * 询价单id
     */
    public Integer getInsId() {
        return insId;
    }

    /**
     * 供应商id
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * 供应商id
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * 供应商会员Id
     */
    public void setSupplierMemberId(Integer supplierMemberId) {
        this.supplierMemberId = supplierMemberId;
    }

    /**
     * 供应商会员Id
     */
    public Integer getSupplierMemberId() {
        return supplierMemberId;
    }

    /**
     * 询价方id（维修厂会员ID）
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 询价方id（维修厂会员ID）
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 物流费用
     */
    public void setExpressMoney(BigDecimal expressMoney) {
        this.expressMoney = expressMoney;
    }

    /**
     * 物流费用
     */
    public BigDecimal getExpressMoney() {
        return expressMoney;
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
     * 状态: 0.未报价，1.已报价
     */
    public void setReportState(Integer reportState) {
        this.reportState = reportState;
    }

    /**
     * 状态: 0.未报价，1.已报价
     */
    public Integer getReportState() {
        return reportState;
    }

    /**
     * 报价截止时间
     */
    public void setQuoteDeadline(Date quoteDeadline) {
        this.quoteDeadline = quoteDeadline;
    }

    /**
     * 报价截止时间
     */
    public Date getQuoteDeadline() {
        return quoteDeadline;
    }

    /**
     * 发送询价时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 发送询价时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 最后一次修改时间
     */
    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    /**
     * 最后一次修改时间
     */
    public Date getGmtModify() {
        return gmtModify;
    }

    /**
     * 报价时间
     */
    public void setGmtQuote(Date gmtQuote) {
        this.gmtQuote = gmtQuote;
    }

    /**
     * 报价时间
     */
    public Date getGmtQuote() {
        return gmtQuote;
    }

    /**
     * 下单时间
     */
    public void setGmtOrder(Date gmtOrder) {
        this.gmtOrder = gmtOrder;
    }

    /**
     * 下单时间
     */
    public Date getGmtOrder() {
        return gmtOrder;
    }

    /**
     * 是否发送语音提醒成功
     */
    public void setIsVoice(String isVoice) {
        this.isVoice = isVoice;
    }

    /**
     * 是否发送语音提醒成功
     */
    public String getIsVoice() {
        return isVoice;
    }

    /**
     * 供应商类型0:品牌1:专项件
     */
    public void setSupType(String supType) {
        this.supType = supType;
    }

    /**
     * 供应商类型0:品牌1:专项件
     */
    public String getSupType() {
        return supType;
    }

    /**
     * 自动语音提醒次数
     */
    public void setAutoVoiceCount(String autoVoiceCount) {
        this.autoVoiceCount = autoVoiceCount;
    }

    /**
     * 自动语音提醒次数
     */
    public String getAutoVoiceCount() {
        return autoVoiceCount;
    }

}
