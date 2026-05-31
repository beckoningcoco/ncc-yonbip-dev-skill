/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.EventDispatcher
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.dao.DAOException
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 */
package nc.bs.arap.actions;

import nc.bs.arap.billact.BillBaseBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.billact.LogTime;
import nc.bs.arap.util.ArapBillVOUtils;
import nc.bs.arap.util.ArapVOUtils;
import nc.bs.arap.util.BillAccountCalendarUtils;
import nc.bs.arap.validator.ValidatorFactory;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.EventDispatcher;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.dao.DAOException;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;

public abstract class TempSaveBatchBSAction
extends BillBaseBSAction {
    public TempSaveBatchBSAction() {
        this.validatorCode.add(37);
    }

    public AggregatedValueObject[] insertVOs(AggregatedValueObject[] bills) throws BusinessException {
        BillAccountCalendarUtils.setAccperiodYearMonth(bills);
        return this.insertVOs(bills, UFBoolean.FALSE);
    }

    public AggregatedValueObject[] insertVOs(AggregatedValueObject[] bills, UFBoolean withPK) throws BusinessException {
        if (null == bills || bills.length == 0) {
            throw new BusinessException("parameter is null!");
        }
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(bills[0].getClass().getName());
        String id = bean.getID();
        this.tmpMap.put("beanid", id);
        long t1 = System.currentTimeMillis();
        t1 = System.currentTimeMillis();
        this.doBeforeInsert(bills);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0452"), t1);
        t1 = System.currentTimeMillis();
        this.setBillStatus(bills);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0438"), t1);
        t1 = System.currentTimeMillis();
        this.validate(bills);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0440"), t1);
        t1 = System.currentTimeMillis();
        this.setBillCode(bills);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0453"), t1);
        ArapBillVOUtils.setDefaultSagaFrozen(bills);
        t1 = System.currentTimeMillis();
        this.doBeforeFireEvent(bills);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0454"), t1);
        ArapVOUtils.resetMoneyBal(bills);
        t1 = System.currentTimeMillis();
        bills = UFBoolean.TRUE.equals((Object)withPK) ? this.doInsertWithPK(bills) : this.doInsert(bills);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0442"), t1);
        t1 = System.currentTimeMillis();
        this.doAfterInsert(bills);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0455"), t1);
        t1 = System.currentTimeMillis();
        this.doAfterFireEvent(bills);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0454"), t1);
        this.tmpMap.clear();
        return bills;
    }

    protected void setBillStatus(AggregatedValueObject[] bills) throws BusinessException {
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setStatus(2);
            bill.getParentVO().setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.TEMPEORARY.VALUE);
        }
    }

    protected void setBillCode(AggregatedValueObject[] bills) throws BusinessException {
    }

    protected abstract void doBeforeInsert(AggregatedValueObject[] var1) throws BusinessException;

    protected abstract void doAfterInsert(AggregatedValueObject[] var1) throws BusinessException;

    protected void doBeforeFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "200601", (Object[])bills));
    }

    protected void doAfterFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "200602", (Object[])bills));
    }

    protected AggregatedValueObject[] doInsertWithPK(AggregatedValueObject[] bills) throws DAOException {
        return null;
    }

    protected AggregatedValueObject[] doInsert(AggregatedValueObject[] bills) throws BusinessException {
        if (bills instanceof IBill[]) {
            this.getBilloperator().insert((IBill[])bills);
        } else if (null != bills && bills.length > 0 && bills[0] instanceof IBill) {
            IBill[] ibills = new IBill[bills.length];
            System.arraycopy(bills, 0, ibills, 0, bills.length);
            this.getBilloperator().insert(ibills);
        }
        return bills;
    }

    protected void doAfterBillCode(AggregatedValueObject[] bills) {
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        ValidatorFactory factory = new ValidatorFactory();
        return factory;
    }
}

