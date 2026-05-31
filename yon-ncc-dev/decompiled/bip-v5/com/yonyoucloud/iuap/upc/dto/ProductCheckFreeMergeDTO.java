/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductCheckFreeMergeDTO
implements Serializable {
    private Long productId;
    private Long productDetailId;
    private Long productApplyRangeId;
    private Long template;
    private Long characteristicsType;
    private Long characteristics;
    private Long character;
    private String characterCode;
    private Integer skuSens;
    private Integer batchSens;
    private Integer SNSens;
    private Integer stockSens;
    private Integer costAffec;
    private Integer BOMAffec;
    private Integer manuAffec;
    private Integer priceAffec;
    private Integer edAffec;

    public Long getProductId() {
        return this.productId;
    }

    public Long getProductDetailId() {
        return this.productDetailId;
    }

    public Long getProductApplyRangeId() {
        return this.productApplyRangeId;
    }

    public Long getTemplate() {
        return this.template;
    }

    public Long getCharacteristicsType() {
        return this.characteristicsType;
    }

    public Long getCharacteristics() {
        return this.characteristics;
    }

    public Long getCharacter() {
        return this.character;
    }

    public String getCharacterCode() {
        return this.characterCode;
    }

    public Integer getSkuSens() {
        return this.skuSens;
    }

    public Integer getBatchSens() {
        return this.batchSens;
    }

    public Integer getSNSens() {
        return this.SNSens;
    }

    public Integer getStockSens() {
        return this.stockSens;
    }

    public Integer getCostAffec() {
        return this.costAffec;
    }

    public Integer getBOMAffec() {
        return this.BOMAffec;
    }

    public Integer getManuAffec() {
        return this.manuAffec;
    }

    public Integer getPriceAffec() {
        return this.priceAffec;
    }

    public Integer getEdAffec() {
        return this.edAffec;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductDetailId(Long productDetailId) {
        this.productDetailId = productDetailId;
    }

    public void setProductApplyRangeId(Long productApplyRangeId) {
        this.productApplyRangeId = productApplyRangeId;
    }

    public void setTemplate(Long template) {
        this.template = template;
    }

    public void setCharacteristicsType(Long characteristicsType) {
        this.characteristicsType = characteristicsType;
    }

    public void setCharacteristics(Long characteristics) {
        this.characteristics = characteristics;
    }

    public void setCharacter(Long character) {
        this.character = character;
    }

    public void setCharacterCode(String characterCode) {
        this.characterCode = characterCode;
    }

    public void setSkuSens(Integer skuSens) {
        this.skuSens = skuSens;
    }

    public void setBatchSens(Integer batchSens) {
        this.batchSens = batchSens;
    }

    public void setSNSens(Integer SNSens) {
        this.SNSens = SNSens;
    }

    public void setStockSens(Integer stockSens) {
        this.stockSens = stockSens;
    }

    public void setCostAffec(Integer costAffec) {
        this.costAffec = costAffec;
    }

    public void setBOMAffec(Integer BOMAffec) {
        this.BOMAffec = BOMAffec;
    }

    public void setManuAffec(Integer manuAffec) {
        this.manuAffec = manuAffec;
    }

    public void setPriceAffec(Integer priceAffec) {
        this.priceAffec = priceAffec;
    }

    public void setEdAffec(Integer edAffec) {
        this.edAffec = edAffec;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductCheckFreeMergeDTO)) {
            return false;
        }
        ProductCheckFreeMergeDTO other = (ProductCheckFreeMergeDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        Long this$productDetailId = this.getProductDetailId();
        Long other$productDetailId = other.getProductDetailId();
        if (this$productDetailId == null ? other$productDetailId != null : !((Object)this$productDetailId).equals(other$productDetailId)) {
            return false;
        }
        Long this$productApplyRangeId = this.getProductApplyRangeId();
        Long other$productApplyRangeId = other.getProductApplyRangeId();
        if (this$productApplyRangeId == null ? other$productApplyRangeId != null : !((Object)this$productApplyRangeId).equals(other$productApplyRangeId)) {
            return false;
        }
        Long this$template = this.getTemplate();
        Long other$template = other.getTemplate();
        if (this$template == null ? other$template != null : !((Object)this$template).equals(other$template)) {
            return false;
        }
        Long this$characteristicsType = this.getCharacteristicsType();
        Long other$characteristicsType = other.getCharacteristicsType();
        if (this$characteristicsType == null ? other$characteristicsType != null : !((Object)this$characteristicsType).equals(other$characteristicsType)) {
            return false;
        }
        Long this$characteristics = this.getCharacteristics();
        Long other$characteristics = other.getCharacteristics();
        if (this$characteristics == null ? other$characteristics != null : !((Object)this$characteristics).equals(other$characteristics)) {
            return false;
        }
        Long this$character = this.getCharacter();
        Long other$character = other.getCharacter();
        if (this$character == null ? other$character != null : !((Object)this$character).equals(other$character)) {
            return false;
        }
        Integer this$skuSens = this.getSkuSens();
        Integer other$skuSens = other.getSkuSens();
        if (this$skuSens == null ? other$skuSens != null : !((Object)this$skuSens).equals(other$skuSens)) {
            return false;
        }
        Integer this$batchSens = this.getBatchSens();
        Integer other$batchSens = other.getBatchSens();
        if (this$batchSens == null ? other$batchSens != null : !((Object)this$batchSens).equals(other$batchSens)) {
            return false;
        }
        Integer this$SNSens = this.getSNSens();
        Integer other$SNSens = other.getSNSens();
        if (this$SNSens == null ? other$SNSens != null : !((Object)this$SNSens).equals(other$SNSens)) {
            return false;
        }
        Integer this$stockSens = this.getStockSens();
        Integer other$stockSens = other.getStockSens();
        if (this$stockSens == null ? other$stockSens != null : !((Object)this$stockSens).equals(other$stockSens)) {
            return false;
        }
        Integer this$costAffec = this.getCostAffec();
        Integer other$costAffec = other.getCostAffec();
        if (this$costAffec == null ? other$costAffec != null : !((Object)this$costAffec).equals(other$costAffec)) {
            return false;
        }
        Integer this$BOMAffec = this.getBOMAffec();
        Integer other$BOMAffec = other.getBOMAffec();
        if (this$BOMAffec == null ? other$BOMAffec != null : !((Object)this$BOMAffec).equals(other$BOMAffec)) {
            return false;
        }
        Integer this$manuAffec = this.getManuAffec();
        Integer other$manuAffec = other.getManuAffec();
        if (this$manuAffec == null ? other$manuAffec != null : !((Object)this$manuAffec).equals(other$manuAffec)) {
            return false;
        }
        Integer this$priceAffec = this.getPriceAffec();
        Integer other$priceAffec = other.getPriceAffec();
        if (this$priceAffec == null ? other$priceAffec != null : !((Object)this$priceAffec).equals(other$priceAffec)) {
            return false;
        }
        Integer this$edAffec = this.getEdAffec();
        Integer other$edAffec = other.getEdAffec();
        if (this$edAffec == null ? other$edAffec != null : !((Object)this$edAffec).equals(other$edAffec)) {
            return false;
        }
        String this$characterCode = this.getCharacterCode();
        String other$characterCode = other.getCharacterCode();
        return !(this$characterCode == null ? other$characterCode != null : !this$characterCode.equals(other$characterCode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductCheckFreeMergeDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Long $productDetailId = this.getProductDetailId();
        result = result * 59 + ($productDetailId == null ? 43 : ((Object)$productDetailId).hashCode());
        Long $productApplyRangeId = this.getProductApplyRangeId();
        result = result * 59 + ($productApplyRangeId == null ? 43 : ((Object)$productApplyRangeId).hashCode());
        Long $template = this.getTemplate();
        result = result * 59 + ($template == null ? 43 : ((Object)$template).hashCode());
        Long $characteristicsType = this.getCharacteristicsType();
        result = result * 59 + ($characteristicsType == null ? 43 : ((Object)$characteristicsType).hashCode());
        Long $characteristics = this.getCharacteristics();
        result = result * 59 + ($characteristics == null ? 43 : ((Object)$characteristics).hashCode());
        Long $character = this.getCharacter();
        result = result * 59 + ($character == null ? 43 : ((Object)$character).hashCode());
        Integer $skuSens = this.getSkuSens();
        result = result * 59 + ($skuSens == null ? 43 : ((Object)$skuSens).hashCode());
        Integer $batchSens = this.getBatchSens();
        result = result * 59 + ($batchSens == null ? 43 : ((Object)$batchSens).hashCode());
        Integer $SNSens = this.getSNSens();
        result = result * 59 + ($SNSens == null ? 43 : ((Object)$SNSens).hashCode());
        Integer $stockSens = this.getStockSens();
        result = result * 59 + ($stockSens == null ? 43 : ((Object)$stockSens).hashCode());
        Integer $costAffec = this.getCostAffec();
        result = result * 59 + ($costAffec == null ? 43 : ((Object)$costAffec).hashCode());
        Integer $BOMAffec = this.getBOMAffec();
        result = result * 59 + ($BOMAffec == null ? 43 : ((Object)$BOMAffec).hashCode());
        Integer $manuAffec = this.getManuAffec();
        result = result * 59 + ($manuAffec == null ? 43 : ((Object)$manuAffec).hashCode());
        Integer $priceAffec = this.getPriceAffec();
        result = result * 59 + ($priceAffec == null ? 43 : ((Object)$priceAffec).hashCode());
        Integer $edAffec = this.getEdAffec();
        result = result * 59 + ($edAffec == null ? 43 : ((Object)$edAffec).hashCode());
        String $characterCode = this.getCharacterCode();
        result = result * 59 + ($characterCode == null ? 43 : $characterCode.hashCode());
        return result;
    }

    public String toString() {
        return "ProductCheckFreeMergeDTO(productId=" + this.getProductId() + ", productDetailId=" + this.getProductDetailId() + ", productApplyRangeId=" + this.getProductApplyRangeId() + ", template=" + this.getTemplate() + ", characteristicsType=" + this.getCharacteristicsType() + ", characteristics=" + this.getCharacteristics() + ", character=" + this.getCharacter() + ", characterCode=" + this.getCharacterCode() + ", skuSens=" + this.getSkuSens() + ", batchSens=" + this.getBatchSens() + ", SNSens=" + this.getSNSens() + ", stockSens=" + this.getStockSens() + ", costAffec=" + this.getCostAffec() + ", BOMAffec=" + this.getBOMAffec() + ", manuAffec=" + this.getManuAffec() + ", priceAffec=" + this.getPriceAffec() + ", edAffec=" + this.getEdAffec() + ")";
    }
}

