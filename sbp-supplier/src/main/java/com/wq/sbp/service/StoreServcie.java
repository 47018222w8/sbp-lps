package com.wq.sbp.service;

import com.wq.sbp.model.StoreDO;

/**
 * StoreServcie
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
public interface StoreServcie {

    /**
     * 获取单个
     * 
     * @param store memberId
     * @return StoreDO
     *
     * @author zwq
     * @date 2017年10月16日
     */
    StoreDO getStore(StoreDO store);
}
