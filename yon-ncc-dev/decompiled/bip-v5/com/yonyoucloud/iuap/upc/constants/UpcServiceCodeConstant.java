/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.constants;

import java.util.HashMap;

public class UpcServiceCodeConstant {
    public static final String BASE_PARTNER_LINKPLAN = "base_partnerlinkplan";
    public static final String BASE_PARTNER_SYNCPLAN = "base_partnersyncplan";
    public static final String base_business_partnerlist = "base_businesspartnerlist";
    public static final String PC_MANAGEMENTCLASS = "pc_managementclass";
    public static final String PRODUCT_APPLY = "pc_productapply";
    public static final String PRODUCT = "pc_product";
    public static final String PRODUCT_QUERY = "pc_product_query";
    public static final String MERCHANT_APPLY = "aa_customerapply";
    public static final String MERCHANT = "aa_merchant";
    public static final String MERCHANT_LIST_QUERY = "aa_merchantlist_query";
    public static final String SKU_PRODUCT_QUERY = "pc_goodsproductskupro";
    public static final String MERCHANT_DETAIL = "aa_merchantlist_query";
    public static final HashMap<String, String> ServiceCodeBillNumMap = new HashMap(){
        {
            this.put(UpcServiceCodeConstant.MERCHANT, UpcServiceCodeConstant.MERCHANT);
            this.put("aa_merchantlist", UpcServiceCodeConstant.MERCHANT);
            this.put("aa_merchantdetail", "aa_merchantlist_query");
            this.put("aa_merchantlist_query", "aa_merchantlist_query");
            this.put(UpcServiceCodeConstant.PRODUCT, UpcServiceCodeConstant.PRODUCT);
            this.put("pc_productlist", UpcServiceCodeConstant.PRODUCT);
            this.put("pc_productlist_query", UpcServiceCodeConstant.PRODUCT_QUERY);
            this.put("pc_productdetail", UpcServiceCodeConstant.PRODUCT_QUERY);
            this.put("pc_productsku_edit", UpcServiceCodeConstant.SKU_PRODUCT_QUERY);
            this.put("base_businesspartner", UpcServiceCodeConstant.base_business_partnerlist);
            this.put(UpcServiceCodeConstant.base_business_partnerlist, UpcServiceCodeConstant.base_business_partnerlist);
        }
    };
}

