/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package uap.vo.prealert.engine.receiver;

import nc.vo.pub.BusinessException;
import uap.vo.prealert.engine.SendMethod;
import uap.vo.prealert.engine.receiver.DeliverableReceiver;
import uap.vo.prealert.engine.receiver.ReceiverType;

public class ReceiverImpl
implements DeliverableReceiver {
    private SendMethod[] sendMethod;
    private ReceiverType type;
    private String pk;

    public ReceiverImpl(SendMethod[] sendMethod, ReceiverType type, String pk) {
        this.setSendMethod(sendMethod);
        this.setType(type);
        this.setPk(pk);
    }

    public void setSendMethod(SendMethod[] sendMethod) {
        this.sendMethod = sendMethod;
    }

    public void setType(ReceiverType type) {
        this.type = type;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    @Override
    public SendMethod[] getSendMethod() {
        return this.sendMethod;
    }

    @Override
    public ReceiverType getType() {
        return this.type;
    }

    @Override
    public String getPk() {
        return this.pk;
    }

    @Override
    public String[] getUserids() throws BusinessException {
        return this.getType().getActualReceiver(this.getPk());
    }

    public int hashCode() {
        return this.toHCString().hashCode();
    }

    private String toHCString() {
        StringBuffer sb = new StringBuffer();
        for (SendMethod sm : this.sendMethod) {
            sb.append(sm.getId());
        }
        sb.append(this.pk);
        sb.append(this.type.getId());
        return sb.toString();
    }

    public boolean equals(Object obj) {
        return obj instanceof ReceiverImpl && this.toHCString().equals(((ReceiverImpl)obj).toHCString());
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("type: ");
        sb.append(this.getType());
        sb.append("\n");
        sb.append("sendMethod: ");
        if (this.getSendMethod() != null) {
            for (SendMethod sm : this.getSendMethod()) {
                sb.append(sm);
                sb.append("\n");
            }
        }
        sb.append("pk: ");
        sb.append(this.getPk());
        return sb.toString();
    }
}

