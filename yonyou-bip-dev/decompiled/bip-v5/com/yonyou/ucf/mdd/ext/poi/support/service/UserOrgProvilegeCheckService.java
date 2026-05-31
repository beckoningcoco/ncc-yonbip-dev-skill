/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.ucf.mdd.ext.poi.support.service;

import com.yonyou.ucf.mdd.ext.poi.support.service.DataProvilegeCheckService;
import java.util.Map;

public abstract class UserOrgProvilegeCheckService
implements DataProvilegeCheckService {
    public abstract boolean dataProvilegeCheck(String var1, Map<String, Object> var2, StringBuilder var3);
}

