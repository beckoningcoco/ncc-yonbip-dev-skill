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
public class MaterialLifeCycleCheckDTO
implements Serializable {
    private Long productId;
    private String orgId;
    private String serviceCode;
    private String transType;
    private String action;

    public MaterialLifeCycleCheckDTO() {
    }

    public MaterialLifeCycleCheckDTO(Long productId, String orgId, String serviceCode, String transType, String action) {
        this.productId = productId;
        this.orgId = orgId;
        this.serviceCode = serviceCode;
        this.transType = transType;
        this.action = action;
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    public String getTransType() {
        return this.transType;
    }

    public String getAction() {
        return this.action;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MaterialLifeCycleCheckDTO)) {
            return false;
        }
        MaterialLifeCycleCheckDTO other = (MaterialLifeCycleCheckDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$serviceCode = this.getServiceCode();
        String other$serviceCode = other.getServiceCode();
        if (this$serviceCode == null ? other$serviceCode != null : !this$serviceCode.equals(other$serviceCode)) {
            return false;
        }
        String this$transType = this.getTransType();
        String other$transType = other.getTransType();
        if (this$transType == null ? other$transType != null : !this$transType.equals(other$transType)) {
            return false;
        }
        String this$action = this.getAction();
        String other$action = other.getAction();
        return !(this$action == null ? other$action != null : !this$action.equals(other$action));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MaterialLifeCycleCheckDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $serviceCode = this.getServiceCode();
        result = result * 59 + ($serviceCode == null ? 43 : $serviceCode.hashCode());
        String $transType = this.getTransType();
        result = result * 59 + ($transType == null ? 43 : $transType.hashCode());
        String $action = this.getAction();
        result = result * 59 + ($action == null ? 43 : $action.hashCode());
        return result;
    }

    public String toString() {
        return "MaterialLifeCycleCheckDTO(productId=" + this.getProductId() + ", orgId=" + this.getOrgId() + ", serviceCode=" + this.getServiceCode() + ", transType=" + this.getTransType() + ", action=" + this.getAction() + ")";
    }
}

