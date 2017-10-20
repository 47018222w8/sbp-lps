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

import com.wq.sbp.model.StoreDO;
import com.wq.sbp.model.SupplierDO;
import com.wq.sbp.service.CarBrandServcie;
import com.wq.sbp.service.StoreServcie;
import com.wq.sbp.service.impl.SupplierCarBrandServiceImpl;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * 用户相关业务控制器
 * 
 *
 * @author zwq
 * @date 2017年10月16日
 */
@RestController
@RequestMapping("/v1")
public class UserController {

    @Autowired
    public CarBrandServcie carBrandServcie;

    @Autowired
    public SupplierCarBrandServiceImpl supplierServiceImpl;

    @Autowired
    public StoreServcie storeServcie;

    @GetMapping("/stores/0/carBrands")
    @ApiOperation(value = "此供应商还没有经营的品牌")
    public ResponseEntity<?> listCarBrandNotOperate(HttpServletRequest request) {
        return supplierServiceImpl.listCarBrandNotOperate(new SupplierDO().setMemberId((Integer) request.getAttribute("memberId")));
    }

    @GetMapping("/suppliers")
    @ApiOperation(value = "已经经营/不经营的品牌")
    @ApiImplicitParam(name = "flag", value = "0:不经营,1:经营", required = true, paramType = "query", dataType = "String")
    public ResponseEntity<?> listOperateCarBrand(HttpServletRequest request, String flag) {
        return ResponseEntity.ok(supplierServiceImpl
                .listSupplier(new SupplierDO().setFlag(flag).setMemberId((Integer) request.getAttribute("memberId"))));
    }

    @PutMapping("/suppliers")
    @ApiOperation(value = "不再经营")
    public ResponseEntity<?> updateSupplier(HttpServletRequest request,
                                            @ApiParam(value = "不经营的品牌id集合", required = true) @RequestBody SupplierDO sup) {
        sup.setMemberId((Integer) request.getAttribute("memberId"));
        supplierServiceImpl.updateSupplierList(sup);
        sup.setFlag("1");
        return ResponseEntity.ok(supplierServiceImpl.listSupplier(sup));
    }

    @PostMapping("/suppliers")
    @ApiOperation(value = "新增经营品牌")
    public ResponseEntity<?> saveSupplier(HttpServletRequest request,
                                          @ApiParam(value = "新增的品牌id集合", required = true) @RequestBody SupplierDO sup) {
        Integer memberId = (Integer) request.getAttribute("memberId");
        sup.setMemberId(memberId).setStoreId(storeServcie.getStore(new StoreDO().setMemberId(memberId)).getStoreId());
        supplierServiceImpl.saveSupplier(sup);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
