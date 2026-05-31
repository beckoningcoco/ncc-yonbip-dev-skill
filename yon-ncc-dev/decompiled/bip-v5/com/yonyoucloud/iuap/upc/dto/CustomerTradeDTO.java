/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ClassBaseDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class CustomerTradeDTO
extends ClassBaseDTO {
    private Integer creatorType;
    private String creatorName;
    private String erpCode;
    private Boolean enabled;
    private Boolean iDeleted;
    private Integer order;
    private MultilingualVO multilingualName;
    private Long parent;
    private String parentCode;
    private String parentName;
    private Boolean stopStatus;
    private Map<String, Object> customerTradeCharacter;

    public Integer getCreatorType() {
        return this.creatorType;
    }

    public String getCreatorName() {
        return this.creatorName;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public Boolean getIDeleted() {
        return this.iDeleted;
    }

    public Integer getOrder() {
        return this.order;
    }

    public MultilingualVO getMultilingualName() {
        return this.multilingualName;
    }

    @Override
    public Long getParent() {
        return this.parent;
    }

    public String getParentCode() {
        return this.parentCode;
    }

    public String getParentName() {
        return this.parentName;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public Map<String, Object> getCustomerTradeCharacter() {
        return this.customerTradeCharacter;
    }

    public void setCreatorType(Integer creatorType) {
        this.creatorType = creatorType;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setIDeleted(Boolean iDeleted) {
        this.iDeleted = iDeleted;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setMultilingualName(MultilingualVO multilingualName) {
        this.multilingualName = multilingualName;
    }

    @Override
    public void setParent(Long parent) {
        this.parent = parent;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setCustomerTradeCharacter(Map<String, Object> customerTradeCharacter) {
        this.customerTradeCharacter = customerTradeCharacter;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CustomerTradeDTO)) {
            return false;
        }
        CustomerTradeDTO other = (CustomerTradeDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$creatorType = this.getCreatorType();
        Integer other$creatorType = other.getCreatorType();
        if (this$creatorType == null ? other$creatorType != null : !((Object)this$creatorType).equals(other$creatorType)) {
            return false;
        }
        Boolean this$enabled = this.getEnabled();
        Boolean other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !((Object)this$enabled).equals(other$enabled)) {
            return false;
        }
        Boolean this$iDeleted = this.getIDeleted();
        Boolean other$iDeleted = other.getIDeleted();
        if (this$iDeleted == null ? other$iDeleted != null : !((Object)this$iDeleted).equals(other$iDeleted)) {
            return false;
        }
        Integer this$order = this.getOrder();
        Integer other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        Long this$parent = this.getParent();
        Long other$parent = other.getParent();
        if (this$parent == null ? other$parent != null : !((Object)this$parent).equals(other$parent)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        String this$creatorName = this.getCreatorName();
        String other$creatorName = other.getCreatorName();
        if (this$creatorName == null ? other$creatorName != null : !this$creatorName.equals(other$creatorName)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        MultilingualVO this$multilingualName = this.getMultilingualName();
        MultilingualVO other$multilingualName = other.getMultilingualName();
        if (this$multilingualName == null ? other$multilingualName != null : !((Object)this$multilingualName).equals(other$multilingualName)) {
            return false;
        }
        String this$parentCode = this.getParentCode();
        String other$parentCode = other.getParentCode();
        if (this$parentCode == null ? other$parentCode != null : !this$parentCode.equals(other$parentCode)) {
            return false;
        }
        String this$parentName = this.getParentName();
        String other$parentName = other.getParentName();
        if (this$parentName == null ? other$parentName != null : !this$parentName.equals(other$parentName)) {
            return false;
        }
        Map<String, Object> this$customerTradeCharacter = this.getCustomerTradeCharacter();
        Map<String, Object> other$customerTradeCharacter = other.getCustomerTradeCharacter();
        return !(this$customerTradeCharacter == null ? other$customerTradeCharacter != null : !((Object)this$customerTradeCharacter).equals(other$customerTradeCharacter));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof CustomerTradeDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $creatorType = this.getCreatorType();
        result = result * 59 + ($creatorType == null ? 43 : ((Object)$creatorType).hashCode());
        Boolean $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        Boolean $iDeleted = this.getIDeleted();
        result = result * 59 + ($iDeleted == null ? 43 : ((Object)$iDeleted).hashCode());
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        Long $parent = this.getParent();
        result = result * 59 + ($parent == null ? 43 : ((Object)$parent).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        String $creatorName = this.getCreatorName();
        result = result * 59 + ($creatorName == null ? 43 : $creatorName.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        MultilingualVO $multilingualName = this.getMultilingualName();
        result = result * 59 + ($multilingualName == null ? 43 : $multilingualName.hashCode());
        String $parentCode = this.getParentCode();
        result = result * 59 + ($parentCode == null ? 43 : $parentCode.hashCode());
        String $parentName = this.getParentName();
        result = result * 59 + ($parentName == null ? 43 : $parentName.hashCode());
        Map<String, Object> $customerTradeCharacter = this.getCustomerTradeCharacter();
        result = result * 59 + ($customerTradeCharacter == null ? 43 : ((Object)$customerTradeCharacter).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "CustomerTradeDTO(creatorType=" + this.getCreatorType() + ", creatorName=" + this.getCreatorName() + ", erpCode=" + this.getErpCode() + ", enabled=" + this.getEnabled() + ", iDeleted=" + this.getIDeleted() + ", order=" + this.getOrder() + ", multilingualName=" + this.getMultilingualName() + ", parent=" + this.getParent() + ", parentCode=" + this.getParentCode() + ", parentName=" + this.getParentName() + ", stopStatus=" + this.getStopStatus() + ", customerTradeCharacter=" + this.getCustomerTradeCharacter() + ")";
    }
}

