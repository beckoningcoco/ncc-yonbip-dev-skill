/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo.productTpl.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MaterialPropCharacterVO {
    Long characteristics;
    Long characteristicsType;
    String characteristicsName;
    String characterCode;
    Integer dataType;
    Integer iOrder;
    Integer webShow;

    public Long getCharacteristics() {
        return this.characteristics;
    }

    public Long getCharacteristicsType() {
        return this.characteristicsType;
    }

    public String getCharacteristicsName() {
        return this.characteristicsName;
    }

    public String getCharacterCode() {
        return this.characterCode;
    }

    public Integer getDataType() {
        return this.dataType;
    }

    public Integer getIOrder() {
        return this.iOrder;
    }

    public Integer getWebShow() {
        return this.webShow;
    }

    public void setCharacteristics(Long characteristics) {
        this.characteristics = characteristics;
    }

    public void setCharacteristicsType(Long characteristicsType) {
        this.characteristicsType = characteristicsType;
    }

    public void setCharacteristicsName(String characteristicsName) {
        this.characteristicsName = characteristicsName;
    }

    public void setCharacterCode(String characterCode) {
        this.characterCode = characterCode;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public void setIOrder(Integer iOrder) {
        this.iOrder = iOrder;
    }

    public void setWebShow(Integer webShow) {
        this.webShow = webShow;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MaterialPropCharacterVO)) {
            return false;
        }
        MaterialPropCharacterVO other = (MaterialPropCharacterVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$characteristics = this.getCharacteristics();
        Long other$characteristics = other.getCharacteristics();
        if (this$characteristics == null ? other$characteristics != null : !((Object)this$characteristics).equals(other$characteristics)) {
            return false;
        }
        Long this$characteristicsType = this.getCharacteristicsType();
        Long other$characteristicsType = other.getCharacteristicsType();
        if (this$characteristicsType == null ? other$characteristicsType != null : !((Object)this$characteristicsType).equals(other$characteristicsType)) {
            return false;
        }
        Integer this$dataType = this.getDataType();
        Integer other$dataType = other.getDataType();
        if (this$dataType == null ? other$dataType != null : !((Object)this$dataType).equals(other$dataType)) {
            return false;
        }
        Integer this$iOrder = this.getIOrder();
        Integer other$iOrder = other.getIOrder();
        if (this$iOrder == null ? other$iOrder != null : !((Object)this$iOrder).equals(other$iOrder)) {
            return false;
        }
        Integer this$webShow = this.getWebShow();
        Integer other$webShow = other.getWebShow();
        if (this$webShow == null ? other$webShow != null : !((Object)this$webShow).equals(other$webShow)) {
            return false;
        }
        String this$characteristicsName = this.getCharacteristicsName();
        String other$characteristicsName = other.getCharacteristicsName();
        if (this$characteristicsName == null ? other$characteristicsName != null : !this$characteristicsName.equals(other$characteristicsName)) {
            return false;
        }
        String this$characterCode = this.getCharacterCode();
        String other$characterCode = other.getCharacterCode();
        return !(this$characterCode == null ? other$characterCode != null : !this$characterCode.equals(other$characterCode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MaterialPropCharacterVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $characteristics = this.getCharacteristics();
        result = result * 59 + ($characteristics == null ? 43 : ((Object)$characteristics).hashCode());
        Long $characteristicsType = this.getCharacteristicsType();
        result = result * 59 + ($characteristicsType == null ? 43 : ((Object)$characteristicsType).hashCode());
        Integer $dataType = this.getDataType();
        result = result * 59 + ($dataType == null ? 43 : ((Object)$dataType).hashCode());
        Integer $iOrder = this.getIOrder();
        result = result * 59 + ($iOrder == null ? 43 : ((Object)$iOrder).hashCode());
        Integer $webShow = this.getWebShow();
        result = result * 59 + ($webShow == null ? 43 : ((Object)$webShow).hashCode());
        String $characteristicsName = this.getCharacteristicsName();
        result = result * 59 + ($characteristicsName == null ? 43 : $characteristicsName.hashCode());
        String $characterCode = this.getCharacterCode();
        result = result * 59 + ($characterCode == null ? 43 : $characterCode.hashCode());
        return result;
    }

    public String toString() {
        return "MaterialPropCharacterVO(characteristics=" + this.getCharacteristics() + ", characteristicsType=" + this.getCharacteristicsType() + ", characteristicsName=" + this.getCharacteristicsName() + ", characterCode=" + this.getCharacterCode() + ", dataType=" + this.getDataType() + ", iOrder=" + this.getIOrder() + ", webShow=" + this.getWebShow() + ")";
    }
}

