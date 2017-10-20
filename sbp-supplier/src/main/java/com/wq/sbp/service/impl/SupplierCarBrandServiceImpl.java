package com.wq.sbp.service.impl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.sbp.common.model.CommonConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wq.sbp.dao.SupplierDao;
import com.wq.sbp.model.CarBrandSortDTO;
import com.wq.sbp.model.SupplierDO;
import com.wq.sbp.service.CarBrandServcie;
import com.wq.sbp.service.SupplierService;

/**
 * 车型件处理
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
@Service
public class SupplierCarBrandServiceImpl implements SupplierService<SupplierDO> {

    @Autowired
    private SupplierDao supplierDao;

    @Autowired
    private CarBrandServcie carBrandServcie;

    @Override
    public void saveSupplier(SupplierDO sup) {
        List<Integer> newList = sup.getCarBrandIdList();
        List<Integer> oldList = supplierDao.listCarBrandId(sup);
        // 1. 取出数据库中不存在的,插入数据库
        @SuppressWarnings("unchecked")
        // 差集
        List<Integer> resultList = new ArrayList<>(CollectionUtils.subtract(newList, oldList));
        List<SupplierDO> saveList = new LinkedList<>();
        for (Integer carBrandId : resultList) {
            SupplierDO s = new SupplierDO();
            s.setCarBrandId(carBrandId);
            s.setMemberId(sup.getMemberId());
            s.setStoreId(sup.getStoreId());
            saveList.add(s);
        }
        supplierDao.saveSupplierList(saveList);
        // 2. 取出数据库已存在的更新flag为1
        @SuppressWarnings("unchecked")
        // 交集
        List<Integer> resultList1 = new ArrayList<>(CollectionUtils.intersection(newList, oldList));
        SupplierDO s = new SupplierDO();
        s.setMemberId(sup.getMemberId());
        s.setFlag("1");
        s.setStoreId(sup.getStoreId());
        for (Integer carBrandId : resultList1) {
            s.setCarBrandId(carBrandId);
            supplierDao.updateSupplier(s);
        }
    }

    @Override
    public ResponseEntity<?> listCarBrandNotOperate(SupplierDO sup) {
        List<CarBrandSortDTO> list = carBrandServcie.listCarBrandGroupByLetter();
        List<Integer> ids = supplierDao.listCarBrandId(sup);
        // 去除已经营的品牌
        list.forEach(dto -> dto.getCarBrandList().removeIf(item -> ids.contains(item.getCarBrandId())));
        // 去除不含品牌的首字母
        list.removeIf(item -> item.getCarBrandList() == null || item.getCarBrandList().isEmpty());
        return ResponseEntity.ok(list);
    }

    @Override
    public List<SupplierDO> listSupplier(SupplierDO sup) {
        sup.setParam1(CommonConstants.EAUTO100_IMG_VISIT);
        sup.setParam2(CommonConstants.EAUTO100_IMG_SAVE);
        return supplierDao.listSupplier(sup);
    }

    @Override
    public int updateSupplierList(SupplierDO sup) {
        return supplierDao.updateSupplier(sup);
    }
}
