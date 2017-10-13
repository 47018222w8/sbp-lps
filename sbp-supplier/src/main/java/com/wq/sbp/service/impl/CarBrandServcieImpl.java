package com.wq.sbp.service.impl;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.wq.sbp.common.constants.Constants;
import com.wq.sbp.dao.CarBrandDao;
import com.wq.sbp.model.CarBrand;
import com.wq.sbp.model.CarBrandSortDTO;
import com.wq.sbp.service.CarBrandServcie;

@Service
public class CarBrandServcieImpl implements CarBrandServcie {

    @Autowired
    private CarBrandDao carBrandDao;

    @Resource
    private RedisTemplate<String, CarBrandSortDTO> redisTemplate;

    @Override
    public List<CarBrand> listCarBrand(CarBrand carBrand) {
        return carBrandDao.listCarBrand(carBrand);
    }

    @Override
    public List<CarBrandSortDTO> listCarBrandGroupByLetter() {
        List<CarBrandSortDTO> result = redisTemplate.opsForList().range(Constants.CACHE_CAR_BRAND_SORT, 0, -1);
        if (result == null || result.isEmpty()) {
            CarBrand carBrand = new CarBrand();
            carBrand.setCanFindPartShow(1);
            carBrand.setParam1(Constants.EAUTO100_IMG_VISIT);
            carBrand.setParam2(Constants.EAUTO100_IMG_SAVE);
            Character[] arry = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U',
                                 'V', 'W', 'X', 'Y', 'Z' };
            result = new LinkedList<>();
            for (int i = 0; i < arry.length; i++) {
                carBrand.setCarFirstLetter(arry[i]);
                List<CarBrand> list = carBrandDao.listCarBrand(carBrand);
                if (!list.isEmpty()) {
                    CarBrandSortDTO dto = new CarBrandSortDTO();
                    dto.setCharacter(arry[i]);
                    dto.setCarBrandList(list);
                    result.add(dto);
                }
            }
            redisTemplate.opsForList().rightPushAll(Constants.CACHE_CAR_BRAND_SORT, result);
        }
        return result;
    }
}
