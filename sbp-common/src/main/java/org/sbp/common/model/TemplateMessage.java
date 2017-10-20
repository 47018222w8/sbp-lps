package org.sbp.common.model;

/**
 * 微信模板固定模式
 * 
 * @author zwq
 * @date 2017年10月17日
 */
public class TemplateMessage {

    /**
     * 有默认值
     * 
     * @author zwq
     */
    private String topcolor;

    /**
     * 就是openId
     * 
     * @author zwq
     */
    private String touser;

    private String template_id;

    /**
     * 跳转url
     * 
     * @author zwq
     */
    private String url;

    private TemplateMessageData data;

    public TemplateMessage() {

    }

    public TemplateMessage(String touser, String template_id, TemplateMessageData data) {
        super();
        this.touser = touser;
        this.template_id = template_id;
        this.data = data;
    }

    public TemplateMessage(String touser, String template_id, String url, TemplateMessageData data) {
        super();
        this.touser = touser;
        this.template_id = template_id;
        this.url = url;
        this.data = data;
    }

    public String getTouser() {
        return touser;
    }

    public TemplateMessage setTouser(String touser) {
        this.touser = touser;
        return this;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public TemplateMessage setTemplate_id(String template_id) {
        this.template_id = template_id;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public TemplateMessage setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getTopcolor() {
        return topcolor == null ? "#FF0000" : topcolor;
    }

    public TemplateMessage setTopcolor(String topcolor) {
        this.topcolor = topcolor;
        return this;
    }

    public TemplateMessageData getData() {
        return data;
    }

    public TemplateMessage setData(TemplateMessageData data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "TemplateMessage [touser=" + touser
                + ", templateId="
                + template_id
                + ", url="
                + url
                + ", topcolor="
                + topcolor
                + ", data="
                + data
                + "]";
    }

}
