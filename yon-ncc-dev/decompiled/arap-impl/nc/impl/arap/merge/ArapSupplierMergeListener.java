/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.bd.businessevent.MergeBusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.merge.ArapMergeListener
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 */
package nc.impl.arap.merge;

import nc.bs.bd.businessevent.MergeBusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.merge.ArapMergeListener;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

public class ArapSupplierMergeListener
implements IBusinessListener {
    public void doAction(IBusinessEvent event) throws BusinessException {
        if (event instanceof MergeBusinessEvent) {
            MergeBusinessEvent mergeEvent = (MergeBusinessEvent)event;
            SuperVO source = mergeEvent.getSourceVO();
            SuperVO target = mergeEvent.getTargetVO();
            String sourceSup = source.getPrimaryKey();
            String targetSup = target.getPrimaryKey();
            ((ArapMergeListener)NCLocator.getInstance().lookup(ArapMergeListener.class)).doMerge(sourceSup, targetSup, ArapConstant.ARAP_MERGE_SUPPLIER);
        }
    }
}

