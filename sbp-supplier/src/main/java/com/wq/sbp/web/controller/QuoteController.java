package com.wq.sbp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ReturnPojo getQuoteList(ReportPriceExtend rpe) {
        ReturnPojo pojo = new ReturnPojo(ResultType.SUCCESS);
        pojo.setData(quoteService.getQuoteList(rpe));
        return pojo;
    }
}
