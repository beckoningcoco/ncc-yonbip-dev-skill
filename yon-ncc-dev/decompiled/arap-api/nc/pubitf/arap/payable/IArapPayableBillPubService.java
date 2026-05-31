/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.cloud.Saga
 *  com.yonyou.cloud.middleware.rpc.Async
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.payable;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.cloud.Saga;
import com.yonyou.cloud.middleware.rpc.Async;
import java.util.List;
import java.util.Map;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.pub.BusinessException;

public interface IArapPayableBillPubService {
    public AggPayableBillVO[] saveTemp(AggPayableBillVO[] var1) throws BusinessException;

    public void deleteBillByPurchaseInvoices(String[] var1) throws BusinessException;

    @Async
    @Saga
    public void deleteBillBySourcePK(String[] var1) throws BusinessException;

    @Async
    @Saga
    public void deleteBillBySourceitemPK(String[] var1) throws BusinessException;

    public void delete(AggPayableBillVO var1) throws BusinessException;

    public void delete(AggPayableBillVO[] var1) throws BusinessException;

    public AggPayableBillVO update(AggPayableBillVO var1) throws BusinessException;

    public AggPayableBillVO[] update(AggPayableBillVO[] var1) throws BusinessException;

    @Async
    @Saga
    public AggPayableBillVO save(AggPayableBillVO var1) throws BusinessException;

    @Async
    @Saga
    public AggPayableBillVO[] save(AggPayableBillVO[] var1) throws BusinessException;

    public AggPayableBillVO[] approve(AggPayableBillVO[] var1) throws BusinessException;

    public AggPayableBillVO approve(AggPayableBillVO var1) throws BusinessException;

    public Map<String, List<JSONObject>> constructJsonForF1(String[] var1) throws BusinessException;
}

