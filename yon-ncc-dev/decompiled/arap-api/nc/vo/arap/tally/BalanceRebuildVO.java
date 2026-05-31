/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 */
package nc.vo.arap.tally;

import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public class BalanceRebuildVO
extends ValueObject {
    private static final long serialVersionUID = 1L;
    private int sys_flag = 0;
    private String pk_group;
    private String pk_org = null;
    private String begin = null;
    private String end = null;
    private String[] cus_sups = null;

    public int getSys_flag() {
        return this.sys_flag;
    }

    public void setSys_flag(int sysFlag) {
        this.sys_flag = sysFlag;
    }

    public String getPk_group() {
        return this.pk_group;
    }

    public void setPk_group(String pkGroup) {
        this.pk_group = pkGroup;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String pkOrg) {
        this.pk_org = pkOrg;
    }

    public String getBegin() {
        return this.begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return this.end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String[] getCus_sups() {
        return this.cus_sups;
    }

    public void setCus_sups(String[] cusSups) {
        this.cus_sups = cusSups;
    }

    public String getEntityName() {
        return null;
    }

    public void validate() throws ValidationException {
    }
}

