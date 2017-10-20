package com.wq.sbp.common.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 本项目的常量,生产环境和开发环境不一样的那种
 *
 * @author zwq
 * @since 2017年10月16日
 */
@Component
public class SystemConfigBean {

    @Value("${static.domain}")
    private String domain;

    @Value("${static.img.path}")
    private String imgPath;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

}
