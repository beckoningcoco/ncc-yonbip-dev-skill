/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.businessevent;

import nc.vo.pub.BusinessException;
import nc.vo.uap.businessevent.EventSourceVO;
import nc.vo.uap.businessevent.EventTypeVO;

public interface IEventTypeService {
    public EventSourceVO insert(EventSourceVO var1) throws BusinessException;

    public EventSourceVO update(EventSourceVO var1) throws BusinessException;

    public void delete(EventSourceVO var1) throws BusinessException;

    public EventTypeVO insert(EventTypeVO var1) throws BusinessException;

    public EventTypeVO update(EventTypeVO var1) throws BusinessException;

    public void delete(EventTypeVO var1) throws BusinessException;
}

