/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.bs.businessevent.bd.BDCommonEvent
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.merge.ArapMergeListener
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.pub.BusinessException
 */
package nc.impl.arap.merge;

import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.businessevent.bd.BDCommonEvent;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.merge.ArapMergeListener;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.pub.BusinessException;

public class ArapCustLinkSuppAfterListener
implements IBusinessListener {
    public void doAction(IBusinessEvent event) throws BusinessException {
        if (event instanceof BDCommonEvent) {
            BDCommonEvent commEvent = (BDCommonEvent)event;
            Object[] oldObjs = commEvent.getOldObjs();
            Object[] newObjs = commEvent.getNewObjs();
            String sourceSup = oldObjs[1].toString();
            String targetSup = newObjs[0].toString();
            ((ArapMergeListener)NCLocator.getInstance().lookup(ArapMergeListener.class)).doMerge(sourceSup, targetSup, ArapConstant.ARAP_MERGE_SUPPLIER);
        }
    }
}

