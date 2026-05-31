/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.pub.AggregatedValueObject
 */
package nc.bs.arap.busireg;

import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.pub.AggregatedValueObject;

@Deprecated
public abstract class AbstractDapMessageListener
implements IBusinessListener {
    protected AggregatedValueObject[] getBills(IBusinessEvent event) {
        AggregatedValueObject[] bills = null;
        BusinessEvent e = (BusinessEvent)event;
        if (null != e.getUserObject()) {
            bills = e.getObject().getClass().isArray() ? (AggregatedValueObject[])e.getObject() : new AggregatedValueObject[]{(AggregatedValueObject)e.getObject()};
        }
        if (bills == null) {
            return null;
        }
        for (AggregatedValueObject bill : bills) {
            if (((BaseBillVO)bill.getParentVO()).getIsinit() == null || !((BaseBillVO)bill.getParentVO()).getIsinit().booleanValue()) continue;
            return null;
        }
        return bills;
    }
}

