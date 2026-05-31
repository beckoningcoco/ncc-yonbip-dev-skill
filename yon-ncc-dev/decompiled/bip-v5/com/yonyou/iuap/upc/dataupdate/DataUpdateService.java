/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.upc.dataupdate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataUpdateService {
    public static final List<Map<String, String>> BUSINESS_DATA_LIST = new ArrayList<Map<String, String>>();

    static {
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "\u7269\u6599");
                this.put("subName", "\u7269\u6599\u540d\u79f0\u6709\u7a7a\u683c\uff0c\u6216\u8005\u6362\u884c");
                this.put("subDes", "\u5904\u7406\u7269\u6599\u540d\u79f0\u6709\u7a7a\u683c\uff0c\u6216\u8005\u6362\u884c\u7684\u95ee\u9898");
                this.put("subService", "dealWithProductNameData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "\u7269\u6599");
                this.put("subName", "productapplyrange\u91cd\u590d\u6570\u636e");
                this.put("subDes", "\u5904\u7406productapplyrange\u91cd\u590d\u6570\u636e\u7684\u95ee\u9898");
                this.put("subService", "dealWithProductApplyRangeData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "\u7269\u6599");
                this.put("subName", "\u8ba1\u91cf\u5355\u4f4d\u8bbe\u7f6e\u89c4\u5219\u9009\u62e9\u4f7f\u7528\u7269\u6599\u6a21\u7248\uff0c\u4f46\u662f\u7269\u6599\u521b\u5efa\u4e0a\u7684\u7269\u6599\u6a21\u7248\u4e3a\u7a7a");
                this.put("subDes", "\u5c06\u4e0d\u5b58\u5728\u7269\u6599\u6a21\u677f\u4f46\u8bbe\u7f6e\u89c4\u5219\u4e3a\u201d\u4f7f\u7528\u7269\u6599\u6a21\u677f\u7684\u8ba1\u91cf\u5355\u4f4d\u201c\uff0c\u8c03\u6574\u4e3a\u201d\u4f7f\u7528\u7269\u6599\u81ea\u5df1\u7684\u8ba1\u91cf\u5355\u4f4d\u201c");
                this.put("subService", "dealWithProductUnitUseTypeData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "\u7269\u6599");
                this.put("subName", "\u7269\u6599\u8ba1\u91cf\u5355\u4f4d\u4e0d\u5b58\u5728");
                this.put("subDes", "\u5904\u7406\u7269\u6599\u4e3b\u8ba1\u91cf\u5355\u4f4d\u672a\u5728\u8ba1\u91cf\u5355\u4f4d\u8282\u70b9\u7ef4\u62a4\u7684\u9519\u8bef\u6570\u636e\uff0c\u76f8\u5173\u6570\u636e\u8bf7\u8c03\u7528\u540e\u67e5\u8be2\u540e\u7aef\u4e1a\u52a1\u65e5\u5fd7\u83b7\u53d6");
                this.put("subService", "dealWithProductUnitData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "\u7269\u6599");
                this.put("subName", "\u4e3b\u8f85\u8ba1\u91cf\u4e0e\u4e1a\u52a1\u8ba1\u91cf\u6570\u636e\u4e0d\u4e00\u81f4");
                this.put("subDes", "\u5904\u7406\u7269\u6599\u4e3b\u8f85\u8ba1\u91cf\u4e0e\u4e1a\u52a1\u8ba1\u91cf\u6570\u636e\u4e0d\u4e00\u81f4\u7684\u4e1a\u52a1\u6570\u636e\uff0c\u76f8\u5173\u6570\u636e\u8bf7\u8c03\u7528\u540e\u67e5\u8be2\u540e\u7aef\u4e1a\u52a1\u65e5\u5fd7\u83b7\u53d6");
                this.put("subService", "dealWithProductUnitNoMatchData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "\u7269\u6599");
                this.put("subName", "\u540c\u6b65\u7269\u6599\u4e3b\u8f85\u6362\u7b97\u7387\u7cbe\u5ea6\u503c\u4e0e\u53c2\u6570\u8bbe\u7f6e\u4e2d\u6362\u7b97\u7387\u7cbe\u5ea6\u4e00\u81f4");
                this.put("subDes", "\u7269\u6599\u3001\u7269\u6599\u6a21\u677f\u7684\u4e1a\u52a1\u8ba1\u91cf\u542f\u7528\u8f85\u8ba1\u91cf\u65f6\uff0c\u66f4\u65b0\u6362\u7b97\u7387\u7cbe\u5ea6\u53d8\u5316\u65f6\uff0c\u66f4\u65b0\u4e3b\u8f85\u6362\u7b97\u7387\u7684\u7ed3\u679c");
                this.put("subService", "dealWithProductUnitRateData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "SKU");
                this.put("subName", "\u540c\u89c4\u683c\u91cd\u590dsku\u6570\u636e");
                this.put("subDes", "\u5904\u7406\u540c\u89c4\u683c\u91cd\u590dsku\u6570\u636e\u7684\u95ee\u9898");
                this.put("subService", "dealWithProductSKURepeatData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "SKU");
                this.put("subName", "productSKUdetailNew\u7f3a\u5c11\u6570\u636e");
                this.put("subDes", "\u8865\u5145sku\u65b0\u6a21\u578b\u660e\u7ec6\u6570\u636e\u4e22\u5931\u95ee\u9898");
                this.put("subService", "dealWithSKUDetailNewMissingData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "SKU");
                this.put("subName", "productSKUExtend\u7f3a\u5c11\u6570\u636e");
                this.put("subDes", "\u8865\u5145skuextend\u6570\u636e\u4e22\u5931\u95ee\u9898");
                this.put("subService", "dealWithSKUExtendMissingData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "SKU");
                this.put("subName", "productSKUdetail\u7f3a\u5c11\u6570\u636e");
                this.put("subDes", "\u8865\u5145skudetail\u660e\u7ec6\u6570\u636e\u4e22\u5931\u95ee\u9898");
                this.put("subService", "dealWithSKUDetailMissingData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "SKU");
                this.put("subName", "skudetail\u6bd4productsku\u591a\u4f59\u6570\u636e");
                this.put("subDes", "\u5904\u7406sku\u660e\u7ec6\u8868\u6570\u636e\u6bd4sku\u4e3b\u8868\u6570\u636e\u591a\u7684\u95ee\u9898");
                this.put("subService", "dealWithSKUDetailErrorData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "SKU");
                this.put("subName", "productsku\u6bd4product\u7f3a\u5931\u6570\u636e");
                this.put("subDes", "\u5904\u7406productsku\u6bd4product\u7f3a\u5931\u6570\u636e\u7684\u95ee\u9898");
                this.put("subService", "dealWithProductSKUMissingData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "\u5ba2\u6237");
                this.put("subName", "\u5ba2\u6237\u540d\u79f0\u6709\u7a7a\u683c\uff0c\u6216\u8005\u6362\u884c");
                this.put("subDes", "\u5904\u7406\u5ba2\u6237\u540d\u79f0\u6709\u7a7a\u683c\uff0c\u6216\u8005\u6362\u884c\u7684\u95ee\u9898");
                this.put("subService", "dealWithMerchantData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "\u5ba2\u6237");
                this.put("subName", "\u5ba2\u6237\u5730\u5740\u7f16\u7801\u6709\u7a7a\u683c\uff0c\u6216\u8005\u6362\u884c");
                this.put("subDes", "\u5904\u7406\u5ba2\u6237\u5730\u5740\u7f16\u7801\u6709\u7a7a\u683c\uff0c\u6216\u8005\u6362\u884c\u7684\u95ee\u9898");
                this.put("subService", "dealWithMerchantAddressData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "\u5ba2\u6237");
                this.put("subName", "\u5ba2\u6237\u94f6\u884c\u4fe1\u606f\u94f6\u884c\u8d26\u53f7\u6709\u7a7a\u683c\uff0c\u6216\u8005\u6362\u884c");
                this.put("subDes", "\u5904\u7406\u5ba2\u6237\u94f6\u884c\u4fe1\u606f\u94f6\u884c\u8d26\u53f7\u6709\u7a7a\u683c\uff0c\u6216\u8005\u6362\u884c\u7684\u95ee\u9898");
                this.put("subService", "dealWithMerchantAgentFinancialData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "\u5ba2\u6237");
                this.put("subName", "\u5ba2\u6237\u53d1\u7968\u4fe1\u606f\u53d1\u7968\u62ac\u5934\u6709\u7a7a\u683c\uff0c\u6216\u8005\u6362\u884c");
                this.put("subDes", "\u5904\u7406\u5ba2\u6237\u53d1\u7968\u4fe1\u606f\u53d1\u7968\u62ac\u5934\u6709\u7a7a\u683c\uff0c\u6216\u8005\u6362\u884c\u7684\u95ee\u9898");
                this.put("subService", "dealWithMerchantAgentInvoiceData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "\u5ba2\u6237");
                this.put("subName", "\u5ba2\u6237\u5c5e\u6027\u6570\u636e\u663e\u793a\u5f02\u5e38");
                this.put("subDes", "\u5ba2\u6237\u5c5e\u6027\u6570\u636e\u663e\u793a\u5f02\u5e38");
                this.put("subService", "dealWithMerchantPropDisplayData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "\u5ba2\u6237\u5206\u7c7b");
                this.put("subName", "\u5ba2\u6237\u5206\u7c7b\u65b0\u6a21\u578b\u5347\u7ea7");
                this.put("subDes", "\u5ba2\u6237\u5206\u7c7b\u65b0\u6a21\u578b\u5347\u7ea7");
                this.put("subService", "dealWithCustCategoryUpdataData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "\u6210\u672c\u5206\u7c7b");
                this.put("subName", "\u6210\u672c\u5206\u7c7b\u65b0\u6a21\u578b\u5347\u7ea7");
                this.put("subDes", "\u6210\u672c\u5206\u7c7b\u65b0\u6a21\u578b\u5347\u7ea7");
                this.put("subService", "dealWithCostClsUpdataData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "UI\u6a21\u7248");
                this.put("subName", "UI\u6a21\u677f\u4e2d\u9519\u8bef\u7684\u5f15\u7528\u5173\u7cfb\u6570\u636e\u6e05\u7406");
                this.put("subDes", "\u6e05\u7406\u6570\u636e\u8303\u56f4\u5305\u62ec\u4f46\u4e0d\u9650\u4e8e\uff1a\u627e\u4e0d\u5230\u5bf9\u5e94entity\u7684\u6570\u636e\u3001\u65e0\u5bf9\u5e94\u4e0a\u7ea7\u6216\u4e3b\u5355\u636e\u7684\u5206\u7ec4\u6570\u636e\u3001\u65e0\u5bf9\u5e94\u5355\u636e\u6a21\u677f\u7684\u6570\u636e\u7b49\u9519\u8bef\u7684UI\u6a21\u677f\u6570\u636e");
                this.put("subService", "dealWithUIbaseData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "\u5ba2\u6237");
                this.put("subName", "\u5ba2\u6237\u65b0\u6a21\u578b\u6570\u636e\u5347\u7ea7");
                this.put("subDes", "\u5ba2\u6237\u65b0\u6a21\u578b\u6570\u636e\u5347\u7ea7");
                this.put("subService", "dealWithMerchantGroupData");
            }
        });
        BUSINESS_DATA_LIST.add((Map<String, String>)new HashMap<String, String>(){
            {
                this.put("subType", "\u7269\u6599");
                this.put("subName", "U8\u540c\u6b65\u7269\u6599\u6a21\u677f\u5347\u7ea7");
                this.put("subDes", "U8\u540c\u6b65\u7269\u6599\u6a21\u677f\u654f\u611f\u81ea\u7531\u9879\u52a0\u5bc6\u5904\u7406");
                this.put("subService", "dealWithNccMaterialTplData");
            }
        });
    }
}

