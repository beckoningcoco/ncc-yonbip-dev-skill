/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ClassBaseDTO;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class CustomerCategoryDTO
extends ClassBaseDTO {
    private Integer order;
    private String erpCode;
    private String comment;
    private Boolean enabled;
    private Boolean iDeleted;
    private String outSysKey;
    private Integer creatorType;
    private String creatorName;
    private String orgId;
    private Long firstLevel;
    private Long secondLevel;
    private Long thirdLevel;
    private Long fourthLevel;
    private Long fifthLevel;
    private Long sixthLevel;
    private Long seventhLevel;
    private Long eighthLevel;

    public Integer getOrder() {
        return this.order;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public String getComment() {
        return this.comment;
    }

    public Boolean getEnabled() {
        return this.enabled;
    }

    public Boolean getIDeleted() {
        return this.iDeleted;
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

    public Long getFirstLevel() {
        return this.firstLevel;
    }

    public Long getSecondLevel() {
        return this.secondLevel;
    }

    public Long getThirdLevel() {
        return this.thirdLevel;
    }

    public Long getFourthLevel() {
        return this.fourthLevel;
    }

    public Long getFifthLevel() {
        return this.fifthLevel;
    }

    public Long getSixthLevel() {
        return this.sixthLevel;
    }

    public Long getSeventhLevel() {
        return this.seventhLevel;
    }

    public Long getEighthLevel() {
        return this.eighthLevel;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setIDeleted(Boolean iDeleted) {
        this.iDeleted = iDeleted;
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

    public void setFirstLevel(Long firstLevel) {
        this.firstLevel = firstLevel;
    }

    public void setSecondLevel(Long secondLevel) {
        this.secondLevel = secondLevel;
    }

    public void setThirdLevel(Long thirdLevel) {
        this.thirdLevel = thirdLevel;
    }

    public void setFourthLevel(Long fourthLevel) {
        this.fourthLevel = fourthLevel;
    }

    public void setFifthLevel(Long fifthLevel) {
        this.fifthLevel = fifthLevel;
    }

    public void setSixthLevel(Long sixthLevel) {
        this.sixthLevel = sixthLevel;
    }

    public void setSeventhLevel(Long seventhLevel) {
        this.seventhLevel = seventhLevel;
    }

    public void setEighthLevel(Long eighthLevel) {
        this.eighthLevel = eighthLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CustomerCategoryDTO)) {
            return false;
        }
        CustomerCategoryDTO other = (CustomerCategoryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$order = this.getOrder();
        Integer other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
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
        Long this$firstLevel = this.getFirstLevel();
        Long other$firstLevel = other.getFirstLevel();
        if (this$firstLevel == null ? other$firstLevel != null : !((Object)this$firstLevel).equals(other$firstLevel)) {
            return false;
        }
        Long this$secondLevel = this.getSecondLevel();
        Long other$secondLevel = other.getSecondLevel();
        if (this$secondLevel == null ? other$secondLevel != null : !((Object)this$secondLevel).equals(other$secondLevel)) {
            return false;
        }
        Long this$thirdLevel = this.getThirdLevel();
        Long other$thirdLevel = other.getThirdLevel();
        if (this$thirdLevel == null ? other$thirdLevel != null : !((Object)this$thirdLevel).equals(other$thirdLevel)) {
            return false;
        }
        Long this$fourthLevel = this.getFourthLevel();
        Long other$fourthLevel = other.getFourthLevel();
        if (this$fourthLevel == null ? other$fourthLevel != null : !((Object)this$fourthLevel).equals(other$fourthLevel)) {
            return false;
        }
        Long this$fifthLevel = this.getFifthLevel();
        Long other$fifthLevel = other.getFifthLevel();
        if (this$fifthLevel == null ? other$fifthLevel != null : !((Object)this$fifthLevel).equals(other$fifthLevel)) {
            return false;
        }
        Long this$sixthLevel = this.getSixthLevel();
        Long other$sixthLevel = other.getSixthLevel();
        if (this$sixthLevel == null ? other$sixthLevel != null : !((Object)this$sixthLevel).equals(other$sixthLevel)) {
            return false;
        }
        Long this$seventhLevel = this.getSeventhLevel();
        Long other$seventhLevel = other.getSeventhLevel();
        if (this$seventhLevel == null ? other$seventhLevel != null : !((Object)this$seventhLevel).equals(other$seventhLevel)) {
            return false;
        }
        Long this$eighthLevel = this.getEighthLevel();
        Long other$eighthLevel = other.getEighthLevel();
        if (this$eighthLevel == null ? other$eighthLevel != null : !((Object)this$eighthLevel).equals(other$eighthLevel)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
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
        return !(this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof CustomerCategoryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        Boolean $enabled = this.getEnabled();
        result = result * 59 + ($enabled == null ? 43 : ((Object)$enabled).hashCode());
        Boolean $iDeleted = this.getIDeleted();
        result = result * 59 + ($iDeleted == null ? 43 : ((Object)$iDeleted).hashCode());
        Integer $creatorType = this.getCreatorType();
        result = result * 59 + ($creatorType == null ? 43 : ((Object)$creatorType).hashCode());
        Long $firstLevel = this.getFirstLevel();
        result = result * 59 + ($firstLevel == null ? 43 : ((Object)$firstLevel).hashCode());
        Long $secondLevel = this.getSecondLevel();
        result = result * 59 + ($secondLevel == null ? 43 : ((Object)$secondLevel).hashCode());
        Long $thirdLevel = this.getThirdLevel();
        result = result * 59 + ($thirdLevel == null ? 43 : ((Object)$thirdLevel).hashCode());
        Long $fourthLevel = this.getFourthLevel();
        result = result * 59 + ($fourthLevel == null ? 43 : ((Object)$fourthLevel).hashCode());
        Long $fifthLevel = this.getFifthLevel();
        result = result * 59 + ($fifthLevel == null ? 43 : ((Object)$fifthLevel).hashCode());
        Long $sixthLevel = this.getSixthLevel();
        result = result * 59 + ($sixthLevel == null ? 43 : ((Object)$sixthLevel).hashCode());
        Long $seventhLevel = this.getSeventhLevel();
        result = result * 59 + ($seventhLevel == null ? 43 : ((Object)$seventhLevel).hashCode());
        Long $eighthLevel = this.getEighthLevel();
        result = result * 59 + ($eighthLevel == null ? 43 : ((Object)$eighthLevel).hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        String $comment = this.getComment();
        result = result * 59 + ($comment == null ? 43 : $comment.hashCode());
        String $outSysKey = this.getOutSysKey();
        result = result * 59 + ($outSysKey == null ? 43 : $outSysKey.hashCode());
        String $creatorName = this.getCreatorName();
        result = result * 59 + ($creatorName == null ? 43 : $creatorName.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "CustomerCategoryDTO(order=" + this.getOrder() + ", erpCode=" + this.getErpCode() + ", comment=" + this.getComment() + ", enabled=" + this.getEnabled() + ", iDeleted=" + this.getIDeleted() + ", outSysKey=" + this.getOutSysKey() + ", creatorType=" + this.getCreatorType() + ", creatorName=" + this.getCreatorName() + ", orgId=" + this.getOrgId() + ", firstLevel=" + this.getFirstLevel() + ", secondLevel=" + this.getSecondLevel() + ", thirdLevel=" + this.getThirdLevel() + ", fourthLevel=" + this.getFourthLevel() + ", fifthLevel=" + this.getFifthLevel() + ", sixthLevel=" + this.getSixthLevel() + ", seventhLevel=" + this.getSeventhLevel() + ", eighthLevel=" + this.getEighthLevel() + ")";
    }
}

