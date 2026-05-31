/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.fi.pub.Currency
 *  nc.pubitf.uapbd.CurrencyRateUtil
 *  nc.pubitf.uapbd.IMaterialPubService
 *  nc.pubitf.uapbd.MeasdocUtil
 *  nc.pubitf.uapbd.PriceAccuracyUtil
 *  nc.pubitf.uapbd.PriceAccuracyValuePair
 *  nc.vo.bd.currinfo.CurrinfoVO
 *  nc.vo.bd.material.MaterialVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nccloud.commons.lang.StringUtils
 */
package nc.vo.arap.utils;

import java.util.HashMap;
import java.util.Map;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.fi.pub.Currency;
import nc.pubitf.uapbd.CurrencyRateUtil;
import nc.pubitf.uapbd.IMaterialPubService;
import nc.pubitf.uapbd.MeasdocUtil;
import nc.pubitf.uapbd.PriceAccuracyUtil;
import nc.pubitf.uapbd.PriceAccuracyValuePair;
import nc.vo.arap.termitem.TermVO;
import nc.vo.bd.currinfo.CurrinfoVO;
import nc.vo.bd.material.MaterialVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nccloud.commons.lang.StringUtils;

public class ArapPrintDigitUtil {
    public static Object[] getDatas(Object[] datas, Map<String, String[]> fieldsMap, String orgFiledName, String currFieldName) throws NumberFormatException, IllegalArgumentException, IllegalAccessException, BusinessException {
        return ArapPrintDigitUtil.getDatas(datas, fieldsMap, orgFiledName, currFieldName, null);
    }

    public static Object[] getDatas(Object[] datas, Map<String, String[]> fieldsMap, String orgFiledName, String currFiledName, String materialFieldName) throws NumberFormatException, IllegalArgumentException, IllegalAccessException, BusinessException {
        if (datas == null || datas.length == 0) {
            return null;
        }
        if (materialFieldName == null) {
            materialFieldName = "material";
        }
        String pk_org = null;
        String pk_group = null;
        if (datas[0] instanceof AggregatedValueObject) {
            pk_org = (String)((AggregatedValueObject)datas[0]).getParentVO().getAttributeValue(orgFiledName);
            pk_group = (String)((AggregatedValueObject)datas[0]).getParentVO().getAttributeValue("pk_group");
        } else {
            pk_org = (String)((SuperVO)datas[0]).getAttributeValue(orgFiledName);
            pk_group = (String)((SuperVO)datas[0]).getAttributeValue("pk_group");
        }
        String[] currtypeArray = new String[]{Currency.getGlobalCurrPk((String)pk_org), Currency.getGroupCurrpk((String)InvocationInfoProxy.getInstance().getGroupId()), Currency.getLocalCurrPK((String)pk_org)};
        ArapPrintDigitUtil.setCurrDigit(datas, fieldsMap, currFiledName, currtypeArray);
        ArapPrintDigitUtil.setRateDigit(datas, fieldsMap, currFiledName, currtypeArray, pk_org, pk_group == null ? InvocationInfoProxy.getInstance().getGroupId() : pk_group);
        ArapPrintDigitUtil.setQuantityDigit(datas, fieldsMap, materialFieldName);
        ArapPrintDigitUtil.setPriceDigit(datas, fieldsMap, currFiledName);
        ArapPrintDigitUtil.setTaxRateDigit(datas, fieldsMap);
        return datas;
    }

    private static Object[] setRateDigit(Object[] datas, Map<String, String[]> fieldsMap, String currFiledName, String[] currtypeArray, String pk_org, String pk_group) throws NumberFormatException, IllegalArgumentException, IllegalAccessException, BusinessException {
        String[] field_local_rate;
        String[] field_group_rate;
        String[] field_grobal_rate = fieldsMap.get("field_global_rate");
        if (field_grobal_rate != null && field_grobal_rate.length > 0) {
            ArapPrintDigitUtil.formatDatasOnRateFields(datas, field_grobal_rate, currFiledName, currtypeArray[0], "GLOBLE00000000000000");
        }
        if ((field_group_rate = fieldsMap.get("field_group_rate")) != null && field_group_rate.length > 0 && pk_group != null) {
            ArapPrintDigitUtil.formatDatasOnRateFields(datas, field_group_rate, currFiledName, currtypeArray[1], pk_group);
        }
        if ((field_local_rate = fieldsMap.get("field_local_rate")) != null && field_local_rate.length > 0 && pk_org != null) {
            ArapPrintDigitUtil.formatDatasOnRateFields(datas, field_local_rate, currFiledName, currtypeArray[2], pk_org);
        }
        return datas;
    }

    private static Object[] formatDatasOnRateFields(Object[] datas, String[] fields, String currFieldName, String dest_currtype, String pk_org) throws NumberFormatException, IllegalArgumentException, IllegalAccessException, BusinessException {
        if (datas[0] instanceof AggregatedValueObject) {
            for (int i = 0; i < datas.length; ++i) {
                AggregatedValueObject aggVo = (AggregatedValueObject)datas[i];
                ArapPrintDigitUtil.formatVOOnRateFields(aggVo.getParentVO(), fields, currFieldName, dest_currtype, pk_org);
                if (aggVo.getChildrenVO() == null || aggVo.getChildrenVO().length == 0) continue;
                for (CircularlyAccessibleValueObject bodyvo : aggVo.getChildrenVO()) {
                    ArapPrintDigitUtil.formatVOOnRateFields(bodyvo, fields, currFieldName, dest_currtype, pk_org);
                }
            }
        } else {
            for (Object vo : datas) {
                ArapPrintDigitUtil.formatVOOnRateFields(vo, fields, currFieldName, dest_currtype, pk_org);
            }
        }
        return datas;
    }

    private static void formatVOOnRateFields(Object vo, String[] fields, String currFieldName, String dest_currtype, String pk_org) throws NumberFormatException, IllegalArgumentException, IllegalAccessException, BusinessException {
        if (fields == null || fields.length == 0 || currFieldName == null || dest_currtype == null) {
            return;
        }
        String src_currtype = (String)((SuperVO)vo).getAttributeValue(currFieldName);
        CurrinfoVO currinfoVO = CurrencyRateUtil.getInstanceByOrg((String)pk_org).getCurrinfoVO(src_currtype, dest_currtype);
        int rateDigit = 2;
        try {
            rateDigit = currinfoVO.getRatedigit();
        }
        catch (Exception e) {
            ExceptionHandler.consume((Throwable)e);
        }
        ArapPrintDigitUtil.formatVOOnFields(vo, fields, rateDigit);
    }

    private static Object[] setQuantityDigit(Object[] datas, Map<String, String[]> fieldsMap, String materialFieldName) throws NumberFormatException, IllegalArgumentException, IllegalAccessException, BusinessException {
        String[] field_quantity = fieldsMap.get("field_quantity");
        if (field_quantity == null || field_quantity.length == 0) {
            return datas;
        }
        HashMap<String, Integer> materialDigMap = new HashMap<String, Integer>();
        if (datas[0] instanceof AggregatedValueObject) {
            for (int i = 0; i < datas.length; ++i) {
                AggregatedValueObject aggVo = (AggregatedValueObject)datas[i];
                ArapPrintDigitUtil.formatVOOnQuantityFields(aggVo.getParentVO(), field_quantity, materialFieldName, materialDigMap);
                if (aggVo.getChildrenVO() == null || aggVo.getChildrenVO().length == 0) continue;
                for (CircularlyAccessibleValueObject bodyvo : aggVo.getChildrenVO()) {
                    ArapPrintDigitUtil.formatVOOnQuantityFields(bodyvo, field_quantity, materialFieldName, materialDigMap);
                }
            }
        } else {
            for (Object vo : datas) {
                ArapPrintDigitUtil.formatVOOnQuantityFields(vo, field_quantity, materialFieldName, materialDigMap);
            }
        }
        return datas;
    }

    private static Object[] setPriceDigit(Object[] datas, Map<String, String[]> fieldsMap, String currFiledName) throws NumberFormatException, IllegalArgumentException, IllegalAccessException, BusinessException {
        String[] field_price = fieldsMap.get("field_price");
        if (field_price == null || field_price.length == 0 || currFiledName == null) {
            return datas;
        }
        if (datas[0] instanceof AggregatedValueObject) {
            for (int i = 0; i < datas.length; ++i) {
                AggregatedValueObject aggVo = (AggregatedValueObject)datas[i];
                String pk_currtype = (String)((SuperVO)aggVo.getParentVO()).getAttributeValue(currFiledName);
                PriceAccuracyValuePair priceAccuracyValuePair = ArapPrintDigitUtil.getPriceDigitAndRoundTypeValuePair(pk_currtype);
                int currDigit = -1;
                int roundmode = 4;
                if (null != priceAccuracyValuePair) {
                    currDigit = priceAccuracyValuePair.getPriceAccuracy();
                    roundmode = priceAccuracyValuePair.getRoundMode();
                }
                ArapPrintDigitUtil.formatVOOnFields(aggVo.getParentVO(), field_price, currDigit, roundmode);
                if (aggVo.getChildrenVO() == null || aggVo.getChildrenVO().length == 0) continue;
                for (CircularlyAccessibleValueObject bodyvo : aggVo.getChildrenVO()) {
                    pk_currtype = (String)((SuperVO)bodyvo).getAttributeValue(currFiledName);
                    PriceAccuracyValuePair childPriceAccuracyValuePair = ArapPrintDigitUtil.getPriceDigitAndRoundTypeValuePair(pk_currtype);
                    if (null != childPriceAccuracyValuePair) {
                        currDigit = childPriceAccuracyValuePair.getPriceAccuracy();
                        roundmode = childPriceAccuracyValuePair.getRoundMode();
                    } else {
                        currDigit = -1;
                        roundmode = 4;
                    }
                    ArapPrintDigitUtil.formatVOOnFields(bodyvo, field_price, currDigit, roundmode);
                }
            }
        } else {
            for (Object vo : datas) {
                String pk_currtype = (String)((SuperVO)vo).getAttributeValue(currFiledName);
                PriceAccuracyValuePair priceAccuracyValuePair = ArapPrintDigitUtil.getPriceDigitAndRoundTypeValuePair(pk_currtype);
                int currDigit = -1;
                int roundmode = 4;
                if (null != priceAccuracyValuePair) {
                    currDigit = priceAccuracyValuePair.getPriceAccuracy();
                    roundmode = priceAccuracyValuePair.getRoundMode();
                }
                ArapPrintDigitUtil.formatVOOnFields(vo, field_price, currDigit, roundmode);
            }
        }
        return datas;
    }

    private static Object[] setTaxRateDigit(Object[] datas, Map<String, String[]> fieldsMap) throws NumberFormatException, IllegalArgumentException, IllegalAccessException, BusinessException {
        String[] field_taxrate = fieldsMap.get("field_taxrate");
        if (field_taxrate == null || field_taxrate.length == 0) {
            return datas;
        }
        Integer digit = 2;
        if (datas[0] instanceof AggregatedValueObject) {
            for (int i = 0; i < datas.length; ++i) {
                AggregatedValueObject aggVo = (AggregatedValueObject)datas[i];
                ArapPrintDigitUtil.formatVOOnFields(aggVo.getParentVO(), field_taxrate, digit);
                if (aggVo.getChildrenVO() == null || aggVo.getChildrenVO().length == 0) continue;
                for (CircularlyAccessibleValueObject bodyvo : aggVo.getChildrenVO()) {
                    ArapPrintDigitUtil.formatVOOnFields(bodyvo, field_taxrate, digit);
                }
            }
        } else {
            for (Object vo : datas) {
                ArapPrintDigitUtil.formatVOOnFields(vo, field_taxrate, digit);
            }
        }
        return datas;
    }

    private static void formatVOOnFields(Object vo, String[] fields, int digit) throws BusinessException {
        int roundmode = 4;
        ArapPrintDigitUtil.formatVOOnFields(vo, fields, digit, roundmode);
    }

    private static void formatVOOnFields(Object vo, String[] fields, int digit, int roundmode) throws BusinessException {
        if (fields == null || fields.length == 0) {
            return;
        }
        for (int i = 0; i < fields.length; ++i) {
            String fieldname = fields[i];
            Object value = ((SuperVO)vo).getAttributeValue(fieldname);
            if (value == null || !(value instanceof UFDouble)) continue;
            UFDouble ufdoublevalue = ((UFDouble)value).setScale(digit, roundmode);
            ((SuperVO)vo).setAttributeValue(fieldname, (Object)ufdoublevalue);
        }
    }

    private static void formatVOOnQuantityFields(Object vo, String[] fields, String materialFieldName, Map<String, Integer> materialDigMap) throws BusinessException {
        if (fields == null || fields.length == 0 || materialFieldName == null) {
            return;
        }
        int digit = 2;
        String material = (String)((SuperVO)vo).getAttributeValue(materialFieldName);
        if (!StringUtil.isEmpty((String)material)) {
            if (materialDigMap.containsKey(material)) {
                digit = materialDigMap.get(material);
            } else {
                Map mmaterialMap = ((IMaterialPubService)NCLocator.getInstance().lookup(IMaterialPubService.class)).queryMaterialBaseInfoByPks(new String[]{material.toString()}, new String[]{"pk_measdoc"});
                Integer[] precisionByPks = MeasdocUtil.getInstance().getPrecisionByPks(new String[]{((MaterialVO)mmaterialMap.get(material.toString())).getPk_measdoc()});
                if (precisionByPks != null && precisionByPks.length != 0 && precisionByPks[0] != null) {
                    digit = precisionByPks[0];
                }
                materialDigMap.put(material, digit);
            }
        }
        ArapPrintDigitUtil.formatVOOnFields(vo, fields, digit);
    }

    private static Object[] setCurrDigit(Object[] datas, Map<String, String[]> fieldsMap, String currFiledName, String[] currtypeArray) throws NumberFormatException, IllegalArgumentException, IllegalAccessException, BusinessException {
        String[] field_money;
        String[] field_local;
        String[] field_group;
        String[] field_grobal = fieldsMap.get("field_global_money");
        if (field_grobal != null && field_grobal.length > 0) {
            ArapPrintDigitUtil.formatDatasOnCurrFields(datas, field_grobal, currtypeArray[0], null);
        }
        if ((field_group = fieldsMap.get("field_group_money")) != null && field_group.length > 0) {
            ArapPrintDigitUtil.formatDatasOnCurrFields(datas, field_group, currtypeArray[1], null);
        }
        if ((field_local = fieldsMap.get("field_local_currtype")) != null && field_local.length > 0) {
            ArapPrintDigitUtil.formatDatasOnCurrFields(datas, field_local, currtypeArray[2], null);
        }
        if ((field_money = fieldsMap.get("field_money")) != null && field_money.length > 0) {
            ArapPrintDigitUtil.formatDatasOnCurrFields(datas, field_money, null, currFiledName);
        }
        return datas;
    }

    public static Object[] formatDatasOnCurrFields(Object[] datas, String[] fields, String pk_currtype, String currFiledName) throws NumberFormatException, IllegalArgumentException, IllegalAccessException, BusinessException {
        Integer maxDigit = 0;
        if (datas[0] instanceof AggregatedValueObject) {
            for (int i = 0; i < datas.length; ++i) {
                AggregatedValueObject aggVo = (AggregatedValueObject)datas[i];
                maxDigit = Math.max(maxDigit, ArapPrintDigitUtil.formatVOOnCurrFields(aggVo.getParentVO(), fields, pk_currtype, currFiledName, maxDigit));
                if (aggVo.getChildrenVO() == null || aggVo.getChildrenVO().length == 0) continue;
                for (CircularlyAccessibleValueObject bodyvo : aggVo.getChildrenVO()) {
                    maxDigit = Math.max(maxDigit, ArapPrintDigitUtil.formatVOOnCurrFields(bodyvo, fields, pk_currtype, currFiledName, maxDigit));
                }
            }
        } else {
            for (Object vo : datas) {
                maxDigit = Math.max(maxDigit, ArapPrintDigitUtil.formatVOOnCurrFields(vo, fields, pk_currtype, currFiledName, maxDigit));
            }
        }
        return datas;
    }

    private static Integer formatVOOnCurrFields(Object vo, String[] fields, String pk_currtype, String currFiledName, Integer maxDigit) throws NumberFormatException, IllegalArgumentException, IllegalAccessException, BusinessException {
        if (fields == null || fields.length == 0 || vo instanceof TermVO) {
            return maxDigit;
        }
        if (pk_currtype == null && currFiledName != null) {
            pk_currtype = (String)((SuperVO)vo).getAttributeValue(currFiledName);
        }
        int[] currDigits = Currency.getCurrDigitAndRoundtype((String)pk_currtype);
        int currDigit = currDigits[0];
        int roundmode = currDigits[1];
        if (!StringUtils.isEmpty((CharSequence)pk_currtype)) {
            maxDigit = Math.max(maxDigit, currDigit);
        } else {
            currDigit = maxDigit;
        }
        ArapPrintDigitUtil.formatVOOnFields(vo, fields, currDigit, roundmode);
        return maxDigit;
    }

    public static PriceAccuracyValuePair getPriceDigitAndRoundTypeValuePair(Object pkValue) {
        PriceAccuracyValuePair priceAccuracyValuePair = null;
        try {
            if (null != pkValue && !StringUtil.isEmpty((String)((String)pkValue))) {
                priceAccuracyValuePair = PriceAccuracyUtil.getInstance().getPriceAccuracyValuePair((String)pkValue);
                return priceAccuracyValuePair;
            }
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappException((Exception)((Object)e));
        }
        return priceAccuracyValuePair;
    }

    public class ArapPrintDigitConst {
        public static final String FIELD_GLOBAL = "field_global_money";
        public static final String FIELD_GROUP = "field_group_money";
        public static final String FIELD_LOCAL = "field_local_currtype";
        public static final String FIELD_GLOBAL_RATE = "field_global_rate";
        public static final String FIELD_GROUP_RATE = "field_group_rate";
        public static final String FIELD_LOCAL_RATE = "field_local_rate";
        public static final String FIELD_MONEY = "field_money";
        public static final String FIELD_QUANTITY = "field_quantity";
        public static final String FIELD_PRICE = "field_price";
        public static final String FIELD_TAXRATE = "field_taxrate";
    }
}

