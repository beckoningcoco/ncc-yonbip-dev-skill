/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.attrcontrol;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class DocAttrControlConfigDTO {
    private String entityUri;
    private String attributeCode;
    private String controlType;

    public String getEntityUri() {
        return this.entityUri;
    }

    public String getAttributeCode() {
        return this.attributeCode;
    }

    public String getControlType() {
        return this.controlType;
    }

    public void setEntityUri(String entityUri) {
        this.entityUri = entityUri;
    }

    public void setAttributeCode(String attributeCode) {
        this.attributeCode = attributeCode;
    }

    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DocAttrControlConfigDTO)) {
            return false;
        }
        DocAttrControlConfigDTO other = (DocAttrControlConfigDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$entityUri = this.getEntityUri();
        String other$entityUri = other.getEntityUri();
        if (this$entityUri == null ? other$entityUri != null : !this$entityUri.equals(other$entityUri)) {
            return false;
        }
        String this$attributeCode = this.getAttributeCode();
        String other$attributeCode = other.getAttributeCode();
        if (this$attributeCode == null ? other$attributeCode != null : !this$attributeCode.equals(other$attributeCode)) {
            return false;
        }
        String this$controlType = this.getControlType();
        String other$controlType = other.getControlType();
        return !(this$controlType == null ? other$controlType != null : !this$controlType.equals(other$controlType));
    }

    protected boolean canEqual(Object other) {
        return other instanceof DocAttrControlConfigDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $entityUri = this.getEntityUri();
        result = result * 59 + ($entityUri == null ? 43 : $entityUri.hashCode());
        String $attributeCode = this.getAttributeCode();
        result = result * 59 + ($attributeCode == null ? 43 : $attributeCode.hashCode());
        String $controlType = this.getControlType();
        result = result * 59 + ($controlType == null ? 43 : $controlType.hashCode());
        return result;
    }

    public String toString() {
        return "DocAttrControlConfigDTO(entityUri=" + this.getEntityUri() + ", attributeCode=" + this.getAttributeCode() + ", controlType=" + this.getControlType() + ")";
    }
}

