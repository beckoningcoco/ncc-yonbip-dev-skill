/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.CharacterValueDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSkuDTO;
import java.io.Serializable;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class SkuMatchDTO
implements Serializable {
    private String unionKey;
    private String md5Key;
    private Long productId;
    private Long productTplId;
    private Long characteristicsId;
    private Boolean skuDynamicFlag;
    private List<CharacterValueDTO> characterValueDTOList;
    private ProductSkuDTO matchProductSkuDTO;

    public String getUnionKey() {
        return this.unionKey;
    }

    public String getMd5Key() {
        return this.md5Key;
    }

    public Long getProductId() {
        return this.productId;
    }

    public Long getProductTplId() {
        return this.productTplId;
    }

    public Long getCharacteristicsId() {
        return this.characteristicsId;
    }

    public Boolean getSkuDynamicFlag() {
        return this.skuDynamicFlag;
    }

    public List<CharacterValueDTO> getCharacterValueDTOList() {
        return this.characterValueDTOList;
    }

    public ProductSkuDTO getMatchProductSkuDTO() {
        return this.matchProductSkuDTO;
    }

    public void setUnionKey(String unionKey) {
        this.unionKey = unionKey;
    }

    public void setMd5Key(String md5Key) {
        this.md5Key = md5Key;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductTplId(Long productTplId) {
        this.productTplId = productTplId;
    }

    public void setCharacteristicsId(Long characteristicsId) {
        this.characteristicsId = characteristicsId;
    }

    public void setSkuDynamicFlag(Boolean skuDynamicFlag) {
        this.skuDynamicFlag = skuDynamicFlag;
    }

    public void setCharacterValueDTOList(List<CharacterValueDTO> characterValueDTOList) {
        this.characterValueDTOList = characterValueDTOList;
    }

    public void setMatchProductSkuDTO(ProductSkuDTO matchProductSkuDTO) {
        this.matchProductSkuDTO = matchProductSkuDTO;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SkuMatchDTO)) {
            return false;
        }
        SkuMatchDTO other = (SkuMatchDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        Long this$productTplId = this.getProductTplId();
        Long other$productTplId = other.getProductTplId();
        if (this$productTplId == null ? other$productTplId != null : !((Object)this$productTplId).equals(other$productTplId)) {
            return false;
        }
        Long this$characteristicsId = this.getCharacteristicsId();
        Long other$characteristicsId = other.getCharacteristicsId();
        if (this$characteristicsId == null ? other$characteristicsId != null : !((Object)this$characteristicsId).equals(other$characteristicsId)) {
            return false;
        }
        Boolean this$skuDynamicFlag = this.getSkuDynamicFlag();
        Boolean other$skuDynamicFlag = other.getSkuDynamicFlag();
        if (this$skuDynamicFlag == null ? other$skuDynamicFlag != null : !((Object)this$skuDynamicFlag).equals(other$skuDynamicFlag)) {
            return false;
        }
        String this$unionKey = this.getUnionKey();
        String other$unionKey = other.getUnionKey();
        if (this$unionKey == null ? other$unionKey != null : !this$unionKey.equals(other$unionKey)) {
            return false;
        }
        String this$md5Key = this.getMd5Key();
        String other$md5Key = other.getMd5Key();
        if (this$md5Key == null ? other$md5Key != null : !this$md5Key.equals(other$md5Key)) {
            return false;
        }
        List<CharacterValueDTO> this$characterValueDTOList = this.getCharacterValueDTOList();
        List<CharacterValueDTO> other$characterValueDTOList = other.getCharacterValueDTOList();
        if (this$characterValueDTOList == null ? other$characterValueDTOList != null : !((Object)this$characterValueDTOList).equals(other$characterValueDTOList)) {
            return false;
        }
        ProductSkuDTO this$matchProductSkuDTO = this.getMatchProductSkuDTO();
        ProductSkuDTO other$matchProductSkuDTO = other.getMatchProductSkuDTO();
        return !(this$matchProductSkuDTO == null ? other$matchProductSkuDTO != null : !((Object)this$matchProductSkuDTO).equals(other$matchProductSkuDTO));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SkuMatchDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Long $productTplId = this.getProductTplId();
        result = result * 59 + ($productTplId == null ? 43 : ((Object)$productTplId).hashCode());
        Long $characteristicsId = this.getCharacteristicsId();
        result = result * 59 + ($characteristicsId == null ? 43 : ((Object)$characteristicsId).hashCode());
        Boolean $skuDynamicFlag = this.getSkuDynamicFlag();
        result = result * 59 + ($skuDynamicFlag == null ? 43 : ((Object)$skuDynamicFlag).hashCode());
        String $unionKey = this.getUnionKey();
        result = result * 59 + ($unionKey == null ? 43 : $unionKey.hashCode());
        String $md5Key = this.getMd5Key();
        result = result * 59 + ($md5Key == null ? 43 : $md5Key.hashCode());
        List<CharacterValueDTO> $characterValueDTOList = this.getCharacterValueDTOList();
        result = result * 59 + ($characterValueDTOList == null ? 43 : ((Object)$characterValueDTOList).hashCode());
        ProductSkuDTO $matchProductSkuDTO = this.getMatchProductSkuDTO();
        result = result * 59 + ($matchProductSkuDTO == null ? 43 : ((Object)$matchProductSkuDTO).hashCode());
        return result;
    }

    public String toString() {
        return "SkuMatchDTO(unionKey=" + this.getUnionKey() + ", md5Key=" + this.getMd5Key() + ", productId=" + this.getProductId() + ", productTplId=" + this.getProductTplId() + ", characteristicsId=" + this.getCharacteristicsId() + ", skuDynamicFlag=" + this.getSkuDynamicFlag() + ", characterValueDTOList=" + this.getCharacterValueDTOList() + ", matchProductSkuDTO=" + this.getMatchProductSkuDTO() + ")";
    }
}

