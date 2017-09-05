package com.wq.sbp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.PropertyDO;

@Mapper
public interface PropertyDao {

    List<PropertyDO> listPropertyChildListByCode(String code);
}
