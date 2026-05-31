/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.businessevent;

public interface IBusinessEvent {
    public String getSourceID();

    public String getEventType();

    public Object getUserObject();
}
