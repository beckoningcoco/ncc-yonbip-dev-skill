/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class QueryFieldMappingVo {
    ApiTypeEnum apiTypeEnum;
    Billnum billnum;
    String apiKey;

    public ApiTypeEnum getApiTypeEnum() {
        return this.apiTypeEnum;
    }

    public Billnum getBillnum() {
        return this.billnum;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public void setApiTypeEnum(ApiTypeEnum apiTypeEnum) {
        this.apiTypeEnum = apiTypeEnum;
    }

    public void setBillnum(Billnum billnum) {
        this.billnum = billnum;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof QueryFieldMappingVo)) {
            return false;
        }
        QueryFieldMappingVo other = (QueryFieldMappingVo)o;
        if (!other.canEqual(this)) {
            return false;
        }
        ApiTypeEnum this$apiTypeEnum = this.getApiTypeEnum();
        ApiTypeEnum other$apiTypeEnum = other.getApiTypeEnum();
        if (this$apiTypeEnum == null ? other$apiTypeEnum != null : !((Object)((Object)this$apiTypeEnum)).equals((Object)other$apiTypeEnum)) {
            return false;
        }
        Billnum this$billnum = this.getBillnum();
        Billnum other$billnum = other.getBillnum();
        if (this$billnum == null ? other$billnum != null : !((Object)((Object)this$billnum)).equals((Object)other$billnum)) {
            return false;
        }
        String this$apiKey = this.getApiKey();
        String other$apiKey = other.getApiKey();
        return !(this$apiKey == null ? other$apiKey != null : !this$apiKey.equals(other$apiKey));
    }

    protected boolean canEqual(Object other) {
        return other instanceof QueryFieldMappingVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        ApiTypeEnum $apiTypeEnum = this.getApiTypeEnum();
        result = result * 59 + ($apiTypeEnum == null ? 43 : ((Object)((Object)$apiTypeEnum)).hashCode());
        Billnum $billnum = this.getBillnum();
        result = result * 59 + ($billnum == null ? 43 : ((Object)((Object)$billnum)).hashCode());
        String $apiKey = this.getApiKey();
        result = result * 59 + ($apiKey == null ? 43 : $apiKey.hashCode());
        return result;
    }

    public String toString() {
        return "QueryFieldMappingVo(apiTypeEnum=" + (Object)((Object)this.getApiTypeEnum()) + ", billnum=" + (Object)((Object)this.getBillnum()) + ", apiKey=" + this.getApiKey() + ")";
    }

    public static enum ApiTypeEnum {
        API(1),
        REF(2);

        private Integer code;

        private ApiTypeEnum(Integer code) {
            this.code = code;
        }

        public int getCode() {
            return this.code;
        }
    }

    public static enum Billnum {
        PRODUCT("product"),
        PRODUCT_BASE("product_base"),
        MATERIAL_CLASS("materialClass"),
        SKU("sku"),
        MERCHANT("merchant"),
        MERCHANT_BASE("merchant_base");

        private String billnum;

        private Billnum(String billnum) {
            this.billnum = billnum;
        }

        public String getBillnum() {
            return this.billnum;
        }
    }
}

