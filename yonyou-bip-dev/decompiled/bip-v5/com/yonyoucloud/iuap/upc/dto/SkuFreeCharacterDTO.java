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
public class SkuFreeCharacterDTO
implements Serializable {
    private Long id;
    private Long skuId;
    private Long productId;
    private String characterId;
    private String characterCode;
    private String characterValueId;

    public Long getId() {
        return this.id;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getCharacterId() {
        return this.characterId;
    }

    public String getCharacterCode() {
        return this.characterCode;
    }

    public String getCharacterValueId() {
        return this.characterValueId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setCharacterId(String characterId) {
        this.characterId = characterId;
    }

    public void setCharacterCode(String characterCode) {
        this.characterCode = characterCode;
    }

    public void setCharacterValueId(String characterValueId) {
        this.characterValueId = characterValueId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SkuFreeCharacterDTO)) {
            return false;
        }
        SkuFreeCharacterDTO other = (SkuFreeCharacterDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$skuId = this.getSkuId();
        Long other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !((Object)this$skuId).equals(other$skuId)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        String this$characterId = this.getCharacterId();
        String other$characterId = other.getCharacterId();
        if (this$characterId == null ? other$characterId != null : !this$characterId.equals(other$characterId)) {
            return false;
        }
        String this$characterCode = this.getCharacterCode();
        String other$characterCode = other.getCharacterCode();
        if (this$characterCode == null ? other$characterCode != null : !this$characterCode.equals(other$characterCode)) {
            return false;
        }
        String this$characterValueId = this.getCharacterValueId();
        String other$characterValueId = other.getCharacterValueId();
        return !(this$characterValueId == null ? other$characterValueId != null : !this$characterValueId.equals(other$characterValueId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SkuFreeCharacterDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $skuId = this.getSkuId();
        result = result * 59 + ($skuId == null ? 43 : ((Object)$skuId).hashCode());
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        String $characterId = this.getCharacterId();
        result = result * 59 + ($characterId == null ? 43 : $characterId.hashCode());
        String $characterCode = this.getCharacterCode();
        result = result * 59 + ($characterCode == null ? 43 : $characterCode.hashCode());
        String $characterValueId = this.getCharacterValueId();
        result = result * 59 + ($characterValueId == null ? 43 : $characterValueId.hashCode());
        return result;
    }

    public String toString() {
        return "SkuFreeCharacterDTO(id=" + this.getId() + ", skuId=" + this.getSkuId() + ", productId=" + this.getProductId() + ", characterId=" + this.getCharacterId() + ", characterCode=" + this.getCharacterCode() + ", characterValueId=" + this.getCharacterValueId() + ")";
    }
}

