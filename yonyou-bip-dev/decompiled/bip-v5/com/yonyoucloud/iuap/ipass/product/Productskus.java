/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.ipass.product.IpassMultilingual;
import com.yonyoucloud.iuap.ipass.product.ProductIPassSKUDetail;
import java.io.Serializable;
import java.math.BigDecimal;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class Productskus
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String productId;
    private String id;
    private Boolean isSKU;
    private String specIds;
    private String specs;
    private String code;
    private IpassMultilingual name;
    private ProductIPassSKUDetail productSKUDetail;
    private IpassMultilingual modelDescription;
    private IpassMultilingual model;
    private String erpCode;
    private String batchUnit;
    private String batchUnit_Name;
    private BigDecimal batchRate;
    private BigDecimal weight;
    private BigDecimal volume;
    private String _status;

    public String getProductId() {
        return this.productId;
    }

    public String getId() {
        return this.id;
    }

    public Boolean getIsSKU() {
        return this.isSKU;
    }

    public String getSpecIds() {
        return this.specIds;
    }

    public String getSpecs() {
        return this.specs;
    }

    public String getCode() {
        return this.code;
    }

    public IpassMultilingual getName() {
        return this.name;
    }

    public ProductIPassSKUDetail getProductSKUDetail() {
        return this.productSKUDetail;
    }

    public IpassMultilingual getModelDescription() {
        return this.modelDescription;
    }

    public IpassMultilingual getModel() {
        return this.model;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public String getBatchUnit() {
        return this.batchUnit;
    }

    public String getBatchUnit_Name() {
        return this.batchUnit_Name;
    }

    public BigDecimal getBatchRate() {
        return this.batchRate;
    }

    public BigDecimal getWeight() {
        return this.weight;
    }

    public BigDecimal getVolume() {
        return this.volume;
    }

    public String get_status() {
        return this._status;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIsSKU(Boolean isSKU) {
        this.isSKU = isSKU;
    }

    public void setSpecIds(String specIds) {
        this.specIds = specIds;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(IpassMultilingual name) {
        this.name = name;
    }

    public void setProductSKUDetail(ProductIPassSKUDetail productSKUDetail) {
        this.productSKUDetail = productSKUDetail;
    }

    public void setModelDescription(IpassMultilingual modelDescription) {
        this.modelDescription = modelDescription;
    }

    public void setModel(IpassMultilingual model) {
        this.model = model;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setBatchUnit(String batchUnit) {
        this.batchUnit = batchUnit;
    }

    public void setBatchUnit_Name(String batchUnit_Name) {
        this.batchUnit_Name = batchUnit_Name;
    }

    public void setBatchRate(BigDecimal batchRate) {
        this.batchRate = batchRate;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Productskus)) {
            return false;
        }
        Productskus other = (Productskus)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$isSKU = this.getIsSKU();
        Boolean other$isSKU = other.getIsSKU();
        if (this$isSKU == null ? other$isSKU != null : !((Object)this$isSKU).equals(other$isSKU)) {
            return false;
        }
        String this$productId = this.getProductId();
        String other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !this$productId.equals(other$productId)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$specIds = this.getSpecIds();
        String other$specIds = other.getSpecIds();
        if (this$specIds == null ? other$specIds != null : !this$specIds.equals(other$specIds)) {
            return false;
        }
        String this$specs = this.getSpecs();
        String other$specs = other.getSpecs();
        if (this$specs == null ? other$specs != null : !this$specs.equals(other$specs)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        IpassMultilingual this$name = this.getName();
        IpassMultilingual other$name = other.getName();
        if (this$name == null ? other$name != null : !((Object)this$name).equals(other$name)) {
            return false;
        }
        ProductIPassSKUDetail this$productSKUDetail = this.getProductSKUDetail();
        ProductIPassSKUDetail other$productSKUDetail = other.getProductSKUDetail();
        if (this$productSKUDetail == null ? other$productSKUDetail != null : !((Object)this$productSKUDetail).equals(other$productSKUDetail)) {
            return false;
        }
        IpassMultilingual this$modelDescription = this.getModelDescription();
        IpassMultilingual other$modelDescription = other.getModelDescription();
        if (this$modelDescription == null ? other$modelDescription != null : !((Object)this$modelDescription).equals(other$modelDescription)) {
            return false;
        }
        IpassMultilingual this$model = this.getModel();
        IpassMultilingual other$model = other.getModel();
        if (this$model == null ? other$model != null : !((Object)this$model).equals(other$model)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        String this$batchUnit = this.getBatchUnit();
        String other$batchUnit = other.getBatchUnit();
        if (this$batchUnit == null ? other$batchUnit != null : !this$batchUnit.equals(other$batchUnit)) {
            return false;
        }
        String this$batchUnit_Name = this.getBatchUnit_Name();
        String other$batchUnit_Name = other.getBatchUnit_Name();
        if (this$batchUnit_Name == null ? other$batchUnit_Name != null : !this$batchUnit_Name.equals(other$batchUnit_Name)) {
            return false;
        }
        BigDecimal this$batchRate = this.getBatchRate();
        BigDecimal other$batchRate = other.getBatchRate();
        if (this$batchRate == null ? other$batchRate != null : !((Object)this$batchRate).equals(other$batchRate)) {
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
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        return !(this$_status == null ? other$_status != null : !this$_status.equals(other$_status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof Productskus;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $isSKU = this.getIsSKU();
        result = result * 59 + ($isSKU == null ? 43 : ((Object)$isSKU).hashCode());
        String $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : $productId.hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $specIds = this.getSpecIds();
        result = result * 59 + ($specIds == null ? 43 : $specIds.hashCode());
        String $specs = this.getSpecs();
        result = result * 59 + ($specs == null ? 43 : $specs.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        IpassMultilingual $name = this.getName();
        result = result * 59 + ($name == null ? 43 : ((Object)$name).hashCode());
        ProductIPassSKUDetail $productSKUDetail = this.getProductSKUDetail();
        result = result * 59 + ($productSKUDetail == null ? 43 : ((Object)$productSKUDetail).hashCode());
        IpassMultilingual $modelDescription = this.getModelDescription();
        result = result * 59 + ($modelDescription == null ? 43 : ((Object)$modelDescription).hashCode());
        IpassMultilingual $model = this.getModel();
        result = result * 59 + ($model == null ? 43 : ((Object)$model).hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        String $batchUnit = this.getBatchUnit();
        result = result * 59 + ($batchUnit == null ? 43 : $batchUnit.hashCode());
        String $batchUnit_Name = this.getBatchUnit_Name();
        result = result * 59 + ($batchUnit_Name == null ? 43 : $batchUnit_Name.hashCode());
        BigDecimal $batchRate = this.getBatchRate();
        result = result * 59 + ($batchRate == null ? 43 : ((Object)$batchRate).hashCode());
        BigDecimal $weight = this.getWeight();
        result = result * 59 + ($weight == null ? 43 : ((Object)$weight).hashCode());
        BigDecimal $volume = this.getVolume();
        result = result * 59 + ($volume == null ? 43 : ((Object)$volume).hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        return result;
    }

    public String toString() {
        return "Productskus(productId=" + this.getProductId() + ", id=" + this.getId() + ", isSKU=" + this.getIsSKU() + ", specIds=" + this.getSpecIds() + ", specs=" + this.getSpecs() + ", code=" + this.getCode() + ", name=" + this.getName() + ", productSKUDetail=" + this.getProductSKUDetail() + ", modelDescription=" + this.getModelDescription() + ", model=" + this.getModel() + ", erpCode=" + this.getErpCode() + ", batchUnit=" + this.getBatchUnit() + ", batchUnit_Name=" + this.getBatchUnit_Name() + ", batchRate=" + this.getBatchRate() + ", weight=" + this.getWeight() + ", volume=" + this.getVolume() + ", _status=" + this.get_status() + ")";
    }
}

