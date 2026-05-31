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

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ContactDTO
implements Serializable {
    private Long id;
    private Long merchantId;
    private String fullName;
    private Integer genderType;
    private String positionName;
    private String mobile;
    private String areaCodeMobile;
    private String telephone;
    private String email;
    private Boolean defaultContact;
    private Boolean merchantContact;
    private Boolean orderContact;
    private Boolean mallContact;
    private String qq;
    private String weChat;
    private String remarks;
    private String yhtUserId;
    private Integer creatorYhtUserType;
    private String stopStatus;

    public Long getId() {
        return this.id;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getFullName() {
        return this.fullName;
    }

    public Integer getGenderType() {
        return this.genderType;
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

    public String getTelephone() {
        return this.telephone;
    }

    public String getEmail() {
        return this.email;
    }

    public Boolean getDefaultContact() {
        return this.defaultContact;
    }

    public Boolean getMerchantContact() {
        return this.merchantContact;
    }

    public Boolean getOrderContact() {
        return this.orderContact;
    }

    public Boolean getMallContact() {
        return this.mallContact;
    }

    public String getQq() {
        return this.qq;
    }

    public String getWeChat() {
        return this.weChat;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getYhtUserId() {
        return this.yhtUserId;
    }

    public Integer getCreatorYhtUserType() {
        return this.creatorYhtUserType;
    }

    public String getStopStatus() {
        return this.stopStatus;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGenderType(Integer genderType) {
        this.genderType = genderType;
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

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDefaultContact(Boolean defaultContact) {
        this.defaultContact = defaultContact;
    }

    public void setMerchantContact(Boolean merchantContact) {
        this.merchantContact = merchantContact;
    }

    public void setOrderContact(Boolean orderContact) {
        this.orderContact = orderContact;
    }

    public void setMallContact(Boolean mallContact) {
        this.mallContact = mallContact;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public void setWeChat(String weChat) {
        this.weChat = weChat;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setYhtUserId(String yhtUserId) {
        this.yhtUserId = yhtUserId;
    }

    public void setCreatorYhtUserType(Integer creatorYhtUserType) {
        this.creatorYhtUserType = creatorYhtUserType;
    }

    public void setStopStatus(String stopStatus) {
        this.stopStatus = stopStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ContactDTO)) {
            return false;
        }
        ContactDTO other = (ContactDTO)o;
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
        Integer this$genderType = this.getGenderType();
        Integer other$genderType = other.getGenderType();
        if (this$genderType == null ? other$genderType != null : !((Object)this$genderType).equals(other$genderType)) {
            return false;
        }
        Boolean this$defaultContact = this.getDefaultContact();
        Boolean other$defaultContact = other.getDefaultContact();
        if (this$defaultContact == null ? other$defaultContact != null : !((Object)this$defaultContact).equals(other$defaultContact)) {
            return false;
        }
        Boolean this$merchantContact = this.getMerchantContact();
        Boolean other$merchantContact = other.getMerchantContact();
        if (this$merchantContact == null ? other$merchantContact != null : !((Object)this$merchantContact).equals(other$merchantContact)) {
            return false;
        }
        Boolean this$orderContact = this.getOrderContact();
        Boolean other$orderContact = other.getOrderContact();
        if (this$orderContact == null ? other$orderContact != null : !((Object)this$orderContact).equals(other$orderContact)) {
            return false;
        }
        Boolean this$mallContact = this.getMallContact();
        Boolean other$mallContact = other.getMallContact();
        if (this$mallContact == null ? other$mallContact != null : !((Object)this$mallContact).equals(other$mallContact)) {
            return false;
        }
        Integer this$creatorYhtUserType = this.getCreatorYhtUserType();
        Integer other$creatorYhtUserType = other.getCreatorYhtUserType();
        if (this$creatorYhtUserType == null ? other$creatorYhtUserType != null : !((Object)this$creatorYhtUserType).equals(other$creatorYhtUserType)) {
            return false;
        }
        String this$fullName = this.getFullName();
        String other$fullName = other.getFullName();
        if (this$fullName == null ? other$fullName != null : !this$fullName.equals(other$fullName)) {
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
        String this$telephone = this.getTelephone();
        String other$telephone = other.getTelephone();
        if (this$telephone == null ? other$telephone != null : !this$telephone.equals(other$telephone)) {
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
        String this$remarks = this.getRemarks();
        String other$remarks = other.getRemarks();
        if (this$remarks == null ? other$remarks != null : !this$remarks.equals(other$remarks)) {
            return false;
        }
        String this$yhtUserId = this.getYhtUserId();
        String other$yhtUserId = other.getYhtUserId();
        if (this$yhtUserId == null ? other$yhtUserId != null : !this$yhtUserId.equals(other$yhtUserId)) {
            return false;
        }
        String this$stopStatus = this.getStopStatus();
        String other$stopStatus = other.getStopStatus();
        return !(this$stopStatus == null ? other$stopStatus != null : !this$stopStatus.equals(other$stopStatus));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ContactDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Integer $genderType = this.getGenderType();
        result = result * 59 + ($genderType == null ? 43 : ((Object)$genderType).hashCode());
        Boolean $defaultContact = this.getDefaultContact();
        result = result * 59 + ($defaultContact == null ? 43 : ((Object)$defaultContact).hashCode());
        Boolean $merchantContact = this.getMerchantContact();
        result = result * 59 + ($merchantContact == null ? 43 : ((Object)$merchantContact).hashCode());
        Boolean $orderContact = this.getOrderContact();
        result = result * 59 + ($orderContact == null ? 43 : ((Object)$orderContact).hashCode());
        Boolean $mallContact = this.getMallContact();
        result = result * 59 + ($mallContact == null ? 43 : ((Object)$mallContact).hashCode());
        Integer $creatorYhtUserType = this.getCreatorYhtUserType();
        result = result * 59 + ($creatorYhtUserType == null ? 43 : ((Object)$creatorYhtUserType).hashCode());
        String $fullName = this.getFullName();
        result = result * 59 + ($fullName == null ? 43 : $fullName.hashCode());
        String $positionName = this.getPositionName();
        result = result * 59 + ($positionName == null ? 43 : $positionName.hashCode());
        String $mobile = this.getMobile();
        result = result * 59 + ($mobile == null ? 43 : $mobile.hashCode());
        String $areaCodeMobile = this.getAreaCodeMobile();
        result = result * 59 + ($areaCodeMobile == null ? 43 : $areaCodeMobile.hashCode());
        String $telephone = this.getTelephone();
        result = result * 59 + ($telephone == null ? 43 : $telephone.hashCode());
        String $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        String $qq = this.getQq();
        result = result * 59 + ($qq == null ? 43 : $qq.hashCode());
        String $weChat = this.getWeChat();
        result = result * 59 + ($weChat == null ? 43 : $weChat.hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        String $yhtUserId = this.getYhtUserId();
        result = result * 59 + ($yhtUserId == null ? 43 : $yhtUserId.hashCode());
        String $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : $stopStatus.hashCode());
        return result;
    }

    public String toString() {
        return "ContactDTO(id=" + this.getId() + ", merchantId=" + this.getMerchantId() + ", fullName=" + this.getFullName() + ", genderType=" + this.getGenderType() + ", positionName=" + this.getPositionName() + ", mobile=" + this.getMobile() + ", areaCodeMobile=" + this.getAreaCodeMobile() + ", telephone=" + this.getTelephone() + ", email=" + this.getEmail() + ", defaultContact=" + this.getDefaultContact() + ", merchantContact=" + this.getMerchantContact() + ", orderContact=" + this.getOrderContact() + ", mallContact=" + this.getMallContact() + ", qq=" + this.getQq() + ", weChat=" + this.getWeChat() + ", remarks=" + this.getRemarks() + ", yhtUserId=" + this.getYhtUserId() + ", creatorYhtUserType=" + this.getCreatorYhtUserType() + ", stopStatus=" + this.getStopStatus() + ")";
    }
}

