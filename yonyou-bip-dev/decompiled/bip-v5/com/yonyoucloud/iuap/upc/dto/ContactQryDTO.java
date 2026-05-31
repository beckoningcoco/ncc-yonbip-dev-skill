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
public class ContactQryDTO
implements Serializable {
    private String[] fields;
    private Long id;
    private Long merchantId;
    private List<Long> merchantIdList;
    private String mobile;
    private String fullName;
    private List<String> fullNameList;
    private Boolean defaultContact;
    private String fuzzyFullName;
    private String stopStatus;

    public String[] getFields() {
        return this.fields;
    }

    public Long getId() {
        return this.id;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public List<Long> getMerchantIdList() {
        return this.merchantIdList;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getFullName() {
        return this.fullName;
    }

    public List<String> getFullNameList() {
        return this.fullNameList;
    }

    public Boolean getDefaultContact() {
        return this.defaultContact;
    }

    public String getFuzzyFullName() {
        return this.fuzzyFullName;
    }

    public String getStopStatus() {
        return this.stopStatus;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantIdList(List<Long> merchantIdList) {
        this.merchantIdList = merchantIdList;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setFullNameList(List<String> fullNameList) {
        this.fullNameList = fullNameList;
    }

    public void setDefaultContact(Boolean defaultContact) {
        this.defaultContact = defaultContact;
    }

    public void setFuzzyFullName(String fuzzyFullName) {
        this.fuzzyFullName = fuzzyFullName;
    }

    public void setStopStatus(String stopStatus) {
        this.stopStatus = stopStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ContactQryDTO)) {
            return false;
        }
        ContactQryDTO other = (ContactQryDTO)o;
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
        Boolean this$defaultContact = this.getDefaultContact();
        Boolean other$defaultContact = other.getDefaultContact();
        if (this$defaultContact == null ? other$defaultContact != null : !((Object)this$defaultContact).equals(other$defaultContact)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getFields(), other.getFields())) {
            return false;
        }
        List<Long> this$merchantIdList = this.getMerchantIdList();
        List<Long> other$merchantIdList = other.getMerchantIdList();
        if (this$merchantIdList == null ? other$merchantIdList != null : !((Object)this$merchantIdList).equals(other$merchantIdList)) {
            return false;
        }
        String this$mobile = this.getMobile();
        String other$mobile = other.getMobile();
        if (this$mobile == null ? other$mobile != null : !this$mobile.equals(other$mobile)) {
            return false;
        }
        String this$fullName = this.getFullName();
        String other$fullName = other.getFullName();
        if (this$fullName == null ? other$fullName != null : !this$fullName.equals(other$fullName)) {
            return false;
        }
        List<String> this$fullNameList = this.getFullNameList();
        List<String> other$fullNameList = other.getFullNameList();
        if (this$fullNameList == null ? other$fullNameList != null : !((Object)this$fullNameList).equals(other$fullNameList)) {
            return false;
        }
        String this$fuzzyFullName = this.getFuzzyFullName();
        String other$fuzzyFullName = other.getFuzzyFullName();
        if (this$fuzzyFullName == null ? other$fuzzyFullName != null : !this$fuzzyFullName.equals(other$fuzzyFullName)) {
            return false;
        }
        String this$stopStatus = this.getStopStatus();
        String other$stopStatus = other.getStopStatus();
        return !(this$stopStatus == null ? other$stopStatus != null : !this$stopStatus.equals(other$stopStatus));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ContactQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Boolean $defaultContact = this.getDefaultContact();
        result = result * 59 + ($defaultContact == null ? 43 : ((Object)$defaultContact).hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getFields());
        List<Long> $merchantIdList = this.getMerchantIdList();
        result = result * 59 + ($merchantIdList == null ? 43 : ((Object)$merchantIdList).hashCode());
        String $mobile = this.getMobile();
        result = result * 59 + ($mobile == null ? 43 : $mobile.hashCode());
        String $fullName = this.getFullName();
        result = result * 59 + ($fullName == null ? 43 : $fullName.hashCode());
        List<String> $fullNameList = this.getFullNameList();
        result = result * 59 + ($fullNameList == null ? 43 : ((Object)$fullNameList).hashCode());
        String $fuzzyFullName = this.getFuzzyFullName();
        result = result * 59 + ($fuzzyFullName == null ? 43 : $fuzzyFullName.hashCode());
        String $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : $stopStatus.hashCode());
        return result;
    }

    public String toString() {
        return "ContactQryDTO(fields=" + Arrays.deepToString(this.getFields()) + ", id=" + this.getId() + ", merchantId=" + this.getMerchantId() + ", merchantIdList=" + this.getMerchantIdList() + ", mobile=" + this.getMobile() + ", fullName=" + this.getFullName() + ", fullNameList=" + this.getFullNameList() + ", defaultContact=" + this.getDefaultContact() + ", fuzzyFullName=" + this.getFuzzyFullName() + ", stopStatus=" + this.getStopStatus() + ")";
    }
}

