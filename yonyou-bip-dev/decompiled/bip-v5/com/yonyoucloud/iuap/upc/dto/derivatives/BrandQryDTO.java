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
import java.util.HashMap;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class BrandQryDTO
extends BaseQueryVO
implements Serializable {
    private Long id;
    private String code;
    private String name;
    private String randKeywords;
    private Long brandClass;
    private String brandClassCode;
    private Date beganTime;
    private HashMap<String, Object> characterDefine;

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

    public String getRandKeywords() {
        return this.randKeywords;
    }

    public Long getBrandClass() {
        return this.brandClass;
    }

    public String getBrandClassCode() {
        return this.brandClassCode;
    }

    public Date getBeganTime() {
        return this.beganTime;
    }

    public HashMap<String, Object> getCharacterDefine() {
        return this.characterDefine;
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

    public void setRandKeywords(String randKeywords) {
        this.randKeywords = randKeywords;
    }

    public void setBrandClass(Long brandClass) {
        this.brandClass = brandClass;
    }

    public void setBrandClassCode(String brandClassCode) {
        this.brandClassCode = brandClassCode;
    }

    public void setBeganTime(Date beganTime) {
        this.beganTime = beganTime;
    }

    public void setCharacterDefine(HashMap<String, Object> characterDefine) {
        this.characterDefine = characterDefine;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BrandQryDTO)) {
            return false;
        }
        BrandQryDTO other = (BrandQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$brandClass = this.getBrandClass();
        Long other$brandClass = other.getBrandClass();
        if (this$brandClass == null ? other$brandClass != null : !((Object)this$brandClass).equals(other$brandClass)) {
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
        String this$randKeywords = this.getRandKeywords();
        String other$randKeywords = other.getRandKeywords();
        if (this$randKeywords == null ? other$randKeywords != null : !this$randKeywords.equals(other$randKeywords)) {
            return false;
        }
        String this$brandClassCode = this.getBrandClassCode();
        String other$brandClassCode = other.getBrandClassCode();
        if (this$brandClassCode == null ? other$brandClassCode != null : !this$brandClassCode.equals(other$brandClassCode)) {
            return false;
        }
        Date this$beganTime = this.getBeganTime();
        Date other$beganTime = other.getBeganTime();
        if (this$beganTime == null ? other$beganTime != null : !((Object)this$beganTime).equals(other$beganTime)) {
            return false;
        }
        HashMap<String, Object> this$characterDefine = this.getCharacterDefine();
        HashMap<String, Object> other$characterDefine = other.getCharacterDefine();
        return !(this$characterDefine == null ? other$characterDefine != null : !((Object)this$characterDefine).equals(other$characterDefine));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof BrandQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $brandClass = this.getBrandClass();
        result = result * 59 + ($brandClass == null ? 43 : ((Object)$brandClass).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $randKeywords = this.getRandKeywords();
        result = result * 59 + ($randKeywords == null ? 43 : $randKeywords.hashCode());
        String $brandClassCode = this.getBrandClassCode();
        result = result * 59 + ($brandClassCode == null ? 43 : $brandClassCode.hashCode());
        Date $beganTime = this.getBeganTime();
        result = result * 59 + ($beganTime == null ? 43 : ((Object)$beganTime).hashCode());
        HashMap<String, Object> $characterDefine = this.getCharacterDefine();
        result = result * 59 + ($characterDefine == null ? 43 : ((Object)$characterDefine).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "BrandQryDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", randKeywords=" + this.getRandKeywords() + ", brandClass=" + this.getBrandClass() + ", brandClassCode=" + this.getBrandClassCode() + ", beganTime=" + this.getBeganTime() + ", characterDefine=" + this.getCharacterDefine() + ")";
    }
}

