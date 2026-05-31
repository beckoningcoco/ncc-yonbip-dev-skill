/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.merchantgroupdto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MultilingualDto {
    private String chinese;
    private String english;
    private String traditional;

    public String getChinese() {
        return this.chinese;
    }

    public String getEnglish() {
        return this.english;
    }

    public String getTraditional() {
        return this.traditional;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public void setTraditional(String traditional) {
        this.traditional = traditional;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MultilingualDto)) {
            return false;
        }
        MultilingualDto other = (MultilingualDto)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$chinese = this.getChinese();
        String other$chinese = other.getChinese();
        if (this$chinese == null ? other$chinese != null : !this$chinese.equals(other$chinese)) {
            return false;
        }
        String this$english = this.getEnglish();
        String other$english = other.getEnglish();
        if (this$english == null ? other$english != null : !this$english.equals(other$english)) {
            return false;
        }
        String this$traditional = this.getTraditional();
        String other$traditional = other.getTraditional();
        return !(this$traditional == null ? other$traditional != null : !this$traditional.equals(other$traditional));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MultilingualDto;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $chinese = this.getChinese();
        result = result * 59 + ($chinese == null ? 43 : $chinese.hashCode());
        String $english = this.getEnglish();
        result = result * 59 + ($english == null ? 43 : $english.hashCode());
        String $traditional = this.getTraditional();
        result = result * 59 + ($traditional == null ? 43 : $traditional.hashCode());
        return result;
    }

    public String toString() {
        return "MultilingualDto(chinese=" + this.getChinese() + ", english=" + this.getEnglish() + ", traditional=" + this.getTraditional() + ")";
    }
}

