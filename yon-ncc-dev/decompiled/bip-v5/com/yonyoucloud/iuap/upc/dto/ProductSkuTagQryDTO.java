/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductSkuTagQryDTO
extends UPCPager
implements Serializable {
    private String[] fields;
    private String skuId;
    private List<String> skuIdList;
    private List<String> orgIdList;

    public String[] getFields() {
        return this.fields;
    }

    public String getSkuId() {
        return this.skuId;
    }

    public List<String> getSkuIdList() {
        return this.skuIdList;
    }

    public List<String> getOrgIdList() {
        return this.orgIdList;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public void setSkuIdList(List<String> skuIdList) {
        this.skuIdList = skuIdList;
    }

    public void setOrgIdList(List<String> orgIdList) {
        this.orgIdList = orgIdList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductSkuTagQryDTO)) {
            return false;
        }
        ProductSkuTagQryDTO other = (ProductSkuTagQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getFields(), other.getFields())) {
            return false;
        }
        String this$skuId = this.getSkuId();
        String other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) {
            return false;
        }
        List<String> this$skuIdList = this.getSkuIdList();
        List<String> other$skuIdList = other.getSkuIdList();
        if (this$skuIdList == null ? other$skuIdList != null : !((Object)this$skuIdList).equals(other$skuIdList)) {
            return false;
        }
        List<String> this$orgIdList = this.getOrgIdList();
        List<String> other$orgIdList = other.getOrgIdList();
        return !(this$orgIdList == null ? other$orgIdList != null : !((Object)this$orgIdList).equals(other$orgIdList));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof ProductSkuTagQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + Arrays.deepHashCode(this.getFields());
        String $skuId = this.getSkuId();
        result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
        List<String> $skuIdList = this.getSkuIdList();
        result = result * 59 + ($skuIdList == null ? 43 : ((Object)$skuIdList).hashCode());
        List<String> $orgIdList = this.getOrgIdList();
        result = result * 59 + ($orgIdList == null ? 43 : ((Object)$orgIdList).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ProductSkuTagQryDTO(fields=" + Arrays.deepToString(this.getFields()) + ", skuId=" + this.getSkuId() + ", skuIdList=" + this.getSkuIdList() + ", orgIdList=" + this.getOrgIdList() + ")";
    }
}

