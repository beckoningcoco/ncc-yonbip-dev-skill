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
import java.util.Arrays;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class AgentInvoiceQryDTO
implements Serializable {
    private String[] fields;
    private Long id;
    private List<Long> ids;
    private Long merchantId;
    private Boolean defaultInvoice;
    private String bdBillingType;
    private List<String> bdBillingTypeList;

    public String[] getFields() {
        return this.fields;
    }

    public Long getId() {
        return this.id;
    }

    public List<Long> getIds() {
        return this.ids;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public Boolean getDefaultInvoice() {
        return this.defaultInvoice;
    }

    public String getBdBillingType() {
        return this.bdBillingType;
    }

    public List<String> getBdBillingTypeList() {
        return this.bdBillingTypeList;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setDefaultInvoice(Boolean defaultInvoice) {
        this.defaultInvoice = defaultInvoice;
    }

    public void setBdBillingType(String bdBillingType) {
        this.bdBillingType = bdBillingType;
    }

    public void setBdBillingTypeList(List<String> bdBillingTypeList) {
        this.bdBillingTypeList = bdBillingTypeList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgentInvoiceQryDTO)) {
            return false;
        }
        AgentInvoiceQryDTO other = (AgentInvoiceQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Boolean this$defaultInvoice = this.getDefaultInvoice();
        Boolean other$defaultInvoice = other.getDefaultInvoice();
        if (this$defaultInvoice == null ? other$defaultInvoice != null : !((Object)this$defaultInvoice).equals(other$defaultInvoice)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getFields(), other.getFields())) {
            return false;
        }
        List<Long> this$ids = this.getIds();
        List<Long> other$ids = other.getIds();
        if (this$ids == null ? other$ids != null : !((Object)this$ids).equals(other$ids)) {
            return false;
        }
        String this$bdBillingType = this.getBdBillingType();
        String other$bdBillingType = other.getBdBillingType();
        if (this$bdBillingType == null ? other$bdBillingType != null : !this$bdBillingType.equals(other$bdBillingType)) {
            return false;
        }
        List<String> this$bdBillingTypeList = this.getBdBillingTypeList();
        List<String> other$bdBillingTypeList = other.getBdBillingTypeList();
        return !(this$bdBillingTypeList == null ? other$bdBillingTypeList != null : !((Object)this$bdBillingTypeList).equals(other$bdBillingTypeList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof AgentInvoiceQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Boolean $defaultInvoice = this.getDefaultInvoice();
        result = result * 59 + ($defaultInvoice == null ? 43 : ((Object)$defaultInvoice).hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getFields());
        List<Long> $ids = this.getIds();
        result = result * 59 + ($ids == null ? 43 : ((Object)$ids).hashCode());
        String $bdBillingType = this.getBdBillingType();
        result = result * 59 + ($bdBillingType == null ? 43 : $bdBillingType.hashCode());
        List<String> $bdBillingTypeList = this.getBdBillingTypeList();
        result = result * 59 + ($bdBillingTypeList == null ? 43 : ((Object)$bdBillingTypeList).hashCode());
        return result;
    }

    public String toString() {
        return "AgentInvoiceQryDTO(fields=" + Arrays.deepToString(this.getFields()) + ", id=" + this.getId() + ", ids=" + this.getIds() + ", merchantId=" + this.getMerchantId() + ", defaultInvoice=" + this.getDefaultInvoice() + ", bdBillingType=" + this.getBdBillingType() + ", bdBillingTypeList=" + this.getBdBillingTypeList() + ")";
    }
}

