/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.yonyou.iuap.international.MultiLangText
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductTplCyclePropertyDTO
implements Serializable {
    private Long id;
    private Long templateId;
    private Long propertyType;
    private String propertyTypeName;
    private Integer order;
    private String showType;
    private Integer dataType;
    private Boolean show;
    private String values;
    private MultilingualVO alias;
    private MultiLangText alias_multilang;

    public Long getId() {
        return this.id;
    }

    public Long getTemplateId() {
        return this.templateId;
    }

    public Long getPropertyType() {
        return this.propertyType;
    }

    public String getPropertyTypeName() {
        return this.propertyTypeName;
    }

    public Integer getOrder() {
        return this.order;
    }

    public String getShowType() {
        return this.showType;
    }

    public Integer getDataType() {
        return this.dataType;
    }

    public Boolean getShow() {
        return this.show;
    }

    public String getValues() {
        return this.values;
    }

    public MultilingualVO getAlias() {
        return this.alias;
    }

    public MultiLangText getAlias_multilang() {
        return this.alias_multilang;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }

    public void setPropertyType(Long propertyType) {
        this.propertyType = propertyType;
    }

    public void setPropertyTypeName(String propertyTypeName) {
        this.propertyTypeName = propertyTypeName;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public void setAlias(MultilingualVO alias) {
        this.alias = alias;
    }

    public void setAlias_multilang(MultiLangText alias_multilang) {
        this.alias_multilang = alias_multilang;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductTplCyclePropertyDTO)) {
            return false;
        }
        ProductTplCyclePropertyDTO other = (ProductTplCyclePropertyDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$templateId = this.getTemplateId();
        Long other$templateId = other.getTemplateId();
        if (this$templateId == null ? other$templateId != null : !((Object)this$templateId).equals(other$templateId)) {
            return false;
        }
        Long this$propertyType = this.getPropertyType();
        Long other$propertyType = other.getPropertyType();
        if (this$propertyType == null ? other$propertyType != null : !((Object)this$propertyType).equals(other$propertyType)) {
            return false;
        }
        Integer this$order = this.getOrder();
        Integer other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        Integer this$dataType = this.getDataType();
        Integer other$dataType = other.getDataType();
        if (this$dataType == null ? other$dataType != null : !((Object)this$dataType).equals(other$dataType)) {
            return false;
        }
        Boolean this$show = this.getShow();
        Boolean other$show = other.getShow();
        if (this$show == null ? other$show != null : !((Object)this$show).equals(other$show)) {
            return false;
        }
        String this$propertyTypeName = this.getPropertyTypeName();
        String other$propertyTypeName = other.getPropertyTypeName();
        if (this$propertyTypeName == null ? other$propertyTypeName != null : !this$propertyTypeName.equals(other$propertyTypeName)) {
            return false;
        }
        String this$showType = this.getShowType();
        String other$showType = other.getShowType();
        if (this$showType == null ? other$showType != null : !this$showType.equals(other$showType)) {
            return false;
        }
        String this$values = this.getValues();
        String other$values = other.getValues();
        if (this$values == null ? other$values != null : !this$values.equals(other$values)) {
            return false;
        }
        MultilingualVO this$alias = this.getAlias();
        MultilingualVO other$alias = other.getAlias();
        if (this$alias == null ? other$alias != null : !((Object)this$alias).equals(other$alias)) {
            return false;
        }
        MultiLangText this$alias_multilang = this.getAlias_multilang();
        MultiLangText other$alias_multilang = other.getAlias_multilang();
        return !(this$alias_multilang == null ? other$alias_multilang != null : !this$alias_multilang.equals(other$alias_multilang));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTplCyclePropertyDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $templateId = this.getTemplateId();
        result = result * 59 + ($templateId == null ? 43 : ((Object)$templateId).hashCode());
        Long $propertyType = this.getPropertyType();
        result = result * 59 + ($propertyType == null ? 43 : ((Object)$propertyType).hashCode());
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        Integer $dataType = this.getDataType();
        result = result * 59 + ($dataType == null ? 43 : ((Object)$dataType).hashCode());
        Boolean $show = this.getShow();
        result = result * 59 + ($show == null ? 43 : ((Object)$show).hashCode());
        String $propertyTypeName = this.getPropertyTypeName();
        result = result * 59 + ($propertyTypeName == null ? 43 : $propertyTypeName.hashCode());
        String $showType = this.getShowType();
        result = result * 59 + ($showType == null ? 43 : $showType.hashCode());
        String $values = this.getValues();
        result = result * 59 + ($values == null ? 43 : $values.hashCode());
        MultilingualVO $alias = this.getAlias();
        result = result * 59 + ($alias == null ? 43 : $alias.hashCode());
        MultiLangText $alias_multilang = this.getAlias_multilang();
        result = result * 59 + ($alias_multilang == null ? 43 : $alias_multilang.hashCode());
        return result;
    }

    public String toString() {
        return "ProductTplCyclePropertyDTO(id=" + this.getId() + ", templateId=" + this.getTemplateId() + ", propertyType=" + this.getPropertyType() + ", propertyTypeName=" + this.getPropertyTypeName() + ", order=" + this.getOrder() + ", showType=" + this.getShowType() + ", dataType=" + this.getDataType() + ", show=" + this.getShow() + ", values=" + this.getValues() + ", alias=" + this.getAlias() + ", alias_multilang=" + this.getAlias_multilang() + ")";
    }
}

