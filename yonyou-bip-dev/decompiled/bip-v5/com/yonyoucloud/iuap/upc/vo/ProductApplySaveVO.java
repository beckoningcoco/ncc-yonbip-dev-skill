/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.vo.ProductApplyDetailSaveVO;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductApplySaveVO {
    private ProductApplyDetailSaveVO detail;
    private String id;
    private String code;
    private String orgId_Code;
    private String orgId;
    private String belogOrg_Code;
    private String belogOrg;

    public ProductApplyDetailSaveVO getDetail() {
        return this.detail;
    }

    public void setDetail(ProductApplyDetailSaveVO detail) {
        this.detail = detail;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getOrgId_Code() {
        return this.orgId_Code;
    }

    public void setOrgId_Code(String orgId_Code) {
        this.orgId_Code = orgId_Code;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getBelogOrg_Code() {
        return this.belogOrg_Code;
    }

    public void setBelogOrg_Code(String belogOrg_Code) {
        this.belogOrg_Code = belogOrg_Code;
    }

    public String getBelogOrg() {
        return this.belogOrg;
    }

    public void setBelogOrg(String belogOrg) {
        this.belogOrg = belogOrg;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductApplySaveVO)) {
            return false;
        }
        ProductApplySaveVO other = (ProductApplySaveVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        ProductApplyDetailSaveVO this$detail = this.getDetail();
        ProductApplyDetailSaveVO other$detail = other.getDetail();
        if (this$detail == null ? other$detail != null : !((Object)this$detail).equals(other$detail)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$orgId_Code = this.getOrgId_Code();
        String other$orgId_Code = other.getOrgId_Code();
        if (this$orgId_Code == null ? other$orgId_Code != null : !this$orgId_Code.equals(other$orgId_Code)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$belogOrg_Code = this.getBelogOrg_Code();
        String other$belogOrg_Code = other.getBelogOrg_Code();
        if (this$belogOrg_Code == null ? other$belogOrg_Code != null : !this$belogOrg_Code.equals(other$belogOrg_Code)) {
            return false;
        }
        String this$belogOrg = this.getBelogOrg();
        String other$belogOrg = other.getBelogOrg();
        return !(this$belogOrg == null ? other$belogOrg != null : !this$belogOrg.equals(other$belogOrg));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductApplySaveVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        ProductApplyDetailSaveVO $detail = this.getDetail();
        result = result * 59 + ($detail == null ? 43 : ((Object)$detail).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $orgId_Code = this.getOrgId_Code();
        result = result * 59 + ($orgId_Code == null ? 43 : $orgId_Code.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $belogOrg_Code = this.getBelogOrg_Code();
        result = result * 59 + ($belogOrg_Code == null ? 43 : $belogOrg_Code.hashCode());
        String $belogOrg = this.getBelogOrg();
        result = result * 59 + ($belogOrg == null ? 43 : $belogOrg.hashCode());
        return result;
    }

    public String toString() {
        return "ProductApplySaveVO(detail=" + this.getDetail() + ", id=" + this.getId() + ", code=" + this.getCode() + ", orgId_Code=" + this.getOrgId_Code() + ", orgId=" + this.getOrgId() + ", belogOrg_Code=" + this.getBelogOrg_Code() + ", belogOrg=" + this.getBelogOrg() + ")";
    }
}

