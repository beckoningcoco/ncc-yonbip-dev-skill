/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.ipass.product;

import com.yonyoucloud.iuap.ipass.product.ProductApplyDataDetail;
import java.io.Serializable;

public class ProductApplyDataSaveRequest
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String code;
    private String orgId_Code;
    private String belogOrg_Code;
    private ProductApplyDataDetail detail;
    private String sourceUnique;

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

    public String getBelogOrg_Code() {
        return this.belogOrg_Code;
    }

    public void setBelogOrg_Code(String belogOrg_Code) {
        this.belogOrg_Code = belogOrg_Code;
    }

    public ProductApplyDataDetail getDetail() {
        return this.detail;
    }

    public void setDetail(ProductApplyDataDetail detail) {
        this.detail = detail;
    }

    public String getSourceUnique() {
        return this.sourceUnique;
    }

    public void setSourceUnique(String sourceUnique) {
        this.sourceUnique = sourceUnique;
    }
}

