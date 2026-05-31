/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.apdoc.sdk.dto.material;

import com.yonyou.iuap.apdoc.sdk.constant.MaterailScope;
import com.yonyou.iuap.apdoc.sdk.dto.material.MaterialCompQryDTO;
import com.yonyou.iuap.apdoc.sdk.dto.pub.QryFieldDTO;

public class ShopMaterialQryDTO
extends MaterialCompQryDTO {
    private Boolean isOfflineStoreOrder;
    private Boolean saleChannelOfOfflineRetail;
    private Integer realProductAttribute;
    private QryFieldDTO realProductAttributeType;
    private Boolean virtualMaterailFlag;
    private MaterailScope materailScope;
    private QryFieldDTO shopOrg_and;

    public Boolean getIsOfflineStoreOrder() {
        return this.isOfflineStoreOrder;
    }

    public Boolean getSaleChannelOfOfflineRetail() {
        return this.saleChannelOfOfflineRetail;
    }

    public Integer getRealProductAttribute() {
        return this.realProductAttribute;
    }

    public QryFieldDTO getRealProductAttributeType() {
        return this.realProductAttributeType;
    }

    public Boolean getVirtualMaterailFlag() {
        return this.virtualMaterailFlag;
    }

    public MaterailScope getMaterailScope() {
        return this.materailScope;
    }

    public QryFieldDTO getShopOrg_and() {
        return this.shopOrg_and;
    }

    public void setIsOfflineStoreOrder(Boolean isOfflineStoreOrder) {
        this.isOfflineStoreOrder = isOfflineStoreOrder;
    }

    public void setSaleChannelOfOfflineRetail(Boolean saleChannelOfOfflineRetail) {
        this.saleChannelOfOfflineRetail = saleChannelOfOfflineRetail;
    }

    public void setRealProductAttribute(Integer realProductAttribute) {
        this.realProductAttribute = realProductAttribute;
    }

    public void setRealProductAttributeType(QryFieldDTO realProductAttributeType) {
        this.realProductAttributeType = realProductAttributeType;
    }

    public void setVirtualMaterailFlag(Boolean virtualMaterailFlag) {
        this.virtualMaterailFlag = virtualMaterailFlag;
    }

    public void setMaterailScope(MaterailScope materailScope) {
        this.materailScope = materailScope;
    }

    public void setShopOrg_and(QryFieldDTO shopOrg_and) {
        this.shopOrg_and = shopOrg_and;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ShopMaterialQryDTO)) {
            return false;
        }
        ShopMaterialQryDTO other = (ShopMaterialQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$isOfflineStoreOrder = this.getIsOfflineStoreOrder();
        Boolean other$isOfflineStoreOrder = other.getIsOfflineStoreOrder();
        if (this$isOfflineStoreOrder == null ? other$isOfflineStoreOrder != null : !((Object)this$isOfflineStoreOrder).equals(other$isOfflineStoreOrder)) {
            return false;
        }
        Boolean this$saleChannelOfOfflineRetail = this.getSaleChannelOfOfflineRetail();
        Boolean other$saleChannelOfOfflineRetail = other.getSaleChannelOfOfflineRetail();
        if (this$saleChannelOfOfflineRetail == null ? other$saleChannelOfOfflineRetail != null : !((Object)this$saleChannelOfOfflineRetail).equals(other$saleChannelOfOfflineRetail)) {
            return false;
        }
        Integer this$realProductAttribute = this.getRealProductAttribute();
        Integer other$realProductAttribute = other.getRealProductAttribute();
        if (this$realProductAttribute == null ? other$realProductAttribute != null : !((Object)this$realProductAttribute).equals(other$realProductAttribute)) {
            return false;
        }
        Boolean this$virtualMaterailFlag = this.getVirtualMaterailFlag();
        Boolean other$virtualMaterailFlag = other.getVirtualMaterailFlag();
        if (this$virtualMaterailFlag == null ? other$virtualMaterailFlag != null : !((Object)this$virtualMaterailFlag).equals(other$virtualMaterailFlag)) {
            return false;
        }
        QryFieldDTO this$realProductAttributeType = this.getRealProductAttributeType();
        QryFieldDTO other$realProductAttributeType = other.getRealProductAttributeType();
        if (this$realProductAttributeType == null ? other$realProductAttributeType != null : !((Object)this$realProductAttributeType).equals(other$realProductAttributeType)) {
            return false;
        }
        MaterailScope this$materailScope = this.getMaterailScope();
        MaterailScope other$materailScope = other.getMaterailScope();
        if (this$materailScope == null ? other$materailScope != null : !((Object)((Object)this$materailScope)).equals((Object)other$materailScope)) {
            return false;
        }
        QryFieldDTO this$shopOrg_and = this.getShopOrg_and();
        QryFieldDTO other$shopOrg_and = other.getShopOrg_and();
        return !(this$shopOrg_and == null ? other$shopOrg_and != null : !((Object)this$shopOrg_and).equals(other$shopOrg_and));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof ShopMaterialQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $isOfflineStoreOrder = this.getIsOfflineStoreOrder();
        result = result * 59 + ($isOfflineStoreOrder == null ? 43 : ((Object)$isOfflineStoreOrder).hashCode());
        Boolean $saleChannelOfOfflineRetail = this.getSaleChannelOfOfflineRetail();
        result = result * 59 + ($saleChannelOfOfflineRetail == null ? 43 : ((Object)$saleChannelOfOfflineRetail).hashCode());
        Integer $realProductAttribute = this.getRealProductAttribute();
        result = result * 59 + ($realProductAttribute == null ? 43 : ((Object)$realProductAttribute).hashCode());
        Boolean $virtualMaterailFlag = this.getVirtualMaterailFlag();
        result = result * 59 + ($virtualMaterailFlag == null ? 43 : ((Object)$virtualMaterailFlag).hashCode());
        QryFieldDTO $realProductAttributeType = this.getRealProductAttributeType();
        result = result * 59 + ($realProductAttributeType == null ? 43 : ((Object)$realProductAttributeType).hashCode());
        MaterailScope $materailScope = this.getMaterailScope();
        result = result * 59 + ($materailScope == null ? 43 : ((Object)((Object)$materailScope)).hashCode());
        QryFieldDTO $shopOrg_and = this.getShopOrg_and();
        result = result * 59 + ($shopOrg_and == null ? 43 : ((Object)$shopOrg_and).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ShopMaterialQryDTO(isOfflineStoreOrder=" + this.getIsOfflineStoreOrder() + ", saleChannelOfOfflineRetail=" + this.getSaleChannelOfOfflineRetail() + ", realProductAttribute=" + this.getRealProductAttribute() + ", realProductAttributeType=" + this.getRealProductAttributeType() + ", virtualMaterailFlag=" + this.getVirtualMaterailFlag() + ", materailScope=" + (Object)((Object)this.getMaterailScope()) + ", shopOrg_and=" + this.getShopOrg_and() + ")";
    }
}

