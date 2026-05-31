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
import java.util.Date;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductTplCharacterDTO
implements Serializable {
    private Long product;
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
    private Integer PriceAffec;
    private int order = 0;
    private Date stopDate;
    private Integer twoDimensionalInput;

    public ProductTplCharacterDTO(Long product, Long template, Long characteristicsType, Long characteristics, Long character, String characterCode, Integer skuSens, Integer batchSens, Integer SNSens, Integer stockSens, Integer costAffec, Integer BOMAffec, Integer manuAffec, Integer priceAffec, Integer twoDimensionalInput, Integer order, Date stopDate) {
        this.product = product;
        this.template = template;
        this.characteristicsType = characteristicsType;
        this.characteristics = characteristics;
        this.character = character;
        this.characterCode = characterCode;
        this.skuSens = skuSens;
        this.batchSens = batchSens;
        this.SNSens = SNSens;
        this.stockSens = stockSens;
        this.costAffec = costAffec;
        this.BOMAffec = BOMAffec;
        this.manuAffec = manuAffec;
        this.PriceAffec = priceAffec;
        this.twoDimensionalInput = twoDimensionalInput;
        this.order = order;
        this.stopDate = stopDate;
    }

    public ProductTplCharacterDTO() {
    }

    public Long getProduct() {
        return this.product;
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
        return this.PriceAffec;
    }

    public int getOrder() {
        return this.order;
    }

    public Date getStopDate() {
        return this.stopDate;
    }

    public Integer getTwoDimensionalInput() {
        return this.twoDimensionalInput;
    }

    public void setProduct(Long product) {
        this.product = product;
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

    public void setPriceAffec(Integer PriceAffec) {
        this.PriceAffec = PriceAffec;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
    }

    public void setTwoDimensionalInput(Integer twoDimensionalInput) {
        this.twoDimensionalInput = twoDimensionalInput;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductTplCharacterDTO)) {
            return false;
        }
        ProductTplCharacterDTO other = (ProductTplCharacterDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getOrder() != other.getOrder()) {
            return false;
        }
        Long this$product = this.getProduct();
        Long other$product = other.getProduct();
        if (this$product == null ? other$product != null : !((Object)this$product).equals(other$product)) {
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
        Integer this$PriceAffec = this.getPriceAffec();
        Integer other$PriceAffec = other.getPriceAffec();
        if (this$PriceAffec == null ? other$PriceAffec != null : !((Object)this$PriceAffec).equals(other$PriceAffec)) {
            return false;
        }
        Integer this$twoDimensionalInput = this.getTwoDimensionalInput();
        Integer other$twoDimensionalInput = other.getTwoDimensionalInput();
        if (this$twoDimensionalInput == null ? other$twoDimensionalInput != null : !((Object)this$twoDimensionalInput).equals(other$twoDimensionalInput)) {
            return false;
        }
        String this$characterCode = this.getCharacterCode();
        String other$characterCode = other.getCharacterCode();
        if (this$characterCode == null ? other$characterCode != null : !this$characterCode.equals(other$characterCode)) {
            return false;
        }
        Date this$stopDate = this.getStopDate();
        Date other$stopDate = other.getStopDate();
        return !(this$stopDate == null ? other$stopDate != null : !((Object)this$stopDate).equals(other$stopDate));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTplCharacterDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getOrder();
        Long $product = this.getProduct();
        result = result * 59 + ($product == null ? 43 : ((Object)$product).hashCode());
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
        Integer $PriceAffec = this.getPriceAffec();
        result = result * 59 + ($PriceAffec == null ? 43 : ((Object)$PriceAffec).hashCode());
        Integer $twoDimensionalInput = this.getTwoDimensionalInput();
        result = result * 59 + ($twoDimensionalInput == null ? 43 : ((Object)$twoDimensionalInput).hashCode());
        String $characterCode = this.getCharacterCode();
        result = result * 59 + ($characterCode == null ? 43 : $characterCode.hashCode());
        Date $stopDate = this.getStopDate();
        result = result * 59 + ($stopDate == null ? 43 : ((Object)$stopDate).hashCode());
        return result;
    }

    public String toString() {
        return "ProductTplCharacterDTO(product=" + this.getProduct() + ", template=" + this.getTemplate() + ", characteristicsType=" + this.getCharacteristicsType() + ", characteristics=" + this.getCharacteristics() + ", character=" + this.getCharacter() + ", characterCode=" + this.getCharacterCode() + ", skuSens=" + this.getSkuSens() + ", batchSens=" + this.getBatchSens() + ", SNSens=" + this.getSNSens() + ", stockSens=" + this.getStockSens() + ", costAffec=" + this.getCostAffec() + ", BOMAffec=" + this.getBOMAffec() + ", manuAffec=" + this.getManuAffec() + ", PriceAffec=" + this.getPriceAffec() + ", order=" + this.getOrder() + ", stopDate=" + this.getStopDate() + ", twoDimensionalInput=" + this.getTwoDimensionalInput() + ")";
    }
}

