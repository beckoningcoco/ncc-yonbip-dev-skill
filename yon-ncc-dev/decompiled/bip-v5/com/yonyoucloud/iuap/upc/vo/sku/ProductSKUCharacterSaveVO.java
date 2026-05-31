/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo.sku;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.vo.sku.ProductSKUDetailCharacterSaveVO;
import java.math.BigDecimal;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductSKUCharacterSaveVO {
    private ProductSKUDetailCharacterSaveVO productSkuDetailNew;
    private Long id;
    private String productCode;
    private String name;
    private String code;
    private String modelDescription;
    private String model;
    private BigDecimal weight;
    private BigDecimal volume;
    private String batchUnitCode;
    private String batchRate;
    private String orgCodeForUpdate;
    private Map skuFreeCharacter;
    private Map skuPropCharacter;
    private Map productSkuCharacterDef;
    private String erpCode;

    public ProductSKUDetailCharacterSaveVO getProductSkuDetailNew() {
        return this.productSkuDetailNew;
    }

    public Long getId() {
        return this.id;
    }

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

    public BigDecimal getWeight() {
        return this.weight;
    }

    public BigDecimal getVolume() {
        return this.volume;
    }

    public String getBatchUnitCode() {
        return this.batchUnitCode;
    }

    public String getBatchRate() {
        return this.batchRate;
    }

    public String getOrgCodeForUpdate() {
        return this.orgCodeForUpdate;
    }

    public Map getSkuFreeCharacter() {
        return this.skuFreeCharacter;
    }

    public Map getSkuPropCharacter() {
        return this.skuPropCharacter;
    }

    public Map getProductSkuCharacterDef() {
        return this.productSkuCharacterDef;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public void setProductSkuDetailNew(ProductSKUDetailCharacterSaveVO productSkuDetailNew) {
        this.productSkuDetailNew = productSkuDetailNew;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public void setBatchUnitCode(String batchUnitCode) {
        this.batchUnitCode = batchUnitCode;
    }

    public void setBatchRate(String batchRate) {
        this.batchRate = batchRate;
    }

    public void setOrgCodeForUpdate(String orgCodeForUpdate) {
        this.orgCodeForUpdate = orgCodeForUpdate;
    }

    public void setSkuFreeCharacter(Map skuFreeCharacter) {
        this.skuFreeCharacter = skuFreeCharacter;
    }

    public void setSkuPropCharacter(Map skuPropCharacter) {
        this.skuPropCharacter = skuPropCharacter;
    }

    public void setProductSkuCharacterDef(Map productSkuCharacterDef) {
        this.productSkuCharacterDef = productSkuCharacterDef;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductSKUCharacterSaveVO)) {
            return false;
        }
        ProductSKUCharacterSaveVO other = (ProductSKUCharacterSaveVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        ProductSKUDetailCharacterSaveVO this$productSkuDetailNew = this.getProductSkuDetailNew();
        ProductSKUDetailCharacterSaveVO other$productSkuDetailNew = other.getProductSkuDetailNew();
        if (this$productSkuDetailNew == null ? other$productSkuDetailNew != null : !((Object)this$productSkuDetailNew).equals(other$productSkuDetailNew)) {
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
        BigDecimal this$weight = this.getWeight();
        BigDecimal other$weight = other.getWeight();
        if (this$weight == null ? other$weight != null : !((Object)this$weight).equals(other$weight)) {
            return false;
        }
        BigDecimal this$volume = this.getVolume();
        BigDecimal other$volume = other.getVolume();
        if (this$volume == null ? other$volume != null : !((Object)this$volume).equals(other$volume)) {
            return false;
        }
        String this$batchUnitCode = this.getBatchUnitCode();
        String other$batchUnitCode = other.getBatchUnitCode();
        if (this$batchUnitCode == null ? other$batchUnitCode != null : !this$batchUnitCode.equals(other$batchUnitCode)) {
            return false;
        }
        String this$batchRate = this.getBatchRate();
        String other$batchRate = other.getBatchRate();
        if (this$batchRate == null ? other$batchRate != null : !this$batchRate.equals(other$batchRate)) {
            return false;
        }
        String this$orgCodeForUpdate = this.getOrgCodeForUpdate();
        String other$orgCodeForUpdate = other.getOrgCodeForUpdate();
        if (this$orgCodeForUpdate == null ? other$orgCodeForUpdate != null : !this$orgCodeForUpdate.equals(other$orgCodeForUpdate)) {
            return false;
        }
        Map this$skuFreeCharacter = this.getSkuFreeCharacter();
        Map other$skuFreeCharacter = other.getSkuFreeCharacter();
        if (this$skuFreeCharacter == null ? other$skuFreeCharacter != null : !((Object)this$skuFreeCharacter).equals(other$skuFreeCharacter)) {
            return false;
        }
        Map this$skuPropCharacter = this.getSkuPropCharacter();
        Map other$skuPropCharacter = other.getSkuPropCharacter();
        if (this$skuPropCharacter == null ? other$skuPropCharacter != null : !((Object)this$skuPropCharacter).equals(other$skuPropCharacter)) {
            return false;
        }
        Map this$productSkuCharacterDef = this.getProductSkuCharacterDef();
        Map other$productSkuCharacterDef = other.getProductSkuCharacterDef();
        if (this$productSkuCharacterDef == null ? other$productSkuCharacterDef != null : !((Object)this$productSkuCharacterDef).equals(other$productSkuCharacterDef)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        return !(this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductSKUCharacterSaveVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        ProductSKUDetailCharacterSaveVO $productSkuDetailNew = this.getProductSkuDetailNew();
        result = result * 59 + ($productSkuDetailNew == null ? 43 : ((Object)$productSkuDetailNew).hashCode());
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
        BigDecimal $weight = this.getWeight();
        result = result * 59 + ($weight == null ? 43 : ((Object)$weight).hashCode());
        BigDecimal $volume = this.getVolume();
        result = result * 59 + ($volume == null ? 43 : ((Object)$volume).hashCode());
        String $batchUnitCode = this.getBatchUnitCode();
        result = result * 59 + ($batchUnitCode == null ? 43 : $batchUnitCode.hashCode());
        String $batchRate = this.getBatchRate();
        result = result * 59 + ($batchRate == null ? 43 : $batchRate.hashCode());
        String $orgCodeForUpdate = this.getOrgCodeForUpdate();
        result = result * 59 + ($orgCodeForUpdate == null ? 43 : $orgCodeForUpdate.hashCode());
        Map $skuFreeCharacter = this.getSkuFreeCharacter();
        result = result * 59 + ($skuFreeCharacter == null ? 43 : ((Object)$skuFreeCharacter).hashCode());
        Map $skuPropCharacter = this.getSkuPropCharacter();
        result = result * 59 + ($skuPropCharacter == null ? 43 : ((Object)$skuPropCharacter).hashCode());
        Map $productSkuCharacterDef = this.getProductSkuCharacterDef();
        result = result * 59 + ($productSkuCharacterDef == null ? 43 : ((Object)$productSkuCharacterDef).hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        return result;
    }

    public String toString() {
        return "ProductSKUCharacterSaveVO(productSkuDetailNew=" + this.getProductSkuDetailNew() + ", id=" + this.getId() + ", productCode=" + this.getProductCode() + ", name=" + this.getName() + ", code=" + this.getCode() + ", modelDescription=" + this.getModelDescription() + ", model=" + this.getModel() + ", weight=" + this.getWeight() + ", volume=" + this.getVolume() + ", batchUnitCode=" + this.getBatchUnitCode() + ", batchRate=" + this.getBatchRate() + ", orgCodeForUpdate=" + this.getOrgCodeForUpdate() + ", skuFreeCharacter=" + this.getSkuFreeCharacter() + ", skuPropCharacter=" + this.getSkuPropCharacter() + ", productSkuCharacterDef=" + this.getProductSkuCharacterDef() + ", erpCode=" + this.getErpCode() + ")";
    }
}

