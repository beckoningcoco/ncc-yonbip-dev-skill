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
public class MerchantManagerDTO
implements Serializable {
    private Long id;
    private Long merchantId;
    private String userName;
    private String mobile;
    private String fullName;
    private String email;
    private String qq;
    private Date expireDate;
    private String countryCode;
    private String yhtUserId;

    public Long getId() {
        return this.id;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getQq() {
        return this.qq;
    }

    public Date getExpireDate() {
        return this.expireDate;
    }

    public String getCountryCode() {
        return this.countryCode;
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

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setYhtUserId(String yhtUserId) {
        this.yhtUserId = yhtUserId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantManagerDTO)) {
            return false;
        }
        MerchantManagerDTO other = (MerchantManagerDTO)o;
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
        String this$userName = this.getUserName();
        String other$userName = other.getUserName();
        if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) {
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
        Date this$expireDate = this.getExpireDate();
        Date other$expireDate = other.getExpireDate();
        if (this$expireDate == null ? other$expireDate != null : !((Object)this$expireDate).equals(other$expireDate)) {
            return false;
        }
        String this$countryCode = this.getCountryCode();
        String other$countryCode = other.getCountryCode();
        if (this$countryCode == null ? other$countryCode != null : !this$countryCode.equals(other$countryCode)) {
            return false;
        }
        String this$yhtUserId = this.getYhtUserId();
        String other$yhtUserId = other.getYhtUserId();
        return !(this$yhtUserId == null ? other$yhtUserId != null : !this$yhtUserId.equals(other$yhtUserId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantManagerDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        String $userName = this.getUserName();
        result = result * 59 + ($userName == null ? 43 : $userName.hashCode());
        String $mobile = this.getMobile();
        result = result * 59 + ($mobile == null ? 43 : $mobile.hashCode());
        String $fullName = this.getFullName();
        result = result * 59 + ($fullName == null ? 43 : $fullName.hashCode());
        String $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        String $qq = this.getQq();
        result = result * 59 + ($qq == null ? 43 : $qq.hashCode());
        Date $expireDate = this.getExpireDate();
        result = result * 59 + ($expireDate == null ? 43 : ((Object)$expireDate).hashCode());
        String $countryCode = this.getCountryCode();
        result = result * 59 + ($countryCode == null ? 43 : $countryCode.hashCode());
        String $yhtUserId = this.getYhtUserId();
        result = result * 59 + ($yhtUserId == null ? 43 : $yhtUserId.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantManagerDTO(id=" + this.getId() + ", merchantId=" + this.getMerchantId() + ", userName=" + this.getUserName() + ", mobile=" + this.getMobile() + ", fullName=" + this.getFullName() + ", email=" + this.getEmail() + ", qq=" + this.getQq() + ", expireDate=" + this.getExpireDate() + ", countryCode=" + this.getCountryCode() + ", yhtUserId=" + this.getYhtUserId() + ")";
    }
}

