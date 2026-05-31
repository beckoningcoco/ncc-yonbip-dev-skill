/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.EventDispatcher
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 */
package nc.bs.arap.actions;

import nc.bs.arap.billact.BillBaseBSAction;
import nc.bs.arap.billact.LogTime;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.EventDispatcher;
import nc.bs.businessevent.IBusinessEvent;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;

public abstract class TempDeleteBatchBSAction
extends BillBaseBSAction {
    public void deleteVOs(AggregatedValueObject[] bills) throws BusinessException {
        if (null == bills) {
            throw new BusinessException("parameter is null!");
        }
        long t1 = System.currentTimeMillis();
        this.setbillsLock(bills);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0436"), t1);
        t1 = System.currentTimeMillis();
        this.checkBillsTs(bills);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0437"), t1);
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(bills[0].getClass().getName());
        String id = bean.getID();
        this.tmpMap.put("beanid", id);
        t1 = System.currentTimeMillis();
        this.setBillStatus(bills);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0438"), t1);
        t1 = System.currentTimeMillis();
        this.doBeforeDelete(bills);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0446"), t1);
        t1 = System.currentTimeMillis();
        this.validateWithPermission(bills);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0440"), t1);
        t1 = System.currentTimeMillis();
        this.doBeforeFireEvent(bills);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0447"), t1);
        t1 = System.currentTimeMillis();
        this.doDelete(bills);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0448"), t1);
        t1 = System.currentTimeMillis();
        this.doAfterDelete(bills);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0449"), t1);
        t1 = System.currentTimeMillis();
        this.doAfterFireEvent(bills);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0450"), t1);
        t1 = System.currentTimeMillis();
        this.returnbillsCode(bills);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0451"), t1);
        this.tmpMap.clear();
    }

    protected void setBillStatus(AggregatedValueObject[] bills) throws BusinessException {
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setStatus(3);
        }
    }

    protected void returnbillsCode(AggregatedValueObject[] bills) throws BusinessException {
    }

    protected abstract void doBeforeDelete(AggregatedValueObject[] var1) throws BusinessException;

    protected abstract void doAfterDelete(AggregatedValueObject[] var1) throws BusinessException;

    protected void doBeforeFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "200610", (Object[])bills));
    }

    protected void doAfterFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "200610", (Object[])bills));
    }

    protected void doDelete(AggregatedValueObject[] bills) throws BusinessException {
        if (bills instanceof IBill[]) {
            this.getBilloperator().delete((IBill[])bills);
        } else if (null != bills && bills.length > 0 && bills[0] instanceof IBill) {
            IBill[] ibills = new IBill[bills.length];
            System.arraycopy(bills, 0, ibills, 0, bills.length);
            this.getBilloperator().delete(ibills);
        }
    }
}

