/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.enums;

import org.springframework.util.StringUtils;

public enum GradeManageControlServiceEnum {
    PRODUCT("pc.product.Product", "PRODUCT", "pc.mcUpdateEventHandlerProduct"),
    MERCHANT("aa.merchant.Merchant", "MERCHANT", "pc.mcUpdateEventHandlerCustomer"),
    SALE_AREA("aa.salearea.SaleArea", "SALE_AREA", "aa.mCUpdateEventHandlerSaleArea"),
    CUST_CATEGORY("aa.custcategory.CustCategory", "CUST_CATEGORY", "aa.mCUpdateEventHandlerCustCategory"),
    COST_CLASS("pc.cls.CostClass", "COST_CLASS", "pc.mcUpdateEventHandlerCostClass"),
    PURCHASE_CLASS("pc.cls.PurchaseClass", "PURCHASE_CLASS", "pc.mcUpdateEventHandlerPurchaseClass"),
    MANAGEMENT_CLASS("pc.cls.ManagementClass", "MANAGEMENT_CLASS", "pc.mcUpdateEventHandlerManagementClass");

    private String entityName;
    private String billType;
    private String serviceBeanName;

    private GradeManageControlServiceEnum(String entityName, String billType, String serviceBeanName) {
        this.entityName = entityName;
        this.billType = billType;
        this.serviceBeanName = serviceBeanName;
    }

    public static GradeManageControlServiceEnum getByEntityName(String entityName) {
        if (!StringUtils.hasText((String)entityName)) {
            return null;
        }
        for (GradeManageControlServiceEnum gradeManageControlServiceEnum : GradeManageControlServiceEnum.values()) {
            if (!gradeManageControlServiceEnum.getEntityName().equals(entityName)) continue;
            return gradeManageControlServiceEnum;
        }
        return null;
    }

    public String getEntityName() {
        return this.entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getBillType() {
        return this.billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getServiceBeanName() {
        return this.serviceBeanName;
    }

    public void setServiceBeanName(String serviceBeanName) {
        this.serviceBeanName = serviceBeanName;
    }
}

