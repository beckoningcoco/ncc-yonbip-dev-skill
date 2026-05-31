/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.api.service;

import java.util.List;
import java.util.Map;

public interface IBizReferenceCheckService {
    public Map<String, Object> checkReference(String var1, List<Long> var2);

    public Map<String, Object> checkReference(String var1, Long var2) throws Exception;
}

