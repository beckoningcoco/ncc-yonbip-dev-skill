/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.fasterxml.jackson.annotation.JsonProperty
 */
package com.yonyoucloud.iuap.ipass.sku;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductSkuDetailIPass
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String shortName;
    private String barCode;
    private String mnemonicCode;
    @JsonProperty(value="fNoTaxCostPrice")
    private Long fNoTaxCostPrice;
    @JsonProperty(value="fPrimeCosts")
    private Long fPrimeCosts;
    @JsonProperty(value="iMinOrderQuantity")
    private Long iMinOrderQuantity;
    @JsonProperty(value="iDoubleSale")
    private Long iDoubleSale;
    private Long batchDeliveryDays;
    private Long markPrice;
    private Long salePrice;
    @JsonProperty(value="fMarketPrice")
    private Long fMarketPrice;
    @JsonProperty(value="fSettleAccountsRate")
    private Long fSettleAccountsRate;
    private Long inventoryCount;
    private Long safetyStock;
    @JsonProperty(value="iOrder")
    private Long iOrder;
    private Boolean status;
    private Boolean ustatus;
    private Boolean stopstatus;

    public String getShortName() {
        return this.shortName;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public String getMnemonicCode() {
        return this.mnemonicCode;
    }

    public Long getFNoTaxCostPrice() {
        return this.fNoTaxCostPrice;
    }

    public Long getFPrimeCosts() {
        return this.fPrimeCosts;
    }

    public Long getIMinOrderQuantity() {
        return this.iMinOrderQuantity;
    }

    public Long getIDoubleSale() {
        return this.iDoubleSale;
    }

    public Long getBatchDeliveryDays() {
        return this.batchDeliveryDays;
    }

    public Long getMarkPrice() {
        return this.markPrice;
    }

    public Long getSalePrice() {
        return this.salePrice;
    }

    public Long getFMarketPrice() {
        return this.fMarketPrice;
    }

    public Long getFSettleAccountsRate() {
        return this.fSettleAccountsRate;
    }

    public Long getInventoryCount() {
        return this.inventoryCount;
    }

    public Long getSafetyStock() {
        return this.safetyStock;
    }

    public Long getIOrder() {
        return this.iOrder;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public Boolean getUstatus() {
        return this.ustatus;
    }

    public Boolean getStopstatus() {
        return this.stopstatus;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    @JsonProperty(value="fNoTaxCostPrice")
    public void setFNoTaxCostPrice(Long fNoTaxCostPrice) {
        this.fNoTaxCostPrice = fNoTaxCostPrice;
    }

    @JsonProperty(value="fPrimeCosts")
    public void setFPrimeCosts(Long fPrimeCosts) {
        this.fPrimeCosts = fPrimeCosts;
    }

    @JsonProperty(value="iMinOrderQuantity")
    public void setIMinOrderQuantity(Long iMinOrderQuantity) {
        this.iMinOrderQuantity = iMinOrderQuantity;
    }

    @JsonProperty(value="iDoubleSale")
    public void setIDoubleSale(Long iDoubleSale) {
        this.iDoubleSale = iDoubleSale;
    }

    public void setBatchDeliveryDays(Long batchDeliveryDays) {
        this.batchDeliveryDays = batchDeliveryDays;
    }

    public void setMarkPrice(Long markPrice) {
        this.markPrice = markPrice;
    }

    public void setSalePrice(Long salePrice) {
        this.salePrice = salePrice;
    }

    @JsonProperty(value="fMarketPrice")
    public void setFMarketPrice(Long fMarketPrice) {
        this.fMarketPrice = fMarketPrice;
    }

    @JsonProperty(value="fSettleAccountsRate")
    public void setFSettleAccountsRate(Long fSettleAccountsRate) {
        this.fSettleAccountsRate = fSettleAccountsRate;
    }

    public void setInventoryCount(Long inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    public void setSafetyStock(Long safetyStock) {
        this.safetyStock = safetyStock;
    }

    @JsonProperty(value="iOrder")
    public void setIOrder(Long iOrder) {
        this.iOrder = iOrder;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setUstatus(Boolean ustatus) {
        this.ustatus = ustatus;
    }

    public void setStopstatus(Boolean stopstatus) {
        this.stopstatus = stopstatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductSkuDetailIPass)) {
            return false;
        }
        ProductSkuDetailIPass other = (ProductSkuDetailIPass)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$fNoTaxCostPrice = this.getFNoTaxCostPrice();
        Long other$fNoTaxCostPrice = other.getFNoTaxCostPrice();
        if (this$fNoTaxCostPrice == null ? other$fNoTaxCostPrice != null : !((Object)this$fNoTaxCostPrice).equals(other$fNoTaxCostPrice)) {
            return false;
        }
        Long this$fPrimeCosts = this.getFPrimeCosts();
        Long other$fPrimeCosts = other.getFPrimeCosts();
        if (this$fPrimeCosts == null ? other$fPrimeCosts != null : !((Object)this$fPrimeCosts).equals(other$fPrimeCosts)) {
            return false;
        }
        Long this$iMinOrderQuantity = this.getIMinOrderQuantity();
        Long other$iMinOrderQuantity = other.getIMinOrderQuantity();
        if (this$iMinOrderQuantity == null ? other$iMinOrderQuantity != null : !((Object)this$iMinOrderQuantity).equals(other$iMinOrderQuantity)) {
            return false;
        }
        Long this$iDoubleSale = this.getIDoubleSale();
        Long other$iDoubleSale = other.getIDoubleSale();
        if (this$iDoubleSale == null ? other$iDoubleSale != null : !((Object)this$iDoubleSale).equals(other$iDoubleSale)) {
            return false;
        }
        Long this$batchDeliveryDays = this.getBatchDeliveryDays();
        Long other$batchDeliveryDays = other.getBatchDeliveryDays();
        if (this$batchDeliveryDays == null ? other$batchDeliveryDays != null : !((Object)this$batchDeliveryDays).equals(other$batchDeliveryDays)) {
            return false;
        }
        Long this$markPrice = this.getMarkPrice();
        Long other$markPrice = other.getMarkPrice();
        if (this$markPrice == null ? other$markPrice != null : !((Object)this$markPrice).equals(other$markPrice)) {
            return false;
        }
        Long this$salePrice = this.getSalePrice();
        Long other$salePrice = other.getSalePrice();
        if (this$salePrice == null ? other$salePrice != null : !((Object)this$salePrice).equals(other$salePrice)) {
            return false;
        }
        Long this$fMarketPrice = this.getFMarketPrice();
        Long other$fMarketPrice = other.getFMarketPrice();
        if (this$fMarketPrice == null ? other$fMarketPrice != null : !((Object)this$fMarketPrice).equals(other$fMarketPrice)) {
            return false;
        }
        Long this$fSettleAccountsRate = this.getFSettleAccountsRate();
        Long other$fSettleAccountsRate = other.getFSettleAccountsRate();
        if (this$fSettleAccountsRate == null ? other$fSettleAccountsRate != null : !((Object)this$fSettleAccountsRate).equals(other$fSettleAccountsRate)) {
            return false;
        }
        Long this$inventoryCount = this.getInventoryCount();
        Long other$inventoryCount = other.getInventoryCount();
        if (this$inventoryCount == null ? other$inventoryCount != null : !((Object)this$inventoryCount).equals(other$inventoryCount)) {
            return false;
        }
        Long this$safetyStock = this.getSafetyStock();
        Long other$safetyStock = other.getSafetyStock();
        if (this$safetyStock == null ? other$safetyStock != null : !((Object)this$safetyStock).equals(other$safetyStock)) {
            return false;
        }
        Long this$iOrder = this.getIOrder();
        Long other$iOrder = other.getIOrder();
        if (this$iOrder == null ? other$iOrder != null : !((Object)this$iOrder).equals(other$iOrder)) {
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
        Boolean this$stopstatus = this.getStopstatus();
        Boolean other$stopstatus = other.getStopstatus();
        if (this$stopstatus == null ? other$stopstatus != null : !((Object)this$stopstatus).equals(other$stopstatus)) {
            return false;
        }
        String this$shortName = this.getShortName();
        String other$shortName = other.getShortName();
        if (this$shortName == null ? other$shortName != null : !this$shortName.equals(other$shortName)) {
            return false;
        }
        String this$barCode = this.getBarCode();
        String other$barCode = other.getBarCode();
        if (this$barCode == null ? other$barCode != null : !this$barCode.equals(other$barCode)) {
            return false;
        }
        String this$mnemonicCode = this.getMnemonicCode();
        String other$mnemonicCode = other.getMnemonicCode();
        return !(this$mnemonicCode == null ? other$mnemonicCode != null : !this$mnemonicCode.equals(other$mnemonicCode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductSkuDetailIPass;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $fNoTaxCostPrice = this.getFNoTaxCostPrice();
        result = result * 59 + ($fNoTaxCostPrice == null ? 43 : ((Object)$fNoTaxCostPrice).hashCode());
        Long $fPrimeCosts = this.getFPrimeCosts();
        result = result * 59 + ($fPrimeCosts == null ? 43 : ((Object)$fPrimeCosts).hashCode());
        Long $iMinOrderQuantity = this.getIMinOrderQuantity();
        result = result * 59 + ($iMinOrderQuantity == null ? 43 : ((Object)$iMinOrderQuantity).hashCode());
        Long $iDoubleSale = this.getIDoubleSale();
        result = result * 59 + ($iDoubleSale == null ? 43 : ((Object)$iDoubleSale).hashCode());
        Long $batchDeliveryDays = this.getBatchDeliveryDays();
        result = result * 59 + ($batchDeliveryDays == null ? 43 : ((Object)$batchDeliveryDays).hashCode());
        Long $markPrice = this.getMarkPrice();
        result = result * 59 + ($markPrice == null ? 43 : ((Object)$markPrice).hashCode());
        Long $salePrice = this.getSalePrice();
        result = result * 59 + ($salePrice == null ? 43 : ((Object)$salePrice).hashCode());
        Long $fMarketPrice = this.getFMarketPrice();
        result = result * 59 + ($fMarketPrice == null ? 43 : ((Object)$fMarketPrice).hashCode());
        Long $fSettleAccountsRate = this.getFSettleAccountsRate();
        result = result * 59 + ($fSettleAccountsRate == null ? 43 : ((Object)$fSettleAccountsRate).hashCode());
        Long $inventoryCount = this.getInventoryCount();
        result = result * 59 + ($inventoryCount == null ? 43 : ((Object)$inventoryCount).hashCode());
        Long $safetyStock = this.getSafetyStock();
        result = result * 59 + ($safetyStock == null ? 43 : ((Object)$safetyStock).hashCode());
        Long $iOrder = this.getIOrder();
        result = result * 59 + ($iOrder == null ? 43 : ((Object)$iOrder).hashCode());
        Boolean $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Boolean $ustatus = this.getUstatus();
        result = result * 59 + ($ustatus == null ? 43 : ((Object)$ustatus).hashCode());
        Boolean $stopstatus = this.getStopstatus();
        result = result * 59 + ($stopstatus == null ? 43 : ((Object)$stopstatus).hashCode());
        String $shortName = this.getShortName();
        result = result * 59 + ($shortName == null ? 43 : $shortName.hashCode());
        String $barCode = this.getBarCode();
        result = result * 59 + ($barCode == null ? 43 : $barCode.hashCode());
        String $mnemonicCode = this.getMnemonicCode();
        result = result * 59 + ($mnemonicCode == null ? 43 : $mnemonicCode.hashCode());
        return result;
    }

    public String toString() {
        return "ProductSkuDetailIPass(shortName=" + this.getShortName() + ", barCode=" + this.getBarCode() + ", mnemonicCode=" + this.getMnemonicCode() + ", fNoTaxCostPrice=" + this.getFNoTaxCostPrice() + ", fPrimeCosts=" + this.getFPrimeCosts() + ", iMinOrderQuantity=" + this.getIMinOrderQuantity() + ", iDoubleSale=" + this.getIDoubleSale() + ", batchDeliveryDays=" + this.getBatchDeliveryDays() + ", markPrice=" + this.getMarkPrice() + ", salePrice=" + this.getSalePrice() + ", fMarketPrice=" + this.getFMarketPrice() + ", fSettleAccountsRate=" + this.getFSettleAccountsRate() + ", inventoryCount=" + this.getInventoryCount() + ", safetyStock=" + this.getSafetyStock() + ", iOrder=" + this.getIOrder() + ", status=" + this.getStatus() + ", ustatus=" + this.getUstatus() + ", stopstatus=" + this.getStopstatus() + ")";
    }
}

