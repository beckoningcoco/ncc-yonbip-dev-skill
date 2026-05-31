/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.openapi.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.FileDTO;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantFileDTO {
    private Long id;
    private String businessId;
    private String fileType;
    private List<FileDTO> fileInfos;

    public Long getId() {
        return this.id;
    }

    public String getBusinessId() {
        return this.businessId;
    }

    public String getFileType() {
        return this.fileType;
    }

    public List<FileDTO> getFileInfos() {
        return this.fileInfos;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setFileInfos(List<FileDTO> fileInfos) {
        this.fileInfos = fileInfos;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantFileDTO)) {
            return false;
        }
        MerchantFileDTO other = (MerchantFileDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        String this$businessId = this.getBusinessId();
        String other$businessId = other.getBusinessId();
        if (this$businessId == null ? other$businessId != null : !this$businessId.equals(other$businessId)) {
            return false;
        }
        String this$fileType = this.getFileType();
        String other$fileType = other.getFileType();
        if (this$fileType == null ? other$fileType != null : !this$fileType.equals(other$fileType)) {
            return false;
        }
        List<FileDTO> this$fileInfos = this.getFileInfos();
        List<FileDTO> other$fileInfos = other.getFileInfos();
        return !(this$fileInfos == null ? other$fileInfos != null : !((Object)this$fileInfos).equals(other$fileInfos));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantFileDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        String $businessId = this.getBusinessId();
        result = result * 59 + ($businessId == null ? 43 : $businessId.hashCode());
        String $fileType = this.getFileType();
        result = result * 59 + ($fileType == null ? 43 : $fileType.hashCode());
        List<FileDTO> $fileInfos = this.getFileInfos();
        result = result * 59 + ($fileInfos == null ? 43 : ((Object)$fileInfos).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantFileDTO(id=" + this.getId() + ", businessId=" + this.getBusinessId() + ", fileType=" + this.getFileType() + ", fileInfos=" + this.getFileInfos() + ")";
    }
}

