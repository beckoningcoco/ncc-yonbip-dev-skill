/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.businessevent;

import nc.vo.pub.BusinessException;
import nc.vo.uap.businessevent.EventListenerVO;
import nc.vo.uap.businessevent.UnionVO;

public interface IEventListenerQryService {
    public UnionVO[] getAllListeners() throws BusinessException;

    public EventListenerVO[] getListenersBy(String var1, String var2) throws BusinessException;

    public EventListenerVO[] getListenersByPK_eventtype(String var1) throws BusinessException;
}

