/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 */
package nc.vo.pub.lang;

import java.util.HashMap;
import java.util.Map;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.vo.pub.lang.UFDateDao;

public class UFDateCfg {
    private static boolean isSensitiveTimeZone;
    static UFDateDao ufdateDao;
    private static Map<String, String> dsTimeZoneMap;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static boolean isSensitiveTimeZone() {
        String dsname = InvocationInfoProxy.getInstance().getUserDataSource();
        String result = dsTimeZoneMap.get(dsname);
        if (result == null) {
            Class<UFDateCfg> clazz = UFDateCfg.class;
            // MONITORENTER : nc.vo.pub.lang.UFDateCfg.class
            if (result == null) {
                result = ufdateDao.query();
                dsTimeZoneMap.put(dsname, result);
            }
            // MONITOREXIT : clazz
        }
        if ("N".equalsIgnoreCase(result)) {
            isSensitiveTimeZone = false;
            return isSensitiveTimeZone;
        }
        isSensitiveTimeZone = true;
        return isSensitiveTimeZone;
    }

    static {
        ufdateDao = new UFDateDao();
        dsTimeZoneMap = new HashMap<String, String>();
    }
}

