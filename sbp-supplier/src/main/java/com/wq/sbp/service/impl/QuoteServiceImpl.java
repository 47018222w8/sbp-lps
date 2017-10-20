package com.wq.sbp.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.wq.sbp.dao.InsuranceDao;
import com.wq.sbp.dao.ReportPriceDao;
import com.wq.sbp.dao.ReportPriceExtendDao;
import com.wq.sbp.dao.ReportPriceInfoDao;
import com.wq.sbp.model.ErrorDTO;
import com.wq.sbp.model.ErrorEnum;
import com.wq.sbp.model.InsuranceDO;
import com.wq.sbp.model.ReportPriceDO;
import com.wq.sbp.model.ReportPriceExtendDO;
import com.wq.sbp.model.ReportPriceInfoDO;
import com.wq.sbp.service.QuoteService;

/**
 * QuoteServiceImpl
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
@Service
public class QuoteServiceImpl implements QuoteService {

    @Autowired
    private ReportPriceExtendDao reportPriceExtendDao;

    @Autowired
    private InsuranceDao insuranceDao;

    @Autowired
    private ReportPriceDao reportPriceDao;

    @Autowired
    private ReportPriceInfoDao reportPriceInfoDao;

    private Logger log = LoggerFactory.getLogger(QuoteServiceImpl.class);

    /**
     * 
     *
     * @param rpe
     * @return
     * 
     * @see com.wq.sbp.service.QuoteService#saveQuote(com.wq.sbp.model.ReportPriceExtendDO)
     * 
     * @author zwq
     * @since 2017年10月16日
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseEntity<?> saveQuote(ReportPriceExtendDO rpe) {
        // report_price
        List<ReportPriceDO> listRP = rpe.getListRP();
        // report_price_extend
        rpe.setInsId(rpe.getInsId());
        rpe.setReportState(1);
        rpe.setGmtQuote("begin");
        // ins
        InsuranceDO ins = new InsuranceDO();
        ins.setReportState("2");
        ins.setId(rpe.getInsId());
        // report_price_info
        List<ReportPriceInfoDO> listRPI = new LinkedList<>();
        Long reportTime = System.currentTimeMillis() / 1000;
        for (ReportPriceDO rp : listRP) {
            rp.setMemberId(rpe.getSupplierMemberId());
            rp.setReportTime(reportTime);
            if ("0".equals(rp.getIsOperProd())) {
                rp.setState("2");
                for (ReportPriceInfoDO rpi : rp.getListRPI()) {
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
                log.error("试图修改非自己信息的选项,memberId:" + rpe.getSupplierMemberId());
                return new ResponseEntity<>(new ErrorDTO(ErrorEnum.NOT_OWN), HttpStatus.FORBIDDEN);
            }
            // 旧数据删除干净后可去除
            reportPriceDao.removeReportPriceInfoByRPIId(rp.getId());
        }

        int rpeCount = reportPriceExtendDao.updateReportPriceExtend(rpe);
        insuranceDao.updateInsurance(ins);
        if (rpeCount == 0) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
            log.error("试图修改非自己信息的选项,memberId:" + rpe.getSupplierMemberId());
            return new ResponseEntity<>(new ErrorDTO(ErrorEnum.NOT_OWN), HttpStatus.FORBIDDEN);
        }
        if (!listRPI.isEmpty()) {
            reportPriceInfoDao.saveReportPriceInfo(listRPI);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
