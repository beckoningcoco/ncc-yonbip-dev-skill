/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo.productTpl.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.iuap.upc.vo.productTpl.vo.BrandVO;
import com.yonyoucloud.iuap.upc.vo.productTpl.vo.FreeCTCharacterVO;
import com.yonyoucloud.iuap.upc.vo.productTpl.vo.ProductTplAssistUnitExchangeVO;
import com.yonyoucloud.iuap.upc.vo.productTpl.vo.ProductTplOrderPropertyVO;
import com.yonyoucloud.iuap.upc.vo.productTpl.vo.ProductTplParameterVO;
import com.yonyoucloud.iuap.upc.vo.productTpl.vo.UnitVO;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductTplVO {
    MultilingualVO name;
    Boolean enableCyclePurchase;
    Boolean enableWeighing;
    Boolean skuBusinessDynamic;
    Boolean involveSKUNaming;
    Integer isOptionalTemplate;
    Integer nameSpacer;
    Integer stopStatus;
    List<UnitVO> units;
    List<ProductTplAssistUnitExchangeVO> productTplAssistUnitExchangesList;
    List<BrandVO> brands;
    List<ProductTplOrderPropertyVO> orderPropertySums;
    List<ProductTplParameterVO> parameters;
    String freeCTCode;
    List<FreeCTCharacterVO> freeCharacters;
    String materialPropCTCode;
    String skuPropCTCode;
    String optionCTCode;

    public MultilingualVO getName() {
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

    public List<UnitVO> getUnits() {
        return this.units;
    }

    public List<ProductTplAssistUnitExchangeVO> getProductTplAssistUnitExchangesList() {
        return this.productTplAssistUnitExchangesList;
    }

    public List<BrandVO> getBrands() {
        return this.brands;
    }

    public List<ProductTplOrderPropertyVO> getOrderPropertySums() {
        return this.orderPropertySums;
    }

    public List<ProductTplParameterVO> getParameters() {
        return this.parameters;
    }

    public String getFreeCTCode() {
        return this.freeCTCode;
    }

    public List<FreeCTCharacterVO> getFreeCharacters() {
        return this.freeCharacters;
    }

    public String getMaterialPropCTCode() {
        return this.materialPropCTCode;
    }

    public String getSkuPropCTCode() {
        return this.skuPropCTCode;
    }

    public String getOptionCTCode() {
        return this.optionCTCode;
    }

    public void setName(MultilingualVO name) {
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

    public void setUnits(List<UnitVO> units) {
        this.units = units;
    }

    public void setProductTplAssistUnitExchangesList(List<ProductTplAssistUnitExchangeVO> productTplAssistUnitExchangesList) {
        this.productTplAssistUnitExchangesList = productTplAssistUnitExchangesList;
    }

    public void setBrands(List<BrandVO> brands) {
        this.brands = brands;
    }

    public void setOrderPropertySums(List<ProductTplOrderPropertyVO> orderPropertySums) {
        this.orderPropertySums = orderPropertySums;
    }

    public void setParameters(List<ProductTplParameterVO> parameters) {
        this.parameters = parameters;
    }

    public void setFreeCTCode(String freeCTCode) {
        this.freeCTCode = freeCTCode;
    }

    public void setFreeCharacters(List<FreeCTCharacterVO> freeCharacters) {
        this.freeCharacters = freeCharacters;
    }

    public void setMaterialPropCTCode(String materialPropCTCode) {
        this.materialPropCTCode = materialPropCTCode;
    }

    public void setSkuPropCTCode(String skuPropCTCode) {
        this.skuPropCTCode = skuPropCTCode;
    }

    public void setOptionCTCode(String optionCTCode) {
        this.optionCTCode = optionCTCode;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductTplVO)) {
            return false;
        }
        ProductTplVO other = (ProductTplVO)o;
        if (!other.canEqual(this)) {
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
        MultilingualVO this$name = this.getName();
        MultilingualVO other$name = other.getName();
        if (this$name == null ? other$name != null : !((Object)this$name).equals(other$name)) {
            return false;
        }
        List<UnitVO> this$units = this.getUnits();
        List<UnitVO> other$units = other.getUnits();
        if (this$units == null ? other$units != null : !((Object)this$units).equals(other$units)) {
            return false;
        }
        List<ProductTplAssistUnitExchangeVO> this$productTplAssistUnitExchangesList = this.getProductTplAssistUnitExchangesList();
        List<ProductTplAssistUnitExchangeVO> other$productTplAssistUnitExchangesList = other.getProductTplAssistUnitExchangesList();
        if (this$productTplAssistUnitExchangesList == null ? other$productTplAssistUnitExchangesList != null : !((Object)this$productTplAssistUnitExchangesList).equals(other$productTplAssistUnitExchangesList)) {
            return false;
        }
        List<BrandVO> this$brands = this.getBrands();
        List<BrandVO> other$brands = other.getBrands();
        if (this$brands == null ? other$brands != null : !((Object)this$brands).equals(other$brands)) {
            return false;
        }
        List<ProductTplOrderPropertyVO> this$orderPropertySums = this.getOrderPropertySums();
        List<ProductTplOrderPropertyVO> other$orderPropertySums = other.getOrderPropertySums();
        if (this$orderPropertySums == null ? other$orderPropertySums != null : !((Object)this$orderPropertySums).equals(other$orderPropertySums)) {
            return false;
        }
        List<ProductTplParameterVO> this$parameters = this.getParameters();
        List<ProductTplParameterVO> other$parameters = other.getParameters();
        if (this$parameters == null ? other$parameters != null : !((Object)this$parameters).equals(other$parameters)) {
            return false;
        }
        String this$freeCTCode = this.getFreeCTCode();
        String other$freeCTCode = other.getFreeCTCode();
        if (this$freeCTCode == null ? other$freeCTCode != null : !this$freeCTCode.equals(other$freeCTCode)) {
            return false;
        }
        List<FreeCTCharacterVO> this$freeCharacters = this.getFreeCharacters();
        List<FreeCTCharacterVO> other$freeCharacters = other.getFreeCharacters();
        if (this$freeCharacters == null ? other$freeCharacters != null : !((Object)this$freeCharacters).equals(other$freeCharacters)) {
            return false;
        }
        String this$materialPropCTCode = this.getMaterialPropCTCode();
        String other$materialPropCTCode = other.getMaterialPropCTCode();
        if (this$materialPropCTCode == null ? other$materialPropCTCode != null : !this$materialPropCTCode.equals(other$materialPropCTCode)) {
            return false;
        }
        String this$skuPropCTCode = this.getSkuPropCTCode();
        String other$skuPropCTCode = other.getSkuPropCTCode();
        if (this$skuPropCTCode == null ? other$skuPropCTCode != null : !this$skuPropCTCode.equals(other$skuPropCTCode)) {
            return false;
        }
        String this$optionCTCode = this.getOptionCTCode();
        String other$optionCTCode = other.getOptionCTCode();
        return !(this$optionCTCode == null ? other$optionCTCode != null : !this$optionCTCode.equals(other$optionCTCode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTplVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
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
        MultilingualVO $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        List<UnitVO> $units = this.getUnits();
        result = result * 59 + ($units == null ? 43 : ((Object)$units).hashCode());
        List<ProductTplAssistUnitExchangeVO> $productTplAssistUnitExchangesList = this.getProductTplAssistUnitExchangesList();
        result = result * 59 + ($productTplAssistUnitExchangesList == null ? 43 : ((Object)$productTplAssistUnitExchangesList).hashCode());
        List<BrandVO> $brands = this.getBrands();
        result = result * 59 + ($brands == null ? 43 : ((Object)$brands).hashCode());
        List<ProductTplOrderPropertyVO> $orderPropertySums = this.getOrderPropertySums();
        result = result * 59 + ($orderPropertySums == null ? 43 : ((Object)$orderPropertySums).hashCode());
        List<ProductTplParameterVO> $parameters = this.getParameters();
        result = result * 59 + ($parameters == null ? 43 : ((Object)$parameters).hashCode());
        String $freeCTCode = this.getFreeCTCode();
        result = result * 59 + ($freeCTCode == null ? 43 : $freeCTCode.hashCode());
        List<FreeCTCharacterVO> $freeCharacters = this.getFreeCharacters();
        result = result * 59 + ($freeCharacters == null ? 43 : ((Object)$freeCharacters).hashCode());
        String $materialPropCTCode = this.getMaterialPropCTCode();
        result = result * 59 + ($materialPropCTCode == null ? 43 : $materialPropCTCode.hashCode());
        String $skuPropCTCode = this.getSkuPropCTCode();
        result = result * 59 + ($skuPropCTCode == null ? 43 : $skuPropCTCode.hashCode());
        String $optionCTCode = this.getOptionCTCode();
        result = result * 59 + ($optionCTCode == null ? 43 : $optionCTCode.hashCode());
        return result;
    }

    public String toString() {
        return "ProductTplVO(name=" + this.getName() + ", enableCyclePurchase=" + this.getEnableCyclePurchase() + ", enableWeighing=" + this.getEnableWeighing() + ", skuBusinessDynamic=" + this.getSkuBusinessDynamic() + ", involveSKUNaming=" + this.getInvolveSKUNaming() + ", isOptionalTemplate=" + this.getIsOptionalTemplate() + ", nameSpacer=" + this.getNameSpacer() + ", stopStatus=" + this.getStopStatus() + ", units=" + this.getUnits() + ", productTplAssistUnitExchangesList=" + this.getProductTplAssistUnitExchangesList() + ", brands=" + this.getBrands() + ", orderPropertySums=" + this.getOrderPropertySums() + ", parameters=" + this.getParameters() + ", freeCTCode=" + this.getFreeCTCode() + ", freeCharacters=" + this.getFreeCharacters() + ", materialPropCTCode=" + this.getMaterialPropCTCode() + ", skuPropCTCode=" + this.getSkuPropCTCode() + ", optionCTCode=" + this.getOptionCTCode() + ")";
    }
}

