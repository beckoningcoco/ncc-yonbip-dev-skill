/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.BaseDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCEntityStatus;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class CharacterDTO
extends BaseDTO {
    private Long id;
    private String code;
    private String name;
    private int dataType;
    private UPCEntityStatus _status;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public int getDataType() {
        return this.dataType;
    }

    public UPCEntityStatus get_status() {
        return this._status;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

    public void set_status(UPCEntityStatus _status) {
        this._status = _status;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CharacterDTO)) {
            return false;
        }
        CharacterDTO other = (CharacterDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getDataType() != other.getDataType()) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
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
        UPCEntityStatus this$_status = this.get_status();
        UPCEntityStatus other$_status = other.get_status();
        return !(this$_status == null ? other$_status != null : !((Object)((Object)this$_status)).equals((Object)other$_status));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof CharacterDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getDataType();
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        UPCEntityStatus $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : ((Object)((Object)$_status)).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "CharacterDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", dataType=" + this.getDataType() + ", _status=" + (Object)((Object)this.get_status()) + ")";
    }
}

