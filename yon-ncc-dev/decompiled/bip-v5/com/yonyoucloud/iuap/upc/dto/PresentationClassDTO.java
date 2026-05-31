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
public class PresentationClassDTO
implements Serializable {
    private Long id;
    private String code;
    private String name;
    private Long template;
    private String templateName;
    private Long parent;
    private Integer level;
    private String path;
    private Integer end;
    private String fullPath;
    private Integer order;
    private Boolean showInFront;
    private Integer productCount;
    private Long manageClass;
    private String manageClassCode;
    private String manageClassName;
    private Boolean stopStatus;
    private Integer uOrderStatus;
    private Integer uRecommend;
    private Boolean recommend;
    private Integer showInTouchpad;
    private String image;
    private String adImage;
    private Long firstLevel;
    private Long secondLevel;
    private Long thirdLevel;
    private String pageTitle;

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public Long getTemplate() {
        return this.template;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public Long getParent() {
        return this.parent;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getPath() {
        return this.path;
    }

    public Integer getEnd() {
        return this.end;
    }

    public String getFullPath() {
        return this.fullPath;
    }

    public Integer getOrder() {
        return this.order;
    }

    public Boolean getShowInFront() {
        return this.showInFront;
    }

    public Integer getProductCount() {
        return this.productCount;
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

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public Integer getUOrderStatus() {
        return this.uOrderStatus;
    }

    public Integer getURecommend() {
        return this.uRecommend;
    }

    public Boolean getRecommend() {
        return this.recommend;
    }

    public Integer getShowInTouchpad() {
        return this.showInTouchpad;
    }

    public String getImage() {
        return this.image;
    }

    public String getAdImage() {
        return this.adImage;
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

    public String getPageTitle() {
        return this.pageTitle;
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

    public void setTemplate(Long template) {
        this.template = template;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setShowInFront(Boolean showInFront) {
        this.showInFront = showInFront;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
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

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setUOrderStatus(Integer uOrderStatus) {
        this.uOrderStatus = uOrderStatus;
    }

    public void setURecommend(Integer uRecommend) {
        this.uRecommend = uRecommend;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public void setShowInTouchpad(Integer showInTouchpad) {
        this.showInTouchpad = showInTouchpad;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setAdImage(String adImage) {
        this.adImage = adImage;
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

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

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
        Long this$template = this.getTemplate();
        Long other$template = other.getTemplate();
        if (this$template == null ? other$template != null : !((Object)this$template).equals(other$template)) {
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
        Integer this$end = this.getEnd();
        Integer other$end = other.getEnd();
        if (this$end == null ? other$end != null : !((Object)this$end).equals(other$end)) {
            return false;
        }
        Integer this$order = this.getOrder();
        Integer other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        Boolean this$showInFront = this.getShowInFront();
        Boolean other$showInFront = other.getShowInFront();
        if (this$showInFront == null ? other$showInFront != null : !((Object)this$showInFront).equals(other$showInFront)) {
            return false;
        }
        Integer this$productCount = this.getProductCount();
        Integer other$productCount = other.getProductCount();
        if (this$productCount == null ? other$productCount != null : !((Object)this$productCount).equals(other$productCount)) {
            return false;
        }
        Long this$manageClass = this.getManageClass();
        Long other$manageClass = other.getManageClass();
        if (this$manageClass == null ? other$manageClass != null : !((Object)this$manageClass).equals(other$manageClass)) {
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
        Boolean this$recommend = this.getRecommend();
        Boolean other$recommend = other.getRecommend();
        if (this$recommend == null ? other$recommend != null : !((Object)this$recommend).equals(other$recommend)) {
            return false;
        }
        Integer this$showInTouchpad = this.getShowInTouchpad();
        Integer other$showInTouchpad = other.getShowInTouchpad();
        if (this$showInTouchpad == null ? other$showInTouchpad != null : !((Object)this$showInTouchpad).equals(other$showInTouchpad)) {
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
        String this$fullPath = this.getFullPath();
        String other$fullPath = other.getFullPath();
        if (this$fullPath == null ? other$fullPath != null : !this$fullPath.equals(other$fullPath)) {
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
        String this$pageTitle = this.getPageTitle();
        String other$pageTitle = other.getPageTitle();
        return !(this$pageTitle == null ? other$pageTitle != null : !this$pageTitle.equals(other$pageTitle));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PresentationClassDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $template = this.getTemplate();
        result = result * 59 + ($template == null ? 43 : ((Object)$template).hashCode());
        Long $parent = this.getParent();
        result = result * 59 + ($parent == null ? 43 : ((Object)$parent).hashCode());
        Integer $level = this.getLevel();
        result = result * 59 + ($level == null ? 43 : ((Object)$level).hashCode());
        Integer $end = this.getEnd();
        result = result * 59 + ($end == null ? 43 : ((Object)$end).hashCode());
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        Boolean $showInFront = this.getShowInFront();
        result = result * 59 + ($showInFront == null ? 43 : ((Object)$showInFront).hashCode());
        Integer $productCount = this.getProductCount();
        result = result * 59 + ($productCount == null ? 43 : ((Object)$productCount).hashCode());
        Long $manageClass = this.getManageClass();
        result = result * 59 + ($manageClass == null ? 43 : ((Object)$manageClass).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Integer $uOrderStatus = this.getUOrderStatus();
        result = result * 59 + ($uOrderStatus == null ? 43 : ((Object)$uOrderStatus).hashCode());
        Integer $uRecommend = this.getURecommend();
        result = result * 59 + ($uRecommend == null ? 43 : ((Object)$uRecommend).hashCode());
        Boolean $recommend = this.getRecommend();
        result = result * 59 + ($recommend == null ? 43 : ((Object)$recommend).hashCode());
        Integer $showInTouchpad = this.getShowInTouchpad();
        result = result * 59 + ($showInTouchpad == null ? 43 : ((Object)$showInTouchpad).hashCode());
        Long $firstLevel = this.getFirstLevel();
        result = result * 59 + ($firstLevel == null ? 43 : ((Object)$firstLevel).hashCode());
        Long $secondLevel = this.getSecondLevel();
        result = result * 59 + ($secondLevel == null ? 43 : ((Object)$secondLevel).hashCode());
        Long $thirdLevel = this.getThirdLevel();
        result = result * 59 + ($thirdLevel == null ? 43 : ((Object)$thirdLevel).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $templateName = this.getTemplateName();
        result = result * 59 + ($templateName == null ? 43 : $templateName.hashCode());
        String $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        String $fullPath = this.getFullPath();
        result = result * 59 + ($fullPath == null ? 43 : $fullPath.hashCode());
        String $manageClassCode = this.getManageClassCode();
        result = result * 59 + ($manageClassCode == null ? 43 : $manageClassCode.hashCode());
        String $manageClassName = this.getManageClassName();
        result = result * 59 + ($manageClassName == null ? 43 : $manageClassName.hashCode());
        String $image = this.getImage();
        result = result * 59 + ($image == null ? 43 : $image.hashCode());
        String $adImage = this.getAdImage();
        result = result * 59 + ($adImage == null ? 43 : $adImage.hashCode());
        String $pageTitle = this.getPageTitle();
        result = result * 59 + ($pageTitle == null ? 43 : $pageTitle.hashCode());
        return result;
    }

    public String toString() {
        return "PresentationClassDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", template=" + this.getTemplate() + ", templateName=" + this.getTemplateName() + ", parent=" + this.getParent() + ", level=" + this.getLevel() + ", path=" + this.getPath() + ", end=" + this.getEnd() + ", fullPath=" + this.getFullPath() + ", order=" + this.getOrder() + ", showInFront=" + this.getShowInFront() + ", productCount=" + this.getProductCount() + ", manageClass=" + this.getManageClass() + ", manageClassCode=" + this.getManageClassCode() + ", manageClassName=" + this.getManageClassName() + ", stopStatus=" + this.getStopStatus() + ", uOrderStatus=" + this.getUOrderStatus() + ", uRecommend=" + this.getURecommend() + ", recommend=" + this.getRecommend() + ", showInTouchpad=" + this.getShowInTouchpad() + ", image=" + this.getImage() + ", adImage=" + this.getAdImage() + ", firstLevel=" + this.getFirstLevel() + ", secondLevel=" + this.getSecondLevel() + ", thirdLevel=" + this.getThirdLevel() + ", pageTitle=" + this.getPageTitle() + ")";
    }
}

