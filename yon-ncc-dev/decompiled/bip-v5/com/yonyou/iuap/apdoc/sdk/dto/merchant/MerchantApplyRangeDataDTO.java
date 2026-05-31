/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyou.iuap.apdoc.sdk.dto.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCEntityStatus;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantApplyRangeDataDTO
implements Serializable {
    private String id;
    private Long merchantId;
    private String merchantId___code;
    private String merchantDetailId;
    private Integer rangeType;
    private String orgId;
    private String orgId___code;
    private Long shopId;
    private String shopId___code;
    private Boolean isApplied;
    private Boolean isCreator;
    private Boolean isPotential;
    private Boolean isSalesOrg;
    private String allocateSource;
    private Date allocateTime;
    private Long allocatorId;
    private String allocatorId___code;
    private Integer controlRuleVersion;
    private String allocatorName;
    private Date pubts;
    private UPCEntityStatus entityStatus;
    private List<String> needBlankFieldList;

    public String getId() {
        return this.id;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantId___code() {
        return this.merchantId___code;
    }

    public String getMerchantDetailId() {
        return this.merchantDetailId;
    }

    public Integer getRangeType() {
        return this.rangeType;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getOrgId___code() {
        return this.orgId___code;
    }

    public Long getShopId() {
        return this.shopId;
    }

    public String getShopId___code() {
        return this.shopId___code;
    }

    public Boolean getIsApplied() {
        return this.isApplied;
    }

    public Boolean getIsCreator() {
        return this.isCreator;
    }

    public Boolean getIsPotential() {
        return this.isPotential;
    }

    public Boolean getIsSalesOrg() {
        return this.isSalesOrg;
    }

    public String getAllocateSource() {
        return this.allocateSource;
    }

    public Date getAllocateTime() {
        return this.allocateTime;
    }

    public Long getAllocatorId() {
        return this.allocatorId;
    }

    public String getAllocatorId___code() {
        return this.allocatorId___code;
    }

    public Integer getControlRuleVersion() {
        return this.controlRuleVersion;
    }

    public String getAllocatorName() {
        return this.allocatorName;
    }

    public Date getPubts() {
        return this.pubts;
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

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantId___code(String merchantId___code) {
        this.merchantId___code = merchantId___code;
    }

    public void setMerchantDetailId(String merchantDetailId) {
        this.merchantDetailId = merchantDetailId;
    }

    public void setRangeType(Integer rangeType) {
        this.rangeType = rangeType;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setOrgId___code(String orgId___code) {
        this.orgId___code = orgId___code;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public void setShopId___code(String shopId___code) {
        this.shopId___code = shopId___code;
    }

    public void setIsApplied(Boolean isApplied) {
        this.isApplied = isApplied;
    }

    public void setIsCreator(Boolean isCreator) {
        this.isCreator = isCreator;
    }

    public void setIsPotential(Boolean isPotential) {
        this.isPotential = isPotential;
    }

    public void setIsSalesOrg(Boolean isSalesOrg) {
        this.isSalesOrg = isSalesOrg;
    }

    public void setAllocateSource(String allocateSource) {
        this.allocateSource = allocateSource;
    }

    public void setAllocateTime(Date allocateTime) {
        this.allocateTime = allocateTime;
    }

    public void setAllocatorId(Long allocatorId) {
        this.allocatorId = allocatorId;
    }

    public void setAllocatorId___code(String allocatorId___code) {
        this.allocatorId___code = allocatorId___code;
    }

    public void setControlRuleVersion(Integer controlRuleVersion) {
        this.controlRuleVersion = controlRuleVersion;
    }

    public void setAllocatorName(String allocatorName) {
        this.allocatorName = allocatorName;
    }

    public void setPubts(Date pubts) {
        this.pubts = pubts;
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
        if (!(o instanceof MerchantApplyRangeDataDTO)) {
            return false;
        }
        MerchantApplyRangeDataDTO other = (MerchantApplyRangeDataDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Integer this$rangeType = this.getRangeType();
        Integer other$rangeType = other.getRangeType();
        if (this$rangeType == null ? other$rangeType != null : !((Object)this$rangeType).equals(other$rangeType)) {
            return false;
        }
        Long this$shopId = this.getShopId();
        Long other$shopId = other.getShopId();
        if (this$shopId == null ? other$shopId != null : !((Object)this$shopId).equals(other$shopId)) {
            return false;
        }
        Boolean this$isApplied = this.getIsApplied();
        Boolean other$isApplied = other.getIsApplied();
        if (this$isApplied == null ? other$isApplied != null : !((Object)this$isApplied).equals(other$isApplied)) {
            return false;
        }
        Boolean this$isCreator = this.getIsCreator();
        Boolean other$isCreator = other.getIsCreator();
        if (this$isCreator == null ? other$isCreator != null : !((Object)this$isCreator).equals(other$isCreator)) {
            return false;
        }
        Boolean this$isPotential = this.getIsPotential();
        Boolean other$isPotential = other.getIsPotential();
        if (this$isPotential == null ? other$isPotential != null : !((Object)this$isPotential).equals(other$isPotential)) {
            return false;
        }
        Boolean this$isSalesOrg = this.getIsSalesOrg();
        Boolean other$isSalesOrg = other.getIsSalesOrg();
        if (this$isSalesOrg == null ? other$isSalesOrg != null : !((Object)this$isSalesOrg).equals(other$isSalesOrg)) {
            return false;
        }
        Long this$allocatorId = this.getAllocatorId();
        Long other$allocatorId = other.getAllocatorId();
        if (this$allocatorId == null ? other$allocatorId != null : !((Object)this$allocatorId).equals(other$allocatorId)) {
            return false;
        }
        Integer this$controlRuleVersion = this.getControlRuleVersion();
        Integer other$controlRuleVersion = other.getControlRuleVersion();
        if (this$controlRuleVersion == null ? other$controlRuleVersion != null : !((Object)this$controlRuleVersion).equals(other$controlRuleVersion)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$merchantId___code = this.getMerchantId___code();
        String other$merchantId___code = other.getMerchantId___code();
        if (this$merchantId___code == null ? other$merchantId___code != null : !this$merchantId___code.equals(other$merchantId___code)) {
            return false;
        }
        String this$merchantDetailId = this.getMerchantDetailId();
        String other$merchantDetailId = other.getMerchantDetailId();
        if (this$merchantDetailId == null ? other$merchantDetailId != null : !this$merchantDetailId.equals(other$merchantDetailId)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$orgId___code = this.getOrgId___code();
        String other$orgId___code = other.getOrgId___code();
        if (this$orgId___code == null ? other$orgId___code != null : !this$orgId___code.equals(other$orgId___code)) {
            return false;
        }
        String this$shopId___code = this.getShopId___code();
        String other$shopId___code = other.getShopId___code();
        if (this$shopId___code == null ? other$shopId___code != null : !this$shopId___code.equals(other$shopId___code)) {
            return false;
        }
        String this$allocateSource = this.getAllocateSource();
        String other$allocateSource = other.getAllocateSource();
        if (this$allocateSource == null ? other$allocateSource != null : !this$allocateSource.equals(other$allocateSource)) {
            return false;
        }
        Date this$allocateTime = this.getAllocateTime();
        Date other$allocateTime = other.getAllocateTime();
        if (this$allocateTime == null ? other$allocateTime != null : !((Object)this$allocateTime).equals(other$allocateTime)) {
            return false;
        }
        String this$allocatorId___code = this.getAllocatorId___code();
        String other$allocatorId___code = other.getAllocatorId___code();
        if (this$allocatorId___code == null ? other$allocatorId___code != null : !this$allocatorId___code.equals(other$allocatorId___code)) {
            return false;
        }
        String this$allocatorName = this.getAllocatorName();
        String other$allocatorName = other.getAllocatorName();
        if (this$allocatorName == null ? other$allocatorName != null : !this$allocatorName.equals(other$allocatorName)) {
            return false;
        }
        Date this$pubts = this.getPubts();
        Date other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !((Object)this$pubts).equals(other$pubts)) {
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
        return other instanceof MerchantApplyRangeDataDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Integer $rangeType = this.getRangeType();
        result = result * 59 + ($rangeType == null ? 43 : ((Object)$rangeType).hashCode());
        Long $shopId = this.getShopId();
        result = result * 59 + ($shopId == null ? 43 : ((Object)$shopId).hashCode());
        Boolean $isApplied = this.getIsApplied();
        result = result * 59 + ($isApplied == null ? 43 : ((Object)$isApplied).hashCode());
        Boolean $isCreator = this.getIsCreator();
        result = result * 59 + ($isCreator == null ? 43 : ((Object)$isCreator).hashCode());
        Boolean $isPotential = this.getIsPotential();
        result = result * 59 + ($isPotential == null ? 43 : ((Object)$isPotential).hashCode());
        Boolean $isSalesOrg = this.getIsSalesOrg();
        result = result * 59 + ($isSalesOrg == null ? 43 : ((Object)$isSalesOrg).hashCode());
        Long $allocatorId = this.getAllocatorId();
        result = result * 59 + ($allocatorId == null ? 43 : ((Object)$allocatorId).hashCode());
        Integer $controlRuleVersion = this.getControlRuleVersion();
        result = result * 59 + ($controlRuleVersion == null ? 43 : ((Object)$controlRuleVersion).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $merchantId___code = this.getMerchantId___code();
        result = result * 59 + ($merchantId___code == null ? 43 : $merchantId___code.hashCode());
        String $merchantDetailId = this.getMerchantDetailId();
        result = result * 59 + ($merchantDetailId == null ? 43 : $merchantDetailId.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $orgId___code = this.getOrgId___code();
        result = result * 59 + ($orgId___code == null ? 43 : $orgId___code.hashCode());
        String $shopId___code = this.getShopId___code();
        result = result * 59 + ($shopId___code == null ? 43 : $shopId___code.hashCode());
        String $allocateSource = this.getAllocateSource();
        result = result * 59 + ($allocateSource == null ? 43 : $allocateSource.hashCode());
        Date $allocateTime = this.getAllocateTime();
        result = result * 59 + ($allocateTime == null ? 43 : ((Object)$allocateTime).hashCode());
        String $allocatorId___code = this.getAllocatorId___code();
        result = result * 59 + ($allocatorId___code == null ? 43 : $allocatorId___code.hashCode());
        String $allocatorName = this.getAllocatorName();
        result = result * 59 + ($allocatorName == null ? 43 : $allocatorName.hashCode());
        Date $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : ((Object)$pubts).hashCode());
        UPCEntityStatus $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : ((Object)((Object)$entityStatus)).hashCode());
        List<String> $needBlankFieldList = this.getNeedBlankFieldList();
        result = result * 59 + ($needBlankFieldList == null ? 43 : ((Object)$needBlankFieldList).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantApplyRangeDataDTO(id=" + this.getId() + ", merchantId=" + this.getMerchantId() + ", merchantId___code=" + this.getMerchantId___code() + ", merchantDetailId=" + this.getMerchantDetailId() + ", rangeType=" + this.getRangeType() + ", orgId=" + this.getOrgId() + ", orgId___code=" + this.getOrgId___code() + ", shopId=" + this.getShopId() + ", shopId___code=" + this.getShopId___code() + ", isApplied=" + this.getIsApplied() + ", isCreator=" + this.getIsCreator() + ", isPotential=" + this.getIsPotential() + ", isSalesOrg=" + this.getIsSalesOrg() + ", allocateSource=" + this.getAllocateSource() + ", allocateTime=" + this.getAllocateTime() + ", allocatorId=" + this.getAllocatorId() + ", allocatorId___code=" + this.getAllocatorId___code() + ", controlRuleVersion=" + this.getControlRuleVersion() + ", allocatorName=" + this.getAllocatorName() + ", pubts=" + this.getPubts() + ", entityStatus=" + (Object)((Object)this.getEntityStatus()) + ", needBlankFieldList=" + this.getNeedBlankFieldList() + ")";
    }
}

