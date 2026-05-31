/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.vo.arap.djlx;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDateTime;

public class DjLXVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    public static final String PK_BILLTYPE = "pk_billtype";
    public static final String SFBZ = "sfbz";
    public static final String DJDL = "djdl";
    public static final String FCBZ = "fcbz";
    public static final String SCOMMENT = "scomment";
    public static final String DJLXBM = "djlxbm";
    public static final String ISQR = "isqr";
    public static final String ISCASIGN = "iscasign";
    public static final String ISCOMMIT = "iscommit";
    public static final String DJLXJC_REMARK = "djlxjc_remark";
    public static final String DJLXMC_REMARK = "djlxmc_remark";
    public static final String ISCHANGEDEPTPSN = "ischangedeptpsn";
    public static final String ISPREPARENETBANK = "ispreparenetbank";
    public static final String ISIDVALIDATED = "isidvalidated";
    public static final String ISROWMERGEVAT = "isrowmergevat";
    public static final String PK_GROUP = "pk_group";
    public static final String CREATOR = "creator";
    public static final String CREATIONTIME = "creationtime";
    public static final String MODIFIER = "modifier";
    public static final String MODIFIEDTIME = "modifiedtime";
    public static final String PK_CURRTYPE = "pk_currtype";
    private String pk_billtype;
    private String djdl;
    private UFBoolean fcbz = UFBoolean.FALSE;
    private String scomment;
    private String djlxbm;
    private UFBoolean isqr;
    private UFBoolean iscasign;
    private UFBoolean iscommit;
    private String djlxjc_remark;
    private String djlxmc_remark;
    private UFBoolean ischangedeptpsn;
    private UFBoolean ispreparenetbank;
    private UFBoolean isrowmergevat;
    private UFBoolean isidvalidated;
    private String pk_group;
    private String creator;
    private UFDateTime creationtime;
    private String modifier;
    private UFDateTime modifiedtime;
    private Integer dr = 0;
    private UFDateTime ts;
    private String pk_currtype;
    private UFBoolean iscombine;

    public UFBoolean getIscombine() {
        return this.iscombine;
    }

    public void setIscombine(UFBoolean iscombine) {
        this.iscombine = iscombine;
    }

    public static String getDefaultTableName() {
        return "arap_billtype";
    }

    public UFDateTime getCreationtime() {
        return this.creationtime;
    }

    public String getCreator() {
        return this.creator;
    }

    public String getDjdl() {
        return this.djdl;
    }

    public String getDjlxbm() {
        return this.djlxbm;
    }

    public String getDjlxjc_remark() {
        return this.djlxjc_remark;
    }

    public String getDjlxmc_remark() {
        return this.djlxmc_remark;
    }

    public String getDjlxoid() {
        return this.pk_billtype;
    }

    public Integer getDr() {
        return this.dr;
    }

    public UFBoolean getFcbz() {
        return this.fcbz;
    }

    public UFBoolean getIscasign() {
        return this.iscasign;
    }

    public UFBoolean getIschangedeptpsn() {
        return this.ischangedeptpsn;
    }

    public UFBoolean getIscommit() {
        return this.iscommit;
    }

    public UFBoolean getIsidvalidated() {
        return this.isidvalidated;
    }

    public UFBoolean getIspreparenetbank() {
        return this.ispreparenetbank;
    }

    public UFBoolean getIsrowmergevat() {
        return this.isrowmergevat;
    }

    public UFBoolean getIsqr() {
        return this.isqr;
    }

    public UFDateTime getModifiedtime() {
        return this.modifiedtime;
    }

    public String getModifier() {
        return this.modifier;
    }

    public String getParentPKFieldName() {
        return null;
    }

    public String getPk_billtype() {
        return this.pk_billtype;
    }

    public String getPk_group() {
        return this.pk_group;
    }

    public String getPKFieldName() {
        return PK_BILLTYPE;
    }

    public String getScomment() {
        return this.scomment;
    }

    public String getTableName() {
        return "arap_billtype";
    }

    public UFDateTime getTs() {
        return this.ts;
    }

    public String getPk_currtype() {
        return this.pk_currtype;
    }

    public void setCreationtime(UFDateTime newCreationtime) {
        this.creationtime = newCreationtime;
    }

    public void setCreator(String newCreator) {
        this.creator = newCreator;
    }

    public void setDjdl(String newDjdl) {
        this.djdl = newDjdl;
    }

    public void setDjlxbm(String newDjlxbm) {
        this.djlxbm = newDjlxbm;
    }

    public void setDjlxjc_remark(String newDjlxjc_remark) {
        this.djlxjc_remark = newDjlxjc_remark;
    }

    public void setDjlxmc_remark(String newDjlxmc_remark) {
        this.djlxmc_remark = newDjlxmc_remark;
    }

    public void setDr(Integer newDr) {
        this.dr = newDr;
    }

    public void setFcbz(UFBoolean newFcbz) {
        this.fcbz = newFcbz;
    }

    public void setIscasign(UFBoolean newIscasign) {
        this.iscasign = newIscasign;
    }

    public void setIschangedeptpsn(UFBoolean newIschangedeptpsn) {
        this.ischangedeptpsn = newIschangedeptpsn;
    }

    public void setIscommit(UFBoolean newIscommit) {
        this.iscommit = newIscommit;
    }

    public void setIsidvalidated(UFBoolean newIsidvalidated) {
        this.isidvalidated = newIsidvalidated;
    }

    public void setIspreparenetbank(UFBoolean newIspreparenetbank) {
        this.ispreparenetbank = newIspreparenetbank;
    }

    public void setIsrowmergevat(UFBoolean newIsrowmergevat) {
        this.isrowmergevat = newIsrowmergevat;
    }

    public void setIsqr(UFBoolean newIsqr) {
        this.isqr = newIsqr;
    }

    public void setModifiedtime(UFDateTime newModifiedtime) {
        this.modifiedtime = newModifiedtime;
    }

    public void setModifier(String newModifier) {
        this.modifier = newModifier;
    }

    public void setPk_billtype(String newPk_billtype) {
        this.pk_billtype = newPk_billtype;
    }

    public void setPk_group(String newPk_group) {
        this.pk_group = newPk_group;
    }

    public void setScomment(String newScomment) {
        this.scomment = newScomment;
    }

    public void setTs(UFDateTime newTs) {
        this.ts = newTs;
    }

    public void setPk_currtype(String pkCurrtype) {
        this.pk_currtype = pkCurrtype;
    }
}

