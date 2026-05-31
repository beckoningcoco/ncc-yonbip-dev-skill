/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.yonyou.iuap.international.MultiLangText
 */
package com.yonyoucloud.iuap.upc.dto.merchantgroupdto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MultilingualDto;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ContactCrmDto
implements Serializable {
    private Long id;
    private Long merchantId;
    @Deprecated
    public MultilingualDto fullName;
    public MultiLangText fullName_multi;
    public Long gender;
    public String positionName;
    public String mobile;
    public String areaCodeMobile;
    public String telePhone;
    public String email;
    public String qq;
    public String weChat;
    public String stopStatus;
    public String crmContact;
    public String contactDepartment;
    public String remarks;
    public Boolean isDefault;
    private String erpCode;
    public HashMap<String, Object> contacterCharacter;
    private HashSet<String> blankSet;

    public Long getId() {
        return this.id;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    @Deprecated
    public MultilingualDto getFullName() {
        return this.fullName;
    }

    public MultiLangText getFullName_multi() {
        return this.fullName_multi;
    }

    public Long getGender() {
        return this.gender;
    }

    public String getPositionName() {
        return this.positionName;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getAreaCodeMobile() {
        return this.areaCodeMobile;
    }

    public String getTelePhone() {
        return this.telePhone;
    }

    public String getEmail() {
        return this.email;
    }

    public String getQq() {
        return this.qq;
    }

    public String getWeChat() {
        return this.weChat;
    }

    public String getStopStatus() {
        return this.stopStatus;
    }

    public String getCrmContact() {
        return this.crmContact;
    }

    public String getContactDepartment() {
        return this.contactDepartment;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public HashMap<String, Object> getContacterCharacter() {
        return this.contacterCharacter;
    }

    public HashSet<String> getBlankSet() {
        return this.blankSet;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    @Deprecated
    public void setFullName(MultilingualDto fullName) {
        this.fullName = fullName;
    }

    public void setFullName_multi(MultiLangText fullName_multi) {
        this.fullName_multi = fullName_multi;
    }

    public void setGender(Long gender) {
        this.gender = gender;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAreaCodeMobile(String areaCodeMobile) {
        this.areaCodeMobile = areaCodeMobile;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public void setStopStatus(String stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setCrmContact(String crmContact) {
        this.crmContact = crmContact;
    }

    public void setContactDepartment(String contactDepartment) {
        this.contactDepartment = contactDepartment;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setContacterCharacter(HashMap<String, Object> contacterCharacter) {
        this.contacterCharacter = contacterCharacter;
    }

    public void setBlankSet(HashSet<String> blankSet) {
        this.blankSet = blankSet;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ContactCrmDto)) {
            return false;
        }
        ContactCrmDto other = (ContactCrmDto)o;
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
        Long this$gender = this.getGender();
        Long other$gender = other.getGender();
        if (this$gender == null ? other$gender != null : !((Object)this$gender).equals(other$gender)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        MultilingualDto this$fullName = this.getFullName();
        MultilingualDto other$fullName = other.getFullName();
        if (this$fullName == null ? other$fullName != null : !((Object)this$fullName).equals(other$fullName)) {
            return false;
        }
        MultiLangText this$fullName_multi = this.getFullName_multi();
        MultiLangText other$fullName_multi = other.getFullName_multi();
        if (this$fullName_multi == null ? other$fullName_multi != null : !this$fullName_multi.equals(other$fullName_multi)) {
            return false;
        }
        String this$positionName = this.getPositionName();
        String other$positionName = other.getPositionName();
        if (this$positionName == null ? other$positionName != null : !this$positionName.equals(other$positionName)) {
            return false;
        }
        String this$mobile = this.getMobile();
        String other$mobile = other.getMobile();
        if (this$mobile == null ? other$mobile != null : !this$mobile.equals(other$mobile)) {
            return false;
        }
        String this$areaCodeMobile = this.getAreaCodeMobile();
        String other$areaCodeMobile = other.getAreaCodeMobile();
        if (this$areaCodeMobile == null ? other$areaCodeMobile != null : !this$areaCodeMobile.equals(other$areaCodeMobile)) {
            return false;
        }
        String this$telePhone = this.getTelePhone();
        String other$telePhone = other.getTelePhone();
        if (this$telePhone == null ? other$telePhone != null : !this$telePhone.equals(other$telePhone)) {
            return false;
        }
        String this$email = this.getEmail();
        String other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) {
            return false;
        }
        String this$qq = this.getQq();
        String other$qq = other.getQq();
        if (this$qq == null ? other$qq != null : !this$qq.equals(other$qq)) {
            return false;
        }
        String this$weChat = this.getWeChat();
        String other$weChat = other.getWeChat();
        if (this$weChat == null ? other$weChat != null : !this$weChat.equals(other$weChat)) {
            return false;
        }
        String this$stopStatus = this.getStopStatus();
        String other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !this$stopStatus.equals(other$stopStatus)) {
            return false;
        }
        String this$crmContact = this.getCrmContact();
        String other$crmContact = other.getCrmContact();
        if (this$crmContact == null ? other$crmContact != null : !this$crmContact.equals(other$crmContact)) {
            return false;
        }
        String this$contactDepartment = this.getContactDepartment();
        String other$contactDepartment = other.getContactDepartment();
        if (this$contactDepartment == null ? other$contactDepartment != null : !this$contactDepartment.equals(other$contactDepartment)) {
            return false;
        }
        String this$remarks = this.getRemarks();
        String other$remarks = other.getRemarks();
        if (this$remarks == null ? other$remarks != null : !this$remarks.equals(other$remarks)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        HashMap<String, Object> this$contacterCharacter = this.getContacterCharacter();
        HashMap<String, Object> other$contacterCharacter = other.getContacterCharacter();
        if (this$contacterCharacter == null ? other$contacterCharacter != null : !((Object)this$contacterCharacter).equals(other$contacterCharacter)) {
            return false;
        }
        HashSet<String> this$blankSet = this.getBlankSet();
        HashSet<String> other$blankSet = other.getBlankSet();
        return !(this$blankSet == null ? other$blankSet != null : !((Object)this$blankSet).equals(other$blankSet));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ContactCrmDto;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $gender = this.getGender();
        result = result * 59 + ($gender == null ? 43 : ((Object)$gender).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        MultilingualDto $fullName = this.getFullName();
        result = result * 59 + ($fullName == null ? 43 : ((Object)$fullName).hashCode());
        MultiLangText $fullName_multi = this.getFullName_multi();
        result = result * 59 + ($fullName_multi == null ? 43 : $fullName_multi.hashCode());
        String $positionName = this.getPositionName();
        result = result * 59 + ($positionName == null ? 43 : $positionName.hashCode());
        String $mobile = this.getMobile();
        result = result * 59 + ($mobile == null ? 43 : $mobile.hashCode());
        String $areaCodeMobile = this.getAreaCodeMobile();
        result = result * 59 + ($areaCodeMobile == null ? 43 : $areaCodeMobile.hashCode());
        String $telePhone = this.getTelePhone();
        result = result * 59 + ($telePhone == null ? 43 : $telePhone.hashCode());
        String $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        String $qq = this.getQq();
        result = result * 59 + ($qq == null ? 43 : $qq.hashCode());
        String $weChat = this.getWeChat();
        result = result * 59 + ($weChat == null ? 43 : $weChat.hashCode());
        String $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : $stopStatus.hashCode());
        String $crmContact = this.getCrmContact();
        result = result * 59 + ($crmContact == null ? 43 : $crmContact.hashCode());
        String $contactDepartment = this.getContactDepartment();
        result = result * 59 + ($contactDepartment == null ? 43 : $contactDepartment.hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        HashMap<String, Object> $contacterCharacter = this.getContacterCharacter();
        result = result * 59 + ($contacterCharacter == null ? 43 : ((Object)$contacterCharacter).hashCode());
        HashSet<String> $blankSet = this.getBlankSet();
        result = result * 59 + ($blankSet == null ? 43 : ((Object)$blankSet).hashCode());
        return result;
    }

    public String toString() {
        return "ContactCrmDto(id=" + this.getId() + ", merchantId=" + this.getMerchantId() + ", fullName=" + this.getFullName() + ", fullName_multi=" + this.getFullName_multi() + ", gender=" + this.getGender() + ", positionName=" + this.getPositionName() + ", mobile=" + this.getMobile() + ", areaCodeMobile=" + this.getAreaCodeMobile() + ", telePhone=" + this.getTelePhone() + ", email=" + this.getEmail() + ", qq=" + this.getQq() + ", weChat=" + this.getWeChat() + ", stopStatus=" + this.getStopStatus() + ", crmContact=" + this.getCrmContact() + ", contactDepartment=" + this.getContactDepartment() + ", remarks=" + this.getRemarks() + ", isDefault=" + this.getIsDefault() + ", erpCode=" + this.getErpCode() + ", contacterCharacter=" + this.getContacterCharacter() + ", blankSet=" + this.getBlankSet() + ")";
    }
}

