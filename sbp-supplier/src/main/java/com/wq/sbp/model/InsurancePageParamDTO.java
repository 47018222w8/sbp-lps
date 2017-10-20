package com.wq.sbp.model;

import java.util.Arrays;

/**
 * 询价列表需要的参数
 *
 *
 * @author zwq
 * @date 2017年10月9日
 */
public class InsurancePageParamDTO {

    /**
     * 符号0:小于1:大于
     * 
     * @author zwq
     */
    private Integer mark;

    /**
     * 询价单状态
     * 
     * @author zwq
     */
    private String[] insReportStates;

    /**
     * 本供应商对此询价单报价状态
     * 
     * @author zwq
     */
    private Integer reportState;

    /**
     * 询价单状态,逗号分隔字符串
     * 
     * @author zwq
     */
    private String insReportStatesStr;

    /**
     * 补充字段
     * 
     * @author zwq
     */
    private String param1;

    /**
     * 补充字段
     * 
     * @author zwq
     */
    private String param2;

    /**
     * 供应商memberId
     * 
     * @author zwq
     */
    private Integer supplierMemberId;

    /**
     * 页
     * 
     * @author zwq
     */
    private Integer pageNum;

    /**
     * 页大小
     * 
     * @author zwq
     */
    private Integer pageSize;

    /**
     * 是否已读
     * 
     * @author zwq
     */
    private Integer isRead;

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public Integer getReportState() {
        return reportState;
    }

    public void setReportState(Integer reportState) {
        this.reportState = reportState;
    }

    public Integer getSupplierMemberId() {
        return supplierMemberId;
    }

    public void setSupplierMemberId(Integer memberId) {
        this.supplierMemberId = memberId;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public String[] getInsReportStates() {
        return insReportStates;
    }

    public void setInsReportStates(String[] insReportStates) {
        this.insReportStates = insReportStates;
    }

    public String getInsReportStatesStr() {
        return insReportStatesStr;
    }

    public void setInsReportStatesStr(String insReportStatesStr) {
        this.insReportStatesStr = insReportStatesStr;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    @Override
    public String toString() {
        return "InsurancePageParamDTO [mark=" + mark
                + ", insReportStates="
                + Arrays.toString(insReportStates)
                + ", reportState="
                + reportState
                + ", insReportStatesStr="
                + insReportStatesStr
                + ", param1="
                + param1
                + ", param2="
                + param2
                + ", supplierMemberId="
                + supplierMemberId
                + ", pageNum="
                + pageNum
                + ", pageSize="
                + pageSize
                + ", isRead="
                + isRead
                + "]";
    }

}
