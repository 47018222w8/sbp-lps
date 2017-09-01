package com.wq.sbp.model;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;

import com.wq.sbp.common.constants.Constants;

/**
 * IbsReportPrice 实体类
 * 2017-08-31
 */
public class ReportPrice {

    // 这家伙很懒,没有留下注释
    private Integer id;

    // 定损单ID
    private Integer insId;

    // ibs_insurance_info中id
    private Integer insInfoId;

    // 报价金额
    private BigDecimal price;

    // 供应商id
    private Integer supplierId;

    // 状态0:未报价 1:已过期 2:已报价 3中标 4已发货
    private String state;

    // 报价时间(精确到时分秒)
    private Long reportTime;

    // 创建日期(精确到时分秒)
    private Long createTime;

    // member_id
    private Integer memberId;

    // 流程类型
    private Integer processType;

    // 目标价
    private BigDecimal targetPrice;

    // 是否经营该产品（0: 经营 1:不经营 ， 默认是0 ）
    private String isOperProd;

    // concat 5张零件图
    private String concatSrc;

    // 部件名称
    private String name;

    private List<Map<String, Object>> groupSrc;

    public List<Map<String, Object>> getGroupSrc() {
        groupSrc = new LinkedList<>();
        if (StringUtils.isNotEmpty(concatSrc)) {
            String[] arry = concatSrc.split(",");
            for (String str : arry) {
                Map<String, Object> map = new HashMap<>();
                map.put("src", Constants.DOMAIN + str);
                map.put("w", 600);
                map.put("h", 400);
                groupSrc.add(map);
            }
        }
        return groupSrc;
    }

    public Integer getId() {
        return id;
    }

    public String getConcatSrc() {
        return concatSrc;
    }

    public void setGroupSrc(List<Map<String, Object>> groupSrc) {
        this.groupSrc = groupSrc;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInsId() {
        return insId;
    }

    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    public Integer getInsInfoId() {
        return insInfoId;
    }

    public void setInsInfoId(Integer insInfoId) {
        this.insInfoId = insInfoId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getReportTime() {
        return reportTime;
    }

    public void setReportTime(Long reportTime) {
        this.reportTime = reportTime;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getProcessType() {
        return processType;
    }

    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    public BigDecimal getTargetPrice() {
        return targetPrice;
    }

    public void setTargetPrice(BigDecimal targetPrice) {
        this.targetPrice = targetPrice;
    }

    public String getIsOperProd() {
        return isOperProd;
    }

    public void setIsOperProd(String isOperProd) {
        this.isOperProd = isOperProd;
    }

    public void setConcatSrc(String concatSrc) {
        this.concatSrc = concatSrc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
