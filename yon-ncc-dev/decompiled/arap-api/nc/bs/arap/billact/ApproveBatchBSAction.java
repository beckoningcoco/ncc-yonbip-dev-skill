/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.EventDispatcher
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.billact;

import nc.bs.arap.billact.BillBaseBSAction;
import nc.bs.arap.billact.LogTime;
import nc.bs.arap.util.BillRetiveInfoUtils;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.EventDispatcher;
import nc.bs.businessevent.IBusinessEvent;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.util.SagasUtils;

public abstract class ApproveBatchBSAction
extends BillBaseBSAction {
    public AggregatedValueObject[] approveVOs(AggregatedValueObject[] paraBills) throws BusinessException {
        if (null == paraBills || paraBills.length == 0) {
            throw new BusinessException("parameter is null!");
        }
        AggregatedValueObject[] bills = paraBills;
        long t1 = System.currentTimeMillis();
        SagasUtils.frozenAndAddSaga("approve", bills);
        LogTime.debug("\u6dfb\u52a0sagas\u4e8b\u52a1\u4ee5\u53ca\u51bb\u7ed3\u5355\u636e", t1);
        t1 = System.currentTimeMillis();
        this.setbillsLock(bills);
        LogTime.debug("\u5355\u636e\u52a0\u52a8\u6001\u9501", t1);
        t1 = System.currentTimeMillis();
        this.checkBillsTs(bills);
        LogTime.debug("\u5355\u636e\u6821\u9a8cTS", t1);
        BillRetiveInfoUtils.fixInfoForCleanVOsApprove(bills);
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(bills[0].getClass().getName());
        String id = bean.getID();
        this.tmpMap.put("beanid", id);
        t1 = System.currentTimeMillis();
        this.setBillStatus(bills);
        LogTime.debug("\u8bbe\u7f6e\u5355\u636e\u72b6\u6001", t1);
        t1 = System.currentTimeMillis();
        this.doBeforeApprove(bills);
        LogTime.debug("\u5355\u636e\u5ba1\u6838\u524d\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.validateWithPermission(bills);
        LogTime.debug("\u5355\u636e\u6821\u9a8c", t1);
        t1 = System.currentTimeMillis();
        this.doBeforeFireEvent(bills);
        LogTime.debug("\u5355\u636e\u5ba1\u6838\u524d\u901a\u77e5\u76d1\u542c\u8005", t1);
        t1 = System.currentTimeMillis();
        bills = this.doApprove(bills);
        LogTime.debug("\u5355\u636e\u5ba1\u6838\u5230\u6570\u636e\u5e93", t1);
        t1 = System.currentTimeMillis();
        this.doAfterApprove(bills);
        LogTime.debug("\u5355\u636e\u5ba1\u6838\u540e\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        SagasUtils.setCompensateService("approve", bills);
        LogTime.debug("\u6ce8\u518c\u8865\u507f\u63a5\u53e3", t1);
        t1 = System.currentTimeMillis();
        this.doAfterFireEvent(bills);
        LogTime.debug("\u5355\u636e\u5ba1\u6838\u540e\u901a\u77e5\u76d1\u542c\u8005", t1);
        this.retriveTsFromDb(bills);
        BillRetiveInfoUtils.cleanInfoForCleanVOsApprove(bills);
        this.tmpMap.clear();
        return bills;
    }

    protected void retriveTsFromDb(AggregatedValueObject[] bills) {
        try {
            new BillRetiveInfoUtils().retryInfos(bills);
        }
        catch (BusinessException e) {
            ExceptionHandler.consume((Throwable)e);
        }
    }

    protected abstract void doAfterApprove(AggregatedValueObject[] var1) throws BusinessException;

    protected void doAfterFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1020", (Object[])bills));
    }

    protected abstract AggregatedValueObject[] doApprove(AggregatedValueObject[] var1) throws BusinessException;

    protected abstract void doBeforeApprove(AggregatedValueObject[] var1) throws BusinessException;

    protected void doBeforeFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1019", (Object[])bills));
    }

    protected void setBillStatus(AggregatedValueObject[] bills) throws BusinessException {
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setStatus(1);
        }
    }
}

