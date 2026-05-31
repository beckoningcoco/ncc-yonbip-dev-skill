/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package uap.itf.prealert.engine;

import nc.bs.pub.pa.PreAlertObject;
import nc.vo.pub.BusinessException;
import uap.vo.prealert.engine.EngineContext;

public interface Executor {
    public PreAlertObject execute(EngineContext var1) throws BusinessException;
}

