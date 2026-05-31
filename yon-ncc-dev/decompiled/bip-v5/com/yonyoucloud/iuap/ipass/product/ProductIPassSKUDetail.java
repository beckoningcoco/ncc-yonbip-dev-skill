/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.math.BigDecimal;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductIPassSKUDetail
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String pubts;
    private String productId;
    private String skuId;
    private String productApplyRangeId;
    private String shortName;
    private String mnemonicCode;
    private String barCode;
    private BigDecimal fNoTaxCostPrice;
    private BigDecimal fPrimeCosts;
    private BigDecimal batchPrice;
    private BigDecimal iMinOrderQuantity;
    private BigDecimal batchDeliveryDays;
    private BigDecimal markPrice;
    private BigDecimal fLowestMarkPrice;
    private BigDecimal salePrice;
    private BigDecimal fMarketPrice;
    private BigDecimal fSettleAccountsRate;
    private BigDecimal salePoints;
    private BigDecimal inventoryCount;
    private String iOrder;
    private String stopstatus;
    private BigDecimal ustatus;
    private BigDecimal status;
    private BigDecimal saled;

    public String getId() {
        return this.id;
    }

    public String getPubts() {
        return this.pubts;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getSkuId() {
        return this.skuId;
    }

    public String getProductApplyRangeId() {
        return this.productApplyRangeId;
    }

    public String getShortName() {
        return this.shortName;
    }

    public String getMnemonicCode() {
        return this.mnemonicCode;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public BigDecimal getFNoTaxCostPrice() {
        return this.fNoTaxCostPrice;
    }

    public BigDecimal getFPrimeCosts() {
        return this.fPrimeCosts;
    }

    public BigDecimal getBatchPrice() {
        return this.batchPrice;
    }

    public BigDecimal getIMinOrderQuantity() {
        return this.iMinOrderQuantity;
    }

    public BigDecimal getBatchDeliveryDays() {
        return this.batchDeliveryDays;
    }

    public BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    public BigDecimal getFLowestMarkPrice() {
        return this.fLowestMarkPrice;
    }

    public BigDecimal getSalePrice() {
        return this.salePrice;
    }

    public BigDecimal getFMarketPrice() {
        return this.fMarketPrice;
    }

    public BigDecimal getFSettleAccountsRate() {
        return this.fSettleAccountsRate;
    }

    public BigDecimal getSalePoints() {
        return this.salePoints;
    }

    public BigDecimal getInventoryCount() {
        return this.inventoryCount;
    }

    public String getIOrder() {
        return this.iOrder;
    }

    public String getStopstatus() {
        return this.stopstatus;
    }

    public BigDecimal getUstatus() {
        return this.ustatus;
    }

    public BigDecimal getStatus() {
        return this.status;
    }

    public BigDecimal getSaled() {
        return this.saled;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public void setProductApplyRangeId(String productApplyRangeId) {
        this.productApplyRangeId = productApplyRangeId;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setFNoTaxCostPrice(BigDecimal fNoTaxCostPrice) {
        this.fNoTaxCostPrice = fNoTaxCostPrice;
    }

    public void setFPrimeCosts(BigDecimal fPrimeCosts) {
        this.fPrimeCosts = fPrimeCosts;
    }

    public void setBatchPrice(BigDecimal batchPrice) {
        this.batchPrice = batchPrice;
    }

    public void setIMinOrderQuantity(BigDecimal iMinOrderQuantity) {
        this.iMinOrderQuantity = iMinOrderQuantity;
    }

    public void setBatchDeliveryDays(BigDecimal batchDeliveryDays) {
        this.batchDeliveryDays = batchDeliveryDays;
    }

    public void setMarkPrice(BigDecimal markPrice) {
        this.markPrice = markPrice;
    }

    public void setFLowestMarkPrice(BigDecimal fLowestMarkPrice) {
        this.fLowestMarkPrice = fLowestMarkPrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public void setFMarketPrice(BigDecimal fMarketPrice) {
        this.fMarketPrice = fMarketPrice;
    }

    public void setFSettleAccountsRate(BigDecimal fSettleAccountsRate) {
        this.fSettleAccountsRate = fSettleAccountsRate;
    }

    public void setSalePoints(BigDecimal salePoints) {
        this.salePoints = salePoints;
    }

    public void setInventoryCount(BigDecimal inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    public void setIOrder(String iOrder) {
        this.iOrder = iOrder;
    }

    public void setStopstatus(String stopstatus) {
        this.stopstatus = stopstatus;
    }

    public void setUstatus(BigDecimal ustatus) {
        this.ustatus = ustatus;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public void setSaled(BigDecimal saled) {
        this.saled = saled;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductIPassSKUDetail)) {
            return false;
        }
        ProductIPassSKUDetail other = (ProductIPassSKUDetail)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$pubts = this.getPubts();
        String other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !this$pubts.equals(other$pubts)) {
            return false;
        }
        String this$productId = this.getProductId();
        String other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !this$productId.equals(other$productId)) {
            return false;
        }
        String this$skuId = this.getSkuId();
        String other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) {
            return false;
        }
        String this$productApplyRangeId = this.getProductApplyRangeId();
        String other$productApplyRangeId = other.getProductApplyRangeId();
        if (this$productApplyRangeId == null ? other$productApplyRangeId != null : !this$productApplyRangeId.equals(other$productApplyRangeId)) {
            return false;
        }
        String this$shortName = this.getShortName();
        String other$shortName = other.getShortName();
        if (this$shortName == null ? other$shortName != null : !this$shortName.equals(other$shortName)) {
            return false;
        }
        String this$mnemonicCode = this.getMnemonicCode();
        String other$mnemonicCode = other.getMnemonicCode();
        if (this$mnemonicCode == null ? other$mnemonicCode != null : !this$mnemonicCode.equals(other$mnemonicCode)) {
            return false;
        }
        String this$barCode = this.getBarCode();
        String other$barCode = other.getBarCode();
        if (this$barCode == null ? other$barCode != null : !this$barCode.equals(other$barCode)) {
            return false;
        }
        BigDecimal this$fNoTaxCostPrice = this.getFNoTaxCostPrice();
        BigDecimal other$fNoTaxCostPrice = other.getFNoTaxCostPrice();
        if (this$fNoTaxCostPrice == null ? other$fNoTaxCostPrice != null : !((Object)this$fNoTaxCostPrice).equals(other$fNoTaxCostPrice)) {
            return false;
        }
        BigDecimal this$fPrimeCosts = this.getFPrimeCosts();
        BigDecimal other$fPrimeCosts = other.getFPrimeCosts();
        if (this$fPrimeCosts == null ? other$fPrimeCosts != null : !((Object)this$fPrimeCosts).equals(other$fPrimeCosts)) {
            return false;
        }
        BigDecimal this$batchPrice = this.getBatchPrice();
        BigDecimal other$batchPrice = other.getBatchPrice();
        if (this$batchPrice == null ? other$batchPrice != null : !((Object)this$batchPrice).equals(other$batchPrice)) {
            return false;
        }
        BigDecimal this$iMinOrderQuantity = this.getIMinOrderQuantity();
        BigDecimal other$iMinOrderQuantity = other.getIMinOrderQuantity();
        if (this$iMinOrderQuantity == null ? other$iMinOrderQuantity != null : !((Object)this$iMinOrderQuantity).equals(other$iMinOrderQuantity)) {
            return false;
        }
        BigDecimal this$batchDeliveryDays = this.getBatchDeliveryDays();
        BigDecimal other$batchDeliveryDays = other.getBatchDeliveryDays();
        if (this$batchDeliveryDays == null ? other$batchDeliveryDays != null : !((Object)this$batchDeliveryDays).equals(other$batchDeliveryDays)) {
            return false;
        }
        BigDecimal this$markPrice = this.getMarkPrice();
        BigDecimal other$markPrice = other.getMarkPrice();
        if (this$markPrice == null ? other$markPrice != null : !((Object)this$markPrice).equals(other$markPrice)) {
            return false;
        }
        BigDecimal this$fLowestMarkPrice = this.getFLowestMarkPrice();
        BigDecimal other$fLowestMarkPrice = other.getFLowestMarkPrice();
        if (this$fLowestMarkPrice == null ? other$fLowestMarkPrice != null : !((Object)this$fLowestMarkPrice).equals(other$fLowestMarkPrice)) {
            return false;
        }
        BigDecimal this$salePrice = this.getSalePrice();
        BigDecimal other$salePrice = other.getSalePrice();
        if (this$salePrice == null ? other$salePrice != null : !((Object)this$salePrice).equals(other$salePrice)) {
            return false;
        }
        BigDecimal this$fMarketPrice = this.getFMarketPrice();
        BigDecimal other$fMarketPrice = other.getFMarketPrice();
        if (this$fMarketPrice == null ? other$fMarketPrice != null : !((Object)this$fMarketPrice).equals(other$fMarketPrice)) {
            return false;
        }
        BigDecimal this$fSettleAccountsRate = this.getFSettleAccountsRate();
        BigDecimal other$fSettleAccountsRate = other.getFSettleAccountsRate();
        if (this$fSettleAccountsRate == null ? other$fSettleAccountsRate != null : !((Object)this$fSettleAccountsRate).equals(other$fSettleAccountsRate)) {
            return false;
        }
        BigDecimal this$salePoints = this.getSalePoints();
        BigDecimal other$salePoints = other.getSalePoints();
        if (this$salePoints == null ? other$salePoints != null : !((Object)this$salePoints).equals(other$salePoints)) {
            return false;
        }
        BigDecimal this$inventoryCount = this.getInventoryCount();
        BigDecimal other$inventoryCount = other.getInventoryCount();
        if (this$inventoryCount == null ? other$inventoryCount != null : !((Object)this$inventoryCount).equals(other$inventoryCount)) {
            return false;
        }
        String this$iOrder = this.getIOrder();
        String other$iOrder = other.getIOrder();
        if (this$iOrder == null ? other$iOrder != null : !this$iOrder.equals(other$iOrder)) {
            return false;
        }
        String this$stopstatus = this.getStopstatus();
        String other$stopstatus = other.getStopstatus();
        if (this$stopstatus == null ? other$stopstatus != null : !this$stopstatus.equals(other$stopstatus)) {
            return false;
        }
        BigDecimal this$ustatus = this.getUstatus();
        BigDecimal other$ustatus = other.getUstatus();
        if (this$ustatus == null ? other$ustatus != null : !((Object)this$ustatus).equals(other$ustatus)) {
            return false;
        }
        BigDecimal this$status = this.getStatus();
        BigDecimal other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        BigDecimal this$saled = this.getSaled();
        BigDecimal other$saled = other.getSaled();
        return !(this$saled == null ? other$saled != null : !((Object)this$saled).equals(other$saled));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductIPassSKUDetail;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : $pubts.hashCode());
        String $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : $productId.hashCode());
        String $skuId = this.getSkuId();
        result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
        String $productApplyRangeId = this.getProductApplyRangeId();
        result = result * 59 + ($productApplyRangeId == null ? 43 : $productApplyRangeId.hashCode());
        String $shortName = this.getShortName();
        result = result * 59 + ($shortName == null ? 43 : $shortName.hashCode());
        String $mnemonicCode = this.getMnemonicCode();
        result = result * 59 + ($mnemonicCode == null ? 43 : $mnemonicCode.hashCode());
        String $barCode = this.getBarCode();
        result = result * 59 + ($barCode == null ? 43 : $barCode.hashCode());
        BigDecimal $fNoTaxCostPrice = this.getFNoTaxCostPrice();
        result = result * 59 + ($fNoTaxCostPrice == null ? 43 : ((Object)$fNoTaxCostPrice).hashCode());
        BigDecimal $fPrimeCosts = this.getFPrimeCosts();
        result = result * 59 + ($fPrimeCosts == null ? 43 : ((Object)$fPrimeCosts).hashCode());
        BigDecimal $batchPrice = this.getBatchPrice();
        result = result * 59 + ($batchPrice == null ? 43 : ((Object)$batchPrice).hashCode());
        BigDecimal $iMinOrderQuantity = this.getIMinOrderQuantity();
        result = result * 59 + ($iMinOrderQuantity == null ? 43 : ((Object)$iMinOrderQuantity).hashCode());
        BigDecimal $batchDeliveryDays = this.getBatchDeliveryDays();
        result = result * 59 + ($batchDeliveryDays == null ? 43 : ((Object)$batchDeliveryDays).hashCode());
        BigDecimal $markPrice = this.getMarkPrice();
        result = result * 59 + ($markPrice == null ? 43 : ((Object)$markPrice).hashCode());
        BigDecimal $fLowestMarkPrice = this.getFLowestMarkPrice();
        result = result * 59 + ($fLowestMarkPrice == null ? 43 : ((Object)$fLowestMarkPrice).hashCode());
        BigDecimal $salePrice = this.getSalePrice();
        result = result * 59 + ($salePrice == null ? 43 : ((Object)$salePrice).hashCode());
        BigDecimal $fMarketPrice = this.getFMarketPrice();
        result = result * 59 + ($fMarketPrice == null ? 43 : ((Object)$fMarketPrice).hashCode());
        BigDecimal $fSettleAccountsRate = this.getFSettleAccountsRate();
        result = result * 59 + ($fSettleAccountsRate == null ? 43 : ((Object)$fSettleAccountsRate).hashCode());
        BigDecimal $salePoints = this.getSalePoints();
        result = result * 59 + ($salePoints == null ? 43 : ((Object)$salePoints).hashCode());
        BigDecimal $inventoryCount = this.getInventoryCount();
        result = result * 59 + ($inventoryCount == null ? 43 : ((Object)$inventoryCount).hashCode());
        String $iOrder = this.getIOrder();
        result = result * 59 + ($iOrder == null ? 43 : $iOrder.hashCode());
        String $stopstatus = this.getStopstatus();
        result = result * 59 + ($stopstatus == null ? 43 : $stopstatus.hashCode());
        BigDecimal $ustatus = this.getUstatus();
        result = result * 59 + ($ustatus == null ? 43 : ((Object)$ustatus).hashCode());
        BigDecimal $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        BigDecimal $saled = this.getSaled();
        result = result * 59 + ($saled == null ? 43 : ((Object)$saled).hashCode());
        return result;
    }

    public String toString() {
        return "ProductIPassSKUDetail(id=" + this.getId() + ", pubts=" + this.getPubts() + ", productId=" + this.getProductId() + ", skuId=" + this.getSkuId() + ", productApplyRangeId=" + this.getProductApplyRangeId() + ", shortName=" + this.getShortName() + ", mnemonicCode=" + this.getMnemonicCode() + ", barCode=" + this.getBarCode() + ", fNoTaxCostPrice=" + this.getFNoTaxCostPrice() + ", fPrimeCosts=" + this.getFPrimeCosts() + ", batchPrice=" + this.getBatchPrice() + ", iMinOrderQuantity=" + this.getIMinOrderQuantity() + ", batchDeliveryDays=" + this.getBatchDeliveryDays() + ", markPrice=" + this.getMarkPrice() + ", fLowestMarkPrice=" + this.getFLowestMarkPrice() + ", salePrice=" + this.getSalePrice() + ", fMarketPrice=" + this.getFMarketPrice() + ", fSettleAccountsRate=" + this.getFSettleAccountsRate() + ", salePoints=" + this.getSalePoints() + ", inventoryCount=" + this.getInventoryCount() + ", iOrder=" + this.getIOrder() + ", stopstatus=" + this.getStopstatus() + ", ustatus=" + this.getUstatus() + ", status=" + this.getStatus() + ", saled=" + this.getSaled() + ")";
    }
}

