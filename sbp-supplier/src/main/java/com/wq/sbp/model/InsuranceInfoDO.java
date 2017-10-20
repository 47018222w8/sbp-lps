package com.wq.sbp.model;

import java.math.BigDecimal;

/**
 * IbsInsuranceInfo 实体类
 * 
 * @author zwq
 */
public class InsuranceInfoDO {

    private String id;

    /**
     * 询价单id
     * 
     * @author zwq
     */
    private Integer insuranceId;

    /**
     * 名称
     * 
     * @author zwq
     */
    private String name;

    /**
     * 数量
     * 
     * @author zwq
     */
    private Integer amount;

    /**
     * 备注
     * 
     * @author zwq
     */
    private String remarks;

    /**
     * 是否处理:0.未处理,1.已处理,默认为0
     * 
     * @author zwq
     */
    private Integer isProcess;

    private String reportState;

    private String img;

    /**
     * 零件图片url
     * 
     * @author zwq
     */
    private String img1;

    /**
     * 零件图片url
     * 
     * @author zwq
     */
    private String img2;

    /**
     * 零件图片url
     * 
     * @author zwq
     */
    private String img3;

    /**
     * 零件图片url
     * 
     * @author zwq
     */
    private String img4;

    /**
     * 目标价
     * 
     * @author zwq
     */
    private BigDecimal targetPrice;

    /**
     * 品质要求（对应t_property）
     * 
     * @author zwq
     */
    private Integer qualityRequirement;

    @Override
    public String toString() {
        return "InsuranceInfoDO [id=" + id
                + ", insuranceId="
                + insuranceId
                + ", name="
                + name
                + ", amount="
                + amount
                + ", remarks="
                + remarks
                + ", isProcess="
                + isProcess
                + ", reportState="
                + reportState
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
                + ", targetPrice="
                + targetPrice
                + ", qualityRequirement="
                + qualityRequirement
                + "]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(Integer insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getIsProcess() {
        return isProcess;
    }

    public void setIsProcess(Integer isProcess) {
        this.isProcess = isProcess;
    }

    public String getReportState() {
        return reportState;
    }

    public void setReportState(String reportState) {
        this.reportState = reportState;
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

    public BigDecimal getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(BigDecimal targetPrice) {
        this.targetPrice = targetPrice;
    }

    public Integer getQualityRequirement() {
        return qualityRequirement;
    }

    public void setQualityRequirement(Integer qualityRequirement) {
        this.qualityRequirement = qualityRequirement;
    }

}
