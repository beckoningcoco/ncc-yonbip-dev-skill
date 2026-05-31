/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo.productTpl.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class FreeCTCharacterVO {
    Long characteristics;
    Long characteristicsType;
    String characteristicsName;
    String characterCode;
    Integer characterOrder;
    Integer twoDimensionalInput;
    Integer bomAffec;
    Integer snSens;
    Integer batchSens;
    Integer costAffec;
    Integer manuAffec;
    Integer priceAffec;
    Integer skuSens;
    Integer stockSens;

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

    public Integer getCharacterOrder() {
        return this.characterOrder;
    }

    public Integer getTwoDimensionalInput() {
        return this.twoDimensionalInput;
    }

    public Integer getBomAffec() {
        return this.bomAffec;
    }

    public Integer getSnSens() {
        return this.snSens;
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

    public void setCharacterOrder(Integer characterOrder) {
        this.characterOrder = characterOrder;
    }

    public void setTwoDimensionalInput(Integer twoDimensionalInput) {
        this.twoDimensionalInput = twoDimensionalInput;
    }

    public void setBomAffec(Integer bomAffec) {
        this.bomAffec = bomAffec;
    }

    public void setSnSens(Integer snSens) {
        this.snSens = snSens;
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

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof FreeCTCharacterVO)) {
            return false;
        }
        FreeCTCharacterVO other = (FreeCTCharacterVO)o;
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
        Integer this$characterOrder = this.getCharacterOrder();
        Integer other$characterOrder = other.getCharacterOrder();
        if (this$characterOrder == null ? other$characterOrder != null : !((Object)this$characterOrder).equals(other$characterOrder)) {
            return false;
        }
        Integer this$twoDimensionalInput = this.getTwoDimensionalInput();
        Integer other$twoDimensionalInput = other.getTwoDimensionalInput();
        if (this$twoDimensionalInput == null ? other$twoDimensionalInput != null : !((Object)this$twoDimensionalInput).equals(other$twoDimensionalInput)) {
            return false;
        }
        Integer this$bomAffec = this.getBomAffec();
        Integer other$bomAffec = other.getBomAffec();
        if (this$bomAffec == null ? other$bomAffec != null : !((Object)this$bomAffec).equals(other$bomAffec)) {
            return false;
        }
        Integer this$snSens = this.getSnSens();
        Integer other$snSens = other.getSnSens();
        if (this$snSens == null ? other$snSens != null : !((Object)this$snSens).equals(other$snSens)) {
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
        return !(this$characterCode == null ? other$characterCode != null : !this$characterCode.equals(other$characterCode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof FreeCTCharacterVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $characteristics = this.getCharacteristics();
        result = result * 59 + ($characteristics == null ? 43 : ((Object)$characteristics).hashCode());
        Long $characteristicsType = this.getCharacteristicsType();
        result = result * 59 + ($characteristicsType == null ? 43 : ((Object)$characteristicsType).hashCode());
        Integer $characterOrder = this.getCharacterOrder();
        result = result * 59 + ($characterOrder == null ? 43 : ((Object)$characterOrder).hashCode());
        Integer $twoDimensionalInput = this.getTwoDimensionalInput();
        result = result * 59 + ($twoDimensionalInput == null ? 43 : ((Object)$twoDimensionalInput).hashCode());
        Integer $bomAffec = this.getBomAffec();
        result = result * 59 + ($bomAffec == null ? 43 : ((Object)$bomAffec).hashCode());
        Integer $snSens = this.getSnSens();
        result = result * 59 + ($snSens == null ? 43 : ((Object)$snSens).hashCode());
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
        return result;
    }

    public String toString() {
        return "FreeCTCharacterVO(characteristics=" + this.getCharacteristics() + ", characteristicsType=" + this.getCharacteristicsType() + ", characteristicsName=" + this.getCharacteristicsName() + ", characterCode=" + this.getCharacterCode() + ", characterOrder=" + this.getCharacterOrder() + ", twoDimensionalInput=" + this.getTwoDimensionalInput() + ", bomAffec=" + this.getBomAffec() + ", snSens=" + this.getSnSens() + ", batchSens=" + this.getBatchSens() + ", costAffec=" + this.getCostAffec() + ", manuAffec=" + this.getManuAffec() + ", priceAffec=" + this.getPriceAffec() + ", skuSens=" + this.getSkuSens() + ", stockSens=" + this.getStockSens() + ")";
    }
}

