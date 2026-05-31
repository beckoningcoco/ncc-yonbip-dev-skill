/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.openapi.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantAddressOpenApiSaveDTO
implements Serializable {
    private Long id;
    public String addressCode;
    public Long shipregionId;
    public String shipregionCode;
    public String regionCode;
    public String address;
    public String zipCode;
    public String receiver;
    public String mobile;
    public String telePhone;
    public String email;
    public String qq;
    public String weChat;
    public String remarks;
    public String stopStatus;
    public Boolean isDefault;
    private HashMap<String, Object> addressInfoCharacter;
    private String entityStatus;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private String sourceUnique;

    public Long getId() {
        return this.id;
    }

    public String getAddressCode() {
        return this.addressCode;
    }

    public Long getShipregionId() {
        return this.shipregionId;
    }

    public String getShipregionCode() {
        return this.shipregionCode;
    }

    public String getRegionCode() {
        return this.regionCode;
    }

    public String getAddress() {
        return this.address;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public String getReceiver() {
        return this.receiver;
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

    public HashMap<String, Object> getAddressInfoCharacter() {
        return this.addressInfoCharacter;
    }

    public String getEntityStatus() {
        return this.entityStatus;
    }

    public BigDecimal getLongitude() {
        return this.longitude;
    }

    public BigDecimal getLatitude() {
        return this.latitude;
    }

    public String getSourceUnique() {
        return this.sourceUnique;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public void setShipregionId(Long shipregionId) {
        this.shipregionId = shipregionId;
    }

    public void setShipregionCode(String shipregionCode) {
        this.shipregionCode = shipregionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
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

    public void setAddressInfoCharacter(HashMap<String, Object> addressInfoCharacter) {
        this.addressInfoCharacter = addressInfoCharacter;
    }

    public void setEntityStatus(String entityStatus) {
        this.entityStatus = entityStatus;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public void setSourceUnique(String sourceUnique) {
        this.sourceUnique = sourceUnique;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantAddressOpenApiSaveDTO)) {
            return false;
        }
        MerchantAddressOpenApiSaveDTO other = (MerchantAddressOpenApiSaveDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$shipregionId = this.getShipregionId();
        Long other$shipregionId = other.getShipregionId();
        if (this$shipregionId == null ? other$shipregionId != null : !((Object)this$shipregionId).equals(other$shipregionId)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        String this$addressCode = this.getAddressCode();
        String other$addressCode = other.getAddressCode();
        if (this$addressCode == null ? other$addressCode != null : !this$addressCode.equals(other$addressCode)) {
            return false;
        }
        String this$shipregionCode = this.getShipregionCode();
        String other$shipregionCode = other.getShipregionCode();
        if (this$shipregionCode == null ? other$shipregionCode != null : !this$shipregionCode.equals(other$shipregionCode)) {
            return false;
        }
        String this$regionCode = this.getRegionCode();
        String other$regionCode = other.getRegionCode();
        if (this$regionCode == null ? other$regionCode != null : !this$regionCode.equals(other$regionCode)) {
            return false;
        }
        String this$address = this.getAddress();
        String other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) {
            return false;
        }
        String this$zipCode = this.getZipCode();
        String other$zipCode = other.getZipCode();
        if (this$zipCode == null ? other$zipCode != null : !this$zipCode.equals(other$zipCode)) {
            return false;
        }
        String this$receiver = this.getReceiver();
        String other$receiver = other.getReceiver();
        if (this$receiver == null ? other$receiver != null : !this$receiver.equals(other$receiver)) {
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
        HashMap<String, Object> this$addressInfoCharacter = this.getAddressInfoCharacter();
        HashMap<String, Object> other$addressInfoCharacter = other.getAddressInfoCharacter();
        if (this$addressInfoCharacter == null ? other$addressInfoCharacter != null : !((Object)this$addressInfoCharacter).equals(other$addressInfoCharacter)) {
            return false;
        }
        String this$entityStatus = this.getEntityStatus();
        String other$entityStatus = other.getEntityStatus();
        if (this$entityStatus == null ? other$entityStatus != null : !this$entityStatus.equals(other$entityStatus)) {
            return false;
        }
        BigDecimal this$longitude = this.getLongitude();
        BigDecimal other$longitude = other.getLongitude();
        if (this$longitude == null ? other$longitude != null : !((Object)this$longitude).equals(other$longitude)) {
            return false;
        }
        BigDecimal this$latitude = this.getLatitude();
        BigDecimal other$latitude = other.getLatitude();
        if (this$latitude == null ? other$latitude != null : !((Object)this$latitude).equals(other$latitude)) {
            return false;
        }
        String this$sourceUnique = this.getSourceUnique();
        String other$sourceUnique = other.getSourceUnique();
        return !(this$sourceUnique == null ? other$sourceUnique != null : !this$sourceUnique.equals(other$sourceUnique));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantAddressOpenApiSaveDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $shipregionId = this.getShipregionId();
        result = result * 59 + ($shipregionId == null ? 43 : ((Object)$shipregionId).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        String $addressCode = this.getAddressCode();
        result = result * 59 + ($addressCode == null ? 43 : $addressCode.hashCode());
        String $shipregionCode = this.getShipregionCode();
        result = result * 59 + ($shipregionCode == null ? 43 : $shipregionCode.hashCode());
        String $regionCode = this.getRegionCode();
        result = result * 59 + ($regionCode == null ? 43 : $regionCode.hashCode());
        String $address = this.getAddress();
        result = result * 59 + ($address == null ? 43 : $address.hashCode());
        String $zipCode = this.getZipCode();
        result = result * 59 + ($zipCode == null ? 43 : $zipCode.hashCode());
        String $receiver = this.getReceiver();
        result = result * 59 + ($receiver == null ? 43 : $receiver.hashCode());
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
        HashMap<String, Object> $addressInfoCharacter = this.getAddressInfoCharacter();
        result = result * 59 + ($addressInfoCharacter == null ? 43 : ((Object)$addressInfoCharacter).hashCode());
        String $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : $entityStatus.hashCode());
        BigDecimal $longitude = this.getLongitude();
        result = result * 59 + ($longitude == null ? 43 : ((Object)$longitude).hashCode());
        BigDecimal $latitude = this.getLatitude();
        result = result * 59 + ($latitude == null ? 43 : ((Object)$latitude).hashCode());
        String $sourceUnique = this.getSourceUnique();
        result = result * 59 + ($sourceUnique == null ? 43 : $sourceUnique.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantAddressOpenApiSaveDTO(id=" + this.getId() + ", addressCode=" + this.getAddressCode() + ", shipregionId=" + this.getShipregionId() + ", shipregionCode=" + this.getShipregionCode() + ", regionCode=" + this.getRegionCode() + ", address=" + this.getAddress() + ", zipCode=" + this.getZipCode() + ", receiver=" + this.getReceiver() + ", mobile=" + this.getMobile() + ", telePhone=" + this.getTelePhone() + ", email=" + this.getEmail() + ", qq=" + this.getQq() + ", weChat=" + this.getWeChat() + ", remarks=" + this.getRemarks() + ", stopStatus=" + this.getStopStatus() + ", isDefault=" + this.getIsDefault() + ", addressInfoCharacter=" + this.getAddressInfoCharacter() + ", entityStatus=" + this.getEntityStatus() + ", longitude=" + this.getLongitude() + ", latitude=" + this.getLatitude() + ", sourceUnique=" + this.getSourceUnique() + ")";
    }
}

