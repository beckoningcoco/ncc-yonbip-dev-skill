/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.attachment;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class AttachmentInfoDTO {
    private String fileId;
    private String businessId;
    private String name;
    private String downloadUrl;
    private String cooperationBusinessId;

    public String getFileId() {
        return this.fileId;
    }

    public String getBusinessId() {
        return this.businessId;
    }

    public String getName() {
        return this.name;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getCooperationBusinessId() {
        return this.cooperationBusinessId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public void setCooperationBusinessId(String cooperationBusinessId) {
        this.cooperationBusinessId = cooperationBusinessId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AttachmentInfoDTO)) {
            return false;
        }
        AttachmentInfoDTO other = (AttachmentInfoDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$fileId = this.getFileId();
        String other$fileId = other.getFileId();
        if (this$fileId == null ? other$fileId != null : !this$fileId.equals(other$fileId)) {
            return false;
        }
        String this$businessId = this.getBusinessId();
        String other$businessId = other.getBusinessId();
        if (this$businessId == null ? other$businessId != null : !this$businessId.equals(other$businessId)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$downloadUrl = this.getDownloadUrl();
        String other$downloadUrl = other.getDownloadUrl();
        if (this$downloadUrl == null ? other$downloadUrl != null : !this$downloadUrl.equals(other$downloadUrl)) {
            return false;
        }
        String this$cooperationBusinessId = this.getCooperationBusinessId();
        String other$cooperationBusinessId = other.getCooperationBusinessId();
        return !(this$cooperationBusinessId == null ? other$cooperationBusinessId != null : !this$cooperationBusinessId.equals(other$cooperationBusinessId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof AttachmentInfoDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $fileId = this.getFileId();
        result = result * 59 + ($fileId == null ? 43 : $fileId.hashCode());
        String $businessId = this.getBusinessId();
        result = result * 59 + ($businessId == null ? 43 : $businessId.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $downloadUrl = this.getDownloadUrl();
        result = result * 59 + ($downloadUrl == null ? 43 : $downloadUrl.hashCode());
        String $cooperationBusinessId = this.getCooperationBusinessId();
        result = result * 59 + ($cooperationBusinessId == null ? 43 : $cooperationBusinessId.hashCode());
        return result;
    }

    public String toString() {
        return "AttachmentInfoDTO(fileId=" + this.getFileId() + ", businessId=" + this.getBusinessId() + ", name=" + this.getName() + ", downloadUrl=" + this.getDownloadUrl() + ", cooperationBusinessId=" + this.getCooperationBusinessId() + ")";
    }
}

