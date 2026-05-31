/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.billact.ApproveBatchBSAction
 *  nc.bs.arap.billact.UnApproveBatchBSAction
 *  nc.impl.arap.base.ArapBillBaseServiceImpl
 *  nc.itf.arap.supreceivable.IArapSupReceivableBillService
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.IArapBilltypeInfo
 *  nc.vo.arap.supreceivable.AggSupReceivableBillVO
 */
package nc.impl.arap.supreceivable;

import nc.bs.arap.actions.SupReceivableDeleteBatchBSAction;
import nc.bs.arap.actions.SupReceivableEditBatchBSAction;
import nc.bs.arap.actions.SupReceivableSaveBatchBSAction;
import nc.bs.arap.billact.ApproveBatchBSAction;
import nc.bs.arap.billact.UnApproveBatchBSAction;
import nc.impl.arap.base.ArapBillBaseServiceImpl;
import nc.itf.arap.supreceivable.IArapSupReceivableBillService;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.arap.supreceivable.AggSupReceivableBillVO;

public class SupReceivableBillServiceImpl<T extends AggSupReceivableBillVO>
extends ArapBillBaseServiceImpl
implements IArapSupReceivableBillService {
    private SupReceivableSaveBatchBSAction saveAction = null;
    private SupReceivableEditBatchBSAction updateAction = null;
    private SupReceivableDeleteBatchBSAction deleteAction = null;

    protected IArapBilltypeInfo getArapBilltypeInfo() {
        return ArapBillTypeInfo.getInstance((Object)"23F0");
    }

    protected SupReceivableSaveBatchBSAction getSaveBSAction() {
        if (null == this.saveAction) {
            this.saveAction = new SupReceivableSaveBatchBSAction();
        }
        return this.saveAction;
    }

    protected SupReceivableEditBatchBSAction getUpdateBSAction() {
        if (null == this.updateAction) {
            this.updateAction = new SupReceivableEditBatchBSAction();
        }
        return this.updateAction;
    }

    protected SupReceivableDeleteBatchBSAction getDeleteBSAction() {
        if (null == this.deleteAction) {
            this.deleteAction = new SupReceivableDeleteBatchBSAction();
        }
        return this.deleteAction;
    }

    protected ApproveBatchBSAction getApproveBSAction() {
        return null;
    }

    protected UnApproveBatchBSAction getUnapproveBSAction() {
        return null;
    }
}

