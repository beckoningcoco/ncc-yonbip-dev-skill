/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.actions.BillWriteBackBSAction
 *  nc.bs.arap.billact.ApproveBatchBSAction
 *  nc.bs.arap.billact.UnApproveBatchBSAction
 *  nc.impl.arap.base.ArapBillBaseServiceImpl
 *  nc.itf.arap.receivable.IArapReceivableBillService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.IArapBilltypeInfo
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.impl.arap.receivable;

import nc.bs.arap.actions.BillWriteBackBSAction;
import nc.bs.arap.actions.ReceivableBillApproveBatchBSAction;
import nc.bs.arap.actions.ReceivableBillEditBatchBSAction;
import nc.bs.arap.actions.ReceivableBillSaveBatchBSAction;
import nc.bs.arap.actions.ReceivableBillUnApproveBatchBSAction;
import nc.bs.arap.actions.ReceivableDeleteBatchBSAction;
import nc.bs.arap.billact.ApproveBatchBSAction;
import nc.bs.arap.billact.UnApproveBatchBSAction;
import nc.impl.arap.base.ArapBillBaseServiceImpl;
import nc.itf.arap.receivable.IArapReceivableBillService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.IArapBilltypeInfo;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;

public class ReceivableBillServiceImpl<T extends AggReceivableBillVO>
extends ArapBillBaseServiceImpl
implements IArapReceivableBillService {
    protected ApproveBatchBSAction getApproveBSAction() {
        return new ReceivableBillApproveBatchBSAction();
    }

    protected UnApproveBatchBSAction getUnapproveBSAction() {
        return new ReceivableBillUnApproveBatchBSAction();
    }

    protected IArapBilltypeInfo getArapBilltypeInfo() {
        return ArapBillTypeInfo.getInstance((Object)"F0");
    }

    public AggReceivableBillVO doBillWriteBack(AggReceivableBillVO bill, AggReceivableBillVO writeBackBill) throws BusinessException {
        ((BaseBillVO)bill.getParentVO()).setIsreded(UFBoolean.TRUE);
        this.save((BaseAggVO)writeBackBill);
        this.getWriteBackBSAction().updateVO((AggregatedValueObject)bill);
        this.getApproveBSAction().approveVOs(new AggregatedValueObject[]{writeBackBill});
        return bill;
    }

    private BillWriteBackBSAction getWriteBackBSAction() {
        return new BillWriteBackBSAction();
    }

    protected ReceivableBillSaveBatchBSAction getSaveBSAction() {
        return new ReceivableBillSaveBatchBSAction();
    }

    protected ReceivableBillEditBatchBSAction getUpdateBSAction() {
        return new ReceivableBillEditBatchBSAction();
    }

    protected ReceivableDeleteBatchBSAction getDeleteBSAction() {
        return new ReceivableDeleteBatchBSAction();
    }
}

