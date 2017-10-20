package com.wq.sbp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.wq.sbp.model.SupplierDO;

/**
 * 经营范围相关业务处理
 * 目前:1 车型件 2 专项件
 *
 * @author zwq
 * @date 2017年10月16日
 */
public interface SupplierService<T> {

    /**
     * 已经经营的品牌
     *
     * @param sup memberId flag
     * @return
     *
     * @author zwq
     * @since 2017年9月30日
     */
    List<SupplierDO> listSupplier(T sup);

    /**
     * 不经营
     *
     * @param sup
     * @return
     *
     * @author zwq
     * @since 2017年9月30日
     */
    int updateSupplierList(T sup);

    /**
     * 增加品牌供应商
     * 
     * @param sup
     * @return
     *
     * @author zwq
     * @since 2017年9月26日
     */
    void saveSupplier(T sup);

    /**
     * 获取还没有经营的品牌
     *
     * @param sup memberId
     * @return ResponseEntity
     *
     * @author zwq
     * @since 2017年9月26日
     */
    ResponseEntity<?> listCarBrandNotOperate(T sup);
}
