/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.BillPersistenceUtils
 *  nc.bs.arap.util.BillStatusUtils
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDateTime
 *  nccloud.bs.arap.sagas.compensate.billact.ApproveAbleBillSagasCompensateAction
 */
package nccloud.bs.arap.sagas.compensate.actions.estipayable;

import nc.bs.arap.util.BillPersistenceUtils;
import nc.bs.arap.util.BillStatusUtils;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDateTime;
import nccloud.bs.arap.sagas.compensate.billact.ApproveAbleBillSagasCompensateAction;

public class EstiPayableApproveSagasCompensateAction
extends ApproveAbleBillSagasCompensateAction {
    protected AggregatedValueObject[] doApprove(AggregatedValueObject[] bills) throws BusinessException {
        BillStatusUtils.enApprove4EffectVODefVals((AggregatedValueObject[])bills);
        return BillPersistenceUtils.persistenceApvAndEftVOs((AggregatedValueObject[])bills);
    }

    protected void doBeforeApprove(AggregatedValueObject[] bills) throws BusinessException {
        super.doBeforeApprove(bills);
        for (AggregatedValueObject bill : bills) {
            BaseAggVO vo = (BaseAggVO)bill;
            vo.getHeadVO().setApprovedate(new UFDateTime(vo.getHeadVO().getBilldate().toString()));
        }
    }
}

