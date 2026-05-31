/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.apdoc.sdk.dto.material;

import com.yonyou.iuap.apdoc.sdk.dto.material.MaterialCompQryDTO;
import com.yonyou.iuap.apdoc.sdk.dto.pub.QryFieldDTO;
import java.util.LinkedHashSet;
import java.util.List;

public class SkuFuzzyCompQryDTO
extends MaterialCompQryDTO {
    private List<QryFieldDTO> skuPropCharacter_or;
    private List<QryFieldDTO> skuFreeCharacter_or;
    private QryFieldDTO skuSpecs_or;
    private QryFieldDTO skuIds_and;
    private Boolean skuFlag_and;
    private QryFieldDTO skuStopStatus_and;
    private QryFieldDTO skuIds_or;
    private QryFieldDTO materialIds_or;
    private Boolean isMaterial;
    private Boolean distinct;
    private QryFieldDTO productClass_fullPath_and;
    private QryFieldDTO productClass_fullPath_or;
    private LinkedHashSet<String> ascField;
    private LinkedHashSet<String> descField;
    private Boolean needCount = false;

    public List<QryFieldDTO> getSkuPropCharacter_or() {
        return this.skuPropCharacter_or;
    }

    public List<QryFieldDTO> getSkuFreeCharacter_or() {
        return this.skuFreeCharacter_or;
    }

    public QryFieldDTO getSkuSpecs_or() {
        return this.skuSpecs_or;
    }

    public QryFieldDTO getSkuIds_and() {
        return this.skuIds_and;
    }

    public Boolean getSkuFlag_and() {
        return this.skuFlag_and;
    }

    public QryFieldDTO getSkuStopStatus_and() {
        return this.skuStopStatus_and;
    }

    public QryFieldDTO getSkuIds_or() {
        return this.skuIds_or;
    }

    public QryFieldDTO getMaterialIds_or() {
        return this.materialIds_or;
    }

    public Boolean getIsMaterial() {
        return this.isMaterial;
    }

    public Boolean getDistinct() {
        return this.distinct;
    }

    public QryFieldDTO getProductClass_fullPath_and() {
        return this.productClass_fullPath_and;
    }

    public QryFieldDTO getProductClass_fullPath_or() {
        return this.productClass_fullPath_or;
    }

    public LinkedHashSet<String> getAscField() {
        return this.ascField;
    }

    public LinkedHashSet<String> getDescField() {
        return this.descField;
    }

    @Override
    public Boolean getNeedCount() {
        return this.needCount;
    }

    public void setSkuPropCharacter_or(List<QryFieldDTO> skuPropCharacter_or) {
        this.skuPropCharacter_or = skuPropCharacter_or;
    }

    public void setSkuFreeCharacter_or(List<QryFieldDTO> skuFreeCharacter_or) {
        this.skuFreeCharacter_or = skuFreeCharacter_or;
    }

    public void setSkuSpecs_or(QryFieldDTO skuSpecs_or) {
        this.skuSpecs_or = skuSpecs_or;
    }

    public void setSkuIds_and(QryFieldDTO skuIds_and) {
        this.skuIds_and = skuIds_and;
    }

    public void setSkuFlag_and(Boolean skuFlag_and) {
        this.skuFlag_and = skuFlag_and;
    }

    public void setSkuStopStatus_and(QryFieldDTO skuStopStatus_and) {
        this.skuStopStatus_and = skuStopStatus_and;
    }

    public void setSkuIds_or(QryFieldDTO skuIds_or) {
        this.skuIds_or = skuIds_or;
    }

    public void setMaterialIds_or(QryFieldDTO materialIds_or) {
        this.materialIds_or = materialIds_or;
    }

    public void setIsMaterial(Boolean isMaterial) {
        this.isMaterial = isMaterial;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    public void setProductClass_fullPath_and(QryFieldDTO productClass_fullPath_and) {
        this.productClass_fullPath_and = productClass_fullPath_and;
    }

    public void setProductClass_fullPath_or(QryFieldDTO productClass_fullPath_or) {
        this.productClass_fullPath_or = productClass_fullPath_or;
    }

    public void setAscField(LinkedHashSet<String> ascField) {
        this.ascField = ascField;
    }

    public void setDescField(LinkedHashSet<String> descField) {
        this.descField = descField;
    }

    @Override
    public void setNeedCount(Boolean needCount) {
        this.needCount = needCount;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SkuFuzzyCompQryDTO)) {
            return false;
        }
        SkuFuzzyCompQryDTO other = (SkuFuzzyCompQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$skuFlag_and = this.getSkuFlag_and();
        Boolean other$skuFlag_and = other.getSkuFlag_and();
        if (this$skuFlag_and == null ? other$skuFlag_and != null : !((Object)this$skuFlag_and).equals(other$skuFlag_and)) {
            return false;
        }
        Boolean this$isMaterial = this.getIsMaterial();
        Boolean other$isMaterial = other.getIsMaterial();
        if (this$isMaterial == null ? other$isMaterial != null : !((Object)this$isMaterial).equals(other$isMaterial)) {
            return false;
        }
        Boolean this$distinct = this.getDistinct();
        Boolean other$distinct = other.getDistinct();
        if (this$distinct == null ? other$distinct != null : !((Object)this$distinct).equals(other$distinct)) {
            return false;
        }
        Boolean this$needCount = this.getNeedCount();
        Boolean other$needCount = other.getNeedCount();
        if (this$needCount == null ? other$needCount != null : !((Object)this$needCount).equals(other$needCount)) {
            return false;
        }
        List<QryFieldDTO> this$skuPropCharacter_or = this.getSkuPropCharacter_or();
        List<QryFieldDTO> other$skuPropCharacter_or = other.getSkuPropCharacter_or();
        if (this$skuPropCharacter_or == null ? other$skuPropCharacter_or != null : !((Object)this$skuPropCharacter_or).equals(other$skuPropCharacter_or)) {
            return false;
        }
        List<QryFieldDTO> this$skuFreeCharacter_or = this.getSkuFreeCharacter_or();
        List<QryFieldDTO> other$skuFreeCharacter_or = other.getSkuFreeCharacter_or();
        if (this$skuFreeCharacter_or == null ? other$skuFreeCharacter_or != null : !((Object)this$skuFreeCharacter_or).equals(other$skuFreeCharacter_or)) {
            return false;
        }
        QryFieldDTO this$skuSpecs_or = this.getSkuSpecs_or();
        QryFieldDTO other$skuSpecs_or = other.getSkuSpecs_or();
        if (this$skuSpecs_or == null ? other$skuSpecs_or != null : !((Object)this$skuSpecs_or).equals(other$skuSpecs_or)) {
            return false;
        }
        QryFieldDTO this$skuIds_and = this.getSkuIds_and();
        QryFieldDTO other$skuIds_and = other.getSkuIds_and();
        if (this$skuIds_and == null ? other$skuIds_and != null : !((Object)this$skuIds_and).equals(other$skuIds_and)) {
            return false;
        }
        QryFieldDTO this$skuStopStatus_and = this.getSkuStopStatus_and();
        QryFieldDTO other$skuStopStatus_and = other.getSkuStopStatus_and();
        if (this$skuStopStatus_and == null ? other$skuStopStatus_and != null : !((Object)this$skuStopStatus_and).equals(other$skuStopStatus_and)) {
            return false;
        }
        QryFieldDTO this$skuIds_or = this.getSkuIds_or();
        QryFieldDTO other$skuIds_or = other.getSkuIds_or();
        if (this$skuIds_or == null ? other$skuIds_or != null : !((Object)this$skuIds_or).equals(other$skuIds_or)) {
            return false;
        }
        QryFieldDTO this$materialIds_or = this.getMaterialIds_or();
        QryFieldDTO other$materialIds_or = other.getMaterialIds_or();
        if (this$materialIds_or == null ? other$materialIds_or != null : !((Object)this$materialIds_or).equals(other$materialIds_or)) {
            return false;
        }
        QryFieldDTO this$productClass_fullPath_and = this.getProductClass_fullPath_and();
        QryFieldDTO other$productClass_fullPath_and = other.getProductClass_fullPath_and();
        if (this$productClass_fullPath_and == null ? other$productClass_fullPath_and != null : !((Object)this$productClass_fullPath_and).equals(other$productClass_fullPath_and)) {
            return false;
        }
        QryFieldDTO this$productClass_fullPath_or = this.getProductClass_fullPath_or();
        QryFieldDTO other$productClass_fullPath_or = other.getProductClass_fullPath_or();
        if (this$productClass_fullPath_or == null ? other$productClass_fullPath_or != null : !((Object)this$productClass_fullPath_or).equals(other$productClass_fullPath_or)) {
            return false;
        }
        LinkedHashSet<String> this$ascField = this.getAscField();
        LinkedHashSet<String> other$ascField = other.getAscField();
        if (this$ascField == null ? other$ascField != null : !((Object)this$ascField).equals(other$ascField)) {
            return false;
        }
        LinkedHashSet<String> this$descField = this.getDescField();
        LinkedHashSet<String> other$descField = other.getDescField();
        return !(this$descField == null ? other$descField != null : !((Object)this$descField).equals(other$descField));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof SkuFuzzyCompQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $skuFlag_and = this.getSkuFlag_and();
        result = result * 59 + ($skuFlag_and == null ? 43 : ((Object)$skuFlag_and).hashCode());
        Boolean $isMaterial = this.getIsMaterial();
        result = result * 59 + ($isMaterial == null ? 43 : ((Object)$isMaterial).hashCode());
        Boolean $distinct = this.getDistinct();
        result = result * 59 + ($distinct == null ? 43 : ((Object)$distinct).hashCode());
        Boolean $needCount = this.getNeedCount();
        result = result * 59 + ($needCount == null ? 43 : ((Object)$needCount).hashCode());
        List<QryFieldDTO> $skuPropCharacter_or = this.getSkuPropCharacter_or();
        result = result * 59 + ($skuPropCharacter_or == null ? 43 : ((Object)$skuPropCharacter_or).hashCode());
        List<QryFieldDTO> $skuFreeCharacter_or = this.getSkuFreeCharacter_or();
        result = result * 59 + ($skuFreeCharacter_or == null ? 43 : ((Object)$skuFreeCharacter_or).hashCode());
        QryFieldDTO $skuSpecs_or = this.getSkuSpecs_or();
        result = result * 59 + ($skuSpecs_or == null ? 43 : ((Object)$skuSpecs_or).hashCode());
        QryFieldDTO $skuIds_and = this.getSkuIds_and();
        result = result * 59 + ($skuIds_and == null ? 43 : ((Object)$skuIds_and).hashCode());
        QryFieldDTO $skuStopStatus_and = this.getSkuStopStatus_and();
        result = result * 59 + ($skuStopStatus_and == null ? 43 : ((Object)$skuStopStatus_and).hashCode());
        QryFieldDTO $skuIds_or = this.getSkuIds_or();
        result = result * 59 + ($skuIds_or == null ? 43 : ((Object)$skuIds_or).hashCode());
        QryFieldDTO $materialIds_or = this.getMaterialIds_or();
        result = result * 59 + ($materialIds_or == null ? 43 : ((Object)$materialIds_or).hashCode());
        QryFieldDTO $productClass_fullPath_and = this.getProductClass_fullPath_and();
        result = result * 59 + ($productClass_fullPath_and == null ? 43 : ((Object)$productClass_fullPath_and).hashCode());
        QryFieldDTO $productClass_fullPath_or = this.getProductClass_fullPath_or();
        result = result * 59 + ($productClass_fullPath_or == null ? 43 : ((Object)$productClass_fullPath_or).hashCode());
        LinkedHashSet<String> $ascField = this.getAscField();
        result = result * 59 + ($ascField == null ? 43 : ((Object)$ascField).hashCode());
        LinkedHashSet<String> $descField = this.getDescField();
        result = result * 59 + ($descField == null ? 43 : ((Object)$descField).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "SkuFuzzyCompQryDTO(skuPropCharacter_or=" + this.getSkuPropCharacter_or() + ", skuFreeCharacter_or=" + this.getSkuFreeCharacter_or() + ", skuSpecs_or=" + this.getSkuSpecs_or() + ", skuIds_and=" + this.getSkuIds_and() + ", skuFlag_and=" + this.getSkuFlag_and() + ", skuStopStatus_and=" + this.getSkuStopStatus_and() + ", skuIds_or=" + this.getSkuIds_or() + ", materialIds_or=" + this.getMaterialIds_or() + ", isMaterial=" + this.getIsMaterial() + ", distinct=" + this.getDistinct() + ", productClass_fullPath_and=" + this.getProductClass_fullPath_and() + ", productClass_fullPath_or=" + this.getProductClass_fullPath_or() + ", ascField=" + this.getAscField() + ", descField=" + this.getDescField() + ", needCount=" + this.getNeedCount() + ")";
    }
}

