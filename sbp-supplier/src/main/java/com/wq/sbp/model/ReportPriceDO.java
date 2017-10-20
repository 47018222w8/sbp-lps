package com.wq.sbp.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * IbsReportPrice 实体类
 * 
 * @date 2017-08-31
 * @author zwq
 */
public class ReportPriceDO {

    private Integer id;

    /**
     * 询价单ID
     * 
     * @author zwq
     */
    private Integer insId;

    /**
     * ibs_insurance_info中id
     * 
     * @author zwq
     */
    private Integer insInfoId;

    /**
     * 报价金额
     * 
     * @author zwq
     */
    private BigDecimal price;

    private Integer supplierId;

    /**
     * 状态0:未报价 1:已过期 2:已报价 3中标 4已发货
     * 
     * @author zwq
     */
    private String state;

    private Long reportTime;

    private Long createTime;

    /**
     * 供应商memberId
     * 
     * @author zwq
     */
    private Integer memberId;

    private Integer processType;

    private BigDecimal targetPrice;

    /**
     * 是否经营该产品0: 经营 1:不经营 ， 默认是0(历史遗留问题)
     * 
     * @author zwq
     */
    private String isOperProd;

    private String img;

    private String img1;

    private String img2;

    private String img3;

    private String img4;

    /**
     * 零件名称
     * 
     * @author zwq
     */
    private String name;

    /**
     * 具体报价列表
     * 
     * @author zwq
     */
    private List<ReportPriceInfoDO> listRPI;

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

    public List<ReportPriceInfoDO> getListRPI() {
        return listRPI;
    }

    public void setListRPI(List<ReportPriceInfoDO> listRPI) {
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

    /**
     * 是否经营该产品（0: 经营 1:不经营 ， 默认是0 ）
     * 
     *
     * @return
     *
     * @author zwq
     * @since 2017年10月6日
     */
    public String getIsOperProd() {
        return isOperProd;
    }

    /**
     * 是否经营该产品（0: 经营 1:不经营 ， 默认是0 ）
     * 
     *
     * @return
     *
     * @author zwq
     * @since 2017年10月6日
     */
    public void setIsOperProd(String isOperProd) {
        this.isOperProd = isOperProd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ReportPriceDO [id=" + id
                + ", insId="
                + insId
                + ", insInfoId="
                + insInfoId
                + ", price="
                + price
                + ", supplierId="
                + supplierId
                + ", state="
                + state
                + ", reportTime="
                + reportTime
                + ", createTime="
                + createTime
                + ", memberId="
                + memberId
                + ", processType="
                + processType
                + ", targetPrice="
                + targetPrice
                + ", isOperProd="
                + isOperProd
                + ", img="
                + img
                + ", img1="
                + img1
                + ", img2="
                + img2
                + ", img3="
                + img3
                + ", img4="
                + img4
                + ", name="
                + name
                + ", listRPI="
                + listRPI
                + "]";
    }

}
