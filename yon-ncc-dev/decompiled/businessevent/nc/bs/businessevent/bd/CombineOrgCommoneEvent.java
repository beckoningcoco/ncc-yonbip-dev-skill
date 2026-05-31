/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.businessevent.bd;

import nc.bs.businessevent.bd.BDCommonEvent;

public class CombineOrgCommoneEvent
extends BDCommonEvent {
    private static final long serialVersionUID = 8120442733461599543L;
    private String orgtype;

    public String getOrgtype() {
        return this.orgtype;
    }

    public void setOrgtype(String orgtype) {
        this.orgtype = orgtype;
    }

    public CombineOrgCommoneEvent(String sourceID, String eventType, Object[] objs, String orgtype) {
        super(sourceID, eventType, objs);
        this.orgtype = orgtype;
    }
}

