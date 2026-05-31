/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.apdoc.sdk.dto.material;

public class SkuCompAndQryDTO {
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SkuCompAndQryDTO)) {
            return false;
        }
        SkuCompAndQryDTO other = (SkuCompAndQryDTO)o;
        return other.canEqual(this);
    }

    protected boolean canEqual(Object other) {
        return other instanceof SkuCompAndQryDTO;
    }

    public int hashCode() {
        boolean result = true;
        return 1;
    }

    public String toString() {
        return "SkuCompAndQryDTO()";
    }
}

