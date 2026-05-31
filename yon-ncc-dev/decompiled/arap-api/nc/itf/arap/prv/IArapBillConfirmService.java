/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.prv;

import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public interface IArapBillConfirmService {
    public AggregatedValueObject updateConfirmInfo(BaseAggVO var1) throws BusinessException;

    public AggregatedValueObject updateCancelConfirmInfo(BaseAggVO var1) throws BusinessException;
}

