/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.annotation.UniquePKField;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.iuap.upc.vo.ProductAlbumVO;
import com.yonyoucloud.iuap.upc.vo.ProductAssistClassVO;
import com.yonyoucloud.iuap.upc.vo.ProductAssistUnitExchangesVO;
import com.yonyoucloud.iuap.upc.vo.ProductAttachmentVO;
import com.yonyoucloud.iuap.upc.vo.ProductBarCodeVO;
import com.yonyoucloud.iuap.upc.vo.ProductDescriptionVO;
import com.yonyoucloud.iuap.upc.vo.ProductDetailVO;
import com.yonyoucloud.iuap.upc.vo.ProductOrgVo;
import com.yonyoucloud.iuap.upc.vo.ProductTag;
import com.yonyoucloud.iuap.upc.vo.UPCExtPropertiesVO;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductApiVO
extends UPCExtPropertiesVO {
    private ProductDetailVO detail;
    private List<ProductOrgVo> productOrges;
    private List<ProductOrgVo> productCustomers;
    private List<ProductOrgVo> productShops;
    private Long productCharacterDefId;
    private Map<String, Object> productCharacterDef;
    private Boolean autoGenerateRangeData = false;
    private Integer realProductAttribute;
    private Integer virtualProductAttribute;
    private Long giftCardId;
    private Long couponId;
    private Integer couponType;
    private String productAttribute;
    private String code;
    private MultilingualVO name;
    private MultilingualVO modelDescription;
    private MultilingualVO model;
    private String platformCode;
    private String mnemonicCode;
    private MultilingualVO keywords;
    private Long productClass;
    private String productClassCode;
    private String productClassName;
    private String productClassPath;
    private Long manageClass;
    private String manageClassCode;
    private String manageClassName;
    private Long purchaseClass;
    private String purchaseClassCode;
    private String purchaseClassName;
    private Long costClass;
    private String costClassCode;
    private String costClassName;
    private Long productTemplate;
    private String productTemplateName;
    private Long brand;
    private String brandCode;
    private String brandName;
    private String placeOfOrigin;
    private String manufacturer;
    private Long productLine;
    private String productLineCode;
    private String productLineName;
    private MultilingualVO shareDescription;
    private Integer customerServiceDay;
    private Date beUpTime;
    private Integer order;
    private Long unit;
    private String unitCode;
    private String unitName;
    private String taxClass;
    private String taxClassCode;
    private String taxClassName;
    private String url;
    private Integer creatorType;
    private String orgId;
    private String orgCode;
    private Long creatorCustomer;
    private Long shop;
    private Integer platFormStatus;
    private String platFormRemark;
    private Integer source;
    private Boolean hasSpecs;
    private Integer useSku;
    private Long defaultSKUId;
    @UniquePKField
    private Long id;
    private Date timestamp;
    private Long tenant;
    private String erpCode;
    private Boolean deleted;
    private Date createTime;
    private Date createDate;
    private Date modifyTime;
    private Date modifyDate;
    private String creator;
    private String modifier;
    private Integer realProductAttributeType;
    private BigDecimal weight;
    private Long weightUnit;
    private String weightUnitCode;
    private String weightUnitName;
    private BigDecimal volume;
    private Long volumeUnit;
    private String volumeUnitCode;
    private String volumeUnitName;
    private Integer unitUseType;
    private Boolean enableAssistUnit;
    private Long creatorId;
    private Long modifierId;
    private String name1;
    private String name2;
    private String name3;
    private String name4;
    private String name5;
    private String name6;
    private String sharedescription1;
    private String sharedescription2;
    private String sharedescription3;
    private String sharedescription4;
    private String sharedescription5;
    private String sharedescription6;
    private String keywords1;
    private String keywords2;
    private String keywords3;
    private String keywords4;
    private String keywords5;
    private String keywords6;
    private String model1;
    private String model2;
    private String model3;
    private String model4;
    private String model5;
    private String model6;
    private String modeldescription1;
    private String modeldescription2;
    private String modeldescription3;
    private String modeldescription4;
    private String modeldescription5;
    private String modeldescription6;
    private Long attachmentGroupId;
    private Boolean registrationManager;
    private Boolean authorizationManager;
    private String sunshinePurchaseNo;
    private String registrationNo;
    private BigDecimal length;
    private BigDecimal width;
    private BigDecimal height;
    private Long sociCoreArchive;
    private Long planClass;
    private String planClassCode;
    private String planClassName;
    private String ytenantId;
    private String internalSupplyOrgId;
    private String internalSupplyOrgCode;
    private String internalSupplyOrgName;
    private BigDecimal netWeight;
    private Long netWeightUnit;
    private String netWeightUnitCode;
    private String netWeightUnitName;
    private String transType;
    private String transTypeCode;
    private String transTypeName;
    private Integer productFamily;
    private Integer salesAndOperations;
    private Integer ptoPriceType;
    private Integer logicallyDeleteType;
    private Long productPropCharacterDefineId;
    private Integer optionalMaterial;
    private Integer derivedMaterial;
    private Long optionalMaterialId;
    private String optionalMaterialCode;
    private String optionalMaterialName;
    private Map<String, Object> productPropCharacterDefine;
    private List<ProductBarCodeVO> productBarCodes;
    private List<ProductAssistUnitExchangesVO> productAssistUnitExchanges;
    private ProductDescriptionVO description;
    private List<ProductAttachmentVO> productAttachments;
    private List<ProductAlbumVO> productAlbums;
    private List<ProductTag> productTags;
    private List<ProductAssistClassVO> productAssistClasses;
    private String imgBusinessId;
    private String videoBusinessId;
    private String homepageBusinessId;
    private String materialStatusId;
    private String materialStatusCode;
    private Short optionalType;
    private String applyRangeOrgCode;
    private String applyRangeOrgId;
    private String _ecsuite_temp;

    public ProductDetailVO getDetail() {
        return this.detail;
    }

    public List<ProductOrgVo> getProductOrges() {
        return this.productOrges;
    }

    public List<ProductOrgVo> getProductCustomers() {
        return this.productCustomers;
    }

    public List<ProductOrgVo> getProductShops() {
        return this.productShops;
    }

    public Long getProductCharacterDefId() {
        return this.productCharacterDefId;
    }

    public Map<String, Object> getProductCharacterDef() {
        return this.productCharacterDef;
    }

    public Boolean getAutoGenerateRangeData() {
        return this.autoGenerateRangeData;
    }

    public Integer getRealProductAttribute() {
        return this.realProductAttribute;
    }

    public Integer getVirtualProductAttribute() {
        return this.virtualProductAttribute;
    }

    public Long getGiftCardId() {
        return this.giftCardId;
    }

    public Long getCouponId() {
        return this.couponId;
    }

    public Integer getCouponType() {
        return this.couponType;
    }

    public String getProductAttribute() {
        return this.productAttribute;
    }

    public String getCode() {
        return this.code;
    }

    public MultilingualVO getName() {
        return this.name;
    }

    public MultilingualVO getModelDescription() {
        return this.modelDescription;
    }

    public MultilingualVO getModel() {
        return this.model;
    }

    public String getPlatformCode() {
        return this.platformCode;
    }

    public String getMnemonicCode() {
        return this.mnemonicCode;
    }

    public MultilingualVO getKeywords() {
        return this.keywords;
    }

    public Long getProductClass() {
        return this.productClass;
    }

    public String getProductClassCode() {
        return this.productClassCode;
    }

    public String getProductClassName() {
        return this.productClassName;
    }

    public String getProductClassPath() {
        return this.productClassPath;
    }

    public Long getManageClass() {
        return this.manageClass;
    }

    public String getManageClassCode() {
        return this.manageClassCode;
    }

    public String getManageClassName() {
        return this.manageClassName;
    }

    public Long getPurchaseClass() {
        return this.purchaseClass;
    }

    public String getPurchaseClassCode() {
        return this.purchaseClassCode;
    }

    public String getPurchaseClassName() {
        return this.purchaseClassName;
    }

    public Long getCostClass() {
        return this.costClass;
    }

    public String getCostClassCode() {
        return this.costClassCode;
    }

    public String getCostClassName() {
        return this.costClassName;
    }

    public Long getProductTemplate() {
        return this.productTemplate;
    }

    public String getProductTemplateName() {
        return this.productTemplateName;
    }

    public Long getBrand() {
        return this.brand;
    }

    public String getBrandCode() {
        return this.brandCode;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public String getPlaceOfOrigin() {
        return this.placeOfOrigin;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public Long getProductLine() {
        return this.productLine;
    }

    public String getProductLineCode() {
        return this.productLineCode;
    }

    public String getProductLineName() {
        return this.productLineName;
    }

    public MultilingualVO getShareDescription() {
        return this.shareDescription;
    }

    public Integer getCustomerServiceDay() {
        return this.customerServiceDay;
    }

    public Date getBeUpTime() {
        return this.beUpTime;
    }

    public Integer getOrder() {
        return this.order;
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

    public String getTaxClass() {
        return this.taxClass;
    }

    public String getTaxClassCode() {
        return this.taxClassCode;
    }

    public String getTaxClassName() {
        return this.taxClassName;
    }

    public String getUrl() {
        return this.url;
    }

    public Integer getCreatorType() {
        return this.creatorType;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public Long getCreatorCustomer() {
        return this.creatorCustomer;
    }

    public Long getShop() {
        return this.shop;
    }

    public Integer getPlatFormStatus() {
        return this.platFormStatus;
    }

    public String getPlatFormRemark() {
        return this.platFormRemark;
    }

    public Integer getSource() {
        return this.source;
    }

    public Boolean getHasSpecs() {
        return this.hasSpecs;
    }

    public Integer getUseSku() {
        return this.useSku;
    }

    public Long getDefaultSKUId() {
        return this.defaultSKUId;
    }

    public Long getId() {
        return this.id;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public Long getTenant() {
        return this.tenant;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public Date getModifyTime() {
        return this.modifyTime;
    }

    public Date getModifyDate() {
        return this.modifyDate;
    }

    public String getCreator() {
        return this.creator;
    }

    public String getModifier() {
        return this.modifier;
    }

    public Integer getRealProductAttributeType() {
        return this.realProductAttributeType;
    }

    public BigDecimal getWeight() {
        return this.weight;
    }

    public Long getWeightUnit() {
        return this.weightUnit;
    }

    public String getWeightUnitCode() {
        return this.weightUnitCode;
    }

    public String getWeightUnitName() {
        return this.weightUnitName;
    }

    public BigDecimal getVolume() {
        return this.volume;
    }

    public Long getVolumeUnit() {
        return this.volumeUnit;
    }

    public String getVolumeUnitCode() {
        return this.volumeUnitCode;
    }

    public String getVolumeUnitName() {
        return this.volumeUnitName;
    }

    public Integer getUnitUseType() {
        return this.unitUseType;
    }

    public Boolean getEnableAssistUnit() {
        return this.enableAssistUnit;
    }

    public Long getCreatorId() {
        return this.creatorId;
    }

    public Long getModifierId() {
        return this.modifierId;
    }

    public String getName1() {
        return this.name1;
    }

    public String getName2() {
        return this.name2;
    }

    public String getName3() {
        return this.name3;
    }

    public String getName4() {
        return this.name4;
    }

    public String getName5() {
        return this.name5;
    }

    public String getName6() {
        return this.name6;
    }

    public String getSharedescription1() {
        return this.sharedescription1;
    }

    public String getSharedescription2() {
        return this.sharedescription2;
    }

    public String getSharedescription3() {
        return this.sharedescription3;
    }

    public String getSharedescription4() {
        return this.sharedescription4;
    }

    public String getSharedescription5() {
        return this.sharedescription5;
    }

    public String getSharedescription6() {
        return this.sharedescription6;
    }

    public String getKeywords1() {
        return this.keywords1;
    }

    public String getKeywords2() {
        return this.keywords2;
    }

    public String getKeywords3() {
        return this.keywords3;
    }

    public String getKeywords4() {
        return this.keywords4;
    }

    public String getKeywords5() {
        return this.keywords5;
    }

    public String getKeywords6() {
        return this.keywords6;
    }

    public String getModel1() {
        return this.model1;
    }

    public String getModel2() {
        return this.model2;
    }

    public String getModel3() {
        return this.model3;
    }

    public String getModel4() {
        return this.model4;
    }

    public String getModel5() {
        return this.model5;
    }

    public String getModel6() {
        return this.model6;
    }

    public String getModeldescription1() {
        return this.modeldescription1;
    }

    public String getModeldescription2() {
        return this.modeldescription2;
    }

    public String getModeldescription3() {
        return this.modeldescription3;
    }

    public String getModeldescription4() {
        return this.modeldescription4;
    }

    public String getModeldescription5() {
        return this.modeldescription5;
    }

    public String getModeldescription6() {
        return this.modeldescription6;
    }

    public Long getAttachmentGroupId() {
        return this.attachmentGroupId;
    }

    public Boolean getRegistrationManager() {
        return this.registrationManager;
    }

    public Boolean getAuthorizationManager() {
        return this.authorizationManager;
    }

    public String getSunshinePurchaseNo() {
        return this.sunshinePurchaseNo;
    }

    public String getRegistrationNo() {
        return this.registrationNo;
    }

    public BigDecimal getLength() {
        return this.length;
    }

    public BigDecimal getWidth() {
        return this.width;
    }

    public BigDecimal getHeight() {
        return this.height;
    }

    public Long getSociCoreArchive() {
        return this.sociCoreArchive;
    }

    public Long getPlanClass() {
        return this.planClass;
    }

    public String getPlanClassCode() {
        return this.planClassCode;
    }

    public String getPlanClassName() {
        return this.planClassName;
    }

    public String getYtenantId() {
        return this.ytenantId;
    }

    public String getInternalSupplyOrgId() {
        return this.internalSupplyOrgId;
    }

    public String getInternalSupplyOrgCode() {
        return this.internalSupplyOrgCode;
    }

    public String getInternalSupplyOrgName() {
        return this.internalSupplyOrgName;
    }

    public BigDecimal getNetWeight() {
        return this.netWeight;
    }

    public Long getNetWeightUnit() {
        return this.netWeightUnit;
    }

    public String getNetWeightUnitCode() {
        return this.netWeightUnitCode;
    }

    public String getNetWeightUnitName() {
        return this.netWeightUnitName;
    }

    public String getTransType() {
        return this.transType;
    }

    public String getTransTypeCode() {
        return this.transTypeCode;
    }

    public String getTransTypeName() {
        return this.transTypeName;
    }

    public Integer getProductFamily() {
        return this.productFamily;
    }

    public Integer getSalesAndOperations() {
        return this.salesAndOperations;
    }

    public Integer getPtoPriceType() {
        return this.ptoPriceType;
    }

    public Integer getLogicallyDeleteType() {
        return this.logicallyDeleteType;
    }

    public Long getProductPropCharacterDefineId() {
        return this.productPropCharacterDefineId;
    }

    public Integer getOptionalMaterial() {
        return this.optionalMaterial;
    }

    public Integer getDerivedMaterial() {
        return this.derivedMaterial;
    }

    public Long getOptionalMaterialId() {
        return this.optionalMaterialId;
    }

    public String getOptionalMaterialCode() {
        return this.optionalMaterialCode;
    }

    public String getOptionalMaterialName() {
        return this.optionalMaterialName;
    }

    public Map<String, Object> getProductPropCharacterDefine() {
        return this.productPropCharacterDefine;
    }

    public List<ProductBarCodeVO> getProductBarCodes() {
        return this.productBarCodes;
    }

    public List<ProductAssistUnitExchangesVO> getProductAssistUnitExchanges() {
        return this.productAssistUnitExchanges;
    }

    public ProductDescriptionVO getDescription() {
        return this.description;
    }

    public List<ProductAttachmentVO> getProductAttachments() {
        return this.productAttachments;
    }

    public List<ProductAlbumVO> getProductAlbums() {
        return this.productAlbums;
    }

    public List<ProductTag> getProductTags() {
        return this.productTags;
    }

    public List<ProductAssistClassVO> getProductAssistClasses() {
        return this.productAssistClasses;
    }

    public String getImgBusinessId() {
        return this.imgBusinessId;
    }

    public String getVideoBusinessId() {
        return this.videoBusinessId;
    }

    public String getHomepageBusinessId() {
        return this.homepageBusinessId;
    }

    public String getMaterialStatusId() {
        return this.materialStatusId;
    }

    public String getMaterialStatusCode() {
        return this.materialStatusCode;
    }

    public Short getOptionalType() {
        return this.optionalType;
    }

    public String getApplyRangeOrgCode() {
        return this.applyRangeOrgCode;
    }

    public String getApplyRangeOrgId() {
        return this.applyRangeOrgId;
    }

    public String get_ecsuite_temp() {
        return this._ecsuite_temp;
    }

    public void setDetail(ProductDetailVO detail) {
        this.detail = detail;
    }

    public void setProductOrges(List<ProductOrgVo> productOrges) {
        this.productOrges = productOrges;
    }

    public void setProductCustomers(List<ProductOrgVo> productCustomers) {
        this.productCustomers = productCustomers;
    }

    public void setProductShops(List<ProductOrgVo> productShops) {
        this.productShops = productShops;
    }

    public void setProductCharacterDefId(Long productCharacterDefId) {
        this.productCharacterDefId = productCharacterDefId;
    }

    public void setProductCharacterDef(Map<String, Object> productCharacterDef) {
        this.productCharacterDef = productCharacterDef;
    }

    public void setAutoGenerateRangeData(Boolean autoGenerateRangeData) {
        this.autoGenerateRangeData = autoGenerateRangeData;
    }

    public void setRealProductAttribute(Integer realProductAttribute) {
        this.realProductAttribute = realProductAttribute;
    }

    public void setVirtualProductAttribute(Integer virtualProductAttribute) {
        this.virtualProductAttribute = virtualProductAttribute;
    }

    public void setGiftCardId(Long giftCardId) {
        this.giftCardId = giftCardId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public void setProductAttribute(String productAttribute) {
        this.productAttribute = productAttribute;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(MultilingualVO name) {
        this.name = name;
    }

    public void setModelDescription(MultilingualVO modelDescription) {
        this.modelDescription = modelDescription;
    }

    public void setModel(MultilingualVO model) {
        this.model = model;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public void setKeywords(MultilingualVO keywords) {
        this.keywords = keywords;
    }

    public void setProductClass(Long productClass) {
        this.productClass = productClass;
    }

    public void setProductClassCode(String productClassCode) {
        this.productClassCode = productClassCode;
    }

    public void setProductClassName(String productClassName) {
        this.productClassName = productClassName;
    }

    public void setProductClassPath(String productClassPath) {
        this.productClassPath = productClassPath;
    }

    public void setManageClass(Long manageClass) {
        this.manageClass = manageClass;
    }

    public void setManageClassCode(String manageClassCode) {
        this.manageClassCode = manageClassCode;
    }

    public void setManageClassName(String manageClassName) {
        this.manageClassName = manageClassName;
    }

    public void setPurchaseClass(Long purchaseClass) {
        this.purchaseClass = purchaseClass;
    }

    public void setPurchaseClassCode(String purchaseClassCode) {
        this.purchaseClassCode = purchaseClassCode;
    }

    public void setPurchaseClassName(String purchaseClassName) {
        this.purchaseClassName = purchaseClassName;
    }

    public void setCostClass(Long costClass) {
        this.costClass = costClass;
    }

    public void setCostClassCode(String costClassCode) {
        this.costClassCode = costClassCode;
    }

    public void setCostClassName(String costClassName) {
        this.costClassName = costClassName;
    }

    public void setProductTemplate(Long productTemplate) {
        this.productTemplate = productTemplate;
    }

    public void setProductTemplateName(String productTemplateName) {
        this.productTemplateName = productTemplateName;
    }

    public void setBrand(Long brand) {
        this.brand = brand;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setProductLine(Long productLine) {
        this.productLine = productLine;
    }

    public void setProductLineCode(String productLineCode) {
        this.productLineCode = productLineCode;
    }

    public void setProductLineName(String productLineName) {
        this.productLineName = productLineName;
    }

    public void setShareDescription(MultilingualVO shareDescription) {
        this.shareDescription = shareDescription;
    }

    public void setCustomerServiceDay(Integer customerServiceDay) {
        this.customerServiceDay = customerServiceDay;
    }

    public void setBeUpTime(Date beUpTime) {
        this.beUpTime = beUpTime;
    }

    public void setOrder(Integer order) {
        this.order = order;
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

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    public void setTaxClassCode(String taxClassCode) {
        this.taxClassCode = taxClassCode;
    }

    public void setTaxClassName(String taxClassName) {
        this.taxClassName = taxClassName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setCreatorType(Integer creatorType) {
        this.creatorType = creatorType;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public void setCreatorCustomer(Long creatorCustomer) {
        this.creatorCustomer = creatorCustomer;
    }

    public void setShop(Long shop) {
        this.shop = shop;
    }

    public void setPlatFormStatus(Integer platFormStatus) {
        this.platFormStatus = platFormStatus;
    }

    public void setPlatFormRemark(String platFormRemark) {
        this.platFormRemark = platFormRemark;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public void setHasSpecs(Boolean hasSpecs) {
        this.hasSpecs = hasSpecs;
    }

    public void setUseSku(Integer useSku) {
        this.useSku = useSku;
    }

    public void setDefaultSKUId(Long defaultSKUId) {
        this.defaultSKUId = defaultSKUId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setTenant(Long tenant) {
        this.tenant = tenant;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public void setRealProductAttributeType(Integer realProductAttributeType) {
        this.realProductAttributeType = realProductAttributeType;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public void setWeightUnit(Long weightUnit) {
        this.weightUnit = weightUnit;
    }

    public void setWeightUnitCode(String weightUnitCode) {
        this.weightUnitCode = weightUnitCode;
    }

    public void setWeightUnitName(String weightUnitName) {
        this.weightUnitName = weightUnitName;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public void setVolumeUnit(Long volumeUnit) {
        this.volumeUnit = volumeUnit;
    }

    public void setVolumeUnitCode(String volumeUnitCode) {
        this.volumeUnitCode = volumeUnitCode;
    }

    public void setVolumeUnitName(String volumeUnitName) {
        this.volumeUnitName = volumeUnitName;
    }

    public void setUnitUseType(Integer unitUseType) {
        this.unitUseType = unitUseType;
    }

    public void setEnableAssistUnit(Boolean enableAssistUnit) {
        this.enableAssistUnit = enableAssistUnit;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    public void setName5(String name5) {
        this.name5 = name5;
    }

    public void setName6(String name6) {
        this.name6 = name6;
    }

    public void setSharedescription1(String sharedescription1) {
        this.sharedescription1 = sharedescription1;
    }

    public void setSharedescription2(String sharedescription2) {
        this.sharedescription2 = sharedescription2;
    }

    public void setSharedescription3(String sharedescription3) {
        this.sharedescription3 = sharedescription3;
    }

    public void setSharedescription4(String sharedescription4) {
        this.sharedescription4 = sharedescription4;
    }

    public void setSharedescription5(String sharedescription5) {
        this.sharedescription5 = sharedescription5;
    }

    public void setSharedescription6(String sharedescription6) {
        this.sharedescription6 = sharedescription6;
    }

    public void setKeywords1(String keywords1) {
        this.keywords1 = keywords1;
    }

    public void setKeywords2(String keywords2) {
        this.keywords2 = keywords2;
    }

    public void setKeywords3(String keywords3) {
        this.keywords3 = keywords3;
    }

    public void setKeywords4(String keywords4) {
        this.keywords4 = keywords4;
    }

    public void setKeywords5(String keywords5) {
        this.keywords5 = keywords5;
    }

    public void setKeywords6(String keywords6) {
        this.keywords6 = keywords6;
    }

    public void setModel1(String model1) {
        this.model1 = model1;
    }

    public void setModel2(String model2) {
        this.model2 = model2;
    }

    public void setModel3(String model3) {
        this.model3 = model3;
    }

    public void setModel4(String model4) {
        this.model4 = model4;
    }

    public void setModel5(String model5) {
        this.model5 = model5;
    }

    public void setModel6(String model6) {
        this.model6 = model6;
    }

    public void setModeldescription1(String modeldescription1) {
        this.modeldescription1 = modeldescription1;
    }

    public void setModeldescription2(String modeldescription2) {
        this.modeldescription2 = modeldescription2;
    }

    public void setModeldescription3(String modeldescription3) {
        this.modeldescription3 = modeldescription3;
    }

    public void setModeldescription4(String modeldescription4) {
        this.modeldescription4 = modeldescription4;
    }

    public void setModeldescription5(String modeldescription5) {
        this.modeldescription5 = modeldescription5;
    }

    public void setModeldescription6(String modeldescription6) {
        this.modeldescription6 = modeldescription6;
    }

    public void setAttachmentGroupId(Long attachmentGroupId) {
        this.attachmentGroupId = attachmentGroupId;
    }

    public void setRegistrationManager(Boolean registrationManager) {
        this.registrationManager = registrationManager;
    }

    public void setAuthorizationManager(Boolean authorizationManager) {
        this.authorizationManager = authorizationManager;
    }

    public void setSunshinePurchaseNo(String sunshinePurchaseNo) {
        this.sunshinePurchaseNo = sunshinePurchaseNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public void setSociCoreArchive(Long sociCoreArchive) {
        this.sociCoreArchive = sociCoreArchive;
    }

    public void setPlanClass(Long planClass) {
        this.planClass = planClass;
    }

    public void setPlanClassCode(String planClassCode) {
        this.planClassCode = planClassCode;
    }

    public void setPlanClassName(String planClassName) {
        this.planClassName = planClassName;
    }

    public void setYtenantId(String ytenantId) {
        this.ytenantId = ytenantId;
    }

    public void setInternalSupplyOrgId(String internalSupplyOrgId) {
        this.internalSupplyOrgId = internalSupplyOrgId;
    }

    public void setInternalSupplyOrgCode(String internalSupplyOrgCode) {
        this.internalSupplyOrgCode = internalSupplyOrgCode;
    }

    public void setInternalSupplyOrgName(String internalSupplyOrgName) {
        this.internalSupplyOrgName = internalSupplyOrgName;
    }

    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    public void setNetWeightUnit(Long netWeightUnit) {
        this.netWeightUnit = netWeightUnit;
    }

    public void setNetWeightUnitCode(String netWeightUnitCode) {
        this.netWeightUnitCode = netWeightUnitCode;
    }

    public void setNetWeightUnitName(String netWeightUnitName) {
        this.netWeightUnitName = netWeightUnitName;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public void setTransTypeCode(String transTypeCode) {
        this.transTypeCode = transTypeCode;
    }

    public void setTransTypeName(String transTypeName) {
        this.transTypeName = transTypeName;
    }

    public void setProductFamily(Integer productFamily) {
        this.productFamily = productFamily;
    }

    public void setSalesAndOperations(Integer salesAndOperations) {
        this.salesAndOperations = salesAndOperations;
    }

    public void setPtoPriceType(Integer ptoPriceType) {
        this.ptoPriceType = ptoPriceType;
    }

    public void setLogicallyDeleteType(Integer logicallyDeleteType) {
        this.logicallyDeleteType = logicallyDeleteType;
    }

    public void setProductPropCharacterDefineId(Long productPropCharacterDefineId) {
        this.productPropCharacterDefineId = productPropCharacterDefineId;
    }

    public void setOptionalMaterial(Integer optionalMaterial) {
        this.optionalMaterial = optionalMaterial;
    }

    public void setDerivedMaterial(Integer derivedMaterial) {
        this.derivedMaterial = derivedMaterial;
    }

    public void setOptionalMaterialId(Long optionalMaterialId) {
        this.optionalMaterialId = optionalMaterialId;
    }

    public void setOptionalMaterialCode(String optionalMaterialCode) {
        this.optionalMaterialCode = optionalMaterialCode;
    }

    public void setOptionalMaterialName(String optionalMaterialName) {
        this.optionalMaterialName = optionalMaterialName;
    }

    public void setProductPropCharacterDefine(Map<String, Object> productPropCharacterDefine) {
        this.productPropCharacterDefine = productPropCharacterDefine;
    }

    public void setProductBarCodes(List<ProductBarCodeVO> productBarCodes) {
        this.productBarCodes = productBarCodes;
    }

    public void setProductAssistUnitExchanges(List<ProductAssistUnitExchangesVO> productAssistUnitExchanges) {
        this.productAssistUnitExchanges = productAssistUnitExchanges;
    }

    public void setDescription(ProductDescriptionVO description) {
        this.description = description;
    }

    public void setProductAttachments(List<ProductAttachmentVO> productAttachments) {
        this.productAttachments = productAttachments;
    }

    public void setProductAlbums(List<ProductAlbumVO> productAlbums) {
        this.productAlbums = productAlbums;
    }

    public void setProductTags(List<ProductTag> productTags) {
        this.productTags = productTags;
    }

    public void setProductAssistClasses(List<ProductAssistClassVO> productAssistClasses) {
        this.productAssistClasses = productAssistClasses;
    }

    public void setImgBusinessId(String imgBusinessId) {
        this.imgBusinessId = imgBusinessId;
    }

    public void setVideoBusinessId(String videoBusinessId) {
        this.videoBusinessId = videoBusinessId;
    }

    public void setHomepageBusinessId(String homepageBusinessId) {
        this.homepageBusinessId = homepageBusinessId;
    }

    public void setMaterialStatusId(String materialStatusId) {
        this.materialStatusId = materialStatusId;
    }

    public void setMaterialStatusCode(String materialStatusCode) {
        this.materialStatusCode = materialStatusCode;
    }

    public void setOptionalType(Short optionalType) {
        this.optionalType = optionalType;
    }

    public void setApplyRangeOrgCode(String applyRangeOrgCode) {
        this.applyRangeOrgCode = applyRangeOrgCode;
    }

    public void setApplyRangeOrgId(String applyRangeOrgId) {
        this.applyRangeOrgId = applyRangeOrgId;
    }

    public void set_ecsuite_temp(String _ecsuite_temp) {
        this._ecsuite_temp = _ecsuite_temp;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean equals(Object o) {
        void other$_ecsuite_temp;
        void this$_ecsuite_temp;
        void other$applyRangeOrgId;
        void this$applyRangeOrgId;
        void other$applyRangeOrgCode;
        void this$applyRangeOrgCode;
        void other$materialStatusCode;
        void this$materialStatusCode;
        void other$materialStatusId;
        void this$materialStatusId;
        void other$homepageBusinessId;
        void this$homepageBusinessId;
        void other$videoBusinessId;
        void this$videoBusinessId;
        void other$imgBusinessId;
        void this$imgBusinessId;
        void other$productAssistClasses;
        void this$productAssistClasses;
        void other$productTags;
        void this$productTags;
        void other$productAlbums;
        void this$productAlbums;
        void other$productAttachments;
        void this$productAttachments;
        void other$description;
        void this$description;
        void other$productAssistUnitExchanges;
        void this$productAssistUnitExchanges;
        void other$productBarCodes;
        void this$productBarCodes;
        void other$productPropCharacterDefine;
        void this$productPropCharacterDefine;
        void other$optionalMaterialName;
        void this$optionalMaterialName;
        void other$optionalMaterialCode;
        void this$optionalMaterialCode;
        void other$transTypeName;
        void this$transTypeName;
        void other$transTypeCode;
        void this$transTypeCode;
        void other$transType;
        void this$transType;
        void other$netWeightUnitName;
        void this$netWeightUnitName;
        void other$netWeightUnitCode;
        void this$netWeightUnitCode;
        void other$netWeight;
        void this$netWeight;
        void other$internalSupplyOrgName;
        void this$internalSupplyOrgName;
        void other$internalSupplyOrgCode;
        void this$internalSupplyOrgCode;
        void other$internalSupplyOrgId;
        void this$internalSupplyOrgId;
        void other$ytenantId;
        void this$ytenantId;
        void other$planClassName;
        void this$planClassName;
        void other$planClassCode;
        void this$planClassCode;
        void other$height;
        void this$height;
        void other$width;
        void this$width;
        void other$length;
        void this$length;
        void other$registrationNo;
        void this$registrationNo;
        void other$sunshinePurchaseNo;
        void this$sunshinePurchaseNo;
        void other$modeldescription6;
        void this$modeldescription6;
        void other$modeldescription5;
        void this$modeldescription5;
        void other$modeldescription4;
        void this$modeldescription4;
        void other$modeldescription3;
        void this$modeldescription3;
        void other$modeldescription2;
        void this$modeldescription2;
        void other$modeldescription1;
        void this$modeldescription1;
        void other$model6;
        void this$model6;
        void other$model5;
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductApiVO)) {
            return false;
        }
        ProductApiVO other = (ProductApiVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$productCharacterDefId = this.getProductCharacterDefId();
        Long other$productCharacterDefId = other.getProductCharacterDefId();
        if (this$productCharacterDefId == null ? other$productCharacterDefId != null : !((Object)this$productCharacterDefId).equals(other$productCharacterDefId)) {
            return false;
        }
        Boolean this$autoGenerateRangeData = this.getAutoGenerateRangeData();
        Boolean other$autoGenerateRangeData = other.getAutoGenerateRangeData();
        if (this$autoGenerateRangeData == null ? other$autoGenerateRangeData != null : !((Object)this$autoGenerateRangeData).equals(other$autoGenerateRangeData)) {
            return false;
        }
        Integer this$realProductAttribute = this.getRealProductAttribute();
        Integer other$realProductAttribute = other.getRealProductAttribute();
        if (this$realProductAttribute == null ? other$realProductAttribute != null : !((Object)this$realProductAttribute).equals(other$realProductAttribute)) {
            return false;
        }
        Integer this$virtualProductAttribute = this.getVirtualProductAttribute();
        Integer other$virtualProductAttribute = other.getVirtualProductAttribute();
        if (this$virtualProductAttribute == null ? other$virtualProductAttribute != null : !((Object)this$virtualProductAttribute).equals(other$virtualProductAttribute)) {
            return false;
        }
        Long this$giftCardId = this.getGiftCardId();
        Long other$giftCardId = other.getGiftCardId();
        if (this$giftCardId == null ? other$giftCardId != null : !((Object)this$giftCardId).equals(other$giftCardId)) {
            return false;
        }
        Long this$couponId = this.getCouponId();
        Long other$couponId = other.getCouponId();
        if (this$couponId == null ? other$couponId != null : !((Object)this$couponId).equals(other$couponId)) {
            return false;
        }
        Integer this$couponType = this.getCouponType();
        Integer other$couponType = other.getCouponType();
        if (this$couponType == null ? other$couponType != null : !((Object)this$couponType).equals(other$couponType)) {
            return false;
        }
        Long this$productClass = this.getProductClass();
        Long other$productClass = other.getProductClass();
        if (this$productClass == null ? other$productClass != null : !((Object)this$productClass).equals(other$productClass)) {
            return false;
        }
        Long this$manageClass = this.getManageClass();
        Long other$manageClass = other.getManageClass();
        if (this$manageClass == null ? other$manageClass != null : !((Object)this$manageClass).equals(other$manageClass)) {
            return false;
        }
        Long this$purchaseClass = this.getPurchaseClass();
        Long other$purchaseClass = other.getPurchaseClass();
        if (this$purchaseClass == null ? other$purchaseClass != null : !((Object)this$purchaseClass).equals(other$purchaseClass)) {
            return false;
        }
        Long this$costClass = this.getCostClass();
        Long other$costClass = other.getCostClass();
        if (this$costClass == null ? other$costClass != null : !((Object)this$costClass).equals(other$costClass)) {
            return false;
        }
        Long this$productTemplate = this.getProductTemplate();
        Long other$productTemplate = other.getProductTemplate();
        if (this$productTemplate == null ? other$productTemplate != null : !((Object)this$productTemplate).equals(other$productTemplate)) {
            return false;
        }
        Long this$brand = this.getBrand();
        Long other$brand = other.getBrand();
        if (this$brand == null ? other$brand != null : !((Object)this$brand).equals(other$brand)) {
            return false;
        }
        Long this$productLine = this.getProductLine();
        Long other$productLine = other.getProductLine();
        if (this$productLine == null ? other$productLine != null : !((Object)this$productLine).equals(other$productLine)) {
            return false;
        }
        Integer this$customerServiceDay = this.getCustomerServiceDay();
        Integer other$customerServiceDay = other.getCustomerServiceDay();
        if (this$customerServiceDay == null ? other$customerServiceDay != null : !((Object)this$customerServiceDay).equals(other$customerServiceDay)) {
            return false;
        }
        Integer this$order = this.getOrder();
        Integer other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        Long this$unit = this.getUnit();
        Long other$unit = other.getUnit();
        if (this$unit == null ? other$unit != null : !((Object)this$unit).equals(other$unit)) {
            return false;
        }
        Integer this$creatorType = this.getCreatorType();
        Integer other$creatorType = other.getCreatorType();
        if (this$creatorType == null ? other$creatorType != null : !((Object)this$creatorType).equals(other$creatorType)) {
            return false;
        }
        Long this$creatorCustomer = this.getCreatorCustomer();
        Long other$creatorCustomer = other.getCreatorCustomer();
        if (this$creatorCustomer == null ? other$creatorCustomer != null : !((Object)this$creatorCustomer).equals(other$creatorCustomer)) {
            return false;
        }
        Long this$shop = this.getShop();
        Long other$shop = other.getShop();
        if (this$shop == null ? other$shop != null : !((Object)this$shop).equals(other$shop)) {
            return false;
        }
        Integer this$platFormStatus = this.getPlatFormStatus();
        Integer other$platFormStatus = other.getPlatFormStatus();
        if (this$platFormStatus == null ? other$platFormStatus != null : !((Object)this$platFormStatus).equals(other$platFormStatus)) {
            return false;
        }
        Integer this$source = this.getSource();
        Integer other$source = other.getSource();
        if (this$source == null ? other$source != null : !((Object)this$source).equals(other$source)) {
            return false;
        }
        Boolean this$hasSpecs = this.getHasSpecs();
        Boolean other$hasSpecs = other.getHasSpecs();
        if (this$hasSpecs == null ? other$hasSpecs != null : !((Object)this$hasSpecs).equals(other$hasSpecs)) {
            return false;
        }
        Integer this$useSku = this.getUseSku();
        Integer other$useSku = other.getUseSku();
        if (this$useSku == null ? other$useSku != null : !((Object)this$useSku).equals(other$useSku)) {
            return false;
        }
        Long this$defaultSKUId = this.getDefaultSKUId();
        Long other$defaultSKUId = other.getDefaultSKUId();
        if (this$defaultSKUId == null ? other$defaultSKUId != null : !((Object)this$defaultSKUId).equals(other$defaultSKUId)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$tenant = this.getTenant();
        Long other$tenant = other.getTenant();
        if (this$tenant == null ? other$tenant != null : !((Object)this$tenant).equals(other$tenant)) {
            return false;
        }
        Boolean this$deleted = this.getDeleted();
        Boolean other$deleted = other.getDeleted();
        if (this$deleted == null ? other$deleted != null : !((Object)this$deleted).equals(other$deleted)) {
            return false;
        }
        Integer this$realProductAttributeType = this.getRealProductAttributeType();
        Integer other$realProductAttributeType = other.getRealProductAttributeType();
        if (this$realProductAttributeType == null ? other$realProductAttributeType != null : !((Object)this$realProductAttributeType).equals(other$realProductAttributeType)) {
            return false;
        }
        Long this$weightUnit = this.getWeightUnit();
        Long other$weightUnit = other.getWeightUnit();
        if (this$weightUnit == null ? other$weightUnit != null : !((Object)this$weightUnit).equals(other$weightUnit)) {
            return false;
        }
        Long this$volumeUnit = this.getVolumeUnit();
        Long other$volumeUnit = other.getVolumeUnit();
        if (this$volumeUnit == null ? other$volumeUnit != null : !((Object)this$volumeUnit).equals(other$volumeUnit)) {
            return false;
        }
        Integer this$unitUseType = this.getUnitUseType();
        Integer other$unitUseType = other.getUnitUseType();
        if (this$unitUseType == null ? other$unitUseType != null : !((Object)this$unitUseType).equals(other$unitUseType)) {
            return false;
        }
        Boolean this$enableAssistUnit = this.getEnableAssistUnit();
        Boolean other$enableAssistUnit = other.getEnableAssistUnit();
        if (this$enableAssistUnit == null ? other$enableAssistUnit != null : !((Object)this$enableAssistUnit).equals(other$enableAssistUnit)) {
            return false;
        }
        Long this$creatorId = this.getCreatorId();
        Long other$creatorId = other.getCreatorId();
        if (this$creatorId == null ? other$creatorId != null : !((Object)this$creatorId).equals(other$creatorId)) {
            return false;
        }
        Long this$modifierId = this.getModifierId();
        Long other$modifierId = other.getModifierId();
        if (this$modifierId == null ? other$modifierId != null : !((Object)this$modifierId).equals(other$modifierId)) {
            return false;
        }
        Long this$attachmentGroupId = this.getAttachmentGroupId();
        Long other$attachmentGroupId = other.getAttachmentGroupId();
        if (this$attachmentGroupId == null ? other$attachmentGroupId != null : !((Object)this$attachmentGroupId).equals(other$attachmentGroupId)) {
            return false;
        }
        Boolean this$registrationManager = this.getRegistrationManager();
        Boolean other$registrationManager = other.getRegistrationManager();
        if (this$registrationManager == null ? other$registrationManager != null : !((Object)this$registrationManager).equals(other$registrationManager)) {
            return false;
        }
        Boolean this$authorizationManager = this.getAuthorizationManager();
        Boolean other$authorizationManager = other.getAuthorizationManager();
        if (this$authorizationManager == null ? other$authorizationManager != null : !((Object)this$authorizationManager).equals(other$authorizationManager)) {
            return false;
        }
        Long this$sociCoreArchive = this.getSociCoreArchive();
        Long other$sociCoreArchive = other.getSociCoreArchive();
        if (this$sociCoreArchive == null ? other$sociCoreArchive != null : !((Object)this$sociCoreArchive).equals(other$sociCoreArchive)) {
            return false;
        }
        Long this$planClass = this.getPlanClass();
        Long other$planClass = other.getPlanClass();
        if (this$planClass == null ? other$planClass != null : !((Object)this$planClass).equals(other$planClass)) {
            return false;
        }
        Long this$netWeightUnit = this.getNetWeightUnit();
        Long other$netWeightUnit = other.getNetWeightUnit();
        if (this$netWeightUnit == null ? other$netWeightUnit != null : !((Object)this$netWeightUnit).equals(other$netWeightUnit)) {
            return false;
        }
        Integer this$productFamily = this.getProductFamily();
        Integer other$productFamily = other.getProductFamily();
        if (this$productFamily == null ? other$productFamily != null : !((Object)this$productFamily).equals(other$productFamily)) {
            return false;
        }
        Integer this$salesAndOperations = this.getSalesAndOperations();
        Integer other$salesAndOperations = other.getSalesAndOperations();
        if (this$salesAndOperations == null ? other$salesAndOperations != null : !((Object)this$salesAndOperations).equals(other$salesAndOperations)) {
            return false;
        }
        Integer this$ptoPriceType = this.getPtoPriceType();
        Integer other$ptoPriceType = other.getPtoPriceType();
        if (this$ptoPriceType == null ? other$ptoPriceType != null : !((Object)this$ptoPriceType).equals(other$ptoPriceType)) {
            return false;
        }
        Integer this$logicallyDeleteType = this.getLogicallyDeleteType();
        Integer other$logicallyDeleteType = other.getLogicallyDeleteType();
        if (this$logicallyDeleteType == null ? other$logicallyDeleteType != null : !((Object)this$logicallyDeleteType).equals(other$logicallyDeleteType)) {
            return false;
        }
        Long this$productPropCharacterDefineId = this.getProductPropCharacterDefineId();
        Long other$productPropCharacterDefineId = other.getProductPropCharacterDefineId();
        if (this$productPropCharacterDefineId == null ? other$productPropCharacterDefineId != null : !((Object)this$productPropCharacterDefineId).equals(other$productPropCharacterDefineId)) {
            return false;
        }
        Integer this$optionalMaterial = this.getOptionalMaterial();
        Integer other$optionalMaterial = other.getOptionalMaterial();
        if (this$optionalMaterial == null ? other$optionalMaterial != null : !((Object)this$optionalMaterial).equals(other$optionalMaterial)) {
            return false;
        }
        Integer this$derivedMaterial = this.getDerivedMaterial();
        Integer other$derivedMaterial = other.getDerivedMaterial();
        if (this$derivedMaterial == null ? other$derivedMaterial != null : !((Object)this$derivedMaterial).equals(other$derivedMaterial)) {
            return false;
        }
        Long this$optionalMaterialId = this.getOptionalMaterialId();
        Long other$optionalMaterialId = other.getOptionalMaterialId();
        if (this$optionalMaterialId == null ? other$optionalMaterialId != null : !((Object)this$optionalMaterialId).equals(other$optionalMaterialId)) {
            return false;
        }
        Short this$optionalType = this.getOptionalType();
        Short other$optionalType = other.getOptionalType();
        if (this$optionalType == null ? other$optionalType != null : !((Object)this$optionalType).equals(other$optionalType)) {
            return false;
        }
        ProductDetailVO this$detail = this.getDetail();
        ProductDetailVO other$detail = other.getDetail();
        if (this$detail == null ? other$detail != null : !((Object)this$detail).equals(other$detail)) {
            return false;
        }
        List<ProductOrgVo> this$productOrges = this.getProductOrges();
        List<ProductOrgVo> other$productOrges = other.getProductOrges();
        if (this$productOrges == null ? other$productOrges != null : !((Object)this$productOrges).equals(other$productOrges)) {
            return false;
        }
        List<ProductOrgVo> this$productCustomers = this.getProductCustomers();
        List<ProductOrgVo> other$productCustomers = other.getProductCustomers();
        if (this$productCustomers == null ? other$productCustomers != null : !((Object)this$productCustomers).equals(other$productCustomers)) {
            return false;
        }
        List<ProductOrgVo> this$productShops = this.getProductShops();
        List<ProductOrgVo> other$productShops = other.getProductShops();
        if (this$productShops == null ? other$productShops != null : !((Object)this$productShops).equals(other$productShops)) {
            return false;
        }
        Map<String, Object> this$productCharacterDef = this.getProductCharacterDef();
        Map<String, Object> other$productCharacterDef = other.getProductCharacterDef();
        if (this$productCharacterDef == null ? other$productCharacterDef != null : !((Object)this$productCharacterDef).equals(other$productCharacterDef)) {
            return false;
        }
        String this$productAttribute = this.getProductAttribute();
        String other$productAttribute = other.getProductAttribute();
        if (this$productAttribute == null ? other$productAttribute != null : !this$productAttribute.equals(other$productAttribute)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        MultilingualVO this$name = this.getName();
        MultilingualVO other$name = other.getName();
        if (this$name == null ? other$name != null : !((Object)this$name).equals(other$name)) {
            return false;
        }
        MultilingualVO this$modelDescription = this.getModelDescription();
        MultilingualVO other$modelDescription = other.getModelDescription();
        if (this$modelDescription == null ? other$modelDescription != null : !((Object)this$modelDescription).equals(other$modelDescription)) {
            return false;
        }
        MultilingualVO this$model = this.getModel();
        MultilingualVO other$model = other.getModel();
        if (this$model == null ? other$model != null : !((Object)this$model).equals(other$model)) {
            return false;
        }
        String this$platformCode = this.getPlatformCode();
        String other$platformCode = other.getPlatformCode();
        if (this$platformCode == null ? other$platformCode != null : !this$platformCode.equals(other$platformCode)) {
            return false;
        }
        String this$mnemonicCode = this.getMnemonicCode();
        String other$mnemonicCode = other.getMnemonicCode();
        if (this$mnemonicCode == null ? other$mnemonicCode != null : !this$mnemonicCode.equals(other$mnemonicCode)) {
            return false;
        }
        MultilingualVO this$keywords = this.getKeywords();
        MultilingualVO other$keywords = other.getKeywords();
        if (this$keywords == null ? other$keywords != null : !((Object)this$keywords).equals(other$keywords)) {
            return false;
        }
        String this$productClassCode = this.getProductClassCode();
        String other$productClassCode = other.getProductClassCode();
        if (this$productClassCode == null ? other$productClassCode != null : !this$productClassCode.equals(other$productClassCode)) {
            return false;
        }
        String this$productClassName = this.getProductClassName();
        String other$productClassName = other.getProductClassName();
        if (this$productClassName == null ? other$productClassName != null : !this$productClassName.equals(other$productClassName)) {
            return false;
        }
        String this$productClassPath = this.getProductClassPath();
        String other$productClassPath = other.getProductClassPath();
        if (this$productClassPath == null ? other$productClassPath != null : !this$productClassPath.equals(other$productClassPath)) {
            return false;
        }
        String this$manageClassCode = this.getManageClassCode();
        String other$manageClassCode = other.getManageClassCode();
        if (this$manageClassCode == null ? other$manageClassCode != null : !this$manageClassCode.equals(other$manageClassCode)) {
            return false;
        }
        String this$manageClassName = this.getManageClassName();
        String other$manageClassName = other.getManageClassName();
        if (this$manageClassName == null ? other$manageClassName != null : !this$manageClassName.equals(other$manageClassName)) {
            return false;
        }
        String this$purchaseClassCode = this.getPurchaseClassCode();
        String other$purchaseClassCode = other.getPurchaseClassCode();
        if (this$purchaseClassCode == null ? other$purchaseClassCode != null : !this$purchaseClassCode.equals(other$purchaseClassCode)) {
            return false;
        }
        String this$purchaseClassName = this.getPurchaseClassName();
        String other$purchaseClassName = other.getPurchaseClassName();
        if (this$purchaseClassName == null ? other$purchaseClassName != null : !this$purchaseClassName.equals(other$purchaseClassName)) {
            return false;
        }
        String this$costClassCode = this.getCostClassCode();
        String other$costClassCode = other.getCostClassCode();
        if (this$costClassCode == null ? other$costClassCode != null : !this$costClassCode.equals(other$costClassCode)) {
            return false;
        }
        String this$costClassName = this.getCostClassName();
        String other$costClassName = other.getCostClassName();
        if (this$costClassName == null ? other$costClassName != null : !this$costClassName.equals(other$costClassName)) {
            return false;
        }
        String this$productTemplateName = this.getProductTemplateName();
        String other$productTemplateName = other.getProductTemplateName();
        if (this$productTemplateName == null ? other$productTemplateName != null : !this$productTemplateName.equals(other$productTemplateName)) {
            return false;
        }
        String this$brandCode = this.getBrandCode();
        String other$brandCode = other.getBrandCode();
        if (this$brandCode == null ? other$brandCode != null : !this$brandCode.equals(other$brandCode)) {
            return false;
        }
        String this$brandName = this.getBrandName();
        String other$brandName = other.getBrandName();
        if (this$brandName == null ? other$brandName != null : !this$brandName.equals(other$brandName)) {
            return false;
        }
        String this$placeOfOrigin = this.getPlaceOfOrigin();
        String other$placeOfOrigin = other.getPlaceOfOrigin();
        if (this$placeOfOrigin == null ? other$placeOfOrigin != null : !this$placeOfOrigin.equals(other$placeOfOrigin)) {
            return false;
        }
        String this$manufacturer = this.getManufacturer();
        String other$manufacturer = other.getManufacturer();
        if (this$manufacturer == null ? other$manufacturer != null : !this$manufacturer.equals(other$manufacturer)) {
            return false;
        }
        String this$productLineCode = this.getProductLineCode();
        String other$productLineCode = other.getProductLineCode();
        if (this$productLineCode == null ? other$productLineCode != null : !this$productLineCode.equals(other$productLineCode)) {
            return false;
        }
        String this$productLineName = this.getProductLineName();
        String other$productLineName = other.getProductLineName();
        if (this$productLineName == null ? other$productLineName != null : !this$productLineName.equals(other$productLineName)) {
            return false;
        }
        MultilingualVO this$shareDescription = this.getShareDescription();
        MultilingualVO other$shareDescription = other.getShareDescription();
        if (this$shareDescription == null ? other$shareDescription != null : !((Object)this$shareDescription).equals(other$shareDescription)) {
            return false;
        }
        Date this$beUpTime = this.getBeUpTime();
        Date other$beUpTime = other.getBeUpTime();
        if (this$beUpTime == null ? other$beUpTime != null : !((Object)this$beUpTime).equals(other$beUpTime)) {
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
        String this$taxClass = this.getTaxClass();
        String other$taxClass = other.getTaxClass();
        if (this$taxClass == null ? other$taxClass != null : !this$taxClass.equals(other$taxClass)) {
            return false;
        }
        String this$taxClassCode = this.getTaxClassCode();
        String other$taxClassCode = other.getTaxClassCode();
        if (this$taxClassCode == null ? other$taxClassCode != null : !this$taxClassCode.equals(other$taxClassCode)) {
            return false;
        }
        String this$taxClassName = this.getTaxClassName();
        String other$taxClassName = other.getTaxClassName();
        if (this$taxClassName == null ? other$taxClassName != null : !this$taxClassName.equals(other$taxClassName)) {
            return false;
        }
        String this$url = this.getUrl();
        String other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$orgCode = this.getOrgCode();
        String other$orgCode = other.getOrgCode();
        if (this$orgCode == null ? other$orgCode != null : !this$orgCode.equals(other$orgCode)) {
            return false;
        }
        String this$platFormRemark = this.getPlatFormRemark();
        String other$platFormRemark = other.getPlatFormRemark();
        if (this$platFormRemark == null ? other$platFormRemark != null : !this$platFormRemark.equals(other$platFormRemark)) {
            return false;
        }
        Date this$timestamp = this.getTimestamp();
        Date other$timestamp = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !((Object)this$timestamp).equals(other$timestamp)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        Date this$createTime = this.getCreateTime();
        Date other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !((Object)this$createTime).equals(other$createTime)) {
            return false;
        }
        Date this$createDate = this.getCreateDate();
        Date other$createDate = other.getCreateDate();
        if (this$createDate == null ? other$createDate != null : !((Object)this$createDate).equals(other$createDate)) {
            return false;
        }
        Date this$modifyTime = this.getModifyTime();
        Date other$modifyTime = other.getModifyTime();
        if (this$modifyTime == null ? other$modifyTime != null : !((Object)this$modifyTime).equals(other$modifyTime)) {
            return false;
        }
        Date this$modifyDate = this.getModifyDate();
        Date other$modifyDate = other.getModifyDate();
        if (this$modifyDate == null ? other$modifyDate != null : !((Object)this$modifyDate).equals(other$modifyDate)) {
            return false;
        }
        String this$creator = this.getCreator();
        String other$creator = other.getCreator();
        if (this$creator == null ? other$creator != null : !this$creator.equals(other$creator)) {
            return false;
        }
        String this$modifier = this.getModifier();
        String other$modifier = other.getModifier();
        if (this$modifier == null ? other$modifier != null : !this$modifier.equals(other$modifier)) {
            return false;
        }
        BigDecimal this$weight = this.getWeight();
        BigDecimal other$weight = other.getWeight();
        if (this$weight == null ? other$weight != null : !((Object)this$weight).equals(other$weight)) {
            return false;
        }
        String this$weightUnitCode = this.getWeightUnitCode();
        String other$weightUnitCode = other.getWeightUnitCode();
        if (this$weightUnitCode == null ? other$weightUnitCode != null : !this$weightUnitCode.equals(other$weightUnitCode)) {
            return false;
        }
        String this$weightUnitName = this.getWeightUnitName();
        String other$weightUnitName = other.getWeightUnitName();
        if (this$weightUnitName == null ? other$weightUnitName != null : !this$weightUnitName.equals(other$weightUnitName)) {
            return false;
        }
        BigDecimal this$volume = this.getVolume();
        BigDecimal other$volume = other.getVolume();
        if (this$volume == null ? other$volume != null : !((Object)this$volume).equals(other$volume)) {
            return false;
        }
        String this$volumeUnitCode = this.getVolumeUnitCode();
        String other$volumeUnitCode = other.getVolumeUnitCode();
        if (this$volumeUnitCode == null ? other$volumeUnitCode != null : !this$volumeUnitCode.equals(other$volumeUnitCode)) {
            return false;
        }
        String this$volumeUnitName = this.getVolumeUnitName();
        String other$volumeUnitName = other.getVolumeUnitName();
        if (this$volumeUnitName == null ? other$volumeUnitName != null : !this$volumeUnitName.equals(other$volumeUnitName)) {
            return false;
        }
        String this$name1 = this.getName1();
        String other$name1 = other.getName1();
        if (this$name1 == null ? other$name1 != null : !this$name1.equals(other$name1)) {
            return false;
        }
        String this$name2 = this.getName2();
        String other$name2 = other.getName2();
        if (this$name2 == null ? other$name2 != null : !this$name2.equals(other$name2)) {
            return false;
        }
        String this$name3 = this.getName3();
        String other$name3 = other.getName3();
        if (this$name3 == null ? other$name3 != null : !this$name3.equals(other$name3)) {
            return false;
        }
        String this$name4 = this.getName4();
        String other$name4 = other.getName4();
        if (this$name4 == null ? other$name4 != null : !this$name4.equals(other$name4)) {
            return false;
        }
        String this$name5 = this.getName5();
        String other$name5 = other.getName5();
        if (this$name5 == null ? other$name5 != null : !this$name5.equals(other$name5)) {
            return false;
        }
        String this$name6 = this.getName6();
        String other$name6 = other.getName6();
        if (this$name6 == null ? other$name6 != null : !this$name6.equals(other$name6)) {
            return false;
        }
        String this$sharedescription1 = this.getSharedescription1();
        String other$sharedescription1 = other.getSharedescription1();
        if (this$sharedescription1 == null ? other$sharedescription1 != null : !this$sharedescription1.equals(other$sharedescription1)) {
            return false;
        }
        String this$sharedescription2 = this.getSharedescription2();
        String other$sharedescription2 = other.getSharedescription2();
        if (this$sharedescription2 == null ? other$sharedescription2 != null : !this$sharedescription2.equals(other$sharedescription2)) {
            return false;
        }
        String this$sharedescription3 = this.getSharedescription3();
        String other$sharedescription3 = other.getSharedescription3();
        if (this$sharedescription3 == null ? other$sharedescription3 != null : !this$sharedescription3.equals(other$sharedescription3)) {
            return false;
        }
        String this$sharedescription4 = this.getSharedescription4();
        String other$sharedescription4 = other.getSharedescription4();
        if (this$sharedescription4 == null ? other$sharedescription4 != null : !this$sharedescription4.equals(other$sharedescription4)) {
            return false;
        }
        String this$sharedescription5 = this.getSharedescription5();
        String other$sharedescription5 = other.getSharedescription5();
        if (this$sharedescription5 == null ? other$sharedescription5 != null : !this$sharedescription5.equals(other$sharedescription5)) {
            return false;
        }
        String this$sharedescription6 = this.getSharedescription6();
        String other$sharedescription6 = other.getSharedescription6();
        if (this$sharedescription6 == null ? other$sharedescription6 != null : !this$sharedescription6.equals(other$sharedescription6)) {
            return false;
        }
        String this$keywords1 = this.getKeywords1();
        String other$keywords1 = other.getKeywords1();
        if (this$keywords1 == null ? other$keywords1 != null : !this$keywords1.equals(other$keywords1)) {
            return false;
        }
        String this$keywords2 = this.getKeywords2();
        String other$keywords2 = other.getKeywords2();
        if (this$keywords2 == null ? other$keywords2 != null : !this$keywords2.equals(other$keywords2)) {
            return false;
        }
        String this$keywords3 = this.getKeywords3();
        String other$keywords3 = other.getKeywords3();
        if (this$keywords3 == null ? other$keywords3 != null : !this$keywords3.equals(other$keywords3)) {
            return false;
        }
        String this$keywords4 = this.getKeywords4();
        String other$keywords4 = other.getKeywords4();
        if (this$keywords4 == null ? other$keywords4 != null : !this$keywords4.equals(other$keywords4)) {
            return false;
        }
        String this$keywords5 = this.getKeywords5();
        String other$keywords5 = other.getKeywords5();
        if (this$keywords5 == null ? other$keywords5 != null : !this$keywords5.equals(other$keywords5)) {
            return false;
        }
        String this$keywords6 = this.getKeywords6();
        String other$keywords6 = other.getKeywords6();
        if (this$keywords6 == null ? other$keywords6 != null : !this$keywords6.equals(other$keywords6)) {
            return false;
        }
        String this$model1 = this.getModel1();
        String other$model1 = other.getModel1();
        if (this$model1 == null ? other$model1 != null : !this$model1.equals(other$model1)) {
            return false;
        }
        String this$model2 = this.getModel2();
        String other$model2 = other.getModel2();
        if (this$model2 == null ? other$model2 != null : !this$model2.equals(other$model2)) {
            return false;
        }
        String this$model3 = this.getModel3();
        String other$model3 = other.getModel3();
        if (this$model3 == null ? other$model3 != null : !this$model3.equals(other$model3)) {
            return false;
        }
        String this$model4 = this.getModel4();
        String other$model4 = other.getModel4();
        if (this$model4 == null ? other$model4 != null : !this$model4.equals(other$model4)) {
            return false;
        }
        String this$model5 = this.getModel5();
        String string = other.getModel5();
        if (this$model5 == null ? other$model5 != null : !this$model5.equals(other$model5)) {
            return false;
        }
        String string2 = this.getModel6();
        String string3 = other.getModel6();
        if (this$model6 == null ? other$model6 != null : !this$model6.equals(other$model6)) {
            return false;
        }
        String string4 = this.getModeldescription1();
        String string5 = other.getModeldescription1();
        if (this$modeldescription1 == null ? other$modeldescription1 != null : !this$modeldescription1.equals(other$modeldescription1)) {
            return false;
        }
        String string6 = this.getModeldescription2();
        String string7 = other.getModeldescription2();
        if (this$modeldescription2 == null ? other$modeldescription2 != null : !this$modeldescription2.equals(other$modeldescription2)) {
            return false;
        }
        String string8 = this.getModeldescription3();
        String string9 = other.getModeldescription3();
        if (this$modeldescription3 == null ? other$modeldescription3 != null : !this$modeldescription3.equals(other$modeldescription3)) {
            return false;
        }
        String string10 = this.getModeldescription4();
        String string11 = other.getModeldescription4();
        if (this$modeldescription4 == null ? other$modeldescription4 != null : !this$modeldescription4.equals(other$modeldescription4)) {
            return false;
        }
        String string12 = this.getModeldescription5();
        String string13 = other.getModeldescription5();
        if (this$modeldescription5 == null ? other$modeldescription5 != null : !this$modeldescription5.equals(other$modeldescription5)) {
            return false;
        }
        String string14 = this.getModeldescription6();
        String string15 = other.getModeldescription6();
        if (this$modeldescription6 == null ? other$modeldescription6 != null : !this$modeldescription6.equals(other$modeldescription6)) {
            return false;
        }
        String string16 = this.getSunshinePurchaseNo();
        String string17 = other.getSunshinePurchaseNo();
        if (this$sunshinePurchaseNo == null ? other$sunshinePurchaseNo != null : !this$sunshinePurchaseNo.equals(other$sunshinePurchaseNo)) {
            return false;
        }
        String string18 = this.getRegistrationNo();
        String string19 = other.getRegistrationNo();
        if (this$registrationNo == null ? other$registrationNo != null : !this$registrationNo.equals(other$registrationNo)) {
            return false;
        }
        BigDecimal bigDecimal = this.getLength();
        BigDecimal bigDecimal2 = other.getLength();
        if (this$length == null ? other$length != null : !this$length.equals(other$length)) {
            return false;
        }
        BigDecimal bigDecimal3 = this.getWidth();
        BigDecimal bigDecimal4 = other.getWidth();
        if (this$width == null ? other$width != null : !this$width.equals(other$width)) {
            return false;
        }
        BigDecimal bigDecimal5 = this.getHeight();
        BigDecimal bigDecimal6 = other.getHeight();
        if (this$height == null ? other$height != null : !this$height.equals(other$height)) {
            return false;
        }
        String string20 = this.getPlanClassCode();
        String string21 = other.getPlanClassCode();
        if (this$planClassCode == null ? other$planClassCode != null : !this$planClassCode.equals(other$planClassCode)) {
            return false;
        }
        String string22 = this.getPlanClassName();
        String string23 = other.getPlanClassName();
        if (this$planClassName == null ? other$planClassName != null : !this$planClassName.equals(other$planClassName)) {
            return false;
        }
        String string24 = this.getYtenantId();
        String string25 = other.getYtenantId();
        if (this$ytenantId == null ? other$ytenantId != null : !this$ytenantId.equals(other$ytenantId)) {
            return false;
        }
        String string26 = this.getInternalSupplyOrgId();
        String string27 = other.getInternalSupplyOrgId();
        if (this$internalSupplyOrgId == null ? other$internalSupplyOrgId != null : !this$internalSupplyOrgId.equals(other$internalSupplyOrgId)) {
            return false;
        }
        String string28 = this.getInternalSupplyOrgCode();
        String string29 = other.getInternalSupplyOrgCode();
        if (this$internalSupplyOrgCode == null ? other$internalSupplyOrgCode != null : !this$internalSupplyOrgCode.equals(other$internalSupplyOrgCode)) {
            return false;
        }
        String string30 = this.getInternalSupplyOrgName();
        String string31 = other.getInternalSupplyOrgName();
        if (this$internalSupplyOrgName == null ? other$internalSupplyOrgName != null : !this$internalSupplyOrgName.equals(other$internalSupplyOrgName)) {
            return false;
        }
        BigDecimal bigDecimal7 = this.getNetWeight();
        BigDecimal bigDecimal8 = other.getNetWeight();
        if (this$netWeight == null ? other$netWeight != null : !this$netWeight.equals(other$netWeight)) {
            return false;
        }
        String string32 = this.getNetWeightUnitCode();
        String string33 = other.getNetWeightUnitCode();
        if (this$netWeightUnitCode == null ? other$netWeightUnitCode != null : !this$netWeightUnitCode.equals(other$netWeightUnitCode)) {
            return false;
        }
        String string34 = this.getNetWeightUnitName();
        String string35 = other.getNetWeightUnitName();
        if (this$netWeightUnitName == null ? other$netWeightUnitName != null : !this$netWeightUnitName.equals(other$netWeightUnitName)) {
            return false;
        }
        String string36 = this.getTransType();
        String string37 = other.getTransType();
        if (this$transType == null ? other$transType != null : !this$transType.equals(other$transType)) {
            return false;
        }
        String string38 = this.getTransTypeCode();
        String string39 = other.getTransTypeCode();
        if (this$transTypeCode == null ? other$transTypeCode != null : !this$transTypeCode.equals(other$transTypeCode)) {
            return false;
        }
        String string40 = this.getTransTypeName();
        String string41 = other.getTransTypeName();
        if (this$transTypeName == null ? other$transTypeName != null : !this$transTypeName.equals(other$transTypeName)) {
            return false;
        }
        String string42 = this.getOptionalMaterialCode();
        String string43 = other.getOptionalMaterialCode();
        if (this$optionalMaterialCode == null ? other$optionalMaterialCode != null : !this$optionalMaterialCode.equals(other$optionalMaterialCode)) {
            return false;
        }
        String string44 = this.getOptionalMaterialName();
        String string45 = other.getOptionalMaterialName();
        if (this$optionalMaterialName == null ? other$optionalMaterialName != null : !this$optionalMaterialName.equals(other$optionalMaterialName)) {
            return false;
        }
        Map<String, Object> map = this.getProductPropCharacterDefine();
        Map<String, Object> map2 = other.getProductPropCharacterDefine();
        if (this$productPropCharacterDefine == null ? other$productPropCharacterDefine != null : !this$productPropCharacterDefine.equals(other$productPropCharacterDefine)) {
            return false;
        }
        List<ProductBarCodeVO> list = this.getProductBarCodes();
        List<ProductBarCodeVO> list2 = other.getProductBarCodes();
        if (this$productBarCodes == null ? other$productBarCodes != null : !this$productBarCodes.equals(other$productBarCodes)) {
            return false;
        }
        List<ProductAssistUnitExchangesVO> list3 = this.getProductAssistUnitExchanges();
        List<ProductAssistUnitExchangesVO> list4 = other.getProductAssistUnitExchanges();
        if (this$productAssistUnitExchanges == null ? other$productAssistUnitExchanges != null : !this$productAssistUnitExchanges.equals(other$productAssistUnitExchanges)) {
            return false;
        }
        ProductDescriptionVO productDescriptionVO = this.getDescription();
        ProductDescriptionVO productDescriptionVO2 = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
            return false;
        }
        List<ProductAttachmentVO> list5 = this.getProductAttachments();
        List<ProductAttachmentVO> list6 = other.getProductAttachments();
        if (this$productAttachments == null ? other$productAttachments != null : !this$productAttachments.equals(other$productAttachments)) {
            return false;
        }
        List<ProductAlbumVO> list7 = this.getProductAlbums();
        List<ProductAlbumVO> list8 = other.getProductAlbums();
        if (this$productAlbums == null ? other$productAlbums != null : !this$productAlbums.equals(other$productAlbums)) {
            return false;
        }
        List<ProductTag> list9 = this.getProductTags();
        List<ProductTag> list10 = other.getProductTags();
        if (this$productTags == null ? other$productTags != null : !this$productTags.equals(other$productTags)) {
            return false;
        }
        List<ProductAssistClassVO> list11 = this.getProductAssistClasses();
        List<ProductAssistClassVO> list12 = other.getProductAssistClasses();
        if (this$productAssistClasses == null ? other$productAssistClasses != null : !this$productAssistClasses.equals(other$productAssistClasses)) {
            return false;
        }
        String string46 = this.getImgBusinessId();
        String string47 = other.getImgBusinessId();
        if (this$imgBusinessId == null ? other$imgBusinessId != null : !this$imgBusinessId.equals(other$imgBusinessId)) {
            return false;
        }
        String string48 = this.getVideoBusinessId();
        String string49 = other.getVideoBusinessId();
        if (this$videoBusinessId == null ? other$videoBusinessId != null : !this$videoBusinessId.equals(other$videoBusinessId)) {
            return false;
        }
        String string50 = this.getHomepageBusinessId();
        String string51 = other.getHomepageBusinessId();
        if (this$homepageBusinessId == null ? other$homepageBusinessId != null : !this$homepageBusinessId.equals(other$homepageBusinessId)) {
            return false;
        }
        String string52 = this.getMaterialStatusId();
        String string53 = other.getMaterialStatusId();
        if (this$materialStatusId == null ? other$materialStatusId != null : !this$materialStatusId.equals(other$materialStatusId)) {
            return false;
        }
        String string54 = this.getMaterialStatusCode();
        String string55 = other.getMaterialStatusCode();
        if (this$materialStatusCode == null ? other$materialStatusCode != null : !this$materialStatusCode.equals(other$materialStatusCode)) {
            return false;
        }
        String string56 = this.getApplyRangeOrgCode();
        String string57 = other.getApplyRangeOrgCode();
        if (this$applyRangeOrgCode == null ? other$applyRangeOrgCode != null : !this$applyRangeOrgCode.equals(other$applyRangeOrgCode)) {
            return false;
        }
        String string58 = this.getApplyRangeOrgId();
        String string59 = other.getApplyRangeOrgId();
        if (this$applyRangeOrgId == null ? other$applyRangeOrgId != null : !this$applyRangeOrgId.equals(other$applyRangeOrgId)) {
            return false;
        }
        String string60 = this.get_ecsuite_temp();
        String string61 = other.get_ecsuite_temp();
        return !(this$_ecsuite_temp == null ? other$_ecsuite_temp != null : !this$_ecsuite_temp.equals(other$_ecsuite_temp));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof ProductApiVO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $productCharacterDefId = this.getProductCharacterDefId();
        result = result * 59 + ($productCharacterDefId == null ? 43 : ((Object)$productCharacterDefId).hashCode());
        Boolean $autoGenerateRangeData = this.getAutoGenerateRangeData();
        result = result * 59 + ($autoGenerateRangeData == null ? 43 : ((Object)$autoGenerateRangeData).hashCode());
        Integer $realProductAttribute = this.getRealProductAttribute();
        result = result * 59 + ($realProductAttribute == null ? 43 : ((Object)$realProductAttribute).hashCode());
        Integer $virtualProductAttribute = this.getVirtualProductAttribute();
        result = result * 59 + ($virtualProductAttribute == null ? 43 : ((Object)$virtualProductAttribute).hashCode());
        Long $giftCardId = this.getGiftCardId();
        result = result * 59 + ($giftCardId == null ? 43 : ((Object)$giftCardId).hashCode());
        Long $couponId = this.getCouponId();
        result = result * 59 + ($couponId == null ? 43 : ((Object)$couponId).hashCode());
        Integer $couponType = this.getCouponType();
        result = result * 59 + ($couponType == null ? 43 : ((Object)$couponType).hashCode());
        Long $productClass = this.getProductClass();
        result = result * 59 + ($productClass == null ? 43 : ((Object)$productClass).hashCode());
        Long $manageClass = this.getManageClass();
        result = result * 59 + ($manageClass == null ? 43 : ((Object)$manageClass).hashCode());
        Long $purchaseClass = this.getPurchaseClass();
        result = result * 59 + ($purchaseClass == null ? 43 : ((Object)$purchaseClass).hashCode());
        Long $costClass = this.getCostClass();
        result = result * 59 + ($costClass == null ? 43 : ((Object)$costClass).hashCode());
        Long $productTemplate = this.getProductTemplate();
        result = result * 59 + ($productTemplate == null ? 43 : ((Object)$productTemplate).hashCode());
        Long $brand = this.getBrand();
        result = result * 59 + ($brand == null ? 43 : ((Object)$brand).hashCode());
        Long $productLine = this.getProductLine();
        result = result * 59 + ($productLine == null ? 43 : ((Object)$productLine).hashCode());
        Integer $customerServiceDay = this.getCustomerServiceDay();
        result = result * 59 + ($customerServiceDay == null ? 43 : ((Object)$customerServiceDay).hashCode());
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        Long $unit = this.getUnit();
        result = result * 59 + ($unit == null ? 43 : ((Object)$unit).hashCode());
        Integer $creatorType = this.getCreatorType();
        result = result * 59 + ($creatorType == null ? 43 : ((Object)$creatorType).hashCode());
        Long $creatorCustomer = this.getCreatorCustomer();
        result = result * 59 + ($creatorCustomer == null ? 43 : ((Object)$creatorCustomer).hashCode());
        Long $shop = this.getShop();
        result = result * 59 + ($shop == null ? 43 : ((Object)$shop).hashCode());
        Integer $platFormStatus = this.getPlatFormStatus();
        result = result * 59 + ($platFormStatus == null ? 43 : ((Object)$platFormStatus).hashCode());
        Integer $source = this.getSource();
        result = result * 59 + ($source == null ? 43 : ((Object)$source).hashCode());
        Boolean $hasSpecs = this.getHasSpecs();
        result = result * 59 + ($hasSpecs == null ? 43 : ((Object)$hasSpecs).hashCode());
        Integer $useSku = this.getUseSku();
        result = result * 59 + ($useSku == null ? 43 : ((Object)$useSku).hashCode());
        Long $defaultSKUId = this.getDefaultSKUId();
        result = result * 59 + ($defaultSKUId == null ? 43 : ((Object)$defaultSKUId).hashCode());
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $tenant = this.getTenant();
        result = result * 59 + ($tenant == null ? 43 : ((Object)$tenant).hashCode());
        Boolean $deleted = this.getDeleted();
        result = result * 59 + ($deleted == null ? 43 : ((Object)$deleted).hashCode());
        Integer $realProductAttributeType = this.getRealProductAttributeType();
        result = result * 59 + ($realProductAttributeType == null ? 43 : ((Object)$realProductAttributeType).hashCode());
        Long $weightUnit = this.getWeightUnit();
        result = result * 59 + ($weightUnit == null ? 43 : ((Object)$weightUnit).hashCode());
        Long $volumeUnit = this.getVolumeUnit();
        result = result * 59 + ($volumeUnit == null ? 43 : ((Object)$volumeUnit).hashCode());
        Integer $unitUseType = this.getUnitUseType();
        result = result * 59 + ($unitUseType == null ? 43 : ((Object)$unitUseType).hashCode());
        Boolean $enableAssistUnit = this.getEnableAssistUnit();
        result = result * 59 + ($enableAssistUnit == null ? 43 : ((Object)$enableAssistUnit).hashCode());
        Long $creatorId = this.getCreatorId();
        result = result * 59 + ($creatorId == null ? 43 : ((Object)$creatorId).hashCode());
        Long $modifierId = this.getModifierId();
        result = result * 59 + ($modifierId == null ? 43 : ((Object)$modifierId).hashCode());
        Long $attachmentGroupId = this.getAttachmentGroupId();
        result = result * 59 + ($attachmentGroupId == null ? 43 : ((Object)$attachmentGroupId).hashCode());
        Boolean $registrationManager = this.getRegistrationManager();
        result = result * 59 + ($registrationManager == null ? 43 : ((Object)$registrationManager).hashCode());
        Boolean $authorizationManager = this.getAuthorizationManager();
        result = result * 59 + ($authorizationManager == null ? 43 : ((Object)$authorizationManager).hashCode());
        Long $sociCoreArchive = this.getSociCoreArchive();
        result = result * 59 + ($sociCoreArchive == null ? 43 : ((Object)$sociCoreArchive).hashCode());
        Long $planClass = this.getPlanClass();
        result = result * 59 + ($planClass == null ? 43 : ((Object)$planClass).hashCode());
        Long $netWeightUnit = this.getNetWeightUnit();
        result = result * 59 + ($netWeightUnit == null ? 43 : ((Object)$netWeightUnit).hashCode());
        Integer $productFamily = this.getProductFamily();
        result = result * 59 + ($productFamily == null ? 43 : ((Object)$productFamily).hashCode());
        Integer $salesAndOperations = this.getSalesAndOperations();
        result = result * 59 + ($salesAndOperations == null ? 43 : ((Object)$salesAndOperations).hashCode());
        Integer $ptoPriceType = this.getPtoPriceType();
        result = result * 59 + ($ptoPriceType == null ? 43 : ((Object)$ptoPriceType).hashCode());
        Integer $logicallyDeleteType = this.getLogicallyDeleteType();
        result = result * 59 + ($logicallyDeleteType == null ? 43 : ((Object)$logicallyDeleteType).hashCode());
        Long $productPropCharacterDefineId = this.getProductPropCharacterDefineId();
        result = result * 59 + ($productPropCharacterDefineId == null ? 43 : ((Object)$productPropCharacterDefineId).hashCode());
        Integer $optionalMaterial = this.getOptionalMaterial();
        result = result * 59 + ($optionalMaterial == null ? 43 : ((Object)$optionalMaterial).hashCode());
        Integer $derivedMaterial = this.getDerivedMaterial();
        result = result * 59 + ($derivedMaterial == null ? 43 : ((Object)$derivedMaterial).hashCode());
        Long $optionalMaterialId = this.getOptionalMaterialId();
        result = result * 59 + ($optionalMaterialId == null ? 43 : ((Object)$optionalMaterialId).hashCode());
        Short $optionalType = this.getOptionalType();
        result = result * 59 + ($optionalType == null ? 43 : ((Object)$optionalType).hashCode());
        ProductDetailVO $detail = this.getDetail();
        result = result * 59 + ($detail == null ? 43 : ((Object)$detail).hashCode());
        List<ProductOrgVo> $productOrges = this.getProductOrges();
        result = result * 59 + ($productOrges == null ? 43 : ((Object)$productOrges).hashCode());
        List<ProductOrgVo> $productCustomers = this.getProductCustomers();
        result = result * 59 + ($productCustomers == null ? 43 : ((Object)$productCustomers).hashCode());
        List<ProductOrgVo> $productShops = this.getProductShops();
        result = result * 59 + ($productShops == null ? 43 : ((Object)$productShops).hashCode());
        Map<String, Object> $productCharacterDef = this.getProductCharacterDef();
        result = result * 59 + ($productCharacterDef == null ? 43 : ((Object)$productCharacterDef).hashCode());
        String $productAttribute = this.getProductAttribute();
        result = result * 59 + ($productAttribute == null ? 43 : $productAttribute.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        MultilingualVO $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        MultilingualVO $modelDescription = this.getModelDescription();
        result = result * 59 + ($modelDescription == null ? 43 : $modelDescription.hashCode());
        MultilingualVO $model = this.getModel();
        result = result * 59 + ($model == null ? 43 : $model.hashCode());
        String $platformCode = this.getPlatformCode();
        result = result * 59 + ($platformCode == null ? 43 : $platformCode.hashCode());
        String $mnemonicCode = this.getMnemonicCode();
        result = result * 59 + ($mnemonicCode == null ? 43 : $mnemonicCode.hashCode());
        MultilingualVO $keywords = this.getKeywords();
        result = result * 59 + ($keywords == null ? 43 : $keywords.hashCode());
        String $productClassCode = this.getProductClassCode();
        result = result * 59 + ($productClassCode == null ? 43 : $productClassCode.hashCode());
        String $productClassName = this.getProductClassName();
        result = result * 59 + ($productClassName == null ? 43 : $productClassName.hashCode());
        String $productClassPath = this.getProductClassPath();
        result = result * 59 + ($productClassPath == null ? 43 : $productClassPath.hashCode());
        String $manageClassCode = this.getManageClassCode();
        result = result * 59 + ($manageClassCode == null ? 43 : $manageClassCode.hashCode());
        String $manageClassName = this.getManageClassName();
        result = result * 59 + ($manageClassName == null ? 43 : $manageClassName.hashCode());
        String $purchaseClassCode = this.getPurchaseClassCode();
        result = result * 59 + ($purchaseClassCode == null ? 43 : $purchaseClassCode.hashCode());
        String $purchaseClassName = this.getPurchaseClassName();
        result = result * 59 + ($purchaseClassName == null ? 43 : $purchaseClassName.hashCode());
        String $costClassCode = this.getCostClassCode();
        result = result * 59 + ($costClassCode == null ? 43 : $costClassCode.hashCode());
        String $costClassName = this.getCostClassName();
        result = result * 59 + ($costClassName == null ? 43 : $costClassName.hashCode());
        String $productTemplateName = this.getProductTemplateName();
        result = result * 59 + ($productTemplateName == null ? 43 : $productTemplateName.hashCode());
        String $brandCode = this.getBrandCode();
        result = result * 59 + ($brandCode == null ? 43 : $brandCode.hashCode());
        String $brandName = this.getBrandName();
        result = result * 59 + ($brandName == null ? 43 : $brandName.hashCode());
        String $placeOfOrigin = this.getPlaceOfOrigin();
        result = result * 59 + ($placeOfOrigin == null ? 43 : $placeOfOrigin.hashCode());
        String $manufacturer = this.getManufacturer();
        result = result * 59 + ($manufacturer == null ? 43 : $manufacturer.hashCode());
        String $productLineCode = this.getProductLineCode();
        result = result * 59 + ($productLineCode == null ? 43 : $productLineCode.hashCode());
        String $productLineName = this.getProductLineName();
        result = result * 59 + ($productLineName == null ? 43 : $productLineName.hashCode());
        MultilingualVO $shareDescription = this.getShareDescription();
        result = result * 59 + ($shareDescription == null ? 43 : $shareDescription.hashCode());
        Date $beUpTime = this.getBeUpTime();
        result = result * 59 + ($beUpTime == null ? 43 : ((Object)$beUpTime).hashCode());
        String $unitCode = this.getUnitCode();
        result = result * 59 + ($unitCode == null ? 43 : $unitCode.hashCode());
        String $unitName = this.getUnitName();
        result = result * 59 + ($unitName == null ? 43 : $unitName.hashCode());
        String $taxClass = this.getTaxClass();
        result = result * 59 + ($taxClass == null ? 43 : $taxClass.hashCode());
        String $taxClassCode = this.getTaxClassCode();
        result = result * 59 + ($taxClassCode == null ? 43 : $taxClassCode.hashCode());
        String $taxClassName = this.getTaxClassName();
        result = result * 59 + ($taxClassName == null ? 43 : $taxClassName.hashCode());
        String $url = this.getUrl();
        result = result * 59 + ($url == null ? 43 : $url.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $orgCode = this.getOrgCode();
        result = result * 59 + ($orgCode == null ? 43 : $orgCode.hashCode());
        String $platFormRemark = this.getPlatFormRemark();
        result = result * 59 + ($platFormRemark == null ? 43 : $platFormRemark.hashCode());
        Date $timestamp = this.getTimestamp();
        result = result * 59 + ($timestamp == null ? 43 : ((Object)$timestamp).hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        Date $createTime = this.getCreateTime();
        result = result * 59 + ($createTime == null ? 43 : ((Object)$createTime).hashCode());
        Date $createDate = this.getCreateDate();
        result = result * 59 + ($createDate == null ? 43 : ((Object)$createDate).hashCode());
        Date $modifyTime = this.getModifyTime();
        result = result * 59 + ($modifyTime == null ? 43 : ((Object)$modifyTime).hashCode());
        Date $modifyDate = this.getModifyDate();
        result = result * 59 + ($modifyDate == null ? 43 : ((Object)$modifyDate).hashCode());
        String $creator = this.getCreator();
        result = result * 59 + ($creator == null ? 43 : $creator.hashCode());
        String $modifier = this.getModifier();
        result = result * 59 + ($modifier == null ? 43 : $modifier.hashCode());
        BigDecimal $weight = this.getWeight();
        result = result * 59 + ($weight == null ? 43 : ((Object)$weight).hashCode());
        String $weightUnitCode = this.getWeightUnitCode();
        result = result * 59 + ($weightUnitCode == null ? 43 : $weightUnitCode.hashCode());
        String $weightUnitName = this.getWeightUnitName();
        result = result * 59 + ($weightUnitName == null ? 43 : $weightUnitName.hashCode());
        BigDecimal $volume = this.getVolume();
        result = result * 59 + ($volume == null ? 43 : ((Object)$volume).hashCode());
        String $volumeUnitCode = this.getVolumeUnitCode();
        result = result * 59 + ($volumeUnitCode == null ? 43 : $volumeUnitCode.hashCode());
        String $volumeUnitName = this.getVolumeUnitName();
        result = result * 59 + ($volumeUnitName == null ? 43 : $volumeUnitName.hashCode());
        String $name1 = this.getName1();
        result = result * 59 + ($name1 == null ? 43 : $name1.hashCode());
        String $name2 = this.getName2();
        result = result * 59 + ($name2 == null ? 43 : $name2.hashCode());
        String $name3 = this.getName3();
        result = result * 59 + ($name3 == null ? 43 : $name3.hashCode());
        String $name4 = this.getName4();
        result = result * 59 + ($name4 == null ? 43 : $name4.hashCode());
        String $name5 = this.getName5();
        result = result * 59 + ($name5 == null ? 43 : $name5.hashCode());
        String $name6 = this.getName6();
        result = result * 59 + ($name6 == null ? 43 : $name6.hashCode());
        String $sharedescription1 = this.getSharedescription1();
        result = result * 59 + ($sharedescription1 == null ? 43 : $sharedescription1.hashCode());
        String $sharedescription2 = this.getSharedescription2();
        result = result * 59 + ($sharedescription2 == null ? 43 : $sharedescription2.hashCode());
        String $sharedescription3 = this.getSharedescription3();
        result = result * 59 + ($sharedescription3 == null ? 43 : $sharedescription3.hashCode());
        String $sharedescription4 = this.getSharedescription4();
        result = result * 59 + ($sharedescription4 == null ? 43 : $sharedescription4.hashCode());
        String $sharedescription5 = this.getSharedescription5();
        result = result * 59 + ($sharedescription5 == null ? 43 : $sharedescription5.hashCode());
        String $sharedescription6 = this.getSharedescription6();
        result = result * 59 + ($sharedescription6 == null ? 43 : $sharedescription6.hashCode());
        String $keywords1 = this.getKeywords1();
        result = result * 59 + ($keywords1 == null ? 43 : $keywords1.hashCode());
        String $keywords2 = this.getKeywords2();
        result = result * 59 + ($keywords2 == null ? 43 : $keywords2.hashCode());
        String $keywords3 = this.getKeywords3();
        result = result * 59 + ($keywords3 == null ? 43 : $keywords3.hashCode());
        String $keywords4 = this.getKeywords4();
        result = result * 59 + ($keywords4 == null ? 43 : $keywords4.hashCode());
        String $keywords5 = this.getKeywords5();
        result = result * 59 + ($keywords5 == null ? 43 : $keywords5.hashCode());
        String $keywords6 = this.getKeywords6();
        result = result * 59 + ($keywords6 == null ? 43 : $keywords6.hashCode());
        String $model1 = this.getModel1();
        result = result * 59 + ($model1 == null ? 43 : $model1.hashCode());
        String $model2 = this.getModel2();
        result = result * 59 + ($model2 == null ? 43 : $model2.hashCode());
        String $model3 = this.getModel3();
        result = result * 59 + ($model3 == null ? 43 : $model3.hashCode());
        String $model4 = this.getModel4();
        result = result * 59 + ($model4 == null ? 43 : $model4.hashCode());
        String $model5 = this.getModel5();
        result = result * 59 + ($model5 == null ? 43 : $model5.hashCode());
        String $model6 = this.getModel6();
        result = result * 59 + ($model6 == null ? 43 : $model6.hashCode());
        String $modeldescription1 = this.getModeldescription1();
        result = result * 59 + ($modeldescription1 == null ? 43 : $modeldescription1.hashCode());
        String $modeldescription2 = this.getModeldescription2();
        result = result * 59 + ($modeldescription2 == null ? 43 : $modeldescription2.hashCode());
        String $modeldescription3 = this.getModeldescription3();
        result = result * 59 + ($modeldescription3 == null ? 43 : $modeldescription3.hashCode());
        String $modeldescription4 = this.getModeldescription4();
        result = result * 59 + ($modeldescription4 == null ? 43 : $modeldescription4.hashCode());
        String $modeldescription5 = this.getModeldescription5();
        result = result * 59 + ($modeldescription5 == null ? 43 : $modeldescription5.hashCode());
        String $modeldescription6 = this.getModeldescription6();
        result = result * 59 + ($modeldescription6 == null ? 43 : $modeldescription6.hashCode());
        String $sunshinePurchaseNo = this.getSunshinePurchaseNo();
        result = result * 59 + ($sunshinePurchaseNo == null ? 43 : $sunshinePurchaseNo.hashCode());
        String $registrationNo = this.getRegistrationNo();
        result = result * 59 + ($registrationNo == null ? 43 : $registrationNo.hashCode());
        BigDecimal $length = this.getLength();
        result = result * 59 + ($length == null ? 43 : ((Object)$length).hashCode());
        BigDecimal $width = this.getWidth();
        result = result * 59 + ($width == null ? 43 : ((Object)$width).hashCode());
        BigDecimal $height = this.getHeight();
        result = result * 59 + ($height == null ? 43 : ((Object)$height).hashCode());
        String $planClassCode = this.getPlanClassCode();
        result = result * 59 + ($planClassCode == null ? 43 : $planClassCode.hashCode());
        String $planClassName = this.getPlanClassName();
        result = result * 59 + ($planClassName == null ? 43 : $planClassName.hashCode());
        String $ytenantId = this.getYtenantId();
        result = result * 59 + ($ytenantId == null ? 43 : $ytenantId.hashCode());
        String $internalSupplyOrgId = this.getInternalSupplyOrgId();
        result = result * 59 + ($internalSupplyOrgId == null ? 43 : $internalSupplyOrgId.hashCode());
        String $internalSupplyOrgCode = this.getInternalSupplyOrgCode();
        result = result * 59 + ($internalSupplyOrgCode == null ? 43 : $internalSupplyOrgCode.hashCode());
        String $internalSupplyOrgName = this.getInternalSupplyOrgName();
        result = result * 59 + ($internalSupplyOrgName == null ? 43 : $internalSupplyOrgName.hashCode());
        BigDecimal $netWeight = this.getNetWeight();
        result = result * 59 + ($netWeight == null ? 43 : ((Object)$netWeight).hashCode());
        String $netWeightUnitCode = this.getNetWeightUnitCode();
        result = result * 59 + ($netWeightUnitCode == null ? 43 : $netWeightUnitCode.hashCode());
        String $netWeightUnitName = this.getNetWeightUnitName();
        result = result * 59 + ($netWeightUnitName == null ? 43 : $netWeightUnitName.hashCode());
        String $transType = this.getTransType();
        result = result * 59 + ($transType == null ? 43 : $transType.hashCode());
        String $transTypeCode = this.getTransTypeCode();
        result = result * 59 + ($transTypeCode == null ? 43 : $transTypeCode.hashCode());
        String $transTypeName = this.getTransTypeName();
        result = result * 59 + ($transTypeName == null ? 43 : $transTypeName.hashCode());
        String $optionalMaterialCode = this.getOptionalMaterialCode();
        result = result * 59 + ($optionalMaterialCode == null ? 43 : $optionalMaterialCode.hashCode());
        String $optionalMaterialName = this.getOptionalMaterialName();
        result = result * 59 + ($optionalMaterialName == null ? 43 : $optionalMaterialName.hashCode());
        Map<String, Object> $productPropCharacterDefine = this.getProductPropCharacterDefine();
        result = result * 59 + ($productPropCharacterDefine == null ? 43 : ((Object)$productPropCharacterDefine).hashCode());
        List<ProductBarCodeVO> $productBarCodes = this.getProductBarCodes();
        result = result * 59 + ($productBarCodes == null ? 43 : ((Object)$productBarCodes).hashCode());
        List<ProductAssistUnitExchangesVO> $productAssistUnitExchanges = this.getProductAssistUnitExchanges();
        result = result * 59 + ($productAssistUnitExchanges == null ? 43 : ((Object)$productAssistUnitExchanges).hashCode());
        ProductDescriptionVO $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : ((Object)$description).hashCode());
        List<ProductAttachmentVO> $productAttachments = this.getProductAttachments();
        result = result * 59 + ($productAttachments == null ? 43 : ((Object)$productAttachments).hashCode());
        List<ProductAlbumVO> $productAlbums = this.getProductAlbums();
        result = result * 59 + ($productAlbums == null ? 43 : ((Object)$productAlbums).hashCode());
        List<ProductTag> $productTags = this.getProductTags();
        result = result * 59 + ($productTags == null ? 43 : ((Object)$productTags).hashCode());
        List<ProductAssistClassVO> $productAssistClasses = this.getProductAssistClasses();
        result = result * 59 + ($productAssistClasses == null ? 43 : ((Object)$productAssistClasses).hashCode());
        String $imgBusinessId = this.getImgBusinessId();
        result = result * 59 + ($imgBusinessId == null ? 43 : $imgBusinessId.hashCode());
        String $videoBusinessId = this.getVideoBusinessId();
        result = result * 59 + ($videoBusinessId == null ? 43 : $videoBusinessId.hashCode());
        String $homepageBusinessId = this.getHomepageBusinessId();
        result = result * 59 + ($homepageBusinessId == null ? 43 : $homepageBusinessId.hashCode());
        String $materialStatusId = this.getMaterialStatusId();
        result = result * 59 + ($materialStatusId == null ? 43 : $materialStatusId.hashCode());
        String $materialStatusCode = this.getMaterialStatusCode();
        result = result * 59 + ($materialStatusCode == null ? 43 : $materialStatusCode.hashCode());
        String $applyRangeOrgCode = this.getApplyRangeOrgCode();
        result = result * 59 + ($applyRangeOrgCode == null ? 43 : $applyRangeOrgCode.hashCode());
        String $applyRangeOrgId = this.getApplyRangeOrgId();
        result = result * 59 + ($applyRangeOrgId == null ? 43 : $applyRangeOrgId.hashCode());
        String $_ecsuite_temp = this.get_ecsuite_temp();
        result = result * 59 + ($_ecsuite_temp == null ? 43 : $_ecsuite_temp.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ProductApiVO(detail=" + this.getDetail() + ", productOrges=" + this.getProductOrges() + ", productCustomers=" + this.getProductCustomers() + ", productShops=" + this.getProductShops() + ", productCharacterDefId=" + this.getProductCharacterDefId() + ", productCharacterDef=" + this.getProductCharacterDef() + ", autoGenerateRangeData=" + this.getAutoGenerateRangeData() + ", realProductAttribute=" + this.getRealProductAttribute() + ", virtualProductAttribute=" + this.getVirtualProductAttribute() + ", giftCardId=" + this.getGiftCardId() + ", couponId=" + this.getCouponId() + ", couponType=" + this.getCouponType() + ", productAttribute=" + this.getProductAttribute() + ", code=" + this.getCode() + ", name=" + this.getName() + ", modelDescription=" + this.getModelDescription() + ", model=" + this.getModel() + ", platformCode=" + this.getPlatformCode() + ", mnemonicCode=" + this.getMnemonicCode() + ", keywords=" + this.getKeywords() + ", productClass=" + this.getProductClass() + ", productClassCode=" + this.getProductClassCode() + ", productClassName=" + this.getProductClassName() + ", productClassPath=" + this.getProductClassPath() + ", manageClass=" + this.getManageClass() + ", manageClassCode=" + this.getManageClassCode() + ", manageClassName=" + this.getManageClassName() + ", purchaseClass=" + this.getPurchaseClass() + ", purchaseClassCode=" + this.getPurchaseClassCode() + ", purchaseClassName=" + this.getPurchaseClassName() + ", costClass=" + this.getCostClass() + ", costClassCode=" + this.getCostClassCode() + ", costClassName=" + this.getCostClassName() + ", productTemplate=" + this.getProductTemplate() + ", productTemplateName=" + this.getProductTemplateName() + ", brand=" + this.getBrand() + ", brandCode=" + this.getBrandCode() + ", brandName=" + this.getBrandName() + ", placeOfOrigin=" + this.getPlaceOfOrigin() + ", manufacturer=" + this.getManufacturer() + ", productLine=" + this.getProductLine() + ", productLineCode=" + this.getProductLineCode() + ", productLineName=" + this.getProductLineName() + ", shareDescription=" + this.getShareDescription() + ", customerServiceDay=" + this.getCustomerServiceDay() + ", beUpTime=" + this.getBeUpTime() + ", order=" + this.getOrder() + ", unit=" + this.getUnit() + ", unitCode=" + this.getUnitCode() + ", unitName=" + this.getUnitName() + ", taxClass=" + this.getTaxClass() + ", taxClassCode=" + this.getTaxClassCode() + ", taxClassName=" + this.getTaxClassName() + ", url=" + this.getUrl() + ", creatorType=" + this.getCreatorType() + ", orgId=" + this.getOrgId() + ", orgCode=" + this.getOrgCode() + ", creatorCustomer=" + this.getCreatorCustomer() + ", shop=" + this.getShop() + ", platFormStatus=" + this.getPlatFormStatus() + ", platFormRemark=" + this.getPlatFormRemark() + ", source=" + this.getSource() + ", hasSpecs=" + this.getHasSpecs() + ", useSku=" + this.getUseSku() + ", defaultSKUId=" + this.getDefaultSKUId() + ", id=" + this.getId() + ", timestamp=" + this.getTimestamp() + ", tenant=" + this.getTenant() + ", erpCode=" + this.getErpCode() + ", deleted=" + this.getDeleted() + ", createTime=" + this.getCreateTime() + ", createDate=" + this.getCreateDate() + ", modifyTime=" + this.getModifyTime() + ", modifyDate=" + this.getModifyDate() + ", creator=" + this.getCreator() + ", modifier=" + this.getModifier() + ", realProductAttributeType=" + this.getRealProductAttributeType() + ", weight=" + this.getWeight() + ", weightUnit=" + this.getWeightUnit() + ", weightUnitCode=" + this.getWeightUnitCode() + ", weightUnitName=" + this.getWeightUnitName() + ", volume=" + this.getVolume() + ", volumeUnit=" + this.getVolumeUnit() + ", volumeUnitCode=" + this.getVolumeUnitCode() + ", volumeUnitName=" + this.getVolumeUnitName() + ", unitUseType=" + this.getUnitUseType() + ", enableAssistUnit=" + this.getEnableAssistUnit() + ", creatorId=" + this.getCreatorId() + ", modifierId=" + this.getModifierId() + ", name1=" + this.getName1() + ", name2=" + this.getName2() + ", name3=" + this.getName3() + ", name4=" + this.getName4() + ", name5=" + this.getName5() + ", name6=" + this.getName6() + ", sharedescription1=" + this.getSharedescription1() + ", sharedescription2=" + this.getSharedescription2() + ", sharedescription3=" + this.getSharedescription3() + ", sharedescription4=" + this.getSharedescription4() + ", sharedescription5=" + this.getSharedescription5() + ", sharedescription6=" + this.getSharedescription6() + ", keywords1=" + this.getKeywords1() + ", keywords2=" + this.getKeywords2() + ", keywords3=" + this.getKeywords3() + ", keywords4=" + this.getKeywords4() + ", keywords5=" + this.getKeywords5() + ", keywords6=" + this.getKeywords6() + ", model1=" + this.getModel1() + ", model2=" + this.getModel2() + ", model3=" + this.getModel3() + ", model4=" + this.getModel4() + ", model5=" + this.getModel5() + ", model6=" + this.getModel6() + ", modeldescription1=" + this.getModeldescription1() + ", modeldescription2=" + this.getModeldescription2() + ", modeldescription3=" + this.getModeldescription3() + ", modeldescription4=" + this.getModeldescription4() + ", modeldescription5=" + this.getModeldescription5() + ", modeldescription6=" + this.getModeldescription6() + ", attachmentGroupId=" + this.getAttachmentGroupId() + ", registrationManager=" + this.getRegistrationManager() + ", authorizationManager=" + this.getAuthorizationManager() + ", sunshinePurchaseNo=" + this.getSunshinePurchaseNo() + ", registrationNo=" + this.getRegistrationNo() + ", length=" + this.getLength() + ", width=" + this.getWidth() + ", height=" + this.getHeight() + ", sociCoreArchive=" + this.getSociCoreArchive() + ", planClass=" + this.getPlanClass() + ", planClassCode=" + this.getPlanClassCode() + ", planClassName=" + this.getPlanClassName() + ", ytenantId=" + this.getYtenantId() + ", internalSupplyOrgId=" + this.getInternalSupplyOrgId() + ", internalSupplyOrgCode=" + this.getInternalSupplyOrgCode() + ", internalSupplyOrgName=" + this.getInternalSupplyOrgName() + ", netWeight=" + this.getNetWeight() + ", netWeightUnit=" + this.getNetWeightUnit() + ", netWeightUnitCode=" + this.getNetWeightUnitCode() + ", netWeightUnitName=" + this.getNetWeightUnitName() + ", transType=" + this.getTransType() + ", transTypeCode=" + this.getTransTypeCode() + ", transTypeName=" + this.getTransTypeName() + ", productFamily=" + this.getProductFamily() + ", salesAndOperations=" + this.getSalesAndOperations() + ", ptoPriceType=" + this.getPtoPriceType() + ", logicallyDeleteType=" + this.getLogicallyDeleteType() + ", productPropCharacterDefineId=" + this.getProductPropCharacterDefineId() + ", optionalMaterial=" + this.getOptionalMaterial() + ", derivedMaterial=" + this.getDerivedMaterial() + ", optionalMaterialId=" + this.getOptionalMaterialId() + ", optionalMaterialCode=" + this.getOptionalMaterialCode() + ", optionalMaterialName=" + this.getOptionalMaterialName() + ", productPropCharacterDefine=" + this.getProductPropCharacterDefine() + ", productBarCodes=" + this.getProductBarCodes() + ", productAssistUnitExchanges=" + this.getProductAssistUnitExchanges() + ", description=" + this.getDescription() + ", productAttachments=" + this.getProductAttachments() + ", productAlbums=" + this.getProductAlbums() + ", productTags=" + this.getProductTags() + ", productAssistClasses=" + this.getProductAssistClasses() + ", imgBusinessId=" + this.getImgBusinessId() + ", videoBusinessId=" + this.getVideoBusinessId() + ", homepageBusinessId=" + this.getHomepageBusinessId() + ", materialStatusId=" + this.getMaterialStatusId() + ", materialStatusCode=" + this.getMaterialStatusCode() + ", optionalType=" + this.getOptionalType() + ", applyRangeOrgCode=" + this.getApplyRangeOrgCode() + ", applyRangeOrgId=" + this.getApplyRangeOrgId() + ", _ecsuite_temp=" + this.get_ecsuite_temp() + ")";
    }
}

