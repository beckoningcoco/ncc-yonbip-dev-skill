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
public class ProductFreeCharacterDTO
implements Serializable {
    private Long id;
    private Long productId;
    private String characterId;
    private String characterCode;
    private String characterValueId;
    private String imgBusinessId;

    public Long getId() {
        return this.id;
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

    public String getImgBusinessId() {
        return this.imgBusinessId;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setImgBusinessId(String imgBusinessId) {
        this.imgBusinessId = imgBusinessId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductFreeCharacterDTO)) {
            return false;
        }
        ProductFreeCharacterDTO other = (ProductFreeCharacterDTO)o;
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
        if (this$characterValueId == null ? other$characterValueId != null : !this$characterValueId.equals(other$characterValueId)) {
            return false;
        }
        String this$imgBusinessId = this.getImgBusinessId();
        String other$imgBusinessId = other.getImgBusinessId();
        return !(this$imgBusinessId == null ? other$imgBusinessId != null : !this$imgBusinessId.equals(other$imgBusinessId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductFreeCharacterDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        String $characterId = this.getCharacterId();
        result = result * 59 + ($characterId == null ? 43 : $characterId.hashCode());
        String $characterCode = this.getCharacterCode();
        result = result * 59 + ($characterCode == null ? 43 : $characterCode.hashCode());
        String $characterValueId = this.getCharacterValueId();
        result = result * 59 + ($characterValueId == null ? 43 : $characterValueId.hashCode());
        String $imgBusinessId = this.getImgBusinessId();
        result = result * 59 + ($imgBusinessId == null ? 43 : $imgBusinessId.hashCode());
        return result;
    }

    public String toString() {
        return "ProductFreeCharacterDTO(id=" + this.getId() + ", productId=" + this.getProductId() + ", characterId=" + this.getCharacterId() + ", characterCode=" + this.getCharacterCode() + ", characterValueId=" + this.getCharacterValueId() + ", imgBusinessId=" + this.getImgBusinessId() + ")";
    }
}

