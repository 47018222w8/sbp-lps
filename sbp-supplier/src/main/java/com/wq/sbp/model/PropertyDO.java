package com.wq.sbp.model;
import java.util.Date;

/**
 * TProperty 实体类
 * 2017-08-28
 */ 
public class PropertyDO {

	 // 子属性ID
	private Integer id;

	 // 字典表编码
	private String propertyCode;

	 // 是否启用0：不启用 1：启用
	private Integer propertyState;

	 // 属性名称
	private String propertyName;

	 // 备注描述
	private String propertyRemarks;

	 // 这家伙很懒,没有留下注释
	private Integer pid;

	 // 这家伙很懒,没有留下注释
	private Date createDate;

	 // 这家伙很懒,没有留下注释
	private Integer createUserId;

	 // 这家伙很懒,没有留下注释
	private Integer sort;
	/**
	 * 子属性ID 
	 */ 
	public void setId(Integer id){
		this.id=id;
	}
	/**
	 * 子属性ID 
	 */ 
	public Integer getId(){
		return id;
	}
	/**
	 * 字典表编码 
	 */ 
	public void setPropertyCode(String propertyCode){
		this.propertyCode=propertyCode;
	}
	/**
	 * 字典表编码 
	 */ 
	public String getPropertyCode(){
		return propertyCode;
	}
	/**
	 * 是否启用0：不启用 1：启用 
	 */ 
	public void setPropertyState(Integer propertyState){
		this.propertyState=propertyState;
	}
	/**
	 * 是否启用0：不启用 1：启用 
	 */ 
	public Integer getPropertyState(){
		return propertyState;
	}
	/**
	 * 属性名称 
	 */ 
	public void setPropertyName(String propertyName){
		this.propertyName=propertyName;
	}
	/**
	 * 属性名称 
	 */ 
	public String getPropertyName(){
		return propertyName;
	}
	/**
	 * 备注描述 
	 */ 
	public void setPropertyRemarks(String propertyRemarks){
		this.propertyRemarks=propertyRemarks;
	}
	/**
	 * 备注描述 
	 */ 
	public String getPropertyRemarks(){
		return propertyRemarks;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setPid(Integer pid){
		this.pid=pid;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getPid(){
		return pid;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setCreateDate(Date createDate){
		this.createDate=createDate;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Date getCreateDate(){
		return createDate;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setCreateUserId(Integer createUserId){
		this.createUserId=createUserId;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getCreateUserId(){
		return createUserId;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setSort(Integer sort){
		this.sort=sort;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getSort(){
		return sort;
	}
}

