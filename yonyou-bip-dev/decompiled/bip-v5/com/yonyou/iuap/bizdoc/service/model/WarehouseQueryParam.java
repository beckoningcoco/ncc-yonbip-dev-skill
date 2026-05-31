/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

import com.yonyou.iuap.bizdoc.service.model.BaseQueryParam;
import java.util.List;

public class WarehouseQueryParam
extends BaseQueryParam {
    private String cust;
    private String iUsed;
    private String warehouseOrg;
    private List<String> warehouseOrgs;
    private List<String> stockOrgs;
    private String ownOrg;
    private Integer isGoodsPosition;
    private Integer wStore;
    private String erpCode;
    private List<String> erpCodes;
    private String erpCodeLike;
    private Integer eStore;
    private Integer bWMS;
    private Long vendorId;
    private List<Long> vendorIds;
    private String country;
    private Integer isSubcontractW;

    public String getCust() {
        return this.cust;
    }

    public void setCust(String cust) {
        this.cust = cust;
    }

    public String getiUsed() {
        return this.iUsed;
    }

    public void setiUsed(String iUsed) {
        this.iUsed = iUsed;
    }

    public String getWarehouseOrg() {
        return this.warehouseOrg;
    }

    public void setWarehouseOrg(String warehouseOrg) {
        this.warehouseOrg = warehouseOrg;
    }

    public List<String> getWarehouseOrgs() {
        return this.warehouseOrgs;
    }

    public void setWarehouseOrgs(List<String> warehouseOrgs) {
        this.warehouseOrgs = warehouseOrgs;
    }

    public String getOwnOrg() {
        return this.ownOrg;
    }

    public void setOwnOrg(String ownOrg) {
        this.ownOrg = ownOrg;
    }

    public Integer getIsGoodsPosition() {
        return this.isGoodsPosition;
    }

    public void setIsGoodsPosition(Integer isGoodsPosition) {
        this.isGoodsPosition = isGoodsPosition;
    }

    public Integer getwStore() {
        return this.wStore;
    }

    public void setwStore(Integer wStore) {
        this.wStore = wStore;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public String getErpCodeLike() {
        return this.erpCodeLike;
    }

    public void setErpCodeLike(String erpCodeLike) {
        this.erpCodeLike = erpCodeLike;
    }

    public Integer geteStore() {
        return this.eStore;
    }

    public void seteStore(Integer eStore) {
        this.eStore = eStore;
    }

    public Integer getbWMS() {
        return this.bWMS;
    }

    public void setbWMS(Integer bWMS) {
        this.bWMS = bWMS;
    }

    public List<String> getErpCodes() {
        return this.erpCodes;
    }

    public void setErpCodes(List<String> erpCodes) {
        this.erpCodes = erpCodes;
    }

    public List<String> getStockOrgs() {
        return this.stockOrgs;
    }

    public void setStockOrgs(List<String> stockOrgs) {
        this.stockOrgs = stockOrgs;
    }

    public Long getVendorId() {
        return this.vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public List<Long> getVendorIds() {
        return this.vendorIds;
    }

    public void setVendorIds(List<Long> vendorIds) {
        this.vendorIds = vendorIds;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getIsSubcontractW() {
        return this.isSubcontractW;
    }

    public void setIsSubcontractW(Integer isSubcontractW) {
        this.isSubcontractW = isSubcontractW;
    }
}

