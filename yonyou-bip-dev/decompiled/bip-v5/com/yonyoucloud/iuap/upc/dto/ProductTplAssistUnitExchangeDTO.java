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
public class ProductTplAssistUnitExchangeDTO
implements Serializable {
    private Long template;
    private Integer unitExchangeType;
    private BigDecimal assistUnitCount;
    private Long assistUnit;
    private String assistUnitCode;
    private String assistUnitName;
    private Integer assistUnitPrecision;
    private BigDecimal unitConvertCoefficient;
    private Integer assistUnitTruncationType;
    private BigDecimal mainUnitCount;
    private BigDecimal mainUnitCountNew;
    private BigDecimal mainUnitRate;
    private String assistVerValue;
    private Long order;

    public Long getTemplate() {
        return this.template;
    }

    public Integer getUnitExchangeType() {
        return this.unitExchangeType;
    }

    public BigDecimal getAssistUnitCount() {
        return this.assistUnitCount;
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

    public BigDecimal getUnitConvertCoefficient() {
        return this.unitConvertCoefficient;
    }

    public Integer getAssistUnitTruncationType() {
        return this.assistUnitTruncationType;
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

    public Long getOrder() {
        return this.order;
    }

    public void setTemplate(Long template) {
        this.template = template;
    }

    public void setUnitExchangeType(Integer unitExchangeType) {
        this.unitExchangeType = unitExchangeType;
    }

    public void setAssistUnitCount(BigDecimal assistUnitCount) {
        this.assistUnitCount = assistUnitCount;
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

    public void setUnitConvertCoefficient(BigDecimal unitConvertCoefficient) {
        this.unitConvertCoefficient = unitConvertCoefficient;
    }

    public void setAssistUnitTruncationType(Integer assistUnitTruncationType) {
        this.assistUnitTruncationType = assistUnitTruncationType;
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

    public void setOrder(Long order) {
        this.order = order;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductTplAssistUnitExchangeDTO)) {
            return false;
        }
        ProductTplAssistUnitExchangeDTO other = (ProductTplAssistUnitExchangeDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$template = this.getTemplate();
        Long other$template = other.getTemplate();
        if (this$template == null ? other$template != null : !((Object)this$template).equals(other$template)) {
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
        Long this$order = this.getOrder();
        Long other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        BigDecimal this$assistUnitCount = this.getAssistUnitCount();
        BigDecimal other$assistUnitCount = other.getAssistUnitCount();
        if (this$assistUnitCount == null ? other$assistUnitCount != null : !((Object)this$assistUnitCount).equals(other$assistUnitCount)) {
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
        return !(this$assistVerValue == null ? other$assistVerValue != null : !this$assistVerValue.equals(other$assistVerValue));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTplAssistUnitExchangeDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $template = this.getTemplate();
        result = result * 59 + ($template == null ? 43 : ((Object)$template).hashCode());
        Integer $unitExchangeType = this.getUnitExchangeType();
        result = result * 59 + ($unitExchangeType == null ? 43 : ((Object)$unitExchangeType).hashCode());
        Long $assistUnit = this.getAssistUnit();
        result = result * 59 + ($assistUnit == null ? 43 : ((Object)$assistUnit).hashCode());
        Integer $assistUnitPrecision = this.getAssistUnitPrecision();
        result = result * 59 + ($assistUnitPrecision == null ? 43 : ((Object)$assistUnitPrecision).hashCode());
        Integer $assistUnitTruncationType = this.getAssistUnitTruncationType();
        result = result * 59 + ($assistUnitTruncationType == null ? 43 : ((Object)$assistUnitTruncationType).hashCode());
        Long $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        BigDecimal $assistUnitCount = this.getAssistUnitCount();
        result = result * 59 + ($assistUnitCount == null ? 43 : ((Object)$assistUnitCount).hashCode());
        String $assistUnitCode = this.getAssistUnitCode();
        result = result * 59 + ($assistUnitCode == null ? 43 : $assistUnitCode.hashCode());
        String $assistUnitName = this.getAssistUnitName();
        result = result * 59 + ($assistUnitName == null ? 43 : $assistUnitName.hashCode());
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
        return result;
    }

    public String toString() {
        return "ProductTplAssistUnitExchangeDTO(template=" + this.getTemplate() + ", unitExchangeType=" + this.getUnitExchangeType() + ", assistUnitCount=" + this.getAssistUnitCount() + ", assistUnit=" + this.getAssistUnit() + ", assistUnitCode=" + this.getAssistUnitCode() + ", assistUnitName=" + this.getAssistUnitName() + ", assistUnitPrecision=" + this.getAssistUnitPrecision() + ", unitConvertCoefficient=" + this.getUnitConvertCoefficient() + ", assistUnitTruncationType=" + this.getAssistUnitTruncationType() + ", mainUnitCount=" + this.getMainUnitCount() + ", mainUnitCountNew=" + this.getMainUnitCountNew() + ", mainUnitRate=" + this.getMainUnitRate() + ", assistVerValue=" + this.getAssistVerValue() + ", order=" + this.getOrder() + ")";
    }
}

