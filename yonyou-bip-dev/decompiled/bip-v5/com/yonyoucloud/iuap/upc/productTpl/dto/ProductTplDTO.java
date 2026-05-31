/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.productTpl.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.productTpl.dto.BrandDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.FreeCTCharacterDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.MaterialPropCharacterDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.MultilingualDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.OptionCTCharacterDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.ProductTplAssistUnitExchangeDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.ProductTplOrderPropertyDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.ProductTplParameterDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.SkuPropCTCharacterDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.UnitDTO;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductTplDTO {
    Long id;
    MultilingualDTO name;
    Boolean enableCyclePurchase;
    Boolean enableWeighing;
    Boolean skuBusinessDynamic;
    Boolean involveSKUNaming;
    Integer isOptionalTemplate;
    Integer nameSpacer;
    Integer stopStatus;
    List<UnitDTO> units;
    List<ProductTplAssistUnitExchangeDTO> productTplAssistUnitExchangesList;
    List<BrandDTO> brands;
    List<ProductTplParameterDTO> parameters;
    List<ProductTplOrderPropertyDTO> orderPropertySums;
    String freeCTCode;
    List<FreeCTCharacterDTO> freeCharacters;
    String materialPropCTCode;
    List<MaterialPropCharacterDTO> productPropCharacters;
    String skuPropCTCode;
    List<SkuPropCTCharacterDTO> skuCharacters;
    String optionCTCode;
    List<OptionCTCharacterDTO> optionCharacters;

    public Long getId() {
        return this.id;
    }

    public MultilingualDTO getName() {
        return this.name;
    }

    public Boolean getEnableCyclePurchase() {
        return this.enableCyclePurchase;
    }

    public Boolean getEnableWeighing() {
        return this.enableWeighing;
    }

    public Boolean getSkuBusinessDynamic() {
        return this.skuBusinessDynamic;
    }

    public Boolean getInvolveSKUNaming() {
        return this.involveSKUNaming;
    }

    public Integer getIsOptionalTemplate() {
        return this.isOptionalTemplate;
    }

    public Integer getNameSpacer() {
        return this.nameSpacer;
    }

    public Integer getStopStatus() {
        return this.stopStatus;
    }

    public List<UnitDTO> getUnits() {
        return this.units;
    }

    public List<ProductTplAssistUnitExchangeDTO> getProductTplAssistUnitExchangesList() {
        return this.productTplAssistUnitExchangesList;
    }

    public List<BrandDTO> getBrands() {
        return this.brands;
    }

    public List<ProductTplParameterDTO> getParameters() {
        return this.parameters;
    }

    public List<ProductTplOrderPropertyDTO> getOrderPropertySums() {
        return this.orderPropertySums;
    }

    public String getFreeCTCode() {
        return this.freeCTCode;
    }

    public List<FreeCTCharacterDTO> getFreeCharacters() {
        return this.freeCharacters;
    }

    public String getMaterialPropCTCode() {
        return this.materialPropCTCode;
    }

    public List<MaterialPropCharacterDTO> getProductPropCharacters() {
        return this.productPropCharacters;
    }

    public String getSkuPropCTCode() {
        return this.skuPropCTCode;
    }

    public List<SkuPropCTCharacterDTO> getSkuCharacters() {
        return this.skuCharacters;
    }

    public String getOptionCTCode() {
        return this.optionCTCode;
    }

    public List<OptionCTCharacterDTO> getOptionCharacters() {
        return this.optionCharacters;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(MultilingualDTO name) {
        this.name = name;
    }

    public void setEnableCyclePurchase(Boolean enableCyclePurchase) {
        this.enableCyclePurchase = enableCyclePurchase;
    }

    public void setEnableWeighing(Boolean enableWeighing) {
        this.enableWeighing = enableWeighing;
    }

    public void setSkuBusinessDynamic(Boolean skuBusinessDynamic) {
        this.skuBusinessDynamic = skuBusinessDynamic;
    }

    public void setInvolveSKUNaming(Boolean involveSKUNaming) {
        this.involveSKUNaming = involveSKUNaming;
    }

    public void setIsOptionalTemplate(Integer isOptionalTemplate) {
        this.isOptionalTemplate = isOptionalTemplate;
    }

    public void setNameSpacer(Integer nameSpacer) {
        this.nameSpacer = nameSpacer;
    }

    public void setStopStatus(Integer stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setUnits(List<UnitDTO> units) {
        this.units = units;
    }

    public void setProductTplAssistUnitExchangesList(List<ProductTplAssistUnitExchangeDTO> productTplAssistUnitExchangesList) {
        this.productTplAssistUnitExchangesList = productTplAssistUnitExchangesList;
    }

    public void setBrands(List<BrandDTO> brands) {
        this.brands = brands;
    }

    public void setParameters(List<ProductTplParameterDTO> parameters) {
        this.parameters = parameters;
    }

    public void setOrderPropertySums(List<ProductTplOrderPropertyDTO> orderPropertySums) {
        this.orderPropertySums = orderPropertySums;
    }

    public void setFreeCTCode(String freeCTCode) {
        this.freeCTCode = freeCTCode;
    }

    public void setFreeCharacters(List<FreeCTCharacterDTO> freeCharacters) {
        this.freeCharacters = freeCharacters;
    }

    public void setMaterialPropCTCode(String materialPropCTCode) {
        this.materialPropCTCode = materialPropCTCode;
    }

    public void setProductPropCharacters(List<MaterialPropCharacterDTO> productPropCharacters) {
        this.productPropCharacters = productPropCharacters;
    }

    public void setSkuPropCTCode(String skuPropCTCode) {
        this.skuPropCTCode = skuPropCTCode;
    }

    public void setSkuCharacters(List<SkuPropCTCharacterDTO> skuCharacters) {
        this.skuCharacters = skuCharacters;
    }

    public void setOptionCTCode(String optionCTCode) {
        this.optionCTCode = optionCTCode;
    }

    public void setOptionCharacters(List<OptionCTCharacterDTO> optionCharacters) {
        this.optionCharacters = optionCharacters;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductTplDTO)) {
            return false;
        }
        ProductTplDTO other = (ProductTplDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Boolean this$enableCyclePurchase = this.getEnableCyclePurchase();
        Boolean other$enableCyclePurchase = other.getEnableCyclePurchase();
        if (this$enableCyclePurchase == null ? other$enableCyclePurchase != null : !((Object)this$enableCyclePurchase).equals(other$enableCyclePurchase)) {
            return false;
        }
        Boolean this$enableWeighing = this.getEnableWeighing();
        Boolean other$enableWeighing = other.getEnableWeighing();
        if (this$enableWeighing == null ? other$enableWeighing != null : !((Object)this$enableWeighing).equals(other$enableWeighing)) {
            return false;
        }
        Boolean this$skuBusinessDynamic = this.getSkuBusinessDynamic();
        Boolean other$skuBusinessDynamic = other.getSkuBusinessDynamic();
        if (this$skuBusinessDynamic == null ? other$skuBusinessDynamic != null : !((Object)this$skuBusinessDynamic).equals(other$skuBusinessDynamic)) {
            return false;
        }
        Boolean this$involveSKUNaming = this.getInvolveSKUNaming();
        Boolean other$involveSKUNaming = other.getInvolveSKUNaming();
        if (this$involveSKUNaming == null ? other$involveSKUNaming != null : !((Object)this$involveSKUNaming).equals(other$involveSKUNaming)) {
            return false;
        }
        Integer this$isOptionalTemplate = this.getIsOptionalTemplate();
        Integer other$isOptionalTemplate = other.getIsOptionalTemplate();
        if (this$isOptionalTemplate == null ? other$isOptionalTemplate != null : !((Object)this$isOptionalTemplate).equals(other$isOptionalTemplate)) {
            return false;
        }
        Integer this$nameSpacer = this.getNameSpacer();
        Integer other$nameSpacer = other.getNameSpacer();
        if (this$nameSpacer == null ? other$nameSpacer != null : !((Object)this$nameSpacer).equals(other$nameSpacer)) {
            return false;
        }
        Integer this$stopStatus = this.getStopStatus();
        Integer other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        MultilingualDTO this$name = this.getName();
        MultilingualDTO other$name = other.getName();
        if (this$name == null ? other$name != null : !((Object)this$name).equals(other$name)) {
            return false;
        }
        List<UnitDTO> this$units = this.getUnits();
        List<UnitDTO> other$units = other.getUnits();
        if (this$units == null ? other$units != null : !((Object)this$units).equals(other$units)) {
            return false;
        }
        List<ProductTplAssistUnitExchangeDTO> this$productTplAssistUnitExchangesList = this.getProductTplAssistUnitExchangesList();
        List<ProductTplAssistUnitExchangeDTO> other$productTplAssistUnitExchangesList = other.getProductTplAssistUnitExchangesList();
        if (this$productTplAssistUnitExchangesList == null ? other$productTplAssistUnitExchangesList != null : !((Object)this$productTplAssistUnitExchangesList).equals(other$productTplAssistUnitExchangesList)) {
            return false;
        }
        List<BrandDTO> this$brands = this.getBrands();
        List<BrandDTO> other$brands = other.getBrands();
        if (this$brands == null ? other$brands != null : !((Object)this$brands).equals(other$brands)) {
            return false;
        }
        List<ProductTplParameterDTO> this$parameters = this.getParameters();
        List<ProductTplParameterDTO> other$parameters = other.getParameters();
        if (this$parameters == null ? other$parameters != null : !((Object)this$parameters).equals(other$parameters)) {
            return false;
        }
        List<ProductTplOrderPropertyDTO> this$orderPropertySums = this.getOrderPropertySums();
        List<ProductTplOrderPropertyDTO> other$orderPropertySums = other.getOrderPropertySums();
        if (this$orderPropertySums == null ? other$orderPropertySums != null : !((Object)this$orderPropertySums).equals(other$orderPropertySums)) {
            return false;
        }
        String this$freeCTCode = this.getFreeCTCode();
        String other$freeCTCode = other.getFreeCTCode();
        if (this$freeCTCode == null ? other$freeCTCode != null : !this$freeCTCode.equals(other$freeCTCode)) {
            return false;
        }
        List<FreeCTCharacterDTO> this$freeCharacters = this.getFreeCharacters();
        List<FreeCTCharacterDTO> other$freeCharacters = other.getFreeCharacters();
        if (this$freeCharacters == null ? other$freeCharacters != null : !((Object)this$freeCharacters).equals(other$freeCharacters)) {
            return false;
        }
        String this$materialPropCTCode = this.getMaterialPropCTCode();
        String other$materialPropCTCode = other.getMaterialPropCTCode();
        if (this$materialPropCTCode == null ? other$materialPropCTCode != null : !this$materialPropCTCode.equals(other$materialPropCTCode)) {
            return false;
        }
        List<MaterialPropCharacterDTO> this$productPropCharacters = this.getProductPropCharacters();
        List<MaterialPropCharacterDTO> other$productPropCharacters = other.getProductPropCharacters();
        if (this$productPropCharacters == null ? other$productPropCharacters != null : !((Object)this$productPropCharacters).equals(other$productPropCharacters)) {
            return false;
        }
        String this$skuPropCTCode = this.getSkuPropCTCode();
        String other$skuPropCTCode = other.getSkuPropCTCode();
        if (this$skuPropCTCode == null ? other$skuPropCTCode != null : !this$skuPropCTCode.equals(other$skuPropCTCode)) {
            return false;
        }
        List<SkuPropCTCharacterDTO> this$skuCharacters = this.getSkuCharacters();
        List<SkuPropCTCharacterDTO> other$skuCharacters = other.getSkuCharacters();
        if (this$skuCharacters == null ? other$skuCharacters != null : !((Object)this$skuCharacters).equals(other$skuCharacters)) {
            return false;
        }
        String this$optionCTCode = this.getOptionCTCode();
        String other$optionCTCode = other.getOptionCTCode();
        if (this$optionCTCode == null ? other$optionCTCode != null : !this$optionCTCode.equals(other$optionCTCode)) {
            return false;
        }
        List<OptionCTCharacterDTO> this$optionCharacters = this.getOptionCharacters();
        List<OptionCTCharacterDTO> other$optionCharacters = other.getOptionCharacters();
        return !(this$optionCharacters == null ? other$optionCharacters != null : !((Object)this$optionCharacters).equals(other$optionCharacters));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTplDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Boolean $enableCyclePurchase = this.getEnableCyclePurchase();
        result = result * 59 + ($enableCyclePurchase == null ? 43 : ((Object)$enableCyclePurchase).hashCode());
        Boolean $enableWeighing = this.getEnableWeighing();
        result = result * 59 + ($enableWeighing == null ? 43 : ((Object)$enableWeighing).hashCode());
        Boolean $skuBusinessDynamic = this.getSkuBusinessDynamic();
        result = result * 59 + ($skuBusinessDynamic == null ? 43 : ((Object)$skuBusinessDynamic).hashCode());
        Boolean $involveSKUNaming = this.getInvolveSKUNaming();
        result = result * 59 + ($involveSKUNaming == null ? 43 : ((Object)$involveSKUNaming).hashCode());
        Integer $isOptionalTemplate = this.getIsOptionalTemplate();
        result = result * 59 + ($isOptionalTemplate == null ? 43 : ((Object)$isOptionalTemplate).hashCode());
        Integer $nameSpacer = this.getNameSpacer();
        result = result * 59 + ($nameSpacer == null ? 43 : ((Object)$nameSpacer).hashCode());
        Integer $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        MultilingualDTO $name = this.getName();
        result = result * 59 + ($name == null ? 43 : ((Object)$name).hashCode());
        List<UnitDTO> $units = this.getUnits();
        result = result * 59 + ($units == null ? 43 : ((Object)$units).hashCode());
        List<ProductTplAssistUnitExchangeDTO> $productTplAssistUnitExchangesList = this.getProductTplAssistUnitExchangesList();
        result = result * 59 + ($productTplAssistUnitExchangesList == null ? 43 : ((Object)$productTplAssistUnitExchangesList).hashCode());
        List<BrandDTO> $brands = this.getBrands();
        result = result * 59 + ($brands == null ? 43 : ((Object)$brands).hashCode());
        List<ProductTplParameterDTO> $parameters = this.getParameters();
        result = result * 59 + ($parameters == null ? 43 : ((Object)$parameters).hashCode());
        List<ProductTplOrderPropertyDTO> $orderPropertySums = this.getOrderPropertySums();
        result = result * 59 + ($orderPropertySums == null ? 43 : ((Object)$orderPropertySums).hashCode());
        String $freeCTCode = this.getFreeCTCode();
        result = result * 59 + ($freeCTCode == null ? 43 : $freeCTCode.hashCode());
        List<FreeCTCharacterDTO> $freeCharacters = this.getFreeCharacters();
        result = result * 59 + ($freeCharacters == null ? 43 : ((Object)$freeCharacters).hashCode());
        String $materialPropCTCode = this.getMaterialPropCTCode();
        result = result * 59 + ($materialPropCTCode == null ? 43 : $materialPropCTCode.hashCode());
        List<MaterialPropCharacterDTO> $productPropCharacters = this.getProductPropCharacters();
        result = result * 59 + ($productPropCharacters == null ? 43 : ((Object)$productPropCharacters).hashCode());
        String $skuPropCTCode = this.getSkuPropCTCode();
        result = result * 59 + ($skuPropCTCode == null ? 43 : $skuPropCTCode.hashCode());
        List<SkuPropCTCharacterDTO> $skuCharacters = this.getSkuCharacters();
        result = result * 59 + ($skuCharacters == null ? 43 : ((Object)$skuCharacters).hashCode());
        String $optionCTCode = this.getOptionCTCode();
        result = result * 59 + ($optionCTCode == null ? 43 : $optionCTCode.hashCode());
        List<OptionCTCharacterDTO> $optionCharacters = this.getOptionCharacters();
        result = result * 59 + ($optionCharacters == null ? 43 : ((Object)$optionCharacters).hashCode());
        return result;
    }

    public String toString() {
        return "ProductTplDTO(id=" + this.getId() + ", name=" + this.getName() + ", enableCyclePurchase=" + this.getEnableCyclePurchase() + ", enableWeighing=" + this.getEnableWeighing() + ", skuBusinessDynamic=" + this.getSkuBusinessDynamic() + ", involveSKUNaming=" + this.getInvolveSKUNaming() + ", isOptionalTemplate=" + this.getIsOptionalTemplate() + ", nameSpacer=" + this.getNameSpacer() + ", stopStatus=" + this.getStopStatus() + ", units=" + this.getUnits() + ", productTplAssistUnitExchangesList=" + this.getProductTplAssistUnitExchangesList() + ", brands=" + this.getBrands() + ", parameters=" + this.getParameters() + ", orderPropertySums=" + this.getOrderPropertySums() + ", freeCTCode=" + this.getFreeCTCode() + ", freeCharacters=" + this.getFreeCharacters() + ", materialPropCTCode=" + this.getMaterialPropCTCode() + ", productPropCharacters=" + this.getProductPropCharacters() + ", skuPropCTCode=" + this.getSkuPropCTCode() + ", skuCharacters=" + this.getSkuCharacters() + ", optionCTCode=" + this.getOptionCTCode() + ", optionCharacters=" + this.getOptionCharacters() + ")";
    }
}

