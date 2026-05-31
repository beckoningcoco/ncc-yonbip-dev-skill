/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.pub.lang;

import java.io.Serializable;
import nc.bs.logging.Logger;

public final class UFBoolean
implements Serializable,
Comparable {
    public static final UFBoolean TRUE = new UFBoolean(true);
    public static final UFBoolean FALSE = new UFBoolean(false);
    private static final long serialVersionUID = -2971431361057093474L;
    private boolean value = false;

    public UFBoolean(char value) {
        this.value = value == 'Y' || value == 'y';
    }

    public UFBoolean(String value) {
        this.value = value != null && value.length() > 0 && (value.equalsIgnoreCase("true") || value.charAt(0) == 'Y' || value.charAt(0) == 'y');
    }

    public UFBoolean(boolean value) {
        this.value = value;
    }

    public boolean booleanValue() {
        return this.value;
    }

    public static UFBoolean valueOf(boolean b) {
        return b ? TRUE : FALSE;
    }

    public static UFBoolean valueOf(String val) {
        if (val != null && val.length() > 0 && (val.equalsIgnoreCase("true") || val.charAt(0) == 'Y' || val.charAt(0) == 'y')) {
            return TRUE;
        }
        return FALSE;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof UFBoolean) {
            return this.value == ((UFBoolean)obj).booleanValue();
        }
        return false;
    }

    public int hashCode() {
        return this.value ? 1231 : 1237;
    }

    public String toString() {
        return this.value ? "Y" : "N";
    }

    public int compareTo(Object o) {
        if (o == null) {
            return 1;
        }
        return this.toString().compareTo(o.toString());
    }

    public boolean isValue() {
        return this.value;
    }

    public void setValue(boolean value) {
        if (this == TRUE || this == FALSE) {
            Logger.error((Object)"### modify constant error!!!", (Throwable)new IllegalAccessError("### modify constant error!!!"));
            throw new IllegalAccessError("### modify constant error!!!");
        }
        this.value = value;
    }
}

