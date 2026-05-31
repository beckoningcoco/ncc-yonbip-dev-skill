/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.initpayablebill;

import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.pub.BusinessException;

public interface IArapInitPayablePubService {
    public void delete(AggPayableBillVO var1) throws BusinessException;

    public void delete(AggPayableBillVO[] var1) throws BusinessException;

    public AggPayableBillVO update(AggPayableBillVO var1) throws BusinessException;

    public AggPayableBillVO[] update(AggPayableBillVO[] var1) throws BusinessException;

    public AggPayableBillVO save(AggPayableBillVO var1) throws BusinessException;

    public AggPayableBillVO[] save(AggPayableBillVO[] var1) throws BusinessException;
}

