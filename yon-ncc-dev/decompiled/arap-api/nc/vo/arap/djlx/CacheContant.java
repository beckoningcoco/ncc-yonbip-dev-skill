/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.arap.djlx;

import java.util.ArrayList;

public class CacheContant {
    public static final String CLUSTER_MSG_HEADER_MESSAGETYPE = "fiCacheMsgtype";
    public static final String CLUSTER_MSG_HEADER_OPERATETYPE = "fiOpType";
    public static final String CLUSTER_MSG_HEADER_OPERATETYPE_UPDATECACHE = "update";
    public static final String MESSAGETYPE = "fiCacheMsg";
    private static volatile ArrayList<String> alOperateType = null;

    public static synchronized ArrayList<String> getOperateTypes() {
        if (alOperateType == null) {
            alOperateType = new ArrayList();
            alOperateType.add(CLUSTER_MSG_HEADER_OPERATETYPE_UPDATECACHE);
        }
        return alOperateType;
    }
}

