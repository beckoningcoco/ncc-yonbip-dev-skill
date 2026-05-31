/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.businessevent;

import java.io.Serializable;
import nc.bs.businessevent.IBusinessEvent;

public abstract class AbstractBusinessEvent
implements IBusinessEvent,
Serializable {
    private String sourceID;
    private String eventType;

    public AbstractBusinessEvent(String sourceID, String eventType) {
        this.sourceID = sourceID;
        this.eventType = eventType;
    }

    @Override
    public String getSourceID() {
        return this.sourceID;
    }

    public void setSourceID(String sourceID) {
        this.sourceID = sourceID;
    }

    @Override
    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}

