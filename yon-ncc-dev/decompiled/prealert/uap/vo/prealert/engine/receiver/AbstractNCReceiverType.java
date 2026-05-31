/*
 * Decompiled with CFR 0.152.
 */
package uap.vo.prealert.engine.receiver;

import uap.vo.prealert.engine.receiver.PrimitiveReceiverTypes;
import uap.vo.prealert.engine.receiver.ReceiverType;

public abstract class AbstractNCReceiverType
implements PrimitiveReceiverTypes,
ReceiverType {
    private static final long serialVersionUID = 7950906544469756432L;

    public int hashCode() {
        return this.getId() + this.getName().hashCode();
    }

    public boolean equals(Object obj) {
        return obj instanceof AbstractNCReceiverType && this.getId() == ((AbstractNCReceiverType)obj).getId() && this.getName().equals(((AbstractNCReceiverType)obj).getName());
    }

    public String toString() {
        return this.getName();
    }
}

