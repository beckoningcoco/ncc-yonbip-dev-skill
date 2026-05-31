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
import java.math.BigDecimal;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductAsistUnitDTO
implements Serializable {
    private Long productId;
    private Boolean enableAssistUnit;
    private Long unit;
    private String unitCode;
    private String unitName;
    private Integer unitPrecision;
    private Integer unitTruncationType;
    private BigDecimal unitConvertCoefficient;
    private BigDecimal mainUnitCount;
    private BigDecimal mainUnitCountNew;
    private BigDecimal mainUnitRate;
    private String assistVerValue;
    private Integer unitExchangeType;
    private Long assistUnit;
    private String assistUnitCode;
    private String assistUnitName;
    private Integer assistUnitPrecision;
    private BigDecimal assistUnitConvertCoefficient;
    private Integer assistUnitTruncationType;
    private BigDecimal assistUnitCount;
    private Integer balance;

    public Long getProductId() {
        return this.productId;
    }

    public Boolean getEnableAssistUnit() {
        return this.enableAssistUnit;
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

    public Integer getUnitPrecision() {
        return this.unitPrecision;
    }

    public Integer getUnitTruncationType() {
        return this.unitTruncationType;
    }

    public BigDecimal getUnitConvertCoefficient() {
        return this.unitConvertCoefficient;
    }

    public BigDecimal getMainUnitCount() {
        return this.mainUnitCount;
    }

    public BigDecimal getMainUnitCountNew() {
        return this.mainUnitCountNew;
    }

    public BigDecimal getMainUnitRate() {
        return this.mainUnitRate;
    }

    public String getAssistVerValue() {
        return this.assistVerValue;
    }

    public Integer getUnitExchangeType() {
        return this.unitExchangeType;
    }

    public Long getAssistUnit() {
        return this.assistUnit;
    }

    public String getAssistUnitCode() {
        return this.assistUnitCode;
    }

    public String getAssistUnitName() {
        return this.assistUnitName;
    }

    public Integer getAssistUnitPrecision() {
        return this.assistUnitPrecision;
    }

    public BigDecimal getAssistUnitConvertCoefficient() {
        return this.assistUnitConvertCoefficient;
    }

    public Integer getAssistUnitTruncationType() {
        return this.assistUnitTruncationType;
    }

    public BigDecimal getAssistUnitCount() {
        return this.assistUnitCount;
    }

    public Integer getBalance() {
        return this.balance;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setEnableAssistUnit(Boolean enableAssistUnit) {
        this.enableAssistUnit = enableAssistUnit;
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

    public void setUnitPrecision(Integer unitPrecision) {
        this.unitPrecision = unitPrecision;
    }

    public void setUnitTruncationType(Integer unitTruncationType) {
        this.unitTruncationType = unitTruncationType;
    }

    public void setUnitConvertCoefficient(BigDecimal unitConvertCoefficient) {
        this.unitConvertCoefficient = unitConvertCoefficient;
    }

    public void setMainUnitCount(BigDecimal mainUnitCount) {
        this.mainUnitCount = mainUnitCount;
    }

    public void setMainUnitCountNew(BigDecimal mainUnitCountNew) {
        this.mainUnitCountNew = mainUnitCountNew;
    }

    public void setMainUnitRate(BigDecimal mainUnitRate) {
        this.mainUnitRate = mainUnitRate;
    }

    public void setAssistVerValue(String assistVerValue) {
        this.assistVerValue = assistVerValue;
    }

    public void setUnitExchangeType(Integer unitExchangeType) {
        this.unitExchangeType = unitExchangeType;
    }

    public void setAssistUnit(Long assistUnit) {
        this.assistUnit = assistUnit;
    }

    public void setAssistUnitCode(String assistUnitCode) {
        this.assistUnitCode = assistUnitCode;
    }

    public void setAssistUnitName(String assistUnitName) {
        this.assistUnitName = assistUnitName;
    }

    public void setAssistUnitPrecision(Integer assistUnitPrecision) {
        this.assistUnitPrecision = assistUnitPrecision;
    }

    public void setAssistUnitConvertCoefficient(BigDecimal assistUnitConvertCoefficient) {
        this.assistUnitConvertCoefficient = assistUnitConvertCoefficient;
    }

    public void setAssistUnitTruncationType(Integer assistUnitTruncationType) {
        this.assistUnitTruncationType = assistUnitTruncationType;
    }

    public void setAssistUnitCount(BigDecimal assistUnitCount) {
        this.assistUnitCount = assistUnitCount;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductAsistUnitDTO)) {
            return false;
        }
        ProductAsistUnitDTO other = (ProductAsistUnitDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        Boolean this$enableAssistUnit = this.getEnableAssistUnit();
        Boolean other$enableAssistUnit = other.getEnableAssistUnit();
        if (this$enableAssistUnit == null ? other$enableAssistUnit != null : !((Object)this$enableAssistUnit).equals(other$enableAssistUnit)) {
            return false;
        }
        Long this$unit = this.getUnit();
        Long other$unit = other.getUnit();
        if (this$unit == null ? other$unit != null : !((Object)this$unit).equals(other$unit)) {
            return false;
        }
        Integer this$unitPrecision = this.getUnitPrecision();
        Integer other$unitPrecision = other.getUnitPrecision();
        if (this$unitPrecision == null ? other$unitPrecision != null : !((Object)this$unitPrecision).equals(other$unitPrecision)) {
            return false;
        }
        Integer this$unitTruncationType = this.getUnitTruncationType();
        Integer other$unitTruncationType = other.getUnitTruncationType();
        if (this$unitTruncationType == null ? other$unitTruncationType != null : !((Object)this$unitTruncationType).equals(other$unitTruncationType)) {
            return false;
        }
        Integer this$unitExchangeType = this.getUnitExchangeType();
        Integer other$unitExchangeType = other.getUnitExchangeType();
        if (this$unitExchangeType == null ? other$unitExchangeType != null : !((Object)this$unitExchangeType).equals(other$unitExchangeType)) {
            return false;
        }
        Long this$assistUnit = this.getAssistUnit();
        Long other$assistUnit = other.getAssistUnit();
        if (this$assistUnit == null ? other$assistUnit != null : !((Object)this$assistUnit).equals(other$assistUnit)) {
            return false;
        }
        Integer this$assistUnitPrecision = this.getAssistUnitPrecision();
        Integer other$assistUnitPrecision = other.getAssistUnitPrecision();
        if (this$assistUnitPrecision == null ? other$assistUnitPrecision != null : !((Object)this$assistUnitPrecision).equals(other$assistUnitPrecision)) {
            return false;
        }
        Integer this$assistUnitTruncationType = this.getAssistUnitTruncationType();
        Integer other$assistUnitTruncationType = other.getAssistUnitTruncationType();
        if (this$assistUnitTruncationType == null ? other$assistUnitTruncationType != null : !((Object)this$assistUnitTruncationType).equals(other$assistUnitTruncationType)) {
            return false;
        }
        Integer this$balance = this.getBalance();
        Integer other$balance = other.getBalance();
        if (this$balance == null ? other$balance != null : !((Object)this$balance).equals(other$balance)) {
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
        BigDecimal this$unitConvertCoefficient = this.getUnitConvertCoefficient();
        BigDecimal other$unitConvertCoefficient = other.getUnitConvertCoefficient();
        if (this$unitConvertCoefficient == null ? other$unitConvertCoefficient != null : !((Object)this$unitConvertCoefficient).equals(other$unitConvertCoefficient)) {
            return false;
        }
        BigDecimal this$mainUnitCount = this.getMainUnitCount();
        BigDecimal other$mainUnitCount = other.getMainUnitCount();
        if (this$mainUnitCount == null ? other$mainUnitCount != null : !((Object)this$mainUnitCount).equals(other$mainUnitCount)) {
            return false;
        }
        BigDecimal this$mainUnitCountNew = this.getMainUnitCountNew();
        BigDecimal other$mainUnitCountNew = other.getMainUnitCountNew();
        if (this$mainUnitCountNew == null ? other$mainUnitCountNew != null : !((Object)this$mainUnitCountNew).equals(other$mainUnitCountNew)) {
            return false;
        }
        BigDecimal this$mainUnitRate = this.getMainUnitRate();
        BigDecimal other$mainUnitRate = other.getMainUnitRate();
        if (this$mainUnitRate == null ? other$mainUnitRate != null : !((Object)this$mainUnitRate).equals(other$mainUnitRate)) {
            return false;
        }
        String this$assistVerValue = this.getAssistVerValue();
        String other$assistVerValue = other.getAssistVerValue();
        if (this$assistVerValue == null ? other$assistVerValue != null : !this$assistVerValue.equals(other$assistVerValue)) {
            return false;
        }
        String this$assistUnitCode = this.getAssistUnitCode();
        String other$assistUnitCode = other.getAssistUnitCode();
        if (this$assistUnitCode == null ? other$assistUnitCode != null : !this$assistUnitCode.equals(other$assistUnitCode)) {
            return false;
        }
        String this$assistUnitName = this.getAssistUnitName();
        String other$assistUnitName = other.getAssistUnitName();
        if (this$assistUnitName == null ? other$assistUnitName != null : !this$assistUnitName.equals(other$assistUnitName)) {
            return false;
        }
        BigDecimal this$assistUnitConvertCoefficient = this.getAssistUnitConvertCoefficient();
        BigDecimal other$assistUnitConvertCoefficient = other.getAssistUnitConvertCoefficient();
        if (this$assistUnitConvertCoefficient == null ? other$assistUnitConvertCoefficient != null : !((Object)this$assistUnitConvertCoefficient).equals(other$assistUnitConvertCoefficient)) {
            return false;
        }
        BigDecimal this$assistUnitCount = this.getAssistUnitCount();
        BigDecimal other$assistUnitCount = other.getAssistUnitCount();
        return !(this$assistUnitCount == null ? other$assistUnitCount != null : !((Object)this$assistUnitCount).equals(other$assistUnitCount));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductAsistUnitDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Boolean $enableAssistUnit = this.getEnableAssistUnit();
        result = result * 59 + ($enableAssistUnit == null ? 43 : ((Object)$enableAssistUnit).hashCode());
        Long $unit = this.getUnit();
        result = result * 59 + ($unit == null ? 43 : ((Object)$unit).hashCode());
        Integer $unitPrecision = this.getUnitPrecision();
        result = result * 59 + ($unitPrecision == null ? 43 : ((Object)$unitPrecision).hashCode());
        Integer $unitTruncationType = this.getUnitTruncationType();
        result = result * 59 + ($unitTruncationType == null ? 43 : ((Object)$unitTruncationType).hashCode());
        Integer $unitExchangeType = this.getUnitExchangeType();
        result = result * 59 + ($unitExchangeType == null ? 43 : ((Object)$unitExchangeType).hashCode());
        Long $assistUnit = this.getAssistUnit();
        result = result * 59 + ($assistUnit == null ? 43 : ((Object)$assistUnit).hashCode());
        Integer $assistUnitPrecision = this.getAssistUnitPrecision();
        result = result * 59 + ($assistUnitPrecision == null ? 43 : ((Object)$assistUnitPrecision).hashCode());
        Integer $assistUnitTruncationType = this.getAssistUnitTruncationType();
        result = result * 59 + ($assistUnitTruncationType == null ? 43 : ((Object)$assistUnitTruncationType).hashCode());
        Integer $balance = this.getBalance();
        result = result * 59 + ($balance == null ? 43 : ((Object)$balance).hashCode());
        String $unitCode = this.getUnitCode();
        result = result * 59 + ($unitCode == null ? 43 : $unitCode.hashCode());
        String $unitName = this.getUnitName();
        result = result * 59 + ($unitName == null ? 43 : $unitName.hashCode());
        BigDecimal $unitConvertCoefficient = this.getUnitConvertCoefficient();
        result = result * 59 + ($unitConvertCoefficient == null ? 43 : ((Object)$unitConvertCoefficient).hashCode());
        BigDecimal $mainUnitCount = this.getMainUnitCount();
        result = result * 59 + ($mainUnitCount == null ? 43 : ((Object)$mainUnitCount).hashCode());
        BigDecimal $mainUnitCountNew = this.getMainUnitCountNew();
        result = result * 59 + ($mainUnitCountNew == null ? 43 : ((Object)$mainUnitCountNew).hashCode());
        BigDecimal $mainUnitRate = this.getMainUnitRate();
        result = result * 59 + ($mainUnitRate == null ? 43 : ((Object)$mainUnitRate).hashCode());
        String $assistVerValue = this.getAssistVerValue();
        result = result * 59 + ($assistVerValue == null ? 43 : $assistVerValue.hashCode());
        String $assistUnitCode = this.getAssistUnitCode();
        result = result * 59 + ($assistUnitCode == null ? 43 : $assistUnitCode.hashCode());
        String $assistUnitName = this.getAssistUnitName();
        result = result * 59 + ($assistUnitName == null ? 43 : $assistUnitName.hashCode());
        BigDecimal $assistUnitConvertCoefficient = this.getAssistUnitConvertCoefficient();
        result = result * 59 + ($assistUnitConvertCoefficient == null ? 43 : ((Object)$assistUnitConvertCoefficient).hashCode());
        BigDecimal $assistUnitCount = this.getAssistUnitCount();
        result = result * 59 + ($assistUnitCount == null ? 43 : ((Object)$assistUnitCount).hashCode());
        return result;
    }

    public String toString() {
        return "ProductAsistUnitDTO(productId=" + this.getProductId() + ", enableAssistUnit=" + this.getEnableAssistUnit() + ", unit=" + this.getUnit() + ", unitCode=" + this.getUnitCode() + ", unitName=" + this.getUnitName() + ", unitPrecision=" + this.getUnitPrecision() + ", unitTruncationType=" + this.getUnitTruncationType() + ", unitConvertCoefficient=" + this.getUnitConvertCoefficient() + ", mainUnitCount=" + this.getMainUnitCount() + ", mainUnitCountNew=" + this.getMainUnitCountNew() + ", mainUnitRate=" + this.getMainUnitRate() + ", assistVerValue=" + this.getAssistVerValue() + ", unitExchangeType=" + this.getUnitExchangeType() + ", assistUnit=" + this.getAssistUnit() + ", assistUnitCode=" + this.getAssistUnitCode() + ", assistUnitName=" + this.getAssistUnitName() + ", assistUnitPrecision=" + this.getAssistUnitPrecision() + ", assistUnitConvertCoefficient=" + this.getAssistUnitConvertCoefficient() + ", assistUnitTruncationType=" + this.getAssistUnitTruncationType() + ", assistUnitCount=" + this.getAssistUnitCount() + ", balance=" + this.getBalance() + ")";
    }
}

