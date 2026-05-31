/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductApplyQueryVO
extends UPCPager {
    private String[] fields;
    private Long id;
    private List<Long> idList;
    private String applyCode;
    private List<String> applyCodeList;
    private String productCode;
    private List<String> productCodeList;
    private Integer status;
    private Date auditTime;
    private Date auditDate;
    private Date createDate;
    private Date timestamp;
    private Date pubts;

    public String[] getFields() {
        return this.fields;
    }

    public Long getId() {
        return this.id;
    }

    public List<Long> getIdList() {
        return this.idList;
    }

    public String getApplyCode() {
        return this.applyCode;
    }

    public List<String> getApplyCodeList() {
        return this.applyCodeList;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public List<String> getProductCodeList() {
        return this.productCodeList;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Date getAuditTime() {
        return this.auditTime;
    }

    public Date getAuditDate() {
        return this.auditDate;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public Date getPubts() {
        return this.pubts;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    public void setApplyCodeList(List<String> applyCodeList) {
        this.applyCodeList = applyCodeList;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductCodeList(List<String> productCodeList) {
        this.productCodeList = productCodeList;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public void setAuditDate(Date auditDate) {
        this.auditDate = auditDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setPubts(Date pubts) {
        this.pubts = pubts;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductApplyQueryVO)) {
            return false;
        }
        ProductApplyQueryVO other = (ProductApplyQueryVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getFields(), other.getFields())) {
            return false;
        }
        List<Long> this$idList = this.getIdList();
        List<Long> other$idList = other.getIdList();
        if (this$idList == null ? other$idList != null : !((Object)this$idList).equals(other$idList)) {
            return false;
        }
        String this$applyCode = this.getApplyCode();
        String other$applyCode = other.getApplyCode();
        if (this$applyCode == null ? other$applyCode != null : !this$applyCode.equals(other$applyCode)) {
            return false;
        }
        List<String> this$applyCodeList = this.getApplyCodeList();
        List<String> other$applyCodeList = other.getApplyCodeList();
        if (this$applyCodeList == null ? other$applyCodeList != null : !((Object)this$applyCodeList).equals(other$applyCodeList)) {
            return false;
        }
        String this$productCode = this.getProductCode();
        String other$productCode = other.getProductCode();
        if (this$productCode == null ? other$productCode != null : !this$productCode.equals(other$productCode)) {
            return false;
        }
        List<String> this$productCodeList = this.getProductCodeList();
        List<String> other$productCodeList = other.getProductCodeList();
        if (this$productCodeList == null ? other$productCodeList != null : !((Object)this$productCodeList).equals(other$productCodeList)) {
            return false;
        }
        Date this$auditTime = this.getAuditTime();
        Date other$auditTime = other.getAuditTime();
        if (this$auditTime == null ? other$auditTime != null : !((Object)this$auditTime).equals(other$auditTime)) {
            return false;
        }
        Date this$auditDate = this.getAuditDate();
        Date other$auditDate = other.getAuditDate();
        if (this$auditDate == null ? other$auditDate != null : !((Object)this$auditDate).equals(other$auditDate)) {
            return false;
        }
        Date this$createDate = this.getCreateDate();
        Date other$createDate = other.getCreateDate();
        if (this$createDate == null ? other$createDate != null : !((Object)this$createDate).equals(other$createDate)) {
            return false;
        }
        Date this$timestamp = this.getTimestamp();
        Date other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !((Object)this$timestamp).equals(other$timestamp)) {
            return false;
        }
        Date this$pubts = this.getPubts();
        Date other$pubts = other.getPubts();
        return !(this$pubts == null ? other$pubts != null : !((Object)this$pubts).equals(other$pubts));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof ProductApplyQueryVO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getFields());
        List<Long> $idList = this.getIdList();
        result = result * 59 + ($idList == null ? 43 : ((Object)$idList).hashCode());
        String $applyCode = this.getApplyCode();
        result = result * 59 + ($applyCode == null ? 43 : $applyCode.hashCode());
        List<String> $applyCodeList = this.getApplyCodeList();
        result = result * 59 + ($applyCodeList == null ? 43 : ((Object)$applyCodeList).hashCode());
        String $productCode = this.getProductCode();
        result = result * 59 + ($productCode == null ? 43 : $productCode.hashCode());
        List<String> $productCodeList = this.getProductCodeList();
        result = result * 59 + ($productCodeList == null ? 43 : ((Object)$productCodeList).hashCode());
        Date $auditTime = this.getAuditTime();
        result = result * 59 + ($auditTime == null ? 43 : ((Object)$auditTime).hashCode());
        Date $auditDate = this.getAuditDate();
        result = result * 59 + ($auditDate == null ? 43 : ((Object)$auditDate).hashCode());
        Date $createDate = this.getCreateDate();
        result = result * 59 + ($createDate == null ? 43 : ((Object)$createDate).hashCode());
        Date $timestamp = this.getTimestamp();
        result = result * 59 + ($timestamp == null ? 43 : ((Object)$timestamp).hashCode());
        Date $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : ((Object)$pubts).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ProductApplyQueryVO(fields=" + Arrays.deepToString(this.getFields()) + ", id=" + this.getId() + ", idList=" + this.getIdList() + ", applyCode=" + this.getApplyCode() + ", applyCodeList=" + this.getApplyCodeList() + ", productCode=" + this.getProductCode() + ", productCodeList=" + this.getProductCodeList() + ", status=" + this.getStatus() + ", auditTime=" + this.getAuditTime() + ", auditDate=" + this.getAuditDate() + ", createDate=" + this.getCreateDate() + ", timestamp=" + this.getTimestamp() + ", pubts=" + this.getPubts() + ")";
    }
}

