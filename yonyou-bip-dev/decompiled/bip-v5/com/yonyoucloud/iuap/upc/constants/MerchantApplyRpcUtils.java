/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.constants;

import java.util.HashMap;

public class MerchantApplyRpcUtils {
    public static final HashMap<String, String> MERCHANT_FIELD_MAPPING = new HashMap(16);
    public static final HashMap<String, String> MERCHANT_APPLY_RANGE_DETAIL_FIELD_MAPPING = new HashMap(64);

    static {
        MERCHANT_FIELD_MAPPING.put("customerClass.name", "customerClass_Name");
        MERCHANT_APPLY_RANGE_DETAIL_FIELD_MAPPING.put("customerLevel.name", "customerLevel_Name");
        MERCHANT_APPLY_RANGE_DETAIL_FIELD_MAPPING.put("taxRate.name", "taxRate_Name");
        MERCHANT_APPLY_RANGE_DETAIL_FIELD_MAPPING.put("taxRate.ntaxrate", "taxRate_NtaxRate");
    }
}

