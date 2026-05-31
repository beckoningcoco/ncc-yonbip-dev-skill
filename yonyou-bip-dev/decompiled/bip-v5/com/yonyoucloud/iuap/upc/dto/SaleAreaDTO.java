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
public class SaleAreaDTO
implements Serializable {
    private Long id;
    private String code;
    private String name;
    private Integer creatorType;
    private String creatorName;
    private Long shopId;
    private String orgId;
    private String erpCode;
    private String remark;
    private Boolean stopStatus;
    private Long parent;
    private Integer order;
    private Integer logicallyDeleteType;
    private Integer level;
    private String path;
    private Integer sort;
    private Boolean end;

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public Integer getCreatorType() {
        return this.creatorType;
    }

    public String getCreatorName() {
        return this.creatorName;
    }

    public Long getShopId() {
        return this.shopId;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public String getRemark() {
        return this.remark;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public Long getParent() {
        return this.parent;
    }

    public Integer getOrder() {
        return this.order;
    }

    public Integer getLogicallyDeleteType() {
        return this.logicallyDeleteType;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getPath() {
        return this.path;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Boolean getEnd() {
        return this.end;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreatorType(Integer creatorType) {
        this.creatorType = creatorType;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setLogicallyDeleteType(Integer logicallyDeleteType) {
        this.logicallyDeleteType = logicallyDeleteType;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public void setEnd(Boolean end) {
        this.end = end;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SaleAreaDTO)) {
            return false;
        }
        SaleAreaDTO other = (SaleAreaDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$creatorType = this.getCreatorType();
        Integer other$creatorType = other.getCreatorType();
        if (this$creatorType == null ? other$creatorType != null : !((Object)this$creatorType).equals(other$creatorType)) {
            return false;
        }
        Long this$shopId = this.getShopId();
        Long other$shopId = other.getShopId();
        if (this$shopId == null ? other$shopId != null : !((Object)this$shopId).equals(other$shopId)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        Long this$parent = this.getParent();
        Long other$parent = other.getParent();
        if (this$parent == null ? other$parent != null : !((Object)this$parent).equals(other$parent)) {
            return false;
        }
        Integer this$order = this.getOrder();
        Integer other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        Integer this$logicallyDeleteType = this.getLogicallyDeleteType();
        Integer other$logicallyDeleteType = other.getLogicallyDeleteType();
        if (this$logicallyDeleteType == null ? other$logicallyDeleteType != null : !((Object)this$logicallyDeleteType).equals(other$logicallyDeleteType)) {
            return false;
        }
        Integer this$level = this.getLevel();
        Integer other$level = other.getLevel();
        if (this$level == null ? other$level != null : !((Object)this$level).equals(other$level)) {
            return false;
        }
        Integer this$sort = this.getSort();
        Integer other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !((Object)this$sort).equals(other$sort)) {
            return false;
        }
        Boolean this$end = this.getEnd();
        Boolean other$end = other.getEnd();
        if (this$end == null ? other$end != null : !((Object)this$end).equals(other$end)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$creatorName = this.getCreatorName();
        String other$creatorName = other.getCreatorName();
        if (this$creatorName == null ? other$creatorName != null : !this$creatorName.equals(other$creatorName)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        String this$remark = this.getRemark();
        String other$remark = other.getRemark();
        if (this$remark == null ? other$remark != null : !this$remark.equals(other$remark)) {
            return false;
        }
        String this$path = this.getPath();
        String other$path = other.getPath();
        return !(this$path == null ? other$path != null : !this$path.equals(other$path));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SaleAreaDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $creatorType = this.getCreatorType();
        result = result * 59 + ($creatorType == null ? 43 : ((Object)$creatorType).hashCode());
        Long $shopId = this.getShopId();
        result = result * 59 + ($shopId == null ? 43 : ((Object)$shopId).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Long $parent = this.getParent();
        result = result * 59 + ($parent == null ? 43 : ((Object)$parent).hashCode());
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        Integer $logicallyDeleteType = this.getLogicallyDeleteType();
        result = result * 59 + ($logicallyDeleteType == null ? 43 : ((Object)$logicallyDeleteType).hashCode());
        Integer $level = this.getLevel();
        result = result * 59 + ($level == null ? 43 : ((Object)$level).hashCode());
        Integer $sort = this.getSort();
        result = result * 59 + ($sort == null ? 43 : ((Object)$sort).hashCode());
        Boolean $end = this.getEnd();
        result = result * 59 + ($end == null ? 43 : ((Object)$end).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $creatorName = this.getCreatorName();
        result = result * 59 + ($creatorName == null ? 43 : $creatorName.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        String $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        String $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        return result;
    }

    public String toString() {
        return "SaleAreaDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", creatorType=" + this.getCreatorType() + ", creatorName=" + this.getCreatorName() + ", shopId=" + this.getShopId() + ", orgId=" + this.getOrgId() + ", erpCode=" + this.getErpCode() + ", remark=" + this.getRemark() + ", stopStatus=" + this.getStopStatus() + ", parent=" + this.getParent() + ", order=" + this.getOrder() + ", logicallyDeleteType=" + this.getLogicallyDeleteType() + ", level=" + this.getLevel() + ", path=" + this.getPath() + ", sort=" + this.getSort() + ", end=" + this.getEnd() + ")";
    }
}

