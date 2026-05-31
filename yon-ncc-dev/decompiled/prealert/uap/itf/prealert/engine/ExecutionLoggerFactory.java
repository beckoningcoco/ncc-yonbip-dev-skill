/*
 * Decompiled with CFR 0.152.
 */
package uap.itf.prealert.engine;

import uap.itf.prealert.engine.ExecutionLogger;
import uap.vo.prealert.engine.EngineContext;

public interface ExecutionLoggerFactory {
    public ExecutionLogger getLogger(EngineContext var1);
}

