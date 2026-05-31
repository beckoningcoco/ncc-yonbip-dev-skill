/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

import java.util.List;

public class ReasonQueryParam {
    @Deprecated
    private Long tenantId;
    private String ytenantId;
    private Long id;
    private List<Long> ids;
    private String reason;
    private String reasonLike;
    private List<String> reasons;
    private List<String> reasonLikes;
    private Integer stopstatus;
    private Integer reasonType;

    @Deprecated
    public Long getTenantId() {
        return this.tenantId;
    }

    public String getYtenantId() {
        return this.ytenantId;
    }

    public Long getId() {
        return this.id;
    }

    public List<Long> getIds() {
        return this.ids;
    }

    public String getReason() {
        return this.reason;
    }

    public String getReasonLike() {
        return this.reasonLike;
    }

    public List<String> getReasons() {
        return this.reasons;
    }

    public List<String> getReasonLikes() {
        return this.reasonLikes;
    }

    public Integer getStopstatus() {
        return this.stopstatus;
    }

    public Integer getReasonType() {
        return this.reasonType;
    }

    @Deprecated
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public void setYtenantId(String ytenantId) {
        this.ytenantId = ytenantId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setReasonLike(String reasonLike) {
        this.reasonLike = reasonLike;
    }

    public void setReasons(List<String> reasons) {
        this.reasons = reasons;
    }

    public void setReasonLikes(List<String> reasonLikes) {
        this.reasonLikes = reasonLikes;
    }

    public void setStopstatus(Integer stopstatus) {
        this.stopstatus = stopstatus;
    }

    public void setReasonType(Integer reasonType) {
        this.reasonType = reasonType;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ReasonQueryParam)) {
            return false;
        }
        ReasonQueryParam other = (ReasonQueryParam)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$tenantId = this.getTenantId();
        Long other$tenantId = other.getTenantId();
        if (this$tenantId == null ? other$tenantId != null : !((Object)this$tenantId).equals(other$tenantId)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$stopstatus = this.getStopstatus();
        Integer other$stopstatus = other.getStopstatus();
        if (this$stopstatus == null ? other$stopstatus != null : !((Object)this$stopstatus).equals(other$stopstatus)) {
            return false;
        }
        Integer this$reasonType = this.getReasonType();
        Integer other$reasonType = other.getReasonType();
        if (this$reasonType == null ? other$reasonType != null : !((Object)this$reasonType).equals(other$reasonType)) {
            return false;
        }
        String this$ytenantId = this.getYtenantId();
        String other$ytenantId = other.getYtenantId();
        if (this$ytenantId == null ? other$ytenantId != null : !this$ytenantId.equals(other$ytenantId)) {
            return false;
        }
        List<Long> this$ids = this.getIds();
        List<Long> other$ids = other.getIds();
        if (this$ids == null ? other$ids != null : !((Object)this$ids).equals(other$ids)) {
            return false;
        }
        String this$reason = this.getReason();
        String other$reason = other.getReason();
        if (this$reason == null ? other$reason != null : !this$reason.equals(other$reason)) {
            return false;
        }
        String this$reasonLike = this.getReasonLike();
        String other$reasonLike = other.getReasonLike();
        if (this$reasonLike == null ? other$reasonLike != null : !this$reasonLike.equals(other$reasonLike)) {
            return false;
        }
        List<String> this$reasons = this.getReasons();
        List<String> other$reasons = other.getReasons();
        if (this$reasons == null ? other$reasons != null : !((Object)this$reasons).equals(other$reasons)) {
            return false;
        }
        List<String> this$reasonLikes = this.getReasonLikes();
        List<String> other$reasonLikes = other.getReasonLikes();
        return !(this$reasonLikes == null ? other$reasonLikes != null : !((Object)this$reasonLikes).equals(other$reasonLikes));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ReasonQueryParam;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $tenantId = this.getTenantId();
        result = result * 59 + ($tenantId == null ? 43 : ((Object)$tenantId).hashCode());
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $stopstatus = this.getStopstatus();
        result = result * 59 + ($stopstatus == null ? 43 : ((Object)$stopstatus).hashCode());
        Integer $reasonType = this.getReasonType();
        result = result * 59 + ($reasonType == null ? 43 : ((Object)$reasonType).hashCode());
        String $ytenantId = this.getYtenantId();
        result = result * 59 + ($ytenantId == null ? 43 : $ytenantId.hashCode());
        List<Long> $ids = this.getIds();
        result = result * 59 + ($ids == null ? 43 : ((Object)$ids).hashCode());
        String $reason = this.getReason();
        result = result * 59 + ($reason == null ? 43 : $reason.hashCode());
        String $reasonLike = this.getReasonLike();
        result = result * 59 + ($reasonLike == null ? 43 : $reasonLike.hashCode());
        List<String> $reasons = this.getReasons();
        result = result * 59 + ($reasons == null ? 43 : ((Object)$reasons).hashCode());
        List<String> $reasonLikes = this.getReasonLikes();
        result = result * 59 + ($reasonLikes == null ? 43 : ((Object)$reasonLikes).hashCode());
        return result;
    }

    public String toString() {
        return "ReasonQueryParam(tenantId=" + this.getTenantId() + ", ytenantId=" + this.getYtenantId() + ", id=" + this.getId() + ", ids=" + this.getIds() + ", reason=" + this.getReason() + ", reasonLike=" + this.getReasonLike() + ", reasons=" + this.getReasons() + ", reasonLikes=" + this.getReasonLikes() + ", stopstatus=" + this.getStopstatus() + ", reasonType=" + this.getReasonType() + ")";
    }
}

