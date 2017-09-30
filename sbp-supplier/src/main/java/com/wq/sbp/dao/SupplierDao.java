package com.wq.sbp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.Supplier;

@Mapper
public interface SupplierDao {

    /**
     * 经营的品牌
     *
     * @return
     *
     * @author zwq
     * @since 2017年9月26日
     */
    List<Integer> listCarBrandId(Supplier sup);

    int saveSupplierList(List<Supplier> list);

    List<Supplier> listSupplier(Supplier sup);
    
    int updateSupplier(Supplier sup);
}
