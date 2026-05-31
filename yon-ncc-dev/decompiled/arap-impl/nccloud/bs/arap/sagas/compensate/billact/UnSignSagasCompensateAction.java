/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BdUpdateEvent
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nccloud.bs.arap.sagas.compensate.billact;

import nc.bs.arap.actions.BillUnSignBatchBSAction;
import nc.bs.arap.billact.LogTime;
import nc.bs.businessevent.BdUpdateEvent;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.compensate.billact.IBaseSagasCompensateAction;

public class UnSignSagasCompensateAction
extends BillUnSignBatchBSAction
implements IBaseSagasCompensateAction {
    @Override
    public AggregatedValueObject[] doSagasCompensate(AggregatedValueObject[] bills) throws BusinessException {
        return this.updateVO(bills);
    }

    @Override
    public AggregatedValueObject[] updateVO(AggregatedValueObject[] pBills) throws BusinessException {
        if (null == pBills || pBills.length == 0) {
            throw new BusinessException("parameter is null!");
        }
        AggregatedValueObject[] bills = pBills;
        long t1 = System.currentTimeMillis();
        this.setbillsLock(bills);
        LogTime.debug("\u5355\u636e\u52a0\u52a8\u6001\u9501", t1);
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(bills[0].getClass().getName());
        String id = bean.getID();
        this.tmpMap.put("beanid", id);
        t1 = System.currentTimeMillis();
        this.setBillStatus(bills);
        LogTime.debug("\u8bbe\u7f6e\u5355\u636e\u72b6\u6001", t1);
        t1 = System.currentTimeMillis();
        this.doBeforeUpdate(bills);
        LogTime.debug("\u5355\u636e\u5904\u7406\u524d\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.doBeforeFireEvent(bills);
        LogTime.debug("\u5355\u636e\u5904\u7406\u524d\u901a\u77e5\u76d1\u542c\u8005", t1);
        t1 = System.currentTimeMillis();
        bills = this.doBusiness(bills);
        LogTime.debug("\u5355\u636e\u5904\u7406\u4fdd\u5b58\u5230\u6570\u636e\u5e93", t1);
        t1 = System.currentTimeMillis();
        this.doAfterUpdate(bills);
        LogTime.debug("\u5355\u636e\u5904\u7406\u540e\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.doAfterFireEvent(bills);
        LogTime.debug("\u5355\u636e\u5904\u7406\u540e\u901a\u77e5\u76d1\u542c\u8005", t1);
        this.tmpMap.clear();
        return bills;
    }

    @Override
    protected void doBeforeFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        if (null != this.getBeforeEventType()) {
            Object event = null;
            event = "1003".equals(this.getBeforeEventType()) ? new BdUpdateEvent((String)this.tmpMap.get("beanid"), this.getBeforeEventType(), (Object)this.getOriginBill(bills), (Object)bills) : new BusinessEvent((String)this.tmpMap.get("beanid"), this.getBeforeEventType(), (Object[])bills);
            this.fireEvent((IBusinessEvent)event);
        }
    }

    @Override
    protected void doAfterFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        if (null != this.getAfterEventType()) {
            Object event = null;
            event = "1004".equals(this.getAfterEventType()) ? new BdUpdateEvent((String)this.tmpMap.get("beanid"), this.getAfterEventType(), (Object)this.getOriginBill(bills), (Object)bills) : new BusinessEvent((String)this.tmpMap.get("beanid"), this.getAfterEventType(), (Object[])bills);
            this.fireEvent((IBusinessEvent)event);
        }
    }
}

