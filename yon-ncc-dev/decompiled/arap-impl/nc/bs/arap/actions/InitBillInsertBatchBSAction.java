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

import nc.bs.arap.actions.BillInsertBatchBSAction;
import nc.bs.arap.businessevent.EventDispatcherProxy;
import nc.bs.arap.util.BillStatusUtils;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDateTime;

public abstract class InitBillInsertBatchBSAction
extends BillInsertBatchBSAction {
    public InitBillInsertBatchBSAction() {
        this.validatorCode.add(53);
        this.validatorCode.add(44);
    }

    @Override
    protected void doBeforeInsert(AggregatedValueObject[] bills) throws BusinessException {
        super.doBeforeInsert(bills);
        BillStatusUtils.enInitCUDAppEffVODefVals((AggregatedValueObject[])bills);
    }

    @Override
    protected void beforeInserDefVal(AggregatedValueObject[] bills) {
        BillStatusUtils.enInitCUDAppEffVODefVals((AggregatedValueObject[])bills);
    }

    @Override
    protected void doBeforeFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        EventDispatcherProxy instance = EventDispatcherProxy.getInstance();
        instance.fireBeforeInsertEvent(bills);
    }

    @Override
    protected void doAfterFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        EventDispatcherProxy instance = EventDispatcherProxy.getInstance();
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.SAVE.VALUE);
            bill.getParentVO().setAttributeValue("effectstatus", (Object)BillEnumCollection.InureSign.NOINURE.VALUE);
        }
        instance.fireAfterInsertEvent(bills);
        instance.fireBeforeApvEvent(bills);
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.AUDIT.VALUE);
            BaseAggVO vo = (BaseAggVO)bill;
            if (vo.getHeadVO().getApprovedate() == null) {
                vo.getHeadVO().setApprovedate(new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime()));
            }
            if (vo.getHeadVO().getApprover() != null) continue;
            vo.getHeadVO().setApprover(InvocationInfoProxy.getInstance().getUserId());
        }
        instance.fireAfterApvEvent(bills);
        instance.fireBeforeEffectEvent(bills);
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setAttributeValue("effectstatus", (Object)BillEnumCollection.InureSign.OKINURE.VALUE);
        }
        instance.fireAfterEffectEvent(bills);
    }
}

