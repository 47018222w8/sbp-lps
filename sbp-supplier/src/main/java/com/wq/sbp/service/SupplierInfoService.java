package com.wq.sbp.service;

import java.util.List;

import com.wq.sbp.model.ResultVO;
import com.wq.sbp.model.Supplier;

/**
 * 供应商相关业务逻辑,只返回resultvo
 *
 *
 * @author zwq
 * @since 2017年9月26日
 */
public interface SupplierInfoService {

    /**
     * 增加品牌供应商
     * 
     * @param list carBrandId 集合
     * @param supplier 含member_id
     * @return
     *
     * @author zwq
     * @since 2017年9月26日
     */
    ResultVO saveSupplier(List<Integer> list, Supplier supplier);

    /**
     * 获取还没有经营的品牌
     *
     * @param memberId
     * @return
     *
     * @author zwq
     * @since 2017年9月26日
     */
    ResultVO listCarBrandNotOperate(Supplier sup);
}
