/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package uap.vo.prealert.engine.receiver;

import java.io.Serializable;
import nc.vo.pub.BusinessException;

public interface ReceiverType
extends Serializable {
    public Integer getId();

    public String getName();

    public String[] getActualReceiver(String var1) throws BusinessException;
}

