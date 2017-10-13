package com.wq.sbp.model;

/**
 * 主表集合需要的参数
 *
 *
 * @author zwq
 * @since 2017年10月9日
 */
public class InsurancePageParam {

    // 符号0:小于1:大于
    private Integer mark;

    private String[] insReportStates;

    private Integer reportState;

    private String insReportStatesStr;

    private String param1;

    private String param2;

    private Integer supplierMemberId;

    private int pageNum;

    private int pageSize;

    private int isRead;

    public int getIsRead() {
        return isRead;
    }

    public void setIsRead(int isRead) {
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

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
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

}
