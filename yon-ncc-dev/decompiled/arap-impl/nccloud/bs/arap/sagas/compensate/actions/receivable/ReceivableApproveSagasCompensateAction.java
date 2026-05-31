/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.util.BillPersistenceUtils
 *  nc.bs.arap.util.BillStatusUtils
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nccloud.bs.arap.sagas.compensate.billact.ApproveAbleBillSagasCompensateAction
 */
package nccloud.bs.arap.sagas.compensate.actions.receivable;

import nc.bs.arap.util.BillPersistenceUtils;
import nc.bs.arap.util.BillStatusUtils;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.compensate.billact.ApproveAbleBillSagasCompensateAction;

public class ReceivableApproveSagasCompensateAction
extends ApproveAbleBillSagasCompensateAction {
    protected AggregatedValueObject[] doApprove(AggregatedValueObject[] bills) throws BusinessException {
        BillStatusUtils.enApprove4EffectVODefVals((AggregatedValueObject[])bills);
        return BillPersistenceUtils.persistenceApvAndEftVOs((AggregatedValueObject[])bills);
    }
}

