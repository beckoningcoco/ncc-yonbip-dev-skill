/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.openapi.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import java.io.Serializable;
import java.util.HashMap;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantContactOpenApiSaveDTO
implements Serializable {
    private Long id;
    public MultilingualVO fullName;
    public Long gender;
    public String contactDepartment;
    public String positionName;
    public String areaCodeMobile;
    public String mobile;
    public String telePhone;
    public String email;
    public String qq;
    public String weChat;
    public String remarks;
    public String stopStatus;
    public Boolean isDefault;
    private HashMap<String, Object> contacterCharacter;
    private String entityStatus;
    private String sourceUnique;

    public Long getId() {
        return this.id;
    }

    public MultilingualVO getFullName() {
        return this.fullName;
    }

    public Long getGender() {
        return this.gender;
    }

    public String getContactDepartment() {
        return this.contactDepartment;
    }

    public String getPositionName() {
        return this.positionName;
    }

    public String getAreaCodeMobile() {
        return this.areaCodeMobile;
    }

    public String getMobile() {
        return this.mobile;
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

    public String getRemarks() {
        return this.remarks;
    }

    public String getStopStatus() {
        return this.stopStatus;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public HashMap<String, Object> getContacterCharacter() {
        return this.contacterCharacter;
    }

    public String getEntityStatus() {
        return this.entityStatus;
    }

    public String getSourceUnique() {
        return this.sourceUnique;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFullName(MultilingualVO fullName) {
        this.fullName = fullName;
    }

    public void setGender(Long gender) {
        this.gender = gender;
    }

    public void setContactDepartment(String contactDepartment) {
        this.contactDepartment = contactDepartment;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public void setAreaCodeMobile(String areaCodeMobile) {
        this.areaCodeMobile = areaCodeMobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setStopStatus(String stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setContacterCharacter(HashMap<String, Object> contacterCharacter) {
        this.contacterCharacter = contacterCharacter;
    }

    public void setEntityStatus(String entityStatus) {
        this.entityStatus = entityStatus;
    }

    public void setSourceUnique(String sourceUnique) {
        this.sourceUnique = sourceUnique;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantContactOpenApiSaveDTO)) {
            return false;
        }
        MerchantContactOpenApiSaveDTO other = (MerchantContactOpenApiSaveDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
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
        MultilingualVO this$fullName = this.getFullName();
        MultilingualVO other$fullName = other.getFullName();
        if (this$fullName == null ? other$fullName != null : !((Object)this$fullName).equals(other$fullName)) {
            return false;
        }
        String this$contactDepartment = this.getContactDepartment();
        String other$contactDepartment = other.getContactDepartment();
        if (this$contactDepartment == null ? other$contactDepartment != null : !this$contactDepartment.equals(other$contactDepartment)) {
            return false;
        }
        String this$positionName = this.getPositionName();
        String other$positionName = other.getPositionName();
        if (this$positionName == null ? other$positionName != null : !this$positionName.equals(other$positionName)) {
            return false;
        }
        String this$areaCodeMobile = this.getAreaCodeMobile();
        String other$areaCodeMobile = other.getAreaCodeMobile();
        if (this$areaCodeMobile == null ? other$areaCodeMobile != null : !this$areaCodeMobile.equals(other$areaCodeMobile)) {
            return false;
        }
        String this$mobile = this.getMobile();
        String other$mobile = other.getMobile();
        if (this$mobile == null ? other$mobile != null : !this$mobile.equals(other$mobile)) {
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
        HashMap<String, Object> this$contacterCharacter = this.getContacterCharacter();
        HashMap<String, Object> other$contacterCharacter = other.getContacterCharacter();
        if (this$contacterCharacter == null ? other$contacterCharacter != null : !((Object)this$contacterCharacter).equals(other$contacterCharacter)) {
            return false;
        }
        String this$entityStatus = this.getEntityStatus();
        String other$entityStatus = other.getEntityStatus();
        if (this$entityStatus == null ? other$entityStatus != null : !this$entityStatus.equals(other$entityStatus)) {
            return false;
        }
        String this$sourceUnique = this.getSourceUnique();
        String other$sourceUnique = other.getSourceUnique();
        return !(this$sourceUnique == null ? other$sourceUnique != null : !this$sourceUnique.equals(other$sourceUnique));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantContactOpenApiSaveDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $gender = this.getGender();
        result = result * 59 + ($gender == null ? 43 : ((Object)$gender).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        MultilingualVO $fullName = this.getFullName();
        result = result * 59 + ($fullName == null ? 43 : $fullName.hashCode());
        String $contactDepartment = this.getContactDepartment();
        result = result * 59 + ($contactDepartment == null ? 43 : $contactDepartment.hashCode());
        String $positionName = this.getPositionName();
        result = result * 59 + ($positionName == null ? 43 : $positionName.hashCode());
        String $areaCodeMobile = this.getAreaCodeMobile();
        result = result * 59 + ($areaCodeMobile == null ? 43 : $areaCodeMobile.hashCode());
        String $mobile = this.getMobile();
        result = result * 59 + ($mobile == null ? 43 : $mobile.hashCode());
        String $telePhone = this.getTelePhone();
        result = result * 59 + ($telePhone == null ? 43 : $telePhone.hashCode());
        String $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        String $qq = this.getQq();
        result = result * 59 + ($qq == null ? 43 : $qq.hashCode());
        String $weChat = this.getWeChat();
        result = result * 59 + ($weChat == null ? 43 : $weChat.hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        String $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : $stopStatus.hashCode());
        HashMap<String, Object> $contacterCharacter = this.getContacterCharacter();
        result = result * 59 + ($contacterCharacter == null ? 43 : ((Object)$contacterCharacter).hashCode());
        String $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : $entityStatus.hashCode());
        String $sourceUnique = this.getSourceUnique();
        result = result * 59 + ($sourceUnique == null ? 43 : $sourceUnique.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantContactOpenApiSaveDTO(id=" + this.getId() + ", fullName=" + this.getFullName() + ", gender=" + this.getGender() + ", contactDepartment=" + this.getContactDepartment() + ", positionName=" + this.getPositionName() + ", areaCodeMobile=" + this.getAreaCodeMobile() + ", mobile=" + this.getMobile() + ", telePhone=" + this.getTelePhone() + ", email=" + this.getEmail() + ", qq=" + this.getQq() + ", weChat=" + this.getWeChat() + ", remarks=" + this.getRemarks() + ", stopStatus=" + this.getStopStatus() + ", isDefault=" + this.getIsDefault() + ", contacterCharacter=" + this.getContacterCharacter() + ", entityStatus=" + this.getEntityStatus() + ", sourceUnique=" + this.getSourceUnique() + ")";
    }
}

