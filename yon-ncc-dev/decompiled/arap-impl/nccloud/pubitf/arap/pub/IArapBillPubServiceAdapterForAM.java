/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.Saga
 *  com.yonyou.cloud.middleware.rpc.Async
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nccloud.pubitf.arap.pub;

import com.yonyou.cloud.Saga;
import com.yonyou.cloud.middleware.rpc.Async;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public interface IArapBillPubServiceAdapterForAM {
    @Async
    @Saga
    public AggregatedValueObject[] combinSaveForEWM(AggregatedValueObject[] var1) throws BusinessException;

    @Async
    @Saga
    public void combinDeleteForEWM(AggregatedValueObject[] var1) throws BusinessException;
}

