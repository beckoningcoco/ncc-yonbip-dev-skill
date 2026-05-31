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
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class SyncProductAuthConditionDTO
implements Serializable {
    private Integer type;
    private Long shopId;
    private Long customerId;
    private List<Long> productIds;

    public Integer getType() {
        return this.type;
    }

    public Long getShopId() {
        return this.shopId;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public List<Long> getProductIds() {
        return this.productIds;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setProductIds(List<Long> productIds) {
        this.productIds = productIds;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SyncProductAuthConditionDTO)) {
            return false;
        }
        SyncProductAuthConditionDTO other = (SyncProductAuthConditionDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$type = this.getType();
        Integer other$type = other.getType();
        if (this$type == null ? other$type != null : !((Object)this$type).equals(other$type)) {
            return false;
        }
        Long this$shopId = this.getShopId();
        Long other$shopId = other.getShopId();
        if (this$shopId == null ? other$shopId != null : !((Object)this$shopId).equals(other$shopId)) {
            return false;
        }
        Long this$customerId = this.getCustomerId();
        Long other$customerId = other.getCustomerId();
        if (this$customerId == null ? other$customerId != null : !((Object)this$customerId).equals(other$customerId)) {
            return false;
        }
        List<Long> this$productIds = this.getProductIds();
        List<Long> other$productIds = other.getProductIds();
        return !(this$productIds == null ? other$productIds != null : !((Object)this$productIds).equals(other$productIds));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SyncProductAuthConditionDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $type = this.getType();
        result = result * 59 + ($type == null ? 43 : ((Object)$type).hashCode());
        Long $shopId = this.getShopId();
        result = result * 59 + ($shopId == null ? 43 : ((Object)$shopId).hashCode());
        Long $customerId = this.getCustomerId();
        result = result * 59 + ($customerId == null ? 43 : ((Object)$customerId).hashCode());
        List<Long> $productIds = this.getProductIds();
        result = result * 59 + ($productIds == null ? 43 : ((Object)$productIds).hashCode());
        return result;
    }

    public String toString() {
        return "SyncProductAuthConditionDTO(type=" + this.getType() + ", shopId=" + this.getShopId() + ", customerId=" + this.getCustomerId() + ", productIds=" + this.getProductIds() + ")";
    }
}

