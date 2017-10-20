package com.wq.sbp.model;

/**
 * TSupplierCarPart 实体类
 * 
 * @date 2017-10-18
 * @author zwq
 */
public class SupplierCarPartDO {

    /**
     * 这家伙很懒,没有留下注释
     * 
     * @author zwq
     */

    private Integer id;

    /**
     * 这家伙很懒,没有留下注释
     * 
     * @author zwq
     */

    private Integer carPartSortId;

    /**
     * 这家伙很懒,没有留下注释
     * 
     * @author zwq
     */

    private Integer storeId;

    /**
     * 是否启用:0否,1是
     * 
     * @author zwq
     */

    private Integer flag;

    /**
     * 这家伙很懒,没有留下注释
     * 
     * @author zwq
     */

    private String gmtCreate;

    /**
     * 这家伙很懒,没有留下注释
     * 
     * @author zwq
     */

    private String gmtModify;

    /**
     * 对应 store_id的member_id,不是操作人id
     * 
     * @author zwq
     */

    private Integer memberId;

    public SupplierCarPartDO setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public SupplierCarPartDO setCarPartSortId(Integer carPartSortId) {
        this.carPartSortId = carPartSortId;
        return this;
    }

    public Integer getCarPartSortId() {
        return carPartSortId;
    }

    public SupplierCarPartDO setStoreId(Integer storeId) {
        this.storeId = storeId;
        return this;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public SupplierCarPartDO setFlag(Integer flag) {
        this.flag = flag;
        return this;
    }

    public Integer getFlag() {
        return flag;
    }

    public SupplierCarPartDO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public SupplierCarPartDO setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }

    public String getGmtModify() {
        return gmtModify;
    }

    public SupplierCarPartDO setMemberId(Integer memberId) {
        this.memberId = memberId;
        return this;
    }

    public Integer getMemberId() {
        return memberId;
    }
}
