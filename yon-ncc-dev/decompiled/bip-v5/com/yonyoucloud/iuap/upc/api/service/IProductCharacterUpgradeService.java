/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.api.service;

import java.util.List;
import java.util.Map;

public interface IProductCharacterUpgradeService {
    public Map<String, Object> defineDataPreCheckByTenant(String var1) throws Exception;

    public void defineDataPreCheck(Long var1, Long var2) throws Exception;

    public void defineDataPreCheck(List<String> var1) throws Exception;
}

