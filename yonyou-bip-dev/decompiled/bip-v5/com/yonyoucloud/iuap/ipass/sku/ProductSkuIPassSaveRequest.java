/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.sku;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.ipass.sku.ProductSkuDetailIPass;
import java.io.Serializable;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductSkuIPassSaveRequest
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String productCode;
    private String name;
    private String code;
    private String modelDescription;
    private String model;
    private String weight;
    private String volume;
    private String batchUnitCode;
    private Long batchRate;
    private ProductSkuDetailIPass productSkuDetailNew;
    private Map<String, Object> productSkuCharacterDef;
    private Map<String, Object> skuPropCharacter;
    private Map<String, Object> skuFreeCharacter;
    private String sourceUnique;

    public String getProductCode() {
        return this.productCode;
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public String getModelDescription() {
        return this.modelDescription;
    }

    public String getModel() {
        return this.model;
    }

    public String getWeight() {
        return this.weight;
    }

    public String getVolume() {
        return this.volume;
    }

    public String getBatchUnitCode() {
        return this.batchUnitCode;
    }

    public Long getBatchRate() {
        return this.batchRate;
    }

    public ProductSkuDetailIPass getProductSkuDetailNew() {
        return this.productSkuDetailNew;
    }

    public Map<String, Object> getProductSkuCharacterDef() {
        return this.productSkuCharacterDef;
    }

    public Map<String, Object> getSkuPropCharacter() {
        return this.skuPropCharacter;
    }

    public Map<String, Object> getSkuFreeCharacter() {
        return this.skuFreeCharacter;
    }

    public String getSourceUnique() {
        return this.sourceUnique;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setBatchUnitCode(String batchUnitCode) {
        this.batchUnitCode = batchUnitCode;
    }

    public void setBatchRate(Long batchRate) {
        this.batchRate = batchRate;
    }

    public void setProductSkuDetailNew(ProductSkuDetailIPass productSkuDetailNew) {
        this.productSkuDetailNew = productSkuDetailNew;
    }

    public void setProductSkuCharacterDef(Map<String, Object> productSkuCharacterDef) {
        this.productSkuCharacterDef = productSkuCharacterDef;
    }

    public void setSkuPropCharacter(Map<String, Object> skuPropCharacter) {
        this.skuPropCharacter = skuPropCharacter;
    }

    public void setSkuFreeCharacter(Map<String, Object> skuFreeCharacter) {
        this.skuFreeCharacter = skuFreeCharacter;
    }

    public void setSourceUnique(String sourceUnique) {
        this.sourceUnique = sourceUnique;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductSkuIPassSaveRequest)) {
            return false;
        }
        ProductSkuIPassSaveRequest other = (ProductSkuIPassSaveRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$batchRate = this.getBatchRate();
        Long other$batchRate = other.getBatchRate();
        if (this$batchRate == null ? other$batchRate != null : !((Object)this$batchRate).equals(other$batchRate)) {
            return false;
        }
        String this$productCode = this.getProductCode();
        String other$productCode = other.getProductCode();
        if (this$productCode == null ? other$productCode != null : !this$productCode.equals(other$productCode)) {
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
        String this$batchUnitCode = this.getBatchUnitCode();
        String other$batchUnitCode = other.getBatchUnitCode();
        if (this$batchUnitCode == null ? other$batchUnitCode != null : !this$batchUnitCode.equals(other$batchUnitCode)) {
            return false;
        }
        ProductSkuDetailIPass this$productSkuDetailNew = this.getProductSkuDetailNew();
        ProductSkuDetailIPass other$productSkuDetailNew = other.getProductSkuDetailNew();
        if (this$productSkuDetailNew == null ? other$productSkuDetailNew != null : !((Object)this$productSkuDetailNew).equals(other$productSkuDetailNew)) {
            return false;
        }
        Map<String, Object> this$productSkuCharacterDef = this.getProductSkuCharacterDef();
        Map<String, Object> other$productSkuCharacterDef = other.getProductSkuCharacterDef();
        if (this$productSkuCharacterDef == null ? other$productSkuCharacterDef != null : !((Object)this$productSkuCharacterDef).equals(other$productSkuCharacterDef)) {
            return false;
        }
        Map<String, Object> this$skuPropCharacter = this.getSkuPropCharacter();
        Map<String, Object> other$skuPropCharacter = other.getSkuPropCharacter();
        if (this$skuPropCharacter == null ? other$skuPropCharacter != null : !((Object)this$skuPropCharacter).equals(other$skuPropCharacter)) {
            return false;
        }
        Map<String, Object> this$skuFreeCharacter = this.getSkuFreeCharacter();
        Map<String, Object> other$skuFreeCharacter = other.getSkuFreeCharacter();
        if (this$skuFreeCharacter == null ? other$skuFreeCharacter != null : !((Object)this$skuFreeCharacter).equals(other$skuFreeCharacter)) {
            return false;
        }
        String this$sourceUnique = this.getSourceUnique();
        String other$sourceUnique = other.getSourceUnique();
        return !(this$sourceUnique == null ? other$sourceUnique != null : !this$sourceUnique.equals(other$sourceUnique));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductSkuIPassSaveRequest;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $batchRate = this.getBatchRate();
        result = result * 59 + ($batchRate == null ? 43 : ((Object)$batchRate).hashCode());
        String $productCode = this.getProductCode();
        result = result * 59 + ($productCode == null ? 43 : $productCode.hashCode());
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
        String $batchUnitCode = this.getBatchUnitCode();
        result = result * 59 + ($batchUnitCode == null ? 43 : $batchUnitCode.hashCode());
        ProductSkuDetailIPass $productSkuDetailNew = this.getProductSkuDetailNew();
        result = result * 59 + ($productSkuDetailNew == null ? 43 : ((Object)$productSkuDetailNew).hashCode());
        Map<String, Object> $productSkuCharacterDef = this.getProductSkuCharacterDef();
        result = result * 59 + ($productSkuCharacterDef == null ? 43 : ((Object)$productSkuCharacterDef).hashCode());
        Map<String, Object> $skuPropCharacter = this.getSkuPropCharacter();
        result = result * 59 + ($skuPropCharacter == null ? 43 : ((Object)$skuPropCharacter).hashCode());
        Map<String, Object> $skuFreeCharacter = this.getSkuFreeCharacter();
        result = result * 59 + ($skuFreeCharacter == null ? 43 : ((Object)$skuFreeCharacter).hashCode());
        String $sourceUnique = this.getSourceUnique();
        result = result * 59 + ($sourceUnique == null ? 43 : $sourceUnique.hashCode());
        return result;
    }

    public String toString() {
        return "ProductSkuIPassSaveRequest(productCode=" + this.getProductCode() + ", name=" + this.getName() + ", code=" + this.getCode() + ", modelDescription=" + this.getModelDescription() + ", model=" + this.getModel() + ", weight=" + this.getWeight() + ", volume=" + this.getVolume() + ", batchUnitCode=" + this.getBatchUnitCode() + ", batchRate=" + this.getBatchRate() + ", productSkuDetailNew=" + this.getProductSkuDetailNew() + ", productSkuCharacterDef=" + this.getProductSkuCharacterDef() + ", skuPropCharacter=" + this.getSkuPropCharacter() + ", skuFreeCharacter=" + this.getSkuFreeCharacter() + ", sourceUnique=" + this.getSourceUnique() + ")";
    }
}

