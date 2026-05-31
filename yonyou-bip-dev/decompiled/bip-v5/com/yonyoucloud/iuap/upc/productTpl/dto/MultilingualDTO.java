/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.productTpl.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MultilingualDTO {
    private String simplifiedName;
    private String englishName;
    private String traditionalName;

    public String getSimplifiedName() {
        return this.simplifiedName;
    }

    public String getEnglishName() {
        return this.englishName;
    }

    public String getTraditionalName() {
        return this.traditionalName;
    }

    public void setSimplifiedName(String simplifiedName) {
        this.simplifiedName = simplifiedName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public void setTraditionalName(String traditionalName) {
        this.traditionalName = traditionalName;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MultilingualDTO)) {
            return false;
        }
        MultilingualDTO other = (MultilingualDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$simplifiedName = this.getSimplifiedName();
        String other$simplifiedName = other.getSimplifiedName();
        if (this$simplifiedName == null ? other$simplifiedName != null : !this$simplifiedName.equals(other$simplifiedName)) {
            return false;
        }
        String this$englishName = this.getEnglishName();
        String other$englishName = other.getEnglishName();
        if (this$englishName == null ? other$englishName != null : !this$englishName.equals(other$englishName)) {
            return false;
        }
        String this$traditionalName = this.getTraditionalName();
        String other$traditionalName = other.getTraditionalName();
        return !(this$traditionalName == null ? other$traditionalName != null : !this$traditionalName.equals(other$traditionalName));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MultilingualDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $simplifiedName = this.getSimplifiedName();
        result = result * 59 + ($simplifiedName == null ? 43 : $simplifiedName.hashCode());
        String $englishName = this.getEnglishName();
        result = result * 59 + ($englishName == null ? 43 : $englishName.hashCode());
        String $traditionalName = this.getTraditionalName();
        result = result * 59 + ($traditionalName == null ? 43 : $traditionalName.hashCode());
        return result;
    }

    public String toString() {
        return "MultilingualDTO(simplifiedName=" + this.getSimplifiedName() + ", englishName=" + this.getEnglishName() + ", traditionalName=" + this.getTraditionalName() + ")";
    }
}

