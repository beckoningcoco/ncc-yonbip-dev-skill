/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.yonyou.iuap.international.MultiLangText
 */
package com.yonyou.iuap.apdoc.sdk.dto.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyoucloud.iuap.upc.dto.ext.UPCEntityStatus;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantSaleAreaDataDTO
implements Serializable {
    private String id;
    private Long tenant;
    private String ytenant;
    private Date pubts;
    private HashMap<String, Object> customerAreaCharacter;
    private Map<String, Object> customExtend;
    private Boolean isDefault;
    private String orgId;
    private Long merchantApplyRangeId;
    private Long merchantId;
    private String merchantId___code;
    private MultiLangText merchantId___name;
    private Long saleAreaId;
    private String saleAreaId___code;
    private MultiLangText saleAreaId___name;
    private UPCEntityStatus entityStatus;
    private List<String> needBlankFieldList;

    public String getId() {
        return this.id;
    }

    public Long getTenant() {
        return this.tenant;
    }

    public String getYtenant() {
        return this.ytenant;
    }

    public Date getPubts() {
        return this.pubts;
    }

    public HashMap<String, Object> getCustomerAreaCharacter() {
        return this.customerAreaCharacter;
    }

    public Map<String, Object> getCustomExtend() {
        return this.customExtend;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public Long getMerchantApplyRangeId() {
        return this.merchantApplyRangeId;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantId___code() {
        return this.merchantId___code;
    }

    public MultiLangText getMerchantId___name() {
        return this.merchantId___name;
    }

    public Long getSaleAreaId() {
        return this.saleAreaId;
    }

    public String getSaleAreaId___code() {
        return this.saleAreaId___code;
    }

    public MultiLangText getSaleAreaId___name() {
        return this.saleAreaId___name;
    }

    public UPCEntityStatus getEntityStatus() {
        return this.entityStatus;
    }

    public List<String> getNeedBlankFieldList() {
        return this.needBlankFieldList;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTenant(Long tenant) {
        this.tenant = tenant;
    }

    public void setYtenant(String ytenant) {
        this.ytenant = ytenant;
    }

    public void setPubts(Date pubts) {
        this.pubts = pubts;
    }

    public void setCustomerAreaCharacter(HashMap<String, Object> customerAreaCharacter) {
        this.customerAreaCharacter = customerAreaCharacter;
    }

    public void setCustomExtend(Map<String, Object> customExtend) {
        this.customExtend = customExtend;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setMerchantApplyRangeId(Long merchantApplyRangeId) {
        this.merchantApplyRangeId = merchantApplyRangeId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantId___code(String merchantId___code) {
        this.merchantId___code = merchantId___code;
    }

    public void setMerchantId___name(MultiLangText merchantId___name) {
        this.merchantId___name = merchantId___name;
    }

    public void setSaleAreaId(Long saleAreaId) {
        this.saleAreaId = saleAreaId;
    }

    public void setSaleAreaId___code(String saleAreaId___code) {
        this.saleAreaId___code = saleAreaId___code;
    }

    public void setSaleAreaId___name(MultiLangText saleAreaId___name) {
        this.saleAreaId___name = saleAreaId___name;
    }

    public void setEntityStatus(UPCEntityStatus entityStatus) {
        this.entityStatus = entityStatus;
    }

    public void setNeedBlankFieldList(List<String> needBlankFieldList) {
        this.needBlankFieldList = needBlankFieldList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantSaleAreaDataDTO)) {
            return false;
        }
        MerchantSaleAreaDataDTO other = (MerchantSaleAreaDataDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$tenant = this.getTenant();
        Long other$tenant = other.getTenant();
        if (this$tenant == null ? other$tenant != null : !((Object)this$tenant).equals(other$tenant)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        Long this$merchantApplyRangeId = this.getMerchantApplyRangeId();
        Long other$merchantApplyRangeId = other.getMerchantApplyRangeId();
        if (this$merchantApplyRangeId == null ? other$merchantApplyRangeId != null : !((Object)this$merchantApplyRangeId).equals(other$merchantApplyRangeId)) {
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
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$ytenant = this.getYtenant();
        String other$ytenant = other.getYtenant();
        if (this$ytenant == null ? other$ytenant != null : !this$ytenant.equals(other$ytenant)) {
            return false;
        }
        Date this$pubts = this.getPubts();
        Date other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !((Object)this$pubts).equals(other$pubts)) {
            return false;
        }
        HashMap<String, Object> this$customerAreaCharacter = this.getCustomerAreaCharacter();
        HashMap<String, Object> other$customerAreaCharacter = other.getCustomerAreaCharacter();
        if (this$customerAreaCharacter == null ? other$customerAreaCharacter != null : !((Object)this$customerAreaCharacter).equals(other$customerAreaCharacter)) {
            return false;
        }
        Map<String, Object> this$customExtend = this.getCustomExtend();
        Map<String, Object> other$customExtend = other.getCustomExtend();
        if (this$customExtend == null ? other$customExtend != null : !((Object)this$customExtend).equals(other$customExtend)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$merchantId___code = this.getMerchantId___code();
        String other$merchantId___code = other.getMerchantId___code();
        if (this$merchantId___code == null ? other$merchantId___code != null : !this$merchantId___code.equals(other$merchantId___code)) {
            return false;
        }
        MultiLangText this$merchantId___name = this.getMerchantId___name();
        MultiLangText other$merchantId___name = other.getMerchantId___name();
        if (this$merchantId___name == null ? other$merchantId___name != null : !this$merchantId___name.equals(other$merchantId___name)) {
            return false;
        }
        String this$saleAreaId___code = this.getSaleAreaId___code();
        String other$saleAreaId___code = other.getSaleAreaId___code();
        if (this$saleAreaId___code == null ? other$saleAreaId___code != null : !this$saleAreaId___code.equals(other$saleAreaId___code)) {
            return false;
        }
        MultiLangText this$saleAreaId___name = this.getSaleAreaId___name();
        MultiLangText other$saleAreaId___name = other.getSaleAreaId___name();
        if (this$saleAreaId___name == null ? other$saleAreaId___name != null : !this$saleAreaId___name.equals(other$saleAreaId___name)) {
            return false;
        }
        UPCEntityStatus this$entityStatus = this.getEntityStatus();
        UPCEntityStatus other$entityStatus = other.getEntityStatus();
        if (this$entityStatus == null ? other$entityStatus != null : !((Object)((Object)this$entityStatus)).equals((Object)other$entityStatus)) {
            return false;
        }
        List<String> this$needBlankFieldList = this.getNeedBlankFieldList();
        List<String> other$needBlankFieldList = other.getNeedBlankFieldList();
        return !(this$needBlankFieldList == null ? other$needBlankFieldList != null : !((Object)this$needBlankFieldList).equals(other$needBlankFieldList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantSaleAreaDataDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $tenant = this.getTenant();
        result = result * 59 + ($tenant == null ? 43 : ((Object)$tenant).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        Long $merchantApplyRangeId = this.getMerchantApplyRangeId();
        result = result * 59 + ($merchantApplyRangeId == null ? 43 : ((Object)$merchantApplyRangeId).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $saleAreaId = this.getSaleAreaId();
        result = result * 59 + ($saleAreaId == null ? 43 : ((Object)$saleAreaId).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $ytenant = this.getYtenant();
        result = result * 59 + ($ytenant == null ? 43 : $ytenant.hashCode());
        Date $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : ((Object)$pubts).hashCode());
        HashMap<String, Object> $customerAreaCharacter = this.getCustomerAreaCharacter();
        result = result * 59 + ($customerAreaCharacter == null ? 43 : ((Object)$customerAreaCharacter).hashCode());
        Map<String, Object> $customExtend = this.getCustomExtend();
        result = result * 59 + ($customExtend == null ? 43 : ((Object)$customExtend).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $merchantId___code = this.getMerchantId___code();
        result = result * 59 + ($merchantId___code == null ? 43 : $merchantId___code.hashCode());
        MultiLangText $merchantId___name = this.getMerchantId___name();
        result = result * 59 + ($merchantId___name == null ? 43 : $merchantId___name.hashCode());
        String $saleAreaId___code = this.getSaleAreaId___code();
        result = result * 59 + ($saleAreaId___code == null ? 43 : $saleAreaId___code.hashCode());
        MultiLangText $saleAreaId___name = this.getSaleAreaId___name();
        result = result * 59 + ($saleAreaId___name == null ? 43 : $saleAreaId___name.hashCode());
        UPCEntityStatus $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : ((Object)((Object)$entityStatus)).hashCode());
        List<String> $needBlankFieldList = this.getNeedBlankFieldList();
        result = result * 59 + ($needBlankFieldList == null ? 43 : ((Object)$needBlankFieldList).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantSaleAreaDataDTO(id=" + this.getId() + ", tenant=" + this.getTenant() + ", ytenant=" + this.getYtenant() + ", pubts=" + this.getPubts() + ", customerAreaCharacter=" + this.getCustomerAreaCharacter() + ", customExtend=" + this.getCustomExtend() + ", isDefault=" + this.getIsDefault() + ", orgId=" + this.getOrgId() + ", merchantApplyRangeId=" + this.getMerchantApplyRangeId() + ", merchantId=" + this.getMerchantId() + ", merchantId___code=" + this.getMerchantId___code() + ", merchantId___name=" + this.getMerchantId___name() + ", saleAreaId=" + this.getSaleAreaId() + ", saleAreaId___code=" + this.getSaleAreaId___code() + ", saleAreaId___name=" + this.getSaleAreaId___name() + ", entityStatus=" + (Object)((Object)this.getEntityStatus()) + ", needBlankFieldList=" + this.getNeedBlankFieldList() + ")";
    }
}

