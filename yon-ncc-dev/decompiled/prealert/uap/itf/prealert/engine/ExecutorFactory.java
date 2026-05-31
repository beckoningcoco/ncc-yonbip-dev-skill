/*
 * Decompiled with CFR 0.152.
 */
package uap.itf.prealert.engine;

import uap.itf.prealert.engine.Executor;
import uap.vo.prealert.engine.EngineContext;

public interface ExecutorFactory {
    public Executor getExecutor(EngineContext var1);
}

