/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

import com.yonyou.iuap.bizdoc.service.model.BaseQueryParam;
import java.util.List;

public class RegionCorpQueryParam
extends BaseQueryParam {
    private Long parentId;
    private List<Long> parentIds;
    private String parentCode;
    private List<String> parentCodes;
    private String parentCodeLike;
    private String mergerName;
    private String mergerNameLike;
    private Integer level;
    private List<Integer> levelsNotIn;
    private List<Integer> levelsIn;
    private Integer stopstatus;
    private List<Long> subdataNotIds;

    public Long getParentId() {
        return this.parentId;
    }

    public List<Long> getParentIds() {
        return this.parentIds;
    }

    public String getParentCode() {
        return this.parentCode;
    }

    public List<String> getParentCodes() {
        return this.parentCodes;
    }

    public String getParentCodeLike() {
        return this.parentCodeLike;
    }

    public String getMergerName() {
        return this.mergerName;
    }

    public String getMergerNameLike() {
        return this.mergerNameLike;
    }

    public Integer getLevel() {
        return this.level;
    }

    public List<Integer> getLevelsNotIn() {
        return this.levelsNotIn;
    }

    public List<Integer> getLevelsIn() {
        return this.levelsIn;
    }

    public Integer getStopstatus() {
        return this.stopstatus;
    }

    public List<Long> getSubdataNotIds() {
        return this.subdataNotIds;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public void setParentIds(List<Long> parentIds) {
        this.parentIds = parentIds;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public void setParentCodes(List<String> parentCodes) {
        this.parentCodes = parentCodes;
    }

    public void setParentCodeLike(String parentCodeLike) {
        this.parentCodeLike = parentCodeLike;
    }

    public void setMergerName(String mergerName) {
        this.mergerName = mergerName;
    }

    public void setMergerNameLike(String mergerNameLike) {
        this.mergerNameLike = mergerNameLike;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setLevelsNotIn(List<Integer> levelsNotIn) {
        this.levelsNotIn = levelsNotIn;
    }

    public void setLevelsIn(List<Integer> levelsIn) {
        this.levelsIn = levelsIn;
    }

    public void setStopstatus(Integer stopstatus) {
        this.stopstatus = stopstatus;
    }

    public void setSubdataNotIds(List<Long> subdataNotIds) {
        this.subdataNotIds = subdataNotIds;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RegionCorpQueryParam)) {
            return false;
        }
        RegionCorpQueryParam other = (RegionCorpQueryParam)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$parentId = this.getParentId();
        Long other$parentId = other.getParentId();
        if (this$parentId == null ? other$parentId != null : !((Object)this$parentId).equals(other$parentId)) {
            return false;
        }
        Integer this$level = this.getLevel();
        Integer other$level = other.getLevel();
        if (this$level == null ? other$level != null : !((Object)this$level).equals(other$level)) {
            return false;
        }
        Integer this$stopstatus = this.getStopstatus();
        Integer other$stopstatus = other.getStopstatus();
        if (this$stopstatus == null ? other$stopstatus != null : !((Object)this$stopstatus).equals(other$stopstatus)) {
            return false;
        }
        List<Long> this$parentIds = this.getParentIds();
        List<Long> other$parentIds = other.getParentIds();
        if (this$parentIds == null ? other$parentIds != null : !((Object)this$parentIds).equals(other$parentIds)) {
            return false;
        }
        String this$parentCode = this.getParentCode();
        String other$parentCode = other.getParentCode();
        if (this$parentCode == null ? other$parentCode != null : !this$parentCode.equals(other$parentCode)) {
            return false;
        }
        List<String> this$parentCodes = this.getParentCodes();
        List<String> other$parentCodes = other.getParentCodes();
        if (this$parentCodes == null ? other$parentCodes != null : !((Object)this$parentCodes).equals(other$parentCodes)) {
            return false;
        }
        String this$parentCodeLike = this.getParentCodeLike();
        String other$parentCodeLike = other.getParentCodeLike();
        if (this$parentCodeLike == null ? other$parentCodeLike != null : !this$parentCodeLike.equals(other$parentCodeLike)) {
            return false;
        }
        String this$mergerName = this.getMergerName();
        String other$mergerName = other.getMergerName();
        if (this$mergerName == null ? other$mergerName != null : !this$mergerName.equals(other$mergerName)) {
            return false;
        }
        String this$mergerNameLike = this.getMergerNameLike();
        String other$mergerNameLike = other.getMergerNameLike();
        if (this$mergerNameLike == null ? other$mergerNameLike != null : !this$mergerNameLike.equals(other$mergerNameLike)) {
            return false;
        }
        List<Integer> this$levelsNotIn = this.getLevelsNotIn();
        List<Integer> other$levelsNotIn = other.getLevelsNotIn();
        if (this$levelsNotIn == null ? other$levelsNotIn != null : !((Object)this$levelsNotIn).equals(other$levelsNotIn)) {
            return false;
        }
        List<Integer> this$levelsIn = this.getLevelsIn();
        List<Integer> other$levelsIn = other.getLevelsIn();
        if (this$levelsIn == null ? other$levelsIn != null : !((Object)this$levelsIn).equals(other$levelsIn)) {
            return false;
        }
        List<Long> this$subdataNotIds = this.getSubdataNotIds();
        List<Long> other$subdataNotIds = other.getSubdataNotIds();
        return !(this$subdataNotIds == null ? other$subdataNotIds != null : !((Object)this$subdataNotIds).equals(other$subdataNotIds));
    }

    protected boolean canEqual(Object other) {
        return other instanceof RegionCorpQueryParam;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $parentId = this.getParentId();
        result = result * 59 + ($parentId == null ? 43 : ((Object)$parentId).hashCode());
        Integer $level = this.getLevel();
        result = result * 59 + ($level == null ? 43 : ((Object)$level).hashCode());
        Integer $stopstatus = this.getStopstatus();
        result = result * 59 + ($stopstatus == null ? 43 : ((Object)$stopstatus).hashCode());
        List<Long> $parentIds = this.getParentIds();
        result = result * 59 + ($parentIds == null ? 43 : ((Object)$parentIds).hashCode());
        String $parentCode = this.getParentCode();
        result = result * 59 + ($parentCode == null ? 43 : $parentCode.hashCode());
        List<String> $parentCodes = this.getParentCodes();
        result = result * 59 + ($parentCodes == null ? 43 : ((Object)$parentCodes).hashCode());
        String $parentCodeLike = this.getParentCodeLike();
        result = result * 59 + ($parentCodeLike == null ? 43 : $parentCodeLike.hashCode());
        String $mergerName = this.getMergerName();
        result = result * 59 + ($mergerName == null ? 43 : $mergerName.hashCode());
        String $mergerNameLike = this.getMergerNameLike();
        result = result * 59 + ($mergerNameLike == null ? 43 : $mergerNameLike.hashCode());
        List<Integer> $levelsNotIn = this.getLevelsNotIn();
        result = result * 59 + ($levelsNotIn == null ? 43 : ((Object)$levelsNotIn).hashCode());
        List<Integer> $levelsIn = this.getLevelsIn();
        result = result * 59 + ($levelsIn == null ? 43 : ((Object)$levelsIn).hashCode());
        List<Long> $subdataNotIds = this.getSubdataNotIds();
        result = result * 59 + ($subdataNotIds == null ? 43 : ((Object)$subdataNotIds).hashCode());
        return result;
    }

    public String toString() {
        return "RegionCorpQueryParam(parentId=" + this.getParentId() + ", parentIds=" + this.getParentIds() + ", parentCode=" + this.getParentCode() + ", parentCodes=" + this.getParentCodes() + ", parentCodeLike=" + this.getParentCodeLike() + ", mergerName=" + this.getMergerName() + ", mergerNameLike=" + this.getMergerNameLike() + ", level=" + this.getLevel() + ", levelsNotIn=" + this.getLevelsNotIn() + ", levelsIn=" + this.getLevelsIn() + ", stopstatus=" + this.getStopstatus() + ", subdataNotIds=" + this.getSubdataNotIds() + ")";
    }
}

