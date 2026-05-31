/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 */
package nc.vo.arap.termendtransact;

import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public class TermEndVO
extends ValueObject {
    private static final long serialVersionUID = 166932548933070782L;
    private String pk_org;
    private String year;
    private String month;
    private String nodecode;
    private String pk_periodmonth;
    private String enableyear;
    private String enablemonth;

    public String getEnableyear() {
        return this.enableyear;
    }

    public void setEnableyear(String enableyear) {
        this.enableyear = enableyear;
    }

    public String getEnablemonth() {
        return this.enablemonth;
    }

    public void setEnablemonth(String enablemonth) {
        this.enablemonth = enablemonth;
    }

    public String getNodecode() {
        return this.nodecode;
    }

    public void setNodecode(String nodecode) {
        this.nodecode = nodecode;
    }

    public String getPk_periodmonth() {
        return this.pk_periodmonth;
    }

    public void setPk_periodmonth(String pkPeriodmonth) {
        this.pk_periodmonth = pkPeriodmonth;
    }

    public TermEndVO() {
    }

    public TermEndVO(String pk_org, String year, String month) {
        this.pk_org = pk_org;
        this.year = year;
        this.month = month;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String pkCorp) {
        this.pk_org = pkCorp;
    }

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getEntityName() {
        return null;
    }

    public void validate() throws ValidationException {
    }
}

