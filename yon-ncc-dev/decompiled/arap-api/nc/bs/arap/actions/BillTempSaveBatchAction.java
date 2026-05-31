/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.fipub.billcode.FinanceBillCodeUtils
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 */
package nc.bs.arap.actions;

import java.util.ArrayList;
import nc.bs.arap.actions.TempSaveBatchBSAction;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.util.ArapBillVOUtils;
import nc.bs.arap.util.BillBankUtils;
import nc.vo.fipub.billcode.FinanceBillCodeUtils;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;

public class BillTempSaveBatchAction
extends TempSaveBatchBSAction {
    public BillTempSaveBatchAction() {
        this.validatorCode.add(5);
    }

    @Override
    protected void doAfterInsert(AggregatedValueObject[] bills) throws BusinessException {
    }

    @Override
    protected void doBeforeInsert(AggregatedValueObject[] bills) throws BusinessException {
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setPrimaryKey(null);
            for (CircularlyAccessibleValueObject item : bill.getChildrenVO()) {
                item.setPrimaryKey(null);
            }
        }
        ArapBillVOUtils.prepareDefaultInfo(bills);
        BillBankUtils.fillSettleBankrelated_code(bills);
    }

    protected FinanceBillCodeUtils getFinanceBillCodeUtils(AggregatedValueObject[] bill) {
        FinanceBillCodeUtils util = ArapBillPubUtil.getBillCodeUtil(bill[0]);
        return util;
    }

    @Override
    protected void setBillCode(AggregatedValueObject[] bills) throws BusinessException {
        FinanceBillCodeUtils util = this.getFinanceBillCodeUtils(bills);
        ArrayList<AggregatedValueObject> lastVo = new ArrayList<AggregatedValueObject>();
        for (AggregatedValueObject bill : bills) {
            if (!util.isPrecode(bill)) {
                lastVo.add(bill);
            }
            for (int indexJ = 0; indexJ < bill.getChildrenVO().length; ++indexJ) {
                bill.getChildrenVO()[indexJ].setAttributeValue("billno", bill.getParentVO().getAttributeValue("billno"));
            }
        }
        if (lastVo.size() > 0) {
            ArapBillPubUtil.setBillCodes(lastVo.toArray(new AggregatedValueObject[lastVo.size()]));
        }
    }
}

