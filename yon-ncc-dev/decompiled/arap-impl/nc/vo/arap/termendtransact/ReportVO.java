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

public class ReportVO
extends ValueObject {
    private static final long serialVersionUID = 1L;
    private int m_iBh;
    private String m_sInfo;
    private String m_sCount;
    private boolean m_bPassed;

    public int getBh() {
        return this.m_iBh;
    }

    public String getCount() {
        return this.m_sCount;
    }

    public String getEntityName() {
        return null;
    }

    public String getInfo() {
        return this.m_sInfo;
    }

    public boolean getState() {
        return this.m_bPassed;
    }

    public void setBh(int bh) {
        this.m_iBh = bh;
    }

    public void setCount(String count) {
        this.m_sCount = count;
    }

    public void setInfo(String info) {
        this.m_sInfo = info;
    }

    public void setState(boolean passed) {
        this.m_bPassed = passed;
    }

    public void validate() throws ValidationException {
    }
}

