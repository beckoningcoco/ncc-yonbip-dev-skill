/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ProductTplCyclePropertyDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplParameterDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.ProductTplOrderPropertyDTO;
import java.io.Serializable;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductTplDTO
implements Serializable {
    private Long id;
    private String name;
    private Boolean skuBusinessDynamic;
    private Long deliveryType;
    private Long freightRule;
    private Boolean enableCyclePurchase;
    private Boolean enableWeighing;
    private Long attachmentGroup;
    private Boolean involveSKUNaming;
    private Integer optionalTemplate;
    private Long freeCT;
    private Long optionCT;
    private Long materialPropCT;
    private Long skuPropCT;
    private List<ProductTplParameterDTO> materialParameterDTOList;
    private List<ProductTplCyclePropertyDTO> materialCyclePropertyDTOList;
    private List<ProductTplOrderPropertyDTO> materialOrderPropertyDTOList;

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getSkuBusinessDynamic() {
        return this.skuBusinessDynamic;
    }

    public Long getDeliveryType() {
        return this.deliveryType;
    }

    public Long getFreightRule() {
        return this.freightRule;
    }

    public Boolean getEnableCyclePurchase() {
        return this.enableCyclePurchase;
    }

    public Boolean getEnableWeighing() {
        return this.enableWeighing;
    }

    public Long getAttachmentGroup() {
        return this.attachmentGroup;
    }

    public Boolean getInvolveSKUNaming() {
        return this.involveSKUNaming;
    }

    public Integer getOptionalTemplate() {
        return this.optionalTemplate;
    }

    public Long getFreeCT() {
        return this.freeCT;
    }

    public Long getOptionCT() {
        return this.optionCT;
    }

    public Long getMaterialPropCT() {
        return this.materialPropCT;
    }

    public Long getSkuPropCT() {
        return this.skuPropCT;
    }

    public List<ProductTplParameterDTO> getMaterialParameterDTOList() {
        return this.materialParameterDTOList;
    }

    public List<ProductTplCyclePropertyDTO> getMaterialCyclePropertyDTOList() {
        return this.materialCyclePropertyDTOList;
    }

    public List<ProductTplOrderPropertyDTO> getMaterialOrderPropertyDTOList() {
        return this.materialOrderPropertyDTOList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkuBusinessDynamic(Boolean skuBusinessDynamic) {
        this.skuBusinessDynamic = skuBusinessDynamic;
    }

    public void setDeliveryType(Long deliveryType) {
        this.deliveryType = deliveryType;
    }

    public void setFreightRule(Long freightRule) {
        this.freightRule = freightRule;
    }

    public void setEnableCyclePurchase(Boolean enableCyclePurchase) {
        this.enableCyclePurchase = enableCyclePurchase;
    }

    public void setEnableWeighing(Boolean enableWeighing) {
        this.enableWeighing = enableWeighing;
    }

    public void setAttachmentGroup(Long attachmentGroup) {
        this.attachmentGroup = attachmentGroup;
    }

    public void setInvolveSKUNaming(Boolean involveSKUNaming) {
        this.involveSKUNaming = involveSKUNaming;
    }

    public void setOptionalTemplate(Integer optionalTemplate) {
        this.optionalTemplate = optionalTemplate;
    }

    public void setFreeCT(Long freeCT) {
        this.freeCT = freeCT;
    }

    public void setOptionCT(Long optionCT) {
        this.optionCT = optionCT;
    }

    public void setMaterialPropCT(Long materialPropCT) {
        this.materialPropCT = materialPropCT;
    }

    public void setSkuPropCT(Long skuPropCT) {
        this.skuPropCT = skuPropCT;
    }

    public void setMaterialParameterDTOList(List<ProductTplParameterDTO> materialParameterDTOList) {
        this.materialParameterDTOList = materialParameterDTOList;
    }

    public void setMaterialCyclePropertyDTOList(List<ProductTplCyclePropertyDTO> materialCyclePropertyDTOList) {
        this.materialCyclePropertyDTOList = materialCyclePropertyDTOList;
    }

    public void setMaterialOrderPropertyDTOList(List<ProductTplOrderPropertyDTO> materialOrderPropertyDTOList) {
        this.materialOrderPropertyDTOList = materialOrderPropertyDTOList;
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
        Boolean this$skuBusinessDynamic = this.getSkuBusinessDynamic();
        Boolean other$skuBusinessDynamic = other.getSkuBusinessDynamic();
        if (this$skuBusinessDynamic == null ? other$skuBusinessDynamic != null : !((Object)this$skuBusinessDynamic).equals(other$skuBusinessDynamic)) {
            return false;
        }
        Long this$deliveryType = this.getDeliveryType();
        Long other$deliveryType = other.getDeliveryType();
        if (this$deliveryType == null ? other$deliveryType != null : !((Object)this$deliveryType).equals(other$deliveryType)) {
            return false;
        }
        Long this$freightRule = this.getFreightRule();
        Long other$freightRule = other.getFreightRule();
        if (this$freightRule == null ? other$freightRule != null : !((Object)this$freightRule).equals(other$freightRule)) {
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
        Long this$attachmentGroup = this.getAttachmentGroup();
        Long other$attachmentGroup = other.getAttachmentGroup();
        if (this$attachmentGroup == null ? other$attachmentGroup != null : !((Object)this$attachmentGroup).equals(other$attachmentGroup)) {
            return false;
        }
        Boolean this$involveSKUNaming = this.getInvolveSKUNaming();
        Boolean other$involveSKUNaming = other.getInvolveSKUNaming();
        if (this$involveSKUNaming == null ? other$involveSKUNaming != null : !((Object)this$involveSKUNaming).equals(other$involveSKUNaming)) {
            return false;
        }
        Integer this$optionalTemplate = this.getOptionalTemplate();
        Integer other$optionalTemplate = other.getOptionalTemplate();
        if (this$optionalTemplate == null ? other$optionalTemplate != null : !((Object)this$optionalTemplate).equals(other$optionalTemplate)) {
            return false;
        }
        Long this$freeCT = this.getFreeCT();
        Long other$freeCT = other.getFreeCT();
        if (this$freeCT == null ? other$freeCT != null : !((Object)this$freeCT).equals(other$freeCT)) {
            return false;
        }
        Long this$optionCT = this.getOptionCT();
        Long other$optionCT = other.getOptionCT();
        if (this$optionCT == null ? other$optionCT != null : !((Object)this$optionCT).equals(other$optionCT)) {
            return false;
        }
        Long this$materialPropCT = this.getMaterialPropCT();
        Long other$materialPropCT = other.getMaterialPropCT();
        if (this$materialPropCT == null ? other$materialPropCT != null : !((Object)this$materialPropCT).equals(other$materialPropCT)) {
            return false;
        }
        Long this$skuPropCT = this.getSkuPropCT();
        Long other$skuPropCT = other.getSkuPropCT();
        if (this$skuPropCT == null ? other$skuPropCT != null : !((Object)this$skuPropCT).equals(other$skuPropCT)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        List<ProductTplParameterDTO> this$materialParameterDTOList = this.getMaterialParameterDTOList();
        List<ProductTplParameterDTO> other$materialParameterDTOList = other.getMaterialParameterDTOList();
        if (this$materialParameterDTOList == null ? other$materialParameterDTOList != null : !((Object)this$materialParameterDTOList).equals(other$materialParameterDTOList)) {
            return false;
        }
        List<ProductTplCyclePropertyDTO> this$materialCyclePropertyDTOList = this.getMaterialCyclePropertyDTOList();
        List<ProductTplCyclePropertyDTO> other$materialCyclePropertyDTOList = other.getMaterialCyclePropertyDTOList();
        if (this$materialCyclePropertyDTOList == null ? other$materialCyclePropertyDTOList != null : !((Object)this$materialCyclePropertyDTOList).equals(other$materialCyclePropertyDTOList)) {
            return false;
        }
        List<ProductTplOrderPropertyDTO> this$materialOrderPropertyDTOList = this.getMaterialOrderPropertyDTOList();
        List<ProductTplOrderPropertyDTO> other$materialOrderPropertyDTOList = other.getMaterialOrderPropertyDTOList();
        return !(this$materialOrderPropertyDTOList == null ? other$materialOrderPropertyDTOList != null : !((Object)this$materialOrderPropertyDTOList).equals(other$materialOrderPropertyDTOList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTplDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Boolean $skuBusinessDynamic = this.getSkuBusinessDynamic();
        result = result * 59 + ($skuBusinessDynamic == null ? 43 : ((Object)$skuBusinessDynamic).hashCode());
        Long $deliveryType = this.getDeliveryType();
        result = result * 59 + ($deliveryType == null ? 43 : ((Object)$deliveryType).hashCode());
        Long $freightRule = this.getFreightRule();
        result = result * 59 + ($freightRule == null ? 43 : ((Object)$freightRule).hashCode());
        Boolean $enableCyclePurchase = this.getEnableCyclePurchase();
        result = result * 59 + ($enableCyclePurchase == null ? 43 : ((Object)$enableCyclePurchase).hashCode());
        Boolean $enableWeighing = this.getEnableWeighing();
        result = result * 59 + ($enableWeighing == null ? 43 : ((Object)$enableWeighing).hashCode());
        Long $attachmentGroup = this.getAttachmentGroup();
        result = result * 59 + ($attachmentGroup == null ? 43 : ((Object)$attachmentGroup).hashCode());
        Boolean $involveSKUNaming = this.getInvolveSKUNaming();
        result = result * 59 + ($involveSKUNaming == null ? 43 : ((Object)$involveSKUNaming).hashCode());
        Integer $optionalTemplate = this.getOptionalTemplate();
        result = result * 59 + ($optionalTemplate == null ? 43 : ((Object)$optionalTemplate).hashCode());
        Long $freeCT = this.getFreeCT();
        result = result * 59 + ($freeCT == null ? 43 : ((Object)$freeCT).hashCode());
        Long $optionCT = this.getOptionCT();
        result = result * 59 + ($optionCT == null ? 43 : ((Object)$optionCT).hashCode());
        Long $materialPropCT = this.getMaterialPropCT();
        result = result * 59 + ($materialPropCT == null ? 43 : ((Object)$materialPropCT).hashCode());
        Long $skuPropCT = this.getSkuPropCT();
        result = result * 59 + ($skuPropCT == null ? 43 : ((Object)$skuPropCT).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        List<ProductTplParameterDTO> $materialParameterDTOList = this.getMaterialParameterDTOList();
        result = result * 59 + ($materialParameterDTOList == null ? 43 : ((Object)$materialParameterDTOList).hashCode());
        List<ProductTplCyclePropertyDTO> $materialCyclePropertyDTOList = this.getMaterialCyclePropertyDTOList();
        result = result * 59 + ($materialCyclePropertyDTOList == null ? 43 : ((Object)$materialCyclePropertyDTOList).hashCode());
        List<ProductTplOrderPropertyDTO> $materialOrderPropertyDTOList = this.getMaterialOrderPropertyDTOList();
        result = result * 59 + ($materialOrderPropertyDTOList == null ? 43 : ((Object)$materialOrderPropertyDTOList).hashCode());
        return result;
    }

    public String toString() {
        return "ProductTplDTO(id=" + this.getId() + ", name=" + this.getName() + ", skuBusinessDynamic=" + this.getSkuBusinessDynamic() + ", deliveryType=" + this.getDeliveryType() + ", freightRule=" + this.getFreightRule() + ", enableCyclePurchase=" + this.getEnableCyclePurchase() + ", enableWeighing=" + this.getEnableWeighing() + ", attachmentGroup=" + this.getAttachmentGroup() + ", involveSKUNaming=" + this.getInvolveSKUNaming() + ", optionalTemplate=" + this.getOptionalTemplate() + ", freeCT=" + this.getFreeCT() + ", optionCT=" + this.getOptionCT() + ", materialPropCT=" + this.getMaterialPropCT() + ", skuPropCT=" + this.getSkuPropCT() + ", materialParameterDTOList=" + this.getMaterialParameterDTOList() + ", materialCyclePropertyDTOList=" + this.getMaterialCyclePropertyDTOList() + ", materialOrderPropertyDTOList=" + this.getMaterialOrderPropertyDTOList() + ")";
    }
}

