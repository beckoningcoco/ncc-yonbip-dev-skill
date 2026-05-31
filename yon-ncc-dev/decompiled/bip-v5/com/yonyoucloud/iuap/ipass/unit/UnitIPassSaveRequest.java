/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.fasterxml.jackson.annotation.JsonProperty
 */
package com.yonyoucloud.iuap.ipass.unit;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class UnitIPassSaveRequest
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String code;
    private String name;
    private String name_en_US;
    private String name_zh_TW;
    private String precision;
    private String truncationType;
    @JsonProperty(value="bBaseUnit")
    private Boolean bBaseUnit;
    private BigDecimal convertCoefficient;
    private Long unitGroup;
    private String unitGroupCode;
    private String unitGroup_name;
    private String stopstatus;
    private String creator;
    private String createDate;
    private String createTime;
    private String _status;
    private String sourceUnique;

    public String getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getName_en_US() {
        return this.name_en_US;
    }

    public String getName_zh_TW() {
        return this.name_zh_TW;
    }

    public String getPrecision() {
        return this.precision;
    }

    public String getTruncationType() {
        return this.truncationType;
    }

    public Boolean getBBaseUnit() {
        return this.bBaseUnit;
    }

    public BigDecimal getConvertCoefficient() {
        return this.convertCoefficient;
    }

    public Long getUnitGroup() {
        return this.unitGroup;
    }

    public String getUnitGroupCode() {
        return this.unitGroupCode;
    }

    public String getUnitGroup_name() {
        return this.unitGroup_name;
    }

    public String getStopstatus() {
        return this.stopstatus;
    }

    public String getCreator() {
        return this.creator;
    }

    public String getCreateDate() {
        return this.createDate;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String get_status() {
        return this._status;
    }

    public String getSourceUnique() {
        return this.sourceUnique;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName_en_US(String name_en_US) {
        this.name_en_US = name_en_US;
    }

    public void setName_zh_TW(String name_zh_TW) {
        this.name_zh_TW = name_zh_TW;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }

    public void setTruncationType(String truncationType) {
        this.truncationType = truncationType;
    }

    @JsonProperty(value="bBaseUnit")
    public void setBBaseUnit(Boolean bBaseUnit) {
        this.bBaseUnit = bBaseUnit;
    }

    public void setConvertCoefficient(BigDecimal convertCoefficient) {
        this.convertCoefficient = convertCoefficient;
    }

    public void setUnitGroup(Long unitGroup) {
        this.unitGroup = unitGroup;
    }

    public void setUnitGroupCode(String unitGroupCode) {
        this.unitGroupCode = unitGroupCode;
    }

    public void setUnitGroup_name(String unitGroup_name) {
        this.unitGroup_name = unitGroup_name;
    }

    public void setStopstatus(String stopstatus) {
        this.stopstatus = stopstatus;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public void setSourceUnique(String sourceUnique) {
        this.sourceUnique = sourceUnique;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UnitIPassSaveRequest)) {
            return false;
        }
        UnitIPassSaveRequest other = (UnitIPassSaveRequest)o;
        if (!other.canEqual(this)) {
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
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$name_en_US = this.getName_en_US();
        String other$name_en_US = other.getName_en_US();
        if (this$name_en_US == null ? other$name_en_US != null : !this$name_en_US.equals(other$name_en_US)) {
            return false;
        }
        String this$name_zh_TW = this.getName_zh_TW();
        String other$name_zh_TW = other.getName_zh_TW();
        if (this$name_zh_TW == null ? other$name_zh_TW != null : !this$name_zh_TW.equals(other$name_zh_TW)) {
            return false;
        }
        String this$precision = this.getPrecision();
        String other$precision = other.getPrecision();
        if (this$precision == null ? other$precision != null : !this$precision.equals(other$precision)) {
            return false;
        }
        String this$truncationType = this.getTruncationType();
        String other$truncationType = other.getTruncationType();
        if (this$truncationType == null ? other$truncationType != null : !this$truncationType.equals(other$truncationType)) {
            return false;
        }
        BigDecimal this$convertCoefficient = this.getConvertCoefficient();
        BigDecimal other$convertCoefficient = other.getConvertCoefficient();
        if (this$convertCoefficient == null ? other$convertCoefficient != null : !((Object)this$convertCoefficient).equals(other$convertCoefficient)) {
            return false;
        }
        String this$unitGroupCode = this.getUnitGroupCode();
        String other$unitGroupCode = other.getUnitGroupCode();
        if (this$unitGroupCode == null ? other$unitGroupCode != null : !this$unitGroupCode.equals(other$unitGroupCode)) {
            return false;
        }
        String this$unitGroup_name = this.getUnitGroup_name();
        String other$unitGroup_name = other.getUnitGroup_name();
        if (this$unitGroup_name == null ? other$unitGroup_name != null : !this$unitGroup_name.equals(other$unitGroup_name)) {
            return false;
        }
        String this$stopstatus = this.getStopstatus();
        String other$stopstatus = other.getStopstatus();
        if (this$stopstatus == null ? other$stopstatus != null : !this$stopstatus.equals(other$stopstatus)) {
            return false;
        }
        String this$creator = this.getCreator();
        String other$creator = other.getCreator();
        if (this$creator == null ? other$creator != null : !this$creator.equals(other$creator)) {
            return false;
        }
        String this$createDate = this.getCreateDate();
        String other$createDate = other.getCreateDate();
        if (this$createDate == null ? other$createDate != null : !this$createDate.equals(other$createDate)) {
            return false;
        }
        String this$createTime = this.getCreateTime();
        String other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) {
            return false;
        }
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        if (this$_status == null ? other$_status != null : !this$_status.equals(other$_status)) {
            return false;
        }
        String this$sourceUnique = this.getSourceUnique();
        String other$sourceUnique = other.getSourceUnique();
        return !(this$sourceUnique == null ? other$sourceUnique != null : !this$sourceUnique.equals(other$sourceUnique));
    }

    protected boolean canEqual(Object other) {
        return other instanceof UnitIPassSaveRequest;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $bBaseUnit = this.getBBaseUnit();
        result = result * 59 + ($bBaseUnit == null ? 43 : ((Object)$bBaseUnit).hashCode());
        Long $unitGroup = this.getUnitGroup();
        result = result * 59 + ($unitGroup == null ? 43 : ((Object)$unitGroup).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $name_en_US = this.getName_en_US();
        result = result * 59 + ($name_en_US == null ? 43 : $name_en_US.hashCode());
        String $name_zh_TW = this.getName_zh_TW();
        result = result * 59 + ($name_zh_TW == null ? 43 : $name_zh_TW.hashCode());
        String $precision = this.getPrecision();
        result = result * 59 + ($precision == null ? 43 : $precision.hashCode());
        String $truncationType = this.getTruncationType();
        result = result * 59 + ($truncationType == null ? 43 : $truncationType.hashCode());
        BigDecimal $convertCoefficient = this.getConvertCoefficient();
        result = result * 59 + ($convertCoefficient == null ? 43 : ((Object)$convertCoefficient).hashCode());
        String $unitGroupCode = this.getUnitGroupCode();
        result = result * 59 + ($unitGroupCode == null ? 43 : $unitGroupCode.hashCode());
        String $unitGroup_name = this.getUnitGroup_name();
        result = result * 59 + ($unitGroup_name == null ? 43 : $unitGroup_name.hashCode());
        String $stopstatus = this.getStopstatus();
        result = result * 59 + ($stopstatus == null ? 43 : $stopstatus.hashCode());
        String $creator = this.getCreator();
        result = result * 59 + ($creator == null ? 43 : $creator.hashCode());
        String $createDate = this.getCreateDate();
        result = result * 59 + ($createDate == null ? 43 : $createDate.hashCode());
        String $createTime = this.getCreateTime();
        result = result * 59 + ($createTime == null ? 43 : $createTime.hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        String $sourceUnique = this.getSourceUnique();
        result = result * 59 + ($sourceUnique == null ? 43 : $sourceUnique.hashCode());
        return result;
    }

    public String toString() {
        return "UnitIPassSaveRequest(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", name_en_US=" + this.getName_en_US() + ", name_zh_TW=" + this.getName_zh_TW() + ", precision=" + this.getPrecision() + ", truncationType=" + this.getTruncationType() + ", bBaseUnit=" + this.getBBaseUnit() + ", convertCoefficient=" + this.getConvertCoefficient() + ", unitGroup=" + this.getUnitGroup() + ", unitGroupCode=" + this.getUnitGroupCode() + ", unitGroup_name=" + this.getUnitGroup_name() + ", stopstatus=" + this.getStopstatus() + ", creator=" + this.getCreator() + ", createDate=" + this.getCreateDate() + ", createTime=" + this.getCreateTime() + ", _status=" + this.get_status() + ", sourceUnique=" + this.getSourceUnique() + ")";
    }
}

