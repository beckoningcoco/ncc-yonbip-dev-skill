/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class LifeCycleDetailVO {
    private String lifeCycleTemplateId;
    private String materialStatusId;
    private String materialStatusCode;
    private String materialStatusName;
    private Integer isDefault;
    private String entityStatus;

    public String getLifeCycleTemplateId() {
        return this.lifeCycleTemplateId;
    }

    public String getMaterialStatusId() {
        return this.materialStatusId;
    }

    public String getMaterialStatusCode() {
        return this.materialStatusCode;
    }

    public String getMaterialStatusName() {
        return this.materialStatusName;
    }

    public Integer getIsDefault() {
        return this.isDefault;
    }

    public String getEntityStatus() {
        return this.entityStatus;
    }

    public void setLifeCycleTemplateId(String lifeCycleTemplateId) {
        this.lifeCycleTemplateId = lifeCycleTemplateId;
    }

    public void setMaterialStatusId(String materialStatusId) {
        this.materialStatusId = materialStatusId;
    }

    public void setMaterialStatusCode(String materialStatusCode) {
        this.materialStatusCode = materialStatusCode;
    }

    public void setMaterialStatusName(String materialStatusName) {
        this.materialStatusName = materialStatusName;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public void setEntityStatus(String entityStatus) {
        this.entityStatus = entityStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof LifeCycleDetailVO)) {
            return false;
        }
        LifeCycleDetailVO other = (LifeCycleDetailVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$isDefault = this.getIsDefault();
        Integer other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        String this$lifeCycleTemplateId = this.getLifeCycleTemplateId();
        String other$lifeCycleTemplateId = other.getLifeCycleTemplateId();
        if (this$lifeCycleTemplateId == null ? other$lifeCycleTemplateId != null : !this$lifeCycleTemplateId.equals(other$lifeCycleTemplateId)) {
            return false;
        }
        String this$materialStatusId = this.getMaterialStatusId();
        String other$materialStatusId = other.getMaterialStatusId();
        if (this$materialStatusId == null ? other$materialStatusId != null : !this$materialStatusId.equals(other$materialStatusId)) {
            return false;
        }
        String this$materialStatusCode = this.getMaterialStatusCode();
        String other$materialStatusCode = other.getMaterialStatusCode();
        if (this$materialStatusCode == null ? other$materialStatusCode != null : !this$materialStatusCode.equals(other$materialStatusCode)) {
            return false;
        }
        String this$materialStatusName = this.getMaterialStatusName();
        String other$materialStatusName = other.getMaterialStatusName();
        if (this$materialStatusName == null ? other$materialStatusName != null : !this$materialStatusName.equals(other$materialStatusName)) {
            return false;
        }
        String this$entityStatus = this.getEntityStatus();
        String other$entityStatus = other.getEntityStatus();
        return !(this$entityStatus == null ? other$entityStatus != null : !this$entityStatus.equals(other$entityStatus));
    }

    protected boolean canEqual(Object other) {
        return other instanceof LifeCycleDetailVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        String $lifeCycleTemplateId = this.getLifeCycleTemplateId();
        result = result * 59 + ($lifeCycleTemplateId == null ? 43 : $lifeCycleTemplateId.hashCode());
        String $materialStatusId = this.getMaterialStatusId();
        result = result * 59 + ($materialStatusId == null ? 43 : $materialStatusId.hashCode());
        String $materialStatusCode = this.getMaterialStatusCode();
        result = result * 59 + ($materialStatusCode == null ? 43 : $materialStatusCode.hashCode());
        String $materialStatusName = this.getMaterialStatusName();
        result = result * 59 + ($materialStatusName == null ? 43 : $materialStatusName.hashCode());
        String $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : $entityStatus.hashCode());
        return result;
    }

    public String toString() {
        return "LifeCycleDetailVO(lifeCycleTemplateId=" + this.getLifeCycleTemplateId() + ", materialStatusId=" + this.getMaterialStatusId() + ", materialStatusCode=" + this.getMaterialStatusCode() + ", materialStatusName=" + this.getMaterialStatusName() + ", isDefault=" + this.getIsDefault() + ", entityStatus=" + this.getEntityStatus() + ")";
    }
}

