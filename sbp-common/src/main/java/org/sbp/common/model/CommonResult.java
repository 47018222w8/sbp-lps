package org.sbp.common.model;

public class CommonResult {

    /**
     * 是否成功
     * 
     * @author zwq
     */
    private Boolean success;

    private String mssage;

    public Boolean getSuccess() {
        return success;
    }

    public CommonResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMssage() {
        return mssage;
    }

    public CommonResult setMssage(String mssage) {
        this.mssage = mssage;
        return this;
    }

}
