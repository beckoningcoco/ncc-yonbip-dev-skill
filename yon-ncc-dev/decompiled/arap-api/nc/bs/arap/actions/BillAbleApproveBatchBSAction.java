/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.actions;

import nc.bs.arap.actions.BillApproveBatchBSAction;
import nc.bs.arap.util.BillEffectUtils;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public abstract class BillAbleApproveBatchBSAction
extends BillApproveBatchBSAction {
    @Override
    protected void doAfterApprove(AggregatedValueObject[] bills) throws BusinessException {
        super.doAfterApprove(bills);
        BillEffectUtils.sendDAPMessge(bills);
    }
}

