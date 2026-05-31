/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.common.CoredocBaseDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantOpenApiSaveDTO;
import java.io.Serializable;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class CustomerApplyDTO
extends CoredocBaseDTO
implements Serializable {
    private Long id;
    private String applyCode;
    private String applyType;
    private String applicationOrg;
    private String applicationOrgCode;
    private String applicationOrgName;
    private Long applicationArea;
    private String applicationAreaCode;
    private String applicationAreaName;
    private String applyDepartment;
    private String applyDepartmentCode;
    private String applyDepartmentName;
    private String applyReason;
    private String bizOperator;
    private String bizOperatorCode;
    private String bizOperatorName;
    private String effectType;
    private String effectTime;
    private Integer verifyState;
    private Integer status;
    private String applyDesc;
    private Boolean wfControlled;
    private Map<String, Object> customerApplyCharacter;
    private MerchantOpenApiSaveDTO customerData;

    public Long getId() {
        return this.id;
    }

    public String getApplyCode() {
        return this.applyCode;
    }

    public String getApplyType() {
        return this.applyType;
    }

    public String getApplicationOrg() {
        return this.applicationOrg;
    }

    public String getApplicationOrgCode() {
        return this.applicationOrgCode;
    }

    public String getApplicationOrgName() {
        return this.applicationOrgName;
    }

    public Long getApplicationArea() {
        return this.applicationArea;
    }

    public String getApplicationAreaCode() {
        return this.applicationAreaCode;
    }

    public String getApplicationAreaName() {
        return this.applicationAreaName;
    }

    public String getApplyDepartment() {
        return this.applyDepartment;
    }

    public String getApplyDepartmentCode() {
        return this.applyDepartmentCode;
    }

    public String getApplyDepartmentName() {
        return this.applyDepartmentName;
    }

    public String getApplyReason() {
        return this.applyReason;
    }

    public String getBizOperator() {
        return this.bizOperator;
    }

    public String getBizOperatorCode() {
        return this.bizOperatorCode;
    }

    public String getBizOperatorName() {
        return this.bizOperatorName;
    }

    public String getEffectType() {
        return this.effectType;
    }

    public String getEffectTime() {
        return this.effectTime;
    }

    public Integer getVerifyState() {
        return this.verifyState;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getApplyDesc() {
        return this.applyDesc;
    }

    public Boolean getWfControlled() {
        return this.wfControlled;
    }

    public Map<String, Object> getCustomerApplyCharacter() {
        return this.customerApplyCharacter;
    }

    public MerchantOpenApiSaveDTO getCustomerData() {
        return this.customerData;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setApplyCode(String applyCode) {
        this.applyCode = applyCode;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType;
    }

    public void setApplicationOrg(String applicationOrg) {
        this.applicationOrg = applicationOrg;
    }

    public void setApplicationOrgCode(String applicationOrgCode) {
        this.applicationOrgCode = applicationOrgCode;
    }

    public void setApplicationOrgName(String applicationOrgName) {
        this.applicationOrgName = applicationOrgName;
    }

    public void setApplicationArea(Long applicationArea) {
        this.applicationArea = applicationArea;
    }

    public void setApplicationAreaCode(String applicationAreaCode) {
        this.applicationAreaCode = applicationAreaCode;
    }

    public void setApplicationAreaName(String applicationAreaName) {
        this.applicationAreaName = applicationAreaName;
    }

    public void setApplyDepartment(String applyDepartment) {
        this.applyDepartment = applyDepartment;
    }

    public void setApplyDepartmentCode(String applyDepartmentCode) {
        this.applyDepartmentCode = applyDepartmentCode;
    }

    public void setApplyDepartmentName(String applyDepartmentName) {
        this.applyDepartmentName = applyDepartmentName;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    public void setBizOperator(String bizOperator) {
        this.bizOperator = bizOperator;
    }

    public void setBizOperatorCode(String bizOperatorCode) {
        this.bizOperatorCode = bizOperatorCode;
    }

    public void setBizOperatorName(String bizOperatorName) {
        this.bizOperatorName = bizOperatorName;
    }

    public void setEffectType(String effectType) {
        this.effectType = effectType;
    }

    public void setEffectTime(String effectTime) {
        this.effectTime = effectTime;
    }

    public void setVerifyState(Integer verifyState) {
        this.verifyState = verifyState;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setApplyDesc(String applyDesc) {
        this.applyDesc = applyDesc;
    }

    public void setWfControlled(Boolean wfControlled) {
        this.wfControlled = wfControlled;
    }

    public void setCustomerApplyCharacter(Map<String, Object> customerApplyCharacter) {
        this.customerApplyCharacter = customerApplyCharacter;
    }

    public void setCustomerData(MerchantOpenApiSaveDTO customerData) {
        this.customerData = customerData;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CustomerApplyDTO)) {
            return false;
        }
        CustomerApplyDTO other = (CustomerApplyDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$applicationArea = this.getApplicationArea();
        Long other$applicationArea = other.getApplicationArea();
        if (this$applicationArea == null ? other$applicationArea != null : !((Object)this$applicationArea).equals(other$applicationArea)) {
            return false;
        }
        Integer this$verifyState = this.getVerifyState();
        Integer other$verifyState = other.getVerifyState();
        if (this$verifyState == null ? other$verifyState != null : !((Object)this$verifyState).equals(other$verifyState)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Boolean this$wfControlled = this.getWfControlled();
        Boolean other$wfControlled = other.getWfControlled();
        if (this$wfControlled == null ? other$wfControlled != null : !((Object)this$wfControlled).equals(other$wfControlled)) {
            return false;
        }
        String this$applyCode = this.getApplyCode();
        String other$applyCode = other.getApplyCode();
        if (this$applyCode == null ? other$applyCode != null : !this$applyCode.equals(other$applyCode)) {
            return false;
        }
        String this$applyType = this.getApplyType();
        String other$applyType = other.getApplyType();
        if (this$applyType == null ? other$applyType != null : !this$applyType.equals(other$applyType)) {
            return false;
        }
        String this$applicationOrg = this.getApplicationOrg();
        String other$applicationOrg = other.getApplicationOrg();
        if (this$applicationOrg == null ? other$applicationOrg != null : !this$applicationOrg.equals(other$applicationOrg)) {
            return false;
        }
        String this$applicationOrgCode = this.getApplicationOrgCode();
        String other$applicationOrgCode = other.getApplicationOrgCode();
        if (this$applicationOrgCode == null ? other$applicationOrgCode != null : !this$applicationOrgCode.equals(other$applicationOrgCode)) {
            return false;
        }
        String this$applicationOrgName = this.getApplicationOrgName();
        String other$applicationOrgName = other.getApplicationOrgName();
        if (this$applicationOrgName == null ? other$applicationOrgName != null : !this$applicationOrgName.equals(other$applicationOrgName)) {
            return false;
        }
        String this$applicationAreaCode = this.getApplicationAreaCode();
        String other$applicationAreaCode = other.getApplicationAreaCode();
        if (this$applicationAreaCode == null ? other$applicationAreaCode != null : !this$applicationAreaCode.equals(other$applicationAreaCode)) {
            return false;
        }
        String this$applicationAreaName = this.getApplicationAreaName();
        String other$applicationAreaName = other.getApplicationAreaName();
        if (this$applicationAreaName == null ? other$applicationAreaName != null : !this$applicationAreaName.equals(other$applicationAreaName)) {
            return false;
        }
        String this$applyDepartment = this.getApplyDepartment();
        String other$applyDepartment = other.getApplyDepartment();
        if (this$applyDepartment == null ? other$applyDepartment != null : !this$applyDepartment.equals(other$applyDepartment)) {
            return false;
        }
        String this$applyDepartmentCode = this.getApplyDepartmentCode();
        String other$applyDepartmentCode = other.getApplyDepartmentCode();
        if (this$applyDepartmentCode == null ? other$applyDepartmentCode != null : !this$applyDepartmentCode.equals(other$applyDepartmentCode)) {
            return false;
        }
        String this$applyDepartmentName = this.getApplyDepartmentName();
        String other$applyDepartmentName = other.getApplyDepartmentName();
        if (this$applyDepartmentName == null ? other$applyDepartmentName != null : !this$applyDepartmentName.equals(other$applyDepartmentName)) {
            return false;
        }
        String this$applyReason = this.getApplyReason();
        String other$applyReason = other.getApplyReason();
        if (this$applyReason == null ? other$applyReason != null : !this$applyReason.equals(other$applyReason)) {
            return false;
        }
        String this$bizOperator = this.getBizOperator();
        String other$bizOperator = other.getBizOperator();
        if (this$bizOperator == null ? other$bizOperator != null : !this$bizOperator.equals(other$bizOperator)) {
            return false;
        }
        String this$bizOperatorCode = this.getBizOperatorCode();
        String other$bizOperatorCode = other.getBizOperatorCode();
        if (this$bizOperatorCode == null ? other$bizOperatorCode != null : !this$bizOperatorCode.equals(other$bizOperatorCode)) {
            return false;
        }
        String this$bizOperatorName = this.getBizOperatorName();
        String other$bizOperatorName = other.getBizOperatorName();
        if (this$bizOperatorName == null ? other$bizOperatorName != null : !this$bizOperatorName.equals(other$bizOperatorName)) {
            return false;
        }
        String this$effectType = this.getEffectType();
        String other$effectType = other.getEffectType();
        if (this$effectType == null ? other$effectType != null : !this$effectType.equals(other$effectType)) {
            return false;
        }
        String this$effectTime = this.getEffectTime();
        String other$effectTime = other.getEffectTime();
        if (this$effectTime == null ? other$effectTime != null : !this$effectTime.equals(other$effectTime)) {
            return false;
        }
        String this$applyDesc = this.getApplyDesc();
        String other$applyDesc = other.getApplyDesc();
        if (this$applyDesc == null ? other$applyDesc != null : !this$applyDesc.equals(other$applyDesc)) {
            return false;
        }
        Map<String, Object> this$customerApplyCharacter = this.getCustomerApplyCharacter();
        Map<String, Object> other$customerApplyCharacter = other.getCustomerApplyCharacter();
        if (this$customerApplyCharacter == null ? other$customerApplyCharacter != null : !((Object)this$customerApplyCharacter).equals(other$customerApplyCharacter)) {
            return false;
        }
        MerchantOpenApiSaveDTO this$customerData = this.getCustomerData();
        MerchantOpenApiSaveDTO other$customerData = other.getCustomerData();
        return !(this$customerData == null ? other$customerData != null : !((Object)this$customerData).equals(other$customerData));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof CustomerApplyDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $applicationArea = this.getApplicationArea();
        result = result * 59 + ($applicationArea == null ? 43 : ((Object)$applicationArea).hashCode());
        Integer $verifyState = this.getVerifyState();
        result = result * 59 + ($verifyState == null ? 43 : ((Object)$verifyState).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Boolean $wfControlled = this.getWfControlled();
        result = result * 59 + ($wfControlled == null ? 43 : ((Object)$wfControlled).hashCode());
        String $applyCode = this.getApplyCode();
        result = result * 59 + ($applyCode == null ? 43 : $applyCode.hashCode());
        String $applyType = this.getApplyType();
        result = result * 59 + ($applyType == null ? 43 : $applyType.hashCode());
        String $applicationOrg = this.getApplicationOrg();
        result = result * 59 + ($applicationOrg == null ? 43 : $applicationOrg.hashCode());
        String $applicationOrgCode = this.getApplicationOrgCode();
        result = result * 59 + ($applicationOrgCode == null ? 43 : $applicationOrgCode.hashCode());
        String $applicationOrgName = this.getApplicationOrgName();
        result = result * 59 + ($applicationOrgName == null ? 43 : $applicationOrgName.hashCode());
        String $applicationAreaCode = this.getApplicationAreaCode();
        result = result * 59 + ($applicationAreaCode == null ? 43 : $applicationAreaCode.hashCode());
        String $applicationAreaName = this.getApplicationAreaName();
        result = result * 59 + ($applicationAreaName == null ? 43 : $applicationAreaName.hashCode());
        String $applyDepartment = this.getApplyDepartment();
        result = result * 59 + ($applyDepartment == null ? 43 : $applyDepartment.hashCode());
        String $applyDepartmentCode = this.getApplyDepartmentCode();
        result = result * 59 + ($applyDepartmentCode == null ? 43 : $applyDepartmentCode.hashCode());
        String $applyDepartmentName = this.getApplyDepartmentName();
        result = result * 59 + ($applyDepartmentName == null ? 43 : $applyDepartmentName.hashCode());
        String $applyReason = this.getApplyReason();
        result = result * 59 + ($applyReason == null ? 43 : $applyReason.hashCode());
        String $bizOperator = this.getBizOperator();
        result = result * 59 + ($bizOperator == null ? 43 : $bizOperator.hashCode());
        String $bizOperatorCode = this.getBizOperatorCode();
        result = result * 59 + ($bizOperatorCode == null ? 43 : $bizOperatorCode.hashCode());
        String $bizOperatorName = this.getBizOperatorName();
        result = result * 59 + ($bizOperatorName == null ? 43 : $bizOperatorName.hashCode());
        String $effectType = this.getEffectType();
        result = result * 59 + ($effectType == null ? 43 : $effectType.hashCode());
        String $effectTime = this.getEffectTime();
        result = result * 59 + ($effectTime == null ? 43 : $effectTime.hashCode());
        String $applyDesc = this.getApplyDesc();
        result = result * 59 + ($applyDesc == null ? 43 : $applyDesc.hashCode());
        Map<String, Object> $customerApplyCharacter = this.getCustomerApplyCharacter();
        result = result * 59 + ($customerApplyCharacter == null ? 43 : ((Object)$customerApplyCharacter).hashCode());
        MerchantOpenApiSaveDTO $customerData = this.getCustomerData();
        result = result * 59 + ($customerData == null ? 43 : ((Object)$customerData).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "CustomerApplyDTO(id=" + this.getId() + ", applyCode=" + this.getApplyCode() + ", applyType=" + this.getApplyType() + ", applicationOrg=" + this.getApplicationOrg() + ", applicationOrgCode=" + this.getApplicationOrgCode() + ", applicationOrgName=" + this.getApplicationOrgName() + ", applicationArea=" + this.getApplicationArea() + ", applicationAreaCode=" + this.getApplicationAreaCode() + ", applicationAreaName=" + this.getApplicationAreaName() + ", applyDepartment=" + this.getApplyDepartment() + ", applyDepartmentCode=" + this.getApplyDepartmentCode() + ", applyDepartmentName=" + this.getApplyDepartmentName() + ", applyReason=" + this.getApplyReason() + ", bizOperator=" + this.getBizOperator() + ", bizOperatorCode=" + this.getBizOperatorCode() + ", bizOperatorName=" + this.getBizOperatorName() + ", effectType=" + this.getEffectType() + ", effectTime=" + this.getEffectTime() + ", verifyState=" + this.getVerifyState() + ", status=" + this.getStatus() + ", applyDesc=" + this.getApplyDesc() + ", wfControlled=" + this.getWfControlled() + ", customerApplyCharacter=" + this.getCustomerApplyCharacter() + ", customerData=" + this.getCustomerData() + ")";
    }
}

