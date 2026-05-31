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
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class UnitDTO
extends CoredocBaseDTO
implements Serializable {
    private Long id;
    private MultilingualVO name;
    private String code;
    private Integer precision;
    private Integer truncationType;
    private BigDecimal convertCoefficient;
    private Boolean baseUnit;
    private Long unitGroup;
    private String unitGroupCode;
    private String erpCode;
    private Boolean stopStatus;
    private String pubts;
    private Map<String, Object> unitCharacter;

    public Long getId() {
        return this.id;
    }

    public MultilingualVO getName() {
        return this.name;
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

    public Boolean getBaseUnit() {
        return this.baseUnit;
    }

    public Long getUnitGroup() {
        return this.unitGroup;
    }

    public String getUnitGroupCode() {
        return this.unitGroupCode;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public String getPubts() {
        return this.pubts;
    }

    public Map<String, Object> getUnitCharacter() {
        return this.unitCharacter;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(MultilingualVO name) {
        this.name = name;
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

    public void setBaseUnit(Boolean baseUnit) {
        this.baseUnit = baseUnit;
    }

    public void setUnitGroup(Long unitGroup) {
        this.unitGroup = unitGroup;
    }

    public void setUnitGroupCode(String unitGroupCode) {
        this.unitGroupCode = unitGroupCode;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public void setUnitCharacter(Map<String, Object> unitCharacter) {
        this.unitCharacter = unitCharacter;
    }

    @Override
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
        Boolean this$baseUnit = this.getBaseUnit();
        Boolean other$baseUnit = other.getBaseUnit();
        if (this$baseUnit == null ? other$baseUnit != null : !((Object)this$baseUnit).equals(other$baseUnit)) {
            return false;
        }
        Long this$unitGroup = this.getUnitGroup();
        Long other$unitGroup = other.getUnitGroup();
        if (this$unitGroup == null ? other$unitGroup != null : !((Object)this$unitGroup).equals(other$unitGroup)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        MultilingualVO this$name = this.getName();
        MultilingualVO other$name = other.getName();
        if (this$name == null ? other$name != null : !((Object)this$name).equals(other$name)) {
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
        String this$unitGroupCode = this.getUnitGroupCode();
        String other$unitGroupCode = other.getUnitGroupCode();
        if (this$unitGroupCode == null ? other$unitGroupCode != null : !this$unitGroupCode.equals(other$unitGroupCode)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        String this$pubts = this.getPubts();
        String other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !this$pubts.equals(other$pubts)) {
            return false;
        }
        Map<String, Object> this$unitCharacter = this.getUnitCharacter();
        Map<String, Object> other$unitCharacter = other.getUnitCharacter();
        return !(this$unitCharacter == null ? other$unitCharacter != null : !((Object)this$unitCharacter).equals(other$unitCharacter));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof UnitDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $precision = this.getPrecision();
        result = result * 59 + ($precision == null ? 43 : ((Object)$precision).hashCode());
        Integer $truncationType = this.getTruncationType();
        result = result * 59 + ($truncationType == null ? 43 : ((Object)$truncationType).hashCode());
        Boolean $baseUnit = this.getBaseUnit();
        result = result * 59 + ($baseUnit == null ? 43 : ((Object)$baseUnit).hashCode());
        Long $unitGroup = this.getUnitGroup();
        result = result * 59 + ($unitGroup == null ? 43 : ((Object)$unitGroup).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        MultilingualVO $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        BigDecimal $convertCoefficient = this.getConvertCoefficient();
        result = result * 59 + ($convertCoefficient == null ? 43 : ((Object)$convertCoefficient).hashCode());
        String $unitGroupCode = this.getUnitGroupCode();
        result = result * 59 + ($unitGroupCode == null ? 43 : $unitGroupCode.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        String $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : $pubts.hashCode());
        Map<String, Object> $unitCharacter = this.getUnitCharacter();
        result = result * 59 + ($unitCharacter == null ? 43 : ((Object)$unitCharacter).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "UnitDTO(id=" + this.getId() + ", name=" + this.getName() + ", code=" + this.getCode() + ", precision=" + this.getPrecision() + ", truncationType=" + this.getTruncationType() + ", convertCoefficient=" + this.getConvertCoefficient() + ", baseUnit=" + this.getBaseUnit() + ", unitGroup=" + this.getUnitGroup() + ", unitGroupCode=" + this.getUnitGroupCode() + ", erpCode=" + this.getErpCode() + ", stopStatus=" + this.getStopStatus() + ", pubts=" + this.getPubts() + ", unitCharacter=" + this.getUnitCharacter() + ")";
    }
}

