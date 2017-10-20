package com.wq.sbp.model;

/**
 * EsCarBrand 实体类
 * @author zwq
 */
public class CarBrandDO {

    private Integer carBrandId;

    private String carBrandName;

    private String brandLogo;

    /**
     * 首字母
     * 
     * @author zwq
     */
    private Character carFirstLetter;

    /**
     * 是否热门
     * 
     * @author zwq
     */
    private String isHot;

    private String nationalName;

    private String appLogo;

    private Integer canFindPartShow;

    /**
     * 询价是否热门
     * 
     * @author zwq
     */
    private Integer askpriceIsHot;

    /**
     * 力洋数据返回的car_name（由于没有车型库，通过品牌汉字对应）
     * 
     * @author zwq
     */
    private String liyangCarBrandName;

    /**
     * 补充字段
     * 
     * @author zwq
     */
    private String param1;

    /**
     * 补充字段
     * 
     * @author zwq
     */
    private String param2;

    private String key;

    private String value;

    private Boolean check;

    @Override
    public String toString() {
        return "CarBrand [carBrandId=" + carBrandId
                + ", carBrandName="
                + carBrandName
                + ", brandLogo="
                + brandLogo
                + ", carFirstLetter="
                + carFirstLetter
                + ", isHot="
                + isHot
                + ", nationalName="
                + nationalName
                + ", appLogo="
                + appLogo
                + ", canFindPartShow="
                + canFindPartShow
                + ", askpriceIsHot="
                + askpriceIsHot
                + ", liyangCarBrandName="
                + liyangCarBrandName
                + ", param1="
                + param1
                + ", param2="
                + param2
                + ", key="
                + key
                + ", value="
                + value
                + ", check="
                + check
                + "]";
    }

    public Boolean isCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public void setCarBrandId(Integer carBrandId) {
        this.carBrandId = carBrandId;
    }

    public Integer getCarBrandId() {
        return carBrandId;
    }

    public void setCarBrandName(String carBrandName) {
        this.carBrandName = carBrandName;
    }

    public String getCarBrandName() {
        return carBrandName;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public String getBrandLogo() {
        return brandLogo;
    }

    public Character getCarFirstLetter() {
        return carFirstLetter;
    }

    public void setCarFirstLetter(Character carFirstLetter) {
        this.carFirstLetter = carFirstLetter;
    }

    public void setIsHot(String isHot) {
        this.isHot = isHot;
    }

    public String getIsHot() {
        return isHot;
    }

    public void setNationalName(String nationalName) {
        this.nationalName = nationalName;
    }

    public String getNationalName() {
        return nationalName;
    }

    public void setAppLogo(String appLogo) {
        this.appLogo = appLogo;
    }

    public String getAppLogo() {
        return appLogo;
    }

    public void setCanFindPartShow(Integer canFindPartShow) {
        this.canFindPartShow = canFindPartShow;
    }

    public Integer getCanFindPartShow() {
        return canFindPartShow;
    }

    public void setAskpriceIsHot(Integer askpriceIsHot) {
        this.askpriceIsHot = askpriceIsHot;
    }

    public Integer getAskpriceIsHot() {
        return askpriceIsHot;
    }

    public void setLiyangCarBrandName(String liyangCarBrandName) {
        this.liyangCarBrandName = liyangCarBrandName;
    }

    public String getLiyangCarBrandName() {
        return liyangCarBrandName;
    }
}
