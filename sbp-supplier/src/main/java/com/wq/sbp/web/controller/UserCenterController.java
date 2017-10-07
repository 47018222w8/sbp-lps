package com.wq.sbp.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

@RestController
@RequestMapping("/v1")
public class UserCenterController {

    @Autowired
    public CarBrandServcie carBrandServcie;

    @Autowired
    public SupplierServiceImpl supplierServiceImpl;

    @Autowired
    public StoreServcie storeServcie;

    /**
     * 还没经营的品牌
     *
     * @param sup
     * @param request
     * @return
     *
     * @author zwq
     * @since 2017年9月28日
     */
    @GetMapping("/carBrands")
    public ResponseEntity<?> listCarBrand(Supplier sup, HttpServletRequest request) {
        sup.setMemberId((Integer) request.getAttribute("memberId"));
        return new ResponseEntity<>(supplierServiceImpl.listCarBrandNotOperate(sup), HttpStatus.OK);
    }

    /**
     * 已经经营的品牌
     *
     * @param request
     * @param sup
     * @return
     *
     * @author zwq
     * @since 2017年9月28日
     */
    @GetMapping("/suppliers")
    public ResponseEntity<?> listOperateCarBrand(HttpServletRequest request, Supplier sup) {
        sup.setMemberId((Integer) request.getAttribute("memberId"));
        return ResponseEntity.ok(supplierServiceImpl.listSupplier(sup));
    }

    @PutMapping("/suppliers")
    public ResponseEntity<?> updateSupplier(HttpServletRequest request, @RequestBody Supplier sup) {
        sup.setMemberId((Integer) request.getAttribute("memberId"));
        supplierServiceImpl.updateSupplierList(sup);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/suppliers")
    public ResponseEntity<?> saveSupplier(HttpServletRequest request, @RequestBody Supplier sup) {
        Integer memberId = (Integer) request.getAttribute("memberId");
        Store s = new Store();
        s.setMemberId(memberId);
        sup.setMemberId(memberId);
        sup.setStoreId(storeServcie.getStore(s).getStoreId());
        return supplierServiceImpl.saveSupplier(sup);
    }
}
