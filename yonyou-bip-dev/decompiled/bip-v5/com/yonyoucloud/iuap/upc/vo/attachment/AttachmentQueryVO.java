/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo.attachment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.upc.utils.AttachmentBusinessTypeEnum;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class AttachmentQueryVO {
    private String archiveId;
    private List<String> archiveIdList;
    private AttachmentBusinessTypeEnum businessType;

    public String getArchiveId() {
        return this.archiveId;
    }

    public List<String> getArchiveIdList() {
        return this.archiveIdList;
    }

    public AttachmentBusinessTypeEnum getBusinessType() {
        return this.businessType;
    }

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    public void setArchiveIdList(List<String> archiveIdList) {
        this.archiveIdList = archiveIdList;
    }

    public void setBusinessType(AttachmentBusinessTypeEnum businessType) {
        this.businessType = businessType;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AttachmentQueryVO)) {
            return false;
        }
        AttachmentQueryVO other = (AttachmentQueryVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$archiveId = this.getArchiveId();
        String other$archiveId = other.getArchiveId();
        if (this$archiveId == null ? other$archiveId != null : !this$archiveId.equals(other$archiveId)) {
            return false;
        }
        List<String> this$archiveIdList = this.getArchiveIdList();
        List<String> other$archiveIdList = other.getArchiveIdList();
        if (this$archiveIdList == null ? other$archiveIdList != null : !((Object)this$archiveIdList).equals(other$archiveIdList)) {
            return false;
        }
        AttachmentBusinessTypeEnum this$businessType = this.getBusinessType();
        AttachmentBusinessTypeEnum other$businessType = other.getBusinessType();
        return !(this$businessType == null ? other$businessType != null : !((Object)((Object)this$businessType)).equals((Object)other$businessType));
    }

    protected boolean canEqual(Object other) {
        return other instanceof AttachmentQueryVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $archiveId = this.getArchiveId();
        result = result * 59 + ($archiveId == null ? 43 : $archiveId.hashCode());
        List<String> $archiveIdList = this.getArchiveIdList();
        result = result * 59 + ($archiveIdList == null ? 43 : ((Object)$archiveIdList).hashCode());
        AttachmentBusinessTypeEnum $businessType = this.getBusinessType();
        result = result * 59 + ($businessType == null ? 43 : ((Object)((Object)$businessType)).hashCode());
        return result;
    }

    public String toString() {
        return "AttachmentQueryVO(archiveId=" + this.getArchiveId() + ", archiveIdList=" + this.getArchiveIdList() + ", businessType=" + (Object)((Object)this.getBusinessType()) + ")";
    }
}

