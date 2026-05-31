/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.vo.ProductSKUDetailSaveVO;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductSKUSaveVO {
    private ProductSKUDetailSaveVO productSkuDetailNew;
    private String productId_code;
    private String productId_productTemplate_name;
    private String specs;
    private String skuDefines;
    private String name;
    private String code;
    private String modelDescription;
    private String model;
    private String weight;
    private String volume;
    private String batchUnit_Name;
    private String batchRate;

    public ProductSKUDetailSaveVO getProductSkuDetailNew() {
        return this.productSkuDetailNew;
    }

    public String getProductId_code() {
        return this.productId_code;
    }

    public void setProductId_code(String productId_code) {
        this.productId_code = productId_code;
    }

    public String getProductId_productTemplate_name() {
        return this.productId_productTemplate_name;
    }

    public void setProductId_productTemplate_name(String productId_productTemplate_name) {
        this.productId_productTemplate_name = productId_productTemplate_name;
    }

    public String getSpecs() {
        return this.specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getSkuDefines() {
        return this.skuDefines;
    }

    public void setSkuDefines(String skuDefines) {
        this.skuDefines = skuDefines;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getModelDescription() {
        return this.modelDescription;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWeight() {
        return this.weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getVolume() {
        return this.volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getBatchUnit_Name() {
        return this.batchUnit_Name;
    }

    public void setBatchUnit_Name(String batchUnit_Name) {
        this.batchUnit_Name = batchUnit_Name;
    }

    public String getBatchRate() {
        return this.batchRate;
    }

    public void setBatchRate(String batchRate) {
        this.batchRate = batchRate;
    }

    public void setProductSkuDetailNew(ProductSKUDetailSaveVO productSkuDetailNew) {
        this.productSkuDetailNew = productSkuDetailNew;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductSKUSaveVO)) {
            return false;
        }
        ProductSKUSaveVO other = (ProductSKUSaveVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        ProductSKUDetailSaveVO this$productSkuDetailNew = this.getProductSkuDetailNew();
        ProductSKUDetailSaveVO other$productSkuDetailNew = other.getProductSkuDetailNew();
        if (this$productSkuDetailNew == null ? other$productSkuDetailNew != null : !((Object)this$productSkuDetailNew).equals(other$productSkuDetailNew)) {
            return false;
        }
        String this$productId_code = this.getProductId_code();
        String other$productId_code = other.getProductId_code();
        if (this$productId_code == null ? other$productId_code != null : !this$productId_code.equals(other$productId_code)) {
            return false;
        }
        String this$productId_productTemplate_name = this.getProductId_productTemplate_name();
        String other$productId_productTemplate_name = other.getProductId_productTemplate_name();
        if (this$productId_productTemplate_name == null ? other$productId_productTemplate_name != null : !this$productId_productTemplate_name.equals(other$productId_productTemplate_name)) {
            return false;
        }
        String this$specs = this.getSpecs();
        String other$specs = other.getSpecs();
        if (this$specs == null ? other$specs != null : !this$specs.equals(other$specs)) {
            return false;
        }
        String this$skuDefines = this.getSkuDefines();
        String other$skuDefines = other.getSkuDefines();
        if (this$skuDefines == null ? other$skuDefines != null : !this$skuDefines.equals(other$skuDefines)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$modelDescription = this.getModelDescription();
        String other$modelDescription = other.getModelDescription();
        if (this$modelDescription == null ? other$modelDescription != null : !this$modelDescription.equals(other$modelDescription)) {
            return false;
        }
        String this$model = this.getModel();
        String other$model = other.getModel();
        if (this$model == null ? other$model != null : !this$model.equals(other$model)) {
            return false;
        }
        String this$weight = this.getWeight();
        String other$weight = other.getWeight();
        if (this$weight == null ? other$weight != null : !this$weight.equals(other$weight)) {
            return false;
        }
        String this$volume = this.getVolume();
        String other$volume = other.getVolume();
        if (this$volume == null ? other$volume != null : !this$volume.equals(other$volume)) {
            return false;
        }
        String this$batchUnit_Name = this.getBatchUnit_Name();
        String other$batchUnit_Name = other.getBatchUnit_Name();
        if (this$batchUnit_Name == null ? other$batchUnit_Name != null : !this$batchUnit_Name.equals(other$batchUnit_Name)) {
            return false;
        }
        String this$batchRate = this.getBatchRate();
        String other$batchRate = other.getBatchRate();
        return !(this$batchRate == null ? other$batchRate != null : !this$batchRate.equals(other$batchRate));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductSKUSaveVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        ProductSKUDetailSaveVO $productSkuDetailNew = this.getProductSkuDetailNew();
        result = result * 59 + ($productSkuDetailNew == null ? 43 : ((Object)$productSkuDetailNew).hashCode());
        String $productId_code = this.getProductId_code();
        result = result * 59 + ($productId_code == null ? 43 : $productId_code.hashCode());
        String $productId_productTemplate_name = this.getProductId_productTemplate_name();
        result = result * 59 + ($productId_productTemplate_name == null ? 43 : $productId_productTemplate_name.hashCode());
        String $specs = this.getSpecs();
        result = result * 59 + ($specs == null ? 43 : $specs.hashCode());
        String $skuDefines = this.getSkuDefines();
        result = result * 59 + ($skuDefines == null ? 43 : $skuDefines.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $modelDescription = this.getModelDescription();
        result = result * 59 + ($modelDescription == null ? 43 : $modelDescription.hashCode());
        String $model = this.getModel();
        result = result * 59 + ($model == null ? 43 : $model.hashCode());
        String $weight = this.getWeight();
        result = result * 59 + ($weight == null ? 43 : $weight.hashCode());
        String $volume = this.getVolume();
        result = result * 59 + ($volume == null ? 43 : $volume.hashCode());
        String $batchUnit_Name = this.getBatchUnit_Name();
        result = result * 59 + ($batchUnit_Name == null ? 43 : $batchUnit_Name.hashCode());
        String $batchRate = this.getBatchRate();
        result = result * 59 + ($batchRate == null ? 43 : $batchRate.hashCode());
        return result;
    }

    public String toString() {
        return "ProductSKUSaveVO(productSkuDetailNew=" + this.getProductSkuDetailNew() + ", productId_code=" + this.getProductId_code() + ", productId_productTemplate_name=" + this.getProductId_productTemplate_name() + ", specs=" + this.getSpecs() + ", skuDefines=" + this.getSkuDefines() + ", name=" + this.getName() + ", code=" + this.getCode() + ", modelDescription=" + this.getModelDescription() + ", model=" + this.getModel() + ", weight=" + this.getWeight() + ", volume=" + this.getVolume() + ", batchUnit_Name=" + this.getBatchUnit_Name() + ", batchRate=" + this.getBatchRate() + ")";
    }
}

