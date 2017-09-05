package com.wq.sbp.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wq.sbp.model.InsuranceDO;
import com.wq.sbp.model.PageHelperParam;
import com.wq.sbp.model.ReportPriceDO;
import com.wq.sbp.model.ReportPriceExtendDO;
import com.wq.sbp.model.ResultType;
import com.wq.sbp.model.ReturnVO;
import com.wq.sbp.service.QuoteService;

@RestController
@RequestMapping("/api/1.0/LPS/quote")
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @GetMapping("/list")
    public ReturnVO listQuote(ReportPriceExtendDO rpe, PageHelperParam param, HttpServletRequest request) {
        rpe.setSupplierMemberId((Integer) request.getAttribute("memberId"));
        ReturnVO pojo = new ReturnVO(ResultType.SUCCESS);
        pojo.setData(quoteService.listQuote(rpe, param));
        return pojo;
    }

    @GetMapping("/{insId}")
    public ReturnVO getQuoteInfo(@PathVariable Integer insId, HttpServletRequest request) {
        Integer memberId = (Integer) request.getAttribute("memberId");
        InsuranceDO ins = new InsuranceDO();
        ins.setId(insId);
        ReportPriceDO rp = new ReportPriceDO();
        rp.setMemberId(memberId);
        rp.setInsId(insId);
        ReturnVO vo = new ReturnVO(ResultType.SUCCESS);
        vo.setData(quoteService.getQuoteInfo(rp, ins));
        return vo;
    }

    @PostMapping
    public ReturnVO saveQuote(@RequestBody InsuranceDO ins, HttpServletRequest request) {
        Integer memberId = (Integer) request.getAttribute("memberId");
        ReturnVO vo = quoteService.saveQuote(ins, memberId);
        return vo;
    }
}
