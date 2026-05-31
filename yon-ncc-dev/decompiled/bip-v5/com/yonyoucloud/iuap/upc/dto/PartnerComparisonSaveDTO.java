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
public class PartnerComparisonSaveDTO
implements Serializable {
    private String partnerId;
    private String fileId;

    public String getPartnerId() {
        return this.partnerId;
    }

    public String getFileId() {
        return this.fileId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PartnerComparisonSaveDTO)) {
            return false;
        }
        PartnerComparisonSaveDTO other = (PartnerComparisonSaveDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$partnerId = this.getPartnerId();
        String other$partnerId = other.getPartnerId();
        if (this$partnerId == null ? other$partnerId != null : !this$partnerId.equals(other$partnerId)) {
            return false;
        }
        String this$fileId = this.getFileId();
        String other$fileId = other.getFileId();
        return !(this$fileId == null ? other$fileId != null : !this$fileId.equals(other$fileId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PartnerComparisonSaveDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $partnerId = this.getPartnerId();
        result = result * 59 + ($partnerId == null ? 43 : $partnerId.hashCode());
        String $fileId = this.getFileId();
        result = result * 59 + ($fileId == null ? 43 : $fileId.hashCode());
        return result;
    }

    public String toString() {
        return "PartnerComparisonSaveDTO(partnerId=" + this.getPartnerId() + ", fileId=" + this.getFileId() + ")";
    }
}

