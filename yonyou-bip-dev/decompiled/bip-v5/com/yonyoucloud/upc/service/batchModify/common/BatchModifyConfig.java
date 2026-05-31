/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.batchModify.common;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BatchModifyConfig {
    public static final Map<String, Set<String>> uniqueIdentifierMap = BatchModifyConfig.initializeUniqueIdentifierMap();
    public static final String FROM_BATCH_MODIFY = "_fromBatchModify";
    public static final String FROM_BATCH_MODIFY_ONE = "fromBatchModify_";
    public static final String operationNameResid = "UID:P_COREDOC-UI_17AAAFC8042017E9";
    public static final String operationName = "\u6279\u6539";

    private static Map<String, Set<String>> initializeUniqueIdentifierMap() {
        HashMap<String, Set<String>> map = new HashMap<String, Set<String>>();
        HashSet<String> skuIdentifiers = new HashSet<String>();
        skuIdentifiers.add("skuId");
        skuIdentifiers.add("productDetailId");
        map.put("pc_productsku_edit", skuIdentifiers);
        HashSet<String> productIdentifiers = new HashSet<String>();
        productIdentifiers.add("code");
        map.put("pc_product", productIdentifiers);
        HashSet<String> productDetailIdentifiers = new HashSet<String>();
        productDetailIdentifiers.add("code");
        productDetailIdentifiers.add("productApplyRangeId");
        map.put("pc_productdetail", productDetailIdentifiers);
        HashSet<String> merchantDetailIdentifiers = new HashSet<String>();
        merchantDetailIdentifiers.add("merchantApplyRangeId");
        map.put("aa_merchantdetail", merchantDetailIdentifiers);
        return map;
    }
}

