package com.wq.sbp.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wq.sbp.model.Insurance;
import com.wq.sbp.model.PageHelperParam;
import com.wq.sbp.model.ReportPrice;
import com.wq.sbp.model.ReportPriceExtend;
import com.wq.sbp.model.ResultType;
import com.wq.sbp.model.ReturnPojo;
import com.wq.sbp.service.QuoteService;

@RestController
@RequestMapping("/api/1.0/LPS/quote")
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @GetMapping("/list")
    public ReturnPojo getQuoteList(ReportPriceExtend rpe, PageHelperParam param, HttpServletRequest request) {
        rpe.setSupplierMemberId((Integer) request.getAttribute("memberId"));
        ReturnPojo pojo = new ReturnPojo(ResultType.SUCCESS);
        pojo.setData(quoteService.getQuoteList(rpe, param));
        return pojo;
    }
    
    @GetMapping("/info/{insId}")
    public ReturnPojo getQuoteInfo(@PathVariable Integer insId, HttpServletRequest request) {
        Integer memberId = (Integer) request.getAttribute("memberId");
        Insurance ins = new Insurance();
        ins.setId(insId);
        ReportPrice rp = new ReportPrice();
        rp.setMemberId(memberId);
        rp.setInsId(insId);
        ReturnPojo pojo = new ReturnPojo(ResultType.SUCCESS);
        pojo.setData(quoteService.getQuoteInfo(rp, ins));
        return pojo;
    }
}
