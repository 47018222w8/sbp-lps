package com.wq.sbp.web.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wq.sbp.model.ErrorDTO;
import com.wq.sbp.model.ErrorEnum;
import com.wq.sbp.model.MemberDTO;
import com.wq.sbp.service.SessionServie;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 会话处理业务控制器
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
@RestController
@RequestMapping("/v1")
public class SessionController {

    @Autowired
    private SessionServie sessionServie;

    @PostMapping("/sessions")
    @ApiOperation(value = "登录", notes = "")
    public ResponseEntity<?> login(@Valid @RequestBody @ApiParam(value = "用户登录信息", required = true) MemberDTO memberDTO,
                                   BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new ResponseEntity<ErrorDTO>(new ErrorDTO(ErrorEnum.PARAM_NULL), HttpStatus.BAD_REQUEST);
        }
        return sessionServie.login(memberDTO.convertToMemberDO(memberDTO));
    }
}
