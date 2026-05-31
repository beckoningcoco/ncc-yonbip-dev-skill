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
public class MerchantRoleInfoDataDTO
implements Serializable {
    private Long id;
    private Date pubts;
    private String businessAccount;
    private String businessRole;
    private String cardOwnerName;
    private Integer cardType;
    private Date finalSettlementDate;
    private Long merchantId;
    private String merchantId___code;
    private String merchantId___name;
    private Boolean merchantOptions;
    private String receivingBank;
    private String receivingBank___code;
    private String receivingBank___name;
    private Integer settlementCycle;
    private String settlementMethod;
    private String toBImmigrationMode;
    private Date uMappExpireDate;
    private Date uOrderExpireDate;
    private UPCEntityStatus entityStatus;
    private List<String> needBlankFieldList;

    public Long getId() {
        return this.id;
    }

    public Date getPubts() {
        return this.pubts;
    }

    public String getBusinessAccount() {
        return this.businessAccount;
    }

    public String getBusinessRole() {
        return this.businessRole;
    }

    public String getCardOwnerName() {
        return this.cardOwnerName;
    }

    public Integer getCardType() {
        return this.cardType;
    }

    public Date getFinalSettlementDate() {
        return this.finalSettlementDate;
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

    public Boolean getMerchantOptions() {
        return this.merchantOptions;
    }

    public String getReceivingBank() {
        return this.receivingBank;
    }

    public String getReceivingBank___code() {
        return this.receivingBank___code;
    }

    public String getReceivingBank___name() {
        return this.receivingBank___name;
    }

    public Integer getSettlementCycle() {
        return this.settlementCycle;
    }

    public String getSettlementMethod() {
        return this.settlementMethod;
    }

    public String getToBImmigrationMode() {
        return this.toBImmigrationMode;
    }

    public Date getUMappExpireDate() {
        return this.uMappExpireDate;
    }

    public Date getUOrderExpireDate() {
        return this.uOrderExpireDate;
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

    public void setPubts(Date pubts) {
        this.pubts = pubts;
    }

    public void setBusinessAccount(String businessAccount) {
        this.businessAccount = businessAccount;
    }

    public void setBusinessRole(String businessRole) {
        this.businessRole = businessRole;
    }

    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public void setFinalSettlementDate(Date finalSettlementDate) {
        this.finalSettlementDate = finalSettlementDate;
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

    public void setMerchantOptions(Boolean merchantOptions) {
        this.merchantOptions = merchantOptions;
    }

    public void setReceivingBank(String receivingBank) {
        this.receivingBank = receivingBank;
    }

    public void setReceivingBank___code(String receivingBank___code) {
        this.receivingBank___code = receivingBank___code;
    }

    public void setReceivingBank___name(String receivingBank___name) {
        this.receivingBank___name = receivingBank___name;
    }

    public void setSettlementCycle(Integer settlementCycle) {
        this.settlementCycle = settlementCycle;
    }

    public void setSettlementMethod(String settlementMethod) {
        this.settlementMethod = settlementMethod;
    }

    public void setToBImmigrationMode(String toBImmigrationMode) {
        this.toBImmigrationMode = toBImmigrationMode;
    }

    public void setUMappExpireDate(Date uMappExpireDate) {
        this.uMappExpireDate = uMappExpireDate;
    }

    public void setUOrderExpireDate(Date uOrderExpireDate) {
        this.uOrderExpireDate = uOrderExpireDate;
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
        if (!(o instanceof MerchantRoleInfoDataDTO)) {
            return false;
        }
        MerchantRoleInfoDataDTO other = (MerchantRoleInfoDataDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$cardType = this.getCardType();
        Integer other$cardType = other.getCardType();
        if (this$cardType == null ? other$cardType != null : !((Object)this$cardType).equals(other$cardType)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Boolean this$merchantOptions = this.getMerchantOptions();
        Boolean other$merchantOptions = other.getMerchantOptions();
        if (this$merchantOptions == null ? other$merchantOptions != null : !((Object)this$merchantOptions).equals(other$merchantOptions)) {
            return false;
        }
        Integer this$settlementCycle = this.getSettlementCycle();
        Integer other$settlementCycle = other.getSettlementCycle();
        if (this$settlementCycle == null ? other$settlementCycle != null : !((Object)this$settlementCycle).equals(other$settlementCycle)) {
            return false;
        }
        Date this$pubts = this.getPubts();
        Date other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !((Object)this$pubts).equals(other$pubts)) {
            return false;
        }
        String this$businessAccount = this.getBusinessAccount();
        String other$businessAccount = other.getBusinessAccount();
        if (this$businessAccount == null ? other$businessAccount != null : !this$businessAccount.equals(other$businessAccount)) {
            return false;
        }
        String this$businessRole = this.getBusinessRole();
        String other$businessRole = other.getBusinessRole();
        if (this$businessRole == null ? other$businessRole != null : !this$businessRole.equals(other$businessRole)) {
            return false;
        }
        String this$cardOwnerName = this.getCardOwnerName();
        String other$cardOwnerName = other.getCardOwnerName();
        if (this$cardOwnerName == null ? other$cardOwnerName != null : !this$cardOwnerName.equals(other$cardOwnerName)) {
            return false;
        }
        Date this$finalSettlementDate = this.getFinalSettlementDate();
        Date other$finalSettlementDate = other.getFinalSettlementDate();
        if (this$finalSettlementDate == null ? other$finalSettlementDate != null : !((Object)this$finalSettlementDate).equals(other$finalSettlementDate)) {
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
        String this$receivingBank = this.getReceivingBank();
        String other$receivingBank = other.getReceivingBank();
        if (this$receivingBank == null ? other$receivingBank != null : !this$receivingBank.equals(other$receivingBank)) {
            return false;
        }
        String this$receivingBank___code = this.getReceivingBank___code();
        String other$receivingBank___code = other.getReceivingBank___code();
        if (this$receivingBank___code == null ? other$receivingBank___code != null : !this$receivingBank___code.equals(other$receivingBank___code)) {
            return false;
        }
        String this$receivingBank___name = this.getReceivingBank___name();
        String other$receivingBank___name = other.getReceivingBank___name();
        if (this$receivingBank___name == null ? other$receivingBank___name != null : !this$receivingBank___name.equals(other$receivingBank___name)) {
            return false;
        }
        String this$settlementMethod = this.getSettlementMethod();
        String other$settlementMethod = other.getSettlementMethod();
        if (this$settlementMethod == null ? other$settlementMethod != null : !this$settlementMethod.equals(other$settlementMethod)) {
            return false;
        }
        String this$toBImmigrationMode = this.getToBImmigrationMode();
        String other$toBImmigrationMode = other.getToBImmigrationMode();
        if (this$toBImmigrationMode == null ? other$toBImmigrationMode != null : !this$toBImmigrationMode.equals(other$toBImmigrationMode)) {
            return false;
        }
        Date this$uMappExpireDate = this.getUMappExpireDate();
        Date other$uMappExpireDate = other.getUMappExpireDate();
        if (this$uMappExpireDate == null ? other$uMappExpireDate != null : !((Object)this$uMappExpireDate).equals(other$uMappExpireDate)) {
            return false;
        }
        Date this$uOrderExpireDate = this.getUOrderExpireDate();
        Date other$uOrderExpireDate = other.getUOrderExpireDate();
        if (this$uOrderExpireDate == null ? other$uOrderExpireDate != null : !((Object)this$uOrderExpireDate).equals(other$uOrderExpireDate)) {
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
        return other instanceof MerchantRoleInfoDataDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $cardType = this.getCardType();
        result = result * 59 + ($cardType == null ? 43 : ((Object)$cardType).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Boolean $merchantOptions = this.getMerchantOptions();
        result = result * 59 + ($merchantOptions == null ? 43 : ((Object)$merchantOptions).hashCode());
        Integer $settlementCycle = this.getSettlementCycle();
        result = result * 59 + ($settlementCycle == null ? 43 : ((Object)$settlementCycle).hashCode());
        Date $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : ((Object)$pubts).hashCode());
        String $businessAccount = this.getBusinessAccount();
        result = result * 59 + ($businessAccount == null ? 43 : $businessAccount.hashCode());
        String $businessRole = this.getBusinessRole();
        result = result * 59 + ($businessRole == null ? 43 : $businessRole.hashCode());
        String $cardOwnerName = this.getCardOwnerName();
        result = result * 59 + ($cardOwnerName == null ? 43 : $cardOwnerName.hashCode());
        Date $finalSettlementDate = this.getFinalSettlementDate();
        result = result * 59 + ($finalSettlementDate == null ? 43 : ((Object)$finalSettlementDate).hashCode());
        String $merchantId___code = this.getMerchantId___code();
        result = result * 59 + ($merchantId___code == null ? 43 : $merchantId___code.hashCode());
        String $merchantId___name = this.getMerchantId___name();
        result = result * 59 + ($merchantId___name == null ? 43 : $merchantId___name.hashCode());
        String $receivingBank = this.getReceivingBank();
        result = result * 59 + ($receivingBank == null ? 43 : $receivingBank.hashCode());
        String $receivingBank___code = this.getReceivingBank___code();
        result = result * 59 + ($receivingBank___code == null ? 43 : $receivingBank___code.hashCode());
        String $receivingBank___name = this.getReceivingBank___name();
        result = result * 59 + ($receivingBank___name == null ? 43 : $receivingBank___name.hashCode());
        String $settlementMethod = this.getSettlementMethod();
        result = result * 59 + ($settlementMethod == null ? 43 : $settlementMethod.hashCode());
        String $toBImmigrationMode = this.getToBImmigrationMode();
        result = result * 59 + ($toBImmigrationMode == null ? 43 : $toBImmigrationMode.hashCode());
        Date $uMappExpireDate = this.getUMappExpireDate();
        result = result * 59 + ($uMappExpireDate == null ? 43 : ((Object)$uMappExpireDate).hashCode());
        Date $uOrderExpireDate = this.getUOrderExpireDate();
        result = result * 59 + ($uOrderExpireDate == null ? 43 : ((Object)$uOrderExpireDate).hashCode());
        UPCEntityStatus $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : ((Object)((Object)$entityStatus)).hashCode());
        List<String> $needBlankFieldList = this.getNeedBlankFieldList();
        result = result * 59 + ($needBlankFieldList == null ? 43 : ((Object)$needBlankFieldList).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantRoleInfoDataDTO(id=" + this.getId() + ", pubts=" + this.getPubts() + ", businessAccount=" + this.getBusinessAccount() + ", businessRole=" + this.getBusinessRole() + ", cardOwnerName=" + this.getCardOwnerName() + ", cardType=" + this.getCardType() + ", finalSettlementDate=" + this.getFinalSettlementDate() + ", merchantId=" + this.getMerchantId() + ", merchantId___code=" + this.getMerchantId___code() + ", merchantId___name=" + this.getMerchantId___name() + ", merchantOptions=" + this.getMerchantOptions() + ", receivingBank=" + this.getReceivingBank() + ", receivingBank___code=" + this.getReceivingBank___code() + ", receivingBank___name=" + this.getReceivingBank___name() + ", settlementCycle=" + this.getSettlementCycle() + ", settlementMethod=" + this.getSettlementMethod() + ", toBImmigrationMode=" + this.getToBImmigrationMode() + ", uMappExpireDate=" + this.getUMappExpireDate() + ", uOrderExpireDate=" + this.getUOrderExpireDate() + ", entityStatus=" + (Object)((Object)this.getEntityStatus()) + ", needBlankFieldList=" + this.getNeedBlankFieldList() + ")";
    }
}

