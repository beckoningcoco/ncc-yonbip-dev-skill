/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 */
package nc.bs.businessevent.bd;

import nc.bs.businessevent.AbstractBusinessEvent;
import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public class BDCommonEvent
extends AbstractBusinessEvent {
    private static final long serialVersionUID = 5536011866636657762L;
    private Object[] oldObjs = null;
    private Object[] newObjs = null;

    public BDCommonEvent(String sourceID, String eventType, Object ... objs) {
        super(sourceID, eventType);
        this.setNewObjs(objs);
    }

    public BDCommonEvent(String sourceID, String eventType, Object[] oldObjs, Object[] newObjs) {
        super(sourceID, eventType);
        this.setOldObjs(oldObjs);
        this.setNewObjs(newObjs);
    }

    public Object[] getOldObjs() {
        return this.oldObjs;
    }

    public void setOldObjs(Object[] oldObjs) {
        this.oldObjs = oldObjs;
    }

    public Object[] getNewObjs() {
        return this.newObjs;
    }

    public void setNewObjs(Object[] newObjs) {
        this.newObjs = newObjs;
    }

    public Object[] getObjs() {
        return this.newObjs;
    }

    public void setObjs(Object[] newObjs) {
        this.newObjs = newObjs;
    }

    public ValueObject getUserObject() {
        return new BDCommonUserObj(this.newObjs, this.oldObjs);
    }

    public class BDCommonUserObj
    extends ValueObject {
        private static final long serialVersionUID = 1L;
        private Object newObjects;
        private Object oldObjects;

        private BDCommonUserObj(Object newObjects, Object oldObjects) {
            this.newObjects = newObjects;
            this.oldObjects = oldObjects;
        }

        public Object getNewObjects() {
            return this.newObjects;
        }

        public void setNewObjects(Object newObjects) {
            this.newObjects = newObjects;
        }

        public Object getOldObjects() {
            return this.oldObjects;
        }

        public void setOldObjects(Object oldObjects) {
            this.oldObjects = oldObjects;
        }

        public String getEntityName() {
            return ((Object)((Object)this)).getClass().getName();
        }

        public void validate() throws ValidationException {
        }
    }
}

