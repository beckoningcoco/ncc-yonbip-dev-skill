/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.yonyou.iuap.international.MultiLangText
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.international.MultiLangText;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class UnitGroupDTO
implements Serializable {
    private Long id;
    @Deprecated
    private String name;
    private MultiLangText name_multiLangText;
    private String code;
    private String desc;

    public Long getId() {
        return this.id;
    }

    @Deprecated
    public String getName() {
        return this.name;
    }

    public MultiLangText getName_multiLangText() {
        return this.name_multiLangText;
    }

    public String getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Deprecated
    public void setName(String name) {
        this.name = name;
    }

    public void setName_multiLangText(MultiLangText name_multiLangText) {
        this.name_multiLangText = name_multiLangText;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UnitGroupDTO)) {
            return false;
        }
        UnitGroupDTO other = (UnitGroupDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        MultiLangText this$name_multiLangText = this.getName_multiLangText();
        MultiLangText other$name_multiLangText = other.getName_multiLangText();
        if (this$name_multiLangText == null ? other$name_multiLangText != null : !this$name_multiLangText.equals(other$name_multiLangText)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$desc = this.getDesc();
        String other$desc = other.getDesc();
        return !(this$desc == null ? other$desc != null : !this$desc.equals(other$desc));
    }

    protected boolean canEqual(Object other) {
        return other instanceof UnitGroupDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        MultiLangText $name_multiLangText = this.getName_multiLangText();
        result = result * 59 + ($name_multiLangText == null ? 43 : $name_multiLangText.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $desc = this.getDesc();
        result = result * 59 + ($desc == null ? 43 : $desc.hashCode());
        return result;
    }

    public String toString() {
        return "UnitGroupDTO(id=" + this.getId() + ", name=" + this.getName() + ", name_multiLangText=" + this.getName_multiLangText() + ", code=" + this.getCode() + ", desc=" + this.getDesc() + ")";
    }
}

