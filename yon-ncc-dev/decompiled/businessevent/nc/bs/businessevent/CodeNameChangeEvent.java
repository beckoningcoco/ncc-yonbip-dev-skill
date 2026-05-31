/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 */
package nc.bs.businessevent;

import nc.bs.businessevent.IBusinessEvent;
import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public class CodeNameChangeEvent
implements IBusinessEvent {
    private static final long serialVersionUID = 272323232766958373L;
    private String code;
    private String eventType;
    private String name;
    private String pk;
    private String sourceID;

    public CodeNameChangeEvent(String sourceID, String eventType, String pk, String code, String name) {
        this.sourceID = sourceID;
        this.eventType = eventType;
        this.pk = pk;
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    @Override
    public String getEventType() {
        return this.eventType;
    }

    public String getName() {
        return this.name;
    }

    public String getPk() {
        return this.pk;
    }

    @Override
    public String getSourceID() {
        return this.sourceID;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public void setSourceID(String sourceID) {
        this.sourceID = sourceID;
    }

    public ValueObject getUserObject() {
        return new CodeNameChangeUserObject(this.pk, this.code, this.name);
    }

    public class CodeNameChangeUserObject
    extends ValueObject {
        private static final long serialVersionUID = 1L;
        private String codeValue;
        private String nameValue;
        private String pkValue;

        private CodeNameChangeUserObject(String pkValue, String codeValue, String nameValue) {
            this.codeValue = codeValue;
            this.nameValue = nameValue;
            this.pkValue = pkValue;
        }

        public String getCodeValue() {
            return this.codeValue;
        }

        public void setCodeValue(String codeValue) {
            this.codeValue = codeValue;
        }

        public String getNameValue() {
            return this.nameValue;
        }

        public void setNameValue(String nameValue) {
            this.nameValue = nameValue;
        }

        public String getPkValue() {
            return this.pkValue;
        }

        public void setPkValue(String pkValue) {
            this.pkValue = pkValue;
        }

        public String getEntityName() {
            return ((Object)((Object)this)).getClass().getName();
        }

        public void validate() throws ValidationException {
        }
    }
}

