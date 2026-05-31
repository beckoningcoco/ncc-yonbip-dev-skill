/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BdUpdateEvent
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.itf.arap.tally.ITallySourceData
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.tally.BaseTallySourceVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.SuperVO
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.arap.busireg;

import java.util.ArrayList;
import java.util.List;
import nc.bs.businessevent.BdUpdateEvent;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.itf.arap.tally.ITallySourceData;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.tally.BaseTallySourceVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.SuperVO;
import nccloud.commons.lang.ArrayUtils;

public abstract class AbstractTallyListener
implements IBusinessListener {
    protected AggregatedValueObject[] getBills(IBusinessEvent event) {
        AggregatedValueObject[] bills = null;
        Object object = null;
        if (event instanceof BusinessEvent) {
            object = ((BusinessEvent)event).getObject();
        } else if (event instanceof BdUpdateEvent) {
            object = ((BdUpdateEvent)event).getNewObject();
        } else {
            throw new BusinessRuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0298") + event);
        }
        if (null != object) {
            bills = object.getClass().isArray() ? (AggregatedValueObject[])object : new AggregatedValueObject[]{(AggregatedValueObject)object};
        }
        return bills;
    }

    protected AggregatedValueObject[] getUpdateBills(IBusinessEvent event) throws BusinessException {
        Object[] obills = null;
        Object[] bills = null;
        AggregatedValueObject[] union = null;
        BdUpdateEvent e = (BdUpdateEvent)event;
        if (null != e.getUserObject()) {
            obills = e.getOldObject().getClass().isArray() ? (AggregatedValueObject[])e.getOldObject() : new AggregatedValueObject[]{(AggregatedValueObject)e.getOldObject()};
            bills = e.getNewObject().getClass().isArray() ? (AggregatedValueObject[])e.getNewObject() : new AggregatedValueObject[]{(AggregatedValueObject)e.getNewObject()};
            if ((ArrayUtils.isEmpty((Object[])obills) ? 0 : obills.length) != (ArrayUtils.isEmpty((Object[])bills) ? 0 : bills.length)) {
                ExceptionHandler.createAndThrowException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0299"));
            }
            int unionlen = (ArrayUtils.isEmpty((Object[])obills) ? 0 : obills.length) * 2;
            union = new AggregatedValueObject[unionlen];
            for (int i = 0; i < obills.length; ++i) {
                union[i * 2] = obills[i];
                union[i * 2 + 1] = bills[i];
            }
        }
        return union;
    }

    protected List<ITallySourceData> construct(AggregatedValueObject[] obills) {
        ArrayList<ITallySourceData> tallySourceDataList = new ArrayList<ITallySourceData>(obills.length);
        for (AggregatedValueObject bill : obills) {
            BaseTallySourceVO itallysourcedata = new BaseTallySourceVO((SuperVO)bill.getParentVO(), (SuperVO[])bill.getChildrenVO());
            if (((BaseBillVO)bill.getParentVO()).getBillstatus().equals(BillEnumCollection.BillSatus.TEMPEORARY.VALUE)) continue;
            tallySourceDataList.add((ITallySourceData)itallysourcedata);
        }
        return tallySourceDataList;
    }
}

