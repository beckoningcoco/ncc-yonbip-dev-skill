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
public class MerchantDerivativeBaseQryDTO
extends UPCPager
implements Serializable {
    private String[] fields;
    private Long id;
    private List<Long> ids;
    private String code;
    private List<String> codeList;
    private String fuzzyCode;
    private String name;
    private String fuzzyName;
    private String fuzzyNameAndCode;
    private String shopId;
    private String taxRateId;

    public String[] getFields() {
        return this.fields;
    }

    public Long getId() {
        return this.id;
    }

    public List<Long> getIds() {
        return this.ids;
    }

    public String getCode() {
        return this.code;
    }

    public List<String> getCodeList() {
        return this.codeList;
    }

    public String getFuzzyCode() {
        return this.fuzzyCode;
    }

    public String getName() {
        return this.name;
    }

    public String getFuzzyName() {
        return this.fuzzyName;
    }

    public String getFuzzyNameAndCode() {
        return this.fuzzyNameAndCode;
    }

    public String getShopId() {
        return this.shopId;
    }

    public String getTaxRateId() {
        return this.taxRateId;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }

    public void setFuzzyCode(String fuzzyCode) {
        this.fuzzyCode = fuzzyCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFuzzyName(String fuzzyName) {
        this.fuzzyName = fuzzyName;
    }

    public void setFuzzyNameAndCode(String fuzzyNameAndCode) {
        this.fuzzyNameAndCode = fuzzyNameAndCode;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public void setTaxRateId(String taxRateId) {
        this.taxRateId = taxRateId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantDerivativeBaseQryDTO)) {
            return false;
        }
        MerchantDerivativeBaseQryDTO other = (MerchantDerivativeBaseQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getFields(), other.getFields())) {
            return false;
        }
        List<Long> this$ids = this.getIds();
        List<Long> other$ids = other.getIds();
        if (this$ids == null ? other$ids != null : !((Object)this$ids).equals(other$ids)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        List<String> this$codeList = this.getCodeList();
        List<String> other$codeList = other.getCodeList();
        if (this$codeList == null ? other$codeList != null : !((Object)this$codeList).equals(other$codeList)) {
            return false;
        }
        String this$fuzzyCode = this.getFuzzyCode();
        String other$fuzzyCode = other.getFuzzyCode();
        if (this$fuzzyCode == null ? other$fuzzyCode != null : !this$fuzzyCode.equals(other$fuzzyCode)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$fuzzyName = this.getFuzzyName();
        String other$fuzzyName = other.getFuzzyName();
        if (this$fuzzyName == null ? other$fuzzyName != null : !this$fuzzyName.equals(other$fuzzyName)) {
            return false;
        }
        String this$fuzzyNameAndCode = this.getFuzzyNameAndCode();
        String other$fuzzyNameAndCode = other.getFuzzyNameAndCode();
        if (this$fuzzyNameAndCode == null ? other$fuzzyNameAndCode != null : !this$fuzzyNameAndCode.equals(other$fuzzyNameAndCode)) {
            return false;
        }
        String this$shopId = this.getShopId();
        String other$shopId = other.getShopId();
        if (this$shopId == null ? other$shopId != null : !this$shopId.equals(other$shopId)) {
            return false;
        }
        String this$taxRateId = this.getTaxRateId();
        String other$taxRateId = other.getTaxRateId();
        return !(this$taxRateId == null ? other$taxRateId != null : !this$taxRateId.equals(other$taxRateId));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof MerchantDerivativeBaseQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getFields());
        List<Long> $ids = this.getIds();
        result = result * 59 + ($ids == null ? 43 : ((Object)$ids).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        List<String> $codeList = this.getCodeList();
        result = result * 59 + ($codeList == null ? 43 : ((Object)$codeList).hashCode());
        String $fuzzyCode = this.getFuzzyCode();
        result = result * 59 + ($fuzzyCode == null ? 43 : $fuzzyCode.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $fuzzyName = this.getFuzzyName();
        result = result * 59 + ($fuzzyName == null ? 43 : $fuzzyName.hashCode());
        String $fuzzyNameAndCode = this.getFuzzyNameAndCode();
        result = result * 59 + ($fuzzyNameAndCode == null ? 43 : $fuzzyNameAndCode.hashCode());
        String $shopId = this.getShopId();
        result = result * 59 + ($shopId == null ? 43 : $shopId.hashCode());
        String $taxRateId = this.getTaxRateId();
        result = result * 59 + ($taxRateId == null ? 43 : $taxRateId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MerchantDerivativeBaseQryDTO(fields=" + Arrays.deepToString(this.getFields()) + ", id=" + this.getId() + ", ids=" + this.getIds() + ", code=" + this.getCode() + ", codeList=" + this.getCodeList() + ", fuzzyCode=" + this.getFuzzyCode() + ", name=" + this.getName() + ", fuzzyName=" + this.getFuzzyName() + ", fuzzyNameAndCode=" + this.getFuzzyNameAndCode() + ", shopId=" + this.getShopId() + ", taxRateId=" + this.getTaxRateId() + ")";
    }
}

