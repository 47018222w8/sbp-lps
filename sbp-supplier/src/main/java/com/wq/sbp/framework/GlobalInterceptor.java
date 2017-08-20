package com.wq.sbp.framework;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.alibaba.fastjson.JSON;
import com.wq.sbp.common.constants.Constants;
import com.wq.sbp.common.util.JWTUtil;
import com.wq.sbp.model.ResultType;
import com.wq.sbp.model.ReturnPojo;

public class GlobalInterceptor extends HandlerInterceptorAdapter {

    private Logger logger = LoggerFactory.getLogger(GlobalInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        logger.info(request.getRequestURI());
        request.setAttribute("startTime", startTime);
        try {
            String token = request.getHeader(Constants.JWT_HEADER);
            token = token.substring(Constants.JWT_TOKEN_HEAD.length());
            request.setAttribute("memberId", JWTUtil.getClaimsFromToken(token).get("memberId"));
        }
        catch (Exception e) {
            logger.error("解析token", e);
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/json; charset=utf-8");
            PrintWriter pw = response.getWriter();
            ReturnPojo rp = new ReturnPojo(ResultType.LOGIN_EXPIRED);
            pw.append(JSON.toJSONString(rp));
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response,
                           Object handler,
                           ModelAndView modelAndView) throws Exception {
        long startTime = (Long) request.getAttribute("startTime");
        request.removeAttribute("startTime");
        long endTime = System.currentTimeMillis();
        System.out.println(request.getRequestURI() + ":" + new Long(endTime - startTime) + "ms");
        request.setAttribute("handlingTime", endTime - startTime);
    }
}
