/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.web.arap.bill.pub;

import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.pub.BusinessException;

public interface IArapBillPubQueryService {
    public BaseAggVO[] findBillByPrimaryKey(String[] var1) throws BusinessException;
}

