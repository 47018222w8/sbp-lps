package com.wq.sbp.model;

import java.util.List;

/**
 * IbsInsurance 实体类
 * 
 * @author zwq
 */
public class InsuranceDO {

    private Integer id;

    private Long createDate;

    /**
     * 流水单号（系统自动生成11位流水单号）格式YYMMDD00001自增
     * 
     * @author zwq
     */
    private String insNo;

    private String insNoCompany;

    /**
     * 车牌号码
     * 
     * @author zwq
     */
    private String carNo;

    /**
     * 车架号
     * 
     * @author zwq
     */
    private String vin;

    /**
     * 车型名称
     * 
     * @auto zwq
     */
    private String carMark;

    /**
     * 修理厂名称
     * 
     * @author zwq
     */
    private String repairName;

    /**
     * 是否处理:0.未处理,1.已处理,默认为0
     * 
     * @author zwq
     */
    private Integer isProcess;

    /**
     * 登录人id
     * 
     * @author zwq
     */
    private Integer repairId;

    /**
     * 0:未询价，1:询价中，2:已报价，10:已生成订单
     * 
     * @author zwq
     */
    private String reportState;

    /**
     * 询价单类型
     * 
     * @author zwq
     */
    private Integer insType;

    private String insSource;

    private Integer insCompanyId;

    private Integer processType;

    private Integer carBrandId;

    private Integer receiveCarId;

    private Integer carLineId;

    private Integer carId;

    /**
     * 要求到货时间
     * 
     * @author zwq
     */
    private Integer arriveTime;

    /**
     * 是否需要发票 1需要 0 不需要
     * 
     * @author zwq
     */
    private String invoice;

    /**
     * es_member_address id
     * 
     * @author zwq
     */
    private Integer addrId;

    /**
     * 下单是备注信息
     * 
     * @author zwq
     */
    private String orderRemark;

    /**
     * 语音提醒可用次数
     * 
     * @author zwq
     */
    private String voiceCount;

    /**
     * 微信提醒可用次数
     * 
     * @author zwq
     */
    private String wxCount;

    /**
     * 零件列
     * 
     * @author zwq
     */
    List<InsuranceInfoDO> list;

    private String parm1;

    private String parm2;

    /**
     * 品牌名称
     * 
     * @author zwq
     */
    private String carBrandName;

    /**
     * 维修厂名称
     * 
     * @author zwq
     */
    private String entMemberName;

    /**
     * 维修厂联系电话
     * 
     * @author zwq
     */
    private String contactMobile;

    private String address;

    /**
     * 行车证
     * 
     * @author zwq
     */
    private String driveLicense;

    /**
     * 车头照片
     * 
     * @author zwq
     */
    private String frontImg;

    /**
     * 车尾照片
     * 
     * @author zwq
     */
    private String rearImg;

    /**
     * 静态资源头
     * 
     * @author zwq
     */
    private String domain;

    /**
     * 零件个数
     * 
     * @author zwq
     */
    private Integer partCount;

    /**
     * 零件名称
     * 
     * @author zwq
     */
    private String partName;

    /**
     * 品牌图
     * 
     * @author zwq
     */
    private String brandLogo;

    /**
     * 是否已读
     * 
     * @author zwq
     */
    private Integer isRead;

    /**
     * 询价时间
     * 
     * @author zwq
     */
    private String askTimeStr;

    @Override
    public String toString() {
        return "InsuranceDO [id=" + id
                + ", createDate="
                + createDate
                + ", insNo="
                + insNo
                + ", insNoCompany="
                + insNoCompany
                + ", carNo="
                + carNo
                + ", vin="
                + vin
                + ", carMark="
                + carMark
                + ", repairName="
                + repairName
                + ", isProcess="
                + isProcess
                + ", repairId="
                + repairId
                + ", reportState="
                + reportState
                + ", insType="
                + insType
                + ", insSource="
                + insSource
                + ", insCompanyId="
                + insCompanyId
                + ", processType="
                + processType
                + ", carBrandId="
                + carBrandId
                + ", receiveCarId="
                + receiveCarId
                + ", carLineId="
                + carLineId
                + ", carId="
                + carId
                + ", arriveTime="
                + arriveTime
                + ", invoice="
                + invoice
                + ", addrId="
                + addrId
                + ", orderRemark="
                + orderRemark
                + ", voiceCount="
                + voiceCount
                + ", wxCount="
                + wxCount
                + ", list="
                + list
                + ", parm1="
                + parm1
                + ", parm2="
                + parm2
                + ", carBrandName="
                + carBrandName
                + ", entMemberName="
                + entMemberName
                + ", contactMobile="
                + contactMobile
                + ", address="
                + address
                + ", driveLicense="
                + driveLicense
                + ", frontImg="
                + frontImg
                + ", rearImg="
                + rearImg
                + ", domain="
                + domain
                + ", partCount="
                + partCount
                + ", partName="
                + partName
                + ", brandLogo="
                + brandLogo
                + ", isRead="
                + isRead
                + ", askTimeStr="
                + askTimeStr
                + "]";
    }

    public String getAskTimeStr() {
        return askTimeStr;
    }

    public void setAskTimeStr(String askTimeStr) {
        this.askTimeStr = askTimeStr;
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public Integer getPartCount() {
        return partCount;
    }

    public void setPartCount(Integer partCount) {
        this.partCount = partCount;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
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
