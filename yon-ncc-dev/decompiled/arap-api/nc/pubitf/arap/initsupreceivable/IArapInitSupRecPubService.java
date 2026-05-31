/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.initsupreceivable;

import nc.vo.arap.supreceivable.AggSupReceivableBillVO;
import nc.vo.pub.BusinessException;

public interface IArapInitSupRecPubService {
    public void delete(AggSupReceivableBillVO var1) throws BusinessException;

    public void delete(AggSupReceivableBillVO[] var1) throws BusinessException;

    public AggSupReceivableBillVO update(AggSupReceivableBillVO var1) throws BusinessException;

    public AggSupReceivableBillVO[] update(AggSupReceivableBillVO[] var1) throws BusinessException;

    public AggSupReceivableBillVO save(AggSupReceivableBillVO var1) throws BusinessException;

    public AggSupReceivableBillVO[] save(AggSupReceivableBillVO[] var1) throws BusinessException;
}

