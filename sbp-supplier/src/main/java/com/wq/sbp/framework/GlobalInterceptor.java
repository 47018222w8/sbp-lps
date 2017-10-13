package com.wq.sbp.framework;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sbp.common.util.JWTUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.alibaba.fastjson.JSON;
import com.wq.sbp.common.constants.Constants;
import com.wq.sbp.model.ErrorEnum;
import com.wq.sbp.model.ErrorVO;

public class GlobalInterceptor extends HandlerInterceptorAdapter {

    private Logger logger = LoggerFactory.getLogger(GlobalInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try {
            String token = request.getHeader(Constants.JWT_HEADER);
            token = token.substring(Constants.JWT_TOKEN_HEAD.length());
            request.setAttribute("memberId", JWTUtil.getClaimsFromToken(token).get("memberId"));
        }
        catch (Exception e) {
            logger.error("解析token", e);
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
            response.setStatus(ErrorEnum.AUTHORIZATION_EXPIRED.getHttpStatusCode());
            PrintWriter pw = response.getWriter();
            pw.append(JSON.toJSONString(new ErrorVO(ErrorEnum.AUTHORIZATION_EXPIRED)));
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           ModelAndView modelAndView) throws Exception {
    }
}
