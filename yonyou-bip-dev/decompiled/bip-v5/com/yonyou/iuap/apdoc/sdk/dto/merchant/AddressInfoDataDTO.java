/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyou.iuap.apdoc.sdk.dto.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCEntityStatus;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class AddressInfoDataDTO
implements Serializable {
    private Long id;
    private String erpCode;
    private Date pubts;
    private String address;
    private String addressCode;
    private Long addressId;
    private String addressId___code;
    private HashMap<String, Object> addressInfoCharacter;
    private Map<String, Object> customExtend;
    private String area;
    private String city;
    private String country;
    private String deliveryAddressErpCode;
    private String email;
    private Boolean isDefault;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Long merchantId;
    private String merchantId___code;
    private String mergerName;
    private String mobile;
    private String province;
    private String qq;
    private String receiver;
    private Long receivingWarehouse;
    private String receivingWarehouse___code;
    private String region;
    private String regionCode;
    private String remarks;
    private String shippingAddressErpCode;
    private Long shipregion;
    private String shipregion___code;
    private String stopStatus;
    private String telePhone;
    private String weChat;
    private String zipCode;
    private UPCEntityStatus entityStatus;
    private List<String> needBlankFieldList;

    public Long getId() {
        return this.id;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public Date getPubts() {
        return this.pubts;
    }

    public String getAddress() {
        return this.address;
    }

    public String getAddressCode() {
        return this.addressCode;
    }

    public Long getAddressId() {
        return this.addressId;
    }

    public String getAddressId___code() {
        return this.addressId___code;
    }

    public HashMap<String, Object> getAddressInfoCharacter() {
        return this.addressInfoCharacter;
    }

    public Map<String, Object> getCustomExtend() {
        return this.customExtend;
    }

    public String getArea() {
        return this.area;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getDeliveryAddressErpCode() {
        return this.deliveryAddressErpCode;
    }

    public String getEmail() {
        return this.email;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public BigDecimal getLatitude() {
        return this.latitude;
    }

    public BigDecimal getLongitude() {
        return this.longitude;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantId___code() {
        return this.merchantId___code;
    }

    public String getMergerName() {
        return this.mergerName;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getProvince() {
        return this.province;
    }

    public String getQq() {
        return this.qq;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public Long getReceivingWarehouse() {
        return this.receivingWarehouse;
    }

    public String getReceivingWarehouse___code() {
        return this.receivingWarehouse___code;
    }

    public String getRegion() {
        return this.region;
    }

    public String getRegionCode() {
        return this.regionCode;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getShippingAddressErpCode() {
        return this.shippingAddressErpCode;
    }

    public Long getShipregion() {
        return this.shipregion;
    }

    public String getShipregion___code() {
        return this.shipregion___code;
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

    public String getZipCode() {
        return this.zipCode;
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

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setPubts(Date pubts) {
        this.pubts = pubts;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public void setAddressId___code(String addressId___code) {
        this.addressId___code = addressId___code;
    }

    public void setAddressInfoCharacter(HashMap<String, Object> addressInfoCharacter) {
        this.addressInfoCharacter = addressInfoCharacter;
    }

    public void setCustomExtend(Map<String, Object> customExtend) {
        this.customExtend = customExtend;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDeliveryAddressErpCode(String deliveryAddressErpCode) {
        this.deliveryAddressErpCode = deliveryAddressErpCode;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantId___code(String merchantId___code) {
        this.merchantId___code = merchantId___code;
    }

    public void setMergerName(String mergerName) {
        this.mergerName = mergerName;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setReceivingWarehouse(Long receivingWarehouse) {
        this.receivingWarehouse = receivingWarehouse;
    }

    public void setReceivingWarehouse___code(String receivingWarehouse___code) {
        this.receivingWarehouse___code = receivingWarehouse___code;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setShippingAddressErpCode(String shippingAddressErpCode) {
        this.shippingAddressErpCode = shippingAddressErpCode;
    }

    public void setShipregion(Long shipregion) {
        this.shipregion = shipregion;
    }

    public void setShipregion___code(String shipregion___code) {
        this.shipregion___code = shipregion___code;
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

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
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
        if (!(o instanceof AddressInfoDataDTO)) {
            return false;
        }
        AddressInfoDataDTO other = (AddressInfoDataDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$addressId = this.getAddressId();
        Long other$addressId = other.getAddressId();
        if (this$addressId == null ? other$addressId != null : !((Object)this$addressId).equals(other$addressId)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
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
        String this$address = this.getAddress();
        String other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) {
            return false;
        }
        String this$addressCode = this.getAddressCode();
        String other$addressCode = other.getAddressCode();
        if (this$addressCode == null ? other$addressCode != null : !this$addressCode.equals(other$addressCode)) {
            return false;
        }
        String this$addressId___code = this.getAddressId___code();
        String other$addressId___code = other.getAddressId___code();
        if (this$addressId___code == null ? other$addressId___code != null : !this$addressId___code.equals(other$addressId___code)) {
            return false;
        }
        HashMap<String, Object> this$addressInfoCharacter = this.getAddressInfoCharacter();
        HashMap<String, Object> other$addressInfoCharacter = other.getAddressInfoCharacter();
        if (this$addressInfoCharacter == null ? other$addressInfoCharacter != null : !((Object)this$addressInfoCharacter).equals(other$addressInfoCharacter)) {
            return false;
        }
        Map<String, Object> this$customExtend = this.getCustomExtend();
        Map<String, Object> other$customExtend = other.getCustomExtend();
        if (this$customExtend == null ? other$customExtend != null : !((Object)this$customExtend).equals(other$customExtend)) {
            return false;
        }
        String this$area = this.getArea();
        String other$area = other.getArea();
        if (this$area == null ? other$area != null : !this$area.equals(other$area)) {
            return false;
        }
        String this$city = this.getCity();
        String other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) {
            return false;
        }
        String this$country = this.getCountry();
        String other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) {
            return false;
        }
        String this$deliveryAddressErpCode = this.getDeliveryAddressErpCode();
        String other$deliveryAddressErpCode = other.getDeliveryAddressErpCode();
        if (this$deliveryAddressErpCode == null ? other$deliveryAddressErpCode != null : !this$deliveryAddressErpCode.equals(other$deliveryAddressErpCode)) {
            return false;
        }
        String this$email = this.getEmail();
        String other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) {
            return false;
        }
        BigDecimal this$latitude = this.getLatitude();
        BigDecimal other$latitude = other.getLatitude();
        if (this$latitude == null ? other$latitude != null : !((Object)this$latitude).equals(other$latitude)) {
            return false;
        }
        BigDecimal this$longitude = this.getLongitude();
        BigDecimal other$longitude = other.getLongitude();
        if (this$longitude == null ? other$longitude != null : !((Object)this$longitude).equals(other$longitude)) {
            return false;
        }
        String this$merchantId___code = this.getMerchantId___code();
        String other$merchantId___code = other.getMerchantId___code();
        if (this$merchantId___code == null ? other$merchantId___code != null : !this$merchantId___code.equals(other$merchantId___code)) {
            return false;
        }
        String this$mergerName = this.getMergerName();
        String other$mergerName = other.getMergerName();
        if (this$mergerName == null ? other$mergerName != null : !this$mergerName.equals(other$mergerName)) {
            return false;
        }
        String this$mobile = this.getMobile();
        String other$mobile = other.getMobile();
        if (this$mobile == null ? other$mobile != null : !this$mobile.equals(other$mobile)) {
            return false;
        }
        String this$province = this.getProvince();
        String other$province = other.getProvince();
        if (this$province == null ? other$province != null : !this$province.equals(other$province)) {
            return false;
        }
        String this$qq = this.getQq();
        String other$qq = other.getQq();
        if (this$qq == null ? other$qq != null : !this$qq.equals(other$qq)) {
            return false;
        }
        String this$receiver = this.getReceiver();
        String other$receiver = other.getReceiver();
        if (this$receiver == null ? other$receiver != null : !this$receiver.equals(other$receiver)) {
            return false;
        }
        String this$receivingWarehouse___code = this.getReceivingWarehouse___code();
        String other$receivingWarehouse___code = other.getReceivingWarehouse___code();
        if (this$receivingWarehouse___code == null ? other$receivingWarehouse___code != null : !this$receivingWarehouse___code.equals(other$receivingWarehouse___code)) {
            return false;
        }
        String this$region = this.getRegion();
        String other$region = other.getRegion();
        if (this$region == null ? other$region != null : !this$region.equals(other$region)) {
            return false;
        }
        String this$regionCode = this.getRegionCode();
        String other$regionCode = other.getRegionCode();
        if (this$regionCode == null ? other$regionCode != null : !this$regionCode.equals(other$regionCode)) {
            return false;
        }
        String this$remarks = this.getRemarks();
        String other$remarks = other.getRemarks();
        if (this$remarks == null ? other$remarks != null : !this$remarks.equals(other$remarks)) {
            return false;
        }
        String this$shippingAddressErpCode = this.getShippingAddressErpCode();
        String other$shippingAddressErpCode = other.getShippingAddressErpCode();
        if (this$shippingAddressErpCode == null ? other$shippingAddressErpCode != null : !this$shippingAddressErpCode.equals(other$shippingAddressErpCode)) {
            return false;
        }
        String this$shipregion___code = this.getShipregion___code();
        String other$shipregion___code = other.getShipregion___code();
        if (this$shipregion___code == null ? other$shipregion___code != null : !this$shipregion___code.equals(other$shipregion___code)) {
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
        String this$zipCode = this.getZipCode();
        String other$zipCode = other.getZipCode();
        if (this$zipCode == null ? other$zipCode != null : !this$zipCode.equals(other$zipCode)) {
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
        return other instanceof AddressInfoDataDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $addressId = this.getAddressId();
        result = result * 59 + ($addressId == null ? 43 : ((Object)$addressId).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $receivingWarehouse = this.getReceivingWarehouse();
        result = result * 59 + ($receivingWarehouse == null ? 43 : ((Object)$receivingWarehouse).hashCode());
        Long $shipregion = this.getShipregion();
        result = result * 59 + ($shipregion == null ? 43 : ((Object)$shipregion).hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        Date $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : ((Object)$pubts).hashCode());
        String $address = this.getAddress();
        result = result * 59 + ($address == null ? 43 : $address.hashCode());
        String $addressCode = this.getAddressCode();
        result = result * 59 + ($addressCode == null ? 43 : $addressCode.hashCode());
        String $addressId___code = this.getAddressId___code();
        result = result * 59 + ($addressId___code == null ? 43 : $addressId___code.hashCode());
        HashMap<String, Object> $addressInfoCharacter = this.getAddressInfoCharacter();
        result = result * 59 + ($addressInfoCharacter == null ? 43 : ((Object)$addressInfoCharacter).hashCode());
        Map<String, Object> $customExtend = this.getCustomExtend();
        result = result * 59 + ($customExtend == null ? 43 : ((Object)$customExtend).hashCode());
        String $area = this.getArea();
        result = result * 59 + ($area == null ? 43 : $area.hashCode());
        String $city = this.getCity();
        result = result * 59 + ($city == null ? 43 : $city.hashCode());
        String $country = this.getCountry();
        result = result * 59 + ($country == null ? 43 : $country.hashCode());
        String $deliveryAddressErpCode = this.getDeliveryAddressErpCode();
        result = result * 59 + ($deliveryAddressErpCode == null ? 43 : $deliveryAddressErpCode.hashCode());
        String $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        BigDecimal $latitude = this.getLatitude();
        result = result * 59 + ($latitude == null ? 43 : ((Object)$latitude).hashCode());
        BigDecimal $longitude = this.getLongitude();
        result = result * 59 + ($longitude == null ? 43 : ((Object)$longitude).hashCode());
        String $merchantId___code = this.getMerchantId___code();
        result = result * 59 + ($merchantId___code == null ? 43 : $merchantId___code.hashCode());
        String $mergerName = this.getMergerName();
        result = result * 59 + ($mergerName == null ? 43 : $mergerName.hashCode());
        String $mobile = this.getMobile();
        result = result * 59 + ($mobile == null ? 43 : $mobile.hashCode());
        String $province = this.getProvince();
        result = result * 59 + ($province == null ? 43 : $province.hashCode());
        String $qq = this.getQq();
        result = result * 59 + ($qq == null ? 43 : $qq.hashCode());
        String $receiver = this.getReceiver();
        result = result * 59 + ($receiver == null ? 43 : $receiver.hashCode());
        String $receivingWarehouse___code = this.getReceivingWarehouse___code();
        result = result * 59 + ($receivingWarehouse___code == null ? 43 : $receivingWarehouse___code.hashCode());
        String $region = this.getRegion();
        result = result * 59 + ($region == null ? 43 : $region.hashCode());
        String $regionCode = this.getRegionCode();
        result = result * 59 + ($regionCode == null ? 43 : $regionCode.hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        String $shippingAddressErpCode = this.getShippingAddressErpCode();
        result = result * 59 + ($shippingAddressErpCode == null ? 43 : $shippingAddressErpCode.hashCode());
        String $shipregion___code = this.getShipregion___code();
        result = result * 59 + ($shipregion___code == null ? 43 : $shipregion___code.hashCode());
        String $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : $stopStatus.hashCode());
        String $telePhone = this.getTelePhone();
        result = result * 59 + ($telePhone == null ? 43 : $telePhone.hashCode());
        String $weChat = this.getWeChat();
        result = result * 59 + ($weChat == null ? 43 : $weChat.hashCode());
        String $zipCode = this.getZipCode();
        result = result * 59 + ($zipCode == null ? 43 : $zipCode.hashCode());
        UPCEntityStatus $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : ((Object)((Object)$entityStatus)).hashCode());
        List<String> $needBlankFieldList = this.getNeedBlankFieldList();
        result = result * 59 + ($needBlankFieldList == null ? 43 : ((Object)$needBlankFieldList).hashCode());
        return result;
    }

    public String toString() {
        return "AddressInfoDataDTO(id=" + this.getId() + ", erpCode=" + this.getErpCode() + ", pubts=" + this.getPubts() + ", address=" + this.getAddress() + ", addressCode=" + this.getAddressCode() + ", addressId=" + this.getAddressId() + ", addressId___code=" + this.getAddressId___code() + ", addressInfoCharacter=" + this.getAddressInfoCharacter() + ", customExtend=" + this.getCustomExtend() + ", area=" + this.getArea() + ", city=" + this.getCity() + ", country=" + this.getCountry() + ", deliveryAddressErpCode=" + this.getDeliveryAddressErpCode() + ", email=" + this.getEmail() + ", isDefault=" + this.getIsDefault() + ", latitude=" + this.getLatitude() + ", longitude=" + this.getLongitude() + ", merchantId=" + this.getMerchantId() + ", merchantId___code=" + this.getMerchantId___code() + ", mergerName=" + this.getMergerName() + ", mobile=" + this.getMobile() + ", province=" + this.getProvince() + ", qq=" + this.getQq() + ", receiver=" + this.getReceiver() + ", receivingWarehouse=" + this.getReceivingWarehouse() + ", receivingWarehouse___code=" + this.getReceivingWarehouse___code() + ", region=" + this.getRegion() + ", regionCode=" + this.getRegionCode() + ", remarks=" + this.getRemarks() + ", shippingAddressErpCode=" + this.getShippingAddressErpCode() + ", shipregion=" + this.getShipregion() + ", shipregion___code=" + this.getShipregion___code() + ", stopStatus=" + this.getStopStatus() + ", telePhone=" + this.getTelePhone() + ", weChat=" + this.getWeChat() + ", zipCode=" + this.getZipCode() + ", entityStatus=" + (Object)((Object)this.getEntityStatus()) + ", needBlankFieldList=" + this.getNeedBlankFieldList() + ")";
    }
}

