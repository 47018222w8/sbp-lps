package com.wq.sbp.model;

import java.util.List;

/**
 * 前端需要的品牌格式--按照某一条件分组
 *
 *
 * @author zwq
 * @date 2017年9月20日
 */
public class CarBrandSortDTO {

    /**
     * 字母
     * 
     * @author zwq
     */
    private Character character;

    /**
     * 品牌列表
     * 
     * @author zwq
     */
    private List<CarBrandDO> carBrandList;

    @Override
    public String toString() {
        return "CarBrandSortDTO [character=" + character + ", carBrandList=" + carBrandList + "]";
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public List<CarBrandDO> getCarBrandList() {
        return carBrandList;
    }

    public void setCarBrandList(List<CarBrandDO> carBrandList) {
        this.carBrandList = carBrandList;
    }

}
