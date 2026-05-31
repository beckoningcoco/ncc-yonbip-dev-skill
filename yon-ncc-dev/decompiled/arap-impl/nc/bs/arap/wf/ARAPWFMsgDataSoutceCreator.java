/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.ui.pub.print.IDataSource
 *  nc.vo.pub.BusinessException
 *  nc.vo.wfengine.pub.IWFMsgDataSoutceCreator
 */
package nc.bs.arap.wf;

import nc.bs.arap.wf.ARAPBsWFPrDataSource;
import nc.ui.pub.print.IDataSource;
import nc.vo.pub.BusinessException;
import nc.vo.wfengine.pub.IWFMsgDataSoutceCreator;

public class ARAPWFMsgDataSoutceCreator
implements IWFMsgDataSoutceCreator {
    public IDataSource createMsgDataSource(Object busiObj) throws BusinessException {
        return new ARAPBsWFPrDataSource(busiObj);
    }
}

