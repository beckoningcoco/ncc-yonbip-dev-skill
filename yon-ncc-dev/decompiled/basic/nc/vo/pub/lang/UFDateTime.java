/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.lang;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import nc.vo.pub.lang.Calendars;
import nc.vo.pub.lang.ICalendar;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateCfg;
import nc.vo.pub.lang.UFTime;

public final class UFDateTime
implements Serializable,
Comparable<UFDateTime>,
ICalendar {
    static final long serialVersionUID = -7539595826392466408L;
    private long utcTime;

    public UFDateTime() {
        this(System.currentTimeMillis());
    }

    public UFDateTime(long m) {
        this.utcTime = m;
        this.utcTime -= this.utcTime % 1000L;
    }

    public boolean ufBefore(UFDate when) {
        boolean isSensitive = UFDateCfg.isSensitiveTimeZone();
        if (isSensitive) {
            return this.before(when);
        }
        return this.beforeDate(when);
    }

    public boolean ufAfter(UFDate when) {
        boolean isSensitive = UFDateCfg.isSensitiveTimeZone();
        if (isSensitive) {
            return this.after(when);
        }
        return this.afterDate(when);
    }

    public UFDateTime(String date) {
        int[] t = UFDateTime.internalParse(date);
        this.utcTime = new GregorianCalendar(t[0], t[1] - 1, t[2], t[3], t[4], t[5]).getTimeInMillis();
    }

    public UFDateTime(String date, TimeZone zone) {
        zone = Calendars.getGMTTimeZone(zone);
        int[] t = UFDateTime.internalParse(date);
        GregorianCalendar cal = new GregorianCalendar(zone);
        cal.set(1, t[0]);
        cal.set(2, t[1] - 1);
        cal.set(5, t[2]);
        cal.set(11, t[3]);
        cal.set(12, t[4]);
        cal.set(13, t[5]);
        cal.set(14, 0);
        this.utcTime = cal.getTimeInMillis();
    }

    public UFDateTime(java.sql.Date date) {
        this((Date)date);
    }

    public UFDateTime(Date date) {
        this(date.getTime());
    }

    public UFDateTime(UFDate date, UFTime time) {
        if (null == date) {
            date = new UFDate(true);
        }
        if (null == time) {
            time = new UFTime();
        }
        this.utcTime = Calendars.getMillis(date, time, Calendars.getGMTDefault());
    }

    public boolean after(UFDateTime dateTime) {
        return this.utcTime - dateTime.utcTime > 0L;
    }

    public boolean before(UFDateTime dateTime) {
        return this.utcTime - dateTime.utcTime < 0L;
    }

    public Object clone() {
        return new UFDateTime(this.utcTime);
    }

    public int ufCompareTo(UFDateTime dateTime) {
        boolean isSensitive = UFDateCfg.isSensitiveTimeZone();
        if (isSensitive) {
            return this.compareTo(dateTime);
        }
        return this.compareToDay(dateTime);
    }

    public int compareToDay(UFDateTime dateTime) {
        long ret = this.utcTime - dateTime.utcTime;
        if (ret == 0L || this.isSameDate(dateTime.getDate())) {
            return 0;
        }
        return ret > 0L ? 1 : -1;
    }

    @Override
    public int compareTo(UFDateTime dateTime) {
        long ret = this.utcTime - dateTime.utcTime;
        if (ret == 0L) {
            return 0;
        }
        return ret > 0L ? 1 : -1;
    }

    public UFDate getDate() {
        return new UFDate(this.utcTime);
    }

    public UFDate getBeginDate() {
        return new UFDate(this.utcTime).asBegin();
    }

    public UFDate getEndDate() {
        return new UFDate(this.utcTime).asEnd();
    }

    public boolean after(UFDate when) {
        return this.getDate().compareTo(when) > 0;
    }

    public boolean afterDate(UFDate when) {
        return this.getDate().afterDate(when);
    }

    public boolean before(UFDate when) {
        return this.getDate().compareTo(when) < 0;
    }

    public boolean beforeDate(UFDate when) {
        return this.getDate().beforeDate(when);
    }

    public int dateCompare(UFDate when) {
        return this.getDate().compareTo(when);
    }

    public boolean isSameDate(UFDate when) {
        return this.getDate().isSameDate(when);
    }

    public boolean isSameDate(UFDate when, TimeZone zone) {
        return this.getDate().isSameDate(when, zone);
    }

    public int getDaysAfter(UFDate when) {
        if (when != null) {
            return (int)((this.utcTime - when.getMillis()) / 86400000L);
        }
        return 0;
    }

    public UFDateTime getDateTimeAfter(int days) {
        return new UFDateTime(this.utcTime + 86400000L * (long)days);
    }

    public UFDateTime getDateTimeBefore(int days) {
        return this.getDateTimeAfter(-days);
    }

    public int getDay() {
        return this.basezoneCalendar().get(5);
    }

    public int getLocalDay() {
        return this.localCalendar().get(5);
    }

    public int getDay(TimeZone zone) {
        return this.getCalendar(zone).get(5);
    }

    public int getDaysAfter(UFDateTime when) {
        int days = 0;
        if (when != null) {
            days = (int)((this.utcTime - when.getMillis()) / 86400000L);
        }
        return days;
    }

    public static int getDaysBetween(UFDate begin, UFDate end) {
        if (begin != null && end != null) {
            return (int)((end.getMillis() - begin.getMillis()) / 86400000L);
        }
        return 0;
    }

    public static int getHoursBetween(UFDateTime begin, UFDateTime end) {
        return (int)(UFDateTime.getMilisBetween(begin, end) / 3600000L);
    }

    public static int getMinutesBetween(UFDateTime begin, UFDateTime end) {
        return (int)(UFDateTime.getMilisBetween(begin, end) / 60000L);
    }

    public static int getSecondsBetween(UFDateTime begin, UFDateTime end) {
        return (int)(UFDateTime.getMilisBetween(begin, end) / 1000L);
    }

    private static long getMilisBetween(UFDateTime begin, UFDateTime end) {
        return end.utcTime - begin.utcTime;
    }

    public static int getDaysBetween(UFDate begin, UFDateTime end) {
        return UFDateTime.getDaysBetween(begin, end.getDate());
    }

    public static int getDaysBetween(UFDateTime begin, UFDate end) {
        return UFDateTime.getDaysBetween(begin.getDate(), end);
    }

    public static int getDaysBetween(UFDateTime begin, UFDateTime end) {
        return UFDateTime.getDaysBetween(begin.getDate(), end.getDate());
    }

    public int getDaysMonth() {
        GregorianCalendar baseCal = this.basezoneCalendar();
        return UFDateTime.getDaysMonth(baseCal.get(1), baseCal.get(2) + 1);
    }

    public static int getDaysMonth(int year, int month) {
        if (UFDateTime.isLeapYear(year)) {
            return LEAP_MONTH_LENGTH[month - 1];
        }
        return MONTH_LENGTH[month - 1];
    }

    public String getEnMonth() {
        return MONTH_SYM[this.basezoneCalendar().get(2)];
    }

    public String getEnWeek() {
        return WEEK_SYM[this.getWeek()];
    }

    public int getWeek() {
        return this.basezoneCalendar().get(7) - 1;
    }

    public int getYear() {
        return this.basezoneCalendar().get(1);
    }

    public int getLocalYear() {
        return this.localCalendar().get(1);
    }

    public int getYear(TimeZone zone) {
        return this.getCalendar(zone).get(1);
    }

    public int getMonth() {
        return this.basezoneCalendar().get(2) + 1;
    }

    public int getLocalMonth() {
        return this.localCalendar().get(2) + 1;
    }

    public int getMonth(TimeZone zone) {
        return this.getCalendar(zone).get(2) + 1;
    }

    public int getHour() {
        return this.basezoneCalendar().get(11);
    }

    public int getLocalHour() {
        return this.localCalendar().get(11);
    }

    public int getHout(TimeZone zone) {
        return this.getCalendar(zone).get(11);
    }

    public int getMinute() {
        return this.basezoneCalendar().get(12);
    }

    public int getLocalMinute() {
        return this.localCalendar().get(12);
    }

    public int getMinute(TimeZone zone) {
        return this.getCalendar(zone).get(12);
    }

    public int getSecond() {
        return this.basezoneCalendar().get(13);
    }

    @Override
    public long getMillis() {
        return this.utcTime;
    }

    public long getMillisAfter(UFDateTime dateTime) {
        if (dateTime != null) {
            return this.utcTime - dateTime.utcTime;
        }
        throw new IllegalArgumentException("date time can't be null");
    }

    public String getStrMonth() {
        int month = this.getMonth();
        if (month > 0 && month < 10) {
            return "0" + Integer.toString(month);
        }
        if (month >= 10 && month < 13) {
            return Integer.toString(month);
        }
        return null;
    }

    public String getStrDay() {
        int day = this.getDay();
        if (day > 0 && day < 10) {
            return "0" + Integer.toString(day);
        }
        if (day >= 10 && day < 32) {
            return Integer.toString(day);
        }
        return null;
    }

    public String getTime() {
        return this.toString().substring(11, 19);
    }

    public UFTime getUFTime() {
        return new UFTime(this.utcTime);
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    public boolean isLeapYear() {
        return UFDateTime.isLeapYear(this.getYear());
    }

    public int getWeekOfYear() {
        return this.basezoneCalendar().get(3);
    }

    @Override
    public String toString() {
        GregorianCalendar baseCalendar = this.basezoneCalendar();
        return UFDateTime.toDateTimeString(baseCalendar.get(1), baseCalendar.get(2) + 1, baseCalendar.get(5), baseCalendar.get(11), baseCalendar.get(12), baseCalendar.get(13));
    }

    public String toLocalString() {
        GregorianCalendar localCalendar = this.localCalendar();
        return UFDateTime.toDateTimeString(localCalendar.get(1), localCalendar.get(2) + 1, localCalendar.get(5), localCalendar.get(11), localCalendar.get(12), localCalendar.get(13));
    }

    @Override
    public String toString(TimeZone zone, DateFormat format) {
        zone = Calendars.getGMTTimeZone(zone);
        Date dt = new Date(this.utcTime);
        format.setTimeZone(zone);
        return format.format(dt);
    }

    @Override
    public String toStdString() {
        return this.toStdString(BASE_TIMEZONE);
    }

    @Override
    public String toStdString(TimeZone zone) {
        if ((zone = Calendars.getGMTTimeZone(zone)).equals(Calendars.getGMTDefault())) {
            return this.toString();
        }
        GregorianCalendar cal = new GregorianCalendar(zone);
        cal.setTimeInMillis(this.utcTime);
        return UFDateTime.toDateTimeString(cal.get(1), cal.get(2) + 1, cal.get(5), cal.get(11), cal.get(12), cal.get(13));
    }

    public boolean equals(Object o) {
        if (o != null && o instanceof UFDateTime) {
            return this.utcTime == ((UFDateTime)o).utcTime;
        }
        return false;
    }

    public int hashCode() {
        return (int)(this.utcTime ^ this.utcTime >>> 32);
    }

    private GregorianCalendar localCalendar() {
        GregorianCalendar localCalendar = new GregorianCalendar(Calendars.getGMTDefault());
        localCalendar.setTimeInMillis(this.utcTime);
        return localCalendar;
    }

    private GregorianCalendar basezoneCalendar() {
        GregorianCalendar basezoneCalendar = new GregorianCalendar(BASE_TIMEZONE);
        basezoneCalendar.setTimeInMillis(this.utcTime);
        return basezoneCalendar;
    }

    private GregorianCalendar getCalendar(TimeZone zone) {
        zone = Calendars.getGMTTimeZone(zone);
        GregorianCalendar localCalendar = new GregorianCalendar(zone);
        localCalendar.setTimeInMillis(this.utcTime);
        return localCalendar;
    }

    static String toDateTimeString(int year, int month, int day, int hour, int minute, int second) {
        StringBuffer sb = new StringBuffer();
        String strYear = String.valueOf(year);
        for (int j = strYear.length(); j < 4; ++j) {
            sb.append('0');
        }
        sb.append(strYear).append('-');
        UFDateTime.append(sb, month, '-');
        UFDateTime.append(sb, day, ' ');
        UFDateTime.append(sb, hour, ':');
        UFDateTime.append(sb, minute, ':');
        if (second < 10) {
            sb.append('0');
        }
        sb.append(second);
        return sb.toString();
    }

    private static void append(StringBuffer sb, int v, char split) {
        if (v < 10) {
            sb.append('0');
        }
        sb.append(v).append(split);
    }

    static int[] internalParse(String str) {
        if (str == null) {
            throw new IllegalArgumentException("invalid UFDateTime: " + str);
        }
        int index = (str = str.trim()).indexOf(32);
        if (index < 0 || index > str.length() - 1) {
            throw new IllegalArgumentException("invalid UFDateTime: " + str);
        }
        int[] d = UFDate.internalParse(str);
        int[] t = UFTime.internalParse(str, index + 1);
        int[] a = new int[6];
        System.arraycopy(d, 0, a, 0, d.length);
        System.arraycopy(t, 0, a, d.length, t.length);
        return a;
    }

    @Override
    public String toPersisted() {
        return this.toStdString();
    }

    static {
        Calendars.getGMTDefault();
    }
}

