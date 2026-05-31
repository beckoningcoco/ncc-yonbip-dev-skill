/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.logging.Logger
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.MetaDataException
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.businessevent;

import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.logging.Logger;
import nc.md.MDBaseQueryFacade;
import nc.md.model.MetaDataException;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.compensate.businessevent.CompenstateEventDispatcher;

public class EventDispatcherProxy {
    private static EventDispatcherProxy instance;
    private static Object lock;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static EventDispatcherProxy getInstance() {
        EventDispatcherProxy localInstance = instance;
        if (localInstance == null) {
            Object object = lock;
            synchronized (object) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new EventDispatcherProxy();
                }
            }
        }
        return localInstance;
    }

    public void fireBeforeDelEvent(AggregatedValueObject[] bills) throws BusinessException {
        this.setBillstatus(bills, BillEnumCollection.BillSatus.SAVE.VALUE);
        this.fireBusinessEvent(bills, "1005");
    }

    public void fireAfterDelEvent(AggregatedValueObject[] bills) throws BusinessException {
        this.setBillstatus(bills, BillEnumCollection.BillSatus.DELETED.VALUE);
        this.fireBusinessEvent(bills, "1006");
    }

    public void fireBeforeInsertEvent(AggregatedValueObject[] bills) throws BusinessException {
        if (((BaseBillVO)bills[0].getParentVO()).getIsinit() == null || !((BaseBillVO)bills[0].getParentVO()).getIsinit().booleanValue()) {
            this.setBillstatus(bills, BillEnumCollection.BillSatus.SAVE.VALUE);
        }
        this.fireBusinessEvent(bills, "1001");
    }

    public void fireAfterInsertEvent(AggregatedValueObject[] bills) throws BusinessException {
        this.setBillstatus(bills, BillEnumCollection.BillSatus.SAVE.VALUE);
        this.fireBusinessEvent(bills, "1002");
    }

    public void fireBeforeTempEvent(AggregatedValueObject[] bills) throws BusinessException {
        this.setBillstatus(bills, BillEnumCollection.BillSatus.SAVE.VALUE);
        this.fireBusinessEvent(bills, "1001");
    }

    public void fireAfterTempEvent(AggregatedValueObject[] bills) throws BusinessException {
        this.setBillstatus(bills, BillEnumCollection.BillSatus.TEMPEORARY.VALUE);
        this.fireBusinessEvent(bills, "1002");
    }

    public void fireBeforeApvEvent(AggregatedValueObject[] bills) throws BusinessException {
        if (((BaseBillVO)bills[0].getParentVO()).getIsinit() == null || !((BaseBillVO)bills[0].getParentVO()).getIsinit().booleanValue()) {
            this.setBillstatus(bills, BillEnumCollection.BillSatus.SAVE.VALUE);
        }
        this.fireBusinessEvent(bills, "1019");
    }

    public void fireAfterApvEvent(AggregatedValueObject[] bills) throws BusinessException {
        this.setBillstatus(bills, BillEnumCollection.BillSatus.AUDIT.VALUE);
        this.fireBusinessEvent(bills, "1020");
    }

    public void fireBeforeUnApvEvent(AggregatedValueObject[] bills) throws BusinessException {
        this.setBillstatus(bills, BillEnumCollection.BillSatus.AUDIT.VALUE);
        this.fireBusinessEvent(bills, "1021");
    }

    public void fireAfterUnApvEvent(AggregatedValueObject[] bills) throws BusinessException {
        this.setBillstatus(bills, BillEnumCollection.BillSatus.SAVE.VALUE);
        this.fireBusinessEvent(bills, "1022");
    }

    public void fireBeforeEffectEvent(AggregatedValueObject[] bills) throws BusinessException {
        if (((BaseBillVO)bills[0].getParentVO()).getIsinit() == null || !((BaseBillVO)bills[0].getParentVO()).getIsinit().booleanValue()) {
            this.setEffectstatus(bills, BillEnumCollection.InureSign.NOINURE.VALUE);
        }
        this.fireBusinessEvent(bills, "200603");
    }

    public void fireAfterEffectEvent(AggregatedValueObject[] bills) throws BusinessException {
        this.setEffectstatus(bills, BillEnumCollection.InureSign.OKINURE.VALUE);
        this.fireBusinessEvent(bills, "200604");
    }

    public void fireBeforeApvEffectEvent(AggregatedValueObject[] bills) throws BusinessException {
        this.fireBeforeApvEvent(bills);
        this.fireBeforeEffectEvent(bills);
    }

    public void fireAfterApvEffectEvent(AggregatedValueObject[] bills) throws BusinessException {
        this.fireAfterApvEvent(bills);
        this.fireAfterEffectEvent(bills);
    }

    public void fireBeforeUnApvEffectEvent(AggregatedValueObject[] bills) throws BusinessException {
        this.fireBeforeUnApvEvent(bills);
        this.fireBeforeUnEffectEvent(bills);
    }

    public void fireAfterUnApvEffectEvent(AggregatedValueObject[] bills) throws BusinessException {
        this.fireAfterUnEffectEvent(bills);
        this.fireAfterUnApvEvent(bills);
    }

    public void fireBeforeUnEffectEvent(AggregatedValueObject[] bills) throws BusinessException {
        this.setEffectstatus(bills, BillEnumCollection.InureSign.OKINURE.VALUE);
        this.fireBusinessEvent(bills, "200605");
    }

    public void fireAfterUnEffectEvent(AggregatedValueObject[] bills) throws BusinessException {
        this.setEffectstatus(bills, BillEnumCollection.InureSign.NOINURE.VALUE);
        this.fireBusinessEvent(bills, "200606");
    }

    public void fireBusinessEvent(AggregatedValueObject[] bills, String typeDeleteBefore) throws BusinessException, MetaDataException {
        this.checkBills(bills);
        long begin = System.currentTimeMillis();
        CompenstateEventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent(this.getBeanId(bills), typeDeleteBefore, (Object[])bills));
        long occurr = System.currentTimeMillis() - begin;
        Logger.debug((Object)("[arap]" + occurr), this.getClass(), (String)"fireBusinessEvent");
    }

    private void setBillstatus(AggregatedValueObject[] bills, Integer value) throws BusinessException {
        this.checkBills(bills);
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setAttributeValue("billstatus", (Object)value);
        }
    }

    private void setEffectstatus(AggregatedValueObject[] bills, Integer value) throws BusinessException {
        this.checkBills(bills);
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setAttributeValue("effectstatus", (Object)value);
        }
    }

    private String getBeanId(AggregatedValueObject[] bills) throws MetaDataException {
        long begin = System.currentTimeMillis();
        String beanid = MDBaseQueryFacade.getInstance().getBeanByFullClassName(bills[0].getClass().getName()).getID();
        Logger.debug((Object)("[arap]" + (System.currentTimeMillis() - begin)), this.getClass(), (String)"getBeanId");
        return beanid;
    }

    private void checkBills(AggregatedValueObject[] bills) throws BusinessException {
        if (null == bills || bills.length == 0) {
            throw new BusinessException("parameter is null!");
        }
    }

    static {
        lock = new Object();
    }
}

