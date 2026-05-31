/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.termendtransact;

import java.util.Vector;
import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;
import nc.vo.pub.lang.UFDouble;

public class FilterCondVO
extends ValueObject {
    private static final long serialVersionUID = 1L;
    private String m_sDwbm;
    private String m_sSfbz;
    private UFDouble m_dFbhl;
    private UFDouble m_dBbhl;
    private String m_sYear;
    private String m_sQj;
    private String m_sBegDate;
    private String m_sEndDate;
    private Vector m_vResultData;
    private String m_sMode1;
    private String m_sMode2;
    private String m_sMode3;
    private String m_sMode4;
    private String m_sPeriodState;
    private String pk_org;
    private String pk_periodmonth;

    public String getPk_periodmonth() {
        return this.pk_periodmonth;
    }

    public void setPk_periodmonth(String pkPeriodmonth) {
        this.pk_periodmonth = pkPeriodmonth;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String pkOrg) {
        this.pk_org = pkOrg;
    }

    public UFDouble getBbhl() {
        return this.m_dBbhl;
    }

    public String getBegDate() {
        return this.m_sBegDate;
    }

    public Vector getData() {
        return this.m_vResultData;
    }

    public String getDwbm() {
        return this.m_sDwbm;
    }

    public String getEndDate() {
        return this.m_sEndDate;
    }

    public String getEntityName() {
        return null;
    }

    public UFDouble getFbhl() {
        return this.m_dFbhl;
    }

    public String getMode1() {
        return this.m_sMode1;
    }

    public String getMode2() {
        return this.m_sMode2;
    }

    public String getMode3() {
        return this.m_sMode3;
    }

    public String getMode4() {
        return this.m_sMode4;
    }

    public String getPeriodState() {
        return this.m_sPeriodState;
    }

    public String getQj() {
        return this.m_sQj;
    }

    public String getSfbz() {
        return this.m_sSfbz;
    }

    public String getYear() {
        return this.m_sYear;
    }

    public void setBbhl(UFDouble bbhl) {
        this.m_dBbhl = bbhl;
    }

    public void setBegDate(String begDate) {
        this.m_sBegDate = begDate;
    }

    public void setData(Vector vData) {
        this.m_vResultData = vData;
    }

    public void setDwbm(String dwbm) {
        this.m_sDwbm = dwbm;
    }

    public void setEndDate(String endDate) {
        this.m_sEndDate = endDate;
    }

    public void setFbhl(UFDouble fbhl) {
        this.m_dFbhl = fbhl;
    }

    public void setMode1(String mode) {
        this.m_sMode1 = mode;
    }

    public void setMode2(String mode) {
        this.m_sMode2 = mode;
    }

    public void setMode3(String mode) {
        this.m_sMode3 = mode;
    }

    public void setMode4(String mode) {
        this.m_sMode4 = mode;
    }

    public void setPeriodSate(String state) {
        this.m_sPeriodState = state;
    }

    public void setQj(String qj) {
        this.m_sQj = qj;
    }

    public void setSfbz(String sfbz) {
        this.m_sSfbz = sfbz;
    }

    public void setYear(String year) {
        this.m_sYear = year;
    }

    public void validate() throws ValidationException {
    }
}

