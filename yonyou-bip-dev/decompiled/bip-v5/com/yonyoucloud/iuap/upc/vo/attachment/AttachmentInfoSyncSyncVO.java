/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo.attachment;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class AttachmentInfoSyncSyncVO {
    private String archiveId;
    private String attachmentBusinessId;
    private String attachmentFileId;

    public String getArchiveId() {
        return this.archiveId;
    }

    public String getAttachmentBusinessId() {
        return this.attachmentBusinessId;
    }

    public String getAttachmentFileId() {
        return this.attachmentFileId;
    }

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    public void setAttachmentBusinessId(String attachmentBusinessId) {
        this.attachmentBusinessId = attachmentBusinessId;
    }

    public void setAttachmentFileId(String attachmentFileId) {
        this.attachmentFileId = attachmentFileId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AttachmentInfoSyncSyncVO)) {
            return false;
        }
        AttachmentInfoSyncSyncVO other = (AttachmentInfoSyncSyncVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$archiveId = this.getArchiveId();
        String other$archiveId = other.getArchiveId();
        if (this$archiveId == null ? other$archiveId != null : !this$archiveId.equals(other$archiveId)) {
            return false;
        }
        String this$attachmentBusinessId = this.getAttachmentBusinessId();
        String other$attachmentBusinessId = other.getAttachmentBusinessId();
        if (this$attachmentBusinessId == null ? other$attachmentBusinessId != null : !this$attachmentBusinessId.equals(other$attachmentBusinessId)) {
            return false;
        }
        String this$attachmentFileId = this.getAttachmentFileId();
        String other$attachmentFileId = other.getAttachmentFileId();
        return !(this$attachmentFileId == null ? other$attachmentFileId != null : !this$attachmentFileId.equals(other$attachmentFileId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof AttachmentInfoSyncSyncVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $archiveId = this.getArchiveId();
        result = result * 59 + ($archiveId == null ? 43 : $archiveId.hashCode());
        String $attachmentBusinessId = this.getAttachmentBusinessId();
        result = result * 59 + ($attachmentBusinessId == null ? 43 : $attachmentBusinessId.hashCode());
        String $attachmentFileId = this.getAttachmentFileId();
        result = result * 59 + ($attachmentFileId == null ? 43 : $attachmentFileId.hashCode());
        return result;
    }

    public String toString() {
        return "AttachmentInfoSyncSyncVO(archiveId=" + this.getArchiveId() + ", attachmentBusinessId=" + this.getAttachmentBusinessId() + ", attachmentFileId=" + this.getAttachmentFileId() + ")";
    }
}

