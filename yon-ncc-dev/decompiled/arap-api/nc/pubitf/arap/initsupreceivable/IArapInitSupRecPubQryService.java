/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.initsupreceivable;

import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.pub.BusinessException;

public interface IArapInitSupRecPubQryService {
    public BaseAggVO[] findBillByPrimaryKey(String[] var1) throws BusinessException;
}

