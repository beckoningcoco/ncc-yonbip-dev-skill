/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.apdoc.sdk.dto.material;

import com.yonyou.iuap.apdoc.sdk.dto.material.MaterialEaxctCompQryDTO;
import com.yonyou.iuap.apdoc.sdk.dto.pub.QryFieldDTO;
import java.util.LinkedHashSet;
import java.util.List;

public class SkuQryRpcDTO4Retail
extends MaterialEaxctCompQryDTO {
    private QryFieldDTO skuIds_and;
    private Boolean skuFlag_and;
    private QryFieldDTO skuCode_and;
    private List<QryFieldDTO> productPropCharacter_or;
    private List<QryFieldDTO> skuFreeCharacter_or;
    private QryFieldDTO skuSpecs_or;
    private QryFieldDTO materialName_or;
    private QryFieldDTO materialCode_or;
    private QryFieldDTO barCode_or;
    private QryFieldDTO modelDescription_or;
    private QryFieldDTO model_or;
    private QryFieldDTO skuCode_or;
    private QryFieldDTO skuName_or;
    private QryFieldDTO skuBarCode_or;
    private QryFieldDTO mnemonicCode_or;
    private QryFieldDTO brandName_or;
    private QryFieldDTO skuIds_or;
    private QryFieldDTO materialIds_or;
    private QryFieldDTO erpCode_or;
    private Boolean isMaterial;
    private QryFieldDTO skuStopStatus_and;
    private Boolean distinct;
    private QryFieldDTO productClass_fullPath_and;
    private QryFieldDTO productClass_fullPath_or;
    private LinkedHashSet<String> ascField;
    private LinkedHashSet<String> descField;
    private Boolean needCount = false;

    public QryFieldDTO getSkuIds_and() {
        return this.skuIds_and;
    }

    public Boolean getSkuFlag_and() {
        return this.skuFlag_and;
    }

    public QryFieldDTO getSkuCode_and() {
        return this.skuCode_and;
    }

    public List<QryFieldDTO> getProductPropCharacter_or() {
        return this.productPropCharacter_or;
    }

    public List<QryFieldDTO> getSkuFreeCharacter_or() {
        return this.skuFreeCharacter_or;
    }

    public QryFieldDTO getSkuSpecs_or() {
        return this.skuSpecs_or;
    }

    public QryFieldDTO getMaterialName_or() {
        return this.materialName_or;
    }

    public QryFieldDTO getMaterialCode_or() {
        return this.materialCode_or;
    }

    public QryFieldDTO getBarCode_or() {
        return this.barCode_or;
    }

    public QryFieldDTO getModelDescription_or() {
        return this.modelDescription_or;
    }

    public QryFieldDTO getModel_or() {
        return this.model_or;
    }

    public QryFieldDTO getSkuCode_or() {
        return this.skuCode_or;
    }

    public QryFieldDTO getSkuName_or() {
        return this.skuName_or;
    }

    public QryFieldDTO getSkuBarCode_or() {
        return this.skuBarCode_or;
    }

    public QryFieldDTO getMnemonicCode_or() {
        return this.mnemonicCode_or;
    }

    public QryFieldDTO getBrandName_or() {
        return this.brandName_or;
    }

    public QryFieldDTO getSkuIds_or() {
        return this.skuIds_or;
    }

    public QryFieldDTO getMaterialIds_or() {
        return this.materialIds_or;
    }

    public QryFieldDTO getErpCode_or() {
        return this.erpCode_or;
    }

    public Boolean getIsMaterial() {
        return this.isMaterial;
    }

    public QryFieldDTO getSkuStopStatus_and() {
        return this.skuStopStatus_and;
    }

    public Boolean getDistinct() {
        return this.distinct;
    }

    public QryFieldDTO getProductClass_fullPath_and() {
        return this.productClass_fullPath_and;
    }

    public QryFieldDTO getProductClass_fullPath_or() {
        return this.productClass_fullPath_or;
    }

    public LinkedHashSet<String> getAscField() {
        return this.ascField;
    }

    public LinkedHashSet<String> getDescField() {
        return this.descField;
    }

    @Override
    public Boolean getNeedCount() {
        return this.needCount;
    }

    public void setSkuIds_and(QryFieldDTO skuIds_and) {
        this.skuIds_and = skuIds_and;
    }

    public void setSkuFlag_and(Boolean skuFlag_and) {
        this.skuFlag_and = skuFlag_and;
    }

    public void setSkuCode_and(QryFieldDTO skuCode_and) {
        this.skuCode_and = skuCode_and;
    }

    public void setProductPropCharacter_or(List<QryFieldDTO> productPropCharacter_or) {
        this.productPropCharacter_or = productPropCharacter_or;
    }

    public void setSkuFreeCharacter_or(List<QryFieldDTO> skuFreeCharacter_or) {
        this.skuFreeCharacter_or = skuFreeCharacter_or;
    }

    public void setSkuSpecs_or(QryFieldDTO skuSpecs_or) {
        this.skuSpecs_or = skuSpecs_or;
    }

    public void setMaterialName_or(QryFieldDTO materialName_or) {
        this.materialName_or = materialName_or;
    }

    public void setMaterialCode_or(QryFieldDTO materialCode_or) {
        this.materialCode_or = materialCode_or;
    }

    public void setBarCode_or(QryFieldDTO barCode_or) {
        this.barCode_or = barCode_or;
    }

    public void setModelDescription_or(QryFieldDTO modelDescription_or) {
        this.modelDescription_or = modelDescription_or;
    }

    public void setModel_or(QryFieldDTO model_or) {
        this.model_or = model_or;
    }

    public void setSkuCode_or(QryFieldDTO skuCode_or) {
        this.skuCode_or = skuCode_or;
    }

    public void setSkuName_or(QryFieldDTO skuName_or) {
        this.skuName_or = skuName_or;
    }

    public void setSkuBarCode_or(QryFieldDTO skuBarCode_or) {
        this.skuBarCode_or = skuBarCode_or;
    }

    public void setMnemonicCode_or(QryFieldDTO mnemonicCode_or) {
        this.mnemonicCode_or = mnemonicCode_or;
    }

    public void setBrandName_or(QryFieldDTO brandName_or) {
        this.brandName_or = brandName_or;
    }

    public void setSkuIds_or(QryFieldDTO skuIds_or) {
        this.skuIds_or = skuIds_or;
    }

    public void setMaterialIds_or(QryFieldDTO materialIds_or) {
        this.materialIds_or = materialIds_or;
    }

    public void setErpCode_or(QryFieldDTO erpCode_or) {
        this.erpCode_or = erpCode_or;
    }

    public void setIsMaterial(Boolean isMaterial) {
        this.isMaterial = isMaterial;
    }

    public void setSkuStopStatus_and(QryFieldDTO skuStopStatus_and) {
        this.skuStopStatus_and = skuStopStatus_and;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    public void setProductClass_fullPath_and(QryFieldDTO productClass_fullPath_and) {
        this.productClass_fullPath_and = productClass_fullPath_and;
    }

    public void setProductClass_fullPath_or(QryFieldDTO productClass_fullPath_or) {
        this.productClass_fullPath_or = productClass_fullPath_or;
    }

    public void setAscField(LinkedHashSet<String> ascField) {
        this.ascField = ascField;
    }

    public void setDescField(LinkedHashSet<String> descField) {
        this.descField = descField;
    }

    @Override
    public void setNeedCount(Boolean needCount) {
        this.needCount = needCount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SkuQryRpcDTO4Retail)) {
            return false;
        }
        SkuQryRpcDTO4Retail other = (SkuQryRpcDTO4Retail)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$skuFlag_and = this.getSkuFlag_and();
        Boolean other$skuFlag_and = other.getSkuFlag_and();
        if (this$skuFlag_and == null ? other$skuFlag_and != null : !((Object)this$skuFlag_and).equals(other$skuFlag_and)) {
            return false;
        }
        Boolean this$isMaterial = this.getIsMaterial();
        Boolean other$isMaterial = other.getIsMaterial();
        if (this$isMaterial == null ? other$isMaterial != null : !((Object)this$isMaterial).equals(other$isMaterial)) {
            return false;
        }
        Boolean this$distinct = this.getDistinct();
        Boolean other$distinct = other.getDistinct();
        if (this$distinct == null ? other$distinct != null : !((Object)this$distinct).equals(other$distinct)) {
            return false;
        }
        Boolean this$needCount = this.getNeedCount();
        Boolean other$needCount = other.getNeedCount();
        if (this$needCount == null ? other$needCount != null : !((Object)this$needCount).equals(other$needCount)) {
            return false;
        }
        QryFieldDTO this$skuIds_and = this.getSkuIds_and();
        QryFieldDTO other$skuIds_and = other.getSkuIds_and();
        if (this$skuIds_and == null ? other$skuIds_and != null : !((Object)this$skuIds_and).equals(other$skuIds_and)) {
            return false;
        }
        QryFieldDTO this$skuCode_and = this.getSkuCode_and();
        QryFieldDTO other$skuCode_and = other.getSkuCode_and();
        if (this$skuCode_and == null ? other$skuCode_and != null : !((Object)this$skuCode_and).equals(other$skuCode_and)) {
            return false;
        }
        List<QryFieldDTO> this$productPropCharacter_or = this.getProductPropCharacter_or();
        List<QryFieldDTO> other$productPropCharacter_or = other.getProductPropCharacter_or();
        if (this$productPropCharacter_or == null ? other$productPropCharacter_or != null : !((Object)this$productPropCharacter_or).equals(other$productPropCharacter_or)) {
            return false;
        }
        List<QryFieldDTO> this$skuFreeCharacter_or = this.getSkuFreeCharacter_or();
        List<QryFieldDTO> other$skuFreeCharacter_or = other.getSkuFreeCharacter_or();
        if (this$skuFreeCharacter_or == null ? other$skuFreeCharacter_or != null : !((Object)this$skuFreeCharacter_or).equals(other$skuFreeCharacter_or)) {
            return false;
        }
        QryFieldDTO this$skuSpecs_or = this.getSkuSpecs_or();
        QryFieldDTO other$skuSpecs_or = other.getSkuSpecs_or();
        if (this$skuSpecs_or == null ? other$skuSpecs_or != null : !((Object)this$skuSpecs_or).equals(other$skuSpecs_or)) {
            return false;
        }
        QryFieldDTO this$materialName_or = this.getMaterialName_or();
        QryFieldDTO other$materialName_or = other.getMaterialName_or();
        if (this$materialName_or == null ? other$materialName_or != null : !((Object)this$materialName_or).equals(other$materialName_or)) {
            return false;
        }
        QryFieldDTO this$materialCode_or = this.getMaterialCode_or();
        QryFieldDTO other$materialCode_or = other.getMaterialCode_or();
        if (this$materialCode_or == null ? other$materialCode_or != null : !((Object)this$materialCode_or).equals(other$materialCode_or)) {
            return false;
        }
        QryFieldDTO this$barCode_or = this.getBarCode_or();
        QryFieldDTO other$barCode_or = other.getBarCode_or();
        if (this$barCode_or == null ? other$barCode_or != null : !((Object)this$barCode_or).equals(other$barCode_or)) {
            return false;
        }
        QryFieldDTO this$modelDescription_or = this.getModelDescription_or();
        QryFieldDTO other$modelDescription_or = other.getModelDescription_or();
        if (this$modelDescription_or == null ? other$modelDescription_or != null : !((Object)this$modelDescription_or).equals(other$modelDescription_or)) {
            return false;
        }
        QryFieldDTO this$model_or = this.getModel_or();
        QryFieldDTO other$model_or = other.getModel_or();
        if (this$model_or == null ? other$model_or != null : !((Object)this$model_or).equals(other$model_or)) {
            return false;
        }
        QryFieldDTO this$skuCode_or = this.getSkuCode_or();
        QryFieldDTO other$skuCode_or = other.getSkuCode_or();
        if (this$skuCode_or == null ? other$skuCode_or != null : !((Object)this$skuCode_or).equals(other$skuCode_or)) {
            return false;
        }
        QryFieldDTO this$skuName_or = this.getSkuName_or();
        QryFieldDTO other$skuName_or = other.getSkuName_or();
        if (this$skuName_or == null ? other$skuName_or != null : !((Object)this$skuName_or).equals(other$skuName_or)) {
            return false;
        }
        QryFieldDTO this$skuBarCode_or = this.getSkuBarCode_or();
        QryFieldDTO other$skuBarCode_or = other.getSkuBarCode_or();
        if (this$skuBarCode_or == null ? other$skuBarCode_or != null : !((Object)this$skuBarCode_or).equals(other$skuBarCode_or)) {
            return false;
        }
        QryFieldDTO this$mnemonicCode_or = this.getMnemonicCode_or();
        QryFieldDTO other$mnemonicCode_or = other.getMnemonicCode_or();
        if (this$mnemonicCode_or == null ? other$mnemonicCode_or != null : !((Object)this$mnemonicCode_or).equals(other$mnemonicCode_or)) {
            return false;
        }
        QryFieldDTO this$brandName_or = this.getBrandName_or();
        QryFieldDTO other$brandName_or = other.getBrandName_or();
        if (this$brandName_or == null ? other$brandName_or != null : !((Object)this$brandName_or).equals(other$brandName_or)) {
            return false;
        }
        QryFieldDTO this$skuIds_or = this.getSkuIds_or();
        QryFieldDTO other$skuIds_or = other.getSkuIds_or();
        if (this$skuIds_or == null ? other$skuIds_or != null : !((Object)this$skuIds_or).equals(other$skuIds_or)) {
            return false;
        }
        QryFieldDTO this$materialIds_or = this.getMaterialIds_or();
        QryFieldDTO other$materialIds_or = other.getMaterialIds_or();
        if (this$materialIds_or == null ? other$materialIds_or != null : !((Object)this$materialIds_or).equals(other$materialIds_or)) {
            return false;
        }
        QryFieldDTO this$erpCode_or = this.getErpCode_or();
        QryFieldDTO other$erpCode_or = other.getErpCode_or();
        if (this$erpCode_or == null ? other$erpCode_or != null : !((Object)this$erpCode_or).equals(other$erpCode_or)) {
            return false;
        }
        QryFieldDTO this$skuStopStatus_and = this.getSkuStopStatus_and();
        QryFieldDTO other$skuStopStatus_and = other.getSkuStopStatus_and();
        if (this$skuStopStatus_and == null ? other$skuStopStatus_and != null : !((Object)this$skuStopStatus_and).equals(other$skuStopStatus_and)) {
            return false;
        }
        QryFieldDTO this$productClass_fullPath_and = this.getProductClass_fullPath_and();
        QryFieldDTO other$productClass_fullPath_and = other.getProductClass_fullPath_and();
        if (this$productClass_fullPath_and == null ? other$productClass_fullPath_and != null : !((Object)this$productClass_fullPath_and).equals(other$productClass_fullPath_and)) {
            return false;
        }
        QryFieldDTO this$productClass_fullPath_or = this.getProductClass_fullPath_or();
        QryFieldDTO other$productClass_fullPath_or = other.getProductClass_fullPath_or();
        if (this$productClass_fullPath_or == null ? other$productClass_fullPath_or != null : !((Object)this$productClass_fullPath_or).equals(other$productClass_fullPath_or)) {
            return false;
        }
        LinkedHashSet<String> this$ascField = this.getAscField();
        LinkedHashSet<String> other$ascField = other.getAscField();
        if (this$ascField == null ? other$ascField != null : !((Object)this$ascField).equals(other$ascField)) {
            return false;
        }
        LinkedHashSet<String> this$descField = this.getDescField();
        LinkedHashSet<String> other$descField = other.getDescField();
        return !(this$descField == null ? other$descField != null : !((Object)this$descField).equals(other$descField));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof SkuQryRpcDTO4Retail;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $skuFlag_and = this.getSkuFlag_and();
        result = result * 59 + ($skuFlag_and == null ? 43 : ((Object)$skuFlag_and).hashCode());
        Boolean $isMaterial = this.getIsMaterial();
        result = result * 59 + ($isMaterial == null ? 43 : ((Object)$isMaterial).hashCode());
        Boolean $distinct = this.getDistinct();
        result = result * 59 + ($distinct == null ? 43 : ((Object)$distinct).hashCode());
        Boolean $needCount = this.getNeedCount();
        result = result * 59 + ($needCount == null ? 43 : ((Object)$needCount).hashCode());
        QryFieldDTO $skuIds_and = this.getSkuIds_and();
        result = result * 59 + ($skuIds_and == null ? 43 : ((Object)$skuIds_and).hashCode());
        QryFieldDTO $skuCode_and = this.getSkuCode_and();
        result = result * 59 + ($skuCode_and == null ? 43 : ((Object)$skuCode_and).hashCode());
        List<QryFieldDTO> $productPropCharacter_or = this.getProductPropCharacter_or();
        result = result * 59 + ($productPropCharacter_or == null ? 43 : ((Object)$productPropCharacter_or).hashCode());
        List<QryFieldDTO> $skuFreeCharacter_or = this.getSkuFreeCharacter_or();
        result = result * 59 + ($skuFreeCharacter_or == null ? 43 : ((Object)$skuFreeCharacter_or).hashCode());
        QryFieldDTO $skuSpecs_or = this.getSkuSpecs_or();
        result = result * 59 + ($skuSpecs_or == null ? 43 : ((Object)$skuSpecs_or).hashCode());
        QryFieldDTO $materialName_or = this.getMaterialName_or();
        result = result * 59 + ($materialName_or == null ? 43 : ((Object)$materialName_or).hashCode());
        QryFieldDTO $materialCode_or = this.getMaterialCode_or();
        result = result * 59 + ($materialCode_or == null ? 43 : ((Object)$materialCode_or).hashCode());
        QryFieldDTO $barCode_or = this.getBarCode_or();
        result = result * 59 + ($barCode_or == null ? 43 : ((Object)$barCode_or).hashCode());
        QryFieldDTO $modelDescription_or = this.getModelDescription_or();
        result = result * 59 + ($modelDescription_or == null ? 43 : ((Object)$modelDescription_or).hashCode());
        QryFieldDTO $model_or = this.getModel_or();
        result = result * 59 + ($model_or == null ? 43 : ((Object)$model_or).hashCode());
        QryFieldDTO $skuCode_or = this.getSkuCode_or();
        result = result * 59 + ($skuCode_or == null ? 43 : ((Object)$skuCode_or).hashCode());
        QryFieldDTO $skuName_or = this.getSkuName_or();
        result = result * 59 + ($skuName_or == null ? 43 : ((Object)$skuName_or).hashCode());
        QryFieldDTO $skuBarCode_or = this.getSkuBarCode_or();
        result = result * 59 + ($skuBarCode_or == null ? 43 : ((Object)$skuBarCode_or).hashCode());
        QryFieldDTO $mnemonicCode_or = this.getMnemonicCode_or();
        result = result * 59 + ($mnemonicCode_or == null ? 43 : ((Object)$mnemonicCode_or).hashCode());
        QryFieldDTO $brandName_or = this.getBrandName_or();
        result = result * 59 + ($brandName_or == null ? 43 : ((Object)$brandName_or).hashCode());
        QryFieldDTO $skuIds_or = this.getSkuIds_or();
        result = result * 59 + ($skuIds_or == null ? 43 : ((Object)$skuIds_or).hashCode());
        QryFieldDTO $materialIds_or = this.getMaterialIds_or();
        result = result * 59 + ($materialIds_or == null ? 43 : ((Object)$materialIds_or).hashCode());
        QryFieldDTO $erpCode_or = this.getErpCode_or();
        result = result * 59 + ($erpCode_or == null ? 43 : ((Object)$erpCode_or).hashCode());
        QryFieldDTO $skuStopStatus_and = this.getSkuStopStatus_and();
        result = result * 59 + ($skuStopStatus_and == null ? 43 : ((Object)$skuStopStatus_and).hashCode());
        QryFieldDTO $productClass_fullPath_and = this.getProductClass_fullPath_and();
        result = result * 59 + ($productClass_fullPath_and == null ? 43 : ((Object)$productClass_fullPath_and).hashCode());
        QryFieldDTO $productClass_fullPath_or = this.getProductClass_fullPath_or();
        result = result * 59 + ($productClass_fullPath_or == null ? 43 : ((Object)$productClass_fullPath_or).hashCode());
        LinkedHashSet<String> $ascField = this.getAscField();
        result = result * 59 + ($ascField == null ? 43 : ((Object)$ascField).hashCode());
        LinkedHashSet<String> $descField = this.getDescField();
        result = result * 59 + ($descField == null ? 43 : ((Object)$descField).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "SkuQryRpcDTO4Retail(skuIds_and=" + this.getSkuIds_and() + ", skuFlag_and=" + this.getSkuFlag_and() + ", skuCode_and=" + this.getSkuCode_and() + ", productPropCharacter_or=" + this.getProductPropCharacter_or() + ", skuFreeCharacter_or=" + this.getSkuFreeCharacter_or() + ", skuSpecs_or=" + this.getSkuSpecs_or() + ", materialName_or=" + this.getMaterialName_or() + ", materialCode_or=" + this.getMaterialCode_or() + ", barCode_or=" + this.getBarCode_or() + ", modelDescription_or=" + this.getModelDescription_or() + ", model_or=" + this.getModel_or() + ", skuCode_or=" + this.getSkuCode_or() + ", skuName_or=" + this.getSkuName_or() + ", skuBarCode_or=" + this.getSkuBarCode_or() + ", mnemonicCode_or=" + this.getMnemonicCode_or() + ", brandName_or=" + this.getBrandName_or() + ", skuIds_or=" + this.getSkuIds_or() + ", materialIds_or=" + this.getMaterialIds_or() + ", erpCode_or=" + this.getErpCode_or() + ", isMaterial=" + this.getIsMaterial() + ", skuStopStatus_and=" + this.getSkuStopStatus_and() + ", distinct=" + this.getDistinct() + ", productClass_fullPath_and=" + this.getProductClass_fullPath_and() + ", productClass_fullPath_or=" + this.getProductClass_fullPath_or() + ", ascField=" + this.getAscField() + ", descField=" + this.getDescField() + ", needCount=" + this.getNeedCount() + ")";
    }
}

