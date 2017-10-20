package com.wq.sbp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.CarPartSortDO;

/**
 * CarPartSortDao
 * 
 *
 * @author zwq
 * @date 2017年10月18日
 */
@Mapper
public interface CarPartSortDao {

    /**
     * 查询集合
     * 
     * @param carPartSort 选填:flag pid
     * @return list
     * @author zwq
     * @date 2017年10月18日
     */
    List<CarPartSortDO> listCarPartSort(CarPartSortDO carPartSort);
}
