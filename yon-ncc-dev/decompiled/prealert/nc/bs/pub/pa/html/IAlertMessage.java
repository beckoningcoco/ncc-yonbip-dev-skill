/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.pub.pa.html;

import java.io.Serializable;

@Deprecated
public interface IAlertMessage
extends Serializable {
    public static final int TYPE_STRING = 0;
    public static final int TYPE_DATE = 1;
    public static final int TYPE_BOOLEAN = 2;
    public static final int TYPE_INTEGER = 3;
    public static final int TYPE_FLOAT = 4;
    public static final int TYPE_NUMBERFORMAT = 5;
    public static final int TYPE_CURRENCY = 6;
    public static final int TYPE_OTHERS = -1;
    public static final String DEFAULT_NULL_PRESENT = "";
    public static final String DEFAULT_OMIT_PRESENT = "";

    public String[] getBodyFields();

    public Object[][] getBodyValue();

    @Deprecated
    public float[] getBodyWidths();

    public String[] getBottom();

    public String getTitle();

    public String[] getTop();
}

