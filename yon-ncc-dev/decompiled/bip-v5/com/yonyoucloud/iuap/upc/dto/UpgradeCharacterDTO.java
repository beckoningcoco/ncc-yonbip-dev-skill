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
import java.util.HashMap;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class UpgradeCharacterDTO
implements Serializable {
    private Long productId;
    private Long skuId;
    private String sensitiveId;
    private HashMap<String, Object> characterMap;

    public Long getProductId() {
        return this.productId;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public String getSensitiveId() {
        return this.sensitiveId;
    }

    public HashMap<String, Object> getCharacterMap() {
        return this.characterMap;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setSensitiveId(String sensitiveId) {
        this.sensitiveId = sensitiveId;
    }

    public void setCharacterMap(HashMap<String, Object> characterMap) {
        this.characterMap = characterMap;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UpgradeCharacterDTO)) {
            return false;
        }
        UpgradeCharacterDTO other = (UpgradeCharacterDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        Long this$skuId = this.getSkuId();
        Long other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !((Object)this$skuId).equals(other$skuId)) {
            return false;
        }
        String this$sensitiveId = this.getSensitiveId();
        String other$sensitiveId = other.getSensitiveId();
        if (this$sensitiveId == null ? other$sensitiveId != null : !this$sensitiveId.equals(other$sensitiveId)) {
            return false;
        }
        HashMap<String, Object> this$characterMap = this.getCharacterMap();
        HashMap<String, Object> other$characterMap = other.getCharacterMap();
        return !(this$characterMap == null ? other$characterMap != null : !((Object)this$characterMap).equals(other$characterMap));
    }

    protected boolean canEqual(Object other) {
        return other instanceof UpgradeCharacterDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Long $skuId = this.getSkuId();
        result = result * 59 + ($skuId == null ? 43 : ((Object)$skuId).hashCode());
        String $sensitiveId = this.getSensitiveId();
        result = result * 59 + ($sensitiveId == null ? 43 : $sensitiveId.hashCode());
        HashMap<String, Object> $characterMap = this.getCharacterMap();
        result = result * 59 + ($characterMap == null ? 43 : ((Object)$characterMap).hashCode());
        return result;
    }

    public String toString() {
        return "UpgradeCharacterDTO(productId=" + this.getProductId() + ", skuId=" + this.getSkuId() + ", sensitiveId=" + this.getSensitiveId() + ", characterMap=" + this.getCharacterMap() + ")";
    }
}

