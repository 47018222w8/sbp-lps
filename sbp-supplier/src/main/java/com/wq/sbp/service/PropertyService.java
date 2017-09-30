package com.wq.sbp.service;

import java.util.List;

import com.wq.sbp.model.Property;

public interface PropertyService {

    /**
     * 缓存零件品质
     *
     * @param code 父亲的code
     *
     * @author zwq
     * @since 2017年9月20日
     */
    void savePropertyListLJPJToRedis();

    /**
     * 从redis中取出零件品质
     *
     * @return
     *
     * @author zwq
     * @since 2017年9月20日
     */
    List<Property> listPropertyLJPJfFromRedis();

    /**
     * 从mysql中取出零件品质
     *
     * @return
     *
     * @author zwq
     * @since 2017年9月20日
     */
    List<Property> listPropertyLJPJ();
}
