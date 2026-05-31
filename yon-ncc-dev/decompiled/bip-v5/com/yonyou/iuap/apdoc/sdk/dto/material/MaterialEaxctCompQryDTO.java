/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.apdoc.sdk.dto.material;

import com.yonyou.iuap.apdoc.sdk.dto.pub.QryFieldDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import java.util.List;

public class MaterialEaxctCompQryDTO
extends UPCPager {
    private QryFieldDTO materialCode;
    private QryFieldDTO barCode;
    private QryFieldDTO mnemonicCode;
    private List<QryFieldDTO> productPropCharacterList;
    private Long materialTplId;
    private QryFieldDTO stopstatus;
    private QryFieldDTO isSaleInOfflineStore;
    private QryFieldDTO saleChannelOfOfflineRetail;
    private QryFieldDTO productClass;
    private QryFieldDTO productClassStopStatus;
    private Boolean inculudSubCls;
    private QryFieldDTO realProductAttribute;
    private QryFieldDTO virtualProductAttribute;
    private QryFieldDTO realProductAttributeType;
    private QryFieldDTO materialProp_and;
    private QryFieldDTO brandIds;
    private QryFieldDTO couponIds;
    private QryFieldDTO materialIds;
    private QryFieldDTO assignOrg_and;
    private Boolean isQueryCount;

    public QryFieldDTO getMaterialCode() {
        return this.materialCode;
    }

    public QryFieldDTO getBarCode() {
        return this.barCode;
    }

    public QryFieldDTO getMnemonicCode() {
        return this.mnemonicCode;
    }

    public List<QryFieldDTO> getProductPropCharacterList() {
        return this.productPropCharacterList;
    }

    public Long getMaterialTplId() {
        return this.materialTplId;
    }

    public QryFieldDTO getStopstatus() {
        return this.stopstatus;
    }

    public QryFieldDTO getIsSaleInOfflineStore() {
        return this.isSaleInOfflineStore;
    }

    public QryFieldDTO getSaleChannelOfOfflineRetail() {
        return this.saleChannelOfOfflineRetail;
    }

    public QryFieldDTO getProductClass() {
        return this.productClass;
    }

    public QryFieldDTO getProductClassStopStatus() {
        return this.productClassStopStatus;
    }

    public Boolean getInculudSubCls() {
        return this.inculudSubCls;
    }

    public QryFieldDTO getRealProductAttribute() {
        return this.realProductAttribute;
    }

    public QryFieldDTO getVirtualProductAttribute() {
        return this.virtualProductAttribute;
    }

    public QryFieldDTO getRealProductAttributeType() {
        return this.realProductAttributeType;
    }

    public QryFieldDTO getMaterialProp_and() {
        return this.materialProp_and;
    }

    public QryFieldDTO getBrandIds() {
        return this.brandIds;
    }

    public QryFieldDTO getCouponIds() {
        return this.couponIds;
    }

    public QryFieldDTO getMaterialIds() {
        return this.materialIds;
    }

    public QryFieldDTO getAssignOrg_and() {
        return this.assignOrg_and;
    }

    public Boolean getIsQueryCount() {
        return this.isQueryCount;
    }

    public void setMaterialCode(QryFieldDTO materialCode) {
        this.materialCode = materialCode;
    }

    public void setBarCode(QryFieldDTO barCode) {
        this.barCode = barCode;
    }

    public void setMnemonicCode(QryFieldDTO mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public void setProductPropCharacterList(List<QryFieldDTO> productPropCharacterList) {
        this.productPropCharacterList = productPropCharacterList;
    }

    public void setMaterialTplId(Long materialTplId) {
        this.materialTplId = materialTplId;
    }

    public void setStopstatus(QryFieldDTO stopstatus) {
        this.stopstatus = stopstatus;
    }

    public void setIsSaleInOfflineStore(QryFieldDTO isSaleInOfflineStore) {
        this.isSaleInOfflineStore = isSaleInOfflineStore;
    }

    public void setSaleChannelOfOfflineRetail(QryFieldDTO saleChannelOfOfflineRetail) {
        this.saleChannelOfOfflineRetail = saleChannelOfOfflineRetail;
    }

    public void setProductClass(QryFieldDTO productClass) {
        this.productClass = productClass;
    }

    public void setProductClassStopStatus(QryFieldDTO productClassStopStatus) {
        this.productClassStopStatus = productClassStopStatus;
    }

    public void setInculudSubCls(Boolean inculudSubCls) {
        this.inculudSubCls = inculudSubCls;
    }

    public void setRealProductAttribute(QryFieldDTO realProductAttribute) {
        this.realProductAttribute = realProductAttribute;
    }

    public void setVirtualProductAttribute(QryFieldDTO virtualProductAttribute) {
        this.virtualProductAttribute = virtualProductAttribute;
    }

    public void setRealProductAttributeType(QryFieldDTO realProductAttributeType) {
        this.realProductAttributeType = realProductAttributeType;
    }

    public void setMaterialProp_and(QryFieldDTO materialProp_and) {
        this.materialProp_and = materialProp_and;
    }

    public void setBrandIds(QryFieldDTO brandIds) {
        this.brandIds = brandIds;
    }

    public void setCouponIds(QryFieldDTO couponIds) {
        this.couponIds = couponIds;
    }

    public void setMaterialIds(QryFieldDTO materialIds) {
        this.materialIds = materialIds;
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
        if (!(o instanceof MaterialEaxctCompQryDTO)) {
            return false;
        }
        MaterialEaxctCompQryDTO other = (MaterialEaxctCompQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$materialTplId = this.getMaterialTplId();
        Long other$materialTplId = other.getMaterialTplId();
        if (this$materialTplId == null ? other$materialTplId != null : !((Object)this$materialTplId).equals(other$materialTplId)) {
            return false;
        }
        Boolean this$inculudSubCls = this.getInculudSubCls();
        Boolean other$inculudSubCls = other.getInculudSubCls();
        if (this$inculudSubCls == null ? other$inculudSubCls != null : !((Object)this$inculudSubCls).equals(other$inculudSubCls)) {
            return false;
        }
        Boolean this$isQueryCount = this.getIsQueryCount();
        Boolean other$isQueryCount = other.getIsQueryCount();
        if (this$isQueryCount == null ? other$isQueryCount != null : !((Object)this$isQueryCount).equals(other$isQueryCount)) {
            return false;
        }
        QryFieldDTO this$materialCode = this.getMaterialCode();
        QryFieldDTO other$materialCode = other.getMaterialCode();
        if (this$materialCode == null ? other$materialCode != null : !((Object)this$materialCode).equals(other$materialCode)) {
            return false;
        }
        QryFieldDTO this$barCode = this.getBarCode();
        QryFieldDTO other$barCode = other.getBarCode();
        if (this$barCode == null ? other$barCode != null : !((Object)this$barCode).equals(other$barCode)) {
            return false;
        }
        QryFieldDTO this$mnemonicCode = this.getMnemonicCode();
        QryFieldDTO other$mnemonicCode = other.getMnemonicCode();
        if (this$mnemonicCode == null ? other$mnemonicCode != null : !((Object)this$mnemonicCode).equals(other$mnemonicCode)) {
            return false;
        }
        List<QryFieldDTO> this$productPropCharacterList = this.getProductPropCharacterList();
        List<QryFieldDTO> other$productPropCharacterList = other.getProductPropCharacterList();
        if (this$productPropCharacterList == null ? other$productPropCharacterList != null : !((Object)this$productPropCharacterList).equals(other$productPropCharacterList)) {
            return false;
        }
        QryFieldDTO this$stopstatus = this.getStopstatus();
        QryFieldDTO other$stopstatus = other.getStopstatus();
        if (this$stopstatus == null ? other$stopstatus != null : !((Object)this$stopstatus).equals(other$stopstatus)) {
            return false;
        }
        QryFieldDTO this$isSaleInOfflineStore = this.getIsSaleInOfflineStore();
        QryFieldDTO other$isSaleInOfflineStore = other.getIsSaleInOfflineStore();
        if (this$isSaleInOfflineStore == null ? other$isSaleInOfflineStore != null : !((Object)this$isSaleInOfflineStore).equals(other$isSaleInOfflineStore)) {
            return false;
        }
        QryFieldDTO this$saleChannelOfOfflineRetail = this.getSaleChannelOfOfflineRetail();
        QryFieldDTO other$saleChannelOfOfflineRetail = other.getSaleChannelOfOfflineRetail();
        if (this$saleChannelOfOfflineRetail == null ? other$saleChannelOfOfflineRetail != null : !((Object)this$saleChannelOfOfflineRetail).equals(other$saleChannelOfOfflineRetail)) {
            return false;
        }
        QryFieldDTO this$productClass = this.getProductClass();
        QryFieldDTO other$productClass = other.getProductClass();
        if (this$productClass == null ? other$productClass != null : !((Object)this$productClass).equals(other$productClass)) {
            return false;
        }
        QryFieldDTO this$productClassStopStatus = this.getProductClassStopStatus();
        QryFieldDTO other$productClassStopStatus = other.getProductClassStopStatus();
        if (this$productClassStopStatus == null ? other$productClassStopStatus != null : !((Object)this$productClassStopStatus).equals(other$productClassStopStatus)) {
            return false;
        }
        QryFieldDTO this$realProductAttribute = this.getRealProductAttribute();
        QryFieldDTO other$realProductAttribute = other.getRealProductAttribute();
        if (this$realProductAttribute == null ? other$realProductAttribute != null : !((Object)this$realProductAttribute).equals(other$realProductAttribute)) {
            return false;
        }
        QryFieldDTO this$virtualProductAttribute = this.getVirtualProductAttribute();
        QryFieldDTO other$virtualProductAttribute = other.getVirtualProductAttribute();
        if (this$virtualProductAttribute == null ? other$virtualProductAttribute != null : !((Object)this$virtualProductAttribute).equals(other$virtualProductAttribute)) {
            return false;
        }
        QryFieldDTO this$realProductAttributeType = this.getRealProductAttributeType();
        QryFieldDTO other$realProductAttributeType = other.getRealProductAttributeType();
        if (this$realProductAttributeType == null ? other$realProductAttributeType != null : !((Object)this$realProductAttributeType).equals(other$realProductAttributeType)) {
            return false;
        }
        QryFieldDTO this$materialProp_and = this.getMaterialProp_and();
        QryFieldDTO other$materialProp_and = other.getMaterialProp_and();
        if (this$materialProp_and == null ? other$materialProp_and != null : !((Object)this$materialProp_and).equals(other$materialProp_and)) {
            return false;
        }
        QryFieldDTO this$brandIds = this.getBrandIds();
        QryFieldDTO other$brandIds = other.getBrandIds();
        if (this$brandIds == null ? other$brandIds != null : !((Object)this$brandIds).equals(other$brandIds)) {
            return false;
        }
        QryFieldDTO this$couponIds = this.getCouponIds();
        QryFieldDTO other$couponIds = other.getCouponIds();
        if (this$couponIds == null ? other$couponIds != null : !((Object)this$couponIds).equals(other$couponIds)) {
            return false;
        }
        QryFieldDTO this$materialIds = this.getMaterialIds();
        QryFieldDTO other$materialIds = other.getMaterialIds();
        if (this$materialIds == null ? other$materialIds != null : !((Object)this$materialIds).equals(other$materialIds)) {
            return false;
        }
        QryFieldDTO this$assignOrg_and = this.getAssignOrg_and();
        QryFieldDTO other$assignOrg_and = other.getAssignOrg_and();
        return !(this$assignOrg_and == null ? other$assignOrg_and != null : !((Object)this$assignOrg_and).equals(other$assignOrg_and));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof MaterialEaxctCompQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $materialTplId = this.getMaterialTplId();
        result = result * 59 + ($materialTplId == null ? 43 : ((Object)$materialTplId).hashCode());
        Boolean $inculudSubCls = this.getInculudSubCls();
        result = result * 59 + ($inculudSubCls == null ? 43 : ((Object)$inculudSubCls).hashCode());
        Boolean $isQueryCount = this.getIsQueryCount();
        result = result * 59 + ($isQueryCount == null ? 43 : ((Object)$isQueryCount).hashCode());
        QryFieldDTO $materialCode = this.getMaterialCode();
        result = result * 59 + ($materialCode == null ? 43 : ((Object)$materialCode).hashCode());
        QryFieldDTO $barCode = this.getBarCode();
        result = result * 59 + ($barCode == null ? 43 : ((Object)$barCode).hashCode());
        QryFieldDTO $mnemonicCode = this.getMnemonicCode();
        result = result * 59 + ($mnemonicCode == null ? 43 : ((Object)$mnemonicCode).hashCode());
        List<QryFieldDTO> $productPropCharacterList = this.getProductPropCharacterList();
        result = result * 59 + ($productPropCharacterList == null ? 43 : ((Object)$productPropCharacterList).hashCode());
        QryFieldDTO $stopstatus = this.getStopstatus();
        result = result * 59 + ($stopstatus == null ? 43 : ((Object)$stopstatus).hashCode());
        QryFieldDTO $isSaleInOfflineStore = this.getIsSaleInOfflineStore();
        result = result * 59 + ($isSaleInOfflineStore == null ? 43 : ((Object)$isSaleInOfflineStore).hashCode());
        QryFieldDTO $saleChannelOfOfflineRetail = this.getSaleChannelOfOfflineRetail();
        result = result * 59 + ($saleChannelOfOfflineRetail == null ? 43 : ((Object)$saleChannelOfOfflineRetail).hashCode());
        QryFieldDTO $productClass = this.getProductClass();
        result = result * 59 + ($productClass == null ? 43 : ((Object)$productClass).hashCode());
        QryFieldDTO $productClassStopStatus = this.getProductClassStopStatus();
        result = result * 59 + ($productClassStopStatus == null ? 43 : ((Object)$productClassStopStatus).hashCode());
        QryFieldDTO $realProductAttribute = this.getRealProductAttribute();
        result = result * 59 + ($realProductAttribute == null ? 43 : ((Object)$realProductAttribute).hashCode());
        QryFieldDTO $virtualProductAttribute = this.getVirtualProductAttribute();
        result = result * 59 + ($virtualProductAttribute == null ? 43 : ((Object)$virtualProductAttribute).hashCode());
        QryFieldDTO $realProductAttributeType = this.getRealProductAttributeType();
        result = result * 59 + ($realProductAttributeType == null ? 43 : ((Object)$realProductAttributeType).hashCode());
        QryFieldDTO $materialProp_and = this.getMaterialProp_and();
        result = result * 59 + ($materialProp_and == null ? 43 : ((Object)$materialProp_and).hashCode());
        QryFieldDTO $brandIds = this.getBrandIds();
        result = result * 59 + ($brandIds == null ? 43 : ((Object)$brandIds).hashCode());
        QryFieldDTO $couponIds = this.getCouponIds();
        result = result * 59 + ($couponIds == null ? 43 : ((Object)$couponIds).hashCode());
        QryFieldDTO $materialIds = this.getMaterialIds();
        result = result * 59 + ($materialIds == null ? 43 : ((Object)$materialIds).hashCode());
        QryFieldDTO $assignOrg_and = this.getAssignOrg_and();
        result = result * 59 + ($assignOrg_and == null ? 43 : ((Object)$assignOrg_and).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MaterialEaxctCompQryDTO(materialCode=" + this.getMaterialCode() + ", barCode=" + this.getBarCode() + ", mnemonicCode=" + this.getMnemonicCode() + ", productPropCharacterList=" + this.getProductPropCharacterList() + ", materialTplId=" + this.getMaterialTplId() + ", stopstatus=" + this.getStopstatus() + ", isSaleInOfflineStore=" + this.getIsSaleInOfflineStore() + ", saleChannelOfOfflineRetail=" + this.getSaleChannelOfOfflineRetail() + ", productClass=" + this.getProductClass() + ", productClassStopStatus=" + this.getProductClassStopStatus() + ", inculudSubCls=" + this.getInculudSubCls() + ", realProductAttribute=" + this.getRealProductAttribute() + ", virtualProductAttribute=" + this.getVirtualProductAttribute() + ", realProductAttributeType=" + this.getRealProductAttributeType() + ", materialProp_and=" + this.getMaterialProp_and() + ", brandIds=" + this.getBrandIds() + ", couponIds=" + this.getCouponIds() + ", materialIds=" + this.getMaterialIds() + ", assignOrg_and=" + this.getAssignOrg_and() + ", isQueryCount=" + this.getIsQueryCount() + ")";
    }
}

