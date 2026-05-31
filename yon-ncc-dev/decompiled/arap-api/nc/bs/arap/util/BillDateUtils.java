/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 */
package nc.bs.arap.util;

import nc.vo.arap.param.ParamConsts;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;

public final class BillDateUtils {
    private BillDateUtils() {
    }

    public static void setBillDateByNow(AggregatedValueObject[] bills) {
        UFDate now = new UFDate();
        for (AggregatedValueObject bill : bills) {
            SuperVO[] children;
            SuperVO parent = (SuperVO)bill.getParentVO();
            if (null == parent.getAttributeValue("busidate")) {
                parent.setAttributeValue("busidate", null != parent.getAttributeValue("billdate") ? parent.getAttributeValue("billdate") : now);
            }
            if (null == parent.getAttributeValue("billdate")) {
                parent.setAttributeValue("billdate", (Object)now);
            }
            for (SuperVO item : children = (SuperVO[])bill.getChildrenVO()) {
                if (null == item.getAttributeValue("busidate")) {
                    item.setAttributeValue("busidate", null != item.getAttributeValue("billdate") ? item.getAttributeValue("billdate") : now);
                }
                if (null != item.getAttributeValue("billdate")) continue;
                item.setAttributeValue("billdate", (Object)now);
            }
        }
    }

    public static String getParamCode(String nodeCode) {
        String paramCode = null;
        if ("2006".equals(nodeCode)) {
            paramCode = ParamConsts.PARAM_CLSACC_AR;
        } else if ("2008".equals(nodeCode)) {
            paramCode = ParamConsts.PARAM_CLSACC_AP;
        }
        return paramCode;
    }

    public static String getPeriod(String year, String month) {
        if (year == null || month == null) {
            return null;
        }
        if (month.length() < 2) {
            month = "0" + month;
        }
        return year + "-" + month;
    }
}

