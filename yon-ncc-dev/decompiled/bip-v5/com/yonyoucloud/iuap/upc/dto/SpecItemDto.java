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
public class SpecItemDto
implements Serializable {
    private String id;
    private String code;
    private String name;
    private String showItem;
    private String specId;
    private String cFreeid;
    private int iorder;
    private int tplOrder;

    public String getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getShowItem() {
        return this.showItem;
    }

    public String getSpecId() {
        return this.specId;
    }

    public String getCFreeid() {
        return this.cFreeid;
    }

    public int getIorder() {
        return this.iorder;
    }

    public int getTplOrder() {
        return this.tplOrder;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShowItem(String showItem) {
        this.showItem = showItem;
    }

    public void setSpecId(String specId) {
        this.specId = specId;
    }

    public void setCFreeid(String cFreeid) {
        this.cFreeid = cFreeid;
    }

    public void setIorder(int iorder) {
        this.iorder = iorder;
    }

    public void setTplOrder(int tplOrder) {
        this.tplOrder = tplOrder;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SpecItemDto)) {
            return false;
        }
        SpecItemDto other = (SpecItemDto)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getIorder() != other.getIorder()) {
            return false;
        }
        if (this.getTplOrder() != other.getTplOrder()) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
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
        String this$showItem = this.getShowItem();
        String other$showItem = other.getShowItem();
        if (this$showItem == null ? other$showItem != null : !this$showItem.equals(other$showItem)) {
            return false;
        }
        String this$specId = this.getSpecId();
        String other$specId = other.getSpecId();
        if (this$specId == null ? other$specId != null : !this$specId.equals(other$specId)) {
            return false;
        }
        String this$cFreeid = this.getCFreeid();
        String other$cFreeid = other.getCFreeid();
        return !(this$cFreeid == null ? other$cFreeid != null : !this$cFreeid.equals(other$cFreeid));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SpecItemDto;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getIorder();
        result = result * 59 + this.getTplOrder();
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $showItem = this.getShowItem();
        result = result * 59 + ($showItem == null ? 43 : $showItem.hashCode());
        String $specId = this.getSpecId();
        result = result * 59 + ($specId == null ? 43 : $specId.hashCode());
        String $cFreeid = this.getCFreeid();
        result = result * 59 + ($cFreeid == null ? 43 : $cFreeid.hashCode());
        return result;
    }

    public String toString() {
        return "SpecItemDto(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", showItem=" + this.getShowItem() + ", specId=" + this.getSpecId() + ", cFreeid=" + this.getCFreeid() + ", iorder=" + this.getIorder() + ", tplOrder=" + this.getTplOrder() + ")";
    }
}

