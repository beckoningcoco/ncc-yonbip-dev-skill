/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.ValueObject
 */
package nc.bs.uap.appasset;

import nc.bs.businessevent.AbstractBusinessEvent;
import nc.vo.pub.ValidationException;
import nc.vo.pub.ValueObject;

public class UAPAppAssetAsynEvent
extends AbstractBusinessEvent {
    private static final long serialVersionUID = -8902177846160815784L;
    private ValueObject userObject;

    public UAPAppAssetAsynEvent(String sourceID, String eventType) {
        super(sourceID, eventType);
    }

    public UAPAppAssetAsynEvent(String sourceID, String eventType, ValueObject userObj) {
        this(sourceID, eventType);
        this.userObject = userObj;
    }

    public void setUserObject(ValueObject userObject) {
        this.userObject = userObject;
    }

    public ValueObject getUserObject() {
        return this.userObject;
    }

    public static class UAPAppAssetChangeVO
    extends ValueObject {
        private static final long serialVersionUID = 6771419739790580562L;
        private String assetItemPk;
        private String assetItemName;
        private Object assetItemObj;

        public String getAssetItemName() {
            return this.assetItemName;
        }

        public void setAssetItemName(String assetItemName) {
            this.assetItemName = assetItemName;
        }

        public UAPAppAssetChangeVO() {
        }

        public UAPAppAssetChangeVO(String pk, String name) {
            this.assetItemPk = pk;
            this.assetItemName = name;
        }

        public Object getAssetItemObj() {
            return this.assetItemObj;
        }

        public void setAssetItemObj(Object assetItemObj) {
            this.assetItemObj = assetItemObj;
        }

        public String getAssetItemPk() {
            return this.assetItemPk;
        }

        public void setAssetItemPk(String assetItemPk) {
            this.assetItemPk = assetItemPk;
        }

        public String getEntityName() {
            return "\u5e73\u53f0\u8d44\u4ea7\u65b0\u589e\u5220\u9664\u540c\u6b65\u5bf9\u8c61";
        }

        public void validate() throws ValidationException {
        }
    }
}

