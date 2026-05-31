/*
 * Decompiled with CFR 0.152.
 */
package uap.itf.prealert.engine;

import java.util.Collection;
import uap.itf.prealert.engine.MessagePersister;
import uap.vo.prealert.engine.EngineContext;
import uap.vo.prealert.engine.Message;

public interface MessagePersisterFactory {
    public MessagePersister getMessagePersister(EngineContext var1, Collection<Message> var2);
}

