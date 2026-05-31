/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.brand;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.derivatives.ProductTplBrandDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class BrandIPassSaveRequest
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String code;
    private MultilingualVO name;
    private String brandClassCode;
    private Integer orderNumber;
    private Boolean stopStatus;
    private MultilingualVO randKeywords;
    private MultilingualVO brandDesc;
    private MultilingualVO brandUrl;
    private String adImage;
    private String brandLogo;
    private Map<String, Object> brandCharacterDef;
    private List<ProductTplBrandDTO> productTplBrands;
    private String sourceUnique;
    private String _status;

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public MultilingualVO getName() {
        return this.name;
    }

    public String getBrandClassCode() {
        return this.brandClassCode;
    }

    public Integer getOrderNumber() {
        return this.orderNumber;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public MultilingualVO getRandKeywords() {
        return this.randKeywords;
    }

    public MultilingualVO getBrandDesc() {
        return this.brandDesc;
    }

    public MultilingualVO getBrandUrl() {
        return this.brandUrl;
    }

    public String getAdImage() {
        return this.adImage;
    }

    public String getBrandLogo() {
        return this.brandLogo;
    }

    public Map<String, Object> getBrandCharacterDef() {
        return this.brandCharacterDef;
    }

    public List<ProductTplBrandDTO> getProductTplBrands() {
        return this.productTplBrands;
    }

    public String getSourceUnique() {
        return this.sourceUnique;
    }

    public String get_status() {
        return this._status;
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

    public void setBrandClassCode(String brandClassCode) {
        this.brandClassCode = brandClassCode;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setRandKeywords(MultilingualVO randKeywords) {
        this.randKeywords = randKeywords;
    }

    public void setBrandDesc(MultilingualVO brandDesc) {
        this.brandDesc = brandDesc;
    }

    public void setBrandUrl(MultilingualVO brandUrl) {
        this.brandUrl = brandUrl;
    }

    public void setAdImage(String adImage) {
        this.adImage = adImage;
    }

    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    public void setBrandCharacterDef(Map<String, Object> brandCharacterDef) {
        this.brandCharacterDef = brandCharacterDef;
    }

    public void setProductTplBrands(List<ProductTplBrandDTO> productTplBrands) {
        this.productTplBrands = productTplBrands;
    }

    public void setSourceUnique(String sourceUnique) {
        this.sourceUnique = sourceUnique;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BrandIPassSaveRequest)) {
            return false;
        }
        BrandIPassSaveRequest other = (BrandIPassSaveRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
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
        String this$brandClassCode = this.getBrandClassCode();
        String other$brandClassCode = other.getBrandClassCode();
        if (this$brandClassCode == null ? other$brandClassCode != null : !this$brandClassCode.equals(other$brandClassCode)) {
            return false;
        }
        MultilingualVO this$randKeywords = this.getRandKeywords();
        MultilingualVO other$randKeywords = other.getRandKeywords();
        if (this$randKeywords == null ? other$randKeywords != null : !((Object)this$randKeywords).equals(other$randKeywords)) {
            return false;
        }
        MultilingualVO this$brandDesc = this.getBrandDesc();
        MultilingualVO other$brandDesc = other.getBrandDesc();
        if (this$brandDesc == null ? other$brandDesc != null : !((Object)this$brandDesc).equals(other$brandDesc)) {
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
        String this$brandLogo = this.getBrandLogo();
        String other$brandLogo = other.getBrandLogo();
        if (this$brandLogo == null ? other$brandLogo != null : !this$brandLogo.equals(other$brandLogo)) {
            return false;
        }
        Map<String, Object> this$brandCharacterDef = this.getBrandCharacterDef();
        Map<String, Object> other$brandCharacterDef = other.getBrandCharacterDef();
        if (this$brandCharacterDef == null ? other$brandCharacterDef != null : !((Object)this$brandCharacterDef).equals(other$brandCharacterDef)) {
            return false;
        }
        List<ProductTplBrandDTO> this$productTplBrands = this.getProductTplBrands();
        List<ProductTplBrandDTO> other$productTplBrands = other.getProductTplBrands();
        if (this$productTplBrands == null ? other$productTplBrands != null : !((Object)this$productTplBrands).equals(other$productTplBrands)) {
            return false;
        }
        String this$sourceUnique = this.getSourceUnique();
        String other$sourceUnique = other.getSourceUnique();
        if (this$sourceUnique == null ? other$sourceUnique != null : !this$sourceUnique.equals(other$sourceUnique)) {
            return false;
        }
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        return !(this$_status == null ? other$_status != null : !this$_status.equals(other$_status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BrandIPassSaveRequest;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $orderNumber = this.getOrderNumber();
        result = result * 59 + ($orderNumber == null ? 43 : ((Object)$orderNumber).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        MultilingualVO $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $brandClassCode = this.getBrandClassCode();
        result = result * 59 + ($brandClassCode == null ? 43 : $brandClassCode.hashCode());
        MultilingualVO $randKeywords = this.getRandKeywords();
        result = result * 59 + ($randKeywords == null ? 43 : $randKeywords.hashCode());
        MultilingualVO $brandDesc = this.getBrandDesc();
        result = result * 59 + ($brandDesc == null ? 43 : $brandDesc.hashCode());
        MultilingualVO $brandUrl = this.getBrandUrl();
        result = result * 59 + ($brandUrl == null ? 43 : $brandUrl.hashCode());
        String $adImage = this.getAdImage();
        result = result * 59 + ($adImage == null ? 43 : $adImage.hashCode());
        String $brandLogo = this.getBrandLogo();
        result = result * 59 + ($brandLogo == null ? 43 : $brandLogo.hashCode());
        Map<String, Object> $brandCharacterDef = this.getBrandCharacterDef();
        result = result * 59 + ($brandCharacterDef == null ? 43 : ((Object)$brandCharacterDef).hashCode());
        List<ProductTplBrandDTO> $productTplBrands = this.getProductTplBrands();
        result = result * 59 + ($productTplBrands == null ? 43 : ((Object)$productTplBrands).hashCode());
        String $sourceUnique = this.getSourceUnique();
        result = result * 59 + ($sourceUnique == null ? 43 : $sourceUnique.hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        return result;
    }

    public String toString() {
        return "BrandIPassSaveRequest(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", brandClassCode=" + this.getBrandClassCode() + ", orderNumber=" + this.getOrderNumber() + ", stopStatus=" + this.getStopStatus() + ", randKeywords=" + this.getRandKeywords() + ", brandDesc=" + this.getBrandDesc() + ", brandUrl=" + this.getBrandUrl() + ", adImage=" + this.getAdImage() + ", brandLogo=" + this.getBrandLogo() + ", brandCharacterDef=" + this.getBrandCharacterDef() + ", productTplBrands=" + this.getProductTplBrands() + ", sourceUnique=" + this.getSourceUnique() + ", _status=" + this.get_status() + ")";
    }
}

