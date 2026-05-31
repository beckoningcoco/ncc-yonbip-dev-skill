/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.supreceivable;

import nc.vo.arap.supreceivable.AggSupReceivableBillVO;
import nc.vo.pub.BusinessException;

public interface IArapSupReceivableBillPubService {
    public void delete(AggSupReceivableBillVO var1) throws BusinessException;

    public void delete(AggSupReceivableBillVO[] var1) throws BusinessException;

    public AggSupReceivableBillVO update(AggSupReceivableBillVO var1) throws BusinessException;

    public AggSupReceivableBillVO[] update(AggSupReceivableBillVO[] var1) throws BusinessException;

    public AggSupReceivableBillVO save(AggSupReceivableBillVO var1) throws BusinessException;

    public AggSupReceivableBillVO[] save(AggSupReceivableBillVO[] var1) throws BusinessException;

    public AggSupReceivableBillVO[] approve(AggSupReceivableBillVO[] var1) throws BusinessException;

    public AggSupReceivableBillVO approve(AggSupReceivableBillVO var1) throws BusinessException;
}

