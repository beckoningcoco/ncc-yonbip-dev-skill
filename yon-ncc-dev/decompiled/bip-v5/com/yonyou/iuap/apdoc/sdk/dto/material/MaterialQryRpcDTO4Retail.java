/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.apdoc.sdk.dto.material;

import com.yonyou.iuap.apdoc.sdk.dto.pub.QryFieldDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;

public class MaterialQryRpcDTO4Retail
extends UPCPager {
    private QryFieldDTO brandIds_and;
    private QryFieldDTO materialIds_and;
    private QryFieldDTO stopstatus_and;
    private QryFieldDTO isSaleInOfflineStore_and;
    private QryFieldDTO saleChannelOfOfflineRetail_and;
    private Boolean includeSubCls_and;
    private QryFieldDTO productClass_and;
    private QryFieldDTO couponIds;
    private QryFieldDTO productClassStopstatus_and;
    private QryFieldDTO realProductAttribute_and;
    private QryFieldDTO virtualProductAttribute_and;
    private QryFieldDTO realProductAttributeType_and;
    private QryFieldDTO materialProp_and;
    private QryFieldDTO managerOrg_and;
    private QryFieldDTO assignOrg_and;
    private Boolean isQueryCount;

    public QryFieldDTO getBrandIds_and() {
        return this.brandIds_and;
    }

    public QryFieldDTO getMaterialIds_and() {
        return this.materialIds_and;
    }

    public QryFieldDTO getStopstatus_and() {
        return this.stopstatus_and;
    }

    public QryFieldDTO getIsSaleInOfflineStore_and() {
        return this.isSaleInOfflineStore_and;
    }

    public QryFieldDTO getSaleChannelOfOfflineRetail_and() {
        return this.saleChannelOfOfflineRetail_and;
    }

    public Boolean getIncludeSubCls_and() {
        return this.includeSubCls_and;
    }

    public QryFieldDTO getProductClass_and() {
        return this.productClass_and;
    }

    public QryFieldDTO getCouponIds() {
        return this.couponIds;
    }

    public QryFieldDTO getProductClassStopstatus_and() {
        return this.productClassStopstatus_and;
    }

    public QryFieldDTO getRealProductAttribute_and() {
        return this.realProductAttribute_and;
    }

    public QryFieldDTO getVirtualProductAttribute_and() {
        return this.virtualProductAttribute_and;
    }

    public QryFieldDTO getRealProductAttributeType_and() {
        return this.realProductAttributeType_and;
    }

    public QryFieldDTO getMaterialProp_and() {
        return this.materialProp_and;
    }

    public QryFieldDTO getManagerOrg_and() {
        return this.managerOrg_and;
    }

    public QryFieldDTO getAssignOrg_and() {
        return this.assignOrg_and;
    }

    public Boolean getIsQueryCount() {
        return this.isQueryCount;
    }

    public void setBrandIds_and(QryFieldDTO brandIds_and) {
        this.brandIds_and = brandIds_and;
    }

    public void setMaterialIds_and(QryFieldDTO materialIds_and) {
        this.materialIds_and = materialIds_and;
    }

    public void setStopstatus_and(QryFieldDTO stopstatus_and) {
        this.stopstatus_and = stopstatus_and;
    }

    public void setIsSaleInOfflineStore_and(QryFieldDTO isSaleInOfflineStore_and) {
        this.isSaleInOfflineStore_and = isSaleInOfflineStore_and;
    }

    public void setSaleChannelOfOfflineRetail_and(QryFieldDTO saleChannelOfOfflineRetail_and) {
        this.saleChannelOfOfflineRetail_and = saleChannelOfOfflineRetail_and;
    }

    public void setIncludeSubCls_and(Boolean includeSubCls_and) {
        this.includeSubCls_and = includeSubCls_and;
    }

    public void setProductClass_and(QryFieldDTO productClass_and) {
        this.productClass_and = productClass_and;
    }

    public void setCouponIds(QryFieldDTO couponIds) {
        this.couponIds = couponIds;
    }

    public void setProductClassStopstatus_and(QryFieldDTO productClassStopstatus_and) {
        this.productClassStopstatus_and = productClassStopstatus_and;
    }

    public void setRealProductAttribute_and(QryFieldDTO realProductAttribute_and) {
        this.realProductAttribute_and = realProductAttribute_and;
    }

    public void setVirtualProductAttribute_and(QryFieldDTO virtualProductAttribute_and) {
        this.virtualProductAttribute_and = virtualProductAttribute_and;
    }

    public void setRealProductAttributeType_and(QryFieldDTO realProductAttributeType_and) {
        this.realProductAttributeType_and = realProductAttributeType_and;
    }

    public void setMaterialProp_and(QryFieldDTO materialProp_and) {
        this.materialProp_and = materialProp_and;
    }

    public void setManagerOrg_and(QryFieldDTO managerOrg_and) {
        this.managerOrg_and = managerOrg_and;
    }

    public void setAssignOrg_and(QryFieldDTO assignOrg_and) {
        this.assignOrg_and = assignOrg_and;
    }

    public void setIsQueryCount(Boolean isQueryCount) {
        this.isQueryCount = isQueryCount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MaterialQryRpcDTO4Retail)) {
            return false;
        }
        MaterialQryRpcDTO4Retail other = (MaterialQryRpcDTO4Retail)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$includeSubCls_and = this.getIncludeSubCls_and();
        Boolean other$includeSubCls_and = other.getIncludeSubCls_and();
        if (this$includeSubCls_and == null ? other$includeSubCls_and != null : !((Object)this$includeSubCls_and).equals(other$includeSubCls_and)) {
            return false;
        }
        Boolean this$isQueryCount = this.getIsQueryCount();
        Boolean other$isQueryCount = other.getIsQueryCount();
        if (this$isQueryCount == null ? other$isQueryCount != null : !((Object)this$isQueryCount).equals(other$isQueryCount)) {
            return false;
        }
        QryFieldDTO this$brandIds_and = this.getBrandIds_and();
        QryFieldDTO other$brandIds_and = other.getBrandIds_and();
        if (this$brandIds_and == null ? other$brandIds_and != null : !((Object)this$brandIds_and).equals(other$brandIds_and)) {
            return false;
        }
        QryFieldDTO this$materialIds_and = this.getMaterialIds_and();
        QryFieldDTO other$materialIds_and = other.getMaterialIds_and();
        if (this$materialIds_and == null ? other$materialIds_and != null : !((Object)this$materialIds_and).equals(other$materialIds_and)) {
            return false;
        }
        QryFieldDTO this$stopstatus_and = this.getStopstatus_and();
        QryFieldDTO other$stopstatus_and = other.getStopstatus_and();
        if (this$stopstatus_and == null ? other$stopstatus_and != null : !((Object)this$stopstatus_and).equals(other$stopstatus_and)) {
            return false;
        }
        QryFieldDTO this$isSaleInOfflineStore_and = this.getIsSaleInOfflineStore_and();
        QryFieldDTO other$isSaleInOfflineStore_and = other.getIsSaleInOfflineStore_and();
        if (this$isSaleInOfflineStore_and == null ? other$isSaleInOfflineStore_and != null : !((Object)this$isSaleInOfflineStore_and).equals(other$isSaleInOfflineStore_and)) {
            return false;
        }
        QryFieldDTO this$saleChannelOfOfflineRetail_and = this.getSaleChannelOfOfflineRetail_and();
        QryFieldDTO other$saleChannelOfOfflineRetail_and = other.getSaleChannelOfOfflineRetail_and();
        if (this$saleChannelOfOfflineRetail_and == null ? other$saleChannelOfOfflineRetail_and != null : !((Object)this$saleChannelOfOfflineRetail_and).equals(other$saleChannelOfOfflineRetail_and)) {
            return false;
        }
        QryFieldDTO this$productClass_and = this.getProductClass_and();
        QryFieldDTO other$productClass_and = other.getProductClass_and();
        if (this$productClass_and == null ? other$productClass_and != null : !((Object)this$productClass_and).equals(other$productClass_and)) {
            return false;
        }
        QryFieldDTO this$couponIds = this.getCouponIds();
        QryFieldDTO other$couponIds = other.getCouponIds();
        if (this$couponIds == null ? other$couponIds != null : !((Object)this$couponIds).equals(other$couponIds)) {
            return false;
        }
        QryFieldDTO this$productClassStopstatus_and = this.getProductClassStopstatus_and();
        QryFieldDTO other$productClassStopstatus_and = other.getProductClassStopstatus_and();
        if (this$productClassStopstatus_and == null ? other$productClassStopstatus_and != null : !((Object)this$productClassStopstatus_and).equals(other$productClassStopstatus_and)) {
            return false;
        }
        QryFieldDTO this$realProductAttribute_and = this.getRealProductAttribute_and();
        QryFieldDTO other$realProductAttribute_and = other.getRealProductAttribute_and();
        if (this$realProductAttribute_and == null ? other$realProductAttribute_and != null : !((Object)this$realProductAttribute_and).equals(other$realProductAttribute_and)) {
            return false;
        }
        QryFieldDTO this$virtualProductAttribute_and = this.getVirtualProductAttribute_and();
        QryFieldDTO other$virtualProductAttribute_and = other.getVirtualProductAttribute_and();
        if (this$virtualProductAttribute_and == null ? other$virtualProductAttribute_and != null : !((Object)this$virtualProductAttribute_and).equals(other$virtualProductAttribute_and)) {
            return false;
        }
        QryFieldDTO this$realProductAttributeType_and = this.getRealProductAttributeType_and();
        QryFieldDTO other$realProductAttributeType_and = other.getRealProductAttributeType_and();
        if (this$realProductAttributeType_and == null ? other$realProductAttributeType_and != null : !((Object)this$realProductAttributeType_and).equals(other$realProductAttributeType_and)) {
            return false;
        }
        QryFieldDTO this$materialProp_and = this.getMaterialProp_and();
        QryFieldDTO other$materialProp_and = other.getMaterialProp_and();
        if (this$materialProp_and == null ? other$materialProp_and != null : !((Object)this$materialProp_and).equals(other$materialProp_and)) {
            return false;
        }
        QryFieldDTO this$managerOrg_and = this.getManagerOrg_and();
        QryFieldDTO other$managerOrg_and = other.getManagerOrg_and();
        if (this$managerOrg_and == null ? other$managerOrg_and != null : !((Object)this$managerOrg_and).equals(other$managerOrg_and)) {
            return false;
        }
        QryFieldDTO this$assignOrg_and = this.getAssignOrg_and();
        QryFieldDTO other$assignOrg_and = other.getAssignOrg_and();
        return !(this$assignOrg_and == null ? other$assignOrg_and != null : !((Object)this$assignOrg_and).equals(other$assignOrg_and));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof MaterialQryRpcDTO4Retail;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $includeSubCls_and = this.getIncludeSubCls_and();
        result = result * 59 + ($includeSubCls_and == null ? 43 : ((Object)$includeSubCls_and).hashCode());
        Boolean $isQueryCount = this.getIsQueryCount();
        result = result * 59 + ($isQueryCount == null ? 43 : ((Object)$isQueryCount).hashCode());
        QryFieldDTO $brandIds_and = this.getBrandIds_and();
        result = result * 59 + ($brandIds_and == null ? 43 : ((Object)$brandIds_and).hashCode());
        QryFieldDTO $materialIds_and = this.getMaterialIds_and();
        result = result * 59 + ($materialIds_and == null ? 43 : ((Object)$materialIds_and).hashCode());
        QryFieldDTO $stopstatus_and = this.getStopstatus_and();
        result = result * 59 + ($stopstatus_and == null ? 43 : ((Object)$stopstatus_and).hashCode());
        QryFieldDTO $isSaleInOfflineStore_and = this.getIsSaleInOfflineStore_and();
        result = result * 59 + ($isSaleInOfflineStore_and == null ? 43 : ((Object)$isSaleInOfflineStore_and).hashCode());
        QryFieldDTO $saleChannelOfOfflineRetail_and = this.getSaleChannelOfOfflineRetail_and();
        result = result * 59 + ($saleChannelOfOfflineRetail_and == null ? 43 : ((Object)$saleChannelOfOfflineRetail_and).hashCode());
        QryFieldDTO $productClass_and = this.getProductClass_and();
        result = result * 59 + ($productClass_and == null ? 43 : ((Object)$productClass_and).hashCode());
        QryFieldDTO $couponIds = this.getCouponIds();
        result = result * 59 + ($couponIds == null ? 43 : ((Object)$couponIds).hashCode());
        QryFieldDTO $productClassStopstatus_and = this.getProductClassStopstatus_and();
        result = result * 59 + ($productClassStopstatus_and == null ? 43 : ((Object)$productClassStopstatus_and).hashCode());
        QryFieldDTO $realProductAttribute_and = this.getRealProductAttribute_and();
        result = result * 59 + ($realProductAttribute_and == null ? 43 : ((Object)$realProductAttribute_and).hashCode());
        QryFieldDTO $virtualProductAttribute_and = this.getVirtualProductAttribute_and();
        result = result * 59 + ($virtualProductAttribute_and == null ? 43 : ((Object)$virtualProductAttribute_and).hashCode());
        QryFieldDTO $realProductAttributeType_and = this.getRealProductAttributeType_and();
        result = result * 59 + ($realProductAttributeType_and == null ? 43 : ((Object)$realProductAttributeType_and).hashCode());
        QryFieldDTO $materialProp_and = this.getMaterialProp_and();
        result = result * 59 + ($materialProp_and == null ? 43 : ((Object)$materialProp_and).hashCode());
        QryFieldDTO $managerOrg_and = this.getManagerOrg_and();
        result = result * 59 + ($managerOrg_and == null ? 43 : ((Object)$managerOrg_and).hashCode());
        QryFieldDTO $assignOrg_and = this.getAssignOrg_and();
        result = result * 59 + ($assignOrg_and == null ? 43 : ((Object)$assignOrg_and).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MaterialQryRpcDTO4Retail(brandIds_and=" + this.getBrandIds_and() + ", materialIds_and=" + this.getMaterialIds_and() + ", stopstatus_and=" + this.getStopstatus_and() + ", isSaleInOfflineStore_and=" + this.getIsSaleInOfflineStore_and() + ", saleChannelOfOfflineRetail_and=" + this.getSaleChannelOfOfflineRetail_and() + ", includeSubCls_and=" + this.getIncludeSubCls_and() + ", productClass_and=" + this.getProductClass_and() + ", couponIds=" + this.getCouponIds() + ", productClassStopstatus_and=" + this.getProductClassStopstatus_and() + ", realProductAttribute_and=" + this.getRealProductAttribute_and() + ", virtualProductAttribute_and=" + this.getVirtualProductAttribute_and() + ", realProductAttributeType_and=" + this.getRealProductAttributeType_and() + ", materialProp_and=" + this.getMaterialProp_and() + ", managerOrg_and=" + this.getManagerOrg_and() + ", assignOrg_and=" + this.getAssignOrg_and() + ", isQueryCount=" + this.getIsQueryCount() + ")";
    }
}

