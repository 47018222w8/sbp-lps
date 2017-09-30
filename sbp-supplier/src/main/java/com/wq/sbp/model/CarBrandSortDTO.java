package com.wq.sbp.model;

import java.util.List;

/**
 * 前端需要的品牌格式--按照某一条件分组
 *
 *
 * @author zwq
 * @since 2017年9月20日
 */
public class CarBrandSortDTO {

    private Character character;

    private List<CarBrand> carBrandList;

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public List<CarBrand> getCarBrandList() {
        return carBrandList;
    }

    public void setCarBrandList(List<CarBrand> carBrandList) {
        this.carBrandList = carBrandList;
    }

}
