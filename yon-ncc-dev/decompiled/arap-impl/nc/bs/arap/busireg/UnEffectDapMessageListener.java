/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.BillEffectUtils
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.arap.busireg;

import nc.bs.arap.busireg.AbstractDapMessageListener;
import nc.bs.arap.util.BillEffectUtils;
import nc.bs.businessevent.IBusinessEvent;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.commons.lang.ArrayUtils;

@Deprecated
public class UnEffectDapMessageListener
extends AbstractDapMessageListener {
    public void doAction(IBusinessEvent event) throws BusinessException {
        if ("200606".equals(event.getEventType())) {
            Object[] bills = this.getBills(event);
            if (ArrayUtils.isEmpty((Object[])bills)) {
                return;
            }
            BillEffectUtils.sendDAPMessgeDel((AggregatedValueObject[])bills);
        }
    }
}

