package com.wq.sbp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.SupplierDO;

/**
 * SupplierDao
 * 
 * @author zwq
 * @date 2017年10月16日
 */
@Mapper
public interface SupplierDao {

    /**
     * 单个供应商经营的品牌id
     * 
     * @param sup memberId
     * @return list
     *
     * @author zwq
     * @date 2017年10月16日
     */
    List<Integer> listCarBrandId(SupplierDO sup);

    /**
     * 批量插入新经营的品牌
     * 
     * @param list
     * @return int
     *
     * @author zwq
     * @date 2017年10月16日
     */
    int saveSupplierList(List<SupplierDO> list);

    /**
     * 单个供应商经营(过)的品牌
     * 
     * @param sup memberId flag
     * @return
     *
     * @author zwq
     * @date 2017年10月16日
     */
    List<SupplierDO> listSupplier(SupplierDO sup);

    /**
     * 更新
     * 
     * @param sup 
     * @return int
     *
     * @author zwq
     * @date 2017年10月16日
     */
    int updateSupplier(SupplierDO sup);
}
