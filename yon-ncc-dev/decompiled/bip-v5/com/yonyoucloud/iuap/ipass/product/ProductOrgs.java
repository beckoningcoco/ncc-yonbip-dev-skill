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
public class ProductOrgs
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String pubts;
    private String productId;
    private String rangeType;
    private String orgId_code;
    private String orgId;
    private Boolean isCreator;
    private Boolean isApplied;
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

    public String getOrgId_code() {
        return this.orgId_code;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public Boolean getIsCreator() {
        return this.isCreator;
    }

    public Boolean getIsApplied() {
        return this.isApplied;
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

    public void setOrgId_code(String orgId_code) {
        this.orgId_code = orgId_code;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setIsCreator(Boolean isCreator) {
        this.isCreator = isCreator;
    }

    public void setIsApplied(Boolean isApplied) {
        this.isApplied = isApplied;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductOrgs)) {
            return false;
        }
        ProductOrgs other = (ProductOrgs)o;
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
        String this$orgId_code = this.getOrgId_code();
        String other$orgId_code = other.getOrgId_code();
        if (this$orgId_code == null ? other$orgId_code != null : !this$orgId_code.equals(other$orgId_code)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        return !(this$_status == null ? other$_status != null : !this$_status.equals(other$_status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductOrgs;
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
        String $orgId_code = this.getOrgId_code();
        result = result * 59 + ($orgId_code == null ? 43 : $orgId_code.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        return result;
    }

    public String toString() {
        return "ProductOrgs(id=" + this.getId() + ", pubts=" + this.getPubts() + ", productId=" + this.getProductId() + ", rangeType=" + this.getRangeType() + ", orgId_code=" + this.getOrgId_code() + ", orgId=" + this.getOrgId() + ", isCreator=" + this.getIsCreator() + ", isApplied=" + this.getIsApplied() + ", _status=" + this.get_status() + ")";
    }
}

