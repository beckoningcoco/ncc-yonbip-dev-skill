/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.bd.meta.BatchOperateVO
 *  nc.vo.pub.BusinessException
 */
package nc.itf.businessevent;

import nc.vo.bd.meta.BatchOperateVO;
import nc.vo.pub.BusinessException;
import nc.vo.uap.businessevent.EventListenerVO;

public interface IEventListenerService {
    public EventListenerVO insert(EventListenerVO var1) throws BusinessException;

    public EventListenerVO update(EventListenerVO var1) throws BusinessException;

    public void delete(EventListenerVO var1) throws BusinessException;

    public BatchOperateVO batchSaveEventListeners(BatchOperateVO var1) throws BusinessException;
}

