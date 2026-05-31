/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.fi.pub.Currency
 *  nc.itf.fi.pub.SysInit
 *  nc.pubitf.uapbd.CurrencyRateUtil
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.calculator.Calculator
 *  nc.vo.pubapp.calculator.Condition
 *  nc.vo.pubapp.calculator.data.IRelationForItems
 *  nc.vo.pubapp.calculator.data.RelationItemForCal
 *  nc.vo.pubapp.pattern.pub.MathTool
 *  nc.vo.pubapp.scale.ScaleUtils
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.bs.arap.bill;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import nc.bs.arap.bill.ArapBillCalUtil;
import nc.itf.fi.pub.Currency;
import nc.itf.fi.pub.SysInit;
import nc.pubitf.uapbd.CurrencyRateUtil;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.global.ArapCommonTool;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.arap.utils.StringUtil;
import nc.vo.arappub.calculator.data.RelationItemForCal_Credit;
import nc.vo.arappub.calculator.data.RelationItemForCal_Debit;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.calculator.Calculator;
import nc.vo.pubapp.calculator.Condition;
import nc.vo.pubapp.calculator.data.IRelationForItems;
import nc.vo.pubapp.calculator.data.RelationItemForCal;
import nc.vo.pubapp.pattern.pub.MathTool;
import nc.vo.pubapp.scale.ScaleUtils;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;

public class CalcMoneyUtil {
    MoneyWrapper getMoneyWrapper(RateCalStyle rateCalStyle, Environment env, int row) {
        MoneyWrapper wrapper = new MoneyWrapper();
        switch (rateCalStyle) {
            case BASE_GROUP_ORI: 
            case BASE_GLOBAL_ORI: {
                wrapper.money = (UFDouble)env.getItem(row).getAttributeValue(env.getOriMny());
                wrapper.notaxmoney = (UFDouble)env.getItem(row).getAttributeValue(env.getOriNoTax());
                wrapper.agentmoney = CalcMoneyUtil.nvl(env.getItem(row).getAgentreceiveprimal());
                wrapper.taxmoney = CalcMoneyUtil.nvl((UFDouble)env.getItem(row).getAttributeValue(env.getLocalTax()));
                break;
            }
            case BASE_GROUP_LOCAL: 
            case BASE_GLOBAL_LOCAL: {
                wrapper.money = (UFDouble)env.getItem(row).getAttributeValue(env.getLocalMny());
                wrapper.notaxmoney = (UFDouble)env.getItem(row).getAttributeValue(env.getLocalNoTax());
                wrapper.agentmoney = CalcMoneyUtil.nvl(env.getItem(row).getAgentreceiveprimal());
                wrapper.taxmoney = CalcMoneyUtil.nvl((UFDouble)env.getItem(row).getAttributeValue(env.getLocalTax()));
                break;
            }
            default: {
                wrapper.agentmoney = CalcMoneyUtil.nvl(env.getItem(row).getAgentreceiveprimal());
            }
        }
        return wrapper;
    }

    private String getRowCurrtype(RateCalStyle rateCalStyle, Environment env, int i) {
        String pk_currtype = env.getRowCurrtype(i);
        switch (rateCalStyle) {
            case BASE_GROUP_ORI: 
            case BASE_GLOBAL_ORI: {
                pk_currtype = env.getRowCurrtype(i);
                break;
            }
            case BASE_GROUP_LOCAL: 
            case BASE_GLOBAL_LOCAL: {
                pk_currtype = env.getPkOrgCurrtype();
                break;
            }
        }
        return pk_currtype;
    }

    public void processMoney(BaseAggVO billVO) {
        Environment env = Environment.getInstance(billVO);
        Condition cond = new Condition();
        cond.setCalOrigCurr(false);
        cond.setIsCalLocalCurr(true);
        cond.setIsChgPriceOrDiscount(false);
        cond.setIsFixNchangerate(false);
        cond.setIsFixNqtunitrate(false);
        cond.setGroupLocalCurrencyEnable(env.getGroupRateCalStyple() != RateCalStyle.NOT_GROUP_USED);
        cond.setOrigCurToGroupMoney(env.getGroupRateCalStyple() != RateCalStyle.BASE_GROUP_LOCAL);
        cond.setGlobalLocalCurrencyEnable(env.getGlobalRateCalStyple() != RateCalStyle.NOT_GLOBAL_USED);
        cond.setOrigCurToGlobalMoney(env.getGlobalRateCalStyple() != RateCalStyle.BASE_GLOBAL_LOCAL);
        cond.setIsTaxOrNet(env.getProior());
        String pk_rateType = billVO.getHeadVO().getPk_ratetype();
        for (int i = 0; i < env.length; ++i) {
            boolean isNeedCalLocal;
            BaseItemVO item = env.getItem(i);
            if (null == item.getTaxtype()) {
                item.setTaxtype(BillEnumCollection.TaxType.TAXOUT.VALUE);
            }
            if (CalcMoneyUtil.isZero(item.getGrouprate())) {
                item.setGrouprate(env.getGroupRate(i));
            }
            if (CalcMoneyUtil.isZero(item.getGlobalrate())) {
                item.setGlobalrate(env.getGlobalRate(i));
            }
            if (CalcMoneyUtil.isZero(item.getRate())) {
                item.setRate(env.getRowRate(i));
            }
            if (env.resetCurrtype(i) && CalcMoneyUtil.isZero(item.getRate())) {
                item.setRate(UFDouble.ONE_DBL);
            }
            if (CalcMoneyUtil.isZero(item.getAttributeValue(env.getOriMny()))) continue;
            UFDouble groupRate = item.getGrouprate();
            UFDouble globalRate = item.getGlobalrate();
            cond.setInternational(env.isisInterNational(i));
            boolean bl = isNeedCalLocal = env.resetRate(i) || CalcMoneyUtil.isZero(item.getAttributeValue(env.getLocalMny()));
            if (isNeedCalLocal || env.isNeedReCalc(i)) {
                Calculator tool = new Calculator(new CircularlyAccessibleValueObject[]{item}, (IRelationForItems)env.getRelationItemForCal());
                tool.calculate(cond, env.getOriMny(), new ScaleUtils(env.getPk_group()));
            }
            HashMap<String, UFDouble> groupGlobalTaxMap = new HashMap<String, UFDouble>();
            MoneyWrapper moneyWrapper = this.getMoneyWrapper(env.getGroupRateCalStyple(), env, i);
            UFDouble taxmoney = moneyWrapper.taxmoney;
            UFDouble newAgentmoneyLocal = CalcMoneyUtil.getAmountByOpp(env.getPk_org(), this.getRowCurrtype(env.getGroupRateCalStyple(), env, i), env.getPkOrgCurrtype(), moneyWrapper.agentmoney, env.getRowRate(i), new UFDate(), pk_rateType);
            item.setAttributeValue2("agentreceivelocal", newAgentmoneyLocal);
            UFDouble newdebit = CalcMoneyUtil.getAmountByOpp(env.getPk_group(), this.getRowCurrtype(env.getGroupRateCalStyple(), env, i), env.getPkGroupCurrtype(), moneyWrapper.money, groupRate, new UFDate(), pk_rateType);
            UFDouble newMoneyNotax = CalcMoneyUtil.getAmountByOpp(env.getPk_group(), this.getRowCurrtype(env.getGroupRateCalStyple(), env, i), env.getPkGroupCurrtype(), moneyWrapper.notaxmoney, groupRate, new UFDate(), pk_rateType);
            UFDouble newMoneyTax = CalcMoneyUtil.getAmountByOpp(env.getPk_group(), env.getPkOrgCurrtype(), env.getPkGroupCurrtype(), taxmoney, groupRate, new UFDate(), pk_rateType);
            UFDouble newAgentmoney = CalcMoneyUtil.getAmountByOpp(env.getPk_group(), env.getRowCurrtype(i), env.getPkGroupCurrtype(), env.getGroupRateCalStyple().equals((Object)RateCalStyle.BASE_GROUP_LOCAL) ? newAgentmoneyLocal : moneyWrapper.agentmoney, groupRate, new UFDate(), pk_rateType);
            item.setAttributeValue2(env.getGroupMny(), newdebit);
            item.setAttributeValue2(env.getGroupNoTax(), newMoneyNotax);
            groupGlobalTaxMap.put(env.getGroupTax(), newMoneyTax);
            groupGlobalTaxMap.put(env.getGroupNoTax(), newMoneyNotax);
            item.setAttributeValue2("groupagentreceivelocal", newAgentmoney);
            moneyWrapper = this.getMoneyWrapper(env.getGlobalRateCalStyple(), env, i);
            taxmoney = moneyWrapper.taxmoney;
            newdebit = CalcMoneyUtil.getAmountByOpp(env.getPk_global(), this.getRowCurrtype(env.getGlobalRateCalStyple(), env, i), env.getPkGlobalCurrtype(), moneyWrapper.money, globalRate, new UFDate(), pk_rateType);
            newMoneyNotax = CalcMoneyUtil.getAmountByOpp(env.getPk_global(), this.getRowCurrtype(env.getGlobalRateCalStyple(), env, i), env.getPkGlobalCurrtype(), moneyWrapper.notaxmoney, globalRate, new UFDate(), pk_rateType);
            newMoneyTax = CalcMoneyUtil.getAmountByOpp(env.getPk_global(), env.getPkOrgCurrtype(), env.getPkGlobalCurrtype(), taxmoney, globalRate, new UFDate(), pk_rateType);
            newAgentmoney = CalcMoneyUtil.getAmountByOpp(env.getPk_global(), env.getRowCurrtype(i), env.getPkGlobalCurrtype(), env.getGlobalRateCalStyple().equals((Object)RateCalStyle.BASE_GLOBAL_LOCAL) ? newAgentmoneyLocal : moneyWrapper.agentmoney, globalRate, new UFDate(), pk_rateType);
            item.setAttributeValue2(env.getGlobalMny(), newdebit);
            item.setAttributeValue2(env.getGlobalNoTax(), newMoneyNotax);
            groupGlobalTaxMap.put(env.getGlobalTax(), newMoneyTax);
            groupGlobalTaxMap.put(env.getGlobalNoTax(), newMoneyNotax);
            item.setGlobalagentreceivelocal(newAgentmoney);
            UFDouble newAgentlocal = CalcMoneyUtil.getAmountByOpp(env.getPk_org(), env.getRowCurrtype(i), env.getPkOrgCurrtype(), item.getAgentreceivelocal(), env.getRowRate(i), new UFDate(), pk_rateType);
            item.setAgentreceivelocal(newAgentlocal);
            if (env.isisInterNational(i)) {
                item.setAttributeValue2(env.getGroupNoTax(), item.getAttributeValue(env.getGroupMny()));
                item.setAttributeValue2(env.getGlobalNoTax(), item.getAttributeValue(env.getGlobalMny()));
            } else {
                UFDouble groupGlobalTax = groupGlobalTaxMap.get(env.getGroupNoTax()) == null || UFDouble.ZERO_DBL.equals(groupGlobalTaxMap.get(env.getGroupNoTax())) ? MathTool.sub((UFDouble)((UFDouble)item.getAttributeValue(env.getGroupMny())), (UFDouble)((UFDouble)groupGlobalTaxMap.get(env.getGroupTax()))) : (UFDouble)groupGlobalTaxMap.get(env.getGroupNoTax());
                item.setAttributeValue2(env.getGroupNoTax(), groupGlobalTax);
                UFDouble globnoTaxMoney = groupGlobalTaxMap.get(env.getGlobalNoTax()) == null || UFDouble.ZERO_DBL.equals(groupGlobalTaxMap.get(env.getGlobalNoTax())) ? MathTool.sub((UFDouble)((UFDouble)item.getAttributeValue(env.getGlobalMny())), (UFDouble)((UFDouble)groupGlobalTaxMap.get(env.getGlobalTax()))) : (UFDouble)groupGlobalTaxMap.get(env.getGlobalNoTax());
                item.setAttributeValue2(env.getGlobalNoTax(), globnoTaxMoney);
            }
            if (env.resetQuantity(i)) {
                UFDouble quantity = (UFDouble)item.getAttributeValue(env.getQuantity());
                UFDouble newquantity = ((UFDouble)item.getAttributeValue(env.getOriMny())).div((UFDouble)item.getAttributeValue("taxprice"));
                if (null != quantity) {
                    newquantity = newquantity.setScale(quantity.getPower(), 4);
                }
                item.setAttributeValue2(env.getQuantity(), newquantity);
                item.setAttributeValue2("quantity_bal", newquantity);
            }
            item.setMoney_bal(CalcMoneyUtil.nvl((UFDouble)item.getAttributeValue(env.getOriMny())));
            item.setAttributeValue2("local_money_bal", CalcMoneyUtil.nvl((UFDouble)item.getAttributeValue(env.getLocalMny())));
            item.setAttributeValue2("quantity_bal", CalcMoneyUtil.nvl((UFDouble)item.getAttributeValue(env.getQuantity())));
            item.setAttributeValue2("groupbalance", CalcMoneyUtil.nvl((UFDouble)item.getAttributeValue(env.getGroupMny())));
            item.setAttributeValue2("globalbalance", CalcMoneyUtil.nvl((UFDouble)item.getAttributeValue(env.getGlobalMny())));
        }
        env.headVO.setMoney(CalcMoneyUtil.sumB(env.getOriMny(), (CircularlyAccessibleValueObject[])env.items));
        env.headVO.setLocal_money(CalcMoneyUtil.sumB(env.getLocalMny(), (CircularlyAccessibleValueObject[])env.items));
        env.headVO.setGrouplocal(CalcMoneyUtil.sumB(env.getGroupMny(), (CircularlyAccessibleValueObject[])env.items));
        env.headVO.setGloballocal(CalcMoneyUtil.sumB(env.getGlobalMny(), (CircularlyAccessibleValueObject[])env.items));
        env.headVO.setRate((UFDouble)env.items[0].getAttributeValue("rate"));
        env.headVO.setGrouprate((UFDouble)env.items[0].getAttributeValue("grouprate"));
        env.headVO.setGlobalrate((UFDouble)env.items[0].getAttributeValue("globalrate"));
    }

    public void redprocessMoney(BaseAggVO billVO) {
        Environment env = Environment.getInstance(billVO);
        Condition cond = new Condition();
        cond.setCalOrigCurr(false);
        cond.setIsCalLocalCurr(true);
        cond.setIsChgPriceOrDiscount(false);
        cond.setIsFixNchangerate(false);
        cond.setIsFixNqtunitrate(false);
        cond.setGroupLocalCurrencyEnable(env.getGroupRateCalStyple() != RateCalStyle.NOT_GROUP_USED);
        cond.setOrigCurToGroupMoney(env.getGroupRateCalStyple() != RateCalStyle.BASE_GROUP_LOCAL);
        cond.setGlobalLocalCurrencyEnable(env.getGlobalRateCalStyple() != RateCalStyle.NOT_GLOBAL_USED);
        cond.setOrigCurToGlobalMoney(env.getGlobalRateCalStyple() != RateCalStyle.BASE_GLOBAL_LOCAL);
        cond.setIsTaxOrNet(env.getProior());
        String pk_rateTyep = billVO.getHeadVO().getPk_ratetype();
        for (int i = 0; i < env.length; ++i) {
            boolean isNeedCalLocal;
            BaseItemVO item = env.getItem(i);
            if (null == item.getTaxtype()) {
                item.setTaxtype(BillEnumCollection.TaxType.TAXOUT.VALUE);
            }
            if (CalcMoneyUtil.isZero(item.getGrouprate())) {
                item.setGrouprate(env.getGroupRate(i));
            }
            if (CalcMoneyUtil.isZero(item.getGlobalrate())) {
                item.setGlobalrate(env.getGlobalRate(i));
            }
            if (CalcMoneyUtil.isZero(item.getRate())) {
                item.setRate(env.getRowRate(i));
            }
            item.setAttributeValue2(env.getQuantity(), CalcMoneyUtil.nvl(item.getQuantity_bal()));
            if (env.resetCurrtype(i) && CalcMoneyUtil.isZero(item.getRate())) {
                item.setRate(UFDouble.ONE_DBL);
            }
            if (CalcMoneyUtil.isZero(item.getAttributeValue(env.getOriMny()))) continue;
            UFDouble groupRate = item.getGrouprate();
            UFDouble globalRate = item.getGlobalrate();
            cond.setInternational(env.isisInterNational(i));
            boolean bl = isNeedCalLocal = env.resetRate(i) || CalcMoneyUtil.isZero(item.getAttributeValue(env.getLocalMny()));
            if (isNeedCalLocal || env.isNeedReCalc(i)) {
                Calculator tool = new Calculator(new CircularlyAccessibleValueObject[]{item}, (IRelationForItems)env.getRelationItemForCal());
                tool.calculate(cond, env.getOriMny(), new ScaleUtils(env.getPk_group()));
            }
            HashMap<String, UFDouble> groupGlobalTaxMap = new HashMap<String, UFDouble>();
            MoneyWrapper moneyWrapper = this.getMoneyWrapper(env.getGroupRateCalStyple(), env, i);
            UFDouble taxmoney = moneyWrapper.taxmoney;
            UFDouble newAgentmoneyLocal = CalcMoneyUtil.getAmountByOpp(env.getPk_org(), this.getRowCurrtype(env.getGroupRateCalStyple(), env, i), env.getPkOrgCurrtype(), moneyWrapper.agentmoney, env.getRowRate(i), new UFDate(), pk_rateTyep);
            item.setAttributeValue2("agentreceivelocal", newAgentmoneyLocal);
            UFDouble newdebit = CalcMoneyUtil.getAmountByOpp(env.getPk_group(), this.getRowCurrtype(env.getGroupRateCalStyple(), env, i), env.getPkGroupCurrtype(), moneyWrapper.money, groupRate, new UFDate(), pk_rateTyep);
            UFDouble newMoneyNotax = CalcMoneyUtil.getAmountByOpp(env.getPk_group(), this.getRowCurrtype(env.getGroupRateCalStyple(), env, i), env.getPkGroupCurrtype(), moneyWrapper.notaxmoney, groupRate, new UFDate(), pk_rateTyep);
            UFDouble newMoneyTax = CalcMoneyUtil.getAmountByOpp(env.getPk_group(), env.getPkOrgCurrtype(), env.getPkGroupCurrtype(), taxmoney, groupRate, new UFDate(), pk_rateTyep);
            UFDouble newAgentmoney = CalcMoneyUtil.getAmountByOpp(env.getPk_group(), env.getRowCurrtype(i), env.getPkGroupCurrtype(), env.getGroupRateCalStyple().equals((Object)RateCalStyle.BASE_GROUP_LOCAL) ? newAgentmoneyLocal : moneyWrapper.agentmoney, groupRate, new UFDate(), pk_rateTyep);
            item.setAttributeValue2(env.getGroupMny(), newdebit);
            item.setAttributeValue2(env.getGroupNoTax(), newMoneyNotax);
            groupGlobalTaxMap.put(env.getGroupTax(), newMoneyTax);
            item.setAttributeValue2("groupagentreceivelocal", newAgentmoney);
            moneyWrapper = this.getMoneyWrapper(env.getGlobalRateCalStyple(), env, i);
            taxmoney = moneyWrapper.taxmoney;
            newdebit = CalcMoneyUtil.getAmountByOpp(env.getPk_global(), this.getRowCurrtype(env.getGlobalRateCalStyple(), env, i), env.getPkGlobalCurrtype(), moneyWrapper.money, globalRate, new UFDate(), pk_rateTyep);
            newMoneyNotax = CalcMoneyUtil.getAmountByOpp(env.getPk_global(), this.getRowCurrtype(env.getGlobalRateCalStyple(), env, i), env.getPkGlobalCurrtype(), moneyWrapper.notaxmoney, globalRate, new UFDate(), pk_rateTyep);
            newMoneyTax = CalcMoneyUtil.getAmountByOpp(env.getPk_global(), env.getPkOrgCurrtype(), env.getPkGlobalCurrtype(), taxmoney, globalRate, new UFDate(), pk_rateTyep);
            newAgentmoney = CalcMoneyUtil.getAmountByOpp(env.getPk_global(), env.getRowCurrtype(i), env.getPkGlobalCurrtype(), env.getGlobalRateCalStyple().equals((Object)RateCalStyle.BASE_GLOBAL_LOCAL) ? newAgentmoneyLocal : moneyWrapper.agentmoney, globalRate, new UFDate(), pk_rateTyep);
            item.setAttributeValue2(env.getGlobalMny(), newdebit);
            item.setAttributeValue2(env.getGlobalNoTax(), newMoneyNotax);
            groupGlobalTaxMap.put(env.getGlobalTax(), newMoneyTax);
            item.setGlobalagentreceivelocal(newAgentmoney);
            UFDouble newAgentlocal = CalcMoneyUtil.getAmountByOpp(env.getPk_org(), env.getRowCurrtype(i), env.getPkOrgCurrtype(), item.getAgentreceivelocal(), env.getRowRate(i), new UFDate(), pk_rateTyep);
            item.setAgentreceivelocal(newAgentlocal);
            if (env.isisInterNational(i)) {
                item.setAttributeValue2(env.getGroupNoTax(), item.getAttributeValue(env.getGroupMny()));
                item.setAttributeValue2(env.getGlobalNoTax(), item.getAttributeValue(env.getGlobalMny()));
            } else {
                item.setAttributeValue2(env.getGroupNoTax(), MathTool.sub((UFDouble)((UFDouble)item.getAttributeValue(env.getGroupMny())), (UFDouble)((UFDouble)groupGlobalTaxMap.get(env.getGroupTax()))));
                item.setAttributeValue2(env.getGlobalNoTax(), MathTool.sub((UFDouble)((UFDouble)item.getAttributeValue(env.getGlobalMny())), (UFDouble)((UFDouble)groupGlobalTaxMap.get(env.getGlobalTax()))));
            }
            if (env.resetQuantity(i)) {
                UFDouble quantity = (UFDouble)item.getAttributeValue(env.getQuantity());
                UFDouble newquantity = ((UFDouble)item.getAttributeValue(env.getOriMny())).div((UFDouble)item.getAttributeValue("taxprice"));
                if (null != quantity) {
                    newquantity = newquantity.setScale(quantity.getPower(), 4);
                }
                item.setAttributeValue2(env.getQuantity(), newquantity);
                item.setAttributeValue2("quantity_bal", newquantity);
            }
            item.setMoney_bal(CalcMoneyUtil.nvl((UFDouble)item.getAttributeValue(env.getOriMny())));
            item.setAttributeValue2("local_money_bal", CalcMoneyUtil.nvl((UFDouble)item.getAttributeValue(env.getLocalMny())));
            item.setAttributeValue2("quantity_bal", CalcMoneyUtil.nvl(item.getQuantity_bal()));
            item.setAttributeValue2("groupbalance", CalcMoneyUtil.nvl((UFDouble)item.getAttributeValue(env.getGroupMny())));
            item.setAttributeValue2("globalbalance", CalcMoneyUtil.nvl((UFDouble)item.getAttributeValue(env.getGlobalMny())));
        }
        env.headVO.setMoney(CalcMoneyUtil.sumB(env.getOriMny(), (CircularlyAccessibleValueObject[])env.items));
        env.headVO.setLocal_money(CalcMoneyUtil.sumB(env.getLocalMny(), (CircularlyAccessibleValueObject[])env.items));
        env.headVO.setGrouplocal(CalcMoneyUtil.sumB(env.getGroupMny(), (CircularlyAccessibleValueObject[])env.items));
        env.headVO.setGloballocal(CalcMoneyUtil.sumB(env.getGlobalMny(), (CircularlyAccessibleValueObject[])env.items));
        env.headVO.setRate((UFDouble)env.items[0].getAttributeValue("rate"));
        env.headVO.setGrouprate((UFDouble)env.items[0].getAttributeValue("grouprate"));
        env.headVO.setGlobalrate((UFDouble)env.items[0].getAttributeValue("globalrate"));
    }

    public void processImpMoney(BaseAggVO billVO) {
        Environment env = Environment.getInstance(billVO);
        Condition cond = new Condition();
        cond.setCalOrigCurr(false);
        cond.setIsCalLocalCurr(true);
        cond.setIsChgPriceOrDiscount(false);
        cond.setIsFixNchangerate(false);
        cond.setIsFixNqtunitrate(false);
        cond.setGroupLocalCurrencyEnable(env.getGroupRateCalStyple() != RateCalStyle.NOT_GROUP_USED);
        cond.setOrigCurToGroupMoney(env.getGroupRateCalStyple() != RateCalStyle.BASE_GROUP_LOCAL);
        cond.setGlobalLocalCurrencyEnable(env.getGlobalRateCalStyple() != RateCalStyle.NOT_GLOBAL_USED);
        cond.setOrigCurToGlobalMoney(env.getGlobalRateCalStyple() != RateCalStyle.BASE_GLOBAL_LOCAL);
        cond.setIsTaxOrNet(false);
        for (int i = 0; i < env.length; ++i) {
            boolean isNeedCalLocal;
            BaseItemVO item = env.getItem(i);
            if (null == item.getTaxtype()) {
                item.setTaxtype(BillEnumCollection.TaxType.TAXOUT.VALUE);
            }
            if (CalcMoneyUtil.isZero(item.getAttributeValue(env.getOriMny()))) continue;
            if (CalcMoneyUtil.isZero(item.getGrouprate()) || env.resetGroupRate(i)) {
                item.setGrouprate(env.getGroupRate(i));
            }
            if (CalcMoneyUtil.isZero(item.getGlobalrate()) || env.resetGlobalRate(i)) {
                item.setGlobalrate(env.getGlobalRate(i));
            }
            if (env.resetRate(i)) {
                item.setRate(env.getRowRate(i));
            }
            if (env.resetCurrtype(i) && CalcMoneyUtil.isZero(item.getRate()) || item.getPk_currtype().equals(env.currtypes[0])) {
                item.setRate(UFDouble.ONE_DBL);
            }
            UFDouble groupRate = item.getGrouprate();
            UFDouble globalRate = item.getGlobalrate();
            cond.setInternational(env.isisInterNational(i));
            UFDouble localTaxDE = UFDouble.ZERO_DBL;
            UFDouble localTaxCR = UFDouble.ZERO_DBL;
            if ("F0".equals(item.getPk_billtype()) || "F3".equals(item.getPk_billtype())) {
                localTaxDE = item.getLocal_tax_de();
            } else {
                localTaxCR = item.getLocal_tax_cr();
            }
            boolean bl = isNeedCalLocal = env.resetRate(i) || CalcMoneyUtil.isZero(item.getAttributeValue(env.getLocalMny()));
            if (isNeedCalLocal || env.isNeedReCalc(i)) {
                if (item.getAttributeValue(env.getOriMny()) != null) {
                    UFDouble orimny = Currency.getFormaUfValue((String)item.getPk_currtype(), (UFDouble)((UFDouble)item.getAttributeValue(env.getOriMny())));
                    item.setAttributeValue(env.getOriMny(), orimny);
                }
                if (item.getAttributeValue(env.getLocalMny()) != null) {
                    UFDouble localmny = Currency.getFormaUfValue((String)env.currtypes[0], (UFDouble)((UFDouble)item.getAttributeValue(env.getLocalMny())));
                    item.setAttributeValue(env.getLocalMny(), localmny);
                }
                Calculator tool = new Calculator(new CircularlyAccessibleValueObject[]{item}, (IRelationForItems)env.getRelationItemForCal());
                UFDouble localmoneyB = item.getAttributeValue(env.getLocalMny()) == null ? UFDouble.ZERO_DBL : (UFDouble)item.getAttributeValue(env.getLocalMny());
                tool.calculate(cond, env.getOriMny(), new ScaleUtils(env.getPk_group()));
                localTaxCR = item.getLocal_tax_cr().equals((Object)localTaxCR) ? localTaxCR : item.getLocal_tax_cr();
                UFDouble uFDouble = localTaxDE = item.getLocal_tax_de().equals((Object)localTaxDE) ? localTaxDE : item.getLocal_tax_de();
                if ("F0".equals(item.getPk_billtype()) || "F3".equals(item.getPk_billtype())) {
                    item.setLocal_tax_de(localTaxDE);
                } else {
                    item.setLocal_tax_cr(localTaxCR);
                }
                UFDouble localmoneyA = (UFDouble)item.getAttributeValue(env.getLocalMny());
                if (!CalcMoneyUtil.isZero(localmoneyB) && localmoneyA.compareTo((Object)localmoneyB) != 0) {
                    item.setAttributeValue(env.getLocalMny(), localmoneyB);
                    Calculator tool1 = new Calculator(new CircularlyAccessibleValueObject[]{item}, (IRelationForItems)env.getRelationItemForCal());
                    tool1.calculate(cond, env.getLocalMny(), new ScaleUtils(env.getPk_group()));
                }
            }
            HashMap<String, UFDouble> groupGlobalTaxMap = new HashMap<String, UFDouble>();
            MoneyWrapper moneyWrapper = this.getMoneyWrapper(env.getGroupRateCalStyple(), env, i);
            UFDouble taxmoney = moneyWrapper.taxmoney;
            String pk_rateTyep = item.getPk_ratetype();
            UFDouble newAgentmoneyLocal = CalcMoneyUtil.getAmountByOpp(env.getPk_org(), this.getRowCurrtype(env.getGroupRateCalStyple(), env, i), env.getPkOrgCurrtype(), moneyWrapper.agentmoney, env.getRowRate(i), new UFDate(), pk_rateTyep);
            item.setAttributeValue2("agentreceivelocal", newAgentmoneyLocal);
            UFDouble newdebit = CalcMoneyUtil.getAmountByOpp(env.getPk_group(), this.getRowCurrtype(env.getGroupRateCalStyple(), env, i), env.getPkGroupCurrtype(), moneyWrapper.money, groupRate, new UFDate(), pk_rateTyep);
            UFDouble newMoneyNotax = CalcMoneyUtil.getAmountByOpp(env.getPk_group(), this.getRowCurrtype(env.getGroupRateCalStyple(), env, i), env.getPkGroupCurrtype(), moneyWrapper.notaxmoney, groupRate, new UFDate(), pk_rateTyep);
            UFDouble newMoneyTax = CalcMoneyUtil.getAmountByOpp(env.getPk_group(), env.getPkOrgCurrtype(), env.getPkGroupCurrtype(), taxmoney, groupRate, new UFDate(), pk_rateTyep);
            UFDouble newAgentmoney = CalcMoneyUtil.getAmountByOpp(env.getPk_group(), env.getRowCurrtype(i), env.getPkGroupCurrtype(), env.getGroupRateCalStyple().equals((Object)RateCalStyle.BASE_GROUP_LOCAL) ? newAgentmoneyLocal : moneyWrapper.agentmoney, groupRate, new UFDate(), pk_rateTyep);
            item.setAttributeValue2(env.getGroupMny(), newdebit);
            item.setAttributeValue2(env.getGroupNoTax(), newMoneyNotax);
            groupGlobalTaxMap.put(env.getGroupTax(), newMoneyTax);
            item.setAttributeValue2("groupagentreceivelocal", newAgentmoney);
            moneyWrapper = this.getMoneyWrapper(env.getGlobalRateCalStyple(), env, i);
            taxmoney = moneyWrapper.taxmoney;
            newdebit = CalcMoneyUtil.getAmountByOpp(env.getPk_global(), this.getRowCurrtype(env.getGlobalRateCalStyple(), env, i), env.getPkGlobalCurrtype(), moneyWrapper.money, globalRate, new UFDate(), pk_rateTyep);
            newMoneyNotax = CalcMoneyUtil.getAmountByOpp(env.getPk_global(), this.getRowCurrtype(env.getGlobalRateCalStyple(), env, i), env.getPkGlobalCurrtype(), moneyWrapper.notaxmoney, globalRate, new UFDate(), pk_rateTyep);
            newMoneyTax = CalcMoneyUtil.getAmountByOpp(env.getPk_global(), env.getPkOrgCurrtype(), env.getPkGlobalCurrtype(), taxmoney, globalRate, new UFDate(), pk_rateTyep);
            newAgentmoney = CalcMoneyUtil.getAmountByOpp(env.getPk_global(), env.getRowCurrtype(i), env.getPkGlobalCurrtype(), env.getGlobalRateCalStyple().equals((Object)RateCalStyle.BASE_GLOBAL_LOCAL) ? newAgentmoneyLocal : moneyWrapper.agentmoney, globalRate, new UFDate(), pk_rateTyep);
            item.setAttributeValue2(env.getGlobalMny(), newdebit);
            item.setAttributeValue2(env.getGlobalNoTax(), newMoneyNotax);
            groupGlobalTaxMap.put(env.getGlobalTax(), newMoneyTax);
            item.setGlobalagentreceivelocal(newAgentmoney);
            UFDouble newAgentlocal = CalcMoneyUtil.getAmountByOpp(env.getPk_org(), env.getRowCurrtype(i), env.getPkOrgCurrtype(), item.getAgentreceivelocal(), env.getRowRate(i), new UFDate(), pk_rateTyep);
            item.setAgentreceivelocal(newAgentlocal);
            if (env.isisInterNational(i)) {
                item.setAttributeValue2(env.getGroupNoTax(), item.getAttributeValue(env.getGroupMny()));
                item.setAttributeValue2(env.getGlobalNoTax(), item.getAttributeValue(env.getGlobalMny()));
            } else {
                item.setAttributeValue2(env.getGroupNoTax(), MathTool.sub((UFDouble)((UFDouble)item.getAttributeValue(env.getGroupMny())), (UFDouble)((UFDouble)groupGlobalTaxMap.get(env.getGroupTax()))));
                item.setAttributeValue2(env.getGlobalNoTax(), MathTool.sub((UFDouble)((UFDouble)item.getAttributeValue(env.getGlobalMny())), (UFDouble)((UFDouble)groupGlobalTaxMap.get(env.getGlobalTax()))));
            }
            if (env.resetQuantity(i)) {
                UFDouble quantity = (UFDouble)item.getAttributeValue(env.getQuantity());
                UFDouble newquantity = ((UFDouble)item.getAttributeValue(env.getOriMny())).div((UFDouble)item.getAttributeValue("taxprice"));
                if (null != quantity) {
                    newquantity = newquantity.setScale(quantity.getPower(), 4);
                }
                item.setAttributeValue2(env.getQuantity(), newquantity);
                item.setAttributeValue2("quantity_bal", newquantity);
            }
            item.setMoney_bal(CalcMoneyUtil.nvl((UFDouble)item.getAttributeValue(env.getOriMny())));
            item.setAttributeValue2("local_money_bal", CalcMoneyUtil.nvl((UFDouble)item.getAttributeValue(env.getLocalMny())));
            item.setAttributeValue2("quantity_bal", CalcMoneyUtil.nvl((UFDouble)item.getAttributeValue(env.getQuantity())));
            item.setAttributeValue2("groupbalance", CalcMoneyUtil.nvl((UFDouble)item.getAttributeValue(env.getGroupMny())));
            item.setAttributeValue2("globalbalance", CalcMoneyUtil.nvl((UFDouble)item.getAttributeValue(env.getGlobalMny())));
        }
        env.headVO.setMoney(CalcMoneyUtil.sumB(env.getOriMny(), (CircularlyAccessibleValueObject[])env.items));
        env.headVO.setLocal_money(CalcMoneyUtil.sumB(env.getLocalMny(), (CircularlyAccessibleValueObject[])env.items));
        env.headVO.setGrouplocal(CalcMoneyUtil.sumB(env.getGroupMny(), (CircularlyAccessibleValueObject[])env.items));
        env.headVO.setGloballocal(CalcMoneyUtil.sumB(env.getGlobalMny(), (CircularlyAccessibleValueObject[])env.items));
        env.headVO.setRate((UFDouble)env.items[0].getAttributeValue("rate"));
        env.headVO.setGrouprate((UFDouble)env.items[0].getAttributeValue("grouprate"));
        env.headVO.setGlobalrate((UFDouble)env.items[0].getAttributeValue("globalrate"));
    }

    static UFDouble getAmountByOpp(String pk_corp, String pk_currtype, String oppcurrtype, UFDouble amount, UFDouble newrate, UFDate date, String pk_rateType) {
        if (newrate != null && UFDouble.ZERO_DBL.compareTo((Object)newrate) == 0) {
            return UFDouble.ZERO_DBL;
        }
        try {
            if (StringUtil.isEmptyWithTrim(pk_rateType)) {
                return Currency.getAmountByOpp((String)pk_corp, (String)pk_currtype, (String)oppcurrtype, (UFDouble)amount, (UFDouble)newrate, (UFDate)date);
            }
            return CurrencyRateUtil.getInstanceByRateType((String)pk_rateType).getAmountByOpp(pk_currtype, oppcurrtype, amount, newrate, date);
        }
        catch (BusinessException e) {
            CalcMoneyUtil.throwException(e);
            return amount;
        }
    }

    private static void throwException(BusinessException e) {
        ExceptionHandler.handleRuntimeException((Exception)((Object)e));
    }

    static boolean isZero(Object m1) {
        return m1 instanceof UFDouble ? CalcMoneyUtil.isZero((UFDouble)m1) : false;
    }

    static boolean isZero(UFDouble m1) {
        return m1 == null || m1.compareTo((Object)UFDouble.ZERO_DBL) == 0;
    }

    static UFDouble nvl(UFDouble m1) {
        return CalcMoneyUtil.isZero(m1) ? UFDouble.ZERO_DBL : m1;
    }

    static boolean ufequals(UFDouble m1, UFDouble m2) {
        return CalcMoneyUtil.nvl(m1).compareTo((Object)CalcMoneyUtil.nvl(m2)) == 0;
    }

    static UFDouble sumB(String Bkey, CircularlyAccessibleValueObject[] items) {
        UFDouble subValue = ArapCommonTool.getZero();
        for (CircularlyAccessibleValueObject item : items) {
            if (null == item || item.getStatus() == 3) continue;
            try {
                subValue = subValue.add(item.getAttributeValue(Bkey) == null ? ArapCommonTool.getZero() : (UFDouble)item.getAttributeValue(Bkey));
            }
            catch (Exception e1) {
                ExceptionHandler.consume((Throwable)e1);
            }
        }
        return subValue;
    }

    static class CreditEnvironment
    extends Environment {
        CreditEnvironment(BaseAggVO billVO) {
            super(billVO);
        }

        @Override
        boolean direcion() {
            return false;
        }

        @Override
        String getGlobalMny() {
            return "globalcrebit";
        }

        @Override
        String getGlobalNoTax() {
            return "globalnotax_cre";
        }

        @Override
        String getGlobalTax() {
            return "globaltax_cre";
        }

        @Override
        String getGroupMny() {
            return "groupcrebit";
        }

        @Override
        String getGroupNoTax() {
            return "groupnotax_cre";
        }

        @Override
        String getGroupTax() {
            return "grouptax_cre";
        }

        @Override
        String getLocalMny() {
            return "local_money_cr";
        }

        @Override
        String getLocalNoTax() {
            return "local_notax_cr";
        }

        @Override
        String getLocalTax() {
            return "local_tax_cr";
        }

        @Override
        String getOriMny() {
            return "money_cr";
        }

        @Override
        boolean isAr() {
            return "yf".equals(this.headVO.getBillclass()) || "fk".equals(this.headVO.getBillclass()) || "zf".equals(this.headVO.getBillclass());
        }

        @Override
        String getOriNoTax() {
            return "notax_cr";
        }

        @Override
        String getQuantity() {
            return "quantity_cr";
        }

        @Override
        RelationItemForCal getRelationItemForCal() {
            return RelationItemForCal_Credit.getInstance();
        }
    }

    static class DebitEnvironment
    extends Environment {
        DebitEnvironment(BaseAggVO billVO) {
            super(billVO);
        }

        @Override
        boolean direcion() {
            return true;
        }

        @Override
        String getGlobalMny() {
            return "globaldebit";
        }

        @Override
        String getGlobalNoTax() {
            return "globalnotax_de";
        }

        @Override
        String getGlobalTax() {
            return "globaltax_de";
        }

        @Override
        String getGroupMny() {
            return "groupdebit";
        }

        @Override
        String getGroupNoTax() {
            return "groupnotax_de";
        }

        @Override
        String getGroupTax() {
            return "grouptax_de";
        }

        @Override
        String getLocalMny() {
            return "local_money_de";
        }

        @Override
        String getLocalNoTax() {
            return "local_notax_de";
        }

        @Override
        String getLocalTax() {
            return "local_tax_de";
        }

        @Override
        String getOriMny() {
            return "money_de";
        }

        @Override
        boolean isAr() {
            return "ys".equals(this.headVO.getBillclass()) || "sk".equals(this.headVO.getBillclass()) || "zs".equals(this.headVO.getBillclass());
        }

        @Override
        String getOriNoTax() {
            return "notax_de";
        }

        @Override
        String getQuantity() {
            return "quantity_de";
        }

        @Override
        RelationItemForCal getRelationItemForCal() {
            return RelationItemForCal_Debit.getInstance();
        }
    }

    static enum RateCalStyle {
        NOT_GROUP_USED,
        BASE_GROUP_ORI,
        BASE_GROUP_LOCAL,
        NOT_GLOBAL_USED,
        BASE_GLOBAL_ORI,
        BASE_GLOBAL_LOCAL;

    }

    static abstract class Environment {
        private int length;
        protected BaseBillVO headVO;
        protected BaseItemVO[] items;
        private static final List<String> billtypes = Arrays.asList("F0", "F1", "F2", "F3", "21", "Z2", "Z3", "Z4", "Z5", "4A77");
        private static final List<String> OtherBilltypes = Arrays.asList("Z2", "Z3", "Z4", "Z5");
        String[] orgs = new String[3];
        String[] currtypes = null;
        String[] rowCurrtypes = null;
        UFDouble[][] rowRates = null;
        Object[] sysinits = new Object[10];
        boolean[][] resets = new boolean[10][];
        boolean[][] bools = new boolean[10][];

        public static Environment getInstance(BaseAggVO billVO) {
            Environment.checkBillVO(billVO);
            Environment instance = null;
            Integer direction = billVO.getItems()[0].getDirection();
            if (direction.equals(BillEnumCollection.Direction.DEBIT.VALUE)) {
                instance = new DebitEnvironment(billVO);
            } else if (direction.equals(BillEnumCollection.Direction.CREDIT.VALUE)) {
                instance = new CreditEnvironment(billVO);
            }
            return instance;
        }

        private static void checkBillVO(BaseAggVO billVO) {
            StringBuilder msg = new StringBuilder();
            if (billVO == null) {
                msg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0018"));
                Environment.createAndThrows(msg);
            }
            Object[] items = billVO.getItems();
            if (billVO.getParent() == null || ArrayUtils.isEmpty((Object[])items)) {
                msg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0019"));
                Environment.createAndThrows(msg);
            }
            if (StringUtils.isEmpty((CharSequence)billVO.getHeadVO().getPk_org())) {
                msg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0020"));
            }
            for (int i = 0; i < items.length; ++i) {
                Integer direction = ((BaseItemVO)items[i]).getDirection();
                if (direction != null && (direction.intValue() == BillEnumCollection.Direction.DEBIT.VALUE.intValue() || direction.intValue() == BillEnumCollection.Direction.CREDIT.VALUE.intValue())) continue;
                msg.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0021")).append(i).append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0022")).append(direction == null ? NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0023") : direction).append(")");
            }
            Environment.createAndThrows(msg);
        }

        private static void createAndThrows(StringBuilder msg) {
            if (msg != null && msg.length() > 0) {
                throw new BusinessRuntimeException(msg.toString());
            }
        }

        abstract boolean direcion();

        abstract boolean isAr();

        abstract String getOriMny();

        abstract String getOriNoTax();

        abstract String getLocalMny();

        abstract String getLocalTax();

        abstract String getLocalNoTax();

        abstract String getGroupMny();

        abstract String getGroupTax();

        abstract String getGroupNoTax();

        abstract String getGlobalMny();

        abstract String getGlobalTax();

        abstract String getGlobalNoTax();

        abstract String getQuantity();

        abstract RelationItemForCal getRelationItemForCal();

        Environment(BaseAggVO billVO) {
            this.init(billVO);
        }

        BaseItemVO getItem(int i) {
            return this.items[i];
        }

        protected void init(BaseAggVO billVO) {
            this.headVO = billVO.getHeadVO();
            this.orgs[0] = this.headVO.getPk_org();
            this.orgs[1] = this.headVO.getPk_group();
            this.orgs[2] = "GLOBLE00000000000000";
            this.items = billVO.getItems();
            this.length = this.items.length;
            this.initCurr();
            this.initSysinit();
            this.initReset();
            boolean isRestCurrtype = false;
            for (int i = 0; i < this.length; ++i) {
                if (!this.resetCurrtype(i)) continue;
                isRestCurrtype = true;
                this.items[i].setPk_currtype(this.getPkOrgCurrtype());
            }
            if (isRestCurrtype && StringUtils.isEmpty((CharSequence)this.headVO.getPk_currtype())) {
                this.headVO.setPk_currtype(this.getPkOrgCurrtype());
            }
            this.initRate();
            this.bools[0] = new boolean[this.length];
            this.bools[1] = new boolean[this.length];
            for (int i = 0; i < this.length; ++i) {
                this.bools[0][i] = BillEnumCollection.BuySellType.OUT_SELL.VALUE.equals(this.getItem(i).getBuysellflag()) || BillEnumCollection.BuySellType.OUT_BUY.VALUE.equals(this.getItem(i).getBuysellflag());
                boolean isInterNation_needCal = this.bools[0][i] && !CalcMoneyUtil.ufequals((UFDouble)this.getItem(i).getAttributeValue(this.getLocalNoTax()), (UFDouble)this.getItem(i).getAttributeValue(this.getLocalMny()));
                UFDouble m1 = MathTool.add((UFDouble)((UFDouble)this.getItem(i).getAttributeValue(this.getLocalNoTax())), (UFDouble)((UFDouble)this.getItem(i).getAttributeValue(this.getLocalTax())));
                boolean notInterNation = !this.bools[0][i] && !CalcMoneyUtil.ufequals(m1, (UFDouble)this.getItem(i).getAttributeValue(this.getLocalMny()));
                this.bools[1][i] = isInterNation_needCal || notInterNation;
            }
        }

        private void initSysinit() {
            try {
                this.sysinits[0] = SysInit.getParaString((String)this.getPk_group(), (String)"NC001");
                this.sysinits[1] = SysInit.getParaString((String)this.getPk_global(), (String)"NC002");
                this.sysinits[3] = SysInit.getParaString((String)this.getPk_org(), (String)(this.isAr() ? SysinitConst.AR21 : SysinitConst.AP21));
            }
            catch (BusinessException e) {
                CalcMoneyUtil.throwException(e);
            }
        }

        private void initRate() {
            try {
                HashMap[] map = new HashMap[]{new HashMap(), new HashMap(), new HashMap()};
                this.rowRates = new UFDouble[3][this.length];
                String key = null;
                UFDouble rate = UFDouble.ONE_DBL;
                for (int i = 0; i < this.length; ++i) {
                    if (StringUtils.isEmpty((CharSequence)this.items[i].getPk_currtype()) || StringUtils.isEmpty((CharSequence)this.items[i].getPk_group()) || StringUtils.isEmpty((CharSequence)this.items[i].getPk_org())) {
                        throw new RuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0024"));
                    }
                    key = this.rowCurrtypes[i] + this.getPk_group() + this.getPk_org() + this.headVO.getBilldate() + this.headVO.getPk_billtype();
                    if (map[0].get(key) == null) {
                        rate = ArapBillCalUtil.getOrgRate(this.rowCurrtypes[i], this.getPk_group(), this.getPk_org(), this.headVO.getBilldate(), this.headVO.getPk_billtype(), this.headVO.getPk_ratetype(), this.headVO.getObjtype(), new String[]{this.headVO.getCustomer(), this.headVO.getSupplier()});
                        map[0].put(key, rate);
                        this.rowRates[0][i] = (UFDouble)map[0].get(key);
                    } else {
                        this.rowRates[0][i] = (UFDouble)map[0].get(key);
                    }
                    if (map[1].get(key) == null) {
                        rate = ArapBillCalUtil.getGroupRate(this.rowCurrtypes[i], this.getPk_group(), this.getPk_org(), this.headVO.getBilldate(), this.headVO.getPk_billtype());
                        map[1].put(key, rate);
                        this.rowRates[1][i] = (UFDouble)map[1].get(key);
                    } else {
                        this.rowRates[1][i] = (UFDouble)map[1].get(key);
                    }
                    if (map[2].get(key) == null) {
                        rate = ArapBillCalUtil.getGlobalRate(this.rowCurrtypes[i], this.getPk_group(), this.getPk_org(), this.headVO.getBilldate(), this.headVO.getPk_billtype());
                        map[2].put(key, rate);
                        this.rowRates[2][i] = (UFDouble)map[2].get(key);
                        continue;
                    }
                    this.rowRates[2][i] = (UFDouble)map[2].get(key);
                }
            }
            catch (BusinessException e) {
                CalcMoneyUtil.throwException(e);
            }
        }

        private void initReset() {
            this.resets = new boolean[5][this.length];
            boolean contains = false;
            for (int i = 0; i < this.length; ++i) {
                contains = billtypes.contains(this.getItem(i).getTop_billtype());
                this.resets[0][i] = StringUtils.isEmpty((CharSequence)this.getItem(i).getPk_currtype());
                this.resets[1][i] = contains || !this.headVO.getPk_org().equals(this.getItem(i).getSett_org()) || !this.resets[0][i] && (this.items[i].getRate() == null || this.items[i].getRate().compareTo((Object)UFDouble.ZERO_DBL) == 0);
                this.resets[2][i] = OtherBilltypes.contains(this.getItem(i).getTop_billtype()) && CalcMoneyUtil.isZero(this.getItem(i).getAttributeValue("taxprice")) && CalcMoneyUtil.isZero(this.getItem(i).getAttributeValue(this.getOriMny()));
                this.resets[3][i] = this.resets[1][i] && this.getGroupRateCalStyple().equals((Object)RateCalStyle.BASE_GROUP_LOCAL);
                this.resets[4][i] = this.resets[1][i] && this.getGlobalRateCalStyple().equals((Object)RateCalStyle.BASE_GLOBAL_LOCAL);
            }
        }

        private void initCurr() {
            this.currtypes = new String[3];
            try {
                this.currtypes[0] = Currency.getOrgLocalCurrPK((String)this.getPk_org());
                this.currtypes[1] = Currency.getOrgLocalCurrPK((String)this.getPk_group());
                this.currtypes[2] = Currency.getOrgLocalCurrPK((String)this.getPk_global());
                this.rowCurrtypes = new String[this.length];
                for (int i = 0; i < this.length; ++i) {
                    this.rowCurrtypes[i] = StringUtils.isEmpty((CharSequence)this.items[i].getPk_currtype()) ? this.getPkOrgCurrtype() : this.items[i].getPk_currtype();
                }
            }
            catch (BusinessException e) {
                CalcMoneyUtil.throwException(e);
            }
        }

        String getPk_org() {
            return this.orgs[0];
        }

        String getPk_group() {
            return this.orgs[1];
        }

        String getPk_global() {
            return this.orgs[2];
        }

        String getPkOrgCurrtype() {
            return this.currtypes[0];
        }

        String getPkGroupCurrtype() {
            return this.currtypes[1];
        }

        String getPkGlobalCurrtype() {
            return this.currtypes[2];
        }

        public String getRowCurrtype(int row) {
            this.checkRow(row);
            return this.rowCurrtypes[row];
        }

        private void checkRow(int row) {
            if (row < 0 && row > this.length) {
                throw new RuntimeException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0025"));
            }
        }

        public UFDouble getRowRate(int row) {
            this.checkRow(row);
            return this.rowRates[0][row];
        }

        public UFDouble getGroupRate(int row) {
            this.checkRow(row);
            return this.rowRates[1][row];
        }

        public UFDouble getGlobalRate(int row) {
            this.checkRow(row);
            return this.rowRates[2][row];
        }

        RateCalStyle getGroupRateCalStyple() {
            RateCalStyle ret = RateCalStyle.NOT_GROUP_USED;
            if (SysinitConst.NC001_BASE_ORIG.equals(this.sysinits[0])) {
                ret = RateCalStyle.BASE_GROUP_ORI;
            } else if (SysinitConst.NC001_NOT_USED.equals(this.sysinits[0])) {
                ret = RateCalStyle.NOT_GROUP_USED;
            } else if (SysinitConst.NC001_BASE_SUPG.equals(this.sysinits[0])) {
                ret = RateCalStyle.BASE_GROUP_LOCAL;
            }
            return ret;
        }

        RateCalStyle getGlobalRateCalStyple() {
            RateCalStyle ret = RateCalStyle.NOT_GLOBAL_USED;
            if (SysinitConst.NC002_BASE_ORIG.equals(this.sysinits[1])) {
                ret = RateCalStyle.BASE_GLOBAL_ORI;
            } else if (SysinitConst.NC002_NOT_USED.equals(this.sysinits[1])) {
                ret = RateCalStyle.NOT_GLOBAL_USED;
            } else if (SysinitConst.NC002_BASE_SUPG.equals(this.sysinits[1])) {
                ret = RateCalStyle.BASE_GLOBAL_LOCAL;
            }
            return ret;
        }

        boolean getProior() {
            return "1".equals(this.sysinits[3]);
        }

        boolean resetCurrtype(int row) {
            this.checkRow(row);
            return this.resets[0][row];
        }

        boolean resetRate(int row) {
            this.checkRow(row);
            return this.resets[1][row];
        }

        boolean resetGroupRate(int row) {
            this.checkRow(row);
            return this.resets[3][row];
        }

        boolean resetGlobalRate(int row) {
            this.checkRow(row);
            return this.resets[4][row];
        }

        boolean resetQuantity(int row) {
            this.checkRow(row);
            return this.resets[2][row];
        }

        boolean isisInterNational(int row) {
            this.checkRow(row);
            return this.bools[0][row];
        }

        boolean isNeedReCalc(int row) {
            this.checkRow(row);
            return this.bools[1][row];
        }
    }

    class MoneyWrapper {
        UFDouble money = UFDouble.ZERO_DBL;
        UFDouble notaxmoney = UFDouble.ZERO_DBL;
        UFDouble agentmoney = UFDouble.ZERO_DBL;
        UFDouble taxmoney = UFDouble.ZERO_DBL;

        MoneyWrapper() {
        }
    }
}

