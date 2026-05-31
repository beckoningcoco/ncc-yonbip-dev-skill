/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.BillUpdateBatchBSAction
 */
package nc.bs.arap.actions;

import nc.bs.arap.actions.BillUpdateBatchBSAction;

public class ReceivableBillEditBatchBSAction
extends BillUpdateBatchBSAction {
    public ReceivableBillEditBatchBSAction() {
        this.validatorCode.add(5);
        this.validatorCode.add(63);
    }
}
