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
import java.math.BigDecimal;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductTplUnitDTO
implements Serializable {
    private Long template;
    private Boolean enableAssistUnit;
    private Long unit;
    private String unitCode;
    private String unitName;
    private Integer unitPrecision;
    private Integer unitTruncationType;
    private BigDecimal unitConvertCoefficient;
    private Long purchaseUnit;
    private Long stockUnit;
    private Long produceUnit;
    private Long batchUnit;
    private Long onlineUnit;
    private Long offlineUnit;
    private Long requireUnit;
    private Long batchPriceUnit;
    private Long purchasePriceUnit;
    private Long inspectionUnit;

    public Long getTemplate() {
        return this.template;
    }

    public Boolean getEnableAssistUnit() {
        return this.enableAssistUnit;
    }

    public Long getUnit() {
        return this.unit;
    }

    public String getUnitCode() {
        return this.unitCode;
    }

    public String getUnitName() {
        return this.unitName;
    }

    public Integer getUnitPrecision() {
        return this.unitPrecision;
    }

    public Integer getUnitTruncationType() {
        return this.unitTruncationType;
    }

    public BigDecimal getUnitConvertCoefficient() {
        return this.unitConvertCoefficient;
    }

    public Long getPurchaseUnit() {
        return this.purchaseUnit;
    }

    public Long getStockUnit() {
        return this.stockUnit;
    }

    public Long getProduceUnit() {
        return this.produceUnit;
    }

    public Long getBatchUnit() {
        return this.batchUnit;
    }

    public Long getOnlineUnit() {
        return this.onlineUnit;
    }

    public Long getOfflineUnit() {
        return this.offlineUnit;
    }

    public Long getRequireUnit() {
        return this.requireUnit;
    }

    public Long getBatchPriceUnit() {
        return this.batchPriceUnit;
    }

    public Long getPurchasePriceUnit() {
        return this.purchasePriceUnit;
    }

    public Long getInspectionUnit() {
        return this.inspectionUnit;
    }

    public void setTemplate(Long template) {
        this.template = template;
    }

    public void setEnableAssistUnit(Boolean enableAssistUnit) {
        this.enableAssistUnit = enableAssistUnit;
    }

    public void setUnit(Long unit) {
        this.unit = unit;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setUnitPrecision(Integer unitPrecision) {
        this.unitPrecision = unitPrecision;
    }

    public void setUnitTruncationType(Integer unitTruncationType) {
        this.unitTruncationType = unitTruncationType;
    }

    public void setUnitConvertCoefficient(BigDecimal unitConvertCoefficient) {
        this.unitConvertCoefficient = unitConvertCoefficient;
    }

    public void setPurchaseUnit(Long purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }

    public void setStockUnit(Long stockUnit) {
        this.stockUnit = stockUnit;
    }

    public void setProduceUnit(Long produceUnit) {
        this.produceUnit = produceUnit;
    }

    public void setBatchUnit(Long batchUnit) {
        this.batchUnit = batchUnit;
    }

    public void setOnlineUnit(Long onlineUnit) {
        this.onlineUnit = onlineUnit;
    }

    public void setOfflineUnit(Long offlineUnit) {
        this.offlineUnit = offlineUnit;
    }

    public void setRequireUnit(Long requireUnit) {
        this.requireUnit = requireUnit;
    }

    public void setBatchPriceUnit(Long batchPriceUnit) {
        this.batchPriceUnit = batchPriceUnit;
    }

    public void setPurchasePriceUnit(Long purchasePriceUnit) {
        this.purchasePriceUnit = purchasePriceUnit;
    }

    public void setInspectionUnit(Long inspectionUnit) {
        this.inspectionUnit = inspectionUnit;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductTplUnitDTO)) {
            return false;
        }
        ProductTplUnitDTO other = (ProductTplUnitDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$template = this.getTemplate();
        Long other$template = other.getTemplate();
        if (this$template == null ? other$template != null : !((Object)this$template).equals(other$template)) {
            return false;
        }
        Boolean this$enableAssistUnit = this.getEnableAssistUnit();
        Boolean other$enableAssistUnit = other.getEnableAssistUnit();
        if (this$enableAssistUnit == null ? other$enableAssistUnit != null : !((Object)this$enableAssistUnit).equals(other$enableAssistUnit)) {
            return false;
        }
        Long this$unit = this.getUnit();
        Long other$unit = other.getUnit();
        if (this$unit == null ? other$unit != null : !((Object)this$unit).equals(other$unit)) {
            return false;
        }
        Integer this$unitPrecision = this.getUnitPrecision();
        Integer other$unitPrecision = other.getUnitPrecision();
        if (this$unitPrecision == null ? other$unitPrecision != null : !((Object)this$unitPrecision).equals(other$unitPrecision)) {
            return false;
        }
        Integer this$unitTruncationType = this.getUnitTruncationType();
        Integer other$unitTruncationType = other.getUnitTruncationType();
        if (this$unitTruncationType == null ? other$unitTruncationType != null : !((Object)this$unitTruncationType).equals(other$unitTruncationType)) {
            return false;
        }
        Long this$purchaseUnit = this.getPurchaseUnit();
        Long other$purchaseUnit = other.getPurchaseUnit();
        if (this$purchaseUnit == null ? other$purchaseUnit != null : !((Object)this$purchaseUnit).equals(other$purchaseUnit)) {
            return false;
        }
        Long this$stockUnit = this.getStockUnit();
        Long other$stockUnit = other.getStockUnit();
        if (this$stockUnit == null ? other$stockUnit != null : !((Object)this$stockUnit).equals(other$stockUnit)) {
            return false;
        }
        Long this$produceUnit = this.getProduceUnit();
        Long other$produceUnit = other.getProduceUnit();
        if (this$produceUnit == null ? other$produceUnit != null : !((Object)this$produceUnit).equals(other$produceUnit)) {
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
        Long this$purchasePriceUnit = this.getPurchasePriceUnit();
        Long other$purchasePriceUnit = other.getPurchasePriceUnit();
        if (this$purchasePriceUnit == null ? other$purchasePriceUnit != null : !((Object)this$purchasePriceUnit).equals(other$purchasePriceUnit)) {
            return false;
        }
        Long this$inspectionUnit = this.getInspectionUnit();
        Long other$inspectionUnit = other.getInspectionUnit();
        if (this$inspectionUnit == null ? other$inspectionUnit != null : !((Object)this$inspectionUnit).equals(other$inspectionUnit)) {
            return false;
        }
        String this$unitCode = this.getUnitCode();
        String other$unitCode = other.getUnitCode();
        if (this$unitCode == null ? other$unitCode != null : !this$unitCode.equals(other$unitCode)) {
            return false;
        }
        String this$unitName = this.getUnitName();
        String other$unitName = other.getUnitName();
        if (this$unitName == null ? other$unitName != null : !this$unitName.equals(other$unitName)) {
            return false;
        }
        BigDecimal this$unitConvertCoefficient = this.getUnitConvertCoefficient();
        BigDecimal other$unitConvertCoefficient = other.getUnitConvertCoefficient();
        return !(this$unitConvertCoefficient == null ? other$unitConvertCoefficient != null : !((Object)this$unitConvertCoefficient).equals(other$unitConvertCoefficient));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTplUnitDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $template = this.getTemplate();
        result = result * 59 + ($template == null ? 43 : ((Object)$template).hashCode());
        Boolean $enableAssistUnit = this.getEnableAssistUnit();
        result = result * 59 + ($enableAssistUnit == null ? 43 : ((Object)$enableAssistUnit).hashCode());
        Long $unit = this.getUnit();
        result = result * 59 + ($unit == null ? 43 : ((Object)$unit).hashCode());
        Integer $unitPrecision = this.getUnitPrecision();
        result = result * 59 + ($unitPrecision == null ? 43 : ((Object)$unitPrecision).hashCode());
        Integer $unitTruncationType = this.getUnitTruncationType();
        result = result * 59 + ($unitTruncationType == null ? 43 : ((Object)$unitTruncationType).hashCode());
        Long $purchaseUnit = this.getPurchaseUnit();
        result = result * 59 + ($purchaseUnit == null ? 43 : ((Object)$purchaseUnit).hashCode());
        Long $stockUnit = this.getStockUnit();
        result = result * 59 + ($stockUnit == null ? 43 : ((Object)$stockUnit).hashCode());
        Long $produceUnit = this.getProduceUnit();
        result = result * 59 + ($produceUnit == null ? 43 : ((Object)$produceUnit).hashCode());
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
        Long $purchasePriceUnit = this.getPurchasePriceUnit();
        result = result * 59 + ($purchasePriceUnit == null ? 43 : ((Object)$purchasePriceUnit).hashCode());
        Long $inspectionUnit = this.getInspectionUnit();
        result = result * 59 + ($inspectionUnit == null ? 43 : ((Object)$inspectionUnit).hashCode());
        String $unitCode = this.getUnitCode();
        result = result * 59 + ($unitCode == null ? 43 : $unitCode.hashCode());
        String $unitName = this.getUnitName();
        result = result * 59 + ($unitName == null ? 43 : $unitName.hashCode());
        BigDecimal $unitConvertCoefficient = this.getUnitConvertCoefficient();
        result = result * 59 + ($unitConvertCoefficient == null ? 43 : ((Object)$unitConvertCoefficient).hashCode());
        return result;
    }

    public String toString() {
        return "ProductTplUnitDTO(template=" + this.getTemplate() + ", enableAssistUnit=" + this.getEnableAssistUnit() + ", unit=" + this.getUnit() + ", unitCode=" + this.getUnitCode() + ", unitName=" + this.getUnitName() + ", unitPrecision=" + this.getUnitPrecision() + ", unitTruncationType=" + this.getUnitTruncationType() + ", unitConvertCoefficient=" + this.getUnitConvertCoefficient() + ", purchaseUnit=" + this.getPurchaseUnit() + ", stockUnit=" + this.getStockUnit() + ", produceUnit=" + this.getProduceUnit() + ", batchUnit=" + this.getBatchUnit() + ", onlineUnit=" + this.getOnlineUnit() + ", offlineUnit=" + this.getOfflineUnit() + ", requireUnit=" + this.getRequireUnit() + ", batchPriceUnit=" + this.getBatchPriceUnit() + ", purchasePriceUnit=" + this.getPurchasePriceUnit() + ", inspectionUnit=" + this.getInspectionUnit() + ")";
    }
}

