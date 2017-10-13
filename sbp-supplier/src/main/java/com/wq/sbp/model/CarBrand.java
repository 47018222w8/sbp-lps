package com.wq.sbp.model;

/**
 * EsCarBrand 实体类
 * 2017-09-20
 */
public class CarBrand {

    // 这家伙很懒,没有留下注释
    private Integer carBrandId;

    // 汽车品牌名称,如:一汽大众
    private String carBrandName;

    // 品牌logo图片路径
    private String brandLogo;

    // 首字母
    private Character carFirstLetter;

    // 是否热门品牌 0- not 1- yes
    private String isHot;

    // 国家名称
    private String nationalName;

    // app端车标
    private String appLogo;

    // 找件是否显示0:不显示,1显示
    private Integer canFindPartShow;

    // 询价是否是热门车型
    private Integer askpriceIsHot;

    // 力洋数据返回的car_name（由于没有车型库，通过品牌汉字对应）
    private String liyangCarBrandName;

    // 补充字段
    private String param1;

    // 补充字段
    private String param2;

    private String key;

    private String value;

    private boolean check;

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

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
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

    /**
     * 这家伙很懒,没有留下注释
     */
    public void setCarBrandId(Integer carBrandId) {
        this.carBrandId = carBrandId;
    }

    /**
     * 这家伙很懒,没有留下注释
     */
    public Integer getCarBrandId() {
        return carBrandId;
    }

    /**
     * 汽车品牌名称,如:一汽大众
     */
    public void setCarBrandName(String carBrandName) {
        this.carBrandName = carBrandName;
    }

    /**
     * 汽车品牌名称,如:一汽大众
     */
    public String getCarBrandName() {
        return carBrandName;
    }

    /**
     * 品牌logo图片路径
     */
    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    /**
     * 品牌logo图片路径
     */
    public String getBrandLogo() {
        return brandLogo;
    }

    public Character getCarFirstLetter() {
        return carFirstLetter;
    }

    public void setCarFirstLetter(Character carFirstLetter) {
        this.carFirstLetter = carFirstLetter;
    }

    /**
     * 是否热门品牌
     * 0- not
     * 1- yes
     */
    public void setIsHot(String isHot) {
        this.isHot = isHot;
    }

    /**
     * 是否热门品牌
     * 0- not
     * 1- yes
     */
    public String getIsHot() {
        return isHot;
    }

    /**
     * 国家名称
     */
    public void setNationalName(String nationalName) {
        this.nationalName = nationalName;
    }

    /**
     * 国家名称
     */
    public String getNationalName() {
        return nationalName;
    }

    /**
     * app端车标
     */
    public void setAppLogo(String appLogo) {
        this.appLogo = appLogo;
    }

    /**
     * app端车标
     */
    public String getAppLogo() {
        return appLogo;
    }

    /**
     * 找件是否显示0:不显示,1显示
     */
    public void setCanFindPartShow(Integer canFindPartShow) {
        this.canFindPartShow = canFindPartShow;
    }

    /**
     * 找件是否显示0:不显示,1显示
     */
    public Integer getCanFindPartShow() {
        return canFindPartShow;
    }

    /**
     * 询价是否是热门车型
     */
    public void setAskpriceIsHot(Integer askpriceIsHot) {
        this.askpriceIsHot = askpriceIsHot;
    }

    /**
     * 询价是否是热门车型
     */
    public Integer getAskpriceIsHot() {
        return askpriceIsHot;
    }

    /**
     * 力洋数据返回的car_name（由于没有车型库，通过品牌汉字对应）
     */
    public void setLiyangCarBrandName(String liyangCarBrandName) {
        this.liyangCarBrandName = liyangCarBrandName;
    }

    /**
     * 力洋数据返回的car_name（由于没有车型库，通过品牌汉字对应）
     */
    public String getLiyangCarBrandName() {
        return liyangCarBrandName;
    }
}
