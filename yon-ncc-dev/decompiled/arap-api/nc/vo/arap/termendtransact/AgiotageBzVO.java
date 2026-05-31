/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.commons.lang.builder.HashCodeBuilder
 */
package nc.vo.arap.termendtransact;

import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDouble;
import nccloud.commons.lang.builder.HashCodeBuilder;

public class AgiotageBzVO
extends ValueObject {
    private static final long serialVersionUID = 6450301131572579174L;
    private String m_sBzbm;
    private String m_sBzmc;
    private int m_iYbDig;
    private int m_iBbDig;
    private String m_sDjlxmc;
    private String m_sDjbh;
    private UFDouble m_dBbhl;
    private String m_sMsg;
    private String m_sCurrErrMsg;
    private boolean m_bState;
    private UFDate lastCalDate;
    private String dwbm;
    private String caldate;
    private String locaCurr;
    private int groupDig;
    private int globalDig;
    private int groupRateDig;
    private int globalRateDig;

    public int getGroupRateDig() {
        return this.groupRateDig;
    }

    public void setGroupRateDig(int groupRateDig) {
        this.groupRateDig = groupRateDig;
    }

    public int getGlobalRateDig() {
        return this.globalRateDig;
    }

    public void setGlobalRateDig(int globalRateDig) {
        this.globalRateDig = globalRateDig;
    }

    public String getLocaCurr() {
        return this.locaCurr;
    }

    public int getGroupDig() {
        return this.groupDig;
    }

    public void setGroupDig(int groupDig) {
        this.groupDig = groupDig;
    }

    public int getGlobalDig() {
        return this.globalDig;
    }

    public void setGlobalDig(int globalDig) {
        this.globalDig = globalDig;
    }

    public void setLocaCurr(String locaCurr) {
        this.locaCurr = locaCurr;
    }

    public String getDwbm() {
        return this.dwbm;
    }

    public void setDwbm(String dwbm) {
        this.dwbm = dwbm;
    }

    public String getCaldate() {
        return this.caldate;
    }

    public void setCaldate(String caldate) {
        this.caldate = caldate;
    }

    public UFDate getLastCalDate() {
        return this.lastCalDate;
    }

    public void setLastCalDate(UFDate lastCalDate) {
        this.lastCalDate = lastCalDate;
    }

    public int getBbDig() {
        return this.m_iBbDig;
    }

    public UFDouble getBbhl() {
        return this.m_dBbhl;
    }

    public String getBzbm() {
        return this.m_sBzbm;
    }

    public String getBzmc() {
        return this.m_sBzmc;
    }

    public String getCurrErrMsg() {
        return this.m_sCurrErrMsg;
    }

    public String getDjbh() {
        return this.m_sDjbh;
    }

    public String getDjlxmc() {
        return this.m_sDjlxmc;
    }

    public String getEntityName() {
        return null;
    }

    public String getMsg() {
        return this.m_sMsg;
    }

    public boolean getState() {
        return this.m_bState;
    }

    public int getYbDig() {
        return this.m_iYbDig;
    }

    public void setBbDig(int bbdig) {
        this.m_iBbDig = bbdig;
    }

    public void setBbhl(UFDouble bbhl) {
        this.m_dBbhl = bbhl;
    }

    public void setBzbm(String bzbm) {
        this.m_sBzbm = bzbm;
    }

    public void setBzmc(String bzmc) {
        this.m_sBzmc = bzmc;
    }

    public void setCurrErrMsg(String errMsg) {
        this.m_sCurrErrMsg = errMsg;
    }

    public void setDjbh(String djbh) {
        this.m_sDjbh = djbh;
    }

    public void setDjlxmc(String djlxmc) {
        this.m_sDjlxmc = djlxmc;
    }

    public void setMsg(String msg) {
        this.m_sMsg = msg;
    }

    public void setState(boolean state) {
        this.m_bState = state;
    }

    public void setYbDig(int ybdig) {
        this.m_iYbDig = ybdig;
    }

    public void validate() throws ValidationException {
    }

    public boolean equals(Object obj) {
        if (obj instanceof AgiotageBzVO) {
            AgiotageBzVO vo = (AgiotageBzVO)((Object)obj);
            return vo.getBzbm().equals(this.getBzbm());
        }
        return super.equals(obj);
    }

    public int hashCode() {
        return new HashCodeBuilder().append((Object)this.getBzbm()).toHashCode();
    }
}

