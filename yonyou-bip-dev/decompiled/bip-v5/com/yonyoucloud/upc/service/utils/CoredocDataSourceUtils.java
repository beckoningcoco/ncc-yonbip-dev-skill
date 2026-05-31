/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.utils;

import java.util.Map;

public class CoredocDataSourceUtils {
    public static void setApiSoure(Map data) {
        data.put("_fromApi", true);
    }

    public static void setExcelImportSoure(Map data) {
        CoredocDataSourceUtils.setApiSoure(data);
        data.put("fromExcelImport", true);
    }

    public static Boolean isFromApi(Map data) {
        Boolean result = false;
        if (data.containsKey("_fromApi") && data.get("_fromApi").equals(true)) {
            result = true;
        }
        return result;
    }

    public static Boolean isFromExcelImport(Map data) {
        Boolean result = false;
        if (data.containsKey("fromExcelImport") && data.get("fromExcelImport").equals(true)) {
            result = true;
        }
        return result;
    }
}

