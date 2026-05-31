/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.productTpl.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductTplListDTO {
    Long id;
    String name;
    Boolean enableCyclePurchase;
    Boolean stopStatus;

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getEnableCyclePurchase() {
        return this.enableCyclePurchase;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnableCyclePurchase(Boolean enableCyclePurchase) {
        this.enableCyclePurchase = enableCyclePurchase;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductTplListDTO)) {
            return false;
        }
        ProductTplListDTO other = (ProductTplListDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Boolean this$enableCyclePurchase = this.getEnableCyclePurchase();
        Boolean other$enableCyclePurchase = other.getEnableCyclePurchase();
        if (this$enableCyclePurchase == null ? other$enableCyclePurchase != null : !((Object)this$enableCyclePurchase).equals(other$enableCyclePurchase)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        return !(this$name == null ? other$name != null : !this$name.equals(other$name));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTplListDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Boolean $enableCyclePurchase = this.getEnableCyclePurchase();
        result = result * 59 + ($enableCyclePurchase == null ? 43 : ((Object)$enableCyclePurchase).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        return result;
    }

    public String toString() {
        return "ProductTplListDTO(id=" + this.getId() + ", name=" + this.getName() + ", enableCyclePurchase=" + this.getEnableCyclePurchase() + ", stopStatus=" + this.getStopStatus() + ")";
    }
}

