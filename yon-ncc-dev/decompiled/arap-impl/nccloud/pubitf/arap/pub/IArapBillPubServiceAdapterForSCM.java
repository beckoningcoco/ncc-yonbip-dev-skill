/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.Saga
 *  com.yonyou.cloud.middleware.rpc.Async
 *  nc.vo.pub.BusinessException
 */
package nccloud.pubitf.arap.pub;

import com.yonyou.cloud.Saga;
import com.yonyou.cloud.middleware.rpc.Async;
import java.util.List;
import java.util.Map;
import nc.vo.pub.BusinessException;

public interface IArapBillPubServiceAdapterForSCM {
    public static final String F0_NORMAL = "F0_NORMAL";
    public static final String F0_NORMAL_DETAIL = "F0_NORMAL_DETAIL";
    public static final String F1_NORMAL = "F1_NORMAL";
    public static final String E0_NORMAL = "23E0_NORMAL";
    public static final String E0_VERIFY = "23E0_VERIFY";
    public static final String E1_NORMAL = "23E1_NORMAL";
    public static final String E1_VERIFY = "23E1_VERIFY";

    @Async
    @Saga
    public Map<String, List<Object>> combinSaveForTO(Map<String, List<Object>> var1) throws BusinessException;

    @Async
    @Saga
    public void combinUnSaveForTO(Map<String, Object> var1) throws BusinessException;

    @Async
    @Saga
    public Map<String, Object[]> combinSaveForSO(Map<String, Object> var1) throws BusinessException;

    @Async
    @Saga
    public void combinUnSaveForSO(Map<String, Object> var1) throws BusinessException;
}

