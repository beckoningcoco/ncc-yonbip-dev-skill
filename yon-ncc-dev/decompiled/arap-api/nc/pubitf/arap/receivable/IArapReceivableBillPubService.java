/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.Saga
 *  com.yonyou.cloud.middleware.rpc.Async
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.receivable;

import com.yonyou.cloud.Saga;
import com.yonyou.cloud.middleware.rpc.Async;
import java.util.Map;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public interface IArapReceivableBillPubService {
    public AggReceivableBillVO[] saveTemp(AggReceivableBillVO[] var1) throws BusinessException;

    @Async
    @Saga
    public void deleteBillBySourcePK(String[] var1) throws BusinessException;

    @Async
    @Saga
    public void deleteBillBySourceitemPK(String[] var1) throws BusinessException;

    public Map<String, Boolean> findBillBySourcePk(String[] var1) throws BusinessException;

    @Async
    @Saga
    public void delete(AggReceivableBillVO[] var1) throws BusinessException;

    public void delete(AggReceivableBillVO var1) throws BusinessException;

    public AggregatedValueObject update(AggReceivableBillVO var1) throws BusinessException;

    public AggregatedValueObject[] update(AggReceivableBillVO[] var1) throws BusinessException;

    public AggReceivableBillVO save(AggReceivableBillVO var1) throws BusinessException;

    @Async
    @Saga
    public AggReceivableBillVO[] save(AggReceivableBillVO[] var1) throws BusinessException;

    public AggReceivableBillVO[] approve(AggReceivableBillVO[] var1) throws BusinessException;

    public AggReceivableBillVO approve(AggReceivableBillVO var1) throws BusinessException;

    public AggReceivableBillVO insertVO(AggReceivableBillVO var1) throws BusinessException;
}

