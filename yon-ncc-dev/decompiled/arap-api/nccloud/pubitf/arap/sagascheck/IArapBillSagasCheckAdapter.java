/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nccloud.pubitf.arap.sagascheck;

import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public interface IArapBillSagasCheckAdapter {
    public void billInsertSagasCheck(AggregatedValueObject ... var1) throws BusinessException;

    public void billDeleteSagasCheck(AggregatedValueObject ... var1) throws BusinessException;
}

