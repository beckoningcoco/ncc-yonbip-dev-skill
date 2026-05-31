/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.managementclass;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import java.io.Serializable;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ManagementClassIPassSaveRequest
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String code;
    private MultilingualVO name;
    private String parentCode;
    private String orgCode;
    private String templateName;
    private String productClassCode;
    private Integer order;
    private Boolean stopStatus;
    private MultilingualVO remark;
    private Map<String, Object> managementClassCharacter;
    private String sourceUnique;

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public MultilingualVO getName() {
        return this.name;
    }

    public String getParentCode() {
        return this.parentCode;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public String getProductClassCode() {
        return this.productClassCode;
    }

    public Integer getOrder() {
        return this.order;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public MultilingualVO getRemark() {
        return this.remark;
    }

    public Map<String, Object> getManagementClassCharacter() {
        return this.managementClassCharacter;
    }

    public String getSourceUnique() {
        return this.sourceUnique;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(MultilingualVO name) {
        this.name = name;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public void setProductClassCode(String productClassCode) {
        this.productClassCode = productClassCode;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setRemark(MultilingualVO remark) {
        this.remark = remark;
    }

    public void setManagementClassCharacter(Map<String, Object> managementClassCharacter) {
        this.managementClassCharacter = managementClassCharacter;
    }

    public void setSourceUnique(String sourceUnique) {
        this.sourceUnique = sourceUnique;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ManagementClassIPassSaveRequest)) {
            return false;
        }
        ManagementClassIPassSaveRequest other = (ManagementClassIPassSaveRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$order = this.getOrder();
        Integer other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        MultilingualVO this$name = this.getName();
        MultilingualVO other$name = other.getName();
        if (this$name == null ? other$name != null : !((Object)this$name).equals(other$name)) {
            return false;
        }
        String this$parentCode = this.getParentCode();
        String other$parentCode = other.getParentCode();
        if (this$parentCode == null ? other$parentCode != null : !this$parentCode.equals(other$parentCode)) {
            return false;
        }
        String this$orgCode = this.getOrgCode();
        String other$orgCode = other.getOrgCode();
        if (this$orgCode == null ? other$orgCode != null : !this$orgCode.equals(other$orgCode)) {
            return false;
        }
        String this$templateName = this.getTemplateName();
        String other$templateName = other.getTemplateName();
        if (this$templateName == null ? other$templateName != null : !this$templateName.equals(other$templateName)) {
            return false;
        }
        String this$productClassCode = this.getProductClassCode();
        String other$productClassCode = other.getProductClassCode();
        if (this$productClassCode == null ? other$productClassCode != null : !this$productClassCode.equals(other$productClassCode)) {
            return false;
        }
        MultilingualVO this$remark = this.getRemark();
        MultilingualVO other$remark = other.getRemark();
        if (this$remark == null ? other$remark != null : !((Object)this$remark).equals(other$remark)) {
            return false;
        }
        Map<String, Object> this$managementClassCharacter = this.getManagementClassCharacter();
        Map<String, Object> other$managementClassCharacter = other.getManagementClassCharacter();
        if (this$managementClassCharacter == null ? other$managementClassCharacter != null : !((Object)this$managementClassCharacter).equals(other$managementClassCharacter)) {
            return false;
        }
        String this$sourceUnique = this.getSourceUnique();
        String other$sourceUnique = other.getSourceUnique();
        return !(this$sourceUnique == null ? other$sourceUnique != null : !this$sourceUnique.equals(other$sourceUnique));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ManagementClassIPassSaveRequest;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        MultilingualVO $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $parentCode = this.getParentCode();
        result = result * 59 + ($parentCode == null ? 43 : $parentCode.hashCode());
        String $orgCode = this.getOrgCode();
        result = result * 59 + ($orgCode == null ? 43 : $orgCode.hashCode());
        String $templateName = this.getTemplateName();
        result = result * 59 + ($templateName == null ? 43 : $templateName.hashCode());
        String $productClassCode = this.getProductClassCode();
        result = result * 59 + ($productClassCode == null ? 43 : $productClassCode.hashCode());
        MultilingualVO $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        Map<String, Object> $managementClassCharacter = this.getManagementClassCharacter();
        result = result * 59 + ($managementClassCharacter == null ? 43 : ((Object)$managementClassCharacter).hashCode());
        String $sourceUnique = this.getSourceUnique();
        result = result * 59 + ($sourceUnique == null ? 43 : $sourceUnique.hashCode());
        return result;
    }

    public String toString() {
        return "ManagementClassIPassSaveRequest(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", parentCode=" + this.getParentCode() + ", orgCode=" + this.getOrgCode() + ", templateName=" + this.getTemplateName() + ", productClassCode=" + this.getProductClassCode() + ", order=" + this.getOrder() + ", stopStatus=" + this.getStopStatus() + ", remark=" + this.getRemark() + ", managementClassCharacter=" + this.getManagementClassCharacter() + ", sourceUnique=" + this.getSourceUnique() + ")";
    }
}

