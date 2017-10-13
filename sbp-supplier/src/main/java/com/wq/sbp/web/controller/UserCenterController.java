package com.wq.sbp.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wq.sbp.model.Store;
import com.wq.sbp.model.Supplier;
import com.wq.sbp.service.CarBrandServcie;
import com.wq.sbp.service.StoreServcie;
import com.wq.sbp.service.impl.SupplierServiceImpl;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/v1")
public class UserCenterController {

    @Autowired
    public CarBrandServcie carBrandServcie;

    @Autowired
    public SupplierServiceImpl supplierServiceImpl;

    @Autowired
    public StoreServcie storeServcie;

    @GetMapping("/stores/0/carBrands")
    @ApiOperation(value = "此供应商还没有经营的品牌")
    public ResponseEntity<?> listCarBrandNotOperate(HttpServletRequest request) {
        Supplier sup = new Supplier();
        sup.setMemberId((Integer) request.getAttribute("memberId"));
        return supplierServiceImpl.listCarBrandNotOperate(sup);
    }

    @GetMapping("/suppliers")
    @ApiOperation(value = "已经经营/不经营的品牌")
    @ApiImplicitParam(name = "flag", value = "0:不经营,1:经营", required = true, paramType = "query", dataType = "String")
    public ResponseEntity<?> listOperateCarBrand(HttpServletRequest request, String flag) {
        Supplier sup = new Supplier();
        sup.setFlag(flag);
        sup.setMemberId((Integer) request.getAttribute("memberId"));
        return ResponseEntity.ok(supplierServiceImpl.listSupplier(sup));
    }

    @PutMapping("/suppliers")
    @ApiOperation(value = "不再经营")
    public ResponseEntity<?> updateSupplier(HttpServletRequest request, @RequestBody Supplier sup) {
        sup.setMemberId((Integer) request.getAttribute("memberId"));
        supplierServiceImpl.updateSupplierList(sup);
        sup.setFlag("1");
        return ResponseEntity.ok(supplierServiceImpl.listSupplier(sup));
    }

    @PostMapping("/suppliers")
    @ApiOperation(value = "新增经营品牌")
    public ResponseEntity<?> saveSupplier(HttpServletRequest request, @RequestBody Supplier sup) {
        Integer memberId = (Integer) request.getAttribute("memberId");
        Store s = new Store();
        s.setMemberId(memberId);
        sup.setMemberId(memberId);
        sup.setStoreId(storeServcie.getStore(s).getStoreId());
        supplierServiceImpl.saveSupplier(sup);
        sup.setFlag("1");
        return ResponseEntity.ok(supplierServiceImpl.listSupplier(sup));
    }
}
