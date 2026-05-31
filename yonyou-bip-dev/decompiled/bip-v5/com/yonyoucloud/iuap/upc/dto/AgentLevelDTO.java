/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.BaseDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class AgentLevelDTO
extends BaseDTO {
    private Boolean enabled;
    private Boolean iDeleted;
    private String comment;
    private String outSysKey;
    private Integer creatorType;
    private String creatorName;
    private String orgId;
    private MultilingualVO multilingualName;
    private MultilingualVO multilingualComment;
    private Integer order;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public Boolean getIDeleted() {
        return this.iDeleted;
    }

    public String getComment() {
        return this.comment;
    }

    public String getOutSysKey() {
        return this.outSysKey;
    }

    public Integer getCreatorType() {
        return this.creatorType;
    }

    public String getCreatorName() {
        return this.creatorName;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public MultilingualVO getMultilingualName() {
        return this.multilingualName;
    }

    public MultilingualVO getMultilingualComment() {
        return this.multilingualComment;
    }

    public Integer getOrder() {
        return this.order;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setIDeleted(Boolean iDeleted) {
        this.iDeleted = iDeleted;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setOutSysKey(String outSysKey) {
        this.outSysKey = outSysKey;
    }

    public void setCreatorType(Integer creatorType) {
        this.creatorType = creatorType;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setMultilingualName(MultilingualVO multilingualName) {
        this.multilingualName = multilingualName;
    }

    public void setMultilingualComment(MultilingualVO multilingualComment) {
        this.multilingualComment = multilingualComment;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgentLevelDTO)) {
            return false;
        }
        AgentLevelDTO other = (AgentLevelDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$enabled = this.getEnabled();
        Boolean other$enabled = other.getEnabled();
        if (this$enabled == null ? other$enabled != null : !((Object)this$enabled).equals(other$enabled)) {
            return false;
        }
        Boolean this$iDeleted = this.getIDeleted();
        Boolean other$iDeleted = other.getIDeleted();
        if (this$iDeleted == null ? other$iDeleted != null : !((Object)this$iDeleted).equals(other$iDeleted)) {
            return false;
        }
        Integer this$creatorType = this.getCreatorType();
        Integer other$creatorType = other.getCreatorType();
        if (this$creatorType == null ? other$creatorType != null : !((Object)this$creatorType).equals(other$creatorType)) {
            return false;
        }
        Integer this$order = this.getOrder();
        Integer other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        String this$comment = this.getComment();
        String other$comment = other.getComment();
        if (this$comment == null ? other$comment != null : !this$comment.equals(other$comment)) {
            return false;
        }
        String this$outSysKey = this.getOutSysKey();
        String other$outSysKey = other.getOutSysKey();
        if (this$outSysKey == null ? other$outSysKey != null : !this$outSysKey.equals(other$outSysKey)) {
            return false;
        }
        String this$creatorName = this.getCreatorName();
        String other$creatorName = other.getCreatorName();
        if (this$creatorName == null ? other$creatorName != null : !this$creatorName.equals(other$creatorName)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        MultilingualVO this$multilingualName = this.getMultilingualName();
        MultilingualVO other$multilingualName = other.getMultilingualName();
        if (this$multilingualName == null ? other$multilingualName != null : !((Object)this$multilingualName).equals(other$multilingualName)) {
            return false;
        }
        MultilingualVO this$multilingualComment = this.getMultilingualComment();
        MultilingualVO other$multilingualComment = other.getMultilingualComment();
        return !(this$multilingualComment == null ? other$multilingualComment != null : !((Object)this$multilingualComment).equals(other$multilingualComment));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof AgentLevelDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        Boolean $iDeleted = this.getIDeleted();
        result = result * 59 + ($iDeleted == null ? 43 : ((Object)$iDeleted).hashCode());
        Integer $creatorType = this.getCreatorType();
        result = result * 59 + ($creatorType == null ? 43 : ((Object)$creatorType).hashCode());
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        String $comment = this.getComment();
        result = result * 59 + ($comment == null ? 43 : $comment.hashCode());
        String $outSysKey = this.getOutSysKey();
        result = result * 59 + ($outSysKey == null ? 43 : $outSysKey.hashCode());
        String $creatorName = this.getCreatorName();
        result = result * 59 + ($creatorName == null ? 43 : $creatorName.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        MultilingualVO $multilingualName = this.getMultilingualName();
        result = result * 59 + ($multilingualName == null ? 43 : $multilingualName.hashCode());
        MultilingualVO $multilingualComment = this.getMultilingualComment();
        result = result * 59 + ($multilingualComment == null ? 43 : $multilingualComment.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "AgentLevelDTO(enabled=" + this.getEnabled() + ", iDeleted=" + this.getIDeleted() + ", comment=" + this.getComment() + ", outSysKey=" + this.getOutSysKey() + ", creatorType=" + this.getCreatorType() + ", creatorName=" + this.getCreatorName() + ", orgId=" + this.getOrgId() + ", multilingualName=" + this.getMultilingualName() + ", multilingualComment=" + this.getMultilingualComment() + ", order=" + this.getOrder() + ")";
    }
}

