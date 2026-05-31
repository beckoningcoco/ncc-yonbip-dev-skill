/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.derivatives;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.common.CoredocBaseDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.UnitDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import java.io.Serializable;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class UnitGroupDTO
extends CoredocBaseDTO
implements Serializable {
    private Long id;
    private MultilingualVO name;
    private String code;
    private String desc;
    private Boolean stopStatus;
    private List<UnitDTO> unitDTOList;

    public Long getId() {
        return this.id;
    }

    public MultilingualVO getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public List<UnitDTO> getUnitDTOList() {
        return this.unitDTOList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(MultilingualVO name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setUnitDTOList(List<UnitDTO> unitDTOList) {
        this.unitDTOList = unitDTOList;
    }

    @Override
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
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        MultilingualVO this$name = this.getName();
        MultilingualVO other$name = other.getName();
        if (this$name == null ? other$name != null : !((Object)this$name).equals(other$name)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$desc = this.getDesc();
        String other$desc = other.getDesc();
        if (this$desc == null ? other$desc != null : !this$desc.equals(other$desc)) {
            return false;
        }
        List<UnitDTO> this$unitDTOList = this.getUnitDTOList();
        List<UnitDTO> other$unitDTOList = other.getUnitDTOList();
        return !(this$unitDTOList == null ? other$unitDTOList != null : !((Object)this$unitDTOList).equals(other$unitDTOList));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof UnitGroupDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        MultilingualVO $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $desc = this.getDesc();
        result = result * 59 + ($desc == null ? 43 : $desc.hashCode());
        List<UnitDTO> $unitDTOList = this.getUnitDTOList();
        result = result * 59 + ($unitDTOList == null ? 43 : ((Object)$unitDTOList).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "UnitGroupDTO(id=" + this.getId() + ", name=" + this.getName() + ", code=" + this.getCode() + ", desc=" + this.getDesc() + ", stopStatus=" + this.getStopStatus() + ", unitDTOList=" + this.getUnitDTOList() + ")";
    }
}

