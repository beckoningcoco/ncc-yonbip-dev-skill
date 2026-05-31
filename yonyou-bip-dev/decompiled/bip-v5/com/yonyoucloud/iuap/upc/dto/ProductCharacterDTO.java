/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.yonyou.ucf.CharacterDTO
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.ucf.CharacterDTO;
import com.yonyoucloud.iuap.upc.dto.ProductCharacterDocValueDTO;
import java.io.Serializable;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductCharacterDTO
extends CharacterDTO
implements Serializable {
    private List<ProductCharacterDocValueDTO> charactorValueDTOList;

    public List<ProductCharacterDocValueDTO> getCharactorValueDTOList() {
        return this.charactorValueDTOList;
    }

    public void setCharactorValueDTOList(List<ProductCharacterDocValueDTO> charactorValueDTOList) {
        this.charactorValueDTOList = charactorValueDTOList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductCharacterDTO)) {
            return false;
        }
        ProductCharacterDTO other = (ProductCharacterDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        List<ProductCharacterDocValueDTO> this$charactorValueDTOList = this.getCharactorValueDTOList();
        List<ProductCharacterDocValueDTO> other$charactorValueDTOList = other.getCharactorValueDTOList();
        return !(this$charactorValueDTOList == null ? other$charactorValueDTOList != null : !((Object)this$charactorValueDTOList).equals(other$charactorValueDTOList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductCharacterDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        List<ProductCharacterDocValueDTO> $charactorValueDTOList = this.getCharactorValueDTOList();
        result = result * 59 + ($charactorValueDTOList == null ? 43 : ((Object)$charactorValueDTOList).hashCode());
        return result;
    }

    public String toString() {
        return "ProductCharacterDTO(charactorValueDTOList=" + this.getCharactorValueDTOList() + ")";
    }
}

