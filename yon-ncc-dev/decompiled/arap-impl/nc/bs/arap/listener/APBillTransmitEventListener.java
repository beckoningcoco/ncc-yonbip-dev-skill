/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.uap.pf.IPFBusiAction
 *  nc.pubitf.arap.bill.IArapBillPubQueryService
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.listener;

import java.util.Map;
import nc.bs.arap.listener.ARBillTransmitEventListener;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.framework.common.NCLocator;
import nc.itf.uap.pf.IPFBusiAction;
import nc.pubitf.arap.bill.IArapBillPubQueryService;
import nc.vo.pub.BusinessException;

public class APBillTransmitEventListener
extends ARBillTransmitEventListener {
    @Override
    public void doAction(IBusinessEvent event) throws BusinessException {
        Map map = (Map)((BusinessEvent)event).getObject();
        String new_user = (String)map.get("new_user");
        IArapBillPubQueryService service = (IArapBillPubQueryService)NCLocator.getInstance().lookup(IArapBillPubQueryService.class);
        IPFBusiAction busiAction = (IPFBusiAction)NCLocator.getInstance().lookup(IPFBusiAction.class);
        if (map.containsKey("F1")) {
            this.upateAggVO(map, new_user, service, busiAction, "F1");
        }
        if (map.containsKey("F3")) {
            this.upateAggVO(map, new_user, service, busiAction, "F3");
        }
    }
}

