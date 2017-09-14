package com.wq.sbp.model;

import java.util.List;

/**
 * 报价展示的各种数据
 *
 *
 * @author zwq
 * @since 2017年8月22日
 */
public class QuoteDTO {

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

    private String askTimeStr;

    // 报价状态
    private Integer state;

    // vux中需要的名称,自行查找
    private String title;

    @SuppressWarnings("unused")
    private String desc;

    private String src;

    private String url;

    public String getAskTimeStr() {
        return askTimeStr;
    }

    public void setAskTimeStr(String askTimeStr) {
        this.askTimeStr = askTimeStr;
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
