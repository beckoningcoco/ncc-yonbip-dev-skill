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
public class ProductFieldMapper
implements Serializable {
    private String entityUri;
    private String oldProperty;
    private String newProperty;

    public String getEntityUri() {
        return this.entityUri;
    }

    public String getOldProperty() {
        return this.oldProperty;
    }

    public String getNewProperty() {
        return this.newProperty;
    }

    public void setEntityUri(String entityUri) {
        this.entityUri = entityUri;
    }

    public void setOldProperty(String oldProperty) {
        this.oldProperty = oldProperty;
    }

    public void setNewProperty(String newProperty) {
        this.newProperty = newProperty;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductFieldMapper)) {
            return false;
        }
        ProductFieldMapper other = (ProductFieldMapper)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$entityUri = this.getEntityUri();
        String other$entityUri = other.getEntityUri();
        if (this$entityUri == null ? other$entityUri != null : !this$entityUri.equals(other$entityUri)) {
            return false;
        }
        String this$oldProperty = this.getOldProperty();
        String other$oldProperty = other.getOldProperty();
        if (this$oldProperty == null ? other$oldProperty != null : !this$oldProperty.equals(other$oldProperty)) {
            return false;
        }
        String this$newProperty = this.getNewProperty();
        String other$newProperty = other.getNewProperty();
        return !(this$newProperty == null ? other$newProperty != null : !this$newProperty.equals(other$newProperty));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductFieldMapper;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $entityUri = this.getEntityUri();
        result = result * 59 + ($entityUri == null ? 43 : $entityUri.hashCode());
        String $oldProperty = this.getOldProperty();
        result = result * 59 + ($oldProperty == null ? 43 : $oldProperty.hashCode());
        String $newProperty = this.getNewProperty();
        result = result * 59 + ($newProperty == null ? 43 : $newProperty.hashCode());
        return result;
    }

    public String toString() {
        return "ProductFieldMapper(entityUri=" + this.getEntityUri() + ", oldProperty=" + this.getOldProperty() + ", newProperty=" + this.getNewProperty() + ")";
    }
}

