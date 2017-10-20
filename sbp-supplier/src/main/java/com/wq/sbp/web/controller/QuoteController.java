package com.wq.sbp.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
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
import com.wq.sbp.model.InsuranceDO;
import com.wq.sbp.model.InsurancePageParamDTO;
import com.wq.sbp.model.QuoteDTO;
import com.wq.sbp.model.ReportPriceDO;
import com.wq.sbp.model.ReportPriceExtendDO;
import com.wq.sbp.model.ReportPriceExtendDTO;
import com.wq.sbp.service.InsuranceService;
import com.wq.sbp.service.PropertyService;
import com.wq.sbp.service.QuoteService;
import com.wq.sbp.service.ReportPriceExtendService;
import com.wq.sbp.service.ReportPriceService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 报价相关业务控制器
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
    @ApiOperation(value = "修改ReportPriceExtend,暂时只有修改已读未读", notes = "")
    public void updateReportPriceExtend(@RequestBody @ApiParam(value = "ReportPriceExtend", required = true) ReportPriceExtendDTO rped,
                                        HttpServletRequest request) {
        rped.setSupplierMemberId((Integer) request.getAttribute("memberId"));
        ReportPriceExtendDO rpe = new ReportPriceExtendDO();
        BeanUtils.copyProperties(rped, rpe);
        reportPriceExtendService.updateReportPriceExtend(rpe);
    }

    @GetMapping("/insruances")
    @ApiOperation(value = "获取报价列表", notes = "")
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
    public ResponseEntity<?> listInsurance(InsurancePageParamDTO ipp, HttpServletRequest request) {
        ipp.setSupplierMemberId((Integer) request.getAttribute("memberId"));
        ipp.setInsReportStates(ipp.getInsReportStatesStr().split(","));
        QuoteDTO dto = new QuoteDTO();
        dto.setDomain(systemConfigBean.getDomain());
        dto.setInsurancePage(insuranceService.listInsurance(ipp));
        dto.setNotReadCount(insuranceService.countInsurance(ipp));
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/insruances/{insId}")
    @ApiOperation(value = "询价单详情", notes = "")
    @ApiImplicitParam(name = "state", value = "状态0:未报价 1:已过期 2:已报价 3中标 4已发货", required = true, paramType = "query", dataType = "String")
    public ResponseEntity<?> getInsurance(@PathVariable Integer insId, String state, HttpServletRequest request) {
        InsuranceDO ins = new InsuranceDO();
        ins.setId(insId);
        // 询价信息
        InsuranceDO insResult = insuranceService.getInsurance(ins);
        ReportPriceDO rp = new ReportPriceDO();
        rp.setState(state);
        rp.setMemberId((Integer) request.getAttribute("memberId"));
        rp.setInsId(insId);
        // 零件信息
        List<ReportPriceDO> rpList = reportPriceService.listReportPrice(rp);
        QuoteDTO dto = new QuoteDTO();
        dto.setDomain(systemConfigBean.getDomain());
        dto.setIns(insResult);
        dto.setReportPriceList(rpList);
        dto.setQualityList(propertyService.listPropertyLJPJ());
        return ResponseEntity.ok(dto);
    }

    @PostMapping("/reportPriceInfos")
    @ApiOperation(value = "报价", notes = "")
    public ResponseEntity<?> saveQuote(@RequestBody ReportPriceExtendDO rpe, HttpServletRequest request) {
        rpe.setSupplierMemberId((Integer) request.getAttribute("memberId"));
        return quoteService.saveQuote(rpe);
    }
}
