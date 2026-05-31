/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.pubitf.credit.accountcheck.IFlowAccountCheck4MF0
 *  nc.pubitf.credit.creditcheck.IFlowCreditCheck4MF0
 *  nc.vo.credit.accountcheck.func.AccountCheckTypeEnum
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.bs.arap.func;

import nc.bs.framework.common.NCLocator;
import nc.pubitf.credit.accountcheck.IFlowAccountCheck4MF0;
import nc.pubitf.credit.creditcheck.IFlowCreditCheck4MF0;
import nc.vo.credit.accountcheck.func.AccountCheckTypeEnum;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public class FuncCreditCheck {
    public UFDouble examOverCreditF0Busi(AggregatedValueObject ... aggVOs) throws BusinessException {
        IFlowCreditCheck4MF0 invoke = (IFlowCreditCheck4MF0)NCLocator.getInstance().lookup(IFlowCreditCheck4MF0.class);
        return invoke.examOverCreditF0Busi(aggVOs);
    }

    public UFDouble examOverCreditRateF0Busi(AggregatedValueObject ... aggVOs) throws BusinessException {
        IFlowCreditCheck4MF0 invoke = (IFlowCreditCheck4MF0)NCLocator.getInstance().lookup(IFlowCreditCheck4MF0.class);
        return invoke.examOverCreditRateF0Busi(aggVOs);
    }

    public UFDouble examOverPeriodMoney4F0(AggregatedValueObject ... aggVOs) throws BusinessException {
        IFlowAccountCheck4MF0 invoke = (IFlowAccountCheck4MF0)NCLocator.getInstance().lookup(IFlowAccountCheck4MF0.class);
        return invoke.examOverPeriodMoney4F0(aggVOs, AccountCheckTypeEnum.OverPeriodMoney.getValue());
    }

    public Integer examOverPeriodDay4F0(AggregatedValueObject ... aggVOs) throws BusinessException {
        IFlowAccountCheck4MF0 invoke = (IFlowAccountCheck4MF0)NCLocator.getInstance().lookup(IFlowAccountCheck4MF0.class);
        return invoke.examOverPeriodDay4F0(aggVOs, AccountCheckTypeEnum.OverPeriodDay.getValue());
    }

    public Integer examInnerDay4F0(AggregatedValueObject ... aggVOs) throws BusinessException {
        IFlowAccountCheck4MF0 invoke = (IFlowAccountCheck4MF0)NCLocator.getInstance().lookup(IFlowAccountCheck4MF0.class);
        return invoke.examInnerDay4F0(aggVOs, AccountCheckTypeEnum.OverInnerPeriodDay.getValue());
    }
}

