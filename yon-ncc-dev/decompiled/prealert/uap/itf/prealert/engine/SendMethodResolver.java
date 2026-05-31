/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package uap.itf.prealert.engine;

import nc.vo.pub.BusinessException;
import uap.vo.prealert.engine.SendMethod;

public interface SendMethodResolver {
    public SendMethod resolveById(Integer var1) throws BusinessException;
}

