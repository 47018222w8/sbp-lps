package com.wq.sbp.model;
import java.util.Date;

/**
 * TSupplierCarPart 实体类
 * 2017-09-26
 */ 
public class SupplierCarPart {

	 // 这家伙很懒,没有留下注释
	private Integer id;

	 // 这家伙很懒,没有留下注释
	private Integer carPartSortId;

	 // 这家伙很懒,没有留下注释
	private Integer storeId;

	 // 是否启用:0否,1是
	private Integer flag;

	 // 这家伙很懒,没有留下注释
	private Date gmtCreate;

	 // 这家伙很懒,没有留下注释
	private Date gmtModify;

	 // 对应 store_id的member_id,不是操作人id
	private Integer memberId;
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setId(Integer id){
		this.id=id;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getId(){
		return id;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setCarPartSortId(Integer carPartSortId){
		this.carPartSortId=carPartSortId;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getCarPartSortId(){
		return carPartSortId;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreId(Integer storeId){
		this.storeId=storeId;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getStoreId(){
		return storeId;
	}
	/**
	 * 是否启用:0否,1是 
	 */ 
	public void setFlag(Integer flag){
		this.flag=flag;
	}
	/**
	 * 是否启用:0否,1是 
	 */ 
	public Integer getFlag(){
		return flag;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setGmtCreate(Date gmtCreate){
		this.gmtCreate=gmtCreate;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Date getGmtCreate(){
		return gmtCreate;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setGmtModify(Date gmtModify){
		this.gmtModify=gmtModify;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Date getGmtModify(){
		return gmtModify;
	}
	/**
	 * 对应 store_id的member_id,不是操作人id 
	 */ 
	public void setMemberId(Integer memberId){
		this.memberId=memberId;
	}
	/**
	 * 对应 store_id的member_id,不是操作人id 
	 */ 
	public Integer getMemberId(){
		return memberId;
	}
}

