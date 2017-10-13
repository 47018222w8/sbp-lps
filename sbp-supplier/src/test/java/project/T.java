package project;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;
import org.sbp.common.model.Constants;
import org.sbp.common.model.TemplateMessage;
import org.sbp.common.model.TemplateMessageData;
import org.sbp.common.util.MD5Util;
import org.sbp.common.util.MessageUtil;

import com.alibaba.fastjson.JSON;

public class T {

    @Test
    public void test() throws ClientProtocolException, IOException {
        TemplateMessage tm = new TemplateMessage("oinvxwDQVoMK7jgUOe5mc7FOn-tk","KGLlQSyR8icSthaZu4RRVNPgofHMlihmuD42A-bJbyA",new TemplateMessageData("发的","方法","阿萨德","r方法"));
        //System.out.println(JSON.toJSONString(tm));
        MessageUtil.sendWXTemplateMessage(tm);
    }

    @Test
    public void test1() {
        System.out.println(RandomStringUtils.random(18, "ABCDEFGHIGKLMNOPQRSTUVWXYZ0987654321"));
    }

    @Test
    public void test2() {
        String sign = MD5Util.md5(Constants.TEMPLATE_MESSAGE_SECRET + LocalDate.now());
        System.out.println(sign);
        System.out.println(LocalTime.now().getHour() - 1);
    }
}
