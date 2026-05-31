/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 */
package nc.vo.arap.audit;

import nc.vo.pub.SuperVO;

public class BillTypeVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    String billtypecode;
    String billtypename;

    public String getBilltypecode() {
        return this.billtypecode;
    }

    public void setBilltypecode(String billtypecode) {
        this.billtypecode = billtypecode;
    }

    public String getBilltypename() {
        return this.billtypename;
    }

    public void setBilltypename(String billtypename) {
        this.billtypename = billtypename;
    }
}

