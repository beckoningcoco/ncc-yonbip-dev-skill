/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.yonyou.ucf.CharacterDocValueDTO
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.ucf.CharacterDocValueDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSpecItemAlbumDTO;
import java.util.List;
import java.util.Objects;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductCharacterDocValueDTO
extends CharacterDocValueDTO {
    private List<ProductSpecItemAlbumDTO> albumDTOList;
    private Integer templateCharacterOrder;

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || ((Object)((Object)this)).getClass() != o.getClass()) {
            return false;
        }
        ProductCharacterDocValueDTO that = (ProductCharacterDocValueDTO)((Object)o);
        return this.getId().equals(that.getId());
    }

    public int hashCode() {
        return Objects.hash(this.albumDTOList);
    }

    public List<ProductSpecItemAlbumDTO> getAlbumDTOList() {
        return this.albumDTOList;
    }

    public Integer getTemplateCharacterOrder() {
        return this.templateCharacterOrder;
    }

    public void setAlbumDTOList(List<ProductSpecItemAlbumDTO> albumDTOList) {
        this.albumDTOList = albumDTOList;
    }

    public void setTemplateCharacterOrder(Integer templateCharacterOrder) {
        this.templateCharacterOrder = templateCharacterOrder;
    }

    public String toString() {
        return "ProductCharacterDocValueDTO(albumDTOList=" + this.getAlbumDTOList() + ", templateCharacterOrder=" + this.getTemplateCharacterOrder() + ")";
    }
}

