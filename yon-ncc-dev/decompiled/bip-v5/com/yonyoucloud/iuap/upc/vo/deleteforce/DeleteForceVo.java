/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo.deleteforce;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.vo.deleteforce.DeleteForceDataVo;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class DeleteForceVo {
    private String fullname;
    private List<String> successCodes;
    private List<DeleteForceDataVo> deleteForceDataVos;
    private Short opType;
    private String batchcode;

    public String getBatchcode() {
        return this.batchcode;
    }

    public void setBatchcode(String batchcode) {
        this.batchcode = batchcode;
    }

    public String getFullname() {
        return this.fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public List<String> getSuccessCodes() {
        return this.successCodes;
    }

    public void setSuccessCodes(List<String> successCodes) {
        this.successCodes = successCodes;
    }

    public List<DeleteForceDataVo> getDeleteForceDataVos() {
        return this.deleteForceDataVos;
    }

    public void setDeleteForceDataVos(List<DeleteForceDataVo> deleteForceDataVos) {
        this.deleteForceDataVos = deleteForceDataVos;
    }

    public Short getOpType() {
        return this.opType;
    }

    public void setOpType(Short opType) {
        this.opType = opType;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DeleteForceVo)) {
            return false;
        }
        DeleteForceVo other = (DeleteForceVo)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Short this$opType = this.getOpType();
        Short other$opType = other.getOpType();
        if (this$opType == null ? other$opType != null : !((Object)this$opType).equals(other$opType)) {
            return false;
        }
        String this$fullname = this.getFullname();
        String other$fullname = other.getFullname();
        if (this$fullname == null ? other$fullname != null : !this$fullname.equals(other$fullname)) {
            return false;
        }
        List<String> this$successCodes = this.getSuccessCodes();
        List<String> other$successCodes = other.getSuccessCodes();
        if (this$successCodes == null ? other$successCodes != null : !((Object)this$successCodes).equals(other$successCodes)) {
            return false;
        }
        List<DeleteForceDataVo> this$deleteForceDataVos = this.getDeleteForceDataVos();
        List<DeleteForceDataVo> other$deleteForceDataVos = other.getDeleteForceDataVos();
        if (this$deleteForceDataVos == null ? other$deleteForceDataVos != null : !((Object)this$deleteForceDataVos).equals(other$deleteForceDataVos)) {
            return false;
        }
        String this$batchcode = this.getBatchcode();
        String other$batchcode = other.getBatchcode();
        return !(this$batchcode == null ? other$batchcode != null : !this$batchcode.equals(other$batchcode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof DeleteForceVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Short $opType = this.getOpType();
        result = result * 59 + ($opType == null ? 43 : ((Object)$opType).hashCode());
        String $fullname = this.getFullname();
        result = result * 59 + ($fullname == null ? 43 : $fullname.hashCode());
        List<String> $successCodes = this.getSuccessCodes();
        result = result * 59 + ($successCodes == null ? 43 : ((Object)$successCodes).hashCode());
        List<DeleteForceDataVo> $deleteForceDataVos = this.getDeleteForceDataVos();
        result = result * 59 + ($deleteForceDataVos == null ? 43 : ((Object)$deleteForceDataVos).hashCode());
        String $batchcode = this.getBatchcode();
        result = result * 59 + ($batchcode == null ? 43 : $batchcode.hashCode());
        return result;
    }

    public String toString() {
        return "DeleteForceVo(fullname=" + this.getFullname() + ", successCodes=" + this.getSuccessCodes() + ", deleteForceDataVos=" + this.getDeleteForceDataVos() + ", opType=" + this.getOpType() + ", batchcode=" + this.getBatchcode() + ")";
    }
}

