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
public class UserDefineDTO
implements Serializable {
    private Long id;
    private Long productId;
    private String showItem;
    private String defineId;

    public Long getId() {
        return this.id;
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getShowItem() {
        return this.showItem;
    }

    public String getDefineId() {
        return this.defineId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setShowItem(String showItem) {
        this.showItem = showItem;
    }

    public void setDefineId(String defineId) {
        this.defineId = defineId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UserDefineDTO)) {
            return false;
        }
        UserDefineDTO other = (UserDefineDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        String this$showItem = this.getShowItem();
        String other$showItem = other.getShowItem();
        if (this$showItem == null ? other$showItem != null : !this$showItem.equals(other$showItem)) {
            return false;
        }
        String this$defineId = this.getDefineId();
        String other$defineId = other.getDefineId();
        return !(this$defineId == null ? other$defineId != null : !this$defineId.equals(other$defineId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof UserDefineDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        String $showItem = this.getShowItem();
        result = result * 59 + ($showItem == null ? 43 : $showItem.hashCode());
        String $defineId = this.getDefineId();
        result = result * 59 + ($defineId == null ? 43 : $defineId.hashCode());
        return result;
    }

    public String toString() {
        return "UserDefineDTO(id=" + this.getId() + ", productId=" + this.getProductId() + ", showItem=" + this.getShowItem() + ", defineId=" + this.getDefineId() + ")";
    }
}

