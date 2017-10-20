package com.wq.sbp.model;

import java.math.BigDecimal;

/**
 * EsStore 实体类
 *
 * @author zwq
 * @date 2017年10月16日
 */
public class StoreDO {

    private Integer storeId;

    private String storeName;

    private Integer storeType;

    private Integer storeProvinceid;

    private Integer storeCityid;

    private Integer storeRegionid;

    private String attr;

    private String zip;

    private String tel;

    private Integer storeLevel;

    private Integer memberId;

    private String memberName;

    private String idNumber;

    private String idImg;

    private String licenseImg;

    private Integer disabled;

    private Long createTime;

    private Long endTime;

    private String storeLogo;

    private String description;

    private Integer storeRecommend;

    private Integer storeTheme;

    private Integer storeCredit;

    private BigDecimal praiseRate;

    private BigDecimal storeDesccredit;

    private BigDecimal storeServicecredit;

    private BigDecimal storeDeliverycredit;

    private Integer storeCollect;

    private Integer storeAuth;

    private Integer nameAuth;

    private String storeProvince;

    private String storeCity;

    private String storeRegion;

    private Integer goodsNum;

    private String qq;

    private String storeBanner;

    private BigDecimal commission;

    private String bankAccountName;

    private String bankAccountNumber;

    private String bankName;

    private String bankCode;

    private Integer bankProvinceid;

    private Integer bankCityid;

    private Integer bankRegionid;

    private String bankProvince;

    private String bankCity;

    private String bankRegion;

    private String attachment;

    private String contacter;

    private String email;

    private String storeCat;

    /**
     * 供应商星级（每月更新一次，默认是 2 星，数字 几 即代表几星 ）
     * 
     * @author zwq
     */
    private String starLevel;

    @Override
    public String toString() {
        return "StoreDO [storeId=" + storeId
                + ", storeName="
                + storeName
                + ", storeType="
                + storeType
                + ", storeProvinceid="
                + storeProvinceid
                + ", storeCityid="
                + storeCityid
                + ", storeRegionid="
                + storeRegionid
                + ", attr="
                + attr
                + ", zip="
                + zip
                + ", tel="
                + tel
                + ", storeLevel="
                + storeLevel
                + ", memberId="
                + memberId
                + ", memberName="
                + memberName
                + ", idNumber="
                + idNumber
                + ", idImg="
                + idImg
                + ", licenseImg="
                + licenseImg
                + ", disabled="
                + disabled
                + ", createTime="
                + createTime
                + ", endTime="
                + endTime
                + ", storeLogo="
                + storeLogo
                + ", description="
                + description
                + ", storeRecommend="
                + storeRecommend
                + ", storeTheme="
                + storeTheme
                + ", storeCredit="
                + storeCredit
                + ", praiseRate="
                + praiseRate
                + ", storeDesccredit="
                + storeDesccredit
                + ", storeServicecredit="
                + storeServicecredit
                + ", storeDeliverycredit="
                + storeDeliverycredit
                + ", storeCollect="
                + storeCollect
                + ", storeAuth="
                + storeAuth
                + ", nameAuth="
                + nameAuth
                + ", storeProvince="
                + storeProvince
                + ", storeCity="
                + storeCity
                + ", storeRegion="
                + storeRegion
                + ", goodsNum="
                + goodsNum
                + ", qq="
                + qq
                + ", storeBanner="
                + storeBanner
                + ", commission="
                + commission
                + ", bankAccountName="
                + bankAccountName
                + ", bankAccountNumber="
                + bankAccountNumber
                + ", bankName="
                + bankName
                + ", bankCode="
                + bankCode
                + ", bankProvinceid="
                + bankProvinceid
                + ", bankCityid="
                + bankCityid
                + ", bankRegionid="
                + bankRegionid
                + ", bankProvince="
                + bankProvince
                + ", bankCity="
                + bankCity
                + ", bankRegion="
                + bankRegion
                + ", attachment="
                + attachment
                + ", contacter="
                + contacter
                + ", email="
                + email
                + ", storeCat="
                + storeCat
                + ", starLevel="
                + starLevel
                + "]";
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreType(Integer storeType) {
        this.storeType = storeType;
    }

    public Integer getStoreType() {
        return storeType;
    }

    public void setStoreProvinceid(Integer storeProvinceid) {
        this.storeProvinceid = storeProvinceid;
    }

    public Integer getStoreProvinceid() {
        return storeProvinceid;
    }

    public void setStoreCityid(Integer storeCityid) {
        this.storeCityid = storeCityid;
    }

    public Integer getStoreCityid() {
        return storeCityid;
    }

    public void setStoreRegionid(Integer storeRegionid) {
        this.storeRegionid = storeRegionid;
    }

    public Integer getStoreRegionid() {
        return storeRegionid;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

    public String getAttr() {
        return attr;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getZip() {
        return zip;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return tel;
    }

    public void setStoreLevel(Integer storeLevel) {
        this.storeLevel = storeLevel;
    }

    public Integer getStoreLevel() {
        return storeLevel;
    }

    public StoreDO setMemberId(Integer memberId) {
        this.memberId = memberId;
        return this;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdImg(String idImg) {
        this.idImg = idImg;
    }

    public String getIdImg() {
        return idImg;
    }

    public void setLicenseImg(String licenseImg) {
        this.licenseImg = licenseImg;
    }

    public String getLicenseImg() {
        return licenseImg;
    }

    public void setDisabled(Integer disabled) {
        this.disabled = disabled;
    }

    public Integer getDisabled() {
        return disabled;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setStoreLogo(String storeLogo) {
        this.storeLogo = storeLogo;
    }

    public String getStoreLogo() {
        return storeLogo;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setStoreRecommend(Integer storeRecommend) {
        this.storeRecommend = storeRecommend;
    }

    public Integer getStoreRecommend() {
        return storeRecommend;
    }

    public void setStoreTheme(Integer storeTheme) {
        this.storeTheme = storeTheme;
    }

    public Integer getStoreTheme() {
        return storeTheme;
    }

    public void setStoreCredit(Integer storeCredit) {
        this.storeCredit = storeCredit;
    }

    public Integer getStoreCredit() {
        return storeCredit;
    }

    public void setPraiseRate(BigDecimal praiseRate) {
        this.praiseRate = praiseRate;
    }

    public BigDecimal getPraiseRate() {
        return praiseRate;
    }

    public void setStoreDesccredit(BigDecimal storeDesccredit) {
        this.storeDesccredit = storeDesccredit;
    }

    public BigDecimal getStoreDesccredit() {
        return storeDesccredit;
    }

    public void setStoreServicecredit(BigDecimal storeServicecredit) {
        this.storeServicecredit = storeServicecredit;
    }

    public BigDecimal getStoreServicecredit() {
        return storeServicecredit;
    }

    public void setStoreDeliverycredit(BigDecimal storeDeliverycredit) {
        this.storeDeliverycredit = storeDeliverycredit;
    }

    public BigDecimal getStoreDeliverycredit() {
        return storeDeliverycredit;
    }

    public void setStoreCollect(Integer storeCollect) {
        this.storeCollect = storeCollect;
    }

    public Integer getStoreCollect() {
        return storeCollect;
    }

    public void setStoreAuth(Integer storeAuth) {
        this.storeAuth = storeAuth;
    }

    public Integer getStoreAuth() {
        return storeAuth;
    }

    public void setNameAuth(Integer nameAuth) {
        this.nameAuth = nameAuth;
    }

    public Integer getNameAuth() {
        return nameAuth;
    }

    public void setStoreProvince(String storeProvince) {
        this.storeProvince = storeProvince;
    }

    public String getStoreProvince() {
        return storeProvince;
    }

    public void setStoreCity(String storeCity) {
        this.storeCity = storeCity;
    }

    public String getStoreCity() {
        return storeCity;
    }

    public void setStoreRegion(String storeRegion) {
        this.storeRegion = storeRegion;
    }

    public String getStoreRegion() {
        return storeRegion;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getQq() {
        return qq;
    }

    public void setStoreBanner(String storeBanner) {
        this.storeBanner = storeBanner;
    }

    public String getStoreBanner() {
        return storeBanner;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getBankCode() {
        return bankCode;
    }

    public void setBankProvinceid(Integer bankProvinceid) {
        this.bankProvinceid = bankProvinceid;
    }

    public Integer getBankProvinceid() {
        return bankProvinceid;
    }

    public void setBankCityid(Integer bankCityid) {
        this.bankCityid = bankCityid;
    }

    public Integer getBankCityid() {
        return bankCityid;
    }

    public void setBankRegionid(Integer bankRegionid) {
        this.bankRegionid = bankRegionid;
    }

    public Integer getBankRegionid() {
        return bankRegionid;
    }

    public void setBankProvince(String bankProvince) {
        this.bankProvince = bankProvince;
    }

    public String getBankProvince() {
        return bankProvince;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankRegion(String bankRegion) {
        this.bankRegion = bankRegion;
    }

    public String getBankRegion() {
        return bankRegion;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setContacter(String contacter) {
        this.contacter = contacter;
    }

    public String getContacter() {
        return contacter;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setStoreCat(String storeCat) {
        this.storeCat = storeCat;
    }

    public String getStoreCat() {
        return storeCat;
    }

    public void setStarLevel(String starLevel) {
        this.starLevel = starLevel;
    }

    public String getStarLevel() {
        return starLevel;
    }
}
