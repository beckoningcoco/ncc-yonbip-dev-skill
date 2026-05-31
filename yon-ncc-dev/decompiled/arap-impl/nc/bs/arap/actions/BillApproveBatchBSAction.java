/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.impl.pubapp.env.BSContext
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.bs.arap.actions;

import java.util.ArrayList;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.billact.ApproveBatchBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.businessevent.EventDispatcherProxy;
import nc.bs.arap.util.BillStatusUtils;
import nc.bs.arap.validator.ValidatorFactory;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.impl.pubapp.env.BSContext;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDateTime;

public abstract class BillApproveBatchBSAction
extends ApproveBatchBSAction {
    public BillApproveBatchBSAction() {
        this.validatorCode.add(77);
        this.validatorCode.add(3);
        this.validatorCode.add(50);
        this.validatorCode.add(30);
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        ValidatorFactory factory = new ValidatorFactory();
        return factory;
    }

    @Override
    protected void doAfterApprove(AggregatedValueObject[] bills) throws BusinessException {
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

    @Override
    protected void doBeforeFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        ArapConstant constant = new ArapConstant();
        BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_ACTIONNAME, (Object)constant.ARAP_NTB_APPROVE_KEY);
        if (bills != null && bills.length > 0 && (BaseAggVO)bills[0] != null) {
            if (((BaseAggVO)bills[0]).isAlarmPassed()) {
                BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_FLAG, (Object)ArapConstant.ARAP_TBB_NOCHECK);
            }
            EventDispatcherProxy.getInstance().fireBeforeApvEffectEvent(bills);
        }
    }

    @Override
    protected void doAfterFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        EventDispatcherProxy.getInstance().fireAfterApvEffectEvent(bills);
    }

    @Override
    protected void doBeforeApprove(AggregatedValueObject[] bills) throws BusinessException {
        String skipCode = InvocationInfoProxy.getInstance().getProperty("NCCFlowParamter");
        BillStatusUtils.refreshApvStatus2ApvingStatus((AggregatedValueObject[])bills);
        for (AggregatedValueObject bill : bills) {
            BaseAggVO vo = (BaseAggVO)bill;
            if (vo.getHeadVO().getApprovedate() == null) {
                vo.getHeadVO().setApprovedate(new UFDateTime(InvocationInfoProxy.getInstance().getBizDateTime()));
            }
            if (vo.getHeadVO().getApprover() == null) {
                vo.getHeadVO().setApprover(InvocationInfoProxy.getInstance().getUserId());
            }
            vo.getHeadVO().setApprovestatus(BillEnumCollection.ApproveStatus.PASSING.VALUE);
            if ("isAlarmPassed".equals(skipCode)) {
                vo.setAlarmPassed(true);
            } else if ("isAuthAccount".equals(skipCode)) {
                vo.getHeadVO().setAuthAccount(true);
            }
            ArapBillPubUtil.resetSagasFieldValue(bill);
        }
    }
}

