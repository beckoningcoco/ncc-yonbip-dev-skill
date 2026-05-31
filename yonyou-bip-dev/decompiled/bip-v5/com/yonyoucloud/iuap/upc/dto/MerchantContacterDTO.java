/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.yonyou.iuap.international.MultiLangText
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.international.MultiLangText;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantContacterDTO
implements Serializable {
    private Long id;
    private Long merchantId;
    private String fullName;
    private MultiLangText fullName_multilang;
    private String genderType;
    private String positionName;
    private String mobile;
    private String areaCodeMobile;
    private String telePhone;
    private String email;
    private Boolean isDefault;
    private Boolean custContact;
    private Boolean orderContact;
    private Boolean mallContact;
    private String yhtUserId;

    public Long getId() {
        return this.id;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getFullName() {
        return this.fullName;
    }

    public MultiLangText getFullName_multilang() {
        return this.fullName_multilang;
    }

    public String getGenderType() {
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

    public String getTelePhone() {
        return this.telePhone;
    }

    public String getEmail() {
        return this.email;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public Boolean getCustContact() {
        return this.custContact;
    }

    public Boolean getOrderContact() {
        return this.orderContact;
    }

    public Boolean getMallContact() {
        return this.mallContact;
    }

    public String getYhtUserId() {
        return this.yhtUserId;
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

    public void setFullName_multilang(MultiLangText fullName_multilang) {
        this.fullName_multilang = fullName_multilang;
    }

    public void setGenderType(String genderType) {
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

    public void setTelePhone(String telePhone) {
        this.telePhone = telePhone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setCustContact(Boolean custContact) {
        this.custContact = custContact;
    }

    public void setOrderContact(Boolean orderContact) {
        this.orderContact = orderContact;
    }

    public void setMallContact(Boolean mallContact) {
        this.mallContact = mallContact;
    }

    public void setYhtUserId(String yhtUserId) {
        this.yhtUserId = yhtUserId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantContacterDTO)) {
            return false;
        }
        MerchantContacterDTO other = (MerchantContacterDTO)o;
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
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        Boolean this$custContact = this.getCustContact();
        Boolean other$custContact = other.getCustContact();
        if (this$custContact == null ? other$custContact != null : !((Object)this$custContact).equals(other$custContact)) {
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
        String this$fullName = this.getFullName();
        String other$fullName = other.getFullName();
        if (this$fullName == null ? other$fullName != null : !this$fullName.equals(other$fullName)) {
            return false;
        }
        MultiLangText this$fullName_multilang = this.getFullName_multilang();
        MultiLangText other$fullName_multilang = other.getFullName_multilang();
        if (this$fullName_multilang == null ? other$fullName_multilang != null : !this$fullName_multilang.equals(other$fullName_multilang)) {
            return false;
        }
        String this$genderType = this.getGenderType();
        String other$genderType = other.getGenderType();
        if (this$genderType == null ? other$genderType != null : !this$genderType.equals(other$genderType)) {
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
        String this$yhtUserId = this.getYhtUserId();
        String other$yhtUserId = other.getYhtUserId();
        return !(this$yhtUserId == null ? other$yhtUserId != null : !this$yhtUserId.equals(other$yhtUserId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantContacterDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        Boolean $custContact = this.getCustContact();
        result = result * 59 + ($custContact == null ? 43 : ((Object)$custContact).hashCode());
        Boolean $orderContact = this.getOrderContact();
        result = result * 59 + ($orderContact == null ? 43 : ((Object)$orderContact).hashCode());
        Boolean $mallContact = this.getMallContact();
        result = result * 59 + ($mallContact == null ? 43 : ((Object)$mallContact).hashCode());
        String $fullName = this.getFullName();
        result = result * 59 + ($fullName == null ? 43 : $fullName.hashCode());
        MultiLangText $fullName_multilang = this.getFullName_multilang();
        result = result * 59 + ($fullName_multilang == null ? 43 : $fullName_multilang.hashCode());
        String $genderType = this.getGenderType();
        result = result * 59 + ($genderType == null ? 43 : $genderType.hashCode());
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
        String $yhtUserId = this.getYhtUserId();
        result = result * 59 + ($yhtUserId == null ? 43 : $yhtUserId.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantContacterDTO(id=" + this.getId() + ", merchantId=" + this.getMerchantId() + ", fullName=" + this.getFullName() + ", fullName_multilang=" + this.getFullName_multilang() + ", genderType=" + this.getGenderType() + ", positionName=" + this.getPositionName() + ", mobile=" + this.getMobile() + ", areaCodeMobile=" + this.getAreaCodeMobile() + ", telePhone=" + this.getTelePhone() + ", email=" + this.getEmail() + ", isDefault=" + this.getIsDefault() + ", custContact=" + this.getCustContact() + ", orderContact=" + this.getOrderContact() + ", mallContact=" + this.getMallContact() + ", yhtUserId=" + this.getYhtUserId() + ")";
    }
}

