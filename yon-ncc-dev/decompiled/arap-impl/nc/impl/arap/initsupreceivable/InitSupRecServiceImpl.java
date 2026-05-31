/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.billact.ApproveBatchBSAction
 *  nc.bs.arap.billact.InsertBatchBSAction
 *  nc.bs.arap.billact.UnApproveBatchBSAction
 *  nc.impl.arap.base.ArapBillBaseServiceImpl
 *  nc.itf.arap.initsupreceivable.IArapInitSupRecService
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.IArapBilltypeInfo
 *  nc.vo.arap.supreceivable.AggSupReceivableBillVO
 */
package nc.impl.arap.initsupreceivable;

import nc.bs.arap.actions.InitSupReceivableEditBatchBSAction;
import nc.bs.arap.actions.InitSupRecivableDeleteBatchBSAction;
import nc.bs.arap.billact.ApproveBatchBSAction;
import nc.bs.arap.billact.InsertBatchBSAction;
import nc.bs.arap.billact.UnApproveBatchBSAction;
import nc.impl.arap.base.ArapBillBaseServiceImpl;
import nc.itf.arap.initsupreceivable.IArapInitSupRecService;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.arap.supreceivable.AggSupReceivableBillVO;

public class InitSupRecServiceImpl<T extends AggSupReceivableBillVO>
extends ArapBillBaseServiceImpl
implements IArapInitSupRecService {
    private InitSupReceivableEditBatchBSAction updateAction = null;
    private InitSupRecivableDeleteBatchBSAction deleteAction = null;

    protected ApproveBatchBSAction getApproveBSAction() {
        return null;
    }

    protected UnApproveBatchBSAction getUnapproveBSAction() {
        return null;
    }

    protected InitSupReceivableEditBatchBSAction getUpdateBSAction() {
        if (null == this.updateAction) {
            this.updateAction = new InitSupReceivableEditBatchBSAction();
        }
        return this.updateAction;
    }

    protected InitSupRecivableDeleteBatchBSAction getDeleteBSAction() {
        if (null == this.deleteAction) {
            this.deleteAction = new InitSupRecivableDeleteBatchBSAction();
        }
        return this.deleteAction;
    }

    protected IArapBilltypeInfo getArapBilltypeInfo() {
        return ArapBillTypeInfo.getInstance((Object)"23F0");
    }

    protected InsertBatchBSAction getSaveBSAction() {
        return null;
    }
}

