package com.wq.sbp.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wq.sbp.common.constants.SystemConfigBean;
import com.wq.sbp.model.Insurance;
import com.wq.sbp.model.InsurancePageParam;
import com.wq.sbp.model.QuoteDTO;
import com.wq.sbp.model.ReportPrice;
import com.wq.sbp.model.ReportPriceExtend;
import com.wq.sbp.service.InsuranceService;
import com.wq.sbp.service.PropertyService;
import com.wq.sbp.service.QuoteService;
import com.wq.sbp.service.ReportPriceExtendService;
import com.wq.sbp.service.ReportPriceService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * 报价相关业务
 * 
 *
 *
 * @author zwq
 * @since 2017年10月6日
 */
@RestController
@RequestMapping("/v1")
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

    @PutMapping("/reportPriceExtends")
    @ApiOperation(value = "修改ReportPriceExtend--wq", notes = "")
    public void updateReportPriceExtend(@RequestBody ReportPriceExtend rpe, HttpServletRequest request) {
        rpe.setSupplierMemberId((Integer) request.getAttribute("memberId"));
        reportPriceExtendService.updateReportPriceExtend(rpe);
    }

    @GetMapping("/insruances")
    @ApiOperation(value = "获取报价列表--wq", notes = "")
    @ApiImplicitParams({ @ApiImplicitParam(name = "pageNum", value = "页码", required = true, paramType = "query", dataType = "Integer"),
                         @ApiImplicitParam(name = "reportState",
                                           value = "本供应商对此询价单报价状态",
                                           required = true,
                                           paramType = "query",
                                           dataType = "Integer"),
                         @ApiImplicitParam(name = "insReportStatesStr",
                                           value = "询价单状态,逗号分隔字符串",
                                           required = true,
                                           paramType = "query",
                                           dataType = "String"),
                         @ApiImplicitParam(name = "mark",
                                           value = "1:截止时间>now,0:<",
                                           required = true,
                                           paramType = "query",
                                           dataType = "Integer"),
                         @ApiImplicitParam(name = "isRead", value = "是否已读", required = true, paramType = "query", dataType = "Integer") })
    public ResponseEntity<?> listInsurance(InsurancePageParam ipp, HttpServletRequest request) {
        ipp.setSupplierMemberId((Integer) request.getAttribute("memberId"));
        ipp.setInsReportStates(ipp.getInsReportStatesStr().split(","));
        QuoteDTO dto = new QuoteDTO();
        dto.setDomain(systemConfigBean.getDomain());
        dto.setInsurancePage(insuranceService.listInsurance(ipp));
        dto.setNotReadCount(insuranceService.countInsurance(ipp));
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/insruances/{insId}")
    @ApiOperation(value = "询价单详情--wq", notes = "")
    @ApiImplicitParam(name = "state", value = "状态0:未报价 1:已过期 2:已报价 3中标 4已发货", required = true, paramType = "query", dataType = "String")
    public ResponseEntity<?> getInsurance(@PathVariable Integer insId, String state, HttpServletRequest request) {
        Insurance ins = new Insurance();
        ins.setId(insId);
        Insurance insResult = insuranceService.getInsurance(ins);// 主表信息
        ReportPrice rp = new ReportPrice();
        rp.setState(state);
        rp.setMemberId((Integer) request.getAttribute("memberId"));
        rp.setInsId(insId);
        List<ReportPrice> rpList = reportPriceService.listReportPrice(rp);// 零件信息
        QuoteDTO dto = new QuoteDTO();
        dto.setDomain(systemConfigBean.getDomain());
        dto.setIns(insResult);
        dto.setReportPriceList(rpList);
        dto.setQualityList(propertyService.listPropertyLJPJ());
        return ResponseEntity.ok(dto);
    }

    @PostMapping("/reportPriceInfos")
    @ApiOperation(value = "报价--wq", notes = "")
    public ResponseEntity<?> saveQuote(@RequestBody ReportPriceExtend rpe, HttpServletRequest request) {
        rpe.setSupplierMemberId((Integer) request.getAttribute("memberId"));
        return quoteService.saveQuote(rpe);
    }
}
