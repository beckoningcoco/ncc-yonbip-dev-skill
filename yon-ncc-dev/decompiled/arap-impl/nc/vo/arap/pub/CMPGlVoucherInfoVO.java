/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 *  nc.vo.pub.lang.UFDate
 */
package nc.vo.arap.pub;

import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;
import nc.vo.pub.lang.UFDate;

public class CMPGlVoucherInfoVO
extends ValueObject {
    private static final long serialVersionUID = 2489373126097203334L;
    private String m_voucherno;
    private String m_glVoucherid;
    private Integer m_VouchNO;
    private Boolean m_isAduited;
    private UFDate m_jzrq;

    public String getEntityName() {
        return null;
    }

    public void validate() throws ValidationException {
    }

    public String getGlVoucherid() {
        return this.m_glVoucherid;
    }

    public void setGlVoucherid(String voucherid) {
        this.m_glVoucherid = voucherid;
    }

    public String getVoucherno() {
        return this.m_voucherno;
    }

    public void setVoucherno(String m_voucherno) {
        this.m_voucherno = m_voucherno;
    }

    public Integer getVouchNO() {
        return this.m_VouchNO;
    }

    public void setVouchNO(Integer vouchNO) {
        this.m_VouchNO = vouchNO;
    }

    public Boolean isAduited() {
        return this.m_isAduited;
    }

    public void setIsAduited(Boolean aduited) {
        this.m_isAduited = aduited;
    }

    public UFDate getJzrq() {
        return this.m_jzrq;
    }

    public void setJzrq(UFDate m_jzrq) {
        this.m_jzrq = m_jzrq;
    }
}

