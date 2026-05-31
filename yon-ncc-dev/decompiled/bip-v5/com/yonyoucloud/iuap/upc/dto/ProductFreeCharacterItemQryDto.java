/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ProductFreeCharacterItemDto;
import java.io.Serializable;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductFreeCharacterItemQryDto
implements Serializable {
    private Long productId;
    private List<String> characterIds;
    private List<String> characterValueIds;
    private List<ProductFreeCharacterItemDto> freeCharacterItemDtos;

    public ProductFreeCharacterItemQryDto() {
    }

    public ProductFreeCharacterItemQryDto(Long productId, List<ProductFreeCharacterItemDto> freeCharacterItemDtos) {
        this.productId = productId;
        this.freeCharacterItemDtos = freeCharacterItemDtos;
    }

    public Long getProductId() {
        return this.productId;
    }

    public List<String> getCharacterIds() {
        return this.characterIds;
    }

    public List<String> getCharacterValueIds() {
        return this.characterValueIds;
    }

    public List<ProductFreeCharacterItemDto> getFreeCharacterItemDtos() {
        return this.freeCharacterItemDtos;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setCharacterIds(List<String> characterIds) {
        this.characterIds = characterIds;
    }

    public void setCharacterValueIds(List<String> characterValueIds) {
        this.characterValueIds = characterValueIds;
    }

    public void setFreeCharacterItemDtos(List<ProductFreeCharacterItemDto> freeCharacterItemDtos) {
        this.freeCharacterItemDtos = freeCharacterItemDtos;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductFreeCharacterItemQryDto)) {
            return false;
        }
        ProductFreeCharacterItemQryDto other = (ProductFreeCharacterItemQryDto)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        List<String> this$characterIds = this.getCharacterIds();
        List<String> other$characterIds = other.getCharacterIds();
        if (this$characterIds == null ? other$characterIds != null : !((Object)this$characterIds).equals(other$characterIds)) {
            return false;
        }
        List<String> this$characterValueIds = this.getCharacterValueIds();
        List<String> other$characterValueIds = other.getCharacterValueIds();
        if (this$characterValueIds == null ? other$characterValueIds != null : !((Object)this$characterValueIds).equals(other$characterValueIds)) {
            return false;
        }
        List<ProductFreeCharacterItemDto> this$freeCharacterItemDtos = this.getFreeCharacterItemDtos();
        List<ProductFreeCharacterItemDto> other$freeCharacterItemDtos = other.getFreeCharacterItemDtos();
        return !(this$freeCharacterItemDtos == null ? other$freeCharacterItemDtos != null : !((Object)this$freeCharacterItemDtos).equals(other$freeCharacterItemDtos));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductFreeCharacterItemQryDto;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        List<String> $characterIds = this.getCharacterIds();
        result = result * 59 + ($characterIds == null ? 43 : ((Object)$characterIds).hashCode());
        List<String> $characterValueIds = this.getCharacterValueIds();
        result = result * 59 + ($characterValueIds == null ? 43 : ((Object)$characterValueIds).hashCode());
        List<ProductFreeCharacterItemDto> $freeCharacterItemDtos = this.getFreeCharacterItemDtos();
        result = result * 59 + ($freeCharacterItemDtos == null ? 43 : ((Object)$freeCharacterItemDtos).hashCode());
        return result;
    }

    public String toString() {
        return "ProductFreeCharacterItemQryDto(productId=" + this.getProductId() + ", characterIds=" + this.getCharacterIds() + ", characterValueIds=" + this.getCharacterValueIds() + ", freeCharacterItemDtos=" + this.getFreeCharacterItemDtos() + ")";
    }
}

