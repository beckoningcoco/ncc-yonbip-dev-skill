/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo.productTpl.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductTplAssistUnitExchangeVO {
    private Integer unitExchangeType;
    private BigDecimal assistUnitCount;
    private Long assistUnit;
    private String assistUnitCode;
    private String assistUnitName;
    private BigDecimal mainUnitCount;
    private Integer order;

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

    public BigDecimal getMainUnitCount() {
        return this.mainUnitCount;
    }

    public Integer getOrder() {
        return this.order;
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

    public void setMainUnitCount(BigDecimal mainUnitCount) {
        this.mainUnitCount = mainUnitCount;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductTplAssistUnitExchangeVO)) {
            return false;
        }
        ProductTplAssistUnitExchangeVO other = (ProductTplAssistUnitExchangeVO)o;
        if (!other.canEqual(this)) {
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
        Integer this$order = this.getOrder();
        Integer other$order = other.getOrder();
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
        BigDecimal this$mainUnitCount = this.getMainUnitCount();
        BigDecimal other$mainUnitCount = other.getMainUnitCount();
        return !(this$mainUnitCount == null ? other$mainUnitCount != null : !((Object)this$mainUnitCount).equals(other$mainUnitCount));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTplAssistUnitExchangeVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $unitExchangeType = this.getUnitExchangeType();
        result = result * 59 + ($unitExchangeType == null ? 43 : ((Object)$unitExchangeType).hashCode());
        Long $assistUnit = this.getAssistUnit();
        result = result * 59 + ($assistUnit == null ? 43 : ((Object)$assistUnit).hashCode());
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        BigDecimal $assistUnitCount = this.getAssistUnitCount();
        result = result * 59 + ($assistUnitCount == null ? 43 : ((Object)$assistUnitCount).hashCode());
        String $assistUnitCode = this.getAssistUnitCode();
        result = result * 59 + ($assistUnitCode == null ? 43 : $assistUnitCode.hashCode());
        String $assistUnitName = this.getAssistUnitName();
        result = result * 59 + ($assistUnitName == null ? 43 : $assistUnitName.hashCode());
        BigDecimal $mainUnitCount = this.getMainUnitCount();
        result = result * 59 + ($mainUnitCount == null ? 43 : ((Object)$mainUnitCount).hashCode());
        return result;
    }

    public String toString() {
        return "ProductTplAssistUnitExchangeVO(unitExchangeType=" + this.getUnitExchangeType() + ", assistUnitCount=" + this.getAssistUnitCount() + ", assistUnit=" + this.getAssistUnit() + ", assistUnitCode=" + this.getAssistUnitCode() + ", assistUnitName=" + this.getAssistUnitName() + ", mainUnitCount=" + this.getMainUnitCount() + ", order=" + this.getOrder() + ")";
    }
}

