/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFTime
 */
package nc.vo.pub.pa;

import java.io.Serializable;
import nc.bs.logging.Logger;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFTime;
import nc.vo.pub.pa.Week;

public class AlertTimeConfig
implements Serializable,
Cloneable {
    private static final long serialVersionUID = -9868L;
    public boolean m_JustInTime = false;
    public static final int OCCURS_MONTHLY = 5;
    public static final int OCCURS_WEEKLY = 4;
    public static final int OCCURS_DAILY = 3;
    private int m_nOccurType = 3;
    private int m_nOccurInterval = 1;
    private boolean[] m_bOccurSelected = new boolean[]{true, false, false, false, false, false, true};
    private boolean m_bDailyRunOnce = true;
    private UFTime m_uftDailyRunOnceTime = new UFTime(System.currentTimeMillis());
    private int m_nDailyRunCycleInterval = 1;
    public static final int UNIT_HOURS = 2;
    public static final int UNIT_MINUTES = 1;
    public static final int UNIT_SECONDS = 0;
    private int m_nDailyRunCycleUnit = 2;
    private UFTime m_uftDailyRunCycleBeginTime = new UFTime(System.currentTimeMillis());
    private UFTime m_uftDailyRunCycleEndTime = new UFTime("23:59:59");
    private UFDate m_ufdExpireBeginDate = new UFDate(System.currentTimeMillis());
    private UFTime m_uftExpireBeginTime = new UFTime(System.currentTimeMillis());
    private UFDate m_ufdExpireEndDate = new UFDate(System.currentTimeMillis());
    private UFTime m_uftExpireEndTime = new UFTime("23:59:59");

    public UFTime getDailyRunCycleBeginTime() {
        return this.m_uftDailyRunCycleBeginTime;
    }

    public UFTime getDailyRunCycleEndTime() {
        return this.m_uftDailyRunCycleEndTime;
    }

    public int getDailyRunCycleInterval() {
        return this.m_nDailyRunCycleInterval;
    }

    public int getDailyRunCycleUnit() {
        return this.m_nDailyRunCycleUnit;
    }

    public boolean getDailyRunOnce() {
        return this.m_bDailyRunOnce;
    }

    public UFTime getDailyRunOnceTime() {
        return this.m_uftDailyRunOnceTime;
    }

    public UFDate getExpireBeginDate() {
        return this.m_ufdExpireBeginDate;
    }

    public UFTime getExpireBeginTime() {
        return this.m_uftExpireBeginTime;
    }

    public UFDate getExpireEndDate() {
        return this.m_ufdExpireEndDate;
    }

    public UFTime getExpireEndTime() {
        return this.m_uftExpireEndTime;
    }

    public int getOccurInterval() {
        return this.m_nOccurInterval;
    }

    public boolean[] getOccurSelected() {
        return this.m_bOccurSelected;
    }

    public int getOccurType() {
        return this.m_nOccurType;
    }

    public boolean isJustInTime() {
        return this.m_JustInTime;
    }

    public void setDailyRunCycleBeginTime(UFTime time) {
        this.m_uftDailyRunCycleBeginTime = time;
    }

    public void setDailyRunCycleEndTime(UFTime time) {
        this.m_uftDailyRunCycleEndTime = time;
    }

    public void setDailyRunCycleInterrval(int interval) {
        this.m_nDailyRunCycleInterval = interval;
    }

    public void setDailyRunCycleUnit(int unit) {
        this.m_nDailyRunCycleUnit = unit;
    }

    public void setDailyRunOnce(boolean value) {
        this.m_bDailyRunOnce = value;
    }

    public void setDailyRunOnceTime(UFTime time) {
        this.m_uftDailyRunOnceTime = time;
    }

    public void setExpireBeginDate(UFDate date) {
        this.m_ufdExpireBeginDate = date;
    }

    public void setExpireBeginTime(UFTime time) {
        this.m_uftExpireBeginTime = time;
    }

    public void setExpireEndDate(UFDate date) {
        this.m_ufdExpireEndDate = date;
    }

    public void setExpireEndTime(UFTime time) {
        this.m_uftExpireEndTime = time;
    }

    public void setJustInTime(boolean newJustInTime) {
        this.m_JustInTime = newJustInTime;
    }

    public void setOccurInterval(int interval) {
        this.m_nOccurInterval = interval;
    }

    public void setOccurSelected(boolean[] bSelected) {
        this.m_bOccurSelected = bSelected;
    }

    public void setOccurType(int type) {
        this.m_nOccurType = type;
    }

    public void setSelectedDaysofMonth(int[] days) {
        int i;
        if (days == null) {
            return;
        }
        this.m_bOccurSelected = new boolean[32];
        for (i = 0; i < this.m_bOccurSelected.length; ++i) {
            this.m_bOccurSelected[i] = false;
        }
        for (i = 0; i < days.length; ++i) {
            if (days[i] >= 31) continue;
            this.m_bOccurSelected[days[i]] = true;
        }
    }

    public void setSelectedDaysofWeek(int[] days) {
        int i;
        if (days == null) {
            return;
        }
        this.m_bOccurSelected = new boolean[7];
        for (i = 0; i < this.m_bOccurSelected.length; ++i) {
            this.m_bOccurSelected[i] = false;
        }
        for (i = 0; i < days.length; ++i) {
            if (days[i] >= 7) continue;
            this.m_bOccurSelected[days[i]] = true;
        }
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException e) {
            Logger.error((Object)e);
            return new AlertTimeConfig();
        }
    }

    public String toString() {
        String buffer = "";
        buffer = buffer + " Between " + this.getExpireBeginDate() + " " + this.getExpireBeginTime() + " and " + this.getExpireEndDate() + " " + this.getExpireEndTime();
        buffer = buffer + "time type: " + (this.isJustInTime() ? "immediate" : "timing");
        buffer = buffer + " frequency:";
        if (this.getOccurType() == 3) {
            buffer = buffer + "daily ";
            buffer = buffer + "; every " + this.getOccurInterval() + " day(s) happens once";
        } else if (this.getOccurType() == 4) {
            buffer = buffer + "weekly";
            buffer = buffer + "; every " + this.getOccurInterval() + " week(s) happens once";
            buffer = buffer + "and only in the day of ";
            for (int i = 0; i < this.getOccurSelected().length; ++i) {
                if (!this.getOccurSelected()[i]) continue;
                buffer = buffer + Week.getDescription(i) + ",";
            }
        } else if (this.getOccurType() == 5) {
            buffer = buffer + "monthly";
            buffer = buffer + "; every " + this.getOccurInterval() + " month(s) happens once";
            buffer = buffer + "and only in the day of  ";
            for (int i = 0; i < this.getOccurSelected().length; ++i) {
                if (!this.getOccurSelected()[i]) continue;
                buffer = i == 0 ? buffer + "[the last day]" : buffer + "[" + i + "]";
            }
        }
        buffer = buffer + " In selected days, every day ";
        if (this.getDailyRunOnce()) {
            buffer = buffer + "happens once.";
        } else {
            buffer = buffer + " between " + this.getDailyRunCycleBeginTime() + " and " + this.getDailyRunCycleEndTime() + ", ";
            buffer = buffer + "  every ";
            buffer = this.getDailyRunCycleUnit() == 0 ? buffer + " second(s) " : (this.getDailyRunCycleUnit() == 1 ? buffer + " minute(s) " : buffer + " hour(s) ");
            buffer = buffer + " occurs one time.";
        }
        return buffer;
    }
}

