package project;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;
import org.sbp.common.model.TemplateMessage;
import org.sbp.common.model.TemplateMessageData;
import org.sbp.common.model.WechatConstants;
import org.sbp.common.util.MD5Util;
import org.sbp.common.util.MessageUtil;

/**
 * 普通测试
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
public class NormalTest {

    @Test
    public void a() throws ClientProtocolException, IOException {
        TemplateMessage tm = new TemplateMessage("oinvxwDQVoMK7jgUOe5mc7FOn-tk",
                                                 "KGLlQSyR8icSthaZu4RRVNPgofHMlihmuD42A-bJbyA",
                                                 new TemplateMessageData("您好，您提交的配件需求单，已经为您做出了报价！"+"", "keyword1", "keyworld2", "remark"));
        MessageUtil.sendWXTemplateMessage(tm);
    }

    @Test
    public void b() {
        System.out.println(RandomStringUtils.random(18, "ABCDEFGHIGKLMNOPQRSTUVWXYZ0987654321"));
    }

    @Test
    public void c() {
        String sign = MD5Util.md5(WechatConstants.TEMPLATE_MESSAGE_SECRET + LocalDate.now());
        System.out.println(sign);
        System.out.println(LocalTime.now().getHour() - 1);
    }
}
