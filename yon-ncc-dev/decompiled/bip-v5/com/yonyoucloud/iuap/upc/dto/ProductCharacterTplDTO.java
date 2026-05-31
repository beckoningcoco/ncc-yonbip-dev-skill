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

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductCharacterTplDTO
implements Serializable {
    private Long id;
    private Long tplId;
    private Long characteristicsTypeId;
    private Long characteristicsId;
    private Long characterId;
    private String characterCode;
    private Integer dataType;
    private Long tenantId;
    private String ytenantId;

    public Long getId() {
        return this.id;
    }

    public Long getTplId() {
        return this.tplId;
    }

    public Long getCharacteristicsTypeId() {
        return this.characteristicsTypeId;
    }

    public Long getCharacteristicsId() {
        return this.characteristicsId;
    }

    public Long getCharacterId() {
        return this.characterId;
    }

    public String getCharacterCode() {
        return this.characterCode;
    }

    public Integer getDataType() {
        return this.dataType;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public String getYtenantId() {
        return this.ytenantId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTplId(Long tplId) {
        this.tplId = tplId;
    }

    public void setCharacteristicsTypeId(Long characteristicsTypeId) {
        this.characteristicsTypeId = characteristicsTypeId;
    }

    public void setCharacteristicsId(Long characteristicsId) {
        this.characteristicsId = characteristicsId;
    }

    public void setCharacterId(Long characterId) {
        this.characterId = characterId;
    }

    public void setCharacterCode(String characterCode) {
        this.characterCode = characterCode;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public void setYtenantId(String ytenantId) {
        this.ytenantId = ytenantId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductCharacterTplDTO)) {
            return false;
        }
        ProductCharacterTplDTO other = (ProductCharacterTplDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$tplId = this.getTplId();
        Long other$tplId = other.getTplId();
        if (this$tplId == null ? other$tplId != null : !((Object)this$tplId).equals(other$tplId)) {
            return false;
        }
        Long this$characteristicsTypeId = this.getCharacteristicsTypeId();
        Long other$characteristicsTypeId = other.getCharacteristicsTypeId();
        if (this$characteristicsTypeId == null ? other$characteristicsTypeId != null : !((Object)this$characteristicsTypeId).equals(other$characteristicsTypeId)) {
            return false;
        }
        Long this$characteristicsId = this.getCharacteristicsId();
        Long other$characteristicsId = other.getCharacteristicsId();
        if (this$characteristicsId == null ? other$characteristicsId != null : !((Object)this$characteristicsId).equals(other$characteristicsId)) {
            return false;
        }
        Long this$characterId = this.getCharacterId();
        Long other$characterId = other.getCharacterId();
        if (this$characterId == null ? other$characterId != null : !((Object)this$characterId).equals(other$characterId)) {
            return false;
        }
        Integer this$dataType = this.getDataType();
        Integer other$dataType = other.getDataType();
        if (this$dataType == null ? other$dataType != null : !((Object)this$dataType).equals(other$dataType)) {
            return false;
        }
        Long this$tenantId = this.getTenantId();
        Long other$tenantId = other.getTenantId();
        if (this$tenantId == null ? other$tenantId != null : !((Object)this$tenantId).equals(other$tenantId)) {
            return false;
        }
        String this$characterCode = this.getCharacterCode();
        String other$characterCode = other.getCharacterCode();
        if (this$characterCode == null ? other$characterCode != null : !this$characterCode.equals(other$characterCode)) {
            return false;
        }
        String this$ytenantId = this.getYtenantId();
        String other$ytenantId = other.getYtenantId();
        return !(this$ytenantId == null ? other$ytenantId != null : !this$ytenantId.equals(other$ytenantId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductCharacterTplDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $tplId = this.getTplId();
        result = result * 59 + ($tplId == null ? 43 : ((Object)$tplId).hashCode());
        Long $characteristicsTypeId = this.getCharacteristicsTypeId();
        result = result * 59 + ($characteristicsTypeId == null ? 43 : ((Object)$characteristicsTypeId).hashCode());
        Long $characteristicsId = this.getCharacteristicsId();
        result = result * 59 + ($characteristicsId == null ? 43 : ((Object)$characteristicsId).hashCode());
        Long $characterId = this.getCharacterId();
        result = result * 59 + ($characterId == null ? 43 : ((Object)$characterId).hashCode());
        Integer $dataType = this.getDataType();
        result = result * 59 + ($dataType == null ? 43 : ((Object)$dataType).hashCode());
        Long $tenantId = this.getTenantId();
        result = result * 59 + ($tenantId == null ? 43 : ((Object)$tenantId).hashCode());
        String $characterCode = this.getCharacterCode();
        result = result * 59 + ($characterCode == null ? 43 : $characterCode.hashCode());
        String $ytenantId = this.getYtenantId();
        result = result * 59 + ($ytenantId == null ? 43 : $ytenantId.hashCode());
        return result;
    }

    public String toString() {
        return "ProductCharacterTplDTO(id=" + this.getId() + ", tplId=" + this.getTplId() + ", characteristicsTypeId=" + this.getCharacteristicsTypeId() + ", characteristicsId=" + this.getCharacteristicsId() + ", characterId=" + this.getCharacterId() + ", characterCode=" + this.getCharacterCode() + ", dataType=" + this.getDataType() + ", tenantId=" + this.getTenantId() + ", ytenantId=" + this.getYtenantId() + ")";
    }
}

