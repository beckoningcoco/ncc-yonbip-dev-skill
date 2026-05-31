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
public class MaterialStatusDetailDTO
implements Serializable {
    private Long materialStatusId;
    private String serviceCode;
    private String granularityControl;
    private String transType;
    private String actionId;
    private String actionCode;
    private Integer controRule;

    public Long getMaterialStatusId() {
        return this.materialStatusId;
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    public String getGranularityControl() {
        return this.granularityControl;
    }

    public String getTransType() {
        return this.transType;
    }

    public String getActionId() {
        return this.actionId;
    }

    public String getActionCode() {
        return this.actionCode;
    }

    public Integer getControRule() {
        return this.controRule;
    }

    public void setMaterialStatusId(Long materialStatusId) {
        this.materialStatusId = materialStatusId;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public void setGranularityControl(String granularityControl) {
        this.granularityControl = granularityControl;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public void setControRule(Integer controRule) {
        this.controRule = controRule;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MaterialStatusDetailDTO)) {
            return false;
        }
        MaterialStatusDetailDTO other = (MaterialStatusDetailDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$materialStatusId = this.getMaterialStatusId();
        Long other$materialStatusId = other.getMaterialStatusId();
        if (this$materialStatusId == null ? other$materialStatusId != null : !((Object)this$materialStatusId).equals(other$materialStatusId)) {
            return false;
        }
        Integer this$controRule = this.getControRule();
        Integer other$controRule = other.getControRule();
        if (this$controRule == null ? other$controRule != null : !((Object)this$controRule).equals(other$controRule)) {
            return false;
        }
        String this$serviceCode = this.getServiceCode();
        String other$serviceCode = other.getServiceCode();
        if (this$serviceCode == null ? other$serviceCode != null : !this$serviceCode.equals(other$serviceCode)) {
            return false;
        }
        String this$granularityControl = this.getGranularityControl();
        String other$granularityControl = other.getGranularityControl();
        if (this$granularityControl == null ? other$granularityControl != null : !this$granularityControl.equals(other$granularityControl)) {
            return false;
        }
        String this$transType = this.getTransType();
        String other$transType = other.getTransType();
        if (this$transType == null ? other$transType != null : !this$transType.equals(other$transType)) {
            return false;
        }
        String this$actionId = this.getActionId();
        String other$actionId = other.getActionId();
        if (this$actionId == null ? other$actionId != null : !this$actionId.equals(other$actionId)) {
            return false;
        }
        String this$actionCode = this.getActionCode();
        String other$actionCode = other.getActionCode();
        return !(this$actionCode == null ? other$actionCode != null : !this$actionCode.equals(other$actionCode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MaterialStatusDetailDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $materialStatusId = this.getMaterialStatusId();
        result = result * 59 + ($materialStatusId == null ? 43 : ((Object)$materialStatusId).hashCode());
        Integer $controRule = this.getControRule();
        result = result * 59 + ($controRule == null ? 43 : ((Object)$controRule).hashCode());
        String $serviceCode = this.getServiceCode();
        result = result * 59 + ($serviceCode == null ? 43 : $serviceCode.hashCode());
        String $granularityControl = this.getGranularityControl();
        result = result * 59 + ($granularityControl == null ? 43 : $granularityControl.hashCode());
        String $transType = this.getTransType();
        result = result * 59 + ($transType == null ? 43 : $transType.hashCode());
        String $actionId = this.getActionId();
        result = result * 59 + ($actionId == null ? 43 : $actionId.hashCode());
        String $actionCode = this.getActionCode();
        result = result * 59 + ($actionCode == null ? 43 : $actionCode.hashCode());
        return result;
    }

    public String toString() {
        return "MaterialStatusDetailDTO(materialStatusId=" + this.getMaterialStatusId() + ", serviceCode=" + this.getServiceCode() + ", granularityControl=" + this.getGranularityControl() + ", transType=" + this.getTransType() + ", actionId=" + this.getActionId() + ", actionCode=" + this.getActionCode() + ", controRule=" + this.getControRule() + ")";
    }
}

