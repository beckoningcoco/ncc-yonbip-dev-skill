/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.ucf.CharacterDTO
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.ucf.CharacterDTO;
import com.yonyoucloud.iuap.upc.dto.SkuFreeCharacterDTO;
import com.yonyoucloud.iuap.upc.dto.TagDTO;
import com.yonyoucloud.iuap.upc.sku.dto.SkuBaseDTO;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductSkuDTO
extends SkuBaseDTO
implements Serializable {
    public String salePrice;
    public BigDecimal markPrice;
    public BigDecimal noTaxCostPrice;
    private Boolean ustatus;
    private String orgId;
    private Boolean stopStatus;
    private Long productDetailId;
    private Long productApplyRangeId;
    private Boolean status;
    private BigDecimal batchPrice;
    @JsonProperty(value="fLowestMarkPrice")
    private BigDecimal fLowestMarkPrice;
    @JsonProperty(value="fNoTaxCostPrice")
    private BigDecimal fNoTaxCostPrice;
    @JsonProperty(value="fMarketPrice")
    private BigDecimal fMarketPrice;
    @JsonProperty(value="fPrimeCosts")
    private BigDecimal fPrimeCosts;
    @JsonProperty(value="fSettleAccountsRate")
    private BigDecimal fSettleAccountsRate;
    private String barCode;
    private String mnemonicCode;
    private BigDecimal inventoryCount;
    private Integer iOrder;
    private Integer salePoints;
    private Boolean saled;
    @JsonProperty(value="iMinOrderQuantity")
    private BigDecimal iMinOrderQuantity;
    private Integer batchDeliveryDays;
    private String erpOuterCode;
    private BigDecimal safetyStock;
    private BigDecimal highestStock;
    private BigDecimal lowestStock;
    private Long unit;
    private String unit___code;
    private Integer unit___percision;
    private Integer unit___truncationType;
    private MultiLangText unit___name;
    private Long stockUnit;
    @JsonProperty(value="iDoubleSale")
    private BigDecimal iDoubleSale;
    private Map<String, Object> skuFreeCharacter;
    private Map<String, Object> skuPropCharacter;
    private Map<String, Object> productSkuCharacterDef;
    private String freeValueIds;
    private String freeValueIdsMd5;
    private List<CharacterDTO> characterDTOList;
    private String productUrl;
    List<TagDTO> tagList;
    private Date pubts;
    private Long batchPriceUnit;
    private BigDecimal batchPriceUnitRate;
    private Long scanCountUnit;
    private Long productTemplate;
    private Integer unitExchangeType;
    private List<SkuFreeCharacterDTO> skuCharacterList;
    private Long requireUnit;
    private String requireUnit___code;
    private MultiLangText requireUnit___name;
    private Integer requireUnit___percision;
    private Long onlineUnit;
    private String onlineUnit___code;
    private MultiLangText onlineUnit___name;
    private Integer onlineUnit___percision;
    private Long offlineUnit;
    private String offlineUnit___code;
    private MultiLangText offlineUnit___name;
    private Integer offlineUnit___percision;
    private Boolean isBatchManage;
    private Boolean isExpiryDateManage;
    private Boolean isSerialNoManage;
    private Integer expireDateNo;
    private Long expireDateUnit;
    private String productMnemonicCode;
    private Long manageClass;
    private Long productClass;

    public String getSalePrice() {
        return this.salePrice;
    }

    public BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    public BigDecimal getNoTaxCostPrice() {
        return this.noTaxCostPrice;
    }

    public Boolean getUstatus() {
        return this.ustatus;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public Long getProductDetailId() {
        return this.productDetailId;
    }

    public Long getProductApplyRangeId() {
        return this.productApplyRangeId;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public BigDecimal getBatchPrice() {
        return this.batchPrice;
    }

    public BigDecimal getFLowestMarkPrice() {
        return this.fLowestMarkPrice;
    }

    public BigDecimal getFNoTaxCostPrice() {
        return this.fNoTaxCostPrice;
    }

    public BigDecimal getFMarketPrice() {
        return this.fMarketPrice;
    }

    public BigDecimal getFPrimeCosts() {
        return this.fPrimeCosts;
    }

    public BigDecimal getFSettleAccountsRate() {
        return this.fSettleAccountsRate;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public String getMnemonicCode() {
        return this.mnemonicCode;
    }

    public BigDecimal getInventoryCount() {
        return this.inventoryCount;
    }

    public Integer getIOrder() {
        return this.iOrder;
    }

    public Integer getSalePoints() {
        return this.salePoints;
    }

    public Boolean getSaled() {
        return this.saled;
    }

    public BigDecimal getIMinOrderQuantity() {
        return this.iMinOrderQuantity;
    }

    public Integer getBatchDeliveryDays() {
        return this.batchDeliveryDays;
    }

    public String getErpOuterCode() {
        return this.erpOuterCode;
    }

    public BigDecimal getSafetyStock() {
        return this.safetyStock;
    }

    public BigDecimal getHighestStock() {
        return this.highestStock;
    }

    public BigDecimal getLowestStock() {
        return this.lowestStock;
    }

    public Long getUnit() {
        return this.unit;
    }

    public String getUnit___code() {
        return this.unit___code;
    }

    public Integer getUnit___percision() {
        return this.unit___percision;
    }

    public Integer getUnit___truncationType() {
        return this.unit___truncationType;
    }

    public MultiLangText getUnit___name() {
        return this.unit___name;
    }

    public Long getStockUnit() {
        return this.stockUnit;
    }

    public BigDecimal getIDoubleSale() {
        return this.iDoubleSale;
    }

    public Map<String, Object> getSkuFreeCharacter() {
        return this.skuFreeCharacter;
    }

    public Map<String, Object> getSkuPropCharacter() {
        return this.skuPropCharacter;
    }

    public Map<String, Object> getProductSkuCharacterDef() {
        return this.productSkuCharacterDef;
    }

    public String getFreeValueIds() {
        return this.freeValueIds;
    }

    public String getFreeValueIdsMd5() {
        return this.freeValueIdsMd5;
    }

    public List<CharacterDTO> getCharacterDTOList() {
        return this.characterDTOList;
    }

    public String getProductUrl() {
        return this.productUrl;
    }

    public List<TagDTO> getTagList() {
        return this.tagList;
    }

    public Date getPubts() {
        return this.pubts;
    }

    public Long getBatchPriceUnit() {
        return this.batchPriceUnit;
    }

    public BigDecimal getBatchPriceUnitRate() {
        return this.batchPriceUnitRate;
    }

    public Long getScanCountUnit() {
        return this.scanCountUnit;
    }

    public Long getProductTemplate() {
        return this.productTemplate;
    }

    public Integer getUnitExchangeType() {
        return this.unitExchangeType;
    }

    public List<SkuFreeCharacterDTO> getSkuCharacterList() {
        return this.skuCharacterList;
    }

    public Long getRequireUnit() {
        return this.requireUnit;
    }

    public String getRequireUnit___code() {
        return this.requireUnit___code;
    }

    public MultiLangText getRequireUnit___name() {
        return this.requireUnit___name;
    }

    public Integer getRequireUnit___percision() {
        return this.requireUnit___percision;
    }

    public Long getOnlineUnit() {
        return this.onlineUnit;
    }

    public String getOnlineUnit___code() {
        return this.onlineUnit___code;
    }

    public MultiLangText getOnlineUnit___name() {
        return this.onlineUnit___name;
    }

    public Integer getOnlineUnit___percision() {
        return this.onlineUnit___percision;
    }

    public Long getOfflineUnit() {
        return this.offlineUnit;
    }

    public String getOfflineUnit___code() {
        return this.offlineUnit___code;
    }

    public MultiLangText getOfflineUnit___name() {
        return this.offlineUnit___name;
    }

    public Integer getOfflineUnit___percision() {
        return this.offlineUnit___percision;
    }

    public Boolean getIsBatchManage() {
        return this.isBatchManage;
    }

    public Boolean getIsExpiryDateManage() {
        return this.isExpiryDateManage;
    }

    public Boolean getIsSerialNoManage() {
        return this.isSerialNoManage;
    }

    public Integer getExpireDateNo() {
        return this.expireDateNo;
    }

    public Long getExpireDateUnit() {
        return this.expireDateUnit;
    }

    public String getProductMnemonicCode() {
        return this.productMnemonicCode;
    }

    public Long getManageClass() {
        return this.manageClass;
    }

    public Long getProductClass() {
        return this.productClass;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public void setMarkPrice(BigDecimal markPrice) {
        this.markPrice = markPrice;
    }

    public void setNoTaxCostPrice(BigDecimal noTaxCostPrice) {
        this.noTaxCostPrice = noTaxCostPrice;
    }

    public void setUstatus(Boolean ustatus) {
        this.ustatus = ustatus;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setProductDetailId(Long productDetailId) {
        this.productDetailId = productDetailId;
    }

    public void setProductApplyRangeId(Long productApplyRangeId) {
        this.productApplyRangeId = productApplyRangeId;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setBatchPrice(BigDecimal batchPrice) {
        this.batchPrice = batchPrice;
    }

    @JsonProperty(value="fLowestMarkPrice")
    public void setFLowestMarkPrice(BigDecimal fLowestMarkPrice) {
        this.fLowestMarkPrice = fLowestMarkPrice;
    }

    @JsonProperty(value="fNoTaxCostPrice")
    public void setFNoTaxCostPrice(BigDecimal fNoTaxCostPrice) {
        this.fNoTaxCostPrice = fNoTaxCostPrice;
    }

    @JsonProperty(value="fMarketPrice")
    public void setFMarketPrice(BigDecimal fMarketPrice) {
        this.fMarketPrice = fMarketPrice;
    }

    @JsonProperty(value="fPrimeCosts")
    public void setFPrimeCosts(BigDecimal fPrimeCosts) {
        this.fPrimeCosts = fPrimeCosts;
    }

    @JsonProperty(value="fSettleAccountsRate")
    public void setFSettleAccountsRate(BigDecimal fSettleAccountsRate) {
        this.fSettleAccountsRate = fSettleAccountsRate;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public void setInventoryCount(BigDecimal inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    public void setIOrder(Integer iOrder) {
        this.iOrder = iOrder;
    }

    public void setSalePoints(Integer salePoints) {
        this.salePoints = salePoints;
    }

    public void setSaled(Boolean saled) {
        this.saled = saled;
    }

    @JsonProperty(value="iMinOrderQuantity")
    public void setIMinOrderQuantity(BigDecimal iMinOrderQuantity) {
        this.iMinOrderQuantity = iMinOrderQuantity;
    }

    public void setBatchDeliveryDays(Integer batchDeliveryDays) {
        this.batchDeliveryDays = batchDeliveryDays;
    }

    public void setErpOuterCode(String erpOuterCode) {
        this.erpOuterCode = erpOuterCode;
    }

    public void setSafetyStock(BigDecimal safetyStock) {
        this.safetyStock = safetyStock;
    }

    public void setHighestStock(BigDecimal highestStock) {
        this.highestStock = highestStock;
    }

    public void setLowestStock(BigDecimal lowestStock) {
        this.lowestStock = lowestStock;
    }

    public void setUnit(Long unit) {
        this.unit = unit;
    }

    public void setUnit___code(String unit___code) {
        this.unit___code = unit___code;
    }

    public void setUnit___percision(Integer unit___percision) {
        this.unit___percision = unit___percision;
    }

    public void setUnit___truncationType(Integer unit___truncationType) {
        this.unit___truncationType = unit___truncationType;
    }

    public void setUnit___name(MultiLangText unit___name) {
        this.unit___name = unit___name;
    }

    public void setStockUnit(Long stockUnit) {
        this.stockUnit = stockUnit;
    }

    @JsonProperty(value="iDoubleSale")
    public void setIDoubleSale(BigDecimal iDoubleSale) {
        this.iDoubleSale = iDoubleSale;
    }

    public void setSkuFreeCharacter(Map<String, Object> skuFreeCharacter) {
        this.skuFreeCharacter = skuFreeCharacter;
    }

    public void setSkuPropCharacter(Map<String, Object> skuPropCharacter) {
        this.skuPropCharacter = skuPropCharacter;
    }

    public void setProductSkuCharacterDef(Map<String, Object> productSkuCharacterDef) {
        this.productSkuCharacterDef = productSkuCharacterDef;
    }

    public void setFreeValueIds(String freeValueIds) {
        this.freeValueIds = freeValueIds;
    }

    public void setFreeValueIdsMd5(String freeValueIdsMd5) {
        this.freeValueIdsMd5 = freeValueIdsMd5;
    }

    public void setCharacterDTOList(List<CharacterDTO> characterDTOList) {
        this.characterDTOList = characterDTOList;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public void setTagList(List<TagDTO> tagList) {
        this.tagList = tagList;
    }

    public void setPubts(Date pubts) {
        this.pubts = pubts;
    }

    public void setBatchPriceUnit(Long batchPriceUnit) {
        this.batchPriceUnit = batchPriceUnit;
    }

    public void setBatchPriceUnitRate(BigDecimal batchPriceUnitRate) {
        this.batchPriceUnitRate = batchPriceUnitRate;
    }

    public void setScanCountUnit(Long scanCountUnit) {
        this.scanCountUnit = scanCountUnit;
    }

    public void setProductTemplate(Long productTemplate) {
        this.productTemplate = productTemplate;
    }

    public void setUnitExchangeType(Integer unitExchangeType) {
        this.unitExchangeType = unitExchangeType;
    }

    public void setSkuCharacterList(List<SkuFreeCharacterDTO> skuCharacterList) {
        this.skuCharacterList = skuCharacterList;
    }

    public void setRequireUnit(Long requireUnit) {
        this.requireUnit = requireUnit;
    }

    public void setRequireUnit___code(String requireUnit___code) {
        this.requireUnit___code = requireUnit___code;
    }

    public void setRequireUnit___name(MultiLangText requireUnit___name) {
        this.requireUnit___name = requireUnit___name;
    }

    public void setRequireUnit___percision(Integer requireUnit___percision) {
        this.requireUnit___percision = requireUnit___percision;
    }

    public void setOnlineUnit(Long onlineUnit) {
        this.onlineUnit = onlineUnit;
    }

    public void setOnlineUnit___code(String onlineUnit___code) {
        this.onlineUnit___code = onlineUnit___code;
    }

    public void setOnlineUnit___name(MultiLangText onlineUnit___name) {
        this.onlineUnit___name = onlineUnit___name;
    }

    public void setOnlineUnit___percision(Integer onlineUnit___percision) {
        this.onlineUnit___percision = onlineUnit___percision;
    }

    public void setOfflineUnit(Long offlineUnit) {
        this.offlineUnit = offlineUnit;
    }

    public void setOfflineUnit___code(String offlineUnit___code) {
        this.offlineUnit___code = offlineUnit___code;
    }

    public void setOfflineUnit___name(MultiLangText offlineUnit___name) {
        this.offlineUnit___name = offlineUnit___name;
    }

    public void setOfflineUnit___percision(Integer offlineUnit___percision) {
        this.offlineUnit___percision = offlineUnit___percision;
    }

    public void setIsBatchManage(Boolean isBatchManage) {
        this.isBatchManage = isBatchManage;
    }

    public void setIsExpiryDateManage(Boolean isExpiryDateManage) {
        this.isExpiryDateManage = isExpiryDateManage;
    }

    public void setIsSerialNoManage(Boolean isSerialNoManage) {
        this.isSerialNoManage = isSerialNoManage;
    }

    public void setExpireDateNo(Integer expireDateNo) {
        this.expireDateNo = expireDateNo;
    }

    public void setExpireDateUnit(Long expireDateUnit) {
        this.expireDateUnit = expireDateUnit;
    }

    public void setProductMnemonicCode(String productMnemonicCode) {
        this.productMnemonicCode = productMnemonicCode;
    }

    public void setManageClass(Long manageClass) {
        this.manageClass = manageClass;
    }

    public void setProductClass(Long productClass) {
        this.productClass = productClass;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductSkuDTO)) {
            return false;
        }
        ProductSkuDTO other = (ProductSkuDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$ustatus = this.getUstatus();
        Boolean other$ustatus = other.getUstatus();
        if (this$ustatus == null ? other$ustatus != null : !((Object)this$ustatus).equals(other$ustatus)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
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
        Boolean this$status = this.getStatus();
        Boolean other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Integer this$iOrder = this.getIOrder();
        Integer other$iOrder = other.getIOrder();
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
        Long this$unit = this.getUnit();
        Long other$unit = other.getUnit();
        if (this$unit == null ? other$unit != null : !((Object)this$unit).equals(other$unit)) {
            return false;
        }
        Integer this$unit___percision = this.getUnit___percision();
        Integer other$unit___percision = other.getUnit___percision();
        if (this$unit___percision == null ? other$unit___percision != null : !((Object)this$unit___percision).equals(other$unit___percision)) {
            return false;
        }
        Integer this$unit___truncationType = this.getUnit___truncationType();
        Integer other$unit___truncationType = other.getUnit___truncationType();
        if (this$unit___truncationType == null ? other$unit___truncationType != null : !((Object)this$unit___truncationType).equals(other$unit___truncationType)) {
            return false;
        }
        Long this$stockUnit = this.getStockUnit();
        Long other$stockUnit = other.getStockUnit();
        if (this$stockUnit == null ? other$stockUnit != null : !((Object)this$stockUnit).equals(other$stockUnit)) {
            return false;
        }
        Long this$batchPriceUnit = this.getBatchPriceUnit();
        Long other$batchPriceUnit = other.getBatchPriceUnit();
        if (this$batchPriceUnit == null ? other$batchPriceUnit != null : !((Object)this$batchPriceUnit).equals(other$batchPriceUnit)) {
            return false;
        }
        Long this$scanCountUnit = this.getScanCountUnit();
        Long other$scanCountUnit = other.getScanCountUnit();
        if (this$scanCountUnit == null ? other$scanCountUnit != null : !((Object)this$scanCountUnit).equals(other$scanCountUnit)) {
            return false;
        }
        Long this$productTemplate = this.getProductTemplate();
        Long other$productTemplate = other.getProductTemplate();
        if (this$productTemplate == null ? other$productTemplate != null : !((Object)this$productTemplate).equals(other$productTemplate)) {
            return false;
        }
        Integer this$unitExchangeType = this.getUnitExchangeType();
        Integer other$unitExchangeType = other.getUnitExchangeType();
        if (this$unitExchangeType == null ? other$unitExchangeType != null : !((Object)this$unitExchangeType).equals(other$unitExchangeType)) {
            return false;
        }
        Long this$requireUnit = this.getRequireUnit();
        Long other$requireUnit = other.getRequireUnit();
        if (this$requireUnit == null ? other$requireUnit != null : !((Object)this$requireUnit).equals(other$requireUnit)) {
            return false;
        }
        Integer this$requireUnit___percision = this.getRequireUnit___percision();
        Integer other$requireUnit___percision = other.getRequireUnit___percision();
        if (this$requireUnit___percision == null ? other$requireUnit___percision != null : !((Object)this$requireUnit___percision).equals(other$requireUnit___percision)) {
            return false;
        }
        Long this$onlineUnit = this.getOnlineUnit();
        Long other$onlineUnit = other.getOnlineUnit();
        if (this$onlineUnit == null ? other$onlineUnit != null : !((Object)this$onlineUnit).equals(other$onlineUnit)) {
            return false;
        }
        Integer this$onlineUnit___percision = this.getOnlineUnit___percision();
        Integer other$onlineUnit___percision = other.getOnlineUnit___percision();
        if (this$onlineUnit___percision == null ? other$onlineUnit___percision != null : !((Object)this$onlineUnit___percision).equals(other$onlineUnit___percision)) {
            return false;
        }
        Long this$offlineUnit = this.getOfflineUnit();
        Long other$offlineUnit = other.getOfflineUnit();
        if (this$offlineUnit == null ? other$offlineUnit != null : !((Object)this$offlineUnit).equals(other$offlineUnit)) {
            return false;
        }
        Integer this$offlineUnit___percision = this.getOfflineUnit___percision();
        Integer other$offlineUnit___percision = other.getOfflineUnit___percision();
        if (this$offlineUnit___percision == null ? other$offlineUnit___percision != null : !((Object)this$offlineUnit___percision).equals(other$offlineUnit___percision)) {
            return false;
        }
        Boolean this$isBatchManage = this.getIsBatchManage();
        Boolean other$isBatchManage = other.getIsBatchManage();
        if (this$isBatchManage == null ? other$isBatchManage != null : !((Object)this$isBatchManage).equals(other$isBatchManage)) {
            return false;
        }
        Boolean this$isExpiryDateManage = this.getIsExpiryDateManage();
        Boolean other$isExpiryDateManage = other.getIsExpiryDateManage();
        if (this$isExpiryDateManage == null ? other$isExpiryDateManage != null : !((Object)this$isExpiryDateManage).equals(other$isExpiryDateManage)) {
            return false;
        }
        Boolean this$isSerialNoManage = this.getIsSerialNoManage();
        Boolean other$isSerialNoManage = other.getIsSerialNoManage();
        if (this$isSerialNoManage == null ? other$isSerialNoManage != null : !((Object)this$isSerialNoManage).equals(other$isSerialNoManage)) {
            return false;
        }
        Integer this$expireDateNo = this.getExpireDateNo();
        Integer other$expireDateNo = other.getExpireDateNo();
        if (this$expireDateNo == null ? other$expireDateNo != null : !((Object)this$expireDateNo).equals(other$expireDateNo)) {
            return false;
        }
        Long this$expireDateUnit = this.getExpireDateUnit();
        Long other$expireDateUnit = other.getExpireDateUnit();
        if (this$expireDateUnit == null ? other$expireDateUnit != null : !((Object)this$expireDateUnit).equals(other$expireDateUnit)) {
            return false;
        }
        Long this$manageClass = this.getManageClass();
        Long other$manageClass = other.getManageClass();
        if (this$manageClass == null ? other$manageClass != null : !((Object)this$manageClass).equals(other$manageClass)) {
            return false;
        }
        Long this$productClass = this.getProductClass();
        Long other$productClass = other.getProductClass();
        if (this$productClass == null ? other$productClass != null : !((Object)this$productClass).equals(other$productClass)) {
            return false;
        }
        String this$salePrice = this.getSalePrice();
        String other$salePrice = other.getSalePrice();
        if (this$salePrice == null ? other$salePrice != null : !this$salePrice.equals(other$salePrice)) {
            return false;
        }
        BigDecimal this$markPrice = this.getMarkPrice();
        BigDecimal other$markPrice = other.getMarkPrice();
        if (this$markPrice == null ? other$markPrice != null : !((Object)this$markPrice).equals(other$markPrice)) {
            return false;
        }
        BigDecimal this$noTaxCostPrice = this.getNoTaxCostPrice();
        BigDecimal other$noTaxCostPrice = other.getNoTaxCostPrice();
        if (this$noTaxCostPrice == null ? other$noTaxCostPrice != null : !((Object)this$noTaxCostPrice).equals(other$noTaxCostPrice)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        BigDecimal this$batchPrice = this.getBatchPrice();
        BigDecimal other$batchPrice = other.getBatchPrice();
        if (this$batchPrice == null ? other$batchPrice != null : !((Object)this$batchPrice).equals(other$batchPrice)) {
            return false;
        }
        BigDecimal this$fLowestMarkPrice = this.getFLowestMarkPrice();
        BigDecimal other$fLowestMarkPrice = other.getFLowestMarkPrice();
        if (this$fLowestMarkPrice == null ? other$fLowestMarkPrice != null : !((Object)this$fLowestMarkPrice).equals(other$fLowestMarkPrice)) {
            return false;
        }
        BigDecimal this$fNoTaxCostPrice = this.getFNoTaxCostPrice();
        BigDecimal other$fNoTaxCostPrice = other.getFNoTaxCostPrice();
        if (this$fNoTaxCostPrice == null ? other$fNoTaxCostPrice != null : !((Object)this$fNoTaxCostPrice).equals(other$fNoTaxCostPrice)) {
            return false;
        }
        BigDecimal this$fMarketPrice = this.getFMarketPrice();
        BigDecimal other$fMarketPrice = other.getFMarketPrice();
        if (this$fMarketPrice == null ? other$fMarketPrice != null : !((Object)this$fMarketPrice).equals(other$fMarketPrice)) {
            return false;
        }
        BigDecimal this$fPrimeCosts = this.getFPrimeCosts();
        BigDecimal other$fPrimeCosts = other.getFPrimeCosts();
        if (this$fPrimeCosts == null ? other$fPrimeCosts != null : !((Object)this$fPrimeCosts).equals(other$fPrimeCosts)) {
            return false;
        }
        BigDecimal this$fSettleAccountsRate = this.getFSettleAccountsRate();
        BigDecimal other$fSettleAccountsRate = other.getFSettleAccountsRate();
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
        BigDecimal this$iMinOrderQuantity = this.getIMinOrderQuantity();
        BigDecimal other$iMinOrderQuantity = other.getIMinOrderQuantity();
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
        String this$unit___code = this.getUnit___code();
        String other$unit___code = other.getUnit___code();
        if (this$unit___code == null ? other$unit___code != null : !this$unit___code.equals(other$unit___code)) {
            return false;
        }
        MultiLangText this$unit___name = this.getUnit___name();
        MultiLangText other$unit___name = other.getUnit___name();
        if (this$unit___name == null ? other$unit___name != null : !this$unit___name.equals(other$unit___name)) {
            return false;
        }
        BigDecimal this$iDoubleSale = this.getIDoubleSale();
        BigDecimal other$iDoubleSale = other.getIDoubleSale();
        if (this$iDoubleSale == null ? other$iDoubleSale != null : !((Object)this$iDoubleSale).equals(other$iDoubleSale)) {
            return false;
        }
        Map<String, Object> this$skuFreeCharacter = this.getSkuFreeCharacter();
        Map<String, Object> other$skuFreeCharacter = other.getSkuFreeCharacter();
        if (this$skuFreeCharacter == null ? other$skuFreeCharacter != null : !((Object)this$skuFreeCharacter).equals(other$skuFreeCharacter)) {
            return false;
        }
        Map<String, Object> this$skuPropCharacter = this.getSkuPropCharacter();
        Map<String, Object> other$skuPropCharacter = other.getSkuPropCharacter();
        if (this$skuPropCharacter == null ? other$skuPropCharacter != null : !((Object)this$skuPropCharacter).equals(other$skuPropCharacter)) {
            return false;
        }
        Map<String, Object> this$productSkuCharacterDef = this.getProductSkuCharacterDef();
        Map<String, Object> other$productSkuCharacterDef = other.getProductSkuCharacterDef();
        if (this$productSkuCharacterDef == null ? other$productSkuCharacterDef != null : !((Object)this$productSkuCharacterDef).equals(other$productSkuCharacterDef)) {
            return false;
        }
        String this$freeValueIds = this.getFreeValueIds();
        String other$freeValueIds = other.getFreeValueIds();
        if (this$freeValueIds == null ? other$freeValueIds != null : !this$freeValueIds.equals(other$freeValueIds)) {
            return false;
        }
        String this$freeValueIdsMd5 = this.getFreeValueIdsMd5();
        String other$freeValueIdsMd5 = other.getFreeValueIdsMd5();
        if (this$freeValueIdsMd5 == null ? other$freeValueIdsMd5 != null : !this$freeValueIdsMd5.equals(other$freeValueIdsMd5)) {
            return false;
        }
        List<CharacterDTO> this$characterDTOList = this.getCharacterDTOList();
        List<CharacterDTO> other$characterDTOList = other.getCharacterDTOList();
        if (this$characterDTOList == null ? other$characterDTOList != null : !((Object)this$characterDTOList).equals(other$characterDTOList)) {
            return false;
        }
        String this$productUrl = this.getProductUrl();
        String other$productUrl = other.getProductUrl();
        if (this$productUrl == null ? other$productUrl != null : !this$productUrl.equals(other$productUrl)) {
            return false;
        }
        List<TagDTO> this$tagList = this.getTagList();
        List<TagDTO> other$tagList = other.getTagList();
        if (this$tagList == null ? other$tagList != null : !((Object)this$tagList).equals(other$tagList)) {
            return false;
        }
        Date this$pubts = this.getPubts();
        Date other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !((Object)this$pubts).equals(other$pubts)) {
            return false;
        }
        BigDecimal this$batchPriceUnitRate = this.getBatchPriceUnitRate();
        BigDecimal other$batchPriceUnitRate = other.getBatchPriceUnitRate();
        if (this$batchPriceUnitRate == null ? other$batchPriceUnitRate != null : !((Object)this$batchPriceUnitRate).equals(other$batchPriceUnitRate)) {
            return false;
        }
        List<SkuFreeCharacterDTO> this$skuCharacterList = this.getSkuCharacterList();
        List<SkuFreeCharacterDTO> other$skuCharacterList = other.getSkuCharacterList();
        if (this$skuCharacterList == null ? other$skuCharacterList != null : !((Object)this$skuCharacterList).equals(other$skuCharacterList)) {
            return false;
        }
        String this$requireUnit___code = this.getRequireUnit___code();
        String other$requireUnit___code = other.getRequireUnit___code();
        if (this$requireUnit___code == null ? other$requireUnit___code != null : !this$requireUnit___code.equals(other$requireUnit___code)) {
            return false;
        }
        MultiLangText this$requireUnit___name = this.getRequireUnit___name();
        MultiLangText other$requireUnit___name = other.getRequireUnit___name();
        if (this$requireUnit___name == null ? other$requireUnit___name != null : !this$requireUnit___name.equals(other$requireUnit___name)) {
            return false;
        }
        String this$onlineUnit___code = this.getOnlineUnit___code();
        String other$onlineUnit___code = other.getOnlineUnit___code();
        if (this$onlineUnit___code == null ? other$onlineUnit___code != null : !this$onlineUnit___code.equals(other$onlineUnit___code)) {
            return false;
        }
        MultiLangText this$onlineUnit___name = this.getOnlineUnit___name();
        MultiLangText other$onlineUnit___name = other.getOnlineUnit___name();
        if (this$onlineUnit___name == null ? other$onlineUnit___name != null : !this$onlineUnit___name.equals(other$onlineUnit___name)) {
            return false;
        }
        String this$offlineUnit___code = this.getOfflineUnit___code();
        String other$offlineUnit___code = other.getOfflineUnit___code();
        if (this$offlineUnit___code == null ? other$offlineUnit___code != null : !this$offlineUnit___code.equals(other$offlineUnit___code)) {
            return false;
        }
        MultiLangText this$offlineUnit___name = this.getOfflineUnit___name();
        MultiLangText other$offlineUnit___name = other.getOfflineUnit___name();
        if (this$offlineUnit___name == null ? other$offlineUnit___name != null : !this$offlineUnit___name.equals(other$offlineUnit___name)) {
            return false;
        }
        String this$productMnemonicCode = this.getProductMnemonicCode();
        String other$productMnemonicCode = other.getProductMnemonicCode();
        return !(this$productMnemonicCode == null ? other$productMnemonicCode != null : !this$productMnemonicCode.equals(other$productMnemonicCode));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof ProductSkuDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $ustatus = this.getUstatus();
        result = result * 59 + ($ustatus == null ? 43 : ((Object)$ustatus).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Long $productDetailId = this.getProductDetailId();
        result = result * 59 + ($productDetailId == null ? 43 : ((Object)$productDetailId).hashCode());
        Long $productApplyRangeId = this.getProductApplyRangeId();
        result = result * 59 + ($productApplyRangeId == null ? 43 : ((Object)$productApplyRangeId).hashCode());
        Boolean $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Integer $iOrder = this.getIOrder();
        result = result * 59 + ($iOrder == null ? 43 : ((Object)$iOrder).hashCode());
        Integer $salePoints = this.getSalePoints();
        result = result * 59 + ($salePoints == null ? 43 : ((Object)$salePoints).hashCode());
        Boolean $saled = this.getSaled();
        result = result * 59 + ($saled == null ? 43 : ((Object)$saled).hashCode());
        Integer $batchDeliveryDays = this.getBatchDeliveryDays();
        result = result * 59 + ($batchDeliveryDays == null ? 43 : ((Object)$batchDeliveryDays).hashCode());
        Long $unit = this.getUnit();
        result = result * 59 + ($unit == null ? 43 : ((Object)$unit).hashCode());
        Integer $unit___percision = this.getUnit___percision();
        result = result * 59 + ($unit___percision == null ? 43 : ((Object)$unit___percision).hashCode());
        Integer $unit___truncationType = this.getUnit___truncationType();
        result = result * 59 + ($unit___truncationType == null ? 43 : ((Object)$unit___truncationType).hashCode());
        Long $stockUnit = this.getStockUnit();
        result = result * 59 + ($stockUnit == null ? 43 : ((Object)$stockUnit).hashCode());
        Long $batchPriceUnit = this.getBatchPriceUnit();
        result = result * 59 + ($batchPriceUnit == null ? 43 : ((Object)$batchPriceUnit).hashCode());
        Long $scanCountUnit = this.getScanCountUnit();
        result = result * 59 + ($scanCountUnit == null ? 43 : ((Object)$scanCountUnit).hashCode());
        Long $productTemplate = this.getProductTemplate();
        result = result * 59 + ($productTemplate == null ? 43 : ((Object)$productTemplate).hashCode());
        Integer $unitExchangeType = this.getUnitExchangeType();
        result = result * 59 + ($unitExchangeType == null ? 43 : ((Object)$unitExchangeType).hashCode());
        Long $requireUnit = this.getRequireUnit();
        result = result * 59 + ($requireUnit == null ? 43 : ((Object)$requireUnit).hashCode());
        Integer $requireUnit___percision = this.getRequireUnit___percision();
        result = result * 59 + ($requireUnit___percision == null ? 43 : ((Object)$requireUnit___percision).hashCode());
        Long $onlineUnit = this.getOnlineUnit();
        result = result * 59 + ($onlineUnit == null ? 43 : ((Object)$onlineUnit).hashCode());
        Integer $onlineUnit___percision = this.getOnlineUnit___percision();
        result = result * 59 + ($onlineUnit___percision == null ? 43 : ((Object)$onlineUnit___percision).hashCode());
        Long $offlineUnit = this.getOfflineUnit();
        result = result * 59 + ($offlineUnit == null ? 43 : ((Object)$offlineUnit).hashCode());
        Integer $offlineUnit___percision = this.getOfflineUnit___percision();
        result = result * 59 + ($offlineUnit___percision == null ? 43 : ((Object)$offlineUnit___percision).hashCode());
        Boolean $isBatchManage = this.getIsBatchManage();
        result = result * 59 + ($isBatchManage == null ? 43 : ((Object)$isBatchManage).hashCode());
        Boolean $isExpiryDateManage = this.getIsExpiryDateManage();
        result = result * 59 + ($isExpiryDateManage == null ? 43 : ((Object)$isExpiryDateManage).hashCode());
        Boolean $isSerialNoManage = this.getIsSerialNoManage();
        result = result * 59 + ($isSerialNoManage == null ? 43 : ((Object)$isSerialNoManage).hashCode());
        Integer $expireDateNo = this.getExpireDateNo();
        result = result * 59 + ($expireDateNo == null ? 43 : ((Object)$expireDateNo).hashCode());
        Long $expireDateUnit = this.getExpireDateUnit();
        result = result * 59 + ($expireDateUnit == null ? 43 : ((Object)$expireDateUnit).hashCode());
        Long $manageClass = this.getManageClass();
        result = result * 59 + ($manageClass == null ? 43 : ((Object)$manageClass).hashCode());
        Long $productClass = this.getProductClass();
        result = result * 59 + ($productClass == null ? 43 : ((Object)$productClass).hashCode());
        String $salePrice = this.getSalePrice();
        result = result * 59 + ($salePrice == null ? 43 : $salePrice.hashCode());
        BigDecimal $markPrice = this.getMarkPrice();
        result = result * 59 + ($markPrice == null ? 43 : ((Object)$markPrice).hashCode());
        BigDecimal $noTaxCostPrice = this.getNoTaxCostPrice();
        result = result * 59 + ($noTaxCostPrice == null ? 43 : ((Object)$noTaxCostPrice).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        BigDecimal $batchPrice = this.getBatchPrice();
        result = result * 59 + ($batchPrice == null ? 43 : ((Object)$batchPrice).hashCode());
        BigDecimal $fLowestMarkPrice = this.getFLowestMarkPrice();
        result = result * 59 + ($fLowestMarkPrice == null ? 43 : ((Object)$fLowestMarkPrice).hashCode());
        BigDecimal $fNoTaxCostPrice = this.getFNoTaxCostPrice();
        result = result * 59 + ($fNoTaxCostPrice == null ? 43 : ((Object)$fNoTaxCostPrice).hashCode());
        BigDecimal $fMarketPrice = this.getFMarketPrice();
        result = result * 59 + ($fMarketPrice == null ? 43 : ((Object)$fMarketPrice).hashCode());
        BigDecimal $fPrimeCosts = this.getFPrimeCosts();
        result = result * 59 + ($fPrimeCosts == null ? 43 : ((Object)$fPrimeCosts).hashCode());
        BigDecimal $fSettleAccountsRate = this.getFSettleAccountsRate();
        result = result * 59 + ($fSettleAccountsRate == null ? 43 : ((Object)$fSettleAccountsRate).hashCode());
        String $barCode = this.getBarCode();
        result = result * 59 + ($barCode == null ? 43 : $barCode.hashCode());
        String $mnemonicCode = this.getMnemonicCode();
        result = result * 59 + ($mnemonicCode == null ? 43 : $mnemonicCode.hashCode());
        BigDecimal $inventoryCount = this.getInventoryCount();
        result = result * 59 + ($inventoryCount == null ? 43 : ((Object)$inventoryCount).hashCode());
        BigDecimal $iMinOrderQuantity = this.getIMinOrderQuantity();
        result = result * 59 + ($iMinOrderQuantity == null ? 43 : ((Object)$iMinOrderQuantity).hashCode());
        String $erpOuterCode = this.getErpOuterCode();
        result = result * 59 + ($erpOuterCode == null ? 43 : $erpOuterCode.hashCode());
        BigDecimal $safetyStock = this.getSafetyStock();
        result = result * 59 + ($safetyStock == null ? 43 : ((Object)$safetyStock).hashCode());
        BigDecimal $highestStock = this.getHighestStock();
        result = result * 59 + ($highestStock == null ? 43 : ((Object)$highestStock).hashCode());
        BigDecimal $lowestStock = this.getLowestStock();
        result = result * 59 + ($lowestStock == null ? 43 : ((Object)$lowestStock).hashCode());
        String $unit___code = this.getUnit___code();
        result = result * 59 + ($unit___code == null ? 43 : $unit___code.hashCode());
        MultiLangText $unit___name = this.getUnit___name();
        result = result * 59 + ($unit___name == null ? 43 : $unit___name.hashCode());
        BigDecimal $iDoubleSale = this.getIDoubleSale();
        result = result * 59 + ($iDoubleSale == null ? 43 : ((Object)$iDoubleSale).hashCode());
        Map<String, Object> $skuFreeCharacter = this.getSkuFreeCharacter();
        result = result * 59 + ($skuFreeCharacter == null ? 43 : ((Object)$skuFreeCharacter).hashCode());
        Map<String, Object> $skuPropCharacter = this.getSkuPropCharacter();
        result = result * 59 + ($skuPropCharacter == null ? 43 : ((Object)$skuPropCharacter).hashCode());
        Map<String, Object> $productSkuCharacterDef = this.getProductSkuCharacterDef();
        result = result * 59 + ($productSkuCharacterDef == null ? 43 : ((Object)$productSkuCharacterDef).hashCode());
        String $freeValueIds = this.getFreeValueIds();
        result = result * 59 + ($freeValueIds == null ? 43 : $freeValueIds.hashCode());
        String $freeValueIdsMd5 = this.getFreeValueIdsMd5();
        result = result * 59 + ($freeValueIdsMd5 == null ? 43 : $freeValueIdsMd5.hashCode());
        List<CharacterDTO> $characterDTOList = this.getCharacterDTOList();
        result = result * 59 + ($characterDTOList == null ? 43 : ((Object)$characterDTOList).hashCode());
        String $productUrl = this.getProductUrl();
        result = result * 59 + ($productUrl == null ? 43 : $productUrl.hashCode());
        List<TagDTO> $tagList = this.getTagList();
        result = result * 59 + ($tagList == null ? 43 : ((Object)$tagList).hashCode());
        Date $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : ((Object)$pubts).hashCode());
        BigDecimal $batchPriceUnitRate = this.getBatchPriceUnitRate();
        result = result * 59 + ($batchPriceUnitRate == null ? 43 : ((Object)$batchPriceUnitRate).hashCode());
        List<SkuFreeCharacterDTO> $skuCharacterList = this.getSkuCharacterList();
        result = result * 59 + ($skuCharacterList == null ? 43 : ((Object)$skuCharacterList).hashCode());
        String $requireUnit___code = this.getRequireUnit___code();
        result = result * 59 + ($requireUnit___code == null ? 43 : $requireUnit___code.hashCode());
        MultiLangText $requireUnit___name = this.getRequireUnit___name();
        result = result * 59 + ($requireUnit___name == null ? 43 : $requireUnit___name.hashCode());
        String $onlineUnit___code = this.getOnlineUnit___code();
        result = result * 59 + ($onlineUnit___code == null ? 43 : $onlineUnit___code.hashCode());
        MultiLangText $onlineUnit___name = this.getOnlineUnit___name();
        result = result * 59 + ($onlineUnit___name == null ? 43 : $onlineUnit___name.hashCode());
        String $offlineUnit___code = this.getOfflineUnit___code();
        result = result * 59 + ($offlineUnit___code == null ? 43 : $offlineUnit___code.hashCode());
        MultiLangText $offlineUnit___name = this.getOfflineUnit___name();
        result = result * 59 + ($offlineUnit___name == null ? 43 : $offlineUnit___name.hashCode());
        String $productMnemonicCode = this.getProductMnemonicCode();
        result = result * 59 + ($productMnemonicCode == null ? 43 : $productMnemonicCode.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ProductSkuDTO(salePrice=" + this.getSalePrice() + ", markPrice=" + this.getMarkPrice() + ", noTaxCostPrice=" + this.getNoTaxCostPrice() + ", ustatus=" + this.getUstatus() + ", orgId=" + this.getOrgId() + ", stopStatus=" + this.getStopStatus() + ", productDetailId=" + this.getProductDetailId() + ", productApplyRangeId=" + this.getProductApplyRangeId() + ", status=" + this.getStatus() + ", batchPrice=" + this.getBatchPrice() + ", fLowestMarkPrice=" + this.getFLowestMarkPrice() + ", fNoTaxCostPrice=" + this.getFNoTaxCostPrice() + ", fMarketPrice=" + this.getFMarketPrice() + ", fPrimeCosts=" + this.getFPrimeCosts() + ", fSettleAccountsRate=" + this.getFSettleAccountsRate() + ", barCode=" + this.getBarCode() + ", mnemonicCode=" + this.getMnemonicCode() + ", inventoryCount=" + this.getInventoryCount() + ", iOrder=" + this.getIOrder() + ", salePoints=" + this.getSalePoints() + ", saled=" + this.getSaled() + ", iMinOrderQuantity=" + this.getIMinOrderQuantity() + ", batchDeliveryDays=" + this.getBatchDeliveryDays() + ", erpOuterCode=" + this.getErpOuterCode() + ", safetyStock=" + this.getSafetyStock() + ", highestStock=" + this.getHighestStock() + ", lowestStock=" + this.getLowestStock() + ", unit=" + this.getUnit() + ", unit___code=" + this.getUnit___code() + ", unit___percision=" + this.getUnit___percision() + ", unit___truncationType=" + this.getUnit___truncationType() + ", unit___name=" + this.getUnit___name() + ", stockUnit=" + this.getStockUnit() + ", iDoubleSale=" + this.getIDoubleSale() + ", skuFreeCharacter=" + this.getSkuFreeCharacter() + ", skuPropCharacter=" + this.getSkuPropCharacter() + ", productSkuCharacterDef=" + this.getProductSkuCharacterDef() + ", freeValueIds=" + this.getFreeValueIds() + ", freeValueIdsMd5=" + this.getFreeValueIdsMd5() + ", characterDTOList=" + this.getCharacterDTOList() + ", productUrl=" + this.getProductUrl() + ", tagList=" + this.getTagList() + ", pubts=" + this.getPubts() + ", batchPriceUnit=" + this.getBatchPriceUnit() + ", batchPriceUnitRate=" + this.getBatchPriceUnitRate() + ", scanCountUnit=" + this.getScanCountUnit() + ", productTemplate=" + this.getProductTemplate() + ", unitExchangeType=" + this.getUnitExchangeType() + ", skuCharacterList=" + this.getSkuCharacterList() + ", requireUnit=" + this.getRequireUnit() + ", requireUnit___code=" + this.getRequireUnit___code() + ", requireUnit___name=" + this.getRequireUnit___name() + ", requireUnit___percision=" + this.getRequireUnit___percision() + ", onlineUnit=" + this.getOnlineUnit() + ", onlineUnit___code=" + this.getOnlineUnit___code() + ", onlineUnit___name=" + this.getOnlineUnit___name() + ", onlineUnit___percision=" + this.getOnlineUnit___percision() + ", offlineUnit=" + this.getOfflineUnit() + ", offlineUnit___code=" + this.getOfflineUnit___code() + ", offlineUnit___name=" + this.getOfflineUnit___name() + ", offlineUnit___percision=" + this.getOfflineUnit___percision() + ", isBatchManage=" + this.getIsBatchManage() + ", isExpiryDateManage=" + this.getIsExpiryDateManage() + ", isSerialNoManage=" + this.getIsSerialNoManage() + ", expireDateNo=" + this.getExpireDateNo() + ", expireDateUnit=" + this.getExpireDateUnit() + ", productMnemonicCode=" + this.getProductMnemonicCode() + ", manageClass=" + this.getManageClass() + ", productClass=" + this.getProductClass() + ")";
    }
}

