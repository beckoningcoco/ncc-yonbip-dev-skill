/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nccloud.bs.arap.sagas.compensate.billact;

import nc.bs.arap.actions.BillCommitBatchBSAction;
import nc.bs.arap.billact.LogTime;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.compensate.billact.IBaseSagasCompensateAction;

public class CommitSagasCompensateAction
extends BillCommitBatchBSAction
implements IBaseSagasCompensateAction {
    @Override
    public AggregatedValueObject[] doSagasCompensate(AggregatedValueObject[] bills) throws BusinessException {
        return this.updateVOs(bills);
    }

    @Override
    public AggregatedValueObject[] updateVOs(AggregatedValueObject[] bills) throws BusinessException {
        if (null == bills || bills.length == 0) {
            throw new BusinessException("parameter is null!");
        }
        long t1 = System.currentTimeMillis();
        this.setbillsLock(bills);
        LogTime.debug("\u5355\u636e\u52a0\u52a8\u6001\u9501", t1);
        AggregatedValueObject[] orginBills = this.getOriginBill(bills);
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setStatus(1);
            bill.getParentVO().setAttributeValue("approvestatus", (Object)BillEnumCollection.ApproveStatus.COMMIT.VALUE);
        }
        t1 = System.currentTimeMillis();
        bills = this.doUpdate(bills, orginBills);
        LogTime.debug("\u5355\u636e\u4fdd\u5b58\u5230\u6570\u636e\u5e93", t1);
        return bills;
    }
}

