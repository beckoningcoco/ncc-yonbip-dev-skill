/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.math.BigDecimal;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductAssistUnitExchangesVO {
    private Long id;
    private Long productId;
    private Integer unitExchangeType;
    private BigDecimal assistUnitCount;
    private Long assistUnit;
    private String assistUnitCode;
    private String assistUnitName;
    private BigDecimal mainUnitCount;
    private Integer order;
    private String status;
    private Integer balance;

    public Long getId() {
        return this.id;
    }

    public Long getProductId() {
        return this.productId;
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

    public BigDecimal getMainUnitCount() {
        return this.mainUnitCount;
    }

    public Integer getOrder() {
        return this.order;
    }

    public String getStatus() {
        return this.status;
    }

    public Integer getBalance() {
        return this.balance;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductAssistUnitExchangesVO)) {
            return false;
        }
        ProductAssistUnitExchangesVO other = (ProductAssistUnitExchangesVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
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
        Integer this$balance = this.getBalance();
        Integer other$balance = other.getBalance();
        if (this$balance == null ? other$balance != null : !((Object)this$balance).equals(other$balance)) {
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
        if (this$mainUnitCount == null ? other$mainUnitCount != null : !((Object)this$mainUnitCount).equals(other$mainUnitCount)) {
            return false;
        }
        String this$status = this.getStatus();
        String other$status = other.getStatus();
        return !(this$status == null ? other$status != null : !this$status.equals(other$status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductAssistUnitExchangesVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Integer $unitExchangeType = this.getUnitExchangeType();
        result = result * 59 + ($unitExchangeType == null ? 43 : ((Object)$unitExchangeType).hashCode());
        Long $assistUnit = this.getAssistUnit();
        result = result * 59 + ($assistUnit == null ? 43 : ((Object)$assistUnit).hashCode());
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        Integer $balance = this.getBalance();
        result = result * 59 + ($balance == null ? 43 : ((Object)$balance).hashCode());
        BigDecimal $assistUnitCount = this.getAssistUnitCount();
        result = result * 59 + ($assistUnitCount == null ? 43 : ((Object)$assistUnitCount).hashCode());
        String $assistUnitCode = this.getAssistUnitCode();
        result = result * 59 + ($assistUnitCode == null ? 43 : $assistUnitCode.hashCode());
        String $assistUnitName = this.getAssistUnitName();
        result = result * 59 + ($assistUnitName == null ? 43 : $assistUnitName.hashCode());
        BigDecimal $mainUnitCount = this.getMainUnitCount();
        result = result * 59 + ($mainUnitCount == null ? 43 : ((Object)$mainUnitCount).hashCode());
        String $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "ProductAssistUnitExchangesVO(id=" + this.getId() + ", productId=" + this.getProductId() + ", unitExchangeType=" + this.getUnitExchangeType() + ", assistUnitCount=" + this.getAssistUnitCount() + ", assistUnit=" + this.getAssistUnit() + ", assistUnitCode=" + this.getAssistUnitCode() + ", assistUnitName=" + this.getAssistUnitName() + ", mainUnitCount=" + this.getMainUnitCount() + ", order=" + this.getOrder() + ", status=" + this.getStatus() + ", balance=" + this.getBalance() + ")";
    }
}

