/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.derivatives;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.apdoc.sdk.dto.pub.BaseQueryVO;
import java.io.Serializable;
import java.util.Date;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class UnitQryDTO
extends BaseQueryVO
implements Serializable {
    private Long id;
    private String code;
    private String name;
    private Date beganTime;

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

    public Date getBeganTime() {
        return this.beganTime;
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

    public void setBeganTime(Date beganTime) {
        this.beganTime = beganTime;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UnitQryDTO)) {
            return false;
        }
        UnitQryDTO other = (UnitQryDTO)o;
        if (!other.canEqual(this)) {
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
        Date this$beganTime = this.getBeganTime();
        Date other$beganTime = other.getBeganTime();
        return !(this$beganTime == null ? other$beganTime != null : !((Object)this$beganTime).equals(other$beganTime));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof UnitQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        Date $beganTime = this.getBeganTime();
        result = result * 59 + ($beganTime == null ? 43 : ((Object)$beganTime).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "UnitQryDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", beganTime=" + this.getBeganTime() + ")";
    }
}

