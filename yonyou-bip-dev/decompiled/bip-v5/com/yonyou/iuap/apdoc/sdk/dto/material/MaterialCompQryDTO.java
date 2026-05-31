/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.apdoc.sdk.dto.material;

import com.yonyou.iuap.apdoc.sdk.dto.material.MaterialQryRpcDTO4Retail;
import com.yonyou.iuap.apdoc.sdk.dto.pub.QryFieldDTO;
import java.util.List;

public class MaterialCompQryDTO
extends MaterialQryRpcDTO4Retail {
    private QryFieldDTO materialName_or;
    private QryFieldDTO materialCode_or;
    private QryFieldDTO barCode_or;
    private QryFieldDTO modelDescription_or;
    private QryFieldDTO model_or;
    private QryFieldDTO skuCode_or;
    private QryFieldDTO skuName_or;
    private QryFieldDTO mnemonicCode_or;
    private QryFieldDTO skuBarCode_or;
    private QryFieldDTO brandName_or;
    private QryFieldDTO erpCode_or;
    private List<QryFieldDTO> productPropCharacter_or;
    private QryFieldDTO productTemplate_and;

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

    public QryFieldDTO getMnemonicCode_or() {
        return this.mnemonicCode_or;
    }

    public QryFieldDTO getSkuBarCode_or() {
        return this.skuBarCode_or;
    }

    public QryFieldDTO getBrandName_or() {
        return this.brandName_or;
    }

    public QryFieldDTO getErpCode_or() {
        return this.erpCode_or;
    }

    public List<QryFieldDTO> getProductPropCharacter_or() {
        return this.productPropCharacter_or;
    }

    public QryFieldDTO getProductTemplate_and() {
        return this.productTemplate_and;
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

    public void setMnemonicCode_or(QryFieldDTO mnemonicCode_or) {
        this.mnemonicCode_or = mnemonicCode_or;
    }

    public void setSkuBarCode_or(QryFieldDTO skuBarCode_or) {
        this.skuBarCode_or = skuBarCode_or;
    }

    public void setBrandName_or(QryFieldDTO brandName_or) {
        this.brandName_or = brandName_or;
    }

    public void setErpCode_or(QryFieldDTO erpCode_or) {
        this.erpCode_or = erpCode_or;
    }

    public void setProductPropCharacter_or(List<QryFieldDTO> productPropCharacter_or) {
        this.productPropCharacter_or = productPropCharacter_or;
    }

    public void setProductTemplate_and(QryFieldDTO productTemplate_and) {
        this.productTemplate_and = productTemplate_and;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MaterialCompQryDTO)) {
            return false;
        }
        MaterialCompQryDTO other = (MaterialCompQryDTO)o;
        if (!other.canEqual(this)) {
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
        QryFieldDTO this$mnemonicCode_or = this.getMnemonicCode_or();
        QryFieldDTO other$mnemonicCode_or = other.getMnemonicCode_or();
        if (this$mnemonicCode_or == null ? other$mnemonicCode_or != null : !((Object)this$mnemonicCode_or).equals(other$mnemonicCode_or)) {
            return false;
        }
        QryFieldDTO this$skuBarCode_or = this.getSkuBarCode_or();
        QryFieldDTO other$skuBarCode_or = other.getSkuBarCode_or();
        if (this$skuBarCode_or == null ? other$skuBarCode_or != null : !((Object)this$skuBarCode_or).equals(other$skuBarCode_or)) {
            return false;
        }
        QryFieldDTO this$brandName_or = this.getBrandName_or();
        QryFieldDTO other$brandName_or = other.getBrandName_or();
        if (this$brandName_or == null ? other$brandName_or != null : !((Object)this$brandName_or).equals(other$brandName_or)) {
            return false;
        }
        QryFieldDTO this$erpCode_or = this.getErpCode_or();
        QryFieldDTO other$erpCode_or = other.getErpCode_or();
        if (this$erpCode_or == null ? other$erpCode_or != null : !((Object)this$erpCode_or).equals(other$erpCode_or)) {
            return false;
        }
        List<QryFieldDTO> this$productPropCharacter_or = this.getProductPropCharacter_or();
        List<QryFieldDTO> other$productPropCharacter_or = other.getProductPropCharacter_or();
        if (this$productPropCharacter_or == null ? other$productPropCharacter_or != null : !((Object)this$productPropCharacter_or).equals(other$productPropCharacter_or)) {
            return false;
        }
        QryFieldDTO this$productTemplate_and = this.getProductTemplate_and();
        QryFieldDTO other$productTemplate_and = other.getProductTemplate_and();
        return !(this$productTemplate_and == null ? other$productTemplate_and != null : !((Object)this$productTemplate_and).equals(other$productTemplate_and));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof MaterialCompQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
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
        QryFieldDTO $mnemonicCode_or = this.getMnemonicCode_or();
        result = result * 59 + ($mnemonicCode_or == null ? 43 : ((Object)$mnemonicCode_or).hashCode());
        QryFieldDTO $skuBarCode_or = this.getSkuBarCode_or();
        result = result * 59 + ($skuBarCode_or == null ? 43 : ((Object)$skuBarCode_or).hashCode());
        QryFieldDTO $brandName_or = this.getBrandName_or();
        result = result * 59 + ($brandName_or == null ? 43 : ((Object)$brandName_or).hashCode());
        QryFieldDTO $erpCode_or = this.getErpCode_or();
        result = result * 59 + ($erpCode_or == null ? 43 : ((Object)$erpCode_or).hashCode());
        List<QryFieldDTO> $productPropCharacter_or = this.getProductPropCharacter_or();
        result = result * 59 + ($productPropCharacter_or == null ? 43 : ((Object)$productPropCharacter_or).hashCode());
        QryFieldDTO $productTemplate_and = this.getProductTemplate_and();
        result = result * 59 + ($productTemplate_and == null ? 43 : ((Object)$productTemplate_and).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MaterialCompQryDTO(materialName_or=" + this.getMaterialName_or() + ", materialCode_or=" + this.getMaterialCode_or() + ", barCode_or=" + this.getBarCode_or() + ", modelDescription_or=" + this.getModelDescription_or() + ", model_or=" + this.getModel_or() + ", skuCode_or=" + this.getSkuCode_or() + ", skuName_or=" + this.getSkuName_or() + ", mnemonicCode_or=" + this.getMnemonicCode_or() + ", skuBarCode_or=" + this.getSkuBarCode_or() + ", brandName_or=" + this.getBrandName_or() + ", erpCode_or=" + this.getErpCode_or() + ", productPropCharacter_or=" + this.getProductPropCharacter_or() + ", productTemplate_and=" + this.getProductTemplate_and() + ")";
    }
}

