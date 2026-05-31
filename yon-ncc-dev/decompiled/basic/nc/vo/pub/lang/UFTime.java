/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.lang;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.lang.Calendars;
import nc.vo.pub.lang.ICalendar;

public final class UFTime
implements Serializable,
Comparable<UFTime>,
ICalendar {
    private static final long serialVersionUID = -7719973293202240085L;
    private long utcOffset;

    public UFTime() {
        this(System.currentTimeMillis());
    }

    public UFTime(long m) {
        this.utcOffset = m % 86400000L;
        this.utcOffset -= this.utcOffset % 1000L;
        int rawOffset = Calendars.getGMTDefault().getRawOffset();
        if (rawOffset < 0) {
            if (this.utcOffset < (long)rawOffset) {
                this.utcOffset += 86400000L;
            }
        } else if (rawOffset > 0 && this.utcOffset >= 86400000L - (long)rawOffset) {
            this.utcOffset -= 86400000L;
        }
    }

    public UFTime(String time, TimeZone zone) {
        zone = Calendars.getGMTTimeZone(BASE_TIMEZONE);
        int[] t = UFTime.internalParse(time);
        GregorianCalendar cal = new GregorianCalendar(zone);
        cal.set(1, 1970);
        cal.set(2, 0);
        cal.set(5, 1);
        cal.set(11, t[0]);
        cal.set(12, t[1]);
        cal.set(13, t[2]);
        cal.set(14, 0);
        this.utcOffset = cal.getTimeInMillis();
    }

    public UFTime(String time) {
        int[] t = UFTime.internalParse(time);
        this.utcOffset = ((t[0] * 60 + t[1]) * 60 + t[2]) * 1000 - Calendars.getGMTTimeZone(BASE_TIMEZONE).getRawOffset();
        this.utcOffset -= this.utcOffset % 1000L;
    }

    public UFTime(java.sql.Date date) {
        this((Date)date);
    }

    public UFTime(Date date) {
        this(date.getTime());
    }

    @Override
    public String toStdString(TimeZone zone) {
        zone = Calendars.getGMTTimeZone(BASE_TIMEZONE);
        long time = ((long)zone.getRawOffset() + this.utcOffset) % 86400000L;
        if (time < 0L) {
            time = 86400000L + time;
        }
        long as = time / 1000L;
        int second = (int)(as % 60L);
        long am = (as - (long)second) / 60L;
        int minute = (int)(am % 60L);
        int hour = (int)(am - (long)minute) / 60;
        StringBuffer sb = new StringBuffer();
        UFTime.append(sb, hour, ':');
        UFTime.append(sb, minute, ':');
        if (second < 10) {
            sb.append('0');
        }
        sb.append(second);
        return sb.toString();
    }

    @Override
    public String toStdString() {
        return this.toStdString(BASE_TIMEZONE);
    }

    @Override
    public String toString() {
        return this.toStdString(BASE_TIMEZONE);
    }

    public String toLocalString() {
        return this.toStdString(Calendars.getGMTDefault());
    }

    public boolean after(UFTime when) {
        return this.utcOffset - when.utcOffset > 0L;
    }

    public boolean before(UFTime when) {
        return this.utcOffset - when.utcOffset < 0L;
    }

    public Object clone() {
        return new UFTime(this.utcOffset);
    }

    public boolean equals(Object o) {
        if (o != null && o instanceof UFTime) {
            return this.utcOffset == ((UFTime)o).utcOffset;
        }
        return false;
    }

    public int hashCode() {
        int hash = 1;
        hash = hash * 31 + (int)this.utcOffset;
        return hash;
    }

    public int getHour() {
        return Integer.valueOf(this.toString().substring(0, 2));
    }

    public int getLocalHour() {
        return Integer.valueOf(this.toStdString(Calendars.getGMTDefault()).substring(0, 2));
    }

    public int getHour(TimeZone zone) {
        return Integer.valueOf(this.toStdString(Calendars.getGMTTimeZone(zone)).substring(0, 2));
    }

    public int getMinute() {
        return Integer.valueOf(this.toString().substring(3, 5));
    }

    public int getLocalMinute() {
        return Integer.valueOf(this.toStdString(Calendars.getGMTDefault()).substring(3, 5));
    }

    public int getMinute(TimeZone zone) {
        return Integer.valueOf(this.toStdString(Calendars.getGMTTimeZone(zone)).substring(3, 5));
    }

    public int getSecond() {
        return Integer.valueOf(this.toString().substring(6, 8));
    }

    @Override
    public long getMillis() {
        return this.utcOffset;
    }

    @Override
    public int compareTo(UFTime o) {
        long ret = this.utcOffset - o.utcOffset;
        if (ret == 0L) {
            return 0;
        }
        return ret > 0L ? 1 : -1;
    }

    private static void append(StringBuffer sb, int v, char split) {
        if (v < 10) {
            sb.append('0');
        }
        sb.append(v).append(split);
    }

    static int[] internalParse(String time) {
        return UFTime.internalParse(time.trim(), 0);
    }

    static int[] internalParse(String time, int idx) {
        if (StringUtil.isEmpty(time)) {
            throw new IllegalArgumentException("Time can't be empty");
        }
        if (time.length() != 8 + idx) {
            throw new IllegalArgumentException("Time must as format HH:mm:ss, " + time);
        }
        for (int i = idx; i < idx + 8; ++i) {
            char c = time.charAt(i);
            if (!(i == idx + 2 || i == idx + 5 ? c != ':' : c < '0' || c > '9')) continue;
            throw new IllegalArgumentException("Time must as format HH:mm:ss, " + time);
        }
        int hour = Integer.parseInt(time.substring(idx + 0, idx + 2));
        int minute = Integer.parseInt(time.substring(idx + 3, idx + 5));
        int second = Integer.parseInt(time.substring(idx + 6, idx + 8));
        if (hour < 0 || hour >= 24 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid time, " + time);
        }
        return new int[]{hour, minute, second};
    }

    @Override
    public String toString(TimeZone zone, DateFormat format) {
        zone = Calendars.getGMTTimeZone(BASE_TIMEZONE);
        Date dt = new Date(this.utcOffset);
        format.setTimeZone(zone);
        return format.format(dt);
    }

    public static String getValidUFTimeString(String time) {
        if (time == null) {
            return null;
        }
        try {
            int[] t = UFTime.internalParse(time);
            StringBuffer sb = new StringBuffer();
            UFTime.append(sb, t[0], ':');
            UFTime.append(sb, t[1], ':');
            if (t[2] < 10) {
                sb.append('0');
            }
            sb.append(t[2]);
            return sb.toString();
        }
        catch (Exception e) {
            return null;
        }
    }

    public static boolean isAllowTime(String time) {
        try {
            UFTime.internalParse(time);
            return true;
        }
        catch (IllegalArgumentException e) {
            return false;
        }
    }

    @Override
    public String toPersisted() {
        return this.toStdString();
    }

    static {
        Calendars.getGMTDefault();
    }
}

