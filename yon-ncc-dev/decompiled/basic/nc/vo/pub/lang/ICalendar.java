/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.lang;

import java.text.DateFormat;
import java.util.TimeZone;

public interface ICalendar {
    public static final long MILLIS_PER_DAY = 86400000L;
    public static final int MILLIS_PER_HOUR = 3600000;
    public static final int MILLIS_PER_MINUTE = 60000;
    public static final int MILLIS_PER_SECOND = 1000;
    public static final String STD_DATE_FORMAT = "yyyy-MM-dd";
    public static final String STD_TIME_FORMAT = "HH:mm:ss";
    public static final String STD_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String[] MONTH_SYM = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] WEEK_SYM = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    public static final int[] MONTH_LENGTH = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final int[] LEAP_MONTH_LENGTH = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final TimeZone BASE_TIMEZONE = TimeZone.getTimeZone(System.getProperty("user.timezone", "GMT+08:00"));

    public String toStdString();

    public String toStdString(TimeZone var1);

    public String toString(TimeZone var1, DateFormat var2);

    public long getMillis();

    public String toString();

    public String toPersisted();
}

