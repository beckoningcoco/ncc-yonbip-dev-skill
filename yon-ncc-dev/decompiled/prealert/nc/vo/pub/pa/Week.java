/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.pa;

import java.io.Serializable;

public class Week
implements Serializable {
    private static final long serialVersionUID = 8762029659277943532L;
    static final String[] WEEK_DESCRIPTION = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    static final int SUN = 0;
    static final int MON = 1;
    static final int TUE = 2;
    static final int WED = 3;
    static final int THUR = 4;
    static final int FRI = 5;
    static final int SAT = 6;
    public int m_value;

    public static String getDescription(int value) {
        if (value < 7) {
            return WEEK_DESCRIPTION[value];
        }
        throw new IllegalArgumentException("value: " + String.valueOf(value));
    }

    public int getvalue() {
        return this.m_value;
    }

    public static int parse(String week) {
        for (int i = 0; i < 7; ++i) {
            if (!week.trim().equals(WEEK_DESCRIPTION[i])) continue;
            return i;
        }
        return -1;
    }

    public void setvalue(int newM_value) {
        this.m_value = newM_value;
    }

    public String toString() {
        if (this.m_value < 7) {
            return WEEK_DESCRIPTION[this.getvalue()];
        }
        throw new IllegalArgumentException("value: " + String.valueOf(this.m_value));
    }
}

