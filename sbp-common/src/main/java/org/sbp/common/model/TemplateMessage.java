package org.sbp.common.model;

public class TemplateMessage {

    private String topcolor;

    private String touser;

    private String template_id;

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

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTopcolor() {
        return topcolor == null ? "#FF0000" : topcolor;
    }

    public void setTopcolor(String topcolor) {
        this.topcolor = topcolor;
    }

    public TemplateMessageData getData() {
        return data;
    }

    public void setData(TemplateMessageData data) {
        this.data = data;
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
