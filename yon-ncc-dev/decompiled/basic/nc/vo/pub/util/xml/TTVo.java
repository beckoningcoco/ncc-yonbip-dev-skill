/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.xml;

import java.io.Serializable;

public class TTVo
implements Serializable {
    public int F1;
    public String F2;

    public int getF1() {
        return this.F1;
    }

    public String getF2() {
        return this.F2;
    }

    public void setF1(int newF1) {
        this.F1 = newF1;
    }

    public void setF2(String newF2) {
        this.F2 = newF2;
    }

    public String toString() {
        return TTVo.class + ":" + this.F1 + ":" + this.F2;
    }
}

