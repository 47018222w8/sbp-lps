package com.wq.sbp.model;

import java.util.List;

/**
 * IbsSupplier 实体类
 * 
 * @date 2017-09-26
 * @author zwq
 */
public class SupplierDO {

    /**
     * 主键(历史遗留问题)
     * 
     * @author zwq
     */
    private Integer supplierId;

    private Integer carBrandId;

    private List<Integer> carBrandIdList;

    /**
     * 是否通用品牌，0：不通用 1：通用
     * 
     * @author zwq
     */
    private String isCommon;

    private Integer memberId;

    private Integer storeId;

    /**
     * 0：停用 1：启用
     * 
     * @author zwq
     */
    private String flag;

    private String createTime;

    private String param1;

    private String param2;

    private String carBrandName;

    private String carBrandLogo;

    @Override
    public String toString() {
        return "SupplierDO [supplierId=" + supplierId
                + ", carBrandId="
                + carBrandId
                + ", carBrandIdList="
                + carBrandIdList
                + ", isCommon="
                + isCommon
                + ", memberId="
                + memberId
                + ", storeId="
                + storeId
                + ", flag="
                + flag
                + ", createTime="
                + createTime
                + ", param1="
                + param1
                + ", param2="
                + param2
                + ", carBrandName="
                + carBrandName
                + ", carBrandLogo="
                + carBrandLogo
                + "]";
    }

    public List<Integer> getCarBrandIdList() {
        return carBrandIdList;
    }

    public SupplierDO setCarBrandIdList(List<Integer> carBrandIdList) {
        this.carBrandIdList = carBrandIdList;
        return this;
    }

    public String getCarBrandLogo() {
        return carBrandLogo;
    }

    public SupplierDO setCarBrandLogo(String carBrandLogo) {
        this.carBrandLogo = carBrandLogo;
        return this;
    }

    public String getCarBrandName() {
        return carBrandName;
    }

    public SupplierDO setCarBrandName(String carBrandName) {
        this.carBrandName = carBrandName;
        return this;
    }

    public String getParam1() {
        return param1;
    }

    public SupplierDO setParam1(String param1) {
        this.param1 = param1;
        return this;
    }

    public String getParam2() {
        return param2;
    }

    public SupplierDO setParam2(String param2) {
        this.param2 = param2;
        return this;
    }

    public SupplierDO setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
        return this;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public SupplierDO setCarBrandId(Integer carBrandId) {
        this.carBrandId = carBrandId;
        return this;
    }

    public Integer getCarBrandId() {
        return carBrandId;
    }

    public SupplierDO setIsCommon(String isCommon) {
        this.isCommon = isCommon;
        return this;
    }

    public String getIsCommon() {
        return isCommon;
    }

    public SupplierDO setMemberId(Integer memberId) {
        this.memberId = memberId;
        return this;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public SupplierDO setStoreId(Integer storeId) {
        this.storeId = storeId;
        return this;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public SupplierDO setFlag(String flag) {
        this.flag = flag;
        return this;
    }

    public String getFlag() {
        return flag;
    }

    public SupplierDO setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }
}
