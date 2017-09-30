package com.wq.sbp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.CarBrand;

@Mapper
public interface CarBrandDao {

    List<CarBrand> listCarBrand(CarBrand carBrand);
}
