/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.lang;

import java.io.Serializable;
import java.sql.Date;
import java.text.DateFormat;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import nc.vo.pub.lang.Calendars;
import nc.vo.pub.lang.ICalendar;
import nc.vo.pub.lang.UFDateCfg;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFLiteralDate;

public final class UFDate
implements Serializable,
Comparable<UFDate>,
ICalendar {
    private static final long serialVersionUID = 1L;
    private static final int LRUSIZE = 500;
    private long utcTime;
    private static final Map<String, UFDate> allUsedDate1 = Collections.synchronizedMap(new LRUMap(512));
    public static int num = 0;
    private static ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    public UFDate() {
        this(System.currentTimeMillis());
    }

    public UFDate(long m) {
        this.utcTime = m;
        this.utcTime -= this.utcTime % 1000L;
    }

    public UFDate(Date date) {
        this(date.getTime());
    }

    public UFDate(java.util.Date date) {
        this(date.getTime());
    }

    public UFDate(boolean begin) {
        GregorianCalendar cal = new GregorianCalendar(Calendars.getGMTDefault());
        cal.setTimeInMillis(System.currentTimeMillis());
        if (begin) {
            cal.set(11, 0);
            cal.set(12, 0);
            cal.set(13, 0);
            cal.set(14, 0);
        } else {
            cal.set(11, 23);
            cal.set(12, 59);
            cal.set(13, 59);
            cal.set(14, 0);
        }
        this.utcTime = cal.getTimeInMillis();
    }

    public UFDate(String date, boolean begin) {
        int[] v = UFDate.internalParse(date);
        GregorianCalendar cal = null;
        cal = begin ? new GregorianCalendar(v[0], v[1] - 1, v[2]) : new GregorianCalendar(v[0], v[1] - 1, v[2], 23, 59, 59);
        this.utcTime = cal.getTimeInMillis();
    }

    public UFDate(String date) {
        int[] v = UFDate.internalParse(date);
        this.utcTime = new GregorianCalendar(v[0], v[1] - 1, v[2]).getTimeInMillis();
    }

    public UFDate(String date, TimeZone zone, boolean begin) {
        zone = Calendars.getGMTTimeZone(zone);
        int[] v = UFDate.internalParse(date);
        GregorianCalendar cal = new GregorianCalendar(zone);
        cal.set(1, v[0]);
        cal.set(2, v[1] - 1);
        cal.set(5, v[2]);
        if (begin) {
            cal.set(11, 0);
            cal.set(12, 0);
            cal.set(13, 0);
            cal.set(14, 0);
        } else {
            cal.set(11, 23);
            cal.set(12, 59);
            cal.set(13, 59);
            cal.set(14, 0);
        }
        this.utcTime = cal.getTimeInMillis();
    }

    public UFDate(String date, TimeZone zone) {
        zone = Calendars.getGMTTimeZone(zone);
        int[] v = UFDate.internalParse(date);
        GregorianCalendar cal = new GregorianCalendar(zone);
        cal.set(1, v[0]);
        cal.set(2, v[1] - 1);
        cal.set(5, v[2]);
        cal.set(11, 0);
        cal.set(12, 0);
        cal.set(13, 0);
        cal.set(14, 0);
        this.utcTime = cal.getTimeInMillis();
    }

    public boolean after(UFDate when) {
        return this.compareTo(when) > 0;
    }

    public boolean afterDate(UFDate when) {
        return this.compareTo(when) > 0 && !this.isSameDate(when);
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

    public int ufCompareTo(UFDate when) {
        boolean isSensitive = UFDateCfg.isSensitiveTimeZone();
        if (isSensitive) {
            return this.compareTo(when);
        }
        return this.compareToDay(when);
    }

    public boolean before(UFDate when) {
        return this.compareTo(when) < 0;
    }

    public boolean beforeDate(UFDate when) {
        return this.compareTo(when) < 0 && !this.isSameDate(when);
    }

    public Object clone() {
        return new UFDate(this.utcTime);
    }

    public int compareToDay(UFDate when) {
        long retl = this.utcTime - when.utcTime;
        if (retl == 0L || this.isSameDate(when)) {
            return 0;
        }
        return retl > 0L ? 1 : -1;
    }

    @Override
    public int compareTo(UFDate when) {
        long retl = this.utcTime - when.utcTime;
        if (retl == 0L) {
            return 0;
        }
        return retl > 0L ? 1 : -1;
    }

    public boolean equals(Object o) {
        if (o != null && o instanceof UFDate) {
            return this.utcTime == ((UFDate)o).utcTime;
        }
        return false;
    }

    public boolean isSameDate(UFDate o) {
        GregorianCalendar cal = new GregorianCalendar(BASE_TIMEZONE);
        cal.setTimeInMillis(o.getMillis());
        GregorianCalendar basezoneCalendar = this.basezoneCalendar();
        return basezoneCalendar.get(1) == cal.get(1) && basezoneCalendar.get(2) == cal.get(2) && basezoneCalendar.get(5) == cal.get(5);
    }

    public boolean isSameDate(UFDate o, TimeZone zone) {
        zone = Calendars.getGMTTimeZone(zone);
        GregorianCalendar cal = new GregorianCalendar(zone);
        cal.setTimeInMillis(o.getMillis());
        GregorianCalendar cal1 = this.getCalendar(zone);
        return cal1.get(1) == cal.get(1) && cal1.get(2) == cal.get(2) && cal1.get(5) == cal.get(5);
    }

    public static UFDate getDate(long d) {
        d -= d % 1000L;
        return UFDate.getDate((Long)d);
    }

    public static UFDate getDate(String strDate) {
        return new UFDate(strDate);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static UFDate getDate(String strDate, TimeZone zone, boolean begin) {
        if (rwl.readLock().tryLock()) {
            try {
                String key = strDate + zone.getID() + begin;
                UFDate o = allUsedDate1.get(key);
                if (o == null) {
                    UFDate n = new UFDate(strDate, zone, begin);
                    rwl.readLock().unlock();
                    rwl.writeLock().lock();
                    try {
                        o = n;
                        allUsedDate1.put(key, o);
                    }
                    finally {
                        rwl.readLock().lock();
                        rwl.writeLock().unlock();
                    }
                }
                UFDate uFDate = o;
                return uFDate;
            }
            finally {
                rwl.readLock().unlock();
            }
        }
        return new UFDate(strDate, zone, begin);
    }

    public static UFDate getDate(java.util.Date date) {
        return new UFDate(date);
    }

    public static UFDate getDate(Long date) {
        return new UFDate(date);
    }

    public UFDate asBegin() {
        return this.asBegin(BASE_TIMEZONE);
    }

    public UFDate asBegin(TimeZone zone) {
        GregorianCalendar calendar = this.getCalendar(zone);
        if (0 == calendar.get(11) && 0 == calendar.get(12) && 0 == calendar.get(13)) {
            return this;
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return new UFDate(calendar.getTimeInMillis());
    }

    public UFDate asLocalBegin() {
        return this.asBegin(Calendars.getGMTDefault());
    }

    public UFDate asEnd() {
        return this.asEnd(BASE_TIMEZONE);
    }

    public UFDate asEnd(TimeZone zone) {
        GregorianCalendar calendar = this.getCalendar(zone);
        if (23 == calendar.get(11) && 59 == calendar.get(12) && 59 == calendar.get(13)) {
            return this;
        }
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return new UFDate(calendar.getTimeInMillis());
    }

    public UFDate asLocalEnd() {
        return this.asEnd(Calendars.getGMTDefault());
    }

    public UFDate getDateAfter(int days) {
        long l = this.utcTime + 86400000L * (long)days;
        return new UFDate(l);
    }

    public UFDate getDateBefore(int days) {
        return this.getDateAfter(-days);
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

    public int getYear() {
        return this.basezoneCalendar().get(1);
    }

    public int getLocalYear() {
        return this.localCalendar().get(1);
    }

    public int getYear(TimeZone zone) {
        return this.getCalendar(zone).get(1);
    }

    public int getDaysAfter(UFDate when) {
        int days = 0;
        if (when != null) {
            days = (int)((this.utcTime - when.utcTime) / 86400000L);
        }
        return days;
    }

    public static int getDaysBetween(UFDate begin, UFDate end) {
        if (begin != null && end != null) {
            return (int)((end.utcTime - begin.utcTime) / 86400000L);
        }
        throw new IllegalArgumentException("Dates to compare can't be null");
    }

    public int getDaysMonth() {
        return UFDate.getDaysMonth(this.getYear(), this.getMonth());
    }

    public String getEnMonth() {
        return MONTH_SYM[this.basezoneCalendar().get(2)];
    }

    public String getEnWeek() {
        return WEEK_SYM[this.getWeek()];
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

    public int getWeek() {
        int days = this.getDaysAfter(new UFDate("1980-01-06"));
        int week = days % 7;
        if (week < 0) {
            week += 7;
        }
        return week;
    }

    public String getStrMonth() {
        return this.toString().substring(5, 7);
    }

    public String getStrDay() {
        return this.toString().substring(8, 10);
    }

    public boolean isLeapYear() {
        return UFDate.isLeapYear(this.getYear());
    }

    public int getWeekOfYear() {
        return this.basezoneCalendar().get(3);
    }

    public java.util.Date toDate() {
        return new java.util.Date(this.utcTime);
    }

    public UFLiteralDate toUFLiteralDate(TimeZone zone) {
        zone = Calendars.getGMTTimeZone(zone);
        return new UFLiteralDate(this.toStdString(zone));
    }

    public int hashCode() {
        return (int)(this.utcTime ^ this.utcTime >>> 32);
    }

    @Override
    public String toPersisted() {
        GregorianCalendar cal = new GregorianCalendar(BASE_TIMEZONE);
        cal.setTimeInMillis(this.utcTime);
        return UFDateTime.toDateTimeString(cal.get(1), cal.get(2) + 1, cal.get(5), cal.get(11), cal.get(12), cal.get(13));
    }

    public static UFDate fromPersisted(String s) {
        return new UFDateTime(s, ICalendar.BASE_TIMEZONE).getDate();
    }

    @Override
    public String toStdString() {
        return this.toStdString(BASE_TIMEZONE);
    }

    @Override
    public String toStdString(TimeZone zone) {
        GregorianCalendar cal = new GregorianCalendar(zone);
        cal.setTimeInMillis(this.utcTime);
        return UFDate.toDateString(cal.get(1), cal.get(2) + 1, cal.get(5));
    }

    @Override
    public String toString(TimeZone zone, DateFormat format) {
        zone = Calendars.getGMTTimeZone(zone);
        java.util.Date dt = new java.util.Date(this.utcTime);
        format.setTimeZone(zone);
        return format.format(dt);
    }

    @Override
    public String toString() {
        return this.toPersisted();
    }

    public String toLocalString() {
        GregorianCalendar localCalendar = this.localCalendar();
        return UFDate.toDateString(localCalendar.get(1), localCalendar.get(2) + 1, localCalendar.get(5));
    }

    @Override
    public long getMillis() {
        return this.utcTime;
    }

    static int[] internalParse(String str) {
        if (str == null) {
            throw new IllegalArgumentException("invalid date: " + str);
        }
        int spaceIndex = (str = str.trim()).indexOf(32);
        if (spaceIndex > -1) {
            str = str.substring(0, spaceIndex);
        }
        String[] tokens = new String[3];
        StringTokenizer st = new StringTokenizer(str, "-/");
        if (st.countTokens() != 3) {
            throw new IllegalArgumentException("invalid date: " + str);
        }
        int i = 0;
        while (st.hasMoreTokens()) {
            tokens[i++] = st.nextToken();
        }
        try {
            int daymax;
            int year = Integer.parseInt(tokens[0]);
            int month = Integer.parseInt(tokens[1]);
            if (month < 1 || month > 12) {
                throw new IllegalArgumentException("invalid date: " + str);
            }
            int day = Integer.parseInt(tokens[2]);
            int n = daymax = UFDate.isLeapYear(year) ? LEAP_MONTH_LENGTH[month - 1] : MONTH_LENGTH[month - 1];
            if (day < 1 || day > daymax) {
                throw new IllegalArgumentException("invalid date: " + str);
            }
            return new int[]{year, month, day};
        }
        catch (Throwable thr) {
            if (thr instanceof IllegalArgumentException) {
                throw (IllegalArgumentException)thr;
            }
            throw new IllegalArgumentException("invalid date: " + str);
        }
    }

    public static int getDaysMonth(int year, int month) {
        if (UFDate.isLeapYear(year)) {
            return LEAP_MONTH_LENGTH[month - 1];
        }
        return MONTH_LENGTH[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
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
        GregorianCalendar basezoneCalendar = new GregorianCalendar(zone);
        basezoneCalendar.setTimeInMillis(this.utcTime);
        return basezoneCalendar;
    }

    private static String toDateString(int year, int month, int day) {
        String strDay;
        String strYear = String.valueOf(year);
        for (int j = strYear.length(); j < 4; ++j) {
            strYear = "0" + strYear;
        }
        String strMonth = String.valueOf(month);
        if (strMonth.length() < 2) {
            strMonth = "0" + strMonth;
        }
        if ((strDay = String.valueOf(day)).length() < 2) {
            strDay = "0" + strDay;
        }
        return strYear + "-" + strMonth + "-" + strDay;
    }

    static {
        Calendars.getGMTDefault();
    }

    private static class LRUMap<K, V>
    extends LinkedHashMap<K, V> {
        private static final long serialVersionUID = 1L;

        public LRUMap(int initSize) {
            super(initSize, 1.0f, true);
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
            return this.size() > 500;
        }
    }
}

