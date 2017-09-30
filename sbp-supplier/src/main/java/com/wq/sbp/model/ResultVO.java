package com.wq.sbp.model;

import java.io.Serializable;

public class ResultVO implements Serializable {

    private static final long serialVersionUID = -8130588879304354948L;

    private int code;

    private String msg;

    private Object data;

    public ResultVO() {
    }

    public ResultVO(ResultTypeEnum rt) {
        this.code = rt.getCode();
        this.msg = rt.getMsg();
    }

    public ResultVO(ResultTypeEnum rt, Object data) {
        this.code = rt.getCode();
        this.msg = rt.getMsg();
        this.data = data;
    }

    public ResultVO(int code) {
        this.code = code;
    }

    public ResultVO(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultVO(int code, Object data) {
        this.code = code;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
