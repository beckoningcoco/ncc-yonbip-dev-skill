/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantListDTO
implements Serializable {
    private Long id;
    private MultilingualVO name;
    private String code;
    private Long merchantApplyRangeId;
    private String detailStopStatus;
    private String rangeOrgId;
    private Long rangeShopId;
    private String detailTransactionCurrency;
    private String detailSearchCode;

    public Long getId() {
        return this.id;
    }

    public MultilingualVO getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public Long getMerchantApplyRangeId() {
        return this.merchantApplyRangeId;
    }

    public String getDetailStopStatus() {
        return this.detailStopStatus;
    }

    public String getRangeOrgId() {
        return this.rangeOrgId;
    }

    public Long getRangeShopId() {
        return this.rangeShopId;
    }

    public String getDetailTransactionCurrency() {
        return this.detailTransactionCurrency;
    }

    public String getDetailSearchCode() {
        return this.detailSearchCode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(MultilingualVO name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMerchantApplyRangeId(Long merchantApplyRangeId) {
        this.merchantApplyRangeId = merchantApplyRangeId;
    }

    public void setDetailStopStatus(String detailStopStatus) {
        this.detailStopStatus = detailStopStatus;
    }

    public void setRangeOrgId(String rangeOrgId) {
        this.rangeOrgId = rangeOrgId;
    }

    public void setRangeShopId(Long rangeShopId) {
        this.rangeShopId = rangeShopId;
    }

    public void setDetailTransactionCurrency(String detailTransactionCurrency) {
        this.detailTransactionCurrency = detailTransactionCurrency;
    }

    public void setDetailSearchCode(String detailSearchCode) {
        this.detailSearchCode = detailSearchCode;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantListDTO)) {
            return false;
        }
        MerchantListDTO other = (MerchantListDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$merchantApplyRangeId = this.getMerchantApplyRangeId();
        Long other$merchantApplyRangeId = other.getMerchantApplyRangeId();
        if (this$merchantApplyRangeId == null ? other$merchantApplyRangeId != null : !((Object)this$merchantApplyRangeId).equals(other$merchantApplyRangeId)) {
            return false;
        }
        Long this$rangeShopId = this.getRangeShopId();
        Long other$rangeShopId = other.getRangeShopId();
        if (this$rangeShopId == null ? other$rangeShopId != null : !((Object)this$rangeShopId).equals(other$rangeShopId)) {
            return false;
        }
        MultilingualVO this$name = this.getName();
        MultilingualVO other$name = other.getName();
        if (this$name == null ? other$name != null : !((Object)this$name).equals(other$name)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$detailStopStatus = this.getDetailStopStatus();
        String other$detailStopStatus = other.getDetailStopStatus();
        if (this$detailStopStatus == null ? other$detailStopStatus != null : !this$detailStopStatus.equals(other$detailStopStatus)) {
            return false;
        }
        String this$rangeOrgId = this.getRangeOrgId();
        String other$rangeOrgId = other.getRangeOrgId();
        if (this$rangeOrgId == null ? other$rangeOrgId != null : !this$rangeOrgId.equals(other$rangeOrgId)) {
            return false;
        }
        String this$detailTransactionCurrency = this.getDetailTransactionCurrency();
        String other$detailTransactionCurrency = other.getDetailTransactionCurrency();
        if (this$detailTransactionCurrency == null ? other$detailTransactionCurrency != null : !this$detailTransactionCurrency.equals(other$detailTransactionCurrency)) {
            return false;
        }
        String this$detailSearchCode = this.getDetailSearchCode();
        String other$detailSearchCode = other.getDetailSearchCode();
        return !(this$detailSearchCode == null ? other$detailSearchCode != null : !this$detailSearchCode.equals(other$detailSearchCode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantListDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantApplyRangeId = this.getMerchantApplyRangeId();
        result = result * 59 + ($merchantApplyRangeId == null ? 43 : ((Object)$merchantApplyRangeId).hashCode());
        Long $rangeShopId = this.getRangeShopId();
        result = result * 59 + ($rangeShopId == null ? 43 : ((Object)$rangeShopId).hashCode());
        MultilingualVO $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $detailStopStatus = this.getDetailStopStatus();
        result = result * 59 + ($detailStopStatus == null ? 43 : $detailStopStatus.hashCode());
        String $rangeOrgId = this.getRangeOrgId();
        result = result * 59 + ($rangeOrgId == null ? 43 : $rangeOrgId.hashCode());
        String $detailTransactionCurrency = this.getDetailTransactionCurrency();
        result = result * 59 + ($detailTransactionCurrency == null ? 43 : $detailTransactionCurrency.hashCode());
        String $detailSearchCode = this.getDetailSearchCode();
        result = result * 59 + ($detailSearchCode == null ? 43 : $detailSearchCode.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantListDTO(id=" + this.getId() + ", name=" + this.getName() + ", code=" + this.getCode() + ", merchantApplyRangeId=" + this.getMerchantApplyRangeId() + ", detailStopStatus=" + this.getDetailStopStatus() + ", rangeOrgId=" + this.getRangeOrgId() + ", rangeShopId=" + this.getRangeShopId() + ", detailTransactionCurrency=" + this.getDetailTransactionCurrency() + ", detailSearchCode=" + this.getDetailSearchCode() + ")";
    }
}

