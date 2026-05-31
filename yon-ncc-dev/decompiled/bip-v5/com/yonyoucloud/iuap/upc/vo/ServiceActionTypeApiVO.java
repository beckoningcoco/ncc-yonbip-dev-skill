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
public class ServiceActionTypeApiVO {
    private String id;
    private String serviceCode;
    private String serviceName;
    private String action;
    private String actionName;
    private Integer stopstatus;
    private String entityStatus;

    public String getId() {
        return this.id;
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String getAction() {
        return this.action;
    }

    public String getActionName() {
        return this.actionName;
    }

    public Integer getStopstatus() {
        return this.stopstatus;
    }

    public String getEntityStatus() {
        return this.entityStatus;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

    public void setStopstatus(Integer stopstatus) {
        this.stopstatus = stopstatus;
    }

    public void setEntityStatus(String entityStatus) {
        this.entityStatus = entityStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ServiceActionTypeApiVO)) {
            return false;
        }
        ServiceActionTypeApiVO other = (ServiceActionTypeApiVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$stopstatus = this.getStopstatus();
        Integer other$stopstatus = other.getStopstatus();
        if (this$stopstatus == null ? other$stopstatus != null : !((Object)this$stopstatus).equals(other$stopstatus)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$serviceCode = this.getServiceCode();
        String other$serviceCode = other.getServiceCode();
        if (this$serviceCode == null ? other$serviceCode != null : !this$serviceCode.equals(other$serviceCode)) {
            return false;
        }
        String this$serviceName = this.getServiceName();
        String other$serviceName = other.getServiceName();
        if (this$serviceName == null ? other$serviceName != null : !this$serviceName.equals(other$serviceName)) {
            return false;
        }
        String this$action = this.getAction();
        String other$action = other.getAction();
        if (this$action == null ? other$action != null : !this$action.equals(other$action)) {
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
        return other instanceof ServiceActionTypeApiVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $stopstatus = this.getStopstatus();
        result = result * 59 + ($stopstatus == null ? 43 : ((Object)$stopstatus).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $serviceCode = this.getServiceCode();
        result = result * 59 + ($serviceCode == null ? 43 : $serviceCode.hashCode());
        String $serviceName = this.getServiceName();
        result = result * 59 + ($serviceName == null ? 43 : $serviceName.hashCode());
        String $action = this.getAction();
        result = result * 59 + ($action == null ? 43 : $action.hashCode());
        String $actionName = this.getActionName();
        result = result * 59 + ($actionName == null ? 43 : $actionName.hashCode());
        String $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : $entityStatus.hashCode());
        return result;
    }

    public String toString() {
        return "ServiceActionTypeApiVO(id=" + this.getId() + ", serviceCode=" + this.getServiceCode() + ", serviceName=" + this.getServiceName() + ", action=" + this.getAction() + ", actionName=" + this.getActionName() + ", stopstatus=" + this.getStopstatus() + ", entityStatus=" + this.getEntityStatus() + ")";
    }
}

