/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.upc.merge.model;

public class BillInfo {
    private String code;
    private String name;
    private String suggestion;

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getSuggestion() {
        return this.suggestion;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BillInfo)) {
            return false;
        }
        BillInfo other = (BillInfo)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$suggestion = this.getSuggestion();
        String other$suggestion = other.getSuggestion();
        return !(this$suggestion == null ? other$suggestion != null : !this$suggestion.equals(other$suggestion));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BillInfo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $suggestion = this.getSuggestion();
        result = result * 59 + ($suggestion == null ? 43 : $suggestion.hashCode());
        return result;
    }

    public String toString() {
        return "BillInfo(code=" + this.getCode() + ", name=" + this.getName() + ", suggestion=" + this.getSuggestion() + ")";
    }
}

