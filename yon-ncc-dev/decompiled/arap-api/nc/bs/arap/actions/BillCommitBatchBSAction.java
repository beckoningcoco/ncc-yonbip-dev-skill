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
import nc.bs.arap.billact.LogTime;
import nc.bs.arap.billact.UpdateBatchBSAction;
import nc.bs.arap.validator.ValidatorFactory;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.util.SagasUtils;

public class BillCommitBatchBSAction
extends UpdateBatchBSAction {
    public BillCommitBatchBSAction() {
        this.validatorCode.add(77);
        this.validatorCode.add(64);
    }

    @Override
    public AggregatedValueObject[] updateVOs(AggregatedValueObject[] bills) throws BusinessException {
        if (null == bills || bills.length == 0) {
            throw new BusinessException("parameter is null!");
        }
        long t1 = System.currentTimeMillis();
        SagasUtils.frozenAndAddSaga("commit", bills);
        LogTime.debug("\u6dfb\u52a0sagas\u4e8b\u52a1\u4ee5\u53ca\u51bb\u7ed3\u5355\u636e", t1);
        t1 = System.currentTimeMillis();
        this.setbillsLock(bills);
        LogTime.debug("\u5355\u636e\u52a0\u52a8\u6001\u9501", t1);
        t1 = System.currentTimeMillis();
        this.checkBillsTs(bills);
        LogTime.debug("\u5355\u636e\u6821\u9a8cTS", t1);
        t1 = System.currentTimeMillis();
        this.validateWithPermission(bills);
        LogTime.debug("\u5355\u636e\u6821\u9a8c", t1);
        t1 = System.currentTimeMillis();
        AggregatedValueObject[] orginBills = this.getOriginBill(bills);
        this.doBeforeUpdate(bills, orginBills);
        LogTime.debug("\u5355\u636e\u66f4\u65b0\u524d\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        bills = this.doUpdate(bills, orginBills);
        LogTime.debug("\u5355\u636e\u4fdd\u5b58\u5230\u6570\u636e\u5e93", t1);
        t1 = System.currentTimeMillis();
        SagasUtils.setCompensateService("commit", bills);
        LogTime.debug("\u6ce8\u518c\u8865\u507f\u63a5\u53e3", t1);
        return bills;
    }

    @Override
    protected void doAfterUpdate(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
    }

    @Override
    protected void doBeforeUpdate(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setStatus(1);
            bill.getParentVO().setAttributeValue("approvestatus", (Object)BillEnumCollection.ApproveStatus.COMMIT.VALUE);
            ArapBillPubUtil.resetSagasFieldValue(bill);
        }
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        ValidatorFactory vf = new ValidatorFactory();
        return vf;
    }
}

