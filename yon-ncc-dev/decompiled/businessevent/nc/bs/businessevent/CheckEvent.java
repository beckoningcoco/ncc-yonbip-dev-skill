/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.resource.NotSupportedException
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 */
package nc.bs.businessevent;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javax.resource.NotSupportedException;
import nc.bs.businessevent.AbstractBusinessEvent;
import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public class CheckEvent
extends AbstractBusinessEvent {
    private static final long serialVersionUID = 1615499664885139730L;
    private List<?> voList;
    private List<String> errorMsg;
    private HashMap<Object, List<String>> errorMsgMap;
    private Object[] userObjs;
    private Object param;

    public CheckEvent(String sourceID, String eventType, Object[] userObjs) {
        this(sourceID, eventType, userObjs, null);
    }

    public CheckEvent(String sourceID, String eventType, Object[] userObjs, Object param) {
        super(sourceID, eventType);
        if (userObjs == null || userObjs.length == 0) {
            throw new IllegalArgumentException("userObjs can not be null\uff01");
        }
        this.userObjs = userObjs;
        this.voList = new ArrayList<Object>(Arrays.asList(userObjs));
        this.param = param;
    }

    public Object[] getInputVOs() {
        return this.getValidObjs();
    }

    public void addErrorMsg(Object obj, String message) throws NotSupportedException {
        if (obj == null || message == null || message.length() == 0) {
            throw new IllegalArgumentException("The parameter can not be null!");
        }
        if (this.voList.indexOf(obj) >= 0) {
            this.voList.remove(obj);
        }
        if (this.errorMsgMap == null) {
            this.errorMsgMap = new HashMap();
        }
        if (!this.errorMsgMap.containsKey(obj)) {
            ArrayList errors = new ArrayList();
            this.errorMsgMap.put(obj, errors);
        }
        boolean isAdd = false;
        List<String> errorMsgs = this.errorMsgMap.get(obj);
        if (errorMsgs != null && !errorMsgs.contains(message)) {
            errorMsgs.add(message);
            isAdd = true;
        }
        if (this.errorMsg == null) {
            this.errorMsg = new ArrayList<String>();
        }
        if (isAdd) {
            this.errorMsg.add(message);
        }
    }

    public Object[] getValidObjs() {
        Object[] objs = (Object[])Array.newInstance(this.userObjs[0].getClass(), this.voList.size());
        return this.voList.toArray(objs);
    }

    public List<String> getErrorMsg() {
        return this.errorMsg;
    }

    public HashMap<Object, List<String>> getErrorMsgMap() {
        return this.errorMsgMap;
    }

    public Object getParam() {
        return this.param;
    }

    public ValueObject getUserObject() {
        return new CheckUserObject(this.userObjs, this.param);
    }

    public class CheckUserObject
    extends ValueObject {
        private static final long serialVersionUID = 1L;
        private Object[] userObjects;
        private Object parameters;

        private CheckUserObject(Object[] userObjects, Object parameters) {
            this.userObjects = userObjects;
            this.parameters = parameters;
        }

        public Object[] getUserObjects() {
            return this.userObjects;
        }

        public void setUserObjects(Object[] userObjects) {
            this.userObjects = userObjects;
        }

        public Object getParameters() {
            return this.parameters;
        }

        public void setParameters(Object parameters) {
            this.parameters = parameters;
        }

        public String getEntityName() {
            return ((Object)((Object)this)).getClass().getName();
        }

        public void validate() throws ValidationException {
        }
    }
}

