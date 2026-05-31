/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductQryDTO
extends UPCPager
implements Serializable {
    private String[] field;
    private List<Long> productIdList;
    private List<Long> productIdNotInList;
    private Boolean creator;
    private List<String> createOrgList;
    @Deprecated
    private List<Long> productapplyIdList;
    private String productCode;
    private List<String> productCodeList;
    private String productName;
    private List<String> productNameList;
    private String shortName;
    private Boolean deleteFlag = false;
    private String orgId;
    private List<String> orgStringList;
    @Deprecated
    private List<Long> orgList;
    private List<Long> purchaseClassIdList;
    private List<String> purchaseClassCodeList;
    private List<Long> productClassIdList;
    private List<Long> productClassIdNotInList;
    private List<String> productClassCodeList;
    private String productClassPath;
    private String productClassLeftFuzzyPath;
    private String productClassFuzzyPath;
    private String assistClassesLeftFuzzyPath;
    private String productClassOrAssistClassesLeftFuzzyPath;
    private List<Long> assistClassIdList;
    private List<Long> managerClassIdList;
    private List<Long> managerClassIdNotInList;
    private String manageClassCode;
    private String manageClassLeftFuzzyCode;
    private List<String> managerClassCodeList;
    private List<Long> brandIdList;
    private List<Long> brandIdNotINList;
    private List<Long> productLineIdList;
    private List<Long> productLineIdNotInList;
    private List<Long> costClassIdList;
    private List<String> taxClassCodeList;
    private Boolean taxClassCodeStatusFlag;
    private Long costClassId;
    private Long costClassCode;
    private List<Long> costClassCodeList;
    private List<Long> creatorTypeList;
    private String taxClassCode;
    private Boolean isOil;
    private Boolean stopStatus;
    private List<Long> productTagList;
    private List<Long> shopId;
    private Long productTemplate;
    private Boolean saleInOfflineStore;
    private Boolean offlineStoreOrder;
    private Long couponId;
    private String mnemonicCode;
    private Integer checkFree;
    private Boolean process;
    private Boolean stockSerialNoManage;
    private String fuzzyValue;
    private String CodeOrNameFuzzyValue;
    private String CodeOrNameValue;
    private String nameOrCodeOrBarCodeFuzzyValue;
    private String barCode;
    private String barCodeOrMultiBarCodeFuzzyValue;
    private String nameOrCodeOrBarCodeOrModelDescriptionFuzzyValue;
    private List<Long> productIdOrLikeList;
    private String fuzzyDisplayName;
    private String fuzzyDisplayNameOrCode;
    private String erpCode;
    private List<String> erpCodeList;
    private String modelDescription;
    private String modelDescriptionFuzzy;
    private Long creatorCustomer;
    private String model;
    private String manufacturer;
    private Integer productAttributed;
    private Integer realProductAttribute;
    private HashSet<Integer> realProductAttributeType;
    private HashSet<Integer> virtualProductAttribute;
    private Integer platFormStatus;
    private Boolean saleChannelOfOnlineBatch;
    private Boolean saleChannelOfDistribution;
    private Boolean mktStatus;
    private Boolean mktUOrderStatus;
    private Integer gtOrderUpCount;
    private List<Long> productSpecItemIsSpecItems;
    private Boolean recommendedMaterials;
    private Map<String, Object> productCharacterDef;
    private Map<String, Object> productPropCharacterDefine;
    private Map<String, Object> productExtendCharacterDef;
    private List<String> skuMd5KeyList;
    private HashSet<String> ascField;
    private HashSet<String> descField;
    private Date beganTime;
    private Date endTime;
    private Date pubts;
    private Date beginTime;
    private Boolean valueManageType;
    private String manufacturePlanner;
    private Long planClass;
    private Integer inventoryPlanStrategy;

    public String[] getField() {
        return this.field;
    }

    public List<Long> getProductIdList() {
        return this.productIdList;
    }

    public List<Long> getProductIdNotInList() {
        return this.productIdNotInList;
    }

    public Boolean getCreator() {
        return this.creator;
    }

    public List<String> getCreateOrgList() {
        return this.createOrgList;
    }

    @Deprecated
    public List<Long> getProductapplyIdList() {
        return this.productapplyIdList;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public List<String> getProductCodeList() {
        return this.productCodeList;
    }

    public String getProductName() {
        return this.productName;
    }

    public List<String> getProductNameList() {
        return this.productNameList;
    }

    public String getShortName() {
        return this.shortName;
    }

    public Boolean getDeleteFlag() {
        return this.deleteFlag;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public List<String> getOrgStringList() {
        return this.orgStringList;
    }

    @Deprecated
    public List<Long> getOrgList() {
        return this.orgList;
    }

    public List<Long> getPurchaseClassIdList() {
        return this.purchaseClassIdList;
    }

    public List<String> getPurchaseClassCodeList() {
        return this.purchaseClassCodeList;
    }

    public List<Long> getProductClassIdList() {
        return this.productClassIdList;
    }

    public List<Long> getProductClassIdNotInList() {
        return this.productClassIdNotInList;
    }

    public List<String> getProductClassCodeList() {
        return this.productClassCodeList;
    }

    public String getProductClassPath() {
        return this.productClassPath;
    }

    public String getProductClassLeftFuzzyPath() {
        return this.productClassLeftFuzzyPath;
    }

    public String getProductClassFuzzyPath() {
        return this.productClassFuzzyPath;
    }

    public String getAssistClassesLeftFuzzyPath() {
        return this.assistClassesLeftFuzzyPath;
    }

    public String getProductClassOrAssistClassesLeftFuzzyPath() {
        return this.productClassOrAssistClassesLeftFuzzyPath;
    }

    public List<Long> getAssistClassIdList() {
        return this.assistClassIdList;
    }

    public List<Long> getManagerClassIdList() {
        return this.managerClassIdList;
    }

    public List<Long> getManagerClassIdNotInList() {
        return this.managerClassIdNotInList;
    }

    public String getManageClassCode() {
        return this.manageClassCode;
    }

    public String getManageClassLeftFuzzyCode() {
        return this.manageClassLeftFuzzyCode;
    }

    public List<String> getManagerClassCodeList() {
        return this.managerClassCodeList;
    }

    public List<Long> getBrandIdList() {
        return this.brandIdList;
    }

    public List<Long> getBrandIdNotINList() {
        return this.brandIdNotINList;
    }

    public List<Long> getProductLineIdList() {
        return this.productLineIdList;
    }

    public List<Long> getProductLineIdNotInList() {
        return this.productLineIdNotInList;
    }

    public List<Long> getCostClassIdList() {
        return this.costClassIdList;
    }

    public List<String> getTaxClassCodeList() {
        return this.taxClassCodeList;
    }

    public Boolean getTaxClassCodeStatusFlag() {
        return this.taxClassCodeStatusFlag;
    }

    public Long getCostClassId() {
        return this.costClassId;
    }

    public Long getCostClassCode() {
        return this.costClassCode;
    }

    public List<Long> getCostClassCodeList() {
        return this.costClassCodeList;
    }

    public List<Long> getCreatorTypeList() {
        return this.creatorTypeList;
    }

    public String getTaxClassCode() {
        return this.taxClassCode;
    }

    public Boolean getIsOil() {
        return this.isOil;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public List<Long> getProductTagList() {
        return this.productTagList;
    }

    public List<Long> getShopId() {
        return this.shopId;
    }

    public Long getProductTemplate() {
        return this.productTemplate;
    }

    public Boolean getSaleInOfflineStore() {
        return this.saleInOfflineStore;
    }

    public Boolean getOfflineStoreOrder() {
        return this.offlineStoreOrder;
    }

    public Long getCouponId() {
        return this.couponId;
    }

    public String getMnemonicCode() {
        return this.mnemonicCode;
    }

    public Integer getCheckFree() {
        return this.checkFree;
    }

    public Boolean getProcess() {
        return this.process;
    }

    public Boolean getStockSerialNoManage() {
        return this.stockSerialNoManage;
    }

    public String getFuzzyValue() {
        return this.fuzzyValue;
    }

    public String getCodeOrNameFuzzyValue() {
        return this.CodeOrNameFuzzyValue;
    }

    public String getCodeOrNameValue() {
        return this.CodeOrNameValue;
    }

    public String getNameOrCodeOrBarCodeFuzzyValue() {
        return this.nameOrCodeOrBarCodeFuzzyValue;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public String getBarCodeOrMultiBarCodeFuzzyValue() {
        return this.barCodeOrMultiBarCodeFuzzyValue;
    }

    public String getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue() {
        return this.nameOrCodeOrBarCodeOrModelDescriptionFuzzyValue;
    }

    public List<Long> getProductIdOrLikeList() {
        return this.productIdOrLikeList;
    }

    public String getFuzzyDisplayName() {
        return this.fuzzyDisplayName;
    }

    public String getFuzzyDisplayNameOrCode() {
        return this.fuzzyDisplayNameOrCode;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public List<String> getErpCodeList() {
        return this.erpCodeList;
    }

    public String getModelDescription() {
        return this.modelDescription;
    }

    public String getModelDescriptionFuzzy() {
        return this.modelDescriptionFuzzy;
    }

    public Long getCreatorCustomer() {
        return this.creatorCustomer;
    }

    public String getModel() {
        return this.model;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public Integer getProductAttributed() {
        return this.productAttributed;
    }

    public Integer getRealProductAttribute() {
        return this.realProductAttribute;
    }

    public HashSet<Integer> getRealProductAttributeType() {
        return this.realProductAttributeType;
    }

    public HashSet<Integer> getVirtualProductAttribute() {
        return this.virtualProductAttribute;
    }

    public Integer getPlatFormStatus() {
        return this.platFormStatus;
    }

    public Boolean getSaleChannelOfOnlineBatch() {
        return this.saleChannelOfOnlineBatch;
    }

    public Boolean getSaleChannelOfDistribution() {
        return this.saleChannelOfDistribution;
    }

    public Boolean getMktStatus() {
        return this.mktStatus;
    }

    public Boolean getMktUOrderStatus() {
        return this.mktUOrderStatus;
    }

    public Integer getGtOrderUpCount() {
        return this.gtOrderUpCount;
    }

    public List<Long> getProductSpecItemIsSpecItems() {
        return this.productSpecItemIsSpecItems;
    }

    public Boolean getRecommendedMaterials() {
        return this.recommendedMaterials;
    }

    public Map<String, Object> getProductCharacterDef() {
        return this.productCharacterDef;
    }

    public Map<String, Object> getProductPropCharacterDefine() {
        return this.productPropCharacterDefine;
    }

    public Map<String, Object> getProductExtendCharacterDef() {
        return this.productExtendCharacterDef;
    }

    public List<String> getSkuMd5KeyList() {
        return this.skuMd5KeyList;
    }

    public HashSet<String> getAscField() {
        return this.ascField;
    }

    public HashSet<String> getDescField() {
        return this.descField;
    }

    public Date getBeganTime() {
        return this.beganTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public Date getPubts() {
        return this.pubts;
    }

    public Date getBeginTime() {
        return this.beginTime;
    }

    public Boolean getValueManageType() {
        return this.valueManageType;
    }

    public String getManufacturePlanner() {
        return this.manufacturePlanner;
    }

    public Long getPlanClass() {
        return this.planClass;
    }

    public Integer getInventoryPlanStrategy() {
        return this.inventoryPlanStrategy;
    }

    public void setField(String[] field) {
        this.field = field;
    }

    public void setProductIdList(List<Long> productIdList) {
        this.productIdList = productIdList;
    }

    public void setProductIdNotInList(List<Long> productIdNotInList) {
        this.productIdNotInList = productIdNotInList;
    }

    public void setCreator(Boolean creator) {
        this.creator = creator;
    }

    public void setCreateOrgList(List<String> createOrgList) {
        this.createOrgList = createOrgList;
    }

    @Deprecated
    public void setProductapplyIdList(List<Long> productapplyIdList) {
        this.productapplyIdList = productapplyIdList;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductCodeList(List<String> productCodeList) {
        this.productCodeList = productCodeList;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductNameList(List<String> productNameList) {
        this.productNameList = productNameList;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setOrgStringList(List<String> orgStringList) {
        this.orgStringList = orgStringList;
    }

    @Deprecated
    public void setOrgList(List<Long> orgList) {
        this.orgList = orgList;
    }

    public void setPurchaseClassIdList(List<Long> purchaseClassIdList) {
        this.purchaseClassIdList = purchaseClassIdList;
    }

    public void setPurchaseClassCodeList(List<String> purchaseClassCodeList) {
        this.purchaseClassCodeList = purchaseClassCodeList;
    }

    public void setProductClassIdList(List<Long> productClassIdList) {
        this.productClassIdList = productClassIdList;
    }

    public void setProductClassIdNotInList(List<Long> productClassIdNotInList) {
        this.productClassIdNotInList = productClassIdNotInList;
    }

    public void setProductClassCodeList(List<String> productClassCodeList) {
        this.productClassCodeList = productClassCodeList;
    }

    public void setProductClassPath(String productClassPath) {
        this.productClassPath = productClassPath;
    }

    public void setProductClassLeftFuzzyPath(String productClassLeftFuzzyPath) {
        this.productClassLeftFuzzyPath = productClassLeftFuzzyPath;
    }

    public void setProductClassFuzzyPath(String productClassFuzzyPath) {
        this.productClassFuzzyPath = productClassFuzzyPath;
    }

    public void setAssistClassesLeftFuzzyPath(String assistClassesLeftFuzzyPath) {
        this.assistClassesLeftFuzzyPath = assistClassesLeftFuzzyPath;
    }

    public void setProductClassOrAssistClassesLeftFuzzyPath(String productClassOrAssistClassesLeftFuzzyPath) {
        this.productClassOrAssistClassesLeftFuzzyPath = productClassOrAssistClassesLeftFuzzyPath;
    }

    public void setAssistClassIdList(List<Long> assistClassIdList) {
        this.assistClassIdList = assistClassIdList;
    }

    public void setManagerClassIdList(List<Long> managerClassIdList) {
        this.managerClassIdList = managerClassIdList;
    }

    public void setManagerClassIdNotInList(List<Long> managerClassIdNotInList) {
        this.managerClassIdNotInList = managerClassIdNotInList;
    }

    public void setManageClassCode(String manageClassCode) {
        this.manageClassCode = manageClassCode;
    }

    public void setManageClassLeftFuzzyCode(String manageClassLeftFuzzyCode) {
        this.manageClassLeftFuzzyCode = manageClassLeftFuzzyCode;
    }

    public void setManagerClassCodeList(List<String> managerClassCodeList) {
        this.managerClassCodeList = managerClassCodeList;
    }

    public void setBrandIdList(List<Long> brandIdList) {
        this.brandIdList = brandIdList;
    }

    public void setBrandIdNotINList(List<Long> brandIdNotINList) {
        this.brandIdNotINList = brandIdNotINList;
    }

    public void setProductLineIdList(List<Long> productLineIdList) {
        this.productLineIdList = productLineIdList;
    }

    public void setProductLineIdNotInList(List<Long> productLineIdNotInList) {
        this.productLineIdNotInList = productLineIdNotInList;
    }

    public void setCostClassIdList(List<Long> costClassIdList) {
        this.costClassIdList = costClassIdList;
    }

    public void setTaxClassCodeList(List<String> taxClassCodeList) {
        this.taxClassCodeList = taxClassCodeList;
    }

    public void setTaxClassCodeStatusFlag(Boolean taxClassCodeStatusFlag) {
        this.taxClassCodeStatusFlag = taxClassCodeStatusFlag;
    }

    public void setCostClassId(Long costClassId) {
        this.costClassId = costClassId;
    }

    public void setCostClassCode(Long costClassCode) {
        this.costClassCode = costClassCode;
    }

    public void setCostClassCodeList(List<Long> costClassCodeList) {
        this.costClassCodeList = costClassCodeList;
    }

    public void setCreatorTypeList(List<Long> creatorTypeList) {
        this.creatorTypeList = creatorTypeList;
    }

    public void setTaxClassCode(String taxClassCode) {
        this.taxClassCode = taxClassCode;
    }

    public void setIsOil(Boolean isOil) {
        this.isOil = isOil;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setProductTagList(List<Long> productTagList) {
        this.productTagList = productTagList;
    }

    public void setShopId(List<Long> shopId) {
        this.shopId = shopId;
    }

    public void setProductTemplate(Long productTemplate) {
        this.productTemplate = productTemplate;
    }

    public void setSaleInOfflineStore(Boolean saleInOfflineStore) {
        this.saleInOfflineStore = saleInOfflineStore;
    }

    public void setOfflineStoreOrder(Boolean offlineStoreOrder) {
        this.offlineStoreOrder = offlineStoreOrder;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public void setCheckFree(Integer checkFree) {
        this.checkFree = checkFree;
    }

    public void setProcess(Boolean process) {
        this.process = process;
    }

    public void setStockSerialNoManage(Boolean stockSerialNoManage) {
        this.stockSerialNoManage = stockSerialNoManage;
    }

    public void setFuzzyValue(String fuzzyValue) {
        this.fuzzyValue = fuzzyValue;
    }

    public void setCodeOrNameFuzzyValue(String CodeOrNameFuzzyValue) {
        this.CodeOrNameFuzzyValue = CodeOrNameFuzzyValue;
    }

    public void setCodeOrNameValue(String CodeOrNameValue) {
        this.CodeOrNameValue = CodeOrNameValue;
    }

    public void setNameOrCodeOrBarCodeFuzzyValue(String nameOrCodeOrBarCodeFuzzyValue) {
        this.nameOrCodeOrBarCodeFuzzyValue = nameOrCodeOrBarCodeFuzzyValue;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setBarCodeOrMultiBarCodeFuzzyValue(String barCodeOrMultiBarCodeFuzzyValue) {
        this.barCodeOrMultiBarCodeFuzzyValue = barCodeOrMultiBarCodeFuzzyValue;
    }

    public void setNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue(String nameOrCodeOrBarCodeOrModelDescriptionFuzzyValue) {
        this.nameOrCodeOrBarCodeOrModelDescriptionFuzzyValue = nameOrCodeOrBarCodeOrModelDescriptionFuzzyValue;
    }

    public void setProductIdOrLikeList(List<Long> productIdOrLikeList) {
        this.productIdOrLikeList = productIdOrLikeList;
    }

    public void setFuzzyDisplayName(String fuzzyDisplayName) {
        this.fuzzyDisplayName = fuzzyDisplayName;
    }

    public void setFuzzyDisplayNameOrCode(String fuzzyDisplayNameOrCode) {
        this.fuzzyDisplayNameOrCode = fuzzyDisplayNameOrCode;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setErpCodeList(List<String> erpCodeList) {
        this.erpCodeList = erpCodeList;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }

    public void setModelDescriptionFuzzy(String modelDescriptionFuzzy) {
        this.modelDescriptionFuzzy = modelDescriptionFuzzy;
    }

    public void setCreatorCustomer(Long creatorCustomer) {
        this.creatorCustomer = creatorCustomer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setProductAttributed(Integer productAttributed) {
        this.productAttributed = productAttributed;
    }

    public void setRealProductAttribute(Integer realProductAttribute) {
        this.realProductAttribute = realProductAttribute;
    }

    public void setRealProductAttributeType(HashSet<Integer> realProductAttributeType) {
        this.realProductAttributeType = realProductAttributeType;
    }

    public void setVirtualProductAttribute(HashSet<Integer> virtualProductAttribute) {
        this.virtualProductAttribute = virtualProductAttribute;
    }

    public void setPlatFormStatus(Integer platFormStatus) {
        this.platFormStatus = platFormStatus;
    }

    public void setSaleChannelOfOnlineBatch(Boolean saleChannelOfOnlineBatch) {
        this.saleChannelOfOnlineBatch = saleChannelOfOnlineBatch;
    }

    public void setSaleChannelOfDistribution(Boolean saleChannelOfDistribution) {
        this.saleChannelOfDistribution = saleChannelOfDistribution;
    }

    public void setMktStatus(Boolean mktStatus) {
        this.mktStatus = mktStatus;
    }

    public void setMktUOrderStatus(Boolean mktUOrderStatus) {
        this.mktUOrderStatus = mktUOrderStatus;
    }

    public void setGtOrderUpCount(Integer gtOrderUpCount) {
        this.gtOrderUpCount = gtOrderUpCount;
    }

    public void setProductSpecItemIsSpecItems(List<Long> productSpecItemIsSpecItems) {
        this.productSpecItemIsSpecItems = productSpecItemIsSpecItems;
    }

    public void setRecommendedMaterials(Boolean recommendedMaterials) {
        this.recommendedMaterials = recommendedMaterials;
    }

    public void setProductCharacterDef(Map<String, Object> productCharacterDef) {
        this.productCharacterDef = productCharacterDef;
    }

    public void setProductPropCharacterDefine(Map<String, Object> productPropCharacterDefine) {
        this.productPropCharacterDefine = productPropCharacterDefine;
    }

    public void setProductExtendCharacterDef(Map<String, Object> productExtendCharacterDef) {
        this.productExtendCharacterDef = productExtendCharacterDef;
    }

    public void setSkuMd5KeyList(List<String> skuMd5KeyList) {
        this.skuMd5KeyList = skuMd5KeyList;
    }

    public void setAscField(HashSet<String> ascField) {
        this.ascField = ascField;
    }

    public void setDescField(HashSet<String> descField) {
        this.descField = descField;
    }

    public void setBeganTime(Date beganTime) {
        this.beganTime = beganTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setPubts(Date pubts) {
        this.pubts = pubts;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public void setValueManageType(Boolean valueManageType) {
        this.valueManageType = valueManageType;
    }

    public void setManufacturePlanner(String manufacturePlanner) {
        this.manufacturePlanner = manufacturePlanner;
    }

    public void setPlanClass(Long planClass) {
        this.planClass = planClass;
    }

    public void setInventoryPlanStrategy(Integer inventoryPlanStrategy) {
        this.inventoryPlanStrategy = inventoryPlanStrategy;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductQryDTO)) {
            return false;
        }
        ProductQryDTO other = (ProductQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$creator = this.getCreator();
        Boolean other$creator = other.getCreator();
        if (this$creator == null ? other$creator != null : !((Object)this$creator).equals(other$creator)) {
            return false;
        }
        Boolean this$deleteFlag = this.getDeleteFlag();
        Boolean other$deleteFlag = other.getDeleteFlag();
        if (this$deleteFlag == null ? other$deleteFlag != null : !((Object)this$deleteFlag).equals(other$deleteFlag)) {
            return false;
        }
        Boolean this$taxClassCodeStatusFlag = this.getTaxClassCodeStatusFlag();
        Boolean other$taxClassCodeStatusFlag = other.getTaxClassCodeStatusFlag();
        if (this$taxClassCodeStatusFlag == null ? other$taxClassCodeStatusFlag != null : !((Object)this$taxClassCodeStatusFlag).equals(other$taxClassCodeStatusFlag)) {
            return false;
        }
        Long this$costClassId = this.getCostClassId();
        Long other$costClassId = other.getCostClassId();
        if (this$costClassId == null ? other$costClassId != null : !((Object)this$costClassId).equals(other$costClassId)) {
            return false;
        }
        Long this$costClassCode = this.getCostClassCode();
        Long other$costClassCode = other.getCostClassCode();
        if (this$costClassCode == null ? other$costClassCode != null : !((Object)this$costClassCode).equals(other$costClassCode)) {
            return false;
        }
        Boolean this$isOil = this.getIsOil();
        Boolean other$isOil = other.getIsOil();
        if (this$isOil == null ? other$isOil != null : !((Object)this$isOil).equals(other$isOil)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        Long this$productTemplate = this.getProductTemplate();
        Long other$productTemplate = other.getProductTemplate();
        if (this$productTemplate == null ? other$productTemplate != null : !((Object)this$productTemplate).equals(other$productTemplate)) {
            return false;
        }
        Boolean this$saleInOfflineStore = this.getSaleInOfflineStore();
        Boolean other$saleInOfflineStore = other.getSaleInOfflineStore();
        if (this$saleInOfflineStore == null ? other$saleInOfflineStore != null : !((Object)this$saleInOfflineStore).equals(other$saleInOfflineStore)) {
            return false;
        }
        Boolean this$offlineStoreOrder = this.getOfflineStoreOrder();
        Boolean other$offlineStoreOrder = other.getOfflineStoreOrder();
        if (this$offlineStoreOrder == null ? other$offlineStoreOrder != null : !((Object)this$offlineStoreOrder).equals(other$offlineStoreOrder)) {
            return false;
        }
        Long this$couponId = this.getCouponId();
        Long other$couponId = other.getCouponId();
        if (this$couponId == null ? other$couponId != null : !((Object)this$couponId).equals(other$couponId)) {
            return false;
        }
        Integer this$checkFree = this.getCheckFree();
        Integer other$checkFree = other.getCheckFree();
        if (this$checkFree == null ? other$checkFree != null : !((Object)this$checkFree).equals(other$checkFree)) {
            return false;
        }
        Boolean this$process = this.getProcess();
        Boolean other$process = other.getProcess();
        if (this$process == null ? other$process != null : !((Object)this$process).equals(other$process)) {
            return false;
        }
        Boolean this$stockSerialNoManage = this.getStockSerialNoManage();
        Boolean other$stockSerialNoManage = other.getStockSerialNoManage();
        if (this$stockSerialNoManage == null ? other$stockSerialNoManage != null : !((Object)this$stockSerialNoManage).equals(other$stockSerialNoManage)) {
            return false;
        }
        Long this$creatorCustomer = this.getCreatorCustomer();
        Long other$creatorCustomer = other.getCreatorCustomer();
        if (this$creatorCustomer == null ? other$creatorCustomer != null : !((Object)this$creatorCustomer).equals(other$creatorCustomer)) {
            return false;
        }
        Integer this$productAttributed = this.getProductAttributed();
        Integer other$productAttributed = other.getProductAttributed();
        if (this$productAttributed == null ? other$productAttributed != null : !((Object)this$productAttributed).equals(other$productAttributed)) {
            return false;
        }
        Integer this$realProductAttribute = this.getRealProductAttribute();
        Integer other$realProductAttribute = other.getRealProductAttribute();
        if (this$realProductAttribute == null ? other$realProductAttribute != null : !((Object)this$realProductAttribute).equals(other$realProductAttribute)) {
            return false;
        }
        Integer this$platFormStatus = this.getPlatFormStatus();
        Integer other$platFormStatus = other.getPlatFormStatus();
        if (this$platFormStatus == null ? other$platFormStatus != null : !((Object)this$platFormStatus).equals(other$platFormStatus)) {
            return false;
        }
        Boolean this$saleChannelOfOnlineBatch = this.getSaleChannelOfOnlineBatch();
        Boolean other$saleChannelOfOnlineBatch = other.getSaleChannelOfOnlineBatch();
        if (this$saleChannelOfOnlineBatch == null ? other$saleChannelOfOnlineBatch != null : !((Object)this$saleChannelOfOnlineBatch).equals(other$saleChannelOfOnlineBatch)) {
            return false;
        }
        Boolean this$saleChannelOfDistribution = this.getSaleChannelOfDistribution();
        Boolean other$saleChannelOfDistribution = other.getSaleChannelOfDistribution();
        if (this$saleChannelOfDistribution == null ? other$saleChannelOfDistribution != null : !((Object)this$saleChannelOfDistribution).equals(other$saleChannelOfDistribution)) {
            return false;
        }
        Boolean this$mktStatus = this.getMktStatus();
        Boolean other$mktStatus = other.getMktStatus();
        if (this$mktStatus == null ? other$mktStatus != null : !((Object)this$mktStatus).equals(other$mktStatus)) {
            return false;
        }
        Boolean this$mktUOrderStatus = this.getMktUOrderStatus();
        Boolean other$mktUOrderStatus = other.getMktUOrderStatus();
        if (this$mktUOrderStatus == null ? other$mktUOrderStatus != null : !((Object)this$mktUOrderStatus).equals(other$mktUOrderStatus)) {
            return false;
        }
        Integer this$gtOrderUpCount = this.getGtOrderUpCount();
        Integer other$gtOrderUpCount = other.getGtOrderUpCount();
        if (this$gtOrderUpCount == null ? other$gtOrderUpCount != null : !((Object)this$gtOrderUpCount).equals(other$gtOrderUpCount)) {
            return false;
        }
        Boolean this$recommendedMaterials = this.getRecommendedMaterials();
        Boolean other$recommendedMaterials = other.getRecommendedMaterials();
        if (this$recommendedMaterials == null ? other$recommendedMaterials != null : !((Object)this$recommendedMaterials).equals(other$recommendedMaterials)) {
            return false;
        }
        Boolean this$valueManageType = this.getValueManageType();
        Boolean other$valueManageType = other.getValueManageType();
        if (this$valueManageType == null ? other$valueManageType != null : !((Object)this$valueManageType).equals(other$valueManageType)) {
            return false;
        }
        Long this$planClass = this.getPlanClass();
        Long other$planClass = other.getPlanClass();
        if (this$planClass == null ? other$planClass != null : !((Object)this$planClass).equals(other$planClass)) {
            return false;
        }
        Integer this$inventoryPlanStrategy = this.getInventoryPlanStrategy();
        Integer other$inventoryPlanStrategy = other.getInventoryPlanStrategy();
        if (this$inventoryPlanStrategy == null ? other$inventoryPlanStrategy != null : !((Object)this$inventoryPlanStrategy).equals(other$inventoryPlanStrategy)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getField(), other.getField())) {
            return false;
        }
        List<Long> this$productIdList = this.getProductIdList();
        List<Long> other$productIdList = other.getProductIdList();
        if (this$productIdList == null ? other$productIdList != null : !((Object)this$productIdList).equals(other$productIdList)) {
            return false;
        }
        List<Long> this$productIdNotInList = this.getProductIdNotInList();
        List<Long> other$productIdNotInList = other.getProductIdNotInList();
        if (this$productIdNotInList == null ? other$productIdNotInList != null : !((Object)this$productIdNotInList).equals(other$productIdNotInList)) {
            return false;
        }
        List<String> this$createOrgList = this.getCreateOrgList();
        List<String> other$createOrgList = other.getCreateOrgList();
        if (this$createOrgList == null ? other$createOrgList != null : !((Object)this$createOrgList).equals(other$createOrgList)) {
            return false;
        }
        List<Long> this$productapplyIdList = this.getProductapplyIdList();
        List<Long> other$productapplyIdList = other.getProductapplyIdList();
        if (this$productapplyIdList == null ? other$productapplyIdList != null : !((Object)this$productapplyIdList).equals(other$productapplyIdList)) {
            return false;
        }
        String this$productCode = this.getProductCode();
        String other$productCode = other.getProductCode();
        if (this$productCode == null ? other$productCode != null : !this$productCode.equals(other$productCode)) {
            return false;
        }
        List<String> this$productCodeList = this.getProductCodeList();
        List<String> other$productCodeList = other.getProductCodeList();
        if (this$productCodeList == null ? other$productCodeList != null : !((Object)this$productCodeList).equals(other$productCodeList)) {
            return false;
        }
        String this$productName = this.getProductName();
        String other$productName = other.getProductName();
        if (this$productName == null ? other$productName != null : !this$productName.equals(other$productName)) {
            return false;
        }
        List<String> this$productNameList = this.getProductNameList();
        List<String> other$productNameList = other.getProductNameList();
        if (this$productNameList == null ? other$productNameList != null : !((Object)this$productNameList).equals(other$productNameList)) {
            return false;
        }
        String this$shortName = this.getShortName();
        String other$shortName = other.getShortName();
        if (this$shortName == null ? other$shortName != null : !this$shortName.equals(other$shortName)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        List<String> this$orgStringList = this.getOrgStringList();
        List<String> other$orgStringList = other.getOrgStringList();
        if (this$orgStringList == null ? other$orgStringList != null : !((Object)this$orgStringList).equals(other$orgStringList)) {
            return false;
        }
        List<Long> this$orgList = this.getOrgList();
        List<Long> other$orgList = other.getOrgList();
        if (this$orgList == null ? other$orgList != null : !((Object)this$orgList).equals(other$orgList)) {
            return false;
        }
        List<Long> this$purchaseClassIdList = this.getPurchaseClassIdList();
        List<Long> other$purchaseClassIdList = other.getPurchaseClassIdList();
        if (this$purchaseClassIdList == null ? other$purchaseClassIdList != null : !((Object)this$purchaseClassIdList).equals(other$purchaseClassIdList)) {
            return false;
        }
        List<String> this$purchaseClassCodeList = this.getPurchaseClassCodeList();
        List<String> other$purchaseClassCodeList = other.getPurchaseClassCodeList();
        if (this$purchaseClassCodeList == null ? other$purchaseClassCodeList != null : !((Object)this$purchaseClassCodeList).equals(other$purchaseClassCodeList)) {
            return false;
        }
        List<Long> this$productClassIdList = this.getProductClassIdList();
        List<Long> other$productClassIdList = other.getProductClassIdList();
        if (this$productClassIdList == null ? other$productClassIdList != null : !((Object)this$productClassIdList).equals(other$productClassIdList)) {
            return false;
        }
        List<Long> this$productClassIdNotInList = this.getProductClassIdNotInList();
        List<Long> other$productClassIdNotInList = other.getProductClassIdNotInList();
        if (this$productClassIdNotInList == null ? other$productClassIdNotInList != null : !((Object)this$productClassIdNotInList).equals(other$productClassIdNotInList)) {
            return false;
        }
        List<String> this$productClassCodeList = this.getProductClassCodeList();
        List<String> other$productClassCodeList = other.getProductClassCodeList();
        if (this$productClassCodeList == null ? other$productClassCodeList != null : !((Object)this$productClassCodeList).equals(other$productClassCodeList)) {
            return false;
        }
        String this$productClassPath = this.getProductClassPath();
        String other$productClassPath = other.getProductClassPath();
        if (this$productClassPath == null ? other$productClassPath != null : !this$productClassPath.equals(other$productClassPath)) {
            return false;
        }
        String this$productClassLeftFuzzyPath = this.getProductClassLeftFuzzyPath();
        String other$productClassLeftFuzzyPath = other.getProductClassLeftFuzzyPath();
        if (this$productClassLeftFuzzyPath == null ? other$productClassLeftFuzzyPath != null : !this$productClassLeftFuzzyPath.equals(other$productClassLeftFuzzyPath)) {
            return false;
        }
        String this$productClassFuzzyPath = this.getProductClassFuzzyPath();
        String other$productClassFuzzyPath = other.getProductClassFuzzyPath();
        if (this$productClassFuzzyPath == null ? other$productClassFuzzyPath != null : !this$productClassFuzzyPath.equals(other$productClassFuzzyPath)) {
            return false;
        }
        String this$assistClassesLeftFuzzyPath = this.getAssistClassesLeftFuzzyPath();
        String other$assistClassesLeftFuzzyPath = other.getAssistClassesLeftFuzzyPath();
        if (this$assistClassesLeftFuzzyPath == null ? other$assistClassesLeftFuzzyPath != null : !this$assistClassesLeftFuzzyPath.equals(other$assistClassesLeftFuzzyPath)) {
            return false;
        }
        String this$productClassOrAssistClassesLeftFuzzyPath = this.getProductClassOrAssistClassesLeftFuzzyPath();
        String other$productClassOrAssistClassesLeftFuzzyPath = other.getProductClassOrAssistClassesLeftFuzzyPath();
        if (this$productClassOrAssistClassesLeftFuzzyPath == null ? other$productClassOrAssistClassesLeftFuzzyPath != null : !this$productClassOrAssistClassesLeftFuzzyPath.equals(other$productClassOrAssistClassesLeftFuzzyPath)) {
            return false;
        }
        List<Long> this$assistClassIdList = this.getAssistClassIdList();
        List<Long> other$assistClassIdList = other.getAssistClassIdList();
        if (this$assistClassIdList == null ? other$assistClassIdList != null : !((Object)this$assistClassIdList).equals(other$assistClassIdList)) {
            return false;
        }
        List<Long> this$managerClassIdList = this.getManagerClassIdList();
        List<Long> other$managerClassIdList = other.getManagerClassIdList();
        if (this$managerClassIdList == null ? other$managerClassIdList != null : !((Object)this$managerClassIdList).equals(other$managerClassIdList)) {
            return false;
        }
        List<Long> this$managerClassIdNotInList = this.getManagerClassIdNotInList();
        List<Long> other$managerClassIdNotInList = other.getManagerClassIdNotInList();
        if (this$managerClassIdNotInList == null ? other$managerClassIdNotInList != null : !((Object)this$managerClassIdNotInList).equals(other$managerClassIdNotInList)) {
            return false;
        }
        String this$manageClassCode = this.getManageClassCode();
        String other$manageClassCode = other.getManageClassCode();
        if (this$manageClassCode == null ? other$manageClassCode != null : !this$manageClassCode.equals(other$manageClassCode)) {
            return false;
        }
        String this$manageClassLeftFuzzyCode = this.getManageClassLeftFuzzyCode();
        String other$manageClassLeftFuzzyCode = other.getManageClassLeftFuzzyCode();
        if (this$manageClassLeftFuzzyCode == null ? other$manageClassLeftFuzzyCode != null : !this$manageClassLeftFuzzyCode.equals(other$manageClassLeftFuzzyCode)) {
            return false;
        }
        List<String> this$managerClassCodeList = this.getManagerClassCodeList();
        List<String> other$managerClassCodeList = other.getManagerClassCodeList();
        if (this$managerClassCodeList == null ? other$managerClassCodeList != null : !((Object)this$managerClassCodeList).equals(other$managerClassCodeList)) {
            return false;
        }
        List<Long> this$brandIdList = this.getBrandIdList();
        List<Long> other$brandIdList = other.getBrandIdList();
        if (this$brandIdList == null ? other$brandIdList != null : !((Object)this$brandIdList).equals(other$brandIdList)) {
            return false;
        }
        List<Long> this$brandIdNotINList = this.getBrandIdNotINList();
        List<Long> other$brandIdNotINList = other.getBrandIdNotINList();
        if (this$brandIdNotINList == null ? other$brandIdNotINList != null : !((Object)this$brandIdNotINList).equals(other$brandIdNotINList)) {
            return false;
        }
        List<Long> this$productLineIdList = this.getProductLineIdList();
        List<Long> other$productLineIdList = other.getProductLineIdList();
        if (this$productLineIdList == null ? other$productLineIdList != null : !((Object)this$productLineIdList).equals(other$productLineIdList)) {
            return false;
        }
        List<Long> this$productLineIdNotInList = this.getProductLineIdNotInList();
        List<Long> other$productLineIdNotInList = other.getProductLineIdNotInList();
        if (this$productLineIdNotInList == null ? other$productLineIdNotInList != null : !((Object)this$productLineIdNotInList).equals(other$productLineIdNotInList)) {
            return false;
        }
        List<Long> this$costClassIdList = this.getCostClassIdList();
        List<Long> other$costClassIdList = other.getCostClassIdList();
        if (this$costClassIdList == null ? other$costClassIdList != null : !((Object)this$costClassIdList).equals(other$costClassIdList)) {
            return false;
        }
        List<String> this$taxClassCodeList = this.getTaxClassCodeList();
        List<String> other$taxClassCodeList = other.getTaxClassCodeList();
        if (this$taxClassCodeList == null ? other$taxClassCodeList != null : !((Object)this$taxClassCodeList).equals(other$taxClassCodeList)) {
            return false;
        }
        List<Long> this$costClassCodeList = this.getCostClassCodeList();
        List<Long> other$costClassCodeList = other.getCostClassCodeList();
        if (this$costClassCodeList == null ? other$costClassCodeList != null : !((Object)this$costClassCodeList).equals(other$costClassCodeList)) {
            return false;
        }
        List<Long> this$creatorTypeList = this.getCreatorTypeList();
        List<Long> other$creatorTypeList = other.getCreatorTypeList();
        if (this$creatorTypeList == null ? other$creatorTypeList != null : !((Object)this$creatorTypeList).equals(other$creatorTypeList)) {
            return false;
        }
        String this$taxClassCode = this.getTaxClassCode();
        String other$taxClassCode = other.getTaxClassCode();
        if (this$taxClassCode == null ? other$taxClassCode != null : !this$taxClassCode.equals(other$taxClassCode)) {
            return false;
        }
        List<Long> this$productTagList = this.getProductTagList();
        List<Long> other$productTagList = other.getProductTagList();
        if (this$productTagList == null ? other$productTagList != null : !((Object)this$productTagList).equals(other$productTagList)) {
            return false;
        }
        List<Long> this$shopId = this.getShopId();
        List<Long> other$shopId = other.getShopId();
        if (this$shopId == null ? other$shopId != null : !((Object)this$shopId).equals(other$shopId)) {
            return false;
        }
        String this$mnemonicCode = this.getMnemonicCode();
        String other$mnemonicCode = other.getMnemonicCode();
        if (this$mnemonicCode == null ? other$mnemonicCode != null : !this$mnemonicCode.equals(other$mnemonicCode)) {
            return false;
        }
        String this$fuzzyValue = this.getFuzzyValue();
        String other$fuzzyValue = other.getFuzzyValue();
        if (this$fuzzyValue == null ? other$fuzzyValue != null : !this$fuzzyValue.equals(other$fuzzyValue)) {
            return false;
        }
        String this$CodeOrNameFuzzyValue = this.getCodeOrNameFuzzyValue();
        String other$CodeOrNameFuzzyValue = other.getCodeOrNameFuzzyValue();
        if (this$CodeOrNameFuzzyValue == null ? other$CodeOrNameFuzzyValue != null : !this$CodeOrNameFuzzyValue.equals(other$CodeOrNameFuzzyValue)) {
            return false;
        }
        String this$CodeOrNameValue = this.getCodeOrNameValue();
        String other$CodeOrNameValue = other.getCodeOrNameValue();
        if (this$CodeOrNameValue == null ? other$CodeOrNameValue != null : !this$CodeOrNameValue.equals(other$CodeOrNameValue)) {
            return false;
        }
        String this$nameOrCodeOrBarCodeFuzzyValue = this.getNameOrCodeOrBarCodeFuzzyValue();
        String other$nameOrCodeOrBarCodeFuzzyValue = other.getNameOrCodeOrBarCodeFuzzyValue();
        if (this$nameOrCodeOrBarCodeFuzzyValue == null ? other$nameOrCodeOrBarCodeFuzzyValue != null : !this$nameOrCodeOrBarCodeFuzzyValue.equals(other$nameOrCodeOrBarCodeFuzzyValue)) {
            return false;
        }
        String this$barCode = this.getBarCode();
        String other$barCode = other.getBarCode();
        if (this$barCode == null ? other$barCode != null : !this$barCode.equals(other$barCode)) {
            return false;
        }
        String this$barCodeOrMultiBarCodeFuzzyValue = this.getBarCodeOrMultiBarCodeFuzzyValue();
        String other$barCodeOrMultiBarCodeFuzzyValue = other.getBarCodeOrMultiBarCodeFuzzyValue();
        if (this$barCodeOrMultiBarCodeFuzzyValue == null ? other$barCodeOrMultiBarCodeFuzzyValue != null : !this$barCodeOrMultiBarCodeFuzzyValue.equals(other$barCodeOrMultiBarCodeFuzzyValue)) {
            return false;
        }
        String this$nameOrCodeOrBarCodeOrModelDescriptionFuzzyValue = this.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue();
        String other$nameOrCodeOrBarCodeOrModelDescriptionFuzzyValue = other.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue();
        if (this$nameOrCodeOrBarCodeOrModelDescriptionFuzzyValue == null ? other$nameOrCodeOrBarCodeOrModelDescriptionFuzzyValue != null : !this$nameOrCodeOrBarCodeOrModelDescriptionFuzzyValue.equals(other$nameOrCodeOrBarCodeOrModelDescriptionFuzzyValue)) {
            return false;
        }
        List<Long> this$productIdOrLikeList = this.getProductIdOrLikeList();
        List<Long> other$productIdOrLikeList = other.getProductIdOrLikeList();
        if (this$productIdOrLikeList == null ? other$productIdOrLikeList != null : !((Object)this$productIdOrLikeList).equals(other$productIdOrLikeList)) {
            return false;
        }
        String this$fuzzyDisplayName = this.getFuzzyDisplayName();
        String other$fuzzyDisplayName = other.getFuzzyDisplayName();
        if (this$fuzzyDisplayName == null ? other$fuzzyDisplayName != null : !this$fuzzyDisplayName.equals(other$fuzzyDisplayName)) {
            return false;
        }
        String this$fuzzyDisplayNameOrCode = this.getFuzzyDisplayNameOrCode();
        String other$fuzzyDisplayNameOrCode = other.getFuzzyDisplayNameOrCode();
        if (this$fuzzyDisplayNameOrCode == null ? other$fuzzyDisplayNameOrCode != null : !this$fuzzyDisplayNameOrCode.equals(other$fuzzyDisplayNameOrCode)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        List<String> this$erpCodeList = this.getErpCodeList();
        List<String> other$erpCodeList = other.getErpCodeList();
        if (this$erpCodeList == null ? other$erpCodeList != null : !((Object)this$erpCodeList).equals(other$erpCodeList)) {
            return false;
        }
        String this$modelDescription = this.getModelDescription();
        String other$modelDescription = other.getModelDescription();
        if (this$modelDescription == null ? other$modelDescription != null : !this$modelDescription.equals(other$modelDescription)) {
            return false;
        }
        String this$modelDescriptionFuzzy = this.getModelDescriptionFuzzy();
        String other$modelDescriptionFuzzy = other.getModelDescriptionFuzzy();
        if (this$modelDescriptionFuzzy == null ? other$modelDescriptionFuzzy != null : !this$modelDescriptionFuzzy.equals(other$modelDescriptionFuzzy)) {
            return false;
        }
        String this$model = this.getModel();
        String other$model = other.getModel();
        if (this$model == null ? other$model != null : !this$model.equals(other$model)) {
            return false;
        }
        String this$manufacturer = this.getManufacturer();
        String other$manufacturer = other.getManufacturer();
        if (this$manufacturer == null ? other$manufacturer != null : !this$manufacturer.equals(other$manufacturer)) {
            return false;
        }
        HashSet<Integer> this$realProductAttributeType = this.getRealProductAttributeType();
        HashSet<Integer> other$realProductAttributeType = other.getRealProductAttributeType();
        if (this$realProductAttributeType == null ? other$realProductAttributeType != null : !((Object)this$realProductAttributeType).equals(other$realProductAttributeType)) {
            return false;
        }
        HashSet<Integer> this$virtualProductAttribute = this.getVirtualProductAttribute();
        HashSet<Integer> other$virtualProductAttribute = other.getVirtualProductAttribute();
        if (this$virtualProductAttribute == null ? other$virtualProductAttribute != null : !((Object)this$virtualProductAttribute).equals(other$virtualProductAttribute)) {
            return false;
        }
        List<Long> this$productSpecItemIsSpecItems = this.getProductSpecItemIsSpecItems();
        List<Long> other$productSpecItemIsSpecItems = other.getProductSpecItemIsSpecItems();
        if (this$productSpecItemIsSpecItems == null ? other$productSpecItemIsSpecItems != null : !((Object)this$productSpecItemIsSpecItems).equals(other$productSpecItemIsSpecItems)) {
            return false;
        }
        Map<String, Object> this$productCharacterDef = this.getProductCharacterDef();
        Map<String, Object> other$productCharacterDef = other.getProductCharacterDef();
        if (this$productCharacterDef == null ? other$productCharacterDef != null : !((Object)this$productCharacterDef).equals(other$productCharacterDef)) {
            return false;
        }
        Map<String, Object> this$productPropCharacterDefine = this.getProductPropCharacterDefine();
        Map<String, Object> other$productPropCharacterDefine = other.getProductPropCharacterDefine();
        if (this$productPropCharacterDefine == null ? other$productPropCharacterDefine != null : !((Object)this$productPropCharacterDefine).equals(other$productPropCharacterDefine)) {
            return false;
        }
        Map<String, Object> this$productExtendCharacterDef = this.getProductExtendCharacterDef();
        Map<String, Object> other$productExtendCharacterDef = other.getProductExtendCharacterDef();
        if (this$productExtendCharacterDef == null ? other$productExtendCharacterDef != null : !((Object)this$productExtendCharacterDef).equals(other$productExtendCharacterDef)) {
            return false;
        }
        List<String> this$skuMd5KeyList = this.getSkuMd5KeyList();
        List<String> other$skuMd5KeyList = other.getSkuMd5KeyList();
        if (this$skuMd5KeyList == null ? other$skuMd5KeyList != null : !((Object)this$skuMd5KeyList).equals(other$skuMd5KeyList)) {
            return false;
        }
        HashSet<String> this$ascField = this.getAscField();
        HashSet<String> other$ascField = other.getAscField();
        if (this$ascField == null ? other$ascField != null : !((Object)this$ascField).equals(other$ascField)) {
            return false;
        }
        HashSet<String> this$descField = this.getDescField();
        HashSet<String> other$descField = other.getDescField();
        if (this$descField == null ? other$descField != null : !((Object)this$descField).equals(other$descField)) {
            return false;
        }
        Date this$beganTime = this.getBeganTime();
        Date other$beganTime = other.getBeganTime();
        if (this$beganTime == null ? other$beganTime != null : !((Object)this$beganTime).equals(other$beganTime)) {
            return false;
        }
        Date this$endTime = this.getEndTime();
        Date other$endTime = other.getEndTime();
        if (this$endTime == null ? other$endTime != null : !((Object)this$endTime).equals(other$endTime)) {
            return false;
        }
        Date this$pubts = this.getPubts();
        Date other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !((Object)this$pubts).equals(other$pubts)) {
            return false;
        }
        Date this$beginTime = this.getBeginTime();
        Date other$beginTime = other.getBeginTime();
        if (this$beginTime == null ? other$beginTime != null : !((Object)this$beginTime).equals(other$beginTime)) {
            return false;
        }
        String this$manufacturePlanner = this.getManufacturePlanner();
        String other$manufacturePlanner = other.getManufacturePlanner();
        return !(this$manufacturePlanner == null ? other$manufacturePlanner != null : !this$manufacturePlanner.equals(other$manufacturePlanner));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof ProductQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $creator = this.getCreator();
        result = result * 59 + ($creator == null ? 43 : ((Object)$creator).hashCode());
        Boolean $deleteFlag = this.getDeleteFlag();
        result = result * 59 + ($deleteFlag == null ? 43 : ((Object)$deleteFlag).hashCode());
        Boolean $taxClassCodeStatusFlag = this.getTaxClassCodeStatusFlag();
        result = result * 59 + ($taxClassCodeStatusFlag == null ? 43 : ((Object)$taxClassCodeStatusFlag).hashCode());
        Long $costClassId = this.getCostClassId();
        result = result * 59 + ($costClassId == null ? 43 : ((Object)$costClassId).hashCode());
        Long $costClassCode = this.getCostClassCode();
        result = result * 59 + ($costClassCode == null ? 43 : ((Object)$costClassCode).hashCode());
        Boolean $isOil = this.getIsOil();
        result = result * 59 + ($isOil == null ? 43 : ((Object)$isOil).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Long $productTemplate = this.getProductTemplate();
        result = result * 59 + ($productTemplate == null ? 43 : ((Object)$productTemplate).hashCode());
        Boolean $saleInOfflineStore = this.getSaleInOfflineStore();
        result = result * 59 + ($saleInOfflineStore == null ? 43 : ((Object)$saleInOfflineStore).hashCode());
        Boolean $offlineStoreOrder = this.getOfflineStoreOrder();
        result = result * 59 + ($offlineStoreOrder == null ? 43 : ((Object)$offlineStoreOrder).hashCode());
        Long $couponId = this.getCouponId();
        result = result * 59 + ($couponId == null ? 43 : ((Object)$couponId).hashCode());
        Integer $checkFree = this.getCheckFree();
        result = result * 59 + ($checkFree == null ? 43 : ((Object)$checkFree).hashCode());
        Boolean $process = this.getProcess();
        result = result * 59 + ($process == null ? 43 : ((Object)$process).hashCode());
        Boolean $stockSerialNoManage = this.getStockSerialNoManage();
        result = result * 59 + ($stockSerialNoManage == null ? 43 : ((Object)$stockSerialNoManage).hashCode());
        Long $creatorCustomer = this.getCreatorCustomer();
        result = result * 59 + ($creatorCustomer == null ? 43 : ((Object)$creatorCustomer).hashCode());
        Integer $productAttributed = this.getProductAttributed();
        result = result * 59 + ($productAttributed == null ? 43 : ((Object)$productAttributed).hashCode());
        Integer $realProductAttribute = this.getRealProductAttribute();
        result = result * 59 + ($realProductAttribute == null ? 43 : ((Object)$realProductAttribute).hashCode());
        Integer $platFormStatus = this.getPlatFormStatus();
        result = result * 59 + ($platFormStatus == null ? 43 : ((Object)$platFormStatus).hashCode());
        Boolean $saleChannelOfOnlineBatch = this.getSaleChannelOfOnlineBatch();
        result = result * 59 + ($saleChannelOfOnlineBatch == null ? 43 : ((Object)$saleChannelOfOnlineBatch).hashCode());
        Boolean $saleChannelOfDistribution = this.getSaleChannelOfDistribution();
        result = result * 59 + ($saleChannelOfDistribution == null ? 43 : ((Object)$saleChannelOfDistribution).hashCode());
        Boolean $mktStatus = this.getMktStatus();
        result = result * 59 + ($mktStatus == null ? 43 : ((Object)$mktStatus).hashCode());
        Boolean $mktUOrderStatus = this.getMktUOrderStatus();
        result = result * 59 + ($mktUOrderStatus == null ? 43 : ((Object)$mktUOrderStatus).hashCode());
        Integer $gtOrderUpCount = this.getGtOrderUpCount();
        result = result * 59 + ($gtOrderUpCount == null ? 43 : ((Object)$gtOrderUpCount).hashCode());
        Boolean $recommendedMaterials = this.getRecommendedMaterials();
        result = result * 59 + ($recommendedMaterials == null ? 43 : ((Object)$recommendedMaterials).hashCode());
        Boolean $valueManageType = this.getValueManageType();
        result = result * 59 + ($valueManageType == null ? 43 : ((Object)$valueManageType).hashCode());
        Long $planClass = this.getPlanClass();
        result = result * 59 + ($planClass == null ? 43 : ((Object)$planClass).hashCode());
        Integer $inventoryPlanStrategy = this.getInventoryPlanStrategy();
        result = result * 59 + ($inventoryPlanStrategy == null ? 43 : ((Object)$inventoryPlanStrategy).hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getField());
        List<Long> $productIdList = this.getProductIdList();
        result = result * 59 + ($productIdList == null ? 43 : ((Object)$productIdList).hashCode());
        List<Long> $productIdNotInList = this.getProductIdNotInList();
        result = result * 59 + ($productIdNotInList == null ? 43 : ((Object)$productIdNotInList).hashCode());
        List<String> $createOrgList = this.getCreateOrgList();
        result = result * 59 + ($createOrgList == null ? 43 : ((Object)$createOrgList).hashCode());
        List<Long> $productapplyIdList = this.getProductapplyIdList();
        result = result * 59 + ($productapplyIdList == null ? 43 : ((Object)$productapplyIdList).hashCode());
        String $productCode = this.getProductCode();
        result = result * 59 + ($productCode == null ? 43 : $productCode.hashCode());
        List<String> $productCodeList = this.getProductCodeList();
        result = result * 59 + ($productCodeList == null ? 43 : ((Object)$productCodeList).hashCode());
        String $productName = this.getProductName();
        result = result * 59 + ($productName == null ? 43 : $productName.hashCode());
        List<String> $productNameList = this.getProductNameList();
        result = result * 59 + ($productNameList == null ? 43 : ((Object)$productNameList).hashCode());
        String $shortName = this.getShortName();
        result = result * 59 + ($shortName == null ? 43 : $shortName.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        List<String> $orgStringList = this.getOrgStringList();
        result = result * 59 + ($orgStringList == null ? 43 : ((Object)$orgStringList).hashCode());
        List<Long> $orgList = this.getOrgList();
        result = result * 59 + ($orgList == null ? 43 : ((Object)$orgList).hashCode());
        List<Long> $purchaseClassIdList = this.getPurchaseClassIdList();
        result = result * 59 + ($purchaseClassIdList == null ? 43 : ((Object)$purchaseClassIdList).hashCode());
        List<String> $purchaseClassCodeList = this.getPurchaseClassCodeList();
        result = result * 59 + ($purchaseClassCodeList == null ? 43 : ((Object)$purchaseClassCodeList).hashCode());
        List<Long> $productClassIdList = this.getProductClassIdList();
        result = result * 59 + ($productClassIdList == null ? 43 : ((Object)$productClassIdList).hashCode());
        List<Long> $productClassIdNotInList = this.getProductClassIdNotInList();
        result = result * 59 + ($productClassIdNotInList == null ? 43 : ((Object)$productClassIdNotInList).hashCode());
        List<String> $productClassCodeList = this.getProductClassCodeList();
        result = result * 59 + ($productClassCodeList == null ? 43 : ((Object)$productClassCodeList).hashCode());
        String $productClassPath = this.getProductClassPath();
        result = result * 59 + ($productClassPath == null ? 43 : $productClassPath.hashCode());
        String $productClassLeftFuzzyPath = this.getProductClassLeftFuzzyPath();
        result = result * 59 + ($productClassLeftFuzzyPath == null ? 43 : $productClassLeftFuzzyPath.hashCode());
        String $productClassFuzzyPath = this.getProductClassFuzzyPath();
        result = result * 59 + ($productClassFuzzyPath == null ? 43 : $productClassFuzzyPath.hashCode());
        String $assistClassesLeftFuzzyPath = this.getAssistClassesLeftFuzzyPath();
        result = result * 59 + ($assistClassesLeftFuzzyPath == null ? 43 : $assistClassesLeftFuzzyPath.hashCode());
        String $productClassOrAssistClassesLeftFuzzyPath = this.getProductClassOrAssistClassesLeftFuzzyPath();
        result = result * 59 + ($productClassOrAssistClassesLeftFuzzyPath == null ? 43 : $productClassOrAssistClassesLeftFuzzyPath.hashCode());
        List<Long> $assistClassIdList = this.getAssistClassIdList();
        result = result * 59 + ($assistClassIdList == null ? 43 : ((Object)$assistClassIdList).hashCode());
        List<Long> $managerClassIdList = this.getManagerClassIdList();
        result = result * 59 + ($managerClassIdList == null ? 43 : ((Object)$managerClassIdList).hashCode());
        List<Long> $managerClassIdNotInList = this.getManagerClassIdNotInList();
        result = result * 59 + ($managerClassIdNotInList == null ? 43 : ((Object)$managerClassIdNotInList).hashCode());
        String $manageClassCode = this.getManageClassCode();
        result = result * 59 + ($manageClassCode == null ? 43 : $manageClassCode.hashCode());
        String $manageClassLeftFuzzyCode = this.getManageClassLeftFuzzyCode();
        result = result * 59 + ($manageClassLeftFuzzyCode == null ? 43 : $manageClassLeftFuzzyCode.hashCode());
        List<String> $managerClassCodeList = this.getManagerClassCodeList();
        result = result * 59 + ($managerClassCodeList == null ? 43 : ((Object)$managerClassCodeList).hashCode());
        List<Long> $brandIdList = this.getBrandIdList();
        result = result * 59 + ($brandIdList == null ? 43 : ((Object)$brandIdList).hashCode());
        List<Long> $brandIdNotINList = this.getBrandIdNotINList();
        result = result * 59 + ($brandIdNotINList == null ? 43 : ((Object)$brandIdNotINList).hashCode());
        List<Long> $productLineIdList = this.getProductLineIdList();
        result = result * 59 + ($productLineIdList == null ? 43 : ((Object)$productLineIdList).hashCode());
        List<Long> $productLineIdNotInList = this.getProductLineIdNotInList();
        result = result * 59 + ($productLineIdNotInList == null ? 43 : ((Object)$productLineIdNotInList).hashCode());
        List<Long> $costClassIdList = this.getCostClassIdList();
        result = result * 59 + ($costClassIdList == null ? 43 : ((Object)$costClassIdList).hashCode());
        List<String> $taxClassCodeList = this.getTaxClassCodeList();
        result = result * 59 + ($taxClassCodeList == null ? 43 : ((Object)$taxClassCodeList).hashCode());
        List<Long> $costClassCodeList = this.getCostClassCodeList();
        result = result * 59 + ($costClassCodeList == null ? 43 : ((Object)$costClassCodeList).hashCode());
        List<Long> $creatorTypeList = this.getCreatorTypeList();
        result = result * 59 + ($creatorTypeList == null ? 43 : ((Object)$creatorTypeList).hashCode());
        String $taxClassCode = this.getTaxClassCode();
        result = result * 59 + ($taxClassCode == null ? 43 : $taxClassCode.hashCode());
        List<Long> $productTagList = this.getProductTagList();
        result = result * 59 + ($productTagList == null ? 43 : ((Object)$productTagList).hashCode());
        List<Long> $shopId = this.getShopId();
        result = result * 59 + ($shopId == null ? 43 : ((Object)$shopId).hashCode());
        String $mnemonicCode = this.getMnemonicCode();
        result = result * 59 + ($mnemonicCode == null ? 43 : $mnemonicCode.hashCode());
        String $fuzzyValue = this.getFuzzyValue();
        result = result * 59 + ($fuzzyValue == null ? 43 : $fuzzyValue.hashCode());
        String $CodeOrNameFuzzyValue = this.getCodeOrNameFuzzyValue();
        result = result * 59 + ($CodeOrNameFuzzyValue == null ? 43 : $CodeOrNameFuzzyValue.hashCode());
        String $CodeOrNameValue = this.getCodeOrNameValue();
        result = result * 59 + ($CodeOrNameValue == null ? 43 : $CodeOrNameValue.hashCode());
        String $nameOrCodeOrBarCodeFuzzyValue = this.getNameOrCodeOrBarCodeFuzzyValue();
        result = result * 59 + ($nameOrCodeOrBarCodeFuzzyValue == null ? 43 : $nameOrCodeOrBarCodeFuzzyValue.hashCode());
        String $barCode = this.getBarCode();
        result = result * 59 + ($barCode == null ? 43 : $barCode.hashCode());
        String $barCodeOrMultiBarCodeFuzzyValue = this.getBarCodeOrMultiBarCodeFuzzyValue();
        result = result * 59 + ($barCodeOrMultiBarCodeFuzzyValue == null ? 43 : $barCodeOrMultiBarCodeFuzzyValue.hashCode());
        String $nameOrCodeOrBarCodeOrModelDescriptionFuzzyValue = this.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue();
        result = result * 59 + ($nameOrCodeOrBarCodeOrModelDescriptionFuzzyValue == null ? 43 : $nameOrCodeOrBarCodeOrModelDescriptionFuzzyValue.hashCode());
        List<Long> $productIdOrLikeList = this.getProductIdOrLikeList();
        result = result * 59 + ($productIdOrLikeList == null ? 43 : ((Object)$productIdOrLikeList).hashCode());
        String $fuzzyDisplayName = this.getFuzzyDisplayName();
        result = result * 59 + ($fuzzyDisplayName == null ? 43 : $fuzzyDisplayName.hashCode());
        String $fuzzyDisplayNameOrCode = this.getFuzzyDisplayNameOrCode();
        result = result * 59 + ($fuzzyDisplayNameOrCode == null ? 43 : $fuzzyDisplayNameOrCode.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        List<String> $erpCodeList = this.getErpCodeList();
        result = result * 59 + ($erpCodeList == null ? 43 : ((Object)$erpCodeList).hashCode());
        String $modelDescription = this.getModelDescription();
        result = result * 59 + ($modelDescription == null ? 43 : $modelDescription.hashCode());
        String $modelDescriptionFuzzy = this.getModelDescriptionFuzzy();
        result = result * 59 + ($modelDescriptionFuzzy == null ? 43 : $modelDescriptionFuzzy.hashCode());
        String $model = this.getModel();
        result = result * 59 + ($model == null ? 43 : $model.hashCode());
        String $manufacturer = this.getManufacturer();
        result = result * 59 + ($manufacturer == null ? 43 : $manufacturer.hashCode());
        HashSet<Integer> $realProductAttributeType = this.getRealProductAttributeType();
        result = result * 59 + ($realProductAttributeType == null ? 43 : ((Object)$realProductAttributeType).hashCode());
        HashSet<Integer> $virtualProductAttribute = this.getVirtualProductAttribute();
        result = result * 59 + ($virtualProductAttribute == null ? 43 : ((Object)$virtualProductAttribute).hashCode());
        List<Long> $productSpecItemIsSpecItems = this.getProductSpecItemIsSpecItems();
        result = result * 59 + ($productSpecItemIsSpecItems == null ? 43 : ((Object)$productSpecItemIsSpecItems).hashCode());
        Map<String, Object> $productCharacterDef = this.getProductCharacterDef();
        result = result * 59 + ($productCharacterDef == null ? 43 : ((Object)$productCharacterDef).hashCode());
        Map<String, Object> $productPropCharacterDefine = this.getProductPropCharacterDefine();
        result = result * 59 + ($productPropCharacterDefine == null ? 43 : ((Object)$productPropCharacterDefine).hashCode());
        Map<String, Object> $productExtendCharacterDef = this.getProductExtendCharacterDef();
        result = result * 59 + ($productExtendCharacterDef == null ? 43 : ((Object)$productExtendCharacterDef).hashCode());
        List<String> $skuMd5KeyList = this.getSkuMd5KeyList();
        result = result * 59 + ($skuMd5KeyList == null ? 43 : ((Object)$skuMd5KeyList).hashCode());
        HashSet<String> $ascField = this.getAscField();
        result = result * 59 + ($ascField == null ? 43 : ((Object)$ascField).hashCode());
        HashSet<String> $descField = this.getDescField();
        result = result * 59 + ($descField == null ? 43 : ((Object)$descField).hashCode());
        Date $beganTime = this.getBeganTime();
        result = result * 59 + ($beganTime == null ? 43 : ((Object)$beganTime).hashCode());
        Date $endTime = this.getEndTime();
        result = result * 59 + ($endTime == null ? 43 : ((Object)$endTime).hashCode());
        Date $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : ((Object)$pubts).hashCode());
        Date $beginTime = this.getBeginTime();
        result = result * 59 + ($beginTime == null ? 43 : ((Object)$beginTime).hashCode());
        String $manufacturePlanner = this.getManufacturePlanner();
        result = result * 59 + ($manufacturePlanner == null ? 43 : $manufacturePlanner.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ProductQryDTO(field=" + Arrays.deepToString(this.getField()) + ", productIdList=" + this.getProductIdList() + ", productIdNotInList=" + this.getProductIdNotInList() + ", creator=" + this.getCreator() + ", createOrgList=" + this.getCreateOrgList() + ", productapplyIdList=" + this.getProductapplyIdList() + ", productCode=" + this.getProductCode() + ", productCodeList=" + this.getProductCodeList() + ", productName=" + this.getProductName() + ", productNameList=" + this.getProductNameList() + ", shortName=" + this.getShortName() + ", deleteFlag=" + this.getDeleteFlag() + ", orgId=" + this.getOrgId() + ", orgStringList=" + this.getOrgStringList() + ", orgList=" + this.getOrgList() + ", purchaseClassIdList=" + this.getPurchaseClassIdList() + ", purchaseClassCodeList=" + this.getPurchaseClassCodeList() + ", productClassIdList=" + this.getProductClassIdList() + ", productClassIdNotInList=" + this.getProductClassIdNotInList() + ", productClassCodeList=" + this.getProductClassCodeList() + ", productClassPath=" + this.getProductClassPath() + ", productClassLeftFuzzyPath=" + this.getProductClassLeftFuzzyPath() + ", productClassFuzzyPath=" + this.getProductClassFuzzyPath() + ", assistClassesLeftFuzzyPath=" + this.getAssistClassesLeftFuzzyPath() + ", productClassOrAssistClassesLeftFuzzyPath=" + this.getProductClassOrAssistClassesLeftFuzzyPath() + ", assistClassIdList=" + this.getAssistClassIdList() + ", managerClassIdList=" + this.getManagerClassIdList() + ", managerClassIdNotInList=" + this.getManagerClassIdNotInList() + ", manageClassCode=" + this.getManageClassCode() + ", manageClassLeftFuzzyCode=" + this.getManageClassLeftFuzzyCode() + ", managerClassCodeList=" + this.getManagerClassCodeList() + ", brandIdList=" + this.getBrandIdList() + ", brandIdNotINList=" + this.getBrandIdNotINList() + ", productLineIdList=" + this.getProductLineIdList() + ", productLineIdNotInList=" + this.getProductLineIdNotInList() + ", costClassIdList=" + this.getCostClassIdList() + ", taxClassCodeList=" + this.getTaxClassCodeList() + ", taxClassCodeStatusFlag=" + this.getTaxClassCodeStatusFlag() + ", costClassId=" + this.getCostClassId() + ", costClassCode=" + this.getCostClassCode() + ", costClassCodeList=" + this.getCostClassCodeList() + ", creatorTypeList=" + this.getCreatorTypeList() + ", taxClassCode=" + this.getTaxClassCode() + ", isOil=" + this.getIsOil() + ", stopStatus=" + this.getStopStatus() + ", productTagList=" + this.getProductTagList() + ", shopId=" + this.getShopId() + ", productTemplate=" + this.getProductTemplate() + ", saleInOfflineStore=" + this.getSaleInOfflineStore() + ", offlineStoreOrder=" + this.getOfflineStoreOrder() + ", couponId=" + this.getCouponId() + ", mnemonicCode=" + this.getMnemonicCode() + ", checkFree=" + this.getCheckFree() + ", process=" + this.getProcess() + ", stockSerialNoManage=" + this.getStockSerialNoManage() + ", fuzzyValue=" + this.getFuzzyValue() + ", CodeOrNameFuzzyValue=" + this.getCodeOrNameFuzzyValue() + ", CodeOrNameValue=" + this.getCodeOrNameValue() + ", nameOrCodeOrBarCodeFuzzyValue=" + this.getNameOrCodeOrBarCodeFuzzyValue() + ", barCode=" + this.getBarCode() + ", barCodeOrMultiBarCodeFuzzyValue=" + this.getBarCodeOrMultiBarCodeFuzzyValue() + ", nameOrCodeOrBarCodeOrModelDescriptionFuzzyValue=" + this.getNameOrCodeOrBarCodeOrModelDescriptionFuzzyValue() + ", productIdOrLikeList=" + this.getProductIdOrLikeList() + ", fuzzyDisplayName=" + this.getFuzzyDisplayName() + ", fuzzyDisplayNameOrCode=" + this.getFuzzyDisplayNameOrCode() + ", erpCode=" + this.getErpCode() + ", erpCodeList=" + this.getErpCodeList() + ", modelDescription=" + this.getModelDescription() + ", modelDescriptionFuzzy=" + this.getModelDescriptionFuzzy() + ", creatorCustomer=" + this.getCreatorCustomer() + ", model=" + this.getModel() + ", manufacturer=" + this.getManufacturer() + ", productAttributed=" + this.getProductAttributed() + ", realProductAttribute=" + this.getRealProductAttribute() + ", realProductAttributeType=" + this.getRealProductAttributeType() + ", virtualProductAttribute=" + this.getVirtualProductAttribute() + ", platFormStatus=" + this.getPlatFormStatus() + ", saleChannelOfOnlineBatch=" + this.getSaleChannelOfOnlineBatch() + ", saleChannelOfDistribution=" + this.getSaleChannelOfDistribution() + ", mktStatus=" + this.getMktStatus() + ", mktUOrderStatus=" + this.getMktUOrderStatus() + ", gtOrderUpCount=" + this.getGtOrderUpCount() + ", productSpecItemIsSpecItems=" + this.getProductSpecItemIsSpecItems() + ", recommendedMaterials=" + this.getRecommendedMaterials() + ", productCharacterDef=" + this.getProductCharacterDef() + ", productPropCharacterDefine=" + this.getProductPropCharacterDefine() + ", productExtendCharacterDef=" + this.getProductExtendCharacterDef() + ", skuMd5KeyList=" + this.getSkuMd5KeyList() + ", ascField=" + this.getAscField() + ", descField=" + this.getDescField() + ", beganTime=" + this.getBeganTime() + ", endTime=" + this.getEndTime() + ", pubts=" + this.getPubts() + ", beginTime=" + this.getBeginTime() + ", valueManageType=" + this.getValueManageType() + ", manufacturePlanner=" + this.getManufacturePlanner() + ", planClass=" + this.getPlanClass() + ", inventoryPlanStrategy=" + this.getInventoryPlanStrategy() + ")";
    }
}

