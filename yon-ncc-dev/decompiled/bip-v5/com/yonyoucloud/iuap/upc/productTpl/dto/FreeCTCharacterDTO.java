/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.productTpl.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class FreeCTCharacterDTO {
    Long characteristics;
    Long characteristicsType;
    String characteristicsName;
    String characterCode;
    Integer dataType;
    Integer iOrder;
    Integer twoDimensionalInput;
    Integer BOMAffec;
    Integer SNSens;
    Integer batchSens;
    Integer costAffec;
    Integer manuAffec;
    Integer priceAffec;
    Integer skuSens;
    Integer stockSens;
    String characterName;

    public Long getCharacteristics() {
        return this.characteristics;
    }

    public Long getCharacteristicsType() {
        return this.characteristicsType;
    }

    public String getCharacteristicsName() {
        return this.characteristicsName;
    }

    public String getCharacterCode() {
        return this.characterCode;
    }

    public Integer getDataType() {
        return this.dataType;
    }

    public Integer getIOrder() {
        return this.iOrder;
    }

    public Integer getTwoDimensionalInput() {
        return this.twoDimensionalInput;
    }

    public Integer getBOMAffec() {
        return this.BOMAffec;
    }

    public Integer getSNSens() {
        return this.SNSens;
    }

    public Integer getBatchSens() {
        return this.batchSens;
    }

    public Integer getCostAffec() {
        return this.costAffec;
    }

    public Integer getManuAffec() {
        return this.manuAffec;
    }

    public Integer getPriceAffec() {
        return this.priceAffec;
    }

    public Integer getSkuSens() {
        return this.skuSens;
    }

    public Integer getStockSens() {
        return this.stockSens;
    }

    public String getCharacterName() {
        return this.characterName;
    }

    public void setCharacteristics(Long characteristics) {
        this.characteristics = characteristics;
    }

    public void setCharacteristicsType(Long characteristicsType) {
        this.characteristicsType = characteristicsType;
    }

    public void setCharacteristicsName(String characteristicsName) {
        this.characteristicsName = characteristicsName;
    }

    public void setCharacterCode(String characterCode) {
        this.characterCode = characterCode;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public void setIOrder(Integer iOrder) {
        this.iOrder = iOrder;
    }

    public void setTwoDimensionalInput(Integer twoDimensionalInput) {
        this.twoDimensionalInput = twoDimensionalInput;
    }

    public void setBOMAffec(Integer BOMAffec) {
        this.BOMAffec = BOMAffec;
    }

    public void setSNSens(Integer SNSens) {
        this.SNSens = SNSens;
    }

    public void setBatchSens(Integer batchSens) {
        this.batchSens = batchSens;
    }

    public void setCostAffec(Integer costAffec) {
        this.costAffec = costAffec;
    }

    public void setManuAffec(Integer manuAffec) {
        this.manuAffec = manuAffec;
    }

    public void setPriceAffec(Integer priceAffec) {
        this.priceAffec = priceAffec;
    }

    public void setSkuSens(Integer skuSens) {
        this.skuSens = skuSens;
    }

    public void setStockSens(Integer stockSens) {
        this.stockSens = stockSens;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof FreeCTCharacterDTO)) {
            return false;
        }
        FreeCTCharacterDTO other = (FreeCTCharacterDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$characteristics = this.getCharacteristics();
        Long other$characteristics = other.getCharacteristics();
        if (this$characteristics == null ? other$characteristics != null : !((Object)this$characteristics).equals(other$characteristics)) {
            return false;
        }
        Long this$characteristicsType = this.getCharacteristicsType();
        Long other$characteristicsType = other.getCharacteristicsType();
        if (this$characteristicsType == null ? other$characteristicsType != null : !((Object)this$characteristicsType).equals(other$characteristicsType)) {
            return false;
        }
        Integer this$dataType = this.getDataType();
        Integer other$dataType = other.getDataType();
        if (this$dataType == null ? other$dataType != null : !((Object)this$dataType).equals(other$dataType)) {
            return false;
        }
        Integer this$iOrder = this.getIOrder();
        Integer other$iOrder = other.getIOrder();
        if (this$iOrder == null ? other$iOrder != null : !((Object)this$iOrder).equals(other$iOrder)) {
            return false;
        }
        Integer this$twoDimensionalInput = this.getTwoDimensionalInput();
        Integer other$twoDimensionalInput = other.getTwoDimensionalInput();
        if (this$twoDimensionalInput == null ? other$twoDimensionalInput != null : !((Object)this$twoDimensionalInput).equals(other$twoDimensionalInput)) {
            return false;
        }
        Integer this$BOMAffec = this.getBOMAffec();
        Integer other$BOMAffec = other.getBOMAffec();
        if (this$BOMAffec == null ? other$BOMAffec != null : !((Object)this$BOMAffec).equals(other$BOMAffec)) {
            return false;
        }
        Integer this$SNSens = this.getSNSens();
        Integer other$SNSens = other.getSNSens();
        if (this$SNSens == null ? other$SNSens != null : !((Object)this$SNSens).equals(other$SNSens)) {
            return false;
        }
        Integer this$batchSens = this.getBatchSens();
        Integer other$batchSens = other.getBatchSens();
        if (this$batchSens == null ? other$batchSens != null : !((Object)this$batchSens).equals(other$batchSens)) {
            return false;
        }
        Integer this$costAffec = this.getCostAffec();
        Integer other$costAffec = other.getCostAffec();
        if (this$costAffec == null ? other$costAffec != null : !((Object)this$costAffec).equals(other$costAffec)) {
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
        Integer this$skuSens = this.getSkuSens();
        Integer other$skuSens = other.getSkuSens();
        if (this$skuSens == null ? other$skuSens != null : !((Object)this$skuSens).equals(other$skuSens)) {
            return false;
        }
        Integer this$stockSens = this.getStockSens();
        Integer other$stockSens = other.getStockSens();
        if (this$stockSens == null ? other$stockSens != null : !((Object)this$stockSens).equals(other$stockSens)) {
            return false;
        }
        String this$characteristicsName = this.getCharacteristicsName();
        String other$characteristicsName = other.getCharacteristicsName();
        if (this$characteristicsName == null ? other$characteristicsName != null : !this$characteristicsName.equals(other$characteristicsName)) {
            return false;
        }
        String this$characterCode = this.getCharacterCode();
        String other$characterCode = other.getCharacterCode();
        if (this$characterCode == null ? other$characterCode != null : !this$characterCode.equals(other$characterCode)) {
            return false;
        }
        String this$characterName = this.getCharacterName();
        String other$characterName = other.getCharacterName();
        return !(this$characterName == null ? other$characterName != null : !this$characterName.equals(other$characterName));
    }

    protected boolean canEqual(Object other) {
        return other instanceof FreeCTCharacterDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $characteristics = this.getCharacteristics();
        result = result * 59 + ($characteristics == null ? 43 : ((Object)$characteristics).hashCode());
        Long $characteristicsType = this.getCharacteristicsType();
        result = result * 59 + ($characteristicsType == null ? 43 : ((Object)$characteristicsType).hashCode());
        Integer $dataType = this.getDataType();
        result = result * 59 + ($dataType == null ? 43 : ((Object)$dataType).hashCode());
        Integer $iOrder = this.getIOrder();
        result = result * 59 + ($iOrder == null ? 43 : ((Object)$iOrder).hashCode());
        Integer $twoDimensionalInput = this.getTwoDimensionalInput();
        result = result * 59 + ($twoDimensionalInput == null ? 43 : ((Object)$twoDimensionalInput).hashCode());
        Integer $BOMAffec = this.getBOMAffec();
        result = result * 59 + ($BOMAffec == null ? 43 : ((Object)$BOMAffec).hashCode());
        Integer $SNSens = this.getSNSens();
        result = result * 59 + ($SNSens == null ? 43 : ((Object)$SNSens).hashCode());
        Integer $batchSens = this.getBatchSens();
        result = result * 59 + ($batchSens == null ? 43 : ((Object)$batchSens).hashCode());
        Integer $costAffec = this.getCostAffec();
        result = result * 59 + ($costAffec == null ? 43 : ((Object)$costAffec).hashCode());
        Integer $manuAffec = this.getManuAffec();
        result = result * 59 + ($manuAffec == null ? 43 : ((Object)$manuAffec).hashCode());
        Integer $priceAffec = this.getPriceAffec();
        result = result * 59 + ($priceAffec == null ? 43 : ((Object)$priceAffec).hashCode());
        Integer $skuSens = this.getSkuSens();
        result = result * 59 + ($skuSens == null ? 43 : ((Object)$skuSens).hashCode());
        Integer $stockSens = this.getStockSens();
        result = result * 59 + ($stockSens == null ? 43 : ((Object)$stockSens).hashCode());
        String $characteristicsName = this.getCharacteristicsName();
        result = result * 59 + ($characteristicsName == null ? 43 : $characteristicsName.hashCode());
        String $characterCode = this.getCharacterCode();
        result = result * 59 + ($characterCode == null ? 43 : $characterCode.hashCode());
        String $characterName = this.getCharacterName();
        result = result * 59 + ($characterName == null ? 43 : $characterName.hashCode());
        return result;
    }

    public String toString() {
        return "FreeCTCharacterDTO(characteristics=" + this.getCharacteristics() + ", characteristicsType=" + this.getCharacteristicsType() + ", characteristicsName=" + this.getCharacteristicsName() + ", characterCode=" + this.getCharacterCode() + ", dataType=" + this.getDataType() + ", iOrder=" + this.getIOrder() + ", twoDimensionalInput=" + this.getTwoDimensionalInput() + ", BOMAffec=" + this.getBOMAffec() + ", SNSens=" + this.getSNSens() + ", batchSens=" + this.getBatchSens() + ", costAffec=" + this.getCostAffec() + ", manuAffec=" + this.getManuAffec() + ", priceAffec=" + this.getPriceAffec() + ", skuSens=" + this.getSkuSens() + ", stockSens=" + this.getStockSens() + ", characterName=" + this.getCharacterName() + ")";
    }
}

