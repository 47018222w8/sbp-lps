package com.wq.sbp.service;

import java.util.List;

import com.wq.sbp.model.CarBrandDO;
import com.wq.sbp.model.CarBrandSortDTO;
/**
 * CarBrandServcie
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
public interface CarBrandServcie {

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

    /**
     * 按字母分类的品牌列表,先从reids中取,没有就从mysql中取并缓存
     *
     * @return
     *
     * @author zwq
     * @since 2017年9月20日
     */
    List<CarBrandSortDTO> listCarBrandGroupByLetter();

}
