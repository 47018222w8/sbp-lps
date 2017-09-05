package com.wq.sbp.service.impl;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wq.sbp.common.constants.Constants;
import com.wq.sbp.dao.InsuranceDao;
import com.wq.sbp.dao.ReportPriceDao;
import com.wq.sbp.dao.ReportPriceExtendDao;
import com.wq.sbp.model.InsuranceDO;
import com.wq.sbp.model.NotOwnInfoException;
import com.wq.sbp.model.PageHelperParam;
import com.wq.sbp.model.QuoteDTO;
import com.wq.sbp.model.ReportPriceDO;
import com.wq.sbp.model.ReportPriceExtendDO;
import com.wq.sbp.model.ReportPriceInfoDO;
import com.wq.sbp.model.ResultType;
import com.wq.sbp.model.ReturnVO;
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

    @Override
    public PageInfo<QuoteDTO> listQuote(ReportPriceExtendDO rpe, PageHelperParam param) {
        rpe.setParam1(Constants.EAUTO100_IMG_VISIT);
        rpe.setParam2(Constants.EAUTO100_IMG_SAVE);
        PageHelper.startPage(param.getPageNum(), param.getPageSize());
        return new PageInfo<QuoteDTO>(reportPriceExtendDao.listQuoteListBySupId(rpe));
    }

    @Override
    public JSONObject getQuoteInfo(ReportPriceDO rp, InsuranceDO insurance) {
        JSONObject jo = new JSONObject();
        insurance.setParm1(Constants.DOMAIN);
        jo.put("ins", insuranceDao.getInsuranceById(insurance));
        jo.put("insInfoList", reportPriceDao.listInsuranceInfoByInsIdAndSupId(rp));
        jo.put("qualityList", JSON.parseArray(redisTemplate.opsForValue().get(Constants.CACHE_QUALITY_PROPERTY)));
        return jo;
    }

    @Override
    @Transactional
    public ReturnVO saveQuote(InsuranceDO insurance,Integer memberId)  {
        //report_price
        List<ReportPriceDO> listRP=insurance.getListRP();
        //report_price_extend
        ReportPriceExtendDO rpe=new ReportPriceExtendDO();
        rpe.setSupplierMemberId(memberId);
        rpe.setInsId(insurance.getId());
        rpe.setReportState(1);
        rpe.setGmtQuote(new Date());
        //ins
        InsuranceDO ins=new InsuranceDO();
        ins.setReportState("2");
        ins.setId(insurance.getId());
        insurance.setRepairId(memberId);
        //report_price_info
        List<ReportPriceInfoDO> listRPI=new LinkedList<>();
        Long reportTime=System.currentTimeMillis()/1000;
        for(ReportPriceDO rp:listRP){
            rp.setMemberId(memberId);
            rp.setReportTime(reportTime);
            if("0".equals(rp.getIsOperProd())){
                rp.setState("2");
                for(ReportPriceInfoDO rpi:rp.getListRPI()){
                    rpi.setReportState(2);
                    rpi.setReportPriceId(rp.getId());
                    rpi.setCanShipDateBs(rpi.getCanShipDateBsStr()+":00:00");
                    listRPI.add(rpi);
                }
            }else{
                rp.setState("5");
            }
            
            int rpCount=reportPriceDao.updateReportPriceById(rp);
            if(rpCount==0){
                throw new NotOwnInfoException("试图修改非自己信息的选项,memberId:"+memberId);
            }
            reportPriceDao.removeReportPriceInfoByRPIId(rp.getId());//旧数据删除干净后可去除
        }
        
        int rpeCount=reportPriceExtendDao.updateReportPriceExtendSelective(rpe);
        insuranceDao.updateInsuranceSelective(ins);
        if(rpeCount==0){
            throw new NotOwnInfoException("试图修改非自己信息的选项,memberId:"+memberId);
        }
        if(!listRPI.isEmpty()){
            reportPriceDao.saveReportPriceInfo(listRPI);
        }
        return new ReturnVO(ResultType.SUCCESS);
    }

}
