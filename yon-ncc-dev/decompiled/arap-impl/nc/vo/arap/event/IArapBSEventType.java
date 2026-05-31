/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.IEventType
 */
package nc.vo.arap.event;

import nc.bs.businessevent.IEventType;

public interface IArapBSEventType
extends IEventType {
    public static final String TYPE_TEMPSAVE_BEFORE = "200601";
    public static final String TYPE_TEMPSAVE_AFTER = "200602";
    public static final String TYPE_EFFECTION_BEFORE = "200603";
    public static final String TYPE_EFFECTION_AFTER = "200604";
    public static final String TYPE_UNEFFECTION_BEFORE = "200605";
    public static final String TYPE_UNEFFECTION_AFTER = "200606";
    public static final String TYPE_TEMP_UPDATE_BEFORE = "200607";
    public static final String TYPE_TEMP_UPDATE_AFTER = "200608";
    public static final String TYPE_TEMP_DEL_BEFORE = "200609";
    public static final String TYPE_TEMP_DEL_AFTER = "200610";
    public static final String TYPE_ORDERCLOSE_AFTER = "200611";
    public static final String TYPE_UNORDERCLOSE_AFTER = "200612";
    public static final String TYPE_BALANCE_BEFORE = "200613";
    public static final String TYPE_BALANCE_AFTER = "200614";
    public static final String TYPE_REFUND_BEFORE = "2006110";
    public static final String TYPE_REFUND_AFTER = "2006111";
    public static final String TYPE_CANCELREFUND_BEFORE = "2006112";
    public static final String TYPE_CANCELREFUND_AFTER = "2006113";
}

