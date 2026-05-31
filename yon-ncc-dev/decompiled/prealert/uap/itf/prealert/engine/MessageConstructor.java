/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package uap.itf.prealert.engine;

import java.util.Collection;
import nc.bs.pub.pa.PreAlertObject;
import nc.vo.pub.BusinessException;
import uap.vo.prealert.engine.EngineContext;
import uap.vo.prealert.engine.Message;

public interface MessageConstructor {
    public Collection<Message> construct(EngineContext var1, PreAlertObject var2) throws BusinessException;
}

