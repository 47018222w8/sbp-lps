package com.wq.sbp.service;

import java.util.List;

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

    int saveSupplierList(List<Supplier> list);

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
}
