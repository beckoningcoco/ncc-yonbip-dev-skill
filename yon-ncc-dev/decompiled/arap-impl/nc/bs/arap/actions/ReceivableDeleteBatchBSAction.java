/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.BillDeleteBatchBSAction
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.actions;

import nc.bs.arap.actions.BillDeleteBatchBSAction;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public class ReceivableDeleteBatchBSAction
extends BillDeleteBatchBSAction {
    public ReceivableDeleteBatchBSAction() {
        this.validatorCode.add(11);
        this.validatorCode.add(12);
        this.validatorCode.add(27);
        this.validatorCode.add(32);
    }

    protected void doAfterFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        this.deleteImag(bills, NCLangRes4VoTransl.getNCLangRes().getStrByID("02006rec_0", "02006rec-0057"));
        super.doAfterFireEvent(bills);
    }
}

