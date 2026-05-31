/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  nc.itf.fi.pub.Currency
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.arap.util;

import nc.bs.logging.Logger;
import nc.itf.fi.pub.Currency;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nccloud.commons.lang.ArrayUtils;

public final class BillMoneyVUtils {
    public static void sumBodyToHead(BaseBillVO head, BaseItemVO[] items) {
        UFDouble global_money = ArapConstant.DOUBLE_ZERO;
        UFDouble group_money = ArapConstant.DOUBLE_ZERO;
        UFDouble local_money = ArapConstant.DOUBLE_ZERO;
        UFDouble money = ArapConstant.DOUBLE_ZERO;
        UFDouble globalnotax = UFDouble.ZERO_DBL;
        UFDouble grouptax = UFDouble.ZERO_DBL;
        UFDouble globaltax = UFDouble.ZERO_DBL;
        UFDouble groupnotax = UFDouble.ZERO_DBL;
        if (head.getPk_billtype().equals("F0") || head.getPk_billtype().equals("F3") || head.getPk_billtype().equals("23E0")) {
            for (BaseItemVO item : items) {
                global_money = global_money.add(item.getGlobaldebit() == null ? ArapConstant.DOUBLE_ZERO : item.getGlobaldebit());
                group_money = group_money.add(item.getGroupdebit() == null ? ArapConstant.DOUBLE_ZERO : item.getGroupdebit());
                local_money = local_money.add(item.getLocal_money_de() == null ? ArapConstant.DOUBLE_ZERO : item.getLocal_money_de());
                money = money.add(item.getMoney_de() == null ? ArapConstant.DOUBLE_ZERO : item.getMoney_de());
                globaltax = local_money.add(item.getGlobaltax_de() == null ? ArapConstant.DOUBLE_ZERO : item.getGlobaltax_de());
                globalnotax = global_money.add(item.getGlobalnotax_de() == null ? ArapConstant.DOUBLE_ZERO : item.getGlobalnotax_de());
                grouptax = group_money.add(item.getGrouptax_de() == null ? ArapConstant.DOUBLE_ZERO : item.getGrouptax_de());
                groupnotax = money.add(item.getGroupnotax_de() == null ? ArapConstant.DOUBLE_ZERO : item.getGroupnotax_de());
                item.setDirection(BillEnumCollection.Direction.DEBIT.VALUE);
            }
        } else {
            for (BaseItemVO item : items) {
                global_money = global_money.add(item.getGlobalcrebit() == null ? ArapConstant.DOUBLE_ZERO : item.getGlobalcrebit());
                group_money = group_money.add(item.getGroupcrebit() == null ? ArapConstant.DOUBLE_ZERO : item.getGroupcrebit());
                local_money = local_money.add(item.getLocal_money_cr() == null ? ArapConstant.DOUBLE_ZERO : item.getLocal_money_cr());
                money = money.add(item.getMoney_cr() == null ? ArapConstant.DOUBLE_ZERO : item.getMoney_cr());
                globaltax = local_money.add(item.getGlobaltax_cre() == null ? ArapConstant.DOUBLE_ZERO : item.getGlobaltax_cre());
                globalnotax = global_money.add(item.getGlobalnotax_cre() == null ? ArapConstant.DOUBLE_ZERO : item.getGlobalnotax_cre());
                grouptax = group_money.add(item.getGrouptax_cre() == null ? ArapConstant.DOUBLE_ZERO : item.getGrouptax_cre());
                groupnotax = money.add(item.getGroupnotax_cre() == null ? ArapConstant.DOUBLE_ZERO : item.getGroupnotax_cre());
                item.setDirection(BillEnumCollection.Direction.CREDIT.VALUE);
            }
        }
        money = Currency.getFormaUfValue((String)((String)head.getAttributeValue("pk_currtype")), (UFDouble)money);
        try {
            local_money = Currency.getFormaUfValueByOrg((String)head.getPk_org(), (UFDouble)local_money);
        }
        catch (BusinessException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        head.setGloballocal(global_money);
        head.setGrouplocal(group_money);
        head.setLocal_money(local_money);
        head.setMoney(money);
        head.setGlobaltax(globaltax);
        head.setGrouptax(grouptax);
        head.setGlobalnotax(globalnotax);
        head.setGroupnotax(groupnotax);
    }

    public static void sumAllVoBodyToHead(AggregatedValueObject[] bills) {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        for (AggregatedValueObject bill : bills) {
            BillMoneyVUtils.sumBodyToHead((BaseBillVO)bill.getParentVO(), (BaseItemVO[])bill.getChildrenVO());
        }
    }
}

