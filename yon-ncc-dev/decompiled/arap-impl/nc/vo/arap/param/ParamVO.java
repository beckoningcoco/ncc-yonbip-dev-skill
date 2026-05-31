/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.vo.arap.param;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDateTime;

public class ParamVO
extends SuperVO {
    private static final long serialVersionUID = -437301821588719752L;
    public String param_pk;
    public String pk_org;
    public String param_code;
    public String param_name;
    public String param_value;
    public Integer dr;
    public UFDateTime ts;
    public Integer syscode;
    public String scomment;

    public String getScomment() {
        return this.scomment;
    }

    public void setScomment(String scomment) {
        this.scomment = scomment;
    }

    public String getParentPKFieldName() {
        return null;
    }

    public String getPKFieldName() {
        return "param_pk";
    }

    public String getTableName() {
        return "arap_param";
    }

    public String getParam_pk() {
        return this.param_pk;
    }

    public void setParam_pk(String paramPk) {
        this.param_pk = paramPk;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String pkOrg) {
        this.pk_org = pkOrg;
    }

    public String getParam_code() {
        return this.param_code;
    }

    public void setParam_code(String paramCode) {
        this.param_code = paramCode;
    }

    public String getParam_name() {
        return this.param_name;
    }

    public void setParam_name(String paramName) {
        this.param_name = paramName;
    }

    public String getParam_value() {
        return this.param_value;
    }

    public void setParam_value(String paramValue) {
        this.param_value = paramValue;
    }

    public Integer getDr() {
        return this.dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public UFDateTime getTs() {
        return this.ts;
    }

    public void setTs(UFDateTime ts) {
        this.ts = ts;
    }

    public Integer getSyscode() {
        return this.syscode;
    }

    public void setSyscode(Integer syscode) {
        this.syscode = syscode;
    }
}

