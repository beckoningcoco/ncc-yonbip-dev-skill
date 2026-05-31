/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.impl.pubapp.linkquery.MultiSrcBillFinder
 *  nc.vo.trade.billsource.LightBillVO
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.bs.arap.billflow.utils;

import java.util.ArrayList;
import nc.impl.pubapp.linkquery.MultiSrcBillFinder;
import nc.vo.trade.billsource.LightBillVO;
import org.apache.commons.lang3.ArrayUtils;

public class ArapBillFlowUtils
extends MultiSrcBillFinder {
    public LightBillVO[] getSourceBills(String curBillType, String curBillID) {
        Object[] bills = super.getSourceBills(curBillType, curBillID);
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return bills;
        }
        ArrayList<Object> list = new ArrayList<Object>();
        for (Object vo : bills) {
            if (vo.getCode() == null && vo.getCorp() == null) continue;
            list.add(vo);
        }
        return list.toArray(new LightBillVO[0]);
    }
}

