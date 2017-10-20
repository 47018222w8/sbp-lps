package com.wq.sbp.service.impl;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.wq.sbp.model.SupplierCarPartDO;
import com.wq.sbp.model.SupplierDO;
import com.wq.sbp.service.SupplierService;
/**
 * 专项件
 * 
 *
 * @author zwq
 * @date 2017年10月18日
 */
public class SupplierCarPartSortServcieImpl implements SupplierService<SupplierCarPartDO>{

    @Override
    public List<SupplierDO> listSupplier(SupplierCarPartDO sup) {
        return null;
    }

    @Override
    public int updateSupplierList(SupplierCarPartDO sup) {
        return 0;
    }

    @Override
    public void saveSupplier(SupplierCarPartDO sup) {
    }

    @Override
    public ResponseEntity<?> listCarBrandNotOperate(SupplierCarPartDO sup) {
        return null;
    }

}
