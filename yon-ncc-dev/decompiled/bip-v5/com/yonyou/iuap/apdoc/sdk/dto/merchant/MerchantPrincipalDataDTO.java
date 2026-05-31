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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantPrincipalDataDTO
implements Serializable {
    private Long id;
    private Long tenant;
    private String ytenant;
    private Date pubts;
    private Boolean isDefault;
    private Long merchantApplyRangeId;
    private String orgId;
    private Long merchantId;
    private String merchantId___code;
    private String merchantId___name;
    private HashMap<String, Object> principalCharacter;
    private Map<String, Object> customExtend;
    private String professSalesman;
    private String professSalesman___code;
    private String professSalesman___name;
    private String specialManagementDep;
    private String specialManagementDep___code;
    private String specialManagementDep___name;
    private UPCEntityStatus entityStatus;
    private List<String> needBlankFieldList;

    public Long getId() {
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

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public Long getMerchantApplyRangeId() {
        return this.merchantApplyRangeId;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantId___code() {
        return this.merchantId___code;
    }

    public String getMerchantId___name() {
        return this.merchantId___name;
    }

    public HashMap<String, Object> getPrincipalCharacter() {
        return this.principalCharacter;
    }

    public Map<String, Object> getCustomExtend() {
        return this.customExtend;
    }

    public String getProfessSalesman() {
        return this.professSalesman;
    }

    public String getProfessSalesman___code() {
        return this.professSalesman___code;
    }

    public String getProfessSalesman___name() {
        return this.professSalesman___name;
    }

    public String getSpecialManagementDep() {
        return this.specialManagementDep;
    }

    public String getSpecialManagementDep___code() {
        return this.specialManagementDep___code;
    }

    public String getSpecialManagementDep___name() {
        return this.specialManagementDep___name;
    }

    public UPCEntityStatus getEntityStatus() {
        return this.entityStatus;
    }

    public List<String> getNeedBlankFieldList() {
        return this.needBlankFieldList;
    }

    public void setId(Long id) {
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

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setMerchantApplyRangeId(Long merchantApplyRangeId) {
        this.merchantApplyRangeId = merchantApplyRangeId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantId___code(String merchantId___code) {
        this.merchantId___code = merchantId___code;
    }

    public void setMerchantId___name(String merchantId___name) {
        this.merchantId___name = merchantId___name;
    }

    public void setPrincipalCharacter(HashMap<String, Object> principalCharacter) {
        this.principalCharacter = principalCharacter;
    }

    public void setCustomExtend(Map<String, Object> customExtend) {
        this.customExtend = customExtend;
    }

    public void setProfessSalesman(String professSalesman) {
        this.professSalesman = professSalesman;
    }

    public void setProfessSalesman___code(String professSalesman___code) {
        this.professSalesman___code = professSalesman___code;
    }

    public void setProfessSalesman___name(String professSalesman___name) {
        this.professSalesman___name = professSalesman___name;
    }

    public void setSpecialManagementDep(String specialManagementDep) {
        this.specialManagementDep = specialManagementDep;
    }

    public void setSpecialManagementDep___code(String specialManagementDep___code) {
        this.specialManagementDep___code = specialManagementDep___code;
    }

    public void setSpecialManagementDep___name(String specialManagementDep___name) {
        this.specialManagementDep___name = specialManagementDep___name;
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
        if (!(o instanceof MerchantPrincipalDataDTO)) {
            return false;
        }
        MerchantPrincipalDataDTO other = (MerchantPrincipalDataDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
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
        String this$merchantId___name = this.getMerchantId___name();
        String other$merchantId___name = other.getMerchantId___name();
        if (this$merchantId___name == null ? other$merchantId___name != null : !this$merchantId___name.equals(other$merchantId___name)) {
            return false;
        }
        HashMap<String, Object> this$principalCharacter = this.getPrincipalCharacter();
        HashMap<String, Object> other$principalCharacter = other.getPrincipalCharacter();
        if (this$principalCharacter == null ? other$principalCharacter != null : !((Object)this$principalCharacter).equals(other$principalCharacter)) {
            return false;
        }
        Map<String, Object> this$customExtend = this.getCustomExtend();
        Map<String, Object> other$customExtend = other.getCustomExtend();
        if (this$customExtend == null ? other$customExtend != null : !((Object)this$customExtend).equals(other$customExtend)) {
            return false;
        }
        String this$professSalesman = this.getProfessSalesman();
        String other$professSalesman = other.getProfessSalesman();
        if (this$professSalesman == null ? other$professSalesman != null : !this$professSalesman.equals(other$professSalesman)) {
            return false;
        }
        String this$professSalesman___code = this.getProfessSalesman___code();
        String other$professSalesman___code = other.getProfessSalesman___code();
        if (this$professSalesman___code == null ? other$professSalesman___code != null : !this$professSalesman___code.equals(other$professSalesman___code)) {
            return false;
        }
        String this$professSalesman___name = this.getProfessSalesman___name();
        String other$professSalesman___name = other.getProfessSalesman___name();
        if (this$professSalesman___name == null ? other$professSalesman___name != null : !this$professSalesman___name.equals(other$professSalesman___name)) {
            return false;
        }
        String this$specialManagementDep = this.getSpecialManagementDep();
        String other$specialManagementDep = other.getSpecialManagementDep();
        if (this$specialManagementDep == null ? other$specialManagementDep != null : !this$specialManagementDep.equals(other$specialManagementDep)) {
            return false;
        }
        String this$specialManagementDep___code = this.getSpecialManagementDep___code();
        String other$specialManagementDep___code = other.getSpecialManagementDep___code();
        if (this$specialManagementDep___code == null ? other$specialManagementDep___code != null : !this$specialManagementDep___code.equals(other$specialManagementDep___code)) {
            return false;
        }
        String this$specialManagementDep___name = this.getSpecialManagementDep___name();
        String other$specialManagementDep___name = other.getSpecialManagementDep___name();
        if (this$specialManagementDep___name == null ? other$specialManagementDep___name != null : !this$specialManagementDep___name.equals(other$specialManagementDep___name)) {
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
        return other instanceof MerchantPrincipalDataDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $tenant = this.getTenant();
        result = result * 59 + ($tenant == null ? 43 : ((Object)$tenant).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        Long $merchantApplyRangeId = this.getMerchantApplyRangeId();
        result = result * 59 + ($merchantApplyRangeId == null ? 43 : ((Object)$merchantApplyRangeId).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        String $ytenant = this.getYtenant();
        result = result * 59 + ($ytenant == null ? 43 : $ytenant.hashCode());
        Date $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : ((Object)$pubts).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $merchantId___code = this.getMerchantId___code();
        result = result * 59 + ($merchantId___code == null ? 43 : $merchantId___code.hashCode());
        String $merchantId___name = this.getMerchantId___name();
        result = result * 59 + ($merchantId___name == null ? 43 : $merchantId___name.hashCode());
        HashMap<String, Object> $principalCharacter = this.getPrincipalCharacter();
        result = result * 59 + ($principalCharacter == null ? 43 : ((Object)$principalCharacter).hashCode());
        Map<String, Object> $customExtend = this.getCustomExtend();
        result = result * 59 + ($customExtend == null ? 43 : ((Object)$customExtend).hashCode());
        String $professSalesman = this.getProfessSalesman();
        result = result * 59 + ($professSalesman == null ? 43 : $professSalesman.hashCode());
        String $professSalesman___code = this.getProfessSalesman___code();
        result = result * 59 + ($professSalesman___code == null ? 43 : $professSalesman___code.hashCode());
        String $professSalesman___name = this.getProfessSalesman___name();
        result = result * 59 + ($professSalesman___name == null ? 43 : $professSalesman___name.hashCode());
        String $specialManagementDep = this.getSpecialManagementDep();
        result = result * 59 + ($specialManagementDep == null ? 43 : $specialManagementDep.hashCode());
        String $specialManagementDep___code = this.getSpecialManagementDep___code();
        result = result * 59 + ($specialManagementDep___code == null ? 43 : $specialManagementDep___code.hashCode());
        String $specialManagementDep___name = this.getSpecialManagementDep___name();
        result = result * 59 + ($specialManagementDep___name == null ? 43 : $specialManagementDep___name.hashCode());
        UPCEntityStatus $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : ((Object)((Object)$entityStatus)).hashCode());
        List<String> $needBlankFieldList = this.getNeedBlankFieldList();
        result = result * 59 + ($needBlankFieldList == null ? 43 : ((Object)$needBlankFieldList).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantPrincipalDataDTO(id=" + this.getId() + ", tenant=" + this.getTenant() + ", ytenant=" + this.getYtenant() + ", pubts=" + this.getPubts() + ", isDefault=" + this.getIsDefault() + ", merchantApplyRangeId=" + this.getMerchantApplyRangeId() + ", orgId=" + this.getOrgId() + ", merchantId=" + this.getMerchantId() + ", merchantId___code=" + this.getMerchantId___code() + ", merchantId___name=" + this.getMerchantId___name() + ", principalCharacter=" + this.getPrincipalCharacter() + ", customExtend=" + this.getCustomExtend() + ", professSalesman=" + this.getProfessSalesman() + ", professSalesman___code=" + this.getProfessSalesman___code() + ", professSalesman___name=" + this.getProfessSalesman___name() + ", specialManagementDep=" + this.getSpecialManagementDep() + ", specialManagementDep___code=" + this.getSpecialManagementDep___code() + ", specialManagementDep___name=" + this.getSpecialManagementDep___name() + ", entityStatus=" + (Object)((Object)this.getEntityStatus()) + ", needBlankFieldList=" + this.getNeedBlankFieldList() + ")";
    }
}

