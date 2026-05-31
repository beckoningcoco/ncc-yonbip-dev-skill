/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductAssistClassVO {
    private Long id;
    private Long productId;
    private Long productClassId;
    private String productClassCode;
    private String productClassName;
    private String status;

    public Long getId() {
        return this.id;
    }

    public Long getProductId() {
        return this.productId;
    }

    public Long getProductClassId() {
        return this.productClassId;
    }

    public String getProductClassCode() {
        return this.productClassCode;
    }

    public String getProductClassName() {
        return this.productClassName;
    }

    public String getStatus() {
        return this.status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductClassId(Long productClassId) {
        this.productClassId = productClassId;
    }

    public void setProductClassCode(String productClassCode) {
        this.productClassCode = productClassCode;
    }

    public void setProductClassName(String productClassName) {
        this.productClassName = productClassName;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductAssistClassVO)) {
            return false;
        }
        ProductAssistClassVO other = (ProductAssistClassVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        Long this$productClassId = this.getProductClassId();
        Long other$productClassId = other.getProductClassId();
        if (this$productClassId == null ? other$productClassId != null : !((Object)this$productClassId).equals(other$productClassId)) {
            return false;
        }
        String this$productClassCode = this.getProductClassCode();
        String other$productClassCode = other.getProductClassCode();
        if (this$productClassCode == null ? other$productClassCode != null : !this$productClassCode.equals(other$productClassCode)) {
            return false;
        }
        String this$productClassName = this.getProductClassName();
        String other$productClassName = other.getProductClassName();
        if (this$productClassName == null ? other$productClassName != null : !this$productClassName.equals(other$productClassName)) {
            return false;
        }
        String this$status = this.getStatus();
        String other$status = other.getStatus();
        return !(this$status == null ? other$status != null : !this$status.equals(other$status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductAssistClassVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Long $productClassId = this.getProductClassId();
        result = result * 59 + ($productClassId == null ? 43 : ((Object)$productClassId).hashCode());
        String $productClassCode = this.getProductClassCode();
        result = result * 59 + ($productClassCode == null ? 43 : $productClassCode.hashCode());
        String $productClassName = this.getProductClassName();
        result = result * 59 + ($productClassName == null ? 43 : $productClassName.hashCode());
        String $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "ProductAssistClassVO(id=" + this.getId() + ", productId=" + this.getProductId() + ", productClassId=" + this.getProductClassId() + ", productClassCode=" + this.getProductClassCode() + ", productClassName=" + this.getProductClassName() + ", status=" + this.getStatus() + ")";
    }
}

