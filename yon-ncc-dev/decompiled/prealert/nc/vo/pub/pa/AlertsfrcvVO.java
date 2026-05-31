/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.vo.pub.pa;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDateTime;

public class AlertsfrcvVO
extends SuperVO {
    private static final long serialVersionUID = -3819263692920672447L;
    private String pk_alertsfrcv;
    private String pk_alerttype;
    private String rcv_code;
    private String disname_resid;
    private String implfullpath;
    private String creator;
    private String creationtime;
    private String modifier;
    private String modifiedtime;
    private Integer dr = 0;
    private UFDateTime ts;

    public String getPk_alertsfrcv() {
        return this.pk_alertsfrcv;
    }

    public void setPk_alertsfrcv(String pk_alertsfrcv) {
        this.pk_alertsfrcv = pk_alertsfrcv;
    }

    public String getPk_alerttype() {
        return this.pk_alerttype;
    }

    public void setPk_alerttype(String pk_alerttype) {
        this.pk_alerttype = pk_alerttype;
    }

    public String getRcv_code() {
        return this.rcv_code;
    }

    public void setRcv_code(String rcv_code) {
        this.rcv_code = rcv_code;
    }

    public String getDisname_resid() {
        return this.disname_resid;
    }

    public void setDisname_resid(String disname_resid) {
        this.disname_resid = disname_resid;
    }

    public String getImplfullpath() {
        return this.implfullpath;
    }

    public void setImplfullpath(String implfullpath) {
        this.implfullpath = implfullpath;
    }

    public String getCreator() {
        return this.creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreationtime() {
        return this.creationtime;
    }

    public void setCreationtime(String creationtime) {
        this.creationtime = creationtime;
    }

    public String getModifier() {
        return this.modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getModifiedtime() {
        return this.modifiedtime;
    }

    public void setModifiedtime(String modifiedtime) {
        this.modifiedtime = modifiedtime;
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

    public String getTableName() {
        return "pub_alert_sfrcv";
    }
}

