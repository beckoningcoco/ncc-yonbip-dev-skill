/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package uap.itf.prealert.engine;

import nc.vo.pub.BusinessException;
import uap.vo.prealert.engine.receiver.ReceiverType;

public interface ReceiverTypeResolver {
    public ReceiverType resolveById(Integer var1) throws BusinessException;
}

