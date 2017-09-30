package com.wq.sbp.service.impl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wq.sbp.dao.SupplierDao;
import com.wq.sbp.model.CarBrand;
import com.wq.sbp.model.CarBrandSortDTO;
import com.wq.sbp.model.ResultTypeEnum;
import com.wq.sbp.model.ResultVO;
import com.wq.sbp.model.Supplier;
import com.wq.sbp.service.CarBrandServcie;
import com.wq.sbp.service.SupplierInfoService;

@Service
public class SupplierInfoServiceImpl implements SupplierInfoService {

    @Autowired
    private SupplierDao supplierDao;

    @Autowired
    private CarBrandServcie carBrandServcie;

    @Override
    public ResultVO saveSupplier(List<Integer> newList, Supplier sup) {
        List<Integer> oldList = supplierDao.listCarBrandId(sup);
        // 1. 取出数据库中不存在的,插入数据库
        @SuppressWarnings("unchecked")
        List<Integer> resultList = new ArrayList<>(CollectionUtils.subtract(newList, oldList));
        List<Supplier> saveList = new LinkedList<>();
        for (Integer carBrandId : resultList) {
            Supplier s = new Supplier();
            s.setCarBrandId(carBrandId);
            s.setMemberId(sup.getMemberId());
            saveList.add(s);
        }
        supplierDao.saveSupplierList(saveList);
        // 2. 取出数据库已存在的更新flag为1
        @SuppressWarnings("unchecked")
        List<Integer> resultList1 = new ArrayList<>(CollectionUtils.intersection(newList, oldList));
        for (Integer carBrandId : resultList1) {
            Supplier s = new Supplier();
            s.setCarBrandId(carBrandId);
            s.setMemberId(sup.getMemberId());
            s.setFlag("1");
            supplierDao.updateSupplier(s);
        }
        return new ResultVO(ResultTypeEnum.SUCCESS);
    }

    @Override
    public ResultVO listCarBrandNotOperate(Supplier sup) {
        List<CarBrandSortDTO> list = carBrandServcie.listCarBrandGroupByLetterFromRedis();
        List<Integer> ids = supplierDao.listCarBrandId(sup);
        list.forEach(dto -> dto.getCarBrandList().removeIf(item -> ids.contains(item.getCarBrandId())));// 去除已经营的品牌
        return new ResultVO(ResultTypeEnum.SUCCESS, list);
    }

}
