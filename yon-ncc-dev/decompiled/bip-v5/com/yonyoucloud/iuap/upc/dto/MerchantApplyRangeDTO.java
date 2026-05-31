/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantApplyRangeDTO
implements Serializable {
    private Long id;
    private String orgId;
    private Long merchantId;
    private Long customerClass;
    private Long customerLevel;
    private Long customerArea;
    private Integer payWay;
    private Long shopId;
    private String transactionCurrency;
    private Boolean isPotential;
    private Boolean isSalesOrg;
    private Boolean detailStopStatus;

    public Long getId() {
        return this.id;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public Long getCustomerClass() {
        return this.customerClass;
    }

    public Long getCustomerLevel() {
        return this.customerLevel;
    }

    public Long getCustomerArea() {
        return this.customerArea;
    }

    public Integer getPayWay() {
        return this.payWay;
    }

    public Long getShopId() {
        return this.shopId;
    }

    public String getTransactionCurrency() {
        return this.transactionCurrency;
    }

    public Boolean getIsPotential() {
        return this.isPotential;
    }

    public Boolean getIsSalesOrg() {
        return this.isSalesOrg;
    }

    public Boolean getDetailStopStatus() {
        return this.detailStopStatus;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setCustomerClass(Long customerClass) {
        this.customerClass = customerClass;
    }

    public void setCustomerLevel(Long customerLevel) {
        this.customerLevel = customerLevel;
    }

    public void setCustomerArea(Long customerArea) {
        this.customerArea = customerArea;
    }

    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public void setIsPotential(Boolean isPotential) {
        this.isPotential = isPotential;
    }

    public void setIsSalesOrg(Boolean isSalesOrg) {
        this.isSalesOrg = isSalesOrg;
    }

    public void setDetailStopStatus(Boolean detailStopStatus) {
        this.detailStopStatus = detailStopStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantApplyRangeDTO)) {
            return false;
        }
        MerchantApplyRangeDTO other = (MerchantApplyRangeDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Long this$customerClass = this.getCustomerClass();
        Long other$customerClass = other.getCustomerClass();
        if (this$customerClass == null ? other$customerClass != null : !((Object)this$customerClass).equals(other$customerClass)) {
            return false;
        }
        Long this$customerLevel = this.getCustomerLevel();
        Long other$customerLevel = other.getCustomerLevel();
        if (this$customerLevel == null ? other$customerLevel != null : !((Object)this$customerLevel).equals(other$customerLevel)) {
            return false;
        }
        Long this$customerArea = this.getCustomerArea();
        Long other$customerArea = other.getCustomerArea();
        if (this$customerArea == null ? other$customerArea != null : !((Object)this$customerArea).equals(other$customerArea)) {
            return false;
        }
        Integer this$payWay = this.getPayWay();
        Integer other$payWay = other.getPayWay();
        if (this$payWay == null ? other$payWay != null : !((Object)this$payWay).equals(other$payWay)) {
            return false;
        }
        Long this$shopId = this.getShopId();
        Long other$shopId = other.getShopId();
        if (this$shopId == null ? other$shopId != null : !((Object)this$shopId).equals(other$shopId)) {
            return false;
        }
        Boolean this$isPotential = this.getIsPotential();
        Boolean other$isPotential = other.getIsPotential();
        if (this$isPotential == null ? other$isPotential != null : !((Object)this$isPotential).equals(other$isPotential)) {
            return false;
        }
        Boolean this$isSalesOrg = this.getIsSalesOrg();
        Boolean other$isSalesOrg = other.getIsSalesOrg();
        if (this$isSalesOrg == null ? other$isSalesOrg != null : !((Object)this$isSalesOrg).equals(other$isSalesOrg)) {
            return false;
        }
        Boolean this$detailStopStatus = this.getDetailStopStatus();
        Boolean other$detailStopStatus = other.getDetailStopStatus();
        if (this$detailStopStatus == null ? other$detailStopStatus != null : !((Object)this$detailStopStatus).equals(other$detailStopStatus)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$transactionCurrency = this.getTransactionCurrency();
        String other$transactionCurrency = other.getTransactionCurrency();
        return !(this$transactionCurrency == null ? other$transactionCurrency != null : !this$transactionCurrency.equals(other$transactionCurrency));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantApplyRangeDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $customerClass = this.getCustomerClass();
        result = result * 59 + ($customerClass == null ? 43 : ((Object)$customerClass).hashCode());
        Long $customerLevel = this.getCustomerLevel();
        result = result * 59 + ($customerLevel == null ? 43 : ((Object)$customerLevel).hashCode());
        Long $customerArea = this.getCustomerArea();
        result = result * 59 + ($customerArea == null ? 43 : ((Object)$customerArea).hashCode());
        Integer $payWay = this.getPayWay();
        result = result * 59 + ($payWay == null ? 43 : ((Object)$payWay).hashCode());
        Long $shopId = this.getShopId();
        result = result * 59 + ($shopId == null ? 43 : ((Object)$shopId).hashCode());
        Boolean $isPotential = this.getIsPotential();
        result = result * 59 + ($isPotential == null ? 43 : ((Object)$isPotential).hashCode());
        Boolean $isSalesOrg = this.getIsSalesOrg();
        result = result * 59 + ($isSalesOrg == null ? 43 : ((Object)$isSalesOrg).hashCode());
        Boolean $detailStopStatus = this.getDetailStopStatus();
        result = result * 59 + ($detailStopStatus == null ? 43 : ((Object)$detailStopStatus).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $transactionCurrency = this.getTransactionCurrency();
        result = result * 59 + ($transactionCurrency == null ? 43 : $transactionCurrency.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantApplyRangeDTO(id=" + this.getId() + ", orgId=" + this.getOrgId() + ", merchantId=" + this.getMerchantId() + ", customerClass=" + this.getCustomerClass() + ", customerLevel=" + this.getCustomerLevel() + ", customerArea=" + this.getCustomerArea() + ", payWay=" + this.getPayWay() + ", shopId=" + this.getShopId() + ", transactionCurrency=" + this.getTransactionCurrency() + ", isPotential=" + this.getIsPotential() + ", isSalesOrg=" + this.getIsSalesOrg() + ", detailStopStatus=" + this.getDetailStopStatus() + ")";
    }
}

