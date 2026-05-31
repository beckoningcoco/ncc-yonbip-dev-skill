/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 */
package com.yonyoucloud.iuap.upc.api.service;

import com.yonyou.ucf.mdd.ext.model.LoginUser;
import java.util.List;
import java.util.Map;

public interface IUPCUserService {
    public LoginUser getUserWithOrgs() throws Exception;

    public List<Map<String, Object>> getUserOrgsByBillnum(String var1) throws Exception;
}

