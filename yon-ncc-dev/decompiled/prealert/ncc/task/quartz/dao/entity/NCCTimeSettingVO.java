/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.pub.lang.ICalendar
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFTime
 */
package ncc.task.quartz.dao.entity;

import nc.vo.jcom.lang.StringUtil;
import nc.vo.pub.lang.ICalendar;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFTime;

public class NCCTimeSettingVO {
    private String pkTimeconfig;
    private String pkReference;
    private Integer frequencytype;
    private Integer intervaltime;
    private String executeday;
    private String isruncycledaily;
    private String executetime;
    private Integer executeinterval;
    private Integer exeintervalunit;
    private String starttime;
    private String endtime;
    private String effibegindate;
    private String effibegintime;
    private String effienddate;
    private String effiendtime;
    private String timezone;
    private String ts;
    private Long dr;

    public NCCTimeSettingVO(String pkTimeconfig, String pkReference, Integer frequencytype, Integer intervaltime, String executeday, String isruncycledaily, String executetime, Integer executeinterval, Integer exeintervalunit, String starttime, String endtime, String effibegindate, String effibegintime, String effienddate, String effiendtime, String timezone, String ts, Long dr) {
        this.pkTimeconfig = pkTimeconfig;
        this.pkReference = pkReference;
        this.frequencytype = frequencytype;
        this.intervaltime = intervaltime;
        this.executeday = executeday;
        this.isruncycledaily = isruncycledaily;
        this.executetime = executetime;
        this.executeinterval = executeinterval;
        this.exeintervalunit = exeintervalunit;
        this.starttime = starttime;
        this.endtime = endtime;
        this.effibegindate = effibegindate;
        this.effibegintime = effibegintime;
        this.effienddate = effienddate;
        this.effiendtime = effiendtime;
        this.timezone = timezone;
        this.ts = ts;
        this.dr = dr;
    }

    public NCCTimeSettingVO() {
    }

    public String getPkTimeconfig() {
        return this.pkTimeconfig;
    }

    public void setPkTimeconfig(String pkTimeconfig) {
        this.pkTimeconfig = pkTimeconfig == null ? null : pkTimeconfig.trim();
    }

    public String getPkReference() {
        return this.pkReference;
    }

    public void setPkReference(String pkReference) {
        this.pkReference = pkReference == null ? null : pkReference.trim();
    }

    public Integer getFrequencytype() {
        return this.frequencytype;
    }

    public void setFrequencytype(Integer frequencytype) {
        this.frequencytype = frequencytype;
    }

    public Integer getIntervaltime() {
        return this.intervaltime;
    }

    public void setIntervaltime(Integer intervaltime) {
        this.intervaltime = intervaltime;
    }

    public String getExecuteday() {
        return this.executeday;
    }

    public void setExecuteday(String executeday) {
        this.executeday = executeday == null ? null : executeday.trim();
    }

    public String getIsruncycledaily() {
        return this.isruncycledaily;
    }

    public void setIsruncycledaily(String isruncycledaily) {
        this.isruncycledaily = isruncycledaily == null ? null : isruncycledaily.trim();
    }

    public String getExecutetime() {
        return this.executetime;
    }

    public void setExecutetime(String executetime) {
        this.executetime = executetime == null ? null : executetime.trim();
    }

    public Integer getExecuteinterval() {
        return this.executeinterval;
    }

    public void setExecuteinterval(Integer executeinterval) {
        this.executeinterval = executeinterval;
    }

    public Integer getExeintervalunit() {
        return this.exeintervalunit;
    }

    public void setExeintervalunit(Integer exeintervalunit) {
        this.exeintervalunit = exeintervalunit;
    }

    public String getStarttime() {
        return this.starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime == null ? null : starttime.trim();
    }

    public String getEndtime() {
        return this.endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime == null ? null : endtime.trim();
    }

    public String getEffibegindate() {
        return this.effibegindate;
    }

    public void setEffibegindate(String effibegindate) {
        this.effibegindate = effibegindate == null ? null : effibegindate.trim();
    }

    public String getEffibegintime() {
        return this.effibegintime;
    }

    public void setEffibegintime(String effibegintime) {
        this.effibegintime = effibegintime == null ? null : effibegintime.trim();
    }

    public String getEffienddate() {
        return this.effienddate;
    }

    public void setEffienddate(String effienddate) {
        this.effienddate = effienddate == null ? null : effienddate.trim();
    }

    public String getEffiendtime() {
        return this.effiendtime;
    }

    public void setEffiendtime(String effiendtime) {
        this.effiendtime = effiendtime == null ? null : effiendtime.trim();
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone == null ? null : timezone.trim();
    }

    public String getTs() {
        return this.ts;
    }

    public void setTs(String ts) {
        this.ts = ts == null ? null : ts.trim();
    }

    public Long getDr() {
        return this.dr;
    }

    public void setDr(Long dr) {
        this.dr = dr;
    }

    public UFDate getEffiendUFDate() {
        UFDateTime dt = this.getEffiendUFDateTime();
        if (dt != null) {
            return dt.getDate();
        }
        return null;
    }

    private UFDateTime getEffibeginUFDateTime() {
        if (StringUtil.isEmptyWithTrim((String)this.getEffibegindate())) {
            return null;
        }
        if (this.getEffibegintime() == null) {
            return new UFDateTime(this.getEffibegindate() + " 00:00:00", ICalendar.BASE_TIMEZONE);
        }
        return new UFDateTime(this.getEffibegindate() + " " + this.getEffibegintime(), ICalendar.BASE_TIMEZONE);
    }

    private UFDateTime getEffiendUFDateTime() {
        if (StringUtil.isEmptyWithTrim((String)this.getEffienddate())) {
            return null;
        }
        if (this.getEffiendtime() == null) {
            return new UFDateTime(this.getEffienddate() + " 00:00:00", ICalendar.BASE_TIMEZONE);
        }
        return new UFDateTime(this.getEffienddate() + " " + this.getEffiendtime(), ICalendar.BASE_TIMEZONE);
    }

    public UFTime getEffiendUFTime() {
        UFDateTime dt = this.getEffiendUFDateTime();
        if (dt != null) {
            return dt.getUFTime();
        }
        return null;
    }

    public UFTime getEndUFTime() {
        if (StringUtil.isEmptyWithTrim((String)this.getEndtime())) {
            return null;
        }
        return new UFTime(this.getEndtime(), ICalendar.BASE_TIMEZONE);
    }

    public UFTime getExecuteUFTime() {
        if (StringUtil.isEmptyWithTrim((String)this.getExecutetime())) {
            return null;
        }
        return new UFTime(this.getExecutetime(), ICalendar.BASE_TIMEZONE);
    }

    public UFTime getStartUFTime() {
        if (StringUtil.isEmptyWithTrim((String)this.getStarttime())) {
            return null;
        }
        return new UFTime(this.getStarttime(), ICalendar.BASE_TIMEZONE);
    }

    public UFDate getEffibeginUFDate() {
        UFDateTime dt = this.getEffibeginUFDateTime();
        if (dt != null) {
            return dt.getDate();
        }
        return null;
    }

    public UFTime getEffibeginUFTime() {
        UFDateTime dt = this.getEffibeginUFDateTime();
        if (dt != null) {
            return dt.getUFTime();
        }
        return null;
    }

    public void setEffiendtime(UFTime effiendtime) {
        if (effiendtime == null) {
            this.setEffiendtime("");
        } else {
            this.setEffiendtime(effiendtime.toStdString(ICalendar.BASE_TIMEZONE));
        }
    }
}

