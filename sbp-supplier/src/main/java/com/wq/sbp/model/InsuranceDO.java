package com.wq.sbp.model;

import java.util.List;

/**
 * IbsInsurance 实体类
 * 2017-08-22
 */
public class InsuranceDO {

    // id
    private Integer id;

    private Long createDate;

    // 流水单号（系统自动生成11位流水单号）格式YYMMDD00001自增
    private String insNo;

    // 保险公司小流水格式YYMMDD+保险公司ID+自增序列
    private String insNoCompany;

    // 车牌号码
    private String carNo;

    // 车架号（VIN）
    private String vin;

    // 自定义车型标志
    private String carMark;

    // 修理厂名称
    private String repairName;

    // 是否处理:0.未处理,1.已处理,默认为0
    private Integer isProcess;

    // 登录人id
    private Integer repairId;

    // 0:未询价，1:询价中，2:已报价，10:已生成订单
    private String reportState;

    // 配件需求单类型
    private Integer insType;

    // 需求单来源 1：普通保险 2：维修厂
    private String insSource;

    // 保险公司ID
    private Integer insCompanyId;

    // 流程类型
    private Integer processType;

    // 对应t_receive_car id
    private Integer carBrandId;

    // 对应t_receive_car id
    private Integer receiveCarId;

    // 对应es_carline
    private Integer carLineId;

    // 对应es_car
    private Integer carId;

    // 新版询价中要求到货时间
    private Integer arriveTime;

    // 是否需要发票 1需要 0 不需要
    private String invoice;

    // es_member_address id
    private Integer addrId;

    // 下单是备注信息
    private String orderRemark;

    // 语音提醒可用次数
    private String voiceCount;

    // 微信提醒可用次数
    private String wxCount;

    List<InsuranceInfoDO> list;

    private String parm1;

    private String parm2;

    private String carBrandName;

    private String entMemberName;

    private String contactMobile;

    private String address;

    private String driveLicense;

    private String frontImg;

    private String rearImg;

    List<ReportPriceDO> listRP;

    public List<ReportPriceDO> getListRP() {
        return listRP;
    }

    public void setListRP(List<ReportPriceDO> listRP) {
        this.listRP = listRP;
    }

    public String getDriveLicense() {
        return driveLicense;
    }

    public void setDriveLicense(String driveLicense) {
        this.driveLicense = driveLicense;
    }

    public String getFrontImg() {
        return frontImg;
    }

    public void setFrontImg(String frontImg) {
        this.frontImg = frontImg;
    }

    public String getRearImg() {
        return rearImg;
    }

    public void setRearImg(String rearImg) {
        this.rearImg = rearImg;
    }

    public String getEntMemberName() {
        return entMemberName;
    }

    public void setEntMemberName(String entMemberName) {
        this.entMemberName = entMemberName;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCarBrandName() {
        return carBrandName;
    }

    public void setCarBrandName(String carBrandName) {
        this.carBrandName = carBrandName;
    }

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public String getInsNo() {
        return insNo;
    }

    public void setInsNo(String insNo) {
        this.insNo = insNo;
    }

    public String getInsNoCompany() {
        return insNoCompany;
    }

    public void setInsNoCompany(String insNoCompany) {
        this.insNoCompany = insNoCompany;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public String getRepairName() {
        return repairName;
    }

    public void setRepairName(String repairName) {
        this.repairName = repairName;
    }

    public Integer getIsProcess() {
        return isProcess;
    }

    public void setIsProcess(Integer isProcess) {
        this.isProcess = isProcess;
    }

    public Integer getRepairId() {
        return repairId;
    }

    public void setRepairId(Integer repairId) {
        this.repairId = repairId;
    }

    public String getReportState() {
        return reportState;
    }

    public void setReportState(String reportState) {
        this.reportState = reportState;
    }

    public Integer getInsType() {
        return insType;
    }

    public void setInsType(Integer insType) {
        this.insType = insType;
    }

    public String getInsSource() {
        return insSource;
    }

    public void setInsSource(String insSource) {
        this.insSource = insSource;
    }

    public Integer getInsCompanyId() {
        return insCompanyId;
    }

    public void setInsCompanyId(Integer insCompanyId) {
        this.insCompanyId = insCompanyId;
    }

    public Integer getProcessType() {
        return processType;
    }

    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    public Integer getCarBrandId() {
        return carBrandId;
    }

    public void setCarBrandId(Integer carBrandId) {
        this.carBrandId = carBrandId;
    }

    public Integer getReceiveCarId() {
        return receiveCarId;
    }

    public void setReceiveCarId(Integer receiveCarId) {
        this.receiveCarId = receiveCarId;
    }

    public Integer getCarLineId() {
        return carLineId;
    }

    public void setCarLineId(Integer carLineId) {
        this.carLineId = carLineId;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public Integer getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Integer arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public Integer getAddrId() {
        return addrId;
    }

    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public String getVoiceCount() {
        return voiceCount;
    }

    public void setVoiceCount(String voiceCount) {
        this.voiceCount = voiceCount;
    }

    public String getWxCount() {
        return wxCount;
    }

    public void setWxCount(String wxCount) {
        this.wxCount = wxCount;
    }

    public List<InsuranceInfoDO> getList() {
        return list;
    }

    public void setList(List<InsuranceInfoDO> list) {
        this.list = list;
    }

}
