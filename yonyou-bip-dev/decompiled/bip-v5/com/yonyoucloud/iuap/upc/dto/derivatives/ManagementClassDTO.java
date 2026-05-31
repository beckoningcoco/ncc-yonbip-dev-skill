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
public class ManagementClassDTO
extends CoredocBaseDTO
implements Serializable {
    private Long id;
    private String code;
    private MultilingualVO name;
    private Long parent;
    private String parentCode;
    private String parentName;
    private MultilingualVO parentName_multilang;
    private Integer level;
    private Integer order;
    private Long productClass;
    private String productClassCode;
    private String productClassName;
    private MultilingualVO productClassName_multilang;
    private Long template;
    private String templateName;
    private MultilingualVO templateName_multilang;
    private String orgId;
    private String orgCode;
    private String orgName;
    private MultilingualVO orgName_multilang;
    private String path;
    private String erpCode;
    private MultilingualVO remark;
    private Boolean stopStatus;
    private String pubts;
    private List<ApplyRangeGroupDTO> orgGroups;
    private Map<String, Object> managementClassCharacter;
    private Integer updateStrategy;
    private List<Long> brandIdList;

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

    public MultilingualVO getParentName_multilang() {
        return this.parentName_multilang;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Integer getOrder() {
        return this.order;
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

    public MultilingualVO getProductClassName_multilang() {
        return this.productClassName_multilang;
    }

    public Long getTemplate() {
        return this.template;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public MultilingualVO getTemplateName_multilang() {
        return this.templateName_multilang;
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

    public MultilingualVO getOrgName_multilang() {
        return this.orgName_multilang;
    }

    public String getPath() {
        return this.path;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public MultilingualVO getRemark() {
        return this.remark;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public String getPubts() {
        return this.pubts;
    }

    public List<ApplyRangeGroupDTO> getOrgGroups() {
        return this.orgGroups;
    }

    public Map<String, Object> getManagementClassCharacter() {
        return this.managementClassCharacter;
    }

    public Integer getUpdateStrategy() {
        return this.updateStrategy;
    }

    public List<Long> getBrandIdList() {
        return this.brandIdList;
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

    public void setParentName_multilang(MultilingualVO parentName_multilang) {
        this.parentName_multilang = parentName_multilang;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setOrder(Integer order) {
        this.order = order;
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

    public void setProductClassName_multilang(MultilingualVO productClassName_multilang) {
        this.productClassName_multilang = productClassName_multilang;
    }

    public void setTemplate(Long template) {
        this.template = template;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public void setTemplateName_multilang(MultilingualVO templateName_multilang) {
        this.templateName_multilang = templateName_multilang;
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

    public void setOrgName_multilang(MultilingualVO orgName_multilang) {
        this.orgName_multilang = orgName_multilang;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setRemark(MultilingualVO remark) {
        this.remark = remark;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public void setOrgGroups(List<ApplyRangeGroupDTO> orgGroups) {
        this.orgGroups = orgGroups;
    }

    public void setManagementClassCharacter(Map<String, Object> managementClassCharacter) {
        this.managementClassCharacter = managementClassCharacter;
    }

    public void setUpdateStrategy(Integer updateStrategy) {
        this.updateStrategy = updateStrategy;
    }

    public void setBrandIdList(List<Long> brandIdList) {
        this.brandIdList = brandIdList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ManagementClassDTO)) {
            return false;
        }
        ManagementClassDTO other = (ManagementClassDTO)o;
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
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        Integer this$updateStrategy = this.getUpdateStrategy();
        Integer other$updateStrategy = other.getUpdateStrategy();
        if (this$updateStrategy == null ? other$updateStrategy != null : !((Object)this$updateStrategy).equals(other$updateStrategy)) {
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
        MultilingualVO this$parentName_multilang = this.getParentName_multilang();
        MultilingualVO other$parentName_multilang = other.getParentName_multilang();
        if (this$parentName_multilang == null ? other$parentName_multilang != null : !((Object)this$parentName_multilang).equals(other$parentName_multilang)) {
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
        MultilingualVO this$productClassName_multilang = this.getProductClassName_multilang();
        MultilingualVO other$productClassName_multilang = other.getProductClassName_multilang();
        if (this$productClassName_multilang == null ? other$productClassName_multilang != null : !((Object)this$productClassName_multilang).equals(other$productClassName_multilang)) {
            return false;
        }
        String this$templateName = this.getTemplateName();
        String other$templateName = other.getTemplateName();
        if (this$templateName == null ? other$templateName != null : !this$templateName.equals(other$templateName)) {
            return false;
        }
        MultilingualVO this$templateName_multilang = this.getTemplateName_multilang();
        MultilingualVO other$templateName_multilang = other.getTemplateName_multilang();
        if (this$templateName_multilang == null ? other$templateName_multilang != null : !((Object)this$templateName_multilang).equals(other$templateName_multilang)) {
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
        MultilingualVO this$orgName_multilang = this.getOrgName_multilang();
        MultilingualVO other$orgName_multilang = other.getOrgName_multilang();
        if (this$orgName_multilang == null ? other$orgName_multilang != null : !((Object)this$orgName_multilang).equals(other$orgName_multilang)) {
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
        MultilingualVO this$remark = this.getRemark();
        MultilingualVO other$remark = other.getRemark();
        if (this$remark == null ? other$remark != null : !((Object)this$remark).equals(other$remark)) {
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
        Map<String, Object> this$managementClassCharacter = this.getManagementClassCharacter();
        Map<String, Object> other$managementClassCharacter = other.getManagementClassCharacter();
        if (this$managementClassCharacter == null ? other$managementClassCharacter != null : !((Object)this$managementClassCharacter).equals(other$managementClassCharacter)) {
            return false;
        }
        List<Long> this$brandIdList = this.getBrandIdList();
        List<Long> other$brandIdList = other.getBrandIdList();
        return !(this$brandIdList == null ? other$brandIdList != null : !((Object)this$brandIdList).equals(other$brandIdList));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof ManagementClassDTO;
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
        Long $productClass = this.getProductClass();
        result = result * 59 + ($productClass == null ? 43 : ((Object)$productClass).hashCode());
        Long $template = this.getTemplate();
        result = result * 59 + ($template == null ? 43 : ((Object)$template).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Integer $updateStrategy = this.getUpdateStrategy();
        result = result * 59 + ($updateStrategy == null ? 43 : ((Object)$updateStrategy).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        MultilingualVO $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $parentCode = this.getParentCode();
        result = result * 59 + ($parentCode == null ? 43 : $parentCode.hashCode());
        String $parentName = this.getParentName();
        result = result * 59 + ($parentName == null ? 43 : $parentName.hashCode());
        MultilingualVO $parentName_multilang = this.getParentName_multilang();
        result = result * 59 + ($parentName_multilang == null ? 43 : $parentName_multilang.hashCode());
        String $productClassCode = this.getProductClassCode();
        result = result * 59 + ($productClassCode == null ? 43 : $productClassCode.hashCode());
        String $productClassName = this.getProductClassName();
        result = result * 59 + ($productClassName == null ? 43 : $productClassName.hashCode());
        MultilingualVO $productClassName_multilang = this.getProductClassName_multilang();
        result = result * 59 + ($productClassName_multilang == null ? 43 : $productClassName_multilang.hashCode());
        String $templateName = this.getTemplateName();
        result = result * 59 + ($templateName == null ? 43 : $templateName.hashCode());
        MultilingualVO $templateName_multilang = this.getTemplateName_multilang();
        result = result * 59 + ($templateName_multilang == null ? 43 : $templateName_multilang.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $orgCode = this.getOrgCode();
        result = result * 59 + ($orgCode == null ? 43 : $orgCode.hashCode());
        String $orgName = this.getOrgName();
        result = result * 59 + ($orgName == null ? 43 : $orgName.hashCode());
        MultilingualVO $orgName_multilang = this.getOrgName_multilang();
        result = result * 59 + ($orgName_multilang == null ? 43 : $orgName_multilang.hashCode());
        String $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        MultilingualVO $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        String $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : $pubts.hashCode());
        List<ApplyRangeGroupDTO> $orgGroups = this.getOrgGroups();
        result = result * 59 + ($orgGroups == null ? 43 : ((Object)$orgGroups).hashCode());
        Map<String, Object> $managementClassCharacter = this.getManagementClassCharacter();
        result = result * 59 + ($managementClassCharacter == null ? 43 : ((Object)$managementClassCharacter).hashCode());
        List<Long> $brandIdList = this.getBrandIdList();
        result = result * 59 + ($brandIdList == null ? 43 : ((Object)$brandIdList).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ManagementClassDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", parent=" + this.getParent() + ", parentCode=" + this.getParentCode() + ", parentName=" + this.getParentName() + ", parentName_multilang=" + this.getParentName_multilang() + ", level=" + this.getLevel() + ", order=" + this.getOrder() + ", productClass=" + this.getProductClass() + ", productClassCode=" + this.getProductClassCode() + ", productClassName=" + this.getProductClassName() + ", productClassName_multilang=" + this.getProductClassName_multilang() + ", template=" + this.getTemplate() + ", templateName=" + this.getTemplateName() + ", templateName_multilang=" + this.getTemplateName_multilang() + ", orgId=" + this.getOrgId() + ", orgCode=" + this.getOrgCode() + ", orgName=" + this.getOrgName() + ", orgName_multilang=" + this.getOrgName_multilang() + ", path=" + this.getPath() + ", erpCode=" + this.getErpCode() + ", remark=" + this.getRemark() + ", stopStatus=" + this.getStopStatus() + ", pubts=" + this.getPubts() + ", orgGroups=" + this.getOrgGroups() + ", managementClassCharacter=" + this.getManagementClassCharacter() + ", updateStrategy=" + this.getUpdateStrategy() + ", brandIdList=" + this.getBrandIdList() + ")";
    }
}

