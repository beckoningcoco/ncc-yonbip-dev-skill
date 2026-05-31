/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class CoredocBaseDTO
extends UPCPager
implements Serializable {
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CoredocBaseDTO)) {
            return false;
        }
        CoredocBaseDTO other = (CoredocBaseDTO)o;
        return other.canEqual(this);
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof CoredocBaseDTO;
    }

    @Override
    public int hashCode() {
        boolean result = true;
        return 1;
    }

    @Override
    public String toString() {
        return "CoredocBaseDTO()";
    }
}

