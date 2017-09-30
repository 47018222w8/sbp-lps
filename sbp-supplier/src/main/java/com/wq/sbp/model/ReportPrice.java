package com.wq.sbp.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * IbsReportPrice 实体类
 * 2017-08-31
 */
public class ReportPrice {

    // 这家伙很懒,没有留下注释
    private Integer id;

    // 定损单ID
    private Integer insId;

    // ibs_insurance_info中id
    private Integer insInfoId;

    // 报价金额
    private BigDecimal price;

    // 供应商id
    private Integer supplierId;

    // 状态0:未报价 1:已过期 2:已报价 3中标 4已发货
    private String state;

    // 报价时间(精确到时分秒)
    private Long reportTime;

    // 创建日期(精确到时分秒)
    private Long createTime;

    // member_id
    private Integer memberId;

    // 流程类型
    private Integer processType;

    // 目标价
    private BigDecimal targetPrice;

    // 是否经营该产品（0: 经营 1:不经营 ， 默认是0 ）
    private String isOperProd;

    private String img;

    private String img1;

    private String img2;

    private String img3;

    private String img4;

    // 部件名称
    private String name;

    private List<ReportPriceInfo> listRPI;

    public Integer getId() {
        return id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }

    public String getImg4() {
        return img4;
    }

    public void setImg4(String img4) {
        this.img4 = img4;
    }

    public List<ReportPriceInfo> getListRPI() {
        return listRPI;
    }

    public void setListRPI(List<ReportPriceInfo> listRPI) {
        this.listRPI = listRPI;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInsId() {
        return insId;
    }

    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    public Integer getInsInfoId() {
        return insInfoId;
    }

    public void setInsInfoId(Integer insInfoId) {
        this.insInfoId = insInfoId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getReportTime() {
        return reportTime;
    }

    public void setReportTime(Long reportTime) {
        this.reportTime = reportTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getProcessType() {
        return processType;
    }

    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    public BigDecimal getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(BigDecimal targetPrice) {
        this.targetPrice = targetPrice;
    }

    public String getIsOperProd() {
        return isOperProd;
    }

    public void setIsOperProd(String isOperProd) {
        this.isOperProd = isOperProd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
