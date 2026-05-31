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
public class MerchantContacterDataDTO
implements Serializable {
    private Long id;
    private String areaCodeMobile;
    private String contactDepartment;
    private String crmContact;
    private Boolean custContact;
    private String email;
    private MultiLangText fullName;
    private String gender;
    private String isCreatorYhtUserType;
    private Boolean isDefault;
    private Boolean mallContact;
    private Long merchantId;
    private String merchantId___code;
    private String mobile;
    private Boolean orderContact;
    private String positionName;
    private String qq;
    private String remarks;
    private String stopStatus;
    private String telePhone;
    private String weChat;
    private String erpCode;
    private Date pubts;
    private HashMap<String, Object> contacterCharacter;
    private Map<String, Object> customExtend;
    private UPCEntityStatus entityStatus;
    private List<String> needBlankFieldList;

    public Long getId() {
        return this.id;
    }

    public String getAreaCodeMobile() {
        return this.areaCodeMobile;
    }

    public String getContactDepartment() {
        return this.contactDepartment;
    }

    public String getCrmContact() {
        return this.crmContact;
    }

    public Boolean getCustContact() {
        return this.custContact;
    }

    public String getEmail() {
        return this.email;
    }

    public MultiLangText getFullName() {
        return this.fullName;
    }

    public String getGender() {
        return this.gender;
    }

    public String getIsCreatorYhtUserType() {
        return this.isCreatorYhtUserType;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public Boolean getMallContact() {
        return this.mallContact;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantId___code() {
        return this.merchantId___code;
    }

    public String getMobile() {
        return this.mobile;
    }

    public Boolean getOrderContact() {
        return this.orderContact;
    }

    public String getPositionName() {
        return this.positionName;
    }

    public String getQq() {
        return this.qq;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getStopStatus() {
        return this.stopStatus;
    }

    public String getTelePhone() {
        return this.telePhone;
    }

    public String getWeChat() {
        return this.weChat;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public Date getPubts() {
        return this.pubts;
    }

    public HashMap<String, Object> getContacterCharacter() {
        return this.contacterCharacter;
    }

    public Map<String, Object> getCustomExtend() {
        return this.customExtend;
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

    public void setAreaCodeMobile(String areaCodeMobile) {
        this.areaCodeMobile = areaCodeMobile;
    }

    public void setContactDepartment(String contactDepartment) {
        this.contactDepartment = contactDepartment;
    }

    public void setCrmContact(String crmContact) {
        this.crmContact = crmContact;
    }

    public void setCustContact(Boolean custContact) {
        this.custContact = custContact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(MultiLangText fullName) {
        this.fullName = fullName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setIsCreatorYhtUserType(String isCreatorYhtUserType) {
        this.isCreatorYhtUserType = isCreatorYhtUserType;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setMallContact(Boolean mallContact) {
        this.mallContact = mallContact;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantId___code(String merchantId___code) {
        this.merchantId___code = merchantId___code;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setOrderContact(Boolean orderContact) {
        this.orderContact = orderContact;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setStopStatus(String stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setPubts(Date pubts) {
        this.pubts = pubts;
    }

    public void setContacterCharacter(HashMap<String, Object> contacterCharacter) {
        this.contacterCharacter = contacterCharacter;
    }

    public void setCustomExtend(Map<String, Object> customExtend) {
        this.customExtend = customExtend;
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
        if (!(o instanceof MerchantContacterDataDTO)) {
            return false;
        }
        MerchantContacterDataDTO other = (MerchantContacterDataDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Boolean this$custContact = this.getCustContact();
        Boolean other$custContact = other.getCustContact();
        if (this$custContact == null ? other$custContact != null : !((Object)this$custContact).equals(other$custContact)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        Boolean this$mallContact = this.getMallContact();
        Boolean other$mallContact = other.getMallContact();
        if (this$mallContact == null ? other$mallContact != null : !((Object)this$mallContact).equals(other$mallContact)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Boolean this$orderContact = this.getOrderContact();
        Boolean other$orderContact = other.getOrderContact();
        if (this$orderContact == null ? other$orderContact != null : !((Object)this$orderContact).equals(other$orderContact)) {
            return false;
        }
        String this$areaCodeMobile = this.getAreaCodeMobile();
        String other$areaCodeMobile = other.getAreaCodeMobile();
        if (this$areaCodeMobile == null ? other$areaCodeMobile != null : !this$areaCodeMobile.equals(other$areaCodeMobile)) {
            return false;
        }
        String this$contactDepartment = this.getContactDepartment();
        String other$contactDepartment = other.getContactDepartment();
        if (this$contactDepartment == null ? other$contactDepartment != null : !this$contactDepartment.equals(other$contactDepartment)) {
            return false;
        }
        String this$crmContact = this.getCrmContact();
        String other$crmContact = other.getCrmContact();
        if (this$crmContact == null ? other$crmContact != null : !this$crmContact.equals(other$crmContact)) {
            return false;
        }
        String this$email = this.getEmail();
        String other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) {
            return false;
        }
        MultiLangText this$fullName = this.getFullName();
        MultiLangText other$fullName = other.getFullName();
        if (this$fullName == null ? other$fullName != null : !this$fullName.equals(other$fullName)) {
            return false;
        }
        String this$gender = this.getGender();
        String other$gender = other.getGender();
        if (this$gender == null ? other$gender != null : !this$gender.equals(other$gender)) {
            return false;
        }
        String this$isCreatorYhtUserType = this.getIsCreatorYhtUserType();
        String other$isCreatorYhtUserType = other.getIsCreatorYhtUserType();
        if (this$isCreatorYhtUserType == null ? other$isCreatorYhtUserType != null : !this$isCreatorYhtUserType.equals(other$isCreatorYhtUserType)) {
            return false;
        }
        String this$merchantId___code = this.getMerchantId___code();
        String other$merchantId___code = other.getMerchantId___code();
        if (this$merchantId___code == null ? other$merchantId___code != null : !this$merchantId___code.equals(other$merchantId___code)) {
            return false;
        }
        String this$mobile = this.getMobile();
        String other$mobile = other.getMobile();
        if (this$mobile == null ? other$mobile != null : !this$mobile.equals(other$mobile)) {
            return false;
        }
        String this$positionName = this.getPositionName();
        String other$positionName = other.getPositionName();
        if (this$positionName == null ? other$positionName != null : !this$positionName.equals(other$positionName)) {
            return false;
        }
        String this$qq = this.getQq();
        String other$qq = other.getQq();
        if (this$qq == null ? other$qq != null : !this$qq.equals(other$qq)) {
            return false;
        }
        String this$remarks = this.getRemarks();
        String other$remarks = other.getRemarks();
        if (this$remarks == null ? other$remarks != null : !this$remarks.equals(other$remarks)) {
            return false;
        }
        String this$stopStatus = this.getStopStatus();
        String other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !this$stopStatus.equals(other$stopStatus)) {
            return false;
        }
        String this$telePhone = this.getTelePhone();
        String other$telePhone = other.getTelePhone();
        if (this$telePhone == null ? other$telePhone != null : !this$telePhone.equals(other$telePhone)) {
            return false;
        }
        String this$weChat = this.getWeChat();
        String other$weChat = other.getWeChat();
        if (this$weChat == null ? other$weChat != null : !this$weChat.equals(other$weChat)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        Date this$pubts = this.getPubts();
        Date other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !((Object)this$pubts).equals(other$pubts)) {
            return false;
        }
        HashMap<String, Object> this$contacterCharacter = this.getContacterCharacter();
        HashMap<String, Object> other$contacterCharacter = other.getContacterCharacter();
        if (this$contacterCharacter == null ? other$contacterCharacter != null : !((Object)this$contacterCharacter).equals(other$contacterCharacter)) {
            return false;
        }
        Map<String, Object> this$customExtend = this.getCustomExtend();
        Map<String, Object> other$customExtend = other.getCustomExtend();
        if (this$customExtend == null ? other$customExtend != null : !((Object)this$customExtend).equals(other$customExtend)) {
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
        return other instanceof MerchantContacterDataDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Boolean $custContact = this.getCustContact();
        result = result * 59 + ($custContact == null ? 43 : ((Object)$custContact).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        Boolean $mallContact = this.getMallContact();
        result = result * 59 + ($mallContact == null ? 43 : ((Object)$mallContact).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Boolean $orderContact = this.getOrderContact();
        result = result * 59 + ($orderContact == null ? 43 : ((Object)$orderContact).hashCode());
        String $areaCodeMobile = this.getAreaCodeMobile();
        result = result * 59 + ($areaCodeMobile == null ? 43 : $areaCodeMobile.hashCode());
        String $contactDepartment = this.getContactDepartment();
        result = result * 59 + ($contactDepartment == null ? 43 : $contactDepartment.hashCode());
        String $crmContact = this.getCrmContact();
        result = result * 59 + ($crmContact == null ? 43 : $crmContact.hashCode());
        String $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        MultiLangText $fullName = this.getFullName();
        result = result * 59 + ($fullName == null ? 43 : $fullName.hashCode());
        String $gender = this.getGender();
        result = result * 59 + ($gender == null ? 43 : $gender.hashCode());
        String $isCreatorYhtUserType = this.getIsCreatorYhtUserType();
        result = result * 59 + ($isCreatorYhtUserType == null ? 43 : $isCreatorYhtUserType.hashCode());
        String $merchantId___code = this.getMerchantId___code();
        result = result * 59 + ($merchantId___code == null ? 43 : $merchantId___code.hashCode());
        String $mobile = this.getMobile();
        result = result * 59 + ($mobile == null ? 43 : $mobile.hashCode());
        String $positionName = this.getPositionName();
        result = result * 59 + ($positionName == null ? 43 : $positionName.hashCode());
        String $qq = this.getQq();
        result = result * 59 + ($qq == null ? 43 : $qq.hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        String $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : $stopStatus.hashCode());
        String $telePhone = this.getTelePhone();
        result = result * 59 + ($telePhone == null ? 43 : $telePhone.hashCode());
        String $weChat = this.getWeChat();
        result = result * 59 + ($weChat == null ? 43 : $weChat.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        Date $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : ((Object)$pubts).hashCode());
        HashMap<String, Object> $contacterCharacter = this.getContacterCharacter();
        result = result * 59 + ($contacterCharacter == null ? 43 : ((Object)$contacterCharacter).hashCode());
        Map<String, Object> $customExtend = this.getCustomExtend();
        result = result * 59 + ($customExtend == null ? 43 : ((Object)$customExtend).hashCode());
        UPCEntityStatus $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : ((Object)((Object)$entityStatus)).hashCode());
        List<String> $needBlankFieldList = this.getNeedBlankFieldList();
        result = result * 59 + ($needBlankFieldList == null ? 43 : ((Object)$needBlankFieldList).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantContacterDataDTO(id=" + this.getId() + ", areaCodeMobile=" + this.getAreaCodeMobile() + ", contactDepartment=" + this.getContactDepartment() + ", crmContact=" + this.getCrmContact() + ", custContact=" + this.getCustContact() + ", email=" + this.getEmail() + ", fullName=" + this.getFullName() + ", gender=" + this.getGender() + ", isCreatorYhtUserType=" + this.getIsCreatorYhtUserType() + ", isDefault=" + this.getIsDefault() + ", mallContact=" + this.getMallContact() + ", merchantId=" + this.getMerchantId() + ", merchantId___code=" + this.getMerchantId___code() + ", mobile=" + this.getMobile() + ", orderContact=" + this.getOrderContact() + ", positionName=" + this.getPositionName() + ", qq=" + this.getQq() + ", remarks=" + this.getRemarks() + ", stopStatus=" + this.getStopStatus() + ", telePhone=" + this.getTelePhone() + ", weChat=" + this.getWeChat() + ", erpCode=" + this.getErpCode() + ", pubts=" + this.getPubts() + ", contacterCharacter=" + this.getContacterCharacter() + ", customExtend=" + this.getCustomExtend() + ", entityStatus=" + (Object)((Object)this.getEntityStatus()) + ", needBlankFieldList=" + this.getNeedBlankFieldList() + ")";
    }
}

