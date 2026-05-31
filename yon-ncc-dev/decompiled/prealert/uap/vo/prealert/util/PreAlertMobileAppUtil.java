/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  nc.bs.mapp.conf.MappConfAccessor
 *  nc.bs.pf.pub.PFRequestDataCacheProxy
 *  nc.bs.pf.pub.cache.IRequestDataCacheKey
 */
package uap.vo.prealert.util;

import nc.bs.logging.Logger;
import nc.bs.mapp.conf.MappConfAccessor;
import nc.bs.pf.pub.PFRequestDataCacheProxy;
import nc.bs.pf.pub.cache.IRequestDataCacheKey;
import nc.vo.pf.mobileapp.query.BillVORowCountKey;

public class PreAlertMobileAppUtil {
    public static final Integer TRIM_TO_COUNT = 50;

    public static Integer getRowCount() {
        Object rowCount = PFRequestDataCacheProxy.get((IRequestDataCacheKey)new BillVORowCountKey());
        if (rowCount != null && rowCount instanceof Integer) {
            return (Integer)rowCount;
        }
        return 0;
    }

    public static void setRowCount(Integer cnt) {
        BillVORowCountKey key = new BillVORowCountKey();
        PFRequestDataCacheProxy.put((IRequestDataCacheKey)key, (Object)cnt);
    }

    public static String getMaHost() {
        return MappConfAccessor.getInstance().getMappHost();
    }

    public static int getMaPort() {
        try {
            return Integer.parseInt(MappConfAccessor.getInstance().getMappPort());
        }
        catch (Throwable e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            return 8090;
        }
    }

    public static String getMaPushServlet() {
        String servlet = MappConfAccessor.getInstance().getProperty("mapurl");
        String url = "/" + servlet;
        return url;
    }

    public static String getMaPushServiceCode() {
        return MappConfAccessor.getInstance().getProperty("mapmessageserviceid");
    }
}

