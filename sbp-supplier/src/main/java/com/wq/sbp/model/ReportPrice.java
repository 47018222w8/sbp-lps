package com.wq.sbp.model;

import java.math.BigDecimal;

/**
 * IbsReportPrice 实体类
 * 2017-08-22
 */
public class ReportPrice {

    // 这家伙很懒,没有留下注释
    private Integer id;

    // 定损单ID
    private Integer insId;

    // ibs_insurance_info中id
    private Integer insInfoId;

    // 原厂编码
    private String sn;

    // 报价金额
    private BigDecimal price;

    // 报价金额属性
    private Integer pricePropertyId;

    // 推送保险公司价格
    private BigDecimal insPrice;

    // 推送维修厂价格
    private BigDecimal reparierPrice;

    // 供应商id
    private Integer supplierId;

    // 1：原厂件， 2：同质件，3：拆车件，4：副厂件
    private String comType;

    // 零件品牌
    private Integer goodsBrandId;

    // 是否原标：0否 1是
    private String isFactory;

    // 状态0:未报价 1:已过期 2:已报价 3中标 4已发货
    private String state;

    // 1:在线报价 2:电话询价
    private String reportType;

    // 报价时间(精确到时分秒)
    private Long reportTime;

    // 要求到货日期(精确到日期)
    private Long arrivedDate;

    // 可交货时间(精确到日期)
    private Long sendDate;

    // 创建日期(精确到时分秒)
    private Long createTime;

    // 保险询价公司
    private Integer sendCompanyId;

    // member_id
    private Integer memberId;

    // 微信open_id
    private String openId;

    // 流程类型
    private Integer processType;

    // 目标价
    private BigDecimal targetPrice;

    // 是否经营该产品（0: 经营 1:不经营 ， 默认是0 ）

    private String isOperProd;

    private String parm1;

    private String parm2;

    public String getParm1() {
        return parm1;
    }

    public void setParm1(String parm1) {
        this.parm1 = parm1;
    }

    public String getParm2() {
        return parm2;
    }

    public void setParm2(String parm2) {
        this.parm2 = parm2;
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
     * 定损单ID
     */
    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    /**
     * 定损单ID
     */
    public Integer getInsId() {
        return insId;
    }

    /**
     * ibs_insurance_info中id
     */
    public void setInsInfoId(Integer insInfoId) {
        this.insInfoId = insInfoId;
    }

    /**
     * ibs_insurance_info中id
     */
    public Integer getInsInfoId() {
        return insInfoId;
    }

    /**
     * 原厂编码
     */
    public void setSn(String sn) {
        this.sn = sn;
    }

    /**
     * 原厂编码
     */
    public String getSn() {
        return sn;
    }

    /**
     * 报价金额
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 报价金额
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 报价金额属性
     */
    public void setPricePropertyId(Integer pricePropertyId) {
        this.pricePropertyId = pricePropertyId;
    }

    /**
     * 报价金额属性
     */
    public Integer getPricePropertyId() {
        return pricePropertyId;
    }

    /**
     * 推送保险公司价格
     */
    public void setInsPrice(BigDecimal insPrice) {
        this.insPrice = insPrice;
    }

    /**
     * 推送保险公司价格
     */
    public BigDecimal getInsPrice() {
        return insPrice;
    }

    /**
     * 推送维修厂价格
     */
    public void setReparierPrice(BigDecimal reparierPrice) {
        this.reparierPrice = reparierPrice;
    }

    /**
     * 推送维修厂价格
     */
    public BigDecimal getReparierPrice() {
        return reparierPrice;
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
     * 1：原厂件， 2：同质件，3：拆车件，4：副厂件
     */
    public void setComType(String comType) {
        this.comType = comType;
    }

    /**
     * 1：原厂件， 2：同质件，3：拆车件，4：副厂件
     */
    public String getComType() {
        return comType;
    }

    /**
     * 零件品牌
     */
    public void setGoodsBrandId(Integer goodsBrandId) {
        this.goodsBrandId = goodsBrandId;
    }

    /**
     * 零件品牌
     */
    public Integer getGoodsBrandId() {
        return goodsBrandId;
    }

    /**
     * 是否原标：0否 1是
     */
    public void setIsFactory(String isFactory) {
        this.isFactory = isFactory;
    }

    /**
     * 是否原标：0否 1是
     */
    public String getIsFactory() {
        return isFactory;
    }

    /**
     * 状态0:未报价 1:已过期 2:已报价 3中标 4已发货
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 状态0:未报价 1:已过期 2:已报价 3中标 4已发货
     */
    public String getState() {
        return state;
    }

    /**
     * 1:在线报价 2:电话询价
     */
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    /**
     * 1:在线报价 2:电话询价
     */
    public String getReportType() {
        return reportType;
    }

    /**
     * 报价时间(精确到时分秒)
     */
    public void setReportTime(Long reportTime) {
        this.reportTime = reportTime;
    }

    /**
     * 报价时间(精确到时分秒)
     */
    public Long getReportTime() {
        return reportTime;
    }

    /**
     * 要求到货日期(精确到日期)
     */
    public void setArrivedDate(Long arrivedDate) {
        this.arrivedDate = arrivedDate;
    }

    /**
     * 要求到货日期(精确到日期)
     */
    public Long getArrivedDate() {
        return arrivedDate;
    }

    /**
     * 可交货时间(精确到日期)
     */
    public void setSendDate(Long sendDate) {
        this.sendDate = sendDate;
    }

    /**
     * 可交货时间(精确到日期)
     */
    public Long getSendDate() {
        return sendDate;
    }

    /**
     * 创建日期(精确到时分秒)
     */
    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    /**
     * 创建日期(精确到时分秒)
     */
    public Long getCreateTime() {
        return createTime;
    }

    /**
     * 保险询价公司
     */
    public void setSendCompanyId(Integer sendCompanyId) {
        this.sendCompanyId = sendCompanyId;
    }

    /**
     * 保险询价公司
     */
    public Integer getSendCompanyId() {
        return sendCompanyId;
    }

    /**
     * member_id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * member_id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 微信open_id
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 微信open_id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 流程类型
     */
    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    /**
     * 流程类型
     */
    public Integer getProcessType() {
        return processType;
    }

    /**
     * 目标价
     */
    public void setTargetPrice(BigDecimal targetPrice) {
        this.targetPrice = targetPrice;
    }

    /**
     * 目标价
     */
    public BigDecimal getTargetPrice() {
        return targetPrice;
    }

    /**
     * 是否经营该产品（0: 经营 1:不经营 ， 默认是0 ）
     * 
     */
    public void setIsOperProd(String isOperProd) {
        this.isOperProd = isOperProd;
    }

    /**
     * 是否经营该产品（0: 经营 1:不经营 ， 默认是0 ）
     * 
     */
    public String getIsOperProd() {
        return isOperProd;
    }
}
