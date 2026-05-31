/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.arap.merge.ArapMergeListener
 *  nc.vo.pub.BusinessException
 */
package nc.impl.arap.merge;

import java.util.ArrayList;
import nc.impl.arap.merge.ArapBusiDataDealMergeListener;
import nc.impl.arap.merge.ArapReportMergeListener;
import nc.itf.arap.merge.ArapMergeListener;
import nc.vo.pub.BusinessException;

public class ArapBillMergeListener
implements ArapMergeListener {
    public void doMerge(String sourcePk, String targetPk, String type) throws BusinessException {
        ArrayList<Object> listenerList = new ArrayList<Object>();
        listenerList.add(new ArapReportMergeListener());
        listenerList.add(new ArapBusiDataDealMergeListener());
        for (ArapMergeListener arapMergeListener : listenerList) {
            arapMergeListener.doMerge(sourcePk, targetPk, type);
        }
    }
}

