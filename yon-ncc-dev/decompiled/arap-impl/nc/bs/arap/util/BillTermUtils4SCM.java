/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.lang.UFDate
 */
package nc.bs.arap.util;

import nc.bs.arap.util.BillTermBaseUtils;
import nc.vo.arap.termitem.ArapTermDateVO;
import nc.vo.pub.lang.UFDate;

public class BillTermUtils4SCM {
    public static UFDate getExpiredateByTermDateVO(ArapTermDateVO termDateVO) {
        return BillTermBaseUtils.getExpiredateByTermDateVO(termDateVO);
    }
}

