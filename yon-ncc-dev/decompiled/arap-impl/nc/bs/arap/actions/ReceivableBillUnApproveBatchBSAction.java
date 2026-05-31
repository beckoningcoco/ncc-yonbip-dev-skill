/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.BillAbleUnApproveBatchBSAction
 */
package nc.bs.arap.actions;

import nc.bs.arap.actions.BillAbleUnApproveBatchBSAction;

public class ReceivableBillUnApproveBatchBSAction
extends BillAbleUnApproveBatchBSAction {
    public ReceivableBillUnApproveBatchBSAction() {
        this.validatorCode.add(6);
        this.validatorCode.add(70);
        this.validatorCode.add(71);
    }
}

