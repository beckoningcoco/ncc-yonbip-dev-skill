/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationException
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.bill.util;

import java.util.ArrayList;
import java.util.HashSet;
import nc.bs.uif2.validation.ValidationException;
import nc.bs.uif2.validation.ValidationFailure;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDouble;

public class VORowNoUtils {
    public static final int MAX_LENGTH = 20;
    public static final int DIGIT_POWER = 8;
    public static final UFDouble ZERO_UFDOUBLE = new UFDouble(0.0);
    public static final UFDouble MIN_VALUE = new UFDouble(1.0E-8);
    public static final int STEP_VALUE = 10;
    public static final int START_VALUE = 10;

    public static String getCorrectString(UFDouble dOrgValue) {
        String sOrgValue = dOrgValue.toString();
        if (sOrgValue.indexOf(".") < 0) {
            return sOrgValue;
        }
        UFDouble dNewValue = dOrgValue.setScale(-8, 4);
        dNewValue = dNewValue.compareTo((Object)MIN_VALUE) <= 0 ? MIN_VALUE : dNewValue;
        String sNew = dNewValue.toString();
        int iLen = sNew.length();
        int iDotIndex = sNew.indexOf(".");
        if (iDotIndex > 0) {
            for (int i = iLen - 1; i >= iDotIndex; --i) {
                if ('0' != sNew.charAt(i)) {
                    if ('.' != sNew.charAt(i)) break;
                    sNew = sNew.substring(0, i);
                    break;
                }
                sNew = sNew.substring(0, i);
            }
        }
        return sNew;
    }

    public static UFDouble getUFDouble(Object oValue) {
        if (oValue == null || oValue.toString().trim().equals("")) {
            return ZERO_UFDOUBLE;
        }
        if (oValue instanceof UFDouble) {
            return (UFDouble)oValue;
        }
        return new UFDouble(oValue.toString().trim());
    }

    private static int getStepValue() {
        return 10;
    }

    private static int getStartValue() {
        return 10;
    }

    public static void setVOsRowNoByRule(CircularlyAccessibleValueObject[] voaCA, String sRowNOKey) {
        int j;
        if (voaCA == null || sRowNOKey == null) {
            throw new IllegalArgumentException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0545"));
        }
        int iCount = voaCA.length;
        Integer[] saRowNo = new Integer[iCount];
        for (j = 0; j < iCount; ++j) {
            saRowNo[j] = (Integer)voaCA[j].getAttributeValue(sRowNOKey);
        }
        saRowNo = VORowNoUtils.getRowNosResetNull(VORowNoUtils.getStartValue(), VORowNoUtils.getStepValue(), saRowNo);
        for (j = 0; j < iCount; ++j) {
            voaCA[j].setAttributeValue(sRowNOKey, (Object)saRowNo[j]);
        }
    }

    public static void setVOsRowNoByRule(AggregatedValueObject[] voaAgg, String sRowNOKey) {
        if (voaAgg == null || sRowNOKey == null) {
            throw new IllegalArgumentException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0545"));
        }
        int iCount = voaAgg.length;
        for (int i = 0; i < iCount; ++i) {
            VORowNoUtils.setVOsRowNoByRule(voaAgg[i].getChildrenVO(), sRowNOKey);
        }
    }

    public static Integer[] getRowNosResetNull(int iStartValue, int iStepValue, Integer[] saRowNo) {
        if (saRowNo == null) {
            throw new IllegalArgumentException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0545"));
        }
        int iCount = saRowNo.length;
        HashSet<Double> htsetRowNO = new HashSet<Double>();
        ArrayList<Integer> listSetIndex = new ArrayList<Integer>();
        Double dZero = new Double(0.0);
        for (int i = 0; i < iCount; ++i) {
            Double dValue = VORowNoUtils.getUFDouble(saRowNo[i]).toDouble();
            if (dValue.compareTo(dZero) == 0) {
                listSetIndex.add(i);
                continue;
            }
            htsetRowNO.add(dValue);
        }
        int iSetLen = listSetIndex.size();
        if (iSetLen == 0) {
            return saRowNo;
        }
        Double dNewValue = VORowNoUtils.getUFDouble(iStartValue + "").toDouble();
        for (int i = 0; i < iSetLen; ++i) {
            int iIndex = (Integer)listSetIndex.get(i);
            int iMaxCircle = 0;
            while (htsetRowNO.contains(dNewValue)) {
                dNewValue = VORowNoUtils.getUFDouble(VORowNoUtils.getRowNoAfterByRule(dNewValue.toString(), iStepValue)).toDouble();
                if (++iMaxCircle != 10000000) continue;
            }
            htsetRowNO.add(dNewValue);
            saRowNo[iIndex] = Integer.valueOf(VORowNoUtils.getCorrectString(new UFDouble(dNewValue)));
        }
        return saRowNo;
    }

    public static String getRowNoAfterByRule(String sRowNo, int iStepValue) {
        UFDouble dCurRowNO = VORowNoUtils.getUFDouble(sRowNo).add((double)iStepValue);
        return VORowNoUtils.getCorrectString(dCurRowNO);
    }

    public static void validateRowNo(CircularlyAccessibleValueObject[] voaItem, String sRowNOKey) throws ValidationException {
        ArrayList<ValidationFailure> failures = new ArrayList<ValidationFailure>();
        HashSet<String> mapRowNO = new HashSet<String>();
        for (int i = 0; i < voaItem.length; ++i) {
            String sKey;
            if (voaItem[i].getStatus() != 2 && voaItem[i].getStatus() != 1) continue;
            String sValue = (String)voaItem[i].getAttributeValue(sRowNOKey);
            if (sValue == null || sValue.trim().equals("")) {
                failures.add(new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0547", null, new String[]{Integer.valueOf(i).toString()})));
            }
            if (mapRowNO.contains(sKey = VORowNoUtils.getCorrectString(new UFDouble(sValue)))) {
                failures.add(new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0548", null, new String[]{Integer.valueOf(i).toString(), sValue})));
                continue;
            }
            mapRowNO.add(sKey);
        }
        if (!failures.isEmpty()) {
            throw new ValidationException(failures);
        }
    }
}

