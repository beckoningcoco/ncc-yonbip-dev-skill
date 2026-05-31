/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BdUpdateEvent
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.impl.pubapp.env.BSContext
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.bs.arap.busireg;

import java.util.HashMap;
import java.util.Map;
import nc.bs.businessevent.BdUpdateEvent;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.impl.pubapp.env.BSContext;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.apply.update.Update36DxUtils;
import nccloud.bs.arap.tbb.TBBCtrlUtils;
import org.apache.commons.lang3.ArrayUtils;

public class OtherModuleDataHandleListener
implements IBusinessListener {
    public void doAction(IBusinessEvent event) throws BusinessException {
        if (event == null) {
            return;
        }
        String eventType = event.getEventType();
        Map<String, AggregatedValueObject[]> map = this.getBills(event);
        Object[] obills = map.get("new");
        if (ArrayUtils.isEmpty((Object[])obills)) {
            return;
        }
        if ("arap_precheck_insert".equals(BSContext.getInstance().getSession("arap_precheck_stage"))) {
            new TBBCtrlUtils().budgetControl((AggregatedValueObject[])obills, eventType, 2);
        } else {
            new TBBCtrlUtils().budgetControl((AggregatedValueObject[])obills, eventType, 1);
        }
        new Update36DxUtils().do36Dx(map, eventType);
    }

    private Map<String, AggregatedValueObject[]> getBills(IBusinessEvent event) {
        BusinessEvent e;
        Object object = null;
        Object old = null;
        HashMap<String, AggregatedValueObject[]> retMap = new HashMap<String, AggregatedValueObject[]>();
        if (event instanceof BusinessEvent) {
            e = (BusinessEvent)event;
            object = e.getObject();
        } else if (event instanceof BdUpdateEvent) {
            e = (BdUpdateEvent)event;
            object = e.getNewObject();
            old = e.getOldObject();
        }
        AggregatedValueObject[] bills = null;
        AggregatedValueObject[] oldbills = null;
        if (null != object) {
            bills = object.getClass().isArray() ? (AggregatedValueObject[])object : new AggregatedValueObject[]{(AggregatedValueObject)object};
            retMap.put("new", bills);
        }
        if (null != old) {
            oldbills = old.getClass().isArray() ? (AggregatedValueObject[])old : new AggregatedValueObject[]{(AggregatedValueObject)old};
            retMap.put("old", oldbills);
        }
        return retMap;
    }
}

