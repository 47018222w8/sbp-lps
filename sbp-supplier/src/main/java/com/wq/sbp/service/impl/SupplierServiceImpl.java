package com.wq.sbp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wq.sbp.common.constants.Constants;
import com.wq.sbp.dao.SupplierDao;
import com.wq.sbp.model.Supplier;
import com.wq.sbp.service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierDao supplierDao;

    @Override
    public List<Supplier> listSupplier(Supplier sup) {
        sup.setParam1(Constants.EAUTO100_IMG_VISIT);
        sup.setParam2(Constants.EAUTO100_IMG_SAVE);
        sup.setFlag("1");
        return supplierDao.listSupplier(sup);
    }

    @Override
    public int saveSupplierList(List<Supplier> list) {
        return supplierDao.saveSupplierList(list);
    }

    @Override
    public int updateSupplierList(Supplier sup) {
        sup.setFlag("0");
        return supplierDao.updateSupplier(sup);
    }
}
