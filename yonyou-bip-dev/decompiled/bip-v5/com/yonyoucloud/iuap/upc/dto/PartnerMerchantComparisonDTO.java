/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.PartnerComparisonDTO;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class PartnerMerchantComparisonDTO
extends PartnerComparisonDTO
implements Serializable {
    private Long merchantId;
    private String code;
    private String createOrgId;
    private String createOrgCode;
    private String transType;
    private String transTypeCode;
    private Long customerClass;
    private String customerClassCode;

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getCode() {
        return this.code;
    }

    public String getCreateOrgId() {
        return this.createOrgId;
    }

    public String getCreateOrgCode() {
        return this.createOrgCode;
    }

    public String getTransType() {
        return this.transType;
    }

    public String getTransTypeCode() {
        return this.transTypeCode;
    }

    public Long getCustomerClass() {
        return this.customerClass;
    }

    public String getCustomerClassCode() {
        return this.customerClassCode;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCreateOrgId(String createOrgId) {
        this.createOrgId = createOrgId;
    }

    public void setCreateOrgCode(String createOrgCode) {
        this.createOrgCode = createOrgCode;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public void setTransTypeCode(String transTypeCode) {
        this.transTypeCode = transTypeCode;
    }

    public void setCustomerClass(Long customerClass) {
        this.customerClass = customerClass;
    }

    public void setCustomerClassCode(String customerClassCode) {
        this.customerClassCode = customerClassCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PartnerMerchantComparisonDTO)) {
            return false;
        }
        PartnerMerchantComparisonDTO other = (PartnerMerchantComparisonDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Long this$customerClass = this.getCustomerClass();
        Long other$customerClass = other.getCustomerClass();
        if (this$customerClass == null ? other$customerClass != null : !((Object)this$customerClass).equals(other$customerClass)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$createOrgId = this.getCreateOrgId();
        String other$createOrgId = other.getCreateOrgId();
        if (this$createOrgId == null ? other$createOrgId != null : !this$createOrgId.equals(other$createOrgId)) {
            return false;
        }
        String this$createOrgCode = this.getCreateOrgCode();
        String other$createOrgCode = other.getCreateOrgCode();
        if (this$createOrgCode == null ? other$createOrgCode != null : !this$createOrgCode.equals(other$createOrgCode)) {
            return false;
        }
        String this$transType = this.getTransType();
        String other$transType = other.getTransType();
        if (this$transType == null ? other$transType != null : !this$transType.equals(other$transType)) {
            return false;
        }
        String this$transTypeCode = this.getTransTypeCode();
        String other$transTypeCode = other.getTransTypeCode();
        if (this$transTypeCode == null ? other$transTypeCode != null : !this$transTypeCode.equals(other$transTypeCode)) {
            return false;
        }
        String this$customerClassCode = this.getCustomerClassCode();
        String other$customerClassCode = other.getCustomerClassCode();
        return !(this$customerClassCode == null ? other$customerClassCode != null : !this$customerClassCode.equals(other$customerClassCode));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof PartnerMerchantComparisonDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $customerClass = this.getCustomerClass();
        result = result * 59 + ($customerClass == null ? 43 : ((Object)$customerClass).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $createOrgId = this.getCreateOrgId();
        result = result * 59 + ($createOrgId == null ? 43 : $createOrgId.hashCode());
        String $createOrgCode = this.getCreateOrgCode();
        result = result * 59 + ($createOrgCode == null ? 43 : $createOrgCode.hashCode());
        String $transType = this.getTransType();
        result = result * 59 + ($transType == null ? 43 : $transType.hashCode());
        String $transTypeCode = this.getTransTypeCode();
        result = result * 59 + ($transTypeCode == null ? 43 : $transTypeCode.hashCode());
        String $customerClassCode = this.getCustomerClassCode();
        result = result * 59 + ($customerClassCode == null ? 43 : $customerClassCode.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "PartnerMerchantComparisonDTO(merchantId=" + this.getMerchantId() + ", code=" + this.getCode() + ", createOrgId=" + this.getCreateOrgId() + ", createOrgCode=" + this.getCreateOrgCode() + ", transType=" + this.getTransType() + ", transTypeCode=" + this.getTransTypeCode() + ", customerClass=" + this.getCustomerClass() + ", customerClassCode=" + this.getCustomerClassCode() + ")";
    }
}

