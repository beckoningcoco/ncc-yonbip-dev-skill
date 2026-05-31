/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.api.cron;

import java.util.List;
import java.util.Map;

public interface ICronJob<T> {
    public void execute(Map<String, Object> var1) throws Exception;

    public List<T> create();

    public T createOne();
}

