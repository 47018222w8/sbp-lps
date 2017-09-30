package com.wq.sbp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.Property;

@Mapper
public interface PropertyDao {

    List<Property> listPropertyChildByCode(String code);
}
