/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.product;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class IpassMultilingual {
    private static final long serialVersionUID = 1L;
    private String zh_CN;
    private String en_US;
    private String zh_TW;

    public String getZh_CN() {
        return this.zh_CN;
    }

    public String getEn_US() {
        return this.en_US;
    }

    public String getZh_TW() {
        return this.zh_TW;
    }

    public void setZh_CN(String zh_CN) {
        this.zh_CN = zh_CN;
    }

    public void setEn_US(String en_US) {
        this.en_US = en_US;
    }

    public void setZh_TW(String zh_TW) {
        this.zh_TW = zh_TW;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof IpassMultilingual)) {
            return false;
        }
        IpassMultilingual other = (IpassMultilingual)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$zh_CN = this.getZh_CN();
        String other$zh_CN = other.getZh_CN();
        if (this$zh_CN == null ? other$zh_CN != null : !this$zh_CN.equals(other$zh_CN)) {
            return false;
        }
        String this$en_US = this.getEn_US();
        String other$en_US = other.getEn_US();
        if (this$en_US == null ? other$en_US != null : !this$en_US.equals(other$en_US)) {
            return false;
        }
        String this$zh_TW = this.getZh_TW();
        String other$zh_TW = other.getZh_TW();
        return !(this$zh_TW == null ? other$zh_TW != null : !this$zh_TW.equals(other$zh_TW));
    }

    protected boolean canEqual(Object other) {
        return other instanceof IpassMultilingual;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $zh_CN = this.getZh_CN();
        result = result * 59 + ($zh_CN == null ? 43 : $zh_CN.hashCode());
        String $en_US = this.getEn_US();
        result = result * 59 + ($en_US == null ? 43 : $en_US.hashCode());
        String $zh_TW = this.getZh_TW();
        result = result * 59 + ($zh_TW == null ? 43 : $zh_TW.hashCode());
        return result;
    }

    public String toString() {
        return "IpassMultilingual(zh_CN=" + this.getZh_CN() + ", en_US=" + this.getEn_US() + ", zh_TW=" + this.getZh_TW() + ")";
    }
}

