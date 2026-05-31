/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.bs.arap.bill.brdeal;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDateTime;

public class BRConditionVO
extends SuperVO {
    private static final long serialVersionUID = 6355888928757159283L;
    private String pk_org = null;
    private Integer objtype;
    private String pk_brCondition;
    private String[] pk_currtypes;
    private String[] pk_billtypes;
    private String[] billtypecodes;
    private String[] pk_tradetypes;
    private String[] tradetypecodes;
    private String[] subjcode_hs;
    private String[] subjcodes;
    private Integer prepay;
    private Integer dr = 0;
    private UFDateTime ts;
    public static final String OBJTYPE = "objtype";
    public static final String PK_BILLTYPE = "pk_billtype";
    public static final String PK_TRADETYPE = "pk_tradetype";
    public static final String PK_TRADETYPECODE = "pk_tradetypecode";
    public static final String SUBJCODE_H = "subjcode_h";
    public static final String SUBJCODE = "subjcode";
    public static final String PREPAY = "prepay";

    public Integer getObjtype() {
        return this.objtype;
    }

    public void setObjtype(Integer objtype) {
        this.objtype = objtype;
    }

    public String[] getPk_billtypes() {
        return this.pk_billtypes;
    }

    public void setPk_billtypes(String[] pkBilltypes) {
        this.pk_billtypes = pkBilltypes;
    }

    public String[] getBilltypecodes() {
        return this.billtypecodes;
    }

    public void setBilltypecodes(String[] billtypecodes) {
        this.billtypecodes = billtypecodes;
    }

    public String[] getPk_tradetypes() {
        return this.pk_tradetypes;
    }

    public void setPk_tradetypes(String[] pkTradetypes) {
        this.pk_tradetypes = pkTradetypes;
    }

    public String[] getTradetypecodes() {
        return this.tradetypecodes;
    }

    public void setTradetypecodes(String[] tradetypecodes) {
        this.tradetypecodes = tradetypecodes;
    }

    public String[] getSubjcode_hs() {
        return this.subjcode_hs;
    }

    public void setSubjcode_hs(String[] subjcodeHs) {
        this.subjcode_hs = subjcodeHs;
    }

    public String[] getSubjcodes() {
        return this.subjcodes;
    }

    public void setSubjcodes(String[] subjcodes) {
        this.subjcodes = subjcodes;
    }

    public Integer getPrepay() {
        return this.prepay;
    }

    public void setPrepay(Integer newPrepay) {
        this.prepay = newPrepay;
    }

    public Integer getDr() {
        return this.dr;
    }

    public void setDr(Integer newDr) {
        this.dr = newDr;
    }

    public UFDateTime getTs() {
        return this.ts;
    }

    public void setTs(UFDateTime newTs) {
        this.ts = newTs;
    }

    public String getParentPKFieldName() {
        return null;
    }

    public String getPKFieldName() {
        return "pk_brCondition";
    }

    public String getPk_brCondition() {
        return this.pk_brCondition;
    }

    public void setPk_brCondition(String pkBrCondition) {
        this.pk_brCondition = pkBrCondition;
    }

    public String getTableName() {
        return "arap_arglbrbill";
    }

    public static String getDefaultTableName() {
        return "arap_arglbrbill";
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String pkOrg) {
        this.pk_org = pkOrg;
    }

    public String[] getPk_currtypes() {
        return this.pk_currtypes;
    }

    public void setPk_currtypes(String[] pkCurrtypes) {
        this.pk_currtypes = pkCurrtypes;
    }
}

