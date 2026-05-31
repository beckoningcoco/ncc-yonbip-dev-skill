/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.cuspayable;

import nc.vo.arap.cuspayable.AggCusPayableBillVO;
import nc.vo.pub.BusinessException;

public interface IArapCusPayableBillPubQueryService {
    public AggCusPayableBillVO[] findBillByPrimaryKey(String[] var1) throws BusinessException;
}

