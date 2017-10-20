package com.wq.sbp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.CarBrandDO;

/**
 * CarBrandDao
 * 
 * @author zwq
 * @date 2017年10月16日
 */
@Mapper
public interface CarBrandDao {

    /**
     * 汽车品牌列表
     * 
     * @param carBrand canFindPartShow,carBrandId,carFirstLetter,askpriceIsHot,liyangCarBrandName,carBrandName 全都选填
     * @return list
     * 
     * @author zwq
     * @date 2017年10月16日
     */
    List<CarBrandDO> listCarBrand(CarBrandDO carBrand);
}
