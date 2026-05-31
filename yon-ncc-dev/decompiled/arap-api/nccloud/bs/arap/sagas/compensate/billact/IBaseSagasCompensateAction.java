/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nccloud.bs.arap.sagas.compensate.billact;

import nc.bs.arap.billact.IBSAction;
import nc.bs.businessevent.IBusinessEvent;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.compensate.businessevent.CompenstateEventDispatcher;

public interface IBaseSagasCompensateAction
extends IBSAction {
    public AggregatedValueObject[] doSagasCompensate(AggregatedValueObject[] var1) throws BusinessException;

    default public void fireEvent(IBusinessEvent event) throws BusinessException {
        CompenstateEventDispatcher.fireEvent(event);
    }
}

