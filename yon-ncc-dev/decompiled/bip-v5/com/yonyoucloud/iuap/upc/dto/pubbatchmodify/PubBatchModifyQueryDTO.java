/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.pubbatchmodify;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.HashMap;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class PubBatchModifyQueryDTO
implements Serializable {
    private String billNum;
    private HashMap<String, Object> externalData;
    private String batchModifyEntityId;

    public String getBillNum() {
        return this.billNum;
    }

    public HashMap<String, Object> getExternalData() {
        return this.externalData;
    }

    public String getBatchModifyEntityId() {
        return this.batchModifyEntityId;
    }

    public void setBillNum(String billNum) {
        this.billNum = billNum;
    }

    public void setExternalData(HashMap<String, Object> externalData) {
        this.externalData = externalData;
    }

    public void setBatchModifyEntityId(String batchModifyEntityId) {
        this.batchModifyEntityId = batchModifyEntityId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PubBatchModifyQueryDTO)) {
            return false;
        }
        PubBatchModifyQueryDTO other = (PubBatchModifyQueryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$billNum = this.getBillNum();
        String other$billNum = other.getBillNum();
        if (this$billNum == null ? other$billNum != null : !this$billNum.equals(other$billNum)) {
            return false;
        }
        HashMap<String, Object> this$externalData = this.getExternalData();
        HashMap<String, Object> other$externalData = other.getExternalData();
        if (this$externalData == null ? other$externalData != null : !((Object)this$externalData).equals(other$externalData)) {
            return false;
        }
        String this$batchModifyEntityId = this.getBatchModifyEntityId();
        String other$batchModifyEntityId = other.getBatchModifyEntityId();
        return !(this$batchModifyEntityId == null ? other$batchModifyEntityId != null : !this$batchModifyEntityId.equals(other$batchModifyEntityId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PubBatchModifyQueryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $billNum = this.getBillNum();
        result = result * 59 + ($billNum == null ? 43 : $billNum.hashCode());
        HashMap<String, Object> $externalData = this.getExternalData();
        result = result * 59 + ($externalData == null ? 43 : ((Object)$externalData).hashCode());
        String $batchModifyEntityId = this.getBatchModifyEntityId();
        result = result * 59 + ($batchModifyEntityId == null ? 43 : $batchModifyEntityId.hashCode());
        return result;
    }

    public String toString() {
        return "PubBatchModifyQueryDTO(billNum=" + this.getBillNum() + ", externalData=" + this.getExternalData() + ", batchModifyEntityId=" + this.getBatchModifyEntityId() + ")";
    }
}

