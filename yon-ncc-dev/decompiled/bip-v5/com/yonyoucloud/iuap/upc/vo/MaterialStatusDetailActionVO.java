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
public class MaterialStatusDetailActionVO {
    private String materialStatusDetailId;
    private String serviceCode;
    private String action;
    private String actionCode;
    private String actionName;
    private String entityStatus;

    public String getMaterialStatusDetailId() {
        return this.materialStatusDetailId;
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    public String getAction() {
        return this.action;
    }

    public String getActionCode() {
        return this.actionCode;
    }

    public String getActionName() {
        return this.actionName;
    }

    public String getEntityStatus() {
        return this.entityStatus;
    }

    public void setMaterialStatusDetailId(String materialStatusDetailId) {
        this.materialStatusDetailId = materialStatusDetailId;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public void setEntityStatus(String entityStatus) {
        this.entityStatus = entityStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MaterialStatusDetailActionVO)) {
            return false;
        }
        MaterialStatusDetailActionVO other = (MaterialStatusDetailActionVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$materialStatusDetailId = this.getMaterialStatusDetailId();
        String other$materialStatusDetailId = other.getMaterialStatusDetailId();
        if (this$materialStatusDetailId == null ? other$materialStatusDetailId != null : !this$materialStatusDetailId.equals(other$materialStatusDetailId)) {
            return false;
        }
        String this$serviceCode = this.getServiceCode();
        String other$serviceCode = other.getServiceCode();
        if (this$serviceCode == null ? other$serviceCode != null : !this$serviceCode.equals(other$serviceCode)) {
            return false;
        }
        String this$action = this.getAction();
        String other$action = other.getAction();
        if (this$action == null ? other$action != null : !this$action.equals(other$action)) {
            return false;
        }
        String this$actionCode = this.getActionCode();
        String other$actionCode = other.getActionCode();
        if (this$actionCode == null ? other$actionCode != null : !this$actionCode.equals(other$actionCode)) {
            return false;
        }
        String this$actionName = this.getActionName();
        String other$actionName = other.getActionName();
        if (this$actionName == null ? other$actionName != null : !this$actionName.equals(other$actionName)) {
            return false;
        }
        String this$entityStatus = this.getEntityStatus();
        String other$entityStatus = other.getEntityStatus();
        return !(this$entityStatus == null ? other$entityStatus != null : !this$entityStatus.equals(other$entityStatus));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MaterialStatusDetailActionVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $materialStatusDetailId = this.getMaterialStatusDetailId();
        result = result * 59 + ($materialStatusDetailId == null ? 43 : $materialStatusDetailId.hashCode());
        String $serviceCode = this.getServiceCode();
        result = result * 59 + ($serviceCode == null ? 43 : $serviceCode.hashCode());
        String $action = this.getAction();
        result = result * 59 + ($action == null ? 43 : $action.hashCode());
        String $actionCode = this.getActionCode();
        result = result * 59 + ($actionCode == null ? 43 : $actionCode.hashCode());
        String $actionName = this.getActionName();
        result = result * 59 + ($actionName == null ? 43 : $actionName.hashCode());
        String $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : $entityStatus.hashCode());
        return result;
    }

    public String toString() {
        return "MaterialStatusDetailActionVO(materialStatusDetailId=" + this.getMaterialStatusDetailId() + ", serviceCode=" + this.getServiceCode() + ", action=" + this.getAction() + ", actionCode=" + this.getActionCode() + ", actionName=" + this.getActionName() + ", entityStatus=" + this.getEntityStatus() + ")";
    }
}

