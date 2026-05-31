/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo.sku;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductSKUDetailCharacterSaveVO {
    private String shortName;
    private Boolean status;
    private Boolean ustatus;
    private BigDecimal batchPrice;
    private BigDecimal markPrice;
    private BigDecimal fLowestMarkPrice;
    private BigDecimal salePrice;
    private BigDecimal fNoTaxCostPrice;
    private BigDecimal fMarketPrice;
    private BigDecimal fPrimeCosts;
    private BigDecimal fSettleAccountsRate;
    private String barCode;
    private String mnemonicCode;
    private BigDecimal inventoryCount;
    private Integer iOrder;
    private Integer salePoints;
    private Boolean saled;
    private BigDecimal iMinOrderQuantity;
    private Integer batchDeliveryDays;
    private String erpOuterCode;
    private BigDecimal safetyStock;
    private BigDecimal highestStock;
    private BigDecimal lowestStock;
    private String stockUnitCode;
    private BigDecimal iDoubleSale;
    private Boolean stopstatus;
    private Long batchPriceUnit;
    private String batchPriceUnitCode;

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Boolean getUstatus() {
        return this.ustatus;
    }

    public void setUstatus(Boolean ustatus) {
        this.ustatus = ustatus;
    }

    public BigDecimal getBatchPrice() {
        return this.batchPrice;
    }

    public void setBatchPrice(BigDecimal batchPrice) {
        this.batchPrice = batchPrice;
    }

    public BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    public void setMarkPrice(BigDecimal markPrice) {
        this.markPrice = markPrice;
    }

    public BigDecimal getfLowestMarkPrice() {
        return this.fLowestMarkPrice;
    }

    public void setfLowestMarkPrice(BigDecimal fLowestMarkPrice) {
        this.fLowestMarkPrice = fLowestMarkPrice;
    }

    public BigDecimal getSalePrice() {
        return this.salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getfNoTaxCostPrice() {
        return this.fNoTaxCostPrice;
    }

    public void setfNoTaxCostPrice(BigDecimal fNoTaxCostPrice) {
        this.fNoTaxCostPrice = fNoTaxCostPrice;
    }

    public BigDecimal getfMarketPrice() {
        return this.fMarketPrice;
    }

    public void setfMarketPrice(BigDecimal fMarketPrice) {
        this.fMarketPrice = fMarketPrice;
    }

    public BigDecimal getfPrimeCosts() {
        return this.fPrimeCosts;
    }

    public void setfPrimeCosts(BigDecimal fPrimeCosts) {
        this.fPrimeCosts = fPrimeCosts;
    }

    public BigDecimal getfSettleAccountsRate() {
        return this.fSettleAccountsRate;
    }

    public void setfSettleAccountsRate(BigDecimal fSettleAccountsRate) {
        this.fSettleAccountsRate = fSettleAccountsRate;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getMnemonicCode() {
        return this.mnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public BigDecimal getInventoryCount() {
        return this.inventoryCount;
    }

    public void setInventoryCount(BigDecimal inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    public Integer getiOrder() {
        return this.iOrder;
    }

    public void setiOrder(Integer iOrder) {
        this.iOrder = iOrder;
    }

    public Integer getSalePoints() {
        return this.salePoints;
    }

    public void setSalePoints(Integer salePoints) {
        this.salePoints = salePoints;
    }

    public Boolean getSaled() {
        return this.saled;
    }

    public void setSaled(Boolean saled) {
        this.saled = saled;
    }

    public BigDecimal getiMinOrderQuantity() {
        return this.iMinOrderQuantity;
    }

    public void setiMinOrderQuantity(BigDecimal iMinOrderQuantity) {
        this.iMinOrderQuantity = iMinOrderQuantity;
    }

    public Integer getBatchDeliveryDays() {
        return this.batchDeliveryDays;
    }

    public void setBatchDeliveryDays(Integer batchDeliveryDays) {
        this.batchDeliveryDays = batchDeliveryDays;
    }

    public String getErpOuterCode() {
        return this.erpOuterCode;
    }

    public void setErpOuterCode(String erpOuterCode) {
        this.erpOuterCode = erpOuterCode;
    }

    public BigDecimal getSafetyStock() {
        return this.safetyStock;
    }

    public void setSafetyStock(BigDecimal safetyStock) {
        this.safetyStock = safetyStock;
    }

    public BigDecimal getHighestStock() {
        return this.highestStock;
    }

    public void setHighestStock(BigDecimal highestStock) {
        this.highestStock = highestStock;
    }

    public BigDecimal getLowestStock() {
        return this.lowestStock;
    }

    public void setLowestStock(BigDecimal lowestStock) {
        this.lowestStock = lowestStock;
    }

    public String getStockUnitCode() {
        return this.stockUnitCode;
    }

    public void setStockUnitCode(String stockUnitCode) {
        this.stockUnitCode = stockUnitCode;
    }

    public BigDecimal getiDoubleSale() {
        return this.iDoubleSale;
    }

    public void setiDoubleSale(BigDecimal iDoubleSale) {
        this.iDoubleSale = iDoubleSale;
    }

    public Boolean getStopstatus() {
        return this.stopstatus;
    }

    public void setStopstatus(Boolean stopstatus) {
        this.stopstatus = stopstatus;
    }

    public Long getBatchPriceUnit() {
        return this.batchPriceUnit;
    }

    public String getBatchPriceUnitCode() {
        return this.batchPriceUnitCode;
    }

    public void setBatchPriceUnit(Long batchPriceUnit) {
        this.batchPriceUnit = batchPriceUnit;
    }

    public void setBatchPriceUnitCode(String batchPriceUnitCode) {
        this.batchPriceUnitCode = batchPriceUnitCode;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductSKUDetailCharacterSaveVO)) {
            return false;
        }
        ProductSKUDetailCharacterSaveVO other = (ProductSKUDetailCharacterSaveVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$status = this.getStatus();
        Boolean other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Boolean this$ustatus = this.getUstatus();
        Boolean other$ustatus = other.getUstatus();
        if (this$ustatus == null ? other$ustatus != null : !((Object)this$ustatus).equals(other$ustatus)) {
            return false;
        }
        Integer this$iOrder = this.getiOrder();
        Integer other$iOrder = other.getiOrder();
        if (this$iOrder == null ? other$iOrder != null : !((Object)this$iOrder).equals(other$iOrder)) {
            return false;
        }
        Integer this$salePoints = this.getSalePoints();
        Integer other$salePoints = other.getSalePoints();
        if (this$salePoints == null ? other$salePoints != null : !((Object)this$salePoints).equals(other$salePoints)) {
            return false;
        }
        Boolean this$saled = this.getSaled();
        Boolean other$saled = other.getSaled();
        if (this$saled == null ? other$saled != null : !((Object)this$saled).equals(other$saled)) {
            return false;
        }
        Integer this$batchDeliveryDays = this.getBatchDeliveryDays();
        Integer other$batchDeliveryDays = other.getBatchDeliveryDays();
        if (this$batchDeliveryDays == null ? other$batchDeliveryDays != null : !((Object)this$batchDeliveryDays).equals(other$batchDeliveryDays)) {
            return false;
        }
        Boolean this$stopstatus = this.getStopstatus();
        Boolean other$stopstatus = other.getStopstatus();
        if (this$stopstatus == null ? other$stopstatus != null : !((Object)this$stopstatus).equals(other$stopstatus)) {
            return false;
        }
        Long this$batchPriceUnit = this.getBatchPriceUnit();
        Long other$batchPriceUnit = other.getBatchPriceUnit();
        if (this$batchPriceUnit == null ? other$batchPriceUnit != null : !((Object)this$batchPriceUnit).equals(other$batchPriceUnit)) {
            return false;
        }
        String this$shortName = this.getShortName();
        String other$shortName = other.getShortName();
        if (this$shortName == null ? other$shortName != null : !this$shortName.equals(other$shortName)) {
            return false;
        }
        BigDecimal this$batchPrice = this.getBatchPrice();
        BigDecimal other$batchPrice = other.getBatchPrice();
        if (this$batchPrice == null ? other$batchPrice != null : !((Object)this$batchPrice).equals(other$batchPrice)) {
            return false;
        }
        BigDecimal this$markPrice = this.getMarkPrice();
        BigDecimal other$markPrice = other.getMarkPrice();
        if (this$markPrice == null ? other$markPrice != null : !((Object)this$markPrice).equals(other$markPrice)) {
            return false;
        }
        BigDecimal this$fLowestMarkPrice = this.getfLowestMarkPrice();
        BigDecimal other$fLowestMarkPrice = other.getfLowestMarkPrice();
        if (this$fLowestMarkPrice == null ? other$fLowestMarkPrice != null : !((Object)this$fLowestMarkPrice).equals(other$fLowestMarkPrice)) {
            return false;
        }
        BigDecimal this$salePrice = this.getSalePrice();
        BigDecimal other$salePrice = other.getSalePrice();
        if (this$salePrice == null ? other$salePrice != null : !((Object)this$salePrice).equals(other$salePrice)) {
            return false;
        }
        BigDecimal this$fNoTaxCostPrice = this.getfNoTaxCostPrice();
        BigDecimal other$fNoTaxCostPrice = other.getfNoTaxCostPrice();
        if (this$fNoTaxCostPrice == null ? other$fNoTaxCostPrice != null : !((Object)this$fNoTaxCostPrice).equals(other$fNoTaxCostPrice)) {
            return false;
        }
        BigDecimal this$fMarketPrice = this.getfMarketPrice();
        BigDecimal other$fMarketPrice = other.getfMarketPrice();
        if (this$fMarketPrice == null ? other$fMarketPrice != null : !((Object)this$fMarketPrice).equals(other$fMarketPrice)) {
            return false;
        }
        BigDecimal this$fPrimeCosts = this.getfPrimeCosts();
        BigDecimal other$fPrimeCosts = other.getfPrimeCosts();
        if (this$fPrimeCosts == null ? other$fPrimeCosts != null : !((Object)this$fPrimeCosts).equals(other$fPrimeCosts)) {
            return false;
        }
        BigDecimal this$fSettleAccountsRate = this.getfSettleAccountsRate();
        BigDecimal other$fSettleAccountsRate = other.getfSettleAccountsRate();
        if (this$fSettleAccountsRate == null ? other$fSettleAccountsRate != null : !((Object)this$fSettleAccountsRate).equals(other$fSettleAccountsRate)) {
            return false;
        }
        String this$barCode = this.getBarCode();
        String other$barCode = other.getBarCode();
        if (this$barCode == null ? other$barCode != null : !this$barCode.equals(other$barCode)) {
            return false;
        }
        String this$mnemonicCode = this.getMnemonicCode();
        String other$mnemonicCode = other.getMnemonicCode();
        if (this$mnemonicCode == null ? other$mnemonicCode != null : !this$mnemonicCode.equals(other$mnemonicCode)) {
            return false;
        }
        BigDecimal this$inventoryCount = this.getInventoryCount();
        BigDecimal other$inventoryCount = other.getInventoryCount();
        if (this$inventoryCount == null ? other$inventoryCount != null : !((Object)this$inventoryCount).equals(other$inventoryCount)) {
            return false;
        }
        BigDecimal this$iMinOrderQuantity = this.getiMinOrderQuantity();
        BigDecimal other$iMinOrderQuantity = other.getiMinOrderQuantity();
        if (this$iMinOrderQuantity == null ? other$iMinOrderQuantity != null : !((Object)this$iMinOrderQuantity).equals(other$iMinOrderQuantity)) {
            return false;
        }
        String this$erpOuterCode = this.getErpOuterCode();
        String other$erpOuterCode = other.getErpOuterCode();
        if (this$erpOuterCode == null ? other$erpOuterCode != null : !this$erpOuterCode.equals(other$erpOuterCode)) {
            return false;
        }
        BigDecimal this$safetyStock = this.getSafetyStock();
        BigDecimal other$safetyStock = other.getSafetyStock();
        if (this$safetyStock == null ? other$safetyStock != null : !((Object)this$safetyStock).equals(other$safetyStock)) {
            return false;
        }
        BigDecimal this$highestStock = this.getHighestStock();
        BigDecimal other$highestStock = other.getHighestStock();
        if (this$highestStock == null ? other$highestStock != null : !((Object)this$highestStock).equals(other$highestStock)) {
            return false;
        }
        BigDecimal this$lowestStock = this.getLowestStock();
        BigDecimal other$lowestStock = other.getLowestStock();
        if (this$lowestStock == null ? other$lowestStock != null : !((Object)this$lowestStock).equals(other$lowestStock)) {
            return false;
        }
        String this$stockUnitCode = this.getStockUnitCode();
        String other$stockUnitCode = other.getStockUnitCode();
        if (this$stockUnitCode == null ? other$stockUnitCode != null : !this$stockUnitCode.equals(other$stockUnitCode)) {
            return false;
        }
        BigDecimal this$iDoubleSale = this.getiDoubleSale();
        BigDecimal other$iDoubleSale = other.getiDoubleSale();
        if (this$iDoubleSale == null ? other$iDoubleSale != null : !((Object)this$iDoubleSale).equals(other$iDoubleSale)) {
            return false;
        }
        String this$batchPriceUnitCode = this.getBatchPriceUnitCode();
        String other$batchPriceUnitCode = other.getBatchPriceUnitCode();
        return !(this$batchPriceUnitCode == null ? other$batchPriceUnitCode != null : !this$batchPriceUnitCode.equals(other$batchPriceUnitCode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductSKUDetailCharacterSaveVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Boolean $ustatus = this.getUstatus();
        result = result * 59 + ($ustatus == null ? 43 : ((Object)$ustatus).hashCode());
        Integer $iOrder = this.getiOrder();
        result = result * 59 + ($iOrder == null ? 43 : ((Object)$iOrder).hashCode());
        Integer $salePoints = this.getSalePoints();
        result = result * 59 + ($salePoints == null ? 43 : ((Object)$salePoints).hashCode());
        Boolean $saled = this.getSaled();
        result = result * 59 + ($saled == null ? 43 : ((Object)$saled).hashCode());
        Integer $batchDeliveryDays = this.getBatchDeliveryDays();
        result = result * 59 + ($batchDeliveryDays == null ? 43 : ((Object)$batchDeliveryDays).hashCode());
        Boolean $stopstatus = this.getStopstatus();
        result = result * 59 + ($stopstatus == null ? 43 : ((Object)$stopstatus).hashCode());
        Long $batchPriceUnit = this.getBatchPriceUnit();
        result = result * 59 + ($batchPriceUnit == null ? 43 : ((Object)$batchPriceUnit).hashCode());
        String $shortName = this.getShortName();
        result = result * 59 + ($shortName == null ? 43 : $shortName.hashCode());
        BigDecimal $batchPrice = this.getBatchPrice();
        result = result * 59 + ($batchPrice == null ? 43 : ((Object)$batchPrice).hashCode());
        BigDecimal $markPrice = this.getMarkPrice();
        result = result * 59 + ($markPrice == null ? 43 : ((Object)$markPrice).hashCode());
        BigDecimal $fLowestMarkPrice = this.getfLowestMarkPrice();
        result = result * 59 + ($fLowestMarkPrice == null ? 43 : ((Object)$fLowestMarkPrice).hashCode());
        BigDecimal $salePrice = this.getSalePrice();
        result = result * 59 + ($salePrice == null ? 43 : ((Object)$salePrice).hashCode());
        BigDecimal $fNoTaxCostPrice = this.getfNoTaxCostPrice();
        result = result * 59 + ($fNoTaxCostPrice == null ? 43 : ((Object)$fNoTaxCostPrice).hashCode());
        BigDecimal $fMarketPrice = this.getfMarketPrice();
        result = result * 59 + ($fMarketPrice == null ? 43 : ((Object)$fMarketPrice).hashCode());
        BigDecimal $fPrimeCosts = this.getfPrimeCosts();
        result = result * 59 + ($fPrimeCosts == null ? 43 : ((Object)$fPrimeCosts).hashCode());
        BigDecimal $fSettleAccountsRate = this.getfSettleAccountsRate();
        result = result * 59 + ($fSettleAccountsRate == null ? 43 : ((Object)$fSettleAccountsRate).hashCode());
        String $barCode = this.getBarCode();
        result = result * 59 + ($barCode == null ? 43 : $barCode.hashCode());
        String $mnemonicCode = this.getMnemonicCode();
        result = result * 59 + ($mnemonicCode == null ? 43 : $mnemonicCode.hashCode());
        BigDecimal $inventoryCount = this.getInventoryCount();
        result = result * 59 + ($inventoryCount == null ? 43 : ((Object)$inventoryCount).hashCode());
        BigDecimal $iMinOrderQuantity = this.getiMinOrderQuantity();
        result = result * 59 + ($iMinOrderQuantity == null ? 43 : ((Object)$iMinOrderQuantity).hashCode());
        String $erpOuterCode = this.getErpOuterCode();
        result = result * 59 + ($erpOuterCode == null ? 43 : $erpOuterCode.hashCode());
        BigDecimal $safetyStock = this.getSafetyStock();
        result = result * 59 + ($safetyStock == null ? 43 : ((Object)$safetyStock).hashCode());
        BigDecimal $highestStock = this.getHighestStock();
        result = result * 59 + ($highestStock == null ? 43 : ((Object)$highestStock).hashCode());
        BigDecimal $lowestStock = this.getLowestStock();
        result = result * 59 + ($lowestStock == null ? 43 : ((Object)$lowestStock).hashCode());
        String $stockUnitCode = this.getStockUnitCode();
        result = result * 59 + ($stockUnitCode == null ? 43 : $stockUnitCode.hashCode());
        BigDecimal $iDoubleSale = this.getiDoubleSale();
        result = result * 59 + ($iDoubleSale == null ? 43 : ((Object)$iDoubleSale).hashCode());
        String $batchPriceUnitCode = this.getBatchPriceUnitCode();
        result = result * 59 + ($batchPriceUnitCode == null ? 43 : $batchPriceUnitCode.hashCode());
        return result;
    }

    public String toString() {
        return "ProductSKUDetailCharacterSaveVO(shortName=" + this.getShortName() + ", status=" + this.getStatus() + ", ustatus=" + this.getUstatus() + ", batchPrice=" + this.getBatchPrice() + ", markPrice=" + this.getMarkPrice() + ", fLowestMarkPrice=" + this.getfLowestMarkPrice() + ", salePrice=" + this.getSalePrice() + ", fNoTaxCostPrice=" + this.getfNoTaxCostPrice() + ", fMarketPrice=" + this.getfMarketPrice() + ", fPrimeCosts=" + this.getfPrimeCosts() + ", fSettleAccountsRate=" + this.getfSettleAccountsRate() + ", barCode=" + this.getBarCode() + ", mnemonicCode=" + this.getMnemonicCode() + ", inventoryCount=" + this.getInventoryCount() + ", iOrder=" + this.getiOrder() + ", salePoints=" + this.getSalePoints() + ", saled=" + this.getSaled() + ", iMinOrderQuantity=" + this.getiMinOrderQuantity() + ", batchDeliveryDays=" + this.getBatchDeliveryDays() + ", erpOuterCode=" + this.getErpOuterCode() + ", safetyStock=" + this.getSafetyStock() + ", highestStock=" + this.getHighestStock() + ", lowestStock=" + this.getLowestStock() + ", stockUnitCode=" + this.getStockUnitCode() + ", iDoubleSale=" + this.getiDoubleSale() + ", stopstatus=" + this.getStopstatus() + ", batchPriceUnit=" + this.getBatchPriceUnit() + ", batchPriceUnitCode=" + this.getBatchPriceUnitCode() + ")";
    }
}

