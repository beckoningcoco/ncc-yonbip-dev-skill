/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.logging.Logger
 *  nc.jdbc.framework.processor.ArrayProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 */
package nc.vo.pub.lang;

import nc.bs.dao.BaseDAO;
import nc.bs.logging.Logger;
import nc.jdbc.framework.processor.ArrayProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;

public class UFDateDao {
    private static final String TIME_ZONE_TABLE = "sm_time_zone";

    public String query() {
        String result = null;
        try {
            String querySql = "select issensitive from sm_time_zone";
            Logger.debug((Object)("execute query sm_time_zone SQL:" + querySql));
            Object[] arr = (Object[])new BaseDAO().executeQuery(querySql.toString(), (ResultSetProcessor)new ArrayProcessor());
            if (arr != null && arr.length > 0) {
                result = (String)arr[0];
            } else {
                Logger.debug((Object)"not found sm_time_zone information");
            }
        }
        catch (Exception e) {
            Logger.error((Object)"query table sm_time_zone error!", (Throwable)e);
        }
        return result;
    }
}

