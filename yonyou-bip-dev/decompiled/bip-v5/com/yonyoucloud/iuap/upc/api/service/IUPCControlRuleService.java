/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 */
package com.yonyoucloud.iuap.upc.api.service;

import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IUPCControlRuleService {
    public static final String PRODUCT_CLASSNAME = "pc.product.Product";
    public static final String CUSTOMER_CLASSNAME = "aa.merchant.Merchant";
    public static final String VENDOR_CLASSNAME = "aa.vendor.Vendor";
    public static final String PAYMENTS_CLASSNAME = "aa.payments.PayAgreement";
    public static final String RECEIVABLES_CLASSNAME = "aa.receivables.ReceiveAgreement";
    public static final String MANAGEMENTCLASS_CLASSNAME = "pc.cls.ManagementClass";
    public static final String CUSTCATOGORY_CLASSNAME = "aa.custcategory.CustCategory";
    public static final String VENDORCLASS_CLASSNAME = "aa.vendorclass.VendorClass";
    public static final String SALEAREA_CLASSNAME = "aa.salearea.SaleArea";
    public static final String COSTCLASS_CLASSNAME = "pc.cls.CostClass";
    public static final String PURCHASECLASS_CLASSNAME = "pc.cls.PurchaseClass";
    public static final String PRODUCT_RANGE_CLASSNAME = "pc.product.ProductApplyRange";
    public static final String CUSTOMER_RANGE_CLASSNAME = "aa.merchant.MerchantApplyRange";
    public static final String VENDOR_RANGE_CLASSNAME = "aa.vendor.VendorOrg";
    public static final String MANAGEMENTCLASS_RANGE_CLASSNAME = "pc.cls.ManagementClassApplyRangeGroup";
    public static final String CUSTCATOGORY_RANGE_CLASSNAME = "aa.custcategory.CustCategoryApplyRange";
    public static final String RECEIVABLES_RANGE_CLASSNAME = "aa.receivables.RecApplyRange";
    public static final String PAYMENTS_RANGE_CLASSNAME = "aa.payments.PayApplyRange";
    public static final String VENDORCLASS_RANGE_CLASSNAME = "aa.vendorclass.VendorClassApplyRange";
    public static final String SALEAREA_RANGE_CLASSNAME = "aa.salearea.SaleAreaApplyRange";
    public static final String COSTCLASS_RANGE_CLASSNAME = "pc.cls.CostClassApplyRange";
    public static final String GLOBALORGID = "666666";
    public static final String DIWORK_CODE = "diwork";

    public List<Map> getControlRule(String var1, String var2) throws Exception;

    public List<String> getOrgPermissions(String var1) throws Exception;

    public List<String> getOrgPermissionsByAuthId(String var1) throws Exception;

    public Boolean checkProductLine() throws Exception;

    public Boolean checkSingleOrg() throws Exception;

    public Boolean checkAppOpen(String var1) throws Exception;

    public Boolean checkVoucherManageShareOrg(String var1, String var2) throws Exception;

    public List<String> getVoucherManageOrgs(String var1, List<String> var2) throws Exception;

    public List<String> getSubOrgs(String var1) throws Exception;

    public List<String> getParentOrgs(String var1) throws Exception;

    public List<String> getVoucherManageShareOrgs(String var1, List<String> var2) throws Exception;

    public List<String> getVoucherManageShareParentOrgs(String var1, String var2) throws Exception;

    public List<String> getSelfCreateVoucherByCreateOrg(String var1, List<String> var2) throws Exception;

    public List<String> getUserOrgAndVoucherManageOrg(String var1, String var2) throws Exception;

    public List<String> getUserOrgAndVoucherManageOrgByAuthId(BillContext var1, String var2) throws Exception;

    public List<String> getUserOrgAndVoucherManageOrgByAuthIdForCRM(String var1) throws Exception;

    public List<String> getOrgRangeShareAll(String var1, String var2) throws Exception;

    public List<String> getOrgRangeShareAllWithoutAutoShare(String var1, String var2) throws Exception;

    public List<Map> getOrgDetail(Set<String> var1) throws Exception;

    public List<String> getUserOrgAndVoucherManageOrg(String var1, String var2, String var3) throws Exception;

    public List<String> getManageOrgList(String var1, String var2) throws Exception;
}

