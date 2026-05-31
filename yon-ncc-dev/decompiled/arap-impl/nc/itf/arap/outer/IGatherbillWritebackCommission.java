/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.outer;

import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.pub.BusinessException;

public interface IGatherbillWritebackCommission {
    public BaseAggVO[] writebackCommission(BaseAggVO[] var1) throws BusinessException;
}

