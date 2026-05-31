/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 */
package nc.vo.arap.transaction;

import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public class FirstNotClosedAccountMonthVO
extends ValueObject {
    private static final long serialVersionUID = 2645743806974626970L;
    private String m_sNotAccMonth;
    private String m_sNotAccYear;
    private boolean m_bIsAccounted;
    private String pk_org;

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String pk_org) {
        this.pk_org = pk_org;
    }

    public String getEntityName() {
        return null;
    }

    public boolean getIsAccounted() {
        return this.m_bIsAccounted;
    }

    public String getNotAccMonth() {
        return this.m_sNotAccMonth;
    }

    public String getNotAccYear() {
        return this.m_sNotAccYear;
    }

    public void setIsAccounted(boolean isAcc) {
        this.m_bIsAccounted = isAcc;
    }

    public void setNotAccMonth(String month) {
        this.m_sNotAccMonth = month;
    }

    public void setNotAccYear(String year) {
        this.m_sNotAccYear = year;
    }

    public void validate() throws ValidationException {
    }
}

