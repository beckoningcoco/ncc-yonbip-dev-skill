/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.presentationclass;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class PresentationClassIPassTreeRequest
extends UPCPager
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    private String code;
    private Date beginTime;
    private Date endTime;
    private String sourceUnique;
    private HashMap<String, Object> characterDefine;

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public Date getBeginTime() {
        return this.beginTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public String getSourceUnique() {
        return this.sourceUnique;
    }

    public HashMap<String, Object> getCharacterDefine() {
        return this.characterDefine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setSourceUnique(String sourceUnique) {
        this.sourceUnique = sourceUnique;
    }

    public void setCharacterDefine(HashMap<String, Object> characterDefine) {
        this.characterDefine = characterDefine;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PresentationClassIPassTreeRequest)) {
            return false;
        }
        PresentationClassIPassTreeRequest other = (PresentationClassIPassTreeRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        Date this$beginTime = this.getBeginTime();
        Date other$beginTime = other.getBeginTime();
        if (this$beginTime == null ? other$beginTime != null : !((Object)this$beginTime).equals(other$beginTime)) {
            return false;
        }
        Date this$endTime = this.getEndTime();
        Date other$endTime = other.getEndTime();
        if (this$endTime == null ? other$endTime != null : !((Object)this$endTime).equals(other$endTime)) {
            return false;
        }
        String this$sourceUnique = this.getSourceUnique();
        String other$sourceUnique = other.getSourceUnique();
        if (this$sourceUnique == null ? other$sourceUnique != null : !this$sourceUnique.equals(other$sourceUnique)) {
            return false;
        }
        HashMap<String, Object> this$characterDefine = this.getCharacterDefine();
        HashMap<String, Object> other$characterDefine = other.getCharacterDefine();
        return !(this$characterDefine == null ? other$characterDefine != null : !((Object)this$characterDefine).equals(other$characterDefine));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof PresentationClassIPassTreeRequest;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        Date $beginTime = this.getBeginTime();
        result = result * 59 + ($beginTime == null ? 43 : ((Object)$beginTime).hashCode());
        Date $endTime = this.getEndTime();
        result = result * 59 + ($endTime == null ? 43 : ((Object)$endTime).hashCode());
        String $sourceUnique = this.getSourceUnique();
        result = result * 59 + ($sourceUnique == null ? 43 : $sourceUnique.hashCode());
        HashMap<String, Object> $characterDefine = this.getCharacterDefine();
        result = result * 59 + ($characterDefine == null ? 43 : ((Object)$characterDefine).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "PresentationClassIPassTreeRequest(name=" + this.getName() + ", code=" + this.getCode() + ", beginTime=" + this.getBeginTime() + ", endTime=" + this.getEndTime() + ", sourceUnique=" + this.getSourceUnique() + ", characterDefine=" + this.getCharacterDefine() + ")";
    }
}

