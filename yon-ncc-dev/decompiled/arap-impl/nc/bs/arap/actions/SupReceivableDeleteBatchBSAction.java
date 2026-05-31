/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.BillDeleteBatchBSAction
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.actions;

import nc.bs.arap.actions.BillDeleteBatchBSAction;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public class SupReceivableDeleteBatchBSAction
extends BillDeleteBatchBSAction {
    public SupReceivableDeleteBatchBSAction() {
        this.validatorCode.add(11);
        this.validatorCode.add(12);
        this.validatorCode.add(27);
        this.validatorCode.add(32);
    }

    protected boolean isUserhasPermission(AggregatedValueObject ... bills) throws BusinessException {
        return true;
    }
}

