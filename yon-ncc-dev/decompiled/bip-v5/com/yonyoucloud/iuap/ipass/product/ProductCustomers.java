/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductCustomers
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String pubts;
    private String productId;
    private String rangeType;
    private String customerId;
    private Boolean isCreator;
    private Boolean isApplied;
    private String customerCode;
    private String customerName;
    private String _status;

    public String getId() {
        return this.id;
    }

    public String getPubts() {
        return this.pubts;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getRangeType() {
        return this.rangeType;
    }

    public String getCustomerId() {
        return this.customerId;
    }

    public Boolean getIsCreator() {
        return this.isCreator;
    }

    public Boolean getIsApplied() {
        return this.isApplied;
    }

    public String getCustomerCode() {
        return this.customerCode;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String get_status() {
        return this._status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setRangeType(String rangeType) {
        this.rangeType = rangeType;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setIsCreator(Boolean isCreator) {
        this.isCreator = isCreator;
    }

    public void setIsApplied(Boolean isApplied) {
        this.isApplied = isApplied;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductCustomers)) {
            return false;
        }
        ProductCustomers other = (ProductCustomers)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$isCreator = this.getIsCreator();
        Boolean other$isCreator = other.getIsCreator();
        if (this$isCreator == null ? other$isCreator != null : !((Object)this$isCreator).equals(other$isCreator)) {
            return false;
        }
        Boolean this$isApplied = this.getIsApplied();
        Boolean other$isApplied = other.getIsApplied();
        if (this$isApplied == null ? other$isApplied != null : !((Object)this$isApplied).equals(other$isApplied)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$pubts = this.getPubts();
        String other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !this$pubts.equals(other$pubts)) {
            return false;
        }
        String this$productId = this.getProductId();
        String other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !this$productId.equals(other$productId)) {
            return false;
        }
        String this$rangeType = this.getRangeType();
        String other$rangeType = other.getRangeType();
        if (this$rangeType == null ? other$rangeType != null : !this$rangeType.equals(other$rangeType)) {
            return false;
        }
        String this$customerId = this.getCustomerId();
        String other$customerId = other.getCustomerId();
        if (this$customerId == null ? other$customerId != null : !this$customerId.equals(other$customerId)) {
            return false;
        }
        String this$customerCode = this.getCustomerCode();
        String other$customerCode = other.getCustomerCode();
        if (this$customerCode == null ? other$customerCode != null : !this$customerCode.equals(other$customerCode)) {
            return false;
        }
        String this$customerName = this.getCustomerName();
        String other$customerName = other.getCustomerName();
        if (this$customerName == null ? other$customerName != null : !this$customerName.equals(other$customerName)) {
            return false;
        }
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        return !(this$_status == null ? other$_status != null : !this$_status.equals(other$_status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductCustomers;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $isCreator = this.getIsCreator();
        result = result * 59 + ($isCreator == null ? 43 : ((Object)$isCreator).hashCode());
        Boolean $isApplied = this.getIsApplied();
        result = result * 59 + ($isApplied == null ? 43 : ((Object)$isApplied).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : $pubts.hashCode());
        String $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : $productId.hashCode());
        String $rangeType = this.getRangeType();
        result = result * 59 + ($rangeType == null ? 43 : $rangeType.hashCode());
        String $customerId = this.getCustomerId();
        result = result * 59 + ($customerId == null ? 43 : $customerId.hashCode());
        String $customerCode = this.getCustomerCode();
        result = result * 59 + ($customerCode == null ? 43 : $customerCode.hashCode());
        String $customerName = this.getCustomerName();
        result = result * 59 + ($customerName == null ? 43 : $customerName.hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        return result;
    }

    public String toString() {
        return "ProductCustomers(id=" + this.getId() + ", pubts=" + this.getPubts() + ", productId=" + this.getProductId() + ", rangeType=" + this.getRangeType() + ", customerId=" + this.getCustomerId() + ", isCreator=" + this.getIsCreator() + ", isApplied=" + this.getIsApplied() + ", customerCode=" + this.getCustomerCode() + ", customerName=" + this.getCustomerName() + ", _status=" + this.get_status() + ")";
    }
}

