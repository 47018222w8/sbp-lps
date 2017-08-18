package com.wq.sbp.model;

import java.math.BigDecimal;

/**
 * EsMember 实体类
 * 2017-08-18
 */ 
public class Member {

	 // 这家伙很懒,没有留下注释
	private Integer memberId;

	 // 这家伙很懒,没有留下注释
	private Integer agentid;

	 // 这家伙很懒,没有留下注释
	private Integer parentid;

	 // 这家伙很懒,没有留下注释
	private Integer lvId;

	 // 这家伙很懒,没有留下注释
	private String uname;

	 // 这家伙很懒,没有留下注释
	private String email;

	 // 这家伙很懒,没有留下注释
	private String password;

	 // 这家伙很懒,没有留下注释
	private Long regtime;

	 // 这家伙很懒,没有留下注释
	private String pwAnswer;

	 // 这家伙很懒,没有留下注释
	private String pwQuestion;

	 // 这家伙很懒,没有留下注释
	private String name;

	 // 这家伙很懒,没有留下注释
	private Integer sex;

	 // 这家伙很懒,没有留下注释
	private Long birthday;

	 // 这家伙很懒,没有留下注释
	private BigDecimal advance;

	 // 这家伙很懒,没有留下注释
	private Integer provinceId;

	 // 这家伙很懒,没有留下注释
	private Integer cityId;

	 // 这家伙很懒,没有留下注释
	private Integer regionId;

	 // 这家伙很懒,没有留下注释
	private String province;

	 // 这家伙很懒,没有留下注释
	private String city;

	 // 这家伙很懒,没有留下注释
	private String region;

	 // 这家伙很懒,没有留下注释
	private String address;

	 // 这家伙很懒,没有留下注释
	private String zip;

	 // 这家伙很懒,没有留下注释
	private String mobile;

	 // 这家伙很懒,没有留下注释
	private String tel;

	 // 这家伙很懒,没有留下注释
	private Long point;

	 // 这家伙很懒,没有留下注释
	private Long mp;

	 // 这家伙很懒,没有留下注释
	private String qq;

	 // 这家伙很懒,没有留下注释
	private String msn;

	 // 这家伙很懒,没有留下注释
	private String remark;

	 // 这家伙很懒,没有留下注释
	private Long lastlogin;

	 // 这家伙很懒,没有留下注释
	private Integer isAgent;

	 // 这家伙很懒,没有留下注释
	private Integer logincount;

	 // 这家伙很懒,没有留下注释
	private Integer isCheked;

	 // 这家伙很懒,没有留下注释
	private String registerip;

	 // 这家伙很懒,没有留下注释
	private Integer recommendPointState;

	 // 这家伙很懒,没有留下注释
	private Integer lastSendEmail;

	 // 这家伙很懒,没有留下注释
	private Integer infoFull;

	 // 这家伙很懒,没有留下注释
	private String findCode;

	 // 这家伙很懒,没有留下注释
	private String face;

	 // 这家伙很懒,没有留下注释
	private String nickname;

	 // 这家伙很懒,没有留下注释
	private Integer midentity;

	 // 这家伙很懒,没有留下注释
	private Integer storeId;

	 // 这家伙很懒,没有留下注释
	private Integer isStore;

	 // 全局用户id，时间到秒再加4位随机数
	private String guid;

	 // ������:��΢����ʹ��
	private String invitePwd;

	 // ���ں��û���ʶ
	private String openId;

	 // ΢���û���ʶ
	private String unionId;

	 // ΢�Ź�עʱ��
	private String attTime;

	 // �Ƿ�Ϊ����ά�޳�, 0.����,1.��.Ĭ��Ϊ0.
	private Integer isRepairer;

	 // 保险单号
	private String openIdStatus;

	 // 这家伙很懒,没有留下注释
	private String token;

	 // 移动设备ID
	private String deviceId;
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
	public void setAgentid(Integer agentid){
		this.agentid=agentid;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getAgentid(){
		return agentid;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setParentid(Integer parentid){
		this.parentid=parentid;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getParentid(){
		return parentid;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setLvId(Integer lvId){
		this.lvId=lvId;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getLvId(){
		return lvId;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setUname(String uname){
		this.uname=uname;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getUname(){
		return uname;
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
	public void setPassword(String password){
		this.password=password;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getPassword(){
		return password;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setRegtime(Long regtime){
		this.regtime=regtime;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Long getRegtime(){
		return regtime;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setPwAnswer(String pwAnswer){
		this.pwAnswer=pwAnswer;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getPwAnswer(){
		return pwAnswer;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setPwQuestion(String pwQuestion){
		this.pwQuestion=pwQuestion;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getPwQuestion(){
		return pwQuestion;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setName(String name){
		this.name=name;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getName(){
		return name;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setSex(Integer sex){
		this.sex=sex;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getSex(){
		return sex;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setBirthday(Long birthday){
		this.birthday=birthday;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Long getBirthday(){
		return birthday;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setAdvance(BigDecimal advance){
		this.advance=advance;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public BigDecimal getAdvance(){
		return advance;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setProvinceId(Integer provinceId){
		this.provinceId=provinceId;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getProvinceId(){
		return provinceId;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setCityId(Integer cityId){
		this.cityId=cityId;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getCityId(){
		return cityId;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setRegionId(Integer regionId){
		this.regionId=regionId;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getRegionId(){
		return regionId;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setProvince(String province){
		this.province=province;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getProvince(){
		return province;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setCity(String city){
		this.city=city;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getCity(){
		return city;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setRegion(String region){
		this.region=region;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getRegion(){
		return region;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setAddress(String address){
		this.address=address;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getAddress(){
		return address;
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
	public void setMobile(String mobile){
		this.mobile=mobile;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getMobile(){
		return mobile;
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
	public void setPoint(Long point){
		this.point=point;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Long getPoint(){
		return point;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setMp(Long mp){
		this.mp=mp;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Long getMp(){
		return mp;
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
	public void setMsn(String msn){
		this.msn=msn;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getMsn(){
		return msn;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setRemark(String remark){
		this.remark=remark;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getRemark(){
		return remark;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setLastlogin(Long lastlogin){
		this.lastlogin=lastlogin;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Long getLastlogin(){
		return lastlogin;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setIsAgent(Integer isAgent){
		this.isAgent=isAgent;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getIsAgent(){
		return isAgent;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setLogincount(Integer logincount){
		this.logincount=logincount;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getLogincount(){
		return logincount;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setIsCheked(Integer isCheked){
		this.isCheked=isCheked;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getIsCheked(){
		return isCheked;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setRegisterip(String registerip){
		this.registerip=registerip;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getRegisterip(){
		return registerip;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setRecommendPointState(Integer recommendPointState){
		this.recommendPointState=recommendPointState;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getRecommendPointState(){
		return recommendPointState;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setLastSendEmail(Integer lastSendEmail){
		this.lastSendEmail=lastSendEmail;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getLastSendEmail(){
		return lastSendEmail;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setInfoFull(Integer infoFull){
		this.infoFull=infoFull;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getInfoFull(){
		return infoFull;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setFindCode(String findCode){
		this.findCode=findCode;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getFindCode(){
		return findCode;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setFace(String face){
		this.face=face;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getFace(){
		return face;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setNickname(String nickname){
		this.nickname=nickname;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getNickname(){
		return nickname;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setMidentity(Integer midentity){
		this.midentity=midentity;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getMidentity(){
		return midentity;
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
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setIsStore(Integer isStore){
		this.isStore=isStore;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public Integer getIsStore(){
		return isStore;
	}
	/**
	 * 全局用户id，时间到秒再加4位随机数 
	 */ 
	public void setGuid(String guid){
		this.guid=guid;
	}
	/**
	 * 全局用户id，时间到秒再加4位随机数 
	 */ 
	public String getGuid(){
		return guid;
	}
	/**
	 * ������:��΢����ʹ�� 
	 */ 
	public void setInvitePwd(String invitePwd){
		this.invitePwd=invitePwd;
	}
	/**
	 * ������:��΢����ʹ�� 
	 */ 
	public String getInvitePwd(){
		return invitePwd;
	}
	/**
	 * ���ں��û���ʶ 
	 */ 
	public void setOpenId(String openId){
		this.openId=openId;
	}
	/**
	 * ���ں��û���ʶ 
	 */ 
	public String getOpenId(){
		return openId;
	}
	/**
	 * ΢���û���ʶ 
	 */ 
	public void setUnionId(String unionId){
		this.unionId=unionId;
	}
	/**
	 * ΢���û���ʶ 
	 */ 
	public String getUnionId(){
		return unionId;
	}
	/**
	 * ΢�Ź�עʱ�� 
	 */ 
	public void setAttTime(String attTime){
		this.attTime=attTime;
	}
	/**
	 * ΢�Ź�עʱ�� 
	 */ 
	public String getAttTime(){
		return attTime;
	}
	/**
	 * �Ƿ�Ϊ����ά�޳�, 0.����,1.��.Ĭ��Ϊ0. 
	 */ 
	public void setIsRepairer(Integer isRepairer){
		this.isRepairer=isRepairer;
	}
	/**
	 * �Ƿ�Ϊ����ά�޳�, 0.����,1.��.Ĭ��Ϊ0. 
	 */ 
	public Integer getIsRepairer(){
		return isRepairer;
	}
	/**
	 * 保险单号 
	 */ 
	public void setOpenIdStatus(String openIdStatus){
		this.openIdStatus=openIdStatus;
	}
	/**
	 * 保险单号 
	 */ 
	public String getOpenIdStatus(){
		return openIdStatus;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public void setToken(String token){
		this.token=token;
	}
	/**
	 * 这家伙很懒,没有留下注释 
	 */ 
	public String getToken(){
		return token;
	}
	/**
	 * 移动设备ID 
	 */ 
	public void setDeviceId(String deviceId){
		this.deviceId=deviceId;
	}
	/**
	 * 移动设备ID 
	 */ 
	public String getDeviceId(){
		return deviceId;
	}
}

