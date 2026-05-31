/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.actions;

import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.billact.UnApproveBatchBSAction;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

@Deprecated
public class ArapBillUnApproveBatchBSAction
extends UnApproveBatchBSAction {
    @Override
    protected void doAfterUnApprove(AggregatedValueObject[] bills) throws BusinessException {
        for (AggregatedValueObject bill : bills) {
            ((BaseBillVO)bill.getParentVO()).setApprover(null);
            ((BaseBillVO)bill.getParentVO()).setApprovedate(null);
            ((BaseBillVO)bill.getParentVO()).setEffectstatus(BillEnumCollection.InureSign.NOINURE.VALUE);
        }
    }

    @Override
    protected void doBeforeUnApprove(AggregatedValueObject[] bills) throws BusinessException {
        for (AggregatedValueObject bill : bills) {
            ((BaseBillVO)bill.getParentVO()).setSignyear(null);
            ((BaseBillVO)bill.getParentVO()).setSignperiod(null);
            if (!ArapBillPubUtil.hasSettleInfo((BaseBillVO)bill.getParentVO())) {
                ((BaseBillVO)bill.getParentVO()).setEffectstatus(BillEnumCollection.InureSign.NOINURE.VALUE);
            }
            ArapBillPubUtil.resetSagasFieldValue(bill);
        }
    }

    @Override
    protected AggregatedValueObject[] doUnApprove(AggregatedValueObject[] bills) throws BusinessException {
        return bills;
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        return null;
    }
}

