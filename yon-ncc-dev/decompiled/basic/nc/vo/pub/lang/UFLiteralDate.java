/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.lang;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TimeZone;
import nc.vo.pub.lang.Calendars;
import nc.vo.pub.lang.ICalendar;

public final class UFLiteralDate
implements Serializable,
Comparable<UFLiteralDate>,
ICalendar {
    private static final long serialVersionUID = 1L;
    private static final int LRUSIZE = 500;
    private long utcTime;
    private transient GregorianCalendar basezoneCalendar;
    private static final Map<String, UFLiteralDate> allUsedDate1 = Collections.synchronizedMap(new LRUMap(512));
    public static int num = 0;

    public UFLiteralDate() {
        this(System.currentTimeMillis());
    }

    public UFLiteralDate(long m) {
        this.utcTime = m;
        this.utcTime -= this.utcTime % 1000L;
    }

    public UFLiteralDate(String date) {
        int[] v = UFLiteralDate.internalParse(date);
        GregorianCalendar cal = new GregorianCalendar(BASE_TIMEZONE);
        cal.set(1, v[0]);
        cal.set(2, v[1] - 1);
        cal.set(5, v[2]);
        cal.set(11, 0);
        cal.set(12, 0);
        cal.set(13, 0);
        cal.set(14, 0);
        this.utcTime = cal.getTimeInMillis();
        this.basezoneCalendar = cal;
    }

    public boolean after(UFLiteralDate when) {
        return this.compareTo(when) > 0;
    }

    public boolean afterDate(UFLiteralDate when) {
        return this.compareTo(when) > 0 && !this.isSameDate(when);
    }

    public boolean before(UFLiteralDate when) {
        return this.compareTo(when) < 0;
    }

    public boolean beforeDate(UFLiteralDate when) {
        return this.compareTo(when) < 0 && !this.isSameDate(when);
    }

    public Object clone() {
        return new UFLiteralDate(this.utcTime);
    }

    @Override
    public int compareTo(UFLiteralDate when) {
        long retl = this.utcTime - when.utcTime;
        if (retl == 0L) {
            return 0;
        }
        return retl > 0L ? 1 : -1;
    }

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        return this.toString().equals(o.toString());
    }

    public boolean isSameDate(UFLiteralDate o) {
        return this.equals(o);
    }

    public UFLiteralDate getDateAfter(int days) {
        long l = this.utcTime + 86400000L * (long)days;
        return new UFLiteralDate(l);
    }

    public UFLiteralDate getDateBefore(int days) {
        return this.getDateAfter(-days);
    }

    public int getDay() {
        return this.basezoneCalendar().get(5);
    }

    public int getYear() {
        return this.basezoneCalendar().get(1);
    }

    public int getDaysAfter(UFLiteralDate when) {
        int days = 0;
        if (when != null) {
            days = (int)((this.utcTime - when.utcTime) / 86400000L);
        }
        return days;
    }

    public static int getDaysBetween(UFLiteralDate begin, UFLiteralDate end) {
        if (begin != null && end != null) {
            return (int)((end.utcTime - begin.utcTime) / 86400000L);
        }
        throw new IllegalArgumentException("Dates to compare can't be null");
    }

    public int getDaysMonth() {
        return UFLiteralDate.getDaysMonth(this.getYear(), this.getMonth());
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

    public int getWeek() {
        int days = this.getDaysAfter(new UFLiteralDate("1980-01-06"));
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
        return UFLiteralDate.isLeapYear(this.getYear());
    }

    public int getWeekOfYear() {
        return this.basezoneCalendar().get(3);
    }

    public Date toDate() {
        return new Date(this.utcTime);
    }

    @Override
    public String toPersisted() {
        return UFLiteralDate.toDateString(this.basezoneCalendar().get(1), this.basezoneCalendar.get(2) + 1, this.basezoneCalendar.get(5));
    }

    @Override
    public String toString() {
        return this.toPersisted();
    }

    @Override
    public long getMillis() {
        return this.utcTime;
    }

    private GregorianCalendar basezoneCalendar() {
        if (this.basezoneCalendar == null) {
            this.basezoneCalendar = new GregorianCalendar(BASE_TIMEZONE);
            this.basezoneCalendar.setTimeInMillis(this.utcTime);
        }
        return this.basezoneCalendar;
    }

    public static UFLiteralDate fromPersisted(String s) {
        return UFLiteralDate.getDate(s);
    }

    public static UFLiteralDate getDate(long d) {
        return new UFLiteralDate(d);
    }

    public static UFLiteralDate getDate(String strDate) {
        UFLiteralDate o = allUsedDate1.get(strDate);
        if (o == null) {
            UFLiteralDate n;
            o = n = new UFLiteralDate(strDate);
            allUsedDate1.put(strDate, o);
        }
        return o;
    }

    public static UFLiteralDate getDate(Date date) {
        return new UFLiteralDate(date);
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
            tokens[i++] = st.nextToken().trim();
        }
        try {
            int daymax;
            int year = Integer.parseInt(tokens[0]);
            int month = Integer.parseInt(tokens[1]);
            if (month < 1 || month > 12) {
                throw new IllegalArgumentException("invalid date: " + str);
            }
            int day = Integer.parseInt(tokens[2]);
            int n = daymax = UFLiteralDate.isLeapYear(year) ? LEAP_MONTH_LENGTH[month - 1] : MONTH_LENGTH[month - 1];
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
        if (UFLiteralDate.isLeapYear(year)) {
            return LEAP_MONTH_LENGTH[month - 1];
        }
        return MONTH_LENGTH[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
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

    public int hashCode() {
        return (int)(this.utcTime ^ this.utcTime >>> 32);
    }

    public UFLiteralDate(java.sql.Date date) {
        this(date.getTime());
    }

    public UFLiteralDate(Date date) {
        this(date.getTime());
    }

    @Override
    public String toStdString(TimeZone zone) {
        return this.toPersisted();
    }

    @Override
    public String toString(TimeZone zone, DateFormat format) {
        zone = Calendars.getGMTTimeZone(BASE_TIMEZONE);
        Date dt = new Date(this.utcTime);
        format.setTimeZone(zone);
        return format.format(dt);
    }

    @Override
    public String toStdString() {
        return this.toPersisted();
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

