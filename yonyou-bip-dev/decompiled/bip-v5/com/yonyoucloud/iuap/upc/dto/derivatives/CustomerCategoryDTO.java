/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.derivatives;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.common.CoredocBaseDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.ApplyRangeGroupDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class CustomerCategoryDTO
extends CoredocBaseDTO
implements Serializable {
    private Long id;
    private String code;
    private MultilingualVO name;
    private Long parent;
    private String parentCode;
    private String parentName;
    private Integer level;
    private Integer isEnd;
    private Integer order;
    private String orgId;
    private String orgCode;
    private String orgName;
    private String path;
    private String erpCode;
    private MultilingualVO comment;
    private Boolean isEnabled;
    private String pubts;
    private List<ApplyRangeGroupDTO> orgGroups;
    private Map<String, Object> custCategoryCharacter;

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public MultilingualVO getName() {
        return this.name;
    }

    public Long getParent() {
        return this.parent;
    }

    public String getParentCode() {
        return this.parentCode;
    }

    public String getParentName() {
        return this.parentName;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Integer getIsEnd() {
        return this.isEnd;
    }

    public Integer getOrder() {
        return this.order;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public String getOrgName() {
        return this.orgName;
    }

    public String getPath() {
        return this.path;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public MultilingualVO getComment() {
        return this.comment;
    }

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public String getPubts() {
        return this.pubts;
    }

    public List<ApplyRangeGroupDTO> getOrgGroups() {
        return this.orgGroups;
    }

    public Map<String, Object> getCustCategoryCharacter() {
        return this.custCategoryCharacter;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(MultilingualVO name) {
        this.name = name;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setIsEnd(Integer isEnd) {
        this.isEnd = isEnd;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setComment(MultilingualVO comment) {
        this.comment = comment;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public void setOrgGroups(List<ApplyRangeGroupDTO> orgGroups) {
        this.orgGroups = orgGroups;
    }

    public void setCustCategoryCharacter(Map<String, Object> custCategoryCharacter) {
        this.custCategoryCharacter = custCategoryCharacter;
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
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$parent = this.getParent();
        Long other$parent = other.getParent();
        if (this$parent == null ? other$parent != null : !((Object)this$parent).equals(other$parent)) {
            return false;
        }
        Integer this$level = this.getLevel();
        Integer other$level = other.getLevel();
        if (this$level == null ? other$level != null : !((Object)this$level).equals(other$level)) {
            return false;
        }
        Integer this$isEnd = this.getIsEnd();
        Integer other$isEnd = other.getIsEnd();
        if (this$isEnd == null ? other$isEnd != null : !((Object)this$isEnd).equals(other$isEnd)) {
            return false;
        }
        Integer this$order = this.getOrder();
        Integer other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        Boolean this$isEnabled = this.getIsEnabled();
        Boolean other$isEnabled = other.getIsEnabled();
        if (this$isEnabled == null ? other$isEnabled != null : !((Object)this$isEnabled).equals(other$isEnabled)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        MultilingualVO this$name = this.getName();
        MultilingualVO other$name = other.getName();
        if (this$name == null ? other$name != null : !((Object)this$name).equals(other$name)) {
            return false;
        }
        String this$parentCode = this.getParentCode();
        String other$parentCode = other.getParentCode();
        if (this$parentCode == null ? other$parentCode != null : !this$parentCode.equals(other$parentCode)) {
            return false;
        }
        String this$parentName = this.getParentName();
        String other$parentName = other.getParentName();
        if (this$parentName == null ? other$parentName != null : !this$parentName.equals(other$parentName)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$orgCode = this.getOrgCode();
        String other$orgCode = other.getOrgCode();
        if (this$orgCode == null ? other$orgCode != null : !this$orgCode.equals(other$orgCode)) {
            return false;
        }
        String this$orgName = this.getOrgName();
        String other$orgName = other.getOrgName();
        if (this$orgName == null ? other$orgName != null : !this$orgName.equals(other$orgName)) {
            return false;
        }
        String this$path = this.getPath();
        String other$path = other.getPath();
        if (this$path == null ? other$path != null : !this$path.equals(other$path)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        MultilingualVO this$comment = this.getComment();
        MultilingualVO other$comment = other.getComment();
        if (this$comment == null ? other$comment != null : !((Object)this$comment).equals(other$comment)) {
            return false;
        }
        String this$pubts = this.getPubts();
        String other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !this$pubts.equals(other$pubts)) {
            return false;
        }
        List<ApplyRangeGroupDTO> this$orgGroups = this.getOrgGroups();
        List<ApplyRangeGroupDTO> other$orgGroups = other.getOrgGroups();
        if (this$orgGroups == null ? other$orgGroups != null : !((Object)this$orgGroups).equals(other$orgGroups)) {
            return false;
        }
        Map<String, Object> this$custCategoryCharacter = this.getCustCategoryCharacter();
        Map<String, Object> other$custCategoryCharacter = other.getCustCategoryCharacter();
        return !(this$custCategoryCharacter == null ? other$custCategoryCharacter != null : !((Object)this$custCategoryCharacter).equals(other$custCategoryCharacter));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof CustomerCategoryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $parent = this.getParent();
        result = result * 59 + ($parent == null ? 43 : ((Object)$parent).hashCode());
        Integer $level = this.getLevel();
        result = result * 59 + ($level == null ? 43 : ((Object)$level).hashCode());
        Integer $isEnd = this.getIsEnd();
        result = result * 59 + ($isEnd == null ? 43 : ((Object)$isEnd).hashCode());
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        Boolean $isEnabled = this.getIsEnabled();
        result = result * 59 + ($isEnabled == null ? 43 : ((Object)$isEnabled).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        MultilingualVO $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $parentCode = this.getParentCode();
        result = result * 59 + ($parentCode == null ? 43 : $parentCode.hashCode());
        String $parentName = this.getParentName();
        result = result * 59 + ($parentName == null ? 43 : $parentName.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $orgCode = this.getOrgCode();
        result = result * 59 + ($orgCode == null ? 43 : $orgCode.hashCode());
        String $orgName = this.getOrgName();
        result = result * 59 + ($orgName == null ? 43 : $orgName.hashCode());
        String $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        MultilingualVO $comment = this.getComment();
        result = result * 59 + ($comment == null ? 43 : $comment.hashCode());
        String $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : $pubts.hashCode());
        List<ApplyRangeGroupDTO> $orgGroups = this.getOrgGroups();
        result = result * 59 + ($orgGroups == null ? 43 : ((Object)$orgGroups).hashCode());
        Map<String, Object> $custCategoryCharacter = this.getCustCategoryCharacter();
        result = result * 59 + ($custCategoryCharacter == null ? 43 : ((Object)$custCategoryCharacter).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "CustomerCategoryDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", parent=" + this.getParent() + ", parentCode=" + this.getParentCode() + ", parentName=" + this.getParentName() + ", level=" + this.getLevel() + ", isEnd=" + this.getIsEnd() + ", order=" + this.getOrder() + ", orgId=" + this.getOrgId() + ", orgCode=" + this.getOrgCode() + ", orgName=" + this.getOrgName() + ", path=" + this.getPath() + ", erpCode=" + this.getErpCode() + ", comment=" + this.getComment() + ", isEnabled=" + this.getIsEnabled() + ", pubts=" + this.getPubts() + ", orgGroups=" + this.getOrgGroups() + ", custCategoryCharacter=" + this.getCustCategoryCharacter() + ")";
    }
}

