/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.api.service;

import java.util.List;
import java.util.Map;

public interface IMCUpdateEventHandler {
    public void Handle(List<String> var1) throws Exception;

    default public void HandleShareRange(Map shareRangeData) throws Exception {
    }
}

