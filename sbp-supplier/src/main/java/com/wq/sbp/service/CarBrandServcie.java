package com.wq.sbp.service;

import java.util.List;

import com.wq.sbp.model.CarBrand;
import com.wq.sbp.model.CarBrandSortDTO;

public interface CarBrandServcie {


    List<CarBrand> listCarBrand(CarBrand carBrand);

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
