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
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import java.io.Serializable;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductLineDTO
extends CoredocBaseDTO
implements Serializable {
    private Long id;
    private String code;
    private MultilingualVO name;
    private MultilingualVO remark;
    private Boolean stopStatus;
    private String pubts;
    private Map<String, Object> productLineCharacterDef;

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public MultilingualVO getName() {
        return this.name;
    }

    public MultilingualVO getRemark() {
        return this.remark;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public String getPubts() {
        return this.pubts;
    }

    public Map<String, Object> getProductLineCharacterDef() {
        return this.productLineCharacterDef;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(MultilingualVO name) {
        this.name = name;
    }

    public void setRemark(MultilingualVO remark) {
        this.remark = remark;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public void setProductLineCharacterDef(Map<String, Object> productLineCharacterDef) {
        this.productLineCharacterDef = productLineCharacterDef;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductLineDTO)) {
            return false;
        }
        ProductLineDTO other = (ProductLineDTO)o;
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
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        MultilingualVO this$name = this.getName();
        MultilingualVO other$name = other.getName();
        if (this$name == null ? other$name != null : !((Object)this$name).equals(other$name)) {
            return false;
        }
        MultilingualVO this$remark = this.getRemark();
        MultilingualVO other$remark = other.getRemark();
        if (this$remark == null ? other$remark != null : !((Object)this$remark).equals(other$remark)) {
            return false;
        }
        String this$pubts = this.getPubts();
        String other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !this$pubts.equals(other$pubts)) {
            return false;
        }
        Map<String, Object> this$productLineCharacterDef = this.getProductLineCharacterDef();
        Map<String, Object> other$productLineCharacterDef = other.getProductLineCharacterDef();
        return !(this$productLineCharacterDef == null ? other$productLineCharacterDef != null : !((Object)this$productLineCharacterDef).equals(other$productLineCharacterDef));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof ProductLineDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        MultilingualVO $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        MultilingualVO $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        String $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : $pubts.hashCode());
        Map<String, Object> $productLineCharacterDef = this.getProductLineCharacterDef();
        result = result * 59 + ($productLineCharacterDef == null ? 43 : ((Object)$productLineCharacterDef).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ProductLineDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", remark=" + this.getRemark() + ", stopStatus=" + this.getStopStatus() + ", pubts=" + this.getPubts() + ", productLineCharacterDef=" + this.getProductLineCharacterDef() + ")";
    }
}

