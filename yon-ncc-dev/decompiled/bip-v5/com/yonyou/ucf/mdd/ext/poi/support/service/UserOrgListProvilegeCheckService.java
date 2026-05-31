/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.ucf.mdd.ext.poi.support.service;

import com.yonyou.ucf.mdd.ext.poi.support.service.DataProvilegeCheckService;
import java.util.Map;
import java.util.Set;

public abstract class UserOrgListProvilegeCheckService
implements DataProvilegeCheckService {
    public abstract boolean dataProvilegeCheck(Set<String> var1, Map<String, Object> var2, StringBuilder var3);
}

