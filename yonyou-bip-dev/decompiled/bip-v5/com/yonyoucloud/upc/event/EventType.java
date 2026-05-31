/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  org.apache.commons.lang3.StringUtils
 */
package com.yonyoucloud.upc.event;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;

public enum EventType {
    PC_PRODUCT_INSERT(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208664", (String)"\u7269\u6599\u6863\u6848\u65b0\u589e"), "pc_product", "save", "Insert"),
    PC_PRODUCT_DELETE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208661", (String)"\u7269\u6599\u6863\u6848\u5220\u9664"), "pc_productlist", "delete", "Delete"),
    PC_PRODUCT_UPDATE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208669", (String)"\u7269\u6599\u6863\u6848\u4fee\u6539"), "pc_product", "save", "Update"),
    PC_PRODUCT_BATCHMODIFY(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001645773", (String)"\u7269\u6599\u6863\u6848\u6279\u6539"), "pc_productlist", "batchModify"),
    PC_PRODUCT_UNSTOP(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001645776", (String)"\u7269\u6599\u6863\u6848\u542f\u7528"), "pc_product", "unstop"),
    PC_PRODUCT_STOP(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001645806", (String)"\u7269\u6599\u6863\u6848\u505c\u7528"), "pc_product", "stop"),
    PC_PRODUCT_SHELVE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513633", (String)"\u7269\u6599\u4e0a\u67b6"), "pc_product", "shelve"),
    PC_PRODUCT_UNSHELVE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513641", (String)"\u7269\u6599\u4e0b\u67b6"), "pc_product", "unshelve"),
    PC_PRODUCT_BATCHTAG(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513640", (String)"\u7269\u6599\u8bbe\u7f6e\u6807\u7b7e"), "pc_product", "batchtag"),
    PC_PRODUCT_BATCHCLEARTAG(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513652", (String)"\u7269\u6599\u6e05\u9664\u6807\u7b7e"), "pc_product", "batchcleartag"),
    PC_PRODUCT_SKU_UPDATE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513624", (String)"\u7269\u6599SKU\u53d8\u52a8"), "pc_product", "save", "SKUUpdate"),
    PC_PRODUCT_SKU_DELETE("\u7269\u6599SKU\u5220\u9664", "pc_product", "skudelete", "SKUDelete"),
    PC_PRODUCT_ALBUM_DESC_IMPORT(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_1534411572342423554", (String)"\u7269\u6599\u6863\u6848\u66f4\u65b0\u56fe\u518c\u5bfc\u5165"), "pc_product", "import", "AlbumAndDescImport"),
    PC_PRODUCTSKU_SHELVE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_1596390845221699593", (String)"SKU\u4e0a\u67b6"), "pc_productsku", "skushelve", "SKUUpdate"),
    PC_PRODUCTSKU_UNSHELVE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_1596390845221699599", (String)"SKU\u4e0b\u67b6"), "pc_productsku", "skuunshelve", "SKUUpdate"),
    PC_MANAGEMENTCLASS_INSERT(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208653", (String)"\u7269\u6599\u5206\u7c7b\u65b0\u589e"), "pc_managementclass", "save", "Insert"),
    PC_MANAGEMENTCLASS_DELETE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208652", (String)"\u7269\u6599\u5206\u7c7b\u5220\u9664"), "pc_managementclasslist", "delete", "Delete"),
    PC_MANAGEMENTCLASS_UPDATE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208674", (String)"\u7269\u6599\u5206\u7c7b\u4fee\u6539"), "pc_managementclass", "save", "Update"),
    PC_MANAGEMENTCLASS_UNSTOP(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208720", (String)"\u7269\u6599\u5206\u7c7b\u542f\u7528"), "pc_managementclass", "unstop"),
    PC_MANAGEMENTCLASS_STOP(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208719", (String)"\u7269\u6599\u5206\u7c7b\u505c\u7528"), "pc_managementclass", "stop"),
    PC_MANAGEMENTCLASS_BATCH_UNSTOP("\u7269\u6599\u5206\u7c7b\u6279\u91cf\u542f\u7528", "pc_managementclass", "batchunstop"),
    PC_MANAGEMENTCLASS_BATCH_STOP("\u7269\u6599\u5206\u7c7b\u6279\u91cf\u505c\u7528", "pc_managementclass", "batchstop"),
    PC_UNIT_INSERT(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208671", (String)"\u8ba1\u91cf\u5355\u4f4d\u65b0\u589e"), "pc_unit", "save", "Insert"),
    PC_UNIT_DELETE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208667", (String)"\u8ba1\u91cf\u5355\u4f4d\u5220\u9664"), "pc_unitlist", "delete", "Delete"),
    PC_UNIT_UPDATE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208666", (String)"\u8ba1\u91cf\u5355\u4f4d\u4fee\u6539"), "pc_unit", "save", "Update"),
    PC_UNITLIST_UNSTOP(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208718", (String)"\u8ba1\u91cf\u5355\u4f4d\u542f\u7528"), "pc_unitlist", "unstop"),
    PC_UNITLIST_STOP(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208721", (String)"\u8ba1\u91cf\u5355\u4f4d\u505c\u7528"), "pc_unitlist", "stop"),
    PC_UNIT_BATCH_UNSTOP("\u8ba1\u91cf\u5355\u4f4d\u6279\u91cf\u542f\u7528", "pc_unit", "unstop"),
    PC_UNIT_BATCH_STOP("\u8ba1\u91cf\u5355\u4f4d\u6279\u91cf\u505c\u7528", "pc_unit", "stop"),
    PC_PRODUCTSKUPRO_INSERT(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208658", (String)"SKU\u5c5e\u6027\u65b0\u589e"), "pc_productskupro", "save", "Insert"),
    PC_PRODUCTSKUPRO_DELETE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208660", (String)"SKU\u5c5e\u6027\u5220\u9664"), "pc_productskuprolist", "delete", "Delete"),
    PC_PRODUCTSKUPRO_UPDATE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208651", (String)"SKU\u5c5e\u6027\u4fee\u6539"), "pc_productskupro", "save", "Update"),
    PC_PRODUCTPRO_INSERT(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208665", (String)"\u7269\u6599\u5c5e\u6027\u65b0\u589e"), "pc_productpro", "save", "Insert"),
    PC_PRODUCTPRO_DELETE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208672", (String)"\u7269\u6599\u5c5e\u6027\u5220\u9664"), "pc_productprolist", "delete", "Delete"),
    PC_PRODUCTPRO_UPDATE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208657", (String)"\u7269\u6599\u5c5e\u6027\u4fee\u6539"), "pc_productpro", "save", "Update"),
    AA_WAREHOUSE_INSERT(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208670", (String)"\u4ed3\u5e93\u65b0\u589e"), "aa_warehouse", "save", "Insert"),
    AA_WAREHOUSE_DELETE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208673", (String)"\u4ed3\u5e93\u5220\u9664"), "aa_warehouselist", "delete", "Delete"),
    AA_WAREHOUSE_UPDATE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208650", (String)"\u4ed3\u5e93\u4fee\u6539"), "aa_warehouse", "save", "Update"),
    AA_MERCHANT_INSERT(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208668", (String)"\u5ba2\u6237\u6863\u6848\u65b0\u589e"), "aa_merchant", "save", "Insert"),
    AA_MERCHANT_DELETE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208655", (String)"\u5ba2\u6237\u6863\u6848\u5220\u9664"), "aa_merchantlist", "delete", "Delete"),
    AA_MERCHANT_CARD_DELETE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513618", (String)"\u5ba2\u6237\u6863\u6848\u5361\u7247\u5220\u9664"), "aa_merchant", "delete", "Delete"),
    AA_MERCHANT_UPDATE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208663", (String)"\u5ba2\u6237\u6863\u6848\u4fee\u6539"), "aa_merchant", "save", "Update"),
    AA_MERCHANT_ALLOCATEORG(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_1474727701960982533", (String)"\u5ba2\u6237\u6863\u6848\u5206\u914d\u7ec4\u7ec7"), "aa_merchantlist", "addmerchantsuitorg"),
    AA_MERCHANTLIST_UNSTOP("\u5ba2\u6237\u6863\u6848\u542f\u7528", "aa_merchantlist", "unstop"),
    AA_MERCHANTLIST_STOP("\u5ba2\u6237\u6863\u6848\u505c\u7528", "aa_merchantlist", "stop"),
    AA_MERCHANT_BATCH_UNSTOP("\u5ba2\u6237\u6863\u6848\u6279\u91cf\u542f\u7528", "aa_merchant", "unstop"),
    AA_MERCHANT_BATCH_STOP("\u5ba2\u6237\u6863\u6848\u6279\u91cf\u505c\u7528", "aa_merchant", "stop"),
    PC_SPEPRO_INSERT(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208654", (String)"\u7269\u6599\u89c4\u683c\u65b0\u589e"), "pc_spepro", "save", "Insert"),
    PC_SPEPRO_DELETE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208656", (String)"\u7269\u6599\u89c4\u683c\u5220\u9664"), "pc_speprolist", "delete", "Delete"),
    PC_SPEPRO_UPDATE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001208675", (String)"\u7269\u6599\u89c4\u683c\u4fee\u6539"), "pc_spepro", "save", "Update"),
    PC_PRODUCTTPL_INSERT(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513621", (String)"\u7269\u6599\u6a21\u677f\u65b0\u589e"), "pc_producttpl", "save", "Insert"),
    PC_PRODUCTTPLLIST_DELETE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513631", (String)"\u7269\u6599\u6a21\u677f\u5220\u9664"), "pc_producttpllist", "delete", "Delete"),
    PC_PRODUCTTPL_CARD_DELETE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513651", (String)"\u7269\u6599\u6a21\u677f\u5361\u7247\u5220\u9664"), "pc_producttpl", "delete", "Delete"),
    PC_PRODUCTTPL_UPDATE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513630", (String)"\u7269\u6599\u6a21\u677f\u66f4\u65b0"), "pc_producttpl", "save", "Update"),
    PC_PRODUCTTPLLIST_UNSTOP(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513614", (String)"\u7269\u6599\u6a21\u677f\u542f\u7528"), "pc_producttpllist", "unstop"),
    PC_PRODUCTTPLLIST_STOP(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513635", (String)"\u7269\u6599\u6a21\u677f\u505c\u7528"), "pc_producttpllist", "stop"),
    PC_PRODUCTTPL_BATCH_UNSTOP(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513629", (String)"\u7269\u6599\u6a21\u677f\u6279\u91cf\u542f\u7528"), "pc_producttpl", "unstop"),
    PC_PRODUCTTPL_BATCH_STOP(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513626", (String)"\u7269\u6599\u6a21\u677f\u6279\u91cf\u505c\u7528"), "pc_producttpl", "stop"),
    PC_TAG_INSERT(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513625", (String)"\u6807\u7b7e\u65b0\u589e"), "pc_tag", "save", "Insert"),
    PC_TAGLIST_DELETE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513650", (String)"\u6807\u7b7e\u5220\u9664"), "pc_taglist", "delete", "Delete"),
    PC_TAG_CARD_DELETE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513645", (String)"\u6807\u7b7e\u5361\u7247\u5220\u9664"), "pc_tag", "delete", "Delete"),
    PC_TAG_UPDATE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513649", (String)"\u6807\u7b7e\u66f4\u65b0"), "pc_tag", "save", "Update"),
    PC_TAGLIST_UNSTOP(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513642", (String)"\u6807\u7b7e\u542f\u7528"), "pc_taglist", "unstop"),
    PC_TAGLIST_STOP(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513637", (String)"\u6807\u7b7e\u505c\u7528"), "pc_taglist", "stop"),
    PC_TAG_BATCH_UNSTOP(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513636", (String)"\u6807\u7b7e\u6279\u91cf\u542f\u7528"), "pc_tag", "unstop"),
    PC_TAG_BATCH_STOP(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513615", (String)"\u6807\u7b7e\u6279\u91cf\u505c\u7528"), "pc_tag", "stop"),
    PC_PRESENTATIONCLASS_INSERT(InternationalUtils.getMessageWithDefault((String)"P_YS_SD_SDMB_0000138848", (String)"\u5546\u54c1\u5206\u7c7b\u65b0\u589e"), "pc_presentationclass", "save", "Insert"),
    PC_PRESENTATIONCLASSLIST_DELETE(InternationalUtils.getMessageWithDefault((String)"P_YS_SD_SDMA_0000125128", (String)"\u5546\u54c1\u5206\u7c7b\u5220\u9664"), "pc_presentationclasslist", "delete", "Delete"),
    PC_PRESENTATIONCLASS_CARD_DELETE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513620", (String)"\u5546\u54c1\u5206\u7c7b\u5361\u7247\u5220\u9664"), "pc_presentationclass", "delete", "Delete"),
    PC_PRESENTATIONCLASS_UPDATE(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513632", (String)"\u5546\u54c1\u5206\u7c7b\u66f4\u65b0"), "pc_presentationclass", "save", "Update"),
    PC_PRESENTATIONCLASS_UNSTOP(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513623", (String)"\u5546\u54c1\u5206\u7c7b\u505c\u7528"), "pc_presentationclass", "unstop"),
    PC_PRESENTATIONCLASS_STOP(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513643", (String)"\u5546\u54c1\u5206\u7c7b\u542f\u7528"), "pc_presentationclass", "stop"),
    PC_SHOPPRESENTATIONCLASSLIST_INS(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513644", (String)"\u5546\u5bb6\u5546\u54c1\u5206\u7c7b\u4fdd\u5b58"), "pc_shoppresentationclasslist", "save", "Insert"),
    PC_SHOPPRESENTATIONCLASSLIST_UPD(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001513617", (String)"\u5546\u5bb6\u5546\u54c1\u5206\u7c7b\u66f4\u65b0"), "pc_shoppresentationclasslist", "save", "Update"),
    AA_CUSTOMERTYPE_INSERT("\u9500\u552e\u6e20\u9053\u65b0\u589e", "aa_customerType", "save", "Insert"),
    AA_CUSTOMERTYPE_UPDATE("\u9500\u552e\u6e20\u9053\u4fee\u6539", "aa_customerType", "save", "Update"),
    AA_CUSTCATEGORY_INSERT("\u5ba2\u6237\u5206\u7c7b\u65b0\u589e", "aa_custcategory", "save", "Insert"),
    AA_CUSTCATEGORY_UPDATE("\u5ba2\u6237\u5206\u7c7b\u4fee\u6539", "aa_custcategory", "save", "Update"),
    AA_CUSTCATEGORYLIST_UNSTOP("\u5ba2\u6237\u5206\u7c7b\u542f\u7528", "aa_custcategorylist", "unstop"),
    AA_CUSTCATEGORYLIST_STOP("\u5ba2\u6237\u5206\u7c7b\u505c\u7528", "aa_custcategorylist", "stop"),
    AA_SALEAREA_INSERT("\u9500\u552e\u533a\u57df\u65b0\u589e", "aa_salearea", "save", "Insert"),
    AA_SALEAREA_UPDATE("\u9500\u552e\u533a\u57df\u4fee\u6539", "aa_salearea", "save", "Update"),
    AA_SALEAREALIST_UNSTOP("\u9500\u552e\u533a\u57df\u542f\u7528", "aa_salearealist", "unstop"),
    AA_SALEAREALIST_STOP("\u9500\u552e\u533a\u57df\u505c\u7528", "aa_salearealist", "stop"),
    BASE_DOC_MAKEUP(InternationalUtils.getMessageWithDefault((String)"P_YS_PF_PROCENTER_0001218686", (String)"\u516c\u5171\u5355\u636e\u8865\u507f"), "base_doc", "detail", "MakeUp"),
    BASE_BUSINESS_PARTNER("\u4e1a\u52a1\u4f19\u4f34\u65b0\u589e\u4e0e\u4fdd\u5b58", "base_businesspartner", "save"),
    TRANSACTION_RELATIONSHIP_INSERT("\u6e20\u9053\u4ea4\u6613\u5173\u7cfb\u4fdd\u5b58", "transaction_relationship", "save"),
    TRANSACTION_RELATIONSHIP_DELETE("\u6e20\u9053\u4ea4\u6613\u5173\u7cfb\u5220\u9664", "transaction_relationship", "delete"),
    SHOP_USER_DELETE_MERCHANT("\u5546\u5bb6\u7528\u6237\u5220\u9664\u5ba2\u6237", "shop_user_merchant", "delete"),
    SHOP_USER_INSERT_MERCHANT("\u5546\u5bb6\u7528\u6237\u521b\u5efa\u5ba2\u6237", "shop_user_merchant", "save"),
    PC_BRAND_INSERT("\u54c1\u724c\u65b0\u589e", "pc_brand", "save", "Insert"),
    PC_BRAND_UPDATE("\u54c1\u724c\u4fee\u6539", "pc_brand", "save", "Update"),
    PC_BRAND_DELETE("\u54c1\u724c\u5220\u9664", "pc_brand", "delete", "Delete"),
    PC_BRANDLIST_STOP("\u54c1\u724c\u505c\u7528", "pc_brandlist", "stop"),
    PC_BRANDLIST_UNSTOP("\u54c1\u724c\u542f\u7528", "pc_brandlist", "unstop"),
    PC_BRAND_STOP("\u54c1\u724c\u6279\u91cf\u505c\u7528", "pc_brand", "stop"),
    PC_BRAND_UNSTOP("\u54c1\u724c\u6279\u91cf\u542f\u7528", "pc_brand", "unstop"),
    PC_BRANDCLASS_INSERT("\u54c1\u724c\u5206\u7ec4\u65b0\u589e", "pc_brandclass", "save", "Insert"),
    PC_BRANDCLASS_UPDATE("\u54c1\u724c\u5206\u7ec4\u4fee\u6539", "pc_brandclass", "save", "Update"),
    PC_BRANDCLASSLIST_DELETE("\u54c1\u724c\u5206\u7ec4\u5220\u9664", "pc_brandclasslist", "delete", "Delete"),
    PC_COSTCLASS_INSERT_NOTIFY("\u6210\u672c\u5206\u7c7b\u65b0\u589e\u4e8b\u4ef6", "pc_costclass", "save", "Insert"),
    PC_COSTCLASS_UPDATE_NOTIFY("\u6210\u672c\u5206\u7c7b\u66f4\u65b0\u4e8b\u4ef6", "pc_costclass", "save", "Update"),
    PC_COSTCLASS_DELETE_NOTIFY("\u6210\u672c\u5206\u7c7b\u5220\u9664\u4e8b\u4ef6", "pc_costclasslist", "delete", "Delete"),
    PC_COSTCLASS_UNSTOP_NOTIFY("\u6210\u672c\u5206\u7c7b\u542f\u7528\u4e8b\u4ef6", "pc_costclass", "unstop"),
    PC_COSTCLASS_STOP_NOTIFY("\u6210\u672c\u5206\u7c7b\u505c\u7528\u4e8b\u4ef6", "pc_costclass", "stop"),
    PC_PRODUCT_ADDPROSUITORG_NOTIFY("\u7269\u6599\u6863\u6848\u5206\u914d\u7ec4\u7ec7\u4e8b\u4ef6", "pc_productlist", "addprosuitorg"),
    PC_PRODUCT_CANCELSUITORG_NOTIFY("\u7269\u6599\u6863\u6848\u53d6\u6d88\u5206\u914d\u4e8b\u4ef6", "pc_productlist", "cancelSuitOrg");

    private String desc;
    private String billnum;
    private String action;
    private String entityStatus;
    private static HashMap<String, EventType> map;

    private EventType(String desc, String billnum, String action) {
        this.desc = desc;
        this.billnum = billnum;
        this.action = action;
    }

    private EventType(String desc, String billnum, String action, String entityStatus) {
        this.desc = desc;
        this.billnum = billnum;
        this.action = action;
        this.entityStatus = entityStatus;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getBillnum() {
        return this.billnum;
    }

    public String getAction() {
        return this.action;
    }

    public void setEntityStatus(String entityStatus) {
        this.entityStatus = entityStatus;
    }

    public String getEntityStatus() {
        return this.entityStatus;
    }

    private static synchronized void initMap() {
        EventType[] items;
        if (map != null) {
            return;
        }
        map = new HashMap();
        for (EventType item : items = EventType.values()) {
            if (null == item.getEntityStatus()) {
                item.setEntityStatus("");
            }
            map.put(item.getBillnum() + item.getAction() + item.getEntityStatus(), item);
        }
    }

    public static EventType find(String billnum, String action, String entityStatus) {
        if (StringUtils.isEmpty((CharSequence)billnum)) {
            return null;
        }
        switch (billnum) {
            case "pc_productdetail": {
                billnum = "pc_product";
                break;
            }
            case "aa_merchantdetail": {
                billnum = "aa_merchant";
                break;
            }
            case "aa_merchantlist_query": {
                billnum = "aa_merchantlist";
                break;
            }
            case "pc_brandlist": {
                billnum = "pc_brand";
                break;
            }
        }
        if (map == null) {
            EventType.initMap();
        }
        if (null == entityStatus) {
            entityStatus = "";
        }
        return map.get(billnum + action + entityStatus);
    }

    static {
        map = null;
    }
}

