/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.initreceivable;

import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public interface IArapInitRecPubService {
    public AggregatedValueObject[] save(AggregatedValueObject[] var1) throws BusinessException;

    public void delete(AggregatedValueObject[] var1) throws BusinessException;

    public AggregatedValueObject update(AggregatedValueObject var1) throws BusinessException;
}

