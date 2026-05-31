/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.fi.pub.Currency
 *  nc.itf.fi.pub.SysInit
 *  nc.vo.bd.rate.util.RateReturnObject
 *  nc.vo.pm.util.CollectionUtils
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nccloud.pubitf.arap.arappub.IArapRatePubService
 *  nccloud.pubitf.arap.arappub.ICurrencyService
 */
package nc.bs.arap.bill;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.fi.pub.Currency;
import nc.itf.fi.pub.SysInit;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.pub.RateTypeInfoVO;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.arap.termitem.TermVO;
import nc.vo.arap.utils.StringUtil;
import nc.vo.bd.rate.util.RateReturnObject;
import nc.vo.pm.util.CollectionUtils;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nccloud.pubitf.arap.arappub.IArapRatePubService;
import nccloud.pubitf.arap.arappub.ICurrencyService;

public class ArapBillCalUtil {
    public static void processBillScale(AggregatedValueObject bill) {
        if (null == bill) {
            return;
        }
        String[] headMoneyKeys = new String[]{"money"};
        String[] headLocalMoneyKeys = new String[]{"local_money"};
        String[] headGroupMoneyKeys = new String[]{"grouplocal"};
        String[] headGlobalMoneyKeys = new String[]{"grouplocal"};
        String[] itemMoneyKeys = new String[]{"money_de", "money_cr", "money_bal", "notax_cr", "notax_de"};
        String[] itemLocalMoneyKeys = new String[]{"local_money_de", "local_money_cr", "local_money_bal", "local_tax_cr", "local_tax_de", "local_notax_cr", "local_notax_de", "caltaxmny"};
        String[] itemGroupMoneyKeys = new String[]{"groupdebit", "groupcrebit", "grouptax_de", "grouptax_cre", "groupnotax_de", "grouptax_cre"};
        String[] itemGlobalMoneyKeys = new String[]{"globaldebit", "globalcrebit", "globaltax_de", "globaltax_cre", "globalnotax_de", "globalnotax_cre"};
        try {
            CircularlyAccessibleValueObject head = bill.getParentVO();
            if (null != head) {
                String global_currtype;
                String pk_org = (String)head.getAttributeValue("pk_org");
                String pk_group = (String)head.getAttributeValue("pk_group");
                String pk_currtype = (String)head.getAttributeValue("pk_currtype");
                String local_currtype = Currency.getOrgLocalCurrPK((String)pk_org);
                int digit = Currency.getCurrDigit((String)pk_currtype);
                int local_digit = Currency.getCurrDigit((String)local_currtype);
                for (String key : headMoneyKeys) {
                    ArapBillCalUtil.chgFieldDigit(head, key, digit);
                }
                for (String key : headLocalMoneyKeys) {
                    ArapBillCalUtil.chgFieldDigit(head, key, local_digit);
                }
                String group_currtype = Currency.getOrgLocalCurrPK((String)pk_group);
                if (null != group_currtype) {
                    int group_digit = Currency.getCurrDigit((String)group_currtype);
                    for (String key : headGroupMoneyKeys) {
                        ArapBillCalUtil.chgFieldDigit(head, key, group_digit);
                    }
                }
                if (null != (global_currtype = Currency.getOrgLocalCurrPK((String)"GLOBLE00000000000000"))) {
                    int global_digit = Currency.getCurrDigit((String)global_currtype);
                    for (String key : headGlobalMoneyKeys) {
                        ArapBillCalUtil.chgFieldDigit(head, key, global_digit);
                    }
                }
            }
            HashMap<String, Integer> digitMap = new HashMap<String, Integer>();
            CircularlyAccessibleValueObject[] items = bill.getChildrenVO();
            int global_digit = 0;
            int group_digit = 0;
            String global_currtype = Currency.getOrgLocalCurrPK((String)"GLOBLE00000000000000");
            String pk_org = (String)head.getAttributeValue("pk_org");
            String pk_group = (String)head.getAttributeValue("pk_group");
            String local_currtype = Currency.getOrgLocalCurrPK((String)pk_org);
            String group_currtype = Currency.getOrgLocalCurrPK((String)pk_group);
            int local_digit = Currency.getCurrDigit((String)local_currtype);
            if (null != global_currtype) {
                global_digit = Currency.getCurrDigit((String)global_currtype);
            }
            if (null != group_currtype) {
                group_digit = Currency.getCurrDigit((String)group_currtype);
            }
            for (CircularlyAccessibleValueObject item : items) {
                String pk_currtype = (String)item.getAttributeValue("pk_currtype");
                Integer dig = (Integer)digitMap.get(pk_currtype);
                if (dig == null) {
                    dig = Currency.getCurrDigit((String)pk_currtype);
                    digitMap.put(pk_currtype, dig);
                }
                for (String key : itemMoneyKeys) {
                    ArapBillCalUtil.chgFieldDigit(item, key, dig);
                }
                for (String key : itemLocalMoneyKeys) {
                    ArapBillCalUtil.chgFieldDigit(item, key, local_digit);
                }
                if (null != group_currtype) {
                    for (String key : itemGroupMoneyKeys) {
                        ArapBillCalUtil.chgFieldDigit(item, key, group_digit);
                    }
                }
                if (null == global_currtype) continue;
                for (String key : itemGlobalMoneyKeys) {
                    ArapBillCalUtil.chgFieldDigit(item, key, global_digit);
                }
            }
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
        }
    }

    public static void processItemScale(BaseItemVO[] items) {
        if (null == items || items.length == 0) {
            return;
        }
        String[] itemMoneyKeys = new String[]{"money_de", "money_cr", "money_bal", "notax_cr", "notax_de"};
        String[] itemLocalMoneyKeys = new String[]{"local_money_de", "local_money_cr", "local_money_bal", "local_tax_cr", "local_tax_de", "local_notax_cr", "local_notax_de", "caltaxmny"};
        String[] itemGroupMoneyKeys = new String[]{"groupdebit", "groupcrebit", "grouptax_de", "grouptax_cre", "groupnotax_de", "grouptax_cre"};
        String[] itemGlobalMoneyKeys = new String[]{"globaldebit", "globalcrebit", "globaltax_de", "globaltax_cre", "globalnotax_de", "globalnotax_cre"};
        try {
            for (BaseItemVO item : items) {
                String global_currtype;
                String pk_org = (String)item.getAttributeValue("pk_org");
                String pk_group = (String)item.getAttributeValue("pk_group");
                String pk_currtype = (String)item.getAttributeValue("pk_currtype");
                String local_currtype = Currency.getOrgLocalCurrPK((String)pk_org);
                int digit = Currency.getCurrDigit((String)pk_currtype);
                int local_digit = Currency.getCurrDigit((String)local_currtype);
                for (String key : itemMoneyKeys) {
                    ArapBillCalUtil.chgFieldDigitBody(item, key, digit);
                }
                for (String key : itemLocalMoneyKeys) {
                    ArapBillCalUtil.chgFieldDigitBody(item, key, local_digit);
                }
                String group_currtype = Currency.getOrgLocalCurrPK((String)pk_group);
                if (null != group_currtype) {
                    int group_digit = Currency.getCurrDigit((String)group_currtype);
                    for (String key : itemGroupMoneyKeys) {
                        ArapBillCalUtil.chgFieldDigitBody(item, key, group_digit);
                    }
                }
                if (null == (global_currtype = Currency.getOrgLocalCurrPK((String)"GLOBLE00000000000000"))) continue;
                int global_digit = Currency.getCurrDigit((String)global_currtype);
                for (String key : itemGlobalMoneyKeys) {
                    ArapBillCalUtil.chgFieldDigitBody(item, key, global_digit);
                }
            }
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
        }
    }

    public static void processTermmScale(List<TermVO> vos) {
        if (CollectionUtils.isEmpty(vos)) {
            return;
        }
        String[] itemMoneyKeys = new String[]{"money_de", "money_cr", "money_bal", "notax_cr", "notax_de"};
        String[] itemLocalMoneyKeys = new String[]{"local_money_de", "local_money_cr", "local_money_bal", "local_tax_cr", "local_tax_de", "local_notax_cr", "local_notax_de", "caltaxmny"};
        String[] itemGroupMoneyKeys = new String[]{"groupdebit", "groupcrebit", "grouptax_de", "grouptax_cre", "groupnotax_de", "grouptax_cre"};
        String[] itemGlobalMoneyKeys = new String[]{"globaldebit", "globalcrebit", "globaltax_de", "globaltax_cre", "globalnotax_de", "globalnotax_cre"};
        try {
            for (TermVO item : vos) {
                String global_currtype;
                String pk_org = (String)item.getAttributeValue("pk_org");
                String pk_group = (String)item.getAttributeValue("pk_group");
                String pk_currtype = (String)item.getAttributeValue("pk_currtype");
                String local_currtype = Currency.getOrgLocalCurrPK((String)pk_org);
                int digit = Currency.getCurrDigit((String)pk_currtype);
                int local_digit = Currency.getCurrDigit((String)local_currtype);
                for (String key : itemMoneyKeys) {
                    ArapBillCalUtil.chgFieldDigitBody(item, key, digit);
                }
                for (String key : itemLocalMoneyKeys) {
                    ArapBillCalUtil.chgFieldDigitBody(item, key, local_digit);
                }
                String group_currtype = Currency.getOrgLocalCurrPK((String)pk_group);
                if (null != group_currtype) {
                    int group_digit = Currency.getCurrDigit((String)group_currtype);
                    for (String key : itemGroupMoneyKeys) {
                        ArapBillCalUtil.chgFieldDigitBody(item, key, group_digit);
                    }
                }
                if (null == (global_currtype = Currency.getOrgLocalCurrPK((String)"GLOBLE00000000000000"))) continue;
                int global_digit = Currency.getCurrDigit((String)global_currtype);
                for (String key : itemGlobalMoneyKeys) {
                    ArapBillCalUtil.chgFieldDigitBody(item, key, global_digit);
                }
            }
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
        }
    }

    private static void chgFieldDigitBody(BaseItemVO item, String key, int digit) {
        Object mny = item.getAttributeValue(key);
        if (null != mny) {
            UFDouble newMny = new UFDouble(mny.toString(), digit);
            item.setAttributeValue2(key, newMny);
        }
    }

    private static void chgFieldDigitBody(TermVO item, String key, int digit) {
        Object mny = item.getAttributeValue(key);
        if (null != mny) {
            UFDouble newMny = new UFDouble(mny.toString(), digit);
            item.setAttributeValue(key, newMny);
        }
    }

    private static void chgFieldDigit(CircularlyAccessibleValueObject head, String key, int digit) {
        Object mny = head.getAttributeValue(key);
        if (null != mny) {
            UFDouble newMny = new UFDouble(mny.toString(), digit);
            head.setAttributeValue(key, (Object)newMny);
        }
    }

    public static UFDouble[] getRate(String pk_currtype, String pk_org, String pk_group, UFDate date, String pk_billtype) {
        UFDouble[] rates = new UFDouble[3];
        try {
            rates[0] = ArapBillCalUtil.getOrgRate(pk_currtype, pk_group, pk_org, date, pk_billtype);
            rates[1] = ArapBillCalUtil.getGroupRate(pk_currtype, pk_group, pk_org, date, pk_billtype);
            rates[2] = ArapBillCalUtil.getGlobalRate(pk_currtype, pk_group, pk_org, date, pk_billtype);
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
        }
        return rates;
    }

    public static UFDouble[] getRate(String pk_currtype, String pk_org, String pk_group, UFDate date, String pk_billtype, String pk_rateType, Integer object, String[] cusp) {
        UFDouble[] rates = new UFDouble[3];
        try {
            rates[0] = ArapBillCalUtil.getOrgRate(pk_currtype, pk_group, pk_org, date, pk_billtype, pk_rateType, object, cusp);
            rates[1] = ArapBillCalUtil.getGroupRate(pk_currtype, pk_group, pk_org, date, pk_billtype);
            rates[2] = ArapBillCalUtil.getGlobalRate(pk_currtype, pk_group, pk_org, date, pk_billtype);
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
        }
        return rates;
    }

    public static Map<String, UFDouble[]> getRate(String[] pk_currtypes, String pk_org, String pk_group, UFDate date, String pk_billtype) {
        HashMap<String, UFDouble[]> currtypeMap = new HashMap<String, UFDouble[]>();
        try {
            for (String pk_currtype : pk_currtypes) {
                UFDouble[] rates = new UFDouble[]{ArapBillCalUtil.getOrgRate(pk_currtype, pk_group, pk_org, date, pk_billtype), ArapBillCalUtil.getGroupRate(pk_currtype, pk_group, pk_org, date, pk_billtype), ArapBillCalUtil.getGlobalRate(pk_currtype, pk_group, pk_org, date, pk_billtype)};
                currtypeMap.put(pk_currtype, rates);
            }
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
        }
        return currtypeMap;
    }

    public static int[] getRateDigits(String pk_currtype, String pk_org, String pk_group, UFDate date, String pk_billtype) {
        int[] digits = new int[3];
        try {
            digits[0] = ArapBillCalUtil.getOrgRateDigit(pk_currtype, pk_group, pk_org, date, pk_billtype);
            digits[1] = ArapBillCalUtil.getGroupRateDigit(pk_currtype, pk_group, pk_org, date, pk_billtype);
            digits[2] = ArapBillCalUtil.getGlobalRateDigit(pk_currtype, pk_org, date);
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
        }
        return digits;
    }

    public static UFDouble getOrgRate(String pk_currtype, String pk_group, String pk_org, UFDate date, String pk_billtype) throws BusinessException {
        int rateType = ArapBillCalUtil.getRateType(pk_billtype, pk_group);
        UFDouble outrate = Currency.getRate((String)pk_org, (String)pk_currtype, (UFDate)date, (int)rateType);
        return outrate == null ? UFDouble.ZERO_DBL : outrate;
    }

    public static UFDouble getOrgRate(String pk_currtype, String pk_group, String pk_org, UFDate date, String pk_billtype, String pk_rateType, Integer object, String[] cusp) throws BusinessException {
        if (StringUtil.isEmptyWithTrim(pk_currtype)) {
            Logger.info((Object)" Currtype is null ");
            return UFDouble.ONE_DBL;
        }
        String orgLocalCurrPK = ((ICurrencyService)NCLocator.getInstance().lookup(ICurrencyService.class)).getOrgLocalCurrPK(pk_org);
        if (pk_currtype.equals(orgLocalCurrPK)) {
            return UFDouble.ONE_DBL;
        }
        if (!StringUtil.isEmptyWithTrim(pk_rateType)) {
            Map rateDate = ((IArapRatePubService)NCLocator.getInstance().lookup(IArapRatePubService.class)).getRateDate(pk_rateType, pk_currtype, pk_org, date);
            UFDouble outrate = rateDate.values() == null ? UFDouble.ZERO_DBL : rateDate.values().toArray(new UFDouble[0])[0];
            return outrate == null ? UFDouble.ZERO_DBL : outrate;
        }
        String key = null;
        if (BillEnumCollection.ObjType.SUPPLIER.VALUE == object) {
            key = "supplier";
        } else if (BillEnumCollection.ObjType.CUSTOMER.VALUE == object) {
            key = "customer";
        }
        RateTypeInfoVO vo = new RateTypeInfoVO();
        vo.setPk_org(pk_org);
        vo.setSrc_pk_currtype(pk_currtype);
        vo.setPk_billtype(pk_billtype);
        vo.setBilldate(date);
        vo.setCustomer(cusp[0]);
        vo.setSupplier(cusp[1]);
        vo.setPk_rateType(null);
        vo.setEditKey(key);
        RateReturnObject rateVOByCuSp = ((IArapRatePubService)NCLocator.getInstance().lookup(IArapRatePubService.class)).getRateVoByArapInfoVo(vo);
        return rateVOByCuSp == null ? UFDouble.ZERO_DBL : rateVOByCuSp.getRate();
    }

    public static UFDouble getGroupRate(String pk_currtype, String pk_group, String pk_org, UFDate date, String pk_billtype) throws BusinessException {
        if (null == Currency.getOrgLocalCurrPK((String)pk_group)) {
            return UFDouble.ZERO_DBL;
        }
        String NC001 = SysInit.getParaString((String)pk_group, (String)"NC001");
        if (SysinitConst.NC001_NOT_USED.equals(NC001)) {
            return UFDouble.ZERO_DBL;
        }
        int rateType = ArapBillCalUtil.getRateType(pk_billtype, pk_group);
        if (SysinitConst.NC001_BASE_ORIG.equals(NC001)) {
            UFDouble outrate = Currency.getRate((String)pk_group, (String)pk_currtype, (UFDate)date, (int)rateType);
            return outrate == null ? UFDouble.ZERO_DBL : outrate;
        }
        UFDouble outrate = Currency.getRate((String)pk_group, (String)Currency.getOrgLocalCurrPK((String)pk_org), (UFDate)date, (int)rateType);
        return outrate == null ? UFDouble.ZERO_DBL : outrate;
    }

    public static UFDouble getGlobalRate(String pk_currtype, String pk_group, String pk_org, UFDate date, String pk_billtype) throws BusinessException {
        if (null == Currency.getOrgLocalCurrPK((String)"GLOBLE00000000000000")) {
            return UFDouble.ZERO_DBL;
        }
        String NC002 = SysInit.getParaString((String)"GLOBLE00000000000000", (String)"NC002");
        if (SysinitConst.NC002_NOT_USED.equals(NC002)) {
            return UFDouble.ZERO_DBL;
        }
        int rateType = ArapBillCalUtil.getRateType(pk_billtype, pk_group);
        if (SysinitConst.NC002_BASE_ORIG.equals(NC002)) {
            UFDouble outrate = Currency.getRate((String)"GLOBLE00000000000000", (String)pk_currtype, (UFDate)date, (int)rateType);
            return outrate == null ? UFDouble.ZERO_DBL : outrate;
        }
        UFDouble outrate = Currency.getRate((String)"GLOBLE00000000000000", (String)Currency.getOrgLocalCurrPK((String)pk_org), (UFDate)date, (int)rateType);
        return outrate == null ? UFDouble.ZERO_DBL : outrate;
    }

    public static int getOrgRateDigit(String pk_currtype, String pk_group, String pk_org, UFDate date, String pk_billtype) throws BusinessException {
        if (null == pk_currtype || null == pk_org) {
            return 8;
        }
        String oppCurrtype = Currency.getOrgLocalCurrPK((String)pk_org);
        int digit = Currency.getRateDigit((String)pk_org, (String)pk_currtype, (String)oppCurrtype);
        return digit;
    }

    public static int getGroupRateDigit(String pk_currtype, String pk_group, String pk_org, UFDate date, String pk_billtype) throws BusinessException {
        if (null == pk_currtype || null == pk_group || null == pk_org) {
            return 8;
        }
        if (null == Currency.getOrgLocalCurrPK((String)pk_group)) {
            return 8;
        }
        String NC001 = SysInit.getParaString((String)pk_group, (String)"NC001");
        if (SysinitConst.NC001_NOT_USED.equals(NC001)) {
            return 8;
        }
        if (SysinitConst.NC001_BASE_ORIG.equals(NC001)) {
            return Currency.getRateDigit((String)pk_group, (String)pk_currtype, (String)Currency.getOrgLocalCurrPK((String)pk_group));
        }
        return Currency.getRateDigit((String)pk_group, (String)Currency.getOrgLocalCurrPK((String)pk_org), (String)Currency.getOrgLocalCurrPK((String)pk_group));
    }

    public static int getGlobalRateDigit(String pk_currtype, String pk_org, UFDate date) throws BusinessException {
        if (null == pk_currtype || null == pk_org) {
            return 8;
        }
        if (null == Currency.getOrgLocalCurrPK((String)"GLOBLE00000000000000")) {
            return 8;
        }
        String NC002 = SysInit.getParaString((String)"GLOBLE00000000000000", (String)"NC002");
        if (SysinitConst.NC002_NOT_USED.equals(NC002)) {
            return 8;
        }
        if (SysinitConst.NC002_BASE_ORIG.equals(NC002)) {
            return Currency.getRateDigit((String)"GLOBLE00000000000000", (String)pk_currtype, (String)Currency.getOrgLocalCurrPK((String)"GLOBLE00000000000000"));
        }
        return Currency.getRateDigit((String)"GLOBLE00000000000000", (String)Currency.getOrgLocalCurrPK((String)pk_org), (String)Currency.getOrgLocalCurrPK((String)"GLOBLE00000000000000"));
    }

    public static int getRateType(String pk_billtype, String pk_group) throws BusinessException {
        String ratePara = SysInit.getParaString((String)pk_group, (String)"BD001");
        int rateType = 0;
        rateType = SysinitConst.BD001_MIDDLE.equals(ratePara) ? 0 : ("F0".equals(pk_billtype) || "F2".equals(pk_billtype) || "BDR".equals(pk_billtype) || "BDL".equals(pk_billtype) ? 1 : 2);
        return rateType;
    }

    public static boolean isUseGlobalMoney() {
        String NC002 = null;
        try {
            NC002 = SysInit.getParaString((String)"GLOBLE00000000000000", (String)"NC002");
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
        }
        return !SysinitConst.NC002_NOT_USED.equals(NC002);
    }

    public static boolean isUseGroupMoney(String pk_group) {
        String NC001 = null;
        try {
            NC001 = SysInit.getParaString((String)pk_group, (String)"NC001");
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
        }
        return !SysinitConst.NC001_NOT_USED.equals(NC001);
    }

    public static boolean isOrigCurToGlobalMoney() {
        String NC002 = null;
        try {
            NC002 = SysInit.getParaString((String)"GLOBLE00000000000000", (String)"NC002");
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
        }
        if (SysinitConst.NC002_NOT_USED.equals(NC002)) {
            return true;
        }
        return SysinitConst.NC002_BASE_ORIG.equals(NC002);
    }

    public static boolean isOrigCurToGroupMoney(String pk_group) {
        String NC001 = null;
        try {
            NC001 = SysInit.getParaString((String)pk_group, (String)"NC001");
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
        }
        if (SysinitConst.NC001_NOT_USED.equals(NC001)) {
            return true;
        }
        return SysinitConst.NC001_BASE_ORIG.equals(NC001);
    }
}

