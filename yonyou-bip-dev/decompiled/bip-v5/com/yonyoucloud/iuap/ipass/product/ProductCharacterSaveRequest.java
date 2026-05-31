/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.ipass.product.DescriptionIpass;
import com.yonyoucloud.iuap.ipass.product.ProductIPassAssistClass;
import com.yonyoucloud.iuap.ipass.product.ProductIPassAssistUnitExchange;
import com.yonyoucloud.iuap.ipass.product.ProductIPassBarCode;
import com.yonyoucloud.iuap.ipass.product.ProductIPassDetail;
import com.yonyoucloud.iuap.ipass.product.ProductIPassOrg;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.iuap.upc.vo.ProductTag;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductCharacterSaveRequest
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String orgCode;
    private String orgId;
    private String code;
    private MultilingualVO name;
    private MultilingualVO modelDescription;
    private MultilingualVO model;
    private String erpCode;
    private Object productPropCharacterDefine;
    private Integer optionalMaterial;
    private Integer derivedMaterial;
    private String optionalMaterialCode;
    private Long optionalMaterialId;
    private Object productCharacterDef;
    private ProductIPassDetail detail;
    private String manageClass;
    private String manageClassCode;
    private Long productClass;
    private String productClassCode;
    private Boolean registrationManager;
    private Boolean authorizationManager;
    private String sunshinePurchaseNo;
    private String registrationNo;
    private Boolean autoGenerateRangeData;
    private Long productTemplate;
    private String productTemplateName;
    private Long productLine;
    private String productLineCode;
    private Long brand;
    private String brandCode;
    private String placeOfOrigin;
    private String manufacturer;
    private DescriptionIpass description;
    private Integer realProductAttribute;
    private Integer realProductAttributeType;
    private Long virtualProductAttribute;
    private String giftCardId;
    private String couponId;
    private Long unitUseType;
    private Long unit;
    private String unitCode;
    private Boolean enableAssistUnit;
    private BigDecimal weight;
    private Long weightUnit;
    private String weightUnitCode;
    private BigDecimal volume;
    private Long volumeUnit;
    private String volumeUnitCode;
    private String taxClass;
    private String taxClassCode;
    private String planClassCode;
    private Long planClass;
    private MultilingualVO shareDescription;
    private MultilingualVO keywords;
    private List<ProductIPassAssistClass> productAssistClasses;
    private List<ProductIPassOrg> productOrges;
    private List<ProductIPassAssistUnitExchange> productAssistUnitExchanges;
    private List<ProductIPassBarCode> productBarCodes;
    private String transTypeCode;
    private String custom_uri;
    private String custom_weights;
    private String sourceUnique;
    private Long productId;
    private List<String> orgIds;
    private String createOrgId;
    private List<ProductTag> productTags;

    public String getId() {
        return this.id;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public String getOrgId() {
        return this.orgId;
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

    public String getErpCode() {
        return this.erpCode;
    }

    public Object getProductPropCharacterDefine() {
        return this.productPropCharacterDefine;
    }

    public Integer getOptionalMaterial() {
        return this.optionalMaterial;
    }

    public Integer getDerivedMaterial() {
        return this.derivedMaterial;
    }

    public String getOptionalMaterialCode() {
        return this.optionalMaterialCode;
    }

    public Long getOptionalMaterialId() {
        return this.optionalMaterialId;
    }

    public Object getProductCharacterDef() {
        return this.productCharacterDef;
    }

    public ProductIPassDetail getDetail() {
        return this.detail;
    }

    public String getManageClass() {
        return this.manageClass;
    }

    public String getManageClassCode() {
        return this.manageClassCode;
    }

    public Long getProductClass() {
        return this.productClass;
    }

    public String getProductClassCode() {
        return this.productClassCode;
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

    public Boolean getAutoGenerateRangeData() {
        return this.autoGenerateRangeData;
    }

    public Long getProductTemplate() {
        return this.productTemplate;
    }

    public String getProductTemplateName() {
        return this.productTemplateName;
    }

    public Long getProductLine() {
        return this.productLine;
    }

    public String getProductLineCode() {
        return this.productLineCode;
    }

    public Long getBrand() {
        return this.brand;
    }

    public String getBrandCode() {
        return this.brandCode;
    }

    public String getPlaceOfOrigin() {
        return this.placeOfOrigin;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public DescriptionIpass getDescription() {
        return this.description;
    }

    public Integer getRealProductAttribute() {
        return this.realProductAttribute;
    }

    public Integer getRealProductAttributeType() {
        return this.realProductAttributeType;
    }

    public Long getVirtualProductAttribute() {
        return this.virtualProductAttribute;
    }

    public String getGiftCardId() {
        return this.giftCardId;
    }

    public String getCouponId() {
        return this.couponId;
    }

    public Long getUnitUseType() {
        return this.unitUseType;
    }

    public Long getUnit() {
        return this.unit;
    }

    public String getUnitCode() {
        return this.unitCode;
    }

    public Boolean getEnableAssistUnit() {
        return this.enableAssistUnit;
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

    public BigDecimal getVolume() {
        return this.volume;
    }

    public Long getVolumeUnit() {
        return this.volumeUnit;
    }

    public String getVolumeUnitCode() {
        return this.volumeUnitCode;
    }

    public String getTaxClass() {
        return this.taxClass;
    }

    public String getTaxClassCode() {
        return this.taxClassCode;
    }

    public String getPlanClassCode() {
        return this.planClassCode;
    }

    public Long getPlanClass() {
        return this.planClass;
    }

    public MultilingualVO getShareDescription() {
        return this.shareDescription;
    }

    public MultilingualVO getKeywords() {
        return this.keywords;
    }

    public List<ProductIPassAssistClass> getProductAssistClasses() {
        return this.productAssistClasses;
    }

    public List<ProductIPassOrg> getProductOrges() {
        return this.productOrges;
    }

    public List<ProductIPassAssistUnitExchange> getProductAssistUnitExchanges() {
        return this.productAssistUnitExchanges;
    }

    public List<ProductIPassBarCode> getProductBarCodes() {
        return this.productBarCodes;
    }

    public String getTransTypeCode() {
        return this.transTypeCode;
    }

    public String getCustom_uri() {
        return this.custom_uri;
    }

    public String getCustom_weights() {
        return this.custom_weights;
    }

    public String getSourceUnique() {
        return this.sourceUnique;
    }

    public Long getProductId() {
        return this.productId;
    }

    public List<String> getOrgIds() {
        return this.orgIds;
    }

    public String getCreateOrgId() {
        return this.createOrgId;
    }

    public List<ProductTag> getProductTags() {
        return this.productTags;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
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

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setProductPropCharacterDefine(Object productPropCharacterDefine) {
        this.productPropCharacterDefine = productPropCharacterDefine;
    }

    public void setOptionalMaterial(Integer optionalMaterial) {
        this.optionalMaterial = optionalMaterial;
    }

    public void setDerivedMaterial(Integer derivedMaterial) {
        this.derivedMaterial = derivedMaterial;
    }

    public void setOptionalMaterialCode(String optionalMaterialCode) {
        this.optionalMaterialCode = optionalMaterialCode;
    }

    public void setOptionalMaterialId(Long optionalMaterialId) {
        this.optionalMaterialId = optionalMaterialId;
    }

    public void setProductCharacterDef(Object productCharacterDef) {
        this.productCharacterDef = productCharacterDef;
    }

    public void setDetail(ProductIPassDetail detail) {
        this.detail = detail;
    }

    public void setManageClass(String manageClass) {
        this.manageClass = manageClass;
    }

    public void setManageClassCode(String manageClassCode) {
        this.manageClassCode = manageClassCode;
    }

    public void setProductClass(Long productClass) {
        this.productClass = productClass;
    }

    public void setProductClassCode(String productClassCode) {
        this.productClassCode = productClassCode;
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

    public void setAutoGenerateRangeData(Boolean autoGenerateRangeData) {
        this.autoGenerateRangeData = autoGenerateRangeData;
    }

    public void setProductTemplate(Long productTemplate) {
        this.productTemplate = productTemplate;
    }

    public void setProductTemplateName(String productTemplateName) {
        this.productTemplateName = productTemplateName;
    }

    public void setProductLine(Long productLine) {
        this.productLine = productLine;
    }

    public void setProductLineCode(String productLineCode) {
        this.productLineCode = productLineCode;
    }

    public void setBrand(Long brand) {
        this.brand = brand;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setDescription(DescriptionIpass description) {
        this.description = description;
    }

    public void setRealProductAttribute(Integer realProductAttribute) {
        this.realProductAttribute = realProductAttribute;
    }

    public void setRealProductAttributeType(Integer realProductAttributeType) {
        this.realProductAttributeType = realProductAttributeType;
    }

    public void setVirtualProductAttribute(Long virtualProductAttribute) {
        this.virtualProductAttribute = virtualProductAttribute;
    }

    public void setGiftCardId(String giftCardId) {
        this.giftCardId = giftCardId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public void setUnitUseType(Long unitUseType) {
        this.unitUseType = unitUseType;
    }

    public void setUnit(Long unit) {
        this.unit = unit;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public void setEnableAssistUnit(Boolean enableAssistUnit) {
        this.enableAssistUnit = enableAssistUnit;
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

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public void setVolumeUnit(Long volumeUnit) {
        this.volumeUnit = volumeUnit;
    }

    public void setVolumeUnitCode(String volumeUnitCode) {
        this.volumeUnitCode = volumeUnitCode;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    public void setTaxClassCode(String taxClassCode) {
        this.taxClassCode = taxClassCode;
    }

    public void setPlanClassCode(String planClassCode) {
        this.planClassCode = planClassCode;
    }

    public void setPlanClass(Long planClass) {
        this.planClass = planClass;
    }

    public void setShareDescription(MultilingualVO shareDescription) {
        this.shareDescription = shareDescription;
    }

    public void setKeywords(MultilingualVO keywords) {
        this.keywords = keywords;
    }

    public void setProductAssistClasses(List<ProductIPassAssistClass> productAssistClasses) {
        this.productAssistClasses = productAssistClasses;
    }

    public void setProductOrges(List<ProductIPassOrg> productOrges) {
        this.productOrges = productOrges;
    }

    public void setProductAssistUnitExchanges(List<ProductIPassAssistUnitExchange> productAssistUnitExchanges) {
        this.productAssistUnitExchanges = productAssistUnitExchanges;
    }

    public void setProductBarCodes(List<ProductIPassBarCode> productBarCodes) {
        this.productBarCodes = productBarCodes;
    }

    public void setTransTypeCode(String transTypeCode) {
        this.transTypeCode = transTypeCode;
    }

    public void setCustom_uri(String custom_uri) {
        this.custom_uri = custom_uri;
    }

    public void setCustom_weights(String custom_weights) {
        this.custom_weights = custom_weights;
    }

    public void setSourceUnique(String sourceUnique) {
        this.sourceUnique = sourceUnique;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setOrgIds(List<String> orgIds) {
        this.orgIds = orgIds;
    }

    public void setCreateOrgId(String createOrgId) {
        this.createOrgId = createOrgId;
    }

    public void setProductTags(List<ProductTag> productTags) {
        this.productTags = productTags;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductCharacterSaveRequest)) {
            return false;
        }
        ProductCharacterSaveRequest other = (ProductCharacterSaveRequest)o;
        if (!other.canEqual(this)) {
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
        Long this$productClass = this.getProductClass();
        Long other$productClass = other.getProductClass();
        if (this$productClass == null ? other$productClass != null : !((Object)this$productClass).equals(other$productClass)) {
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
        Boolean this$autoGenerateRangeData = this.getAutoGenerateRangeData();
        Boolean other$autoGenerateRangeData = other.getAutoGenerateRangeData();
        if (this$autoGenerateRangeData == null ? other$autoGenerateRangeData != null : !((Object)this$autoGenerateRangeData).equals(other$autoGenerateRangeData)) {
            return false;
        }
        Long this$productTemplate = this.getProductTemplate();
        Long other$productTemplate = other.getProductTemplate();
        if (this$productTemplate == null ? other$productTemplate != null : !((Object)this$productTemplate).equals(other$productTemplate)) {
            return false;
        }
        Long this$productLine = this.getProductLine();
        Long other$productLine = other.getProductLine();
        if (this$productLine == null ? other$productLine != null : !((Object)this$productLine).equals(other$productLine)) {
            return false;
        }
        Long this$brand = this.getBrand();
        Long other$brand = other.getBrand();
        if (this$brand == null ? other$brand != null : !((Object)this$brand).equals(other$brand)) {
            return false;
        }
        Integer this$realProductAttribute = this.getRealProductAttribute();
        Integer other$realProductAttribute = other.getRealProductAttribute();
        if (this$realProductAttribute == null ? other$realProductAttribute != null : !((Object)this$realProductAttribute).equals(other$realProductAttribute)) {
            return false;
        }
        Integer this$realProductAttributeType = this.getRealProductAttributeType();
        Integer other$realProductAttributeType = other.getRealProductAttributeType();
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
        Long this$unit = this.getUnit();
        Long other$unit = other.getUnit();
        if (this$unit == null ? other$unit != null : !((Object)this$unit).equals(other$unit)) {
            return false;
        }
        Boolean this$enableAssistUnit = this.getEnableAssistUnit();
        Boolean other$enableAssistUnit = other.getEnableAssistUnit();
        if (this$enableAssistUnit == null ? other$enableAssistUnit != null : !((Object)this$enableAssistUnit).equals(other$enableAssistUnit)) {
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
        Long this$planClass = this.getPlanClass();
        Long other$planClass = other.getPlanClass();
        if (this$planClass == null ? other$planClass != null : !((Object)this$planClass).equals(other$planClass)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$orgCode = this.getOrgCode();
        String other$orgCode = other.getOrgCode();
        if (this$orgCode == null ? other$orgCode != null : !this$orgCode.equals(other$orgCode)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
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
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        Object this$productPropCharacterDefine = this.getProductPropCharacterDefine();
        Object other$productPropCharacterDefine = other.getProductPropCharacterDefine();
        if (this$productPropCharacterDefine == null ? other$productPropCharacterDefine != null : !this$productPropCharacterDefine.equals(other$productPropCharacterDefine)) {
            return false;
        }
        String this$optionalMaterialCode = this.getOptionalMaterialCode();
        String other$optionalMaterialCode = other.getOptionalMaterialCode();
        if (this$optionalMaterialCode == null ? other$optionalMaterialCode != null : !this$optionalMaterialCode.equals(other$optionalMaterialCode)) {
            return false;
        }
        Object this$productCharacterDef = this.getProductCharacterDef();
        Object other$productCharacterDef = other.getProductCharacterDef();
        if (this$productCharacterDef == null ? other$productCharacterDef != null : !this$productCharacterDef.equals(other$productCharacterDef)) {
            return false;
        }
        ProductIPassDetail this$detail = this.getDetail();
        ProductIPassDetail other$detail = other.getDetail();
        if (this$detail == null ? other$detail != null : !((Object)this$detail).equals(other$detail)) {
            return false;
        }
        String this$manageClass = this.getManageClass();
        String other$manageClass = other.getManageClass();
        if (this$manageClass == null ? other$manageClass != null : !this$manageClass.equals(other$manageClass)) {
            return false;
        }
        String this$manageClassCode = this.getManageClassCode();
        String other$manageClassCode = other.getManageClassCode();
        if (this$manageClassCode == null ? other$manageClassCode != null : !this$manageClassCode.equals(other$manageClassCode)) {
            return false;
        }
        String this$productClassCode = this.getProductClassCode();
        String other$productClassCode = other.getProductClassCode();
        if (this$productClassCode == null ? other$productClassCode != null : !this$productClassCode.equals(other$productClassCode)) {
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
        String this$productTemplateName = this.getProductTemplateName();
        String other$productTemplateName = other.getProductTemplateName();
        if (this$productTemplateName == null ? other$productTemplateName != null : !this$productTemplateName.equals(other$productTemplateName)) {
            return false;
        }
        String this$productLineCode = this.getProductLineCode();
        String other$productLineCode = other.getProductLineCode();
        if (this$productLineCode == null ? other$productLineCode != null : !this$productLineCode.equals(other$productLineCode)) {
            return false;
        }
        String this$brandCode = this.getBrandCode();
        String other$brandCode = other.getBrandCode();
        if (this$brandCode == null ? other$brandCode != null : !this$brandCode.equals(other$brandCode)) {
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
        String this$couponId = this.getCouponId();
        String other$couponId = other.getCouponId();
        if (this$couponId == null ? other$couponId != null : !this$couponId.equals(other$couponId)) {
            return false;
        }
        String this$unitCode = this.getUnitCode();
        String other$unitCode = other.getUnitCode();
        if (this$unitCode == null ? other$unitCode != null : !this$unitCode.equals(other$unitCode)) {
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
        String this$planClassCode = this.getPlanClassCode();
        String other$planClassCode = other.getPlanClassCode();
        if (this$planClassCode == null ? other$planClassCode != null : !this$planClassCode.equals(other$planClassCode)) {
            return false;
        }
        MultilingualVO this$shareDescription = this.getShareDescription();
        MultilingualVO other$shareDescription = other.getShareDescription();
        if (this$shareDescription == null ? other$shareDescription != null : !((Object)this$shareDescription).equals(other$shareDescription)) {
            return false;
        }
        MultilingualVO this$keywords = this.getKeywords();
        MultilingualVO other$keywords = other.getKeywords();
        if (this$keywords == null ? other$keywords != null : !((Object)this$keywords).equals(other$keywords)) {
            return false;
        }
        List<ProductIPassAssistClass> this$productAssistClasses = this.getProductAssistClasses();
        List<ProductIPassAssistClass> other$productAssistClasses = other.getProductAssistClasses();
        if (this$productAssistClasses == null ? other$productAssistClasses != null : !((Object)this$productAssistClasses).equals(other$productAssistClasses)) {
            return false;
        }
        List<ProductIPassOrg> this$productOrges = this.getProductOrges();
        List<ProductIPassOrg> other$productOrges = other.getProductOrges();
        if (this$productOrges == null ? other$productOrges != null : !((Object)this$productOrges).equals(other$productOrges)) {
            return false;
        }
        List<ProductIPassAssistUnitExchange> this$productAssistUnitExchanges = this.getProductAssistUnitExchanges();
        List<ProductIPassAssistUnitExchange> other$productAssistUnitExchanges = other.getProductAssistUnitExchanges();
        if (this$productAssistUnitExchanges == null ? other$productAssistUnitExchanges != null : !((Object)this$productAssistUnitExchanges).equals(other$productAssistUnitExchanges)) {
            return false;
        }
        List<ProductIPassBarCode> this$productBarCodes = this.getProductBarCodes();
        List<ProductIPassBarCode> other$productBarCodes = other.getProductBarCodes();
        if (this$productBarCodes == null ? other$productBarCodes != null : !((Object)this$productBarCodes).equals(other$productBarCodes)) {
            return false;
        }
        String this$transTypeCode = this.getTransTypeCode();
        String other$transTypeCode = other.getTransTypeCode();
        if (this$transTypeCode == null ? other$transTypeCode != null : !this$transTypeCode.equals(other$transTypeCode)) {
            return false;
        }
        String this$custom_uri = this.getCustom_uri();
        String other$custom_uri = other.getCustom_uri();
        if (this$custom_uri == null ? other$custom_uri != null : !this$custom_uri.equals(other$custom_uri)) {
            return false;
        }
        String this$custom_weights = this.getCustom_weights();
        String other$custom_weights = other.getCustom_weights();
        if (this$custom_weights == null ? other$custom_weights != null : !this$custom_weights.equals(other$custom_weights)) {
            return false;
        }
        String this$sourceUnique = this.getSourceUnique();
        String other$sourceUnique = other.getSourceUnique();
        if (this$sourceUnique == null ? other$sourceUnique != null : !this$sourceUnique.equals(other$sourceUnique)) {
            return false;
        }
        List<String> this$orgIds = this.getOrgIds();
        List<String> other$orgIds = other.getOrgIds();
        if (this$orgIds == null ? other$orgIds != null : !((Object)this$orgIds).equals(other$orgIds)) {
            return false;
        }
        String this$createOrgId = this.getCreateOrgId();
        String other$createOrgId = other.getCreateOrgId();
        if (this$createOrgId == null ? other$createOrgId != null : !this$createOrgId.equals(other$createOrgId)) {
            return false;
        }
        List<ProductTag> this$productTags = this.getProductTags();
        List<ProductTag> other$productTags = other.getProductTags();
        return !(this$productTags == null ? other$productTags != null : !((Object)this$productTags).equals(other$productTags));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductCharacterSaveRequest;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $optionalMaterial = this.getOptionalMaterial();
        result = result * 59 + ($optionalMaterial == null ? 43 : ((Object)$optionalMaterial).hashCode());
        Integer $derivedMaterial = this.getDerivedMaterial();
        result = result * 59 + ($derivedMaterial == null ? 43 : ((Object)$derivedMaterial).hashCode());
        Long $optionalMaterialId = this.getOptionalMaterialId();
        result = result * 59 + ($optionalMaterialId == null ? 43 : ((Object)$optionalMaterialId).hashCode());
        Long $productClass = this.getProductClass();
        result = result * 59 + ($productClass == null ? 43 : ((Object)$productClass).hashCode());
        Boolean $registrationManager = this.getRegistrationManager();
        result = result * 59 + ($registrationManager == null ? 43 : ((Object)$registrationManager).hashCode());
        Boolean $authorizationManager = this.getAuthorizationManager();
        result = result * 59 + ($authorizationManager == null ? 43 : ((Object)$authorizationManager).hashCode());
        Boolean $autoGenerateRangeData = this.getAutoGenerateRangeData();
        result = result * 59 + ($autoGenerateRangeData == null ? 43 : ((Object)$autoGenerateRangeData).hashCode());
        Long $productTemplate = this.getProductTemplate();
        result = result * 59 + ($productTemplate == null ? 43 : ((Object)$productTemplate).hashCode());
        Long $productLine = this.getProductLine();
        result = result * 59 + ($productLine == null ? 43 : ((Object)$productLine).hashCode());
        Long $brand = this.getBrand();
        result = result * 59 + ($brand == null ? 43 : ((Object)$brand).hashCode());
        Integer $realProductAttribute = this.getRealProductAttribute();
        result = result * 59 + ($realProductAttribute == null ? 43 : ((Object)$realProductAttribute).hashCode());
        Integer $realProductAttributeType = this.getRealProductAttributeType();
        result = result * 59 + ($realProductAttributeType == null ? 43 : ((Object)$realProductAttributeType).hashCode());
        Long $virtualProductAttribute = this.getVirtualProductAttribute();
        result = result * 59 + ($virtualProductAttribute == null ? 43 : ((Object)$virtualProductAttribute).hashCode());
        Long $unitUseType = this.getUnitUseType();
        result = result * 59 + ($unitUseType == null ? 43 : ((Object)$unitUseType).hashCode());
        Long $unit = this.getUnit();
        result = result * 59 + ($unit == null ? 43 : ((Object)$unit).hashCode());
        Boolean $enableAssistUnit = this.getEnableAssistUnit();
        result = result * 59 + ($enableAssistUnit == null ? 43 : ((Object)$enableAssistUnit).hashCode());
        Long $weightUnit = this.getWeightUnit();
        result = result * 59 + ($weightUnit == null ? 43 : ((Object)$weightUnit).hashCode());
        Long $volumeUnit = this.getVolumeUnit();
        result = result * 59 + ($volumeUnit == null ? 43 : ((Object)$volumeUnit).hashCode());
        Long $planClass = this.getPlanClass();
        result = result * 59 + ($planClass == null ? 43 : ((Object)$planClass).hashCode());
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $orgCode = this.getOrgCode();
        result = result * 59 + ($orgCode == null ? 43 : $orgCode.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        MultilingualVO $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        MultilingualVO $modelDescription = this.getModelDescription();
        result = result * 59 + ($modelDescription == null ? 43 : $modelDescription.hashCode());
        MultilingualVO $model = this.getModel();
        result = result * 59 + ($model == null ? 43 : $model.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        Object $productPropCharacterDefine = this.getProductPropCharacterDefine();
        result = result * 59 + ($productPropCharacterDefine == null ? 43 : $productPropCharacterDefine.hashCode());
        String $optionalMaterialCode = this.getOptionalMaterialCode();
        result = result * 59 + ($optionalMaterialCode == null ? 43 : $optionalMaterialCode.hashCode());
        Object $productCharacterDef = this.getProductCharacterDef();
        result = result * 59 + ($productCharacterDef == null ? 43 : $productCharacterDef.hashCode());
        ProductIPassDetail $detail = this.getDetail();
        result = result * 59 + ($detail == null ? 43 : ((Object)$detail).hashCode());
        String $manageClass = this.getManageClass();
        result = result * 59 + ($manageClass == null ? 43 : $manageClass.hashCode());
        String $manageClassCode = this.getManageClassCode();
        result = result * 59 + ($manageClassCode == null ? 43 : $manageClassCode.hashCode());
        String $productClassCode = this.getProductClassCode();
        result = result * 59 + ($productClassCode == null ? 43 : $productClassCode.hashCode());
        String $sunshinePurchaseNo = this.getSunshinePurchaseNo();
        result = result * 59 + ($sunshinePurchaseNo == null ? 43 : $sunshinePurchaseNo.hashCode());
        String $registrationNo = this.getRegistrationNo();
        result = result * 59 + ($registrationNo == null ? 43 : $registrationNo.hashCode());
        String $productTemplateName = this.getProductTemplateName();
        result = result * 59 + ($productTemplateName == null ? 43 : $productTemplateName.hashCode());
        String $productLineCode = this.getProductLineCode();
        result = result * 59 + ($productLineCode == null ? 43 : $productLineCode.hashCode());
        String $brandCode = this.getBrandCode();
        result = result * 59 + ($brandCode == null ? 43 : $brandCode.hashCode());
        String $placeOfOrigin = this.getPlaceOfOrigin();
        result = result * 59 + ($placeOfOrigin == null ? 43 : $placeOfOrigin.hashCode());
        String $manufacturer = this.getManufacturer();
        result = result * 59 + ($manufacturer == null ? 43 : $manufacturer.hashCode());
        DescriptionIpass $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : ((Object)$description).hashCode());
        String $giftCardId = this.getGiftCardId();
        result = result * 59 + ($giftCardId == null ? 43 : $giftCardId.hashCode());
        String $couponId = this.getCouponId();
        result = result * 59 + ($couponId == null ? 43 : $couponId.hashCode());
        String $unitCode = this.getUnitCode();
        result = result * 59 + ($unitCode == null ? 43 : $unitCode.hashCode());
        BigDecimal $weight = this.getWeight();
        result = result * 59 + ($weight == null ? 43 : ((Object)$weight).hashCode());
        String $weightUnitCode = this.getWeightUnitCode();
        result = result * 59 + ($weightUnitCode == null ? 43 : $weightUnitCode.hashCode());
        BigDecimal $volume = this.getVolume();
        result = result * 59 + ($volume == null ? 43 : ((Object)$volume).hashCode());
        String $volumeUnitCode = this.getVolumeUnitCode();
        result = result * 59 + ($volumeUnitCode == null ? 43 : $volumeUnitCode.hashCode());
        String $taxClass = this.getTaxClass();
        result = result * 59 + ($taxClass == null ? 43 : $taxClass.hashCode());
        String $taxClassCode = this.getTaxClassCode();
        result = result * 59 + ($taxClassCode == null ? 43 : $taxClassCode.hashCode());
        String $planClassCode = this.getPlanClassCode();
        result = result * 59 + ($planClassCode == null ? 43 : $planClassCode.hashCode());
        MultilingualVO $shareDescription = this.getShareDescription();
        result = result * 59 + ($shareDescription == null ? 43 : $shareDescription.hashCode());
        MultilingualVO $keywords = this.getKeywords();
        result = result * 59 + ($keywords == null ? 43 : $keywords.hashCode());
        List<ProductIPassAssistClass> $productAssistClasses = this.getProductAssistClasses();
        result = result * 59 + ($productAssistClasses == null ? 43 : ((Object)$productAssistClasses).hashCode());
        List<ProductIPassOrg> $productOrges = this.getProductOrges();
        result = result * 59 + ($productOrges == null ? 43 : ((Object)$productOrges).hashCode());
        List<ProductIPassAssistUnitExchange> $productAssistUnitExchanges = this.getProductAssistUnitExchanges();
        result = result * 59 + ($productAssistUnitExchanges == null ? 43 : ((Object)$productAssistUnitExchanges).hashCode());
        List<ProductIPassBarCode> $productBarCodes = this.getProductBarCodes();
        result = result * 59 + ($productBarCodes == null ? 43 : ((Object)$productBarCodes).hashCode());
        String $transTypeCode = this.getTransTypeCode();
        result = result * 59 + ($transTypeCode == null ? 43 : $transTypeCode.hashCode());
        String $custom_uri = this.getCustom_uri();
        result = result * 59 + ($custom_uri == null ? 43 : $custom_uri.hashCode());
        String $custom_weights = this.getCustom_weights();
        result = result * 59 + ($custom_weights == null ? 43 : $custom_weights.hashCode());
        String $sourceUnique = this.getSourceUnique();
        result = result * 59 + ($sourceUnique == null ? 43 : $sourceUnique.hashCode());
        List<String> $orgIds = this.getOrgIds();
        result = result * 59 + ($orgIds == null ? 43 : ((Object)$orgIds).hashCode());
        String $createOrgId = this.getCreateOrgId();
        result = result * 59 + ($createOrgId == null ? 43 : $createOrgId.hashCode());
        List<ProductTag> $productTags = this.getProductTags();
        result = result * 59 + ($productTags == null ? 43 : ((Object)$productTags).hashCode());
        return result;
    }

    public String toString() {
        return "ProductCharacterSaveRequest(id=" + this.getId() + ", orgCode=" + this.getOrgCode() + ", orgId=" + this.getOrgId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", modelDescription=" + this.getModelDescription() + ", model=" + this.getModel() + ", erpCode=" + this.getErpCode() + ", productPropCharacterDefine=" + this.getProductPropCharacterDefine() + ", optionalMaterial=" + this.getOptionalMaterial() + ", derivedMaterial=" + this.getDerivedMaterial() + ", optionalMaterialCode=" + this.getOptionalMaterialCode() + ", optionalMaterialId=" + this.getOptionalMaterialId() + ", productCharacterDef=" + this.getProductCharacterDef() + ", detail=" + this.getDetail() + ", manageClass=" + this.getManageClass() + ", manageClassCode=" + this.getManageClassCode() + ", productClass=" + this.getProductClass() + ", productClassCode=" + this.getProductClassCode() + ", registrationManager=" + this.getRegistrationManager() + ", authorizationManager=" + this.getAuthorizationManager() + ", sunshinePurchaseNo=" + this.getSunshinePurchaseNo() + ", registrationNo=" + this.getRegistrationNo() + ", autoGenerateRangeData=" + this.getAutoGenerateRangeData() + ", productTemplate=" + this.getProductTemplate() + ", productTemplateName=" + this.getProductTemplateName() + ", productLine=" + this.getProductLine() + ", productLineCode=" + this.getProductLineCode() + ", brand=" + this.getBrand() + ", brandCode=" + this.getBrandCode() + ", placeOfOrigin=" + this.getPlaceOfOrigin() + ", manufacturer=" + this.getManufacturer() + ", description=" + this.getDescription() + ", realProductAttribute=" + this.getRealProductAttribute() + ", realProductAttributeType=" + this.getRealProductAttributeType() + ", virtualProductAttribute=" + this.getVirtualProductAttribute() + ", giftCardId=" + this.getGiftCardId() + ", couponId=" + this.getCouponId() + ", unitUseType=" + this.getUnitUseType() + ", unit=" + this.getUnit() + ", unitCode=" + this.getUnitCode() + ", enableAssistUnit=" + this.getEnableAssistUnit() + ", weight=" + this.getWeight() + ", weightUnit=" + this.getWeightUnit() + ", weightUnitCode=" + this.getWeightUnitCode() + ", volume=" + this.getVolume() + ", volumeUnit=" + this.getVolumeUnit() + ", volumeUnitCode=" + this.getVolumeUnitCode() + ", taxClass=" + this.getTaxClass() + ", taxClassCode=" + this.getTaxClassCode() + ", planClassCode=" + this.getPlanClassCode() + ", planClass=" + this.getPlanClass() + ", shareDescription=" + this.getShareDescription() + ", keywords=" + this.getKeywords() + ", productAssistClasses=" + this.getProductAssistClasses() + ", productOrges=" + this.getProductOrges() + ", productAssistUnitExchanges=" + this.getProductAssistUnitExchanges() + ", productBarCodes=" + this.getProductBarCodes() + ", transTypeCode=" + this.getTransTypeCode() + ", custom_uri=" + this.getCustom_uri() + ", custom_weights=" + this.getCustom_weights() + ", sourceUnique=" + this.getSourceUnique() + ", productId=" + this.getProductId() + ", orgIds=" + this.getOrgIds() + ", createOrgId=" + this.getCreateOrgId() + ", productTags=" + this.getProductTags() + ")";
    }
}

