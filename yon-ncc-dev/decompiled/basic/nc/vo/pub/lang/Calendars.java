/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.lang;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.TimeZone;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFTime;

public class Calendars {
    private static TimeZone defZone;

    public static TimeZone getGMTDefault() {
        if (defZone == null) {
            TimeZone zone = Calendars.getGMTTimeZone(TimeZone.getDefault());
            TimeZone.setDefault(zone);
            return zone;
        }
        return defZone;
    }

    public static void setGMTDefault(TimeZone zone) {
        defZone = Calendars.getGMTTimeZone(zone);
    }

    public static TimeZone getGMTTimeZone(TimeZone zone) {
        if (zone == null) {
            return Calendars.getGMTDefault();
        }
        if (zone.getID().startsWith("GMT") || zone.getID().startsWith("UTC")) {
            return zone;
        }
        long rawOffset = zone.getRawOffset();
        long absrawOffset = rawOffset > 0L ? rawOffset : -rawOffset;
        int hourOffset = (int)absrawOffset / 3600000;
        int minueOffset = (int)(absrawOffset % 3600000L / 60000L);
        return Calendars.toGMTZone(rawOffset >= 0L, hourOffset, minueOffset);
    }

    public static TimeZone getGMTTimeZone(String id) {
        if (id == null) {
            return Calendars.getGMTDefault();
        }
        if (id.startsWith("UTC")) {
            id = id.replace("UTC", "GMT");
        }
        TimeZone zone = TimeZone.getTimeZone(id);
        return Calendars.getGMTTimeZone(zone);
    }

    public static UFDateTime getUFDateTime(String date, DateFormat format) {
        try {
            Date d = format.parse(date);
            return new UFDateTime(d);
        }
        catch (ParseException e) {
            throw new IllegalArgumentException("Illegal date time: " + date);
        }
    }

    public static UFDate getUFDate(String date, DateFormat format) {
        try {
            Date d = format.parse(date);
            return new UFDate(d);
        }
        catch (ParseException e) {
            throw new IllegalArgumentException("Illegal date time: " + date);
        }
    }

    public static String convertDate(String d, String tzFrom, String tzTo) {
        UFDate date = new UFDate(d, Calendars.getGMTTimeZone(tzFrom));
        return date.toStdString(Calendars.getGMTTimeZone(tzTo));
    }

    public static String convertDateTime(String dt, String tzFrom, String tzTo) {
        UFDateTime dateTime = new UFDateTime(dt, Calendars.getGMTTimeZone(tzFrom));
        return dateTime.toStdString(Calendars.getGMTTimeZone(tzTo));
    }

    private static TimeZone toGMTZone(boolean positive, int hourOffset, int minueOffset) {
        StringBuffer sb = new StringBuffer("GMT");
        sb.append(positive ? (char)'+' : '-');
        sb = hourOffset > 9 ? sb.append(hourOffset) : sb.append('0').append(hourOffset);
        sb.append(':');
        sb = minueOffset > 9 ? sb.append(minueOffset) : sb.append('0').append(minueOffset);
        return TimeZone.getTimeZone(sb.toString());
    }

    public static String getValidUFDateString(String str) {
        int[] v = UFDate.internalParse(str);
        StringBuffer sb = new StringBuffer();
        Calendars.append(sb, v[0], '-');
        Calendars.append(sb, v[1], '-');
        if (v[2] < 10) {
            sb.append('0');
        }
        sb.append(v[2]);
        return sb.toString();
    }

    public static String getValidUFDateTimeString(String str) {
        int[] v = UFDateTime.internalParse(str);
        StringBuffer sb = new StringBuffer();
        Calendars.append(sb, v[0], '-');
        Calendars.append(sb, v[1], '-');
        Calendars.append(sb, v[2], ' ');
        Calendars.append(sb, v[3], ':');
        Calendars.append(sb, v[4], ':');
        if (v[5] < 10) {
            sb.append('0');
        }
        sb.append(v[5]);
        return sb.toString();
    }

    public static String getValidUFTimeString(String time) {
        int[] v = UFTime.internalParse(time);
        StringBuffer sb = new StringBuffer();
        Calendars.append(sb, v[0], ':');
        Calendars.append(sb, v[1], ':');
        if (v[2] < 10) {
            sb.append('0');
        }
        sb.append(v[2]);
        return sb.toString();
    }

    private static void append(StringBuffer sb, int v, char split) {
        if (v < 10) {
            sb.append('0');
        }
        sb.append(v).append(split);
    }

    public static long getMillis(UFDate date, UFTime time, TimeZone zone) {
        zone = Calendars.getGMTTimeZone(zone);
        long mills = date.getMillis() + time.getMillis() + (long)zone.getRawOffset();
        if (mills < date.getMillis()) {
            mills += 86400000L;
        } else if (mills >= date.getMillis() + 86400000L) {
            mills -= 86400000L;
        }
        return mills;
    }
}

