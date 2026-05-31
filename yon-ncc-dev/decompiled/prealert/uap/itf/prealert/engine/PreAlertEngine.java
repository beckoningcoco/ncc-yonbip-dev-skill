/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package uap.itf.prealert.engine;

import nc.vo.pub.BusinessException;
import uap.vo.prealert.engine.EngineContext;

public interface PreAlertEngine {
    public void execute(EngineContext var1) throws BusinessException;

    public String[] execute4Func(EngineContext var1) throws BusinessException;
}

