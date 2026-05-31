/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.api.service;

import java.util.Map;

public interface IOrgEventConsumer {
    public Map<String, Object> onMcUpdate(Map var1);

    public Map<String, Object> onOrgUpdateParent(Map var1, String var2);

    public Map<String, Object> onOrgEnabled(Map var1, String var2);

    public Map<String, Object> onOrgUpdateDoctype(Map var1, String var2);
}

