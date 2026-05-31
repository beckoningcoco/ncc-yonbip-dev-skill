/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductIPassAssistUnitExchange
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer unitExchangeType;
    private Double assistUnitCount;
    private String assistUnit;
    private String assistUnitCode;
    private Double mainUnitCount;
    private String status;
    private Long order;

    public Integer getUnitExchangeType() {
        return this.unitExchangeType;
    }

    public Double getAssistUnitCount() {
        return this.assistUnitCount;
    }

    public String getAssistUnit() {
        return this.assistUnit;
    }

    public String getAssistUnitCode() {
        return this.assistUnitCode;
    }

    public Double getMainUnitCount() {
        return this.mainUnitCount;
    }

    public String getStatus() {
        return this.status;
    }

    public Long getOrder() {
        return this.order;
    }

    public void setUnitExchangeType(Integer unitExchangeType) {
        this.unitExchangeType = unitExchangeType;
    }

    public void setAssistUnitCount(Double assistUnitCount) {
        this.assistUnitCount = assistUnitCount;
    }

    public void setAssistUnit(String assistUnit) {
        this.assistUnit = assistUnit;
    }

    public void setAssistUnitCode(String assistUnitCode) {
        this.assistUnitCode = assistUnitCode;
    }

    public void setMainUnitCount(Double mainUnitCount) {
        this.mainUnitCount = mainUnitCount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductIPassAssistUnitExchange)) {
            return false;
        }
        ProductIPassAssistUnitExchange other = (ProductIPassAssistUnitExchange)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$unitExchangeType = this.getUnitExchangeType();
        Integer other$unitExchangeType = other.getUnitExchangeType();
        if (this$unitExchangeType == null ? other$unitExchangeType != null : !((Object)this$unitExchangeType).equals(other$unitExchangeType)) {
            return false;
        }
        Double this$assistUnitCount = this.getAssistUnitCount();
        Double other$assistUnitCount = other.getAssistUnitCount();
        if (this$assistUnitCount == null ? other$assistUnitCount != null : !((Object)this$assistUnitCount).equals(other$assistUnitCount)) {
            return false;
        }
        Double this$mainUnitCount = this.getMainUnitCount();
        Double other$mainUnitCount = other.getMainUnitCount();
        if (this$mainUnitCount == null ? other$mainUnitCount != null : !((Object)this$mainUnitCount).equals(other$mainUnitCount)) {
            return false;
        }
        Long this$order = this.getOrder();
        Long other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        String this$assistUnit = this.getAssistUnit();
        String other$assistUnit = other.getAssistUnit();
        if (this$assistUnit == null ? other$assistUnit != null : !this$assistUnit.equals(other$assistUnit)) {
            return false;
        }
        String this$assistUnitCode = this.getAssistUnitCode();
        String other$assistUnitCode = other.getAssistUnitCode();
        if (this$assistUnitCode == null ? other$assistUnitCode != null : !this$assistUnitCode.equals(other$assistUnitCode)) {
            return false;
        }
        String this$status = this.getStatus();
        String other$status = other.getStatus();
        return !(this$status == null ? other$status != null : !this$status.equals(other$status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductIPassAssistUnitExchange;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $unitExchangeType = this.getUnitExchangeType();
        result = result * 59 + ($unitExchangeType == null ? 43 : ((Object)$unitExchangeType).hashCode());
        Double $assistUnitCount = this.getAssistUnitCount();
        result = result * 59 + ($assistUnitCount == null ? 43 : ((Object)$assistUnitCount).hashCode());
        Double $mainUnitCount = this.getMainUnitCount();
        result = result * 59 + ($mainUnitCount == null ? 43 : ((Object)$mainUnitCount).hashCode());
        Long $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        String $assistUnit = this.getAssistUnit();
        result = result * 59 + ($assistUnit == null ? 43 : $assistUnit.hashCode());
        String $assistUnitCode = this.getAssistUnitCode();
        result = result * 59 + ($assistUnitCode == null ? 43 : $assistUnitCode.hashCode());
        String $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "ProductIPassAssistUnitExchange(unitExchangeType=" + this.getUnitExchangeType() + ", assistUnitCount=" + this.getAssistUnitCount() + ", assistUnit=" + this.getAssistUnit() + ", assistUnitCode=" + this.getAssistUnitCode() + ", mainUnitCount=" + this.getMainUnitCount() + ", status=" + this.getStatus() + ", order=" + this.getOrder() + ")";
    }
}

