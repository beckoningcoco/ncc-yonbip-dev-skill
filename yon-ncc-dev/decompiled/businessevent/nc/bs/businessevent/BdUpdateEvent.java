/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 */
package nc.bs.businessevent;

import java.io.Serializable;
import nc.bs.businessevent.IBusinessEvent;
import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public class BdUpdateEvent
implements IBusinessEvent,
Serializable {
    private static final long serialVersionUID = -3932671178163938925L;
    private String eventType;
    private Object newObject;
    private Object oldObject;
    private String sourceID;

    public BdUpdateEvent(String sourceID, String eventType, Object oldObject, Object newObject) {
        this.sourceID = sourceID;
        this.eventType = eventType;
        this.oldObject = oldObject;
        this.newObject = newObject;
    }

    @Override
    public String getEventType() {
        return this.eventType;
    }

    public Object getNewObject() {
        return this.newObject;
    }

    public Object getOldObject() {
        return this.oldObject;
    }

    @Override
    public String getSourceID() {
        return this.sourceID;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setNewObject(Object newObject) {
        this.newObject = newObject;
    }

    public void setOldObject(Object oldObject) {
        this.oldObject = oldObject;
    }

    public void setSourceID(String sourceID) {
        this.sourceID = sourceID;
    }

    public ValueObject getUserObject() {
        return new BDUpdateUserObj(this.getNewObject(), this.getOldObject());
    }

    public class BDUpdateUserObj
    extends ValueObject {
        private static final long serialVersionUID = 1L;
        private Object newObj;
        private Object oldObj;

        private BDUpdateUserObj(Object newObject, Object oldObject) {
            this.newObj = newObject;
            this.oldObj = oldObject;
        }

        public Object getNewObj() {
            return this.newObj;
        }

        public void setNewObj(Object newObj) {
            this.newObj = newObj;
        }

        public Object getOldObj() {
            return this.oldObj;
        }

        public void setOldObj(Object oldObj) {
            this.oldObj = oldObj;
        }

        public String getEntityName() {
            return ((Object)((Object)this)).getClass().getName();
        }

        public void validate() throws ValidationException {
        }
    }
}

