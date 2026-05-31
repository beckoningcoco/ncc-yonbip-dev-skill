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

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantCustomerAreaDTO
implements Serializable {
    public Long id;
    public Long merchantId;
    public String orgId;
    public Long saleAreaId;
    public String saleAreaCode;
    public String saleAreaName;
    public MultiLangText saleAreaName_multilang;
    public Boolean defaultSaleArea;

    public Long getId() {
        return this.id;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public Long getSaleAreaId() {
        return this.saleAreaId;
    }

    public String getSaleAreaCode() {
        return this.saleAreaCode;
    }

    public String getSaleAreaName() {
        return this.saleAreaName;
    }

    public MultiLangText getSaleAreaName_multilang() {
        return this.saleAreaName_multilang;
    }

    public Boolean getDefaultSaleArea() {
        return this.defaultSaleArea;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setSaleAreaId(Long saleAreaId) {
        this.saleAreaId = saleAreaId;
    }

    public void setSaleAreaCode(String saleAreaCode) {
        this.saleAreaCode = saleAreaCode;
    }

    public void setSaleAreaName(String saleAreaName) {
        this.saleAreaName = saleAreaName;
    }

    public void setSaleAreaName_multilang(MultiLangText saleAreaName_multilang) {
        this.saleAreaName_multilang = saleAreaName_multilang;
    }

    public void setDefaultSaleArea(Boolean defaultSaleArea) {
        this.defaultSaleArea = defaultSaleArea;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantCustomerAreaDTO)) {
            return false;
        }
        MerchantCustomerAreaDTO other = (MerchantCustomerAreaDTO)o;
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
        Long this$saleAreaId = this.getSaleAreaId();
        Long other$saleAreaId = other.getSaleAreaId();
        if (this$saleAreaId == null ? other$saleAreaId != null : !((Object)this$saleAreaId).equals(other$saleAreaId)) {
            return false;
        }
        Boolean this$defaultSaleArea = this.getDefaultSaleArea();
        Boolean other$defaultSaleArea = other.getDefaultSaleArea();
        if (this$defaultSaleArea == null ? other$defaultSaleArea != null : !((Object)this$defaultSaleArea).equals(other$defaultSaleArea)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$saleAreaCode = this.getSaleAreaCode();
        String other$saleAreaCode = other.getSaleAreaCode();
        if (this$saleAreaCode == null ? other$saleAreaCode != null : !this$saleAreaCode.equals(other$saleAreaCode)) {
            return false;
        }
        String this$saleAreaName = this.getSaleAreaName();
        String other$saleAreaName = other.getSaleAreaName();
        if (this$saleAreaName == null ? other$saleAreaName != null : !this$saleAreaName.equals(other$saleAreaName)) {
            return false;
        }
        MultiLangText this$saleAreaName_multilang = this.getSaleAreaName_multilang();
        MultiLangText other$saleAreaName_multilang = other.getSaleAreaName_multilang();
        return !(this$saleAreaName_multilang == null ? other$saleAreaName_multilang != null : !this$saleAreaName_multilang.equals(other$saleAreaName_multilang));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantCustomerAreaDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $saleAreaId = this.getSaleAreaId();
        result = result * 59 + ($saleAreaId == null ? 43 : ((Object)$saleAreaId).hashCode());
        Boolean $defaultSaleArea = this.getDefaultSaleArea();
        result = result * 59 + ($defaultSaleArea == null ? 43 : ((Object)$defaultSaleArea).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $saleAreaCode = this.getSaleAreaCode();
        result = result * 59 + ($saleAreaCode == null ? 43 : $saleAreaCode.hashCode());
        String $saleAreaName = this.getSaleAreaName();
        result = result * 59 + ($saleAreaName == null ? 43 : $saleAreaName.hashCode());
        MultiLangText $saleAreaName_multilang = this.getSaleAreaName_multilang();
        result = result * 59 + ($saleAreaName_multilang == null ? 43 : $saleAreaName_multilang.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantCustomerAreaDTO(id=" + this.getId() + ", merchantId=" + this.getMerchantId() + ", orgId=" + this.getOrgId() + ", saleAreaId=" + this.getSaleAreaId() + ", saleAreaCode=" + this.getSaleAreaCode() + ", saleAreaName=" + this.getSaleAreaName() + ", saleAreaName_multilang=" + this.getSaleAreaName_multilang() + ", defaultSaleArea=" + this.getDefaultSaleArea() + ")";
    }
}

