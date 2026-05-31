/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

import com.yonyou.iuap.bizdoc.service.model.BaseDaoModel;
import com.yonyou.iuap.bizdoc.service.model.WarehouseStockModel;
import java.util.List;

public class WarehouseModel
extends BaseDaoModel {
    private String regionCode;
    private String address;
    private Double longitude;
    private Double latitude;
    private String orgId;
    private Boolean wStore;
    private String iUsed;
    private String erpCode;
    private Long custId;
    private Boolean shopDefault;
    private Boolean iCalculate;
    private Boolean iSerialManage;
    private Boolean isGoodsPosition;
    private Boolean eStore;
    private Boolean bWMS;
    private String ownerorgId;
    private Boolean bMRP;
    private Boolean isInvertedScour;
    private Boolean iStockCheckType;
    private Boolean isWasteWarehouse;
    private Boolean isSubcontractW;
    private Long vendorId;
    private Boolean isGoodsPositionStock;
    private Boolean iJoinStockQuery;
    private Boolean iCountCost;
    private String phone;
    private String linkman;
    private List<WarehouseStockModel> stocks;
    private Boolean isBatchNumberManage;
    private String country;
    private Boolean isConsignment;
    private Long consignmentCustomer;
    private String department;
    private Boolean isPDAStorage;

    public Boolean getPDAStorage() {
        return this.isPDAStorage;
    }

    public void setPDAStorage(Boolean PDAStorage) {
        this.isPDAStorage = PDAStorage;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRegionCode() {
        return this.regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public Boolean getwStore() {
        return this.wStore;
    }

    public void setwStore(Boolean wStore) {
        this.wStore = wStore;
    }

    public String getiUsed() {
        return this.iUsed;
    }

    public void setiUsed(String iUsed) {
        this.iUsed = iUsed;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public Long getCustId() {
        return this.custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public Boolean getShopDefault() {
        return this.shopDefault;
    }

    public void setShopDefault(Boolean shopDefault) {
        this.shopDefault = shopDefault;
    }

    public Boolean getiCalculate() {
        return this.iCalculate;
    }

    public void setiCalculate(Boolean iCalculate) {
        this.iCalculate = iCalculate;
    }

    public Boolean getiSerialManage() {
        return this.iSerialManage;
    }

    public void setiSerialManage(Boolean iSerialManage) {
        this.iSerialManage = iSerialManage;
    }

    public Boolean getGoodsPosition() {
        return this.isGoodsPosition;
    }

    public void setGoodsPosition(Boolean goodsPosition) {
        this.isGoodsPosition = goodsPosition;
    }

    public Boolean geteStore() {
        return this.eStore;
    }

    public void seteStore(Boolean eStore) {
        this.eStore = eStore;
    }

    public Boolean getbWMS() {
        return this.bWMS;
    }

    public void setbWMS(Boolean bWMS) {
        this.bWMS = bWMS;
    }

    public String getOwnerorgId() {
        return this.ownerorgId;
    }

    public void setOwnerorgId(String ownerorgId) {
        this.ownerorgId = ownerorgId;
    }

    public Boolean getbMRP() {
        return this.bMRP;
    }

    public void setbMRP(Boolean bMRP) {
        this.bMRP = bMRP;
    }

    public Boolean getInvertedScour() {
        return this.isInvertedScour;
    }

    public void setInvertedScour(Boolean invertedScour) {
        this.isInvertedScour = invertedScour;
    }

    public Boolean getiStockCheckType() {
        return this.iStockCheckType;
    }

    public void setiStockCheckType(Boolean iStockCheckType) {
        this.iStockCheckType = iStockCheckType;
    }

    public Boolean getWasteWarehouse() {
        return this.isWasteWarehouse;
    }

    public void setWasteWarehouse(Boolean wasteWarehouse) {
        this.isWasteWarehouse = wasteWarehouse;
    }

    public Boolean getSubcontractW() {
        return this.isSubcontractW;
    }

    public void setSubcontractW(Boolean subcontractW) {
        this.isSubcontractW = subcontractW;
    }

    public Long getVendorId() {
        return this.vendorId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public Boolean getGoodsPositionStock() {
        return this.isGoodsPositionStock;
    }

    public void setGoodsPositionStock(Boolean goodsPositionStock) {
        this.isGoodsPositionStock = goodsPositionStock;
    }

    public Boolean getiJoinStockQuery() {
        return this.iJoinStockQuery;
    }

    public void setiJoinStockQuery(Boolean iJoinStockQuery) {
        this.iJoinStockQuery = iJoinStockQuery;
    }

    public Boolean getiCountCost() {
        return this.iCountCost;
    }

    public void setiCountCost(Boolean iCountCost) {
        this.iCountCost = iCountCost;
    }

    public List<WarehouseStockModel> getStocks() {
        return this.stocks;
    }

    public void setStocks(List<WarehouseStockModel> stocks) {
        this.stocks = stocks;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLinkman() {
        return this.linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public Boolean getBatchNumberManage() {
        return this.isBatchNumberManage;
    }

    public void setBatchNumberManage(Boolean batchNumberManage) {
        this.isBatchNumberManage = batchNumberManage;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getConsignment() {
        return this.isConsignment;
    }

    public void setConsignment(Boolean consignment) {
        this.isConsignment = consignment;
    }

    public Long getConsignmentCustomer() {
        return this.consignmentCustomer;
    }

    public void setConsignmentCustomer(Long consignmentCustomer) {
        this.consignmentCustomer = consignmentCustomer;
    }
}

