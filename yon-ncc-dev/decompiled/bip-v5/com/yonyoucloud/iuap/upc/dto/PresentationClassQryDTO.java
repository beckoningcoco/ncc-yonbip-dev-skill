/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class PresentationClassQryDTO
implements Serializable {
    private String[] fields;
    private Long id;
    private List<Long> idList;
    private Boolean showInFront;
    private Integer level;
    private String code;
    private String name;
    private Integer sort;
    private Boolean stopStatus;
    private Integer uOrderStatus;
    private Integer uRecommend;
    private Long parent;
    private Integer end;
    private String codeOrName;
    private String leftPathFuzzy;

    public String[] getFields() {
        return this.fields;
    }

    public Long getId() {
        return this.id;
    }

    public List<Long> getIdList() {
        return this.idList;
    }

    public Boolean getShowInFront() {
        return this.showInFront;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public Integer getUOrderStatus() {
        return this.uOrderStatus;
    }

    public Integer getURecommend() {
        return this.uRecommend;
    }

    public Long getParent() {
        return this.parent;
    }

    public Integer getEnd() {
        return this.end;
    }

    public String getCodeOrName() {
        return this.codeOrName;
    }

    public String getLeftPathFuzzy() {
        return this.leftPathFuzzy;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    public void setShowInFront(Boolean showInFront) {
        this.showInFront = showInFront;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setUOrderStatus(Integer uOrderStatus) {
        this.uOrderStatus = uOrderStatus;
    }

    public void setURecommend(Integer uRecommend) {
        this.uRecommend = uRecommend;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public void setCodeOrName(String codeOrName) {
        this.codeOrName = codeOrName;
    }

    public void setLeftPathFuzzy(String leftPathFuzzy) {
        this.leftPathFuzzy = leftPathFuzzy;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PresentationClassQryDTO)) {
            return false;
        }
        PresentationClassQryDTO other = (PresentationClassQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Boolean this$showInFront = this.getShowInFront();
        Boolean other$showInFront = other.getShowInFront();
        if (this$showInFront == null ? other$showInFront != null : !((Object)this$showInFront).equals(other$showInFront)) {
            return false;
        }
        Integer this$level = this.getLevel();
        Integer other$level = other.getLevel();
        if (this$level == null ? other$level != null : !((Object)this$level).equals(other$level)) {
            return false;
        }
        Integer this$sort = this.getSort();
        Integer other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !((Object)this$sort).equals(other$sort)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        Integer this$uOrderStatus = this.getUOrderStatus();
        Integer other$uOrderStatus = other.getUOrderStatus();
        if (this$uOrderStatus == null ? other$uOrderStatus != null : !((Object)this$uOrderStatus).equals(other$uOrderStatus)) {
            return false;
        }
        Integer this$uRecommend = this.getURecommend();
        Integer other$uRecommend = other.getURecommend();
        if (this$uRecommend == null ? other$uRecommend != null : !((Object)this$uRecommend).equals(other$uRecommend)) {
            return false;
        }
        Long this$parent = this.getParent();
        Long other$parent = other.getParent();
        if (this$parent == null ? other$parent != null : !((Object)this$parent).equals(other$parent)) {
            return false;
        }
        Integer this$end = this.getEnd();
        Integer other$end = other.getEnd();
        if (this$end == null ? other$end != null : !((Object)this$end).equals(other$end)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getFields(), other.getFields())) {
            return false;
        }
        List<Long> this$idList = this.getIdList();
        List<Long> other$idList = other.getIdList();
        if (this$idList == null ? other$idList != null : !((Object)this$idList).equals(other$idList)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$codeOrName = this.getCodeOrName();
        String other$codeOrName = other.getCodeOrName();
        if (this$codeOrName == null ? other$codeOrName != null : !this$codeOrName.equals(other$codeOrName)) {
            return false;
        }
        String this$leftPathFuzzy = this.getLeftPathFuzzy();
        String other$leftPathFuzzy = other.getLeftPathFuzzy();
        return !(this$leftPathFuzzy == null ? other$leftPathFuzzy != null : !this$leftPathFuzzy.equals(other$leftPathFuzzy));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PresentationClassQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Boolean $showInFront = this.getShowInFront();
        result = result * 59 + ($showInFront == null ? 43 : ((Object)$showInFront).hashCode());
        Integer $level = this.getLevel();
        result = result * 59 + ($level == null ? 43 : ((Object)$level).hashCode());
        Integer $sort = this.getSort();
        result = result * 59 + ($sort == null ? 43 : ((Object)$sort).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Integer $uOrderStatus = this.getUOrderStatus();
        result = result * 59 + ($uOrderStatus == null ? 43 : ((Object)$uOrderStatus).hashCode());
        Integer $uRecommend = this.getURecommend();
        result = result * 59 + ($uRecommend == null ? 43 : ((Object)$uRecommend).hashCode());
        Long $parent = this.getParent();
        result = result * 59 + ($parent == null ? 43 : ((Object)$parent).hashCode());
        Integer $end = this.getEnd();
        result = result * 59 + ($end == null ? 43 : ((Object)$end).hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getFields());
        List<Long> $idList = this.getIdList();
        result = result * 59 + ($idList == null ? 43 : ((Object)$idList).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $codeOrName = this.getCodeOrName();
        result = result * 59 + ($codeOrName == null ? 43 : $codeOrName.hashCode());
        String $leftPathFuzzy = this.getLeftPathFuzzy();
        result = result * 59 + ($leftPathFuzzy == null ? 43 : $leftPathFuzzy.hashCode());
        return result;
    }

    public String toString() {
        return "PresentationClassQryDTO(fields=" + Arrays.deepToString(this.getFields()) + ", id=" + this.getId() + ", idList=" + this.getIdList() + ", showInFront=" + this.getShowInFront() + ", level=" + this.getLevel() + ", code=" + this.getCode() + ", name=" + this.getName() + ", sort=" + this.getSort() + ", stopStatus=" + this.getStopStatus() + ", uOrderStatus=" + this.getUOrderStatus() + ", uRecommend=" + this.getURecommend() + ", parent=" + this.getParent() + ", end=" + this.getEnd() + ", codeOrName=" + this.getCodeOrName() + ", leftPathFuzzy=" + this.getLeftPathFuzzy() + ")";
    }
}

