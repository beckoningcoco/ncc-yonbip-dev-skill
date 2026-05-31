/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 */
package nc.bs.arap.actions;

import java.util.ArrayList;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.billact.UnApproveBatchBSAction;
import nc.bs.arap.validator.ValidatorFactory;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;

public abstract class BillUnApproveBatchBSAction
extends UnApproveBatchBSAction {
    public BillUnApproveBatchBSAction() {
        this.validatorCode.add(77);
        this.validatorCode.add(38);
        this.validatorCode.add(45);
        this.validatorCode.add(69);
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        ValidatorFactory factory = new ValidatorFactory();
        return factory;
    }

    @Override
    protected void doBeforeUnApprove(AggregatedValueObject[] bills) throws BusinessException {
        String skipCode = InvocationInfoProxy.getInstance().getProperty("NCCFlowParamter");
        for (AggregatedValueObject bill : bills) {
            BaseAggVO vo = (BaseAggVO)bill;
            if ("isAlarmPassed".equals(skipCode)) {
                vo.setAlarmPassed(true);
            }
            ArapBillPubUtil.resetSagasFieldValue(bill);
        }
    }

    @Override
    protected void doAfterUnApprove(AggregatedValueObject[] bills) throws BusinessException {
        BaseAggVO baseAggVO = (BaseAggVO)bills[0];
        this.setRaltionItems(baseAggVO);
    }

    protected void setRaltionItems(BaseAggVO baseAggVO) {
        baseAggVO.setLoadRelationItemValue(UFBoolean.TRUE);
        ArrayList<String> items = new ArrayList<String>();
        items.add("money_bal");
        items.add("local_money_bal");
        items.add("groupbalance");
        items.add("globalbalance");
        items.add("occupationmny");
        items.add("approver");
        items.add("approvedate");
        items.add("approvestatus");
        items.add("effectuser");
        items.add("effectdate");
        items.add("effectstatus");
        items.add("signuser");
        items.add("signdate");
        items.add("billstatus");
        items.add("confernum");
        items.add("ts");
        baseAggVO.setLoadRelationItems(items);
    }
}

