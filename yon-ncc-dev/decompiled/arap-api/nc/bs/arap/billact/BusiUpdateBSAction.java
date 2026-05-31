/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.EventDispatcher
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.billact;

import nc.bs.arap.billact.BillBaseBSAction;
import nc.bs.arap.billact.LogTime;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.EventDispatcher;
import nc.bs.businessevent.IBusinessEvent;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.util.SagasUtils;

public abstract class BusiUpdateBSAction
extends BillBaseBSAction {
    public AggregatedValueObject updateVO(AggregatedValueObject pbill) throws BusinessException {
        AggregatedValueObject bill = pbill;
        if (null == bill) {
            throw new BusinessException("parameter is null!");
        }
        long t1 = System.currentTimeMillis();
        this.setbillsLock(bill);
        LogTime.debug("\u5355\u636e\u52a0\u52a8\u6001\u9501", t1);
        t1 = System.currentTimeMillis();
        this.checkBillsTs(bill);
        LogTime.debug("\u5355\u636e\u6821\u9a8cTS", t1);
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(bill.getClass().getName());
        String id = bean.getID();
        this.tmpMap.put("beanid", id);
        t1 = System.currentTimeMillis();
        this.setBillStatus(bill);
        LogTime.debug("\u8bbe\u7f6e\u5355\u636e\u72b6\u6001", t1);
        SagasUtils.frozenAndAddSaga("update", bill);
        t1 = System.currentTimeMillis();
        this.doBeforeUpdate(bill);
        LogTime.debug("\u5355\u636e\u5904\u7406\u524d\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.validateWithPermission(bill);
        LogTime.debug("\u5355\u636e\u6821\u9a8c", t1);
        t1 = System.currentTimeMillis();
        this.doBeforeFireEvent(bill);
        LogTime.debug("\u5355\u636e\u5904\u7406\u524d\u901a\u77e5\u76d1\u542c\u8005", t1);
        t1 = System.currentTimeMillis();
        bill = this.doBusiness(bill);
        LogTime.debug("\u5355\u636e\u5904\u7406\u4fdd\u5b58\u5230\u6570\u636e\u5e93", t1);
        t1 = System.currentTimeMillis();
        LogTime.debug("\u5355\u636e\u5904\u7406\u540e\u6743\u9650\u9a8c\u8bc1", t1);
        t1 = System.currentTimeMillis();
        this.doAfterUpdate(bill);
        LogTime.debug("\u5355\u636e\u5904\u7406\u540e\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.doAfterFireEvent(bill);
        LogTime.debug("\u5355\u636e\u5904\u7406\u540e\u901a\u77e5\u76d1\u542c\u8005", t1);
        this.tmpMap.clear();
        return bill;
    }

    protected void doAfterFireEvent(AggregatedValueObject bill) throws BusinessException {
        if (null != this.getAfterEventType()) {
            EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), this.getAfterEventType(), (Object)bill));
        }
    }

    protected abstract void doAfterUpdate(AggregatedValueObject var1) throws BusinessException;

    protected void doBeforeFireEvent(AggregatedValueObject bill) throws BusinessException {
        if (null != this.getBeforeEventType()) {
            EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), this.getBeforeEventType(), (Object)bill));
        }
    }

    protected abstract void doBeforeUpdate(AggregatedValueObject var1) throws BusinessException;

    protected abstract AggregatedValueObject doBusiness(AggregatedValueObject var1) throws BusinessException;

    protected String getAfterEventType() {
        return null;
    }

    protected String getBeforeEventType() {
        return null;
    }

    protected AggregatedValueObject getOriginBill(AggregatedValueObject bill) throws BusinessException {
        return (AggregatedValueObject)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(bill.getClass(), bill.getParentVO().getPrimaryKey(), false);
    }

    protected void setBillStatus(AggregatedValueObject bill) throws BusinessException {
        if (null != bill) {
            bill.getParentVO().setStatus(1);
        }
    }
}

