/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ProductDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplCharacterDTO;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class SensitiveInfoAndProduct {
    private List<ProductDTO> productList;
    private List<ProductTplCharacterDTO> tplCharacterList;

    public SensitiveInfoAndProduct() {
    }

    public SensitiveInfoAndProduct(List<ProductDTO> productList, List<ProductTplCharacterDTO> tplCharacterList) {
        this.productList = productList;
        this.tplCharacterList = tplCharacterList;
    }

    public List<ProductDTO> getProductList() {
        return this.productList;
    }

    public List<ProductTplCharacterDTO> getTplCharacterList() {
        return this.tplCharacterList;
    }

    public void setProductList(List<ProductDTO> productList) {
        this.productList = productList;
    }

    public void setTplCharacterList(List<ProductTplCharacterDTO> tplCharacterList) {
        this.tplCharacterList = tplCharacterList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SensitiveInfoAndProduct)) {
            return false;
        }
        SensitiveInfoAndProduct other = (SensitiveInfoAndProduct)o;
        if (!other.canEqual(this)) {
            return false;
        }
        List<ProductDTO> this$productList = this.getProductList();
        List<ProductDTO> other$productList = other.getProductList();
        if (this$productList == null ? other$productList != null : !((Object)this$productList).equals(other$productList)) {
            return false;
        }
        List<ProductTplCharacterDTO> this$tplCharacterList = this.getTplCharacterList();
        List<ProductTplCharacterDTO> other$tplCharacterList = other.getTplCharacterList();
        return !(this$tplCharacterList == null ? other$tplCharacterList != null : !((Object)this$tplCharacterList).equals(other$tplCharacterList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SensitiveInfoAndProduct;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        List<ProductDTO> $productList = this.getProductList();
        result = result * 59 + ($productList == null ? 43 : ((Object)$productList).hashCode());
        List<ProductTplCharacterDTO> $tplCharacterList = this.getTplCharacterList();
        result = result * 59 + ($tplCharacterList == null ? 43 : ((Object)$tplCharacterList).hashCode());
        return result;
    }

    public String toString() {
        return "SensitiveInfoAndProduct(productList=" + this.getProductList() + ", tplCharacterList=" + this.getTplCharacterList() + ")";
    }
}

