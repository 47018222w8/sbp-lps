package com.wq.sbp.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wq.sbp.common.constants.Constants;
import com.wq.sbp.common.constants.SystemConfigBean;
import com.wq.sbp.model.Insurance;
import com.wq.sbp.model.PageHelperParam;
import com.wq.sbp.model.QuoteDTO;
import com.wq.sbp.model.ReportPrice;
import com.wq.sbp.model.ReportPriceExtend;
import com.wq.sbp.model.ResultVO;
import com.wq.sbp.model.ResultTypeEnum;
import com.wq.sbp.service.InsuranceService;
import com.wq.sbp.service.PropertyService;
import com.wq.sbp.service.QuoteService;
import com.wq.sbp.service.ReportPriceExtendService;
import com.wq.sbp.service.ReportPriceService;

@RestController
@RequestMapping("/api/1.0/LPS/quote")
public class QuoteController {

    @Autowired
    private QuoteService quoteService;

    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private ReportPriceExtendService reportPriceExtendService;

    @Autowired
    private SystemConfigBean systemConfigBean;

    @Autowired
    private ReportPriceService reportPriceService;

    @Autowired
    private PropertyService propertyService;

    @PutMapping
    public ResultVO updateRPE(@RequestBody ReportPriceExtend rpe, HttpServletRequest request) {
        rpe.setSupplierMemberId((Integer) request.getAttribute("memberId"));
        reportPriceExtendService.updateReportPriceExtend(rpe);
        return new ResultVO(ResultTypeEnum.SUCCESS);
    }

    @GetMapping("/list")
    public ResultVO listQuote(ReportPriceExtend rpe, PageHelperParam param, HttpServletRequest request) {
        rpe.setSupplierMemberId((Integer) request.getAttribute("memberId"));
        rpe.setReportState(0);
        String[] strs = { "1", "2" };
        rpe.setInsReportStates(strs);
        rpe.setMark(1);
        rpe.setParam1(Constants.EAUTO100_IMG_VISIT);
        rpe.setParam2(Constants.EAUTO100_IMG_SAVE);
        QuoteDTO dto = new QuoteDTO();
        dto.setDomain(systemConfigBean.getDomain());
        dto.setInsurancePage(insuranceService.listInsurance(rpe, param));
        rpe.setIsRead(0);
        dto.setNotReadCount(insuranceService.countInsurance(rpe));
        return new ResultVO(ResultTypeEnum.SUCCESS, dto);
    }

    @GetMapping("/{insId}")
    public ResultVO getQuoteInfo(@PathVariable Integer insId, HttpServletRequest request) {
        Insurance ins = new Insurance();
        ins.setId(insId);
        Insurance insResult = insuranceService.getInsurance(ins);
        ReportPrice rp = new ReportPrice();
        rp.setMemberId((Integer) request.getAttribute("memberId"));
        rp.setInsId(insId);
        rp.setState("0");
        List<ReportPrice> rpList = reportPriceService.listReportPrice(rp);
        QuoteDTO dto = new QuoteDTO();
        dto.setDomain(systemConfigBean.getDomain());
        dto.setIns(insResult);
        dto.setReportPriceList(rpList);
        dto.setQualityList(propertyService.listPropertyLJPJfFromRedis());
        return new ResultVO(ResultTypeEnum.SUCCESS, dto);
    }

    @PostMapping
    public ResultVO saveQuote(@RequestBody ReportPriceExtend rpe, HttpServletRequest request) {
        Integer memberId = (Integer) request.getAttribute("memberId");
        return quoteService.saveQuote(rpe, memberId);
    }
}
