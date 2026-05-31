/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 */
package nc.bs.businessevent;

import nc.bs.businessevent.AbstractBusinessEvent;
import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public class BusinessEvent
extends AbstractBusinessEvent {
    private static final long serialVersionUID = 977662428634402236L;
    private Object object;

    public BusinessEvent(String sourceID, String eventType, Object userObject) {
        super(sourceID, eventType);
        this.object = userObject;
    }

    public BusinessEvent(String sourceID, String eventType, Object[] userObjects) {
        super(sourceID, eventType);
        this.object = userObjects;
    }

    public ValueObject getUserObject() {
        return new BusinessUserObj(this.object);
    }

    public Object getObject() {
        return this.object;
    }

    public void setObject(Object userObject) {
        this.object = userObject;
    }

    public class BusinessUserObj
    extends ValueObject {
        private static final long serialVersionUID = 1L;
        private Object userObj;

        public BusinessUserObj(Object userObj) {
            this.userObj = userObj;
        }

        public String getEntityName() {
            return ((Object)((Object)this)).getClass().getName();
        }

        public void validate() throws ValidationException {
        }

        public Object getUserObj() {
            return this.userObj;
        }

        public void setUserObj(Object userObj) {
            this.userObj = userObj;
        }
    }
}
