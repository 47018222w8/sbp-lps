package com.wq.sbp.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.wq.sbp.model.Supplier;

public interface SupplierService {

    /**
     * 已经经营的品牌
     *
     * @param sup
     * @return
     *
     * @author zwq
     * @since 2017年9月30日
     */
    List<Supplier> listSupplier(Supplier sup);

    /**
     * 不经营
     *
     * @param sup
     * @return
     *
     * @author zwq
     * @since 2017年9月30日
     */
    int updateSupplierList(Supplier sup);

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
    void saveSupplier(Supplier supplier);

    /**
     * 获取还没有经营的品牌
     *
     * @param memberId
     * @return
     *
     * @author zwq
     * @since 2017年9月26日
     */
    ResponseEntity<?> listCarBrandNotOperate(Supplier sup);
}
