/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.cuspayable;

import nc.vo.arap.cuspayable.AggCusPayableBillVO;
import nc.vo.pub.BusinessException;

public interface IArapCusPayableBillPubService {
    public void delete(AggCusPayableBillVO var1) throws BusinessException;

    public void delete(AggCusPayableBillVO[] var1) throws BusinessException;

    public AggCusPayableBillVO update(AggCusPayableBillVO var1) throws BusinessException;

    public AggCusPayableBillVO[] update(AggCusPayableBillVO[] var1) throws BusinessException;

    public AggCusPayableBillVO save(AggCusPayableBillVO var1) throws BusinessException;

    public AggCusPayableBillVO[] save(AggCusPayableBillVO[] var1) throws BusinessException;

    public AggCusPayableBillVO[] approve(AggCusPayableBillVO[] var1) throws BusinessException;

    public AggCusPayableBillVO approve(AggCusPayableBillVO var1) throws BusinessException;
}

