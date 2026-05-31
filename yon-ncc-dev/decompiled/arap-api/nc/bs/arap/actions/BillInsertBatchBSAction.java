/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.imag.lightbus.IImagPubService
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.actions;

import java.util.Map;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.billact.InsertBatchBSAction;
import nc.bs.arap.util.ArapBillVOUtils;
import nc.bs.arap.util.ArapVOUtils;
import nc.bs.arap.util.BillAccountCalendarUtils;
import nc.bs.arap.util.BillBankUtils;
import nc.bs.arap.util.BillDateUtils;
import nc.bs.arap.util.BillMoneyVUtils;
import nc.bs.arap.util.BillStatusUtils;
import nc.bs.arap.util.BillTermUtils;
import nc.bs.arap.validator.CrossRuleCheckValidator;
import nc.bs.arap.validator.ValidatorFactory;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.imag.lightbus.IImagPubService;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public abstract class BillInsertBatchBSAction
extends InsertBatchBSAction {
    protected Map<String, Integer> childvostatmap = null;

    public BillInsertBatchBSAction() {
        this.validatorCode.add(73);
        this.validatorCode.add(84);
        this.validatorCode.add(39);
        this.validatorCode.add(37);
        this.validatorCode.add(78);
        this.validatorCode.add(79);
        this.validatorCode.add(81);
    }

    @Override
    protected void doBeforeInsert(AggregatedValueObject[] bills) throws BusinessException {
        ArapBillPubUtil.fillTradeTypeInfo(bills);
        BillBankUtils.fillSettleBankrelated_code(bills);
        BillDateUtils.setBillDateByNow(bills);
        ArapBillPubUtil.resetBasedocVid(bills);
        BillAccountCalendarUtils.setAccperiodYearMonth(bills);
        ArapBillVOUtils.prepareDefaultInfo(bills);
        BillMoneyVUtils.sumAllVoBodyToHead(bills);
        new CrossRuleCheckValidator().validate(bills);
        ArapBillPubUtil.resetDestVODoc(bills);
        ArapBillVOUtils.setMaterialInfo(bills);
        ArapBillVOUtils.setDefaultSagaFrozen(bills);
    }

    @Override
    protected AggregatedValueObject[] doInsert(AggregatedValueObject[] bills) throws BusinessException {
        this.childvostatmap = BillStatusUtils.enNewVOStauts((AggregatedValueObject[])bills);
        this.beforeInserDefVal(bills);
        ArapVOUtils.resetMoneyBal(bills);
        return super.doInsert(bills);
    }

    protected void beforeInserDefVal(AggregatedValueObject[] bills) {
        BillStatusUtils.enCUDVODefVals((AggregatedValueObject[])bills);
    }

    @Override
    protected void doAfterInsert(AggregatedValueObject[] bills) throws BusinessException {
        BillTermUtils.dealBillTerm((AggregatedValueObject[])bills, this.childvostatmap, null);
        BillTermUtils.retBodyTermVOS(bills);
        for (AggregatedValueObject bill : bills) {
            if (bill.getParentVO().getAttributeValue("coordflag") == null || !"1".equals(bill.getParentVO().getAttributeValue("coordflag").toString()) || !ARAPModuleEnableUtil.isImagEnabled(InvocationInfoProxy.getInstance().getGroupId())) continue;
            IImagPubService imagService = (IImagPubService)NCLocator.getInstance().lookup(IImagPubService.class);
            imagService.updateBillNo(bill.getParentVO().getPrimaryKey(), (String)bill.getParentVO().getAttributeValue("billno"));
        }
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        ValidatorFactory vf = new ValidatorFactory();
        return vf;
    }

    @Override
    protected void setBillCode(AggregatedValueObject[] bills) throws BusinessException {
        ArapBillPubUtil.setBillCodes(bills);
    }
}

