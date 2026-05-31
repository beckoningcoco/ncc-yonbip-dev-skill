/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.portal;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantRangeDetailPortalDTO
implements Serializable {
    private Long merchantId;
    private String orgId;
    private Long merchantApplyRangeId;
    private Long settlementMethod;
    private Long shipmentMethod;
    private Integer payWay;
    private Boolean stopStatus;
    private String isTradeCustomers;

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public Long getMerchantApplyRangeId() {
        return this.merchantApplyRangeId;
    }

    public Long getSettlementMethod() {
        return this.settlementMethod;
    }

    public Long getShipmentMethod() {
        return this.shipmentMethod;
    }

    public Integer getPayWay() {
        return this.payWay;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public String getIsTradeCustomers() {
        return this.isTradeCustomers;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setMerchantApplyRangeId(Long merchantApplyRangeId) {
        this.merchantApplyRangeId = merchantApplyRangeId;
    }

    public void setSettlementMethod(Long settlementMethod) {
        this.settlementMethod = settlementMethod;
    }

    public void setShipmentMethod(Long shipmentMethod) {
        this.shipmentMethod = shipmentMethod;
    }

    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setIsTradeCustomers(String isTradeCustomers) {
        this.isTradeCustomers = isTradeCustomers;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantRangeDetailPortalDTO)) {
            return false;
        }
        MerchantRangeDetailPortalDTO other = (MerchantRangeDetailPortalDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Long this$merchantApplyRangeId = this.getMerchantApplyRangeId();
        Long other$merchantApplyRangeId = other.getMerchantApplyRangeId();
        if (this$merchantApplyRangeId == null ? other$merchantApplyRangeId != null : !((Object)this$merchantApplyRangeId).equals(other$merchantApplyRangeId)) {
            return false;
        }
        Long this$settlementMethod = this.getSettlementMethod();
        Long other$settlementMethod = other.getSettlementMethod();
        if (this$settlementMethod == null ? other$settlementMethod != null : !((Object)this$settlementMethod).equals(other$settlementMethod)) {
            return false;
        }
        Long this$shipmentMethod = this.getShipmentMethod();
        Long other$shipmentMethod = other.getShipmentMethod();
        if (this$shipmentMethod == null ? other$shipmentMethod != null : !((Object)this$shipmentMethod).equals(other$shipmentMethod)) {
            return false;
        }
        Integer this$payWay = this.getPayWay();
        Integer other$payWay = other.getPayWay();
        if (this$payWay == null ? other$payWay != null : !((Object)this$payWay).equals(other$payWay)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$isTradeCustomers = this.getIsTradeCustomers();
        String other$isTradeCustomers = other.getIsTradeCustomers();
        return !(this$isTradeCustomers == null ? other$isTradeCustomers != null : !this$isTradeCustomers.equals(other$isTradeCustomers));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantRangeDetailPortalDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $merchantApplyRangeId = this.getMerchantApplyRangeId();
        result = result * 59 + ($merchantApplyRangeId == null ? 43 : ((Object)$merchantApplyRangeId).hashCode());
        Long $settlementMethod = this.getSettlementMethod();
        result = result * 59 + ($settlementMethod == null ? 43 : ((Object)$settlementMethod).hashCode());
        Long $shipmentMethod = this.getShipmentMethod();
        result = result * 59 + ($shipmentMethod == null ? 43 : ((Object)$shipmentMethod).hashCode());
        Integer $payWay = this.getPayWay();
        result = result * 59 + ($payWay == null ? 43 : ((Object)$payWay).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $isTradeCustomers = this.getIsTradeCustomers();
        result = result * 59 + ($isTradeCustomers == null ? 43 : $isTradeCustomers.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantRangeDetailPortalDTO(merchantId=" + this.getMerchantId() + ", orgId=" + this.getOrgId() + ", merchantApplyRangeId=" + this.getMerchantApplyRangeId() + ", settlementMethod=" + this.getSettlementMethod() + ", shipmentMethod=" + this.getShipmentMethod() + ", payWay=" + this.getPayWay() + ", stopStatus=" + this.getStopStatus() + ", isTradeCustomers=" + this.getIsTradeCustomers() + ")";
    }
}

