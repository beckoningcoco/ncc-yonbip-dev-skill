/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.derivatives;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.common.CoredocBaseDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.ProductTplBrandDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class BrandDTO
extends CoredocBaseDTO
implements Serializable {
    private Long id;
    private String code;
    private MultilingualVO name;
    private MultilingualVO brandDesc;
    private MultilingualVO randKeywords;
    private Long brandClass;
    private String brandClassCode;
    private String brandClassName;
    private String brandLogo;
    private MultilingualVO brandUrl;
    private String adImage;
    private Integer orderNumber;
    private Boolean stopStatus;
    private String pubts;
    private List<ProductTplBrandDTO> productTplBrands;
    private Map<String, Object> brandCharacterDef;

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public MultilingualVO getName() {
        return this.name;
    }

    public MultilingualVO getBrandDesc() {
        return this.brandDesc;
    }

    public MultilingualVO getRandKeywords() {
        return this.randKeywords;
    }

    public Long getBrandClass() {
        return this.brandClass;
    }

    public String getBrandClassCode() {
        return this.brandClassCode;
    }

    public String getBrandClassName() {
        return this.brandClassName;
    }

    public String getBrandLogo() {
        return this.brandLogo;
    }

    public MultilingualVO getBrandUrl() {
        return this.brandUrl;
    }

    public String getAdImage() {
        return this.adImage;
    }

    public Integer getOrderNumber() {
        return this.orderNumber;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public String getPubts() {
        return this.pubts;
    }

    public List<ProductTplBrandDTO> getProductTplBrands() {
        return this.productTplBrands;
    }

    public Map<String, Object> getBrandCharacterDef() {
        return this.brandCharacterDef;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(MultilingualVO name) {
        this.name = name;
    }

    public void setBrandDesc(MultilingualVO brandDesc) {
        this.brandDesc = brandDesc;
    }

    public void setRandKeywords(MultilingualVO randKeywords) {
        this.randKeywords = randKeywords;
    }

    public void setBrandClass(Long brandClass) {
        this.brandClass = brandClass;
    }

    public void setBrandClassCode(String brandClassCode) {
        this.brandClassCode = brandClassCode;
    }

    public void setBrandClassName(String brandClassName) {
        this.brandClassName = brandClassName;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public void setBrandUrl(MultilingualVO brandUrl) {
        this.brandUrl = brandUrl;
    }

    public void setAdImage(String adImage) {
        this.adImage = adImage;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public void setProductTplBrands(List<ProductTplBrandDTO> productTplBrands) {
        this.productTplBrands = productTplBrands;
    }

    public void setBrandCharacterDef(Map<String, Object> brandCharacterDef) {
        this.brandCharacterDef = brandCharacterDef;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BrandDTO)) {
            return false;
        }
        BrandDTO other = (BrandDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$brandClass = this.getBrandClass();
        Long other$brandClass = other.getBrandClass();
        if (this$brandClass == null ? other$brandClass != null : !((Object)this$brandClass).equals(other$brandClass)) {
            return false;
        }
        Integer this$orderNumber = this.getOrderNumber();
        Integer other$orderNumber = other.getOrderNumber();
        if (this$orderNumber == null ? other$orderNumber != null : !((Object)this$orderNumber).equals(other$orderNumber)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
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
        MultilingualVO this$brandDesc = this.getBrandDesc();
        MultilingualVO other$brandDesc = other.getBrandDesc();
        if (this$brandDesc == null ? other$brandDesc != null : !((Object)this$brandDesc).equals(other$brandDesc)) {
            return false;
        }
        MultilingualVO this$randKeywords = this.getRandKeywords();
        MultilingualVO other$randKeywords = other.getRandKeywords();
        if (this$randKeywords == null ? other$randKeywords != null : !((Object)this$randKeywords).equals(other$randKeywords)) {
            return false;
        }
        String this$brandClassCode = this.getBrandClassCode();
        String other$brandClassCode = other.getBrandClassCode();
        if (this$brandClassCode == null ? other$brandClassCode != null : !this$brandClassCode.equals(other$brandClassCode)) {
            return false;
        }
        String this$brandClassName = this.getBrandClassName();
        String other$brandClassName = other.getBrandClassName();
        if (this$brandClassName == null ? other$brandClassName != null : !this$brandClassName.equals(other$brandClassName)) {
            return false;
        }
        String this$brandLogo = this.getBrandLogo();
        String other$brandLogo = other.getBrandLogo();
        if (this$brandLogo == null ? other$brandLogo != null : !this$brandLogo.equals(other$brandLogo)) {
            return false;
        }
        MultilingualVO this$brandUrl = this.getBrandUrl();
        MultilingualVO other$brandUrl = other.getBrandUrl();
        if (this$brandUrl == null ? other$brandUrl != null : !((Object)this$brandUrl).equals(other$brandUrl)) {
            return false;
        }
        String this$adImage = this.getAdImage();
        String other$adImage = other.getAdImage();
        if (this$adImage == null ? other$adImage != null : !this$adImage.equals(other$adImage)) {
            return false;
        }
        String this$pubts = this.getPubts();
        String other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !this$pubts.equals(other$pubts)) {
            return false;
        }
        List<ProductTplBrandDTO> this$productTplBrands = this.getProductTplBrands();
        List<ProductTplBrandDTO> other$productTplBrands = other.getProductTplBrands();
        if (this$productTplBrands == null ? other$productTplBrands != null : !((Object)this$productTplBrands).equals(other$productTplBrands)) {
            return false;
        }
        Map<String, Object> this$brandCharacterDef = this.getBrandCharacterDef();
        Map<String, Object> other$brandCharacterDef = other.getBrandCharacterDef();
        return !(this$brandCharacterDef == null ? other$brandCharacterDef != null : !((Object)this$brandCharacterDef).equals(other$brandCharacterDef));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof BrandDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $brandClass = this.getBrandClass();
        result = result * 59 + ($brandClass == null ? 43 : ((Object)$brandClass).hashCode());
        Integer $orderNumber = this.getOrderNumber();
        result = result * 59 + ($orderNumber == null ? 43 : ((Object)$orderNumber).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        MultilingualVO $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        MultilingualVO $brandDesc = this.getBrandDesc();
        result = result * 59 + ($brandDesc == null ? 43 : $brandDesc.hashCode());
        MultilingualVO $randKeywords = this.getRandKeywords();
        result = result * 59 + ($randKeywords == null ? 43 : $randKeywords.hashCode());
        String $brandClassCode = this.getBrandClassCode();
        result = result * 59 + ($brandClassCode == null ? 43 : $brandClassCode.hashCode());
        String $brandClassName = this.getBrandClassName();
        result = result * 59 + ($brandClassName == null ? 43 : $brandClassName.hashCode());
        String $brandLogo = this.getBrandLogo();
        result = result * 59 + ($brandLogo == null ? 43 : $brandLogo.hashCode());
        MultilingualVO $brandUrl = this.getBrandUrl();
        result = result * 59 + ($brandUrl == null ? 43 : $brandUrl.hashCode());
        String $adImage = this.getAdImage();
        result = result * 59 + ($adImage == null ? 43 : $adImage.hashCode());
        String $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : $pubts.hashCode());
        List<ProductTplBrandDTO> $productTplBrands = this.getProductTplBrands();
        result = result * 59 + ($productTplBrands == null ? 43 : ((Object)$productTplBrands).hashCode());
        Map<String, Object> $brandCharacterDef = this.getBrandCharacterDef();
        result = result * 59 + ($brandCharacterDef == null ? 43 : ((Object)$brandCharacterDef).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "BrandDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", brandDesc=" + this.getBrandDesc() + ", randKeywords=" + this.getRandKeywords() + ", brandClass=" + this.getBrandClass() + ", brandClassCode=" + this.getBrandClassCode() + ", brandClassName=" + this.getBrandClassName() + ", brandLogo=" + this.getBrandLogo() + ", brandUrl=" + this.getBrandUrl() + ", adImage=" + this.getAdImage() + ", orderNumber=" + this.getOrderNumber() + ", stopStatus=" + this.getStopStatus() + ", pubts=" + this.getPubts() + ", productTplBrands=" + this.getProductTplBrands() + ", brandCharacterDef=" + this.getBrandCharacterDef() + ")";
    }
}

