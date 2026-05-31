/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.IVOMeta
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory
 */
package nc.vo.arap.tally;

import nc.vo.pub.IVOMeta;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pubapp.pattern.model.meta.entity.vo.VOMetaFactory;

public class RecStatementVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private String pk_recstatement;
    private String pk_group;
    private String pk_org;
    private String pk_qryobj;
    private String qryobj;
    private String pk_currtype;
    private UFDouble bal_qua;
    private UFDouble bal_ori;
    private UFDouble bal_loc;
    private UFDouble gr_bal_loc;
    private UFDouble gl_bal_loc;
    private Integer dr = 0;
    private UFDateTime ts;
    public static final String PK_RECSTATEMENT = "pk_recstatement";
    public static final String PK_GROUP = "pk_group";
    public static final String PK_ORG = "pk_org";
    public static final String PK_QRYOBJ = "pk_qryobj";
    public static final String QRYOBJ = "qryobj";
    public static final String PK_CURRTYPE = "pk_currtype";
    public static final String BAL_QUA = "bal_qua";
    public static final String BAL_ORI = "bal_ori";
    public static final String BAL_LOC = "bal_loc";
    public static final String GR_BAL_LOC = "gr_bal_loc";
    public static final String GL_BAL_LOC = "gl_bal_loc";

    public String getPk_recstatement() {
        return this.pk_recstatement;
    }

    public void setPk_recstatement(String newPk_recstatement) {
        this.pk_recstatement = newPk_recstatement;
    }

    public String getPk_group() {
        return this.pk_group;
    }

    public void setPk_group(String newPk_group) {
        this.pk_group = newPk_group;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String newPk_org) {
        this.pk_org = newPk_org;
    }

    public String getPk_qryobj() {
        return this.pk_qryobj;
    }

    public void setPk_qryobj(String newPk_qryobj) {
        this.pk_qryobj = newPk_qryobj;
    }

    public String getQryobj() {
        return this.qryobj;
    }

    public void setQryobj(String newQryobj) {
        this.qryobj = newQryobj;
    }

    public String getPk_currtype() {
        return this.pk_currtype;
    }

    public void setPk_currtype(String newPk_currtype) {
        this.pk_currtype = newPk_currtype;
    }

    public UFDouble getBal_qua() {
        return this.bal_qua;
    }

    public void setBal_qua(UFDouble newBal_qua) {
        this.bal_qua = newBal_qua;
    }

    public UFDouble getBal_ori() {
        return this.bal_ori;
    }

    public void setBal_ori(UFDouble newBal_ori) {
        this.bal_ori = newBal_ori;
    }

    public UFDouble getBal_loc() {
        return this.bal_loc;
    }

    public void setBal_loc(UFDouble newBal_loc) {
        this.bal_loc = newBal_loc;
    }

    public UFDouble getGr_bal_loc() {
        return this.gr_bal_loc;
    }

    public void setGr_bal_loc(UFDouble newGr_bal_loc) {
        this.gr_bal_loc = newGr_bal_loc;
    }

    public UFDouble getGl_bal_loc() {
        return this.gl_bal_loc;
    }

    public void setGl_bal_loc(UFDouble newGl_bal_loc) {
        this.gl_bal_loc = newGl_bal_loc;
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
        return PK_RECSTATEMENT;
    }

    public String getTableName() {
        return "arap_recstatement";
    }

    public static String getDefaultTableName() {
        return "arap_recstatement";
    }

    public IVOMeta getMetaData() {
        return VOMetaFactory.getInstance().getVOMeta("arap.arap_recstatement");
    }
}

