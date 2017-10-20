package com.wq.sbp.model;

import java.math.BigDecimal;

/**
 * EsMember实体类
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
public class MemberDO {

    private Integer memberId;

    private Integer agentid;

    private Integer parentid;

    private Integer lvId;

    private String uname;

    private String email;

    private String password;

    private Long regtime;

    private String pwAnswer;

    private String pwQuestion;

    private String name;

    private Integer sex;

    private Long birthday;

    private BigDecimal advance;

    private Integer provinceId;

    private Integer cityId;

    private Integer regionId;

    private String province;

    private String city;

    private String region;

    private String address;

    private String zip;

    private String mobile;

    private String tel;

    private Long point;

    private Long mp;

    private String qq;

    private String msn;

    private String remark;

    private Long lastlogin;

    private Integer isAgent;

    private Integer logincount;

    private Integer isCheked;

    private String registerip;

    private Integer recommendPointState;

    private Integer lastSendEmail;

    private Integer infoFull;

    private String findCode;

    private String face;

    private String nickname;

    private Integer midentity;

    private Integer storeId;

    private Integer isStore;

    private String guid;

    private String invitePwd;

    private String openId;

    private String unionId;

    private String attTime;

    private Integer isRepairer;

    private String openIdStatus;

    private String token;

    private String deviceId;

    @Override
    public String toString() {
        return "MemberDO [memberId=" + memberId
                + ", agentid="
                + agentid
                + ", parentid="
                + parentid
                + ", lvId="
                + lvId
                + ", uname="
                + uname
                + ", email="
                + email
                + ", password="
                + password
                + ", regtime="
                + regtime
                + ", pwAnswer="
                + pwAnswer
                + ", pwQuestion="
                + pwQuestion
                + ", name="
                + name
                + ", sex="
                + sex
                + ", birthday="
                + birthday
                + ", advance="
                + advance
                + ", provinceId="
                + provinceId
                + ", cityId="
                + cityId
                + ", regionId="
                + regionId
                + ", province="
                + province
                + ", city="
                + city
                + ", region="
                + region
                + ", address="
                + address
                + ", zip="
                + zip
                + ", mobile="
                + mobile
                + ", tel="
                + tel
                + ", point="
                + point
                + ", mp="
                + mp
                + ", qq="
                + qq
                + ", msn="
                + msn
                + ", remark="
                + remark
                + ", lastlogin="
                + lastlogin
                + ", isAgent="
                + isAgent
                + ", logincount="
                + logincount
                + ", isCheked="
                + isCheked
                + ", registerip="
                + registerip
                + ", recommendPointState="
                + recommendPointState
                + ", lastSendEmail="
                + lastSendEmail
                + ", infoFull="
                + infoFull
                + ", findCode="
                + findCode
                + ", face="
                + face
                + ", nickname="
                + nickname
                + ", midentity="
                + midentity
                + ", storeId="
                + storeId
                + ", isStore="
                + isStore
                + ", guid="
                + guid
                + ", invitePwd="
                + invitePwd
                + ", openId="
                + openId
                + ", unionId="
                + unionId
                + ", attTime="
                + attTime
                + ", isRepairer="
                + isRepairer
                + ", openIdStatus="
                + openIdStatus
                + ", token="
                + token
                + ", deviceId="
                + deviceId
                + "]";
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setAgentid(Integer agentid) {
        this.agentid = agentid;
    }

    public Integer getAgentid() {
        return agentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setLvId(Integer lvId) {
        this.lvId = lvId;
    }

    public Integer getLvId() {
        return lvId;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUname() {
        return uname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setRegtime(Long regtime) {
        this.regtime = regtime;
    }

    public Long getRegtime() {
        return regtime;
    }

    public void setPwAnswer(String pwAnswer) {
        this.pwAnswer = pwAnswer;
    }

    public String getPwAnswer() {
        return pwAnswer;
    }

    public void setPwQuestion(String pwQuestion) {
        this.pwQuestion = pwQuestion;
    }

    public String getPwQuestion() {
        return pwQuestion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getSex() {
        return sex;
    }

    public void setBirthday(Long birthday) {
        this.birthday = birthday;
    }

    public Long getBirthday() {
        return birthday;
    }

    public void setAdvance(BigDecimal advance) {
        this.advance = advance;
    }

    public BigDecimal getAdvance() {
        return advance;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setRegionId(Integer regionId) {
        this.regionId = regionId;
    }

    public Integer getRegionId() {
        return regionId;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getProvince() {
        return province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion() {
        return region;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getZip() {
        return zip;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return tel;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    public Long getPoint() {
        return point;
    }

    public void setMp(Long mp) {
        this.mp = mp;
    }

    public Long getMp() {
        return mp;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getQq() {
        return qq;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    public String getMsn() {
        return msn;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public void setLastlogin(Long lastlogin) {
        this.lastlogin = lastlogin;
    }

    public Long getLastlogin() {
        return lastlogin;
    }

    public void setIsAgent(Integer isAgent) {
        this.isAgent = isAgent;
    }

    public Integer getIsAgent() {
        return isAgent;
    }

    public void setLogincount(Integer logincount) {
        this.logincount = logincount;
    }

    public Integer getLogincount() {
        return logincount;
    }

    public void setIsCheked(Integer isCheked) {
        this.isCheked = isCheked;
    }

    public Integer getIsCheked() {
        return isCheked;
    }

    public void setRegisterip(String registerip) {
        this.registerip = registerip;
    }

    public String getRegisterip() {
        return registerip;
    }

    public void setRecommendPointState(Integer recommendPointState) {
        this.recommendPointState = recommendPointState;
    }

    public Integer getRecommendPointState() {
        return recommendPointState;
    }

    public void setLastSendEmail(Integer lastSendEmail) {
        this.lastSendEmail = lastSendEmail;
    }

    public Integer getLastSendEmail() {
        return lastSendEmail;
    }

    public void setInfoFull(Integer infoFull) {
        this.infoFull = infoFull;
    }

    public Integer getInfoFull() {
        return infoFull;
    }

    public void setFindCode(String findCode) {
        this.findCode = findCode;
    }

    public String getFindCode() {
        return findCode;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getFace() {
        return face;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public void setMidentity(Integer midentity) {
        this.midentity = midentity;
    }

    public Integer getMidentity() {
        return midentity;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setIsStore(Integer isStore) {
        this.isStore = isStore;
    }

    public Integer getIsStore() {
        return isStore;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getGuid() {
        return guid;
    }

    public void setInvitePwd(String invitePwd) {
        this.invitePwd = invitePwd;
    }

    public String getInvitePwd() {
        return invitePwd;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setAttTime(String attTime) {
        this.attTime = attTime;
    }

    public String getAttTime() {
        return attTime;
    }

    public void setIsRepairer(Integer isRepairer) {
        this.isRepairer = isRepairer;
    }

    public Integer getIsRepairer() {
        return isRepairer;
    }

    public void setOpenIdStatus(String openIdStatus) {
        this.openIdStatus = openIdStatus;
    }

    public String getOpenIdStatus() {
        return openIdStatus;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceId() {
        return deviceId;
    }
}
