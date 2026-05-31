/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.util.OptionUtils
 */
package com.yonyoucloud.upc.service.utils;

import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.util.OptionUtils;

public class DomainCommonUtils {
    public static Boolean isU8C() {
        String optionValue;
        String PRODUCTLINE = "productLine";
        String DEFAULT_VALUE = "default";
        Object tenantId = AppContext.getTenantId();
        Object obj = OptionUtils.getSystemOption((Object)tenantId, (String)PRODUCTLINE);
        String string = optionValue = obj == null ? DEFAULT_VALUE : obj.toString();
        if (DEFAULT_VALUE.equals(optionValue)) {
            return false;
        }
        return true;
    }
}

