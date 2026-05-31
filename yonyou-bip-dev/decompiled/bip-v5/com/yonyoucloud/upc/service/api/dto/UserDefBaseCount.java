/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.api.dto;

public class UserDefBaseCount {
    private String id;
    private Integer productArchiveCount = 0;
    private Integer productSkuCount = 0;
    private Integer productSpecCount = 0;
    private Integer productBrandCount = 0;
    private Integer productCustCount = 0;
    private Integer vendorCount = 0;
    private Integer proArchiveEffCount;
    private Integer proSkuEffCount;
    private Integer proSpecEffCount;
    private Integer proBrandEffCount;
    private Integer proCustEffCount;
    private Integer vendorEffCount;
    private Integer custApplyIncomplCount;
    private Integer proApplyIncomplCount;
    private Integer errCount;
    private String ytenant;

    public void setClassCount(String classId, Integer count) {
        switch (classId) {
            case "productcustomer": {
                this.setProductCustCount(count);
                break;
            }
            case "productSku": {
                this.setProductSkuCount(count);
                break;
            }
            case "productBrand": {
                this.setProductBrandCount(count);
                break;
            }
            case "productArchive": {
                this.setProductArchiveCount(count);
                break;
            }
            case "productSpec": {
                this.setProductSpecCount(count);
                break;
            }
            case "vendor": {
                this.setVendorCount(count);
                break;
            }
        }
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProductArchiveCount(Integer productArchiveCount) {
        this.productArchiveCount = productArchiveCount;
    }

    public void setProductSkuCount(Integer productSkuCount) {
        this.productSkuCount = productSkuCount;
    }

    public void setProductSpecCount(Integer productSpecCount) {
        this.productSpecCount = productSpecCount;
    }

    public void setProductBrandCount(Integer productBrandCount) {
        this.productBrandCount = productBrandCount;
    }

    public void setProductCustCount(Integer productCustCount) {
        this.productCustCount = productCustCount;
    }

    public void setVendorCount(Integer vendorCount) {
        this.vendorCount = vendorCount;
    }

    public void setProArchiveEffCount(Integer proArchiveEffCount) {
        this.proArchiveEffCount = proArchiveEffCount;
    }

    public void setProSkuEffCount(Integer proSkuEffCount) {
        this.proSkuEffCount = proSkuEffCount;
    }

    public void setProSpecEffCount(Integer proSpecEffCount) {
        this.proSpecEffCount = proSpecEffCount;
    }

    public void setProBrandEffCount(Integer proBrandEffCount) {
        this.proBrandEffCount = proBrandEffCount;
    }

    public void setProCustEffCount(Integer proCustEffCount) {
        this.proCustEffCount = proCustEffCount;
    }

    public void setVendorEffCount(Integer vendorEffCount) {
        this.vendorEffCount = vendorEffCount;
    }

    public void setCustApplyIncomplCount(Integer custApplyIncomplCount) {
        this.custApplyIncomplCount = custApplyIncomplCount;
    }

    public void setProApplyIncomplCount(Integer proApplyIncomplCount) {
        this.proApplyIncomplCount = proApplyIncomplCount;
    }

    public void setErrCount(Integer errCount) {
        this.errCount = errCount;
    }

    public void setYtenant(String ytenant) {
        this.ytenant = ytenant;
    }

    public String getId() {
        return this.id;
    }

    public Integer getProductArchiveCount() {
        return this.productArchiveCount;
    }

    public Integer getProductSkuCount() {
        return this.productSkuCount;
    }

    public Integer getProductSpecCount() {
        return this.productSpecCount;
    }

    public Integer getProductBrandCount() {
        return this.productBrandCount;
    }

    public Integer getProductCustCount() {
        return this.productCustCount;
    }

    public Integer getVendorCount() {
        return this.vendorCount;
    }

    public Integer getProArchiveEffCount() {
        return this.proArchiveEffCount;
    }

    public Integer getProSkuEffCount() {
        return this.proSkuEffCount;
    }

    public Integer getProSpecEffCount() {
        return this.proSpecEffCount;
    }

    public Integer getProBrandEffCount() {
        return this.proBrandEffCount;
    }

    public Integer getProCustEffCount() {
        return this.proCustEffCount;
    }

    public Integer getVendorEffCount() {
        return this.vendorEffCount;
    }

    public Integer getCustApplyIncomplCount() {
        return this.custApplyIncomplCount;
    }

    public Integer getProApplyIncomplCount() {
        return this.proApplyIncomplCount;
    }

    public Integer getErrCount() {
        return this.errCount;
    }

    public String getYtenant() {
        return this.ytenant;
    }
}

