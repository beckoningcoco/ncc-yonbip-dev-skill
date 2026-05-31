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
import java.math.BigDecimal;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class AddressInfoDTO
implements Serializable {
    private Long id;
    private Long merchantId;
    private Long addressId;
    private String addressCode;
    private String regionCode;
    private String address;
    private String zipCode;
    private String receiver;
    private String mobile;
    private String telePhone;
    private String email;
    private String qq;
    private String weChat;
    private String remarks;
    private String mergerName;
    private String erpCode;
    private Long receivingWarehouse;
    private Long shipregion;
    private String shipregion___code;
    private String shipregion___name;
    private Boolean isDefault;
    private Long tenantId;
    private String _status;
    private String province;
    private String city;
    private String area;
    private BigDecimal longitude;
    private BigDecimal latitude;

    public Long getId() {
        return this.id;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public Long getAddressId() {
        return this.addressId;
    }

    public String getAddressCode() {
        return this.addressCode;
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

    public String getMergerName() {
        return this.mergerName;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public Long getReceivingWarehouse() {
        return this.receivingWarehouse;
    }

    public Long getShipregion() {
        return this.shipregion;
    }

    public String getShipregion___code() {
        return this.shipregion___code;
    }

    public String getShipregion___name() {
        return this.shipregion___name;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public String get_status() {
        return this._status;
    }

    public String getProvince() {
        return this.province;
    }

    public String getCity() {
        return this.city;
    }

    public String getArea() {
        return this.area;
    }

    public BigDecimal getLongitude() {
        return this.longitude;
    }

    public BigDecimal getLatitude() {
        return this.latitude;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
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

    public void setMergerName(String mergerName) {
        this.mergerName = mergerName;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setReceivingWarehouse(Long receivingWarehouse) {
        this.receivingWarehouse = receivingWarehouse;
    }

    public void setShipregion(Long shipregion) {
        this.shipregion = shipregion;
    }

    public void setShipregion___code(String shipregion___code) {
        this.shipregion___code = shipregion___code;
    }

    public void setShipregion___name(String shipregion___name) {
        this.shipregion___name = shipregion___name;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AddressInfoDTO)) {
            return false;
        }
        AddressInfoDTO other = (AddressInfoDTO)o;
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
        Long this$addressId = this.getAddressId();
        Long other$addressId = other.getAddressId();
        if (this$addressId == null ? other$addressId != null : !((Object)this$addressId).equals(other$addressId)) {
            return false;
        }
        Long this$receivingWarehouse = this.getReceivingWarehouse();
        Long other$receivingWarehouse = other.getReceivingWarehouse();
        if (this$receivingWarehouse == null ? other$receivingWarehouse != null : !((Object)this$receivingWarehouse).equals(other$receivingWarehouse)) {
            return false;
        }
        Long this$shipregion = this.getShipregion();
        Long other$shipregion = other.getShipregion();
        if (this$shipregion == null ? other$shipregion != null : !((Object)this$shipregion).equals(other$shipregion)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        Long this$tenantId = this.getTenantId();
        Long other$tenantId = other.getTenantId();
        if (this$tenantId == null ? other$tenantId != null : !((Object)this$tenantId).equals(other$tenantId)) {
            return false;
        }
        String this$addressCode = this.getAddressCode();
        String other$addressCode = other.getAddressCode();
        if (this$addressCode == null ? other$addressCode != null : !this$addressCode.equals(other$addressCode)) {
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
        String this$mergerName = this.getMergerName();
        String other$mergerName = other.getMergerName();
        if (this$mergerName == null ? other$mergerName != null : !this$mergerName.equals(other$mergerName)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        String this$shipregion___code = this.getShipregion___code();
        String other$shipregion___code = other.getShipregion___code();
        if (this$shipregion___code == null ? other$shipregion___code != null : !this$shipregion___code.equals(other$shipregion___code)) {
            return false;
        }
        String this$shipregion___name = this.getShipregion___name();
        String other$shipregion___name = other.getShipregion___name();
        if (this$shipregion___name == null ? other$shipregion___name != null : !this$shipregion___name.equals(other$shipregion___name)) {
            return false;
        }
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        if (this$_status == null ? other$_status != null : !this$_status.equals(other$_status)) {
            return false;
        }
        String this$province = this.getProvince();
        String other$province = other.getProvince();
        if (this$province == null ? other$province != null : !this$province.equals(other$province)) {
            return false;
        }
        String this$city = this.getCity();
        String other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) {
            return false;
        }
        String this$area = this.getArea();
        String other$area = other.getArea();
        if (this$area == null ? other$area != null : !this$area.equals(other$area)) {
            return false;
        }
        BigDecimal this$longitude = this.getLongitude();
        BigDecimal other$longitude = other.getLongitude();
        if (this$longitude == null ? other$longitude != null : !((Object)this$longitude).equals(other$longitude)) {
            return false;
        }
        BigDecimal this$latitude = this.getLatitude();
        BigDecimal other$latitude = other.getLatitude();
        return !(this$latitude == null ? other$latitude != null : !((Object)this$latitude).equals(other$latitude));
    }

    protected boolean canEqual(Object other) {
        return other instanceof AddressInfoDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $addressId = this.getAddressId();
        result = result * 59 + ($addressId == null ? 43 : ((Object)$addressId).hashCode());
        Long $receivingWarehouse = this.getReceivingWarehouse();
        result = result * 59 + ($receivingWarehouse == null ? 43 : ((Object)$receivingWarehouse).hashCode());
        Long $shipregion = this.getShipregion();
        result = result * 59 + ($shipregion == null ? 43 : ((Object)$shipregion).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        Long $tenantId = this.getTenantId();
        result = result * 59 + ($tenantId == null ? 43 : ((Object)$tenantId).hashCode());
        String $addressCode = this.getAddressCode();
        result = result * 59 + ($addressCode == null ? 43 : $addressCode.hashCode());
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
        String $mergerName = this.getMergerName();
        result = result * 59 + ($mergerName == null ? 43 : $mergerName.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        String $shipregion___code = this.getShipregion___code();
        result = result * 59 + ($shipregion___code == null ? 43 : $shipregion___code.hashCode());
        String $shipregion___name = this.getShipregion___name();
        result = result * 59 + ($shipregion___name == null ? 43 : $shipregion___name.hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        String $province = this.getProvince();
        result = result * 59 + ($province == null ? 43 : $province.hashCode());
        String $city = this.getCity();
        result = result * 59 + ($city == null ? 43 : $city.hashCode());
        String $area = this.getArea();
        result = result * 59 + ($area == null ? 43 : $area.hashCode());
        BigDecimal $longitude = this.getLongitude();
        result = result * 59 + ($longitude == null ? 43 : ((Object)$longitude).hashCode());
        BigDecimal $latitude = this.getLatitude();
        result = result * 59 + ($latitude == null ? 43 : ((Object)$latitude).hashCode());
        return result;
    }

    public String toString() {
        return "AddressInfoDTO(id=" + this.getId() + ", merchantId=" + this.getMerchantId() + ", addressId=" + this.getAddressId() + ", addressCode=" + this.getAddressCode() + ", regionCode=" + this.getRegionCode() + ", address=" + this.getAddress() + ", zipCode=" + this.getZipCode() + ", receiver=" + this.getReceiver() + ", mobile=" + this.getMobile() + ", telePhone=" + this.getTelePhone() + ", email=" + this.getEmail() + ", qq=" + this.getQq() + ", weChat=" + this.getWeChat() + ", remarks=" + this.getRemarks() + ", mergerName=" + this.getMergerName() + ", erpCode=" + this.getErpCode() + ", receivingWarehouse=" + this.getReceivingWarehouse() + ", shipregion=" + this.getShipregion() + ", shipregion___code=" + this.getShipregion___code() + ", shipregion___name=" + this.getShipregion___name() + ", isDefault=" + this.getIsDefault() + ", tenantId=" + this.getTenantId() + ", _status=" + this.get_status() + ", province=" + this.getProvince() + ", city=" + this.getCity() + ", area=" + this.getArea() + ", longitude=" + this.getLongitude() + ", latitude=" + this.getLatitude() + ")";
    }
}

