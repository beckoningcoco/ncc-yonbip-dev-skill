/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.lang.Calendars
 *  nc.vo.pub.lang.ICalendar
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFTime
 */
package nc.vo.pub.pa;

import java.util.ArrayList;
import java.util.TimeZone;
import nc.bs.logging.Logger;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.SuperVO;
import nc.vo.pub.ValidationException;
import nc.vo.pub.lang.Calendars;
import nc.vo.pub.lang.ICalendar;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFTime;

public class TimingSettingVO
extends SuperVO {
    private static final long serialVersionUID = -9871L;
    private String pk_timeconfig;
    private String pk_reference;
    private String daylyfrequency;
    private String timezone;
    private String effibegindate;
    private String effibegintime;
    private String effienddate;
    private String effiendtime;
    private UFBoolean isruncycledaily;
    private String starttime;
    private String endtime;
    private Integer executeinterval;
    private Integer exeintervalunit;
    private String executetime;
    private Integer frequencytype;
    private Integer intervaltime;
    private String executeday;
    private TimeZone timeZoneEntity = Calendars.getGMTDefault();

    public TimingSettingVO() {
        this.timezone = this.timeZoneEntity.getID();
    }

    public TimingSettingVO(String newTimeconfig) {
        this();
        this.pk_timeconfig = newTimeconfig;
    }

    public String getPk_timeconfig() {
        return this.pk_timeconfig;
    }

    public void setPk_timeconfig(String pk_timeconfig) {
        this.pk_timeconfig = pk_timeconfig;
    }

    public String getPk_reference() {
        return this.pk_reference;
    }

    public void setPk_reference(String pk_reference) {
        this.pk_reference = pk_reference;
    }

    public String getDaylyfrequency() {
        return this.daylyfrequency;
    }

    public void setDaylyfrequency(String daylyfrequency) {
        this.daylyfrequency = daylyfrequency;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        try {
            Calendars.getGMTTimeZone((String)timezone);
            this.timezone = timezone;
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
    }

    public String getEffibegindate() {
        if (this.effibegindate != null && this.effibegindate.length() > 10) {
            return this.effibegindate.substring(0, 10);
        }
        return this.effibegindate;
    }

    public void setEffibegindate(String effibegindate) {
        this.effibegindate = effibegindate;
    }

    public String getEffibegintime() {
        return this.effibegintime;
    }

    public void setEffibegintime(String effibegintime) {
        this.effibegintime = effibegintime;
    }

    public String getEffienddate() {
        if (this.effienddate != null && this.effienddate.length() > 10) {
            return this.effienddate.substring(0, 10);
        }
        return this.effienddate;
    }

    public void setEffienddate(String effienddate) {
        this.effienddate = effienddate;
    }

    public String getEffiendtime() {
        return this.effiendtime;
    }

    public void setEffiendtime(String effiendtime) {
        this.effiendtime = effiendtime;
    }

    public UFBoolean getIsruncycledaily() {
        return this.isruncycledaily;
    }

    public void setIsruncycledaily(UFBoolean isruncycledaily) {
        this.isruncycledaily = isruncycledaily;
    }

    public String getStarttime() {
        return this.starttime;
    }

    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    public String getEndtime() {
        return this.endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
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

    public String getExecutetime() {
        return this.executetime;
    }

    public void setExecutetime(String executetime) {
        this.executetime = executetime;
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
        this.executeday = executeday;
    }

    public void setEffibegindate(UFDate effibegindate) {
        if (effibegindate == null) {
            this.setEffibegindate("");
        } else {
            this.setEffibegindate(effibegindate.toStdString(ICalendar.BASE_TIMEZONE));
        }
    }

    public TimeZone getTimeZoneEntity() {
        if (this.timeZoneEntity != null && this.timeZoneEntity.getID().equals(this.getTimezone())) {
            return this.timeZoneEntity;
        }
        this.timeZoneEntity = Calendars.getGMTTimeZone((String)this.getTimezone());
        return this.timeZoneEntity;
    }

    public UFDate getEffibeginUFDate() {
        UFDateTime dt = this.getEffibeginUFDateTime();
        if (dt != null) {
            return dt.getDate();
        }
        return null;
    }

    public void setEffibegintime(UFTime effibegintime) {
        if (effibegintime == null) {
            this.setEffibegintime("");
        } else {
            this.setEffibegintime(effibegintime.toStdString(ICalendar.BASE_TIMEZONE));
        }
    }

    public UFTime getEffibeginUFTime() {
        UFDateTime dt = this.getEffibeginUFDateTime();
        if (dt != null) {
            return dt.getUFTime();
        }
        return null;
    }

    public void setEffienddate(UFDate effienddate) {
        if (effienddate == null) {
            this.setEffienddate("");
        } else {
            this.setEffienddate(effienddate.toStdString(ICalendar.BASE_TIMEZONE));
        }
    }

    public UFDate getEffiendUFDate() {
        UFDateTime dt = this.getEffiendUFDateTime();
        if (dt != null) {
            return dt.getDate();
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

    public UFTime getEffiendUFTime() {
        UFDateTime dt = this.getEffiendUFDateTime();
        if (dt != null) {
            return dt.getUFTime();
        }
        return null;
    }

    public void setEndtime(UFTime endtime) {
        if (endtime == null) {
            this.setEndtime("");
        } else {
            this.setEndtime(endtime.toStdString(ICalendar.BASE_TIMEZONE));
        }
    }

    public UFTime getEndUFTime() {
        if (StringUtil.isEmptyWithTrim((String)this.getEndtime())) {
            return null;
        }
        return new UFTime(this.getEndtime(), ICalendar.BASE_TIMEZONE);
    }

    public void setExecutetime(UFTime executetime) {
        if (executetime == null) {
            this.setExecutetime("");
        } else {
            this.setExecutetime(executetime.toStdString(ICalendar.BASE_TIMEZONE));
        }
    }

    public UFTime getExecuteUFTime() {
        if (StringUtil.isEmptyWithTrim((String)this.getExecutetime())) {
            return null;
        }
        return new UFTime(this.getExecutetime(), ICalendar.BASE_TIMEZONE);
    }

    public void setStarttime(UFTime starttime) {
        if (starttime == null) {
            this.setStarttime("");
        } else {
            this.setStarttime(starttime.toStdString(ICalendar.BASE_TIMEZONE));
        }
    }

    public UFTime getStartUFTime() {
        if (StringUtil.isEmptyWithTrim((String)this.getStarttime())) {
            return null;
        }
        return new UFTime(this.getStarttime(), ICalendar.BASE_TIMEZONE);
    }

    public String getPKFieldName() {
        return "pk_timeconfig";
    }

    public String getTableName() {
        return "pub_timeconfig";
    }

    public String getEntityName() {
        return "timeconfig";
    }

    public String getPrimaryKey() {
        return this.pk_timeconfig;
    }

    public void setPrimaryKey(String newTimeconfig) {
        this.pk_timeconfig = newTimeconfig;
    }

    public String getParentPKFieldName() {
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

    public void validate() throws ValidationException {
        ArrayList<String> errFields = new ArrayList<String>();
        if (this.pk_timeconfig == null) {
            errFields.add(new String("pk_timeconfig"));
        }
        StringBuffer message = new StringBuffer();
        message.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("101504", "UPP101504-000041"));
        if (errFields.size() > 0) {
            String[] temp = errFields.toArray(new String[0]);
            message.append(temp[0]);
            for (int i = 1; i < temp.length; ++i) {
                message.append(",");
                message.append(temp[i]);
            }
            throw new ValidationException(message.toString());
        }
    }
}

