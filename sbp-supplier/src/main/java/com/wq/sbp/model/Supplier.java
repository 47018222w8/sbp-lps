package com.wq.sbp.model;

import java.util.Date;
import java.util.List;

/**
 * IbsSupplier 实体类
 * 2017-09-26
 */
public class Supplier {

    // 这家伙很懒,没有留下注释
    private Integer supplierId;

    // 车品牌对应ibs_car_brand
    private Integer carBrandId;

    private List<Integer> carBrandIdList;

    // 是否通用品牌，0：不通用 1：通用
    private String isCommon;

    // 会员id
    private Integer memberId;

    // 店铺id
    private Integer storeId;

    // 0：停用 1：启用
    private String flag;

    // 这家伙很懒,没有留下注释
    private Date createTime;

    private String param1;

    private String param2;

    private String carBrandName;

    private String carBrandLogo;

    public List<Integer> getCarBrandIdList() {
        return carBrandIdList;
    }

    public void setCarBrandIdList(List<Integer> carBrandIdList) {
        this.carBrandIdList = carBrandIdList;
    }

    public String getCarBrandLogo() {
        return carBrandLogo;
    }

    public void setCarBrandLogo(String carBrandLogo) {
        this.carBrandLogo = carBrandLogo;
    }

    public String getCarBrandName() {
        return carBrandName;
    }

    public void setCarBrandName(String carBrandName) {
        this.carBrandName = carBrandName;
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
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * 这家伙很懒,没有留下注释
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * 车品牌对应ibs_car_brand
     */
    public void setCarBrandId(Integer carBrandId) {
        this.carBrandId = carBrandId;
    }

    /**
     * 车品牌对应ibs_car_brand
     */
    public Integer getCarBrandId() {
        return carBrandId;
    }

    /**
     * 是否通用品牌，0：不通用 1：通用
     */
    public void setIsCommon(String isCommon) {
        this.isCommon = isCommon;
    }

    /**
     * 是否通用品牌，0：不通用 1：通用
     */
    public String getIsCommon() {
        return isCommon;
    }

    /**
     * 会员id
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * 会员id
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 店铺id
     */
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    /**
     * 店铺id
     */
    public Integer getStoreId() {
        return storeId;
    }

    /**
     * 0：停用 1：启用
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * 0：停用 1：启用
     */
    public String getFlag() {
        return flag;
    }

    /**
     * 这家伙很懒,没有留下注释
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 这家伙很懒,没有留下注释
     */
    public Date getCreateTime() {
        return createTime;
    }
}
