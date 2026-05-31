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
import java.util.Arrays;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantApplyRangeGroupQryDTO
implements Serializable {
    private String[] fields;
    private String id;
    private List<String> ids;
    private String orgId;
    private Long merchantId;
    private List<Long> merchantIds;
    private String merchantName;
    private String merchantCode;
    private Boolean detailStopStatus;
    private List<String> funcTypeList;
    private Boolean showGlobal;

    public String[] getFields() {
        return this.fields;
    }

    public String getId() {
        return this.id;
    }

    public List<String> getIds() {
        return this.ids;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public List<Long> getMerchantIds() {
        return this.merchantIds;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getMerchantCode() {
        return this.merchantCode;
    }

    public Boolean getDetailStopStatus() {
        return this.detailStopStatus;
    }

    public List<String> getFuncTypeList() {
        return this.funcTypeList;
    }

    public Boolean getShowGlobal() {
        return this.showGlobal;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantIds(List<Long> merchantIds) {
        this.merchantIds = merchantIds;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public void setDetailStopStatus(Boolean detailStopStatus) {
        this.detailStopStatus = detailStopStatus;
    }

    public void setFuncTypeList(List<String> funcTypeList) {
        this.funcTypeList = funcTypeList;
    }

    public void setShowGlobal(Boolean showGlobal) {
        this.showGlobal = showGlobal;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantApplyRangeGroupQryDTO)) {
            return false;
        }
        MerchantApplyRangeGroupQryDTO other = (MerchantApplyRangeGroupQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Boolean this$detailStopStatus = this.getDetailStopStatus();
        Boolean other$detailStopStatus = other.getDetailStopStatus();
        if (this$detailStopStatus == null ? other$detailStopStatus != null : !((Object)this$detailStopStatus).equals(other$detailStopStatus)) {
            return false;
        }
        Boolean this$showGlobal = this.getShowGlobal();
        Boolean other$showGlobal = other.getShowGlobal();
        if (this$showGlobal == null ? other$showGlobal != null : !((Object)this$showGlobal).equals(other$showGlobal)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getFields(), other.getFields())) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        List<String> this$ids = this.getIds();
        List<String> other$ids = other.getIds();
        if (this$ids == null ? other$ids != null : !((Object)this$ids).equals(other$ids)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        List<Long> this$merchantIds = this.getMerchantIds();
        List<Long> other$merchantIds = other.getMerchantIds();
        if (this$merchantIds == null ? other$merchantIds != null : !((Object)this$merchantIds).equals(other$merchantIds)) {
            return false;
        }
        String this$merchantName = this.getMerchantName();
        String other$merchantName = other.getMerchantName();
        if (this$merchantName == null ? other$merchantName != null : !this$merchantName.equals(other$merchantName)) {
            return false;
        }
        String this$merchantCode = this.getMerchantCode();
        String other$merchantCode = other.getMerchantCode();
        if (this$merchantCode == null ? other$merchantCode != null : !this$merchantCode.equals(other$merchantCode)) {
            return false;
        }
        List<String> this$funcTypeList = this.getFuncTypeList();
        List<String> other$funcTypeList = other.getFuncTypeList();
        return !(this$funcTypeList == null ? other$funcTypeList != null : !((Object)this$funcTypeList).equals(other$funcTypeList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantApplyRangeGroupQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Boolean $detailStopStatus = this.getDetailStopStatus();
        result = result * 59 + ($detailStopStatus == null ? 43 : ((Object)$detailStopStatus).hashCode());
        Boolean $showGlobal = this.getShowGlobal();
        result = result * 59 + ($showGlobal == null ? 43 : ((Object)$showGlobal).hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getFields());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        List<String> $ids = this.getIds();
        result = result * 59 + ($ids == null ? 43 : ((Object)$ids).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        List<Long> $merchantIds = this.getMerchantIds();
        result = result * 59 + ($merchantIds == null ? 43 : ((Object)$merchantIds).hashCode());
        String $merchantName = this.getMerchantName();
        result = result * 59 + ($merchantName == null ? 43 : $merchantName.hashCode());
        String $merchantCode = this.getMerchantCode();
        result = result * 59 + ($merchantCode == null ? 43 : $merchantCode.hashCode());
        List<String> $funcTypeList = this.getFuncTypeList();
        result = result * 59 + ($funcTypeList == null ? 43 : ((Object)$funcTypeList).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantApplyRangeGroupQryDTO(fields=" + Arrays.deepToString(this.getFields()) + ", id=" + this.getId() + ", ids=" + this.getIds() + ", orgId=" + this.getOrgId() + ", merchantId=" + this.getMerchantId() + ", merchantIds=" + this.getMerchantIds() + ", merchantName=" + this.getMerchantName() + ", merchantCode=" + this.getMerchantCode() + ", detailStopStatus=" + this.getDetailStopStatus() + ", funcTypeList=" + this.getFuncTypeList() + ", showGlobal=" + this.getShowGlobal() + ")";
    }
}

