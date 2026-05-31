/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 */
package nc.vo.arap.inter;

import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public class InvVO
extends ValueObject {
    private static final long serialVersionUID = -5034118818049722666L;
    public String m_pk_invmandoc = null;
    public String m_pk_invcl = null;
    public String m_invcode = null;
    public String m_invname = null;
    private String m_invspec = null;
    private String m_invtype = null;
    private String m_measname = null;

    public String getEntityName() {
        return null;
    }

    public String getInvcode() {
        return this.m_invcode;
    }

    public String getInvname() {
        return this.m_invname;
    }

    public String getM_invspec() {
        return this.m_invspec;
    }

    public String getM_invtype() {
        return this.m_invtype;
    }

    public String getM_measname() {
        return this.m_measname;
    }

    public String getPk_invcl() {
        return this.m_pk_invcl;
    }

    public String getPk_invmandoc() {
        return this.m_pk_invmandoc;
    }

    public void setInvcode(String newM_invcode) {
        this.m_invcode = newM_invcode;
    }

    public void setInvname(String newM_invname) {
        this.m_invname = newM_invname;
    }

    public void setM_invspec(String newM_invspec) {
        this.m_invspec = newM_invspec;
    }

    public void setM_invtype(String newM_invtype) {
        this.m_invtype = newM_invtype;
    }

    public void setM_measname(String newM_measname) {
        this.m_measname = newM_measname;
    }

    public void setPk_invcl(String newM_pk_invcl) {
        this.m_pk_invcl = newM_pk_invcl;
    }

    public void setPk_invmandoc(String newM_pk_invmandoc) {
        this.m_pk_invmandoc = newM_pk_invmandoc;
    }

    public void validate() throws ValidationException {
    }
}

