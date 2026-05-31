/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.BillAbleApproveBatchBSAction
 *  nc.bs.arap.util.BillPersistenceUtils
 *  nc.bs.arap.util.BillStatusUtils
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.actions;

import nc.bs.arap.actions.BillAbleApproveBatchBSAction;
import nc.bs.arap.util.BillPersistenceUtils;
import nc.bs.arap.util.BillStatusUtils;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public class ReceivableBillApproveBatchBSAction
extends BillAbleApproveBatchBSAction {
    protected AggregatedValueObject[] doApprove(AggregatedValueObject[] bills) throws BusinessException {
        BillStatusUtils.enApprove4EffectVODefVals((AggregatedValueObject[])bills);
        return BillPersistenceUtils.persistenceApvAndEftVOs((AggregatedValueObject[])bills);
    }
}

