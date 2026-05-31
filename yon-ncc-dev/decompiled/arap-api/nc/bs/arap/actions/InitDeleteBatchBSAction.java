/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.actions;

import nc.bs.arap.actions.BillDeleteBatchBSAction;
import nc.bs.arap.util.BillStatusUtils;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public abstract class InitDeleteBatchBSAction
extends BillDeleteBatchBSAction {
    @Override
    protected void doBeforeDelete(AggregatedValueObject[] bills) throws BusinessException {
        super.doBeforeDelete(bills);
        this.doDeleteDefVals(bills);
    }

    @Override
    protected void doDeleteDefVals(AggregatedValueObject[] bills) {
        BillStatusUtils.enInitCUDAppEffVODefVals((AggregatedValueObject[])bills);
    }

    @Override
    protected void doBeforeFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        BaseAggVO vo;
        for (AggregatedValueObject bill : bills) {
            vo = (BaseAggVO)bill;
            vo.getHeadVO().setBillstatus(BillEnumCollection.BillSatus.AUDIT.VALUE);
            vo.getHeadVO().setEffectstatus(BillEnumCollection.InureSign.OKINURE.VALUE);
        }
        super.doBeforeFireEvent(bills);
        for (AggregatedValueObject bill : bills) {
            vo = (BaseAggVO)bill;
            vo.getHeadVO().setBillstatus(BillEnumCollection.BillSatus.DELETED.VALUE);
            vo.getHeadVO().setEffectstatus(BillEnumCollection.InureSign.NOINURE.VALUE);
        }
    }

    @Override
    protected void doAfterFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        super.doAfterFireEvent(bills);
    }
}

