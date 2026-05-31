/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.vo.MaterialStatusDetailActionVO;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MaterialStatusDetailVO {
    private String materialStatusId;
    private Integer systemFlag;
    private String serviceCode;
    private String serviceName;
    private String transType;
    private String transType_Code;
    private Integer granularityControl;
    private Integer controlRule;
    private List<MaterialStatusDetailActionVO> materialStatusDetailAction;
    private String entityStatus;

    public String getMaterialStatusId() {
        return this.materialStatusId;
    }

    public Integer getSystemFlag() {
        return this.systemFlag;
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String getTransType() {
        return this.transType;
    }

    public String getTransType_Code() {
        return this.transType_Code;
    }

    public Integer getGranularityControl() {
        return this.granularityControl;
    }

    public Integer getControlRule() {
        return this.controlRule;
    }

    public List<MaterialStatusDetailActionVO> getMaterialStatusDetailAction() {
        return this.materialStatusDetailAction;
    }

    public String getEntityStatus() {
        return this.entityStatus;
    }

    public void setMaterialStatusId(String materialStatusId) {
        this.materialStatusId = materialStatusId;
    }

    public void setSystemFlag(Integer systemFlag) {
        this.systemFlag = systemFlag;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public void setTransType_Code(String transType_Code) {
        this.transType_Code = transType_Code;
    }

    public void setGranularityControl(Integer granularityControl) {
        this.granularityControl = granularityControl;
    }

    public void setControlRule(Integer controlRule) {
        this.controlRule = controlRule;
    }

    public void setMaterialStatusDetailAction(List<MaterialStatusDetailActionVO> materialStatusDetailAction) {
        this.materialStatusDetailAction = materialStatusDetailAction;
    }

    public void setEntityStatus(String entityStatus) {
        this.entityStatus = entityStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MaterialStatusDetailVO)) {
            return false;
        }
        MaterialStatusDetailVO other = (MaterialStatusDetailVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$systemFlag = this.getSystemFlag();
        Integer other$systemFlag = other.getSystemFlag();
        if (this$systemFlag == null ? other$systemFlag != null : !((Object)this$systemFlag).equals(other$systemFlag)) {
            return false;
        }
        Integer this$granularityControl = this.getGranularityControl();
        Integer other$granularityControl = other.getGranularityControl();
        if (this$granularityControl == null ? other$granularityControl != null : !((Object)this$granularityControl).equals(other$granularityControl)) {
            return false;
        }
        Integer this$controlRule = this.getControlRule();
        Integer other$controlRule = other.getControlRule();
        if (this$controlRule == null ? other$controlRule != null : !((Object)this$controlRule).equals(other$controlRule)) {
            return false;
        }
        String this$materialStatusId = this.getMaterialStatusId();
        String other$materialStatusId = other.getMaterialStatusId();
        if (this$materialStatusId == null ? other$materialStatusId != null : !this$materialStatusId.equals(other$materialStatusId)) {
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
        String this$transType = this.getTransType();
        String other$transType = other.getTransType();
        if (this$transType == null ? other$transType != null : !this$transType.equals(other$transType)) {
            return false;
        }
        String this$transType_Code = this.getTransType_Code();
        String other$transType_Code = other.getTransType_Code();
        if (this$transType_Code == null ? other$transType_Code != null : !this$transType_Code.equals(other$transType_Code)) {
            return false;
        }
        List<MaterialStatusDetailActionVO> this$materialStatusDetailAction = this.getMaterialStatusDetailAction();
        List<MaterialStatusDetailActionVO> other$materialStatusDetailAction = other.getMaterialStatusDetailAction();
        if (this$materialStatusDetailAction == null ? other$materialStatusDetailAction != null : !((Object)this$materialStatusDetailAction).equals(other$materialStatusDetailAction)) {
            return false;
        }
        String this$entityStatus = this.getEntityStatus();
        String other$entityStatus = other.getEntityStatus();
        return !(this$entityStatus == null ? other$entityStatus != null : !this$entityStatus.equals(other$entityStatus));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MaterialStatusDetailVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $systemFlag = this.getSystemFlag();
        result = result * 59 + ($systemFlag == null ? 43 : ((Object)$systemFlag).hashCode());
        Integer $granularityControl = this.getGranularityControl();
        result = result * 59 + ($granularityControl == null ? 43 : ((Object)$granularityControl).hashCode());
        Integer $controlRule = this.getControlRule();
        result = result * 59 + ($controlRule == null ? 43 : ((Object)$controlRule).hashCode());
        String $materialStatusId = this.getMaterialStatusId();
        result = result * 59 + ($materialStatusId == null ? 43 : $materialStatusId.hashCode());
        String $serviceCode = this.getServiceCode();
        result = result * 59 + ($serviceCode == null ? 43 : $serviceCode.hashCode());
        String $serviceName = this.getServiceName();
        result = result * 59 + ($serviceName == null ? 43 : $serviceName.hashCode());
        String $transType = this.getTransType();
        result = result * 59 + ($transType == null ? 43 : $transType.hashCode());
        String $transType_Code = this.getTransType_Code();
        result = result * 59 + ($transType_Code == null ? 43 : $transType_Code.hashCode());
        List<MaterialStatusDetailActionVO> $materialStatusDetailAction = this.getMaterialStatusDetailAction();
        result = result * 59 + ($materialStatusDetailAction == null ? 43 : ((Object)$materialStatusDetailAction).hashCode());
        String $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : $entityStatus.hashCode());
        return result;
    }

    public String toString() {
        return "MaterialStatusDetailVO(materialStatusId=" + this.getMaterialStatusId() + ", systemFlag=" + this.getSystemFlag() + ", serviceCode=" + this.getServiceCode() + ", serviceName=" + this.getServiceName() + ", transType=" + this.getTransType() + ", transType_Code=" + this.getTransType_Code() + ", granularityControl=" + this.getGranularityControl() + ", controlRule=" + this.getControlRule() + ", materialStatusDetailAction=" + this.getMaterialStatusDetailAction() + ", entityStatus=" + this.getEntityStatus() + ")";
    }
}

