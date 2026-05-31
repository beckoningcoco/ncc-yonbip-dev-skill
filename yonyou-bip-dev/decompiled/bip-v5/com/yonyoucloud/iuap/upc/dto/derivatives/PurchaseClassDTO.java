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
import java.io.Serializable;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class PurchaseClassDTO
extends CoredocBaseDTO
implements Serializable {
    private Long id;
    private String code;
    private String name;
    private String orgId;
    private String orgName;
    private String orgCode;
    private String categoryManager;
    private String categoryManagerCode;
    private String categoryGrade;
    private String categoryGradeCode;
    private Long parent;
    private String parentCode;
    private String parentName;
    private Integer level;
    private Integer order;
    private String path;
    private Boolean stopStatus;
    private String pubts;
    private Map<String, Object> purchaseClassCharacter;

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getOrgName() {
        return this.orgName;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public String getCategoryManager() {
        return this.categoryManager;
    }

    public String getCategoryManagerCode() {
        return this.categoryManagerCode;
    }

    public String getCategoryGrade() {
        return this.categoryGrade;
    }

    public String getCategoryGradeCode() {
        return this.categoryGradeCode;
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

    public Integer getOrder() {
        return this.order;
    }

    public String getPath() {
        return this.path;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public String getPubts() {
        return this.pubts;
    }

    public Map<String, Object> getPurchaseClassCharacter() {
        return this.purchaseClassCharacter;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public void setCategoryManager(String categoryManager) {
        this.categoryManager = categoryManager;
    }

    public void setCategoryManagerCode(String categoryManagerCode) {
        this.categoryManagerCode = categoryManagerCode;
    }

    public void setCategoryGrade(String categoryGrade) {
        this.categoryGrade = categoryGrade;
    }

    public void setCategoryGradeCode(String categoryGradeCode) {
        this.categoryGradeCode = categoryGradeCode;
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

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public void setPurchaseClassCharacter(Map<String, Object> purchaseClassCharacter) {
        this.purchaseClassCharacter = purchaseClassCharacter;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PurchaseClassDTO)) {
            return false;
        }
        PurchaseClassDTO other = (PurchaseClassDTO)o;
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
        Integer this$order = this.getOrder();
        Integer other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
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
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$orgName = this.getOrgName();
        String other$orgName = other.getOrgName();
        if (this$orgName == null ? other$orgName != null : !this$orgName.equals(other$orgName)) {
            return false;
        }
        String this$orgCode = this.getOrgCode();
        String other$orgCode = other.getOrgCode();
        if (this$orgCode == null ? other$orgCode != null : !this$orgCode.equals(other$orgCode)) {
            return false;
        }
        String this$categoryManager = this.getCategoryManager();
        String other$categoryManager = other.getCategoryManager();
        if (this$categoryManager == null ? other$categoryManager != null : !this$categoryManager.equals(other$categoryManager)) {
            return false;
        }
        String this$categoryManagerCode = this.getCategoryManagerCode();
        String other$categoryManagerCode = other.getCategoryManagerCode();
        if (this$categoryManagerCode == null ? other$categoryManagerCode != null : !this$categoryManagerCode.equals(other$categoryManagerCode)) {
            return false;
        }
        String this$categoryGrade = this.getCategoryGrade();
        String other$categoryGrade = other.getCategoryGrade();
        if (this$categoryGrade == null ? other$categoryGrade != null : !this$categoryGrade.equals(other$categoryGrade)) {
            return false;
        }
        String this$categoryGradeCode = this.getCategoryGradeCode();
        String other$categoryGradeCode = other.getCategoryGradeCode();
        if (this$categoryGradeCode == null ? other$categoryGradeCode != null : !this$categoryGradeCode.equals(other$categoryGradeCode)) {
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
        String this$path = this.getPath();
        String other$path = other.getPath();
        if (this$path == null ? other$path != null : !this$path.equals(other$path)) {
            return false;
        }
        String this$pubts = this.getPubts();
        String other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !this$pubts.equals(other$pubts)) {
            return false;
        }
        Map<String, Object> this$purchaseClassCharacter = this.getPurchaseClassCharacter();
        Map<String, Object> other$purchaseClassCharacter = other.getPurchaseClassCharacter();
        return !(this$purchaseClassCharacter == null ? other$purchaseClassCharacter != null : !((Object)this$purchaseClassCharacter).equals(other$purchaseClassCharacter));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof PurchaseClassDTO;
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
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $orgName = this.getOrgName();
        result = result * 59 + ($orgName == null ? 43 : $orgName.hashCode());
        String $orgCode = this.getOrgCode();
        result = result * 59 + ($orgCode == null ? 43 : $orgCode.hashCode());
        String $categoryManager = this.getCategoryManager();
        result = result * 59 + ($categoryManager == null ? 43 : $categoryManager.hashCode());
        String $categoryManagerCode = this.getCategoryManagerCode();
        result = result * 59 + ($categoryManagerCode == null ? 43 : $categoryManagerCode.hashCode());
        String $categoryGrade = this.getCategoryGrade();
        result = result * 59 + ($categoryGrade == null ? 43 : $categoryGrade.hashCode());
        String $categoryGradeCode = this.getCategoryGradeCode();
        result = result * 59 + ($categoryGradeCode == null ? 43 : $categoryGradeCode.hashCode());
        String $parentCode = this.getParentCode();
        result = result * 59 + ($parentCode == null ? 43 : $parentCode.hashCode());
        String $parentName = this.getParentName();
        result = result * 59 + ($parentName == null ? 43 : $parentName.hashCode());
        String $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        String $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : $pubts.hashCode());
        Map<String, Object> $purchaseClassCharacter = this.getPurchaseClassCharacter();
        result = result * 59 + ($purchaseClassCharacter == null ? 43 : ((Object)$purchaseClassCharacter).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "PurchaseClassDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", orgId=" + this.getOrgId() + ", orgName=" + this.getOrgName() + ", orgCode=" + this.getOrgCode() + ", categoryManager=" + this.getCategoryManager() + ", categoryManagerCode=" + this.getCategoryManagerCode() + ", categoryGrade=" + this.getCategoryGrade() + ", categoryGradeCode=" + this.getCategoryGradeCode() + ", parent=" + this.getParent() + ", parentCode=" + this.getParentCode() + ", parentName=" + this.getParentName() + ", level=" + this.getLevel() + ", order=" + this.getOrder() + ", path=" + this.getPath() + ", stopStatus=" + this.getStopStatus() + ", pubts=" + this.getPubts() + ", purchaseClassCharacter=" + this.getPurchaseClassCharacter() + ")";
    }
}

