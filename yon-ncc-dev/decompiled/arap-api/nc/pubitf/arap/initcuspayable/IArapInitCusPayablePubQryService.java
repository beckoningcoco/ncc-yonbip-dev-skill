/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.initcuspayable;

import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.pub.BusinessException;

public interface IArapInitCusPayablePubQryService {
    public BaseAggVO[] findBillByPrimaryKey(String[] var1) throws BusinessException;
}

