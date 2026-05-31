/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.arap.billconfer;

import java.io.Serializable;

public class BCMiddleVO
implements Serializable {
    private static final long serialVersionUID = -2540832612527223064L;
    private String targetbill;
    private String targetorg;
    private String Custsup;
    private Integer objtype;
    private String receiver;

    public String getReceiver() {
        return this.receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTargetbill() {
        return this.targetbill;
    }

    public void setTargetbill(String targetbill) {
        this.targetbill = targetbill;
    }

    public String getCustsup() {
        return this.Custsup;
    }

    public void setCustsup(String custsup) {
        this.Custsup = custsup;
    }

    public String getTargetorg() {
        return this.targetorg;
    }

    public void setTargetorg(String targetorg) {
        this.targetorg = targetorg;
    }

    public Integer getObjtype() {
        return this.objtype;
    }

    public void setObjtype(Integer objtype) {
        this.objtype = objtype;
    }
}

