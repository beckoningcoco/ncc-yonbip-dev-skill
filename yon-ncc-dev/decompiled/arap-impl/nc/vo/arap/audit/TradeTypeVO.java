/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 */
package nc.vo.arap.audit;

import nc.vo.pub.SuperVO;

public class TradeTypeVO
extends SuperVO {
    private static final long serialVersionUID = 1L;
    String tradetypecode;
    String tradetypename;

    public String getTradetypecode() {
        return this.tradetypecode;
    }

    public void setTradetypecode(String tradetypecode) {
        this.tradetypecode = tradetypecode;
    }

    public String getTradetypename() {
        return this.tradetypename;
    }

    public void setTradetypename(String tradetypename) {
        this.tradetypename = tradetypename;
    }
}

