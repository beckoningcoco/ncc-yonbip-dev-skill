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
public class MerchantStaffDTO
implements Serializable {
    private Long id;
    private String code;
    private Long merchantId;
    private String merchantName;
    private String userName;
    private String fullName;
    private String mobile;
    private String email;
    private String qq;
    private String weChat;
    private String remarks;
    private String yhtUserId;
    private String source;
    private String headPicUrl;
    private String position;
    private Date entryTime;
    private Date leaveTime;
    private Integer gender;

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getMobile() {
        return this.mobile;
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

    public String getYhtUserId() {
        return this.yhtUserId;
    }

    public String getSource() {
        return this.source;
    }

    public String getHeadPicUrl() {
        return this.headPicUrl;
    }

    public String getPosition() {
        return this.position;
    }

    public Date getEntryTime() {
        return this.entryTime;
    }

    public Date getLeaveTime() {
        return this.leaveTime;
    }

    public Integer getGender() {
        return this.gender;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public void setYhtUserId(String yhtUserId) {
        this.yhtUserId = yhtUserId;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setHeadPicUrl(String headPicUrl) {
        this.headPicUrl = headPicUrl;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantStaffDTO)) {
            return false;
        }
        MerchantStaffDTO other = (MerchantStaffDTO)o;
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
        Integer this$gender = this.getGender();
        Integer other$gender = other.getGender();
        if (this$gender == null ? other$gender != null : !((Object)this$gender).equals(other$gender)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$merchantName = this.getMerchantName();
        String other$merchantName = other.getMerchantName();
        if (this$merchantName == null ? other$merchantName != null : !this$merchantName.equals(other$merchantName)) {
            return false;
        }
        String this$userName = this.getUserName();
        String other$userName = other.getUserName();
        if (this$userName == null ? other$userName != null : !this$userName.equals(other$userName)) {
            return false;
        }
        String this$fullName = this.getFullName();
        String other$fullName = other.getFullName();
        if (this$fullName == null ? other$fullName != null : !this$fullName.equals(other$fullName)) {
            return false;
        }
        String this$mobile = this.getMobile();
        String other$mobile = other.getMobile();
        if (this$mobile == null ? other$mobile != null : !this$mobile.equals(other$mobile)) {
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
        String this$source = this.getSource();
        String other$source = other.getSource();
        if (this$source == null ? other$source != null : !this$source.equals(other$source)) {
            return false;
        }
        String this$headPicUrl = this.getHeadPicUrl();
        String other$headPicUrl = other.getHeadPicUrl();
        if (this$headPicUrl == null ? other$headPicUrl != null : !this$headPicUrl.equals(other$headPicUrl)) {
            return false;
        }
        String this$position = this.getPosition();
        String other$position = other.getPosition();
        if (this$position == null ? other$position != null : !this$position.equals(other$position)) {
            return false;
        }
        Date this$entryTime = this.getEntryTime();
        Date other$entryTime = other.getEntryTime();
        if (this$entryTime == null ? other$entryTime != null : !((Object)this$entryTime).equals(other$entryTime)) {
            return false;
        }
        Date this$leaveTime = this.getLeaveTime();
        Date other$leaveTime = other.getLeaveTime();
        return !(this$leaveTime == null ? other$leaveTime != null : !((Object)this$leaveTime).equals(other$leaveTime));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantStaffDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Integer $gender = this.getGender();
        result = result * 59 + ($gender == null ? 43 : ((Object)$gender).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $merchantName = this.getMerchantName();
        result = result * 59 + ($merchantName == null ? 43 : $merchantName.hashCode());
        String $userName = this.getUserName();
        result = result * 59 + ($userName == null ? 43 : $userName.hashCode());
        String $fullName = this.getFullName();
        result = result * 59 + ($fullName == null ? 43 : $fullName.hashCode());
        String $mobile = this.getMobile();
        result = result * 59 + ($mobile == null ? 43 : $mobile.hashCode());
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
        String $source = this.getSource();
        result = result * 59 + ($source == null ? 43 : $source.hashCode());
        String $headPicUrl = this.getHeadPicUrl();
        result = result * 59 + ($headPicUrl == null ? 43 : $headPicUrl.hashCode());
        String $position = this.getPosition();
        result = result * 59 + ($position == null ? 43 : $position.hashCode());
        Date $entryTime = this.getEntryTime();
        result = result * 59 + ($entryTime == null ? 43 : ((Object)$entryTime).hashCode());
        Date $leaveTime = this.getLeaveTime();
        result = result * 59 + ($leaveTime == null ? 43 : ((Object)$leaveTime).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantStaffDTO(id=" + this.getId() + ", code=" + this.getCode() + ", merchantId=" + this.getMerchantId() + ", merchantName=" + this.getMerchantName() + ", userName=" + this.getUserName() + ", fullName=" + this.getFullName() + ", mobile=" + this.getMobile() + ", email=" + this.getEmail() + ", qq=" + this.getQq() + ", weChat=" + this.getWeChat() + ", remarks=" + this.getRemarks() + ", yhtUserId=" + this.getYhtUserId() + ", source=" + this.getSource() + ", headPicUrl=" + this.getHeadPicUrl() + ", position=" + this.getPosition() + ", entryTime=" + this.getEntryTime() + ", leaveTime=" + this.getLeaveTime() + ", gender=" + this.getGender() + ")";
    }
}

