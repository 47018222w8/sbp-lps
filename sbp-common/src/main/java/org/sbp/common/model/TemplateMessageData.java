package org.sbp.common.model;

public class TemplateMessageData {

    private TemplateMessageDataParam first;

    private TemplateMessageDataParam keyword1;

    private TemplateMessageDataParam keyword2;

    private TemplateMessageDataParam keyword3;

    private TemplateMessageDataParam keyword4;

    private TemplateMessageDataParam keyword5;

    private TemplateMessageDataParam remark;

    public TemplateMessageData() {

    }

    public TemplateMessageData(String... args) {
        switch (args.length) {
        case 3:
            this.first = new TemplateMessageDataParam(args[0]);
            this.keyword1 = new TemplateMessageDataParam(args[1]);
            this.remark = new TemplateMessageDataParam(args[2]);
            break;
        case 4:
            this.first = new TemplateMessageDataParam(args[0]);
            this.keyword1 = new TemplateMessageDataParam(args[1]);
            this.keyword2 = new TemplateMessageDataParam(args[2]);
            this.remark = new TemplateMessageDataParam(args[3]);
            break;
        case 5:
            this.first = new TemplateMessageDataParam(args[0]);
            this.keyword1 = new TemplateMessageDataParam(args[1]);
            this.keyword2 = new TemplateMessageDataParam(args[2]);
            this.keyword3 = new TemplateMessageDataParam(args[3]);
            this.remark = new TemplateMessageDataParam(args[4]);
            break;
        case 6:
            this.first = new TemplateMessageDataParam(args[0]);
            this.keyword1 = new TemplateMessageDataParam(args[1]);
            this.keyword2 = new TemplateMessageDataParam(args[2]);
            this.keyword3 = new TemplateMessageDataParam(args[3]);
            this.keyword4 = new TemplateMessageDataParam(args[4]);
            this.remark = new TemplateMessageDataParam(args[5]);
            break;
        case 7:
            this.first = new TemplateMessageDataParam(args[0]);
            this.keyword1 = new TemplateMessageDataParam(args[1]);
            this.keyword2 = new TemplateMessageDataParam(args[2]);
            this.keyword3 = new TemplateMessageDataParam(args[3]);
            this.keyword4 = new TemplateMessageDataParam(args[4]);
            this.keyword5 = new TemplateMessageDataParam(args[5]);
            this.remark = new TemplateMessageDataParam(args[6]);
            break;
        }

    }

    public TemplateMessageDataParam getFirst() {
        return first;
    }

    public void setFirst(TemplateMessageDataParam first) {
        this.first = first;
    }

    public TemplateMessageDataParam getKeyword1() {
        return keyword1;
    }

    public void setKeyword1(TemplateMessageDataParam keyword1) {
        this.keyword1 = keyword1;
    }

    public TemplateMessageDataParam getKeyword2() {
        return keyword2;
    }

    public void setKeyword2(TemplateMessageDataParam keyword2) {
        this.keyword2 = keyword2;
    }

    public TemplateMessageDataParam getKeyword3() {
        return keyword3;
    }

    public void setKeyword3(TemplateMessageDataParam keyword3) {
        this.keyword3 = keyword3;
    }

    public TemplateMessageDataParam getKeyword4() {
        return keyword4;
    }

    public void setKeyword4(TemplateMessageDataParam keyword4) {
        this.keyword4 = keyword4;
    }

    public TemplateMessageDataParam getKeyword5() {
        return keyword5;
    }

    public void setKeyword5(TemplateMessageDataParam keyword5) {
        this.keyword5 = keyword5;
    }

    public TemplateMessageDataParam getRemark() {
        return remark;
    }

    public void setRemark(TemplateMessageDataParam remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TemplateMessageData [first=" + first
                + ", keyword1="
                + keyword1
                + ", keyword2="
                + keyword2
                + ", keyword3="
                + keyword3
                + ", keyword4="
                + keyword4
                + ", keyword5="
                + keyword5
                + ", remark="
                + remark
                + "]";
    }

}
