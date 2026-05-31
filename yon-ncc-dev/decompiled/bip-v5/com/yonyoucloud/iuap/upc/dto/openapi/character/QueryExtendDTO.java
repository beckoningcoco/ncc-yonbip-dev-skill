/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.openapi.character;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import java.io.Serializable;
import java.util.HashMap;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class QueryExtendDTO
extends UPCPager
implements Serializable {
    private HashMap<String, Object> characterDefine;

    public HashMap<String, Object> getCharacterDefine() {
        return this.characterDefine;
    }

    public void setCharacterDefine(HashMap<String, Object> characterDefine) {
        this.characterDefine = characterDefine;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof QueryExtendDTO)) {
            return false;
        }
        QueryExtendDTO other = (QueryExtendDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        HashMap<String, Object> this$characterDefine = this.getCharacterDefine();
        HashMap<String, Object> other$characterDefine = other.getCharacterDefine();
        return !(this$characterDefine == null ? other$characterDefine != null : !((Object)this$characterDefine).equals(other$characterDefine));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof QueryExtendDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        HashMap<String, Object> $characterDefine = this.getCharacterDefine();
        result = result * 59 + ($characterDefine == null ? 43 : ((Object)$characterDefine).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "QueryExtendDTO(characterDefine=" + this.getCharacterDefine() + ")";
    }
}

