package com.wq.sbp.framework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.wq.sbp.model.ErrorDTO;
import com.wq.sbp.model.ErrorEnum;

/**
 * 统一异常处理
 * 
 * @author zwq
 * @date 2017年10月7日
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
    @ResponseStatus
    public ErrorDTO httpMessageNotReadableException(HttpMessageNotReadableException e) {
        log.error("HttpMessageNotReadableException", e);
        return new ErrorDTO(ErrorEnum.FORMATTER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus
    public ErrorDTO allException(Exception e) {
        log.error("Exception", e);
        return new ErrorDTO(ErrorEnum.SERVER_ERROR);
    }
}
