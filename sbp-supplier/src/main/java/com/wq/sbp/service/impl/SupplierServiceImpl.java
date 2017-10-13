package com.wq.sbp.service.impl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wq.sbp.common.constants.Constants;
import com.wq.sbp.dao.SupplierDao;
import com.wq.sbp.model.CarBrandSortDTO;
import com.wq.sbp.model.Supplier;
import com.wq.sbp.service.CarBrandServcie;
import com.wq.sbp.service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Autowired
    private SupplierDao supplierDao;

    @Autowired
    private CarBrandServcie carBrandServcie;

    @Override
    public void saveSupplier(Supplier sup) {
        List<Integer> newList = sup.getCarBrandIdList();
        List<Integer> oldList = supplierDao.listCarBrandId(sup);
        // 1. 取出数据库中不存在的,插入数据库
        @SuppressWarnings("unchecked")
        List<Integer> resultList = new ArrayList<>(CollectionUtils.subtract(newList, oldList));// 差集
        List<Supplier> saveList = new LinkedList<>();
        for (Integer carBrandId : resultList) {
            Supplier s = new Supplier();
            s.setCarBrandId(carBrandId);
            s.setMemberId(sup.getMemberId());
            s.setStoreId(sup.getStoreId());
            saveList.add(s);
        }
        supplierDao.saveSupplierList(saveList);
        // 2. 取出数据库已存在的更新flag为1
        @SuppressWarnings("unchecked")
        List<Integer> resultList1 = new ArrayList<>(CollectionUtils.intersection(newList, oldList));// 交集
        Supplier s = new Supplier();
        s.setMemberId(sup.getMemberId());
        s.setFlag("1");
        s.setStoreId(sup.getStoreId());
        for (Integer carBrandId : resultList1) {
            s.setCarBrandId(carBrandId);
            supplierDao.updateSupplier(s);
        }
    }

    @Override
    public ResponseEntity<?> listCarBrandNotOperate(Supplier sup) {
        List<CarBrandSortDTO> list = carBrandServcie.listCarBrandGroupByLetter();
        List<Integer> ids = supplierDao.listCarBrandId(sup);
        list.forEach(dto -> dto.getCarBrandList().removeIf(item -> ids.contains(item.getCarBrandId())));// 去除已经营的品牌
        list.removeIf(item -> item.getCarBrandList() == null || item.getCarBrandList().isEmpty());// 去除不含品牌的首字母
        return ResponseEntity.ok(list);
    }

    @Override
    public List<Supplier> listSupplier(Supplier sup) {
        sup.setParam1(Constants.EAUTO100_IMG_VISIT);
        sup.setParam2(Constants.EAUTO100_IMG_SAVE);
        return supplierDao.listSupplier(sup);
    }

    @Override
    public int updateSupplierList(Supplier sup) {
        return supplierDao.updateSupplier(sup);
    }
}
