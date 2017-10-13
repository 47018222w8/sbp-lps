package com.wq.sbp.service;

import java.util.List;

import com.wq.sbp.model.Property;

public interface PropertyService {

    /**
     * 零件品质列表,如果redis没有的话就从mysql中取,并缓存
     *
     * @return
     *
     * @author zwq
     * @since 2017年9月20日
     */
    List<Property> listPropertyLJPJ();
}
