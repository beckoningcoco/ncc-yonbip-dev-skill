/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 */
package nc.vo.arap.pf;

import nc.vo.pub.SuperVO;

public class PFCheckVO
extends SuperVO {
    private static final long serialVersionUID = 6294103065082110272L;
    private String pk_group;
    private String pk_org;
    private String pk_org_v;
    private int workflowtype;
    private String operator;
    private String pk_tradetype;
    private String pk_busitype;

    public String getPk_group() {
        return this.pk_group;
    }

    public String getPk_org() {
        return this.pk_org;
    }

    public int getWorkflowtype() {
        return this.workflowtype;
    }

    public String getOperator() {
        return this.operator;
    }

    public String getPk_tradetype() {
        return this.pk_tradetype;
    }

    public void setPk_group(String pkGroup) {
        this.pk_group = pkGroup;
    }

    public void setPk_org(String pkOrg) {
        this.pk_org = pkOrg;
    }

    public void setWorkflowtype(int workflowtype) {
        this.workflowtype = workflowtype;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void setPk_tradetype(String pkTradetype) {
        this.pk_tradetype = pkTradetype;
    }

    public String getPk_busitype() {
        return this.pk_busitype;
    }

    public void setPk_busitype(String pkBusitype) {
        this.pk_busitype = pkBusitype;
    }

    public String getPk_org_v() {
        return this.pk_org_v;
    }

    public void setPk_org_v(String pk_org_v) {
        this.pk_org_v = pk_org_v;
    }
}

