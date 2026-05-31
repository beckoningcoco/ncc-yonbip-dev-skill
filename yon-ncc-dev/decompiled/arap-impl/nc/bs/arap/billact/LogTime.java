/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Log
 */
package nc.bs.arap.billact;

import nc.bs.logging.Log;

public class LogTime {
    public static void debug(String messgae, long start) {
        Log.getInstance(LogTime.class).debug((Object)(messgae + "\u6240\u7528\u65f6\u95f4:" + (System.currentTimeMillis() - start) + " ms."));
    }
}

