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

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MaterialClassDTO
implements Serializable {
    private Long id;
    private String code;
    private String name;
    private Long parent;
    private Integer level;
    private Integer isEnd;
    private Integer sort;
    private Long productClass;
    private String productClassCode;
    private String productClassName;
    private String path;
    private String erpCode;
    private String remark;
    private String tenantCenter;
    private String tenantId;
    private Long template;
    private String templateCode;
    private String templateName;
    private Long orgId;
    private String orgIdName;
    private String productCount;
    private Boolean stopStatus;

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public Long getParent() {
        return this.parent;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Integer getIsEnd() {
        return this.isEnd;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Long getProductClass() {
        return this.productClass;
    }

    public String getProductClassCode() {
        return this.productClassCode;
    }

    public String getProductClassName() {
        return this.productClassName;
    }

    public String getPath() {
        return this.path;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getTenantCenter() {
        return this.tenantCenter;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public Long getTemplate() {
        return this.template;
    }

    public String getTemplateCode() {
        return this.templateCode;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public Long getOrgId() {
        return this.orgId;
    }

    public String getOrgIdName() {
        return this.orgIdName;
    }

    public String getProductCount() {
        return this.productCount;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
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

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setIsEnd(Integer isEnd) {
        this.isEnd = isEnd;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public void setProductClass(Long productClass) {
        this.productClass = productClass;
    }

    public void setProductClassCode(String productClassCode) {
        this.productClassCode = productClassCode;
    }

    public void setProductClassName(String productClassName) {
        this.productClassName = productClassName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setTenantCenter(String tenantCenter) {
        this.tenantCenter = tenantCenter;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public void setTemplate(Long template) {
        this.template = template;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public void setOrgIdName(String orgIdName) {
        this.orgIdName = orgIdName;
    }

    public void setProductCount(String productCount) {
        this.productCount = productCount;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MaterialClassDTO)) {
            return false;
        }
        MaterialClassDTO other = (MaterialClassDTO)o;
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
        Integer this$sort = this.getSort();
        Integer other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !((Object)this$sort).equals(other$sort)) {
            return false;
        }
        Long this$productClass = this.getProductClass();
        Long other$productClass = other.getProductClass();
        if (this$productClass == null ? other$productClass != null : !((Object)this$productClass).equals(other$productClass)) {
            return false;
        }
        Long this$template = this.getTemplate();
        Long other$template = other.getTemplate();
        if (this$template == null ? other$template != null : !((Object)this$template).equals(other$template)) {
            return false;
        }
        Long this$orgId = this.getOrgId();
        Long other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !((Object)this$orgId).equals(other$orgId)) {
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
        String this$productClassCode = this.getProductClassCode();
        String other$productClassCode = other.getProductClassCode();
        if (this$productClassCode == null ? other$productClassCode != null : !this$productClassCode.equals(other$productClassCode)) {
            return false;
        }
        String this$productClassName = this.getProductClassName();
        String other$productClassName = other.getProductClassName();
        if (this$productClassName == null ? other$productClassName != null : !this$productClassName.equals(other$productClassName)) {
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
        String this$remark = this.getRemark();
        String other$remark = other.getRemark();
        if (this$remark == null ? other$remark != null : !this$remark.equals(other$remark)) {
            return false;
        }
        String this$tenantCenter = this.getTenantCenter();
        String other$tenantCenter = other.getTenantCenter();
        if (this$tenantCenter == null ? other$tenantCenter != null : !this$tenantCenter.equals(other$tenantCenter)) {
            return false;
        }
        String this$tenantId = this.getTenantId();
        String other$tenantId = other.getTenantId();
        if (this$tenantId == null ? other$tenantId != null : !this$tenantId.equals(other$tenantId)) {
            return false;
        }
        String this$templateCode = this.getTemplateCode();
        String other$templateCode = other.getTemplateCode();
        if (this$templateCode == null ? other$templateCode != null : !this$templateCode.equals(other$templateCode)) {
            return false;
        }
        String this$templateName = this.getTemplateName();
        String other$templateName = other.getTemplateName();
        if (this$templateName == null ? other$templateName != null : !this$templateName.equals(other$templateName)) {
            return false;
        }
        String this$orgIdName = this.getOrgIdName();
        String other$orgIdName = other.getOrgIdName();
        if (this$orgIdName == null ? other$orgIdName != null : !this$orgIdName.equals(other$orgIdName)) {
            return false;
        }
        String this$productCount = this.getProductCount();
        String other$productCount = other.getProductCount();
        return !(this$productCount == null ? other$productCount != null : !this$productCount.equals(other$productCount));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MaterialClassDTO;
    }

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
        Integer $sort = this.getSort();
        result = result * 59 + ($sort == null ? 43 : ((Object)$sort).hashCode());
        Long $productClass = this.getProductClass();
        result = result * 59 + ($productClass == null ? 43 : ((Object)$productClass).hashCode());
        Long $template = this.getTemplate();
        result = result * 59 + ($template == null ? 43 : ((Object)$template).hashCode());
        Long $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : ((Object)$orgId).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $productClassCode = this.getProductClassCode();
        result = result * 59 + ($productClassCode == null ? 43 : $productClassCode.hashCode());
        String $productClassName = this.getProductClassName();
        result = result * 59 + ($productClassName == null ? 43 : $productClassName.hashCode());
        String $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        String $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        String $tenantCenter = this.getTenantCenter();
        result = result * 59 + ($tenantCenter == null ? 43 : $tenantCenter.hashCode());
        String $tenantId = this.getTenantId();
        result = result * 59 + ($tenantId == null ? 43 : $tenantId.hashCode());
        String $templateCode = this.getTemplateCode();
        result = result * 59 + ($templateCode == null ? 43 : $templateCode.hashCode());
        String $templateName = this.getTemplateName();
        result = result * 59 + ($templateName == null ? 43 : $templateName.hashCode());
        String $orgIdName = this.getOrgIdName();
        result = result * 59 + ($orgIdName == null ? 43 : $orgIdName.hashCode());
        String $productCount = this.getProductCount();
        result = result * 59 + ($productCount == null ? 43 : $productCount.hashCode());
        return result;
    }

    public String toString() {
        return "MaterialClassDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", parent=" + this.getParent() + ", level=" + this.getLevel() + ", isEnd=" + this.getIsEnd() + ", sort=" + this.getSort() + ", productClass=" + this.getProductClass() + ", productClassCode=" + this.getProductClassCode() + ", productClassName=" + this.getProductClassName() + ", path=" + this.getPath() + ", erpCode=" + this.getErpCode() + ", remark=" + this.getRemark() + ", tenantCenter=" + this.getTenantCenter() + ", tenantId=" + this.getTenantId() + ", template=" + this.getTemplate() + ", templateCode=" + this.getTemplateCode() + ", templateName=" + this.getTemplateName() + ", orgId=" + this.getOrgId() + ", orgIdName=" + this.getOrgIdName() + ", productCount=" + this.getProductCount() + ", stopStatus=" + this.getStopStatus() + ")";
    }
}

