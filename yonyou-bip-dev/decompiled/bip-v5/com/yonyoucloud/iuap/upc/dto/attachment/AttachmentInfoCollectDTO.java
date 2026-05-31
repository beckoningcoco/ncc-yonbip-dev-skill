/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.attachment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.attachment.AttachmentInfoDTO;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class AttachmentInfoCollectDTO {
    private String businessId;
    private List<AttachmentInfoDTO> attachmentInfoDTOList;

    public String getBusinessId() {
        return this.businessId;
    }

    public List<AttachmentInfoDTO> getAttachmentInfoDTOList() {
        return this.attachmentInfoDTOList;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public void setAttachmentInfoDTOList(List<AttachmentInfoDTO> attachmentInfoDTOList) {
        this.attachmentInfoDTOList = attachmentInfoDTOList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AttachmentInfoCollectDTO)) {
            return false;
        }
        AttachmentInfoCollectDTO other = (AttachmentInfoCollectDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$businessId = this.getBusinessId();
        String other$businessId = other.getBusinessId();
        if (this$businessId == null ? other$businessId != null : !this$businessId.equals(other$businessId)) {
            return false;
        }
        List<AttachmentInfoDTO> this$attachmentInfoDTOList = this.getAttachmentInfoDTOList();
        List<AttachmentInfoDTO> other$attachmentInfoDTOList = other.getAttachmentInfoDTOList();
        return !(this$attachmentInfoDTOList == null ? other$attachmentInfoDTOList != null : !((Object)this$attachmentInfoDTOList).equals(other$attachmentInfoDTOList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof AttachmentInfoCollectDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $businessId = this.getBusinessId();
        result = result * 59 + ($businessId == null ? 43 : $businessId.hashCode());
        List<AttachmentInfoDTO> $attachmentInfoDTOList = this.getAttachmentInfoDTOList();
        result = result * 59 + ($attachmentInfoDTOList == null ? 43 : ((Object)$attachmentInfoDTOList).hashCode());
        return result;
    }

    public String toString() {
        return "AttachmentInfoCollectDTO(businessId=" + this.getBusinessId() + ", attachmentInfoDTOList=" + this.getAttachmentInfoDTOList() + ")";
    }
}

