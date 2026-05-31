/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BdUpdateEvent
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

import java.util.Collection;
import nc.bs.arap.billact.BillBaseBSAction;
import nc.bs.arap.billact.LogTime;
import nc.bs.businessevent.BdUpdateEvent;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.EventDispatcher;
import nc.bs.businessevent.IBusinessEvent;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.util.SagasUtils;
import nccloud.bs.arap.util.LightVOProducer;

public abstract class BusiUpdateBatchBSAction
extends BillBaseBSAction {
    private String afterEventType;
    private String beforeEventType;

    public void setAfterEventType(String afterEventType) {
        this.afterEventType = afterEventType;
    }

    public void setBeforeEventType(String beforeEventType) {
        this.beforeEventType = beforeEventType;
    }

    public AggregatedValueObject[] updateVO(AggregatedValueObject[] pBills) throws BusinessException {
        if (null == pBills || pBills.length == 0) {
            throw new BusinessException("parameter is null!");
        }
        AggregatedValueObject[] bills = pBills;
        AggregatedValueObject[] oribills = null;
        if (!SagasUtils.isMerged) {
            oribills = this.getOriginBill(bills);
        }
        long t1 = System.currentTimeMillis();
        SagasUtils.frozenAndAddSaga(this.getBusiType(), bills);
        LogTime.debug("\u6dfb\u52a0sagas\u4e8b\u52a1\u4ee5\u53ca\u51bb\u7ed3\u5355\u636e", t1);
        t1 = System.currentTimeMillis();
        this.setbillsLock(bills);
        LogTime.debug("\u5355\u636e\u52a0\u52a8\u6001\u9501", t1);
        t1 = System.currentTimeMillis();
        this.checkBillsTs(bills);
        LogTime.debug("\u5355\u636e\u6821\u9a8cTS", t1);
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
        this.validateWithPermission(bills);
        LogTime.debug("\u5355\u636e\u6821\u9a8c", t1);
        t1 = System.currentTimeMillis();
        this.doBeforeFireEvent(bills);
        LogTime.debug("\u5355\u636e\u5904\u7406\u524d\u901a\u77e5\u76d1\u542c\u8005", t1);
        t1 = System.currentTimeMillis();
        bills = this.doBusiness(bills);
        LogTime.debug("\u5355\u636e\u5904\u7406\u4fdd\u5b58\u5230\u6570\u636e\u5e93", t1);
        t1 = System.currentTimeMillis();
        LogTime.debug("\u5355\u636e\u5904\u7406\u540e\u6743\u9650\u9a8c\u8bc1", t1);
        t1 = System.currentTimeMillis();
        this.doAfterUpdate(bills);
        LogTime.debug("\u5355\u636e\u5904\u7406\u540e\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.doAfterFireEvent(bills);
        LogTime.debug("\u5355\u636e\u5904\u7406\u540e\u901a\u77e5\u76d1\u542c\u8005", t1);
        t1 = System.currentTimeMillis();
        SagasUtils.setCompensateService(this.getBusiType(), LightVOProducer.produceLightVO(bills, oribills));
        LogTime.debug("\u6ce8\u518c\u8865\u507f\u63a5\u53e3", t1);
        this.tmpMap.clear();
        return bills;
    }

    protected void doAfterFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        if (null != this.getAfterEventType()) {
            Object event = null;
            event = "1004".equals(this.getAfterEventType()) ? new BdUpdateEvent((String)this.tmpMap.get("beanid"), this.getAfterEventType(), (Object)this.getOriginBill(bills), (Object)bills) : new BusinessEvent((String)this.tmpMap.get("beanid"), this.getAfterEventType(), (Object[])bills);
            EventDispatcher.fireEvent((IBusinessEvent)event);
        }
    }

    protected abstract void doAfterUpdate(AggregatedValueObject[] var1) throws BusinessException;

    protected AggregatedValueObject[] getOriginBill(AggregatedValueObject[] bills) throws BusinessException {
        String[] pks = new String[bills.length];
        for (int index = 0; index < pks.length; ++index) {
            pks[index] = bills[index].getParentVO().getPrimaryKey();
        }
        Collection vo = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(bills[0].getClass(), pks, false);
        return vo.toArray(new AggregatedValueObject[0]);
    }

    protected void doBeforeFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        if (null != this.getBeforeEventType()) {
            Object event = null;
            event = "1003".equals(this.getBeforeEventType()) ? new BdUpdateEvent((String)this.tmpMap.get("beanid"), this.getBeforeEventType(), (Object)this.getOriginBill(bills), (Object)bills) : new BusinessEvent((String)this.tmpMap.get("beanid"), this.getBeforeEventType(), (Object[])bills);
            EventDispatcher.fireEvent((IBusinessEvent)event);
        }
    }

    protected abstract void doBeforeUpdate(AggregatedValueObject[] var1) throws BusinessException;

    protected abstract AggregatedValueObject[] doBusiness(AggregatedValueObject[] var1) throws BusinessException;

    protected abstract String getBusiType();

    protected String getAfterEventType() {
        return this.afterEventType;
    }

    protected String getBeforeEventType() {
        return this.beforeEventType;
    }

    protected AggregatedValueObject getOriginBill(AggregatedValueObject bill) throws BusinessException {
        return (AggregatedValueObject)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(bill.getClass(), bill.getParentVO().getPrimaryKey(), false);
    }

    protected void setBillStatus(AggregatedValueObject[] bills) throws BusinessException {
    }
}

