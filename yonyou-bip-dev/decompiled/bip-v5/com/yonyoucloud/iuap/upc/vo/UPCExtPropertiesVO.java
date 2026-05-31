/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class UPCExtPropertiesVO
implements Serializable {
    private Map<String, Object> customExtend;

    public Map<String, Object> getCustomExtend() {
        return this.customExtend;
    }

    public void setCustomExtend(Map<String, Object> customExtend) {
        this.customExtend = customExtend;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof UPCExtPropertiesVO)) {
            return false;
        }
        UPCExtPropertiesVO other = (UPCExtPropertiesVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Map<String, Object> this$customExtend = this.getCustomExtend();
        Map<String, Object> other$customExtend = other.getCustomExtend();
        return !(this$customExtend == null ? other$customExtend != null : !((Object)this$customExtend).equals(other$customExtend));
    }

    protected boolean canEqual(Object other) {
        return other instanceof UPCExtPropertiesVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Map<String, Object> $customExtend = this.getCustomExtend();
        result = result * 59 + ($customExtend == null ? 43 : ((Object)$customExtend).hashCode());
        return result;
    }

    public String toString() {
        return "UPCExtPropertiesVO(customExtend=" + this.getCustomExtend() + ")";
    }
}

