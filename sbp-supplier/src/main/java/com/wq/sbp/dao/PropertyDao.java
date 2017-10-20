package com.wq.sbp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.wq.sbp.model.PropertyDO;

/**
 * PropertyDao
 * 
 * @author zwq
 * @date 2017年10月16日
 */
@Mapper
public interface PropertyDao {

    /**
     * 根据code获取
     * 
     * @param code
     * @return list
     *
     * @author zwq
     * @date 2017年10月16日
     */
    List<PropertyDO> listPropertyChildByCode(String code);
}
