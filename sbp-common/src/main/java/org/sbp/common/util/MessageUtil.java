package org.sbp.common.util;

import java.io.IOException;
import java.nio.charset.Charset;
import java.time.LocalTime;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.sbp.common.model.CommonResult;
import org.sbp.common.model.TemplateMessage;
import org.sbp.common.model.WechatConstants;

import com.alibaba.fastjson.JSON;

public class MessageUtil {

    public static CommonResult sendWXTemplateMessage(TemplateMessage tm) throws ClientProtocolException, IOException {
        String sign = MD5Util.md5(WechatConstants.TEMPLATE_MESSAGE_SECRET + tm.getTouser() + LocalTime.now().getHour());
        CloseableHttpClient httpclient = HttpClients.custom().setDefaultRequestConfig(RequestConfig.custom()
                .setConnectionRequestTimeout(2000).setConnectTimeout(2000).setSocketTimeout(2000).build()).build();
        HttpPost httpPost = new HttpPost(WechatConstants.WECHAT_TEMPLATE_MESSAGE_URL + "?sign=" + sign);
        httpPost.setEntity(new StringEntity(JSON.toJSONString(tm), Charset.forName("UTF-8")));
        httpPost.setHeader("Content-Type", "application/json;charset=UTF-8");
        CloseableHttpResponse response2 = httpclient.execute(httpPost);
        try {
            int statusCode = response2.getStatusLine().getStatusCode();
            HttpEntity entity2 = response2.getEntity();
            EntityUtils.consume(entity2);
            if (statusCode == 200) {
                return new CommonResult().setSuccess(true);
            }
            else {
                return new CommonResult().setSuccess(false).setMssage(EntityUtils.toString(entity2));
            }
        }
        finally {
            response2.close();
        }
    }
}
