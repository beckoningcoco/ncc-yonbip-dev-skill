/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.custcategory;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import java.io.Serializable;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class CustCategoryIPassSaveRequest
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String code;
    private MultilingualVO name;
    private String parentCode;
    private String orgCode;
    private Integer order;
    private Boolean isEnabled;
    private MultilingualVO comment;
    private Map<String, Object> custCategoryCharacter;
    private String sourceUnique;

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public MultilingualVO getName() {
        return this.name;
    }

    public String getParentCode() {
        return this.parentCode;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public Integer getOrder() {
        return this.order;
    }

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public MultilingualVO getComment() {
        return this.comment;
    }

    public Map<String, Object> getCustCategoryCharacter() {
        return this.custCategoryCharacter;
    }

    public String getSourceUnique() {
        return this.sourceUnique;
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

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public void setComment(MultilingualVO comment) {
        this.comment = comment;
    }

    public void setCustCategoryCharacter(Map<String, Object> custCategoryCharacter) {
        this.custCategoryCharacter = custCategoryCharacter;
    }

    public void setSourceUnique(String sourceUnique) {
        this.sourceUnique = sourceUnique;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CustCategoryIPassSaveRequest)) {
            return false;
        }
        CustCategoryIPassSaveRequest other = (CustCategoryIPassSaveRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
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
        String this$orgCode = this.getOrgCode();
        String other$orgCode = other.getOrgCode();
        if (this$orgCode == null ? other$orgCode != null : !this$orgCode.equals(other$orgCode)) {
            return false;
        }
        MultilingualVO this$comment = this.getComment();
        MultilingualVO other$comment = other.getComment();
        if (this$comment == null ? other$comment != null : !((Object)this$comment).equals(other$comment)) {
            return false;
        }
        Map<String, Object> this$custCategoryCharacter = this.getCustCategoryCharacter();
        Map<String, Object> other$custCategoryCharacter = other.getCustCategoryCharacter();
        if (this$custCategoryCharacter == null ? other$custCategoryCharacter != null : !((Object)this$custCategoryCharacter).equals(other$custCategoryCharacter)) {
            return false;
        }
        String this$sourceUnique = this.getSourceUnique();
        String other$sourceUnique = other.getSourceUnique();
        return !(this$sourceUnique == null ? other$sourceUnique != null : !this$sourceUnique.equals(other$sourceUnique));
    }

    protected boolean canEqual(Object other) {
        return other instanceof CustCategoryIPassSaveRequest;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
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
        String $orgCode = this.getOrgCode();
        result = result * 59 + ($orgCode == null ? 43 : $orgCode.hashCode());
        MultilingualVO $comment = this.getComment();
        result = result * 59 + ($comment == null ? 43 : $comment.hashCode());
        Map<String, Object> $custCategoryCharacter = this.getCustCategoryCharacter();
        result = result * 59 + ($custCategoryCharacter == null ? 43 : ((Object)$custCategoryCharacter).hashCode());
        String $sourceUnique = this.getSourceUnique();
        result = result * 59 + ($sourceUnique == null ? 43 : $sourceUnique.hashCode());
        return result;
    }

    public String toString() {
        return "CustCategoryIPassSaveRequest(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", parentCode=" + this.getParentCode() + ", orgCode=" + this.getOrgCode() + ", order=" + this.getOrder() + ", isEnabled=" + this.getIsEnabled() + ", comment=" + this.getComment() + ", custCategoryCharacter=" + this.getCustCategoryCharacter() + ", sourceUnique=" + this.getSourceUnique() + ")";
    }
}

