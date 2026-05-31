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
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import java.io.Serializable;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class PresentationClassDTO
extends CoredocBaseDTO
implements Serializable {
    private Long id;
    private String code;
    private MultilingualVO name;
    private Long parent;
    private String parentCode;
    private String parentName;
    private Integer level;
    private Integer order;
    private Long manageClass;
    private String manageClassCode;
    private String manageClassName;
    private Long template;
    private String templateName;
    private String path;
    private MultilingualVO remark;
    private Boolean stopStatus;
    private Boolean isRecommend;
    private Boolean isURecommend;
    private Boolean showInFront;
    private Boolean showInTouchpad;
    private Boolean orderStatus;
    private MultilingualVO shareDescription;
    private MultilingualVO pageTitle;
    private MultilingualVO seoKeyword;
    private MultilingualVO seoDescription;
    private String image;
    private String adImage;
    private String pubts;
    private String erpCode;
    private Map<String, Object> presentationClassCharacter;

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

    public Integer getOrder() {
        return this.order;
    }

    public Long getManageClass() {
        return this.manageClass;
    }

    public String getManageClassCode() {
        return this.manageClassCode;
    }

    public String getManageClassName() {
        return this.manageClassName;
    }

    public Long getTemplate() {
        return this.template;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public String getPath() {
        return this.path;
    }

    public MultilingualVO getRemark() {
        return this.remark;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public Boolean getIsRecommend() {
        return this.isRecommend;
    }

    public Boolean getIsURecommend() {
        return this.isURecommend;
    }

    public Boolean getShowInFront() {
        return this.showInFront;
    }

    public Boolean getShowInTouchpad() {
        return this.showInTouchpad;
    }

    public Boolean getOrderStatus() {
        return this.orderStatus;
    }

    public MultilingualVO getShareDescription() {
        return this.shareDescription;
    }

    public MultilingualVO getPageTitle() {
        return this.pageTitle;
    }

    public MultilingualVO getSeoKeyword() {
        return this.seoKeyword;
    }

    public MultilingualVO getSeoDescription() {
        return this.seoDescription;
    }

    public String getImage() {
        return this.image;
    }

    public String getAdImage() {
        return this.adImage;
    }

    public String getPubts() {
        return this.pubts;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public Map<String, Object> getPresentationClassCharacter() {
        return this.presentationClassCharacter;
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

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setManageClass(Long manageClass) {
        this.manageClass = manageClass;
    }

    public void setManageClassCode(String manageClassCode) {
        this.manageClassCode = manageClassCode;
    }

    public void setManageClassName(String manageClassName) {
        this.manageClassName = manageClassName;
    }

    public void setTemplate(Long template) {
        this.template = template;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setRemark(MultilingualVO remark) {
        this.remark = remark;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setIsRecommend(Boolean isRecommend) {
        this.isRecommend = isRecommend;
    }

    public void setIsURecommend(Boolean isURecommend) {
        this.isURecommend = isURecommend;
    }

    public void setShowInFront(Boolean showInFront) {
        this.showInFront = showInFront;
    }

    public void setShowInTouchpad(Boolean showInTouchpad) {
        this.showInTouchpad = showInTouchpad;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setShareDescription(MultilingualVO shareDescription) {
        this.shareDescription = shareDescription;
    }

    public void setPageTitle(MultilingualVO pageTitle) {
        this.pageTitle = pageTitle;
    }

    public void setSeoKeyword(MultilingualVO seoKeyword) {
        this.seoKeyword = seoKeyword;
    }

    public void setSeoDescription(MultilingualVO seoDescription) {
        this.seoDescription = seoDescription;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setAdImage(String adImage) {
        this.adImage = adImage;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setPresentationClassCharacter(Map<String, Object> presentationClassCharacter) {
        this.presentationClassCharacter = presentationClassCharacter;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PresentationClassDTO)) {
            return false;
        }
        PresentationClassDTO other = (PresentationClassDTO)o;
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
        Long this$manageClass = this.getManageClass();
        Long other$manageClass = other.getManageClass();
        if (this$manageClass == null ? other$manageClass != null : !((Object)this$manageClass).equals(other$manageClass)) {
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
        Boolean this$isRecommend = this.getIsRecommend();
        Boolean other$isRecommend = other.getIsRecommend();
        if (this$isRecommend == null ? other$isRecommend != null : !((Object)this$isRecommend).equals(other$isRecommend)) {
            return false;
        }
        Boolean this$isURecommend = this.getIsURecommend();
        Boolean other$isURecommend = other.getIsURecommend();
        if (this$isURecommend == null ? other$isURecommend != null : !((Object)this$isURecommend).equals(other$isURecommend)) {
            return false;
        }
        Boolean this$showInFront = this.getShowInFront();
        Boolean other$showInFront = other.getShowInFront();
        if (this$showInFront == null ? other$showInFront != null : !((Object)this$showInFront).equals(other$showInFront)) {
            return false;
        }
        Boolean this$showInTouchpad = this.getShowInTouchpad();
        Boolean other$showInTouchpad = other.getShowInTouchpad();
        if (this$showInTouchpad == null ? other$showInTouchpad != null : !((Object)this$showInTouchpad).equals(other$showInTouchpad)) {
            return false;
        }
        Boolean this$orderStatus = this.getOrderStatus();
        Boolean other$orderStatus = other.getOrderStatus();
        if (this$orderStatus == null ? other$orderStatus != null : !((Object)this$orderStatus).equals(other$orderStatus)) {
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
        String this$manageClassCode = this.getManageClassCode();
        String other$manageClassCode = other.getManageClassCode();
        if (this$manageClassCode == null ? other$manageClassCode != null : !this$manageClassCode.equals(other$manageClassCode)) {
            return false;
        }
        String this$manageClassName = this.getManageClassName();
        String other$manageClassName = other.getManageClassName();
        if (this$manageClassName == null ? other$manageClassName != null : !this$manageClassName.equals(other$manageClassName)) {
            return false;
        }
        String this$templateName = this.getTemplateName();
        String other$templateName = other.getTemplateName();
        if (this$templateName == null ? other$templateName != null : !this$templateName.equals(other$templateName)) {
            return false;
        }
        String this$path = this.getPath();
        String other$path = other.getPath();
        if (this$path == null ? other$path != null : !this$path.equals(other$path)) {
            return false;
        }
        MultilingualVO this$remark = this.getRemark();
        MultilingualVO other$remark = other.getRemark();
        if (this$remark == null ? other$remark != null : !((Object)this$remark).equals(other$remark)) {
            return false;
        }
        MultilingualVO this$shareDescription = this.getShareDescription();
        MultilingualVO other$shareDescription = other.getShareDescription();
        if (this$shareDescription == null ? other$shareDescription != null : !((Object)this$shareDescription).equals(other$shareDescription)) {
            return false;
        }
        MultilingualVO this$pageTitle = this.getPageTitle();
        MultilingualVO other$pageTitle = other.getPageTitle();
        if (this$pageTitle == null ? other$pageTitle != null : !((Object)this$pageTitle).equals(other$pageTitle)) {
            return false;
        }
        MultilingualVO this$seoKeyword = this.getSeoKeyword();
        MultilingualVO other$seoKeyword = other.getSeoKeyword();
        if (this$seoKeyword == null ? other$seoKeyword != null : !((Object)this$seoKeyword).equals(other$seoKeyword)) {
            return false;
        }
        MultilingualVO this$seoDescription = this.getSeoDescription();
        MultilingualVO other$seoDescription = other.getSeoDescription();
        if (this$seoDescription == null ? other$seoDescription != null : !((Object)this$seoDescription).equals(other$seoDescription)) {
            return false;
        }
        String this$image = this.getImage();
        String other$image = other.getImage();
        if (this$image == null ? other$image != null : !this$image.equals(other$image)) {
            return false;
        }
        String this$adImage = this.getAdImage();
        String other$adImage = other.getAdImage();
        if (this$adImage == null ? other$adImage != null : !this$adImage.equals(other$adImage)) {
            return false;
        }
        String this$pubts = this.getPubts();
        String other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !this$pubts.equals(other$pubts)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        Map<String, Object> this$presentationClassCharacter = this.getPresentationClassCharacter();
        Map<String, Object> other$presentationClassCharacter = other.getPresentationClassCharacter();
        return !(this$presentationClassCharacter == null ? other$presentationClassCharacter != null : !((Object)this$presentationClassCharacter).equals(other$presentationClassCharacter));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof PresentationClassDTO;
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
        Long $manageClass = this.getManageClass();
        result = result * 59 + ($manageClass == null ? 43 : ((Object)$manageClass).hashCode());
        Long $template = this.getTemplate();
        result = result * 59 + ($template == null ? 43 : ((Object)$template).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Boolean $isRecommend = this.getIsRecommend();
        result = result * 59 + ($isRecommend == null ? 43 : ((Object)$isRecommend).hashCode());
        Boolean $isURecommend = this.getIsURecommend();
        result = result * 59 + ($isURecommend == null ? 43 : ((Object)$isURecommend).hashCode());
        Boolean $showInFront = this.getShowInFront();
        result = result * 59 + ($showInFront == null ? 43 : ((Object)$showInFront).hashCode());
        Boolean $showInTouchpad = this.getShowInTouchpad();
        result = result * 59 + ($showInTouchpad == null ? 43 : ((Object)$showInTouchpad).hashCode());
        Boolean $orderStatus = this.getOrderStatus();
        result = result * 59 + ($orderStatus == null ? 43 : ((Object)$orderStatus).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        MultilingualVO $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $parentCode = this.getParentCode();
        result = result * 59 + ($parentCode == null ? 43 : $parentCode.hashCode());
        String $parentName = this.getParentName();
        result = result * 59 + ($parentName == null ? 43 : $parentName.hashCode());
        String $manageClassCode = this.getManageClassCode();
        result = result * 59 + ($manageClassCode == null ? 43 : $manageClassCode.hashCode());
        String $manageClassName = this.getManageClassName();
        result = result * 59 + ($manageClassName == null ? 43 : $manageClassName.hashCode());
        String $templateName = this.getTemplateName();
        result = result * 59 + ($templateName == null ? 43 : $templateName.hashCode());
        String $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        MultilingualVO $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        MultilingualVO $shareDescription = this.getShareDescription();
        result = result * 59 + ($shareDescription == null ? 43 : $shareDescription.hashCode());
        MultilingualVO $pageTitle = this.getPageTitle();
        result = result * 59 + ($pageTitle == null ? 43 : $pageTitle.hashCode());
        MultilingualVO $seoKeyword = this.getSeoKeyword();
        result = result * 59 + ($seoKeyword == null ? 43 : $seoKeyword.hashCode());
        MultilingualVO $seoDescription = this.getSeoDescription();
        result = result * 59 + ($seoDescription == null ? 43 : $seoDescription.hashCode());
        String $image = this.getImage();
        result = result * 59 + ($image == null ? 43 : $image.hashCode());
        String $adImage = this.getAdImage();
        result = result * 59 + ($adImage == null ? 43 : $adImage.hashCode());
        String $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : $pubts.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        Map<String, Object> $presentationClassCharacter = this.getPresentationClassCharacter();
        result = result * 59 + ($presentationClassCharacter == null ? 43 : ((Object)$presentationClassCharacter).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "PresentationClassDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", parent=" + this.getParent() + ", parentCode=" + this.getParentCode() + ", parentName=" + this.getParentName() + ", level=" + this.getLevel() + ", order=" + this.getOrder() + ", manageClass=" + this.getManageClass() + ", manageClassCode=" + this.getManageClassCode() + ", manageClassName=" + this.getManageClassName() + ", template=" + this.getTemplate() + ", templateName=" + this.getTemplateName() + ", path=" + this.getPath() + ", remark=" + this.getRemark() + ", stopStatus=" + this.getStopStatus() + ", isRecommend=" + this.getIsRecommend() + ", isURecommend=" + this.getIsURecommend() + ", showInFront=" + this.getShowInFront() + ", showInTouchpad=" + this.getShowInTouchpad() + ", orderStatus=" + this.getOrderStatus() + ", shareDescription=" + this.getShareDescription() + ", pageTitle=" + this.getPageTitle() + ", seoKeyword=" + this.getSeoKeyword() + ", seoDescription=" + this.getSeoDescription() + ", image=" + this.getImage() + ", adImage=" + this.getAdImage() + ", pubts=" + this.getPubts() + ", erpCode=" + this.getErpCode() + ", presentationClassCharacter=" + this.getPresentationClassCharacter() + ")";
    }
}

