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
import java.util.Date;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantRoleInfoDTO
implements Serializable {
    private Long id;
    private Long merchantId;
    private Integer toBImmigrationMode;
    private Date uOrderExpireDate;
    private String businessRole;
    private Integer settlementCycle;
    private Date finalSettlementDate;
    private Date uMapExpireDate;
    private Integer settlementMethod;
    private String businessAccount;
    private String cardOwnerName;
    private Integer cardType;
    private String receivingBank;
    private Boolean merchantOptions;

    public Long getId() {
        return this.id;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public Integer getToBImmigrationMode() {
        return this.toBImmigrationMode;
    }

    public Date getUOrderExpireDate() {
        return this.uOrderExpireDate;
    }

    public String getBusinessRole() {
        return this.businessRole;
    }

    public Integer getSettlementCycle() {
        return this.settlementCycle;
    }

    public Date getFinalSettlementDate() {
        return this.finalSettlementDate;
    }

    public Date getUMapExpireDate() {
        return this.uMapExpireDate;
    }

    public Integer getSettlementMethod() {
        return this.settlementMethod;
    }

    public String getBusinessAccount() {
        return this.businessAccount;
    }

    public String getCardOwnerName() {
        return this.cardOwnerName;
    }

    public Integer getCardType() {
        return this.cardType;
    }

    public String getReceivingBank() {
        return this.receivingBank;
    }

    public Boolean getMerchantOptions() {
        return this.merchantOptions;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setToBImmigrationMode(Integer toBImmigrationMode) {
        this.toBImmigrationMode = toBImmigrationMode;
    }

    public void setUOrderExpireDate(Date uOrderExpireDate) {
        this.uOrderExpireDate = uOrderExpireDate;
    }

    public void setBusinessRole(String businessRole) {
        this.businessRole = businessRole;
    }

    public void setSettlementCycle(Integer settlementCycle) {
        this.settlementCycle = settlementCycle;
    }

    public void setFinalSettlementDate(Date finalSettlementDate) {
        this.finalSettlementDate = finalSettlementDate;
    }

    public void setUMapExpireDate(Date uMapExpireDate) {
        this.uMapExpireDate = uMapExpireDate;
    }

    public void setSettlementMethod(Integer settlementMethod) {
        this.settlementMethod = settlementMethod;
    }

    public void setBusinessAccount(String businessAccount) {
        this.businessAccount = businessAccount;
    }

    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public void setReceivingBank(String receivingBank) {
        this.receivingBank = receivingBank;
    }

    public void setMerchantOptions(Boolean merchantOptions) {
        this.merchantOptions = merchantOptions;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantRoleInfoDTO)) {
            return false;
        }
        MerchantRoleInfoDTO other = (MerchantRoleInfoDTO)o;
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
        Integer this$toBImmigrationMode = this.getToBImmigrationMode();
        Integer other$toBImmigrationMode = other.getToBImmigrationMode();
        if (this$toBImmigrationMode == null ? other$toBImmigrationMode != null : !((Object)this$toBImmigrationMode).equals(other$toBImmigrationMode)) {
            return false;
        }
        Integer this$settlementCycle = this.getSettlementCycle();
        Integer other$settlementCycle = other.getSettlementCycle();
        if (this$settlementCycle == null ? other$settlementCycle != null : !((Object)this$settlementCycle).equals(other$settlementCycle)) {
            return false;
        }
        Integer this$settlementMethod = this.getSettlementMethod();
        Integer other$settlementMethod = other.getSettlementMethod();
        if (this$settlementMethod == null ? other$settlementMethod != null : !((Object)this$settlementMethod).equals(other$settlementMethod)) {
            return false;
        }
        Integer this$cardType = this.getCardType();
        Integer other$cardType = other.getCardType();
        if (this$cardType == null ? other$cardType != null : !((Object)this$cardType).equals(other$cardType)) {
            return false;
        }
        Boolean this$merchantOptions = this.getMerchantOptions();
        Boolean other$merchantOptions = other.getMerchantOptions();
        if (this$merchantOptions == null ? other$merchantOptions != null : !((Object)this$merchantOptions).equals(other$merchantOptions)) {
            return false;
        }
        Date this$uOrderExpireDate = this.getUOrderExpireDate();
        Date other$uOrderExpireDate = other.getUOrderExpireDate();
        if (this$uOrderExpireDate == null ? other$uOrderExpireDate != null : !((Object)this$uOrderExpireDate).equals(other$uOrderExpireDate)) {
            return false;
        }
        String this$businessRole = this.getBusinessRole();
        String other$businessRole = other.getBusinessRole();
        if (this$businessRole == null ? other$businessRole != null : !this$businessRole.equals(other$businessRole)) {
            return false;
        }
        Date this$finalSettlementDate = this.getFinalSettlementDate();
        Date other$finalSettlementDate = other.getFinalSettlementDate();
        if (this$finalSettlementDate == null ? other$finalSettlementDate != null : !((Object)this$finalSettlementDate).equals(other$finalSettlementDate)) {
            return false;
        }
        Date this$uMapExpireDate = this.getUMapExpireDate();
        Date other$uMapExpireDate = other.getUMapExpireDate();
        if (this$uMapExpireDate == null ? other$uMapExpireDate != null : !((Object)this$uMapExpireDate).equals(other$uMapExpireDate)) {
            return false;
        }
        String this$businessAccount = this.getBusinessAccount();
        String other$businessAccount = other.getBusinessAccount();
        if (this$businessAccount == null ? other$businessAccount != null : !this$businessAccount.equals(other$businessAccount)) {
            return false;
        }
        String this$cardOwnerName = this.getCardOwnerName();
        String other$cardOwnerName = other.getCardOwnerName();
        if (this$cardOwnerName == null ? other$cardOwnerName != null : !this$cardOwnerName.equals(other$cardOwnerName)) {
            return false;
        }
        String this$receivingBank = this.getReceivingBank();
        String other$receivingBank = other.getReceivingBank();
        return !(this$receivingBank == null ? other$receivingBank != null : !this$receivingBank.equals(other$receivingBank));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantRoleInfoDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Integer $toBImmigrationMode = this.getToBImmigrationMode();
        result = result * 59 + ($toBImmigrationMode == null ? 43 : ((Object)$toBImmigrationMode).hashCode());
        Integer $settlementCycle = this.getSettlementCycle();
        result = result * 59 + ($settlementCycle == null ? 43 : ((Object)$settlementCycle).hashCode());
        Integer $settlementMethod = this.getSettlementMethod();
        result = result * 59 + ($settlementMethod == null ? 43 : ((Object)$settlementMethod).hashCode());
        Integer $cardType = this.getCardType();
        result = result * 59 + ($cardType == null ? 43 : ((Object)$cardType).hashCode());
        Boolean $merchantOptions = this.getMerchantOptions();
        result = result * 59 + ($merchantOptions == null ? 43 : ((Object)$merchantOptions).hashCode());
        Date $uOrderExpireDate = this.getUOrderExpireDate();
        result = result * 59 + ($uOrderExpireDate == null ? 43 : ((Object)$uOrderExpireDate).hashCode());
        String $businessRole = this.getBusinessRole();
        result = result * 59 + ($businessRole == null ? 43 : $businessRole.hashCode());
        Date $finalSettlementDate = this.getFinalSettlementDate();
        result = result * 59 + ($finalSettlementDate == null ? 43 : ((Object)$finalSettlementDate).hashCode());
        Date $uMapExpireDate = this.getUMapExpireDate();
        result = result * 59 + ($uMapExpireDate == null ? 43 : ((Object)$uMapExpireDate).hashCode());
        String $businessAccount = this.getBusinessAccount();
        result = result * 59 + ($businessAccount == null ? 43 : $businessAccount.hashCode());
        String $cardOwnerName = this.getCardOwnerName();
        result = result * 59 + ($cardOwnerName == null ? 43 : $cardOwnerName.hashCode());
        String $receivingBank = this.getReceivingBank();
        result = result * 59 + ($receivingBank == null ? 43 : $receivingBank.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantRoleInfoDTO(id=" + this.getId() + ", merchantId=" + this.getMerchantId() + ", toBImmigrationMode=" + this.getToBImmigrationMode() + ", uOrderExpireDate=" + this.getUOrderExpireDate() + ", businessRole=" + this.getBusinessRole() + ", settlementCycle=" + this.getSettlementCycle() + ", finalSettlementDate=" + this.getFinalSettlementDate() + ", uMapExpireDate=" + this.getUMapExpireDate() + ", settlementMethod=" + this.getSettlementMethod() + ", businessAccount=" + this.getBusinessAccount() + ", cardOwnerName=" + this.getCardOwnerName() + ", cardType=" + this.getCardType() + ", receivingBank=" + this.getReceivingBank() + ", merchantOptions=" + this.getMerchantOptions() + ")";
    }
}

