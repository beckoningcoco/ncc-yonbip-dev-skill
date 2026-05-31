/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo.attachment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.vo.attachment.AttachmentInfoSyncSyncVO;
import com.yonyoucloud.upc.utils.AttachmentBusinessTypeEnum;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class AttachmentInfoSyncQueryVO {
    private List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList;
    private AttachmentBusinessTypeEnum attachmentBusinessType;

    public List<AttachmentInfoSyncSyncVO> getAttachmentInfoSyncSyncVOList() {
        return this.attachmentInfoSyncSyncVOList;
    }

    public AttachmentBusinessTypeEnum getAttachmentBusinessType() {
        return this.attachmentBusinessType;
    }

    public void setAttachmentInfoSyncSyncVOList(List<AttachmentInfoSyncSyncVO> attachmentInfoSyncSyncVOList) {
        this.attachmentInfoSyncSyncVOList = attachmentInfoSyncSyncVOList;
    }

    public void setAttachmentBusinessType(AttachmentBusinessTypeEnum attachmentBusinessType) {
        this.attachmentBusinessType = attachmentBusinessType;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AttachmentInfoSyncQueryVO)) {
            return false;
        }
        AttachmentInfoSyncQueryVO other = (AttachmentInfoSyncQueryVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        List<AttachmentInfoSyncSyncVO> this$attachmentInfoSyncSyncVOList = this.getAttachmentInfoSyncSyncVOList();
        List<AttachmentInfoSyncSyncVO> other$attachmentInfoSyncSyncVOList = other.getAttachmentInfoSyncSyncVOList();
        if (this$attachmentInfoSyncSyncVOList == null ? other$attachmentInfoSyncSyncVOList != null : !((Object)this$attachmentInfoSyncSyncVOList).equals(other$attachmentInfoSyncSyncVOList)) {
            return false;
        }
        AttachmentBusinessTypeEnum this$attachmentBusinessType = this.getAttachmentBusinessType();
        AttachmentBusinessTypeEnum other$attachmentBusinessType = other.getAttachmentBusinessType();
        return !(this$attachmentBusinessType == null ? other$attachmentBusinessType != null : !((Object)((Object)this$attachmentBusinessType)).equals((Object)other$attachmentBusinessType));
    }

    protected boolean canEqual(Object other) {
        return other instanceof AttachmentInfoSyncQueryVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        List<AttachmentInfoSyncSyncVO> $attachmentInfoSyncSyncVOList = this.getAttachmentInfoSyncSyncVOList();
        result = result * 59 + ($attachmentInfoSyncSyncVOList == null ? 43 : ((Object)$attachmentInfoSyncSyncVOList).hashCode());
        AttachmentBusinessTypeEnum $attachmentBusinessType = this.getAttachmentBusinessType();
        result = result * 59 + ($attachmentBusinessType == null ? 43 : ((Object)((Object)$attachmentBusinessType)).hashCode());
        return result;
    }

    public String toString() {
        return "AttachmentInfoSyncQueryVO(attachmentInfoSyncSyncVOList=" + this.getAttachmentInfoSyncSyncVOList() + ", attachmentBusinessType=" + (Object)((Object)this.getAttachmentBusinessType()) + ")";
    }
}

