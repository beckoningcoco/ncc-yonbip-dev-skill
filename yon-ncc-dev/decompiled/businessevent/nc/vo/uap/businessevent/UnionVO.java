/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.uap.businessevent;

import java.io.Serializable;

public class UnionVO
implements Serializable {
    private static final long serialVersionUID = 6112146167949492545L;
    private String sourceID;
    private String eventType;
    private String implClassname;
    private Integer operIndex;
    private String devmodulecode;
    private String localtype;
    private String industrytype;
    private String listenertype;
    private String owner;

    public String getDevmodulecode() {
        return this.devmodulecode;
    }

    public void setDevmodulecode(String devmodulecode) {
        this.devmodulecode = devmodulecode;
    }

    public String getSourceID() {
        return this.sourceID;
    }

    public void setSourceID(String sourceID) {
        this.sourceID = sourceID;
    }

    public String getEventType() {
        return this.eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getImplClassname() {
        return this.implClassname;
    }

    public void setImplClassname(String implClassname) {
        this.implClassname = implClassname;
    }

    public Integer getOperIndex() {
        return this.operIndex;
    }

    public void setOperIndex(Integer operIndex) {
        this.operIndex = operIndex;
    }

    public String getLocaltype() {
        return this.localtype;
    }

    public void setLocaltype(String localtype) {
        this.localtype = localtype;
    }

    public String getIndustrytype() {
        return this.industrytype;
    }

    public void setIndustrytype(String industrytype) {
        this.industrytype = industrytype;
    }

    public String getListenertype() {
        return this.listenertype;
    }

    public void setListenertype(String listenertype) {
        this.listenertype = listenertype;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

