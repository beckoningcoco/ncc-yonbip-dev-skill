/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.supreceivable;

import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.pub.BusinessException;

public interface IArapSupReceivableBillPubQueryService {
    public BaseAggVO[] findBillByPrimaryKey(String[] var1) throws BusinessException;
}

