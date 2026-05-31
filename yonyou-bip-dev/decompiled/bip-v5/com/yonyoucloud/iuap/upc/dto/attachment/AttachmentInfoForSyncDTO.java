/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.attachment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.upc.utils.AttachmentBusinessTypeEnum;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class AttachmentInfoForSyncDTO {
    private String archiveId;
    private AttachmentBusinessTypeEnum AttachmentBusinessType;
    private String attachmentBusinessId;
    private String attachmentFileId;
    private Long fileSize;
    private String fileName;
    private String downloadUrl;
    private String fileExtension;
    private String filePath;
    private String fileCreateTime;
    private String syncTime;

    public String getArchiveId() {
        return this.archiveId;
    }

    public AttachmentBusinessTypeEnum getAttachmentBusinessType() {
        return this.AttachmentBusinessType;
    }

    public String getAttachmentBusinessId() {
        return this.attachmentBusinessId;
    }

    public String getAttachmentFileId() {
        return this.attachmentFileId;
    }

    public Long getFileSize() {
        return this.fileSize;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getFileExtension() {
        return this.fileExtension;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getFileCreateTime() {
        return this.fileCreateTime;
    }

    public String getSyncTime() {
        return this.syncTime;
    }

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    public void setAttachmentBusinessType(AttachmentBusinessTypeEnum AttachmentBusinessType) {
        this.AttachmentBusinessType = AttachmentBusinessType;
    }

    public void setAttachmentBusinessId(String attachmentBusinessId) {
        this.attachmentBusinessId = attachmentBusinessId;
    }

    public void setAttachmentFileId(String attachmentFileId) {
        this.attachmentFileId = attachmentFileId;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setFileCreateTime(String fileCreateTime) {
        this.fileCreateTime = fileCreateTime;
    }

    public void setSyncTime(String syncTime) {
        this.syncTime = syncTime;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AttachmentInfoForSyncDTO)) {
            return false;
        }
        AttachmentInfoForSyncDTO other = (AttachmentInfoForSyncDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$fileSize = this.getFileSize();
        Long other$fileSize = other.getFileSize();
        if (this$fileSize == null ? other$fileSize != null : !((Object)this$fileSize).equals(other$fileSize)) {
            return false;
        }
        String this$archiveId = this.getArchiveId();
        String other$archiveId = other.getArchiveId();
        if (this$archiveId == null ? other$archiveId != null : !this$archiveId.equals(other$archiveId)) {
            return false;
        }
        AttachmentBusinessTypeEnum this$AttachmentBusinessType = this.getAttachmentBusinessType();
        AttachmentBusinessTypeEnum other$AttachmentBusinessType = other.getAttachmentBusinessType();
        if (this$AttachmentBusinessType == null ? other$AttachmentBusinessType != null : !((Object)((Object)this$AttachmentBusinessType)).equals((Object)other$AttachmentBusinessType)) {
            return false;
        }
        String this$attachmentBusinessId = this.getAttachmentBusinessId();
        String other$attachmentBusinessId = other.getAttachmentBusinessId();
        if (this$attachmentBusinessId == null ? other$attachmentBusinessId != null : !this$attachmentBusinessId.equals(other$attachmentBusinessId)) {
            return false;
        }
        String this$attachmentFileId = this.getAttachmentFileId();
        String other$attachmentFileId = other.getAttachmentFileId();
        if (this$attachmentFileId == null ? other$attachmentFileId != null : !this$attachmentFileId.equals(other$attachmentFileId)) {
            return false;
        }
        String this$fileName = this.getFileName();
        String other$fileName = other.getFileName();
        if (this$fileName == null ? other$fileName != null : !this$fileName.equals(other$fileName)) {
            return false;
        }
        String this$downloadUrl = this.getDownloadUrl();
        String other$downloadUrl = other.getDownloadUrl();
        if (this$downloadUrl == null ? other$downloadUrl != null : !this$downloadUrl.equals(other$downloadUrl)) {
            return false;
        }
        String this$fileExtension = this.getFileExtension();
        String other$fileExtension = other.getFileExtension();
        if (this$fileExtension == null ? other$fileExtension != null : !this$fileExtension.equals(other$fileExtension)) {
            return false;
        }
        String this$filePath = this.getFilePath();
        String other$filePath = other.getFilePath();
        if (this$filePath == null ? other$filePath != null : !this$filePath.equals(other$filePath)) {
            return false;
        }
        String this$fileCreateTime = this.getFileCreateTime();
        String other$fileCreateTime = other.getFileCreateTime();
        if (this$fileCreateTime == null ? other$fileCreateTime != null : !this$fileCreateTime.equals(other$fileCreateTime)) {
            return false;
        }
        String this$syncTime = this.getSyncTime();
        String other$syncTime = other.getSyncTime();
        return !(this$syncTime == null ? other$syncTime != null : !this$syncTime.equals(other$syncTime));
    }

    protected boolean canEqual(Object other) {
        return other instanceof AttachmentInfoForSyncDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $fileSize = this.getFileSize();
        result = result * 59 + ($fileSize == null ? 43 : ((Object)$fileSize).hashCode());
        String $archiveId = this.getArchiveId();
        result = result * 59 + ($archiveId == null ? 43 : $archiveId.hashCode());
        AttachmentBusinessTypeEnum $AttachmentBusinessType = this.getAttachmentBusinessType();
        result = result * 59 + ($AttachmentBusinessType == null ? 43 : ((Object)((Object)$AttachmentBusinessType)).hashCode());
        String $attachmentBusinessId = this.getAttachmentBusinessId();
        result = result * 59 + ($attachmentBusinessId == null ? 43 : $attachmentBusinessId.hashCode());
        String $attachmentFileId = this.getAttachmentFileId();
        result = result * 59 + ($attachmentFileId == null ? 43 : $attachmentFileId.hashCode());
        String $fileName = this.getFileName();
        result = result * 59 + ($fileName == null ? 43 : $fileName.hashCode());
        String $downloadUrl = this.getDownloadUrl();
        result = result * 59 + ($downloadUrl == null ? 43 : $downloadUrl.hashCode());
        String $fileExtension = this.getFileExtension();
        result = result * 59 + ($fileExtension == null ? 43 : $fileExtension.hashCode());
        String $filePath = this.getFilePath();
        result = result * 59 + ($filePath == null ? 43 : $filePath.hashCode());
        String $fileCreateTime = this.getFileCreateTime();
        result = result * 59 + ($fileCreateTime == null ? 43 : $fileCreateTime.hashCode());
        String $syncTime = this.getSyncTime();
        result = result * 59 + ($syncTime == null ? 43 : $syncTime.hashCode());
        return result;
    }

    public String toString() {
        return "AttachmentInfoForSyncDTO(archiveId=" + this.getArchiveId() + ", AttachmentBusinessType=" + (Object)((Object)this.getAttachmentBusinessType()) + ", attachmentBusinessId=" + this.getAttachmentBusinessId() + ", attachmentFileId=" + this.getAttachmentFileId() + ", fileSize=" + this.getFileSize() + ", fileName=" + this.getFileName() + ", downloadUrl=" + this.getDownloadUrl() + ", fileExtension=" + this.getFileExtension() + ", filePath=" + this.getFilePath() + ", fileCreateTime=" + this.getFileCreateTime() + ", syncTime=" + this.getSyncTime() + ")";
    }
}

