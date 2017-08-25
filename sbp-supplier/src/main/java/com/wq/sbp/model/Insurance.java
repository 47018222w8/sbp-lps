package com.wq.sbp.model;

import java.math.BigDecimal;
import java.util.List;

/**
 * IbsInsurance 实体类
 * 2017-08-22
 */
public class Insurance {

    // id
    private Integer id;

    private Long createDate;

    // 流水单号（系统自动生成11位流水单号）格式YYMMDD00001自增
    private String insNo;

    // 保险公司小流水格式YYMMDD+保险公司ID+自增序列
    private String insNoCompany;

    // 案件号
    private String caseNo;

    // 保险单号
    private String ibsNo;

    // 查勘时间
    private String recTime;

    // 查勘地点
    private String recPlace;

    // 初次定损金额
    private BigDecimal assPrice;

    // 定损时间
    private String assTime;

    // 定损人员
    private String assHrm;

    // 核损员身份证号码
    private String assCard;

    // 车牌号码
    private String carNo;

    // 车型名称
    private String carType;

    // 车辆种类
    private String carKind;

    // 号码种类
    private String noKind;

    // 车架号（VIN）
    private String vin;

    // 发动机号
    private String engineNumber;

    // 自定义车型标志
    private String carMark;

    // 修理厂类型
    private String repairType;

    // 修理厂名称
    private String repairName;

    // 修理机构组织机构代码
    private String repairCode;

    // 进厂日期
    private String intoDate;

    // 是否处理:0.未处理,1.已处理,默认为0
    private Integer isProcess;

    // 维修厂id 根据 t_person_relation中member_id获得hrm_company_id
    private String loginId;

    // 登录人id
    private Integer repairId;

    // 0:未询价，1:询价中，2:已报价，10:已生成订单
    private String reportState;

    // 这家伙很懒,没有留下注释
    private Long reportBeginDate;

    // 这家伙很懒,没有留下注释
    private Long reportEndDate;

    // 配件需求单类型
    private Integer insType;

    // 需求单来源 1：普通保险 2：维修厂
    private String insSource;

    // 追加单的父类单号
    private String praentInsNo;

    // 保险公司ID
    private Integer insCompanyId;

    // 流程类型
    private Integer processType;

    // 对应t_receive_car id
    private Integer carBrandId;

    // 对应t_receive_car id
    private Integer receiveCarId;

    // 交货时间
    private String jhTime;

    // 要求到货时间(参加 t_property表)
    private String arriveDateYh;

    // 对应es_carline
    private Integer carLineId;

    // 对应es_car
    private Integer carId;

    // 要求到货时间
    private Long arriveDate;

    // 新版询价中要求到货时间
    private Integer arriveTime;

    // 是否需要发票 1需要 0 不需要
    private String isInvoice;

    // es_member_address id
    private Integer addrId;

    // 下单是备注信息
    private String orderRemark;

    // 语音提醒可用次数
    private String voiceCount;

    // 微信提醒可用次数
    private String wxCount;

    List<InsuranceInfo> list;

    public List<InsuranceInfo> getList() {
        return list;
    }

    public void setList(List<InsuranceInfo> list) {
        this.list = list;
    }

    /**
     * id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * id
     */
    public Integer getId() {
        return id;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public Long getCreateDate() {
        return createDate;
    }

    /**
     * 流水单号（系统自动生成11位流水单号）格式YYMMDD00001自增
     */
    public void setInsNo(String insNo) {
        this.insNo = insNo;
    }

    /**
     * 流水单号（系统自动生成11位流水单号）格式YYMMDD00001自增
     */
    public String getInsNo() {
        return insNo;
    }

    /**
     * 保险公司小流水格式YYMMDD+保险公司ID+自增序列
     */
    public void setInsNoCompany(String insNoCompany) {
        this.insNoCompany = insNoCompany;
    }

    /**
     * 保险公司小流水格式YYMMDD+保险公司ID+自增序列
     */
    public String getInsNoCompany() {
        return insNoCompany;
    }

    /**
     * 案件号
     */
    public void setCaseNo(String caseNo) {
        this.caseNo = caseNo;
    }

    /**
     * 案件号
     */
    public String getCaseNo() {
        return caseNo;
    }

    /**
     * 保险单号
     */
    public void setIbsNo(String ibsNo) {
        this.ibsNo = ibsNo;
    }

    /**
     * 保险单号
     */
    public String getIbsNo() {
        return ibsNo;
    }

    /**
     * 查勘时间
     */
    public void setRecTime(String recTime) {
        this.recTime = recTime;
    }

    /**
     * 查勘时间
     */
    public String getRecTime() {
        return recTime;
    }

    /**
     * 查勘地点
     */
    public void setRecPlace(String recPlace) {
        this.recPlace = recPlace;
    }

    /**
     * 查勘地点
     */
    public String getRecPlace() {
        return recPlace;
    }

    /**
     * 初次定损金额
     */
    public void setAssPrice(BigDecimal assPrice) {
        this.assPrice = assPrice;
    }

    /**
     * 初次定损金额
     */
    public BigDecimal getAssPrice() {
        return assPrice;
    }

    /**
     * 定损时间
     */
    public void setAssTime(String assTime) {
        this.assTime = assTime;
    }

    /**
     * 定损时间
     */
    public String getAssTime() {
        return assTime;
    }

    /**
     * 定损人员
     */
    public void setAssHrm(String assHrm) {
        this.assHrm = assHrm;
    }

    /**
     * 定损人员
     */
    public String getAssHrm() {
        return assHrm;
    }

    /**
     * 核损员身份证号码
     */
    public void setAssCard(String assCard) {
        this.assCard = assCard;
    }

    /**
     * 核损员身份证号码
     */
    public String getAssCard() {
        return assCard;
    }

    /**
     * 车牌号码
     */
    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    /**
     * 车牌号码
     */
    public String getCarNo() {
        return carNo;
    }

    /**
     * 车型名称
     */
    public void setCarType(String carType) {
        this.carType = carType;
    }

    /**
     * 车型名称
     */
    public String getCarType() {
        return carType;
    }

    /**
     * 车辆种类
     */
    public void setCarKind(String carKind) {
        this.carKind = carKind;
    }

    /**
     * 车辆种类
     */
    public String getCarKind() {
        return carKind;
    }

    /**
     * 号码种类
     */
    public void setNoKind(String noKind) {
        this.noKind = noKind;
    }

    /**
     * 号码种类
     */
    public String getNoKind() {
        return noKind;
    }

    /**
     * 车架号（VIN）
     */
    public void setVin(String vin) {
        this.vin = vin;
    }

    /**
     * 车架号（VIN）
     */
    public String getVin() {
        return vin;
    }

    /**
     * 发动机号
     */
    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    /**
     * 发动机号
     */
    public String getEngineNumber() {
        return engineNumber;
    }

    /**
     * 自定义车型标志
     */
    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    /**
     * 自定义车型标志
     */
    public String getCarMark() {
        return carMark;
    }

    /**
     * 修理厂类型
     */
    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    /**
     * 修理厂类型
     */
    public String getRepairType() {
        return repairType;
    }

    /**
     * 修理厂名称
     */
    public void setRepairName(String repairName) {
        this.repairName = repairName;
    }

    /**
     * 修理厂名称
     */
    public String getRepairName() {
        return repairName;
    }

    /**
     * 修理机构组织机构代码
     */
    public void setRepairCode(String repairCode) {
        this.repairCode = repairCode;
    }

    /**
     * 修理机构组织机构代码
     */
    public String getRepairCode() {
        return repairCode;
    }

    /**
     * 进厂日期
     */
    public void setIntoDate(String intoDate) {
        this.intoDate = intoDate;
    }

    /**
     * 进厂日期
     */
    public String getIntoDate() {
        return intoDate;
    }

    /**
     * 是否处理:0.未处理,1.已处理,默认为0
     */
    public void setIsProcess(Integer isProcess) {
        this.isProcess = isProcess;
    }

    /**
     * 是否处理:0.未处理,1.已处理,默认为0
     */
    public Integer getIsProcess() {
        return isProcess;
    }

    /**
     * 维修厂id 根据 t_person_relation中member_id获得hrm_company_id
     */
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    /**
     * 维修厂id 根据 t_person_relation中member_id获得hrm_company_id
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * 登录人id
     */
    public void setRepairId(Integer repairId) {
        this.repairId = repairId;
    }

    /**
     * 登录人id
     */
    public Integer getRepairId() {
        return repairId;
    }

    /**
     * 0:未询价，1:询价中，2:已报价，10:已生成订单
     */
    public void setReportState(String reportState) {
        this.reportState = reportState;
    }

    /**
     * 0:未询价，1:询价中，2:已报价，10:已生成订单
     */
    public String getReportState() {
        return reportState;
    }

    /**
     * 这家伙很懒,没有留下注释
     */
    public void setReportBeginDate(Long reportBeginDate) {
        this.reportBeginDate = reportBeginDate;
    }

    /**
     * 这家伙很懒,没有留下注释
     */
    public Long getReportBeginDate() {
        return reportBeginDate;
    }

    /**
     * 这家伙很懒,没有留下注释
     */
    public void setReportEndDate(Long reportEndDate) {
        this.reportEndDate = reportEndDate;
    }

    /**
     * 这家伙很懒,没有留下注释
     */
    public Long getReportEndDate() {
        return reportEndDate;
    }

    /**
     * 配件需求单类型
     */
    public void setInsType(Integer insType) {
        this.insType = insType;
    }

    /**
     * 配件需求单类型
     */
    public Integer getInsType() {
        return insType;
    }

    /**
     * 需求单来源 1：普通保险 2：维修厂
     */
    public void setInsSource(String insSource) {
        this.insSource = insSource;
    }

    /**
     * 需求单来源 1：普通保险 2：维修厂
     */
    public String getInsSource() {
        return insSource;
    }

    /**
     * 追加单的父类单号
     */
    public void setPraentInsNo(String praentInsNo) {
        this.praentInsNo = praentInsNo;
    }

    /**
     * 追加单的父类单号
     */
    public String getPraentInsNo() {
        return praentInsNo;
    }

    /**
     * 保险公司ID
     */
    public void setInsCompanyId(Integer insCompanyId) {
        this.insCompanyId = insCompanyId;
    }

    /**
     * 保险公司ID
     */
    public Integer getInsCompanyId() {
        return insCompanyId;
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
     * 对应t_receive_car id
     */
    public void setCarBrandId(Integer carBrandId) {
        this.carBrandId = carBrandId;
    }

    /**
     * 对应t_receive_car id
     */
    public Integer getCarBrandId() {
        return carBrandId;
    }

    /**
     * 对应t_receive_car id
     */
    public void setReceiveCarId(Integer receiveCarId) {
        this.receiveCarId = receiveCarId;
    }

    /**
     * 对应t_receive_car id
     */
    public Integer getReceiveCarId() {
        return receiveCarId;
    }

    /**
     * 交货时间
     */
    public void setJhTime(String jhTime) {
        this.jhTime = jhTime;
    }

    /**
     * 交货时间
     */
    public String getJhTime() {
        return jhTime;
    }

    /**
     * 要求到货时间(参加 t_property表)
     */
    public void setArriveDateYh(String arriveDateYh) {
        this.arriveDateYh = arriveDateYh;
    }

    /**
     * 要求到货时间(参加 t_property表)
     */
    public String getArriveDateYh() {
        return arriveDateYh;
    }

    /**
     * 对应es_carline
     */
    public void setCarLineId(Integer carLineId) {
        this.carLineId = carLineId;
    }

    /**
     * 对应es_carline
     */
    public Integer getCarLineId() {
        return carLineId;
    }

    /**
     * 对应es_car
     */
    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    /**
     * 对应es_car
     */
    public Integer getCarId() {
        return carId;
    }

    /**
     * 要求到货时间
     */
    public void setArriveDate(Long arriveDate) {
        this.arriveDate = arriveDate;
    }

    /**
     * 要求到货时间
     */
    public Long getArriveDate() {
        return arriveDate;
    }

    /**
     * 新版询价中要求到货时间
     */
    public void setArriveTime(Integer arriveTime) {
        this.arriveTime = arriveTime;
    }

    /**
     * 新版询价中要求到货时间
     */
    public Integer getArriveTime() {
        return arriveTime;
    }

    /**
     * 是否需要发票 1需要 0 不需要
     */
    public void setIsInvoice(String isInvoice) {
        this.isInvoice = isInvoice;
    }

    /**
     * 是否需要发票 1需要 0 不需要
     */
    public String getIsInvoice() {
        return isInvoice;
    }

    /**
     * es_member_address id
     */
    public void setAddrId(Integer addrId) {
        this.addrId = addrId;
    }

    /**
     * es_member_address id
     */
    public Integer getAddrId() {
        return addrId;
    }

    /**
     * 下单是备注信息
     */
    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    /**
     * 下单是备注信息
     */
    public String getOrderRemark() {
        return orderRemark;
    }

    /**
     * 语音提醒可用次数
     */
    public void setVoiceCount(String voiceCount) {
        this.voiceCount = voiceCount;
    }

    /**
     * 语音提醒可用次数
     */
    public String getVoiceCount() {
        return voiceCount;
    }

    /**
     * 微信提醒可用次数
     */
    public void setWxCount(String wxCount) {
        this.wxCount = wxCount;
    }

    /**
     * 微信提醒可用次数
     */
    public String getWxCount() {
        return wxCount;
    }
}
