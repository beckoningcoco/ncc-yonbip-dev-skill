/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format;

import java.util.Date;
import nc.vo.pub.format.exception.FormatException;
import nc.vo.pub.lang.Calendars;
import nc.vo.pub.lang.ICalendar;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFLiteralDate;
import nc.vo.pub.lang.UFTime;

public class DateTimeObject {
    private UFDateTime date = null;
    private Object orignValue = null;
    private boolean isLocal = true;

    public DateTimeObject(Object orignObj, boolean isLocal) throws FormatException {
        this(orignObj);
        this.isLocal = isLocal;
    }

    public DateTimeObject(Object orignObj) throws FormatException {
        if (orignObj instanceof UFDateTime) {
            this.date = (UFDateTime)orignObj;
        } else if (orignObj instanceof UFDate) {
            UFDate tmp = (UFDate)orignObj;
            this.date = new UFDateTime(tmp.getMillis());
        } else if (orignObj instanceof UFTime) {
            UFTime tmp = (UFTime)orignObj;
            this.date = new UFDateTime(tmp.getMillis());
        } else if (orignObj instanceof Date) {
            this.date = new UFDateTime((Date)orignObj);
        } else if (orignObj instanceof UFLiteralDate) {
            this.isLocal = false;
            this.date = new UFDateTime(((UFLiteralDate)orignObj).getMillis());
        } else if (orignObj instanceof String) {
            try {
                this.date = new UFDateTime((String)orignObj);
            }
            catch (Exception e) {
                try {
                    long mins = Calendars.getMillis(new UFDate().asBegin(), new UFTime((String)orignObj), ICalendar.BASE_TIMEZONE);
                    this.date = new UFDateTime(mins);
                }
                catch (Exception e1) {
                    try {
                        this.date = new UFDateTime(new UFDate((String)orignObj), new UFTime());
                    }
                    catch (Exception e2) {
                        this.date = null;
                        throw new IllegalArgumentException();
                    }
                }
            }
        } else if (orignObj instanceof Number) {
            this.date = new UFDateTime(((Number)orignObj).longValue());
        } else {
            throw new IllegalArgumentException();
        }
    }

    public int getYear() {
        if (this.isLocal) {
            return this.date.getLocalYear();
        }
        return this.date.getYear();
    }

    public int getMonth() {
        if (this.isLocal) {
            return this.date.getLocalMonth();
        }
        return this.date.getMonth();
    }

    public int getDate() {
        if (this.isLocal) {
            return this.date.getLocalDay();
        }
        return this.date.getDay();
    }

    public int getHours() {
        if (this.isLocal) {
            return this.date.getLocalHour();
        }
        return this.date.getHour();
    }

    public int getMinutes() {
        if (this.isLocal) {
            return this.date.getLocalMinute();
        }
        return this.date.getMinute();
    }

    public int getSeconds() {
        return this.date.getSecond();
    }

    public Object getOrignValue() {
        return this.orignValue;
    }

    public void setOrignValue(Object orignValue) {
        this.orignValue = orignValue;
    }
}

