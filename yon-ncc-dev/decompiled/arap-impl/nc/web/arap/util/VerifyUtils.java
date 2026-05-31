/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.fi.pub.Currency
 *  nc.vo.arap.verifynew.MethodVO
 *  nc.vo.arap.verifynew.Saver
 *  nc.vo.arap.verifynew.VerifyFilter
 *  nc.vo.bd.currinfo.CurrinfoVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.verifynew.pub.DefaultVerifyRuleVO
 *  nc.vo.verifynew.pub.IDataFilter
 *  nc.vo.verifynew.pub.IDataSave
 *  nc.vo.verifynew.pub.VerifyCom
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.dto.arap.arappub.VerifyRulesVO
 *  nccloud.dto.arap.arappub.info.VerifyFaInfo
 *  nccloud.dto.arap.arappub.info.VerifyInfo
 *  nccloud.pubitf.arap.arappub.IArapBillPubUtilService
 *  nccloud.pubitf.arap.arappub.ICurrencyService
 */
package nc.web.arap.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.fi.pub.Currency;
import nc.vo.arap.agiotage.ArapBusiDataVO;
import nc.vo.arap.global.ArapBillDealVOConsts;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.arap.verifynew.MethodVO;
import nc.vo.arap.verifynew.Saver;
import nc.vo.arap.verifynew.VerifyFilter;
import nc.vo.bd.currinfo.CurrinfoVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.verifynew.pub.ConditionVO;
import nc.vo.verifynew.pub.DefaultVerifyRuleVO;
import nc.vo.verifynew.pub.IDataFilter;
import nc.vo.verifynew.pub.IDataSave;
import nc.vo.verifynew.pub.VerifyCom;
import nc.web.arap.util.ArapUtil;
import nccloud.commons.lang.ArrayUtils;
import nccloud.dto.arap.arappub.VerifyRulesVO;
import nccloud.dto.arap.arappub.info.VerifyFaInfo;
import nccloud.dto.arap.arappub.info.VerifyInfo;
import nccloud.pubitf.arap.arappub.IArapBillPubUtilService;
import nccloud.pubitf.arap.arappub.ICurrencyService;

public class VerifyUtils {
    public static ConditionVO combine(ConditionVO vo, ConditionVO vo2) {
        if (vo == null && vo2 == null) {
            return null;
        }
        if (vo == null) {
            return vo2;
        }
        if (vo2 == null) {
            return vo;
        }
        String[] keys = vo2.getAttributeNames();
        if (keys == null) {
            return vo;
        }
        for (int i = 0; i < keys.length; ++i) {
            Object obj;
            if (keys[i] == null || (obj = vo2.getAttributeValue(keys[i])) == null) continue;
            vo.setAttributeValue(keys[i], obj);
        }
        return vo;
    }

    public static void checkQueryDate(ConditionVO conditionvo) throws BusinessException {
        ConditionVO jfvo = (ConditionVO)((Object)conditionvo.getAttributeValue("jfvo"));
        ConditionVO dfvo = (ConditionVO)((Object)conditionvo.getAttributeValue("dfvo"));
        Object jf_begin = jfvo.getAttributeValue("djrq_begin");
        Object jf_end = jfvo.getAttributeValue("djrq_end");
        Object df_begin = dfvo.getAttributeValue("djrq_begin");
        Object df_end = dfvo.getAttributeValue("djrq_end");
        if (jf_begin == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006ver_0", "02006ver-0348"));
        }
        if (jf_end == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006ver_0", "02006ver-0349"));
        }
        if (df_begin == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006ver_0", "02006ver-0350"));
        }
        if (df_end == null) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006ver_0", "02006ver-0351"));
        }
    }

    public static void setArapFlag(VerifyInfo info) {
        Integer systemCode = null;
        systemCode = info.getArapFlag().equals("ar") ? ArapBillDealVOConsts.INT_ZERO : ArapBillDealVOConsts.INT_ONE;
        info.setSystemCode(systemCode);
        VerifyUtils.initDisplayMode(info);
        VerifyUtils.initHxSeq(info);
    }

    public static Integer initDisplayMode(VerifyInfo info) {
        Integer displayMode = ArapUtil.getDisplayMode(info.getPk_org(), info.getSystemCode());
        info.setDisplayMode(displayMode);
        return displayMode;
    }

    private static void initHxSeq(VerifyInfo info) {
        if (info.getVerifySeq() == null) {
            info.setVerifySeq(ArapUtil.getHxSeq(info.getPk_org(), info.getSystemCode()));
        }
    }

    public static Integer getHxSeq(VerifyFaInfo info) {
        if (info.getVerifySeq() == null) {
            Integer verifySeq = null;
            try {
                String hxSeq = "";
                hxSeq = info.getSystemCode() == 0 ? ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).getParaString(info.getOfternConditionsVO().getPk_org(), "AR1") : (info.getSystemCode() == 1 ? ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).getParaString(info.getOfternConditionsVO().getPk_org(), "AP1") : ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).getParaString(info.getOfternConditionsVO().getPk_org(), "EC1"));
                verifySeq = hxSeq.equals(SysinitConst.VERIFY_ZAO) ? Integer.valueOf(0) : Integer.valueOf(1);
            }
            catch (Exception e) {
                verifySeq = 1;
                ExceptionHandler.consume((Throwable)e);
            }
            info.setVerifySeq(verifySeq);
        }
        return info.getVerifySeq();
    }

    public static void showMoneyByObjtype(ArapBusiDataVO[] vos) {
        if (ArrayUtils.isEmpty((Object[])vos)) {
            return;
        }
        HashMap billmap = new HashMap();
        HashSet<String> objSet = new HashSet<String>();
        for (ArapBusiDataVO vo : vos) {
            String pk_bill = vo.getPk_bill();
            if (billmap.containsKey(pk_bill)) {
                ((List)billmap.get(pk_bill)).add(vo);
                continue;
            }
            ArrayList<ArapBusiDataVO> temp = new ArrayList<ArapBusiDataVO>();
            temp.add(vo);
            billmap.put(pk_bill, temp);
        }
        for (String pk : billmap.keySet()) {
            String objpk;
            Integer objtype;
            objSet.clear();
            HashMap samemap = new HashMap();
            List list = (List)billmap.get(pk);
            for (ArapBusiDataVO vo : list) {
                objtype = vo.getObjtype();
                objpk = "";
                if (objtype == 0) {
                    objpk = vo.getCustomer();
                } else if (objtype == 1) {
                    objpk = vo.getSupplier();
                } else if (objtype == 2) {
                    objpk = vo.getPk_deptid();
                } else if (objtype == 3) {
                    objpk = vo.getPk_psndoc();
                }
                objSet.add(objpk);
                if (samemap.containsKey(vo.getPk_bill() + objpk)) {
                    ((List)samemap.get(vo.getPk_bill() + objpk)).add(vo);
                    continue;
                }
                ArrayList<ArapBusiDataVO> temp = new ArrayList<ArapBusiDataVO>();
                temp.add(vo);
                samemap.put(vo.getPk_bill() + objpk, temp);
            }
            if (objSet.size() <= 1) continue;
            for (ArapBusiDataVO vo : list) {
                objtype = vo.getObjtype();
                objpk = "";
                if (objtype == 0) {
                    objpk = vo.getCustomer();
                } else if (objtype == 1) {
                    objpk = vo.getSupplier();
                } else if (objtype == 2) {
                    objpk = vo.getPk_deptid();
                } else if (objtype == 3) {
                    objpk = vo.getPk_psndoc();
                }
                List list2 = (List)samemap.get(vo.getPk_bill() + objpk);
                Map<String, List<ArapBusiDataVO>> createItemMap = VerifyUtils.createItemMap(list2);
                UFDouble summoney = UFDouble.ZERO_DBL;
                for (String key : createItemMap.keySet()) {
                    List<ArapBusiDataVO> list3 = createItemMap.get(key);
                    summoney = summoney.add(list3.get(0).getSum_itemmoney());
                }
                vo.setSum_headmoney(summoney);
            }
        }
    }

    private static Map<String, List<ArapBusiDataVO>> createItemMap(List<ArapBusiDataVO> list2) {
        HashMap<String, List<ArapBusiDataVO>> itemMap = new HashMap<String, List<ArapBusiDataVO>>();
        for (ArapBusiDataVO vo : list2) {
            if (itemMap.containsKey(vo.getPk_item())) {
                ((List)itemMap.get(vo.getPk_item())).add(vo);
                continue;
            }
            ArrayList<ArapBusiDataVO> temp = new ArrayList<ArapBusiDataVO>();
            temp.add(vo);
            itemMap.put(vo.getPk_item(), temp);
        }
        return itemMap;
    }

    public static boolean isAnDanjv(VerifyInfo info) {
        try {
            return info.getDisplayMode() == 0;
        }
        catch (Exception e) {
            ExceptionHandler.consume((Throwable)e);
            return true;
        }
    }

    public static DefaultVerifyRuleVO[] initRuleVOs(VerifyFaInfo info, boolean isAuto) {
        int i;
        DefaultVerifyRuleVO[] rule = VerifyUtils.getRuleVOs(info.getVerifyRulesVO(), info.getArapFlag().equals("ar") ? 0 : 1);
        if (!isAuto) {
            for (i = 0; i < rule.length; ++i) {
                if (rule[i] == null) continue;
                rule[i].setM_isStrictMatch(new Boolean(false));
            }
        } else {
            String[] modes = info.getVerifyModeVO().getSeltVerifyMode(info.getVerifyModeVO()).toArray(new String[0]);
            for (int i2 = 0; i2 < rule.length; ++i2) {
                if (rule[i2] == null) continue;
                rule[i2].setM_isStrictMatch(new Boolean(true));
                rule[i2].setM_debtObjKeys(modes);
                rule[i2].setM_creditObjKeys(modes);
            }
        }
        for (i = 0; i < rule.length; ++i) {
            if (rule[i] == null) continue;
            String pk_org = info.getOfternConditionsVO().getPk_org();
            try {
                rule[i].setM_bbpk(((ICurrencyService)NCLocator.getInstance().lookup(ICurrencyService.class)).getOrgLocalCurrPK(pk_org));
            }
            catch (BusinessException e) {
                ExceptionHandler.handleRuntimeException((Exception)((Object)e));
            }
            rule[i].setPk_org(pk_org);
            rule[i].setM_verifySeq(VerifyUtils.getHxSeq(info));
            rule[i].setM_verifyMode(VerifyUtils.initDisplayMode((VerifyInfo)info));
        }
        return rule;
    }

    public static MethodVO[] getMethods() throws BusinessException {
        Vector<MethodVO> temp = new Vector<MethodVO>();
        MethodVO vo = new MethodVO();
        vo.setFa("RED_BLUE");
        vo.setImplname("nc.vo.arap.verify.RBVerify");
        vo.setCheck_class("nccloud.pubimpl.arap.verificationsheet.RBDataChecker");
        temp.add(vo);
        MethodVO vo1 = new MethodVO();
        vo1.setFa("SAME_VERIFY");
        vo1.setImplname("nc.vo.arap.verify.SameMnyVerify");
        vo1.setCheck_class("nccloud.pubimpl.arap.verificationsheet.SameDataChecker");
        temp.add(vo1);
        MethodVO vo2 = new MethodVO();
        vo2.setFa("UN_SAME_VERIFY");
        vo2.setImplname("nc.vo.arap.verify.UnsameMnyVerify");
        vo2.setCheck_class("nccloud.pubimpl.arap.verificationsheet.UnsameDataChecker");
        temp.add(vo2);
        return temp.toArray(new MethodVO[0]);
    }

    public static VerifyCom getCom() {
        return new VerifyCom((IDataFilter)new VerifyFilter(), (IDataSave)new Saver(), null);
    }

    public static void refreshBusiDate(VerifyCom com) {
        Hashtable ruleTable = com.getM_rule();
        Hashtable<String, DefaultVerifyRuleVO> newRuleTable = new Hashtable<String, DefaultVerifyRuleVO>();
        for (String key : ruleTable.keySet()) {
            DefaultVerifyRuleVO ruleVO = (DefaultVerifyRuleVO)ruleTable.get(key);
            ruleVO.setM_Clrq(new UFDate(InvocationInfoProxy.getInstance().getBizDateTime()));
            newRuleTable.put(key, ruleVO);
        }
        com.setM_rule(newRuleTable);
    }

    public static DefaultVerifyRuleVO[] getRuleVOs(VerifyRulesVO hxgzvo, Integer m_system) {
        DefaultVerifyRuleVO[] result = new DefaultVerifyRuleVO[]{new DefaultVerifyRuleVO(), new DefaultVerifyRuleVO(), new DefaultVerifyRuleVO()};
        String hxbz_pk = hxgzvo.getHxbzRef();
        String jf_bzpk = hxgzvo.getJfbzRef();
        String df_bzpk = hxgzvo.getDfbzRef();
        String jf_bz = jf_bzpk != null ? jf_bzpk : hxbz_pk;
        String df_bz = df_bzpk != null ? df_bzpk : hxbz_pk;
        for (int i = 0; i < 3; ++i) {
            result[i].setSystem(m_system);
            result[i].setM_Clrq(new UFDate(InvocationInfoProxy.getInstance().getBizDateTime()));
            result[i].setM_clr(InvocationInfoProxy.getInstance().getUserId());
            result[i].setM_debitCurr(jf_bz);
            result[i].setM_creditCurr(df_bz);
            result[i].setM_verifyCurr(hxbz_pk);
            Integer jfbzjd = 2;
            Integer dfbzjd = 2;
            String jfbz = "";
            String dfbz = "";
            jfbz = hxbz_pk;
            dfbz = hxbz_pk;
            jfbzjd = VerifyUtils.getBzjd(jfbz);
            dfbzjd = VerifyUtils.getBzjd(dfbz);
            result[i].setM_debitMnyPrecision(jfbzjd);
            result[i].setM_creditMnyPrecision(dfbzjd);
            if (i == 0 || i == 1) {
                // empty if block
            }
            if (i == 0) {
                result[i].setM_verifyName("RED_BLUE");
                continue;
            }
            if (i == 1) {
                result[i].setM_verifyName("SAME_VERIFY");
                continue;
            }
            if (i != 2) continue;
            result[i].setM_verifyName("UN_SAME_VERIFY");
            result[2].setM_debttoBBExchange_rate(new UFDouble(hxgzvo.getJfbz_dbbhlTxtF()));
            result[2].setM_creditoBBExchange_rate(new UFDouble(hxgzvo.getDfbz_dbbhlTxtF()));
            result[2].setM_verifyCurr(hxgzvo.getZjbzRef());
            result[2].setM_verifyCurrPrecision(Integer.valueOf(Currency.getCurrDigit((String)hxgzvo.getZjbzRef())));
            result[2].setM_jfbz2zjbzHL(new UFDouble(hxgzvo.getJfbz_dzjbzhlTxtF()));
            result[2].setM_dfbz2zjbzHL(new UFDouble(hxgzvo.getDfbz_dzjbzhlTxtF()));
            result[2].setM_maxError(new UFDouble(hxgzvo.getYxwcTxtF() == null ? "0" : hxgzvo.getYxwcTxtF()));
        }
        if (!hxgzvo.getHldcChkBox().booleanValue()) {
            result[0] = null;
        }
        if (hxgzvo.getTbzhxChkBox() == null || !hxgzvo.getTbzhxChkBox().booleanValue()) {
            result[1] = null;
        }
        if (hxgzvo.getYbzhxChkBox() == null || !hxgzvo.getYbzhxChkBox().booleanValue()) {
            result[2] = null;
        }
        return result;
    }

    private static int getBzjd(String bzpk) {
        try {
            return ((ICurrencyService)NCLocator.getInstance().lookup(ICurrencyService.class)).getCurrDigit(bzpk);
        }
        catch (Exception e) {
            ExceptionHandler.consume((Throwable)e);
            return 2;
        }
    }

    public static boolean isJieFang(ArapBusiDataVO vo) {
        if (vo == null) {
            return false;
        }
        try {
            return Integer.valueOf(vo.getAttributeValue("direction").toString()) == 1;
        }
        catch (Exception e) {
            ExceptionHandler.consume((Throwable)e);
            return false;
        }
    }

    public static UFDouble bzHuansuanYB2ZB(String pk_org, String zbpk, UFDouble jsyb, UFDouble zbhl, String ybpk) {
        UFDouble jszb = new UFDouble(0);
        try {
            CurrinfoVO currinfoVO = Currency.getCurrRateInfo((String)pk_org, (String)ybpk, (String)zbpk);
            jszb = currinfoVO == null || currinfoVO.getConvmode() == 0 ? jsyb.multiply(zbhl, Currency.getCurrDigit((String)zbpk)) : jsyb.div(zbhl, Currency.getCurrDigit((String)zbpk));
        }
        catch (Exception e) {
            ExceptionHandler.consume((Throwable)e);
        }
        return jszb;
    }

    public static UFDouble bzHuansuanZB2YB(String pk_org, String zbpk, UFDouble jszb, UFDouble hl, String ybpk) {
        UFDouble jsyb = new UFDouble(0);
        try {
            CurrinfoVO currinfoVO = Currency.getCurrRateInfo((String)pk_org, (String)ybpk, (String)zbpk);
            jsyb = currinfoVO == null || currinfoVO.getConvmode() == 0 ? jszb.div(hl, Currency.getCurrDigit((String)ybpk)) : jszb.multiply(hl, Currency.getCurrDigit((String)ybpk));
        }
        catch (Exception e) {
            ExceptionHandler.consume((Throwable)e);
        }
        return jsyb;
    }

    public static Map<String, String> transpkts2map(String linkedPkTs) {
        String[] arr;
        HashMap<String, String> map = new HashMap<String, String>();
        for (String pk_ts : arr = linkedPkTs.split(",")) {
            String[] split = pk_ts.split("_");
            String pk = split[0];
            String ts = split[1];
            map.put(pk, ts);
        }
        return map;
    }
}

