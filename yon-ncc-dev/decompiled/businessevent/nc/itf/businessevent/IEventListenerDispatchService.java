/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.Saga
 *  com.yonyou.cloud.middleware.rpc.Async
 *  nc.vo.pub.BusinessException
 */
package nc.itf.businessevent;

import com.yonyou.cloud.Saga;
import com.yonyou.cloud.middleware.rpc.Async;
import java.util.List;
import nc.bs.businessevent.IBusinessEvent;
import nc.vo.pub.BusinessException;
import nc.vo.uap.businessevent.UnionVO;

public interface IEventListenerDispatchService {
    @Async
    @Saga
    public void asynEventListenerDispatch(List<UnionVO> var1, IBusinessEvent var2) throws BusinessException;

    @Async
    @Saga
    public void asynEventListenerDispatch(byte[] var1, byte[] var2) throws BusinessException;

    public void synEventListenerDispatch(List<UnionVO> var1, IBusinessEvent var2) throws BusinessException;

    public void synEventListenerDispatch(byte[] var1, byte[] var2) throws BusinessException;

    @Async
    @Saga
    public Object asynListenerClassDispatch(String var1, String var2, Object ... var3) throws BusinessException;

    public Object synListenerClassDispatch(String var1, String var2, Object ... var3) throws BusinessException;
}

