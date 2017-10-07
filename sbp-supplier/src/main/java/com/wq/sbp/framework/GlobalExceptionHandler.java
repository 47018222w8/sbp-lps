package com.wq.sbp.framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.wq.sbp.model.ErrorEnum;
import com.wq.sbp.model.ErrorVO;

/**
 * 统一异常处理
 * 
 *
 *
 * @author zwq
 * @since 2017年10月7日
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus
    public ErrorVO allException(Exception e) {
        log.error("1", e);
        return new ErrorVO(ErrorEnum.SERVER_ERROR);
    }
}
