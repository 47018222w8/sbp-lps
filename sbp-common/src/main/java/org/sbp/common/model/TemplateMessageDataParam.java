package org.sbp.common.model;
/**
 * 微信模板固定格式
 * 
 * @author zwq
 * @date 2017年10月17日
 */
public class TemplateMessageDataParam {

    private String value;

    private String color;

    public TemplateMessageDataParam(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getColor() {
        return color == null ? "#173177" : color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TemplateMessageDataParam [value=" + value + ", color=" + color + "]";
    }

}
