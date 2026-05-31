/*
 * Decompiled with CFR 0.152.
 */
package uap.itf.prealert.engine;

import java.util.Collection;
import uap.itf.prealert.engine.MessageSender;
import uap.vo.prealert.engine.EngineContext;
import uap.vo.prealert.engine.Message;

public interface MessageSenderFactory {
    public MessageSender getMessageSender(EngineContext var1, Collection<Message> var2);
}

