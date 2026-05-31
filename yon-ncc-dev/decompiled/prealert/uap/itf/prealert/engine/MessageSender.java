/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package uap.itf.prealert.engine;

import java.util.Collection;
import nc.vo.pub.BusinessException;
import uap.vo.prealert.engine.EngineContext;
import uap.vo.prealert.engine.Message;

public interface MessageSender {
    public void sendMessages(EngineContext var1, Collection<Message> var2) throws BusinessException;
}

