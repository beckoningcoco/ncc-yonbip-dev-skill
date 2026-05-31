/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ProductAsistUnitDTO;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductBusiUnitDTO
implements Serializable {
    private Long productId;
    private Long mainUnitId;
    private String mainUnitName;
    private String mainUnitCode;
    private Integer mainUnitPrecision;
    private Integer mainUnitTruncationType;
    private BigDecimal mainUnitConvertCoefficient;
    private List<ProductAsistUnitDTO> assistUnitDTOList;
    private ProductAsistUnitDTO purchaseUnitDTO;
    private ProductAsistUnitDTO purchasePriceUnitDTO;
    private ProductAsistUnitDTO stockUnitDTO;
    private ProductAsistUnitDTO produceUnitDTO;
    private ProductAsistUnitDTO batchPriceUnitDTO;
    private ProductAsistUnitDTO inspectionUnitDTO;
    private ProductAsistUnitDTO batchUnitDTO;
    private ProductAsistUnitDTO requireUnitDTO;
    private ProductAsistUnitDTO demandPlanningUnitDTO;
    private ProductAsistUnitDTO onlineUnitDTO;
    private ProductAsistUnitDTO offlineUnitDTO;

    public Long getProductId() {
        return this.productId;
    }

    public Long getMainUnitId() {
        return this.mainUnitId;
    }

    public String getMainUnitName() {
        return this.mainUnitName;
    }

    public String getMainUnitCode() {
        return this.mainUnitCode;
    }

    public Integer getMainUnitPrecision() {
        return this.mainUnitPrecision;
    }

    public Integer getMainUnitTruncationType() {
        return this.mainUnitTruncationType;
    }

    public BigDecimal getMainUnitConvertCoefficient() {
        return this.mainUnitConvertCoefficient;
    }

    public List<ProductAsistUnitDTO> getAssistUnitDTOList() {
        return this.assistUnitDTOList;
    }

    public ProductAsistUnitDTO getPurchaseUnitDTO() {
        return this.purchaseUnitDTO;
    }

    public ProductAsistUnitDTO getPurchasePriceUnitDTO() {
        return this.purchasePriceUnitDTO;
    }

    public ProductAsistUnitDTO getStockUnitDTO() {
        return this.stockUnitDTO;
    }

    public ProductAsistUnitDTO getProduceUnitDTO() {
        return this.produceUnitDTO;
    }

    public ProductAsistUnitDTO getBatchPriceUnitDTO() {
        return this.batchPriceUnitDTO;
    }

    public ProductAsistUnitDTO getInspectionUnitDTO() {
        return this.inspectionUnitDTO;
    }

    public ProductAsistUnitDTO getBatchUnitDTO() {
        return this.batchUnitDTO;
    }

    public ProductAsistUnitDTO getRequireUnitDTO() {
        return this.requireUnitDTO;
    }

    public ProductAsistUnitDTO getDemandPlanningUnitDTO() {
        return this.demandPlanningUnitDTO;
    }

    public ProductAsistUnitDTO getOnlineUnitDTO() {
        return this.onlineUnitDTO;
    }

    public ProductAsistUnitDTO getOfflineUnitDTO() {
        return this.offlineUnitDTO;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setMainUnitId(Long mainUnitId) {
        this.mainUnitId = mainUnitId;
    }

    public void setMainUnitName(String mainUnitName) {
        this.mainUnitName = mainUnitName;
    }

    public void setMainUnitCode(String mainUnitCode) {
        this.mainUnitCode = mainUnitCode;
    }

    public void setMainUnitPrecision(Integer mainUnitPrecision) {
        this.mainUnitPrecision = mainUnitPrecision;
    }

    public void setMainUnitTruncationType(Integer mainUnitTruncationType) {
        this.mainUnitTruncationType = mainUnitTruncationType;
    }

    public void setMainUnitConvertCoefficient(BigDecimal mainUnitConvertCoefficient) {
        this.mainUnitConvertCoefficient = mainUnitConvertCoefficient;
    }

    public void setAssistUnitDTOList(List<ProductAsistUnitDTO> assistUnitDTOList) {
        this.assistUnitDTOList = assistUnitDTOList;
    }

    public void setPurchaseUnitDTO(ProductAsistUnitDTO purchaseUnitDTO) {
        this.purchaseUnitDTO = purchaseUnitDTO;
    }

    public void setPurchasePriceUnitDTO(ProductAsistUnitDTO purchasePriceUnitDTO) {
        this.purchasePriceUnitDTO = purchasePriceUnitDTO;
    }

    public void setStockUnitDTO(ProductAsistUnitDTO stockUnitDTO) {
        this.stockUnitDTO = stockUnitDTO;
    }

    public void setProduceUnitDTO(ProductAsistUnitDTO produceUnitDTO) {
        this.produceUnitDTO = produceUnitDTO;
    }

    public void setBatchPriceUnitDTO(ProductAsistUnitDTO batchPriceUnitDTO) {
        this.batchPriceUnitDTO = batchPriceUnitDTO;
    }

    public void setInspectionUnitDTO(ProductAsistUnitDTO inspectionUnitDTO) {
        this.inspectionUnitDTO = inspectionUnitDTO;
    }

    public void setBatchUnitDTO(ProductAsistUnitDTO batchUnitDTO) {
        this.batchUnitDTO = batchUnitDTO;
    }

    public void setRequireUnitDTO(ProductAsistUnitDTO requireUnitDTO) {
        this.requireUnitDTO = requireUnitDTO;
    }

    public void setDemandPlanningUnitDTO(ProductAsistUnitDTO demandPlanningUnitDTO) {
        this.demandPlanningUnitDTO = demandPlanningUnitDTO;
    }

    public void setOnlineUnitDTO(ProductAsistUnitDTO onlineUnitDTO) {
        this.onlineUnitDTO = onlineUnitDTO;
    }

    public void setOfflineUnitDTO(ProductAsistUnitDTO offlineUnitDTO) {
        this.offlineUnitDTO = offlineUnitDTO;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductBusiUnitDTO)) {
            return false;
        }
        ProductBusiUnitDTO other = (ProductBusiUnitDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        Long this$mainUnitId = this.getMainUnitId();
        Long other$mainUnitId = other.getMainUnitId();
        if (this$mainUnitId == null ? other$mainUnitId != null : !((Object)this$mainUnitId).equals(other$mainUnitId)) {
            return false;
        }
        Integer this$mainUnitPrecision = this.getMainUnitPrecision();
        Integer other$mainUnitPrecision = other.getMainUnitPrecision();
        if (this$mainUnitPrecision == null ? other$mainUnitPrecision != null : !((Object)this$mainUnitPrecision).equals(other$mainUnitPrecision)) {
            return false;
        }
        Integer this$mainUnitTruncationType = this.getMainUnitTruncationType();
        Integer other$mainUnitTruncationType = other.getMainUnitTruncationType();
        if (this$mainUnitTruncationType == null ? other$mainUnitTruncationType != null : !((Object)this$mainUnitTruncationType).equals(other$mainUnitTruncationType)) {
            return false;
        }
        String this$mainUnitName = this.getMainUnitName();
        String other$mainUnitName = other.getMainUnitName();
        if (this$mainUnitName == null ? other$mainUnitName != null : !this$mainUnitName.equals(other$mainUnitName)) {
            return false;
        }
        String this$mainUnitCode = this.getMainUnitCode();
        String other$mainUnitCode = other.getMainUnitCode();
        if (this$mainUnitCode == null ? other$mainUnitCode != null : !this$mainUnitCode.equals(other$mainUnitCode)) {
            return false;
        }
        BigDecimal this$mainUnitConvertCoefficient = this.getMainUnitConvertCoefficient();
        BigDecimal other$mainUnitConvertCoefficient = other.getMainUnitConvertCoefficient();
        if (this$mainUnitConvertCoefficient == null ? other$mainUnitConvertCoefficient != null : !((Object)this$mainUnitConvertCoefficient).equals(other$mainUnitConvertCoefficient)) {
            return false;
        }
        List<ProductAsistUnitDTO> this$assistUnitDTOList = this.getAssistUnitDTOList();
        List<ProductAsistUnitDTO> other$assistUnitDTOList = other.getAssistUnitDTOList();
        if (this$assistUnitDTOList == null ? other$assistUnitDTOList != null : !((Object)this$assistUnitDTOList).equals(other$assistUnitDTOList)) {
            return false;
        }
        ProductAsistUnitDTO this$purchaseUnitDTO = this.getPurchaseUnitDTO();
        ProductAsistUnitDTO other$purchaseUnitDTO = other.getPurchaseUnitDTO();
        if (this$purchaseUnitDTO == null ? other$purchaseUnitDTO != null : !((Object)this$purchaseUnitDTO).equals(other$purchaseUnitDTO)) {
            return false;
        }
        ProductAsistUnitDTO this$purchasePriceUnitDTO = this.getPurchasePriceUnitDTO();
        ProductAsistUnitDTO other$purchasePriceUnitDTO = other.getPurchasePriceUnitDTO();
        if (this$purchasePriceUnitDTO == null ? other$purchasePriceUnitDTO != null : !((Object)this$purchasePriceUnitDTO).equals(other$purchasePriceUnitDTO)) {
            return false;
        }
        ProductAsistUnitDTO this$stockUnitDTO = this.getStockUnitDTO();
        ProductAsistUnitDTO other$stockUnitDTO = other.getStockUnitDTO();
        if (this$stockUnitDTO == null ? other$stockUnitDTO != null : !((Object)this$stockUnitDTO).equals(other$stockUnitDTO)) {
            return false;
        }
        ProductAsistUnitDTO this$produceUnitDTO = this.getProduceUnitDTO();
        ProductAsistUnitDTO other$produceUnitDTO = other.getProduceUnitDTO();
        if (this$produceUnitDTO == null ? other$produceUnitDTO != null : !((Object)this$produceUnitDTO).equals(other$produceUnitDTO)) {
            return false;
        }
        ProductAsistUnitDTO this$batchPriceUnitDTO = this.getBatchPriceUnitDTO();
        ProductAsistUnitDTO other$batchPriceUnitDTO = other.getBatchPriceUnitDTO();
        if (this$batchPriceUnitDTO == null ? other$batchPriceUnitDTO != null : !((Object)this$batchPriceUnitDTO).equals(other$batchPriceUnitDTO)) {
            return false;
        }
        ProductAsistUnitDTO this$inspectionUnitDTO = this.getInspectionUnitDTO();
        ProductAsistUnitDTO other$inspectionUnitDTO = other.getInspectionUnitDTO();
        if (this$inspectionUnitDTO == null ? other$inspectionUnitDTO != null : !((Object)this$inspectionUnitDTO).equals(other$inspectionUnitDTO)) {
            return false;
        }
        ProductAsistUnitDTO this$batchUnitDTO = this.getBatchUnitDTO();
        ProductAsistUnitDTO other$batchUnitDTO = other.getBatchUnitDTO();
        if (this$batchUnitDTO == null ? other$batchUnitDTO != null : !((Object)this$batchUnitDTO).equals(other$batchUnitDTO)) {
            return false;
        }
        ProductAsistUnitDTO this$requireUnitDTO = this.getRequireUnitDTO();
        ProductAsistUnitDTO other$requireUnitDTO = other.getRequireUnitDTO();
        if (this$requireUnitDTO == null ? other$requireUnitDTO != null : !((Object)this$requireUnitDTO).equals(other$requireUnitDTO)) {
            return false;
        }
        ProductAsistUnitDTO this$demandPlanningUnitDTO = this.getDemandPlanningUnitDTO();
        ProductAsistUnitDTO other$demandPlanningUnitDTO = other.getDemandPlanningUnitDTO();
        if (this$demandPlanningUnitDTO == null ? other$demandPlanningUnitDTO != null : !((Object)this$demandPlanningUnitDTO).equals(other$demandPlanningUnitDTO)) {
            return false;
        }
        ProductAsistUnitDTO this$onlineUnitDTO = this.getOnlineUnitDTO();
        ProductAsistUnitDTO other$onlineUnitDTO = other.getOnlineUnitDTO();
        if (this$onlineUnitDTO == null ? other$onlineUnitDTO != null : !((Object)this$onlineUnitDTO).equals(other$onlineUnitDTO)) {
            return false;
        }
        ProductAsistUnitDTO this$offlineUnitDTO = this.getOfflineUnitDTO();
        ProductAsistUnitDTO other$offlineUnitDTO = other.getOfflineUnitDTO();
        return !(this$offlineUnitDTO == null ? other$offlineUnitDTO != null : !((Object)this$offlineUnitDTO).equals(other$offlineUnitDTO));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductBusiUnitDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Long $mainUnitId = this.getMainUnitId();
        result = result * 59 + ($mainUnitId == null ? 43 : ((Object)$mainUnitId).hashCode());
        Integer $mainUnitPrecision = this.getMainUnitPrecision();
        result = result * 59 + ($mainUnitPrecision == null ? 43 : ((Object)$mainUnitPrecision).hashCode());
        Integer $mainUnitTruncationType = this.getMainUnitTruncationType();
        result = result * 59 + ($mainUnitTruncationType == null ? 43 : ((Object)$mainUnitTruncationType).hashCode());
        String $mainUnitName = this.getMainUnitName();
        result = result * 59 + ($mainUnitName == null ? 43 : $mainUnitName.hashCode());
        String $mainUnitCode = this.getMainUnitCode();
        result = result * 59 + ($mainUnitCode == null ? 43 : $mainUnitCode.hashCode());
        BigDecimal $mainUnitConvertCoefficient = this.getMainUnitConvertCoefficient();
        result = result * 59 + ($mainUnitConvertCoefficient == null ? 43 : ((Object)$mainUnitConvertCoefficient).hashCode());
        List<ProductAsistUnitDTO> $assistUnitDTOList = this.getAssistUnitDTOList();
        result = result * 59 + ($assistUnitDTOList == null ? 43 : ((Object)$assistUnitDTOList).hashCode());
        ProductAsistUnitDTO $purchaseUnitDTO = this.getPurchaseUnitDTO();
        result = result * 59 + ($purchaseUnitDTO == null ? 43 : ((Object)$purchaseUnitDTO).hashCode());
        ProductAsistUnitDTO $purchasePriceUnitDTO = this.getPurchasePriceUnitDTO();
        result = result * 59 + ($purchasePriceUnitDTO == null ? 43 : ((Object)$purchasePriceUnitDTO).hashCode());
        ProductAsistUnitDTO $stockUnitDTO = this.getStockUnitDTO();
        result = result * 59 + ($stockUnitDTO == null ? 43 : ((Object)$stockUnitDTO).hashCode());
        ProductAsistUnitDTO $produceUnitDTO = this.getProduceUnitDTO();
        result = result * 59 + ($produceUnitDTO == null ? 43 : ((Object)$produceUnitDTO).hashCode());
        ProductAsistUnitDTO $batchPriceUnitDTO = this.getBatchPriceUnitDTO();
        result = result * 59 + ($batchPriceUnitDTO == null ? 43 : ((Object)$batchPriceUnitDTO).hashCode());
        ProductAsistUnitDTO $inspectionUnitDTO = this.getInspectionUnitDTO();
        result = result * 59 + ($inspectionUnitDTO == null ? 43 : ((Object)$inspectionUnitDTO).hashCode());
        ProductAsistUnitDTO $batchUnitDTO = this.getBatchUnitDTO();
        result = result * 59 + ($batchUnitDTO == null ? 43 : ((Object)$batchUnitDTO).hashCode());
        ProductAsistUnitDTO $requireUnitDTO = this.getRequireUnitDTO();
        result = result * 59 + ($requireUnitDTO == null ? 43 : ((Object)$requireUnitDTO).hashCode());
        ProductAsistUnitDTO $demandPlanningUnitDTO = this.getDemandPlanningUnitDTO();
        result = result * 59 + ($demandPlanningUnitDTO == null ? 43 : ((Object)$demandPlanningUnitDTO).hashCode());
        ProductAsistUnitDTO $onlineUnitDTO = this.getOnlineUnitDTO();
        result = result * 59 + ($onlineUnitDTO == null ? 43 : ((Object)$onlineUnitDTO).hashCode());
        ProductAsistUnitDTO $offlineUnitDTO = this.getOfflineUnitDTO();
        result = result * 59 + ($offlineUnitDTO == null ? 43 : ((Object)$offlineUnitDTO).hashCode());
        return result;
    }

    public String toString() {
        return "ProductBusiUnitDTO(productId=" + this.getProductId() + ", mainUnitId=" + this.getMainUnitId() + ", mainUnitName=" + this.getMainUnitName() + ", mainUnitCode=" + this.getMainUnitCode() + ", mainUnitPrecision=" + this.getMainUnitPrecision() + ", mainUnitTruncationType=" + this.getMainUnitTruncationType() + ", mainUnitConvertCoefficient=" + this.getMainUnitConvertCoefficient() + ", assistUnitDTOList=" + this.getAssistUnitDTOList() + ", purchaseUnitDTO=" + this.getPurchaseUnitDTO() + ", purchasePriceUnitDTO=" + this.getPurchasePriceUnitDTO() + ", stockUnitDTO=" + this.getStockUnitDTO() + ", produceUnitDTO=" + this.getProduceUnitDTO() + ", batchPriceUnitDTO=" + this.getBatchPriceUnitDTO() + ", inspectionUnitDTO=" + this.getInspectionUnitDTO() + ", batchUnitDTO=" + this.getBatchUnitDTO() + ", requireUnitDTO=" + this.getRequireUnitDTO() + ", demandPlanningUnitDTO=" + this.getDemandPlanningUnitDTO() + ", onlineUnitDTO=" + this.getOnlineUnitDTO() + ", offlineUnitDTO=" + this.getOfflineUnitDTO() + ")";
    }
}

