package com.wq.sbp.model;

/**
 * TCarPartSort 实体类
 * 
 * @date 2017-10-18
 * @author zwq
 */
public class CarPartSortDO {

    /**
     * 这家伙很懒,没有留下注释
     * 
     * @author zwq
     */

    private Integer id;

    /**
     * 零件名
     * 
     * @author zwq
     */

    private String name;

    /**
     * 父id,0时为顶级
     * 
     * @author zwq
     */

    private Integer pid;

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
     * 是否启用0:否,1:是
     * 
     * @author zwq
     */

    private Integer flag;

    public CarPartSortDO setId(Integer id) {
        this.id = id;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public CarPartSortDO setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }

    public CarPartSortDO setPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    public Integer getPid() {
        return pid;
    }

    public CarPartSortDO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }

    public String getGmtCreate() {
        return gmtCreate;
    }

    public CarPartSortDO setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }

    public String getGmtModify() {
        return gmtModify;
    }

    public CarPartSortDO setFlag(Integer flag) {
        this.flag = flag;
        return this;
    }

    public Integer getFlag() {
        return flag;
    }
}
