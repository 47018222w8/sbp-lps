package com.wq.sbp.service.impl;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.wq.sbp.dao.InsuranceDao;
import com.wq.sbp.dao.ReportPriceDao;
import com.wq.sbp.dao.ReportPriceExtendDao;
import com.wq.sbp.model.Insurance;
import com.wq.sbp.model.ReportPrice;
import com.wq.sbp.model.ReportPriceExtend;
import com.wq.sbp.model.ReportPriceInfo;
import com.wq.sbp.model.ResultVO;
import com.wq.sbp.model.ResultTypeEnum;
import com.wq.sbp.service.QuoteService;

@Service
public class QuoteServiceImpl implements QuoteService {

    @Autowired
    private ReportPriceExtendDao reportPriceExtendDao;

    @Autowired
    private InsuranceDao insuranceDao;

    @Autowired
    private ReportPriceDao reportPriceDao;

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    private Logger log = LoggerFactory.getLogger(QuoteServiceImpl.class);

    @Override
    @Transactional
    public ResultVO saveQuote(ReportPriceExtend rpe, Integer memberId) {
        // report_price
        List<ReportPrice> listRP = rpe.getListRP();
        // report_price_extend
        rpe.setSupplierMemberId(memberId);
        rpe.setInsId(rpe.getInsId());
        rpe.setReportState(1);
        rpe.setGmtQuote(new Date());
        // ins
        Insurance ins = new Insurance();
        ins.setReportState("2");
        ins.setId(rpe.getInsId());
        // report_price_info
        List<ReportPriceInfo> listRPI = new LinkedList<>();
        Long reportTime = System.currentTimeMillis() / 1000;
        for (ReportPrice rp : listRP) {
            rp.setMemberId(memberId);
            rp.setReportTime(reportTime);
            if ("0".equals(rp.getIsOperProd())) {
                rp.setState("2");
                for (ReportPriceInfo rpi : rp.getListRPI()) {
                    rpi.setReportState(0);
                    rpi.setReportPriceId(rp.getId());
                    rpi.setCanShipDateBs(rpi.getCanShipDateBsStr() + ":00:00");
                    listRPI.add(rpi);
                }
            }
            else {
                rp.setState("5");
            }

            int rpCount = reportPriceDao.updateReportPriceById(rp);
            if (rpCount == 0) {
                TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
                log.error("试图修改非自己信息的选项,memberId:" + memberId);
                return new ResultVO(ResultTypeEnum.NOT_OWN);
            }
            reportPriceDao.removeReportPriceInfoByRPIId(rp.getId());// 旧数据删除干净后可去除
        }

        int rpeCount = reportPriceExtendDao.updateReportPriceExtend(rpe);
        insuranceDao.updateInsuranceSelective(ins);
        if (rpeCount == 0) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            log.error("试图修改非自己信息的选项,memberId:" + memberId);
            return new ResultVO(ResultTypeEnum.NOT_OWN);
        }
        if (!listRPI.isEmpty()) {
            reportPriceDao.saveReportPriceInfo(listRPI);
        }
        return new ResultVO(ResultTypeEnum.SUCCESS);
    }

}
