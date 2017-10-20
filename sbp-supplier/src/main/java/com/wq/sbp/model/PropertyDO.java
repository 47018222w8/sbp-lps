package com.wq.sbp.model;

/**
 * TProperty 实体类
 * 
 * @date 2017-10-16
 * @author zwq
 */
public class PropertyDO {

    /**
     * 子属性ID
     * 
     * @author zwq
     */

    private Integer id;

    /**
     * 字典表编码
     * 
     * @author zwq
     */

    private String propertyCode;

    /**
     * 是否启用0：不启用 1：启用
     * 
     * @author zwq
     */

    private Integer propertyState;

    /**
     * 属性名称
     * 
     * @author zwq
     */

    private String propertyName;

    /**
     * 备注描述
     * 
     * @author zwq
     */

    private String propertyRemarks;

    /**
     * 这家伙很懒,没有留下注释
     * 
     * @author zwq
     */

    private Integer pid;

    /**
     * 这家伙很懒,没有留下注释
     * 
     * @author zwq
     */

    private String createDate;

    /**
     * 这家伙很懒,没有留下注释
     * 
     * @author zwq
     */

    private Integer createUserId;

    /**
     * 这家伙很懒,没有留下注释
     * 
     * @author zwq
     */

    private Integer sort;

    @Override
    public String toString() {
        return "PropertyDO [id=" + id
                + ", propertyCode="
                + propertyCode
                + ", propertyState="
                + propertyState
                + ", propertyName="
                + propertyName
                + ", propertyRemarks="
                + propertyRemarks
                + ", pid="
                + pid
                + ", createDate="
                + createDate
                + ", createUserId="
                + createUserId
                + ", sort="
                + sort
                + "]";
    }

    /**
     * 子属性ID
     * 
     * @author zwq
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 子属性ID
     * 
     * @author zwq
     */
    public Integer getId() {
        return id;
    }

    /**
     * 字典表编码
     * 
     * @author zwq
     */
    public void setPropertyCode(String propertyCode) {
        this.propertyCode = propertyCode;
    }

    /**
     * 字典表编码
     * 
     * @author zwq
     */
    public String getPropertyCode() {
        return propertyCode;
    }

    /**
     * 是否启用0：不启用 1：启用
     * 
     * @author zwq
     */
    public void setPropertyState(Integer propertyState) {
        this.propertyState = propertyState;
    }

    /**
     * 是否启用0：不启用 1：启用
     * 
     * @author zwq
     */
    public Integer getPropertyState() {
        return propertyState;
    }

    /**
     * 属性名称
     * 
     * @author zwq
     */
    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    /**
     * 属性名称
     * 
     * @author zwq
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * 备注描述
     * 
     * @author zwq
     */
    public void setPropertyRemarks(String propertyRemarks) {
        this.propertyRemarks = propertyRemarks;
    }

    /**
     * 备注描述
     * 
     * @author zwq
     */
    public String getPropertyRemarks() {
        return propertyRemarks;
    }

    /**
     * 这家伙很懒,没有留下注释
     * 
     * @author zwq
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * 这家伙很懒,没有留下注释
     * 
     * @author zwq
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * 这家伙很懒,没有留下注释
     * 
     * @author zwq
     */
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    /**
     * 这家伙很懒,没有留下注释
     * 
     * @author zwq
     */
    public String getCreateDate() {
        return createDate;
    }

    /**
     * 这家伙很懒,没有留下注释
     * 
     * @author zwq
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 这家伙很懒,没有留下注释
     * 
     * @author zwq
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 这家伙很懒,没有留下注释
     * 
     * @author zwq
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 这家伙很懒,没有留下注释
     * 
     * @author zwq
     */
    public Integer getSort() {
        return sort;
    }
}
