/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BdUpdateEvent
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.arap.busireg;

import nc.bs.arap.termend.TermEndCtrlBO;
import nc.bs.businessevent.BdUpdateEvent;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.commons.lang.ArrayUtils;

public class TermEndCtrlListener
implements IBusinessListener {
    public void doAction(IBusinessEvent event) throws BusinessException {
        if (!"1019".equals(event.getEventType()) && !"1021".equals(event.getEventType())) {
            return;
        }
        Object[] obills = this.getBills(event);
        if (ArrayUtils.isEmpty((Object[])obills)) {
            return;
        }
        new TermEndCtrlBO().checkIsCloseAcc((AggregatedValueObject)obills[0]);
    }

    protected AggregatedValueObject[] getBills(IBusinessEvent event) {
        BusinessEvent e;
        Object object = null;
        if (event instanceof BusinessEvent) {
            e = (BusinessEvent)event;
            object = e.getObject();
        } else if (event instanceof BdUpdateEvent) {
            e = (BdUpdateEvent)event;
            object = e.getNewObject();
        }
        AggregatedValueObject[] bills = null;
        if (null != object) {
            bills = object.getClass().isArray() ? (AggregatedValueObject[])object : new AggregatedValueObject[]{(AggregatedValueObject)object};
        }
        return bills;
    }
}

