package com.wq.sbp.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wq.sbp.model.ResultTypeEnum;
import com.wq.sbp.model.ResultVO;
import com.wq.sbp.model.Supplier;
import com.wq.sbp.service.CarBrandServcie;
import com.wq.sbp.service.SupplierInfoService;
import com.wq.sbp.service.impl.SupplierServiceImpl;

@RestController
@RequestMapping("/api/1.0/LPS/user")
public class UserCenterController {

    @Autowired
    public CarBrandServcie carBrandServcie;

    @Autowired
    public SupplierInfoService supplierInfoService;

    @Autowired
    public SupplierServiceImpl supplierServiceImpl;

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
    @GetMapping("/car/brand")
    public ResultVO listCarBrand(Supplier sup, HttpServletRequest request) {
        sup.setMemberId((Integer) request.getAttribute("memberId"));
        return supplierInfoService.listCarBrandNotOperate(sup);
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
    @GetMapping("/operate/carBrand/list")
    public ResponseEntity<ResultVO> listOperateCarBrand(HttpServletRequest request, Supplier sup) {
        sup.setMemberId((Integer) request.getAttribute("memberId"));
        return ResponseEntity.ok(new ResultVO(ResultTypeEnum.SUCCESS, supplierServiceImpl.listSupplier(sup)));
    }

    @PutMapping("/operate/carBrand")
    public ResultVO NotOperateCarBrand(HttpServletRequest request, @RequestBody Supplier sup) {
        sup.setMemberId((Integer) request.getAttribute("memberId"));
        return new ResultVO(ResultTypeEnum.SUCCESS, supplierServiceImpl.updateSupplierList(sup));
    }
}
