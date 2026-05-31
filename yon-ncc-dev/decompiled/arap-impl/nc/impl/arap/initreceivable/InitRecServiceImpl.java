/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.InitDeleteBatchBSAction
 *  nc.bs.arap.billact.ApproveBatchBSAction
 *  nc.bs.arap.billact.UnApproveBatchBSAction
 *  nc.impl.arap.base.ArapBillBaseServiceImpl
 *  nc.itf.arap.initreceivable.IArapInitRecService
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.IArapBilltypeInfo
 *  nc.vo.arap.receivable.AggReceivableBillVO
 */
package nc.impl.arap.initreceivable;

import nc.bs.arap.actions.InitDeleteBatchBSAction;
import nc.bs.arap.actions.InitReceivableDeleteBatchBSAction;
import nc.bs.arap.actions.InitReceivableEditBatchBSAction;
import nc.bs.arap.actions.InitReceivableSaveBatchBSAction;
import nc.bs.arap.billact.ApproveBatchBSAction;
import nc.bs.arap.billact.UnApproveBatchBSAction;
import nc.impl.arap.base.ArapBillBaseServiceImpl;
import nc.itf.arap.initreceivable.IArapInitRecService;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.arap.receivable.AggReceivableBillVO;

public class InitRecServiceImpl<T extends AggReceivableBillVO>
extends ArapBillBaseServiceImpl
implements IArapInitRecService {
    protected ApproveBatchBSAction getApproveBSAction() {
        return null;
    }

    protected UnApproveBatchBSAction getUnapproveBSAction() {
        return null;
    }

    protected InitReceivableSaveBatchBSAction getSaveBSAction() {
        return new InitReceivableSaveBatchBSAction();
    }

    protected InitReceivableEditBatchBSAction getUpdateBSAction() {
        return new InitReceivableEditBatchBSAction();
    }

    protected InitDeleteBatchBSAction getDeleteBSAction() {
        return new InitReceivableDeleteBatchBSAction();
    }

    protected IArapBilltypeInfo getArapBilltypeInfo() {
        return ArapBillTypeInfo.getInstance((Object)"F0");
    }
}

