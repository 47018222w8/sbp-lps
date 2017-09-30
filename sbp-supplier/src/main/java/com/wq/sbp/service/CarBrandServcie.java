package com.wq.sbp.service;

import java.util.List;

import com.wq.sbp.model.CarBrand;
import com.wq.sbp.model.CarBrandSortDTO;

public interface CarBrandServcie {

    List<CarBrand> listCarBrand(CarBrand carBrand);

    void saveCarBrandByLetterToRedis();

    /**
     * 从mysql中取出按字母分类的品牌
     *
     * @return
     *
     * @author zwq
     * @since 2017年9月20日
     */
    List<CarBrandSortDTO> listCarBrandGroupByLetter();

    /**
     * 从redis中取出按字母分类的品牌
     *
     * @return
     *
     * @author zwq
     * @since 2017年9月20日
     */
    List<CarBrandSortDTO> listCarBrandGroupByLetterFromRedis();
}
