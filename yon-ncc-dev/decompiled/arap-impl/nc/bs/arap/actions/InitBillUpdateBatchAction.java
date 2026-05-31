/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.bs.arap.actions;

import nc.bs.arap.actions.BillUpdateBatchBSAction;
import nc.bs.arap.businessevent.EventDispatcherProxy;
import nc.bs.arap.util.BillStatusUtils;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDateTime;

public abstract class InitBillUpdateBatchAction
extends BillUpdateBatchBSAction {
    public InitBillUpdateBatchAction() {
        this.validatorCode.remove(8);
        this.validatorCode.add(20);
        this.validatorCode.add(20);
        this.validatorCode.add(38);
        this.validatorCode.add(45);
        this.validatorCode.add(53);
    }

    @Override
    protected void doBeforeUpdate(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        super.doBeforeUpdate(bills, orginBills);
        BillStatusUtils.enInitCUDAppEffVODefVals((AggregatedValueObject[])bills);
    }

    @Override
    protected void doBeforeFireEvent(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        EventDispatcherProxy event = EventDispatcherProxy.getInstance();
        this.setBillStatus(orginBills, BillEnumCollection.BillSatus.AUDIT.VALUE);
        this.setEffectstatus(orginBills, BillEnumCollection.InureSign.OKINURE.VALUE);
        event.fireBeforeUnEffectEvent(orginBills);
        this.setBillStatus(orginBills, BillEnumCollection.BillSatus.AUDIT.VALUE);
        this.setEffectstatus(orginBills, BillEnumCollection.InureSign.NOINURE.VALUE);
        event.fireAfterUnEffectEvent(orginBills);
        this.setBillStatus(orginBills, BillEnumCollection.BillSatus.AUDIT.VALUE);
        this.setEffectstatus(orginBills, BillEnumCollection.InureSign.NOINURE.VALUE);
        event.fireBeforeUnApvEvent(orginBills);
        this.setBillStatus(orginBills, BillEnumCollection.BillSatus.SAVE.VALUE);
        this.setEffectstatus(orginBills, BillEnumCollection.InureSign.NOINURE.VALUE);
        event.fireAfterUnApvEvent(orginBills);
        this.setBillStatus(bills, BillEnumCollection.BillSatus.SAVE.VALUE);
        this.setEffectstatus(bills, BillEnumCollection.InureSign.NOINURE.VALUE);
        super.doBeforeFireEvent(bills, orginBills);
    }

    @Override
    protected void doAfterFireEvent(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        this.setBillStatus(bills, BillEnumCollection.BillSatus.SAVE.VALUE);
        this.setEffectstatus(bills, BillEnumCollection.InureSign.NOINURE.VALUE);
        super.doAfterFireEvent(bills, orginBills);
        EventDispatcherProxy event = EventDispatcherProxy.getInstance();
        event.fireBeforeApvEvent(bills);
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.AUDIT.VALUE);
            BaseAggVO vo = (BaseAggVO)bill;
            if (vo.getHeadVO().getApprovedate() == null) {
                vo.getHeadVO().setApprovedate(new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime()));
            }
            if (vo.getHeadVO().getApprover() != null) continue;
            vo.getHeadVO().setApprover(InvocationInfoProxy.getInstance().getUserId());
        }
        event.fireAfterApvEvent(bills);
        event.fireBeforeEffectEvent(bills);
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setAttributeValue("effectstatus", (Object)BillEnumCollection.InureSign.OKINURE.VALUE);
        }
        event.fireAfterEffectEvent(bills);
    }

    @Override
    protected void beforeUpdateDefValue(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) {
    }
}

