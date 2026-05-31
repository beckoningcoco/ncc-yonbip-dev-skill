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

public abstract class DeleteBSAction
extends BillBaseBSAction {
    public void deleteVO(AggregatedValueObject bill) throws BusinessException {
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
        t1 = System.currentTimeMillis();
        this.doBeforeDelete(bill);
        LogTime.debug("\u5220\u9664\u65b0\u589e\u524d\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.validateWithPermission(bill);
        LogTime.debug("\u5355\u636e\u6821\u9a8c", t1);
        t1 = System.currentTimeMillis();
        this.doBeforeFireEvent(bill);
        LogTime.debug("\u5355\u636e\u5220\u9664\u524d\u901a\u77e5\u76d1\u542c\u8005", t1);
        t1 = System.currentTimeMillis();
        this.doDelete(bill);
        LogTime.debug("\u5728\u6570\u636e\u5e93\u4e2d\u5220\u9664\u5355\u636e", t1);
        t1 = System.currentTimeMillis();
        this.doAfterDelete(bill);
        LogTime.debug("\u5355\u636e\u5220\u9664\u540e\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.doAfterFireEvent(bill);
        LogTime.debug("\u5355\u636e\u5220\u9664\u540e\u901a\u77e5\u76d1\u542c\u8005", t1);
        t1 = System.currentTimeMillis();
        this.returnBillCode(bill);
        LogTime.debug("\u56de\u6536\u5355\u636e\u53f7", t1);
        this.tmpMap.clear();
    }

    protected abstract void doAfterDelete(AggregatedValueObject var1) throws BusinessException;

    protected void doAfterFireEvent(AggregatedValueObject bill) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1006", (Object)bill));
    }

    protected abstract void doBeforeDelete(AggregatedValueObject var1) throws BusinessException;

    protected void doBeforeFireEvent(AggregatedValueObject bill) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1005", (Object)bill));
    }

    protected void doDelete(AggregatedValueObject bill) throws BusinessException {
        MDPersistenceService.lookupPersistenceService().deleteBill((Object)bill);
    }

    protected void returnBillCode(AggregatedValueObject bill) throws BusinessException {
    }

    protected void setBillStatus(AggregatedValueObject bill) throws BusinessException {
        if (null != bill) {
            bill.getParentVO().setStatus(3);
        }
    }
}

