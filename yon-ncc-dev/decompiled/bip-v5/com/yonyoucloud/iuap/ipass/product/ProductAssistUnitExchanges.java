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
import java.math.BigDecimal;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductAssistUnitExchanges
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String productId;
    private String unitExchangeType;
    private BigDecimal assistUnitCount;
    private String assistUnit;
    private String assistUnit_Code;
    private String assistUnit_Name;
    private BigDecimal mainUnitCount;
    private Long iOrder;
    private String _status;

    public String getId() {
        return this.id;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getUnitExchangeType() {
        return this.unitExchangeType;
    }

    public BigDecimal getAssistUnitCount() {
        return this.assistUnitCount;
    }

    public String getAssistUnit() {
        return this.assistUnit;
    }

    public String getAssistUnit_Code() {
        return this.assistUnit_Code;
    }

    public String getAssistUnit_Name() {
        return this.assistUnit_Name;
    }

    public BigDecimal getMainUnitCount() {
        return this.mainUnitCount;
    }

    public Long getIOrder() {
        return this.iOrder;
    }

    public String get_status() {
        return this._status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setUnitExchangeType(String unitExchangeType) {
        this.unitExchangeType = unitExchangeType;
    }

    public void setAssistUnitCount(BigDecimal assistUnitCount) {
        this.assistUnitCount = assistUnitCount;
    }

    public void setAssistUnit(String assistUnit) {
        this.assistUnit = assistUnit;
    }

    public void setAssistUnit_Code(String assistUnit_Code) {
        this.assistUnit_Code = assistUnit_Code;
    }

    public void setAssistUnit_Name(String assistUnit_Name) {
        this.assistUnit_Name = assistUnit_Name;
    }

    public void setMainUnitCount(BigDecimal mainUnitCount) {
        this.mainUnitCount = mainUnitCount;
    }

    public void setIOrder(Long iOrder) {
        this.iOrder = iOrder;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductAssistUnitExchanges)) {
            return false;
        }
        ProductAssistUnitExchanges other = (ProductAssistUnitExchanges)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$iOrder = this.getIOrder();
        Long other$iOrder = other.getIOrder();
        if (this$iOrder == null ? other$iOrder != null : !((Object)this$iOrder).equals(other$iOrder)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$productId = this.getProductId();
        String other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !this$productId.equals(other$productId)) {
            return false;
        }
        String this$unitExchangeType = this.getUnitExchangeType();
        String other$unitExchangeType = other.getUnitExchangeType();
        if (this$unitExchangeType == null ? other$unitExchangeType != null : !this$unitExchangeType.equals(other$unitExchangeType)) {
            return false;
        }
        BigDecimal this$assistUnitCount = this.getAssistUnitCount();
        BigDecimal other$assistUnitCount = other.getAssistUnitCount();
        if (this$assistUnitCount == null ? other$assistUnitCount != null : !((Object)this$assistUnitCount).equals(other$assistUnitCount)) {
            return false;
        }
        String this$assistUnit = this.getAssistUnit();
        String other$assistUnit = other.getAssistUnit();
        if (this$assistUnit == null ? other$assistUnit != null : !this$assistUnit.equals(other$assistUnit)) {
            return false;
        }
        String this$assistUnit_Code = this.getAssistUnit_Code();
        String other$assistUnit_Code = other.getAssistUnit_Code();
        if (this$assistUnit_Code == null ? other$assistUnit_Code != null : !this$assistUnit_Code.equals(other$assistUnit_Code)) {
            return false;
        }
        String this$assistUnit_Name = this.getAssistUnit_Name();
        String other$assistUnit_Name = other.getAssistUnit_Name();
        if (this$assistUnit_Name == null ? other$assistUnit_Name != null : !this$assistUnit_Name.equals(other$assistUnit_Name)) {
            return false;
        }
        BigDecimal this$mainUnitCount = this.getMainUnitCount();
        BigDecimal other$mainUnitCount = other.getMainUnitCount();
        if (this$mainUnitCount == null ? other$mainUnitCount != null : !((Object)this$mainUnitCount).equals(other$mainUnitCount)) {
            return false;
        }
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        return !(this$_status == null ? other$_status != null : !this$_status.equals(other$_status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductAssistUnitExchanges;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $iOrder = this.getIOrder();
        result = result * 59 + ($iOrder == null ? 43 : ((Object)$iOrder).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : $productId.hashCode());
        String $unitExchangeType = this.getUnitExchangeType();
        result = result * 59 + ($unitExchangeType == null ? 43 : $unitExchangeType.hashCode());
        BigDecimal $assistUnitCount = this.getAssistUnitCount();
        result = result * 59 + ($assistUnitCount == null ? 43 : ((Object)$assistUnitCount).hashCode());
        String $assistUnit = this.getAssistUnit();
        result = result * 59 + ($assistUnit == null ? 43 : $assistUnit.hashCode());
        String $assistUnit_Code = this.getAssistUnit_Code();
        result = result * 59 + ($assistUnit_Code == null ? 43 : $assistUnit_Code.hashCode());
        String $assistUnit_Name = this.getAssistUnit_Name();
        result = result * 59 + ($assistUnit_Name == null ? 43 : $assistUnit_Name.hashCode());
        BigDecimal $mainUnitCount = this.getMainUnitCount();
        result = result * 59 + ($mainUnitCount == null ? 43 : ((Object)$mainUnitCount).hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        return result;
    }

    public String toString() {
        return "ProductAssistUnitExchanges(id=" + this.getId() + ", productId=" + this.getProductId() + ", unitExchangeType=" + this.getUnitExchangeType() + ", assistUnitCount=" + this.getAssistUnitCount() + ", assistUnit=" + this.getAssistUnit() + ", assistUnit_Code=" + this.getAssistUnit_Code() + ", assistUnit_Name=" + this.getAssistUnit_Name() + ", mainUnitCount=" + this.getMainUnitCount() + ", iOrder=" + this.getIOrder() + ", _status=" + this.get_status() + ")";
    }
}

