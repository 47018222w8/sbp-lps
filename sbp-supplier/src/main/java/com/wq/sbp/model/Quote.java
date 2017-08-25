package com.wq.sbp.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.util.StringUtils;

/**
 * 报价展示的各种数据
 *
 *
 * @author zwq
 * @since 2017年8月22日
 */
public class Quote {

    private String carBrandName;

    private String carBrandLogo;

    private List<String> carpartList;

    private Integer insId;

    private int count;

    private String name;

    private Integer insInfoId;

    private String carMark;

    private String vin;

    private String invoice;

    private String arriveTime;

    private String carNo;

    private String entMemberName;

    private String contactMobile;

    private String address;

    // t_report_price 报价金额
    private BigDecimal reportPrice;

    // t_report_price 零件质量
    private Integer qualityRequirement;

    // t_report_price 发货时间
    private String canShipDateBs;

    // t_report_price 备注
    private String remark;

    // 报价状态
    private Integer state;

    // vux中需要的名称,自行查找
    private String title;

    @SuppressWarnings("unused")
    private String desc;

    private String src;

    private String url;

    private List<Map<String, String>> previewList;

    public List<Map<String, String>> getPreviewList() {
        previewList = new LinkedList<>();
        Map<String, String> map = new HashMap<>();
        map.put("label", "车型");
        map.put("value", this.carMark);
        previewList.add(map);
        Map<String, String> map1 = new HashMap<>();
        map1.put("label", "车牌号");
        map1.put("value", StringUtils.isEmpty(this.carNo) ? "无" : this.carNo);
        previewList.add(map1);
        Map<String, String> map2 = new HashMap<>();
        map2.put("label", "vin");
        map2.put("value", "00000000000000000".equals(this.vin) ? "无" : this.vin);
        previewList.add(map2);
        Map<String, String> map4 = new HashMap<>();
        map4.put("label", "到货时间");
        map4.put("value", this.arriveTime);
        previewList.add(map4);
        Map<String, String> map5 = new HashMap<>();
        map5.put("label", "修理厂");
        map5.put("value", this.entMemberName);
        previewList.add(map5);
        Map<String, String> map6 = new HashMap<>();
        map6.put("label", "电话");
        map6.put("value", this.contactMobile);
        previewList.add(map6);
        Map<String, String> map7 = new HashMap<>();
        map7.put("label", "地址");
        map7.put("value", this.address);
        previewList.add(map7);
        Map<String, String> map3 = new HashMap<>();
        map3.put("label", "是否需要发票");
        map3.put("value", this.invoice);
        previewList.add(map3);
        return previewList;
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

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getInvoice() {
        return invoice;
    }

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public Integer getInsInfoId() {
        return insInfoId;
    }

    public void setInsInfoId(Integer insInfoId) {
        this.insInfoId = insInfoId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public BigDecimal getReportPrice() {
        return reportPrice;
    }

    public void setReportPrice(BigDecimal reportPrice) {
        this.reportPrice = reportPrice;
    }

    public Integer getQualityRequirement() {
        return qualityRequirement;
    }

    public void setQualityRequirement(Integer qualityRequirement) {
        this.qualityRequirement = qualityRequirement;
    }

    public String getCanShipDateBs() {
        return canShipDateBs;
    }

    public void setCanShipDateBs(String canShipDateBs) {
        this.canShipDateBs = canShipDateBs;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDesc() {
        return name + "等" + count + "个零件";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCarBrandName() {
        return carBrandName;
    }

    public void setCarBrandName(String carBrandName) {
        this.carBrandName = carBrandName;
    }

    public String getCarBrandLogo() {
        return carBrandLogo;
    }

    public void setCarBrandLogo(String carBrandLogo) {
        this.carBrandLogo = carBrandLogo;
    }

    public List<String> getCarpartList() {
        return carpartList;
    }

    public void setCarpartList(List<String> carpartList) {
        this.carpartList = carpartList;
    }

    public Integer getInsId() {
        return insId;
    }

    public void setInsId(Integer insId) {
        this.insId = insId;
    }

}
