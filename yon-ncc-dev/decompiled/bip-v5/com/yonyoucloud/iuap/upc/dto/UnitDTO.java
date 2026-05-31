/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.yonyou.iuap.international.MultiLangText
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.international.MultiLangText;
import java.io.Serializable;
import java.math.BigDecimal;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class UnitDTO
implements Serializable {
    private Long id;
    @Deprecated
    private String name;
    private MultiLangText name_multiLangText;
    private String code;
    private Integer precision;
    private Integer truncationType;
    private BigDecimal convertCoefficient;
    private Boolean bBaseUnit;
    private Long unitGroup;
    private String erpCode;
    private String socialSrcid;
    private Integer socialMctype;
    private String socialTenantid;

    public Long getId() {
        return this.id;
    }

    @Deprecated
    public String getName() {
        return this.name;
    }

    public MultiLangText getName_multiLangText() {
        return this.name_multiLangText;
    }

    public String getCode() {
        return this.code;
    }

    public Integer getPrecision() {
        return this.precision;
    }

    public Integer getTruncationType() {
        return this.truncationType;
    }

    public BigDecimal getConvertCoefficient() {
        return this.convertCoefficient;
    }

    public Boolean getBBaseUnit() {
        return this.bBaseUnit;
    }

    public Long getUnitGroup() {
        return this.unitGroup;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public String getSocialSrcid() {
        return this.socialSrcid;
    }

    public Integer getSocialMctype() {
        return this.socialMctype;
    }

    public String getSocialTenantid() {
        return this.socialTenantid;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Deprecated
    public void setName(String name) {
        this.name = name;
    }

    public void setName_multiLangText(MultiLangText name_multiLangText) {
        this.name_multiLangText = name_multiLangText;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public void setTruncationType(Integer truncationType) {
        this.truncationType = truncationType;
    }

    public void setConvertCoefficient(BigDecimal convertCoefficient) {
        this.convertCoefficient = convertCoefficient;
    }

    public void setBBaseUnit(Boolean bBaseUnit) {
        this.bBaseUnit = bBaseUnit;
    }

    public void setUnitGroup(Long unitGroup) {
        this.unitGroup = unitGroup;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setSocialSrcid(String socialSrcid) {
        this.socialSrcid = socialSrcid;
    }

    public void setSocialMctype(Integer socialMctype) {
        this.socialMctype = socialMctype;
    }

    public void setSocialTenantid(String socialTenantid) {
        this.socialTenantid = socialTenantid;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UnitDTO)) {
            return false;
        }
        UnitDTO other = (UnitDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$precision = this.getPrecision();
        Integer other$precision = other.getPrecision();
        if (this$precision == null ? other$precision != null : !((Object)this$precision).equals(other$precision)) {
            return false;
        }
        Integer this$truncationType = this.getTruncationType();
        Integer other$truncationType = other.getTruncationType();
        if (this$truncationType == null ? other$truncationType != null : !((Object)this$truncationType).equals(other$truncationType)) {
            return false;
        }
        Boolean this$bBaseUnit = this.getBBaseUnit();
        Boolean other$bBaseUnit = other.getBBaseUnit();
        if (this$bBaseUnit == null ? other$bBaseUnit != null : !((Object)this$bBaseUnit).equals(other$bBaseUnit)) {
            return false;
        }
        Long this$unitGroup = this.getUnitGroup();
        Long other$unitGroup = other.getUnitGroup();
        if (this$unitGroup == null ? other$unitGroup != null : !((Object)this$unitGroup).equals(other$unitGroup)) {
            return false;
        }
        Integer this$socialMctype = this.getSocialMctype();
        Integer other$socialMctype = other.getSocialMctype();
        if (this$socialMctype == null ? other$socialMctype != null : !((Object)this$socialMctype).equals(other$socialMctype)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        MultiLangText this$name_multiLangText = this.getName_multiLangText();
        MultiLangText other$name_multiLangText = other.getName_multiLangText();
        if (this$name_multiLangText == null ? other$name_multiLangText != null : !this$name_multiLangText.equals(other$name_multiLangText)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        BigDecimal this$convertCoefficient = this.getConvertCoefficient();
        BigDecimal other$convertCoefficient = other.getConvertCoefficient();
        if (this$convertCoefficient == null ? other$convertCoefficient != null : !((Object)this$convertCoefficient).equals(other$convertCoefficient)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        String this$socialSrcid = this.getSocialSrcid();
        String other$socialSrcid = other.getSocialSrcid();
        if (this$socialSrcid == null ? other$socialSrcid != null : !this$socialSrcid.equals(other$socialSrcid)) {
            return false;
        }
        String this$socialTenantid = this.getSocialTenantid();
        String other$socialTenantid = other.getSocialTenantid();
        return !(this$socialTenantid == null ? other$socialTenantid != null : !this$socialTenantid.equals(other$socialTenantid));
    }

    protected boolean canEqual(Object other) {
        return other instanceof UnitDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $precision = this.getPrecision();
        result = result * 59 + ($precision == null ? 43 : ((Object)$precision).hashCode());
        Integer $truncationType = this.getTruncationType();
        result = result * 59 + ($truncationType == null ? 43 : ((Object)$truncationType).hashCode());
        Boolean $bBaseUnit = this.getBBaseUnit();
        result = result * 59 + ($bBaseUnit == null ? 43 : ((Object)$bBaseUnit).hashCode());
        Long $unitGroup = this.getUnitGroup();
        result = result * 59 + ($unitGroup == null ? 43 : ((Object)$unitGroup).hashCode());
        Integer $socialMctype = this.getSocialMctype();
        result = result * 59 + ($socialMctype == null ? 43 : ((Object)$socialMctype).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        MultiLangText $name_multiLangText = this.getName_multiLangText();
        result = result * 59 + ($name_multiLangText == null ? 43 : $name_multiLangText.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        BigDecimal $convertCoefficient = this.getConvertCoefficient();
        result = result * 59 + ($convertCoefficient == null ? 43 : ((Object)$convertCoefficient).hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        String $socialSrcid = this.getSocialSrcid();
        result = result * 59 + ($socialSrcid == null ? 43 : $socialSrcid.hashCode());
        String $socialTenantid = this.getSocialTenantid();
        result = result * 59 + ($socialTenantid == null ? 43 : $socialTenantid.hashCode());
        return result;
    }

    public String toString() {
        return "UnitDTO(id=" + this.getId() + ", name=" + this.getName() + ", name_multiLangText=" + this.getName_multiLangText() + ", code=" + this.getCode() + ", precision=" + this.getPrecision() + ", truncationType=" + this.getTruncationType() + ", convertCoefficient=" + this.getConvertCoefficient() + ", bBaseUnit=" + this.getBBaseUnit() + ", unitGroup=" + this.getUnitGroup() + ", erpCode=" + this.getErpCode() + ", socialSrcid=" + this.getSocialSrcid() + ", socialMctype=" + this.getSocialMctype() + ", socialTenantid=" + this.getSocialTenantid() + ")";
    }
}

