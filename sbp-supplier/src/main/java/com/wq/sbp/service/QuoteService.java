package com.wq.sbp.service;

import com.github.pagehelper.PageInfo;
import com.wq.sbp.model.InsuranceDO;
import com.wq.sbp.model.PageHelperParam;
import com.wq.sbp.model.QuoteDTO;
import com.wq.sbp.model.ReportPriceDO;
import com.wq.sbp.model.ReportPriceExtendDO;
import com.wq.sbp.model.ReturnVO;

public interface QuoteService {

    PageInfo<QuoteDTO> listQuote(ReportPriceExtendDO rpe, PageHelperParam param);

    ReturnVO getQuoteInfo(ReportPriceDO rp, InsuranceDO insurance);

    ReturnVO saveQuote(ReportPriceExtendDO rpe, Integer memberId);
}
