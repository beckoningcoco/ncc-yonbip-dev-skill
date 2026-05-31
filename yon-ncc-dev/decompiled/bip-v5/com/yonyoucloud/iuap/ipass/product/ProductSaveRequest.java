/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.ipass.product.DefaultSKUOrderProperties;
import com.yonyoucloud.iuap.ipass.product.DescriptionIpass;
import com.yonyoucloud.iuap.ipass.product.IpassMultilingual;
import com.yonyoucloud.iuap.ipass.product.PreferredMeterialList;
import com.yonyoucloud.iuap.ipass.product.ProductAlbums;
import com.yonyoucloud.iuap.ipass.product.ProductAssistClasses;
import com.yonyoucloud.iuap.ipass.product.ProductAssistUnitExchanges;
import com.yonyoucloud.iuap.ipass.product.ProductAttachments;
import com.yonyoucloud.iuap.ipass.product.ProductBarCodes;
import com.yonyoucloud.iuap.ipass.product.ProductCheckFrees;
import com.yonyoucloud.iuap.ipass.product.ProductCustomers;
import com.yonyoucloud.iuap.ipass.product.ProductDetailIPass;
import com.yonyoucloud.iuap.ipass.product.ProductIPassTime;
import com.yonyoucloud.iuap.ipass.product.ProductOrgs;
import com.yonyoucloud.iuap.ipass.product.ProductParams;
import com.yonyoucloud.iuap.ipass.product.ProductShops;
import com.yonyoucloud.iuap.ipass.product.ProductSpecFrees;
import com.yonyoucloud.iuap.ipass.product.ProductTags;
import com.yonyoucloud.iuap.ipass.product.Productskus;
import com.yonyoucloud.iuap.ipass.product.Productspecitemalbums;
import com.yonyoucloud.iuap.ipass.product.Productspecitems;
import com.yonyoucloud.iuap.ipass.product.SkuOrderProperties;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductSaveRequest
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String sourceUnique;
    private ProductDetailIPass detail;
    private String orgId;
    private String netWeight;
    private Boolean isRegistrationManager;
    private String attachmentGroupId;
    private String orgId_Code;
    private Boolean isAuthorizationManager;
    private String attachmentGroupId_Name;
    private String orgId_Name;
    private String sunshinePurchaseNo;
    private String registrationNo;
    private String productApplyRange_OrgId;
    private String attachmentGroupItemId_Name;
    private String productApplyRange_OrgId_Name;
    private String defaultSKUId;
    private String id;
    private String pubts;
    private String url;
    private Boolean autoGenerateRangeData_;
    private String code;
    private IpassMultilingual name;
    private IpassMultilingual modelDescription;
    private IpassMultilingual model;
    private String erpCode;
    private String platformCode;
    private String manageClass;
    private String manageClass_Code;
    private String manageClass_Name;
    private String productClass;
    private String productClass_Code;
    private String productClass_Name;
    private String productTemplate;
    private String productTemplate_NameTips;
    private String productTemplate_Name;
    private String productLine;
    private String productLine_Code;
    private String productLine_Name;
    private String brand;
    private String brand_RandKeywords;
    private String brand_Name;
    private String placeOfOrigin;
    private String manufacturer;
    private String platFormStaus;
    private String cPlatFormRemark;
    private DescriptionIpass description;
    private Long realProductAttribute;
    private Long realProductAttributeType;
    private Long virtualProductAttribute;
    private String giftCardId;
    private String giftCardId_Name;
    private String couponId;
    private String couponType;
    private String couponId_Name;
    private Long unitUseType;
    private String unit;
    private String unit_Code;
    private String unit_Name;
    private Boolean enableAssistUnit;
    private BigDecimal weight;
    private String weightUnit;
    private String weightUnit_Name;
    private BigDecimal volume;
    private String volumeUnit;
    private String volumeUnit_Name;
    private String taxClass;
    private String taxClass_Code;
    private String taxClass_Name;
    private Long customerServiceDay;
    private String dimensionCode;
    private IpassMultilingual shareDescription;
    private ProductIPassTime time;
    private IpassMultilingual keywords;
    private String _status;
    private List<ProductSpecFrees> productSpecFrees;
    private List<DefaultSKUOrderProperties> defaultSKUOrderProperties;
    private List<Productskus> productskus;
    private List<SkuOrderProperties> skuOrderProperties;
    private List<ProductAlbums> productAlbums;
    private List<ProductAttachments> productAttachments;
    private List<ProductTags> productTags;
    private List<ProductAssistClasses> productAssistClasses;
    private List<Productspecitems> productspecitems;
    private List<Productspecitemalbums> productspecitemalbums;
    private List<ProductOrgs> productOrgs;
    private List<ProductCustomers> productCustomers;
    private List<ProductShops> productShops;
    private List<ProductParams> productParams;
    private List<ProductCheckFrees> productCheckFrees;
    private List<ProductAssistUnitExchanges> productAssistUnitExchanges;
    private List<ProductBarCodes> productBarCodes;
    private Object productPropCharacterDefine;
    private Object productCharacterDef;
    private List<PreferredMeterialList> PreferredMeterialList;

    public String getSourceUnique() {
        return this.sourceUnique;
    }

    public ProductDetailIPass getDetail() {
        return this.detail;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getNetWeight() {
        return this.netWeight;
    }

    public Boolean getIsRegistrationManager() {
        return this.isRegistrationManager;
    }

    public String getAttachmentGroupId() {
        return this.attachmentGroupId;
    }

    public String getOrgId_Code() {
        return this.orgId_Code;
    }

    public Boolean getIsAuthorizationManager() {
        return this.isAuthorizationManager;
    }

    public String getAttachmentGroupId_Name() {
        return this.attachmentGroupId_Name;
    }

    public String getOrgId_Name() {
        return this.orgId_Name;
    }

    public String getSunshinePurchaseNo() {
        return this.sunshinePurchaseNo;
    }

    public String getRegistrationNo() {
        return this.registrationNo;
    }

    public String getProductApplyRange_OrgId() {
        return this.productApplyRange_OrgId;
    }

    public String getAttachmentGroupItemId_Name() {
        return this.attachmentGroupItemId_Name;
    }

    public String getProductApplyRange_OrgId_Name() {
        return this.productApplyRange_OrgId_Name;
    }

    public String getDefaultSKUId() {
        return this.defaultSKUId;
    }

    public String getId() {
        return this.id;
    }

    public String getPubts() {
        return this.pubts;
    }

    public String getUrl() {
        return this.url;
    }

    public Boolean getAutoGenerateRangeData_() {
        return this.autoGenerateRangeData_;
    }

    public String getCode() {
        return this.code;
    }

    public IpassMultilingual getName() {
        return this.name;
    }

    public IpassMultilingual getModelDescription() {
        return this.modelDescription;
    }

    public IpassMultilingual getModel() {
        return this.model;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public String getPlatformCode() {
        return this.platformCode;
    }

    public String getManageClass() {
        return this.manageClass;
    }

    public String getManageClass_Code() {
        return this.manageClass_Code;
    }

    public String getManageClass_Name() {
        return this.manageClass_Name;
    }

    public String getProductClass() {
        return this.productClass;
    }

    public String getProductClass_Code() {
        return this.productClass_Code;
    }

    public String getProductClass_Name() {
        return this.productClass_Name;
    }

    public String getProductTemplate() {
        return this.productTemplate;
    }

    public String getProductTemplate_NameTips() {
        return this.productTemplate_NameTips;
    }

    public String getProductTemplate_Name() {
        return this.productTemplate_Name;
    }

    public String getProductLine() {
        return this.productLine;
    }

    public String getProductLine_Code() {
        return this.productLine_Code;
    }

    public String getProductLine_Name() {
        return this.productLine_Name;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getBrand_RandKeywords() {
        return this.brand_RandKeywords;
    }

    public String getBrand_Name() {
        return this.brand_Name;
    }

    public String getPlaceOfOrigin() {
        return this.placeOfOrigin;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getPlatFormStaus() {
        return this.platFormStaus;
    }

    public String getCPlatFormRemark() {
        return this.cPlatFormRemark;
    }

    public DescriptionIpass getDescription() {
        return this.description;
    }

    public Long getRealProductAttribute() {
        return this.realProductAttribute;
    }

    public Long getRealProductAttributeType() {
        return this.realProductAttributeType;
    }

    public Long getVirtualProductAttribute() {
        return this.virtualProductAttribute;
    }

    public String getGiftCardId() {
        return this.giftCardId;
    }

    public String getGiftCardId_Name() {
        return this.giftCardId_Name;
    }

    public String getCouponId() {
        return this.couponId;
    }

    public String getCouponType() {
        return this.couponType;
    }

    public String getCouponId_Name() {
        return this.couponId_Name;
    }

    public Long getUnitUseType() {
        return this.unitUseType;
    }

    public String getUnit() {
        return this.unit;
    }

    public String getUnit_Code() {
        return this.unit_Code;
    }

    public String getUnit_Name() {
        return this.unit_Name;
    }

    public Boolean getEnableAssistUnit() {
        return this.enableAssistUnit;
    }

    public BigDecimal getWeight() {
        return this.weight;
    }

    public String getWeightUnit() {
        return this.weightUnit;
    }

    public String getWeightUnit_Name() {
        return this.weightUnit_Name;
    }

    public BigDecimal getVolume() {
        return this.volume;
    }

    public String getVolumeUnit() {
        return this.volumeUnit;
    }

    public String getVolumeUnit_Name() {
        return this.volumeUnit_Name;
    }

    public String getTaxClass() {
        return this.taxClass;
    }

    public String getTaxClass_Code() {
        return this.taxClass_Code;
    }

    public String getTaxClass_Name() {
        return this.taxClass_Name;
    }

    public Long getCustomerServiceDay() {
        return this.customerServiceDay;
    }

    public String getDimensionCode() {
        return this.dimensionCode;
    }

    public IpassMultilingual getShareDescription() {
        return this.shareDescription;
    }

    public ProductIPassTime getTime() {
        return this.time;
    }

    public IpassMultilingual getKeywords() {
        return this.keywords;
    }

    public String get_status() {
        return this._status;
    }

    public List<ProductSpecFrees> getProductSpecFrees() {
        return this.productSpecFrees;
    }

    public List<DefaultSKUOrderProperties> getDefaultSKUOrderProperties() {
        return this.defaultSKUOrderProperties;
    }

    public List<Productskus> getProductskus() {
        return this.productskus;
    }

    public List<SkuOrderProperties> getSkuOrderProperties() {
        return this.skuOrderProperties;
    }

    public List<ProductAlbums> getProductAlbums() {
        return this.productAlbums;
    }

    public List<ProductAttachments> getProductAttachments() {
        return this.productAttachments;
    }

    public List<ProductTags> getProductTags() {
        return this.productTags;
    }

    public List<ProductAssistClasses> getProductAssistClasses() {
        return this.productAssistClasses;
    }

    public List<Productspecitems> getProductspecitems() {
        return this.productspecitems;
    }

    public List<Productspecitemalbums> getProductspecitemalbums() {
        return this.productspecitemalbums;
    }

    public List<ProductOrgs> getProductOrgs() {
        return this.productOrgs;
    }

    public List<ProductCustomers> getProductCustomers() {
        return this.productCustomers;
    }

    public List<ProductShops> getProductShops() {
        return this.productShops;
    }

    public List<ProductParams> getProductParams() {
        return this.productParams;
    }

    public List<ProductCheckFrees> getProductCheckFrees() {
        return this.productCheckFrees;
    }

    public List<ProductAssistUnitExchanges> getProductAssistUnitExchanges() {
        return this.productAssistUnitExchanges;
    }

    public List<ProductBarCodes> getProductBarCodes() {
        return this.productBarCodes;
    }

    public Object getProductPropCharacterDefine() {
        return this.productPropCharacterDefine;
    }

    public Object getProductCharacterDef() {
        return this.productCharacterDef;
    }

    public List<PreferredMeterialList> getPreferredMeterialList() {
        return this.PreferredMeterialList;
    }

    public void setSourceUnique(String sourceUnique) {
        this.sourceUnique = sourceUnique;
    }

    public void setDetail(ProductDetailIPass detail) {
        this.detail = detail;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setNetWeight(String netWeight) {
        this.netWeight = netWeight;
    }

    public void setIsRegistrationManager(Boolean isRegistrationManager) {
        this.isRegistrationManager = isRegistrationManager;
    }

    public void setAttachmentGroupId(String attachmentGroupId) {
        this.attachmentGroupId = attachmentGroupId;
    }

    public void setOrgId_Code(String orgId_Code) {
        this.orgId_Code = orgId_Code;
    }

    public void setIsAuthorizationManager(Boolean isAuthorizationManager) {
        this.isAuthorizationManager = isAuthorizationManager;
    }

    public void setAttachmentGroupId_Name(String attachmentGroupId_Name) {
        this.attachmentGroupId_Name = attachmentGroupId_Name;
    }

    public void setOrgId_Name(String orgId_Name) {
        this.orgId_Name = orgId_Name;
    }

    public void setSunshinePurchaseNo(String sunshinePurchaseNo) {
        this.sunshinePurchaseNo = sunshinePurchaseNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public void setProductApplyRange_OrgId(String productApplyRange_OrgId) {
        this.productApplyRange_OrgId = productApplyRange_OrgId;
    }

    public void setAttachmentGroupItemId_Name(String attachmentGroupItemId_Name) {
        this.attachmentGroupItemId_Name = attachmentGroupItemId_Name;
    }

    public void setProductApplyRange_OrgId_Name(String productApplyRange_OrgId_Name) {
        this.productApplyRange_OrgId_Name = productApplyRange_OrgId_Name;
    }

    public void setDefaultSKUId(String defaultSKUId) {
        this.defaultSKUId = defaultSKUId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setAutoGenerateRangeData_(Boolean autoGenerateRangeData_) {
        this.autoGenerateRangeData_ = autoGenerateRangeData_;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(IpassMultilingual name) {
        this.name = name;
    }

    public void setModelDescription(IpassMultilingual modelDescription) {
        this.modelDescription = modelDescription;
    }

    public void setModel(IpassMultilingual model) {
        this.model = model;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    public void setManageClass(String manageClass) {
        this.manageClass = manageClass;
    }

    public void setManageClass_Code(String manageClass_Code) {
        this.manageClass_Code = manageClass_Code;
    }

    public void setManageClass_Name(String manageClass_Name) {
        this.manageClass_Name = manageClass_Name;
    }

    public void setProductClass(String productClass) {
        this.productClass = productClass;
    }

    public void setProductClass_Code(String productClass_Code) {
        this.productClass_Code = productClass_Code;
    }

    public void setProductClass_Name(String productClass_Name) {
        this.productClass_Name = productClass_Name;
    }

    public void setProductTemplate(String productTemplate) {
        this.productTemplate = productTemplate;
    }

    public void setProductTemplate_NameTips(String productTemplate_NameTips) {
        this.productTemplate_NameTips = productTemplate_NameTips;
    }

    public void setProductTemplate_Name(String productTemplate_Name) {
        this.productTemplate_Name = productTemplate_Name;
    }

    public void setProductLine(String productLine) {
        this.productLine = productLine;
    }

    public void setProductLine_Code(String productLine_Code) {
        this.productLine_Code = productLine_Code;
    }

    public void setProductLine_Name(String productLine_Name) {
        this.productLine_Name = productLine_Name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBrand_RandKeywords(String brand_RandKeywords) {
        this.brand_RandKeywords = brand_RandKeywords;
    }

    public void setBrand_Name(String brand_Name) {
        this.brand_Name = brand_Name;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPlatFormStaus(String platFormStaus) {
        this.platFormStaus = platFormStaus;
    }

    public void setCPlatFormRemark(String cPlatFormRemark) {
        this.cPlatFormRemark = cPlatFormRemark;
    }

    public void setDescription(DescriptionIpass description) {
        this.description = description;
    }

    public void setRealProductAttribute(Long realProductAttribute) {
        this.realProductAttribute = realProductAttribute;
    }

    public void setRealProductAttributeType(Long realProductAttributeType) {
        this.realProductAttributeType = realProductAttributeType;
    }

    public void setVirtualProductAttribute(Long virtualProductAttribute) {
        this.virtualProductAttribute = virtualProductAttribute;
    }

    public void setGiftCardId(String giftCardId) {
        this.giftCardId = giftCardId;
    }

    public void setGiftCardId_Name(String giftCardId_Name) {
        this.giftCardId_Name = giftCardId_Name;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public void setCouponId_Name(String couponId_Name) {
        this.couponId_Name = couponId_Name;
    }

    public void setUnitUseType(Long unitUseType) {
        this.unitUseType = unitUseType;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setUnit_Code(String unit_Code) {
        this.unit_Code = unit_Code;
    }

    public void setUnit_Name(String unit_Name) {
        this.unit_Name = unit_Name;
    }

    public void setEnableAssistUnit(Boolean enableAssistUnit) {
        this.enableAssistUnit = enableAssistUnit;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public void setWeightUnit_Name(String weightUnit_Name) {
        this.weightUnit_Name = weightUnit_Name;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public void setVolumeUnit(String volumeUnit) {
        this.volumeUnit = volumeUnit;
    }

    public void setVolumeUnit_Name(String volumeUnit_Name) {
        this.volumeUnit_Name = volumeUnit_Name;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    public void setTaxClass_Code(String taxClass_Code) {
        this.taxClass_Code = taxClass_Code;
    }

    public void setTaxClass_Name(String taxClass_Name) {
        this.taxClass_Name = taxClass_Name;
    }

    public void setCustomerServiceDay(Long customerServiceDay) {
        this.customerServiceDay = customerServiceDay;
    }

    public void setDimensionCode(String dimensionCode) {
        this.dimensionCode = dimensionCode;
    }

    public void setShareDescription(IpassMultilingual shareDescription) {
        this.shareDescription = shareDescription;
    }

    public void setTime(ProductIPassTime time) {
        this.time = time;
    }

    public void setKeywords(IpassMultilingual keywords) {
        this.keywords = keywords;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public void setProductSpecFrees(List<ProductSpecFrees> productSpecFrees) {
        this.productSpecFrees = productSpecFrees;
    }

    public void setDefaultSKUOrderProperties(List<DefaultSKUOrderProperties> defaultSKUOrderProperties) {
        this.defaultSKUOrderProperties = defaultSKUOrderProperties;
    }

    public void setProductskus(List<Productskus> productskus) {
        this.productskus = productskus;
    }

    public void setSkuOrderProperties(List<SkuOrderProperties> skuOrderProperties) {
        this.skuOrderProperties = skuOrderProperties;
    }

    public void setProductAlbums(List<ProductAlbums> productAlbums) {
        this.productAlbums = productAlbums;
    }

    public void setProductAttachments(List<ProductAttachments> productAttachments) {
        this.productAttachments = productAttachments;
    }

    public void setProductTags(List<ProductTags> productTags) {
        this.productTags = productTags;
    }

    public void setProductAssistClasses(List<ProductAssistClasses> productAssistClasses) {
        this.productAssistClasses = productAssistClasses;
    }

    public void setProductspecitems(List<Productspecitems> productspecitems) {
        this.productspecitems = productspecitems;
    }

    public void setProductspecitemalbums(List<Productspecitemalbums> productspecitemalbums) {
        this.productspecitemalbums = productspecitemalbums;
    }

    public void setProductOrgs(List<ProductOrgs> productOrgs) {
        this.productOrgs = productOrgs;
    }

    public void setProductCustomers(List<ProductCustomers> productCustomers) {
        this.productCustomers = productCustomers;
    }

    public void setProductShops(List<ProductShops> productShops) {
        this.productShops = productShops;
    }

    public void setProductParams(List<ProductParams> productParams) {
        this.productParams = productParams;
    }

    public void setProductCheckFrees(List<ProductCheckFrees> productCheckFrees) {
        this.productCheckFrees = productCheckFrees;
    }

    public void setProductAssistUnitExchanges(List<ProductAssistUnitExchanges> productAssistUnitExchanges) {
        this.productAssistUnitExchanges = productAssistUnitExchanges;
    }

    public void setProductBarCodes(List<ProductBarCodes> productBarCodes) {
        this.productBarCodes = productBarCodes;
    }

    public void setProductPropCharacterDefine(Object productPropCharacterDefine) {
        this.productPropCharacterDefine = productPropCharacterDefine;
    }

    public void setProductCharacterDef(Object productCharacterDef) {
        this.productCharacterDef = productCharacterDef;
    }

    public void setPreferredMeterialList(List<PreferredMeterialList> PreferredMeterialList2) {
        this.PreferredMeterialList = PreferredMeterialList2;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductSaveRequest)) {
            return false;
        }
        ProductSaveRequest other = (ProductSaveRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$isRegistrationManager = this.getIsRegistrationManager();
        Boolean other$isRegistrationManager = other.getIsRegistrationManager();
        if (this$isRegistrationManager == null ? other$isRegistrationManager != null : !((Object)this$isRegistrationManager).equals(other$isRegistrationManager)) {
            return false;
        }
        Boolean this$isAuthorizationManager = this.getIsAuthorizationManager();
        Boolean other$isAuthorizationManager = other.getIsAuthorizationManager();
        if (this$isAuthorizationManager == null ? other$isAuthorizationManager != null : !((Object)this$isAuthorizationManager).equals(other$isAuthorizationManager)) {
            return false;
        }
        Boolean this$autoGenerateRangeData_ = this.getAutoGenerateRangeData_();
        Boolean other$autoGenerateRangeData_ = other.getAutoGenerateRangeData_();
        if (this$autoGenerateRangeData_ == null ? other$autoGenerateRangeData_ != null : !((Object)this$autoGenerateRangeData_).equals(other$autoGenerateRangeData_)) {
            return false;
        }
        Long this$realProductAttribute = this.getRealProductAttribute();
        Long other$realProductAttribute = other.getRealProductAttribute();
        if (this$realProductAttribute == null ? other$realProductAttribute != null : !((Object)this$realProductAttribute).equals(other$realProductAttribute)) {
            return false;
        }
        Long this$realProductAttributeType = this.getRealProductAttributeType();
        Long other$realProductAttributeType = other.getRealProductAttributeType();
        if (this$realProductAttributeType == null ? other$realProductAttributeType != null : !((Object)this$realProductAttributeType).equals(other$realProductAttributeType)) {
            return false;
        }
        Long this$virtualProductAttribute = this.getVirtualProductAttribute();
        Long other$virtualProductAttribute = other.getVirtualProductAttribute();
        if (this$virtualProductAttribute == null ? other$virtualProductAttribute != null : !((Object)this$virtualProductAttribute).equals(other$virtualProductAttribute)) {
            return false;
        }
        Long this$unitUseType = this.getUnitUseType();
        Long other$unitUseType = other.getUnitUseType();
        if (this$unitUseType == null ? other$unitUseType != null : !((Object)this$unitUseType).equals(other$unitUseType)) {
            return false;
        }
        Boolean this$enableAssistUnit = this.getEnableAssistUnit();
        Boolean other$enableAssistUnit = other.getEnableAssistUnit();
        if (this$enableAssistUnit == null ? other$enableAssistUnit != null : !((Object)this$enableAssistUnit).equals(other$enableAssistUnit)) {
            return false;
        }
        Long this$customerServiceDay = this.getCustomerServiceDay();
        Long other$customerServiceDay = other.getCustomerServiceDay();
        if (this$customerServiceDay == null ? other$customerServiceDay != null : !((Object)this$customerServiceDay).equals(other$customerServiceDay)) {
            return false;
        }
        String this$sourceUnique = this.getSourceUnique();
        String other$sourceUnique = other.getSourceUnique();
        if (this$sourceUnique == null ? other$sourceUnique != null : !this$sourceUnique.equals(other$sourceUnique)) {
            return false;
        }
        ProductDetailIPass this$detail = this.getDetail();
        ProductDetailIPass other$detail = other.getDetail();
        if (this$detail == null ? other$detail != null : !((Object)this$detail).equals(other$detail)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$netWeight = this.getNetWeight();
        String other$netWeight = other.getNetWeight();
        if (this$netWeight == null ? other$netWeight != null : !this$netWeight.equals(other$netWeight)) {
            return false;
        }
        String this$attachmentGroupId = this.getAttachmentGroupId();
        String other$attachmentGroupId = other.getAttachmentGroupId();
        if (this$attachmentGroupId == null ? other$attachmentGroupId != null : !this$attachmentGroupId.equals(other$attachmentGroupId)) {
            return false;
        }
        String this$orgId_Code = this.getOrgId_Code();
        String other$orgId_Code = other.getOrgId_Code();
        if (this$orgId_Code == null ? other$orgId_Code != null : !this$orgId_Code.equals(other$orgId_Code)) {
            return false;
        }
        String this$attachmentGroupId_Name = this.getAttachmentGroupId_Name();
        String other$attachmentGroupId_Name = other.getAttachmentGroupId_Name();
        if (this$attachmentGroupId_Name == null ? other$attachmentGroupId_Name != null : !this$attachmentGroupId_Name.equals(other$attachmentGroupId_Name)) {
            return false;
        }
        String this$orgId_Name = this.getOrgId_Name();
        String other$orgId_Name = other.getOrgId_Name();
        if (this$orgId_Name == null ? other$orgId_Name != null : !this$orgId_Name.equals(other$orgId_Name)) {
            return false;
        }
        String this$sunshinePurchaseNo = this.getSunshinePurchaseNo();
        String other$sunshinePurchaseNo = other.getSunshinePurchaseNo();
        if (this$sunshinePurchaseNo == null ? other$sunshinePurchaseNo != null : !this$sunshinePurchaseNo.equals(other$sunshinePurchaseNo)) {
            return false;
        }
        String this$registrationNo = this.getRegistrationNo();
        String other$registrationNo = other.getRegistrationNo();
        if (this$registrationNo == null ? other$registrationNo != null : !this$registrationNo.equals(other$registrationNo)) {
            return false;
        }
        String this$productApplyRange_OrgId = this.getProductApplyRange_OrgId();
        String other$productApplyRange_OrgId = other.getProductApplyRange_OrgId();
        if (this$productApplyRange_OrgId == null ? other$productApplyRange_OrgId != null : !this$productApplyRange_OrgId.equals(other$productApplyRange_OrgId)) {
            return false;
        }
        String this$attachmentGroupItemId_Name = this.getAttachmentGroupItemId_Name();
        String other$attachmentGroupItemId_Name = other.getAttachmentGroupItemId_Name();
        if (this$attachmentGroupItemId_Name == null ? other$attachmentGroupItemId_Name != null : !this$attachmentGroupItemId_Name.equals(other$attachmentGroupItemId_Name)) {
            return false;
        }
        String this$productApplyRange_OrgId_Name = this.getProductApplyRange_OrgId_Name();
        String other$productApplyRange_OrgId_Name = other.getProductApplyRange_OrgId_Name();
        if (this$productApplyRange_OrgId_Name == null ? other$productApplyRange_OrgId_Name != null : !this$productApplyRange_OrgId_Name.equals(other$productApplyRange_OrgId_Name)) {
            return false;
        }
        String this$defaultSKUId = this.getDefaultSKUId();
        String other$defaultSKUId = other.getDefaultSKUId();
        if (this$defaultSKUId == null ? other$defaultSKUId != null : !this$defaultSKUId.equals(other$defaultSKUId)) {
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
        String this$url = this.getUrl();
        String other$url = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        IpassMultilingual this$name = this.getName();
        IpassMultilingual other$name = other.getName();
        if (this$name == null ? other$name != null : !((Object)this$name).equals(other$name)) {
            return false;
        }
        IpassMultilingual this$modelDescription = this.getModelDescription();
        IpassMultilingual other$modelDescription = other.getModelDescription();
        if (this$modelDescription == null ? other$modelDescription != null : !((Object)this$modelDescription).equals(other$modelDescription)) {
            return false;
        }
        IpassMultilingual this$model = this.getModel();
        IpassMultilingual other$model = other.getModel();
        if (this$model == null ? other$model != null : !((Object)this$model).equals(other$model)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        String this$platformCode = this.getPlatformCode();
        String other$platformCode = other.getPlatformCode();
        if (this$platformCode == null ? other$platformCode != null : !this$platformCode.equals(other$platformCode)) {
            return false;
        }
        String this$manageClass = this.getManageClass();
        String other$manageClass = other.getManageClass();
        if (this$manageClass == null ? other$manageClass != null : !this$manageClass.equals(other$manageClass)) {
            return false;
        }
        String this$manageClass_Code = this.getManageClass_Code();
        String other$manageClass_Code = other.getManageClass_Code();
        if (this$manageClass_Code == null ? other$manageClass_Code != null : !this$manageClass_Code.equals(other$manageClass_Code)) {
            return false;
        }
        String this$manageClass_Name = this.getManageClass_Name();
        String other$manageClass_Name = other.getManageClass_Name();
        if (this$manageClass_Name == null ? other$manageClass_Name != null : !this$manageClass_Name.equals(other$manageClass_Name)) {
            return false;
        }
        String this$productClass = this.getProductClass();
        String other$productClass = other.getProductClass();
        if (this$productClass == null ? other$productClass != null : !this$productClass.equals(other$productClass)) {
            return false;
        }
        String this$productClass_Code = this.getProductClass_Code();
        String other$productClass_Code = other.getProductClass_Code();
        if (this$productClass_Code == null ? other$productClass_Code != null : !this$productClass_Code.equals(other$productClass_Code)) {
            return false;
        }
        String this$productClass_Name = this.getProductClass_Name();
        String other$productClass_Name = other.getProductClass_Name();
        if (this$productClass_Name == null ? other$productClass_Name != null : !this$productClass_Name.equals(other$productClass_Name)) {
            return false;
        }
        String this$productTemplate = this.getProductTemplate();
        String other$productTemplate = other.getProductTemplate();
        if (this$productTemplate == null ? other$productTemplate != null : !this$productTemplate.equals(other$productTemplate)) {
            return false;
        }
        String this$productTemplate_NameTips = this.getProductTemplate_NameTips();
        String other$productTemplate_NameTips = other.getProductTemplate_NameTips();
        if (this$productTemplate_NameTips == null ? other$productTemplate_NameTips != null : !this$productTemplate_NameTips.equals(other$productTemplate_NameTips)) {
            return false;
        }
        String this$productTemplate_Name = this.getProductTemplate_Name();
        String other$productTemplate_Name = other.getProductTemplate_Name();
        if (this$productTemplate_Name == null ? other$productTemplate_Name != null : !this$productTemplate_Name.equals(other$productTemplate_Name)) {
            return false;
        }
        String this$productLine = this.getProductLine();
        String other$productLine = other.getProductLine();
        if (this$productLine == null ? other$productLine != null : !this$productLine.equals(other$productLine)) {
            return false;
        }
        String this$productLine_Code = this.getProductLine_Code();
        String other$productLine_Code = other.getProductLine_Code();
        if (this$productLine_Code == null ? other$productLine_Code != null : !this$productLine_Code.equals(other$productLine_Code)) {
            return false;
        }
        String this$productLine_Name = this.getProductLine_Name();
        String other$productLine_Name = other.getProductLine_Name();
        if (this$productLine_Name == null ? other$productLine_Name != null : !this$productLine_Name.equals(other$productLine_Name)) {
            return false;
        }
        String this$brand = this.getBrand();
        String other$brand = other.getBrand();
        if (this$brand == null ? other$brand != null : !this$brand.equals(other$brand)) {
            return false;
        }
        String this$brand_RandKeywords = this.getBrand_RandKeywords();
        String other$brand_RandKeywords = other.getBrand_RandKeywords();
        if (this$brand_RandKeywords == null ? other$brand_RandKeywords != null : !this$brand_RandKeywords.equals(other$brand_RandKeywords)) {
            return false;
        }
        String this$brand_Name = this.getBrand_Name();
        String other$brand_Name = other.getBrand_Name();
        if (this$brand_Name == null ? other$brand_Name != null : !this$brand_Name.equals(other$brand_Name)) {
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
        String this$platFormStaus = this.getPlatFormStaus();
        String other$platFormStaus = other.getPlatFormStaus();
        if (this$platFormStaus == null ? other$platFormStaus != null : !this$platFormStaus.equals(other$platFormStaus)) {
            return false;
        }
        String this$cPlatFormRemark = this.getCPlatFormRemark();
        String other$cPlatFormRemark = other.getCPlatFormRemark();
        if (this$cPlatFormRemark == null ? other$cPlatFormRemark != null : !this$cPlatFormRemark.equals(other$cPlatFormRemark)) {
            return false;
        }
        DescriptionIpass this$description = this.getDescription();
        DescriptionIpass other$description = other.getDescription();
        if (this$description == null ? other$description != null : !((Object)this$description).equals(other$description)) {
            return false;
        }
        String this$giftCardId = this.getGiftCardId();
        String other$giftCardId = other.getGiftCardId();
        if (this$giftCardId == null ? other$giftCardId != null : !this$giftCardId.equals(other$giftCardId)) {
            return false;
        }
        String this$giftCardId_Name = this.getGiftCardId_Name();
        String other$giftCardId_Name = other.getGiftCardId_Name();
        if (this$giftCardId_Name == null ? other$giftCardId_Name != null : !this$giftCardId_Name.equals(other$giftCardId_Name)) {
            return false;
        }
        String this$couponId = this.getCouponId();
        String other$couponId = other.getCouponId();
        if (this$couponId == null ? other$couponId != null : !this$couponId.equals(other$couponId)) {
            return false;
        }
        String this$couponType = this.getCouponType();
        String other$couponType = other.getCouponType();
        if (this$couponType == null ? other$couponType != null : !this$couponType.equals(other$couponType)) {
            return false;
        }
        String this$couponId_Name = this.getCouponId_Name();
        String other$couponId_Name = other.getCouponId_Name();
        if (this$couponId_Name == null ? other$couponId_Name != null : !this$couponId_Name.equals(other$couponId_Name)) {
            return false;
        }
        String this$unit = this.getUnit();
        String other$unit = other.getUnit();
        if (this$unit == null ? other$unit != null : !this$unit.equals(other$unit)) {
            return false;
        }
        String this$unit_Code = this.getUnit_Code();
        String other$unit_Code = other.getUnit_Code();
        if (this$unit_Code == null ? other$unit_Code != null : !this$unit_Code.equals(other$unit_Code)) {
            return false;
        }
        String this$unit_Name = this.getUnit_Name();
        String other$unit_Name = other.getUnit_Name();
        if (this$unit_Name == null ? other$unit_Name != null : !this$unit_Name.equals(other$unit_Name)) {
            return false;
        }
        BigDecimal this$weight = this.getWeight();
        BigDecimal other$weight = other.getWeight();
        if (this$weight == null ? other$weight != null : !((Object)this$weight).equals(other$weight)) {
            return false;
        }
        String this$weightUnit = this.getWeightUnit();
        String other$weightUnit = other.getWeightUnit();
        if (this$weightUnit == null ? other$weightUnit != null : !this$weightUnit.equals(other$weightUnit)) {
            return false;
        }
        String this$weightUnit_Name = this.getWeightUnit_Name();
        String other$weightUnit_Name = other.getWeightUnit_Name();
        if (this$weightUnit_Name == null ? other$weightUnit_Name != null : !this$weightUnit_Name.equals(other$weightUnit_Name)) {
            return false;
        }
        BigDecimal this$volume = this.getVolume();
        BigDecimal other$volume = other.getVolume();
        if (this$volume == null ? other$volume != null : !((Object)this$volume).equals(other$volume)) {
            return false;
        }
        String this$volumeUnit = this.getVolumeUnit();
        String other$volumeUnit = other.getVolumeUnit();
        if (this$volumeUnit == null ? other$volumeUnit != null : !this$volumeUnit.equals(other$volumeUnit)) {
            return false;
        }
        String this$volumeUnit_Name = this.getVolumeUnit_Name();
        String other$volumeUnit_Name = other.getVolumeUnit_Name();
        if (this$volumeUnit_Name == null ? other$volumeUnit_Name != null : !this$volumeUnit_Name.equals(other$volumeUnit_Name)) {
            return false;
        }
        String this$taxClass = this.getTaxClass();
        String other$taxClass = other.getTaxClass();
        if (this$taxClass == null ? other$taxClass != null : !this$taxClass.equals(other$taxClass)) {
            return false;
        }
        String this$taxClass_Code = this.getTaxClass_Code();
        String other$taxClass_Code = other.getTaxClass_Code();
        if (this$taxClass_Code == null ? other$taxClass_Code != null : !this$taxClass_Code.equals(other$taxClass_Code)) {
            return false;
        }
        String this$taxClass_Name = this.getTaxClass_Name();
        String other$taxClass_Name = other.getTaxClass_Name();
        if (this$taxClass_Name == null ? other$taxClass_Name != null : !this$taxClass_Name.equals(other$taxClass_Name)) {
            return false;
        }
        String this$dimensionCode = this.getDimensionCode();
        String other$dimensionCode = other.getDimensionCode();
        if (this$dimensionCode == null ? other$dimensionCode != null : !this$dimensionCode.equals(other$dimensionCode)) {
            return false;
        }
        IpassMultilingual this$shareDescription = this.getShareDescription();
        IpassMultilingual other$shareDescription = other.getShareDescription();
        if (this$shareDescription == null ? other$shareDescription != null : !((Object)this$shareDescription).equals(other$shareDescription)) {
            return false;
        }
        ProductIPassTime this$time = this.getTime();
        ProductIPassTime other$time = other.getTime();
        if (this$time == null ? other$time != null : !((Object)this$time).equals(other$time)) {
            return false;
        }
        IpassMultilingual this$keywords = this.getKeywords();
        IpassMultilingual other$keywords = other.getKeywords();
        if (this$keywords == null ? other$keywords != null : !((Object)this$keywords).equals(other$keywords)) {
            return false;
        }
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        if (this$_status == null ? other$_status != null : !this$_status.equals(other$_status)) {
            return false;
        }
        List<ProductSpecFrees> this$productSpecFrees = this.getProductSpecFrees();
        List<ProductSpecFrees> other$productSpecFrees = other.getProductSpecFrees();
        if (this$productSpecFrees == null ? other$productSpecFrees != null : !((Object)this$productSpecFrees).equals(other$productSpecFrees)) {
            return false;
        }
        List<DefaultSKUOrderProperties> this$defaultSKUOrderProperties = this.getDefaultSKUOrderProperties();
        List<DefaultSKUOrderProperties> other$defaultSKUOrderProperties = other.getDefaultSKUOrderProperties();
        if (this$defaultSKUOrderProperties == null ? other$defaultSKUOrderProperties != null : !((Object)this$defaultSKUOrderProperties).equals(other$defaultSKUOrderProperties)) {
            return false;
        }
        List<Productskus> this$productskus = this.getProductskus();
        List<Productskus> other$productskus = other.getProductskus();
        if (this$productskus == null ? other$productskus != null : !((Object)this$productskus).equals(other$productskus)) {
            return false;
        }
        List<SkuOrderProperties> this$skuOrderProperties = this.getSkuOrderProperties();
        List<SkuOrderProperties> other$skuOrderProperties = other.getSkuOrderProperties();
        if (this$skuOrderProperties == null ? other$skuOrderProperties != null : !((Object)this$skuOrderProperties).equals(other$skuOrderProperties)) {
            return false;
        }
        List<ProductAlbums> this$productAlbums = this.getProductAlbums();
        List<ProductAlbums> other$productAlbums = other.getProductAlbums();
        if (this$productAlbums == null ? other$productAlbums != null : !((Object)this$productAlbums).equals(other$productAlbums)) {
            return false;
        }
        List<ProductAttachments> this$productAttachments = this.getProductAttachments();
        List<ProductAttachments> other$productAttachments = other.getProductAttachments();
        if (this$productAttachments == null ? other$productAttachments != null : !((Object)this$productAttachments).equals(other$productAttachments)) {
            return false;
        }
        List<ProductTags> this$productTags = this.getProductTags();
        List<ProductTags> other$productTags = other.getProductTags();
        if (this$productTags == null ? other$productTags != null : !((Object)this$productTags).equals(other$productTags)) {
            return false;
        }
        List<ProductAssistClasses> this$productAssistClasses = this.getProductAssistClasses();
        List<ProductAssistClasses> other$productAssistClasses = other.getProductAssistClasses();
        if (this$productAssistClasses == null ? other$productAssistClasses != null : !((Object)this$productAssistClasses).equals(other$productAssistClasses)) {
            return false;
        }
        List<Productspecitems> this$productspecitems = this.getProductspecitems();
        List<Productspecitems> other$productspecitems = other.getProductspecitems();
        if (this$productspecitems == null ? other$productspecitems != null : !((Object)this$productspecitems).equals(other$productspecitems)) {
            return false;
        }
        List<Productspecitemalbums> this$productspecitemalbums = this.getProductspecitemalbums();
        List<Productspecitemalbums> other$productspecitemalbums = other.getProductspecitemalbums();
        if (this$productspecitemalbums == null ? other$productspecitemalbums != null : !((Object)this$productspecitemalbums).equals(other$productspecitemalbums)) {
            return false;
        }
        List<ProductOrgs> this$productOrgs = this.getProductOrgs();
        List<ProductOrgs> other$productOrgs = other.getProductOrgs();
        if (this$productOrgs == null ? other$productOrgs != null : !((Object)this$productOrgs).equals(other$productOrgs)) {
            return false;
        }
        List<ProductCustomers> this$productCustomers = this.getProductCustomers();
        List<ProductCustomers> other$productCustomers = other.getProductCustomers();
        if (this$productCustomers == null ? other$productCustomers != null : !((Object)this$productCustomers).equals(other$productCustomers)) {
            return false;
        }
        List<ProductShops> this$productShops = this.getProductShops();
        List<ProductShops> other$productShops = other.getProductShops();
        if (this$productShops == null ? other$productShops != null : !((Object)this$productShops).equals(other$productShops)) {
            return false;
        }
        List<ProductParams> this$productParams = this.getProductParams();
        List<ProductParams> other$productParams = other.getProductParams();
        if (this$productParams == null ? other$productParams != null : !((Object)this$productParams).equals(other$productParams)) {
            return false;
        }
        List<ProductCheckFrees> this$productCheckFrees = this.getProductCheckFrees();
        List<ProductCheckFrees> other$productCheckFrees = other.getProductCheckFrees();
        if (this$productCheckFrees == null ? other$productCheckFrees != null : !((Object)this$productCheckFrees).equals(other$productCheckFrees)) {
            return false;
        }
        List<ProductAssistUnitExchanges> this$productAssistUnitExchanges = this.getProductAssistUnitExchanges();
        List<ProductAssistUnitExchanges> other$productAssistUnitExchanges = other.getProductAssistUnitExchanges();
        if (this$productAssistUnitExchanges == null ? other$productAssistUnitExchanges != null : !((Object)this$productAssistUnitExchanges).equals(other$productAssistUnitExchanges)) {
            return false;
        }
        List<ProductBarCodes> this$productBarCodes = this.getProductBarCodes();
        List<ProductBarCodes> other$productBarCodes = other.getProductBarCodes();
        if (this$productBarCodes == null ? other$productBarCodes != null : !((Object)this$productBarCodes).equals(other$productBarCodes)) {
            return false;
        }
        Object this$productPropCharacterDefine = this.getProductPropCharacterDefine();
        Object other$productPropCharacterDefine = other.getProductPropCharacterDefine();
        if (this$productPropCharacterDefine == null ? other$productPropCharacterDefine != null : !this$productPropCharacterDefine.equals(other$productPropCharacterDefine)) {
            return false;
        }
        Object this$productCharacterDef = this.getProductCharacterDef();
        Object other$productCharacterDef = other.getProductCharacterDef();
        if (this$productCharacterDef == null ? other$productCharacterDef != null : !this$productCharacterDef.equals(other$productCharacterDef)) {
            return false;
        }
        List<PreferredMeterialList> this$PreferredMeterialList = this.getPreferredMeterialList();
        List<PreferredMeterialList> other$PreferredMeterialList = other.getPreferredMeterialList();
        return !(this$PreferredMeterialList == null ? other$PreferredMeterialList != null : !((Object)this$PreferredMeterialList).equals(other$PreferredMeterialList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductSaveRequest;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $isRegistrationManager = this.getIsRegistrationManager();
        result = result * 59 + ($isRegistrationManager == null ? 43 : ((Object)$isRegistrationManager).hashCode());
        Boolean $isAuthorizationManager = this.getIsAuthorizationManager();
        result = result * 59 + ($isAuthorizationManager == null ? 43 : ((Object)$isAuthorizationManager).hashCode());
        Boolean $autoGenerateRangeData_ = this.getAutoGenerateRangeData_();
        result = result * 59 + ($autoGenerateRangeData_ == null ? 43 : ((Object)$autoGenerateRangeData_).hashCode());
        Long $realProductAttribute = this.getRealProductAttribute();
        result = result * 59 + ($realProductAttribute == null ? 43 : ((Object)$realProductAttribute).hashCode());
        Long $realProductAttributeType = this.getRealProductAttributeType();
        result = result * 59 + ($realProductAttributeType == null ? 43 : ((Object)$realProductAttributeType).hashCode());
        Long $virtualProductAttribute = this.getVirtualProductAttribute();
        result = result * 59 + ($virtualProductAttribute == null ? 43 : ((Object)$virtualProductAttribute).hashCode());
        Long $unitUseType = this.getUnitUseType();
        result = result * 59 + ($unitUseType == null ? 43 : ((Object)$unitUseType).hashCode());
        Boolean $enableAssistUnit = this.getEnableAssistUnit();
        result = result * 59 + ($enableAssistUnit == null ? 43 : ((Object)$enableAssistUnit).hashCode());
        Long $customerServiceDay = this.getCustomerServiceDay();
        result = result * 59 + ($customerServiceDay == null ? 43 : ((Object)$customerServiceDay).hashCode());
        String $sourceUnique = this.getSourceUnique();
        result = result * 59 + ($sourceUnique == null ? 43 : $sourceUnique.hashCode());
        ProductDetailIPass $detail = this.getDetail();
        result = result * 59 + ($detail == null ? 43 : ((Object)$detail).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $netWeight = this.getNetWeight();
        result = result * 59 + ($netWeight == null ? 43 : $netWeight.hashCode());
        String $attachmentGroupId = this.getAttachmentGroupId();
        result = result * 59 + ($attachmentGroupId == null ? 43 : $attachmentGroupId.hashCode());
        String $orgId_Code = this.getOrgId_Code();
        result = result * 59 + ($orgId_Code == null ? 43 : $orgId_Code.hashCode());
        String $attachmentGroupId_Name = this.getAttachmentGroupId_Name();
        result = result * 59 + ($attachmentGroupId_Name == null ? 43 : $attachmentGroupId_Name.hashCode());
        String $orgId_Name = this.getOrgId_Name();
        result = result * 59 + ($orgId_Name == null ? 43 : $orgId_Name.hashCode());
        String $sunshinePurchaseNo = this.getSunshinePurchaseNo();
        result = result * 59 + ($sunshinePurchaseNo == null ? 43 : $sunshinePurchaseNo.hashCode());
        String $registrationNo = this.getRegistrationNo();
        result = result * 59 + ($registrationNo == null ? 43 : $registrationNo.hashCode());
        String $productApplyRange_OrgId = this.getProductApplyRange_OrgId();
        result = result * 59 + ($productApplyRange_OrgId == null ? 43 : $productApplyRange_OrgId.hashCode());
        String $attachmentGroupItemId_Name = this.getAttachmentGroupItemId_Name();
        result = result * 59 + ($attachmentGroupItemId_Name == null ? 43 : $attachmentGroupItemId_Name.hashCode());
        String $productApplyRange_OrgId_Name = this.getProductApplyRange_OrgId_Name();
        result = result * 59 + ($productApplyRange_OrgId_Name == null ? 43 : $productApplyRange_OrgId_Name.hashCode());
        String $defaultSKUId = this.getDefaultSKUId();
        result = result * 59 + ($defaultSKUId == null ? 43 : $defaultSKUId.hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : $pubts.hashCode());
        String $url = this.getUrl();
        result = result * 59 + ($url == null ? 43 : $url.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        IpassMultilingual $name = this.getName();
        result = result * 59 + ($name == null ? 43 : ((Object)$name).hashCode());
        IpassMultilingual $modelDescription = this.getModelDescription();
        result = result * 59 + ($modelDescription == null ? 43 : ((Object)$modelDescription).hashCode());
        IpassMultilingual $model = this.getModel();
        result = result * 59 + ($model == null ? 43 : ((Object)$model).hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        String $platformCode = this.getPlatformCode();
        result = result * 59 + ($platformCode == null ? 43 : $platformCode.hashCode());
        String $manageClass = this.getManageClass();
        result = result * 59 + ($manageClass == null ? 43 : $manageClass.hashCode());
        String $manageClass_Code = this.getManageClass_Code();
        result = result * 59 + ($manageClass_Code == null ? 43 : $manageClass_Code.hashCode());
        String $manageClass_Name = this.getManageClass_Name();
        result = result * 59 + ($manageClass_Name == null ? 43 : $manageClass_Name.hashCode());
        String $productClass = this.getProductClass();
        result = result * 59 + ($productClass == null ? 43 : $productClass.hashCode());
        String $productClass_Code = this.getProductClass_Code();
        result = result * 59 + ($productClass_Code == null ? 43 : $productClass_Code.hashCode());
        String $productClass_Name = this.getProductClass_Name();
        result = result * 59 + ($productClass_Name == null ? 43 : $productClass_Name.hashCode());
        String $productTemplate = this.getProductTemplate();
        result = result * 59 + ($productTemplate == null ? 43 : $productTemplate.hashCode());
        String $productTemplate_NameTips = this.getProductTemplate_NameTips();
        result = result * 59 + ($productTemplate_NameTips == null ? 43 : $productTemplate_NameTips.hashCode());
        String $productTemplate_Name = this.getProductTemplate_Name();
        result = result * 59 + ($productTemplate_Name == null ? 43 : $productTemplate_Name.hashCode());
        String $productLine = this.getProductLine();
        result = result * 59 + ($productLine == null ? 43 : $productLine.hashCode());
        String $productLine_Code = this.getProductLine_Code();
        result = result * 59 + ($productLine_Code == null ? 43 : $productLine_Code.hashCode());
        String $productLine_Name = this.getProductLine_Name();
        result = result * 59 + ($productLine_Name == null ? 43 : $productLine_Name.hashCode());
        String $brand = this.getBrand();
        result = result * 59 + ($brand == null ? 43 : $brand.hashCode());
        String $brand_RandKeywords = this.getBrand_RandKeywords();
        result = result * 59 + ($brand_RandKeywords == null ? 43 : $brand_RandKeywords.hashCode());
        String $brand_Name = this.getBrand_Name();
        result = result * 59 + ($brand_Name == null ? 43 : $brand_Name.hashCode());
        String $placeOfOrigin = this.getPlaceOfOrigin();
        result = result * 59 + ($placeOfOrigin == null ? 43 : $placeOfOrigin.hashCode());
        String $manufacturer = this.getManufacturer();
        result = result * 59 + ($manufacturer == null ? 43 : $manufacturer.hashCode());
        String $platFormStaus = this.getPlatFormStaus();
        result = result * 59 + ($platFormStaus == null ? 43 : $platFormStaus.hashCode());
        String $cPlatFormRemark = this.getCPlatFormRemark();
        result = result * 59 + ($cPlatFormRemark == null ? 43 : $cPlatFormRemark.hashCode());
        DescriptionIpass $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : ((Object)$description).hashCode());
        String $giftCardId = this.getGiftCardId();
        result = result * 59 + ($giftCardId == null ? 43 : $giftCardId.hashCode());
        String $giftCardId_Name = this.getGiftCardId_Name();
        result = result * 59 + ($giftCardId_Name == null ? 43 : $giftCardId_Name.hashCode());
        String $couponId = this.getCouponId();
        result = result * 59 + ($couponId == null ? 43 : $couponId.hashCode());
        String $couponType = this.getCouponType();
        result = result * 59 + ($couponType == null ? 43 : $couponType.hashCode());
        String $couponId_Name = this.getCouponId_Name();
        result = result * 59 + ($couponId_Name == null ? 43 : $couponId_Name.hashCode());
        String $unit = this.getUnit();
        result = result * 59 + ($unit == null ? 43 : $unit.hashCode());
        String $unit_Code = this.getUnit_Code();
        result = result * 59 + ($unit_Code == null ? 43 : $unit_Code.hashCode());
        String $unit_Name = this.getUnit_Name();
        result = result * 59 + ($unit_Name == null ? 43 : $unit_Name.hashCode());
        BigDecimal $weight = this.getWeight();
        result = result * 59 + ($weight == null ? 43 : ((Object)$weight).hashCode());
        String $weightUnit = this.getWeightUnit();
        result = result * 59 + ($weightUnit == null ? 43 : $weightUnit.hashCode());
        String $weightUnit_Name = this.getWeightUnit_Name();
        result = result * 59 + ($weightUnit_Name == null ? 43 : $weightUnit_Name.hashCode());
        BigDecimal $volume = this.getVolume();
        result = result * 59 + ($volume == null ? 43 : ((Object)$volume).hashCode());
        String $volumeUnit = this.getVolumeUnit();
        result = result * 59 + ($volumeUnit == null ? 43 : $volumeUnit.hashCode());
        String $volumeUnit_Name = this.getVolumeUnit_Name();
        result = result * 59 + ($volumeUnit_Name == null ? 43 : $volumeUnit_Name.hashCode());
        String $taxClass = this.getTaxClass();
        result = result * 59 + ($taxClass == null ? 43 : $taxClass.hashCode());
        String $taxClass_Code = this.getTaxClass_Code();
        result = result * 59 + ($taxClass_Code == null ? 43 : $taxClass_Code.hashCode());
        String $taxClass_Name = this.getTaxClass_Name();
        result = result * 59 + ($taxClass_Name == null ? 43 : $taxClass_Name.hashCode());
        String $dimensionCode = this.getDimensionCode();
        result = result * 59 + ($dimensionCode == null ? 43 : $dimensionCode.hashCode());
        IpassMultilingual $shareDescription = this.getShareDescription();
        result = result * 59 + ($shareDescription == null ? 43 : ((Object)$shareDescription).hashCode());
        ProductIPassTime $time = this.getTime();
        result = result * 59 + ($time == null ? 43 : ((Object)$time).hashCode());
        IpassMultilingual $keywords = this.getKeywords();
        result = result * 59 + ($keywords == null ? 43 : ((Object)$keywords).hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        List<ProductSpecFrees> $productSpecFrees = this.getProductSpecFrees();
        result = result * 59 + ($productSpecFrees == null ? 43 : ((Object)$productSpecFrees).hashCode());
        List<DefaultSKUOrderProperties> $defaultSKUOrderProperties = this.getDefaultSKUOrderProperties();
        result = result * 59 + ($defaultSKUOrderProperties == null ? 43 : ((Object)$defaultSKUOrderProperties).hashCode());
        List<Productskus> $productskus = this.getProductskus();
        result = result * 59 + ($productskus == null ? 43 : ((Object)$productskus).hashCode());
        List<SkuOrderProperties> $skuOrderProperties = this.getSkuOrderProperties();
        result = result * 59 + ($skuOrderProperties == null ? 43 : ((Object)$skuOrderProperties).hashCode());
        List<ProductAlbums> $productAlbums = this.getProductAlbums();
        result = result * 59 + ($productAlbums == null ? 43 : ((Object)$productAlbums).hashCode());
        List<ProductAttachments> $productAttachments = this.getProductAttachments();
        result = result * 59 + ($productAttachments == null ? 43 : ((Object)$productAttachments).hashCode());
        List<ProductTags> $productTags = this.getProductTags();
        result = result * 59 + ($productTags == null ? 43 : ((Object)$productTags).hashCode());
        List<ProductAssistClasses> $productAssistClasses = this.getProductAssistClasses();
        result = result * 59 + ($productAssistClasses == null ? 43 : ((Object)$productAssistClasses).hashCode());
        List<Productspecitems> $productspecitems = this.getProductspecitems();
        result = result * 59 + ($productspecitems == null ? 43 : ((Object)$productspecitems).hashCode());
        List<Productspecitemalbums> $productspecitemalbums = this.getProductspecitemalbums();
        result = result * 59 + ($productspecitemalbums == null ? 43 : ((Object)$productspecitemalbums).hashCode());
        List<ProductOrgs> $productOrgs = this.getProductOrgs();
        result = result * 59 + ($productOrgs == null ? 43 : ((Object)$productOrgs).hashCode());
        List<ProductCustomers> $productCustomers = this.getProductCustomers();
        result = result * 59 + ($productCustomers == null ? 43 : ((Object)$productCustomers).hashCode());
        List<ProductShops> $productShops = this.getProductShops();
        result = result * 59 + ($productShops == null ? 43 : ((Object)$productShops).hashCode());
        List<ProductParams> $productParams = this.getProductParams();
        result = result * 59 + ($productParams == null ? 43 : ((Object)$productParams).hashCode());
        List<ProductCheckFrees> $productCheckFrees = this.getProductCheckFrees();
        result = result * 59 + ($productCheckFrees == null ? 43 : ((Object)$productCheckFrees).hashCode());
        List<ProductAssistUnitExchanges> $productAssistUnitExchanges = this.getProductAssistUnitExchanges();
        result = result * 59 + ($productAssistUnitExchanges == null ? 43 : ((Object)$productAssistUnitExchanges).hashCode());
        List<ProductBarCodes> $productBarCodes = this.getProductBarCodes();
        result = result * 59 + ($productBarCodes == null ? 43 : ((Object)$productBarCodes).hashCode());
        Object $productPropCharacterDefine = this.getProductPropCharacterDefine();
        result = result * 59 + ($productPropCharacterDefine == null ? 43 : $productPropCharacterDefine.hashCode());
        Object $productCharacterDef = this.getProductCharacterDef();
        result = result * 59 + ($productCharacterDef == null ? 43 : $productCharacterDef.hashCode());
        List<PreferredMeterialList> $PreferredMeterialList = this.getPreferredMeterialList();
        result = result * 59 + ($PreferredMeterialList == null ? 43 : ((Object)$PreferredMeterialList).hashCode());
        return result;
    }

    public String toString() {
        return "ProductSaveRequest(sourceUnique=" + this.getSourceUnique() + ", detail=" + this.getDetail() + ", orgId=" + this.getOrgId() + ", netWeight=" + this.getNetWeight() + ", isRegistrationManager=" + this.getIsRegistrationManager() + ", attachmentGroupId=" + this.getAttachmentGroupId() + ", orgId_Code=" + this.getOrgId_Code() + ", isAuthorizationManager=" + this.getIsAuthorizationManager() + ", attachmentGroupId_Name=" + this.getAttachmentGroupId_Name() + ", orgId_Name=" + this.getOrgId_Name() + ", sunshinePurchaseNo=" + this.getSunshinePurchaseNo() + ", registrationNo=" + this.getRegistrationNo() + ", productApplyRange_OrgId=" + this.getProductApplyRange_OrgId() + ", attachmentGroupItemId_Name=" + this.getAttachmentGroupItemId_Name() + ", productApplyRange_OrgId_Name=" + this.getProductApplyRange_OrgId_Name() + ", defaultSKUId=" + this.getDefaultSKUId() + ", id=" + this.getId() + ", pubts=" + this.getPubts() + ", url=" + this.getUrl() + ", autoGenerateRangeData_=" + this.getAutoGenerateRangeData_() + ", code=" + this.getCode() + ", name=" + this.getName() + ", modelDescription=" + this.getModelDescription() + ", model=" + this.getModel() + ", erpCode=" + this.getErpCode() + ", platformCode=" + this.getPlatformCode() + ", manageClass=" + this.getManageClass() + ", manageClass_Code=" + this.getManageClass_Code() + ", manageClass_Name=" + this.getManageClass_Name() + ", productClass=" + this.getProductClass() + ", productClass_Code=" + this.getProductClass_Code() + ", productClass_Name=" + this.getProductClass_Name() + ", productTemplate=" + this.getProductTemplate() + ", productTemplate_NameTips=" + this.getProductTemplate_NameTips() + ", productTemplate_Name=" + this.getProductTemplate_Name() + ", productLine=" + this.getProductLine() + ", productLine_Code=" + this.getProductLine_Code() + ", productLine_Name=" + this.getProductLine_Name() + ", brand=" + this.getBrand() + ", brand_RandKeywords=" + this.getBrand_RandKeywords() + ", brand_Name=" + this.getBrand_Name() + ", placeOfOrigin=" + this.getPlaceOfOrigin() + ", manufacturer=" + this.getManufacturer() + ", platFormStaus=" + this.getPlatFormStaus() + ", cPlatFormRemark=" + this.getCPlatFormRemark() + ", description=" + this.getDescription() + ", realProductAttribute=" + this.getRealProductAttribute() + ", realProductAttributeType=" + this.getRealProductAttributeType() + ", virtualProductAttribute=" + this.getVirtualProductAttribute() + ", giftCardId=" + this.getGiftCardId() + ", giftCardId_Name=" + this.getGiftCardId_Name() + ", couponId=" + this.getCouponId() + ", couponType=" + this.getCouponType() + ", couponId_Name=" + this.getCouponId_Name() + ", unitUseType=" + this.getUnitUseType() + ", unit=" + this.getUnit() + ", unit_Code=" + this.getUnit_Code() + ", unit_Name=" + this.getUnit_Name() + ", enableAssistUnit=" + this.getEnableAssistUnit() + ", weight=" + this.getWeight() + ", weightUnit=" + this.getWeightUnit() + ", weightUnit_Name=" + this.getWeightUnit_Name() + ", volume=" + this.getVolume() + ", volumeUnit=" + this.getVolumeUnit() + ", volumeUnit_Name=" + this.getVolumeUnit_Name() + ", taxClass=" + this.getTaxClass() + ", taxClass_Code=" + this.getTaxClass_Code() + ", taxClass_Name=" + this.getTaxClass_Name() + ", customerServiceDay=" + this.getCustomerServiceDay() + ", dimensionCode=" + this.getDimensionCode() + ", shareDescription=" + this.getShareDescription() + ", time=" + this.getTime() + ", keywords=" + this.getKeywords() + ", _status=" + this.get_status() + ", productSpecFrees=" + this.getProductSpecFrees() + ", defaultSKUOrderProperties=" + this.getDefaultSKUOrderProperties() + ", productskus=" + this.getProductskus() + ", skuOrderProperties=" + this.getSkuOrderProperties() + ", productAlbums=" + this.getProductAlbums() + ", productAttachments=" + this.getProductAttachments() + ", productTags=" + this.getProductTags() + ", productAssistClasses=" + this.getProductAssistClasses() + ", productspecitems=" + this.getProductspecitems() + ", productspecitemalbums=" + this.getProductspecitemalbums() + ", productOrgs=" + this.getProductOrgs() + ", productCustomers=" + this.getProductCustomers() + ", productShops=" + this.getProductShops() + ", productParams=" + this.getProductParams() + ", productCheckFrees=" + this.getProductCheckFrees() + ", productAssistUnitExchanges=" + this.getProductAssistUnitExchanges() + ", productBarCodes=" + this.getProductBarCodes() + ", productPropCharacterDefine=" + this.getProductPropCharacterDefine() + ", productCharacterDef=" + this.getProductCharacterDef() + ", PreferredMeterialList=" + this.getPreferredMeterialList() + ")";
    }
}

