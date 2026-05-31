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

public class AlertRegistryOrgVO
extends SuperVO {
    private static final long serialVersionUID = 4778726263807682450L;
    private String pk_alertregistry_org;
    private String pk_alertregistry;
    private String pk_org;
    private UFDateTime ts = null;
    private Integer dr = null;

    public String getPk_alertregistry_org() {
        return this.pk_alertregistry_org;
    }

    public void setPk_alertregistry_org(String pk_alertregistry_org) {
        this.pk_alertregistry_org = pk_alertregistry_org;
    }

    public String getPk_alertregistry() {
        return this.pk_alertregistry;
    }

    public void setPk_alertregistry(String pk_alertregistry) {
        this.pk_alertregistry = pk_alertregistry;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public void setPk_org(String pk_org) {
        this.pk_org = pk_org;
    }

    public UFDateTime getTs() {
        return this.ts;
    }

    public void setTs(UFDateTime ts) {
        this.ts = ts;
    }

    public Integer getDr() {
        return this.dr;
    }

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public String getTableName() {
        return "pub_alertregistry_org";
    }

    public String getPrimaryKey() {
        return this.getPk_alertregistry_org();
    }

    public String getPKFieldName() {
        return "pk_alertregistry_org";
    }
}

