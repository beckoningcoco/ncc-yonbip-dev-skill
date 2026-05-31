/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package uap.vo.prealert.engine.receiver;

import nc.vo.pub.BusinessException;
import uap.vo.prealert.engine.receiver.ReceiverType;

public interface Receiver {
    public ReceiverType getType();

    public String getPk();

    public String[] getUserids() throws BusinessException;
}

