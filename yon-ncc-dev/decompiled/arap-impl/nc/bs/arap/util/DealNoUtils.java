/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.arap.util;

import java.util.Calendar;
import java.util.Date;

public class DealNoUtils {
    public static Long createDealNo() {
        long t = 0L;
        long time = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        Date d = new Date(time);
        calendar.setTime(d);
        int year = calendar.get(1);
        int month = calendar.get(2) + 1;
        int date = calendar.get(5);
        int hour = calendar.get(11);
        int minute = calendar.get(12);
        int second = calendar.get(13);
        int millisecond = calendar.get(14);
        t += (long)year;
        t *= 100L;
        t += (long)month;
        t *= 100L;
        t += (long)date;
        t *= 100L;
        t += (long)hour;
        t *= 100L;
        t += (long)minute;
        t *= 100L;
        t += (long)second;
        t *= 1000L;
        return t += (long)millisecond;
    }
}

