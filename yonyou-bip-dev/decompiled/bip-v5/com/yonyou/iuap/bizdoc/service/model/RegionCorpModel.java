/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

import com.yonyou.iuap.bizdoc.service.model.BaseDaoModel;

public class RegionCorpModel
extends BaseDaoModel {
    private String showName;
    private String showName2;
    private String showName3;
    private String parentCode;
    private String zipCode;
    private Boolean isCashOnDelivery;
    private Integer sourceType;
    private String cityCode;
    private String mergerName;
    private Long parentId;
    private Integer level;
    private Boolean isEnd;
    private String keyWord;
    private String path;

    public String getShowName() {
        return this.showName;
    }

    public String getShowName2() {
        return this.showName2;
    }

    public String getShowName3() {
        return this.showName3;
    }

    public String getParentCode() {
        return this.parentCode;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public Boolean getIsCashOnDelivery() {
        return this.isCashOnDelivery;
    }

    public Integer getSourceType() {
        return this.sourceType;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public String getMergerName() {
        return this.mergerName;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Boolean getIsEnd() {
        return this.isEnd;
    }

    public String getKeyWord() {
        return this.keyWord;
    }

    public String getPath() {
        return this.path;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public void setShowName2(String showName2) {
        this.showName2 = showName2;
    }

    public void setShowName3(String showName3) {
        this.showName3 = showName3;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setIsCashOnDelivery(Boolean isCashOnDelivery) {
        this.isCashOnDelivery = isCashOnDelivery;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public void setMergerName(String mergerName) {
        this.mergerName = mergerName;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setIsEnd(Boolean isEnd) {
        this.isEnd = isEnd;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof RegionCorpModel)) {
            return false;
        }
        RegionCorpModel other = (RegionCorpModel)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$isCashOnDelivery = this.getIsCashOnDelivery();
        Boolean other$isCashOnDelivery = other.getIsCashOnDelivery();
        if (this$isCashOnDelivery == null ? other$isCashOnDelivery != null : !((Object)this$isCashOnDelivery).equals(other$isCashOnDelivery)) {
            return false;
        }
        Integer this$sourceType = this.getSourceType();
        Integer other$sourceType = other.getSourceType();
        if (this$sourceType == null ? other$sourceType != null : !((Object)this$sourceType).equals(other$sourceType)) {
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
        Boolean this$isEnd = this.getIsEnd();
        Boolean other$isEnd = other.getIsEnd();
        if (this$isEnd == null ? other$isEnd != null : !((Object)this$isEnd).equals(other$isEnd)) {
            return false;
        }
        String this$showName = this.getShowName();
        String other$showName = other.getShowName();
        if (this$showName == null ? other$showName != null : !this$showName.equals(other$showName)) {
            return false;
        }
        String this$showName2 = this.getShowName2();
        String other$showName2 = other.getShowName2();
        if (this$showName2 == null ? other$showName2 != null : !this$showName2.equals(other$showName2)) {
            return false;
        }
        String this$showName3 = this.getShowName3();
        String other$showName3 = other.getShowName3();
        if (this$showName3 == null ? other$showName3 != null : !this$showName3.equals(other$showName3)) {
            return false;
        }
        String this$parentCode = this.getParentCode();
        String other$parentCode = other.getParentCode();
        if (this$parentCode == null ? other$parentCode != null : !this$parentCode.equals(other$parentCode)) {
            return false;
        }
        String this$zipCode = this.getZipCode();
        String other$zipCode = other.getZipCode();
        if (this$zipCode == null ? other$zipCode != null : !this$zipCode.equals(other$zipCode)) {
            return false;
        }
        String this$cityCode = this.getCityCode();
        String other$cityCode = other.getCityCode();
        if (this$cityCode == null ? other$cityCode != null : !this$cityCode.equals(other$cityCode)) {
            return false;
        }
        String this$mergerName = this.getMergerName();
        String other$mergerName = other.getMergerName();
        if (this$mergerName == null ? other$mergerName != null : !this$mergerName.equals(other$mergerName)) {
            return false;
        }
        String this$keyWord = this.getKeyWord();
        String other$keyWord = other.getKeyWord();
        if (this$keyWord == null ? other$keyWord != null : !this$keyWord.equals(other$keyWord)) {
            return false;
        }
        String this$path = this.getPath();
        String other$path = other.getPath();
        return !(this$path == null ? other$path != null : !this$path.equals(other$path));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof RegionCorpModel;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $isCashOnDelivery = this.getIsCashOnDelivery();
        result = result * 59 + ($isCashOnDelivery == null ? 43 : ((Object)$isCashOnDelivery).hashCode());
        Integer $sourceType = this.getSourceType();
        result = result * 59 + ($sourceType == null ? 43 : ((Object)$sourceType).hashCode());
        Long $parentId = this.getParentId();
        result = result * 59 + ($parentId == null ? 43 : ((Object)$parentId).hashCode());
        Integer $level = this.getLevel();
        result = result * 59 + ($level == null ? 43 : ((Object)$level).hashCode());
        Boolean $isEnd = this.getIsEnd();
        result = result * 59 + ($isEnd == null ? 43 : ((Object)$isEnd).hashCode());
        String $showName = this.getShowName();
        result = result * 59 + ($showName == null ? 43 : $showName.hashCode());
        String $showName2 = this.getShowName2();
        result = result * 59 + ($showName2 == null ? 43 : $showName2.hashCode());
        String $showName3 = this.getShowName3();
        result = result * 59 + ($showName3 == null ? 43 : $showName3.hashCode());
        String $parentCode = this.getParentCode();
        result = result * 59 + ($parentCode == null ? 43 : $parentCode.hashCode());
        String $zipCode = this.getZipCode();
        result = result * 59 + ($zipCode == null ? 43 : $zipCode.hashCode());
        String $cityCode = this.getCityCode();
        result = result * 59 + ($cityCode == null ? 43 : $cityCode.hashCode());
        String $mergerName = this.getMergerName();
        result = result * 59 + ($mergerName == null ? 43 : $mergerName.hashCode());
        String $keyWord = this.getKeyWord();
        result = result * 59 + ($keyWord == null ? 43 : $keyWord.hashCode());
        String $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "RegionCorpModel(showName=" + this.getShowName() + ", showName2=" + this.getShowName2() + ", showName3=" + this.getShowName3() + ", parentCode=" + this.getParentCode() + ", zipCode=" + this.getZipCode() + ", isCashOnDelivery=" + this.getIsCashOnDelivery() + ", sourceType=" + this.getSourceType() + ", cityCode=" + this.getCityCode() + ", mergerName=" + this.getMergerName() + ", parentId=" + this.getParentId() + ", level=" + this.getLevel() + ", isEnd=" + this.getIsEnd() + ", keyWord=" + this.getKeyWord() + ", path=" + this.getPath() + ")";
    }
}

