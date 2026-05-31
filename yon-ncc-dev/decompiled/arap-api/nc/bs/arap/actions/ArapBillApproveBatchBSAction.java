/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 */
package nc.bs.arap.actions;

import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.billact.ApproveBatchBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.validator.ValidatorFactory;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;

@Deprecated
public class ArapBillApproveBatchBSAction
extends ApproveBatchBSAction {
    @Override
    protected void doAfterApprove(AggregatedValueObject[] bills) throws BusinessException {
    }

    @Override
    protected AggregatedValueObject[] doApprove(AggregatedValueObject[] bills) throws BusinessException {
        if (bills instanceof IBill[]) {
            this.getBilloperator().update((IBill[])bills, (IBill[])bills);
        } else if (null != bills && bills.length > 0 && bills[0] instanceof IBill) {
            IBill[] ibills = new IBill[bills.length];
            System.arraycopy(bills, 0, ibills, 0, bills.length);
            this.getBilloperator().update(ibills, ibills);
        }
        return bills;
    }

    @Override
    protected void doBeforeApprove(AggregatedValueObject[] bills) throws BusinessException {
        for (int index = 0; index < bills.length; ++index) {
            AggregatedValueObject bill = bills[index];
            bill.getParentVO().setAttributeValue("effectstatus", (Object)BillEnumCollection.InureSign.OKINURE.VALUE);
            ArapBillPubUtil.resetSagasFieldValue(bill);
        }
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        ValidatorFactory factory = new ValidatorFactory();
        return factory;
    }
}

