/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDateTime
 */
package nc.vo.arap.tally;

import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDateTime;

public class DefFieldMappingVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    private String pk_deffieldmapping;
    private String src_table;
    private String src_deffield;
    private String tar_table;
    private String tar_deffield;
    private String pk_billtype;
    private Integer dr = 0;
    private UFDateTime ts;
    public static final String PK_DEFFIELDMAPPING = "pk_deffieldmapping";
    public static final String SRC_TABLE = "src_table";
    public static final String SRC_DEFFIELD = "src_deffield";
    public static final String TAR_TABLE = "tar_table";
    public static final String TAR_DEFFIELD = "tar_deffield";
    public static final String PK_BILLTYPE = "pk_billtype";

    public String getPk_deffieldmapping() {
        return this.pk_deffieldmapping;
    }

    public void setPk_deffieldmapping(String newPk_deffieldmapping) {
        this.pk_deffieldmapping = newPk_deffieldmapping;
    }

    public String getSrc_table() {
        return this.src_table;
    }

    public void setSrc_table(String newSrc_table) {
        this.src_table = newSrc_table;
    }

    public String getSrc_deffield() {
        return this.src_deffield;
    }

    public void setSrc_deffield(String newSrc_deffield) {
        this.src_deffield = newSrc_deffield;
    }

    public String getTar_table() {
        return this.tar_table;
    }

    public void setTar_table(String newTar_table) {
        this.tar_table = newTar_table;
    }

    public String getTar_deffield() {
        return this.tar_deffield;
    }

    public void setTar_deffield(String newTar_deffield) {
        this.tar_deffield = newTar_deffield;
    }

    public String getPk_billtype() {
        return this.pk_billtype;
    }

    public void setPk_billtype(String newPk_billtype) {
        this.pk_billtype = newPk_billtype;
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
        return PK_DEFFIELDMAPPING;
    }

    public String getTableName() {
        return "arap_deffieldmapping";
    }
}

