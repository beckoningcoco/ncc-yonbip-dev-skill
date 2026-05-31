/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.tally.ITallySourceData
 *  nc.pubitf.arap.tally.ITallyService
 *  nc.vo.arap.tally.BusiTypeEnum
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.arap.busireg;

import java.util.List;
import nc.bs.arap.busireg.AbstractTallyListener;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.tally.ITallySourceData;
import nc.pubitf.arap.tally.ITallyService;
import nc.vo.arap.tally.BusiTypeEnum;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.commons.lang.ArrayUtils;

public class BillTallyListener
extends AbstractTallyListener {
    public void doAction(IBusinessEvent event) throws BusinessException {
        Object[] obills = this.getBills(event);
        if (ArrayUtils.isEmpty((Object[])obills)) {
            return;
        }
        String eventType = event.getEventType();
        List<ITallySourceData> tallySourceData = this.construct((AggregatedValueObject[])obills);
        if (tallySourceData == null || tallySourceData.size() == 0) {
            return;
        }
        ITallyService tallySrv = (ITallyService)NCLocator.getInstance().lookup(ITallyService.class);
        if ("1002".equals(eventType)) {
            tallySrv.registerTally(BusiTypeEnum.BILL_ENTER, tallySourceData);
        } else if ("1004".equals(eventType)) {
            tallySrv.registerTally(BusiTypeEnum.BILL_MODIFY, this.construct(this.getUpdateBills(event)));
        } else if ("1005".equals(eventType) || "1006".equals(eventType)) {
            tallySrv.deleteTally(BusiTypeEnum.BILL_DELETE, tallySourceData);
        } else if ("1020".equals(eventType)) {
            tallySrv.effectTally(BusiTypeEnum.BILL_CONFIRM, tallySourceData);
        } else if ("200604".equals(eventType)) {
            tallySrv.effectTally(BusiTypeEnum.BILL_EFFECT, tallySourceData);
        } else if ("200606".equals(eventType)) {
            tallySrv.unEffectTally(BusiTypeEnum.BILL_UNEFFECT, tallySourceData);
        } else if ("1022".equals(eventType)) {
            tallySrv.unEffectTally(BusiTypeEnum.BILL_UNCONFIRM, tallySourceData);
        } else {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0254"));
        }
    }
}

