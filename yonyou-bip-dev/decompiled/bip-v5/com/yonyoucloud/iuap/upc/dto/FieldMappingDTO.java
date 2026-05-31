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
public class FieldMappingDTO
implements Serializable {
    private String id;
    private Integer apiType;
    private String billnum;
    private String apiKey;
    private String apiValue;
    private String description;

    public String getId() {
        return this.id;
    }

    public Integer getApiType() {
        return this.apiType;
    }

    public String getBillnum() {
        return this.billnum;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getApiValue() {
        return this.apiValue;
    }

    public String getDescription() {
        return this.description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setApiType(Integer apiType) {
        this.apiType = apiType;
    }

    public void setBillnum(String billnum) {
        this.billnum = billnum;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public void setApiValue(String apiValue) {
        this.apiValue = apiValue;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof FieldMappingDTO)) {
            return false;
        }
        FieldMappingDTO other = (FieldMappingDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$apiType = this.getApiType();
        Integer other$apiType = other.getApiType();
        if (this$apiType == null ? other$apiType != null : !((Object)this$apiType).equals(other$apiType)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$billnum = this.getBillnum();
        String other$billnum = other.getBillnum();
        if (this$billnum == null ? other$billnum != null : !this$billnum.equals(other$billnum)) {
            return false;
        }
        String this$apiKey = this.getApiKey();
        String other$apiKey = other.getApiKey();
        if (this$apiKey == null ? other$apiKey != null : !this$apiKey.equals(other$apiKey)) {
            return false;
        }
        String this$apiValue = this.getApiValue();
        String other$apiValue = other.getApiValue();
        if (this$apiValue == null ? other$apiValue != null : !this$apiValue.equals(other$apiValue)) {
            return false;
        }
        String this$description = this.getDescription();
        String other$description = other.getDescription();
        return !(this$description == null ? other$description != null : !this$description.equals(other$description));
    }

    protected boolean canEqual(Object other) {
        return other instanceof FieldMappingDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $apiType = this.getApiType();
        result = result * 59 + ($apiType == null ? 43 : ((Object)$apiType).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $billnum = this.getBillnum();
        result = result * 59 + ($billnum == null ? 43 : $billnum.hashCode());
        String $apiKey = this.getApiKey();
        result = result * 59 + ($apiKey == null ? 43 : $apiKey.hashCode());
        String $apiValue = this.getApiValue();
        result = result * 59 + ($apiValue == null ? 43 : $apiValue.hashCode());
        String $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        return result;
    }

    public String toString() {
        return "FieldMappingDTO(id=" + this.getId() + ", apiType=" + this.getApiType() + ", billnum=" + this.getBillnum() + ", apiKey=" + this.getApiKey() + ", apiValue=" + this.getApiValue() + ", description=" + this.getDescription() + ")";
    }
}

