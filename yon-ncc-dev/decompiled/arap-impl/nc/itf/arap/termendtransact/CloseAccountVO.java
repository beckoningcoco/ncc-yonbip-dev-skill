/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 */
package nc.itf.arap.termendtransact;

import nc.vo.pub.SuperVO;

public class CloseAccountVO
extends SuperVO {
    private static final long serialVersionUID = 5059753078657898057L;
    private String nodeCode;
    private String pk_org;
    private String year;
    private String month;
    private Integer iSysCode;
    private String param_code;

    public String getNodeCode() {
        return this.nodeCode;
    }

    public void setNodeCode(String nodeCode) {
        this.nodeCode = nodeCode;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String pkOrg) {
        this.pk_org = pkOrg;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public Integer getiSysCode() {
        return this.iSysCode;
    }

    public void setiSysCode(Integer iSysCode) {
        this.iSysCode = iSysCode;
    }

    public String getParam_code() {
        return this.param_code;
    }

    public void setParam_code(String paramCode) {
        this.param_code = paramCode;
    }
}

