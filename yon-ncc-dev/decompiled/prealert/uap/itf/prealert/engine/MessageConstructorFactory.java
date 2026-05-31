/*
 * Decompiled with CFR 0.152.
 */
package uap.itf.prealert.engine;

import nc.bs.pub.pa.PreAlertObject;
import uap.itf.prealert.engine.MessageConstructor;
import uap.vo.prealert.engine.EngineContext;

public interface MessageConstructorFactory {
    public MessageConstructor getMessageConstructor(EngineContext var1, PreAlertObject var2);
}

