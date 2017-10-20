package com.wq.sbp.model;

import org.springframework.beans.BeanUtils;

import com.wq.sbp.service.DtoToDoService;

/**
 * ReportPriceExtendDTO
 * 
 *
 * @author zwq
 * @date 2017年10月18日
 */
public class ReportPriceExtendDTO {

    /**
     * 询价单id
     * 
     * @author zwq
     */
    private Integer insId;

    /**
     * 供应商memberId
     * 
     * @author zwq
     */
    private Integer supplierMemberId;

    /**
     * 是否已经查看0:否,1:是
     * 
     * @author zwq
     */
    private Integer isRead;

    public ReportPriceExtendDO convertToReportPriceExtendDO(ReportPriceExtendDTO dto) {
        // 转换接口
        DtoToDoService<ReportPriceExtendDTO, ReportPriceExtendDO> convert = source -> {
            ReportPriceExtendDO target = new ReportPriceExtendDO();
            BeanUtils.copyProperties(source, target);
            return target;
        };
        return convert.dtoToDo(dto);
    }

    public Integer getIsRead() {
        return isRead;
    }

    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    public Integer getInsId() {
        return insId;
    }

    public void setInsId(Integer insId) {
        this.insId = insId;
    }

    public Integer getSupplierMemberId() {
        return supplierMemberId;
    }

    public void setSupplierMemberId(Integer supplierMemberId) {
        this.supplierMemberId = supplierMemberId;
    }

}
