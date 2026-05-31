/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class CharacterValueDTO
implements Serializable {
    private Long id;
    private Long characterId;
    private String code;
    private String name;
    private Object value;
    private List<Object> valueList;

    public Long getId() {
        return this.id;
    }

    public Long getCharacterId() {
        return this.characterId;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public Object getValue() {
        return this.value;
    }

    public List<Object> getValueList() {
        return this.valueList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setValueList(List<Object> valueList) {
        this.valueList = valueList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CharacterValueDTO)) {
            return false;
        }
        CharacterValueDTO other = (CharacterValueDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$characterId = this.getCharacterId();
        Long other$characterId = other.getCharacterId();
        if (this$characterId == null ? other$characterId != null : !((Object)this$characterId).equals(other$characterId)) {
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
        Object this$value = this.getValue();
        Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) {
            return false;
        }
        List<Object> this$valueList = this.getValueList();
        List<Object> other$valueList = other.getValueList();
        return !(this$valueList == null ? other$valueList != null : !((Object)this$valueList).equals(other$valueList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof CharacterValueDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $characterId = this.getCharacterId();
        result = result * 59 + ($characterId == null ? 43 : ((Object)$characterId).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Object $value = this.getValue();
        result = result * 59 + ($value == null ? 43 : $value.hashCode());
        List<Object> $valueList = this.getValueList();
        result = result * 59 + ($valueList == null ? 43 : ((Object)$valueList).hashCode());
        return result;
    }

    public String toString() {
        return "CharacterValueDTO(id=" + this.getId() + ", characterId=" + this.getCharacterId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", value=" + this.getValue() + ", valueList=" + this.getValueList() + ")";
    }
}

