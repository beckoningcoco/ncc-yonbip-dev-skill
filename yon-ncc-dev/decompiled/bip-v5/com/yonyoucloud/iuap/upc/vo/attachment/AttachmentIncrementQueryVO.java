/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo.attachment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.upc.utils.AttachmentBusinessTypeEnum;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class AttachmentIncrementQueryVO
extends UPCPager {
    private String beginTime;
    private AttachmentBusinessTypeEnum businessType;

    public String getBeginTime() {
        return this.beginTime;
    }

    public AttachmentBusinessTypeEnum getBusinessType() {
        return this.businessType;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public void setBusinessType(AttachmentBusinessTypeEnum businessType) {
        this.businessType = businessType;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AttachmentIncrementQueryVO)) {
            return false;
        }
        AttachmentIncrementQueryVO other = (AttachmentIncrementQueryVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$beginTime = this.getBeginTime();
        String other$beginTime = other.getBeginTime();
        if (this$beginTime == null ? other$beginTime != null : !this$beginTime.equals(other$beginTime)) {
            return false;
        }
        AttachmentBusinessTypeEnum this$businessType = this.getBusinessType();
        AttachmentBusinessTypeEnum other$businessType = other.getBusinessType();
        return !(this$businessType == null ? other$businessType != null : !((Object)((Object)this$businessType)).equals((Object)other$businessType));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof AttachmentIncrementQueryVO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $beginTime = this.getBeginTime();
        result = result * 59 + ($beginTime == null ? 43 : $beginTime.hashCode());
        AttachmentBusinessTypeEnum $businessType = this.getBusinessType();
        result = result * 59 + ($businessType == null ? 43 : ((Object)((Object)$businessType)).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "AttachmentIncrementQueryVO(beginTime=" + this.getBeginTime() + ", businessType=" + (Object)((Object)this.getBusinessType()) + ")";
    }
}

