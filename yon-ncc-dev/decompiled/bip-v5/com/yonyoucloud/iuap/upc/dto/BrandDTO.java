/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class BrandDTO
implements Serializable {
    private Long id;
    private String name;
    private String code;
    private String brandUrl;
    private String brandDesc;
    private String randKeywords;
    private Long brandClass;
    private String brandClassCode;
    private String brandClassName;
    private String brandLogo;
    private Integer ordernumber;
    private Boolean stopStatus;

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public String getBrandUrl() {
        return this.brandUrl;
    }

    public String getBrandDesc() {
        return this.brandDesc;
    }

    public String getRandKeywords() {
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

    public Integer getOrdernumber() {
        return this.ordernumber;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBrandUrl(String brandUrl) {
        this.brandUrl = brandUrl;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc;
    }

    public void setRandKeywords(String randKeywords) {
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

    public void setOrdernumber(Integer ordernumber) {
        this.ordernumber = ordernumber;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

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
        Integer this$ordernumber = this.getOrdernumber();
        Integer other$ordernumber = other.getOrdernumber();
        if (this$ordernumber == null ? other$ordernumber != null : !((Object)this$ordernumber).equals(other$ordernumber)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$brandUrl = this.getBrandUrl();
        String other$brandUrl = other.getBrandUrl();
        if (this$brandUrl == null ? other$brandUrl != null : !this$brandUrl.equals(other$brandUrl)) {
            return false;
        }
        String this$brandDesc = this.getBrandDesc();
        String other$brandDesc = other.getBrandDesc();
        if (this$brandDesc == null ? other$brandDesc != null : !this$brandDesc.equals(other$brandDesc)) {
            return false;
        }
        String this$randKeywords = this.getRandKeywords();
        String other$randKeywords = other.getRandKeywords();
        if (this$randKeywords == null ? other$randKeywords != null : !this$randKeywords.equals(other$randKeywords)) {
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
        return !(this$brandLogo == null ? other$brandLogo != null : !this$brandLogo.equals(other$brandLogo));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BrandDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $brandClass = this.getBrandClass();
        result = result * 59 + ($brandClass == null ? 43 : ((Object)$brandClass).hashCode());
        Integer $ordernumber = this.getOrdernumber();
        result = result * 59 + ($ordernumber == null ? 43 : ((Object)$ordernumber).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $brandUrl = this.getBrandUrl();
        result = result * 59 + ($brandUrl == null ? 43 : $brandUrl.hashCode());
        String $brandDesc = this.getBrandDesc();
        result = result * 59 + ($brandDesc == null ? 43 : $brandDesc.hashCode());
        String $randKeywords = this.getRandKeywords();
        result = result * 59 + ($randKeywords == null ? 43 : $randKeywords.hashCode());
        String $brandClassCode = this.getBrandClassCode();
        result = result * 59 + ($brandClassCode == null ? 43 : $brandClassCode.hashCode());
        String $brandClassName = this.getBrandClassName();
        result = result * 59 + ($brandClassName == null ? 43 : $brandClassName.hashCode());
        String $brandLogo = this.getBrandLogo();
        result = result * 59 + ($brandLogo == null ? 43 : $brandLogo.hashCode());
        return result;
    }

    public String toString() {
        return "BrandDTO(id=" + this.getId() + ", name=" + this.getName() + ", code=" + this.getCode() + ", brandUrl=" + this.getBrandUrl() + ", brandDesc=" + this.getBrandDesc() + ", randKeywords=" + this.getRandKeywords() + ", brandClass=" + this.getBrandClass() + ", brandClassCode=" + this.getBrandClassCode() + ", brandClassName=" + this.getBrandClassName() + ", brandLogo=" + this.getBrandLogo() + ", ordernumber=" + this.getOrdernumber() + ", stopStatus=" + this.getStopStatus() + ")";
    }
}

