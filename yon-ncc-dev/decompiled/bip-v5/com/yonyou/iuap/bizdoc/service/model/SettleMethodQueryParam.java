/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

import com.yonyou.iuap.bizdoc.service.model.BaseQueryParam;
import java.util.List;

public class SettleMethodQueryParam
extends BaseQueryParam {
    private String erpCode;
    private String erpCodeLike;
    private List<String> erpCodes;
    private Long parentId;
    private List<Long> parentIds;
    private Integer isDefault;
    private Integer isEnd;
    private Integer serviceAttr;
    private List<Integer> serviceAttrs;
    private Integer isEnabled;
    private Integer sourceType;

    public String getErpCode() {
        return this.erpCode;
    }

    public String getErpCodeLike() {
        return this.erpCodeLike;
    }

    public List<String> getErpCodes() {
        return this.erpCodes;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public List<Long> getParentIds() {
        return this.parentIds;
    }

    public Integer getIsDefault() {
        return this.isDefault;
    }

    public Integer getIsEnd() {
        return this.isEnd;
    }

    public Integer getServiceAttr() {
        return this.serviceAttr;
    }

    public List<Integer> getServiceAttrs() {
        return this.serviceAttrs;
    }

    public Integer getIsEnabled() {
        return this.isEnabled;
    }

    public Integer getSourceType() {
        return this.sourceType;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setErpCodeLike(String erpCodeLike) {
        this.erpCodeLike = erpCodeLike;
    }

    public void setErpCodes(List<String> erpCodes) {
        this.erpCodes = erpCodes;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public void setParentIds(List<Long> parentIds) {
        this.parentIds = parentIds;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public void setIsEnd(Integer isEnd) {
        this.isEnd = isEnd;
    }

    public void setServiceAttr(Integer serviceAttr) {
        this.serviceAttr = serviceAttr;
    }

    public void setServiceAttrs(List<Integer> serviceAttrs) {
        this.serviceAttrs = serviceAttrs;
    }

    public void setIsEnabled(Integer isEnabled) {
        this.isEnabled = isEnabled;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SettleMethodQueryParam)) {
            return false;
        }
        SettleMethodQueryParam other = (SettleMethodQueryParam)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$parentId = this.getParentId();
        Long other$parentId = other.getParentId();
        if (this$parentId == null ? other$parentId != null : !((Object)this$parentId).equals(other$parentId)) {
            return false;
        }
        Integer this$isDefault = this.getIsDefault();
        Integer other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        Integer this$isEnd = this.getIsEnd();
        Integer other$isEnd = other.getIsEnd();
        if (this$isEnd == null ? other$isEnd != null : !((Object)this$isEnd).equals(other$isEnd)) {
            return false;
        }
        Integer this$serviceAttr = this.getServiceAttr();
        Integer other$serviceAttr = other.getServiceAttr();
        if (this$serviceAttr == null ? other$serviceAttr != null : !((Object)this$serviceAttr).equals(other$serviceAttr)) {
            return false;
        }
        Integer this$isEnabled = this.getIsEnabled();
        Integer other$isEnabled = other.getIsEnabled();
        if (this$isEnabled == null ? other$isEnabled != null : !((Object)this$isEnabled).equals(other$isEnabled)) {
            return false;
        }
        Integer this$sourceType = this.getSourceType();
        Integer other$sourceType = other.getSourceType();
        if (this$sourceType == null ? other$sourceType != null : !((Object)this$sourceType).equals(other$sourceType)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        String this$erpCodeLike = this.getErpCodeLike();
        String other$erpCodeLike = other.getErpCodeLike();
        if (this$erpCodeLike == null ? other$erpCodeLike != null : !this$erpCodeLike.equals(other$erpCodeLike)) {
            return false;
        }
        List<String> this$erpCodes = this.getErpCodes();
        List<String> other$erpCodes = other.getErpCodes();
        if (this$erpCodes == null ? other$erpCodes != null : !((Object)this$erpCodes).equals(other$erpCodes)) {
            return false;
        }
        List<Long> this$parentIds = this.getParentIds();
        List<Long> other$parentIds = other.getParentIds();
        if (this$parentIds == null ? other$parentIds != null : !((Object)this$parentIds).equals(other$parentIds)) {
            return false;
        }
        List<Integer> this$serviceAttrs = this.getServiceAttrs();
        List<Integer> other$serviceAttrs = other.getServiceAttrs();
        return !(this$serviceAttrs == null ? other$serviceAttrs != null : !((Object)this$serviceAttrs).equals(other$serviceAttrs));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SettleMethodQueryParam;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $parentId = this.getParentId();
        result = result * 59 + ($parentId == null ? 43 : ((Object)$parentId).hashCode());
        Integer $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        Integer $isEnd = this.getIsEnd();
        result = result * 59 + ($isEnd == null ? 43 : ((Object)$isEnd).hashCode());
        Integer $serviceAttr = this.getServiceAttr();
        result = result * 59 + ($serviceAttr == null ? 43 : ((Object)$serviceAttr).hashCode());
        Integer $isEnabled = this.getIsEnabled();
        result = result * 59 + ($isEnabled == null ? 43 : ((Object)$isEnabled).hashCode());
        Integer $sourceType = this.getSourceType();
        result = result * 59 + ($sourceType == null ? 43 : ((Object)$sourceType).hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        String $erpCodeLike = this.getErpCodeLike();
        result = result * 59 + ($erpCodeLike == null ? 43 : $erpCodeLike.hashCode());
        List<String> $erpCodes = this.getErpCodes();
        result = result * 59 + ($erpCodes == null ? 43 : ((Object)$erpCodes).hashCode());
        List<Long> $parentIds = this.getParentIds();
        result = result * 59 + ($parentIds == null ? 43 : ((Object)$parentIds).hashCode());
        List<Integer> $serviceAttrs = this.getServiceAttrs();
        result = result * 59 + ($serviceAttrs == null ? 43 : ((Object)$serviceAttrs).hashCode());
        return result;
    }

    public String toString() {
        return "SettleMethodQueryParam(erpCode=" + this.getErpCode() + ", erpCodeLike=" + this.getErpCodeLike() + ", erpCodes=" + this.getErpCodes() + ", parentId=" + this.getParentId() + ", parentIds=" + this.getParentIds() + ", isDefault=" + this.getIsDefault() + ", isEnd=" + this.getIsEnd() + ", serviceAttr=" + this.getServiceAttr() + ", serviceAttrs=" + this.getServiceAttrs() + ", isEnabled=" + this.getIsEnabled() + ", sourceType=" + this.getSourceType() + ")";
    }
}

