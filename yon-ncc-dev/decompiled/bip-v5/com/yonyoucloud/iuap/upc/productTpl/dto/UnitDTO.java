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
public class UnitDTO {
    Long unit;
    String unitName;
    Long purchaseUnit;
    String purchaseUnitName;
    Long purchasePriceUnit;
    String purchasePriceUnitName;
    Long stockUnit;
    String stockUnitName;
    Long batchUnit;
    String batchUnitName;
    Long onlineUnit;
    String onlineUnitName;
    Long offlineUnit;
    String offlineUnitName;
    Long requireUnit;
    String requireUnitName;
    Long batchPriceUnit;
    String batchPriceUnitName;
    Long produceUnit;
    String produceUnitName;
    Boolean enableAssistUnit;

    public Long getUnit() {
        return this.unit;
    }

    public String getUnitName() {
        return this.unitName;
    }

    public Long getPurchaseUnit() {
        return this.purchaseUnit;
    }

    public String getPurchaseUnitName() {
        return this.purchaseUnitName;
    }

    public Long getPurchasePriceUnit() {
        return this.purchasePriceUnit;
    }

    public String getPurchasePriceUnitName() {
        return this.purchasePriceUnitName;
    }

    public Long getStockUnit() {
        return this.stockUnit;
    }

    public String getStockUnitName() {
        return this.stockUnitName;
    }

    public Long getBatchUnit() {
        return this.batchUnit;
    }

    public String getBatchUnitName() {
        return this.batchUnitName;
    }

    public Long getOnlineUnit() {
        return this.onlineUnit;
    }

    public String getOnlineUnitName() {
        return this.onlineUnitName;
    }

    public Long getOfflineUnit() {
        return this.offlineUnit;
    }

    public String getOfflineUnitName() {
        return this.offlineUnitName;
    }

    public Long getRequireUnit() {
        return this.requireUnit;
    }

    public String getRequireUnitName() {
        return this.requireUnitName;
    }

    public Long getBatchPriceUnit() {
        return this.batchPriceUnit;
    }

    public String getBatchPriceUnitName() {
        return this.batchPriceUnitName;
    }

    public Long getProduceUnit() {
        return this.produceUnit;
    }

    public String getProduceUnitName() {
        return this.produceUnitName;
    }

    public Boolean getEnableAssistUnit() {
        return this.enableAssistUnit;
    }

    public void setUnit(Long unit) {
        this.unit = unit;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setPurchaseUnit(Long purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }

    public void setPurchaseUnitName(String purchaseUnitName) {
        this.purchaseUnitName = purchaseUnitName;
    }

    public void setPurchasePriceUnit(Long purchasePriceUnit) {
        this.purchasePriceUnit = purchasePriceUnit;
    }

    public void setPurchasePriceUnitName(String purchasePriceUnitName) {
        this.purchasePriceUnitName = purchasePriceUnitName;
    }

    public void setStockUnit(Long stockUnit) {
        this.stockUnit = stockUnit;
    }

    public void setStockUnitName(String stockUnitName) {
        this.stockUnitName = stockUnitName;
    }

    public void setBatchUnit(Long batchUnit) {
        this.batchUnit = batchUnit;
    }

    public void setBatchUnitName(String batchUnitName) {
        this.batchUnitName = batchUnitName;
    }

    public void setOnlineUnit(Long onlineUnit) {
        this.onlineUnit = onlineUnit;
    }

    public void setOnlineUnitName(String onlineUnitName) {
        this.onlineUnitName = onlineUnitName;
    }

    public void setOfflineUnit(Long offlineUnit) {
        this.offlineUnit = offlineUnit;
    }

    public void setOfflineUnitName(String offlineUnitName) {
        this.offlineUnitName = offlineUnitName;
    }

    public void setRequireUnit(Long requireUnit) {
        this.requireUnit = requireUnit;
    }

    public void setRequireUnitName(String requireUnitName) {
        this.requireUnitName = requireUnitName;
    }

    public void setBatchPriceUnit(Long batchPriceUnit) {
        this.batchPriceUnit = batchPriceUnit;
    }

    public void setBatchPriceUnitName(String batchPriceUnitName) {
        this.batchPriceUnitName = batchPriceUnitName;
    }

    public void setProduceUnit(Long produceUnit) {
        this.produceUnit = produceUnit;
    }

    public void setProduceUnitName(String produceUnitName) {
        this.produceUnitName = produceUnitName;
    }

    public void setEnableAssistUnit(Boolean enableAssistUnit) {
        this.enableAssistUnit = enableAssistUnit;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UnitDTO)) {
            return false;
        }
        UnitDTO other = (UnitDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$unit = this.getUnit();
        Long other$unit = other.getUnit();
        if (this$unit == null ? other$unit != null : !((Object)this$unit).equals(other$unit)) {
            return false;
        }
        Long this$purchaseUnit = this.getPurchaseUnit();
        Long other$purchaseUnit = other.getPurchaseUnit();
        if (this$purchaseUnit == null ? other$purchaseUnit != null : !((Object)this$purchaseUnit).equals(other$purchaseUnit)) {
            return false;
        }
        Long this$purchasePriceUnit = this.getPurchasePriceUnit();
        Long other$purchasePriceUnit = other.getPurchasePriceUnit();
        if (this$purchasePriceUnit == null ? other$purchasePriceUnit != null : !((Object)this$purchasePriceUnit).equals(other$purchasePriceUnit)) {
            return false;
        }
        Long this$stockUnit = this.getStockUnit();
        Long other$stockUnit = other.getStockUnit();
        if (this$stockUnit == null ? other$stockUnit != null : !((Object)this$stockUnit).equals(other$stockUnit)) {
            return false;
        }
        Long this$batchUnit = this.getBatchUnit();
        Long other$batchUnit = other.getBatchUnit();
        if (this$batchUnit == null ? other$batchUnit != null : !((Object)this$batchUnit).equals(other$batchUnit)) {
            return false;
        }
        Long this$onlineUnit = this.getOnlineUnit();
        Long other$onlineUnit = other.getOnlineUnit();
        if (this$onlineUnit == null ? other$onlineUnit != null : !((Object)this$onlineUnit).equals(other$onlineUnit)) {
            return false;
        }
        Long this$offlineUnit = this.getOfflineUnit();
        Long other$offlineUnit = other.getOfflineUnit();
        if (this$offlineUnit == null ? other$offlineUnit != null : !((Object)this$offlineUnit).equals(other$offlineUnit)) {
            return false;
        }
        Long this$requireUnit = this.getRequireUnit();
        Long other$requireUnit = other.getRequireUnit();
        if (this$requireUnit == null ? other$requireUnit != null : !((Object)this$requireUnit).equals(other$requireUnit)) {
            return false;
        }
        Long this$batchPriceUnit = this.getBatchPriceUnit();
        Long other$batchPriceUnit = other.getBatchPriceUnit();
        if (this$batchPriceUnit == null ? other$batchPriceUnit != null : !((Object)this$batchPriceUnit).equals(other$batchPriceUnit)) {
            return false;
        }
        Long this$produceUnit = this.getProduceUnit();
        Long other$produceUnit = other.getProduceUnit();
        if (this$produceUnit == null ? other$produceUnit != null : !((Object)this$produceUnit).equals(other$produceUnit)) {
            return false;
        }
        Boolean this$enableAssistUnit = this.getEnableAssistUnit();
        Boolean other$enableAssistUnit = other.getEnableAssistUnit();
        if (this$enableAssistUnit == null ? other$enableAssistUnit != null : !((Object)this$enableAssistUnit).equals(other$enableAssistUnit)) {
            return false;
        }
        String this$unitName = this.getUnitName();
        String other$unitName = other.getUnitName();
        if (this$unitName == null ? other$unitName != null : !this$unitName.equals(other$unitName)) {
            return false;
        }
        String this$purchaseUnitName = this.getPurchaseUnitName();
        String other$purchaseUnitName = other.getPurchaseUnitName();
        if (this$purchaseUnitName == null ? other$purchaseUnitName != null : !this$purchaseUnitName.equals(other$purchaseUnitName)) {
            return false;
        }
        String this$purchasePriceUnitName = this.getPurchasePriceUnitName();
        String other$purchasePriceUnitName = other.getPurchasePriceUnitName();
        if (this$purchasePriceUnitName == null ? other$purchasePriceUnitName != null : !this$purchasePriceUnitName.equals(other$purchasePriceUnitName)) {
            return false;
        }
        String this$stockUnitName = this.getStockUnitName();
        String other$stockUnitName = other.getStockUnitName();
        if (this$stockUnitName == null ? other$stockUnitName != null : !this$stockUnitName.equals(other$stockUnitName)) {
            return false;
        }
        String this$batchUnitName = this.getBatchUnitName();
        String other$batchUnitName = other.getBatchUnitName();
        if (this$batchUnitName == null ? other$batchUnitName != null : !this$batchUnitName.equals(other$batchUnitName)) {
            return false;
        }
        String this$onlineUnitName = this.getOnlineUnitName();
        String other$onlineUnitName = other.getOnlineUnitName();
        if (this$onlineUnitName == null ? other$onlineUnitName != null : !this$onlineUnitName.equals(other$onlineUnitName)) {
            return false;
        }
        String this$offlineUnitName = this.getOfflineUnitName();
        String other$offlineUnitName = other.getOfflineUnitName();
        if (this$offlineUnitName == null ? other$offlineUnitName != null : !this$offlineUnitName.equals(other$offlineUnitName)) {
            return false;
        }
        String this$requireUnitName = this.getRequireUnitName();
        String other$requireUnitName = other.getRequireUnitName();
        if (this$requireUnitName == null ? other$requireUnitName != null : !this$requireUnitName.equals(other$requireUnitName)) {
            return false;
        }
        String this$batchPriceUnitName = this.getBatchPriceUnitName();
        String other$batchPriceUnitName = other.getBatchPriceUnitName();
        if (this$batchPriceUnitName == null ? other$batchPriceUnitName != null : !this$batchPriceUnitName.equals(other$batchPriceUnitName)) {
            return false;
        }
        String this$produceUnitName = this.getProduceUnitName();
        String other$produceUnitName = other.getProduceUnitName();
        return !(this$produceUnitName == null ? other$produceUnitName != null : !this$produceUnitName.equals(other$produceUnitName));
    }

    protected boolean canEqual(Object other) {
        return other instanceof UnitDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $unit = this.getUnit();
        result = result * 59 + ($unit == null ? 43 : ((Object)$unit).hashCode());
        Long $purchaseUnit = this.getPurchaseUnit();
        result = result * 59 + ($purchaseUnit == null ? 43 : ((Object)$purchaseUnit).hashCode());
        Long $purchasePriceUnit = this.getPurchasePriceUnit();
        result = result * 59 + ($purchasePriceUnit == null ? 43 : ((Object)$purchasePriceUnit).hashCode());
        Long $stockUnit = this.getStockUnit();
        result = result * 59 + ($stockUnit == null ? 43 : ((Object)$stockUnit).hashCode());
        Long $batchUnit = this.getBatchUnit();
        result = result * 59 + ($batchUnit == null ? 43 : ((Object)$batchUnit).hashCode());
        Long $onlineUnit = this.getOnlineUnit();
        result = result * 59 + ($onlineUnit == null ? 43 : ((Object)$onlineUnit).hashCode());
        Long $offlineUnit = this.getOfflineUnit();
        result = result * 59 + ($offlineUnit == null ? 43 : ((Object)$offlineUnit).hashCode());
        Long $requireUnit = this.getRequireUnit();
        result = result * 59 + ($requireUnit == null ? 43 : ((Object)$requireUnit).hashCode());
        Long $batchPriceUnit = this.getBatchPriceUnit();
        result = result * 59 + ($batchPriceUnit == null ? 43 : ((Object)$batchPriceUnit).hashCode());
        Long $produceUnit = this.getProduceUnit();
        result = result * 59 + ($produceUnit == null ? 43 : ((Object)$produceUnit).hashCode());
        Boolean $enableAssistUnit = this.getEnableAssistUnit();
        result = result * 59 + ($enableAssistUnit == null ? 43 : ((Object)$enableAssistUnit).hashCode());
        String $unitName = this.getUnitName();
        result = result * 59 + ($unitName == null ? 43 : $unitName.hashCode());
        String $purchaseUnitName = this.getPurchaseUnitName();
        result = result * 59 + ($purchaseUnitName == null ? 43 : $purchaseUnitName.hashCode());
        String $purchasePriceUnitName = this.getPurchasePriceUnitName();
        result = result * 59 + ($purchasePriceUnitName == null ? 43 : $purchasePriceUnitName.hashCode());
        String $stockUnitName = this.getStockUnitName();
        result = result * 59 + ($stockUnitName == null ? 43 : $stockUnitName.hashCode());
        String $batchUnitName = this.getBatchUnitName();
        result = result * 59 + ($batchUnitName == null ? 43 : $batchUnitName.hashCode());
        String $onlineUnitName = this.getOnlineUnitName();
        result = result * 59 + ($onlineUnitName == null ? 43 : $onlineUnitName.hashCode());
        String $offlineUnitName = this.getOfflineUnitName();
        result = result * 59 + ($offlineUnitName == null ? 43 : $offlineUnitName.hashCode());
        String $requireUnitName = this.getRequireUnitName();
        result = result * 59 + ($requireUnitName == null ? 43 : $requireUnitName.hashCode());
        String $batchPriceUnitName = this.getBatchPriceUnitName();
        result = result * 59 + ($batchPriceUnitName == null ? 43 : $batchPriceUnitName.hashCode());
        String $produceUnitName = this.getProduceUnitName();
        result = result * 59 + ($produceUnitName == null ? 43 : $produceUnitName.hashCode());
        return result;
    }

    public String toString() {
        return "UnitDTO(unit=" + this.getUnit() + ", unitName=" + this.getUnitName() + ", purchaseUnit=" + this.getPurchaseUnit() + ", purchaseUnitName=" + this.getPurchaseUnitName() + ", purchasePriceUnit=" + this.getPurchasePriceUnit() + ", purchasePriceUnitName=" + this.getPurchasePriceUnitName() + ", stockUnit=" + this.getStockUnit() + ", stockUnitName=" + this.getStockUnitName() + ", batchUnit=" + this.getBatchUnit() + ", batchUnitName=" + this.getBatchUnitName() + ", onlineUnit=" + this.getOnlineUnit() + ", onlineUnitName=" + this.getOnlineUnitName() + ", offlineUnit=" + this.getOfflineUnit() + ", offlineUnitName=" + this.getOfflineUnitName() + ", requireUnit=" + this.getRequireUnit() + ", requireUnitName=" + this.getRequireUnitName() + ", batchPriceUnit=" + this.getBatchPriceUnit() + ", batchPriceUnitName=" + this.getBatchPriceUnitName() + ", produceUnit=" + this.getProduceUnit() + ", produceUnitName=" + this.getProduceUnitName() + ", enableAssistUnit=" + this.getEnableAssistUnit() + ")";
    }
}

