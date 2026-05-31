/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.arap.util;

import nc.bs.arap.actions.ArapBillEditSaveBatchBSAction;
import nc.bs.arap.actions.ArapBillSaveBatchBSAction;
import nc.bs.arap.actions.BillDeleteBatchBSAction;

@Deprecated
public class BillActionProxy {
    private static BillActionProxy instance = null;
    private ArapBillSaveBatchBSAction saveAction = null;
    private BillDeleteBatchBSAction deleteAction = null;
    private ArapBillEditSaveBatchBSAction updateAction = null;

    public static BillActionProxy getInstance() {
        if (null == instance) {
            instance = new BillActionProxy();
        }
        return instance;
    }

    public ArapBillSaveBatchBSAction getSaveBSAction() {
        if (null == this.saveAction) {
            this.saveAction = new ArapBillSaveBatchBSAction(){};
        }
        return this.saveAction;
    }

    public BillDeleteBatchBSAction getDeleteBSAction() {
        if (null == this.deleteAction) {
            this.deleteAction = new BillDeleteBatchBSAction(){};
        }
        return this.deleteAction;
    }

    public ArapBillEditSaveBatchBSAction getUpdateBSAction() {
        if (null == this.updateAction) {
            this.updateAction = new ArapBillEditSaveBatchBSAction();
        }
        return this.updateAction;
    }
}

