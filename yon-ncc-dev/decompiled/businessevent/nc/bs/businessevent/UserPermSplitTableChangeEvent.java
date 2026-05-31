/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.businessevent;

import nc.bs.businessevent.AbstractBusinessEvent;

public class UserPermSplitTableChangeEvent
extends AbstractBusinessEvent {
    private static final long serialVersionUID = -5774098217230980695L;
    private String pk_group;
    private String operationcode;
    private String splitTableName;
    private String cuserid;
    private String resourcecode;

    public UserPermSplitTableChangeEvent(String sourceID, String eventType) {
        super(sourceID, eventType);
    }

    @Override
    public Object getUserObject() {
        return null;
    }

    public String getPk_group() {
        return this.pk_group;
    }

    public void setPk_group(String pk_group) {
        this.pk_group = pk_group;
    }

    public String getOperationcode() {
        return this.operationcode;
    }

    public void setOperationcode(String operationcode) {
        this.operationcode = operationcode;
    }

    public String getSplitTableName() {
        return this.splitTableName;
    }

    public void setSplitTableName(String splitTableName) {
        this.splitTableName = splitTableName;
    }

    public String getCuserid() {
        return this.cuserid;
    }

    public void setCuserid(String cuserid) {
        this.cuserid = cuserid;
    }

    public String getResourcecode() {
        return this.resourcecode;
    }

    public void setResourcecode(String resourcecode) {
        this.resourcecode = resourcecode;
    }
}

