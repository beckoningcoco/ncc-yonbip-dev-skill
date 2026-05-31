/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillCalUtil
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.fi.pub.SysInit
 *  nc.md.model.impl.MDEnum
 *  nc.pubitf.uapbd.CurrencyRateUtil
 *  nc.pubitf.uapbd.IRateTypePubService
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.arap.pub.RateTypeInfoVO
 *  nc.vo.arap.pub.TransferInfo
 *  nc.vo.arap.sysinit.SysinitConst
 *  nc.vo.arap.utils.StringUtil
 *  nc.vo.bd.rate.util.RateReturnObject
 *  nc.vo.bd.ratetype.RateTypeVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.lang.UFLiteralDate
 *  nc.vo.ratetype.CategoryEnum
 *  nccloud.pubitf.arap.arappub.IArapRatePubService
 *  nccloud.pubitf.arap.arappub.ICurrencyService
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.bill.ArapBillCalUtil;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.fi.pub.SysInit;
import nc.md.model.impl.MDEnum;
import nc.pubitf.uapbd.CurrencyRateUtil;
import nc.pubitf.uapbd.IRateTypePubService;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.RateTypeInfoVO;
import nc.vo.arap.pub.TransferInfo;
import nc.vo.arap.sysinit.SysinitConst;
import nc.vo.arap.utils.StringUtil;
import nc.vo.bd.rate.util.RateReturnObject;
import nc.vo.bd.ratetype.RateTypeVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.lang.UFLiteralDate;
import nc.vo.ratetype.CategoryEnum;
import nccloud.pubitf.arap.arappub.IArapRatePubService;
import nccloud.pubitf.arap.arappub.ICurrencyService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;

public class ArapRatePubServiceImpl
implements IArapRatePubService {
    public Map<String, Integer> getReatTypeBypks(String[] pks) throws BusinessException {
        Object[] vos = this.getRateVOs(pks);
        HashMap<String, Integer> retMap = new HashMap<String, Integer>();
        if (ArrayUtils.isEmpty((Object[])vos)) {
            return retMap;
        }
        for (Object vo : vos) {
            String pk = vo.getPk_ratetype();
            Integer rateType = vo.getRate_category();
            retMap.put(pk, rateType);
        }
        return retMap;
    }

    public Map<String, RateTypeVO> getRateVOBypks(String[] pks) throws BusinessException {
        Object[] vos = this.getRateVOs(pks);
        HashMap<String, RateTypeVO> retMap = new HashMap<String, RateTypeVO>();
        if (ArrayUtils.isEmpty((Object[])vos)) {
            return retMap;
        }
        for (Object vo : vos) {
            retMap.put(vo.getPk_ratetype(), (RateTypeVO)vo);
        }
        return retMap;
    }

    public Map<UFLiteralDate, UFDouble> getRateDate(String pk_ratetype, String pk_currtype, String pk_org, UFDate billdate) throws BusinessException {
        return this.getRateAndDate(pk_ratetype, pk_currtype, pk_org, billdate);
    }

    public Map<String, Map<String, RateReturnObject>> getRateVOByCuSps(List<RateTypeInfoVO> rateList) throws BusinessException {
        if (CollectionUtils.isEmpty(rateList)) {
            return null;
        }
        HashMap<String, Map<String, RateReturnObject>> lastRetmap = new HashMap<String, Map<String, RateReturnObject>>();
        HashMap<String, RateReturnObject> retMap = new HashMap<String, RateReturnObject>();
        for (RateTypeInfoVO vo : rateList) {
            RateReturnObject ret = this.getRateVoByArapInfoVo(vo);
            if (lastRetmap.containsKey(vo.getBillPk())) {
                ((Map)lastRetmap.get(vo.getBillPk())).put(vo.getItemPk(), ret);
                continue;
            }
            retMap.put(vo.getItemPk(), ret);
            lastRetmap.put(vo.getBillPk(), retMap);
        }
        return lastRetmap;
    }

    public Map<String, Map<UFLiteralDate, UFDouble>> getRateDateAndRateByPKs(String[] pk_ratetype, String pk_currtype, String pk_org, UFDate billdate) throws BusinessException {
        List<Integer> dayRateList = Arrays.asList(ArapConstant.RATE_TYPE_BUYING, ArapConstant.RATE_TYPE_SELLING, ArapConstant.RATE_TYPE_MIDDLE);
        ArrayList<String> dayRatePKs = new ArrayList<String>();
        Object[] vos = this.getRateVOs(pk_ratetype);
        HashMap<String, Map<UFLiteralDate, UFDouble>> retMap = new HashMap<String, Map<UFLiteralDate, UFDouble>>();
        if (ArrayUtils.isEmpty((Object[])vos)) {
            return null;
        }
        for (Object vo : vos) {
            if (!dayRateList.contains(vo.getRate_category())) continue;
            dayRatePKs.add(vo.getPk_ratetype());
        }
        if (!CollectionUtils.isNotEmpty(dayRatePKs)) {
            return null;
        }
        for (String pk : dayRatePKs) {
            retMap.put(pk, this.getRateAndDate(pk, pk_currtype, pk_org, billdate));
        }
        return retMap;
    }

    private RateTypeVO[] getRateVOs(String[] pks) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])pks)) {
            return null;
        }
        RateTypeVO[] vos = this.getService().queryRateTypeByPKs(pks);
        return vos;
    }

    private Map<UFLiteralDate, UFDouble> getRateAndDate(String pk_ratetype, String pk_currtype, String pk_org, UFDate billdate) throws BusinessException {
        String org_currtype;
        HashMap<UFLiteralDate, UFDouble> ret = new HashMap<UFLiteralDate, UFDouble>();
        if (StringUtil.isEmptyWithTrim((String)pk_currtype) || billdate == null || StringUtil.isEmptyWithTrim((String)pk_currtype)) {
            return ret;
        }
        CurrencyRateUtil util = CurrencyRateUtil.getInstanceByRateType((String)pk_ratetype);
        RateReturnObject rateByRateType = util.getRateByRateType(pk_ratetype, pk_currtype, org_currtype = ((ICurrencyService)NCLocator.getInstance().lookup(ICurrencyService.class)).getOrgLocalCurrPK(pk_org), billdate);
        if (rateByRateType == null) {
            return null;
        }
        UFDouble rate = rateByRateType.getRate() == null ? UFDouble.ZERO_DBL : rateByRateType.getRate();
        ret.put(rateByRateType.getDate(), rate);
        return ret;
    }

    private IRateTypePubService getService() {
        return (IRateTypePubService)NCLocator.getInstance().lookup(IRateTypePubService.class);
    }

    private String getOrgcurrtype(String pk_org) throws BusinessException {
        return ((ICurrencyService)NCLocator.getInstance().lookup(ICurrencyService.class)).getOrgLocalCurrPK(pk_org);
    }

    public TransferInfo getTransferInfo(String key, String pk_ratetype, String pk_currtype, String pk_org, UFDate transferDate) throws BusinessException {
        TransferInfo info = new TransferInfo();
        if (StringUtil.isEmpty((String)pk_currtype) || StringUtil.isEmpty((String)pk_ratetype)) {
            return info;
        }
        if ("pk_ratetype".equals(key) || "ratedate".equals(key)) {
            UFLiteralDate billdate;
            Map<UFLiteralDate, UFDouble> rateDate = this.getRateDate(pk_ratetype, pk_currtype, pk_org, transferDate);
            if (rateDate == null || rateDate != null && rateDate.size() == 0) {
                return info;
            }
            UFDouble rate = rateDate.values() == null ? UFDouble.ZERO_DBL : rateDate.values().toArray(new UFDouble[0])[0];
            UFLiteralDate uFLiteralDate = billdate = rateDate.keySet() == null ? null : rateDate.keySet().toArray(new UFLiteralDate[0])[0];
            if (!"ratedate".equals(key)) {
                info.setRatedate(billdate);
            }
            info.setRate(rate);
        }
        return info;
    }

    public boolean getAble4RateField(HashMap<String, String> info) throws BusinessException {
        String pk_org = info.get("pk_org");
        String ratekey = info.get("ratekey");
        String pk_ratetype = info.get("rateType");
        String topid = info.get("topid");
        boolean isArap = true;
        if (!StringUtil.isEmptyWithTrim((String)topid)) {
            isArap = false;
        }
        String orgCurrType = null;
        String groupCurrType = null;
        String globleCurrType = null;
        try {
            boolean isRateType;
            boolean isfixedRateType;
            boolean isDefRateType;
            Integer rateType = this.getRateType(pk_ratetype);
            boolean bl = rateType == null ? false : (isDefRateType = ArapConstant.RATE_TYPE_CUSTOM == rateType);
            boolean bl2 = rateType == null ? false : (isfixedRateType = ArapConstant.RATE_TYPE_FIX == rateType);
            boolean bl3 = rateType == null ? false : (isRateType = ArapConstant.RATE_TYPE_MIDDLE == rateType || ArapConstant.RATE_TYPE_SELLING == rateType || ArapConstant.RATE_TYPE_BUYING == rateType);
            if (pk_org != null) {
                orgCurrType = this.getOrgcurrtype(pk_org);
            }
            if ("grouprate".equals(ratekey)) {
                groupCurrType = ((ICurrencyService)NCLocator.getInstance().lookup(ICurrencyService.class)).getGroupLocalCurrPK(InvocationInfoProxy.getInstance().getGroupId());
            } else if ("globalrate".equals(ratekey)) {
                globleCurrType = ((ICurrencyService)NCLocator.getInstance().lookup(ICurrencyService.class)).getGlobalCurrPk(null);
            }
            String NC001 = SysInit.getParaString((String)InvocationInfoProxy.getInstance().getGroupId(), (String)"NC001");
            String NC002 = SysInit.getParaString((String)"GLOBLE00000000000000", (String)"NC002");
            UFBoolean NC004 = SysInit.getParaBoolean((String)InvocationInfoProxy.getInstance().getGroupId(), (String)"NC004");
            String currentRowCurrtype = info.get("pk_currtype");
            boolean flag = false;
            switch (ratekey) {
                case "rate": 
                case "m_dBbhl": {
                    if (StringUtil.isEmpty((String)orgCurrType) || StringUtil.isEmpty((String)currentRowCurrtype)) break;
                    if (!orgCurrType.equals(currentRowCurrtype) && (isRateType && NC004.booleanValue() || isDefRateType || isfixedRateType && isArap)) {
                        flag = true;
                        break;
                    }
                    flag = false;
                    break;
                }
                case "pk_ratetype": {
                    flag = this.getisEdit(orgCurrType, currentRowCurrtype);
                    break;
                }
                case "ratedate": {
                    if (StringUtil.isEmpty((String)orgCurrType) || StringUtil.isEmpty((String)currentRowCurrtype)) break;
                    if (isDefRateType || isfixedRateType && isArap) {
                        flag = true;
                        break;
                    }
                    flag = false;
                    break;
                }
                case "grouprate": {
                    if (SysinitConst.NC001_BASE_ORIG.equals(NC001)) {
                        flag = this.getisEdit(groupCurrType, currentRowCurrtype);
                        break;
                    }
                    if (!SysinitConst.NC001_BASE_SUPG.equals(NC001)) break;
                    flag = this.getisEdit(groupCurrType, orgCurrType);
                    break;
                }
                case "globalrate": {
                    if (SysinitConst.NC002_BASE_ORIG.equals(NC002)) {
                        flag = this.getisEdit(globleCurrType, currentRowCurrtype);
                        break;
                    }
                    if (!SysinitConst.NC002_BASE_SUPG.equals(NC002)) break;
                    flag = this.getisEdit(globleCurrType, orgCurrType);
                    break;
                }
                default: {
                    flag = false;
                }
            }
            return flag;
        }
        catch (BusinessException e1) {
            Logger.error((Object)e1.getMessage());
            throw new BusinessException(e1.getMessage(), (Throwable)e1);
        }
    }

    private boolean getisEdit(String curry1, String currry2) {
        if (!StringUtil.isEmpty((String)curry1) && !StringUtil.isEmpty((String)currry2)) {
            return !curry1.equals(currry2);
        }
        return false;
    }

    private Integer getRateType(String pk_rateType) throws BusinessException {
        if (pk_rateType == null) {
            return null;
        }
        Map<String, Integer> retMap = this.getReatTypeBypks(new String[]{pk_rateType});
        return retMap == null ? null : retMap.get(pk_rateType);
    }

    public RateReturnObject getRateVoByArapInfoVo(RateTypeInfoVO info) throws BusinessException {
        if (info == null) {
            return null;
        }
        String pk_org = info.getPk_org();
        String dest_currency_pk = this.getOrgcurrtype(pk_org);
        String pk_group = InvocationInfoProxy.getInstance().getGroupId();
        int rateType = ArapBillCalUtil.getRateType((String)info.getPk_billtype(), (String)pk_group);
        CategoryEnum categoryEnum = (CategoryEnum)MDEnum.valueOf(CategoryEnum.class, (Object)rateType);
        String key = info.getEditKey();
        String src_currtype = info.getSrc_pk_currtype();
        UFDate date = info.getBilldate();
        if ("pk_org".equals(key)) {
            if (StringUtil.isEmpty((String)pk_org)) {
                return new RateReturnObject();
            }
            return CurrencyRateUtil.getInstanceByOrg((String)pk_org).getRateReturnObject(categoryEnum, src_currtype, dest_currency_pk, date);
        }
        if ("customer".equals(key)) {
            String customer = info.getCustomer();
            if (StringUtil.isEmpty((String)customer)) {
                return new RateReturnObject();
            }
            return CurrencyRateUtil.getRateByCustFinance((String)customer, (String)pk_org, (String)src_currtype, (String)dest_currency_pk, (CategoryEnum)categoryEnum, (UFDate)date);
        }
        if ("supplier".equals(key)) {
            String supplier = info.getSupplier();
            if (StringUtil.isEmpty((String)supplier)) {
                return new RateReturnObject();
            }
            return CurrencyRateUtil.getRateBySupFinance((String)supplier, (String)pk_org, (String)src_currtype, (String)dest_currency_pk, (CategoryEnum)categoryEnum, (UFDate)date);
        }
        return new RateReturnObject();
    }

    public UFDouble getOrgMoneyProxy(String pk_org, String src_pkCurr, String dest_pkCurr, UFDouble oriMoney, UFDouble rate, UFDate date) throws BusinessException {
        return CurrencyRateUtil.getInstanceByOrg((String)pk_org).getAmountByOpp(src_pkCurr, dest_pkCurr, oriMoney, rate, date);
    }

    public RateReturnObject getAdjustRateByRateType(String pk_org, String pk_ratetype, String src_currency_pk, String dest_currency_pk, String pk_accperiodscheme, String year, String month) throws BusinessException {
        if (StringUtil.isEmptyWithTrim((String)dest_currency_pk)) {
            dest_currency_pk = this.getOrgcurrtype(pk_org);
        }
        if (StringUtil.isEmptyWithTrim((String)pk_ratetype)) {
            return CurrencyRateUtil.getInstanceByOrg((String)pk_org).getAdjustRateReturnObject(src_currency_pk, dest_currency_pk, pk_accperiodscheme, year, month);
        }
        CurrencyRateUtil util = CurrencyRateUtil.getInstanceByRateType((String)pk_ratetype);
        return util.getAdjustRateByRateType(pk_ratetype, src_currency_pk, dest_currency_pk, pk_accperiodscheme, year, month);
    }

    public Map<String, Boolean> isDateType(String[] pk_rateTypes) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])pk_rateTypes)) {
            return new HashMap<String, Boolean>();
        }
        List<Integer> ratetypeList = Arrays.asList(ArapConstant.RATE_TYPE_BUYING, ArapConstant.RATE_TYPE_SELLING, ArapConstant.RATE_TYPE_MIDDLE);
        Map<String, Integer> reatTypeBypks = this.getReatTypeBypks(pk_rateTypes);
        HashMap<String, Boolean> retMap = new HashMap<String, Boolean>();
        for (String ratetype : pk_rateTypes) {
            if (ratetypeList.contains(reatTypeBypks.get(ratetype))) {
                retMap.put(ratetype, new Boolean(true));
                continue;
            }
            retMap.put(ratetype, new Boolean(false));
        }
        return retMap;
    }
}

