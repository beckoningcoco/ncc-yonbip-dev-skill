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

public interface IEventTypeQryService {
    public EventSourceVO[] getAllEventSourceVOs() throws BusinessException;

    public EventTypeVO[] getAllEventTypeVOs() throws BusinessException;

    public EventTypeVO getEventTypeVOByPK(String var1) throws BusinessException;

    public String getPK_eventtypeBy(String var1, String var2) throws BusinessException;

    public EventTypeVO getEventTypeVOBy(String var1, String var2) throws BusinessException;

    public EventTypeVO[] getEventTypeVOsBySourceID(String var1) throws BusinessException;
}

