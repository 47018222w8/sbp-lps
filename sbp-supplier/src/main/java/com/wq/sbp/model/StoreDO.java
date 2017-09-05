package com.wq.sbp.model;

import java.math.BigDecimal;

/**
 * EsStore 实体类
 * 2017-08-18
 */ 
public class StoreDO {

	 // 这家伙很懒,没有留下注释
	private Integer storeId;

	 // 这家伙很懒,没有留下注释
	private String storeName;

	 // 这家伙很懒,没有留下注释
	private Integer storeType;

	 // 这家伙很懒,没有留下注释
	private Integer storeProvinceid;

	 // 这家伙很懒,没有留下注释
	private Integer storeCityid;

	 // 这家伙很懒,没有留下注释
	private Integer storeRegionid;

	 // 这家伙很懒,没有留下注释
	private String attr;

	 // 这家伙很懒,没有留下注释
	private String zip;

	 // 这家伙很懒,没有留下注释
	private String tel;

	 // 这家伙很懒,没有留下注释
	private Integer storeLevel;

	 // 这家伙很懒,没有留下注释
	private Integer memberId;

	 // 这家伙很懒,没有留下注释
	private String memberName;

	 // 这家伙很懒,没有留下注释
	private String idNumber;

	 // 这家伙很懒,没有留下注释
	private String idImg;

	 // 这家伙很懒,没有留下注释
	private String licenseImg;

	 // 这家伙很懒,没有留下注释
	private Integer disabled;

	 // 这家伙很懒,没有留下注释
	private Long createTime;

	 // 这家伙很懒,没有留下注释
	private Long endTime;

	 // 这家伙很懒,没有留下注释
	private String storeLogo;

	 // 这家伙很懒,没有留下注释
	private String description;

	 // 这家伙很懒,没有留下注释
	private Integer storeRecommend;

	 // 这家伙很懒,没有留下注释
	private Integer storeTheme;

	 // 这家伙很懒,没有留下注释
	private Integer storeCredit;

	 // 这家伙很懒,没有留下注释
	private BigDecimal praiseRate;

	 // 这家伙很懒,没有留下注释
	private BigDecimal storeDesccredit;

	 // 这家伙很懒,没有留下注释
	private BigDecimal storeServicecredit;

	 // 这家伙很懒,没有留下注释
	private BigDecimal storeDeliverycredit;

	 // 这家伙很懒,没有留下注释
	private Integer storeCollect;

	 // 这家伙很懒,没有留下注释
	private Integer storeAuth;

	 // 这家伙很懒,没有留下注释
	private Integer nameAuth;

	 // 这家伙很懒,没有留下注释
	private String storeProvince;

	 // 这家伙很懒,没有留下注释
	private String storeCity;

	 // 这家伙很懒,没有留下注释
	private String storeRegion;

	 // 这家伙很懒,没有留下注释
	private Integer goodsNum;

	 // 这家伙很懒,没有留下注释
	private String qq;

	 // 这家伙很懒,没有留下注释
	private String storeBanner;

	 // 这家伙很懒,没有留下注释
	private BigDecimal commission;

	 // 这家伙很懒,没有留下注释
	private String bankAccountName;

	 // 这家伙很懒,没有留下注释
	private String bankAccountNumber;

	 // 这家伙很懒,没有留下注释
	private String bankName;

	 // 这家伙很懒,没有留下注释
	private String bankCode;

	 // 这家伙很懒,没有留下注释
	private Integer bankProvinceid;

	 // 这家伙很懒,没有留下注释
	private Integer bankCityid;

	 // 这家伙很懒,没有留下注释
	private Integer bankRegionid;

	 // 这家伙很懒,没有留下注释
	private String bankProvince;

	 // 这家伙很懒,没有留下注释
	private String bankCity;

	 // 这家伙很懒,没有留下注释
	private String bankRegion;

	 // 这家伙很懒,没有留下注释
	private String attachment;

	 // 这家伙很懒,没有留下注释
	private String contacter;

	 // 这家伙很懒,没有留下注释
	private String email;

	 // 这家伙很懒,没有留下注释
	private String storeCat;

	 // 供应商星级（每月更新一次，默认是 2 星，数字 几 即代表几星 ）
	private String starLevel;
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
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreName(String storeName){
		this.storeName=storeName;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getStoreName(){
		return storeName;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreType(Integer storeType){
		this.storeType=storeType;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getStoreType(){
		return storeType;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreProvinceid(Integer storeProvinceid){
		this.storeProvinceid=storeProvinceid;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getStoreProvinceid(){
		return storeProvinceid;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreCityid(Integer storeCityid){
		this.storeCityid=storeCityid;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getStoreCityid(){
		return storeCityid;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreRegionid(Integer storeRegionid){
		this.storeRegionid=storeRegionid;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getStoreRegionid(){
		return storeRegionid;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setAttr(String attr){
		this.attr=attr;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getAttr(){
		return attr;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setZip(String zip){
		this.zip=zip;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getZip(){
		return zip;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setTel(String tel){
		this.tel=tel;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getTel(){
		return tel;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreLevel(Integer storeLevel){
		this.storeLevel=storeLevel;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getStoreLevel(){
		return storeLevel;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setMemberId(Integer memberId){
		this.memberId=memberId;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getMemberId(){
		return memberId;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setMemberName(String memberName){
		this.memberName=memberName;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getMemberName(){
		return memberName;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setIdNumber(String idNumber){
		this.idNumber=idNumber;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getIdNumber(){
		return idNumber;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setIdImg(String idImg){
		this.idImg=idImg;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getIdImg(){
		return idImg;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setLicenseImg(String licenseImg){
		this.licenseImg=licenseImg;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getLicenseImg(){
		return licenseImg;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setDisabled(Integer disabled){
		this.disabled=disabled;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getDisabled(){
		return disabled;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setCreateTime(Long createTime){
		this.createTime=createTime;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Long getCreateTime(){
		return createTime;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setEndTime(Long endTime){
		this.endTime=endTime;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Long getEndTime(){
		return endTime;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreLogo(String storeLogo){
		this.storeLogo=storeLogo;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getStoreLogo(){
		return storeLogo;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setDescription(String description){
		this.description=description;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getDescription(){
		return description;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreRecommend(Integer storeRecommend){
		this.storeRecommend=storeRecommend;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getStoreRecommend(){
		return storeRecommend;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreTheme(Integer storeTheme){
		this.storeTheme=storeTheme;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getStoreTheme(){
		return storeTheme;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreCredit(Integer storeCredit){
		this.storeCredit=storeCredit;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getStoreCredit(){
		return storeCredit;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setPraiseRate(BigDecimal praiseRate){
		this.praiseRate=praiseRate;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public BigDecimal getPraiseRate(){
		return praiseRate;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreDesccredit(BigDecimal storeDesccredit){
		this.storeDesccredit=storeDesccredit;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public BigDecimal getStoreDesccredit(){
		return storeDesccredit;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreServicecredit(BigDecimal storeServicecredit){
		this.storeServicecredit=storeServicecredit;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public BigDecimal getStoreServicecredit(){
		return storeServicecredit;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreDeliverycredit(BigDecimal storeDeliverycredit){
		this.storeDeliverycredit=storeDeliverycredit;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public BigDecimal getStoreDeliverycredit(){
		return storeDeliverycredit;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreCollect(Integer storeCollect){
		this.storeCollect=storeCollect;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getStoreCollect(){
		return storeCollect;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreAuth(Integer storeAuth){
		this.storeAuth=storeAuth;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getStoreAuth(){
		return storeAuth;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setNameAuth(Integer nameAuth){
		this.nameAuth=nameAuth;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getNameAuth(){
		return nameAuth;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreProvince(String storeProvince){
		this.storeProvince=storeProvince;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getStoreProvince(){
		return storeProvince;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreCity(String storeCity){
		this.storeCity=storeCity;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getStoreCity(){
		return storeCity;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreRegion(String storeRegion){
		this.storeRegion=storeRegion;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getStoreRegion(){
		return storeRegion;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setGoodsNum(Integer goodsNum){
		this.goodsNum=goodsNum;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getGoodsNum(){
		return goodsNum;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setQq(String qq){
		this.qq=qq;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getQq(){
		return qq;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreBanner(String storeBanner){
		this.storeBanner=storeBanner;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getStoreBanner(){
		return storeBanner;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setCommission(BigDecimal commission){
		this.commission=commission;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public BigDecimal getCommission(){
		return commission;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setBankAccountName(String bankAccountName){
		this.bankAccountName=bankAccountName;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getBankAccountName(){
		return bankAccountName;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setBankAccountNumber(String bankAccountNumber){
		this.bankAccountNumber=bankAccountNumber;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getBankAccountNumber(){
		return bankAccountNumber;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setBankName(String bankName){
		this.bankName=bankName;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getBankName(){
		return bankName;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setBankCode(String bankCode){
		this.bankCode=bankCode;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getBankCode(){
		return bankCode;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setBankProvinceid(Integer bankProvinceid){
		this.bankProvinceid=bankProvinceid;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getBankProvinceid(){
		return bankProvinceid;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setBankCityid(Integer bankCityid){
		this.bankCityid=bankCityid;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getBankCityid(){
		return bankCityid;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setBankRegionid(Integer bankRegionid){
		this.bankRegionid=bankRegionid;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getBankRegionid(){
		return bankRegionid;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setBankProvince(String bankProvince){
		this.bankProvince=bankProvince;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getBankProvince(){
		return bankProvince;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setBankCity(String bankCity){
		this.bankCity=bankCity;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getBankCity(){
		return bankCity;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setBankRegion(String bankRegion){
		this.bankRegion=bankRegion;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getBankRegion(){
		return bankRegion;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setAttachment(String attachment){
		this.attachment=attachment;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getAttachment(){
		return attachment;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setContacter(String contacter){
		this.contacter=contacter;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getContacter(){
		return contacter;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setEmail(String email){
		this.email=email;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getEmail(){
		return email;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setStoreCat(String storeCat){
		this.storeCat=storeCat;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getStoreCat(){
		return storeCat;
	}
	/**
	 * 供应商星级（每月更新一次，默认是 2 星，数字 几 即代表几星 ） 
	 */ 
	public void setStarLevel(String starLevel){
		this.starLevel=starLevel;
	}
	/**
	 * 供应商星级（每月更新一次，默认是 2 星，数字 几 即代表几星 ） 
	 */ 
	public String getStarLevel(){
		return starLevel;
	}
}

