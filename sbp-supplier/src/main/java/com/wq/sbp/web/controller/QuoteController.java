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
import com.wq.sbp.model.PageHelperParam;
import com.wq.sbp.model.QuoteDTO;
import com.wq.sbp.model.ReportPrice;
import com.wq.sbp.model.ReportPriceExtend;
import com.wq.sbp.service.InsuranceService;
import com.wq.sbp.service.PropertyService;
import com.wq.sbp.service.QuoteService;
import com.wq.sbp.service.ReportPriceExtendService;
import com.wq.sbp.service.ReportPriceService;

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

    /**
     * 修改为已读
     * 
     *
     * @param rpe
     * @param request
     * @return
     *
     * @author zwq
     * @since 2017年10月7日
     */
    @PutMapping("/reportPriceExtends")
    public void updateReportPriceExtend(@RequestBody ReportPriceExtend rpe, HttpServletRequest request) {
        rpe.setSupplierMemberId((Integer) request.getAttribute("memberId"));
        reportPriceExtendService.updateReportPriceExtend(rpe);
    }

    /**
     * 报价列表
     * 
     *
     * @param rpe
     * @param param
     * @param request
     * @return
     *
     * @author zwq
     * @since 2017年10月6日
     */
    @GetMapping("/insruances")
    public ResponseEntity<?> listInsurance(ReportPriceExtend rpe, PageHelperParam param, HttpServletRequest request) {
        rpe.setSupplierMemberId((Integer) request.getAttribute("memberId"));
        // 以下前端传
        // rpe.setReportState(0);
        // String[] strs = { "1", "2" };
        // rpe.setInsReportStates(strs);
        // rpe.setMark(1);
        QuoteDTO dto = new QuoteDTO();
        dto.setDomain(systemConfigBean.getDomain());
        dto.setInsurancePage(insuranceService.listInsurance(rpe, param));
        rpe.setIsRead(0);
        dto.setNotReadCount(insuranceService.countInsurance(rpe));
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/insruances/{insId}")
    public ResponseEntity<?> getInsurance(@PathVariable Integer insId, ReportPrice rp, HttpServletRequest request) {
        Insurance ins = new Insurance();
        ins.setId(insId);
        Insurance insResult = insuranceService.getInsurance(ins);// 主表信息
        rp.setMemberId((Integer) request.getAttribute("memberId"));
        rp.setInsId(insId);
        // 前端传
        // rp.setState("0");
        List<ReportPrice> rpList = reportPriceService.listReportPrice(rp);// 零件信息
        QuoteDTO dto = new QuoteDTO();
        dto.setDomain(systemConfigBean.getDomain());
        dto.setIns(insResult);
        dto.setReportPriceList(rpList);
        dto.setQualityList(propertyService.listPropertyLJPJfFromRedis());
        return ResponseEntity.ok(dto);
    }

    /**
     * 报价
     * 
     *
     * @param rpe
     * @param request
     * @return
     *
     * @author zwq
     * @since 2017年10月6日
     */
    @PostMapping("/reportPriceInfos")
    public ResponseEntity<?> saveQuote(@RequestBody ReportPriceExtend rpe, HttpServletRequest request) {
        rpe.setSupplierMemberId((Integer) request.getAttribute("memberId"));
        return quoteService.saveQuote(rpe);
    }
}
