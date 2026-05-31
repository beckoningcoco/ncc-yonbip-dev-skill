/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCEntityStatus;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class PartnerComparisonDTO
implements Serializable {
    private String id;
    private String partnerId;
    private String fileId;
    private Boolean isDefault;
    private UPCEntityStatus status;

    public String getId() {
        return this.id;
    }

    public String getPartnerId() {
        return this.partnerId;
    }

    public String getFileId() {
        return this.fileId;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public UPCEntityStatus getStatus() {
        return this.status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setStatus(UPCEntityStatus status) {
        this.status = status;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PartnerComparisonDTO)) {
            return false;
        }
        PartnerComparisonDTO other = (PartnerComparisonDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$partnerId = this.getPartnerId();
        String other$partnerId = other.getPartnerId();
        if (this$partnerId == null ? other$partnerId != null : !this$partnerId.equals(other$partnerId)) {
            return false;
        }
        String this$fileId = this.getFileId();
        String other$fileId = other.getFileId();
        if (this$fileId == null ? other$fileId != null : !this$fileId.equals(other$fileId)) {
            return false;
        }
        UPCEntityStatus this$status = this.getStatus();
        UPCEntityStatus other$status = other.getStatus();
        return !(this$status == null ? other$status != null : !((Object)((Object)this$status)).equals((Object)other$status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PartnerComparisonDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $partnerId = this.getPartnerId();
        result = result * 59 + ($partnerId == null ? 43 : $partnerId.hashCode());
        String $fileId = this.getFileId();
        result = result * 59 + ($fileId == null ? 43 : $fileId.hashCode());
        UPCEntityStatus $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)((Object)$status)).hashCode());
        return result;
    }

    public String toString() {
        return "PartnerComparisonDTO(id=" + this.getId() + ", partnerId=" + this.getPartnerId() + ", fileId=" + this.getFileId() + ", isDefault=" + this.getIsDefault() + ", status=" + (Object)((Object)this.getStatus()) + ")";
    }
}

