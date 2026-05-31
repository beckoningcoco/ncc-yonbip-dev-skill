/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.logging.Debug
 */
package nc.vo.trade.voutils;

import java.util.Date;
import nc.vo.logging.Debug;

public class TimeCounter {
    Date d1 = new Date();
    Date d2;
    String message;

    public TimeCounter(String msg) {
        this.message = msg;
        Debug.debug((Object)(msg + " Starting...."));
    }

    public void close() {
        this.d2 = new Date();
        Debug.debug((Object)(this.message + " End and Time-consuming " + (this.d2.getTime() - this.d1.getTime()) + "ms"));
    }
}

