/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.businessevent;

import nc.bs.businessevent.AbstractBusinessEvent;
import nc.bs.businessevent.SyncEventType;

public class UsePermChangeEvent
extends AbstractBusinessEvent {
    private String resourcecode = null;
    private Object userObject = null;
    private SyncEventType permEventType = null;
    private String[] pks = null;

    public SyncEventType getPermEventType() {
        return this.permEventType;
    }

    public void setPermEventType(SyncEventType permEventType) {
        this.permEventType = permEventType;
    }

    public UsePermChangeEvent(String sourceID, String eventType, SyncEventType permEventType) {
        super(sourceID, eventType);
        this.permEventType = permEventType;
    }

    public String[] getPks() {
        return this.pks;
    }

    public void setPks(String[] pks) {
        this.pks = pks;
    }

    public UsePermChangeEvent(String sourceID, String eventType) {
        super(sourceID, eventType);
    }

    @Override
    public Object getUserObject() {
        return this.userObject;
    }

    public String getResourcecode() {
        return this.resourcecode;
    }

    public void setResourcecode(String resourcecode) {
        this.resourcecode = resourcecode;
    }

    public void setUserObject(Object obj) {
        this.userObject = obj;
    }
}

